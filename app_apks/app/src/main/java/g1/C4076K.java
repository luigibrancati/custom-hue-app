package g1;

import Rd.AbstractC2128g;
import Ud.InterfaceC2313e;
import ae.AbstractC2693g;
import ae.InterfaceC2687a;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4029l;
import fc.InterfaceC4028k;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;
import nc.AbstractC5158b;
import nc.AbstractC5160d;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: g1.K, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4076K implements InterfaceC4069D {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f34822j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f34823k = "Resource deadlock would occur";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f34824l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f34825m = 60000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4992i f34826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f34827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2313e f34828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f34829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f34830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f34831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC2687a f34832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC4028k f34833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC4028k f34834i;

    /* JADX INFO: renamed from: g1.K$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: g1.K$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0452a extends AbstractC5160d {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Object f34835j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public long f34836k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f34837l;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f34839n;

            public C0452a(InterfaceC4988e interfaceC4988e) {
                super(interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) {
                this.f34837l = obj;
                this.f34839n |= Integer.MIN_VALUE;
                return a.this.b(null, this);
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007c -> B:27:0x007f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(java.io.FileOutputStream r13, lc.InterfaceC4988e r14) throws java.lang.Throwable {
            /*
                r12 = this;
                boolean r0 = r14 instanceof g1.C4076K.a.C0452a
                if (r0 == 0) goto L13
                r0 = r14
                g1.K$a$a r0 = (g1.C4076K.a.C0452a) r0
                int r1 = r0.f34839n
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f34839n = r1
                goto L18
            L13:
                g1.K$a$a r0 = new g1.K$a$a
                r0.<init>(r14)
            L18:
                java.lang.Object r12 = r0.f34837l
                java.lang.Object r14 = mc.C5046c.f()
                int r1 = r0.f34839n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L39
                if (r1 != r3) goto L31
                long r4 = r0.f34836k
                java.lang.Object r13 = r0.f34835j
                java.io.FileOutputStream r13 = (java.io.FileOutputStream) r13
                fc.AbstractC4036s.b(r12)
                r12 = r0
                goto L7f
            L31:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L39:
                fc.AbstractC4036s.b(r12)
                long r4 = g1.C4076K.j()
                r12 = r0
            L41:
                long r0 = g1.C4076K.k()
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                java.lang.String r1 = "lock(...)"
                if (r0 > 0) goto L83
                java.nio.channels.FileChannel r6 = r13.getChannel()     // Catch: java.io.IOException -> L5f
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r11 = 0
                r7 = 0
                java.nio.channels.FileLock r0 = r6.lock(r7, r9, r11)     // Catch: java.io.IOException -> L5f
                kotlin.jvm.internal.AbstractC4862t.d(r0, r1)     // Catch: java.io.IOException -> L5f
                return r0
            L5f:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                if (r1 == 0) goto L82
                java.lang.String r6 = g1.C4076K.i()
                r7 = 0
                r8 = 0
                boolean r1 = Od.F.V(r1, r6, r7, r2, r8)
                if (r1 != r3) goto L82
                r12.f34835j = r13
                r12.f34836k = r4
                r12.f34839n = r3
                java.lang.Object r0 = Rd.X.a(r4, r12)
                if (r0 != r14) goto L7f
                return r14
            L7f:
                long r0 = (long) r2
                long r4 = r4 * r0
                goto L41
            L82:
                throw r0
            L83:
                java.nio.channels.FileChannel r6 = r13.getChannel()
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r11 = 0
                r7 = 0
                java.nio.channels.FileLock r12 = r6.lock(r7, r9, r11)
                kotlin.jvm.internal.AbstractC4862t.d(r12, r1)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: g1.C4076K.a.b(java.io.FileOutputStream, lc.e):java.lang.Object");
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: g1.K$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f34840j;

        public b(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return C4076K.this.new b(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f34840j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            return AbstractC5158b.c(C4076K.this.q().getValue());
        }
    }

    /* JADX INFO: renamed from: g1.K$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f34842j;

        public c(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return C4076K.this.new c(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((c) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f34842j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            return AbstractC5158b.c(C4076K.this.q().a());
        }
    }

    /* JADX INFO: renamed from: g1.K$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f34844j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f34845k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f34846l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f34847m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f34849o;

        public d(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f34847m = obj;
            this.f34849o |= Integer.MIN_VALUE;
            return C4076K.this.d(null, this);
        }
    }

    /* JADX INFO: renamed from: g1.K$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f34850j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f34851k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f34852l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f34853m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f34854n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f34856p;

        public e(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f34854n = obj;
            this.f34856p |= Integer.MIN_VALUE;
            return C4076K.this.e(null, this);
        }
    }

    public C4076K(InterfaceC4992i context, File file) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(file, "file");
        this.f34826a = context;
        this.f34827b = file;
        this.f34828c = FileObserverC4082Q.f34864c.e(file);
        this.f34829d = ".lock";
        this.f34830e = ".version";
        this.f34831f = "fcntl failed: EAGAIN";
        this.f34832g = AbstractC2693g.b(false, 1, null);
        this.f34833h = C4029l.b(new InterfaceC6082a() { // from class: g1.H
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C4076K.t(this.f34819a);
            }
        });
        this.f34834i = C4029l.b(new InterfaceC6082a() { // from class: g1.I
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C4076K.r(this.f34820a);
            }
        });
    }

    public static final InterfaceC4088X r(final C4076K c4076k) {
        return InterfaceC4088X.f34880a.a(new InterfaceC6082a() { // from class: g1.J
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C4076K.s(this.f34821a);
            }
        });
    }

    public static final File s(C4076K c4076k) throws IOException {
        File fileO = c4076k.o(c4076k.f34830e);
        c4076k.m(fileO);
        return fileO;
    }

    public static final File t(C4076K c4076k) throws IOException {
        File fileO = c4076k.o(c4076k.f34829d);
        c4076k.m(fileO);
        return fileO;
    }

    @Override // g1.InterfaceC4069D
    public Object a(InterfaceC4988e interfaceC4988e) {
        return this.f34834i.isInitialized() ? AbstractC5158b.c(q().getValue()) : AbstractC2128g.g(this.f34826a, new b(null), interfaceC4988e);
    }

    @Override // g1.InterfaceC4069D
    public InterfaceC2313e b() {
        return this.f34828c;
    }

    @Override // g1.InterfaceC4069D
    public Object c(InterfaceC4988e interfaceC4988e) {
        return this.f34834i.isInitialized() ? AbstractC5158b.c(q().a()) : AbstractC2128g.g(this.f34826a, new c(null), interfaceC4988e);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5 A[Catch: all -> 0x00b9, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00b9, blocks: (B:41:0x00b5, B:55:0x00d3, B:56:0x00d6), top: B:72:0x0024, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3 A[Catch: all -> 0x00b9, TRY_ENTER, TryCatch #4 {all -> 0x00b9, blocks: (B:41:0x00b5, B:55:0x00d3, B:56:0x00d6), top: B:72:0x0024, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [ae.a] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [ae.a] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [vc.l] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v19, types: [ae.a] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.Closeable, java.lang.Object, vc.l] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // g1.InterfaceC4069D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(vc.l r9, lc.InterfaceC4988e r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C4076K.d(vc.l, lc.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e6 A[Catch: all -> 0x00ea, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x00ea, blocks: (B:60:0x00e6, B:74:0x0101, B:75:0x0104), top: B:100:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0101 A[Catch: all -> 0x00ea, TRY_ENTER, TryCatch #8 {all -> 0x00ea, blocks: (B:60:0x00e6, B:74:0x0101, B:75:0x0104), top: B:100:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r19v0, types: [vc.p] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v10, types: [ae.a] */
    /* JADX WARN: Type inference failed for: r2v14, types: [ae.a] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ae.a] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [g1.K$e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [ae.a] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.Closeable, java.lang.Object] */
    @Override // g1.InterfaceC4069D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(vc.p r19, lc.InterfaceC4988e r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C4076K.e(vc.p, lc.e):java.lang.Object");
    }

    public final void m(File file) throws IOException {
        n(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    public final void n(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    public final File o(String str) {
        return new File(this.f34827b.getAbsolutePath() + str);
    }

    public final File p() {
        return (File) this.f34833h.getValue();
    }

    public final InterfaceC4088X q() {
        return (InterfaceC4088X) this.f34834i.getValue();
    }
}
