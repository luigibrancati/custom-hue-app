package io.sentry.instrumentation.file;

import io.sentry.IScopes;
import io.sentry.ISpan;
import io.sentry.ScopesAdapter;
import io.sentry.instrumentation.file.FileIOSpanManager;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryFileInputStream extends FileInputStream {
    private final FileInputStream delegate;
    private final FileIOSpanManager spanManager;

    public static /* synthetic */ Integer c(SentryFileInputStream sentryFileInputStream, AtomicInteger atomicInteger) throws IOException {
        int i10 = sentryFileInputStream.delegate.read();
        atomicInteger.set(i10);
        return Integer.valueOf(i10 != -1 ? 1 : 0);
    }

    private static FileDescriptor getFileDescriptor(FileInputStream fileInputStream) throws FileNotFoundException {
        try {
            return fileInputStream.getFD();
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FileInputStreamInitData init(File file, FileInputStream fileInputStream, IScopes iScopes) {
        ISpan iSpanStartSpan = FileIOSpanManager.startSpan(iScopes, "file.read");
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(file);
        }
        return new FileInputStreamInitData(file, iSpanStartSpan, fileInputStream, iScopes.getOptions());
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.spanManager.finish(this.delegate);
        super.close();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public int read() throws IOException {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        this.spanManager.performIO(new FileIOSpanManager.FileIOCallable() { // from class: io.sentry.instrumentation.file.d
            @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
            public final Object call() {
                return SentryFileInputStream.c(this.f38760a, atomicInteger);
            }
        });
        return atomicInteger.get();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public long skip(final long j10) {
        return ((Long) this.spanManager.performIO(new FileIOSpanManager.FileIOCallable() { // from class: io.sentry.instrumentation.file.a
            @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
            public final Object call() {
                return Long.valueOf(this.f38752a.delegate.skip(j10));
            }
        })).longValue();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Factory {
        public static FileInputStream create(FileInputStream fileInputStream, String str) {
            ScopesAdapter scopesAdapter = ScopesAdapter.getInstance();
            if (isTracingEnabled(scopesAdapter)) {
                return new SentryFileInputStream(SentryFileInputStream.init(str != null ? new File(str) : null, fileInputStream, scopesAdapter));
            }
            return fileInputStream;
        }

        private static boolean isTracingEnabled(IScopes iScopes) {
            return iScopes.getOptions().isTracingEnabled();
        }

        public static FileInputStream create(FileInputStream fileInputStream, File file) {
            ScopesAdapter scopesAdapter = ScopesAdapter.getInstance();
            return isTracingEnabled(scopesAdapter) ? new SentryFileInputStream(SentryFileInputStream.init(file, fileInputStream, scopesAdapter)) : fileInputStream;
        }

        public static FileInputStream create(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
            ScopesAdapter scopesAdapter = ScopesAdapter.getInstance();
            return isTracingEnabled(scopesAdapter) ? new SentryFileInputStream(SentryFileInputStream.init(fileDescriptor, fileInputStream, scopesAdapter), fileDescriptor) : fileInputStream;
        }

        public static FileInputStream create(FileInputStream fileInputStream, File file, IScopes iScopes) {
            return isTracingEnabled(iScopes) ? new SentryFileInputStream(SentryFileInputStream.init(file, fileInputStream, iScopes)) : fileInputStream;
        }
    }

    public SentryFileInputStream(String str) {
        this(str != null ? new File(str) : null, ScopesAdapter.getInstance());
    }

    public SentryFileInputStream(File file) {
        this(file, ScopesAdapter.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FileInputStreamInitData init(FileDescriptor fileDescriptor, FileInputStream fileInputStream, IScopes iScopes) {
        ISpan iSpanStartSpan = FileIOSpanManager.startSpan(iScopes, "file.read");
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(fileDescriptor);
        }
        return new FileInputStreamInitData(null, iSpanStartSpan, fileInputStream, iScopes.getOptions());
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public int read(final byte[] bArr) {
        return ((Integer) this.spanManager.performIO(new FileIOSpanManager.FileIOCallable() { // from class: io.sentry.instrumentation.file.c
            @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
            public final Object call() {
                return Integer.valueOf(this.f38758a.delegate.read(bArr));
            }
        })).intValue();
    }

    public SentryFileInputStream(FileDescriptor fileDescriptor) {
        this(fileDescriptor, ScopesAdapter.getInstance());
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public int read(final byte[] bArr, final int i10, final int i11) {
        return ((Integer) this.spanManager.performIO(new FileIOSpanManager.FileIOCallable() { // from class: io.sentry.instrumentation.file.b
            @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
            public final Object call() {
                return Integer.valueOf(this.f38754a.delegate.read(bArr, i10, i11));
            }
        })).intValue();
    }

    public SentryFileInputStream(File file, IScopes iScopes) {
        this(init(file, (FileInputStream) null, iScopes));
    }

    public SentryFileInputStream(FileDescriptor fileDescriptor, IScopes iScopes) {
        this(init(fileDescriptor, (FileInputStream) null, iScopes), fileDescriptor);
    }

    private SentryFileInputStream(FileInputStreamInitData fileInputStreamInitData, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.spanManager = new FileIOSpanManager(fileInputStreamInitData.span, fileInputStreamInitData.file, fileInputStreamInitData.options);
        this.delegate = fileInputStreamInitData.delegate;
    }

    private SentryFileInputStream(FileInputStreamInitData fileInputStreamInitData) {
        super(getFileDescriptor(fileInputStreamInitData.delegate));
        this.spanManager = new FileIOSpanManager(fileInputStreamInitData.span, fileInputStreamInitData.file, fileInputStreamInitData.options);
        this.delegate = fileInputStreamInitData.delegate;
    }
}
