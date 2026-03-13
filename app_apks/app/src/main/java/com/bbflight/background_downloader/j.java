package com.bbflight.background_downloader;

import Q4.C1887g;
import Rd.AbstractC2132i;
import Rd.C2123d0;
import Rd.InterfaceC2157v;
import Rd.M;
import Rd.N;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f27257a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M f27258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Td.g f27259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f27260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Td.g f27261e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27262j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27263k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f27264l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f27265m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f27266n;

        public a(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new a(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
        
            if (Rd.X.a(2000 - r7, r11) == r0) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0063 -> B:22:0x0077). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0074 -> B:22:0x0077). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = mc.C5046c.f()
                int r1 = r11.f27266n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r11.f27263k
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r4 = r11.f27262j
                Td.i r4 = (Td.i) r4
                fc.AbstractC4036s.b(r12)
                goto L77
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L22:
                java.lang.Object r1 = r11.f27262j
                Td.i r1 = (Td.i) r1
                fc.AbstractC4036s.b(r12)
                r4 = r1
                goto L46
            L2b:
                fc.AbstractC4036s.b(r12)
                Td.g r12 = com.bbflight.background_downloader.j.c()
                Td.i r12 = r12.iterator()
            L36:
                r11.f27262j = r12
                r1 = 0
                r11.f27263k = r1
                r11.f27266n = r3
                java.lang.Object r1 = r12.a(r11)
                if (r1 != r0) goto L44
                goto L76
            L44:
                r4 = r12
                r12 = r1
            L46:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto L97
                java.lang.Object r12 = r4.next()
                r1 = r12
                java.lang.String r1 = (java.lang.String) r1
                long r5 = java.lang.System.currentTimeMillis()
                long r7 = com.bbflight.background_downloader.j.b()
                long r7 = r5 - r7
                r9 = 2000(0x7d0, double:9.88E-321)
                int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r12 >= 0) goto L77
                long r9 = r9 - r7
                r11.f27262j = r4
                r11.f27263k = r1
                r11.f27264l = r5
                r11.f27265m = r7
                r11.f27266n = r2
                java.lang.Object r12 = Rd.X.a(r9, r11)
                if (r12 != r0) goto L77
            L76:
                return r0
            L77:
                r12 = r4
                com.bbflight.background_downloader.a$a r4 = com.bbflight.background_downloader.a.INSTANCE
                java.util.Map r5 = r4.m()
                r5.remove(r1)
                java.util.Map r5 = r4.i()
                r5.remove(r1)
                java.util.Map r5 = r4.q()
                r5.remove(r1)
                java.util.Map r4 = r4.s()
                r4.remove(r1)
                goto L36
            L97:
                fc.H r11 = fc.C4015H.f34254a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27267j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f27268k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f27269l;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends nc.m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Object f27270j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public int f27271k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ C1887g f27272l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2157v f27273m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C1887g c1887g, InterfaceC2157v interfaceC2157v, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f27272l = c1887g;
                this.f27273m = interfaceC2157v;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return new a(this.f27272l, this.f27273m, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x0105, code lost:
            
                if (r10 == r1) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x011c, code lost:
            
                if (r0.invoke(r9) == r1) goto L36;
             */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0110 A[PHI: r0
              0x0110: PHI (r0v5 vc.l) = (r0v4 vc.l), (r0v6 vc.l) binds: [B:28:0x00f9, B:33:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // nc.AbstractC5157a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 290
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.j.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            b bVar = new b(interfaceC4988e);
            bVar.f27269l = obj;
            return bVar;
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0037 -> B:6:0x0017). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f27269l
                r1 = r0
                Rd.M r1 = (Rd.M) r1
                java.lang.Object r0 = mc.C5046c.f()
                int r2 = r9.f27268k
                r7 = 1
                if (r2 == 0) goto L21
                if (r2 != r7) goto L19
                java.lang.Object r2 = r9.f27267j
                Td.i r2 = (Td.i) r2
                fc.AbstractC4036s.b(r10)
            L17:
                r8 = r2
                goto L3a
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L21:
                fc.AbstractC4036s.b(r10)
                Td.g r10 = com.bbflight.background_downloader.j.a()
                Td.i r10 = r10.iterator()
                r2 = r10
            L2d:
                r9.f27269l = r1
                r9.f27267j = r2
                r9.f27268k = r7
                java.lang.Object r10 = r2.a(r9)
                if (r10 != r0) goto L17
                return r0
            L3a:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L60
                java.lang.Object r10 = r8.next()
                Q4.g r10 = (Q4.C1887g) r10
                r2 = 0
                Rd.v r3 = Rd.AbstractC2161x.b(r2, r7, r2)
                r4 = r2
                Rd.J0 r2 = Rd.C2123d0.c()
                r5 = r4
                com.bbflight.background_downloader.j$b$a r4 = new com.bbflight.background_downloader.j$b$a
                r4.<init>(r10, r3, r5)
                r5 = 2
                r6 = 0
                r3 = 0
                Rd.AbstractC2128g.d(r1, r2, r3, r4, r5, r6)
                r2 = r8
                goto L2d
            L60:
                fc.H r9 = fc.C4015H.f34254a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        M mA = N.a(C2123d0.a());
        f27258b = mA;
        f27259c = Td.j.b(Integer.MAX_VALUE, null, null, 6, null);
        f27261e = Td.j.b(Integer.MAX_VALUE, null, null, 6, null);
        AbstractC2132i.d(mA, null, null, new a(null), 3, null);
        AbstractC2132i.d(mA, null, null, new b(null), 3, null);
    }

    public final Object d(String str, InterfaceC4988e interfaceC4988e) {
        f27260d = System.currentTimeMillis();
        Object objP = f27259c.p(str, interfaceC4988e);
        return objP == C5046c.f() ? objP : C4015H.f34254a;
    }

    public final Object e(C1887g c1887g, InterfaceC4988e interfaceC4988e) {
        Object objP = f27261e.p(c1887g, interfaceC4988e);
        return objP == C5046c.f() ? objP : C4015H.f34254a;
    }
}
