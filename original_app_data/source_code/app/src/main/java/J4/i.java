package J4;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC4854k;
import lc.InterfaceC4988e;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f6151e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f6154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AtomicInteger f6155d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f6156j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f6157k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f6158l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f6160n;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f6158l = obj;
            this.f6160n |= Integer.MIN_VALUE;
            return i.this.a(null, this);
        }
    }

    public i() {
        this(0, 0, 0.0d, 7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(vc.l r7, lc.InterfaceC4988e r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof J4.i.b
            if (r0 == 0) goto L13
            r0 = r8
            J4.i$b r0 = (J4.i.b) r0
            int r1 = r0.f6160n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6160n = r1
            goto L18
        L13:
            J4.i$b r0 = new J4.i$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6158l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f6160n
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f6157k
            r7 = r6
            vc.l r7 = (vc.l) r7
            java.lang.Object r6 = r0.f6156j
            J4.i r6 = (J4.i) r6
            fc.AbstractC4036s.b(r8)
            goto L5f
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            fc.AbstractC4036s.b(r8)
            boolean r8 = r6.b()
            if (r8 != 0) goto L4e
            r6 = 0
            java.lang.Boolean r6 = nc.AbstractC5158b.a(r6)
            r7.invoke(r6)
            fc.H r6 = fc.C4015H.f34254a
            return r6
        L4e:
            long r4 = r6.c()
            r0.f6156j = r6
            r0.f6157k = r7
            r0.f6160n = r3
            java.lang.Object r8 = Rd.X.a(r4, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            java.lang.Boolean r8 = nc.AbstractC5158b.a(r3)
            r7.invoke(r8)
            java.util.concurrent.atomic.AtomicInteger r6 = r6.f6155d
            r6.incrementAndGet()
            fc.H r6 = fc.C4015H.f34254a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: J4.i.a(vc.l, lc.e):java.lang.Object");
    }

    public final boolean b() {
        return this.f6155d.get() < this.f6152a;
    }

    public final long c() {
        return (long) (((double) this.f6153b) * Math.pow(this.f6154c, this.f6155d.get()));
    }

    public final long d() {
        return Bc.k.h(60000, this.f6153b * ((int) Math.pow(this.f6154c, this.f6152a + 1)));
    }

    public final int e() {
        return this.f6152a;
    }

    public final void f() {
        this.f6155d.set(0);
    }

    public i(int i10, int i11, double d10) {
        this.f6152a = i10;
        this.f6153b = i11;
        this.f6154c = d10;
        this.f6155d = new AtomicInteger(0);
    }

    public /* synthetic */ i(int i10, int i11, double d10, int i12, AbstractC4854k abstractC4854k) {
        this((i12 & 1) != 0 ? 5 : i10, (i12 & 2) != 0 ? 1000 : i11, (i12 & 4) != 0 ? 2.0d : d10);
    }
}
