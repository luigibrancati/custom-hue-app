package g1;

import Ud.AbstractC2315g;
import Ud.InterfaceC2313e;
import Ud.InterfaceC2314f;
import ae.AbstractC2693g;
import ae.InterfaceC2687a;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements InterfaceC4069D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2687a f34897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4092b f34898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2313e f34899d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f34900j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f34901k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f34902l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f34904n;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f34902l = obj;
            this.f34904n |= Integer.MIN_VALUE;
            return a0.this.d(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f34905j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f34906k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f34907l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f34909n;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f34907l = obj;
            this.f34909n |= Integer.MIN_VALUE;
            return a0.this.e(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f34910j;

        public c(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
            return ((c) create(interfaceC2314f, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new c(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f34910j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            return C4015H.f34254a;
        }
    }

    public a0(String filePath) {
        AbstractC4862t.e(filePath, "filePath");
        this.f34896a = filePath;
        this.f34897b = AbstractC2693g.b(false, 1, null);
        this.f34898c = new C4092b(0);
        this.f34899d = AbstractC2315g.s(new c(null));
    }

    @Override // g1.InterfaceC4069D
    public Object a(InterfaceC4988e interfaceC4988e) {
        return AbstractC5158b.c(this.f34898c.b());
    }

    @Override // g1.InterfaceC4069D
    public InterfaceC2313e b() {
        return this.f34899d;
    }

    @Override // g1.InterfaceC4069D
    public Object c(InterfaceC4988e interfaceC4988e) {
        return AbstractC5158b.c(this.f34898c.d());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [g1.a0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [ae.a] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4, types: [ae.a] */
    @Override // g1.InterfaceC4069D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(vc.l r7, lc.InterfaceC4988e r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof g1.a0.a
            if (r0 == 0) goto L13
            r0 = r8
            g1.a0$a r0 = (g1.a0.a) r0
            int r1 = r0.f34904n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34904n = r1
            goto L18
        L13:
            g1.a0$a r0 = new g1.a0$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f34902l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f34904n
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f34900j
            ae.a r6 = (ae.InterfaceC2687a) r6
            fc.AbstractC4036s.b(r8)     // Catch: java.lang.Throwable -> L31
            goto L66
        L31:
            r7 = move-exception
            goto L6a
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            java.lang.Object r6 = r0.f34901k
            ae.a r6 = (ae.InterfaceC2687a) r6
            java.lang.Object r7 = r0.f34900j
            vc.l r7 = (vc.l) r7
            fc.AbstractC4036s.b(r8)
            goto L59
        L47:
            fc.AbstractC4036s.b(r8)
            ae.a r6 = r6.f34897b
            r0.f34900j = r7
            r0.f34901k = r6
            r0.f34904n = r4
            java.lang.Object r8 = r6.a(r5, r0)
            if (r8 != r1) goto L59
            goto L65
        L59:
            r0.f34900j = r6     // Catch: java.lang.Throwable -> L31
            r0.f34901k = r5     // Catch: java.lang.Throwable -> L31
            r0.f34904n = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L31
            if (r8 != r1) goto L66
        L65:
            return r1
        L66:
            r6.h(r5)
            return r8
        L6a:
            r6.h(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.a0.d(vc.l, lc.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // g1.InterfaceC4069D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(vc.p r7, lc.InterfaceC4988e r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof g1.a0.b
            if (r0 == 0) goto L13
            r0 = r8
            g1.a0$b r0 = (g1.a0.b) r0
            int r1 = r0.f34909n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34909n = r1
            goto L18
        L13:
            g1.a0$b r0 = new g1.a0$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f34907l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f34909n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            boolean r6 = r0.f34906k
            java.lang.Object r7 = r0.f34905j
            ae.a r7 = (ae.InterfaceC2687a) r7
            fc.AbstractC4036s.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L58
        L30:
            r8 = move-exception
            goto L63
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            fc.AbstractC4036s.b(r8)
            ae.a r6 = r6.f34897b
            boolean r8 = r6.f(r4)
            java.lang.Boolean r2 = nc.AbstractC5158b.a(r8)     // Catch: java.lang.Throwable -> L5e
            r0.f34905j = r6     // Catch: java.lang.Throwable -> L5e
            r0.f34906k = r8     // Catch: java.lang.Throwable -> L5e
            r0.f34909n = r3     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L5e
            if (r7 != r1) goto L54
            return r1
        L54:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L58:
            if (r6 == 0) goto L5d
            r7.h(r4)
        L5d:
            return r8
        L5e:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L63:
            if (r6 == 0) goto L68
            r7.h(r4)
        L68:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.a0.e(vc.p, lc.e):java.lang.Object");
    }
}
