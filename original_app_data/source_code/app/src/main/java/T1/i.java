package T1;

import G1.AbstractC0853a;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i extends J1.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f15936j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15937k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15938l;

    public i() {
        super(2);
        this.f15938l = 32;
    }

    public boolean I(J1.f fVar) {
        AbstractC0853a.a(!fVar.F());
        AbstractC0853a.a(!fVar.v());
        AbstractC0853a.a(!fVar.w());
        if (!J(fVar)) {
            return false;
        }
        int i10 = this.f15937k;
        this.f15937k = i10 + 1;
        if (i10 == 0) {
            this.f5880f = fVar.f5880f;
            if (fVar.y()) {
                B(1);
            }
        }
        ByteBuffer byteBuffer = fVar.f5878d;
        if (byteBuffer != null) {
            D(byteBuffer.remaining());
            this.f5878d.put(byteBuffer);
        }
        this.f15936j = fVar.f5880f;
        return true;
    }

    public final boolean J(J1.f fVar) {
        ByteBuffer byteBuffer;
        if (!N()) {
            return true;
        }
        if (this.f15937k >= this.f15938l) {
            return false;
        }
        ByteBuffer byteBuffer2 = fVar.f5878d;
        return byteBuffer2 == null || (byteBuffer = this.f5878d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public long K() {
        return this.f5880f;
    }

    public long L() {
        return this.f15936j;
    }

    public int M() {
        return this.f15937k;
    }

    public boolean N() {
        return this.f15937k > 0;
    }

    public void O(int i10) {
        AbstractC0853a.a(i10 > 0);
        this.f15938l = i10;
    }

    @Override // J1.f, J1.a
    public void s() {
        super.s();
        this.f15937k = 0;
    }
}
