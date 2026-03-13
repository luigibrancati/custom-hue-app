package d3;

import android.database.SQLException;
import b3.C;
import b3.D;
import c3.AbstractC2942d;
import fc.C4025h;
import gc.C4199l;
import java.util.concurrent.atomic.AtomicBoolean;
import k3.AbstractC4791a;
import k3.InterfaceC4792b;
import k3.InterfaceC4794d;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.AbstractC5158b;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class o implements D, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f33059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f33060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4199l f33061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f33062d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements InterfaceC4794d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC4794d f33063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f33064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f33065c;

        public a(o oVar, InterfaceC4794d delegate) {
            AbstractC4862t.e(delegate, "delegate");
            this.f33065c = oVar;
            this.f33063a = delegate;
            this.f33064b = AbstractC2942d.b();
        }

        @Override // k3.InterfaceC4794d
        public String K0(int i10) {
            if (this.f33065c.m()) {
                AbstractC4791a.b(21, "Statement is recycled");
                throw new C4025h();
            }
            if (this.f33064b == AbstractC2942d.b()) {
                return this.f33063a.K0(i10);
            }
            AbstractC4791a.b(21, "Attempted to use statement on a different thread");
            throw new C4025h();
        }

        @Override // k3.InterfaceC4794d
        public void N(int i10, String value) {
            AbstractC4862t.e(value, "value");
            if (this.f33065c.m()) {
                AbstractC4791a.b(21, "Statement is recycled");
                throw new C4025h();
            }
            if (this.f33064b == AbstractC2942d.b()) {
                this.f33063a.N(i10, value);
            } else {
                AbstractC4791a.b(21, "Attempted to use statement on a different thread");
                throw new C4025h();
            }
        }

        @Override // k3.InterfaceC4794d
        public boolean X0() {
            if (this.f33065c.m()) {
                AbstractC4791a.b(21, "Statement is recycled");
                throw new C4025h();
            }
            if (this.f33064b == AbstractC2942d.b()) {
                return this.f33063a.X0();
            }
            AbstractC4791a.b(21, "Attempted to use statement on a different thread");
            throw new C4025h();
        }

        @Override // k3.InterfaceC4794d, java.lang.AutoCloseable
        public void close() {
            if (this.f33065c.m()) {
                AbstractC4791a.b(21, "Statement is recycled");
                throw new C4025h();
            }
            if (this.f33064b == AbstractC2942d.b()) {
                this.f33063a.close();
            } else {
                AbstractC4791a.b(21, "Attempted to use statement on a different thread");
                throw new C4025h();
            }
        }

        @Override // k3.InterfaceC4794d
        public byte[] getBlob(int i10) {
            if (this.f33065c.m()) {
                AbstractC4791a.b(21, "Statement is recycled");
                throw new C4025h();
            }
            if (this.f33064b == AbstractC2942d.b()) {
                return this.f33063a.getBlob(i10);
            }
            AbstractC4791a.b(21, "Attempted to use statement on a different thread");
            throw new C4025h();
        }

        @Override // k3.InterfaceC4794d
        public int getColumnCount() {
            if (this.f33065c.m()) {
                AbstractC4791a.b(21, "Statement is recycled");
                throw new C4025h();
            }
            if (this.f33064b == AbstractC2942d.b()) {
                return this.f33063a.getColumnCount();
            }
            AbstractC4791a.b(21, "Attempted to use statement on a different thread");
            throw new C4025h();
        }

        @Override // k3.InterfaceC4794d
        public String getColumnName(int i10) {
            if (this.f33065c.m()) {
                AbstractC4791a.b(21, "Statement is recycled");
                throw new C4025h();
            }
            if (this.f33064b == AbstractC2942d.b()) {
                return this.f33063a.getColumnName(i10);
            }
            AbstractC4791a.b(21, "Attempted to use statement on a different thread");
            throw new C4025h();
        }

        @Override // k3.InterfaceC4794d
        public long getLong(int i10) {
            if (this.f33065c.m()) {
                AbstractC4791a.b(21, "Statement is recycled");
                throw new C4025h();
            }
            if (this.f33064b == AbstractC2942d.b()) {
                return this.f33063a.getLong(i10);
            }
            AbstractC4791a.b(21, "Attempted to use statement on a different thread");
            throw new C4025h();
        }

        @Override // k3.InterfaceC4794d
        public boolean isNull(int i10) {
            if (this.f33065c.m()) {
                AbstractC4791a.b(21, "Statement is recycled");
                throw new C4025h();
            }
            if (this.f33064b == AbstractC2942d.b()) {
                return this.f33063a.isNull(i10);
            }
            AbstractC4791a.b(21, "Attempted to use statement on a different thread");
            throw new C4025h();
        }

        @Override // k3.InterfaceC4794d
        public void r(int i10, long j10) {
            if (this.f33065c.m()) {
                AbstractC4791a.b(21, "Statement is recycled");
                throw new C4025h();
            }
            if (this.f33064b == AbstractC2942d.b()) {
                this.f33063a.r(i10, j10);
            } else {
                AbstractC4791a.b(21, "Attempted to use statement on a different thread");
                throw new C4025h();
            }
        }

        @Override // k3.InterfaceC4794d
        public void reset() {
            if (this.f33065c.m()) {
                AbstractC4791a.b(21, "Statement is recycled");
                throw new C4025h();
            }
            if (this.f33064b == AbstractC2942d.b()) {
                this.f33063a.reset();
            } else {
                AbstractC4791a.b(21, "Attempted to use statement on a different thread");
                throw new C4025h();
            }
        }

        @Override // k3.InterfaceC4794d
        public void s(int i10, byte[] value) {
            AbstractC4862t.e(value, "value");
            if (this.f33065c.m()) {
                AbstractC4791a.b(21, "Statement is recycled");
                throw new C4025h();
            }
            if (this.f33064b == AbstractC2942d.b()) {
                this.f33063a.s(i10, value);
            } else {
                AbstractC4791a.b(21, "Attempted to use statement on a different thread");
                throw new C4025h();
            }
        }

        @Override // k3.InterfaceC4794d
        public void t(int i10) {
            if (this.f33065c.m()) {
                AbstractC4791a.b(21, "Statement is recycled");
                throw new C4025h();
            }
            if (this.f33064b == AbstractC2942d.b()) {
                this.f33063a.t(i10);
            } else {
                AbstractC4791a.b(21, "Attempted to use statement on a different thread");
                throw new C4025h();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b implements C, p {
        public b() {
        }

        @Override // b3.m
        public Object a(String str, vc.l lVar, InterfaceC4988e interfaceC4988e) {
            return o.this.a(str, lVar, interfaceC4988e);
        }

        @Override // d3.p
        public InterfaceC4792b d() {
            return o.this.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f33068b;

        public c(int i10, boolean z10) {
            this.f33067a = i10;
            this.f33068b = z10;
        }

        public final int a() {
            return this.f33067a;
        }

        public final boolean b() {
            return this.f33068b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33069a;

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
            f33069a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f33070j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f33071k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f33072l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f33073m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f33075o;

        public e(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f33073m = obj;
            this.f33075o |= Integer.MIN_VALUE;
            return o.this.i(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f33076j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f33077k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f33078l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f33079m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f33081o;

        public f(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f33079m = obj;
            this.f33081o |= Integer.MIN_VALUE;
            return o.this.j(false, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f33082j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f33083k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f33084l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f33085m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f33087o;

        public g(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f33085m = obj;
            this.f33087o |= Integer.MIN_VALUE;
            return o.this.o(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f33088j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f33089k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f33090l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f33091m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f33092n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f33094p;

        public h(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f33092n = obj;
            this.f33094p |= Integer.MIN_VALUE;
            return o.this.a(null, null, this);
        }
    }

    public o(l delegate, boolean z10) {
        AbstractC4862t.e(delegate, "delegate");
        this.f33059a = delegate;
        this.f33060b = z10;
        this.f33061c = new C4199l();
        this.f33062d = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(b3.D.a r10, vc.p r11, lc.InterfaceC4988e r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof d3.o.g
            if (r0 == 0) goto L13
            r0 = r12
            d3.o$g r0 = (d3.o.g) r0
            int r1 = r0.f33087o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33087o = r1
            goto L18
        L13:
            d3.o$g r0 = new d3.o$g
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f33085m
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f33087o
            r3 = 0
            r4 = 5
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L6c
            if (r2 == r7) goto L5f
            if (r2 == r6) goto L50
            if (r2 == r5) goto L4a
            r9 = 4
            if (r2 == r9) goto L4a
            if (r2 == r4) goto L3a
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            java.lang.Object r9 = r0.f33083k
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            java.lang.Object r10 = r0.f33082j
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            fc.AbstractC4036s.b(r12)     // Catch: android.database.SQLException -> L47
            goto Lc1
        L47:
            r11 = move-exception
            goto Lbc
        L4a:
            java.lang.Object r9 = r0.f33082j
            fc.AbstractC4036s.b(r12)
            return r9
        L50:
            int r9 = r0.f33084l
            java.lang.Object r10 = r0.f33082j
            d3.o r10 = (d3.o) r10
            fc.AbstractC4036s.b(r12)     // Catch: java.lang.Throwable -> L5a
            goto L97
        L5a:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
            goto La7
        L5f:
            java.lang.Object r9 = r0.f33083k
            r11 = r9
            vc.p r11 = (vc.p) r11
            java.lang.Object r9 = r0.f33082j
            d3.o r9 = (d3.o) r9
            fc.AbstractC4036s.b(r12)
            goto L80
        L6c:
            fc.AbstractC4036s.b(r12)
            if (r10 != 0) goto L73
            b3.D$a r10 = b3.D.a.DEFERRED
        L73:
            r0.f33082j = r9
            r0.f33083k = r11
            r0.f33087o = r7
            java.lang.Object r10 = r9.i(r10, r0)
            if (r10 != r1) goto L80
            goto Lb5
        L80:
            d3.o$b r10 = new d3.o$b     // Catch: java.lang.Throwable -> La6
            r10.<init>()     // Catch: java.lang.Throwable -> La6
            r0.f33082j = r9     // Catch: java.lang.Throwable -> La6
            r12 = 0
            r0.f33083k = r12     // Catch: java.lang.Throwable -> La6
            r0.f33084l = r7     // Catch: java.lang.Throwable -> La6
            r0.f33087o = r6     // Catch: java.lang.Throwable -> La6
            java.lang.Object r12 = r11.invoke(r10, r0)     // Catch: java.lang.Throwable -> La6
            if (r12 != r1) goto L95
            goto Lb5
        L95:
            r10 = r9
            r9 = r7
        L97:
            if (r9 == 0) goto L9a
            r3 = r7
        L9a:
            r0.f33082j = r12
            r0.f33087o = r5
            java.lang.Object r9 = r10.j(r3, r0)
            if (r9 != r1) goto La5
            goto Lb5
        La5:
            return r12
        La6:
            r10 = move-exception
        La7:
            throw r10     // Catch: java.lang.Throwable -> La8
        La8:
            r11 = move-exception
            r0.f33082j = r10     // Catch: android.database.SQLException -> Lb8
            r0.f33083k = r11     // Catch: android.database.SQLException -> Lb8
            r0.f33087o = r4     // Catch: android.database.SQLException -> Lb8
            java.lang.Object r9 = r9.j(r3, r0)     // Catch: android.database.SQLException -> Lb8
            if (r9 != r1) goto Lb6
        Lb5:
            return r1
        Lb6:
            r9 = r11
            goto Lc1
        Lb8:
            r9 = move-exception
            r8 = r11
            r11 = r9
            r9 = r8
        Lbc:
            if (r10 == 0) goto Lc2
            fc.C4022e.a(r10, r11)
        Lc1:
            throw r9
        Lc2:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.o.o(b3.D$a, vc.p, lc.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // b3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r7, vc.l r8, lc.InterfaceC4988e r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof d3.o.h
            if (r0 == 0) goto L13
            r0 = r9
            d3.o$h r0 = (d3.o.h) r0
            int r1 = r0.f33094p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33094p = r1
            goto L18
        L13:
            d3.o$h r0 = new d3.o$h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f33092n
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f33094p
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r6 = r0.f33091m
            ae.a r6 = (ae.InterfaceC2687a) r6
            java.lang.Object r7 = r0.f33090l
            r8 = r7
            vc.l r8 = (vc.l) r8
            java.lang.Object r7 = r0.f33089k
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r0.f33088j
            d3.o r0 = (d3.o) r0
            fc.AbstractC4036s.b(r9)
            r9 = r6
            r6 = r0
            goto L77
        L3d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L45:
            fc.AbstractC4036s.b(r9)
            boolean r9 = g(r6)
            r2 = 21
            if (r9 != 0) goto La5
            lc.i r9 = r0.getContext()
            d3.d$a r5 = d3.d.f32997b
            lc.i$b r9 = r9.get(r5)
            d3.d r9 = (d3.d) r9
            if (r9 == 0) goto L9a
            d3.o r9 = r9.b()
            if (r9 != r6) goto L9a
            d3.l r9 = r6.f33059a
            r0.f33088j = r6
            r0.f33089k = r7
            r0.f33090l = r8
            r0.f33091m = r9
            r0.f33094p = r3
            java.lang.Object r0 = r9.a(r4, r0)
            if (r0 != r1) goto L77
            return r1
        L77:
            d3.o$a r0 = new d3.o$a     // Catch: java.lang.Throwable -> L8d
            d3.l r1 = r6.f33059a     // Catch: java.lang.Throwable -> L8d
            k3.d r7 = r1.a1(r7)     // Catch: java.lang.Throwable -> L8d
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r6 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L8f
            tc.AbstractC5877a.a(r0, r4)     // Catch: java.lang.Throwable -> L8d
            r9.h(r4)
            return r6
        L8d:
            r6 = move-exception
            goto L96
        L8f:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L91
        L91:
            r7 = move-exception
            tc.AbstractC5877a.a(r0, r6)     // Catch: java.lang.Throwable -> L8d
            throw r7     // Catch: java.lang.Throwable -> L8d
        L96:
            r9.h(r4)
            throw r6
        L9a:
            java.lang.String r6 = "Attempted to use connection on a different coroutine"
            k3.AbstractC4791a.b(r2, r6)
            fc.h r6 = new fc.h
            r6.<init>()
            throw r6
        La5:
            java.lang.String r6 = "Connection is recycled"
            k3.AbstractC4791a.b(r2, r6)
            fc.h r6 = new fc.h
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.o.a(java.lang.String, vc.l, lc.e):java.lang.Object");
    }

    @Override // b3.D
    public Object b(D.a aVar, vc.p pVar, InterfaceC4988e interfaceC4988e) {
        if (m()) {
            AbstractC4791a.b(21, "Connection is recycled");
            throw new C4025h();
        }
        d3.d dVar = (d3.d) interfaceC4988e.getContext().get(d3.d.f32997b);
        if (dVar != null && dVar.b() == this) {
            return o(aVar, pVar, interfaceC4988e);
        }
        AbstractC4791a.b(21, "Attempted to use connection on a different coroutine");
        throw new C4025h();
    }

    @Override // b3.D
    public Object c(InterfaceC4988e interfaceC4988e) {
        if (m()) {
            AbstractC4791a.b(21, "Connection is recycled");
            throw new C4025h();
        }
        d3.d dVar = (d3.d) interfaceC4988e.getContext().get(d3.d.f32997b);
        if (dVar != null && dVar.b() == this) {
            return AbstractC5158b.a(!this.f33061c.isEmpty());
        }
        AbstractC4791a.b(21, "Attempted to use connection on a different coroutine");
        throw new C4025h();
    }

    @Override // d3.p
    public InterfaceC4792b d() {
        return this.f33059a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(b3.D.a r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof d3.o.e
            if (r0 == 0) goto L13
            r0 = r7
            d3.o$e r0 = (d3.o.e) r0
            int r1 = r0.f33075o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33075o = r1
            goto L18
        L13:
            d3.o$e r0 = new d3.o$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f33073m
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f33075o
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r5 = r0.f33072l
            ae.a r5 = (ae.InterfaceC2687a) r5
            java.lang.Object r6 = r0.f33071k
            b3.D$a r6 = (b3.D.a) r6
            java.lang.Object r0 = r0.f33070j
            d3.o r0 = (d3.o) r0
            fc.AbstractC4036s.b(r7)
            r7 = r5
            r5 = r0
            goto L54
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L40:
            fc.AbstractC4036s.b(r7)
            d3.l r7 = r5.f33059a
            r0.f33070j = r5
            r0.f33071k = r6
            r0.f33072l = r7
            r0.f33075o = r3
            java.lang.Object r0 = r7.a(r4, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            gc.l r0 = r5.f33061c     // Catch: java.lang.Throwable -> L7a
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L7a
            gc.l r1 = r5.f33061c     // Catch: java.lang.Throwable -> L7a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L92
            int[] r1 = d3.o.d.f33069a     // Catch: java.lang.Throwable -> L7a
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L7a
            r6 = r1[r6]     // Catch: java.lang.Throwable -> L7a
            if (r6 == r3) goto L8a
            r1 = 2
            if (r6 == r1) goto L82
            r1 = 3
            if (r6 != r1) goto L7c
            d3.l r6 = r5.f33059a     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "BEGIN EXCLUSIVE TRANSACTION"
            k3.AbstractC4791a.a(r6, r1)     // Catch: java.lang.Throwable -> L7a
            goto Lad
        L7a:
            r5 = move-exception
            goto Lbe
        L7c:
            fc.o r5 = new fc.o     // Catch: java.lang.Throwable -> L7a
            r5.<init>()     // Catch: java.lang.Throwable -> L7a
            throw r5     // Catch: java.lang.Throwable -> L7a
        L82:
            d3.l r6 = r5.f33059a     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "BEGIN IMMEDIATE TRANSACTION"
            k3.AbstractC4791a.a(r6, r1)     // Catch: java.lang.Throwable -> L7a
            goto Lad
        L8a:
            d3.l r6 = r5.f33059a     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "BEGIN DEFERRED TRANSACTION"
            k3.AbstractC4791a.a(r6, r1)     // Catch: java.lang.Throwable -> L7a
            goto Lad
        L92:
            d3.l r6 = r5.f33059a     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r1.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "SAVEPOINT '"
            r1.append(r2)     // Catch: java.lang.Throwable -> L7a
            r1.append(r0)     // Catch: java.lang.Throwable -> L7a
            r2 = 39
            r1.append(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7a
            k3.AbstractC4791a.a(r6, r1)     // Catch: java.lang.Throwable -> L7a
        Lad:
            gc.l r5 = r5.f33061c     // Catch: java.lang.Throwable -> L7a
            d3.o$c r6 = new d3.o$c     // Catch: java.lang.Throwable -> L7a
            r1 = 0
            r6.<init>(r0, r1)     // Catch: java.lang.Throwable -> L7a
            r5.addLast(r6)     // Catch: java.lang.Throwable -> L7a
            fc.H r5 = fc.C4015H.f34254a     // Catch: java.lang.Throwable -> L7a
            r7.h(r4)
            return r5
        Lbe:
            r7.h(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.o.i(b3.D$a, lc.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(boolean r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.o.j(boolean, lc.e):java.lang.Object");
    }

    public final l k() {
        return this.f33059a;
    }

    public final boolean l() {
        return this.f33060b;
    }

    public final boolean m() {
        return this.f33062d.get();
    }

    public final void n() throws Exception {
        if (this.f33062d.compareAndSet(false, true)) {
            try {
                AbstractC4791a.a(this.f33059a, "ROLLBACK TRANSACTION");
            } catch (SQLException unused) {
            }
        }
    }
}
