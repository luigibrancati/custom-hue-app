package Ne;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e extends FilterInputStream {
    private final Me.f afterRead;
    private volatile boolean closed;
    private final Me.c exceptionHandler;

    public e(InputStream inputStream) {
        super(inputStream);
        this.exceptionHandler = new Me.c() { // from class: Ne.d
            @Override // Me.c
            public final void accept(Object obj) throws Throwable {
                Me.a.a((IOException) obj);
            }
        };
        this.afterRead = Me.f.f9481a;
    }

    public void afterRead(int i10) {
        this.afterRead.accept(i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        if (((FilterInputStream) this).in == null || isClosed()) {
            return 0;
        }
        try {
            return ((FilterInputStream) this).in.available();
        } catch (IOException e10) {
            this.handleIOException(e10);
            return 0;
        }
    }

    public void checkOpen() throws IOException {
        c.a(!isClosed());
    }

    public void handleIOException(IOException iOException) {
        this.exceptionHandler.accept(iOException);
    }

    public boolean isClosed() {
        return this.closed;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        if (((FilterInputStream) this).in != null) {
            ((FilterInputStream) this).in.mark(i10);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return ((FilterInputStream) this).in != null && ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i10 = 1;
        try {
            beforeRead(1);
            int i11 = ((FilterInputStream) this).in.read();
            if (i11 == -1) {
                i10 = -1;
            }
            afterRead(i10);
            return i11;
        } catch (IOException e10) {
            handleIOException(e10);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e10) {
            handleIOException(e10);
        }
    }

    public e setReference(InputStream inputStream) {
        ((FilterInputStream) this).in = inputStream;
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        try {
            return ((FilterInputStream) this).in.skip(j10);
        } catch (IOException e10) {
            this.handleIOException(e10);
            return 0L;
        }
    }

    public InputStream unwrap() {
        return ((FilterInputStream) this).in;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        try {
            beforeRead(Je.f.r(bArr));
            int i10 = ((FilterInputStream) this).in.read(bArr);
            afterRead(i10);
            return i10;
        } catch (IOException e10) {
            handleIOException(e10);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        try {
            beforeRead(i11);
            int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
            afterRead(i12);
            return i12;
        } catch (IOException e10) {
            handleIOException(e10);
            return -1;
        }
    }

    public void beforeRead(int i10) {
    }
}
