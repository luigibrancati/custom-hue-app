package E0;

import E0.d;
import E0.i;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class b implements d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f3072e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f3068a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3069b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3070c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f3071d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3073f = false;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(i iVar, float f10, boolean z10);

        void b(i iVar, float f10);

        i c(int i10);

        void clear();

        float d(i iVar);

        float e(i iVar, boolean z10);

        void f();

        boolean g(i iVar);

        int h();

        float i(b bVar, boolean z10);

        float j(int i10);

        void k(float f10);
    }

    public b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A() {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.b.A():java.lang.String");
    }

    public void B(d dVar, i iVar, boolean z10) {
        if (iVar.f3149g) {
            this.f3069b += iVar.f3148f * this.f3072e.d(iVar);
            this.f3072e.e(iVar, z10);
            if (z10) {
                iVar.c(this);
            }
        }
    }

    public void C(b bVar, boolean z10) {
        this.f3069b += bVar.f3069b * this.f3072e.i(bVar, z10);
        if (z10) {
            bVar.f3068a.c(this);
        }
    }

    public void D(d dVar) {
        if (dVar.f3088f.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iH = this.f3072e.h();
            for (int i10 = 0; i10 < iH; i10++) {
                i iVarC = this.f3072e.c(i10);
                if (iVarC.f3146d != -1 || iVarC.f3149g) {
                    this.f3071d.add(iVarC);
                }
            }
            if (this.f3071d.size() > 0) {
                for (i iVar : this.f3071d) {
                    if (iVar.f3149g) {
                        B(dVar, iVar, true);
                    } else {
                        C(dVar.f3088f[iVar.f3146d], true);
                    }
                }
                this.f3071d.clear();
            } else {
                z10 = true;
            }
        }
    }

    @Override // E0.d.a
    public void a(i iVar) {
        int i10 = iVar.f3147e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f3072e.b(iVar, f10);
    }

    @Override // E0.d.a
    public i b(d dVar, boolean[] zArr) {
        return x(zArr, null);
    }

    @Override // E0.d.a
    public void c(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f3068a = null;
            this.f3072e.clear();
            for (int i10 = 0; i10 < bVar.f3072e.h(); i10++) {
                this.f3072e.a(bVar.f3072e.c(i10), bVar.f3072e.j(i10), true);
            }
        }
    }

    @Override // E0.d.a
    public void clear() {
        this.f3072e.clear();
        this.f3068a = null;
        this.f3069b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f3072e.b(dVar.o(i10, "ep"), 1.0f);
        this.f3072e.b(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    public b e(i iVar, int i10) {
        this.f3072e.b(iVar, i10);
        return this;
    }

    public boolean f(d dVar) {
        boolean z10;
        i iVarG = g(dVar);
        if (iVarG == null) {
            z10 = true;
        } else {
            y(iVarG);
            z10 = false;
        }
        if (this.f3072e.h() == 0) {
            this.f3073f = true;
        }
        return z10;
    }

    public i g(d dVar) {
        int iH = this.f3072e.h();
        i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < iH; i10++) {
            float fJ = this.f3072e.j(i10);
            i iVarC = this.f3072e.c(i10);
            if (iVarC.f3152j == i.a.UNRESTRICTED) {
                if (iVar == null || f10 > fJ) {
                    boolean zV = v(iVarC, dVar);
                    z10 = zV;
                    f10 = fJ;
                    iVar = iVarC;
                } else if (!z10 && v(iVarC, dVar)) {
                    f10 = fJ;
                    iVar = iVarC;
                    z10 = true;
                }
            } else if (iVar == null && fJ < 0.0f) {
                if (iVar2 == null || f11 > fJ) {
                    boolean zV2 = v(iVarC, dVar);
                    z11 = zV2;
                    f11 = fJ;
                    iVar2 = iVarC;
                } else if (!z11 && v(iVarC, dVar)) {
                    f11 = fJ;
                    iVar2 = iVarC;
                    z11 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // E0.d.a
    public i getKey() {
        return this.f3068a;
    }

    public b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f3072e.b(iVar, 1.0f);
            this.f3072e.b(iVar4, 1.0f);
            this.f3072e.b(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f3072e.b(iVar, 1.0f);
            this.f3072e.b(iVar2, -1.0f);
            this.f3072e.b(iVar3, -1.0f);
            this.f3072e.b(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f3069b = (-i10) + i11;
                return this;
            }
        } else {
            if (f10 <= 0.0f) {
                this.f3072e.b(iVar, -1.0f);
                this.f3072e.b(iVar2, 1.0f);
                this.f3069b = i10;
                return this;
            }
            if (f10 >= 1.0f) {
                this.f3072e.b(iVar4, -1.0f);
                this.f3072e.b(iVar3, 1.0f);
                this.f3069b = -i11;
                return this;
            }
            float f11 = 1.0f - f10;
            this.f3072e.b(iVar, f11 * 1.0f);
            this.f3072e.b(iVar2, f11 * (-1.0f));
            this.f3072e.b(iVar3, (-1.0f) * f10);
            this.f3072e.b(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f3069b = ((-i10) * f11) + (i11 * f10);
                return this;
            }
        }
        return this;
    }

    public b i(i iVar, int i10) {
        this.f3068a = iVar;
        float f10 = i10;
        iVar.f3148f = f10;
        this.f3069b = f10;
        this.f3073f = true;
        return this;
    }

    public b j(i iVar, i iVar2, float f10) {
        this.f3072e.b(iVar, -1.0f);
        this.f3072e.b(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f3072e.b(iVar, -1.0f);
        this.f3072e.b(iVar2, 1.0f);
        this.f3072e.b(iVar3, f10);
        this.f3072e.b(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f3069b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f3072e.b(iVar, 1.0f);
            this.f3072e.b(iVar2, -1.0f);
            this.f3072e.b(iVar4, 1.0f);
            this.f3072e.b(iVar3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f3072e.b(iVar, 1.0f);
            this.f3072e.b(iVar2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.f3072e.b(iVar3, 1.0f);
            this.f3072e.b(iVar4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f3072e.b(iVar, 1.0f);
        this.f3072e.b(iVar2, -1.0f);
        this.f3072e.b(iVar4, f13);
        this.f3072e.b(iVar3, -f13);
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.f3069b = i10 * (-1);
            this.f3072e.b(iVar, 1.0f);
            return this;
        }
        this.f3069b = i10;
        this.f3072e.b(iVar, -1.0f);
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f3069b = i10;
        }
        if (z10) {
            this.f3072e.b(iVar, 1.0f);
            this.f3072e.b(iVar2, -1.0f);
            return this;
        }
        this.f3072e.b(iVar, -1.0f);
        this.f3072e.b(iVar2, 1.0f);
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f3069b = i10;
        }
        if (z10) {
            this.f3072e.b(iVar, 1.0f);
            this.f3072e.b(iVar2, -1.0f);
            this.f3072e.b(iVar3, -1.0f);
            return this;
        }
        this.f3072e.b(iVar, -1.0f);
        this.f3072e.b(iVar2, 1.0f);
        this.f3072e.b(iVar3, 1.0f);
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f3069b = i10;
        }
        if (z10) {
            this.f3072e.b(iVar, 1.0f);
            this.f3072e.b(iVar2, -1.0f);
            this.f3072e.b(iVar3, 1.0f);
            return this;
        }
        this.f3072e.b(iVar, -1.0f);
        this.f3072e.b(iVar2, 1.0f);
        this.f3072e.b(iVar3, -1.0f);
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f3072e.b(iVar3, 0.5f);
        this.f3072e.b(iVar4, 0.5f);
        this.f3072e.b(iVar, -0.5f);
        this.f3072e.b(iVar2, -0.5f);
        this.f3069b = -f10;
        return this;
    }

    public void r() {
        float f10 = this.f3069b;
        if (f10 < 0.0f) {
            this.f3069b = f10 * (-1.0f);
            this.f3072e.f();
        }
    }

    public boolean s() {
        i iVar = this.f3068a;
        if (iVar != null) {
            return iVar.f3152j == i.a.UNRESTRICTED || this.f3069b >= 0.0f;
        }
        return false;
    }

    public boolean t(i iVar) {
        return this.f3072e.g(iVar);
    }

    public String toString() {
        return A();
    }

    public boolean u() {
        return this.f3068a == null && this.f3069b == 0.0f && this.f3072e.h() == 0;
    }

    public final boolean v(i iVar, d dVar) {
        return iVar.f3155m <= 1;
    }

    public i w(i iVar) {
        return x(null, iVar);
    }

    public final i x(boolean[] zArr, i iVar) {
        i.a aVar;
        int iH = this.f3072e.h();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iH; i10++) {
            float fJ = this.f3072e.j(i10);
            if (fJ < 0.0f) {
                i iVarC = this.f3072e.c(i10);
                if ((zArr == null || !zArr[iVarC.f3145c]) && iVarC != iVar && (((aVar = iVarC.f3152j) == i.a.SLACK || aVar == i.a.ERROR) && fJ < f10)) {
                    f10 = fJ;
                    iVar2 = iVarC;
                }
            }
        }
        return iVar2;
    }

    public void y(i iVar) {
        i iVar2 = this.f3068a;
        if (iVar2 != null) {
            this.f3072e.b(iVar2, -1.0f);
            this.f3068a = null;
        }
        float fE = this.f3072e.e(iVar, true) * (-1.0f);
        this.f3068a = iVar;
        if (fE == 1.0f) {
            return;
        }
        this.f3069b /= fE;
        this.f3072e.k(fE);
    }

    public void z() {
        this.f3068a = null;
        this.f3072e.clear();
        this.f3069b = 0.0f;
        this.f3073f = false;
    }

    public b(c cVar) {
        this.f3072e = new E0.a(this, cVar);
    }
}
