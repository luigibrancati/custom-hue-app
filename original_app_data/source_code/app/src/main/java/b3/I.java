package b3;

import Rd.AbstractC2132i;
import Rd.M;
import Ud.AbstractC2315g;
import Ud.InterfaceC2313e;
import Ud.InterfaceC2314f;
import b3.k;
import fc.AbstractC4036s;
import fc.AbstractC4040w;
import fc.C4015H;
import fc.C4034q;
import gc.Q;
import gc.T;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k3.AbstractC4791a;
import k3.InterfaceC4792b;
import k3.InterfaceC4794d;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;
import tc.AbstractC5877a;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f25060l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f25061m = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f25062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f25063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f25064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vc.l f25066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f25067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f25068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f25069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f25070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f25071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC6082a f25072k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final String b(String str, String str2) {
            return "room_table_modification_trigger_" + str + '_' + str2;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f25073j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f25074k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f25076m;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f25074k = obj;
            this.f25076m |= Integer.MIN_VALUE;
            return I.this.j(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f25077j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f25078k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int[] f25080m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f25081n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String[] f25082o;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends nc.m implements vc.p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f25083j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ I f25084k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(I i10, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f25084k = i10;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return new a(this.f25084k, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = C5046c.f();
                int i10 = this.f25083j;
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    I i11 = this.f25084k;
                    this.f25083j = 1;
                    if (i11.x(this) == objF) {
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

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b implements InterfaceC2314f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ L f25085a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f25086b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2314f f25087c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String[] f25088d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int[] f25089e;

            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class a extends AbstractC5160d {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public Object f25090j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public Object f25091k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public /* synthetic */ Object f25092l;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public int f25094n;

                public a(InterfaceC4988e interfaceC4988e) {
                    super(interfaceC4988e);
                }

                @Override // nc.AbstractC5157a
                public final Object invokeSuspend(Object obj) {
                    this.f25092l = obj;
                    this.f25094n |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(L l10, boolean z10, InterfaceC2314f interfaceC2314f, String[] strArr, int[] iArr) {
                this.f25085a = l10;
                this.f25086b = z10;
                this.f25087c = interfaceC2314f;
                this.f25088d = strArr;
                this.f25089e = iArr;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
            
                if (r14.emit(r2, r0) == r1) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
            
                if (r14.emit(r2, r0) == r1) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
            
                return r1;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Ud.InterfaceC2314f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(int[] r13, lc.InterfaceC4988e r14) throws java.lang.Throwable {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof b3.I.c.b.a
                    if (r0 == 0) goto L13
                    r0 = r14
                    b3.I$c$b$a r0 = (b3.I.c.b.a) r0
                    int r1 = r0.f25094n
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f25094n = r1
                    goto L18
                L13:
                    b3.I$c$b$a r0 = new b3.I$c$b$a
                    r0.<init>(r14)
                L18:
                    java.lang.Object r14 = r0.f25092l
                    java.lang.Object r1 = mc.C5046c.f()
                    int r2 = r0.f25094n
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L31
                    if (r2 != r3) goto L29
                    goto L31
                L29:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L31:
                    java.lang.Object r12 = r0.f25091k
                    r13 = r12
                    int[] r13 = (int[]) r13
                    java.lang.Object r12 = r0.f25090j
                    b3.I$c$b r12 = (b3.I.c.b) r12
                    fc.AbstractC4036s.b(r14)
                    goto La8
                L3e:
                    fc.AbstractC4036s.b(r14)
                    kotlin.jvm.internal.L r14 = r12.f25085a
                    java.lang.Object r2 = r14.f39776a
                    if (r2 != 0) goto L60
                    boolean r14 = r12.f25086b
                    if (r14 == 0) goto La8
                    Ud.f r14 = r12.f25087c
                    java.lang.String[] r2 = r12.f25088d
                    java.util.Set r2 = gc.C4204q.b1(r2)
                    r0.f25090j = r12
                    r0.f25091k = r13
                    r0.f25094n = r4
                    java.lang.Object r14 = r14.emit(r2, r0)
                    if (r14 != r1) goto La8
                    goto La7
                L60:
                    java.lang.String[] r2 = r12.f25088d
                    int[] r4 = r12.f25089e
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                    int r6 = r2.length
                    r7 = 0
                    r8 = r7
                L6c:
                    if (r7 >= r6) goto L8f
                    r9 = r2[r7]
                    int r10 = r8 + 1
                    java.lang.Object r11 = r14.f39776a
                    if (r11 == 0) goto L87
                    int[] r11 = (int[]) r11
                    r8 = r4[r8]
                    r11 = r11[r8]
                    r8 = r13[r8]
                    if (r11 == r8) goto L83
                    r5.add(r9)
                L83:
                    int r7 = r7 + 1
                    r8 = r10
                    goto L6c
                L87:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "Required value was null."
                    r12.<init>(r13)
                    throw r12
                L8f:
                    boolean r14 = r5.isEmpty()
                    if (r14 != 0) goto La8
                    Ud.f r14 = r12.f25087c
                    java.util.Set r2 = gc.C4179C.Z0(r5)
                    r0.f25090j = r12
                    r0.f25091k = r13
                    r0.f25094n = r3
                    java.lang.Object r14 = r14.emit(r2, r0)
                    if (r14 != r1) goto La8
                La7:
                    return r1
                La8:
                    kotlin.jvm.internal.L r12 = r12.f25085a
                    r12.f39776a = r13
                    fc.H r12 = fc.C4015H.f34254a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: b3.I.c.b.emit(int[], lc.e):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int[] iArr, boolean z10, String[] strArr, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f25080m = iArr;
            this.f25081n = z10;
            this.f25082o = strArr;
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
            return ((c) create(interfaceC2314f, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            c cVar = I.this.new c(this.f25080m, this.f25081n, this.f25082o, interfaceC4988e);
            cVar.f25078k = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
        
            if (Rd.AbstractC2128g.g((lc.InterfaceC4992i) r12, r5, r11) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
        
            if (r12.a(r4, r11) != r0) goto L29;
         */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = mc.C5046c.f()
                int r1 = r11.f25077j
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L33
                if (r1 == r5) goto L2b
                if (r1 == r4) goto L23
                if (r1 == r3) goto L1a
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L1a:
                fc.AbstractC4036s.b(r12)     // Catch: java.lang.Throwable -> L1f
                goto L95
            L1f:
                r0 = move-exception
                r12 = r0
                goto L9b
            L23:
                java.lang.Object r1 = r11.f25078k
                Ud.f r1 = (Ud.InterfaceC2314f) r1
                fc.AbstractC4036s.b(r12)
                goto L71
            L2b:
                java.lang.Object r1 = r11.f25078k
                Ud.f r1 = (Ud.InterfaceC2314f) r1
                fc.AbstractC4036s.b(r12)
                goto L5d
            L33:
                fc.AbstractC4036s.b(r12)
                java.lang.Object r12 = r11.f25078k
                Ud.f r12 = (Ud.InterfaceC2314f) r12
                b3.I r1 = b3.I.this
                b3.k r1 = b3.I.e(r1)
                int[] r6 = r11.f25080m
                boolean r1 = r1.c(r6)
                if (r1 == 0) goto L73
                b3.I r1 = b3.I.this
                b3.t r1 = b3.I.d(r1)
                r11.f25078k = r12
                r11.f25077j = r5
                r5 = 0
                java.lang.Object r1 = h3.AbstractC4270a.b(r1, r5, r11)
                if (r1 != r0) goto L5a
                goto L94
            L5a:
                r10 = r1
                r1 = r12
                r12 = r10
            L5d:
                lc.i r12 = (lc.InterfaceC4992i) r12
                b3.I$c$a r5 = new b3.I$c$a
                b3.I r6 = b3.I.this
                r5.<init>(r6, r2)
                r11.f25078k = r1
                r11.f25077j = r4
                java.lang.Object r12 = Rd.AbstractC2128g.g(r12, r5, r11)
                if (r12 != r0) goto L71
                goto L94
            L71:
                r7 = r1
                goto L74
            L73:
                r7 = r12
            L74:
                kotlin.jvm.internal.L r5 = new kotlin.jvm.internal.L     // Catch: java.lang.Throwable -> L1f
                r5.<init>()     // Catch: java.lang.Throwable -> L1f
                b3.I r12 = b3.I.this     // Catch: java.lang.Throwable -> L1f
                b3.l r12 = b3.I.f(r12)     // Catch: java.lang.Throwable -> L1f
                b3.I$c$b r4 = new b3.I$c$b     // Catch: java.lang.Throwable -> L1f
                boolean r6 = r11.f25081n     // Catch: java.lang.Throwable -> L1f
                java.lang.String[] r8 = r11.f25082o     // Catch: java.lang.Throwable -> L1f
                int[] r9 = r11.f25080m     // Catch: java.lang.Throwable -> L1f
                r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1f
                r11.f25078k = r2     // Catch: java.lang.Throwable -> L1f
                r11.f25077j = r3     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r12 = r12.a(r4, r11)     // Catch: java.lang.Throwable -> L1f
                if (r12 != r0) goto L95
            L94:
                return r0
            L95:
                fc.h r12 = new fc.h     // Catch: java.lang.Throwable -> L1f
                r12.<init>()     // Catch: java.lang.Throwable -> L1f
                throw r12     // Catch: java.lang.Throwable -> L1f
            L9b:
                b3.I r0 = b3.I.this
                b3.k r0 = b3.I.e(r0)
                int[] r11 = r11.f25080m
                r0.d(r11)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: b3.I.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f25095j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f25096k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f25097l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f25099n;

        public d(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f25097l = obj;
            this.f25099n |= Integer.MIN_VALUE;
            return I.this.n(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f25100j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f25101k;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends nc.m implements vc.p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f25103j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f25104k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ I f25105l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(I i10, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f25105l = i10;
            }

            @Override // vc.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C c10, InterfaceC4988e interfaceC4988e) {
                return ((a) create(c10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                a aVar = new a(this.f25105l, interfaceC4988e);
                aVar.f25104k = obj;
                return aVar;
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = C5046c.f();
                int i10 = this.f25103j;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                    return obj;
                }
                AbstractC4036s.b(obj);
                C c10 = (C) this.f25104k;
                I i11 = this.f25105l;
                this.f25103j = 1;
                Object objJ = i11.j(c10, this);
                return objJ == objF ? objF : objJ;
            }
        }

        public e(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(D d10, InterfaceC4988e interfaceC4988e) {
            return ((e) create(d10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            e eVar = I.this.new e(interfaceC4988e);
            eVar.f25101k = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        
            if (r7 == r0) goto L20;
         */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = mc.C5046c.f()
                int r1 = r6.f25100j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                fc.AbstractC4036s.b(r7)     // Catch: android.database.SQLException -> L5a
                goto L57
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1a:
                java.lang.Object r1 = r6.f25101k
                b3.D r1 = (b3.D) r1
                fc.AbstractC4036s.b(r7)
                goto L35
            L22:
                fc.AbstractC4036s.b(r7)
                java.lang.Object r7 = r6.f25101k
                r1 = r7
                b3.D r1 = (b3.D) r1
                r6.f25101k = r1
                r6.f25100j = r3
                java.lang.Object r7 = r1.c(r6)
                if (r7 != r0) goto L35
                goto L56
            L35:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L42
                java.util.Set r6 = gc.U.d()
                return r6
            L42:
                b3.D$a r7 = b3.D.a.IMMEDIATE     // Catch: android.database.SQLException -> L5a
                b3.I$e$a r3 = new b3.I$e$a     // Catch: android.database.SQLException -> L5a
                b3.I r4 = b3.I.this     // Catch: android.database.SQLException -> L5a
                r5 = 0
                r3.<init>(r4, r5)     // Catch: android.database.SQLException -> L5a
                r6.f25101k = r5     // Catch: android.database.SQLException -> L5a
                r6.f25100j = r2     // Catch: android.database.SQLException -> L5a
                java.lang.Object r7 = r1.b(r7, r3, r6)     // Catch: android.database.SQLException -> L5a
                if (r7 != r0) goto L57
            L56:
                return r0
            L57:
                java.util.Set r7 = (java.util.Set) r7     // Catch: android.database.SQLException -> L5a
                return r7
            L5a:
                java.util.Set r6 = gc.U.d()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: b3.I.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f25106j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6082a f25108l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC6082a interfaceC6082a, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f25108l = interfaceC6082a;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return I.this.new f(this.f25108l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((f) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f25106j;
            try {
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    I i11 = I.this;
                    this.f25106j = 1;
                    obj = i11.n(this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                }
                this.f25108l.invoke();
                return C4015H.f34254a;
            } catch (Throwable th) {
                this.f25108l.invoke();
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f25109j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f25110k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f25111l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f25112m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f25113n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f25114o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f25115p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f25116q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f25118s;

        public g(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f25116q = obj;
            this.f25118s |= Integer.MIN_VALUE;
            return I.this.v(null, 0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f25119j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f25120k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f25121l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f25122m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f25123n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f25124o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f25126q;

        public h(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f25124o = obj;
            this.f25126q |= Integer.MIN_VALUE;
            return I.this.w(null, 0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class i extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f25127j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f25128k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f25130m;

        public i(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f25128k = obj;
            this.f25130m |= Integer.MIN_VALUE;
            return I.this.x(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class j extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f25131j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f25132k;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends nc.m implements vc.p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Object f25134j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public Object f25135k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public Object f25136l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f25137m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f25138n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public int f25139o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public int f25140p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public final /* synthetic */ k.a[] f25141q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ I f25142r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ D f25143s;

            /* JADX INFO: renamed from: b3.I$j$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public /* synthetic */ class C0325a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f25144a;

                static {
                    int[] iArr = new int[k.a.values().length];
                    try {
                        iArr[k.a.NO_OP.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[k.a.ADD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[k.a.REMOVE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f25144a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k.a[] aVarArr, I i10, D d10, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f25141q = aVarArr;
                this.f25142r = i10;
                this.f25143s = d10;
            }

            @Override // vc.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C c10, InterfaceC4988e interfaceC4988e) {
                return ((a) create(c10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return new a(this.f25141q, this.f25142r, this.f25143s, interfaceC4988e);
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
            
                if (r7.v(r12, r6, r11) == r0) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
            
                r6 = r12;
                r5 = r9;
             */
            /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0086 -> B:27:0x0087). Please report as a decompilation issue!!! */
            @Override // nc.AbstractC5157a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    r11 = this;
                    java.lang.Object r0 = mc.C5046c.f()
                    int r1 = r11.f25140p
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r3) goto Le
                    if (r1 != r2) goto L24
                Le:
                    int r1 = r11.f25139o
                    int r4 = r11.f25138n
                    int r5 = r11.f25137m
                    java.lang.Object r6 = r11.f25136l
                    b3.D r6 = (b3.D) r6
                    java.lang.Object r7 = r11.f25135k
                    b3.I r7 = (b3.I) r7
                    java.lang.Object r8 = r11.f25134j
                    b3.k$a[] r8 = (b3.k.a[]) r8
                    fc.AbstractC4036s.b(r12)
                    goto L68
                L24:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L2c:
                    fc.AbstractC4036s.b(r12)
                    b3.k$a[] r12 = r11.f25141q
                    b3.I r1 = r11.f25142r
                    b3.D r4 = r11.f25143s
                    int r5 = r12.length
                    r6 = 0
                    r8 = r12
                    r7 = r1
                    r12 = r4
                    r1 = r5
                    r4 = r6
                L3c:
                    if (r4 >= r1) goto L89
                    r5 = r8[r4]
                    int r9 = r6 + 1
                    int[] r10 = b3.I.j.a.C0325a.f25144a
                    int r5 = r5.ordinal()
                    r5 = r10[r5]
                    if (r5 == r3) goto L86
                    if (r5 == r2) goto L71
                    r10 = 3
                    if (r5 != r10) goto L6b
                    r11.f25134j = r8
                    r11.f25135k = r7
                    r11.f25136l = r12
                    r11.f25137m = r9
                    r11.f25138n = r4
                    r11.f25139o = r1
                    r11.f25140p = r2
                    java.lang.Object r5 = b3.I.i(r7, r12, r6, r11)
                    if (r5 != r0) goto L66
                    goto L85
                L66:
                    r6 = r12
                    r5 = r9
                L68:
                    r12 = r6
                    r6 = r5
                    goto L87
                L6b:
                    fc.o r11 = new fc.o
                    r11.<init>()
                    throw r11
                L71:
                    r11.f25134j = r8
                    r11.f25135k = r7
                    r11.f25136l = r12
                    r11.f25137m = r9
                    r11.f25138n = r4
                    r11.f25139o = r1
                    r11.f25140p = r3
                    java.lang.Object r5 = b3.I.h(r7, r12, r6, r11)
                    if (r5 != r0) goto L66
                L85:
                    return r0
                L86:
                    r6 = r9
                L87:
                    int r4 = r4 + r3
                    goto L3c
                L89:
                    fc.H r11 = fc.C4015H.f34254a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: b3.I.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public j(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(D d10, InterfaceC4988e interfaceC4988e) {
            return ((j) create(d10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            j jVar = I.this.new j(interfaceC4988e);
            jVar.f25132k = obj;
            return jVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        
            if (r1.b(r3, r4, r7) == r0) goto L21;
         */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = mc.C5046c.f()
                int r1 = r7.f25131j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                fc.AbstractC4036s.b(r8)
                goto L61
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1a:
                java.lang.Object r1 = r7.f25132k
                b3.D r1 = (b3.D) r1
                fc.AbstractC4036s.b(r8)
                goto L35
            L22:
                fc.AbstractC4036s.b(r8)
                java.lang.Object r8 = r7.f25132k
                r1 = r8
                b3.D r1 = (b3.D) r1
                r7.f25132k = r1
                r7.f25131j = r3
                java.lang.Object r8 = r1.c(r7)
                if (r8 != r0) goto L35
                goto L60
            L35:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L40
                fc.H r7 = fc.C4015H.f34254a
                return r7
            L40:
                b3.I r8 = b3.I.this
                b3.k r8 = b3.I.e(r8)
                b3.k$a[] r8 = r8.b()
                if (r8 == 0) goto L61
                b3.D$a r3 = b3.D.a.IMMEDIATE
                b3.I$j$a r4 = new b3.I$j$a
                b3.I r5 = b3.I.this
                r6 = 0
                r4.<init>(r8, r5, r1, r6)
                r7.f25132k = r6
                r7.f25131j = r2
                java.lang.Object r7 = r1.b(r3, r4, r7)
                if (r7 != r0) goto L61
            L60:
                return r0
            L61:
                fc.H r7 = fc.C4015H.f34254a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: b3.I.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public I(t database, Map shadowTablesMap, Map viewTables, String[] tableNames, boolean z10, vc.l onInvalidatedTablesIds) {
        String lowerCase;
        AbstractC4862t.e(database, "database");
        AbstractC4862t.e(shadowTablesMap, "shadowTablesMap");
        AbstractC4862t.e(viewTables, "viewTables");
        AbstractC4862t.e(tableNames, "tableNames");
        AbstractC4862t.e(onInvalidatedTablesIds, "onInvalidatedTablesIds");
        this.f25062a = database;
        this.f25063b = shadowTablesMap;
        this.f25064c = viewTables;
        this.f25065d = z10;
        this.f25066e = onInvalidatedTablesIds;
        this.f25071j = new AtomicBoolean(false);
        this.f25072k = new InterfaceC6082a() { // from class: b3.H
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Boolean.valueOf(I.o());
            }
        };
        this.f25067f = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = tableNames[i10];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            AbstractC4862t.d(lowerCase2, "toLowerCase(...)");
            this.f25067f.put(lowerCase2, Integer.valueOf(i10));
            String str2 = (String) this.f25063b.get(tableNames[i10]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                AbstractC4862t.d(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i10] = lowerCase2;
        }
        this.f25068g = strArr;
        for (Map.Entry entry : this.f25063b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            AbstractC4862t.d(lowerCase3, "toLowerCase(...)");
            if (this.f25067f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                AbstractC4862t.d(lowerCase4, "toLowerCase(...)");
                Map map = this.f25067f;
                map.put(lowerCase4, Q.j(map, lowerCase3));
            }
        }
        this.f25069h = new k(this.f25068g.length);
        this.f25070i = new l(this.f25068g.length);
    }

    public static final Set k(InterfaceC4794d statement) {
        AbstractC4862t.e(statement, "statement");
        Set setB = T.b();
        while (statement.X0()) {
            setB.add(Integer.valueOf((int) statement.getLong(0)));
        }
        return T.a(setB);
    }

    public static final boolean o() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(b3.m r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof b3.I.b
            if (r0 == 0) goto L13
            r0 = r6
            b3.I$b r0 = (b3.I.b) r0
            int r1 = r0.f25076m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25076m = r1
            goto L18
        L13:
            b3.I$b r0 = new b3.I$b
            r0.<init>(r6)
        L18:
            java.lang.Object r4 = r0.f25074k
            java.lang.Object r6 = mc.C5046c.f()
            int r1 = r0.f25076m
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r5 = r0.f25073j
            java.util.Set r5 = (java.util.Set) r5
            fc.AbstractC4036s.b(r4)
            return r5
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            java.lang.Object r5 = r0.f25073j
            b3.m r5 = (b3.m) r5
            fc.AbstractC4036s.b(r4)
            goto L55
        L40:
            fc.AbstractC4036s.b(r4)
            b3.G r4 = new b3.G
            r4.<init>()
            r0.f25073j = r5
            r0.f25076m = r3
            java.lang.String r1 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.a(r1, r4, r0)
            if (r4 != r6) goto L55
            goto L69
        L55:
            java.util.Set r4 = (java.util.Set) r4
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L6a
            r0.f25073j = r4
            r0.f25076m = r2
            java.lang.String r1 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = b3.F.b(r5, r1, r0)
            if (r5 != r6) goto L6a
        L69:
            return r6
        L6a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.I.j(b3.m, lc.e):java.lang.Object");
    }

    public final void l(InterfaceC4792b connection) throws Exception {
        AbstractC4862t.e(connection, "connection");
        InterfaceC4794d interfaceC4794dA1 = connection.a1("PRAGMA query_only");
        try {
            interfaceC4794dA1.X0();
            boolean zA0 = interfaceC4794dA1.A0(0);
            AbstractC5877a.a(interfaceC4794dA1, null);
            if (zA0) {
                return;
            }
            AbstractC4791a.a(connection, "PRAGMA temp_store = MEMORY");
            AbstractC4791a.a(connection, "PRAGMA recursive_triggers = 1");
            AbstractC4791a.a(connection, "DROP TABLE IF EXISTS room_table_modification_log");
            if (this.f25065d) {
                AbstractC4791a.a(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            } else {
                AbstractC4791a.a(connection, Od.C.L("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false, 4, null));
            }
            this.f25069h.a();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC5877a.a(interfaceC4794dA1, th);
                throw th2;
            }
        }
    }

    public final InterfaceC2313e m(String[] resolvedTableNames, int[] tableIds, boolean z10) {
        AbstractC4862t.e(resolvedTableNames, "resolvedTableNames");
        AbstractC4862t.e(tableIds, "tableIds");
        return AbstractC2315g.s(new c(tableIds, z10, resolvedTableNames, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0097 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:35:0x008f, B:37:0x0097, B:20:0x004e, B:22:0x0057, B:27:0x0064, B:29:0x0072, B:32:0x007a), top: B:46:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(lc.InterfaceC4988e r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof b3.I.d
            if (r0 == 0) goto L13
            r0 = r9
            b3.I$d r0 = (b3.I.d) r0
            int r1 = r0.f25099n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25099n = r1
            goto L18
        L13:
            b3.I$d r0 = new b3.I$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f25097l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f25099n
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r8 = r0.f25096k
            c3.a r8 = (c3.C2939a) r8
            java.lang.Object r0 = r0.f25095j
            b3.I r0 = (b3.I) r0
            fc.AbstractC4036s.b(r9)     // Catch: java.lang.Throwable -> L35
            r7 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            goto L8f
        L35:
            r9 = move-exception
            goto La5
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            fc.AbstractC4036s.b(r9)
            b3.t r9 = r8.f25062a
            c3.a r9 = r9.s()
            boolean r2 = r9.a()
            if (r2 == 0) goto La9
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f25071j     // Catch: java.lang.Throwable -> L5f
            r4 = 0
            boolean r2 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L5f
            if (r2 != 0) goto L64
            java.util.Set r8 = gc.U.d()     // Catch: java.lang.Throwable -> L5f
            r9.c()
            return r8
        L5f:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto La5
        L64:
            vc.a r2 = r8.f25072k     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L5f
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L5f
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L5f
            if (r2 != 0) goto L7a
            java.util.Set r8 = gc.U.d()     // Catch: java.lang.Throwable -> L5f
            r9.c()
            return r8
        L7a:
            b3.t r2 = r8.f25062a     // Catch: java.lang.Throwable -> L5f
            b3.I$e r5 = new b3.I$e     // Catch: java.lang.Throwable -> L5f
            r6 = 0
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L5f
            r0.f25095j = r8     // Catch: java.lang.Throwable -> L5f
            r0.f25096k = r9     // Catch: java.lang.Throwable -> L5f
            r0.f25099n = r3     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = r2.Q(r4, r5, r0)     // Catch: java.lang.Throwable -> L5f
            if (r0 != r1) goto L8f
            return r1
        L8f:
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L5f
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5f
            if (r1 != 0) goto La1
            b3.l r1 = r8.f25070i     // Catch: java.lang.Throwable -> L5f
            r1.b(r0)     // Catch: java.lang.Throwable -> L5f
            vc.l r8 = r8.f25066e     // Catch: java.lang.Throwable -> L5f
            r8.invoke(r0)     // Catch: java.lang.Throwable -> L5f
        La1:
            r9.c()
            return r0
        La5:
            r8.c()
            throw r9
        La9:
            java.util.Set r8 = gc.U.d()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.I.n(lc.e):java.lang.Object");
    }

    public final boolean p(int[] tableIds) {
        AbstractC4862t.e(tableIds, "tableIds");
        return this.f25069h.c(tableIds);
    }

    public final boolean q(int[] tableIds) {
        AbstractC4862t.e(tableIds, "tableIds");
        return this.f25069h.d(tableIds);
    }

    public final void r(InterfaceC6082a onRefreshScheduled, InterfaceC6082a onRefreshCompleted) {
        AbstractC4862t.e(onRefreshScheduled, "onRefreshScheduled");
        AbstractC4862t.e(onRefreshCompleted, "onRefreshCompleted");
        if (this.f25071j.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            AbstractC2132i.d(this.f25062a.t(), new Rd.L("Room Invalidation Tracker Refresh"), null, new f(onRefreshCompleted, null), 2, null);
        }
    }

    public final void s() {
        this.f25069h.e();
    }

    public final String[] t(String[] strArr) {
        Set setB = T.b();
        for (String str : strArr) {
            Map map = this.f25064c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC4862t.d(lowerCase, "toLowerCase(...)");
            Set set = (Set) map.get(lowerCase);
            if (set != null) {
                setB.addAll(set);
            } else {
                setB.add(str);
            }
        }
        return (String[]) T.a(setB).toArray(new String[0]);
    }

    public final void u(InterfaceC6082a interfaceC6082a) {
        AbstractC4862t.e(interfaceC6082a, "<set-?>");
        this.f25072k = interfaceC6082a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (b3.F.b(r13, r15, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ee, code lost:
    
        if (b3.F.b(r6, r15, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f0, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ee -> B:28:0x00f1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(b3.m r13, int r14, lc.InterfaceC4988e r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.I.v(b3.m, int, lc.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0084 -> B:19:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(b3.m r9, int r10, lc.InterfaceC4988e r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof b3.I.h
            if (r0 == 0) goto L13
            r0 = r11
            b3.I$h r0 = (b3.I.h) r0
            int r1 = r0.f25126q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25126q = r1
            goto L18
        L13:
            b3.I$h r0 = new b3.I$h
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f25124o
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f25126q
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            int r8 = r0.f25123n
            int r9 = r0.f25122m
            java.lang.Object r10 = r0.f25121l
            java.lang.String[] r10 = (java.lang.String[]) r10
            java.lang.Object r2 = r0.f25120k
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f25119j
            b3.m r4 = (b3.m) r4
            fc.AbstractC4036s.b(r11)
            r11 = r10
            r10 = r4
            goto L87
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            fc.AbstractC4036s.b(r11)
            java.lang.String[] r8 = r8.f25068g
            r8 = r8[r10]
            java.lang.String[] r10 = b3.I.f25061m
            int r11 = r10.length
            r2 = 0
            r7 = r2
            r2 = r8
            r8 = r11
            r11 = r10
            r10 = r9
            r9 = r7
        L54:
            if (r9 >= r8) goto L89
            r4 = r11[r9]
            b3.I$a r5 = b3.I.f25060l
            java.lang.String r4 = b3.I.a.a(r5, r2, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "DROP TRIGGER IF EXISTS `"
            r5.append(r6)
            r5.append(r4)
            r4 = 96
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r0.f25119j = r10
            r0.f25120k = r2
            r0.f25121l = r11
            r0.f25122m = r9
            r0.f25123n = r8
            r0.f25126q = r3
            java.lang.Object r4 = b3.F.b(r10, r4, r0)
            if (r4 != r1) goto L87
            return r1
        L87:
            int r9 = r9 + r3
            goto L54
        L89:
            fc.H r8 = fc.C4015H.f34254a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.I.w(b3.m, int, lc.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(lc.InterfaceC4988e r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof b3.I.i
            if (r0 == 0) goto L13
            r0 = r8
            b3.I$i r0 = (b3.I.i) r0
            int r1 = r0.f25130m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25130m = r1
            goto L18
        L13:
            b3.I$i r0 = new b3.I$i
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f25128k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f25130m
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r7 = r0.f25127j
            c3.a r7 = (c3.C2939a) r7
            fc.AbstractC4036s.b(r8)     // Catch: java.lang.Throwable -> L2d
            goto L5b
        L2d:
            r8 = move-exception
            goto L63
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            fc.AbstractC4036s.b(r8)
            b3.t r8 = r7.f25062a
            c3.a r8 = r8.s()
            boolean r2 = r8.a()
            if (r2 == 0) goto L67
            b3.t r2 = r7.f25062a     // Catch: java.lang.Throwable -> L5f
            b3.I$j r4 = new b3.I$j     // Catch: java.lang.Throwable -> L5f
            r5 = 0
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L5f
            r0.f25127j = r8     // Catch: java.lang.Throwable -> L5f
            r0.f25130m = r3     // Catch: java.lang.Throwable -> L5f
            r7 = 0
            java.lang.Object r7 = r2.Q(r7, r4, r0)     // Catch: java.lang.Throwable -> L5f
            if (r7 != r1) goto L5a
            return r1
        L5a:
            r7 = r8
        L5b:
            r7.c()
            goto L67
        L5f:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L63:
            r7.c()
            throw r8
        L67:
            fc.H r7 = fc.C4015H.f34254a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.I.x(lc.e):java.lang.Object");
    }

    public final C4034q y(String[] names) {
        AbstractC4862t.e(names, "names");
        String[] strArrT = t(names);
        int length = strArrT.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArrT[i10];
            Map map = this.f25067f;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC4862t.d(lowerCase, "toLowerCase(...)");
            Integer num = (Integer) map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            iArr[i10] = num.intValue();
        }
        return AbstractC4040w.a(strArrT, iArr);
    }
}
