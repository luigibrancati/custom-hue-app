package Q4;

import Rd.AbstractC2132i;
import Rd.C2123d0;
import ae.AbstractC2693g;
import ae.InterfaceC2687a;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f13901a = new v0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Rd.M f13902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Td.g f13903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Td.g f13904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final InterfaceC2687a f13905e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f13906j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f13907k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f13908l;

        public a(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new a(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[PHI: r1 r8
          0x0053: PHI (r1v4 Td.i) = (r1v6 Td.i), (r1v9 Td.i) binds: [B:14:0x0050, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]
          0x0053: PHI (r8v5 java.lang.Object) = (r8v10 java.lang.Object), (r8v0 java.lang.Object) binds: [B:14:0x0050, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0085 -> B:26:0x0086). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = mc.C5046c.f()
                int r1 = r7.f13908l
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L3a
                if (r1 == r4) goto L32
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r7.f13907k
                com.bbflight.background_downloader.k r1 = (com.bbflight.background_downloader.k) r1
                java.lang.Object r1 = r7.f13906j
                Td.i r1 = (Td.i) r1
                fc.AbstractC4036s.b(r8)
                goto L86
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L26:
                java.lang.Object r1 = r7.f13907k
                com.bbflight.background_downloader.k r1 = (com.bbflight.background_downloader.k) r1
                java.lang.Object r6 = r7.f13906j
                Td.i r6 = (Td.i) r6
                fc.AbstractC4036s.b(r8)
                goto L74
            L32:
                java.lang.Object r1 = r7.f13906j
                Td.i r1 = (Td.i) r1
                fc.AbstractC4036s.b(r8)
                goto L53
            L3a:
                fc.AbstractC4036s.b(r8)
                Td.g r8 = Q4.v0.c()
                Td.i r8 = r8.iterator()
                r1 = r8
            L46:
                r7.f13906j = r1
                r7.f13907k = r5
                r7.f13908l = r4
                java.lang.Object r8 = r1.a(r7)
                if (r8 != r0) goto L53
                goto L84
            L53:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto La0
                java.lang.Object r8 = r1.next()
                com.bbflight.background_downloader.k r8 = (com.bbflight.background_downloader.k) r8
                ae.a r6 = Q4.v0.b()
                r7.f13906j = r1
                r7.f13907k = r8
                r7.f13908l = r3
                java.lang.Object r6 = ae.InterfaceC2687a.C0267a.a(r6, r5, r7, r4, r5)
                if (r6 != r0) goto L72
                goto L84
            L72:
                r6 = r1
                r1 = r8
            L74:
                r7.f13906j = r6
                java.lang.Object r8 = nc.l.a(r1)
                r7.f13907k = r8
                r7.f13908l = r2
                java.lang.Object r8 = r1.a(r7)
                if (r8 != r0) goto L85
            L84:
                return r0
            L85:
                r1 = r6
            L86:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L46
                ae.a r8 = Q4.v0.b()
                boolean r8 = r8.g()
                if (r8 == 0) goto L46
                ae.a r8 = Q4.v0.b()
                ae.InterfaceC2687a.C0267a.c(r8, r5, r4, r5)
                goto L46
            La0:
                fc.H r7 = fc.C4015H.f34254a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Q4.v0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f13909j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f13910k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f13911l;

        public b(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new b(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        
            if (com.bbflight.background_downloader.d.u(r1, 0, r6, 1, null) == r0) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0055 -> B:22:0x0065). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0062 -> B:22:0x0065). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = mc.C5046c.f()
                int r1 = r6.f13911l
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L2c
                if (r1 == r4) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r6.f13910k
                com.bbflight.background_downloader.d r1 = (com.bbflight.background_downloader.d) r1
                java.lang.Object r5 = r6.f13909j
                Td.i r5 = (Td.i) r5
                fc.AbstractC4036s.b(r7)
                goto L65
            L1b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L23:
                java.lang.Object r1 = r6.f13909j
                Td.i r1 = (Td.i) r1
                fc.AbstractC4036s.b(r7)
                r5 = r1
                goto L46
            L2c:
                fc.AbstractC4036s.b(r7)
                Td.g r7 = Q4.v0.a()
                Td.i r7 = r7.iterator()
            L37:
                r6.f13909j = r7
                r6.f13910k = r3
                r6.f13911l = r4
                java.lang.Object r1 = r7.a(r6)
                if (r1 != r0) goto L44
                goto L64
            L44:
                r5 = r7
                r7 = r1
            L46:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L7a
                java.lang.Object r7 = r5.next()
                r1 = r7
                com.bbflight.background_downloader.d r1 = (com.bbflight.background_downloader.d) r1
                if (r1 == 0) goto L65
                r6.f13909j = r5
                r6.f13910k = r1
                r6.f13911l = r2
                r7 = 0
                java.lang.Object r7 = com.bbflight.background_downloader.d.u(r1, r7, r6, r4, r3)
                if (r7 != r0) goto L65
            L64:
                return r0
            L65:
                r7 = r5
                if (r1 != 0) goto L37
                ae.a r1 = Q4.v0.b()
                boolean r1 = r1.g()
                if (r1 == 0) goto L37
                ae.a r1 = Q4.v0.b()
                ae.InterfaceC2687a.C0267a.c(r1, r3, r4, r3)
                goto L37
            L7a:
                fc.H r6 = fc.C4015H.f34254a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Q4.v0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        Rd.M mA = Rd.N.a(C2123d0.a());
        f13902b = mA;
        f13903c = Td.j.b(Integer.MAX_VALUE, null, null, 6, null);
        f13904d = Td.j.b(Integer.MAX_VALUE, null, null, 6, null);
        f13905e = AbstractC2693g.b(false, 1, null);
        AbstractC2132i.d(mA, null, null, new a(null), 3, null);
        AbstractC2132i.d(mA, null, null, new b(null), 3, null);
    }

    public final Object d(com.bbflight.background_downloader.d dVar, InterfaceC4988e interfaceC4988e) {
        Object objP = f13904d.p(dVar, interfaceC4988e);
        return objP == C5046c.f() ? objP : C4015H.f34254a;
    }

    public final Object e(com.bbflight.background_downloader.k kVar, InterfaceC4988e interfaceC4988e) {
        Object objP = f13903c.p(kVar, interfaceC4988e);
        return objP == C5046c.f() ? objP : C4015H.f34254a;
    }
}
