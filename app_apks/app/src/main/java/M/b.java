package M;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class b extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f8811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteOrder f8812b;

    public b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f8811a = outputStream;
        this.f8812b = byteOrder;
    }

    public void a(ByteOrder byteOrder) {
        this.f8812b = byteOrder;
    }

    public void b(int i10) throws IOException {
        this.f8811a.write(i10);
    }

    public void c(int i10) throws IOException {
        ByteOrder byteOrder = this.f8812b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f8811a.write(i10 & 255);
            this.f8811a.write((i10 >>> 8) & 255);
            this.f8811a.write((i10 >>> 16) & 255);
            this.f8811a.write((i10 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f8811a.write((i10 >>> 24) & 255);
            this.f8811a.write((i10 >>> 16) & 255);
            this.f8811a.write((i10 >>> 8) & 255);
            this.f8811a.write(i10 & 255);
        }
    }

    public void d(short s10) throws IOException {
        ByteOrder byteOrder = this.f8812b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f8811a.write(s10 & 255);
            this.f8811a.write((s10 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f8811a.write((s10 >>> 8) & 255);
            this.f8811a.write(s10 & 255);
        }
    }

    public void f(long j10) throws IOException {
        c((int) j10);
    }

    public void g(int i10) throws IOException {
        d((short) i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f8811a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f8811a.write(bArr, i10, i11);
    }
}
