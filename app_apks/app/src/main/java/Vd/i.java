package Vd;

import Rd.M;
import Rd.N;
import Ud.InterfaceC2313e;
import Ud.InterfaceC2314f;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.L;
import lc.C4993j;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vc.q f17535e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f17536j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f17537k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2314f f17539m;

        /* JADX INFO: renamed from: Vd.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0227a implements InterfaceC2314f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ L f17540a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ M f17541b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f17542c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2314f f17543d;

            /* JADX INFO: renamed from: Vd.i$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class C0228a extends nc.m implements vc.p {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public int f17544j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ i f17545k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2314f f17546l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ Object f17547m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0228a(i iVar, InterfaceC2314f interfaceC2314f, Object obj, InterfaceC4988e interfaceC4988e) {
                    super(2, interfaceC4988e);
                    this.f17545k = iVar;
                    this.f17546l = interfaceC2314f;
                    this.f17547m = obj;
                }

                @Override // nc.AbstractC5157a
                public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                    return new C0228a(this.f17545k, this.f17546l, this.f17547m, interfaceC4988e);
                }

                @Override // vc.p
                public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                    return ((C0228a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
                }

                @Override // nc.AbstractC5157a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objF = C5046c.f();
                    int i10 = this.f17544j;
                    if (i10 == 0) {
                        AbstractC4036s.b(obj);
                        vc.q qVar = this.f17545k.f17535e;
                        InterfaceC2314f interfaceC2314f = this.f17546l;
                        Object obj2 = this.f17547m;
                        this.f17544j = 1;
                        if (qVar.invoke(interfaceC2314f, obj2, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC4036s.b(obj);
                    }
                    return C4015H.f34254a;
                }
            }

            /* JADX INFO: renamed from: Vd.i$a$a$b */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class b extends AbstractC5160d {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public Object f17548j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public Object f17549k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public Object f17550l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public /* synthetic */ Object f17551m;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public int f17553o;

                public b(InterfaceC4988e interfaceC4988e) {
                    super(interfaceC4988e);
                }

                @Override // nc.AbstractC5157a
                public final Object invokeSuspend(Object obj) {
                    this.f17551m = obj;
                    this.f17553o |= Integer.MIN_VALUE;
                    return C0227a.this.emit(null, this);
                }
            }

            public C0227a(L l10, M m10, i iVar, InterfaceC2314f interfaceC2314f) {
                this.f17540a = l10;
                this.f17541b = m10;
                this.f17542c = iVar;
                this.f17543d = interfaceC2314f;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Ud.InterfaceC2314f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, lc.InterfaceC4988e r8) throws java.lang.Throwable {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof Vd.i.a.C0227a.b
                    if (r0 == 0) goto L13
                    r0 = r8
                    Vd.i$a$a$b r0 = (Vd.i.a.C0227a.b) r0
                    int r1 = r0.f17553o
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f17553o = r1
                    goto L18
                L13:
                    Vd.i$a$a$b r0 = new Vd.i$a$a$b
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f17551m
                    java.lang.Object r1 = mc.C5046c.f()
                    int r2 = r0.f17553o
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r6 = r0.f17550l
                    Rd.z0 r6 = (Rd.InterfaceC2166z0) r6
                    java.lang.Object r7 = r0.f17549k
                    java.lang.Object r6 = r0.f17548j
                    Vd.i$a$a r6 = (Vd.i.a.C0227a) r6
                    fc.AbstractC4036s.b(r8)
                    goto L5d
                L33:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L3b:
                    fc.AbstractC4036s.b(r8)
                    kotlin.jvm.internal.L r8 = r6.f17540a
                    java.lang.Object r8 = r8.f39776a
                    Rd.z0 r8 = (Rd.InterfaceC2166z0) r8
                    if (r8 == 0) goto L5d
                    Vd.k r2 = new Vd.k
                    r2.<init>()
                    r8.a(r2)
                    r0.f17548j = r6
                    r0.f17549k = r7
                    r0.f17550l = r8
                    r0.f17553o = r3
                    java.lang.Object r8 = r8.a0(r0)
                    if (r8 != r1) goto L5d
                    return r1
                L5d:
                    kotlin.jvm.internal.L r8 = r6.f17540a
                    Rd.M r0 = r6.f17541b
                    Rd.O r2 = Rd.O.UNDISPATCHED
                    Vd.i$a$a$a r3 = new Vd.i$a$a$a
                    Vd.i r1 = r6.f17542c
                    Ud.f r6 = r6.f17543d
                    r4 = 0
                    r3.<init>(r1, r6, r7, r4)
                    r4 = 1
                    r5 = 0
                    r1 = 0
                    Rd.z0 r6 = Rd.AbstractC2128g.d(r0, r1, r2, r3, r4, r5)
                    r8.f39776a = r6
                    fc.H r6 = fc.C4015H.f34254a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: Vd.i.a.C0227a.emit(java.lang.Object, lc.e):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f17539m = interfaceC2314f;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            a aVar = i.this.new a(this.f17539m, interfaceC4988e);
            aVar.f17537k = obj;
            return aVar;
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f17536j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                M m10 = (M) this.f17537k;
                L l10 = new L();
                i iVar = i.this;
                InterfaceC2313e interfaceC2313e = iVar.f17531d;
                C0227a c0227a = new C0227a(l10, m10, iVar, this.f17539m);
                this.f17536j = 1;
                if (interfaceC2313e.collect(c0227a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }
    }

    public /* synthetic */ i(vc.q qVar, InterfaceC2313e interfaceC2313e, InterfaceC4992i interfaceC4992i, int i10, Td.a aVar, int i11, AbstractC4854k abstractC4854k) {
        this(qVar, interfaceC2313e, (i11 & 4) != 0 ? C4993j.f40088a : interfaceC4992i, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? Td.a.SUSPEND : aVar);
    }

    @Override // Vd.e
    public e f(InterfaceC4992i interfaceC4992i, int i10, Td.a aVar) {
        return new i(this.f17535e, this.f17531d, interfaceC4992i, i10, aVar);
    }

    @Override // Vd.g
    public Object m(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
        Object objD = N.d(new a(interfaceC2314f, null), interfaceC4988e);
        return objD == C5046c.f() ? objD : C4015H.f34254a;
    }

    public i(vc.q qVar, InterfaceC2313e interfaceC2313e, InterfaceC4992i interfaceC4992i, int i10, Td.a aVar) {
        super(interfaceC2313e, interfaceC4992i, i10, aVar);
        this.f17535e = qVar;
    }
}
