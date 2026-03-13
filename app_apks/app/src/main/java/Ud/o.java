package Ud;

import lc.InterfaceC4988e;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f17035j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f17036k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f17037l;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f17036k = obj;
            this.f17037l |= Integer.MIN_VALUE;
            return o.c(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC2313e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2313e f17038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vc.q f17039b;

        public static final class a extends AbstractC5160d {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f17040j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public int f17041k;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public Object f17043m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public Object f17044n;

            public a(InterfaceC4988e interfaceC4988e) {
                super(interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) {
                this.f17040j = obj;
                this.f17041k |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(InterfaceC2313e interfaceC2313e, vc.q qVar) {
            this.f17038a = interfaceC2313e;
            this.f17039b = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Ud.InterfaceC2313e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(Ud.InterfaceC2314f r9, lc.InterfaceC4988e r10) throws java.lang.Throwable {
            /*
                r8 = this;
                boolean r0 = r10 instanceof Ud.o.b.a
                if (r0 == 0) goto L13
                r0 = r10
                Ud.o$b$a r0 = (Ud.o.b.a) r0
                int r1 = r0.f17041k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f17041k = r1
                goto L18
            L13:
                Ud.o$b$a r0 = new Ud.o$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f17040j
                java.lang.Object r1 = mc.C5046c.f()
                int r2 = r0.f17041k
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L58
                if (r2 == r5) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r8 = r0.f17043m
                Vd.v r8 = (Vd.v) r8
                fc.AbstractC4036s.b(r10)     // Catch: java.lang.Throwable -> L34
                goto L8b
            L34:
                r9 = move-exception
                goto L93
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                java.lang.Object r8 = r0.f17043m
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                fc.AbstractC4036s.b(r10)
                goto Lab
            L46:
                java.lang.Object r8 = r0.f17044n
                r9 = r8
                Ud.f r9 = (Ud.InterfaceC2314f) r9
                java.lang.Object r8 = r0.f17043m
                Ud.o$b r8 = (Ud.o.b) r8
                fc.AbstractC4036s.b(r10)     // Catch: java.lang.Throwable -> L53
                goto L6a
            L53:
                r9 = move-exception
                r7 = r9
                r9 = r8
                r8 = r7
                goto L97
            L58:
                fc.AbstractC4036s.b(r10)
                Ud.e r10 = r8.f17038a     // Catch: java.lang.Throwable -> L53
                r0.f17043m = r8     // Catch: java.lang.Throwable -> L53
                r0.f17044n = r9     // Catch: java.lang.Throwable -> L53
                r0.f17041k = r5     // Catch: java.lang.Throwable -> L53
                java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L53
                if (r10 != r1) goto L6a
                goto Laa
            L6a:
                Vd.v r10 = new Vd.v
                lc.i r2 = r0.getContext()
                r10.<init>(r9, r2)
                vc.q r8 = r8.f17039b     // Catch: java.lang.Throwable -> L91
                r0.f17043m = r10     // Catch: java.lang.Throwable -> L91
                r0.f17044n = r6     // Catch: java.lang.Throwable -> L91
                r0.f17041k = r3     // Catch: java.lang.Throwable -> L91
                r9 = 6
                kotlin.jvm.internal.r.c(r9)     // Catch: java.lang.Throwable -> L91
                java.lang.Object r8 = r8.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L91
                r9 = 7
                kotlin.jvm.internal.r.c(r9)     // Catch: java.lang.Throwable -> L91
                if (r8 != r1) goto L8a
                goto Laa
            L8a:
                r8 = r10
            L8b:
                r8.releaseIntercepted()
                fc.H r8 = fc.C4015H.f34254a
                return r8
            L91:
                r9 = move-exception
                r8 = r10
            L93:
                r8.releaseIntercepted()
                throw r9
            L97:
                Ud.I r10 = new Ud.I
                r10.<init>(r8)
                vc.q r9 = r9.f17039b
                r0.f17043m = r8
                r0.f17044n = r6
                r0.f17041k = r4
                java.lang.Object r9 = Ud.o.a(r10, r9, r8, r0)
                if (r9 != r1) goto Lab
            Laa:
                return r1
            Lab:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Ud.o.b.collect(Ud.f, lc.e):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements InterfaceC2313e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ vc.p f17045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2313e f17046b;

        public static final class a extends AbstractC5160d {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f17047j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public int f17048k;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public Object f17050m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public Object f17051n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public Object f17052o;

            public a(InterfaceC4988e interfaceC4988e) {
                super(interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) {
                this.f17047j = obj;
                this.f17048k |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(vc.p pVar, InterfaceC2313e interfaceC2313e) {
            this.f17045a = pVar;
            this.f17046b = interfaceC2313e;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
        
            if (r5.collect(r6, r0) != r1) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Ud.InterfaceC2313e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(Ud.InterfaceC2314f r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof Ud.o.c.a
                if (r0 == 0) goto L13
                r0 = r7
                Ud.o$c$a r0 = (Ud.o.c.a) r0
                int r1 = r0.f17048k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f17048k = r1
                goto L18
            L13:
                Ud.o$c$a r0 = new Ud.o$c$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f17047j
                java.lang.Object r1 = mc.C5046c.f()
                int r2 = r0.f17048k
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                fc.AbstractC4036s.b(r7)
                goto L82
            L2c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L34:
                java.lang.Object r5 = r0.f17052o
                Vd.v r5 = (Vd.v) r5
                java.lang.Object r6 = r0.f17051n
                Ud.f r6 = (Ud.InterfaceC2314f) r6
                java.lang.Object r2 = r0.f17050m
                Ud.o$c r2 = (Ud.o.c) r2
                fc.AbstractC4036s.b(r7)     // Catch: java.lang.Throwable -> L44
                goto L6d
            L44:
                r6 = move-exception
                goto L87
            L46:
                fc.AbstractC4036s.b(r7)
                Vd.v r7 = new Vd.v
                lc.i r2 = r0.getContext()
                r7.<init>(r6, r2)
                vc.p r2 = r5.f17045a     // Catch: java.lang.Throwable -> L85
                r0.f17050m = r5     // Catch: java.lang.Throwable -> L85
                r0.f17051n = r6     // Catch: java.lang.Throwable -> L85
                r0.f17052o = r7     // Catch: java.lang.Throwable -> L85
                r0.f17048k = r4     // Catch: java.lang.Throwable -> L85
                r4 = 6
                kotlin.jvm.internal.r.c(r4)     // Catch: java.lang.Throwable -> L85
                java.lang.Object r2 = r2.invoke(r7, r0)     // Catch: java.lang.Throwable -> L85
                r4 = 7
                kotlin.jvm.internal.r.c(r4)     // Catch: java.lang.Throwable -> L85
                if (r2 != r1) goto L6b
                goto L81
            L6b:
                r2 = r5
                r5 = r7
            L6d:
                r5.releaseIntercepted()
                Ud.e r5 = r2.f17046b
                r7 = 0
                r0.f17050m = r7
                r0.f17051n = r7
                r0.f17052o = r7
                r0.f17048k = r3
                java.lang.Object r5 = r5.collect(r6, r0)
                if (r5 != r1) goto L82
            L81:
                return r1
            L82:
                fc.H r5 = fc.C4015H.f34254a
                return r5
            L85:
                r6 = move-exception
                r5 = r7
            L87:
                r5.releaseIntercepted()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Ud.o.c.collect(Ud.f, lc.e):java.lang.Object");
        }
    }

    public static final void b(InterfaceC2314f interfaceC2314f) {
        if (interfaceC2314f instanceof I) {
            throw ((I) interfaceC2314f).f17005a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(Ud.InterfaceC2314f r4, vc.q r5, java.lang.Throwable r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof Ud.o.a
            if (r0 == 0) goto L13
            r0 = r7
            Ud.o$a r0 = (Ud.o.a) r0
            int r1 = r0.f17037l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17037l = r1
            goto L18
        L13:
            Ud.o$a r0 = new Ud.o$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f17036k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f17037l
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f17035j
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            fc.AbstractC4036s.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            fc.AbstractC4036s.b(r7)
            r0.f17035j = r6     // Catch: java.lang.Throwable -> L2e
            r0.f17037l = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            fc.H r4 = fc.C4015H.f34254a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            fc.C4022e.a(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Ud.o.c(Ud.f, vc.q, java.lang.Throwable, lc.e):java.lang.Object");
    }

    public static final InterfaceC2313e d(InterfaceC2313e interfaceC2313e, vc.q qVar) {
        return new b(interfaceC2313e, qVar);
    }

    public static final InterfaceC2313e e(InterfaceC2313e interfaceC2313e, vc.p pVar) {
        return new c(pVar, interfaceC2313e);
    }
}
