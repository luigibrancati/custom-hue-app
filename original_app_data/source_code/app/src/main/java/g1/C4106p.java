package g1;

import Ud.InterfaceC2313e;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: g1.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4106p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ud.w f35087a;

    public C4106p() {
        f0 f0Var = f0.f34917b;
        AbstractC4862t.c(f0Var, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f35087a = Ud.G.a(f0Var);
    }

    public final b0 a() {
        return (b0) this.f35087a.getValue();
    }

    public final InterfaceC2313e b() {
        return this.f35087a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final g1.b0 c(g1.b0 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.AbstractC4862t.e(r5, r0)
            Ud.w r4 = r4.f35087a
        L7:
            java.lang.Object r0 = r4.getValue()
            r1 = r0
            g1.b0 r1 = (g1.b0) r1
            boolean r2 = r1 instanceof g1.C4084T
            if (r2 != 0) goto L44
            g1.f0 r2 = g1.f0.f34917b
            boolean r2 = kotlin.jvm.internal.AbstractC4862t.a(r1, r2)
            if (r2 == 0) goto L1b
            goto L44
        L1b:
            boolean r2 = r1 instanceof g1.C4096f
            if (r2 == 0) goto L2d
            int r2 = r5.a()
            r3 = r1
            g1.f r3 = (g1.C4096f) r3
            int r3 = r3.a()
            if (r2 <= r3) goto L45
            goto L44
        L2d:
            boolean r2 = r1 instanceof g1.C4067B
            if (r2 == 0) goto L32
            goto L45
        L32:
            boolean r4 = r1 instanceof g1.C4083S
            if (r4 == 0) goto L3e
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r4.<init>(r5)
            throw r4
        L3e:
            fc.o r4 = new fc.o
            r4.<init>()
            throw r4
        L44:
            r1 = r5
        L45:
            boolean r0 = r4.c(r0, r1)
            if (r0 == 0) goto L7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C4106p.c(g1.b0):g1.b0");
    }
}
