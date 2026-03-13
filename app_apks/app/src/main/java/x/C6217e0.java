package x;

import B0.c;
import E.AbstractC0807p0;
import E.C0781c0;
import E.C0785e0;
import K.InterfaceC0967i;
import L.AbstractC1101h0;
import L.AbstractC1114o;
import L.AbstractC1135z;
import L.C1095e0;
import L.C1118q;
import L.InterfaceC1133y;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import s.InterfaceC5702a;
import w.C6107a;
import x.C6217e0;
import x.C6266v;
import y.C6378n;

/* JADX INFO: renamed from: x.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C6217e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6266v f46919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B.B f46920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f46921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L.X0 f46922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f46923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f46924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f46925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f46926h = 1;

    /* JADX INFO: renamed from: x.e0$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C6266v f46927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final B.n f46928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f46929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f46930d = false;

        public a(C6266v c6266v, int i10, B.n nVar) {
            this.f46927a = c6266v;
            this.f46929c = i10;
            this.f46928b = nVar;
        }

        public static /* synthetic */ Object e(a aVar, c.a aVar2) {
            aVar.f46927a.F().R(aVar2);
            aVar.f46928b.b();
            return "AePreCapture";
        }

        @Override // x.C6217e0.e
        public O7.e a(TotalCaptureResult totalCaptureResult) {
            if (this.f46927a.Y() || !C6217e0.e(this.f46929c, totalCaptureResult)) {
                return O.n.p(Boolean.FALSE);
            }
            AbstractC0807p0.a("Camera2CapturePipeline", "Trigger AE");
            this.f46930d = true;
            return O.d.c(B0.c.a(new c.InterfaceC0018c() { // from class: x.c0
                @Override // B0.c.InterfaceC0018c
                public final Object a(c.a aVar) {
                    return C6217e0.a.e(this.f46901a, aVar);
                }
            })).f(new InterfaceC5702a() { // from class: x.d0
                @Override // s.InterfaceC5702a
                public final Object apply(Object obj) {
                    return Boolean.TRUE;
                }
            }, N.a.a());
        }

        @Override // x.C6217e0.e
        public boolean b() {
            return this.f46929c == 0;
        }

        @Override // x.C6217e0.e
        public void c() {
            if (this.f46930d) {
                AbstractC0807p0.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f46927a.F().o(false, true);
                this.f46928b.a();
            }
        }
    }

    /* JADX INFO: renamed from: x.e0$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C6266v f46931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f46932b = false;

        public b(C6266v c6266v) {
            this.f46931a = c6266v;
        }

        @Override // x.C6217e0.e
        public O7.e a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            int iIntValue;
            O7.e eVarP = O.n.p(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
                AbstractC0807p0.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    AbstractC0807p0.a("Camera2CapturePipeline", "Trigger AF");
                    this.f46932b = true;
                    this.f46931a.F().S(null, false);
                }
            }
            return eVarP;
        }

        @Override // x.C6217e0.e
        public boolean b() {
            return true;
        }

        @Override // x.C6217e0.e
        public void c() {
            if (this.f46932b) {
                AbstractC0807p0.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f46931a.F().o(true, false);
            }
        }
    }

    /* JADX INFO: renamed from: x.e0$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c implements InterfaceC0967i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f46933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f46934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f46935c;

        public c(d dVar, Executor executor, int i10) {
            this.f46934b = dVar;
            this.f46933a = executor;
            this.f46935c = i10;
        }

        public static /* synthetic */ Object c(c cVar, c.a aVar) {
            cVar.f46934b.j();
            aVar.c(null);
            return "invokePostCaptureFuture";
        }

        public static /* synthetic */ Void d(TotalCaptureResult totalCaptureResult) {
            return null;
        }

        @Override // K.InterfaceC0967i
        public O7.e a() {
            AbstractC0807p0.a("Camera2CapturePipeline", "invokePreCapture");
            return O.d.c(this.f46934b.k(this.f46935c)).f(new InterfaceC5702a() { // from class: x.g0
                @Override // s.InterfaceC5702a
                public final Object apply(Object obj) {
                    return C6217e0.c.d((TotalCaptureResult) obj);
                }
            }, this.f46933a);
        }

        @Override // K.InterfaceC0967i
        public O7.e b() {
            return B0.c.a(new c.InterfaceC0018c() { // from class: x.f0
                @Override // B0.c.InterfaceC0018c
                public final Object a(c.a aVar) {
                    return C6217e0.c.c(this.f46999a, aVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x.e0$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final long f46936j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final long f46937k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f46939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ScheduledExecutorService f46940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C6266v f46941d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final B.n f46942e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f46943f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f46944g = f46936j;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f46945h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final e f46946i = new a();

        /* JADX INFO: renamed from: x.e0$d$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements e {
            public a() {
            }

            @Override // x.C6217e0.e
            public O7.e a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator it = d.this.f46945h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e) it.next()).a(totalCaptureResult));
                }
                return O.n.x(O.n.k(arrayList), new InterfaceC5702a() { // from class: x.n0
                    @Override // s.InterfaceC5702a
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
                    }
                }, N.a.a());
            }

            @Override // x.C6217e0.e
            public boolean b() {
                Iterator it = d.this.f46945h.iterator();
                while (it.hasNext()) {
                    if (((e) it.next()).b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // x.C6217e0.e
            public void c() {
                Iterator it = d.this.f46945h.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).c();
                }
            }
        }

        /* JADX INFO: renamed from: x.e0$d$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class b extends AbstractC1114o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c.a f46948a;

            public b(c.a aVar) {
                this.f46948a = aVar;
            }

            @Override // L.AbstractC1114o
            public void a(int i10) {
                this.f46948a.f(new C0785e0(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // L.AbstractC1114o
            public void b(int i10, InterfaceC1133y interfaceC1133y) {
                this.f46948a.c(null);
            }

            @Override // L.AbstractC1114o
            public void c(int i10, C1118q c1118q) {
                this.f46948a.f(new C0785e0(2, "Capture request failed with reason " + c1118q.a(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f46936j = timeUnit.toNanos(1L);
            f46937k = timeUnit.toNanos(5L);
        }

        public d(int i10, Executor executor, ScheduledExecutorService scheduledExecutorService, C6266v c6266v, boolean z10, B.n nVar) {
            this.f46938a = i10;
            this.f46939b = executor;
            this.f46940c = scheduledExecutorService;
            this.f46941d = c6266v;
            this.f46943f = z10;
            this.f46942e = nVar;
        }

        public static /* synthetic */ O7.e a(d dVar, int i10, TotalCaptureResult totalCaptureResult) {
            if (!dVar.f46941d.Y() && C6217e0.e(i10, totalCaptureResult)) {
                dVar.l(f46937k);
            }
            return dVar.f46946i.a(totalCaptureResult);
        }

        public static /* synthetic */ O7.e d(d dVar, Boolean bool) {
            dVar.getClass();
            return Boolean.TRUE.equals(bool) ? C6217e0.i(dVar.f46944g, dVar.f46940c, dVar.f46941d, new f.a() { // from class: x.m0
                @Override // x.C6217e0.f.a
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return C6217e0.d(totalCaptureResult, false);
                }
            }) : O.n.p(null);
        }

        public static /* synthetic */ Object e(d dVar, C1095e0.a aVar, c.a aVar2) {
            dVar.getClass();
            aVar.c(dVar.new b(aVar2));
            return "submitStillCapture";
        }

        public void f(e eVar) {
            this.f46945h.add(eVar);
        }

        public final void g(C1095e0.a aVar) {
            C6107a.C0631a c0631a = new C6107a.C0631a();
            c0631a.f(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.e(c0631a.c());
        }

        public final void h(C1095e0.a aVar, C1095e0 c1095e0) {
            int i10 = (this.f46938a != 3 || this.f46943f) ? (c1095e0.k() == -1 || c1095e0.k() == 5) ? 2 : -1 : 4;
            if (i10 != -1) {
                aVar.t(i10);
            }
            AbstractC0807p0.a("Camera2CapturePipeline", "applyStillCaptureTemplate: templateToModify = " + i10);
        }

        public O7.e i(final List list, final int i10) {
            O.d dVarG = O.d.c(k(i10)).g(new O.a() { // from class: x.h0
                @Override // O.a
                public final O7.e apply(Object obj) {
                    return this.f47005a.m(list, i10);
                }
            }, this.f46939b);
            dVarG.b(new Runnable() { // from class: x.i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47015a.j();
                }
            }, this.f46939b);
            return dVarG;
        }

        public void j() {
            this.f46946i.c();
        }

        public O7.e k(final int i10) {
            O7.e eVarP = O.n.p(null);
            if (this.f46945h.isEmpty()) {
                return eVarP;
            }
            return O.d.c(this.f46946i.b() ? C6217e0.j(this.f46941d, null) : O.n.p(null)).g(new O.a() { // from class: x.k0
                @Override // O.a
                public final O7.e apply(Object obj) {
                    return C6217e0.d.a(this.f47040a, i10, (TotalCaptureResult) obj);
                }
            }, this.f46939b).g(new O.a() { // from class: x.l0
                @Override // O.a
                public final O7.e apply(Object obj) {
                    return C6217e0.d.d(this.f47067a, (Boolean) obj);
                }
            }, this.f46939b);
        }

        public final void l(long j10) {
            this.f46944g = j10;
        }

        public O7.e m(List list, int i10) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1095e0 c1095e0 = (C1095e0) it.next();
                final C1095e0.a aVarJ = C1095e0.a.j(c1095e0);
                InterfaceC1133y interfaceC1133yA = null;
                if (c1095e0.k() == 5 && !this.f46941d.U().h() && !this.f46941d.U().c()) {
                    androidx.camera.core.d dVarF = this.f46941d.U().f();
                    if (dVarF != null) {
                        if (this.f46941d.U().g(dVarF)) {
                            interfaceC1133yA = AbstractC1135z.a(dVarF.L0());
                        } else {
                            AbstractC0807p0.c("Camera2CapturePipeline", "Failed to enqueue image to image writer");
                        }
                        if (interfaceC1133yA == null) {
                            dVarF.close();
                        }
                    } else {
                        AbstractC0807p0.a("Camera2CapturePipeline", "ZSL capture skipped due to no valid buffer image");
                    }
                }
                if (interfaceC1133yA != null) {
                    aVarJ.n(interfaceC1133yA);
                } else {
                    h(aVarJ, c1095e0);
                }
                if (this.f46942e.c(i10)) {
                    g(aVarJ);
                }
                arrayList.add(B0.c.a(new c.InterfaceC0018c() { // from class: x.j0
                    @Override // B0.c.InterfaceC0018c
                    public final Object a(c.a aVar) {
                        return C6217e0.d.e(this.f47026a, aVarJ, aVar);
                    }
                }));
                arrayList2.add(aVarJ.h());
            }
            this.f46941d.m0(arrayList2);
            return O.n.k(arrayList);
        }
    }

    /* JADX INFO: renamed from: x.e0$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface e {
        O7.e a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    /* JADX INFO: renamed from: x.e0$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class f implements C6266v.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c.a f46950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final O7.e f46951b = B0.c.a(new c.InterfaceC0018c() { // from class: x.o0
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return C6217e0.f.b(this.f47089a, aVar);
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f46952c;

        /* JADX INFO: renamed from: x.e0$f$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        public f(a aVar) {
            this.f46952c = aVar;
        }

        public static /* synthetic */ Object b(f fVar, c.a aVar) {
            fVar.f46950a = aVar;
            return "waitFor3AResult";
        }

        @Override // x.C6266v.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            a aVar = this.f46952c;
            if (aVar != null && !aVar.a(totalCaptureResult)) {
                return false;
            }
            this.f46950a.c(totalCaptureResult);
            return true;
        }

        public O7.e c() {
            return this.f46951b;
        }
    }

    /* JADX INFO: renamed from: x.e0$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g implements e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f46953f = TimeUnit.SECONDS.toNanos(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C6266v f46954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f46955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ScheduledExecutorService f46956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C0781c0.i f46957d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final B.A f46958e;

        public g(C6266v c6266v, Executor executor, ScheduledExecutorService scheduledExecutorService, B.A a10) {
            this.f46954a = c6266v;
            this.f46955b = executor;
            this.f46956c = scheduledExecutorService;
            this.f46958e = a10;
            C0781c0.i iVarK = c6266v.K();
            Objects.requireNonNull(iVarK);
            this.f46957d = iVarK;
        }

        public static /* synthetic */ void d(g gVar, AtomicReference atomicReference, c.a aVar) {
            gVar.getClass();
            AbstractC0807p0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            gVar.f46957d.a(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3L), (C0781c0.j) atomicReference.get());
            aVar.c(null);
        }

        public static /* synthetic */ O7.e h(final g gVar, Void r12) {
            gVar.getClass();
            return B0.c.a(new c.InterfaceC0018c() { // from class: x.q0
                @Override // B0.c.InterfaceC0018c
                public final Object a(c.a aVar) {
                    return C6217e0.g.l(this.f47104a, aVar);
                }
            });
        }

        public static /* synthetic */ Object j(final g gVar, final AtomicReference atomicReference, final c.a aVar) {
            gVar.getClass();
            N.a.d().execute(new Runnable() { // from class: x.r0
                @Override // java.lang.Runnable
                public final void run() {
                    C6217e0.g.d(this.f47112a, atomicReference, aVar);
                }
            });
            return "OnScreenFlashStart";
        }

        public static /* synthetic */ void k(c.a aVar) {
            AbstractC0807p0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
            aVar.c(null);
        }

        public static /* synthetic */ Object l(g gVar, c.a aVar) {
            if (!gVar.f46958e.a()) {
                aVar.c(null);
                return "EnableTorchInternal";
            }
            AbstractC0807p0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
            gVar.f46954a.C(2);
            aVar.c(null);
            return "EnableTorchInternal";
        }

        public static /* synthetic */ Object n(AtomicReference atomicReference, final c.a aVar) {
            atomicReference.set(new C0781c0.j() { // from class: x.t0
                @Override // E.C0781c0.j
                public final void a() {
                    C6217e0.g.k(aVar);
                }
            });
            return "OnScreenFlashUiApplied";
        }

        public static /* synthetic */ O7.e p(g gVar, O7.e eVar, Object obj) {
            gVar.getClass();
            return O.n.r(TimeUnit.SECONDS.toMillis(3L), gVar.f46956c, null, true, eVar);
        }

        @Override // x.C6217e0.e
        public O7.e a(TotalCaptureResult totalCaptureResult) {
            AbstractC0807p0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
            final AtomicReference atomicReference = new AtomicReference();
            final O7.e eVarA = B0.c.a(new c.InterfaceC0018c() { // from class: x.v0
                @Override // B0.c.InterfaceC0018c
                public final Object a(c.a aVar) {
                    return C6217e0.g.n(atomicReference, aVar);
                }
            });
            return O.d.c(B0.c.a(new c.InterfaceC0018c() { // from class: x.w0
                @Override // B0.c.InterfaceC0018c
                public final Object a(c.a aVar) {
                    return C6217e0.g.j(this.f47184a, atomicReference, aVar);
                }
            })).g(new O.a() { // from class: x.x0
                @Override // O.a
                public final O7.e apply(Object obj) {
                    return this.f47204a.f46954a.F().v(true);
                }
            }, this.f46955b).g(new O.a() { // from class: x.y0
                @Override // O.a
                public final O7.e apply(Object obj) {
                    return C6217e0.g.h(this.f47222a, (Void) obj);
                }
            }, this.f46955b).g(new O.a() { // from class: x.z0
                @Override // O.a
                public final O7.e apply(Object obj) {
                    return C6217e0.g.p(this.f47228a, eVarA, obj);
                }
            }, this.f46955b).g(new O.a() { // from class: x.A0
                @Override // O.a
                public final O7.e apply(Object obj) {
                    return this.f46569a.f46954a.F().Q();
                }
            }, this.f46955b).g(new O.a() { // from class: x.B0
                @Override // O.a
                public final O7.e apply(Object obj) {
                    C6217e0.g gVar = this.f46575a;
                    return C6217e0.i(C6217e0.g.f46953f, gVar.f46956c, gVar.f46954a, new C6217e0.f.a() { // from class: x.s0
                        @Override // x.C6217e0.f.a
                        public final boolean a(TotalCaptureResult totalCaptureResult2) {
                            return C6217e0.d(totalCaptureResult2, false);
                        }
                    });
                }
            }, this.f46955b).f(new InterfaceC5702a() { // from class: x.C0
                @Override // s.InterfaceC5702a
                public final Object apply(Object obj) {
                    return Boolean.FALSE;
                }
            }, N.a.a());
        }

        @Override // x.C6217e0.e
        public boolean b() {
            return false;
        }

        @Override // x.C6217e0.e
        public void c() {
            AbstractC0807p0.a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
            if (this.f46958e.a()) {
                this.f46954a.C(0);
            }
            this.f46954a.F().v(false).b(new Runnable() { // from class: x.p0
                @Override // java.lang.Runnable
                public final void run() {
                    Log.d("Camera2CapturePipeline", "enableExternalFlashAeMode disabled");
                }
            }, this.f46955b);
            this.f46954a.F().o(false, true);
            ScheduledExecutorService scheduledExecutorServiceD = N.a.d();
            final C0781c0.i iVar = this.f46957d;
            Objects.requireNonNull(iVar);
            scheduledExecutorServiceD.execute(new Runnable() { // from class: x.u0
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.clear();
                }
            });
        }
    }

    /* JADX INFO: renamed from: x.e0$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class h implements e {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final long f46959g = TimeUnit.SECONDS.toNanos(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C6266v f46960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f46962c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Executor f46963d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ScheduledExecutorService f46964e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f46965f;

        public h(C6266v c6266v, int i10, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z10) {
            this.f46960a = c6266v;
            this.f46961b = i10;
            this.f46963d = executor;
            this.f46964e = scheduledExecutorService;
            this.f46965f = z10;
        }

        public static /* synthetic */ O7.e d(h hVar, Void r12) {
            return hVar.f46965f ? hVar.f46960a.F().Q() : O.n.p(null);
        }

        public static /* synthetic */ Object e(h hVar, c.a aVar) {
            hVar.f46960a.R().e(aVar, 2);
            return "TorchOn";
        }

        @Override // x.C6217e0.e
        public O7.e a(TotalCaptureResult totalCaptureResult) {
            AbstractC0807p0.a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + C6217e0.e(this.f46961b, totalCaptureResult));
            if (C6217e0.e(this.f46961b, totalCaptureResult)) {
                if (this.f46960a.Y()) {
                    AbstractC0807p0.a("Camera2CapturePipeline", "Low-light boost already on, not turn on");
                } else {
                    if (!this.f46960a.c0()) {
                        AbstractC0807p0.a("Camera2CapturePipeline", "Turn on torch");
                        this.f46962c = true;
                        return O.d.c(B0.c.a(new c.InterfaceC0018c() { // from class: x.D0
                            @Override // B0.c.InterfaceC0018c
                            public final Object a(c.a aVar) {
                                return C6217e0.h.e(this.f46612a, aVar);
                            }
                        })).g(new O.a() { // from class: x.E0
                            @Override // O.a
                            public final O7.e apply(Object obj) {
                                return C6217e0.h.d(this.f46615a, (Void) obj);
                            }
                        }, this.f46963d).g(new O.a() { // from class: x.F0
                            @Override // O.a
                            public final O7.e apply(Object obj) {
                                C6217e0.h hVar = this.f46618a;
                                return C6217e0.i(C6217e0.h.f46959g, hVar.f46964e, hVar.f46960a, new C6217e0.f.a() { // from class: x.H0
                                    @Override // x.C6217e0.f.a
                                    public final boolean a(TotalCaptureResult totalCaptureResult2) {
                                        return C6217e0.d(totalCaptureResult2, true);
                                    }
                                });
                            }
                        }, this.f46963d).f(new InterfaceC5702a() { // from class: x.G0
                            @Override // s.InterfaceC5702a
                            public final Object apply(Object obj) {
                                return Boolean.FALSE;
                            }
                        }, N.a.a());
                    }
                    AbstractC0807p0.a("Camera2CapturePipeline", "Torch already on, not turn on");
                }
            }
            return O.n.p(Boolean.FALSE);
        }

        @Override // x.C6217e0.e
        public boolean b() {
            return this.f46961b == 0;
        }

        @Override // x.C6217e0.e
        public void c() {
            if (this.f46962c) {
                this.f46960a.R().e(null, 0);
                AbstractC0807p0.a("Camera2CapturePipeline", "Turning off torch");
                if (this.f46965f) {
                    this.f46960a.F().o(false, true);
                }
            }
        }
    }

    public C6217e0(C6266v c6266v, C6378n c6378n, L.X0 x02, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f46919a = c6266v;
        Integer num = (Integer) c6378n.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f46925g = num != null && num.intValue() == 2;
        this.f46923e = executor;
        this.f46924f = scheduledExecutorService;
        this.f46922d = x02;
        this.f46920b = new B.B(x02);
        this.f46921c = B.g.a(new X(c6378n));
    }

    public static boolean d(TotalCaptureResult totalCaptureResult, boolean z10) {
        if (totalCaptureResult == null) {
            return false;
        }
        return AbstractC1101h0.a(new C6219f(totalCaptureResult), z10);
    }

    public static boolean e(int i10, TotalCaptureResult totalCaptureResult) {
        AbstractC0807p0.a("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i10);
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return false;
                }
                if (i10 != 3) {
                    throw new AssertionError(i10);
                }
            }
            return true;
        }
        Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
        AbstractC0807p0.a("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
        return num != null && num.intValue() == 4;
    }

    public static O7.e i(long j10, ScheduledExecutorService scheduledExecutorService, C6266v c6266v, f.a aVar) {
        return O.n.r(TimeUnit.NANOSECONDS.toMillis(j10), scheduledExecutorService, null, true, j(c6266v, aVar));
    }

    public static O7.e j(final C6266v c6266v, f.a aVar) {
        final f fVar = new f(aVar);
        c6266v.y(fVar);
        O7.e eVarC = fVar.c();
        eVarC.b(new Runnable() { // from class: x.b0
            @Override // java.lang.Runnable
            public final void run() {
                c6266v.d0(fVar);
            }
        }, c6266v.f47150c);
        return eVarC;
    }

    public d b(int i10, int i11, int i12) {
        int i13;
        B.n nVar = new B.n(this.f46922d);
        d dVar = new d(this.f46926h, this.f46923e, this.f46924f, this.f46919a, this.f46925g, nVar);
        if (i10 == 0) {
            dVar.f(new b(this.f46919a));
        }
        if (i11 != 3) {
            if (this.f46921c) {
                if (f(i12)) {
                    i13 = i11;
                    dVar.f(new h(this.f46919a, i13, this.f46923e, this.f46924f, (this.f46920b.a() || this.f46919a.X()) ? false : true));
                } else {
                    i13 = i11;
                    dVar.f(new a(this.f46919a, i13, nVar));
                }
            }
            AbstractC0807p0.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i10 + ", flashMode = " + i13 + ", flashType = " + i12 + ", pipeline tasks = " + dVar.f46945h);
            return dVar;
        }
        dVar.f(new g(this.f46919a, this.f46923e, this.f46924f, new B.A(this.f46922d)));
        i13 = i11;
        AbstractC0807p0.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i10 + ", flashMode = " + i13 + ", flashType = " + i12 + ", pipeline tasks = " + dVar.f46945h);
        return dVar;
    }

    public InterfaceC0967i c(int i10, int i11, int i12) {
        return new c(b(i10, i11, i12), this.f46923e, i11);
    }

    public final boolean f(int i10) {
        return this.f46920b.a() || this.f46926h == 3 || i10 == 1;
    }

    public void g(int i10) {
        this.f46926h = i10;
    }

    public O7.e h(List list, int i10, int i11, int i12) {
        return O.n.s(b(i10, i11, i12).i(list, i11));
    }
}
