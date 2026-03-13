package G0;

import F0.d;
import F0.e;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4171a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f4172b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F0.f f4173c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e.b f4174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e.b f4175b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4176c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4177d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4178e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4179f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f4180g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f4181h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f4182i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f4183j;
    }

    /* JADX INFO: renamed from: G0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0066b {
        void a();

        void b(F0.e eVar, a aVar);
    }

    public b(F0.f fVar) {
        this.f4173c = fVar;
    }

    public final boolean a(InterfaceC0066b interfaceC0066b, F0.e eVar, boolean z10) {
        this.f4172b.f4174a = eVar.w();
        this.f4172b.f4175b = eVar.K();
        this.f4172b.f4176c = eVar.N();
        this.f4172b.f4177d = eVar.t();
        a aVar = this.f4172b;
        aVar.f4182i = false;
        aVar.f4183j = z10;
        e.b bVar = aVar.f4174a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z11 = bVar == bVar2;
        boolean z12 = aVar.f4175b == bVar2;
        boolean z13 = z11 && eVar.f3472Q > 0.0f;
        boolean z14 = z12 && eVar.f3472Q > 0.0f;
        if (z13 && eVar.f3508n[0] == 4) {
            aVar.f4174a = e.b.FIXED;
        }
        if (z14 && eVar.f3508n[1] == 4) {
            aVar.f4175b = e.b.FIXED;
        }
        interfaceC0066b.b(eVar, aVar);
        eVar.B0(this.f4172b.f4178e);
        eVar.e0(this.f4172b.f4179f);
        eVar.d0(this.f4172b.f4181h);
        eVar.Y(this.f4172b.f4180g);
        a aVar2 = this.f4172b;
        aVar2.f4183j = false;
        return aVar2.f4182i;
    }

    public final void b(F0.f fVar) {
        int size = fVar.f3578w0.size();
        InterfaceC0066b interfaceC0066bR0 = fVar.R0();
        for (int i10 = 0; i10 < size; i10++) {
            F0.e eVar = (F0.e) fVar.f3578w0.get(i10);
            if (!(eVar instanceof F0.g) && (!eVar.f3490e.f4225e.f4204j || !eVar.f3492f.f4225e.f4204j)) {
                e.b bVarQ = eVar.q(0);
                e.b bVarQ2 = eVar.q(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarQ != bVar || eVar.f3504l == 1 || bVarQ2 != bVar || eVar.f3506m == 1) {
                    a(interfaceC0066bR0, eVar, false);
                    E0.e eVar2 = fVar.f3532B0;
                    if (eVar2 != null) {
                        eVar2.f3104a++;
                    }
                }
            }
        }
        interfaceC0066bR0.a();
    }

    public final void c(F0.f fVar, String str, int i10, int i11) {
        int iC = fVar.C();
        int iB = fVar.B();
        fVar.r0(0);
        fVar.q0(0);
        fVar.B0(i10);
        fVar.e0(i11);
        fVar.r0(iC);
        fVar.q0(iB);
        this.f4173c.H0();
    }

    public long d(F0.f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        long j10;
        boolean zO0;
        int i19;
        long j11;
        boolean z10;
        boolean z11;
        int i20;
        InterfaceC0066b interfaceC0066b;
        int i21;
        boolean z12;
        int i22;
        boolean z13;
        boolean zQ0;
        int i23;
        E0.e eVar;
        InterfaceC0066b interfaceC0066bR0 = fVar.R0();
        int size = fVar.f3578w0.size();
        int iN = fVar.N();
        int iT = fVar.t();
        boolean zB = F0.j.b(i10, 128);
        boolean z14 = zB || F0.j.b(i10, 64);
        if (z14) {
            for (int i24 = 0; i24 < size; i24++) {
                F0.e eVar2 = (F0.e) fVar.f3578w0.get(i24);
                e.b bVarW = eVar2.w();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z15 = (bVarW == bVar) && (eVar2.K() == bVar) && eVar2.r() > 0.0f;
                if ((eVar2.T() && z15) || ((eVar2.V() && z15) || (eVar2 instanceof F0.k) || eVar2.T() || eVar2.V())) {
                    z14 = false;
                    break;
                }
            }
        }
        if (z14 && (eVar = E0.d.f3079r) != null) {
            eVar.f3106c++;
        }
        int i25 = 2;
        if (z14 && ((i13 == 1073741824 && i15 == 1073741824) || zB)) {
            int iMin = Math.min(fVar.A(), i14);
            j10 = 1;
            int iMin2 = Math.min(fVar.z(), i16);
            if (i13 == 1073741824 && fVar.N() != iMin) {
                fVar.B0(iMin);
                fVar.T0();
            }
            if (i15 == 1073741824 && fVar.t() != iMin2) {
                fVar.e0(iMin2);
                fVar.T0();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                zO0 = fVar.O0(zB);
                i19 = 2;
            } else {
                boolean zP0 = fVar.P0(zB);
                if (i13 == 1073741824) {
                    zQ0 = zP0 & fVar.Q0(zB, 0);
                    i23 = 1;
                } else {
                    zQ0 = zP0;
                    i23 = 0;
                }
                if (i15 == 1073741824) {
                    boolean zQ02 = fVar.Q0(zB, 1) & zQ0;
                    i19 = i23 + 1;
                    zO0 = zQ02;
                } else {
                    i19 = i23;
                    zO0 = zQ0;
                }
            }
            if (zO0) {
                fVar.F0(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            j10 = 1;
            zO0 = false;
            i19 = 0;
        }
        long j12 = 0;
        if (zO0 && i19 == 2) {
            return 0L;
        }
        if (size > 0) {
            b(fVar);
        }
        int iS0 = fVar.S0();
        int size2 = this.f4171a.size();
        if (size > 0) {
            c(fVar, "First pass", iN, iT);
        }
        if (size2 > 0) {
            e.b bVarW2 = fVar.w();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z16 = bVarW2 == bVar2;
            boolean z17 = fVar.K() == bVar2;
            int iMax = Math.max(fVar.N(), this.f4173c.C());
            int iMax2 = Math.max(fVar.t(), this.f4173c.B());
            int i26 = 0;
            boolean zA = false;
            while (i26 < size2) {
                long j13 = j12;
                F0.e eVar3 = (F0.e) this.f4171a.get(i26);
                if (eVar3 instanceof F0.k) {
                    int iN2 = eVar3.N();
                    int iT2 = eVar3.t();
                    boolean zA2 = zA | a(interfaceC0066bR0, eVar3, true);
                    z12 = z17;
                    E0.e eVar4 = fVar.f3532B0;
                    i22 = i26;
                    if (eVar4 != null) {
                        eVar4.f3105b += j10;
                    }
                    int iN3 = eVar3.N();
                    int iT3 = eVar3.t();
                    if (iN3 != iN2) {
                        eVar3.B0(iN3);
                        if (z16 && eVar3.G() > iMax) {
                            iMax = Math.max(iMax, eVar3.G() + eVar3.k(d.b.RIGHT).b());
                        }
                        z13 = true;
                    } else {
                        z13 = zA2;
                    }
                    if (iT3 != iT2) {
                        eVar3.e0(iT3);
                        if (z12 && eVar3.n() > iMax2) {
                            iMax2 = Math.max(iMax2, eVar3.n() + eVar3.k(d.b.BOTTOM).b());
                        }
                        z13 = true;
                    }
                    zA = z13 | ((F0.k) eVar3).I0();
                } else {
                    z12 = z17;
                    i22 = i26;
                }
                i26 = i22 + 1;
                j12 = j13;
                z17 = z12;
                i25 = 2;
            }
            j11 = j12;
            boolean z18 = z17;
            int i27 = 0;
            for (int i28 = i25; i27 < i28; i28 = 2) {
                int i29 = 0;
                while (i29 < size2) {
                    F0.e eVar5 = (F0.e) this.f4171a.get(i29);
                    if (((eVar5 instanceof F0.h) && !(eVar5 instanceof F0.k)) || (eVar5 instanceof F0.g) || eVar5.M() == 8 || ((eVar5.f3490e.f4225e.f4204j && eVar5.f3492f.f4225e.f4204j) || (eVar5 instanceof F0.k))) {
                        i20 = i27;
                        interfaceC0066b = interfaceC0066bR0;
                        i21 = i29;
                    } else {
                        int iN4 = eVar5.N();
                        int iT4 = eVar5.t();
                        int iL = eVar5.l();
                        i20 = i27;
                        zA |= a(interfaceC0066bR0, eVar5, true);
                        E0.e eVar6 = fVar.f3532B0;
                        interfaceC0066b = interfaceC0066bR0;
                        i21 = i29;
                        if (eVar6 != null) {
                            eVar6.f3105b += j10;
                        }
                        int iN5 = eVar5.N();
                        int iT5 = eVar5.t();
                        if (iN5 != iN4) {
                            eVar5.B0(iN5);
                            if (z16 && eVar5.G() > iMax) {
                                iMax = Math.max(iMax, eVar5.G() + eVar5.k(d.b.RIGHT).b());
                            }
                            zA = true;
                        }
                        if (iT5 != iT4) {
                            eVar5.e0(iT5);
                            if (z18 && eVar5.n() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar5.n() + eVar5.k(d.b.BOTTOM).b());
                            }
                            zA = true;
                        }
                        if (eVar5.Q() && iL != eVar5.l()) {
                            zA = true;
                        }
                    }
                    i29 = i21 + 1;
                    i27 = i20;
                    interfaceC0066bR0 = interfaceC0066b;
                }
                int i30 = i27;
                InterfaceC0066b interfaceC0066b2 = interfaceC0066bR0;
                if (zA) {
                    c(fVar, "intermediate pass", iN, iT);
                    zA = false;
                }
                i27 = i30 + 1;
                interfaceC0066bR0 = interfaceC0066b2;
            }
            if (zA) {
                c(fVar, "2nd pass", iN, iT);
                if (fVar.N() < iMax) {
                    fVar.B0(iMax);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (fVar.t() < iMax2) {
                    fVar.e0(iMax2);
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (z11) {
                    c(fVar, "3rd pass", iN, iT);
                }
            }
        } else {
            j11 = 0;
        }
        fVar.c1(iS0);
        return j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(F0.f r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = r6.f4171a
            r0.clear()
            java.util.ArrayList r0 = r7.f3578w0
            int r0 = r0.size()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L3a
            java.util.ArrayList r2 = r7.f3578w0
            java.lang.Object r2 = r2.get(r1)
            F0.e r2 = (F0.e) r2
            F0.e$b r3 = r2.w()
            F0.e$b r4 = F0.e.b.MATCH_CONSTRAINT
            if (r3 == r4) goto L32
            F0.e$b r3 = r2.w()
            F0.e$b r5 = F0.e.b.MATCH_PARENT
            if (r3 == r5) goto L32
            F0.e$b r3 = r2.K()
            if (r3 == r4) goto L32
            F0.e$b r3 = r2.K()
            if (r3 != r5) goto L37
        L32:
            java.util.ArrayList r3 = r6.f4171a
            r3.add(r2)
        L37:
            int r1 = r1 + 1
            goto Lc
        L3a:
            r7.T0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.b.e(F0.f):void");
    }
}
