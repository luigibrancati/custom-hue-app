package Td;

import Rd.G;
import Rd.InterfaceC2138l;
import Rd.M;
import Rd.O;
import fc.C4015H;
import fc.C4035r;
import lc.C4993j;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f16421j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f16422k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f16423l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f16424m;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f16423l = obj;
            this.f16424m |= Integer.MIN_VALUE;
            return t.a(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2138l f16425a;

        public b(InterfaceC2138l interfaceC2138l) {
            this.f16425a = interfaceC2138l;
        }

        public final void a(Throwable th) {
            InterfaceC2138l interfaceC2138l = this.f16425a;
            C4035r.a aVar = C4035r.f34274b;
            interfaceC2138l.resumeWith(C4035r.b(C4015H.f34254a));
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C4015H.f34254a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(Td.v r4, vc.InterfaceC6082a r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof Td.t.a
            if (r0 == 0) goto L13
            r0 = r6
            Td.t$a r0 = (Td.t.a) r0
            int r1 = r0.f16424m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16424m = r1
            goto L18
        L13:
            Td.t$a r0 = new Td.t$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f16423l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f16424m
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f16422k
            r5 = r4
            vc.a r5 = (vc.InterfaceC6082a) r5
            java.lang.Object r4 = r0.f16421j
            Td.v r4 = (Td.v) r4
            fc.AbstractC4036s.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            fc.AbstractC4036s.b(r6)
            lc.i r6 = r0.getContext()
            Rd.z0$b r2 = Rd.InterfaceC2166z0.f15218M
            lc.i$b r6 = r6.get(r2)
            if (r6 != r4) goto L7f
            r0.f16421j = r4     // Catch: java.lang.Throwable -> L32
            r0.f16422k = r5     // Catch: java.lang.Throwable -> L32
            r0.f16424m = r3     // Catch: java.lang.Throwable -> L32
            Rd.n r6 = new Rd.n     // Catch: java.lang.Throwable -> L32
            lc.e r2 = mc.C5045b.c(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.E()     // Catch: java.lang.Throwable -> L32
            Td.t$b r2 = new Td.t$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.s(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.w()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = mc.C5046c.f()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            nc.h.c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            fc.H r4 = fc.C4015H.f34254a
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Td.t.a(Td.v, vc.a, lc.e):java.lang.Object");
    }

    public static final x b(M m10, InterfaceC4992i interfaceC4992i, int i10, Td.a aVar, O o10, vc.l lVar, vc.p pVar) {
        u uVar = new u(G.j(m10, interfaceC4992i), j.b(i10, aVar, null, 4, null));
        if (lVar != null) {
            uVar.u(lVar);
        }
        uVar.S0(o10, uVar, pVar);
        return uVar;
    }

    public static final x c(M m10, InterfaceC4992i interfaceC4992i, int i10, vc.p pVar) {
        return b(m10, interfaceC4992i, i10, Td.a.SUSPEND, O.DEFAULT, null, pVar);
    }

    public static /* synthetic */ x d(M m10, InterfaceC4992i interfaceC4992i, int i10, Td.a aVar, O o10, vc.l lVar, vc.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC4992i = C4993j.f40088a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            aVar = Td.a.SUSPEND;
        }
        if ((i11 & 8) != 0) {
            o10 = O.DEFAULT;
        }
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        vc.l lVar2 = lVar;
        return b(m10, interfaceC4992i, i10, aVar, o10, lVar2, pVar);
    }

    public static /* synthetic */ x e(M m10, InterfaceC4992i interfaceC4992i, int i10, vc.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC4992i = C4993j.f40088a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c(m10, interfaceC4992i, i10, pVar);
    }
}
