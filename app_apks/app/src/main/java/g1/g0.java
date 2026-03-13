package g1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f34918a;

    public g0(FileOutputStream fileOutputStream) {
        AbstractC4862t.e(fileOutputStream, "fileOutputStream");
        this.f34918a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f34918a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f34918a.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b10) throws IOException {
        AbstractC4862t.e(b10, "b");
        this.f34918a.write(b10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bytes, int i10, int i11) throws IOException {
        AbstractC4862t.e(bytes, "bytes");
        this.f34918a.write(bytes, i10, i11);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
