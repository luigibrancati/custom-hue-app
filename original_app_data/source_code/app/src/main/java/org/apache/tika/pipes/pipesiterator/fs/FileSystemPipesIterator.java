package org.apache.tika.pipes.pipesiterator.fs;

import af.c;
import af.e;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.config.Param;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.pipes.FetchEmitTuple;
import org.apache.tika.pipes.HandlerConfig;
import org.apache.tika.pipes.async.AsyncProcessor;
import org.apache.tika.pipes.emitter.EmitKey;
import org.apache.tika.pipes.fetcher.FetchKey;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.pipes.pipesiterator.TotalCountResult;
import org.apache.tika.pipes.pipesiterator.TotalCounter;
import org.apache.tika.pipes.pipesiterator.fs.FileSystemPipesIterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FileSystemPipesIterator extends PipesIterator implements TotalCounter, Initializable, Closeable {
    private static final c LOG = e.l(AsyncProcessor.class);
    private Path basePath;
    private boolean countTotal = false;
    private FileCountWorker fileCountWorker;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class FSFileVisitor implements FileVisitor<Path> {
        private final String emitterName;
        private final String fetcherName;

        private FSFileVisitor(String str, String str2) {
            this.fetcherName = str;
            this.emitterName = str2;
        }

        @Override // java.nio.file.FileVisitor
        public FileVisitResult postVisitDirectory(Path path, IOException iOException) {
            return FileVisitResult.CONTINUE;
        }

        @Override // java.nio.file.FileVisitor
        public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) {
            return FileVisitResult.CONTINUE;
        }

        @Override // java.nio.file.FileVisitor
        public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
            String string = FileSystemPipesIterator.this.basePath.relativize(path).toString();
            try {
                ParseContext parseContext = new ParseContext();
                parseContext.set(HandlerConfig.class, FileSystemPipesIterator.this.getHandlerConfig());
                FileSystemPipesIterator.this.tryToAdd(new FetchEmitTuple(string, new FetchKey(this.fetcherName, string), new EmitKey(this.emitterName, string), new Metadata(), parseContext, FileSystemPipesIterator.this.getOnParseException()));
                return FileVisitResult.CONTINUE;
            } catch (InterruptedException unused) {
                return FileVisitResult.TERMINATE;
            } catch (TimeoutException e10) {
                throw new IOException(e10);
            }
        }

        @Override // java.nio.file.FileVisitor
        public FileVisitResult visitFileFailed(Path path, IOException iOException) {
            return FileVisitResult.CONTINUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class FileCountWorker implements TotalCounter, Closeable {
        private final Path basePath;
        private TotalCountResult finalResult;
        private Thread totalCounterThread;
        private final AtomicLong totalCount = new AtomicLong(0);
        private TotalCountResult.STATUS status = TotalCountResult.STATUS.NOT_COMPLETED;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class FSFileCounter implements FileVisitor<Path> {
            private final AtomicLong count;

            private FSFileCounter(AtomicLong atomicLong) {
                this.count = atomicLong;
            }

            @Override // java.nio.file.FileVisitor
            public FileVisitResult postVisitDirectory(Path path, IOException iOException) {
                return FileVisitResult.CONTINUE;
            }

            @Override // java.nio.file.FileVisitor
            public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) {
                return FileVisitResult.CONTINUE;
            }

            @Override // java.nio.file.FileVisitor
            public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
                this.count.incrementAndGet();
                return FileVisitResult.CONTINUE;
            }

            @Override // java.nio.file.FileVisitor
            public FileVisitResult visitFileFailed(Path path, IOException iOException) {
                return FileVisitResult.CONTINUE;
            }
        }

        public FileCountWorker(Path path) {
            this.basePath = path;
        }

        public static /* synthetic */ void a(FileCountWorker fileCountWorker) {
            fileCountWorker.getClass();
            try {
                Files.walkFileTree(fileCountWorker.basePath, new FSFileCounter(fileCountWorker.totalCount));
                fileCountWorker.status = TotalCountResult.STATUS.COMPLETED;
                fileCountWorker.finalResult = new TotalCountResult(fileCountWorker.totalCount.get(), fileCountWorker.status);
            } catch (IOException e10) {
                FileSystemPipesIterator.LOG.l("problem counting files", e10);
                fileCountWorker.status = TotalCountResult.STATUS.EXCEPTION;
                fileCountWorker.finalResult = new TotalCountResult(fileCountWorker.totalCount.get(), fileCountWorker.status);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.totalCounterThread.interrupt();
        }

        @Override // org.apache.tika.pipes.pipesiterator.TotalCounter
        public TotalCountResult getTotalCount() {
            TotalCountResult totalCountResult = this.finalResult;
            return totalCountResult != null ? totalCountResult : new TotalCountResult(this.totalCount.get(), this.status);
        }

        @Override // org.apache.tika.pipes.pipesiterator.TotalCounter
        public void startTotalCount() {
            Thread thread = new Thread(new Runnable() { // from class: org.apache.tika.pipes.pipesiterator.fs.a
                @Override // java.lang.Runnable
                public final void run() {
                    FileSystemPipesIterator.FileCountWorker.a(this.f41600a);
                }
            });
            this.totalCounterThread = thread;
            thread.setDaemon(true);
            this.totalCounterThread.start();
        }
    }

    public FileSystemPipesIterator() {
    }

    @Override // org.apache.tika.pipes.pipesiterator.PipesIterator, org.apache.tika.config.Initializable
    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) {
        TikaConfig.mustNotBeEmpty("basePath", this.basePath);
        TikaConfig.mustNotBeEmpty("fetcherName", getFetcherName());
        TikaConfig.mustNotBeEmpty("emitterName", getFetcherName());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        FileCountWorker fileCountWorker = this.fileCountWorker;
        if (fileCountWorker != null) {
            fileCountWorker.close();
        }
    }

    @Override // org.apache.tika.pipes.pipesiterator.PipesIterator
    public void enqueue() throws TimeoutException, IOException {
        if (!Files.isDirectory(this.basePath, new LinkOption[0])) {
            throw new IllegalArgumentException("\"basePath\" directory does not exist: " + String.valueOf(this.basePath.toAbsolutePath()));
        }
        try {
            Files.walkFileTree(this.basePath, new FSFileVisitor(getFetcherName(), getEmitterName()));
        } catch (IOException e10) {
            Throwable cause = e10.getCause();
            if (cause != null && (cause instanceof TimeoutException)) {
                throw ((TimeoutException) cause);
            }
            throw e10;
        }
    }

    @Override // org.apache.tika.pipes.pipesiterator.TotalCounter
    public TotalCountResult getTotalCount() {
        return !this.countTotal ? TotalCountResult.UNSUPPORTED : this.fileCountWorker.getTotalCount();
    }

    @Override // org.apache.tika.pipes.pipesiterator.PipesIterator, org.apache.tika.config.Initializable
    public void initialize(Map<String, Param> map) {
        if (this.countTotal) {
            this.fileCountWorker = new FileCountWorker(this.basePath);
        }
    }

    @Field
    public void setBasePath(String str) {
        this.basePath = Paths.get(str, new String[0]);
    }

    @Field
    public void setCountTotal(boolean z10) {
        this.countTotal = z10;
    }

    @Override // org.apache.tika.pipes.pipesiterator.TotalCounter
    public void startTotalCount() {
        if (this.countTotal) {
            this.fileCountWorker.startTotalCount();
        }
    }

    public FileSystemPipesIterator(Path path) {
        this.basePath = path;
    }
}
