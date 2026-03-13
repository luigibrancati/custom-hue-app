package g1;

import ae.AbstractC2693g;
import ae.InterfaceC2687a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.AbstractC5160d;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: g1.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4115y implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f35103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4087W f35104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4069D f35105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC6082a f35106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f35107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC2687a f35108f;

    /* JADX INFO: renamed from: g1.y$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f35109j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f35110k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f35111l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f35113n;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f35111l = obj;
            this.f35113n |= Integer.MIN_VALUE;
            return C4115y.this.b(null, this);
        }
    }

    /* JADX INFO: renamed from: g1.y$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f35114j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f35115k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f35116l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f35117m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f35119o;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f35117m = obj;
            this.f35119o |= Integer.MIN_VALUE;
            return C4115y.this.d(null, this);
        }
    }

    public C4115y(File file, InterfaceC4087W serializer, InterfaceC4069D coordinator, InterfaceC6082a onClose) {
        AbstractC4862t.e(file, "file");
        AbstractC4862t.e(serializer, "serializer");
        AbstractC4862t.e(coordinator, "coordinator");
        AbstractC4862t.e(onClose, "onClose");
        this.f35103a = file;
        this.f35104b = serializer;
        this.f35105c = coordinator;
        this.f35106d = onClose;
        this.f35107e = new AtomicBoolean(false);
        this.f35108f = AbstractC2693g.b(false, 1, null);
    }

    private final void f() {
        if (this.f35107e.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074 A[Catch: all -> 0x0075, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0075, blocks: (B:31:0x0074, B:40:0x0084, B:39:0x0081, B:36:0x007c), top: B:52:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v0, types: [vc.q] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // g1.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(vc.q r9, lc.InterfaceC4988e r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof g1.C4115y.a
            if (r0 == 0) goto L13
            r0 = r10
            g1.y$a r0 = (g1.C4115y.a) r0
            int r1 = r0.f35113n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35113n = r1
            goto L18
        L13:
            g1.y$a r0 = new g1.y$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f35111l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f35113n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            boolean r9 = r0.f35109j
            java.lang.Object r0 = r0.f35110k
            g1.c r0 = (g1.InterfaceC4093c) r0
            fc.AbstractC4036s.b(r10)     // Catch: java.lang.Throwable -> L30
            goto L64
        L30:
            r10 = move-exception
            goto L7c
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            fc.AbstractC4036s.b(r10)
            r8.f()
            ae.a r10 = r8.f35108f
            boolean r10 = ae.InterfaceC2687a.C0267a.b(r10, r4, r3, r4)
            g1.u r2 = new g1.u     // Catch: java.lang.Throwable -> L85
            java.io.File r5 = r8.f35103a     // Catch: java.lang.Throwable -> L85
            g1.W r6 = r8.f35104b     // Catch: java.lang.Throwable -> L85
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L85
            java.lang.Boolean r5 = nc.AbstractC5158b.a(r10)     // Catch: java.lang.Throwable -> L77
            r0.f35110k = r2     // Catch: java.lang.Throwable -> L77
            r0.f35109j = r10     // Catch: java.lang.Throwable -> L77
            r0.f35113n = r3     // Catch: java.lang.Throwable -> L77
            java.lang.Object r9 = r9.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L77
            if (r9 != r1) goto L60
            return r1
        L60:
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r2
        L64:
            r0.close()     // Catch: java.lang.Throwable -> L69
            r0 = r4
            goto L6a
        L69:
            r0 = move-exception
        L6a:
            if (r0 != 0) goto L74
            if (r9 == 0) goto L73
            ae.a r8 = r8.f35108f
            ae.InterfaceC2687a.C0267a.c(r8, r4, r3, r4)
        L73:
            return r10
        L74:
            throw r0     // Catch: java.lang.Throwable -> L75
        L75:
            r10 = move-exception
            goto L89
        L77:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r2
        L7c:
            r0.close()     // Catch: java.lang.Throwable -> L80
            goto L84
        L80:
            r0 = move-exception
            fc.C4022e.a(r10, r0)     // Catch: java.lang.Throwable -> L75
        L84:
            throw r10     // Catch: java.lang.Throwable -> L75
        L85:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L89:
            if (r9 == 0) goto L90
            ae.a r8 = r8.f35108f
            ae.InterfaceC2687a.C0267a.c(r8, r4, r3, r4)
        L90:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C4115y.b(vc.q, lc.e):java.lang.Object");
    }

    @Override // g1.d0
    public InterfaceC4069D c() {
        return this.f35105c;
    }

    @Override // g1.InterfaceC4093c
    public void close() {
        this.f35107e.set(true);
        this.f35106d.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[Catch: all -> 0x00e0, IOException -> 0x00e3, TRY_ENTER, TryCatch #1 {all -> 0x00e0, blocks: (B:34:0x00ab, B:36:0x00b1, B:39:0x00ba, B:40:0x00df, B:45:0x00e7, B:48:0x00ef, B:55:0x00fc, B:54:0x00f9), top: B:67:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef A[Catch: all -> 0x00e0, IOException -> 0x00e3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e0, blocks: (B:34:0x00ab, B:36:0x00b1, B:39:0x00ba, B:40:0x00df, B:45:0x00e7, B:48:0x00ef, B:55:0x00fc, B:54:0x00f9), top: B:67:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [ae.a] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [ae.a] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    @Override // g1.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(vc.p r8, lc.InterfaceC4988e r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C4115y.d(vc.p, lc.e):java.lang.Object");
    }

    public final void g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }
}
