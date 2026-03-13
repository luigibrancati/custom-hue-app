package Ud;

import Vd.C2319a;
import kotlin.jvm.internal.L;
import lc.InterfaceC4988e;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC2314f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L f17107a;

        public a(L l10) {
            this.f17107a = l10;
        }

        @Override // Ud.InterfaceC2314f
        public Object emit(Object obj, InterfaceC4988e interfaceC4988e) {
            this.f17107a.f39776a = obj;
            throw new C2319a(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f17108j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f17109k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f17110l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f17111m;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f17110l = obj;
            this.f17111m |= Integer.MIN_VALUE;
            return AbstractC2315g.q(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements InterfaceC2314f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L f17112a;

        public c(L l10) {
            this.f17112a = l10;
        }

        @Override // Ud.InterfaceC2314f
        public Object emit(Object obj, InterfaceC4988e interfaceC4988e) {
            this.f17112a.f39776a = obj;
            throw new C2319a(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f17113j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f17114k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f17115l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f17116m;

        public d(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f17115l = obj;
            this.f17116m |= Integer.MIN_VALUE;
            return AbstractC2315g.r(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(Ud.InterfaceC2313e r4, lc.InterfaceC4988e r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof Ud.s.b
            if (r0 == 0) goto L13
            r0 = r5
            Ud.s$b r0 = (Ud.s.b) r0
            int r1 = r0.f17111m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17111m = r1
            goto L18
        L13:
            Ud.s$b r0 = new Ud.s$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f17110l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f17111m
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f17109k
            Ud.s$a r4 = (Ud.s.a) r4
            java.lang.Object r1 = r0.f17108j
            kotlin.jvm.internal.L r1 = (kotlin.jvm.internal.L) r1
            fc.AbstractC4036s.b(r5)     // Catch: Vd.C2319a -> L31
            goto L69
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            fc.AbstractC4036s.b(r5)
            kotlin.jvm.internal.L r5 = new kotlin.jvm.internal.L
            r5.<init>()
            Wd.E r2 = Vd.t.f17583a
            r5.f39776a = r2
            Ud.s$a r2 = new Ud.s$a
            r2.<init>(r5)
            r0.f17108j = r5     // Catch: Vd.C2319a -> L5b
            r0.f17109k = r2     // Catch: Vd.C2319a -> L5b
            r0.f17111m = r3     // Catch: Vd.C2319a -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: Vd.C2319a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r1 = r5
            goto L69
        L5b:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L5f:
            Vd.p.a(r5, r4)
            lc.i r4 = r0.getContext()
            Rd.C0.k(r4)
        L69:
            java.lang.Object r4 = r1.f39776a
            Wd.E r5 = Vd.t.f17583a
            if (r4 == r5) goto L70
            return r4
        L70:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Ud.s.a(Ud.e, lc.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(Ud.InterfaceC2313e r4, lc.InterfaceC4988e r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof Ud.s.d
            if (r0 == 0) goto L13
            r0 = r5
            Ud.s$d r0 = (Ud.s.d) r0
            int r1 = r0.f17116m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17116m = r1
            goto L18
        L13:
            Ud.s$d r0 = new Ud.s$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f17115l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f17116m
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f17114k
            Ud.s$c r4 = (Ud.s.c) r4
            java.lang.Object r1 = r0.f17113j
            kotlin.jvm.internal.L r1 = (kotlin.jvm.internal.L) r1
            fc.AbstractC4036s.b(r5)     // Catch: Vd.C2319a -> L31
            goto L65
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            fc.AbstractC4036s.b(r5)
            kotlin.jvm.internal.L r5 = new kotlin.jvm.internal.L
            r5.<init>()
            Ud.s$c r2 = new Ud.s$c
            r2.<init>(r5)
            r0.f17113j = r5     // Catch: Vd.C2319a -> L57
            r0.f17114k = r2     // Catch: Vd.C2319a -> L57
            r0.f17116m = r3     // Catch: Vd.C2319a -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: Vd.C2319a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r1 = r5
            goto L65
        L57:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L5b:
            Vd.p.a(r5, r4)
            lc.i r4 = r0.getContext()
            Rd.C0.k(r4)
        L65:
            java.lang.Object r4 = r1.f39776a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Ud.s.b(Ud.e, lc.e):java.lang.Object");
    }
}
