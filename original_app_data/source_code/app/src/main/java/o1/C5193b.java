package o1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: o1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5193b extends C5194c {
    public static C5193b h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new C5193b());
    }

    public static C5193b i(ByteBuffer byteBuffer, C5193b c5193b) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c5193b.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public C5193b f(int i10, ByteBuffer byteBuffer) {
        g(i10, byteBuffer);
        return this;
    }

    public void g(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }

    public C5192a j(C5192a c5192a, int i10) {
        int iB = b(6);
        if (iB != 0) {
            return c5192a.f(a(d(iB) + (i10 * 4)), this.f41113b);
        }
        return null;
    }

    public int k() {
        int iB = b(6);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.f41113b.getInt(iB + this.f41112a);
        }
        return 0;
    }
}
