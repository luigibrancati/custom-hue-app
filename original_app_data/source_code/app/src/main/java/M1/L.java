package M1;

import E1.e;
import G1.M;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class L extends E1.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f9078m = M.f4267f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9079n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f9080o;

    @Override // E1.g, E1.e
    public boolean b() {
        return super.b() && this.f9079n == 0;
    }

    @Override // E1.g, E1.e
    public ByteBuffer d() {
        int i10;
        if (super.b() && (i10 = this.f9079n) > 0) {
            l(i10).put(this.f9078m, 0, this.f9079n).flip();
            this.f9079n = 0;
        }
        return super.d();
    }

    @Override // E1.e
    public void f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f9077l);
        this.f9080o += (long) (iMin / this.f3199b.f3197d);
        this.f9077l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f9077l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f9079n + i11) - this.f9078m.length;
        ByteBuffer byteBufferL = l(length);
        int iO = M.o(length, 0, this.f9079n);
        byteBufferL.put(this.f9078m, 0, iO);
        int iO2 = M.o(length - iO, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iO2);
        byteBufferL.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iO2;
        int i13 = this.f9079n - iO;
        this.f9079n = i13;
        byte[] bArr = this.f9078m;
        System.arraycopy(bArr, iO, bArr, 0, i13);
        byteBuffer.get(this.f9078m, this.f9079n, i12);
        this.f9079n += i12;
        byteBufferL.flip();
    }

    @Override // E1.g
    public e.a h(e.a aVar) throws e.b {
        if (!M.D0(aVar.f3196c)) {
            throw new e.b(aVar);
        }
        this.f9076k = true;
        return (this.f9074i == 0 && this.f9075j == 0) ? e.a.f3193e : aVar;
    }

    @Override // E1.g
    public void i() {
        if (this.f9076k) {
            this.f9076k = false;
            int i10 = this.f9075j;
            int i11 = this.f3199b.f3197d;
            this.f9078m = new byte[i10 * i11];
            this.f9077l = this.f9074i * i11;
        }
        this.f9079n = 0;
    }

    @Override // E1.g
    public void j() {
        if (this.f9076k) {
            int i10 = this.f9079n;
            if (i10 > 0) {
                this.f9080o += (long) (i10 / this.f3199b.f3197d);
            }
            this.f9079n = 0;
        }
    }

    @Override // E1.g
    public void k() {
        this.f9078m = M.f4267f;
    }

    public long m() {
        return this.f9080o;
    }

    public void n() {
        this.f9080o = 0L;
    }

    public void o(int i10, int i11) {
        this.f9074i = i10;
        this.f9075j = i11;
    }
}
