package e3;

import b3.C;
import b3.D;
import d3.p;
import k3.InterfaceC4792b;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.AbstractC5158b;
import nc.AbstractC5160d;
import tc.AbstractC5877a;
import vc.l;

/* JADX INFO: renamed from: e3.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3930d implements D, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3927a f33673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D.a f33674b;

    /* JADX INFO: renamed from: e3.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements C, p {
        public a() {
        }

        @Override // b3.m
        public Object a(String str, l lVar, InterfaceC4988e interfaceC4988e) {
            return C3930d.this.a(str, lVar, interfaceC4988e);
        }

        @Override // d3.p
        public InterfaceC4792b d() {
            return C3930d.this.d();
        }
    }

    /* JADX INFO: renamed from: e3.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33676a;

        static {
            int[] iArr = new int[D.a.values().length];
            try {
                iArr[D.a.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[D.a.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[D.a.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f33676a = iArr;
        }
    }

    /* JADX INFO: renamed from: e3.d$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f33677j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f33678k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f33679l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f33681n;

        public c(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f33679l = obj;
            this.f33681n |= Integer.MIN_VALUE;
            return C3930d.this.f(null, null, this);
        }
    }

    public C3930d(C3927a delegate) {
        AbstractC4862t.e(delegate, "delegate");
        this.f33673a = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(b3.D.a r7, vc.p r8, lc.InterfaceC4988e r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof e3.C3930d.c
            if (r0 == 0) goto L13
            r0 = r9
            e3.d$c r0 = (e3.C3930d.c) r0
            int r1 = r0.f33681n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33681n = r1
            goto L18
        L13:
            e3.d$c r0 = new e3.d$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f33679l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f33681n
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r6 = r0.f33678k
            l3.c r6 = (l3.InterfaceC4877c) r6
            java.lang.Object r7 = r0.f33677j
            e3.d r7 = (e3.C3930d) r7
            fc.AbstractC4036s.b(r9)     // Catch: java.lang.Throwable -> L32
            goto L84
        L32:
            r8 = move-exception
            goto L96
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            fc.AbstractC4036s.b(r9)
            e3.a r9 = r6.f33673a
            l3.c r9 = r9.a()
            boolean r2 = r9.R0()
            if (r2 != 0) goto L4d
            r6.f33674b = r7
        L4d:
            int[] r2 = e3.C3930d.b.f33676a
            int r7 = r7.ordinal()
            r7 = r2[r7]
            if (r7 == r4) goto L6b
            r2 = 2
            if (r7 == r2) goto L67
            r2 = 3
            if (r7 != r2) goto L61
            r9.v()
            goto L6e
        L61:
            fc.o r6 = new fc.o
            r6.<init>()
            throw r6
        L67:
            r9.R()
            goto L6e
        L6b:
            r9.y0()
        L6e:
            e3.d$a r7 = new e3.d$a     // Catch: java.lang.Throwable -> L93
            r7.<init>()     // Catch: java.lang.Throwable -> L93
            r0.f33677j = r6     // Catch: java.lang.Throwable -> L93
            r0.f33678k = r9     // Catch: java.lang.Throwable -> L93
            r0.f33681n = r4     // Catch: java.lang.Throwable -> L93
            java.lang.Object r7 = r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> L93
            if (r7 != r1) goto L80
            return r1
        L80:
            r5 = r7
            r7 = r6
            r6 = r9
            r9 = r5
        L84:
            r6.P()     // Catch: java.lang.Throwable -> L32
            r6.V()
            boolean r6 = r6.R0()
            if (r6 != 0) goto L92
            r7.f33674b = r3
        L92:
            return r9
        L93:
            r8 = move-exception
            r7 = r6
            r6 = r9
        L96:
            r6.V()
            boolean r6 = r6.R0()
            if (r6 != 0) goto La1
            r7.f33674b = r3
        La1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.C3930d.f(b3.D$a, vc.p, lc.e):java.lang.Object");
    }

    @Override // b3.m
    public Object a(String str, l lVar, InterfaceC4988e interfaceC4988e) throws Exception {
        AbstractC3931e abstractC3931eA1 = this.f33673a.a1(str);
        try {
            Object objInvoke = lVar.invoke(abstractC3931eA1);
            AbstractC5877a.a(abstractC3931eA1, null);
            return objInvoke;
        } finally {
        }
    }

    @Override // b3.D
    public Object b(D.a aVar, vc.p pVar, InterfaceC4988e interfaceC4988e) {
        return f(aVar, pVar, interfaceC4988e);
    }

    @Override // b3.D
    public Object c(InterfaceC4988e interfaceC4988e) {
        return AbstractC5158b.a(this.f33673a.a().R0());
    }

    @Override // d3.p
    public InterfaceC4792b d() {
        return this.f33673a;
    }
}
