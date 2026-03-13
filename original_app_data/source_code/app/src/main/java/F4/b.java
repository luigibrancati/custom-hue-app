package F4;

import Rd.AbstractC2132i;
import Rd.InterfaceC2166z0;
import Rd.M;
import Rd.N;
import Rd.X;
import Td.x;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4029l;
import fc.InterfaceC4028k;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.InterfaceC6082a;
import vc.l;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f3718m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D4.a f3719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f3720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K4.f f3721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J4.i f3722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D4.f f3723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M f3724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Td.g f3725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Td.g f3726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3727i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3728j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AtomicInteger f3729k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC4028k f3730l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: F4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0054b extends Thread {
        public C0054b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            b.this.w();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ K4.i f3732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f3733b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(K4.i iVar, b bVar) {
            super(0);
            this.f3732a = iVar;
            this.f3733b = bVar;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K4.i invoke() {
            K4.i iVar = this.f3732a;
            if (iVar != null) {
                return iVar;
            }
            D4.f fVar = this.f3733b.f3723e;
            b bVar = this.f3733b;
            return fVar.d(bVar, bVar.f3719a.l(), this.f3733b.f3724f, this.f3733b.f3719a.v());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f3734j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f3735k;

        public d(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            d dVar = b.this.new d(interfaceC4988e);
            dVar.f3735k = obj;
            return dVar;
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((d) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f3734j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                if (N.f((M) this.f3735k) && b.this.f3727i && !b.this.f3728j) {
                    b.this.f3728j = true;
                    long jD = b.this.f3719a.l().d();
                    this.f3734j = 1;
                    if (X.a(jD, this) == objF) {
                        return objF;
                    }
                }
                return C4015H.f34254a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            b.this.o();
            b.this.f3728j = false;
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f3737j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f3738k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f3739l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f3740m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f3741n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f3742o;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f3744j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ b f3745k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f3745k = bVar;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return new a(this.f3745k, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = C5046c.f();
                int i10 = this.f3744j;
                try {
                    if (i10 == 0) {
                        AbstractC4036s.b(obj);
                        D4.f fVar = this.f3745k.f3723e;
                        this.f3744j = 1;
                        if (fVar.c(this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC4036s.b(obj);
                    }
                    return C4015H.f34254a;
                } catch (FileNotFoundException e10) {
                    String message = e10.getMessage();
                    if (message == null) {
                        return null;
                    }
                    this.f3745k.f3719a.r().c("Event storage file not found: " + message);
                    return C4015H.f34254a;
                }
            }
        }

        /* JADX INFO: renamed from: F4.b$e$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0055b extends v implements l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f3746a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0055b(b bVar) {
                super(1);
                this.f3746a = bVar;
            }

            public final void a(boolean z10) {
                this.f3746a.f3726h.n(z10 ? "#!upload" : "#!maxRetryAttemptReached");
            }

            @Override // vc.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Boolean) obj).booleanValue());
                return C4015H.f34254a;
            }
        }

        public e(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return b.this.new e(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((e) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x01cf, code lost:
        
            if (r0.a(r13, r17) == r2) goto L64;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c1 A[Catch: all -> 0x0033, PHI: r0 r9 r10 r11
          0x00c1: PHI (r0v26 Td.i) = (r0v30 Td.i), (r0v36 Td.i) binds: [B:35:0x00bd, B:31:0x0096] A[DONT_GENERATE, DONT_INLINE]
          0x00c1: PHI (r9v10 F4.b) = (r9v12 F4.b), (r9v18 F4.b) binds: [B:35:0x00bd, B:31:0x0096] A[DONT_GENERATE, DONT_INLINE]
          0x00c1: PHI (r10v11 java.lang.Object) = (r10v17 java.lang.Object), (r10v19 java.lang.Object) binds: [B:35:0x00bd, B:31:0x0096] A[DONT_GENERATE, DONT_INLINE]
          0x00c1: PHI (r11v8 Td.x) = (r11v9 Td.x), (r11v13 Td.x) binds: [B:35:0x00bd, B:31:0x0096] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0033, blocks: (B:10:0x002e, B:34:0x00ad, B:37:0x00c1, B:39:0x00c9, B:43:0x00f4, B:45:0x00fc, B:49:0x0141, B:50:0x0157, B:51:0x0166, B:53:0x016c, B:54:0x0170, B:57:0x0187, B:60:0x0190, B:62:0x01b6, B:66:0x01d6, B:72:0x0211, B:68:0x01de, B:69:0x01ed, B:71:0x01f3, B:21:0x0057, B:24:0x006b, B:27:0x0081, B:30:0x0093, B:33:0x00a4), top: B:79:0x000e, inners: #1, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00c9 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:10:0x002e, B:34:0x00ad, B:37:0x00c1, B:39:0x00c9, B:43:0x00f4, B:45:0x00fc, B:49:0x0141, B:50:0x0157, B:51:0x0166, B:53:0x016c, B:54:0x0170, B:57:0x0187, B:60:0x0190, B:62:0x01b6, B:66:0x01d6, B:72:0x0211, B:68:0x01de, B:69:0x01ed, B:71:0x01f3, B:21:0x0057, B:24:0x006b, B:27:0x0081, B:30:0x0093, B:33:0x00a4), top: B:79:0x000e, inners: #1, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00fc A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:10:0x002e, B:34:0x00ad, B:37:0x00c1, B:39:0x00c9, B:43:0x00f4, B:45:0x00fc, B:49:0x0141, B:50:0x0157, B:51:0x0166, B:53:0x016c, B:54:0x0170, B:57:0x0187, B:60:0x0190, B:62:0x01b6, B:66:0x01d6, B:72:0x0211, B:68:0x01de, B:69:0x01ed, B:71:0x01f3, B:21:0x0057, B:24:0x006b, B:27:0x0081, B:30:0x0093, B:33:0x00a4), top: B:79:0x000e, inners: #1, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x016c A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:10:0x002e, B:34:0x00ad, B:37:0x00c1, B:39:0x00c9, B:43:0x00f4, B:45:0x00fc, B:49:0x0141, B:50:0x0157, B:51:0x0166, B:53:0x016c, B:54:0x0170, B:57:0x0187, B:60:0x0190, B:62:0x01b6, B:66:0x01d6, B:72:0x0211, B:68:0x01de, B:69:0x01ed, B:71:0x01f3, B:21:0x0057, B:24:0x006b, B:27:0x0081, B:30:0x0093, B:33:0x00a4), top: B:79:0x000e, inners: #1, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x018f  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0190 A[Catch: all -> 0x0033, Exception -> 0x0037, FileNotFoundException -> 0x003a, TryCatch #1 {Exception -> 0x0037, blocks: (B:10:0x002e, B:54:0x0170, B:57:0x0187, B:60:0x0190, B:62:0x01b6, B:66:0x01d6, B:21:0x0057), top: B:79:0x000e, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0211 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:10:0x002e, B:34:0x00ad, B:37:0x00c1, B:39:0x00c9, B:43:0x00f4, B:45:0x00fc, B:49:0x0141, B:50:0x0157, B:51:0x0166, B:53:0x016c, B:54:0x0170, B:57:0x0187, B:60:0x0190, B:62:0x01b6, B:66:0x01d6, B:72:0x0211, B:68:0x01de, B:69:0x01ed, B:71:0x01f3, B:21:0x0057, B:24:0x006b, B:27:0x0081, B:30:0x0093, B:33:0x00a4), top: B:79:0x000e, inners: #1, #3 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x016a -> B:65:0x01d2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x018f -> B:51:0x0166). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01cf -> B:65:0x01d2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01d6 -> B:51:0x0166). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01de -> B:51:0x0166). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01f1 -> B:51:0x0166). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01f3 -> B:51:0x0166). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 543
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: F4.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f3747j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f3748k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f3749l;

        public f(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return b.this.new f(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((f) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
        
            if (r6.l(r9, r8) != r0) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0067 -> B:31:0x0080). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007d -> B:31:0x0080). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0082 -> B:31:0x0080). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: F4.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(D4.a amplitude, AtomicInteger eventCount, K4.f httpClient, J4.i retryUploadHandler, D4.f storage, M scope, Td.g writeChannel, Td.g uploadChannel, K4.i iVar) {
        AbstractC4862t.e(amplitude, "amplitude");
        AbstractC4862t.e(eventCount, "eventCount");
        AbstractC4862t.e(httpClient, "httpClient");
        AbstractC4862t.e(retryUploadHandler, "retryUploadHandler");
        AbstractC4862t.e(storage, "storage");
        AbstractC4862t.e(scope, "scope");
        AbstractC4862t.e(writeChannel, "writeChannel");
        AbstractC4862t.e(uploadChannel, "uploadChannel");
        this.f3719a = amplitude;
        this.f3720b = eventCount;
        this.f3721c = httpClient;
        this.f3722d = retryUploadHandler;
        this.f3723e = storage;
        this.f3724f = scope;
        this.f3725g = writeChannel;
        this.f3726h = uploadChannel;
        this.f3729k = new AtomicInteger(1);
        this.f3730l = C4029l.b(new c(iVar, this));
        this.f3727i = false;
        this.f3728j = false;
        t();
    }

    public final void o() {
        this.f3725g.n(new i(j.FLUSH, null));
    }

    public final int p() {
        Integer numValueOf = Integer.valueOf(this.f3719a.l().f() / this.f3729k.get());
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 1;
    }

    public final AtomicInteger q() {
        return this.f3729k;
    }

    public final K4.i r() {
        return (K4.i) this.f3730l.getValue();
    }

    public final void s(E4.a event) {
        AbstractC4862t.e(event, "event");
        event.T(event.e() + 1);
        this.f3725g.n(new i(j.EVENT, event));
    }

    public final void t() {
        try {
            Runtime.getRuntime().addShutdownHook(new C0054b());
        } catch (IllegalStateException unused) {
        }
    }

    public final InterfaceC2166z0 u() {
        return AbstractC2132i.d(this.f3724f, this.f3719a.v(), null, new d(null), 2, null);
    }

    public final void v() {
        this.f3727i = true;
        y();
        x();
    }

    public final void w() {
        x.a.a(this.f3726h, null, 1, null);
        x.a.a(this.f3725g, null, 1, null);
        this.f3727i = false;
    }

    public final InterfaceC2166z0 x() {
        return AbstractC2132i.d(this.f3724f, this.f3719a.s(), null, new e(null), 2, null);
    }

    public final InterfaceC2166z0 y() {
        return AbstractC2132i.d(this.f3724f, this.f3719a.v(), null, new f(null), 2, null);
    }

    public /* synthetic */ b(D4.a aVar, AtomicInteger atomicInteger, K4.f fVar, J4.i iVar, D4.f fVar2, M m10, Td.g gVar, Td.g gVar2, K4.i iVar2, int i10, AbstractC4854k abstractC4854k) {
        K4.f fVarG;
        AtomicInteger atomicInteger2 = (i10 & 2) != 0 ? new AtomicInteger(0) : atomicInteger;
        if ((i10 & 4) != 0) {
            fVarG = aVar.l().g();
            if (fVarG == null) {
                fVarG = new K4.e(aVar.l(), aVar.r());
            }
        } else {
            fVarG = fVar;
        }
        this(aVar, atomicInteger2, fVarG, (i10 & 8) != 0 ? new J4.i(aVar.l().e(), 0, 0.0d, 6, null) : iVar, (i10 & 16) != 0 ? aVar.u() : fVar2, (i10 & 32) != 0 ? aVar.k() : m10, (i10 & 64) != 0 ? Td.j.b(Integer.MAX_VALUE, null, null, 6, null) : gVar, (i10 & 128) != 0 ? Td.j.b(Integer.MAX_VALUE, null, null, 6, null) : gVar2, (i10 & 256) != 0 ? null : iVar2);
    }
}
