package Ud;

import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC2313e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2313e f17079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vc.p f17080b;

        public a(InterfaceC2313e interfaceC2313e, vc.p pVar) {
            this.f17079a = interfaceC2313e;
            this.f17080b = pVar;
        }

        @Override // Ud.InterfaceC2313e
        public Object collect(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
            Object objCollect = this.f17079a.collect(new b(new kotlin.jvm.internal.I(), interfaceC2314f, this.f17080b), interfaceC4988e);
            return objCollect == C5046c.f() ? objCollect : C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC2314f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.I f17081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2314f f17082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ vc.p f17083c;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends AbstractC5160d {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Object f17084j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public Object f17085k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f17086l;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f17088n;

            public a(InterfaceC4988e interfaceC4988e) {
                super(interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) {
                this.f17086l = obj;
                this.f17088n |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(kotlin.jvm.internal.I i10, InterfaceC2314f interfaceC2314f, vc.p pVar) {
            this.f17081a = i10;
            this.f17082b = interfaceC2314f;
            this.f17083c = pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (r6.emit(r7, r0) == r1) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
        
            if (r6.emit(r7, r0) == r1) goto L32;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Ud.InterfaceC2314f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r7, lc.InterfaceC4988e r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof Ud.q.b.a
                if (r0 == 0) goto L13
                r0 = r8
                Ud.q$b$a r0 = (Ud.q.b.a) r0
                int r1 = r0.f17088n
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f17088n = r1
                goto L18
            L13:
                Ud.q$b$a r0 = new Ud.q$b$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f17086l
                java.lang.Object r1 = mc.C5046c.f()
                int r2 = r0.f17088n
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                fc.AbstractC4036s.b(r8)
                goto L87
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                java.lang.Object r7 = r0.f17085k
                java.lang.Object r6 = r0.f17084j
                Ud.q$b r6 = (Ud.q.b) r6
                fc.AbstractC4036s.b(r8)
                goto L6b
            L41:
                fc.AbstractC4036s.b(r8)
                goto L59
            L45:
                fc.AbstractC4036s.b(r8)
                kotlin.jvm.internal.I r8 = r6.f17081a
                boolean r8 = r8.f39773a
                if (r8 == 0) goto L5c
                Ud.f r6 = r6.f17082b
                r0.f17088n = r5
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L59
                goto L86
            L59:
                fc.H r6 = fc.C4015H.f34254a
                return r6
            L5c:
                vc.p r8 = r6.f17083c
                r0.f17084j = r6
                r0.f17085k = r7
                r0.f17088n = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                goto L86
            L6b:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8a
                kotlin.jvm.internal.I r8 = r6.f17081a
                r8.f39773a = r5
                Ud.f r6 = r6.f17082b
                r8 = 0
                r0.f17084j = r8
                r0.f17085k = r8
                r0.f17088n = r3
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L87
            L86:
                return r1
            L87:
                fc.H r6 = fc.C4015H.f34254a
                return r6
            L8a:
                fc.H r6 = fc.C4015H.f34254a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Ud.q.b.emit(java.lang.Object, lc.e):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements InterfaceC2313e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2313e f17089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vc.p f17090b;

        public static final class a extends AbstractC5160d {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f17091j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public int f17092k;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public Object f17094m;

            public a(InterfaceC4988e interfaceC4988e) {
                super(interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) {
                this.f17091j = obj;
                this.f17092k |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(InterfaceC2313e interfaceC2313e, vc.p pVar) {
            this.f17089a = interfaceC2313e;
            this.f17090b = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Ud.InterfaceC2313e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(Ud.InterfaceC2314f r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof Ud.q.c.a
                if (r0 == 0) goto L13
                r0 = r6
                Ud.q$c$a r0 = (Ud.q.c.a) r0
                int r1 = r0.f17092k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f17092k = r1
                goto L18
            L13:
                Ud.q$c$a r0 = new Ud.q$c$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f17091j
                java.lang.Object r1 = mc.C5046c.f()
                int r2 = r0.f17092k
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r4 = r0.f17094m
                Ud.q$d r4 = (Ud.q.d) r4
                fc.AbstractC4036s.b(r6)     // Catch: Vd.C2319a -> L2d
                goto L5a
            L2d:
                r5 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L37:
                fc.AbstractC4036s.b(r6)
                Ud.e r6 = r4.f17089a
                Ud.q$d r2 = new Ud.q$d
                vc.p r4 = r4.f17090b
                r2.<init>(r4, r5)
                r0.f17094m = r2     // Catch: Vd.C2319a -> L4e
                r0.f17092k = r3     // Catch: Vd.C2319a -> L4e
                java.lang.Object r4 = r6.collect(r2, r0)     // Catch: Vd.C2319a -> L4e
                if (r4 != r1) goto L5a
                return r1
            L4e:
                r5 = move-exception
                r4 = r2
            L50:
                Vd.p.a(r5, r4)
                lc.i r4 = r0.getContext()
                Rd.C0.k(r4)
            L5a:
                fc.H r4 = fc.C4015H.f34254a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: Ud.q.c.collect(Ud.f, lc.e):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements InterfaceC2314f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ vc.p f17095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2314f f17096b;

        public static final class a extends AbstractC5160d {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Object f17097j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f17098k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f17099l;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public Object f17101n;

            public a(InterfaceC4988e interfaceC4988e) {
                super(interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) {
                this.f17098k = obj;
                this.f17099l |= Integer.MIN_VALUE;
                return d.this.emit(null, this);
            }
        }

        public d(vc.p pVar, InterfaceC2314f interfaceC2314f) {
            this.f17095a = pVar;
            this.f17096b = interfaceC2314f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
        
            if (r7.emit(r6, r0) == r1) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Ud.InterfaceC2314f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(java.lang.Object r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof Ud.q.d.a
                if (r0 == 0) goto L13
                r0 = r7
                Ud.q$d$a r0 = (Ud.q.d.a) r0
                int r1 = r0.f17099l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f17099l = r1
                goto L18
            L13:
                Ud.q$d$a r0 = new Ud.q$d$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f17098k
                java.lang.Object r1 = mc.C5046c.f()
                int r2 = r0.f17099l
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L42
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r5 = r0.f17097j
                Ud.q$d r5 = (Ud.q.d) r5
                fc.AbstractC4036s.b(r7)
                goto L75
            L30:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L38:
                java.lang.Object r6 = r0.f17101n
                java.lang.Object r5 = r0.f17097j
                Ud.q$d r5 = (Ud.q.d) r5
                fc.AbstractC4036s.b(r7)
                goto L5c
            L42:
                fc.AbstractC4036s.b(r7)
                vc.p r7 = r5.f17095a
                r0.f17097j = r5
                r0.f17101n = r6
                r0.f17099l = r4
                r2 = 6
                kotlin.jvm.internal.r.c(r2)
                java.lang.Object r7 = r7.invoke(r6, r0)
                r2 = 7
                kotlin.jvm.internal.r.c(r2)
                if (r7 != r1) goto L5c
                goto L73
            L5c:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L74
                Ud.f r7 = r5.f17096b
                r0.f17097j = r5
                r2 = 0
                r0.f17101n = r2
                r0.f17099l = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L75
            L73:
                return r1
            L74:
                r4 = 0
            L75:
                if (r4 == 0) goto L7a
                fc.H r5 = fc.C4015H.f34254a
                return r5
            L7a:
                Vd.a r6 = new Vd.a
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Ud.q.d.emit(java.lang.Object, lc.e):java.lang.Object");
        }
    }

    public static final InterfaceC2313e a(InterfaceC2313e interfaceC2313e, vc.p pVar) {
        return new a(interfaceC2313e, pVar);
    }

    public static final InterfaceC2313e b(InterfaceC2313e interfaceC2313e, vc.p pVar) {
        return new c(interfaceC2313e, pVar);
    }
}
