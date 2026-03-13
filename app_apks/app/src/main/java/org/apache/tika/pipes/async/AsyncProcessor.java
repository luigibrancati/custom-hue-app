package org.apache.tika.pipes.async;

import af.e;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.tika.pipes.FetchEmitTuple;
import org.apache.tika.pipes.PipesClient;
import org.apache.tika.pipes.PipesReporter;
import org.apache.tika.pipes.PipesResult;
import org.apache.tika.pipes.emitter.EmitData;
import org.apache.tika.pipes.emitter.EmitterManager;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.pipes.pipesiterator.TotalCountResult;
import org.apache.tika.pipes.pipesiterator.TotalCounter;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class AsyncProcessor implements Closeable {
    private static final af.c LOG = e.l(AsyncProcessor.class);
    private static long MAX_OFFER_WAIT_MS = 120000;
    static final int PARSER_FUTURE_CODE = 1;
    static final int WATCHER_FUTURE_CODE = 3;
    private boolean addedEmitterSemaphores;
    private final AsyncConfig asyncConfig;
    private final ArrayBlockingQueue<EmitData> emitData;
    private final ExecutorCompletionService<Integer> executorCompletionService;
    private final ExecutorService executorService;
    private final ArrayBlockingQueue<FetchEmitTuple> fetchEmitTuples;
    boolean isShuttingDown;
    private volatile int numEmitterThreadsFinished;
    private volatile int numParserThreadsFinished;
    private final AtomicLong totalProcessed;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class FetchEmitWorker implements Callable<Integer> {
        private final AsyncConfig asyncConfig;
        private final ArrayBlockingQueue<EmitData> emitDataQueue;
        private final ArrayBlockingQueue<FetchEmitTuple> fetchEmitTuples;

        private boolean shouldEmit(PipesResult pipesResult) {
            if (pipesResult.getStatus() == PipesResult.STATUS.PARSE_SUCCESS || pipesResult.getStatus() == PipesResult.STATUS.PARSE_SUCCESS_WITH_EXCEPTION) {
                return true;
            }
            return pipesResult.isIntermediate() && this.asyncConfig.isEmitIntermediateResults();
        }

        private FetchEmitWorker(AsyncConfig asyncConfig, ArrayBlockingQueue<FetchEmitTuple> arrayBlockingQueue, ArrayBlockingQueue<EmitData> arrayBlockingQueue2) {
            this.asyncConfig = asyncConfig;
            this.fetchEmitTuples = arrayBlockingQueue;
            this.emitDataQueue = arrayBlockingQueue2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Integer call() {
            PipesResult pipesResultProcess;
            PipesClient pipesClient = new PipesClient(this.asyncConfig);
            while (true) {
                try {
                    FetchEmitTuple fetchEmitTuplePoll = this.fetchEmitTuples.poll(1L, TimeUnit.SECONDS);
                    if (fetchEmitTuplePoll == null) {
                        if (AsyncProcessor.LOG.k()) {
                            AsyncProcessor.LOG.w("null fetch emit tuple");
                        }
                    } else {
                        if (fetchEmitTuplePoll == PipesIterator.COMPLETED_SEMAPHORE) {
                            if (AsyncProcessor.LOG.k()) {
                                AsyncProcessor.LOG.w("hit completed semaphore");
                            }
                            pipesClient.close();
                            return 1;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            pipesResultProcess = pipesClient.process(fetchEmitTuplePoll);
                        } catch (IOException e10) {
                            AsyncProcessor.LOG.l("pipesClient crash", e10);
                            pipesResultProcess = PipesResult.UNSPECIFIED_CRASH;
                        }
                        if (AsyncProcessor.LOG.k()) {
                            AsyncProcessor.LOG.p("timer -- pipes client process: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if (shouldEmit(pipesResultProcess)) {
                            AsyncProcessor.LOG.w("adding result to emitter queue: " + String.valueOf(pipesResultProcess.getEmitData()));
                            if (!this.emitDataQueue.offer(pipesResultProcess.getEmitData(), AsyncProcessor.MAX_OFFER_WAIT_MS, TimeUnit.MILLISECONDS)) {
                                throw new RuntimeException("Couldn't offer emit data to queue within " + AsyncProcessor.MAX_OFFER_WAIT_MS + " ms");
                            }
                        }
                        if (AsyncProcessor.LOG.k()) {
                            AsyncProcessor.LOG.p("timer -- offered: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                        }
                        this.asyncConfig.getPipesReporter().report(fetchEmitTuplePoll, pipesResultProcess, System.currentTimeMillis() - jCurrentTimeMillis);
                        AsyncProcessor.this.totalProcessed.incrementAndGet();
                    }
                } catch (Throwable th) {
                    try {
                        pipesClient.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    public AsyncProcessor(Path path) {
        this(path, null);
    }

    public static /* synthetic */ void a(AsyncProcessor asyncProcessor, TotalCounter totalCounter) {
        asyncProcessor.getClass();
        totalCounter.startTotalCount();
        PipesReporter pipesReporter = asyncProcessor.asyncConfig.getPipesReporter();
        TotalCountResult.STATUS status = totalCounter.getTotalCount().getStatus();
        while (status == TotalCountResult.STATUS.NOT_COMPLETED) {
            try {
                Thread.sleep(500L);
                TotalCountResult totalCount = totalCounter.getTotalCount();
                LOG.g("counter total  {} {} ", totalCount.getStatus(), Long.valueOf(totalCount.getTotalCount()));
                pipesReporter.report(totalCount);
                status = totalCount.getStatus();
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public static /* synthetic */ Integer b(AsyncProcessor asyncProcessor) {
        asyncProcessor.getClass();
        while (true) {
            try {
                Thread.sleep(500L);
                asyncProcessor.checkActive();
            } catch (InterruptedException unused) {
                return 3;
            }
        }
    }

    private void startCounter(final TotalCounter totalCounter) {
        Thread thread = new Thread(new Runnable() { // from class: org.apache.tika.pipes.async.b
            @Override // java.lang.Runnable
            public final void run() {
                AsyncProcessor.a(this.f41595a, totalCounter);
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

    public synchronized boolean checkActive() {
        boolean z10;
        try {
            Future<Integer> futurePoll = this.executorCompletionService.poll();
            z10 = true;
            if (futurePoll != null) {
                try {
                    Integer num = futurePoll.get();
                    int iIntValue = num.intValue();
                    if (iIntValue == 1) {
                        this.numParserThreadsFinished++;
                        LOG.t("fetchEmitWorker finished, total {}", Integer.valueOf(this.numParserThreadsFinished));
                    } else if (iIntValue == 2) {
                        this.numEmitterThreadsFinished++;
                        LOG.t("emitter thread finished, total {}", Integer.valueOf(this.numEmitterThreadsFinished));
                    } else {
                        if (iIntValue != 3) {
                            throw new IllegalArgumentException("Don't recognize this future code: " + num);
                        }
                        LOG.a("watcher thread finished");
                    }
                } catch (ExecutionException e10) {
                    LOG.q("execution exception", e10);
                    this.asyncConfig.getPipesReporter().error(e10);
                    throw new RuntimeException(e10);
                }
            }
            if (this.numParserThreadsFinished == this.asyncConfig.getNumClients() && !this.addedEmitterSemaphores) {
                for (int i10 = 0; i10 < this.asyncConfig.getNumEmitters(); i10++) {
                    try {
                        if (!this.emitData.offer(AsyncEmitter.EMIT_DATA_STOP_SEMAPHORE, MAX_OFFER_WAIT_MS, TimeUnit.MILLISECONDS)) {
                            throw new RuntimeException("Couldn't offer emit data stop semaphore within " + MAX_OFFER_WAIT_MS + " ms");
                        }
                    } catch (InterruptedException e11) {
                        throw new RuntimeException(e11);
                    }
                }
                this.addedEmitterSemaphores = true;
            }
            if (this.numParserThreadsFinished == this.asyncConfig.getNumClients() && this.numEmitterThreadsFinished == this.asyncConfig.getNumEmitters()) {
                z10 = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.executorService.shutdownNow();
        this.asyncConfig.getPipesReporter().close();
    }

    public void finished() {
        for (int i10 = 0; i10 < this.asyncConfig.getNumClients(); i10++) {
            if (!this.fetchEmitTuples.offer(PipesIterator.COMPLETED_SEMAPHORE, MAX_OFFER_WAIT_MS, TimeUnit.MILLISECONDS)) {
                throw new RuntimeException("Couldn't offer completed semaphore within " + MAX_OFFER_WAIT_MS + " ms");
            }
        }
    }

    public int getCapacity() {
        return this.fetchEmitTuples.remainingCapacity();
    }

    public long getTotalProcessed() {
        return this.totalProcessed.get();
    }

    public synchronized boolean offer(List<FetchEmitTuple> list, long j10) {
        if (this.isShuttingDown) {
            throw new IllegalStateException("Can't call offer after calling close() or shutdownNow()");
        }
        if (list.size() > this.asyncConfig.getQueueSize()) {
            throw new OfferLargerThanQueueSize(list.size(), this.asyncConfig.getQueueSize());
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (long jCurrentTimeMillis2 = System.currentTimeMillis(); jCurrentTimeMillis2 - jCurrentTimeMillis < j10; jCurrentTimeMillis2 = System.currentTimeMillis()) {
            if (this.fetchEmitTuples.remainingCapacity() > list.size()) {
                try {
                    this.fetchEmitTuples.addAll(list);
                    return true;
                } catch (IllegalStateException e10) {
                    LOG.v("couldn't add full list", e10);
                    Thread.sleep(100L);
                }
            }
            Thread.sleep(100L);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncProcessor(Path path, PipesIterator pipesIterator) throws Exception {
        AsyncProcessor asyncProcessor;
        Exception exc;
        this.totalProcessed = new AtomicLong(0L);
        this.numParserThreadsFinished = 0;
        this.numEmitterThreadsFinished = 0;
        this.addedEmitterSemaphores = false;
        this.isShuttingDown = false;
        AsyncConfig asyncConfigLoad = AsyncConfig.load(path);
        this.asyncConfig = asyncConfigLoad;
        this.fetchEmitTuples = new ArrayBlockingQueue<>(asyncConfigLoad.getQueueSize());
        this.emitData = new ArrayBlockingQueue<>(100);
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(asyncConfigLoad.getNumClients() + asyncConfigLoad.getNumEmitters() + 1);
        this.executorService = executorServiceNewFixedThreadPool;
        ExecutorCompletionService<Integer> executorCompletionService = new ExecutorCompletionService<>(executorServiceNewFixedThreadPool);
        this.executorCompletionService = executorCompletionService;
        try {
            if (!path.toAbsolutePath().equals(asyncConfigLoad.getTikaConfig().toAbsolutePath())) {
                try {
                    LOG.i("TikaConfig for AsyncProcessor ({}) is different from TikaConfig for workers ({}). If this is intended, please ignore this warning.", path.toAbsolutePath(), asyncConfigLoad.getTikaConfig().toAbsolutePath());
                } catch (Exception e10) {
                    exc = e10;
                    asyncProcessor = this;
                    LOG.q("problem initializing AsyncProcessor", exc);
                    asyncProcessor.executorService.shutdownNow();
                    asyncProcessor.asyncConfig.getPipesReporter().error(exc);
                    throw exc;
                }
            }
            executorCompletionService.submit(new Callable() { // from class: org.apache.tika.pipes.async.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return AsyncProcessor.b(this.f41597a);
                }
            });
            if (pipesIterator != 0 && (pipesIterator instanceof TotalCounter)) {
                LOG.a("going to total counts");
                startCounter((TotalCounter) pipesIterator);
            }
            int i10 = 0;
            while (i10 < this.asyncConfig.getNumClients()) {
                asyncProcessor = this;
                try {
                    this.executorCompletionService.submit(new FetchEmitWorker(this.asyncConfig, this.fetchEmitTuples, this.emitData));
                    i10++;
                    this = asyncProcessor;
                } catch (Exception e11) {
                    e = e11;
                    exc = e;
                    LOG.q("problem initializing AsyncProcessor", exc);
                    asyncProcessor.executorService.shutdownNow();
                    asyncProcessor.asyncConfig.getPipesReporter().error(exc);
                    throw exc;
                }
            }
            asyncProcessor = this;
            EmitterManager emitterManagerLoad = EmitterManager.load(asyncProcessor.asyncConfig.getTikaConfig());
            for (int i11 = 0; i11 < asyncProcessor.asyncConfig.getNumEmitters(); i11++) {
                asyncProcessor.executorCompletionService.submit(new AsyncEmitter(asyncProcessor.asyncConfig, asyncProcessor.emitData, emitterManagerLoad));
            }
        } catch (Exception e12) {
            e = e12;
            asyncProcessor = this;
        }
    }

    public synchronized boolean offer(FetchEmitTuple fetchEmitTuple, long j10) {
        if (this.fetchEmitTuples != null) {
            if (!this.isShuttingDown) {
                checkActive();
            } else {
                throw new IllegalStateException("Can't call offer after calling close() or shutdownNow()");
            }
        } else {
            throw new IllegalStateException("queue hasn't been initialized yet.");
        }
        return this.fetchEmitTuples.offer(fetchEmitTuple, j10, TimeUnit.MILLISECONDS);
    }
}
