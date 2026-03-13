package K1;

import D1.D;
import G1.AbstractC0853a;
import android.util.Pair;

/* JADX INFO: renamed from: K1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0984a extends D1.D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2.e0 f6985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6986g;

    public AbstractC0984a(boolean z10, a2.e0 e0Var) {
        this.f6986g = z10;
        this.f6985f = e0Var;
        this.f6984e = e0Var.getLength();
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public abstract int A(int i10);

    public final int B(int i10, boolean z10) {
        if (z10) {
            return this.f6985f.c(i10);
        }
        if (i10 < this.f6984e - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public final int C(int i10, boolean z10) {
        if (z10) {
            return this.f6985f.b(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public abstract D1.D D(int i10);

    @Override // D1.D
    public int a(boolean z10) {
        if (this.f6984e == 0) {
            return -1;
        }
        if (this.f6986g) {
            z10 = false;
        }
        int iF = z10 ? this.f6985f.f() : 0;
        while (D(iF).q()) {
            iF = B(iF, z10);
            if (iF == -1) {
                return -1;
            }
        }
        return A(iF) + D(iF).a(z10);
    }

    @Override // D1.D
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        if (iS == -1 || (iB = D(iS).b(objV)) == -1) {
            return -1;
        }
        return z(iS) + iB;
    }

    @Override // D1.D
    public int c(boolean z10) {
        int i10 = this.f6984e;
        if (i10 == 0) {
            return -1;
        }
        if (this.f6986g) {
            z10 = false;
        }
        int iD = z10 ? this.f6985f.d() : i10 - 1;
        while (D(iD).q()) {
            iD = C(iD, z10);
            if (iD == -1) {
                return -1;
            }
        }
        return A(iD) + D(iD).c(z10);
    }

    @Override // D1.D
    public int e(int i10, int i11, boolean z10) {
        if (this.f6986g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iU = u(i10);
        int iA = A(iU);
        int iE = D(iU).e(i10 - iA, i11 != 2 ? i11 : 0, z10);
        if (iE != -1) {
            return iA + iE;
        }
        int iB = B(iU, z10);
        while (iB != -1 && D(iB).q()) {
            iB = B(iB, z10);
        }
        if (iB != -1) {
            return A(iB) + D(iB).a(z10);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // D1.D
    public final D.b g(int i10, D.b bVar, boolean z10) {
        int iT = t(i10);
        int iA = A(iT);
        D(iT).g(i10 - z(iT), bVar, z10);
        bVar.f1452c += iA;
        if (z10) {
            bVar.f1451b = y(x(iT), AbstractC0853a.e(bVar.f1451b));
        }
        return bVar;
    }

    @Override // D1.D
    public final D.b h(Object obj, D.b bVar) {
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        int iA = A(iS);
        D(iS).h(objV, bVar);
        bVar.f1452c += iA;
        bVar.f1451b = obj;
        return bVar;
    }

    @Override // D1.D
    public int l(int i10, int i11, boolean z10) {
        if (this.f6986g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iU = u(i10);
        int iA = A(iU);
        int iL = D(iU).l(i10 - iA, i11 != 2 ? i11 : 0, z10);
        if (iL != -1) {
            return iA + iL;
        }
        int iC = C(iU, z10);
        while (iC != -1 && D(iC).q()) {
            iC = C(iC, z10);
        }
        if (iC != -1) {
            return A(iC) + D(iC).c(z10);
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    @Override // D1.D
    public final Object m(int i10) {
        int iT = t(i10);
        return y(x(iT), D(iT).m(i10 - z(iT)));
    }

    @Override // D1.D
    public final D.c o(int i10, D.c cVar, long j10) {
        int iU = u(i10);
        int iA = A(iU);
        int iZ = z(iU);
        D(iU).o(i10 - iA, cVar, j10);
        Object objX = x(iU);
        if (!D.c.f1463q.equals(cVar.f1473a)) {
            objX = y(objX, cVar.f1473a);
        }
        cVar.f1473a = objX;
        cVar.f1486n += iZ;
        cVar.f1487o += iZ;
        return cVar;
    }

    public abstract int s(Object obj);

    public abstract int t(int i10);

    public abstract int u(int i10);

    public abstract Object x(int i10);

    public abstract int z(int i10);
}
