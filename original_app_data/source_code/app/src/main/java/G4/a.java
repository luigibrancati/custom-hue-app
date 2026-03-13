package G4;

import J4.h;
import Rd.AbstractC2132i;
import Rd.M;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements G4.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f4471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A4.a f4472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D4.a f4473d;

    /* JADX INFO: renamed from: G4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0072a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f4474j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f4475k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f4477m;

        public C0072a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f4475k = obj;
            this.f4477m |= Integer.MIN_VALUE;
            return a.this.a(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f4478j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f4479k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f4480l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f4481m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f4482n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f4483o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f4485q;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f4483o = obj;
            this.f4485q |= Integer.MIN_VALUE;
            return a.this.b(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f4486j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f4488l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f4488l = str;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new c(this.f4488l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((c) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f4486j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            a.this.f4471b.f(this.f4488l);
            return C4015H.f34254a;
        }
    }

    public a(h storage, A4.a logger, D4.a amplitude) {
        AbstractC4862t.e(storage, "storage");
        AbstractC4862t.e(logger, "logger");
        AbstractC4862t.e(amplitude, "amplitude");
        this.f4471b = storage;
        this.f4472c = logger;
        this.f4473d = amplitude;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // G4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(lc.InterfaceC4988e r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof G4.a.C0072a
            if (r0 == 0) goto L13
            r0 = r5
            G4.a$a r0 = (G4.a.C0072a) r0
            int r1 = r0.f4477m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4477m = r1
            goto L18
        L13:
            G4.a$a r0 = new G4.a$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f4475k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f4477m
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f4474j
            G4.a r4 = (G4.a) r4
            fc.AbstractC4036s.b(r5)     // Catch: java.io.FileNotFoundException -> L2d
            goto L47
        L2d:
            r5 = move-exception
            goto L72
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            fc.AbstractC4036s.b(r5)
            J4.h r5 = r4.f4471b     // Catch: java.io.FileNotFoundException -> L2d
            r0.f4474j = r4     // Catch: java.io.FileNotFoundException -> L2d
            r0.f4477m = r3     // Catch: java.io.FileNotFoundException -> L2d
            java.lang.Object r5 = r5.c(r0)     // Catch: java.io.FileNotFoundException -> L2d
            if (r5 != r1) goto L47
            return r1
        L47:
            J4.h r5 = r4.f4471b
            java.util.List r5 = r5.a()
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L56
            fc.H r4 = fc.C4015H.f34254a
            return r4
        L56:
            java.util.Iterator r5 = r5.iterator()
        L5a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r5.next()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.AbstractC4862t.c(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            r4.d(r0)
            goto L5a
        L6f:
            fc.H r4 = fc.C4015H.f34254a
            return r4
        L72:
            java.lang.String r5 = r5.getMessage()
            if (r5 == 0) goto L8e
            A4.a r4 = r4.f4472c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Event storage file not found: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.c(r5)
        L8e:
            fc.H r4 = fc.C4015H.f34254a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: G4.a.a(lc.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r14.c(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (r14 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0098 -> B:38:0x009b). Please report as a decompilation issue!!! */
    @Override // G4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(lc.InterfaceC4988e r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G4.a.b(lc.e):java.lang.Object");
    }

    public final void d(String str) {
        AbstractC2132i.d(this.f4473d.k(), this.f4473d.v(), null, new c(str, null), 2, null);
    }
}
