package g1;

import fc.AbstractC4036s;
import fc.C4015H;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;

/* JADX INFO: renamed from: g1.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4098h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34919a = new a(null);

    /* JADX INFO: renamed from: g1.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: g1.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0454a extends nc.m implements vc.p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f34920j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f34921k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ List f34922l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0454a(List list, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f34922l = list;
            }

            @Override // vc.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC4068C interfaceC4068C, InterfaceC4988e interfaceC4988e) {
                return ((C0454a) create(interfaceC4068C, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                C0454a c0454a = new C0454a(this.f34922l, interfaceC4988e);
                c0454a.f34921k = obj;
                return c0454a;
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = C5046c.f();
                int i10 = this.f34920j;
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    InterfaceC4068C interfaceC4068C = (InterfaceC4068C) this.f34921k;
                    a aVar = C4098h.f34919a;
                    List list = this.f34922l;
                    this.f34920j = 1;
                    if (aVar.c(list, interfaceC4068C, this) == objF) {
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

        /* JADX INFO: renamed from: g1.h$a$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends AbstractC5160d {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Object f34923j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public Object f34924k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f34925l;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f34927n;

            public b(InterfaceC4988e interfaceC4988e) {
                super(interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) {
                this.f34925l = obj;
                this.f34927n |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        /* JADX INFO: renamed from: g1.h$a$c */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c extends nc.m implements vc.p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Object f34928j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public Object f34929k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public Object f34930l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f34931m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public /* synthetic */ Object f34932n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ List f34933o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ List f34934p;

            /* JADX INFO: renamed from: g1.h$a$c$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class C0455a extends nc.m implements vc.l {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public int f34935j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ InterfaceC4097g f34936k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0455a(InterfaceC4097g interfaceC4097g, InterfaceC4988e interfaceC4988e) {
                    super(1, interfaceC4988e);
                    this.f34936k = interfaceC4097g;
                }

                @Override // nc.AbstractC5157a
                public final InterfaceC4988e create(InterfaceC4988e interfaceC4988e) {
                    return new C0455a(this.f34936k, interfaceC4988e);
                }

                @Override // nc.AbstractC5157a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objF = C5046c.f();
                    int i10 = this.f34935j;
                    if (i10 == 0) {
                        AbstractC4036s.b(obj);
                        InterfaceC4097g interfaceC4097g = this.f34936k;
                        this.f34935j = 1;
                        if (interfaceC4097g.c(this) == objF) {
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

                @Override // vc.l
                public final Object invoke(InterfaceC4988e interfaceC4988e) {
                    return ((C0455a) create(interfaceC4988e)).invokeSuspend(C4015H.f34254a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List list, List list2, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f34933o = list;
                this.f34934p = list2;
            }

            @Override // vc.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, InterfaceC4988e interfaceC4988e) {
                return ((c) create(obj, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                c cVar = new c(this.f34933o, this.f34934p, interfaceC4988e);
                cVar.f34932n = obj;
                return cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x008c A[RETURN] */
            @Override // nc.AbstractC5157a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
                /*
                    r9 = this;
                    java.lang.Object r0 = mc.C5046c.f()
                    int r1 = r9.f34931m
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r9.f34928j
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.f34932n
                    java.util.List r4 = (java.util.List) r4
                    fc.AbstractC4036s.b(r10)
                    goto L44
                L1a:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L22:
                    java.lang.Object r1 = r9.f34930l
                    java.lang.Object r4 = r9.f34929k
                    g1.g r4 = (g1.InterfaceC4097g) r4
                    java.lang.Object r5 = r9.f34928j
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.f34932n
                    java.util.List r6 = (java.util.List) r6
                    fc.AbstractC4036s.b(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L66
                L37:
                    fc.AbstractC4036s.b(r10)
                    java.lang.Object r10 = r9.f34932n
                    java.util.List r1 = r9.f34933o
                    java.util.List r4 = r9.f34934p
                    java.util.Iterator r1 = r1.iterator()
                L44:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8c
                    java.lang.Object r5 = r1.next()
                    g1.g r5 = (g1.InterfaceC4097g) r5
                    r9.f34932n = r4
                    r9.f34928j = r1
                    r9.f34929k = r5
                    r9.f34930l = r10
                    r9.f34931m = r3
                    java.lang.Object r6 = r5.b(r10, r9)
                    if (r6 != r0) goto L61
                    goto L87
                L61:
                    r8 = r1
                    r1 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                L66:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L8a
                    g1.h$a$c$a r10 = new g1.h$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.f34932n = r4
                    r9.f34928j = r5
                    r9.f34929k = r7
                    r9.f34930l = r7
                    r9.f34931m = r2
                    java.lang.Object r10 = r6.a(r1, r9)
                    if (r10 != r0) goto L88
                L87:
                    return r0
                L88:
                    r1 = r5
                    goto L44
                L8a:
                    r10 = r1
                    goto L88
                L8c:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: g1.C4098h.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final vc.p b(List migrations) {
            AbstractC4862t.e(migrations, "migrations");
            return new C0454a(migrations, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0087 -> B:25:0x006a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008a -> B:25:0x006a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(java.util.List r6, g1.InterfaceC4068C r7, lc.InterfaceC4988e r8) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r8 instanceof g1.C4098h.a.b
                if (r0 == 0) goto L13
                r0 = r8
                g1.h$a$b r0 = (g1.C4098h.a.b) r0
                int r1 = r0.f34927n
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f34927n = r1
                goto L18
            L13:
                g1.h$a$b r0 = new g1.h$a$b
                r0.<init>(r8)
            L18:
                java.lang.Object r5 = r0.f34925l
                java.lang.Object r8 = mc.C5046c.f()
                int r1 = r0.f34927n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L46
                if (r1 == r3) goto L3e
                if (r1 != r2) goto L36
                java.lang.Object r6 = r0.f34924k
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r0.f34923j
                kotlin.jvm.internal.L r7 = (kotlin.jvm.internal.L) r7
                fc.AbstractC4036s.b(r5)     // Catch: java.lang.Throwable -> L34
                goto L6a
            L34:
                r5 = move-exception
                goto L83
            L36:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L3e:
                java.lang.Object r6 = r0.f34923j
                java.util.List r6 = (java.util.List) r6
                fc.AbstractC4036s.b(r5)
                goto L60
            L46:
                fc.AbstractC4036s.b(r5)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                g1.h$a$c r1 = new g1.h$a$c
                r4 = 0
                r1.<init>(r6, r5, r4)
                r0.f34923j = r5
                r0.f34927n = r3
                java.lang.Object r6 = r7.a(r1, r0)
                if (r6 != r8) goto L5f
                goto L82
            L5f:
                r6 = r5
            L60:
                kotlin.jvm.internal.L r5 = new kotlin.jvm.internal.L
                r5.<init>()
                java.util.Iterator r6 = r6.iterator()
                r7 = r5
            L6a:
                boolean r5 = r6.hasNext()
                if (r5 == 0) goto L93
                java.lang.Object r5 = r6.next()
                vc.l r5 = (vc.l) r5
                r0.f34923j = r7     // Catch: java.lang.Throwable -> L34
                r0.f34924k = r6     // Catch: java.lang.Throwable -> L34
                r0.f34927n = r2     // Catch: java.lang.Throwable -> L34
                java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r5 != r8) goto L6a
            L82:
                return r8
            L83:
                java.lang.Object r1 = r7.f39776a
                if (r1 != 0) goto L8a
                r7.f39776a = r5
                goto L6a
            L8a:
                kotlin.jvm.internal.AbstractC4862t.b(r1)
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                fc.C4022e.a(r1, r5)
                goto L6a
            L93:
                java.lang.Object r5 = r7.f39776a
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 != 0) goto L9c
                fc.H r5 = fc.C4015H.f34254a
                return r5
            L9c:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: g1.C4098h.a.c(java.util.List, g1.C, lc.e):java.lang.Object");
        }

        public a() {
        }
    }
}
