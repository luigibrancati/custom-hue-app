package D1;

import G1.AbstractC0853a;
import G1.M;
import K7.AbstractC1081v;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G f1604b = new G(AbstractC1081v.z());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f1605c = M.z0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1081v f1606a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f1607f = M.z0(0);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f1608g = M.z0(1);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f1609h = M.z0(3);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f1610i = M.z0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final E f1612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f1613c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f1614d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean[] f1615e;

        public a(E e10, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = e10.f1491a;
            this.f1611a = i10;
            boolean z11 = false;
            AbstractC0853a.a(i10 == iArr.length && i10 == zArr.length);
            this.f1612b = e10;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f1613c = z11;
            this.f1614d = (int[]) iArr.clone();
            this.f1615e = (boolean[]) zArr.clone();
        }

        public o a(int i10) {
            return this.f1612b.a(i10);
        }

        public int b() {
            return this.f1612b.f1493c;
        }

        public boolean c() {
            return N7.a.a(this.f1615e, true);
        }

        public boolean d(int i10) {
            return this.f1615e[i10];
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f1613c == aVar.f1613c && this.f1612b.equals(aVar.f1612b) && Arrays.equals(this.f1614d, aVar.f1614d) && Arrays.equals(this.f1615e, aVar.f1615e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f1612b.hashCode() * 31) + (this.f1613c ? 1 : 0)) * 31) + Arrays.hashCode(this.f1614d)) * 31) + Arrays.hashCode(this.f1615e);
        }
    }

    public G(List list) {
        this.f1606a = AbstractC1081v.v(list);
    }

    public AbstractC1081v a() {
        return this.f1606a;
    }

    public boolean b(int i10) {
        for (int i11 = 0; i11 < this.f1606a.size(); i11++) {
            a aVar = (a) this.f1606a.get(i11);
            if (aVar.c() && aVar.b() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || G.class != obj.getClass()) {
            return false;
        }
        return this.f1606a.equals(((G) obj).f1606a);
    }

    public int hashCode() {
        return this.f1606a.hashCode();
    }
}
