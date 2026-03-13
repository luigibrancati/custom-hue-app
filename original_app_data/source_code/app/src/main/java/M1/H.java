package M1;

import G1.AbstractC0853a;
import G1.M;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f9054d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, ByteSourceJsonBootstrapper.UTF8_BOM_2, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f9055e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteBuffer f9056a = E1.e.f3192a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9058c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9057b = 2;

    public void a(J1.f fVar, List list) {
        AbstractC0853a.e(fVar.f5878d);
        if (fVar.f5878d.limit() - fVar.f5878d.position() == 0) {
            return;
        }
        this.f9056a = b(fVar.f5878d, (this.f9057b == 2 && (list.size() == 1 || list.size() == 3)) ? (byte[]) list.get(0) : null);
        fVar.s();
        fVar.D(this.f9056a.remaining());
        fVar.f5878d.put(this.f9056a);
        fVar.E();
    }

    public final ByteBuffer b(ByteBuffer byteBuffer, byte[] bArr) {
        int i10;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        int i12 = (i11 + 255) / 255;
        int length = i12 + 27 + i11;
        if (this.f9057b == 2) {
            int length2 = bArr != null ? bArr.length + 28 : f9054d.length;
            length += f9055e.length + length2;
            i10 = length2;
        } else {
            i10 = 0;
        }
        ByteBuffer byteBufferC = c(length);
        if (this.f9057b == 2) {
            if (bArr != null) {
                e(byteBufferC, bArr);
            } else {
                byteBufferC.put(f9054d);
            }
            byteBufferC.put(f9055e);
        }
        int iJ = this.f9058c + i2.H.j(byteBuffer);
        this.f9058c = iJ;
        f(byteBufferC, iJ, this.f9057b, i12, false);
        for (int i13 = 0; i13 < i12; i13++) {
            if (i11 >= 255) {
                byteBufferC.put((byte) -1);
                i11 -= 255;
            } else {
                byteBufferC.put((byte) i11);
                i11 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferC.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferC.flip();
        if (this.f9057b == 2) {
            byte[] bArrArray = byteBufferC.array();
            int iArrayOffset = byteBufferC.arrayOffset() + i10;
            byte[] bArr2 = f9055e;
            byteBufferC.putInt(i10 + bArr2.length + 22, M.w(bArrArray, iArrayOffset + bArr2.length, byteBufferC.limit() - byteBufferC.position(), 0));
        } else {
            byteBufferC.putInt(22, M.w(byteBufferC.array(), byteBufferC.arrayOffset(), byteBufferC.limit() - byteBufferC.position(), 0));
        }
        this.f9057b++;
        return byteBufferC;
    }

    public final ByteBuffer c(int i10) {
        if (this.f9056a.capacity() < i10) {
            this.f9056a = ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f9056a.clear();
        }
        return this.f9056a;
    }

    public void d() {
        this.f9056a = E1.e.f3192a;
        this.f9058c = 0;
        this.f9057b = 2;
    }

    public final void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(N7.j.a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, M.w(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    public final void f(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z10) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z10 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(N7.j.a(i11));
    }
}
