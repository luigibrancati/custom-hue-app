package org.apache.tika.pipes.pipesiterator;

import af.c;
import af.e;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.tika.config.ConfigBase;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.config.Param;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaTimeoutException;
import org.apache.tika.pipes.FetchEmitTuple;
import org.apache.tika.pipes.HandlerConfig;
import org.apache.tika.sax.BasicContentHandlerFactory;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class PipesIterator extends ConfigBase implements Callable<Integer>, Iterable<FetchEmitTuple>, Initializable {
    public static final long DEFAULT_MAX_WAIT_MS = 300000;
    public static final int DEFAULT_QUEUE_SIZE = 1000;
    private String emitterName;
    private String fetcherName;
    private FutureTask<Integer> futureTask;
    public static final FetchEmitTuple COMPLETED_SEMAPHORE = new FetchEmitTuple(null, null, null, null, null, null);
    private static final c LOGGER = e.l(PipesIterator.class);
    private long maxWaitMs = 300000;
    private ArrayBlockingQueue<FetchEmitTuple> queue = null;
    private int queueSize = 1000;
    private FetchEmitTuple.ON_PARSE_EXCEPTION onParseException = FetchEmitTuple.ON_PARSE_EXCEPTION.EMIT;
    private BasicContentHandlerFactory.HANDLER_TYPE handlerType = BasicContentHandlerFactory.HANDLER_TYPE.TEXT;
    private HandlerConfig.PARSE_MODE parseMode = HandlerConfig.PARSE_MODE.RMETA;
    private boolean throwOnWriteLimitReached = false;
    private int writeLimit = -1;
    private int maxEmbeddedResources = -1;
    private int added = 0;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class TupleIterator implements Iterator<FetchEmitTuple> {
        FetchEmitTuple next;

        private void checkThreadOk() throws InterruptedException {
            if (PipesIterator.this.futureTask.isDone()) {
                try {
                    PipesIterator.this.futureTask.get();
                } catch (ExecutionException e10) {
                    throw new RuntimeException(e10.getCause());
                }
            }
        }

        private FetchEmitTuple pollNext() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                FetchEmitTuple fetchEmitTuple = null;
                while (fetchEmitTuple == null) {
                    if (jCurrentTimeMillis2 >= PipesIterator.this.maxWaitMs) {
                        break;
                    }
                    checkThreadOk();
                    fetchEmitTuple = (FetchEmitTuple) PipesIterator.this.queue.poll(100L, TimeUnit.MILLISECONDS);
                    jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                }
                if (fetchEmitTuple != null) {
                    return fetchEmitTuple;
                }
                throw new TikaTimeoutException("waited longer than " + PipesIterator.this.maxWaitMs + "ms for the next tuple");
            } catch (InterruptedException unused) {
                PipesIterator.LOGGER.c("interrupted");
                return PipesIterator.COMPLETED_SEMAPHORE;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.next == null) {
                this.next = pollNext();
            }
            return this.next != PipesIterator.COMPLETED_SEMAPHORE;
        }

        private TupleIterator() {
            this.next = null;
        }

        @Override // java.util.Iterator
        public FetchEmitTuple next() {
            FetchEmitTuple fetchEmitTuple = this.next;
            if (fetchEmitTuple == PipesIterator.COMPLETED_SEMAPHORE) {
                throw new IllegalStateException("don't call next() after hasNext() has returned false!");
            }
            this.next = pollNext();
            return fetchEmitTuple;
        }
    }

    public static PipesIterator build(Path path) throws IOException {
        InputStream inputStreamNewInputStream = Files.newInputStream(path, new OpenOption[0]);
        try {
            PipesIterator pipesIterator = (PipesIterator) ConfigBase.buildSingle("pipesIterator", PipesIterator.class, inputStreamNewInputStream);
            if (inputStreamNewInputStream != null) {
                inputStreamNewInputStream.close();
            }
            return pipesIterator;
        } catch (Throwable th) {
            if (inputStreamNewInputStream != null) {
                try {
                    inputStreamNewInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public abstract void enqueue();

    public String getEmitterName() {
        return this.emitterName;
    }

    public String getFetcherName() {
        return this.fetcherName;
    }

    public HandlerConfig getHandlerConfig() {
        return new HandlerConfig(this.handlerType, this.parseMode, this.writeLimit, this.maxEmbeddedResources, this.throwOnWriteLimitReached);
    }

    public FetchEmitTuple.ON_PARSE_EXCEPTION getOnParseException() {
        return this.onParseException;
    }

    @Override // java.lang.Iterable
    public Iterator<FetchEmitTuple> iterator() {
        if (this.futureTask != null) {
            throw new IllegalStateException("Can't call iterator more than once!");
        }
        this.futureTask = new FutureTask<>(this);
        this.queue = new ArrayBlockingQueue<>(this.queueSize);
        new Thread(this.futureTask).start();
        return new TupleIterator();
    }

    @Field
    public void setEmitterName(String str) {
        this.emitterName = str;
    }

    @Field
    public void setFetcherName(String str) {
        this.fetcherName = str;
    }

    @Field
    public void setHandlerType(String str) {
        this.handlerType = BasicContentHandlerFactory.parseHandlerType(str, BasicContentHandlerFactory.HANDLER_TYPE.TEXT);
    }

    @Field
    public void setMaxEmbeddedResources(int i10) {
        this.maxEmbeddedResources = i10;
    }

    @Field
    public void setMaxWaitMs(long j10) {
        this.maxWaitMs = j10;
    }

    @Field
    public void setOnParseException(String str) throws TikaConfigException {
        if ("skip".equalsIgnoreCase(str)) {
            setOnParseException(FetchEmitTuple.ON_PARSE_EXCEPTION.SKIP);
        } else {
            if ("emit".equalsIgnoreCase(str)) {
                setOnParseException(FetchEmitTuple.ON_PARSE_EXCEPTION.EMIT);
                return;
            }
            throw new TikaConfigException("must be either 'skip' or 'emit': " + str);
        }
    }

    @Field
    public void setParseMode(String str) {
        setParseMode(HandlerConfig.PARSE_MODE.parseMode(str));
    }

    @Field
    public void setQueueSize(int i10) {
        this.queueSize = i10;
    }

    @Field
    public void setThrowOnWriteLimitReached(boolean z10) {
        this.throwOnWriteLimitReached = z10;
    }

    @Field
    public void setWriteLimit(int i10) {
        this.writeLimit = i10;
    }

    public void tryToAdd(FetchEmitTuple fetchEmitTuple) throws TimeoutException {
        this.added++;
        if (!this.queue.offer(fetchEmitTuple, this.maxWaitMs, TimeUnit.MILLISECONDS)) {
            throw new TimeoutException("timed out while offering");
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public Integer call() throws TimeoutException {
        enqueue();
        tryToAdd(COMPLETED_SEMAPHORE);
        return Integer.valueOf(this.added);
    }

    public void setParseMode(HandlerConfig.PARSE_MODE parse_mode) {
        this.parseMode = parse_mode;
    }

    public void setOnParseException(FetchEmitTuple.ON_PARSE_EXCEPTION on_parse_exception) {
        this.onParseException = on_parse_exception;
    }

    @Override // org.apache.tika.config.Initializable
    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) {
    }

    @Override // org.apache.tika.config.Initializable
    public void initialize(Map<String, Param> map) {
    }
}
