package xe;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48303c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f48305b = new int[10];

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public final int a(int i10) {
        return this.f48305b[i10];
    }

    public final int b() {
        if ((this.f48304a & 2) != 0) {
            return this.f48305b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f48304a & 128) != 0) {
            return this.f48305b[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.f48304a & 16) != 0) {
            return this.f48305b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int e(int i10) {
        return (this.f48304a & 32) != 0 ? this.f48305b[5] : i10;
    }

    public final boolean f(int i10) {
        return (this.f48304a & (1 << i10)) != 0;
    }

    public final void g(n other) {
        AbstractC4862t.e(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (other.f(i10)) {
                h(i10, other.a(i10));
            }
        }
    }

    public final n h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f48305b;
            if (i10 < iArr.length) {
                this.f48304a = (1 << i10) | this.f48304a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f48304a);
    }
}
