package X6;

/* JADX INFO: renamed from: X6.e2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2375e2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f18795g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P f18797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f18799d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f18800e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f18801f = null;

    public /* synthetic */ C2375e2(String str, Object obj, Object obj2, P p10, byte[] bArr) {
        this.f18796a = str;
        this.f18798c = obj;
        this.f18797b = p10;
    }

    public final String a() {
        return this.f18796a;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f18799d
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L7
            return r4
        L7:
            X6.f r4 = X6.Y1.f18654a
            if (r4 != 0) goto Le
            java.lang.Object r3 = r3.f18798c
            return r3
        Le:
            java.lang.Object r4 = X6.C2375e2.f18795g
            monitor-enter(r4)
            boolean r0 = X6.C2380f.a()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.f18801f     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L20
            java.lang.Object r3 = r3.f18798c     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r3 = move-exception
            goto L66
        L20:
            java.lang.Object r3 = r3.f18801f     // Catch: java.lang.Throwable -> L1e
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            return r3
        L24:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            java.util.List r4 = X6.AbstractC2383f2.b()     // Catch: java.lang.SecurityException -> L5a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.SecurityException -> L5a
        L2d:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L5a
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r4.next()     // Catch: java.lang.SecurityException -> L5a
            X6.e2 r0 = (X6.C2375e2) r0     // Catch: java.lang.SecurityException -> L5a
            boolean r1 = X6.C2380f.a()     // Catch: java.lang.SecurityException -> L5a
            if (r1 != 0) goto L52
            r1 = 0
            X6.P r2 = r0.f18797b     // Catch: java.lang.IllegalStateException -> L48 java.lang.SecurityException -> L5a
            if (r2 == 0) goto L48
            java.lang.Object r1 = r2.zza()     // Catch: java.lang.IllegalStateException -> L48 java.lang.SecurityException -> L5a
        L48:
            java.lang.Object r2 = X6.C2375e2.f18795g     // Catch: java.lang.SecurityException -> L5a
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L5a
            r0.f18801f = r1     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            goto L2d
        L4f:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            throw r4     // Catch: java.lang.SecurityException -> L5a
        L52:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L5a
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch: java.lang.SecurityException -> L5a
            throw r4     // Catch: java.lang.SecurityException -> L5a
        L5a:
            X6.P r4 = r3.f18797b
            if (r4 != 0) goto L61
        L5e:
            java.lang.Object r3 = r3.f18798c
            goto L65
        L61:
            java.lang.Object r3 = r4.zza()     // Catch: java.lang.Throwable -> L5e
        L65:
            return r3
        L66:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            throw r3
        L68:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2375e2.b(java.lang.Object):java.lang.Object");
    }
}
