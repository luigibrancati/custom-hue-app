package io.sentry.instrumentation.file;

import io.sentry.IScopes;
import io.sentry.ISpan;
import io.sentry.ScopesAdapter;
import io.sentry.instrumentation.file.FileIOSpanManager;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryFileOutputStream extends FileOutputStream {
    private final FileOutputStream delegate;
    private final FileIOSpanManager spanManager;

    public static /* synthetic */ Integer a(SentryFileOutputStream sentryFileOutputStream, byte[] bArr) throws IOException {
        sentryFileOutputStream.delegate.write(bArr);
        return Integer.valueOf(bArr.length);
    }

    public static /* synthetic */ Integer b(SentryFileOutputStream sentryFileOutputStream, byte[] bArr, int i10, int i11) throws IOException {
        sentryFileOutputStream.delegate.write(bArr, i10, i11);
        return Integer.valueOf(i11);
    }

    public static /* synthetic */ Integer c(SentryFileOutputStream sentryFileOutputStream, int i10) throws IOException {
        sentryFileOutputStream.delegate.write(i10);
        return 1;
    }

    private static FileDescriptor getFileDescriptor(FileOutputStream fileOutputStream) throws FileNotFoundException {
        try {
            return fileOutputStream.getFD();
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FileOutputStreamInitData init(File file, boolean z10, FileOutputStream fileOutputStream, IScopes iScopes) {
        ISpan iSpanStartSpan = FileIOSpanManager.startSpan(iScopes, "file.write");
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(file, z10);
        }
        return new FileOutputStreamInitData(file, z10, iSpanStartSpan, fileOutputStream, iScopes.getOptions());
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.spanManager.finish(this.delegate);
        super.close();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(final int i10) throws IOException {
        this.spanManager.performIO(new FileIOSpanManager.FileIOCallable() { // from class: io.sentry.instrumentation.file.f
            @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
            public final Object call() {
                return SentryFileOutputStream.c(this.f38766a, i10);
            }
        });
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(final byte[] bArr) throws IOException {
        this.spanManager.performIO(new FileIOSpanManager.FileIOCallable() { // from class: io.sentry.instrumentation.file.g
            @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
            public final Object call() {
                return SentryFileOutputStream.a(this.f38768a, bArr);
            }
        });
    }

    public SentryFileOutputStream(String str) {
        this(str != null ? new File(str) : null, false, (IScopes) ScopesAdapter.getInstance());
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(final byte[] bArr, final int i10, final int i11) throws IOException {
        this.spanManager.performIO(new FileIOSpanManager.FileIOCallable() { // from class: io.sentry.instrumentation.file.e
            @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
            public final Object call() {
                return SentryFileOutputStream.b(this.f38762a, bArr, i10, i11);
            }
        });
    }

    public SentryFileOutputStream(String str, boolean z10) {
        this(init(str != null ? new File(str) : null, z10, null, ScopesAdapter.getInstance()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FileOutputStreamInitData init(FileDescriptor fileDescriptor, FileOutputStream fileOutputStream, IScopes iScopes) {
        ISpan iSpanStartSpan = FileIOSpanManager.startSpan(iScopes, "file.write");
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(fileDescriptor);
        }
        return new FileOutputStreamInitData(null, false, iSpanStartSpan, fileOutputStream, iScopes.getOptions());
    }

    public SentryFileOutputStream(File file) {
        this(file, false, (IScopes) ScopesAdapter.getInstance());
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Factory {
        public static FileOutputStream create(FileOutputStream fileOutputStream, String str) {
            if (isTracingEnabled(ScopesAdapter.getInstance())) {
                return new SentryFileOutputStream(SentryFileOutputStream.init(str != null ? new File(str) : null, false, fileOutputStream, ScopesAdapter.getInstance()));
            }
            return fileOutputStream;
        }

        private static boolean isTracingEnabled(IScopes iScopes) {
            return iScopes.getOptions().isTracingEnabled();
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, String str, boolean z10) {
            if (isTracingEnabled(ScopesAdapter.getInstance())) {
                return new SentryFileOutputStream(SentryFileOutputStream.init(str != null ? new File(str) : null, z10, fileOutputStream, ScopesAdapter.getInstance()));
            }
            return fileOutputStream;
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, File file) {
            return isTracingEnabled(ScopesAdapter.getInstance()) ? new SentryFileOutputStream(SentryFileOutputStream.init(file, false, fileOutputStream, ScopesAdapter.getInstance())) : fileOutputStream;
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, File file, boolean z10) {
            return isTracingEnabled(ScopesAdapter.getInstance()) ? new SentryFileOutputStream(SentryFileOutputStream.init(file, z10, fileOutputStream, ScopesAdapter.getInstance())) : fileOutputStream;
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, FileDescriptor fileDescriptor) {
            return isTracingEnabled(ScopesAdapter.getInstance()) ? new SentryFileOutputStream(SentryFileOutputStream.init(fileDescriptor, fileOutputStream, ScopesAdapter.getInstance()), fileDescriptor) : fileOutputStream;
        }

        public static FileOutputStream create(FileOutputStream fileOutputStream, File file, IScopes iScopes) {
            return isTracingEnabled(iScopes) ? new SentryFileOutputStream(SentryFileOutputStream.init(file, false, fileOutputStream, iScopes)) : fileOutputStream;
        }
    }

    public SentryFileOutputStream(File file, boolean z10) {
        this(init(file, z10, null, ScopesAdapter.getInstance()));
    }

    public SentryFileOutputStream(FileDescriptor fileDescriptor) {
        this(init(fileDescriptor, null, ScopesAdapter.getInstance()), fileDescriptor);
    }

    public SentryFileOutputStream(File file, boolean z10, IScopes iScopes) {
        this(init(file, z10, null, iScopes));
    }

    private SentryFileOutputStream(FileOutputStreamInitData fileOutputStreamInitData, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.spanManager = new FileIOSpanManager(fileOutputStreamInitData.span, fileOutputStreamInitData.file, fileOutputStreamInitData.options);
        this.delegate = fileOutputStreamInitData.delegate;
    }

    private SentryFileOutputStream(FileOutputStreamInitData fileOutputStreamInitData) {
        super(getFileDescriptor(fileOutputStreamInitData.delegate));
        this.spanManager = new FileIOSpanManager(fileOutputStreamInitData.span, fileOutputStreamInitData.file, fileOutputStreamInitData.options);
        this.delegate = fileOutputStreamInitData.delegate;
    }
}
