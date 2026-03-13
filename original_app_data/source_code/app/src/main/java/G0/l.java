package G0;

import F0.d;
import F0.e;
import G0.f;
import G0.m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class l extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f4218k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f4219l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4220a;

        static {
            int[] iArr = new int[m.b.values().length];
            f4220a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4220a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4220a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(F0.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f4218k = fVar;
        this.f4219l = null;
        this.f4228h.f4199e = f.a.TOP;
        this.f4229i.f4199e = f.a.BOTTOM;
        fVar.f4199e = f.a.BASELINE;
        this.f4226f = 1;
    }

    @Override // G0.m, G0.d
    public void a(d dVar) {
        float f10;
        float fR;
        float fR2;
        int i10;
        int i11 = a.f4220a[this.f4230j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            F0.e eVar = this.f4222b;
            n(dVar, eVar.f3458C, eVar.f3460E, 1);
            return;
        }
        g gVar = this.f4225e;
        if (gVar.f4197c && !gVar.f4204j && this.f4224d == e.b.MATCH_CONSTRAINT) {
            F0.e eVar2 = this.f4222b;
            int i12 = eVar2.f3506m;
            if (i12 == 2) {
                F0.e eVarE = eVar2.E();
                if (eVarE != null) {
                    if (eVarE.f3492f.f4225e.f4204j) {
                        this.f4225e.d((int) ((r7.f4201g * this.f4222b.f3520t) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f3490e.f4225e.f4204j) {
                int iS = eVar2.s();
                if (iS == -1) {
                    F0.e eVar3 = this.f4222b;
                    f10 = eVar3.f3490e.f4225e.f4201g;
                    fR = eVar3.r();
                } else if (iS == 0) {
                    fR2 = r7.f3490e.f4225e.f4201g * this.f4222b.r();
                    i10 = (int) (fR2 + 0.5f);
                    this.f4225e.d(i10);
                } else if (iS != 1) {
                    i10 = 0;
                    this.f4225e.d(i10);
                } else {
                    F0.e eVar4 = this.f4222b;
                    f10 = eVar4.f3490e.f4225e.f4201g;
                    fR = eVar4.r();
                }
                fR2 = f10 / fR;
                i10 = (int) (fR2 + 0.5f);
                this.f4225e.d(i10);
            }
        }
        f fVar = this.f4228h;
        if (fVar.f4197c) {
            f fVar2 = this.f4229i;
            if (fVar2.f4197c) {
                if (fVar.f4204j && fVar2.f4204j && this.f4225e.f4204j) {
                    return;
                }
                if (!this.f4225e.f4204j && this.f4224d == e.b.MATCH_CONSTRAINT) {
                    F0.e eVar5 = this.f4222b;
                    if (eVar5.f3504l == 0 && !eVar5.V()) {
                        f fVar3 = (f) this.f4228h.f4206l.get(0);
                        f fVar4 = (f) this.f4229i.f4206l.get(0);
                        int i13 = fVar3.f4201g;
                        f fVar5 = this.f4228h;
                        int i14 = i13 + fVar5.f4200f;
                        int i15 = fVar4.f4201g + this.f4229i.f4200f;
                        fVar5.d(i14);
                        this.f4229i.d(i15);
                        this.f4225e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f4225e.f4204j && this.f4224d == e.b.MATCH_CONSTRAINT && this.f4221a == 1 && this.f4228h.f4206l.size() > 0 && this.f4229i.f4206l.size() > 0) {
                    f fVar6 = (f) this.f4228h.f4206l.get(0);
                    int i16 = (((f) this.f4229i.f4206l.get(0)).f4201g + this.f4229i.f4200f) - (fVar6.f4201g + this.f4228h.f4200f);
                    g gVar2 = this.f4225e;
                    int i17 = gVar2.f4207m;
                    if (i16 < i17) {
                        gVar2.d(i16);
                    } else {
                        gVar2.d(i17);
                    }
                }
                if (this.f4225e.f4204j && this.f4228h.f4206l.size() > 0 && this.f4229i.f4206l.size() > 0) {
                    f fVar7 = (f) this.f4228h.f4206l.get(0);
                    f fVar8 = (f) this.f4229i.f4206l.get(0);
                    int i18 = fVar7.f4201g + this.f4228h.f4200f;
                    int i19 = fVar8.f4201g + this.f4229i.f4200f;
                    float fI = this.f4222b.I();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f4201g;
                        i19 = fVar8.f4201g;
                        fI = 0.5f;
                    }
                    this.f4228h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f4225e.f4201g) * fI)));
                    this.f4229i.d(this.f4228h.f4201g + this.f4225e.f4201g);
                }
            }
        }
    }

    @Override // G0.m
    public void d() {
        F0.e eVarE;
        F0.e eVarE2;
        F0.e eVar = this.f4222b;
        if (eVar.f3482a) {
            this.f4225e.d(eVar.t());
        }
        if (!this.f4225e.f4204j) {
            this.f4224d = this.f4222b.K();
            if (this.f4222b.Q()) {
                this.f4219l = new G0.a(this);
            }
            e.b bVar = this.f4224d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (eVarE2 = this.f4222b.E()) != null && eVarE2.K() == e.b.FIXED) {
                    int iT = (eVarE2.t() - this.f4222b.f3458C.b()) - this.f4222b.f3460E.b();
                    b(this.f4228h, eVarE2.f3492f.f4228h, this.f4222b.f3458C.b());
                    b(this.f4229i, eVarE2.f3492f.f4229i, -this.f4222b.f3460E.b());
                    this.f4225e.d(iT);
                    return;
                }
                if (this.f4224d == e.b.FIXED) {
                    this.f4225e.d(this.f4222b.t());
                }
            }
        } else if (this.f4224d == e.b.MATCH_PARENT && (eVarE = this.f4222b.E()) != null && eVarE.K() == e.b.FIXED) {
            b(this.f4228h, eVarE.f3492f.f4228h, this.f4222b.f3458C.b());
            b(this.f4229i, eVarE.f3492f.f4229i, -this.f4222b.f3460E.b());
            return;
        }
        g gVar = this.f4225e;
        boolean z10 = gVar.f4204j;
        if (z10) {
            F0.e eVar2 = this.f4222b;
            if (eVar2.f3482a) {
                F0.d[] dVarArr = eVar2.f3465J;
                F0.d dVar = dVarArr[2];
                F0.d dVar2 = dVar.f3450d;
                if (dVar2 != null && dVarArr[3].f3450d != null) {
                    if (eVar2.V()) {
                        this.f4228h.f4200f = this.f4222b.f3465J[2].b();
                        this.f4229i.f4200f = -this.f4222b.f3465J[3].b();
                    } else {
                        f fVarH = h(this.f4222b.f3465J[2]);
                        if (fVarH != null) {
                            b(this.f4228h, fVarH, this.f4222b.f3465J[2].b());
                        }
                        f fVarH2 = h(this.f4222b.f3465J[3]);
                        if (fVarH2 != null) {
                            b(this.f4229i, fVarH2, -this.f4222b.f3465J[3].b());
                        }
                        this.f4228h.f4196b = true;
                        this.f4229i.f4196b = true;
                    }
                    if (this.f4222b.Q()) {
                        b(this.f4218k, this.f4228h, this.f4222b.l());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f4228h, fVarH3, this.f4222b.f3465J[2].b());
                        b(this.f4229i, this.f4228h, this.f4225e.f4201g);
                        if (this.f4222b.Q()) {
                            b(this.f4218k, this.f4228h, this.f4222b.l());
                            return;
                        }
                        return;
                    }
                    return;
                }
                F0.d dVar3 = dVarArr[3];
                if (dVar3.f3450d != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f4229i, fVarH4, -this.f4222b.f3465J[3].b());
                        b(this.f4228h, this.f4229i, -this.f4225e.f4201g);
                    }
                    if (this.f4222b.Q()) {
                        b(this.f4218k, this.f4228h, this.f4222b.l());
                        return;
                    }
                    return;
                }
                F0.d dVar4 = dVarArr[4];
                if (dVar4.f3450d != null) {
                    f fVarH5 = h(dVar4);
                    if (fVarH5 != null) {
                        b(this.f4218k, fVarH5, 0);
                        b(this.f4228h, this.f4218k, -this.f4222b.l());
                        b(this.f4229i, this.f4228h, this.f4225e.f4201g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof F0.h) || eVar2.E() == null || this.f4222b.k(d.b.CENTER).f3450d != null) {
                    return;
                }
                b(this.f4228h, this.f4222b.E().f3492f.f4228h, this.f4222b.P());
                b(this.f4229i, this.f4228h, this.f4225e.f4201g);
                if (this.f4222b.Q()) {
                    b(this.f4218k, this.f4228h, this.f4222b.l());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f4224d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            F0.e eVar3 = this.f4222b;
            int i10 = eVar3.f3506m;
            if (i10 == 2) {
                F0.e eVarE3 = eVar3.E();
                if (eVarE3 != null) {
                    g gVar2 = eVarE3.f3492f.f4225e;
                    this.f4225e.f4206l.add(gVar2);
                    gVar2.f4205k.add(this.f4225e);
                    g gVar3 = this.f4225e;
                    gVar3.f4196b = true;
                    gVar3.f4205k.add(this.f4228h);
                    this.f4225e.f4205k.add(this.f4229i);
                }
            } else if (i10 == 3 && !eVar3.V()) {
                F0.e eVar4 = this.f4222b;
                if (eVar4.f3504l != 3) {
                    g gVar4 = eVar4.f3490e.f4225e;
                    this.f4225e.f4206l.add(gVar4);
                    gVar4.f4205k.add(this.f4225e);
                    g gVar5 = this.f4225e;
                    gVar5.f4196b = true;
                    gVar5.f4205k.add(this.f4228h);
                    this.f4225e.f4205k.add(this.f4229i);
                }
            }
        }
        F0.e eVar5 = this.f4222b;
        F0.d[] dVarArr2 = eVar5.f3465J;
        F0.d dVar5 = dVarArr2[2];
        F0.d dVar6 = dVar5.f3450d;
        if (dVar6 != null && dVarArr2[3].f3450d != null) {
            if (eVar5.V()) {
                this.f4228h.f4200f = this.f4222b.f3465J[2].b();
                this.f4229i.f4200f = -this.f4222b.f3465J[3].b();
            } else {
                f fVarH6 = h(this.f4222b.f3465J[2]);
                f fVarH7 = h(this.f4222b.f3465J[3]);
                fVarH6.b(this);
                fVarH7.b(this);
                this.f4230j = m.b.CENTER;
            }
            if (this.f4222b.Q()) {
                c(this.f4218k, this.f4228h, 1, this.f4219l);
            }
        } else if (dVar6 != null) {
            f fVarH8 = h(dVar5);
            if (fVarH8 != null) {
                b(this.f4228h, fVarH8, this.f4222b.f3465J[2].b());
                c(this.f4229i, this.f4228h, 1, this.f4225e);
                if (this.f4222b.Q()) {
                    c(this.f4218k, this.f4228h, 1, this.f4219l);
                }
                e.b bVar2 = this.f4224d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f4222b.r() > 0.0f) {
                    j jVar = this.f4222b.f3490e;
                    if (jVar.f4224d == bVar3) {
                        jVar.f4225e.f4205k.add(this.f4225e);
                        this.f4225e.f4206l.add(this.f4222b.f3490e.f4225e);
                        this.f4225e.f4195a = this;
                    }
                }
            }
        } else {
            F0.d dVar7 = dVarArr2[3];
            if (dVar7.f3450d != null) {
                f fVarH9 = h(dVar7);
                if (fVarH9 != null) {
                    b(this.f4229i, fVarH9, -this.f4222b.f3465J[3].b());
                    c(this.f4228h, this.f4229i, -1, this.f4225e);
                    if (this.f4222b.Q()) {
                        c(this.f4218k, this.f4228h, 1, this.f4219l);
                    }
                }
            } else {
                F0.d dVar8 = dVarArr2[4];
                if (dVar8.f3450d != null) {
                    f fVarH10 = h(dVar8);
                    if (fVarH10 != null) {
                        b(this.f4218k, fVarH10, 0);
                        c(this.f4228h, this.f4218k, -1, this.f4219l);
                        c(this.f4229i, this.f4228h, 1, this.f4225e);
                    }
                } else if (!(eVar5 instanceof F0.h) && eVar5.E() != null) {
                    b(this.f4228h, this.f4222b.E().f3492f.f4228h, this.f4222b.P());
                    c(this.f4229i, this.f4228h, 1, this.f4225e);
                    if (this.f4222b.Q()) {
                        c(this.f4218k, this.f4228h, 1, this.f4219l);
                    }
                    e.b bVar4 = this.f4224d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f4222b.r() > 0.0f) {
                        j jVar2 = this.f4222b.f3490e;
                        if (jVar2.f4224d == bVar5) {
                            jVar2.f4225e.f4205k.add(this.f4225e);
                            this.f4225e.f4206l.add(this.f4222b.f3490e.f4225e);
                            this.f4225e.f4195a = this;
                        }
                    }
                }
            }
        }
        if (this.f4225e.f4206l.size() == 0) {
            this.f4225e.f4197c = true;
        }
    }

    @Override // G0.m
    public void e() {
        f fVar = this.f4228h;
        if (fVar.f4204j) {
            this.f4222b.D0(fVar.f4201g);
        }
    }

    @Override // G0.m
    public void f() {
        this.f4223c = null;
        this.f4228h.c();
        this.f4229i.c();
        this.f4218k.c();
        this.f4225e.c();
        this.f4227g = false;
    }

    @Override // G0.m
    public boolean m() {
        return this.f4224d != e.b.MATCH_CONSTRAINT || this.f4222b.f3506m == 0;
    }

    public void q() {
        this.f4227g = false;
        this.f4228h.c();
        this.f4228h.f4204j = false;
        this.f4229i.c();
        this.f4229i.f4204j = false;
        this.f4218k.c();
        this.f4218k.f4204j = false;
        this.f4225e.f4204j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f4222b.p();
    }
}
