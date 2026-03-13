package Vd;

import Rd.M;
import Td.y;
import Ud.InterfaceC2313e;
import Ud.InterfaceC2314f;
import fc.AbstractC4036s;
import fc.C4015H;
import java.util.concurrent.atomic.AtomicInteger;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f17558j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f17559k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f17560l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f17561m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f17562n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f17563o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2313e[] f17564p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6082a f17565q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ vc.q f17566r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2314f f17567s;

        /* JADX INFO: renamed from: Vd.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0229a extends nc.m implements vc.p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f17568j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2313e[] f17569k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ int f17570l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f17571m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ Td.g f17572n;

            /* JADX INFO: renamed from: Vd.l$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class C0230a implements InterfaceC2314f {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Td.g f17573a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f17574b;

                /* JADX INFO: renamed from: Vd.l$a$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
                public static final class C0231a extends AbstractC5160d {

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public /* synthetic */ Object f17575j;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    public int f17577l;

                    public C0231a(InterfaceC4988e interfaceC4988e) {
                        super(interfaceC4988e);
                    }

                    @Override // nc.AbstractC5157a
                    public final Object invokeSuspend(Object obj) {
                        this.f17575j = obj;
                        this.f17577l |= Integer.MIN_VALUE;
                        return C0230a.this.emit(null, this);
                    }
                }

                public C0230a(Td.g gVar, int i10) {
                    this.f17573a = gVar;
                    this.f17574b = i10;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
                
                    if (Rd.g1.a(r0) == r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Ud.InterfaceC2314f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof Vd.l.a.C0229a.C0230a.C0231a
                        if (r0 == 0) goto L13
                        r0 = r7
                        Vd.l$a$a$a$a r0 = (Vd.l.a.C0229a.C0230a.C0231a) r0
                        int r1 = r0.f17577l
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f17577l = r1
                        goto L18
                    L13:
                        Vd.l$a$a$a$a r0 = new Vd.l$a$a$a$a
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f17575j
                        java.lang.Object r1 = mc.C5046c.f()
                        int r2 = r0.f17577l
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        fc.AbstractC4036s.b(r7)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L34:
                        fc.AbstractC4036s.b(r7)
                        goto L4d
                    L38:
                        fc.AbstractC4036s.b(r7)
                        Td.g r7 = r5.f17573a
                        gc.J r2 = new gc.J
                        int r5 = r5.f17574b
                        r2.<init>(r5, r6)
                        r0.f17577l = r4
                        java.lang.Object r5 = r7.p(r2, r0)
                        if (r5 != r1) goto L4d
                        goto L55
                    L4d:
                        r0.f17577l = r3
                        java.lang.Object r5 = Rd.g1.a(r0)
                        if (r5 != r1) goto L56
                    L55:
                        return r1
                    L56:
                        fc.H r5 = fc.C4015H.f34254a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Vd.l.a.C0229a.C0230a.emit(java.lang.Object, lc.e):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0229a(InterfaceC2313e[] interfaceC2313eArr, int i10, AtomicInteger atomicInteger, Td.g gVar, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f17569k = interfaceC2313eArr;
                this.f17570l = i10;
                this.f17571m = atomicInteger;
                this.f17572n = gVar;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return new C0229a(this.f17569k, this.f17570l, this.f17571m, this.f17572n, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((C0229a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                AtomicInteger atomicInteger;
                Object objF = C5046c.f();
                int i10 = this.f17568j;
                try {
                    if (i10 == 0) {
                        AbstractC4036s.b(obj);
                        InterfaceC2313e[] interfaceC2313eArr = this.f17569k;
                        int i11 = this.f17570l;
                        InterfaceC2313e interfaceC2313e = interfaceC2313eArr[i11];
                        C0230a c0230a = new C0230a(this.f17572n, i11);
                        this.f17568j = 1;
                        if (interfaceC2313e.collect(c0230a, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC4036s.b(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        y.a.a(this.f17572n, null, 1, null);
                    }
                    return C4015H.f34254a;
                } finally {
                    if (this.f17571m.decrementAndGet() == 0) {
                        y.a.a(this.f17572n, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2313e[] interfaceC2313eArr, InterfaceC6082a interfaceC6082a, vc.q qVar, InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f17564p = interfaceC2313eArr;
            this.f17565q = interfaceC6082a;
            this.f17566r = qVar;
            this.f17567s = interfaceC2314f;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            a aVar = new a(this.f17564p, this.f17565q, this.f17566r, this.f17567s, interfaceC4988e);
            aVar.f17563o = obj;
            return aVar;
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x0106, code lost:
        
            if (r10.invoke(r11, r9, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0126, code lost:
        
            if (r11.invoke(r12, r10, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0129, code lost:
        
            if (r6 != 0) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c1 A[LOOP:0: B:28:0x00c1->B:47:?, LOOP_START, PHI: r6 r10
          0x00c1: PHI (r6v4 int) = (r6v3 int), (r6v5 int) binds: [B:25:0x00bc, B:47:?] A[DONT_GENERATE, DONT_INLINE]
          0x00c1: PHI (r10v5 gc.J) = (r10v4 gc.J), (r10v12 gc.J) binds: [B:25:0x00bc, B:47:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0106 -> B:44:0x0129). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0126 -> B:44:0x0129). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 304
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Vd.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object a(InterfaceC2314f interfaceC2314f, InterfaceC2313e[] interfaceC2313eArr, InterfaceC6082a interfaceC6082a, vc.q qVar, InterfaceC4988e interfaceC4988e) {
        Object objA = o.a(new a(interfaceC2313eArr, interfaceC6082a, qVar, interfaceC2314f, null), interfaceC4988e);
        return objA == C5046c.f() ? objA : C4015H.f34254a;
    }
}
