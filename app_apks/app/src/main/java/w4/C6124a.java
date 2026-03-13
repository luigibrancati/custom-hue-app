package w4;

import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.AbstractC5160d;
import y4.C6402f;

/* JADX INFO: renamed from: w4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6124a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6402f f46152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6402f f46153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A4.a f46154c;

    /* JADX INFO: renamed from: w4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0633a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f46155j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f46156k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f46158m;

        public C0633a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f46156k = obj;
            this.f46158m |= Integer.MIN_VALUE;
            return C6124a.this.d(this);
        }
    }

    /* JADX INFO: renamed from: w4.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f46159j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f46160k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f46161l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f46162m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f46163n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f46164o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f46165p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f46166q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f46168s;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f46166q = obj;
            this.f46168s |= Integer.MIN_VALUE;
            return C6124a.this.e(this);
        }
    }

    /* JADX INFO: renamed from: w4.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f46169j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f46170k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f46171l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f46173n;

        public c(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f46171l = obj;
            this.f46173n |= Integer.MIN_VALUE;
            return C6124a.this.f(null, this);
        }
    }

    /* JADX INFO: renamed from: w4.a$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f46174j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f46175k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f46177m;

        public d(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f46175k = obj;
            this.f46177m |= Integer.MIN_VALUE;
            return C6124a.this.g(this);
        }
    }

    public C6124a(C6402f source, C6402f destination, A4.a logger) {
        AbstractC4862t.e(source, "source");
        AbstractC4862t.e(destination, "destination");
        AbstractC4862t.e(logger, "logger");
        this.f46152a = source;
        this.f46153b = destination;
        this.f46154c = logger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r5.g(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(lc.InterfaceC4988e r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof w4.C6124a.C0633a
            if (r0 == 0) goto L13
            r0 = r6
            w4.a$a r0 = (w4.C6124a.C0633a) r0
            int r1 = r0.f46158m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46158m = r1
            goto L18
        L13:
            w4.a$a r0 = new w4.a$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f46156k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f46158m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            fc.AbstractC4036s.b(r6)
            goto L56
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f46155j
            w4.a r5 = (w4.C6124a) r5
            fc.AbstractC4036s.b(r6)
            goto L4a
        L3c:
            fc.AbstractC4036s.b(r6)
            r0.f46155j = r5
            r0.f46158m = r4
            java.lang.Object r6 = r5.e(r0)
            if (r6 != r1) goto L4a
            goto L55
        L4a:
            r6 = 0
            r0.f46155j = r6
            r0.f46158m = r3
            java.lang.Object r5 = r5.g(r0)
            if (r5 != r1) goto L56
        L55:
            return r1
        L56:
            fc.H r5 = fc.C4015H.f34254a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.C6124a.d(lc.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01aa, code lost:
    
        if (r0.c(r2) == r3) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb A[Catch: Exception -> 0x003b, TryCatch #1 {Exception -> 0x003b, blocks: (B:15:0x0036, B:52:0x0103, B:54:0x0109, B:61:0x0133, B:62:0x0160, B:45:0x00c4, B:47:0x00cb, B:51:0x00ee, B:63:0x0191, B:34:0x0091, B:40:0x00a6, B:42:0x00b7, B:44:0x00bf, B:37:0x0098), top: B:71:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109 A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #1 {Exception -> 0x003b, blocks: (B:15:0x0036, B:52:0x0103, B:54:0x0109, B:61:0x0133, B:62:0x0160, B:45:0x00c4, B:47:0x00cb, B:51:0x00ee, B:63:0x0191, B:34:0x0091, B:40:0x00a6, B:42:0x00b7, B:44:0x00bf, B:37:0x0098), top: B:71:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0191 A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #1 {Exception -> 0x003b, blocks: (B:15:0x0036, B:52:0x0103, B:54:0x0109, B:61:0x0133, B:62:0x0160, B:45:0x00c4, B:47:0x00cb, B:51:0x00ee, B:63:0x0191, B:34:0x0091, B:40:0x00a6, B:42:0x00b7, B:44:0x00bf, B:37:0x0098), top: B:71:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ee -> B:52:0x0103). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0133 -> B:52:0x0103). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(lc.InterfaceC4988e r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.C6124a.e(lc.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        if (r2.k(r9, r10, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        if (r10.n(r9, r0) != r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(D4.f.a r9, lc.InterfaceC4988e r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.C6124a.f(D4.f$a, lc.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        if (r4.f(r5, r0) != r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[PHI: r4
      0x0081: PHI (r4v4 'this' w4.a) = (r4v1 'this' w4.a), (r4v6 'this' w4.a) binds: [B:23:0x007e, B:17:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[PHI: r4
      0x008f: PHI (r4v7 'this' w4.a) = (r4v4 'this' w4.a), (r4v9 'this' w4.a) binds: [B:26:0x008c, B:16:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d A[PHI: r4
      0x009d: PHI (r4v10 'this' w4.a) = (r4v7 'this' w4.a), (r4v12 'this' w4.a) binds: [B:29:0x009a, B:15:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[PHI: r4
      0x00ab: PHI (r4v13 'this' w4.a) = (r4v10 'this' w4.a), (r4v15 'this' w4.a) binds: [B:32:0x00a8, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[PHI: r4
      0x00b9: PHI (r4v16 'this' w4.a) = (r4v13 'this' w4.a), (r4v19 'this' w4.a) binds: [B:35:0x00b6, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(lc.InterfaceC4988e r5) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.C6124a.g(lc.e):java.lang.Object");
    }
}
