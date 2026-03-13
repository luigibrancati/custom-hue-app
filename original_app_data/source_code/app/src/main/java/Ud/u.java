package Ud;

import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC2313e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2313e f17117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vc.p f17118b;

        /* JADX INFO: renamed from: Ud.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0216a implements InterfaceC2314f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2314f f17119a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ vc.p f17120b;

            /* JADX INFO: renamed from: Ud.u$a$a$a, reason: collision with other inner class name */
            public static final class C0217a extends AbstractC5160d {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public /* synthetic */ Object f17121j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public int f17122k;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public Object f17124m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public Object f17125n;

                public C0217a(InterfaceC4988e interfaceC4988e) {
                    super(interfaceC4988e);
                }

                @Override // nc.AbstractC5157a
                public final Object invokeSuspend(Object obj) {
                    this.f17121j = obj;
                    this.f17122k |= Integer.MIN_VALUE;
                    return C0216a.this.emit(null, this);
                }
            }

            public C0216a(InterfaceC2314f interfaceC2314f, vc.p pVar) {
                this.f17119a = interfaceC2314f;
                this.f17120b = pVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
            
                if (r5.emit(r6, r0) == r1) goto L22;
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
                    boolean r0 = r7 instanceof Ud.u.a.C0216a.C0217a
                    if (r0 == 0) goto L13
                    r0 = r7
                    Ud.u$a$a$a r0 = (Ud.u.a.C0216a.C0217a) r0
                    int r1 = r0.f17122k
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f17122k = r1
                    goto L18
                L13:
                    Ud.u$a$a$a r0 = new Ud.u$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f17121j
                    java.lang.Object r1 = mc.C5046c.f()
                    int r2 = r0.f17122k
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    fc.AbstractC4036s.b(r7)
                    goto L69
                L2c:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L34:
                    java.lang.Object r5 = r0.f17125n
                    Ud.f r5 = (Ud.InterfaceC2314f) r5
                    java.lang.Object r6 = r0.f17124m
                    fc.AbstractC4036s.b(r7)
                    goto L5b
                L3e:
                    fc.AbstractC4036s.b(r7)
                    Ud.f r7 = r5.f17119a
                    vc.p r5 = r5.f17120b
                    r0.f17124m = r6
                    r0.f17125n = r7
                    r0.f17122k = r4
                    r2 = 6
                    kotlin.jvm.internal.r.c(r2)
                    java.lang.Object r5 = r5.invoke(r6, r0)
                    r2 = 7
                    kotlin.jvm.internal.r.c(r2)
                    if (r5 != r1) goto L5a
                    goto L68
                L5a:
                    r5 = r7
                L5b:
                    r7 = 0
                    r0.f17124m = r7
                    r0.f17125n = r7
                    r0.f17122k = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L69
                L68:
                    return r1
                L69:
                    fc.H r5 = fc.C4015H.f34254a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Ud.u.a.C0216a.emit(java.lang.Object, lc.e):java.lang.Object");
            }
        }

        public a(InterfaceC2313e interfaceC2313e, vc.p pVar) {
            this.f17117a = interfaceC2313e;
            this.f17118b = pVar;
        }

        @Override // Ud.InterfaceC2313e
        public Object collect(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
            Object objCollect = this.f17117a.collect(new C0216a(interfaceC2314f, this.f17118b), interfaceC4988e);
            return objCollect == C5046c.f() ? objCollect : C4015H.f34254a;
        }
    }

    public static final InterfaceC2313e a(InterfaceC2313e interfaceC2313e, vc.p pVar) {
        return new a(interfaceC2313e, pVar);
    }
}
