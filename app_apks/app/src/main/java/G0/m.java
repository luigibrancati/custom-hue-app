package G0;

import F0.d;
import F0.e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public F0.e f4222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f4223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e.b f4224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f4225e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4226f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4227g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f4228h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f4229i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f4230j = b.NONE;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4231a;

        static {
            int[] iArr = new int[d.b.values().length];
            f4231a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4231a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4231a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4231a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4231a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public m(F0.e eVar) {
        this.f4222b = eVar;
    }

    @Override // G0.d
    public abstract void a(d dVar);

    public final void b(f fVar, f fVar2, int i10) {
        fVar.f4206l.add(fVar2);
        fVar.f4200f = i10;
        fVar2.f4205k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f4206l.add(fVar2);
        fVar.f4206l.add(this.f4225e);
        fVar.f4202h = i10;
        fVar.f4203i = gVar;
        fVar2.f4205k.add(fVar);
        gVar.f4205k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        if (i11 == 0) {
            F0.e eVar = this.f4222b;
            int i12 = eVar.f3512p;
            int iMax = Math.max(eVar.f3510o, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            F0.e eVar2 = this.f4222b;
            int i13 = eVar2.f3518s;
            int iMax2 = Math.max(eVar2.f3516r, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    public final f h(F0.d dVar) {
        F0.d dVar2 = dVar.f3450d;
        if (dVar2 == null) {
            return null;
        }
        F0.e eVar = dVar2.f3448b;
        int i10 = a.f4231a[dVar2.f3449c.ordinal()];
        if (i10 == 1) {
            return eVar.f3490e.f4228h;
        }
        if (i10 == 2) {
            return eVar.f3490e.f4229i;
        }
        if (i10 == 3) {
            return eVar.f3492f.f4228h;
        }
        if (i10 == 4) {
            return eVar.f3492f.f4218k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f3492f.f4229i;
    }

    public final f i(F0.d dVar, int i10) {
        F0.d dVar2 = dVar.f3450d;
        if (dVar2 == null) {
            return null;
        }
        F0.e eVar = dVar2.f3448b;
        m mVar = i10 == 0 ? eVar.f3490e : eVar.f3492f;
        int i11 = a.f4231a[dVar2.f3449c.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return mVar.f4229i;
        }
        return mVar.f4228h;
    }

    public long j() {
        if (this.f4225e.f4204j) {
            return r2.f4201g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f4227g;
    }

    public final void l(int i10, int i11) {
        int i12 = this.f4221a;
        if (i12 == 0) {
            this.f4225e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f4225e.d(Math.min(g(this.f4225e.f4207m, i10), i11));
            return;
        }
        if (i12 == 2) {
            F0.e eVarE = this.f4222b.E();
            if (eVarE != null) {
                if ((i10 == 0 ? eVarE.f3490e : eVarE.f3492f).f4225e.f4204j) {
                    F0.e eVar = this.f4222b;
                    this.f4225e.d(g((int) ((r9.f4201g * (i10 == 0 ? eVar.f3514q : eVar.f3520t)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        F0.e eVar2 = this.f4222b;
        m mVar = eVar2.f3490e;
        e.b bVar = mVar.f4224d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && mVar.f4221a == 3) {
            l lVar = eVar2.f3492f;
            if (lVar.f4224d == bVar2 && lVar.f4221a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            mVar = eVar2.f3492f;
        }
        if (mVar.f4225e.f4204j) {
            float fR = eVar2.r();
            this.f4225e.d(i10 == 1 ? (int) ((mVar.f4225e.f4201g / fR) + 0.5f) : (int) ((fR * mVar.f4225e.f4201g) + 0.5f));
        }
    }

    public abstract boolean m();

    public void n(d dVar, F0.d dVar2, F0.d dVar3, int i10) {
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f4204j && fVarH2.f4204j) {
            int iB = fVarH.f4201g + dVar2.b();
            int iB2 = fVarH2.f4201g - dVar3.b();
            int i11 = iB2 - iB;
            if (!this.f4225e.f4204j && this.f4224d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f4225e;
            if (gVar.f4204j) {
                if (gVar.f4201g == i11) {
                    this.f4228h.d(iB);
                    this.f4229i.d(iB2);
                    return;
                }
                F0.e eVar = this.f4222b;
                float fU = i10 == 0 ? eVar.u() : eVar.I();
                if (fVarH == fVarH2) {
                    iB = fVarH.f4201g;
                    iB2 = fVarH2.f4201g;
                    fU = 0.5f;
                }
                this.f4228h.d((int) (iB + 0.5f + (((iB2 - iB) - this.f4225e.f4201g) * fU)));
                this.f4229i.d(this.f4228h.f4201g + this.f4225e.f4201g);
            }
        }
    }

    public void o(d dVar) {
    }

    public void p(d dVar) {
    }
}
