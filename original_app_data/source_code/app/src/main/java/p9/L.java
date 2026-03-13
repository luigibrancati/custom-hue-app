package p9;

import Rd.AbstractC2132i;
import android.util.Log;
import fc.C4015H;
import h8.C4288f;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L implements K {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f42333f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final double f42334g = Math.random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4288f f42335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P8.h f42336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s9.j f42337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC5432h f42338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4992i f42339e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f42340j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f42341k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f42342l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f42343m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f42344n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f42345o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f42346p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ SessionDetails f42348r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SessionDetails sessionDetails, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f42348r = sessionDetails;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return L.this.new b(this.f42348r, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = mc.C5046c.f()
                int r1 = r8.f42346p
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L45
                if (r1 == r4) goto L41
                if (r1 == r3) goto L3d
                if (r1 != r2) goto L35
                java.lang.Object r0 = r8.f42345o
                s9.j r0 = (s9.j) r0
                java.lang.Object r1 = r8.f42344n
                p9.H r1 = (p9.SessionDetails) r1
                java.lang.Object r2 = r8.f42343m
                h8.f r2 = (h8.C4288f) r2
                java.lang.Object r3 = r8.f42342l
                p9.J r3 = (p9.J) r3
                java.lang.Object r4 = r8.f42341k
                p9.L r4 = (p9.L) r4
                java.lang.Object r8 = r8.f42340j
                p9.t r8 = (p9.C5443t) r8
                fc.AbstractC4036s.b(r9)
                r7 = r3
                r3 = r0
                r0 = r7
                r7 = r2
                r2 = r1
                r1 = r7
            L32:
                r7 = r4
                goto L9c
            L35:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3d:
                fc.AbstractC4036s.b(r9)
                goto L6c
            L41:
                fc.AbstractC4036s.b(r9)
                goto L53
            L45:
                fc.AbstractC4036s.b(r9)
                p9.L r9 = p9.L.this
                r8.f42346p = r4
                java.lang.Object r9 = p9.L.f(r9, r8)
                if (r9 != r0) goto L53
                goto L94
            L53:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto Lae
                p9.t$a r9 = p9.C5443t.f42491c
                p9.L r1 = p9.L.this
                P8.h r1 = p9.L.d(r1)
                r8.f42346p = r3
                java.lang.Object r9 = r9.a(r1, r8)
                if (r9 != r0) goto L6c
                goto L94
            L6c:
                p9.t r9 = (p9.C5443t) r9
                p9.L r4 = p9.L.this
                p9.J r3 = p9.J.f42331a
                h8.f r1 = p9.L.c(r4)
                p9.H r5 = r8.f42348r
                p9.L r6 = p9.L.this
                s9.j r6 = p9.L.e(r6)
                q9.b r7 = q9.C5509b.f43313a
                r8.f42340j = r9
                r8.f42341k = r4
                r8.f42342l = r3
                r8.f42343m = r1
                r8.f42344n = r5
                r8.f42345o = r6
                r8.f42346p = r2
                java.lang.Object r8 = r7.c(r8)
                if (r8 != r0) goto L95
            L94:
                return r0
            L95:
                r0 = r9
                r9 = r8
                r8 = r0
                r0 = r3
                r2 = r5
                r3 = r6
                goto L32
            L9c:
                r4 = r9
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r5 = r8.b()
                java.lang.String r6 = r8.a()
                p9.I r8 = r0.a(r1, r2, r3, r4, r5, r6)
                p9.L.b(r7, r8)
            Lae:
                fc.H r8 = fc.C4015H.f34254a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p9.L.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f42349j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f42350k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f42352m;

        public c(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f42350k = obj;
            this.f42352m |= Integer.MIN_VALUE;
            return L.this.i(this);
        }
    }

    public L(C4288f firebaseApp, P8.h firebaseInstallations, s9.j sessionSettings, InterfaceC5432h eventGDTLogger, InterfaceC4992i backgroundDispatcher) {
        AbstractC4862t.e(firebaseApp, "firebaseApp");
        AbstractC4862t.e(firebaseInstallations, "firebaseInstallations");
        AbstractC4862t.e(sessionSettings, "sessionSettings");
        AbstractC4862t.e(eventGDTLogger, "eventGDTLogger");
        AbstractC4862t.e(backgroundDispatcher, "backgroundDispatcher");
        this.f42335a = firebaseApp;
        this.f42336b = firebaseInstallations;
        this.f42337c = sessionSettings;
        this.f42338d = eventGDTLogger;
        this.f42339e = backgroundDispatcher;
    }

    @Override // p9.K
    public void a(SessionDetails sessionDetails) {
        AbstractC4862t.e(sessionDetails, "sessionDetails");
        AbstractC2132i.d(Rd.N.a(this.f42339e), null, null, new b(sessionDetails, null), 3, null);
    }

    public final void g(I i10) {
        try {
            this.f42338d.a(i10);
            Log.d("FirebaseSessions", "Successfully logged Session Start event.");
        } catch (RuntimeException e10) {
            Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e10);
        }
    }

    public final boolean h() {
        return f42334g <= this.f42337c.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (r8.f(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(lc.InterfaceC4988e r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p9.L.c
            if (r0 == 0) goto L13
            r0 = r8
            p9.L$c r0 = (p9.L.c) r0
            int r1 = r0.f42352m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42352m = r1
            goto L18
        L13:
            p9.L$c r0 = new p9.L$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f42350k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f42352m
            r3 = 2
            r4 = 0
            java.lang.String r5 = "FirebaseSessions"
            r6 = 1
            if (r2 == 0) goto L43
            if (r2 == r6) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.f42349j
            p9.L r7 = (p9.L) r7
            fc.AbstractC4036s.b(r8)
            goto L85
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            java.lang.Object r7 = r0.f42349j
            p9.L r7 = (p9.L) r7
            fc.AbstractC4036s.b(r8)
            goto L53
        L43:
            fc.AbstractC4036s.b(r8)
            q9.b r8 = q9.C5509b.f43313a
            r0.f42349j = r7
            r0.f42352m = r6
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L53
            goto L84
        L53:
            java.util.Map r8 = (java.util.Map) r8
            java.util.Collection r8 = r8.values()
            if (r8 == 0) goto L62
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L62
            goto Lac
        L62:
            java.util.Iterator r8 = r8.iterator()
        L66:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lac
            java.lang.Object r2 = r8.next()
            q9.c r2 = (q9.InterfaceC5510c) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L66
            s9.j r8 = r7.f42337c
            r0.f42349j = r7
            r0.f42352m = r3
            java.lang.Object r8 = r8.f(r0)
            if (r8 != r1) goto L85
        L84:
            return r1
        L85:
            s9.j r8 = r7.f42337c
            boolean r8 = r8.c()
            if (r8 != 0) goto L97
            java.lang.String r7 = "Sessions SDK disabled through settings API. Events will not be sent."
            android.util.Log.d(r5, r7)
            java.lang.Boolean r7 = nc.AbstractC5158b.a(r4)
            return r7
        L97:
            boolean r7 = r7.h()
            if (r7 != 0) goto La7
            java.lang.String r7 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r5, r7)
            java.lang.Boolean r7 = nc.AbstractC5158b.a(r4)
            return r7
        La7:
            java.lang.Boolean r7 = nc.AbstractC5158b.a(r6)
            return r7
        Lac:
            java.lang.String r7 = "Sessions SDK disabled through data collection. Events will not be sent."
            android.util.Log.d(r5, r7)
            java.lang.Boolean r7 = nc.AbstractC5158b.a(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.L.i(lc.e):java.lang.Object");
    }
}
