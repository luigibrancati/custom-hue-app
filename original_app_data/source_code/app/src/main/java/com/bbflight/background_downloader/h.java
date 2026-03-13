package com.bbflight.background_downloader;

import Q4.C1896p;
import Q4.EnumC1903x;
import Q4.Task;
import Q4.Y;
import Q4.b0;
import Q4.g0;
import Rd.AbstractC2128g;
import Rd.AbstractC2161x;
import Rd.C2123d0;
import Rd.InterfaceC2157v;
import Rd.M;
import android.util.Log;
import com.bbflight.background_downloader.l;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4022e;
import gc.C4179C;
import gc.C4207u;
import ge.C4231e;
import ge.w0;
import he.AbstractC4304b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.nio.file.FileSystemException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import jc.C4757a;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import nc.AbstractC5160d;
import vc.p;
import zc.AbstractC6558c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h extends l {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f27206u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f27207v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f27208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InterfaceC2157v f27209x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public g0 f27210y;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27211a;

        static {
            int[] iArr = new int[g0.values().length];
            try {
                iArr[g0.complete.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.failed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.notFound.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27211a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27212j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27213k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f27214l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f27215m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f27216n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f27217o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f27218p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f27219q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27220r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27222t;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27220r = obj;
            this.f27222t |= Integer.MIN_VALUE;
            return h.this.i0(null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends nc.m implements vc.l {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f27223j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f27225l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y f27226m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f27227n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Y y10, String str2, InterfaceC4988e interfaceC4988e) {
            super(1, interfaceC4988e);
            this.f27225l = str;
            this.f27226m = y10;
            this.f27227n = str2;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(InterfaceC4988e interfaceC4988e) {
            return h.this.new c(this.f27225l, this.f27226m, this.f27227n, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f27223j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                h hVar = h.this;
                String str = this.f27225l;
                g0 g0Var = g0.failed;
                Y y10 = this.f27226m;
                String str2 = this.f27227n;
                this.f27223j = 1;
                if (hVar.i0(str, g0Var, y10, str2, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }

        @Override // vc.l
        public final Object invoke(InterfaceC4988e interfaceC4988e) {
            return ((c) create(interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27228j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f27229k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f27231m;

        public d(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27229k = obj;
            this.f27231m |= Integer.MIN_VALUE;
            return h.this.i(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27232j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27233k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f27234l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f27235m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f27236n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f27237o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ HttpURLConnection f27239q;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends nc.m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Object f27240j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public Object f27241k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f27242l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ h f27243m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ HttpURLConnection f27244n;

            /* JADX INFO: renamed from: com.bbflight.background_downloader.h$e$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class C0350a extends nc.m implements vc.l {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public int f27245j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ h f27246k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ C1896p f27247l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0350a(h hVar, C1896p c1896p, InterfaceC4988e interfaceC4988e) {
                    super(1, interfaceC4988e);
                    this.f27246k = hVar;
                    this.f27247l = c1896p;
                }

                @Override // nc.AbstractC5157a
                public final InterfaceC4988e create(InterfaceC4988e interfaceC4988e) {
                    return new C0350a(this.f27246k, this.f27247l, interfaceC4988e);
                }

                @Override // nc.AbstractC5157a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objF = C5046c.f();
                    int i10 = this.f27245j;
                    if (i10 == 0) {
                        AbstractC4036s.b(obj);
                        h hVar = this.f27246k;
                        this.f27245j = 1;
                        if (hVar.g0(this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC4036s.b(obj);
                    }
                    Log.i("TaskRunner", "Failed to enqueue chunk task with id " + this.f27247l.getTask().getTaskId());
                    this.f27246k.U(new Y(EnumC1903x.general, 0, "Failed to enqueue chunk task with id " + this.f27247l.getTask().getTaskId(), 2, null));
                    this.f27246k.f27209x.C(g0.failed);
                    return C4015H.f34254a;
                }

                @Override // vc.l
                public final Object invoke(InterfaceC4988e interfaceC4988e) {
                    return ((C0350a) create(interfaceC4988e)).invokeSuspend(C4015H.f34254a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, HttpURLConnection httpURLConnection, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f27243m = hVar;
                this.f27244n = httpURLConnection;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return new a(this.f27243m, this.f27244n, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0120  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x015c -> B:21:0x015f). Please report as a decompilation issue!!! */
            @Override // nc.AbstractC5157a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 563
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.h.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends nc.m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f27248j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f27249k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ h f27250l;

            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class a extends nc.m implements p {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public int f27251j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ h f27252k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(h hVar, InterfaceC4988e interfaceC4988e) {
                    super(2, interfaceC4988e);
                    this.f27252k = hVar;
                }

                @Override // nc.AbstractC5157a
                public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                    return new a(this.f27252k, interfaceC4988e);
                }

                @Override // vc.p
                public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                    return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
                }

                @Override // nc.AbstractC5157a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objF = C5046c.f();
                    int i10 = this.f27251j;
                    if (i10 == 0) {
                        AbstractC4036s.b(obj);
                        h hVar = this.f27252k;
                        this.f27251j = 1;
                        if (hVar.g0(this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC4036s.b(obj);
                    }
                    return AbstractC5158b.a(this.f27252k.f27209x.C(g0.failed));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h hVar, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f27250l = hVar;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                b bVar = new b(this.f27250l, interfaceC4988e);
                bVar.f27249k = obj;
                return bVar;
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
            
                if (Rd.AbstractC2128g.g(r14, r2, r13) == r1) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
            
                if (com.bbflight.background_downloader.l.a.d(r5, "resumeData", r7, r8, null, r10, 8, null) != r1) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00da, code lost:
            
                if (Rd.X.a(200, r10) == r1) goto L33;
             */
            /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00da -> B:34:0x00dd). Please report as a decompilation issue!!! */
            @Override // nc.AbstractC5157a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 227
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.h.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HttpURLConnection httpURLConnection, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f27239q = httpURLConnection;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            e eVar = h.this.new e(this.f27239q, interfaceC4988e);
            eVar.f27237o = obj;
            return eVar;
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((e) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x011b, code lost:
        
            if (r1 == r10) goto L72;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00fe A[PHI: r0 r2 r3 r5
          0x00fe: PHI (r0v25 java.lang.Object) = (r0v19 java.lang.Object), (r0v19 java.lang.Object), (r0v26 java.lang.Object) binds: [B:28:0x00e1, B:30:0x00fa, B:12:0x0076] A[DONT_GENERATE, DONT_INLINE]
          0x00fe: PHI (r2v12 Rd.z0) = (r2v31 Rd.z0), (r2v32 Rd.z0), (r2v33 Rd.z0) binds: [B:28:0x00e1, B:30:0x00fa, B:12:0x0076] A[DONT_GENERATE, DONT_INLINE]
          0x00fe: PHI (r3v19 Rd.z0) = (r3v16 Rd.z0), (r3v16 Rd.z0), (r3v24 Rd.z0) binds: [B:28:0x00e1, B:30:0x00fa, B:12:0x0076] A[DONT_GENERATE, DONT_INLINE]
          0x00fe: PHI (r5v20 java.lang.Object) = (r5v33 java.lang.Object), (r5v34 java.lang.Object) binds: [B:28:0x00e1, B:30:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01e4  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01fe A[PHI: r0 r1 r2 r3 r4
          0x01fe: PHI (r0v5 'th' java.lang.Throwable) = (r0v4 'th' java.lang.Throwable), (r0v4 'th' java.lang.Throwable), (r0v35 'th' java.lang.Throwable) binds: [B:63:0x01e2, B:65:0x01fb, B:7:0x002d] A[DONT_GENERATE, DONT_INLINE]
          0x01fe: PHI (r1v4 com.bbflight.background_downloader.h$e) = 
          (r1v3 com.bbflight.background_downloader.h$e)
          (r1v3 com.bbflight.background_downloader.h$e)
          (r1v0 com.bbflight.background_downloader.h$e)
         binds: [B:63:0x01e2, B:65:0x01fb, B:7:0x002d] A[DONT_GENERATE, DONT_INLINE]
          0x01fe: PHI (r2v4 Rd.z0) = (r2v3 Rd.z0), (r2v3 Rd.z0), (r2v28 Rd.z0) binds: [B:63:0x01e2, B:65:0x01fb, B:7:0x002d] A[DONT_GENERATE, DONT_INLINE]
          0x01fe: PHI (r3v3 Rd.z0) = (r3v2 Rd.z0), (r3v2 Rd.z0), (r3v32 Rd.z0) binds: [B:63:0x01e2, B:65:0x01fb, B:7:0x002d] A[DONT_GENERATE, DONT_INLINE]
          0x01fe: PHI (r4v5 java.lang.Object) = (r4v4 Rd.M), (r4v4 Rd.M), (r4v1 Rd.M) binds: [B:63:0x01e2, B:65:0x01fb, B:7:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0200  */
        /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v24 */
        /* JADX WARN: Type inference failed for: r4v17 */
        /* JADX WARN: Type inference failed for: r4v18 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v3 */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 564
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.h.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f27253j;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C4757a.a(Long.valueOf(((C1896p) obj).getFromByte()), Long.valueOf(((C1896p) obj2).getFromByte()));
            }
        }

        public f(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return h.this.new f(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((f) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f27253j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            try {
                try {
                    byte[] bArr = new byte[8192];
                    File file = new File(Task.p(h.this.z(), h.this.q().t(), null, 2, null));
                    if (file.exists()) {
                        file.delete();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    h hVar = h.this;
                    try {
                        Iterator it = C4179C.J0(hVar.f27207v, new a()).iterator();
                        while (it.hasNext()) {
                            File file2 = new File(Task.p(((C1896p) it.next()).getTask(), hVar.q().t(), null, 2, null));
                            if (!file2.exists()) {
                                throw new FileSystemException(file2.getPath(), null, "Missing chunk file");
                            }
                            FileInputStream fileInputStream = new FileInputStream(file2);
                            while (true) {
                                try {
                                    int i10 = fileInputStream.read(bArr, 0, 8192);
                                    if (i10 == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i10);
                                } finally {
                                }
                            }
                            C4015H c4015h = C4015H.f34254a;
                            sc.c.a(fileInputStream, null);
                        }
                        fileOutputStream.flush();
                        C4015H c4015h2 = C4015H.f34254a;
                        sc.c.a(fileOutputStream, null);
                        Iterator it2 = h.this.f27207v.iterator();
                        while (it2.hasNext()) {
                            try {
                                AbstractC5158b.a(new File(Task.p(((C1896p) it2.next()).getTask(), h.this.q().t(), null, 2, null)).delete());
                            } catch (FileSystemException unused) {
                            }
                        }
                        return g0.complete;
                    } finally {
                    }
                } catch (Exception e10) {
                    Log.i("TaskRunner", "Error stitching chunks: " + e10 + "\n" + C4022e.b(e10));
                    h.this.U(new Y(EnumC1903x.fileSystem, 0, "Error stitching chunks: " + e10, 2, null));
                    g0 g0Var = g0.failed;
                    Iterator it3 = h.this.f27207v.iterator();
                    while (it3.hasNext()) {
                        try {
                            AbstractC5158b.a(new File(Task.p(((C1896p) it3.next()).getTask(), h.this.q().t(), null, 2, null)).delete());
                        } catch (FileSystemException unused2) {
                        }
                    }
                    return g0Var;
                }
            } finally {
                Iterator it4 = h.this.f27207v.iterator();
                while (it4.hasNext()) {
                    try {
                        AbstractC5158b.a(new File(Task.p(((C1896p) it4.next()).getTask(), h.this.q().t(), null, 2, null)).delete());
                    } catch (FileSystemException unused3) {
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b0 context) {
        super(context);
        AbstractC4862t.e(context, "context");
        this.f27206u = -1L;
        this.f27207v = new ArrayList();
        this.f27208w = "";
        this.f27209x = AbstractC2161x.b(null, 1, null);
        this.f27210y = g0.enqueued;
    }

    @Override // com.bbflight.background_downloader.l
    public Object D(HttpURLConnection httpURLConnection, InterfaceC4988e interfaceC4988e) {
        return AbstractC2128g.g(C2123d0.a(), new e(httpURLConnection, null), interfaceC4988e);
    }

    public final Object g0(InterfaceC4988e interfaceC4988e) {
        l.a aVar = l.f27291t;
        Task taskZ = z();
        AbstractC4304b.a aVar2 = AbstractC4304b.f36582d;
        List list = this.f27207v;
        ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1896p) it.next()).getTask().getTaskId());
        }
        aVar2.d();
        Object objD = l.a.d(aVar, "cancelTasksWithId", taskZ, aVar2.b(new C4231e(w0.f35762a), arrayList), null, interfaceC4988e, 8, null);
        return objD == C5046c.f() ? objD : C4015H.f34254a;
    }

    public final Object h0(String str, double d10, InterfaceC4988e interfaceC4988e) throws Throwable {
        Object next;
        Iterator it = this.f27207v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC4862t.a(((C1896p) next).getTask().getTaskId(), str)) {
                break;
            }
        }
        C1896p c1896p = (C1896p) next;
        if (c1896p == null) {
            return C4015H.f34254a;
        }
        if (d10 > 0.0d && d10 < 1.0d) {
            double dN0 = n0(c1896p, d10);
            if (W(dN0, System.currentTimeMillis())) {
                Object objY = Y(dN0, this.f27206u, z(), interfaceC4988e);
                return objY == C5046c.f() ? objY : C4015H.f34254a;
            }
        }
        return C4015H.f34254a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.bbflight.background_downloader.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(java.net.HttpURLConnection r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.bbflight.background_downloader.h.d
            if (r0 == 0) goto L13
            r0 = r6
            com.bbflight.background_downloader.h$d r0 = (com.bbflight.background_downloader.h.d) r0
            int r1 = r0.f27231m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27231m = r1
            goto L18
        L13:
            com.bbflight.background_downloader.h$d r0 = new com.bbflight.background_downloader.h$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f27229k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f27231m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f27228j
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5
            fc.AbstractC4036s.b(r6)
            goto L79
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            fc.AbstractC4036s.b(r6)
            com.bbflight.background_downloader.a$a r6 = com.bbflight.background_downloader.a.INSTANCE
            java.util.Map r6 = r6.t()
            java.lang.String r2 = "<get-parallelDownloadTaskWorkers>(...)"
            kotlin.jvm.internal.AbstractC4862t.d(r6, r2)
            Q4.X r2 = r4.z()
            java.lang.String r2 = r2.getTaskId()
            r6.put(r2, r4)
            r4.I(r3)
            Q4.E r6 = r4.s()
            if (r6 == 0) goto L5c
            Q4.c0 r6 = r6.getRunning()
            goto L5d
        L5c:
            r6 = 0
        L5d:
            if (r6 == 0) goto L61
            r6 = r3
            goto L62
        L61:
            r6 = 0
        L62:
            r4.Q(r6)
            java.lang.String r6 = "HEAD"
            r5.setRequestMethod(r6)
            java.lang.Object r6 = nc.l.a(r5)
            r0.f27228j = r6
            r0.f27231m = r3
            java.lang.Object r6 = super.i(r5, r0)
            if (r6 != r1) goto L79
            return r1
        L79:
            Q4.g0 r6 = (Q4.g0) r6
            com.bbflight.background_downloader.a$a r5 = com.bbflight.background_downloader.a.INSTANCE
            java.util.Map r5 = r5.t()
            Q4.X r4 = r4.z()
            java.lang.String r4 = r4.getTaskId()
            r5.remove(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.h.i(java.net.HttpURLConnection, lc.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01f8, code lost:
    
        if (r13.c("enqueueChild", r14, r15, r0, r6) != r7) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x024d, code lost:
    
        if (g0(r6) == r7) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0291, code lost:
    
        if (g0(r6) == r7) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02d0, code lost:
    
        if (r5 == r7) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i0(java.lang.String r18, Q4.g0 r19, Q4.Y r20, java.lang.String r21, lc.InterfaceC4988e r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.h.i0(java.lang.String, Q4.g0, Q4.Y, java.lang.String, lc.e):java.lang.Object");
    }

    public final List j0(Task task, Map map) {
        int size = task.getIo.sentry.SentryReplayEvent.JsonKeys.URLS java.lang.String().size() * task.getChunks();
        Task task2 = task;
        try {
            long jE = com.bbflight.background_downloader.e.e(map, task2);
            if (jE <= 0) {
                throw new IllegalStateException("Server does not provide content length - cannot chunk download. If you know the length, set Range or Known-Content-Length header");
            }
            this.f27206u = jE;
            q().f(jE, 0L);
            try {
                for (Object obj : map.entrySet()) {
                    Map.Entry entry = (Map.Entry) obj;
                    if ((AbstractC4862t.a(entry.getKey(), "accept-ranges") || AbstractC4862t.a(entry.getKey(), "Accept-Ranges")) && AbstractC4862t.a(C4179C.h0((List) entry.getValue()), "bytes")) {
                        long j10 = 1;
                        long j11 = (jE / ((long) size)) + 1;
                        Bc.f fVarP = Bc.k.p(0, size);
                        ArrayList arrayList = new ArrayList(C4207u.v(fVarP, 10));
                        Iterator it = fVarP.iterator();
                        while (it.hasNext()) {
                            int iNextInt = ((gc.M) it).nextInt();
                            ArrayList arrayList2 = arrayList;
                            long j12 = ((long) iNextInt) * j11;
                            long j13 = j10;
                            Iterator it2 = it;
                            arrayList2.add(new C1896p(task2, (String) task2.getIo.sentry.SentryReplayEvent.JsonKeys.URLS java.lang.String().get(iNextInt % task2.getIo.sentry.SentryReplayEvent.JsonKeys.URLS java.lang.String().size()), "com.bbflight.background_downloader." + Math.abs(AbstractC6558c.f48885a.c()), j12, Math.min((j12 + j11) - j13, jE - j13)));
                            task2 = task;
                            arrayList = arrayList2;
                            j10 = j13;
                            it = it2;
                        }
                        return arrayList;
                    }
                    task2 = task;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            } catch (NoSuchElementException unused) {
                throw new IllegalStateException("Server does not accept ranges - cannot chunk download");
            }
        } catch (NoSuchElementException unused2) {
            throw new IllegalStateException("Server does not provide content length - cannot chunk download. If you know the length, set Range or Known-Content-Length header");
        }
    }

    @Override // com.bbflight.background_downloader.l
    public boolean k() {
        String strG = q().g("tempFilename");
        if (strG == null) {
            strG = "";
        }
        this.f27208w = strG;
        return strG.length() > 0;
    }

    public final g0 k0() {
        Object next;
        Object next2;
        Iterator it = this.f27207v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C1896p) next).getStatus() == g0.failed) {
                break;
            }
        }
        if (((C1896p) next) != null) {
            return g0.failed;
        }
        Iterator it2 = this.f27207v.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((C1896p) next2).getStatus() == g0.notFound) {
                break;
            }
        }
        if (((C1896p) next2) != null) {
            return g0.notFound;
        }
        List list = this.f27207v;
        if (list == null || !list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                if (((C1896p) it3.next()).getStatus() != g0.complete) {
                    return null;
                }
            }
        }
        return g0.complete;
    }

    public final Object l0(InterfaceC4988e interfaceC4988e) {
        l.a aVar = l.f27291t;
        Task taskZ = z();
        AbstractC4304b.a aVar2 = AbstractC4304b.f36582d;
        List list = this.f27207v;
        ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1896p) it.next()).getTask());
        }
        aVar2.d();
        Object objD = l.a.d(aVar, "pauseTasks", taskZ, aVar2.b(new C4231e(Task.INSTANCE.serializer()), arrayList), null, interfaceC4988e, 8, null);
        return objD == C5046c.f() ? objD : C4015H.f34254a;
    }

    public final Object m0(InterfaceC4988e interfaceC4988e) {
        return AbstractC2128g.g(C2123d0.b(), new f(null), interfaceC4988e);
    }

    public final double n0(C1896p c1896p, double d10) {
        c1896p.i(d10);
        Iterator it = this.f27207v.iterator();
        double dE = 0.0d;
        while (it.hasNext()) {
            dE += ((C1896p) it.next()).getProgress();
        }
        return dE / ((double) this.f27207v.size());
    }

    public final g0 o0(C1896p c1896p, g0 g0Var) {
        c1896p.j(g0Var);
        g0 g0VarK0 = k0();
        if (g0VarK0 == null || g0VarK0 == this.f27210y) {
            return null;
        }
        this.f27210y = g0VarK0;
        return g0VarK0;
    }
}
