package Ud;

import Rd.InterfaceC2166z0;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC2313e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2313e f17053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vc.q f17054b;

        /* JADX INFO: renamed from: Ud.p$a$a, reason: collision with other inner class name */
        public static final class C0215a extends AbstractC5160d {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f17055j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public int f17056k;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public Object f17058m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public Object f17059n;

            public C0215a(InterfaceC4988e interfaceC4988e) {
                super(interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) {
                this.f17055j = obj;
                this.f17056k |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(InterfaceC2313e interfaceC2313e, vc.q qVar) {
            this.f17053a = interfaceC2313e;
            this.f17054b = qVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
        
            if (r5 == r1) goto L23;
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
                boolean r0 = r7 instanceof Ud.p.a.C0215a
                if (r0 == 0) goto L13
                r0 = r7
                Ud.p$a$a r0 = (Ud.p.a.C0215a) r0
                int r1 = r0.f17056k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f17056k = r1
                goto L18
            L13:
                Ud.p$a$a r0 = new Ud.p$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f17055j
                java.lang.Object r1 = mc.C5046c.f()
                int r2 = r0.f17056k
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L41
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                fc.AbstractC4036s.b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L34:
                java.lang.Object r5 = r0.f17059n
                r6 = r5
                Ud.f r6 = (Ud.InterfaceC2314f) r6
                java.lang.Object r5 = r0.f17058m
                Ud.p$a r5 = (Ud.p.a) r5
                fc.AbstractC4036s.b(r7)
                goto L53
            L41:
                fc.AbstractC4036s.b(r7)
                Ud.e r7 = r5.f17053a
                r0.f17058m = r5
                r0.f17059n = r6
                r0.f17056k = r4
                java.lang.Object r7 = Ud.AbstractC2315g.g(r7, r6, r0)
                if (r7 != r1) goto L53
                goto L6e
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                vc.q r5 = r5.f17054b
                r2 = 0
                r0.f17058m = r2
                r0.f17059n = r2
                r0.f17056k = r3
                r2 = 6
                kotlin.jvm.internal.r.c(r2)
                java.lang.Object r5 = r5.invoke(r6, r7, r0)
                r6 = 7
                kotlin.jvm.internal.r.c(r6)
                if (r5 != r1) goto L6f
            L6e:
                return r1
            L6f:
                fc.H r5 = fc.C4015H.f34254a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Ud.p.a.collect(Ud.f, lc.e):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f17060j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f17061k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f17062l;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f17061k = obj;
            this.f17062l |= Integer.MIN_VALUE;
            return AbstractC2315g.g(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements InterfaceC2314f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2314f f17063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L f17064b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends AbstractC5160d {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Object f17065j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f17066k;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f17068m;

            public a(InterfaceC4988e interfaceC4988e) {
                super(interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) {
                this.f17066k = obj;
                this.f17068m |= Integer.MIN_VALUE;
                return c.this.emit(null, this);
            }
        }

        public c(InterfaceC2314f interfaceC2314f, L l10) {
            this.f17063a = interfaceC2314f;
            this.f17064b = l10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r4v4, types: [fc.H, java.lang.Object] */
        @Override // Ud.InterfaceC2314f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof Ud.p.c.a
                if (r0 == 0) goto L13
                r0 = r6
                Ud.p$c$a r0 = (Ud.p.c.a) r0
                int r1 = r0.f17068m
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f17068m = r1
                goto L18
            L13:
                Ud.p$c$a r0 = new Ud.p$c$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f17066k
                java.lang.Object r1 = mc.C5046c.f()
                int r2 = r0.f17068m
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r4 = r0.f17065j
                Ud.p$c r4 = (Ud.p.c) r4
                fc.AbstractC4036s.b(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r5 = move-exception
                goto L4a
            L2f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L37:
                fc.AbstractC4036s.b(r6)
                Ud.f r6 = r4.f17063a     // Catch: java.lang.Throwable -> L2d
                r0.f17065j = r4     // Catch: java.lang.Throwable -> L2d
                r0.f17068m = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r4 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L2d
                if (r4 != r1) goto L47
                return r1
            L47:
                fc.H r4 = fc.C4015H.f34254a
                return r4
            L4a:
                kotlin.jvm.internal.L r4 = r4.f17064b
                r4.f39776a = r5
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Ud.p.c.emit(java.lang.Object, lc.e):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements InterfaceC2313e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2313e f17069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vc.r f17070b;

        public static final class a extends AbstractC5160d {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f17071j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public int f17072k;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public Object f17074m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public Object f17075n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public Object f17076o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public long f17077p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f17078q;

            public a(InterfaceC4988e interfaceC4988e) {
                super(interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) {
                this.f17071j = obj;
                this.f17072k |= Integer.MIN_VALUE;
                return d.this.collect(null, this);
            }
        }

        public d(InterfaceC2313e interfaceC2313e, vc.r rVar) {
            this.f17069a = interfaceC2313e;
            this.f17070b = rVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007b -> B:30:0x00ab). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009c -> B:27:0x009f). Please report as a decompilation issue!!! */
        @Override // Ud.InterfaceC2313e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(Ud.InterfaceC2314f r13, lc.InterfaceC4988e r14) throws java.lang.Throwable {
            /*
                r12 = this;
                boolean r0 = r14 instanceof Ud.p.d.a
                if (r0 == 0) goto L13
                r0 = r14
                Ud.p$d$a r0 = (Ud.p.d.a) r0
                int r1 = r0.f17072k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f17072k = r1
                goto L18
            L13:
                Ud.p$d$a r0 = new Ud.p$d$a
                r0.<init>(r14)
            L18:
                java.lang.Object r14 = r0.f17071j
                java.lang.Object r1 = mc.C5046c.f()
                int r2 = r0.f17072k
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L59
                if (r2 == r4) goto L43
                if (r2 != r3) goto L3b
                long r12 = r0.f17077p
                java.lang.Object r2 = r0.f17076o
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                java.lang.Object r5 = r0.f17075n
                Ud.f r5 = (Ud.InterfaceC2314f) r5
                java.lang.Object r6 = r0.f17074m
                Ud.p$d r6 = (Ud.p.d) r6
                fc.AbstractC4036s.b(r14)
                goto L9f
            L3b:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L43:
                int r12 = r0.f17078q
                long r5 = r0.f17077p
                java.lang.Object r13 = r0.f17075n
                Ud.f r13 = (Ud.InterfaceC2314f) r13
                java.lang.Object r2 = r0.f17074m
                Ud.p$d r2 = (Ud.p.d) r2
                fc.AbstractC4036s.b(r14)
                r9 = r2
                r2 = r12
                r10 = r5
                r5 = r13
                r6 = r9
                r12 = r10
                goto L79
            L59:
                fc.AbstractC4036s.b(r14)
                r5 = 0
            L5e:
                Ud.e r14 = r12.f17069a
                r0.f17074m = r12
                r0.f17075n = r13
                r2 = 0
                r0.f17076o = r2
                r0.f17077p = r5
                r2 = 0
                r0.f17078q = r2
                r0.f17072k = r4
                java.lang.Object r14 = Ud.AbstractC2315g.g(r14, r13, r0)
                if (r14 != r1) goto L75
                goto L9b
            L75:
                r9 = r5
                r6 = r12
                r5 = r13
                r12 = r9
            L79:
                java.lang.Throwable r14 = (java.lang.Throwable) r14
                if (r14 == 0) goto Lab
                vc.r r2 = r6.f17070b
                java.lang.Long r7 = nc.AbstractC5158b.d(r12)
                r0.f17074m = r6
                r0.f17075n = r5
                r0.f17076o = r14
                r0.f17077p = r12
                r0.f17072k = r3
                r8 = 6
                kotlin.jvm.internal.r.c(r8)
                java.lang.Object r2 = r2.invoke(r5, r14, r7, r0)
                r7 = 7
                kotlin.jvm.internal.r.c(r7)
                if (r2 != r1) goto L9c
            L9b:
                return r1
            L9c:
                r9 = r2
                r2 = r14
                r14 = r9
            L9f:
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                if (r14 == 0) goto Lb0
                r7 = 1
                long r12 = r12 + r7
                r2 = r4
            Lab:
                r9 = r12
                r13 = r5
                r12 = r6
                r5 = r9
                goto Lb1
            Lb0:
                throw r2
            Lb1:
                if (r2 != 0) goto L5e
                fc.H r12 = fc.C4015H.f34254a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: Ud.p.d.collect(Ud.f, lc.e):java.lang.Object");
        }
    }

    public static final InterfaceC2313e a(InterfaceC2313e interfaceC2313e, vc.q qVar) {
        return new a(interfaceC2313e, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(Ud.InterfaceC2313e r4, Ud.InterfaceC2314f r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof Ud.p.b
            if (r0 == 0) goto L13
            r0 = r6
            Ud.p$b r0 = (Ud.p.b) r0
            int r1 = r0.f17062l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17062l = r1
            goto L18
        L13:
            Ud.p$b r0 = new Ud.p$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f17061k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f17062l
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f17060j
            kotlin.jvm.internal.L r4 = (kotlin.jvm.internal.L) r4
            fc.AbstractC4036s.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            fc.AbstractC4036s.b(r6)
            kotlin.jvm.internal.L r6 = new kotlin.jvm.internal.L
            r6.<init>()
            Ud.p$c r2 = new Ud.p$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f17060j = r6     // Catch: java.lang.Throwable -> L51
            r0.f17062l = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            java.lang.Object r4 = r4.f39776a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            lc.i r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            fc.C4022e.a(r4, r5)
            throw r4
        L72:
            fc.C4022e.a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Ud.p.b(Ud.e, Ud.f, lc.e):java.lang.Object");
    }

    public static final boolean c(Throwable th, InterfaceC4992i interfaceC4992i) {
        InterfaceC2166z0 interfaceC2166z0 = (InterfaceC2166z0) interfaceC4992i.get(InterfaceC2166z0.f15218M);
        if (interfaceC2166z0 == null || !interfaceC2166z0.isCancelled()) {
            return false;
        }
        return d(th, interfaceC2166z0.h());
    }

    public static final boolean d(Throwable th, Throwable th2) {
        return th2 != null && AbstractC4862t.a(th2, th);
    }

    public static final InterfaceC2313e e(InterfaceC2313e interfaceC2313e, vc.r rVar) {
        return new d(interfaceC2313e, rVar);
    }
}
