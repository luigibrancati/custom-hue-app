package G0;

import F0.d;
import F0.e;
import G0.f;
import G0.m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class j extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int[] f4208k = new int[2];

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4209a;

        static {
            int[] iArr = new int[m.b.values().length];
            f4209a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4209a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4209a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(F0.e eVar) {
        super(eVar);
        this.f4228h.f4199e = f.a.LEFT;
        this.f4229i.f4199e = f.a.RIGHT;
        this.f4226f = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02ca  */
    @Override // G0.m, G0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(G0.d r14) {
        /*
            Method dump skipped, instruction units count: 1067
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.j.a(G0.d):void");
    }

    @Override // G0.m
    public void d() {
        F0.e eVarE;
        F0.e eVarE2;
        F0.e eVar = this.f4222b;
        if (eVar.f3482a) {
            this.f4225e.d(eVar.N());
        }
        if (this.f4225e.f4204j) {
            e.b bVar = this.f4224d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (((eVarE = this.f4222b.E()) != null && eVarE.w() == e.b.FIXED) || eVarE.w() == bVar2)) {
                b(this.f4228h, eVarE.f3490e.f4228h, this.f4222b.f3457B.b());
                b(this.f4229i, eVarE.f3490e.f4229i, -this.f4222b.f3459D.b());
                return;
            }
        } else {
            e.b bVarW = this.f4222b.w();
            this.f4224d = bVarW;
            if (bVarW != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (bVarW == bVar3 && (((eVarE2 = this.f4222b.E()) != null && eVarE2.w() == e.b.FIXED) || eVarE2.w() == bVar3)) {
                    int iN = (eVarE2.N() - this.f4222b.f3457B.b()) - this.f4222b.f3459D.b();
                    b(this.f4228h, eVarE2.f3490e.f4228h, this.f4222b.f3457B.b());
                    b(this.f4229i, eVarE2.f3490e.f4229i, -this.f4222b.f3459D.b());
                    this.f4225e.d(iN);
                    return;
                }
                if (this.f4224d == e.b.FIXED) {
                    this.f4225e.d(this.f4222b.N());
                }
            }
        }
        g gVar = this.f4225e;
        if (gVar.f4204j) {
            F0.e eVar2 = this.f4222b;
            if (eVar2.f3482a) {
                F0.d[] dVarArr = eVar2.f3465J;
                F0.d dVar = dVarArr[0];
                F0.d dVar2 = dVar.f3450d;
                if (dVar2 != null && dVarArr[1].f3450d != null) {
                    if (eVar2.T()) {
                        this.f4228h.f4200f = this.f4222b.f3465J[0].b();
                        this.f4229i.f4200f = -this.f4222b.f3465J[1].b();
                        return;
                    }
                    f fVarH = h(this.f4222b.f3465J[0]);
                    if (fVarH != null) {
                        b(this.f4228h, fVarH, this.f4222b.f3465J[0].b());
                    }
                    f fVarH2 = h(this.f4222b.f3465J[1]);
                    if (fVarH2 != null) {
                        b(this.f4229i, fVarH2, -this.f4222b.f3465J[1].b());
                    }
                    this.f4228h.f4196b = true;
                    this.f4229i.f4196b = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f4228h, fVarH3, this.f4222b.f3465J[0].b());
                        b(this.f4229i, this.f4228h, this.f4225e.f4201g);
                        return;
                    }
                    return;
                }
                F0.d dVar3 = dVarArr[1];
                if (dVar3.f3450d != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f4229i, fVarH4, -this.f4222b.f3465J[1].b());
                        b(this.f4228h, this.f4229i, -this.f4225e.f4201g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof F0.h) || eVar2.E() == null || this.f4222b.k(d.b.CENTER).f3450d != null) {
                    return;
                }
                b(this.f4228h, this.f4222b.E().f3490e.f4228h, this.f4222b.O());
                b(this.f4229i, this.f4228h, this.f4225e.f4201g);
                return;
            }
        }
        if (this.f4224d == e.b.MATCH_CONSTRAINT) {
            F0.e eVar3 = this.f4222b;
            int i10 = eVar3.f3504l;
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
            } else if (i10 == 3) {
                if (eVar3.f3506m == 3) {
                    this.f4228h.f4195a = this;
                    this.f4229i.f4195a = this;
                    l lVar = eVar3.f3492f;
                    lVar.f4228h.f4195a = this;
                    lVar.f4229i.f4195a = this;
                    gVar.f4195a = this;
                    if (eVar3.V()) {
                        this.f4225e.f4206l.add(this.f4222b.f3492f.f4225e);
                        this.f4222b.f3492f.f4225e.f4205k.add(this.f4225e);
                        l lVar2 = this.f4222b.f3492f;
                        lVar2.f4225e.f4195a = this;
                        this.f4225e.f4206l.add(lVar2.f4228h);
                        this.f4225e.f4206l.add(this.f4222b.f3492f.f4229i);
                        this.f4222b.f3492f.f4228h.f4205k.add(this.f4225e);
                        this.f4222b.f3492f.f4229i.f4205k.add(this.f4225e);
                    } else if (this.f4222b.T()) {
                        this.f4222b.f3492f.f4225e.f4206l.add(this.f4225e);
                        this.f4225e.f4205k.add(this.f4222b.f3492f.f4225e);
                    } else {
                        this.f4222b.f3492f.f4225e.f4206l.add(this.f4225e);
                    }
                } else {
                    g gVar4 = eVar3.f3492f.f4225e;
                    gVar.f4206l.add(gVar4);
                    gVar4.f4205k.add(this.f4225e);
                    this.f4222b.f3492f.f4228h.f4205k.add(this.f4225e);
                    this.f4222b.f3492f.f4229i.f4205k.add(this.f4225e);
                    g gVar5 = this.f4225e;
                    gVar5.f4196b = true;
                    gVar5.f4205k.add(this.f4228h);
                    this.f4225e.f4205k.add(this.f4229i);
                    this.f4228h.f4206l.add(this.f4225e);
                    this.f4229i.f4206l.add(this.f4225e);
                }
            }
        }
        F0.e eVar4 = this.f4222b;
        F0.d[] dVarArr2 = eVar4.f3465J;
        F0.d dVar4 = dVarArr2[0];
        F0.d dVar5 = dVar4.f3450d;
        if (dVar5 != null && dVarArr2[1].f3450d != null) {
            if (eVar4.T()) {
                this.f4228h.f4200f = this.f4222b.f3465J[0].b();
                this.f4229i.f4200f = -this.f4222b.f3465J[1].b();
                return;
            }
            f fVarH5 = h(this.f4222b.f3465J[0]);
            f fVarH6 = h(this.f4222b.f3465J[1]);
            fVarH5.b(this);
            fVarH6.b(this);
            this.f4230j = m.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f fVarH7 = h(dVar4);
            if (fVarH7 != null) {
                b(this.f4228h, fVarH7, this.f4222b.f3465J[0].b());
                c(this.f4229i, this.f4228h, 1, this.f4225e);
                return;
            }
            return;
        }
        F0.d dVar6 = dVarArr2[1];
        if (dVar6.f3450d != null) {
            f fVarH8 = h(dVar6);
            if (fVarH8 != null) {
                b(this.f4229i, fVarH8, -this.f4222b.f3465J[1].b());
                c(this.f4228h, this.f4229i, -1, this.f4225e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof F0.h) || eVar4.E() == null) {
            return;
        }
        b(this.f4228h, this.f4222b.E().f3490e.f4228h, this.f4222b.O());
        c(this.f4229i, this.f4228h, 1, this.f4225e);
    }

    @Override // G0.m
    public void e() {
        f fVar = this.f4228h;
        if (fVar.f4204j) {
            this.f4222b.C0(fVar.f4201g);
        }
    }

    @Override // G0.m
    public void f() {
        this.f4223c = null;
        this.f4228h.c();
        this.f4229i.c();
        this.f4225e.c();
        this.f4227g = false;
    }

    @Override // G0.m
    public boolean m() {
        return this.f4224d != e.b.MATCH_CONSTRAINT || this.f4222b.f3504l == 0;
    }

    public final void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    public void r() {
        this.f4227g = false;
        this.f4228h.c();
        this.f4228h.f4204j = false;
        this.f4229i.c();
        this.f4229i.f4204j = false;
        this.f4225e.f4204j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f4222b.p();
    }
}
