package b0;

import gc.C4202o;
import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class z extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24962e;

    public z() {
        this(0, 1, null);
    }

    public final void e() {
        this.f24962e = AbstractC2776G.a(b()) - this.f24937d;
    }

    public final void f(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = AbstractC2776G.f24843a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            C4202o.z(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f24934a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        e();
    }

    public final void g(int i10) {
        int iMax = i10 > 0 ? Math.max(7, AbstractC2776G.d(i10)) : 0;
        this.f24936c = iMax;
        f(iMax);
        this.f24935b = new long[iMax];
    }

    public z(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            c0.d.a("Capacity must be a positive value.");
        }
        g(AbstractC2776G.e(i10));
    }

    public /* synthetic */ z(int i10, int i11, AbstractC4854k abstractC4854k) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
