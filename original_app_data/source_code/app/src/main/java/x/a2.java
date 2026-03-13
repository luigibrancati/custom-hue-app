package x;

import B0.c;
import E.AbstractC0807p0;
import L.AbstractC1109l0;
import L.AbstractC1115o0;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import x.U1;
import y.C6370f;
import y.C6379o;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a2 extends U1.c implements U1, U1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6230i1 f46868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f46869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f46870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f46871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public U1.c f46872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C6370f f46873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public O7.e f46874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.a f46875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public O7.e f46876j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46867a = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f46877k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f46878l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f46879m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f46880n = false;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends CameraCaptureSession.StateCallback {
        public b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            a2.this.C(cameraCaptureSession);
            a2 a2Var = a2.this;
            a2Var.p(a2Var);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            a2.this.C(cameraCaptureSession);
            a2 a2Var = a2.this;
            a2Var.q(a2Var);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            a2.this.C(cameraCaptureSession);
            a2 a2Var = a2.this;
            a2Var.r(a2Var);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            c.a aVar;
            try {
                a2.this.C(cameraCaptureSession);
                a2 a2Var = a2.this;
                a2Var.s(a2Var);
                synchronized (a2.this.f46867a) {
                    X0.h.h(a2.this.f46875i, "OpenCaptureSession completer should not null");
                    a2 a2Var2 = a2.this;
                    aVar = a2Var2.f46875i;
                    a2Var2.f46875i = null;
                }
                aVar.f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th) {
                synchronized (a2.this.f46867a) {
                    X0.h.h(a2.this.f46875i, "OpenCaptureSession completer should not null");
                    a2 a2Var3 = a2.this;
                    c.a aVar2 = a2Var3.f46875i;
                    a2Var3.f46875i = null;
                    aVar2.f(new IllegalStateException("onConfigureFailed"));
                    throw th;
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            c.a aVar;
            try {
                a2.this.C(cameraCaptureSession);
                a2 a2Var = a2.this;
                a2Var.t(a2Var);
                synchronized (a2.this.f46867a) {
                    X0.h.h(a2.this.f46875i, "OpenCaptureSession completer should not null");
                    a2 a2Var2 = a2.this;
                    aVar = a2Var2.f46875i;
                    a2Var2.f46875i = null;
                }
                aVar.c(null);
            } catch (Throwable th) {
                synchronized (a2.this.f46867a) {
                    X0.h.h(a2.this.f46875i, "OpenCaptureSession completer should not null");
                    a2 a2Var3 = a2.this;
                    c.a aVar2 = a2Var3.f46875i;
                    a2Var3.f46875i = null;
                    aVar2.c(null);
                    throw th;
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            a2.this.C(cameraCaptureSession);
            a2 a2Var = a2.this;
            a2Var.u(a2Var);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            a2.this.C(cameraCaptureSession);
            a2 a2Var = a2.this;
            a2Var.w(a2Var, surface);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
        public static List a(CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, CaptureRequest captureRequest) {
            return cameraConstrainedHighSpeedCaptureSession.createHighSpeedRequestList(captureRequest);
        }
    }

    public a2(C6230i1 c6230i1, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f46868b = c6230i1;
        this.f46869c = handler;
        this.f46870d = executor;
        this.f46871e = scheduledExecutorService;
    }

    public static /* synthetic */ O7.e A(a2 a2Var, List list, List list2) {
        a2Var.getClass();
        AbstractC0807p0.a("SyncCaptureSessionBase", "[" + a2Var + "] getSurface done with results: " + list2);
        return list2.isEmpty() ? O.n.n(new IllegalArgumentException("Unable to open capture session without surfaces")) : list2.contains(null) ? O.n.n(new AbstractC1109l0.a("Surface closed", (AbstractC1109l0) list.get(list2.indexOf(null)))) : O.n.p(list2);
    }

    public static /* synthetic */ void x(a2 a2Var, U1 u12) {
        a2Var.f46868b.g(a2Var);
        a2Var.B(u12);
        if (a2Var.f46873g != null) {
            Objects.requireNonNull(a2Var.f46872f);
            a2Var.f46872f.r(u12);
            return;
        }
        AbstractC0807p0.l("SyncCaptureSessionBase", "[" + a2Var + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
    }

    public static /* synthetic */ Object y(a2 a2Var, List list, C6379o c6379o, z.o oVar, c.a aVar) {
        String str;
        synchronized (a2Var.f46867a) {
            a2Var.D(list);
            X0.h.j(a2Var.f46875i == null, "The openCaptureSessionCompleter can only set once!");
            a2Var.f46875i = aVar;
            c6379o.a(oVar);
            str = "openCaptureSession[session=" + a2Var + "]";
        }
        return str;
    }

    public static /* synthetic */ void z(a2 a2Var, U1 u12) {
        Objects.requireNonNull(a2Var.f46872f);
        a2Var.f46872f.B(u12);
    }

    public void C(CameraCaptureSession cameraCaptureSession) {
        if (this.f46873g == null) {
            this.f46873g = C6370f.e(cameraCaptureSession, this.f46869c);
        }
    }

    public void D(List list) {
        synchronized (this.f46867a) {
            F();
            AbstractC1115o0.d(list);
            this.f46877k = list;
        }
    }

    public boolean E() {
        boolean z10;
        synchronized (this.f46867a) {
            z10 = this.f46874h != null;
        }
        return z10;
    }

    public void F() {
        synchronized (this.f46867a) {
            try {
                List list = this.f46877k;
                if (list != null) {
                    AbstractC1115o0.c(list);
                    this.f46877k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // x.U1
    public void a() {
        F();
    }

    @Override // x.U1.a
    public z.o b(int i10, List list, U1.c cVar) {
        this.f46872f = cVar;
        return new z.o(i10, list, getExecutor(), new b());
    }

    @Override // x.U1
    public void close() {
        X0.h.h(this.f46873g, "Need to call openCaptureSession before using this API.");
        this.f46868b.h(this);
        this.f46873g.d().close();
        getExecutor().execute(new Runnable() { // from class: x.W1
            @Override // java.lang.Runnable
            public final void run() {
                a2 a2Var = this.f46831a;
                a2Var.B(a2Var);
            }
        });
    }

    @Override // x.U1
    public void d() {
        X0.h.h(this.f46873g, "Need to call openCaptureSession before using this API.");
        this.f46873g.d().abortCaptures();
    }

    @Override // x.U1
    public CameraDevice e() {
        X0.h.g(this.f46873g);
        return this.f46873g.d().getDevice();
    }

    @Override // x.U1
    public int f(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        X0.h.h(this.f46873g, "Need to call openCaptureSession before using this API.");
        return this.f46873g.c(captureRequest, getExecutor(), captureCallback);
    }

    @Override // x.U1
    public List g(CaptureRequest captureRequest) {
        CameraCaptureSession cameraCaptureSessionD = ((C6370f) X0.h.g(this.f46873g)).d();
        return cameraCaptureSessionD instanceof CameraConstrainedHighSpeedCaptureSession ? c.a((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSessionD, captureRequest) : Collections.EMPTY_LIST;
    }

    @Override // x.U1.a
    public Executor getExecutor() {
        return this.f46870d;
    }

    @Override // x.U1.a
    public O7.e h(final List list, long j10) {
        synchronized (this.f46867a) {
            try {
                if (this.f46879m) {
                    return O.n.n(new CancellationException("Opener is disabled"));
                }
                O.d dVarG = O.d.c(AbstractC1115o0.e(list, false, j10, getExecutor(), this.f46871e)).g(new O.a() { // from class: x.Z1
                    @Override // O.a
                    public final O7.e apply(Object obj) {
                        return a2.A(this.f46857a, list, (List) obj);
                    }
                }, getExecutor());
                this.f46876j = dVarG;
                return O.n.s(dVarG);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // x.U1.a
    public O7.e i(CameraDevice cameraDevice, final z.o oVar, final List list) {
        synchronized (this.f46867a) {
            try {
                if (this.f46879m) {
                    return O.n.n(new CancellationException("Opener is disabled"));
                }
                this.f46868b.k(this);
                final C6379o c6379oB = C6379o.b(cameraDevice, this.f46869c);
                O7.e eVarA = B0.c.a(new c.InterfaceC0018c() { // from class: x.X1
                    @Override // B0.c.InterfaceC0018c
                    public final Object a(c.a aVar) {
                        return a2.y(this.f46834a, list, c6379oB, oVar, aVar);
                    }
                });
                this.f46874h = eVarA;
                O.n.j(eVarA, new a(), N.a.a());
                return O.n.s(this.f46874h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // x.U1
    public int j(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        X0.h.h(this.f46873g, "Need to call openCaptureSession before using this API.");
        return this.f46873g.b(list, getExecutor(), captureCallback);
    }

    @Override // x.U1
    public int k(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        X0.h.h(this.f46873g, "Need to call openCaptureSession before using this API.");
        return this.f46873g.a(list, getExecutor(), captureCallback);
    }

    @Override // x.U1
    public C6370f l() {
        X0.h.g(this.f46873g);
        return this.f46873g;
    }

    @Override // x.U1
    public void n() throws CameraAccessException {
        X0.h.h(this.f46873g, "Need to call openCaptureSession before using this API.");
        this.f46873g.d().stopRepeating();
    }

    @Override // x.U1.c
    public void p(U1 u12) {
        Objects.requireNonNull(this.f46872f);
        this.f46872f.p(u12);
    }

    @Override // x.U1.c
    public void q(U1 u12) {
        Objects.requireNonNull(this.f46872f);
        this.f46872f.q(u12);
    }

    @Override // x.U1.c
    public void r(final U1 u12) {
        O7.e eVar;
        synchronized (this.f46867a) {
            try {
                if (this.f46878l) {
                    eVar = null;
                } else {
                    this.f46878l = true;
                    X0.h.h(this.f46874h, "Need to call openCaptureSession before using this API.");
                    eVar = this.f46874h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        a();
        if (eVar != null) {
            eVar.b(new Runnable() { // from class: x.Y1
                @Override // java.lang.Runnable
                public final void run() {
                    a2.x(this.f46854a, u12);
                }
            }, N.a.a());
        }
    }

    @Override // x.U1.c
    public void s(U1 u12) {
        Objects.requireNonNull(this.f46872f);
        a();
        this.f46868b.i(this);
        this.f46872f.s(u12);
    }

    @Override // x.U1.a
    public boolean stop() {
        boolean z10;
        try {
            synchronized (this.f46867a) {
                try {
                    if (!this.f46879m) {
                        O7.e eVar = this.f46876j;
                        eVar = eVar != null ? eVar : null;
                        this.f46879m = true;
                    }
                    z10 = !E();
                } finally {
                }
            }
            return z10;
        } finally {
            if (eVar != null) {
                eVar.cancel(true);
            }
        }
    }

    @Override // x.U1.c
    public void t(U1 u12) {
        Objects.requireNonNull(this.f46872f);
        this.f46868b.j(this);
        this.f46872f.t(u12);
    }

    @Override // x.U1.c
    public void u(U1 u12) {
        Objects.requireNonNull(this.f46872f);
        this.f46872f.u(u12);
    }

    @Override // x.U1.c
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void B(final U1 u12) {
        O7.e eVar;
        synchronized (this.f46867a) {
            try {
                if (this.f46880n) {
                    eVar = null;
                } else {
                    this.f46880n = true;
                    X0.h.h(this.f46874h, "Need to call openCaptureSession before using this API.");
                    eVar = this.f46874h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (eVar != null) {
            eVar.b(new Runnable() { // from class: x.V1
                @Override // java.lang.Runnable
                public final void run() {
                    a2.z(this.f46828a, u12);
                }
            }, N.a.a());
        }
    }

    @Override // x.U1.c
    public void w(U1 u12, Surface surface) {
        Objects.requireNonNull(this.f46872f);
        this.f46872f.w(u12, surface);
    }

    @Override // x.U1
    public U1.c m() {
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements O.c {
        public a() {
        }

        @Override // O.c
        public void a(Throwable th) {
            a2.this.a();
            a2 a2Var = a2.this;
            a2Var.f46868b.i(a2Var);
        }

        @Override // O.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }

    @Override // x.U1
    public void c(int i10) {
    }
}
