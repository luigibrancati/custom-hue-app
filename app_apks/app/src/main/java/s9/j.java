package s9;

import Pd.a;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f44372c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f44373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f44374b;

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
        public Object f44375j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f44376k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f44378m;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f44376k = obj;
            this.f44378m |= Integer.MIN_VALUE;
            return j.this.f(this);
        }
    }

    public j(o localOverrideSettings, o remoteSettings) {
        AbstractC4862t.e(localOverrideSettings, "localOverrideSettings");
        AbstractC4862t.e(remoteSettings, "remoteSettings");
        this.f44373a = localOverrideSettings;
        this.f44374b = remoteSettings;
    }

    public final double a() {
        Double dC = this.f44373a.c();
        if (dC != null) {
            double dDoubleValue = dC.doubleValue();
            if (d(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double dC2 = this.f44374b.c();
        if (dC2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = dC2.doubleValue();
        if (d(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    public final long b() {
        Pd.a aVarB = this.f44373a.b();
        if (aVarB != null) {
            long jW = aVarB.W();
            if (e(jW)) {
                return jW;
            }
        }
        Pd.a aVarB2 = this.f44374b.b();
        if (aVarB2 != null) {
            long jW2 = aVarB2.W();
            if (e(jW2)) {
                return jW2;
            }
        }
        a.C0170a c0170a = Pd.a.f13294b;
        return Pd.c.s(30, Pd.d.MINUTES);
    }

    public final boolean c() {
        Boolean boolA = this.f44373a.a();
        if (boolA != null) {
            return boolA.booleanValue();
        }
        Boolean boolA2 = this.f44374b.a();
        if (boolA2 != null) {
            return boolA2.booleanValue();
        }
        return true;
    }

    public final boolean d(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    public final boolean e(long j10) {
        return Pd.a.P(j10) && Pd.a.K(j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r5.d(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(lc.InterfaceC4988e r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof s9.j.b
            if (r0 == 0) goto L13
            r0 = r6
            s9.j$b r0 = (s9.j.b) r0
            int r1 = r0.f44378m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44378m = r1
            goto L18
        L13:
            s9.j$b r0 = new s9.j$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f44376k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f44378m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            fc.AbstractC4036s.b(r6)
            goto L5a
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f44375j
            s9.j r5 = (s9.j) r5
            fc.AbstractC4036s.b(r6)
            goto L4c
        L3c:
            fc.AbstractC4036s.b(r6)
            s9.o r6 = r5.f44373a
            r0.f44375j = r5
            r0.f44378m = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L4c
            goto L59
        L4c:
            s9.o r5 = r5.f44374b
            r6 = 0
            r0.f44375j = r6
            r0.f44378m = r3
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L5a
        L59:
            return r1
        L5a:
            fc.H r5 = fc.C4015H.f34254a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.j.f(lc.e):java.lang.Object");
    }
}
