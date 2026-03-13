package Cd;

import Cd.d0;
import fc.C4015H;
import fc.C4032o;
import gc.C4179C;
import gc.C4205s;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: Cd.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C0722e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0722e f1329a = new C0722e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f1330b;

    /* JADX INFO: renamed from: Cd.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f1332b;

        static {
            int[] iArr = new int[Gd.t.values().length];
            try {
                iArr[Gd.t.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gd.t.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gd.t.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1331a = iArr;
            int[] iArr2 = new int[d0.b.values().length];
            try {
                iArr2[d0.b.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[d0.b.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[d0.b.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f1332b = iArr2;
        }
    }

    /* JADX INFO: renamed from: Cd.e$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f1333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0 f1334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Gd.p f1335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Gd.k f1336d;

        /* JADX INFO: renamed from: Cd.e$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d0 f1337a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Gd.p f1338b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Gd.k f1339c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Gd.k f1340d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d0 d0Var, Gd.p pVar, Gd.k kVar, Gd.k kVar2) {
                super(0);
                this.f1337a = d0Var;
                this.f1338b = pVar;
                this.f1339c = kVar;
                this.f1340d = kVar2;
            }

            @Override // vc.InterfaceC6082a
            public final Boolean invoke() {
                return Boolean.valueOf(C0722e.f1329a.q(this.f1337a, this.f1338b.r0(this.f1339c), this.f1340d));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list, d0 d0Var, Gd.p pVar, Gd.k kVar) {
            super(1);
            this.f1333a = list;
            this.f1334b = d0Var;
            this.f1335c = pVar;
            this.f1336d = kVar;
        }

        public final void a(d0.a runForkingPoint) {
            AbstractC4862t.e(runForkingPoint, "$this$runForkingPoint");
            Iterator it = this.f1333a.iterator();
            while (it.hasNext()) {
                runForkingPoint.a(new a(this.f1334b, this.f1335c, (Gd.k) it.next(), this.f1336d));
            }
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((d0.a) obj);
            return C4015H.f34254a;
        }
    }

    public static final boolean b(Gd.p pVar, Gd.k kVar) {
        if (!(kVar instanceof Gd.d)) {
            return false;
        }
        Gd.m mVarJ = pVar.j(pVar.F((Gd.d) kVar));
        return !pVar.v0(mVarJ) && pVar.N(pVar.z(pVar.k0(mVarJ)));
    }

    public static final boolean c(Gd.p pVar, Gd.k kVar) {
        Gd.n nVarF = pVar.f(kVar);
        if (!(nVarF instanceof Gd.h)) {
            return false;
        }
        Collection collectionN = pVar.n(nVarF);
        if (collectionN != null && collectionN.isEmpty()) {
            return false;
        }
        Iterator it = collectionN.iterator();
        while (it.hasNext()) {
            Gd.k kVarE = pVar.e((Gd.i) it.next());
            if (kVarE != null && pVar.N(kVarE)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(Gd.p pVar, Gd.k kVar) {
        return pVar.N(kVar) || b(pVar, kVar);
    }

    public static final boolean e(Gd.p pVar, d0 d0Var, Gd.k kVar, Gd.k kVar2, boolean z10) {
        d0 d0Var2;
        Gd.k kVar3;
        Collection<Gd.i> collectionQ0 = pVar.q0(kVar);
        if (collectionQ0 != null && collectionQ0.isEmpty()) {
            return false;
        }
        for (Gd.i iVar : collectionQ0) {
            if (AbstractC4862t.a(pVar.a0(iVar), pVar.f(kVar2))) {
                return true;
            }
            if (z10) {
                d0Var2 = d0Var;
                kVar3 = kVar2;
                if (t(f1329a, d0Var2, kVar3, iVar, false, 8, null)) {
                    return true;
                }
            } else {
                d0Var2 = d0Var;
                kVar3 = kVar2;
            }
            d0Var = d0Var2;
            kVar2 = kVar3;
        }
        return false;
    }

    public static /* synthetic */ boolean t(C0722e c0722e, d0 d0Var, Gd.i iVar, Gd.i iVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return c0722e.s(d0Var, iVar, iVar2, z10);
    }

    public final Boolean a(d0 d0Var, Gd.k kVar, Gd.k kVar2) {
        Gd.p pVarJ = d0Var.j();
        if (!pVarJ.N(kVar) && !pVarJ.N(kVar2)) {
            return null;
        }
        if (d(pVarJ, kVar) && d(pVarJ, kVar2)) {
            return Boolean.TRUE;
        }
        if (pVarJ.N(kVar)) {
            if (e(pVarJ, d0Var, kVar, kVar2, false)) {
                return Boolean.TRUE;
            }
        } else if (pVarJ.N(kVar2) && (c(pVarJ, kVar) || e(pVarJ, d0Var, kVar2, kVar, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean f(Cd.d0 r13, Gd.k r14, Gd.k r15) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Cd.C0722e.f(Cd.d0, Gd.k, Gd.k):java.lang.Boolean");
    }

    public final List g(d0 d0Var, Gd.k kVar, Gd.n nVar) {
        d0.c cVarB0;
        Gd.p pVarJ = d0Var.j();
        List listC0 = pVarJ.C0(kVar, nVar);
        if (listC0 != null) {
            return listC0;
        }
        if (!pVarJ.e0(nVar) && pVarJ.D(kVar)) {
            return C4206t.k();
        }
        if (pVarJ.h(nVar)) {
            if (!pVarJ.H(pVarJ.f(kVar), nVar)) {
                return C4206t.k();
            }
            Gd.k kVarH0 = pVarJ.h0(kVar, Gd.b.FOR_SUBTYPING);
            if (kVarH0 != null) {
                kVar = kVarH0;
            }
            return C4205s.d(kVar);
        }
        Md.e eVar = new Md.e();
        d0Var.k();
        ArrayDeque arrayDequeH = d0Var.h();
        AbstractC4862t.b(arrayDequeH);
        Set setI = d0Var.i();
        AbstractC4862t.b(setI);
        arrayDequeH.push(kVar);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + kVar + ". Supertypes = " + C4179C.q0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            Gd.k current = (Gd.k) arrayDequeH.pop();
            AbstractC4862t.d(current, "current");
            if (setI.add(current)) {
                Gd.k kVarH02 = pVarJ.h0(current, Gd.b.FOR_SUBTYPING);
                if (kVarH02 == null) {
                    kVarH02 = current;
                }
                if (pVarJ.H(pVarJ.f(kVarH02), nVar)) {
                    eVar.add(kVarH02);
                    cVarB0 = d0.c.C0031c.f1327a;
                } else {
                    cVarB0 = pVarJ.u0(kVarH02) == 0 ? d0.c.b.f1326a : d0Var.j().b0(kVarH02);
                }
                if (AbstractC4862t.a(cVarB0, d0.c.C0031c.f1327a)) {
                    cVarB0 = null;
                }
                if (cVarB0 != null) {
                    Gd.p pVarJ2 = d0Var.j();
                    Iterator it = pVarJ2.n(pVarJ2.f(current)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(cVarB0.a(d0Var, (Gd.i) it.next()));
                    }
                }
            }
        }
        d0Var.e();
        return eVar;
    }

    public final List h(d0 d0Var, Gd.k kVar, Gd.n nVar) {
        return w(d0Var, g(d0Var, kVar, nVar));
    }

    public final boolean i(d0 d0Var, Gd.i iVar, Gd.i iVar2, boolean z10) {
        Gd.p pVarJ = d0Var.j();
        Gd.i iVarO = d0Var.o(d0Var.p(iVar));
        Gd.i iVarO2 = d0Var.o(d0Var.p(iVar2));
        C0722e c0722e = f1329a;
        Boolean boolF = c0722e.f(d0Var, pVarJ.o(iVarO), pVarJ.z(iVarO2));
        if (boolF == null) {
            Boolean boolC = d0Var.c(iVarO, iVarO2, z10);
            return boolC != null ? boolC.booleanValue() : c0722e.u(d0Var, pVarJ.o(iVarO), pVarJ.z(iVarO2));
        }
        boolean zBooleanValue = boolF.booleanValue();
        d0Var.c(iVarO, iVarO2, z10);
        return zBooleanValue;
    }

    public final Gd.t j(Gd.t declared, Gd.t useSite) {
        AbstractC4862t.e(declared, "declared");
        AbstractC4862t.e(useSite, "useSite");
        Gd.t tVar = Gd.t.INV;
        if (declared == tVar) {
            return useSite;
        }
        if (useSite == tVar || declared == useSite) {
            return declared;
        }
        return null;
    }

    public final boolean k(d0 state, Gd.i a10, Gd.i b10) {
        AbstractC4862t.e(state, "state");
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        Gd.p pVarJ = state.j();
        if (a10 == b10) {
            return true;
        }
        C0722e c0722e = f1329a;
        if (c0722e.o(pVarJ, a10) && c0722e.o(pVarJ, b10)) {
            Gd.i iVarO = state.o(state.p(a10));
            Gd.i iVarO2 = state.o(state.p(b10));
            Gd.k kVarO = pVarJ.o(iVarO);
            if (!pVarJ.H(pVarJ.a0(iVarO), pVarJ.a0(iVarO2))) {
                return false;
            }
            if (pVarJ.u0(kVarO) == 0) {
                return pVarJ.E0(iVarO) || pVarJ.E0(iVarO2) || pVarJ.y0(kVarO) == pVarJ.y0(pVarJ.o(iVarO2));
            }
        }
        return t(c0722e, state, a10, b10, false, 8, null) && t(c0722e, state, b10, a10, false, 8, null);
    }

    public final List l(d0 state, Gd.k subType, Gd.n superConstructor) {
        d0.c cVar;
        AbstractC4862t.e(state, "state");
        AbstractC4862t.e(subType, "subType");
        AbstractC4862t.e(superConstructor, "superConstructor");
        Gd.p pVarJ = state.j();
        if (pVarJ.D(subType)) {
            return f1329a.h(state, subType, superConstructor);
        }
        if (!pVarJ.e0(superConstructor) && !pVarJ.n0(superConstructor)) {
            return f1329a.g(state, subType, superConstructor);
        }
        Md.e<Gd.k> eVar = new Md.e();
        state.k();
        ArrayDeque arrayDequeH = state.h();
        AbstractC4862t.b(arrayDequeH);
        Set setI = state.i();
        AbstractC4862t.b(setI);
        arrayDequeH.push(subType);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + subType + ". Supertypes = " + C4179C.q0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            Gd.k current = (Gd.k) arrayDequeH.pop();
            AbstractC4862t.d(current, "current");
            if (setI.add(current)) {
                if (pVarJ.D(current)) {
                    eVar.add(current);
                    cVar = d0.c.C0031c.f1327a;
                } else {
                    cVar = d0.c.b.f1326a;
                }
                if (AbstractC4862t.a(cVar, d0.c.C0031c.f1327a)) {
                    cVar = null;
                }
                if (cVar != null) {
                    Gd.p pVarJ2 = state.j();
                    Iterator it = pVarJ2.n(pVarJ2.f(current)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(cVar.a(state, (Gd.i) it.next()));
                    }
                }
            }
        }
        state.e();
        ArrayList arrayList = new ArrayList();
        for (Gd.k it2 : eVar) {
            C0722e c0722e = f1329a;
            AbstractC4862t.d(it2, "it");
            gc.y.C(arrayList, c0722e.h(state, it2, superConstructor));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return r7.J(r7.a0(r8), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Gd.o m(Gd.p r7, Gd.i r8, Gd.i r9) {
        /*
            r6 = this;
            int r0 = r7.u0(r8)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L66
            Gd.m r4 = r7.w(r8, r2)
            boolean r5 = r7.v0(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L63
            Gd.i r3 = r7.k0(r3)
            if (r3 != 0) goto L1d
            goto L63
        L1d:
            Gd.k r4 = r7.o(r3)
            Gd.k r4 = r7.w0(r4)
            boolean r4 = r7.q(r4)
            if (r4 == 0) goto L3b
            Gd.k r4 = r7.o(r9)
            Gd.k r4 = r7.w0(r4)
            boolean r4 = r7.q(r4)
            if (r4 == 0) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = r1
        L3c:
            boolean r5 = kotlin.jvm.internal.AbstractC4862t.a(r3, r9)
            if (r5 != 0) goto L5a
            if (r4 == 0) goto L53
            Gd.n r4 = r7.a0(r3)
            Gd.n r5 = r7.a0(r9)
            boolean r4 = kotlin.jvm.internal.AbstractC4862t.a(r4, r5)
            if (r4 == 0) goto L53
            goto L5a
        L53:
            Gd.o r3 = r6.m(r7, r3, r9)
            if (r3 == 0) goto L63
            return r3
        L5a:
            Gd.n r6 = r7.a0(r8)
            Gd.o r6 = r7.J(r6, r2)
            return r6
        L63:
            int r2 = r2 + 1
            goto L6
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Cd.C0722e.m(Gd.p, Gd.i, Gd.i):Gd.o");
    }

    public final boolean n(d0 d0Var, Gd.k kVar) {
        Gd.p pVarJ = d0Var.j();
        Gd.n nVarF = pVarJ.f(kVar);
        if (pVarJ.e0(nVarF)) {
            return pVarJ.x(nVarF);
        }
        if (pVarJ.x(pVarJ.f(kVar))) {
            return true;
        }
        d0Var.k();
        ArrayDeque arrayDequeH = d0Var.h();
        AbstractC4862t.b(arrayDequeH);
        Set setI = d0Var.i();
        AbstractC4862t.b(setI);
        arrayDequeH.push(kVar);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + kVar + ". Supertypes = " + C4179C.q0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            Gd.k current = (Gd.k) arrayDequeH.pop();
            AbstractC4862t.d(current, "current");
            if (setI.add(current)) {
                d0.c cVar = pVarJ.D(current) ? d0.c.C0031c.f1327a : d0.c.b.f1326a;
                if (AbstractC4862t.a(cVar, d0.c.C0031c.f1327a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    Gd.p pVarJ2 = d0Var.j();
                    Iterator it = pVarJ2.n(pVarJ2.f(current)).iterator();
                    while (it.hasNext()) {
                        Gd.k kVarA = cVar.a(d0Var, (Gd.i) it.next());
                        if (pVarJ.x(pVarJ.f(kVarA))) {
                            d0Var.e();
                            return true;
                        }
                        arrayDequeH.add(kVarA);
                    }
                }
            }
        }
        d0Var.e();
        return false;
    }

    public final boolean o(Gd.p pVar, Gd.i iVar) {
        return (!pVar.B0(pVar.a0(iVar)) || pVar.I(iVar) || pVar.T(iVar) || pVar.A0(iVar) || !AbstractC4862t.a(pVar.f(pVar.o(iVar)), pVar.f(pVar.z(iVar)))) ? false : true;
    }

    public final boolean p(Gd.p pVar, Gd.k kVar, Gd.k kVar2) {
        Gd.k kVarX;
        Gd.k kVarX2;
        Gd.e eVarV = pVar.v(kVar);
        if (eVarV == null || (kVarX = pVar.X(eVarV)) == null) {
            kVarX = kVar;
        }
        Gd.e eVarV2 = pVar.v(kVar2);
        if (eVarV2 == null || (kVarX2 = pVar.X(eVarV2)) == null) {
            kVarX2 = kVar2;
        }
        if (pVar.f(kVarX) != pVar.f(kVarX2)) {
            return false;
        }
        if (pVar.T(kVar) || !pVar.T(kVar2)) {
            return !pVar.y0(kVar) || pVar.y0(kVar2);
        }
        return false;
    }

    public final boolean q(d0 d0Var, Gd.l capturedSubArguments, Gd.k superType) {
        boolean zK;
        d0 d0Var2 = d0Var;
        AbstractC4862t.e(d0Var2, "<this>");
        AbstractC4862t.e(capturedSubArguments, "capturedSubArguments");
        AbstractC4862t.e(superType, "superType");
        Gd.p pVarJ = d0Var2.j();
        Gd.n nVarF = pVarJ.f(superType);
        int iZ0 = pVarJ.z0(capturedSubArguments);
        int iS0 = pVarJ.s0(nVarF);
        if (iZ0 != iS0 || iZ0 != pVarJ.u0(superType)) {
            return false;
        }
        for (int i10 = 0; i10 < iS0; i10++) {
            Gd.m mVarW = pVarJ.w(superType, i10);
            if (!pVarJ.v0(mVarW)) {
                Gd.i iVarK0 = pVarJ.k0(mVarW);
                Gd.m mVarK = pVarJ.K(capturedSubArguments, i10);
                pVarJ.E(mVarK);
                Gd.t tVar = Gd.t.INV;
                Gd.i iVarK02 = pVarJ.k0(mVarK);
                C0722e c0722e = f1329a;
                Gd.t tVarJ = c0722e.j(pVarJ.m0(pVarJ.J(nVarF, i10)), pVarJ.E(mVarW));
                if (tVarJ == null) {
                    return d0Var2.m();
                }
                if (tVarJ != tVar || (!c0722e.v(pVarJ, iVarK02, iVarK0, nVarF) && !c0722e.v(pVarJ, iVarK0, iVarK02, nVarF))) {
                    if (d0Var2.f1321g > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + iVarK02).toString());
                    }
                    d0Var2.f1321g++;
                    int i11 = a.f1331a[tVarJ.ordinal()];
                    if (i11 == 1) {
                        zK = c0722e.k(d0Var2, iVarK02, iVarK0);
                    } else if (i11 == 2) {
                        d0Var2 = d0Var;
                        zK = t(c0722e, d0Var2, iVarK02, iVarK0, false, 8, null);
                    } else {
                        if (i11 != 3) {
                            throw new C4032o();
                        }
                        zK = t(c0722e, d0Var2, iVarK0, iVarK02, false, 8, null);
                        d0Var2 = d0Var;
                    }
                    d0Var2.f1321g--;
                    if (!zK) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean r(d0 state, Gd.i subType, Gd.i superType) {
        AbstractC4862t.e(state, "state");
        AbstractC4862t.e(subType, "subType");
        AbstractC4862t.e(superType, "superType");
        return t(this, state, subType, superType, false, 8, null);
    }

    public final boolean s(d0 state, Gd.i subType, Gd.i superType, boolean z10) {
        AbstractC4862t.e(state, "state");
        AbstractC4862t.e(subType, "subType");
        AbstractC4862t.e(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (state.f(subType, superType)) {
            return i(state, subType, superType, z10);
        }
        return false;
    }

    public final boolean u(d0 d0Var, Gd.k kVar, Gd.k kVar2) {
        boolean z10;
        Gd.i iVarK0;
        Gd.p pVarJ = d0Var.j();
        if (f1330b) {
            if (!pVarJ.g(kVar) && !pVarJ.W(pVarJ.f(kVar))) {
                d0Var.l(kVar);
            }
            if (!pVarJ.g(kVar2)) {
                d0Var.l(kVar2);
            }
        }
        boolean z11 = false;
        if (!C0720c.f1313a.d(d0Var, kVar, kVar2)) {
            return false;
        }
        C0722e c0722e = f1329a;
        Boolean boolA = c0722e.a(d0Var, pVarJ.o(kVar), pVarJ.z(kVar2));
        if (boolA != null) {
            boolean zBooleanValue = boolA.booleanValue();
            d0.d(d0Var, kVar, kVar2, false, 4, null);
            return zBooleanValue;
        }
        Gd.n nVarF = pVarJ.f(kVar2);
        boolean z12 = true;
        if ((pVarJ.H(pVarJ.f(kVar), nVarF) && pVarJ.s0(nVarF) == 0) || pVarJ.m(pVarJ.f(kVar2))) {
            return true;
        }
        List<Gd.k> listL = c0722e.l(d0Var, kVar, nVarF);
        int i10 = 10;
        ArrayList<Gd.k> arrayList = new ArrayList(C4207u.v(listL, 10));
        for (Gd.k kVar3 : listL) {
            Gd.k kVarE = pVarJ.e(d0Var.o(kVar3));
            if (kVarE != null) {
                kVar3 = kVarE;
            }
            arrayList.add(kVar3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return f1329a.n(d0Var, kVar);
        }
        if (size == 1) {
            return f1329a.q(d0Var, pVarJ.r0((Gd.k) C4179C.h0(arrayList)), kVar2);
        }
        Gd.a aVar = new Gd.a(pVarJ.s0(nVarF));
        int iS0 = pVarJ.s0(nVarF);
        int i11 = 0;
        boolean z13 = false;
        while (i11 < iS0) {
            z13 = (z13 || pVarJ.m0(pVarJ.J(nVarF, i11)) != Gd.t.OUT) ? z12 : z11;
            if (z13) {
                z10 = z12;
            } else {
                ArrayList arrayList2 = new ArrayList(C4207u.v(arrayList, i10));
                for (Gd.k kVar4 : arrayList) {
                    Gd.m mVarS = pVarJ.s(kVar4, i11);
                    if (mVarS != null) {
                        boolean z14 = z12;
                        if (pVarJ.E(mVarS) != Gd.t.INV) {
                            mVarS = null;
                        }
                        if (mVarS != null && (iVarK0 = pVarJ.k0(mVarS)) != null) {
                            arrayList2.add(iVarK0);
                            z12 = z14;
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + kVar4 + ", subType: " + kVar + ", superType: " + kVar2).toString());
                }
                z10 = z12;
                aVar.add(pVarJ.f0(pVarJ.j0(arrayList2)));
            }
            i11++;
            z12 = z10;
            z11 = false;
            i10 = 10;
        }
        return (z13 || !f1329a.q(d0Var, aVar, kVar2)) ? d0Var.q(new b(arrayList, d0Var, pVarJ, kVar2)) : z12;
    }

    public final boolean v(Gd.p pVar, Gd.i iVar, Gd.i iVar2, Gd.n nVar) {
        Gd.k kVarE = pVar.e(iVar);
        if (kVarE instanceof Gd.d) {
            Gd.d dVar = (Gd.d) kVarE;
            if (pVar.g0(dVar) || !pVar.v0(pVar.j(pVar.F(dVar))) || pVar.P(dVar) != Gd.b.FOR_SUBTYPING) {
                return false;
            }
            pVar.a0(iVar2);
        }
        return false;
    }

    public final List w(d0 d0Var, List list) {
        int i10;
        Gd.p pVarJ = d0Var.j();
        if (list.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Gd.l lVarR0 = pVarJ.r0((Gd.k) obj);
                int iZ0 = pVarJ.z0(lVarR0);
                while (true) {
                    if (i10 >= iZ0) {
                        arrayList.add(obj);
                        break;
                    }
                    i10 = pVarJ.Q(pVarJ.k0(pVarJ.K(lVarR0, i10))) == null ? i10 + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }
}
