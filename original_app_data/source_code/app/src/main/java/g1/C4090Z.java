package g1;

import Rd.AbstractC2132i;
import Rd.InterfaceC2166z0;
import Td.k;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;

/* JADX INFO: renamed from: g1.Z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4090Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rd.M f34888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc.p f34889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Td.g f34890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4092b f34891d;

    /* JADX INFO: renamed from: g1.Z$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f34892j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f34893k;

        public a(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return C4090Z.this.new a(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r1.invoke(r6, r5) != r0) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[PHI: r1 r6
          0x0051: PHI (r1v1 vc.p) = (r1v2 vc.p), (r1v4 vc.p) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0051: PHI (r6v5 java.lang.Object) = (r6v12 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = mc.C5046c.f()
                int r1 = r5.f34893k
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                fc.AbstractC4036s.b(r6)
                goto L5d
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                java.lang.Object r1 = r5.f34892j
                vc.p r1 = (vc.p) r1
                fc.AbstractC4036s.b(r6)
                goto L51
            L22:
                fc.AbstractC4036s.b(r6)
                g1.Z r6 = g1.C4090Z.this
                g1.b r6 = g1.C4090Z.e(r6)
                int r6 = r6.b()
                if (r6 <= 0) goto L6c
            L31:
                g1.Z r6 = g1.C4090Z.this
                Rd.M r6 = g1.C4090Z.f(r6)
                Rd.N.e(r6)
                g1.Z r6 = g1.C4090Z.this
                vc.p r1 = g1.C4090Z.c(r6)
                g1.Z r6 = g1.C4090Z.this
                Td.g r6 = g1.C4090Z.d(r6)
                r5.f34892j = r1
                r5.f34893k = r3
                java.lang.Object r6 = r6.r(r5)
                if (r6 != r0) goto L51
                goto L5c
            L51:
                r4 = 0
                r5.f34892j = r4
                r5.f34893k = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L5d
            L5c:
                return r0
            L5d:
                g1.Z r6 = g1.C4090Z.this
                g1.b r6 = g1.C4090Z.e(r6)
                int r6 = r6.a()
                if (r6 != 0) goto L31
                fc.H r5 = fc.C4015H.f34254a
                return r5
            L6c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "Check failed."
                r5.<init>(r6)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: g1.C4090Z.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C4090Z(Rd.M scope, final vc.l onComplete, final vc.p onUndeliveredElement, vc.p consumeMessage) {
        AbstractC4862t.e(scope, "scope");
        AbstractC4862t.e(onComplete, "onComplete");
        AbstractC4862t.e(onUndeliveredElement, "onUndeliveredElement");
        AbstractC4862t.e(consumeMessage, "consumeMessage");
        this.f34888a = scope;
        this.f34889b = consumeMessage;
        this.f34890c = Td.j.b(Integer.MAX_VALUE, null, null, 6, null);
        this.f34891d = new C4092b(0);
        InterfaceC2166z0 interfaceC2166z0 = (InterfaceC2166z0) scope.getCoroutineContext().get(InterfaceC2166z0.f15218M);
        if (interfaceC2166z0 != null) {
            interfaceC2166z0.u(new vc.l() { // from class: g1.Y
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return C4090Z.b(onComplete, this, onUndeliveredElement, (Throwable) obj);
                }
            });
        }
    }

    public static final C4015H b(vc.l lVar, C4090Z c4090z, vc.p pVar, Throwable th) {
        lVar.invoke(th);
        c4090z.f34890c.w(th);
        while (true) {
            Object objF = Td.k.f(c4090z.f34890c.t());
            if (objF == null) {
                return C4015H.f34254a;
            }
            pVar.invoke(objF, th);
        }
    }

    public final void g(Object obj) throws Throwable {
        Object objN = this.f34890c.n(obj);
        if (objN instanceof k.a) {
            Throwable thE = Td.k.e(objN);
            if (thE != null) {
                throw thE;
            }
            throw new Td.r("Channel was closed normally");
        }
        if (!Td.k.j(objN)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f34891d.c() == 0) {
            AbstractC2132i.d(this.f34888a, null, null, new a(null), 3, null);
        }
    }
}
