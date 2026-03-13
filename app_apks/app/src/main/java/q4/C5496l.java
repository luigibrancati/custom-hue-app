package q4;

import D4.f;
import Od.B;
import Rd.AbstractC2132i;
import Rd.M;
import Td.x;
import fc.C4015H;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import nc.AbstractC5160d;
import q4.AbstractC5491g;
import vc.p;

/* JADX INFO: renamed from: q4.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5496l extends F4.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f43228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Td.g f43229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f43230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f43231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f43232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f43233h;

    /* JADX INFO: renamed from: q4.l$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f43234j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f43235k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f43236l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f43237m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f43239o;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f43237m = obj;
            this.f43239o |= Integer.MIN_VALUE;
            return C5496l.this.x(null, this);
        }
    }

    /* JADX INFO: renamed from: q4.l$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f43240j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f43241k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f43243m;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f43241k = obj;
            this.f43243m |= Integer.MIN_VALUE;
            return C5496l.this.y(null, this);
        }
    }

    /* JADX INFO: renamed from: q4.l$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f43244j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f43245k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ D4.a f43246l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C5496l f43247m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(D4.a aVar, C5496l c5496l, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f43246l = aVar;
            this.f43247m = c5496l;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new c(this.f43246l, this.f43247m, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((c) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (r11.i(r10) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
        
            if (r4.y(r11, r10) == r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b8 -> B:8:0x0018). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = mc.C5046c.f()
                int r1 = r10.f43245k
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L30
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r10.f43244j
                Td.i r1 = (Td.i) r1
                fc.AbstractC4036s.b(r11)
            L18:
                r11 = r1
                goto L92
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L23:
                java.lang.Object r1 = r10.f43244j
                Td.i r1 = (Td.i) r1
                fc.AbstractC4036s.b(r11)
                goto La0
            L2c:
                fc.AbstractC4036s.b(r11)
                goto L43
            L30:
                fc.AbstractC4036s.b(r11)
                D4.a r11 = r10.f43246l
                Rd.U r11 = r11.z()
                r10.f43245k = r4
                java.lang.Object r11 = r11.i(r10)
                if (r11 != r0) goto L43
                goto Lba
            L43:
                q4.l r11 = r10.f43247m
                java.lang.Long r11 = q4.C5496l.i(r11)
                if (r11 != 0) goto L64
                q4.l r11 = r10.f43247m
                java.util.concurrent.atomic.AtomicLong r11 = q4.C5496l.j(r11)
                q4.l r1 = r10.f43247m
                D4.a r4 = r10.f43246l
                D4.f r4 = r4.u()
                D4.f$a r5 = D4.f.a.PREVIOUS_SESSION_ID
                r6 = -1
                long r4 = q4.C5496l.m(r1, r4, r5, r6)
                r11.set(r4)
            L64:
                q4.l r11 = r10.f43247m
                D4.a r1 = r10.f43246l
                D4.f r1 = r1.u()
                D4.f$a r4 = D4.f.a.LAST_EVENT_ID
                r5 = 0
                long r7 = q4.C5496l.m(r11, r1, r4, r5)
                q4.C5496l.n(r11, r7)
                q4.l r11 = r10.f43247m
                D4.a r1 = r10.f43246l
                D4.f r1 = r1.u()
                D4.f$a r4 = D4.f.a.LAST_EVENT_TIME
                long r4 = q4.C5496l.m(r11, r1, r4, r5)
                q4.C5496l.o(r11, r4)
                q4.l r11 = r10.f43247m
                Td.g r11 = q4.C5496l.h(r11)
                Td.i r11 = r11.iterator()
            L92:
                r10.f43244j = r11
                r10.f43245k = r3
                java.lang.Object r1 = r11.a(r10)
                if (r1 != r0) goto L9d
                goto Lba
            L9d:
                r9 = r1
                r1 = r11
                r11 = r9
            La0:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lbb
                java.lang.Object r11 = r1.next()
                q4.g r11 = (q4.AbstractC5491g) r11
                q4.l r4 = r10.f43247m
                r10.f43244j = r1
                r10.f43245k = r2
                java.lang.Object r11 = q4.C5496l.l(r4, r11, r10)
                if (r11 != r0) goto L18
            Lba:
                return r0
            Lbb:
                fc.H r10 = fc.C4015H.f34254a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: q4.C5496l.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: q4.l$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f43248j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f43249k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f43250l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f43251m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f43252n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f43254p;

        public d(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f43252n = obj;
            this.f43254p |= Integer.MIN_VALUE;
            return C5496l.this.D(0L, this);
        }
    }

    /* JADX INFO: renamed from: q4.l$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f43255j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f43257l;

        public e(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f43255j = obj;
            this.f43257l |= Integer.MIN_VALUE;
            return C5496l.this.E(0L, this);
        }
    }

    public C5496l() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Object A(long j10, InterfaceC4988e interfaceC4988e) {
        if (!s()) {
            return C4015H.f34254a;
        }
        this.f43233h = j10;
        Object objK = e().u().k(f.a.LAST_EVENT_TIME, String.valueOf(this.f43233h), interfaceC4988e);
        return objK == C5046c.f() ? objK : C4015H.f34254a;
    }

    public final Object B(long j10, InterfaceC4988e interfaceC4988e) {
        this.f43230e.set(j10);
        Object objK = e().u().k(f.a.PREVIOUS_SESSION_ID, String.valueOf(r()), interfaceC4988e);
        return objK == C5046c.f() ? objK : C4015H.f34254a;
    }

    public final void C() {
        D4.a aVarE = e();
        AbstractC2132i.d(aVarE.k(), aVarE.v(), null, new c(aVarE, this, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D(long r12, lc.InterfaceC4988e r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.C5496l.D(long, lc.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (A(r6, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(long r6, lc.InterfaceC4988e r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof q4.C5496l.e
            if (r0 == 0) goto L13
            r0 = r8
            q4.l$e r0 = (q4.C5496l.e) r0
            int r1 = r0.f43257l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43257l = r1
            goto L18
        L13:
            q4.l$e r0 = new q4.l$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f43255j
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f43257l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            fc.AbstractC4036s.b(r8)
            return r8
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            fc.AbstractC4036s.b(r8)
            goto L58
        L38:
            fc.AbstractC4036s.b(r8)
            boolean r8 = r5.s()
            if (r8 == 0) goto L5d
            java.util.concurrent.atomic.AtomicBoolean r8 = r5.f43231f
            boolean r8 = r8.get()
            if (r8 != 0) goto L4f
            boolean r8 = r5.t(r6)
            if (r8 == 0) goto L5d
        L4f:
            r0.f43257l = r4
            java.lang.Object r5 = r5.A(r6, r0)
            if (r5 != r1) goto L58
            goto L65
        L58:
            java.util.List r5 = gc.C4206t.k()
            return r5
        L5d:
            r0.f43257l = r3
            java.lang.Object r5 = r5.D(r6, r0)
            if (r5 != r1) goto L66
        L65:
            return r1
        L66:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.C5496l.E(long, lc.e):java.lang.Object");
    }

    public final void F() {
        x.a.a(this.f43229d, null, 1, null);
    }

    @Override // F4.h
    public void f(E4.a incomingEvent) {
        AbstractC4862t.e(incomingEvent, "incomingEvent");
        if (incomingEvent.M() == null) {
            incomingEvent.B0(Long.valueOf(System.currentTimeMillis()));
        }
        if (Td.k.i(this.f43229d.n(new AbstractC5491g.b(incomingEvent)))) {
            e().r().d("Failed to enqueue event: " + incomingEvent.F0() + ". Channel is closed or full.");
        }
    }

    public final long r() {
        return this.f43230e.get();
    }

    public final boolean s() {
        return r() > -1;
    }

    public final boolean t(long j10) {
        D4.b bVarL = e().l();
        AbstractC4862t.c(bVarL, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        return j10 - this.f43233h < ((C5488d) bVarL).K();
    }

    public final void u(long j10) {
        this.f43229d.n(new AbstractC5491g.a(j10));
    }

    public final void v(long j10) {
        this.f43229d.n(new AbstractC5491g.c(j10));
    }

    public final Object w(List list, InterfaceC4988e interfaceC4988e) {
        if (list.isEmpty()) {
            return C4015H.f34254a;
        }
        long j10 = this.f43232g;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            E4.a aVar = (E4.a) it.next();
            Long L10 = aVar.L();
            if (L10 == null) {
                L10 = AbstractC5158b.d(r());
            }
            aVar.A0(L10);
            Long lP = aVar.p();
            if (lP == null) {
                long j11 = this.f43232g + 1;
                this.f43232g = j11;
                lP = AbstractC5158b.d(j11);
            }
            aVar.e0(lP);
            super.f(aVar);
        }
        if (this.f43232g <= j10) {
            return C4015H.f34254a;
        }
        Object objK = e().u().k(f.a.LAST_EVENT_ID, String.valueOf(this.f43232g), interfaceC4988e);
        return objK == C5046c.f() ? objK : C4015H.f34254a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        if (r11.w(r12, r0) != r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7 A[PHI: r11 r12
      0x00d7: PHI (r11v2 'this' q4.l) = (r11v0 'this' q4.l A[IMMUTABLE_TYPE, THIS]), (r11v1 'this' q4.l), (r11v4 'this' q4.l), (r11v10 'this' q4.l) binds: [B:38:0x00b9, B:35:0x00b0, B:43:0x00d4, B:19:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r12v2 E4.a) = (r12v0 E4.a), (r12v1 E4.a), (r12v4 E4.a), (r12v8 E4.a) binds: [B:38:0x00b9, B:35:0x00b0, B:43:0x00d4, B:19:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(E4.a r12, lc.InterfaceC4988e r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.C5496l.x(E4.a, lc.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r7.w((java.util.List) r9, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (x(r8, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
    
        if (A(r8, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y(q4.AbstractC5491g r8, lc.InterfaceC4988e r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof q4.C5496l.b
            if (r0 == 0) goto L13
            r0 = r9
            q4.l$b r0 = (q4.C5496l.b) r0
            int r1 = r0.f43243m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43243m = r1
            goto L18
        L13:
            q4.l$b r0 = new q4.l$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f43241k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f43243m
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L43
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            fc.AbstractC4036s.b(r9)
            goto La8
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            fc.AbstractC4036s.b(r9)
            goto L8c
        L3f:
            fc.AbstractC4036s.b(r9)
            goto L76
        L43:
            java.lang.Object r7 = r0.f43240j
            q4.l r7 = (q4.C5496l) r7
            fc.AbstractC4036s.b(r9)
            goto L63
        L4b:
            fc.AbstractC4036s.b(r9)
            boolean r9 = r8 instanceof q4.AbstractC5491g.a
            if (r9 == 0) goto L79
            q4.g$a r8 = (q4.AbstractC5491g.a) r8
            long r8 = r8.a()
            r0.f43240j = r7
            r0.f43243m = r6
            java.lang.Object r9 = r7.E(r8, r0)
            if (r9 != r1) goto L63
            goto La7
        L63:
            java.util.List r9 = (java.util.List) r9
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f43231f
            r8.set(r6)
            r8 = 0
            r0.f43240j = r8
            r0.f43243m = r5
            java.lang.Object r7 = r7.w(r9, r0)
            if (r7 != r1) goto L76
            goto La7
        L76:
            fc.H r7 = fc.C4015H.f34254a
            return r7
        L79:
            boolean r9 = r8 instanceof q4.AbstractC5491g.b
            if (r9 == 0) goto L8f
            q4.g$b r8 = (q4.AbstractC5491g.b) r8
            E4.a r8 = r8.a()
            r0.f43243m = r4
            java.lang.Object r7 = r7.x(r8, r0)
            if (r7 != r1) goto L8c
            goto La7
        L8c:
            fc.H r7 = fc.C4015H.f34254a
            return r7
        L8f:
            boolean r9 = r8 instanceof q4.AbstractC5491g.c
            if (r9 == 0) goto Lab
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.f43231f
            r2 = 0
            r9.set(r2)
            q4.g$c r8 = (q4.AbstractC5491g.c) r8
            long r8 = r8.a()
            r0.f43243m = r3
            java.lang.Object r7 = r7.A(r8, r0)
            if (r7 != r1) goto La8
        La7:
            return r1
        La8:
            fc.H r7 = fc.C4015H.f34254a
            return r7
        Lab:
            fc.H r7 = fc.C4015H.f34254a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.C5496l.y(q4.g, lc.e):java.lang.Object");
    }

    public final long z(D4.f fVar, f.a aVar, long j10) {
        Long lW;
        String strI = fVar.i(aVar);
        return (strI == null || (lW = B.w(strI)) == null) ? j10 : lW.longValue();
    }

    public /* synthetic */ C5496l(Long l10, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? null : l10);
    }

    public C5496l(Long l10) {
        this.f43228c = l10;
        this.f43229d = Td.j.b(Integer.MAX_VALUE, null, null, 6, null);
        this.f43230e = new AtomicLong(l10 != null ? l10.longValue() : -1L);
        this.f43231f = new AtomicBoolean(false);
    }
}
