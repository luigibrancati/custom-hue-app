package T5;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC2758n;
import cb.C3091b;
import com.google.ar.core.Camera;
import com.google.ar.core.Config;
import com.google.ar.core.Frame;
import com.google.ar.core.Plane;
import com.google.ar.core.PointCloud;
import com.google.ar.core.Session;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import fc.AbstractC4036s;
import fc.AbstractC4040w;
import fc.C4015H;
import fc.C4032o;
import fc.C4034q;
import fc.C4035r;
import gc.C4207u;
import gc.P;
import gc.Q;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.platform.PlatformView;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import mb.AbstractC5040e;
import qb.C5513b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m implements PlatformView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2754j f16219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MethodChannel f16222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EventChannel f16223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EventChannel.EventSink f16224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final T5.a f16225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Session f16226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public cb.h f16227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f16228j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Float f16229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f16230l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s f16231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Frame f16232n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Frame f16233o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Frame f16234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16236r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r f16237s;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements EventChannel.StreamHandler {
        public a() {
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onCancel(Object obj) {
            m.this.f16237s.e("eventChannel onCancel viewId=" + m.this.f16220b);
            m.this.f16224f = null;
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onListen(Object obj, EventChannel.EventSink eventSink) {
            m.this.f16237s.e("eventChannel onListen viewId=" + m.this.f16220b);
            m.this.f16224f = eventSink;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f16240b;

        static {
            int[] iArr = new int[TrackingFailureReason.values().length];
            try {
                iArr[TrackingFailureReason.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackingFailureReason.EXCESSIVE_MOTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrackingFailureReason.INSUFFICIENT_FEATURES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TrackingFailureReason.INSUFFICIENT_LIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TrackingFailureReason.BAD_STATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f16239a = iArr;
            int[] iArr2 = new int[TrackingState.values().length];
            try {
                iArr2[TrackingState.TRACKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TrackingState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[TrackingState.STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f16240b = iArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements DefaultLifecycleObserver {
        public c() {
        }

        public final void a(String str) {
            m.this.f16237s.e("Activity lifecycle: " + str + " viewId=" + m.this.f16220b);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
            a("onCreate");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
            a("onDestroy");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
            a("onPause");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
            a("onResume");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
            a("onStart");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
            a("onStop");
        }
    }

    public m(Context platformContext, d.p pVar, AbstractC2754j abstractC2754j, BinaryMessenger messenger, int i10) {
        AbstractC4862t.e(platformContext, "platformContext");
        AbstractC4862t.e(messenger, "messenger");
        this.f16219a = abstractC2754j;
        this.f16220b = i10;
        this.f16221c = "ArView";
        MethodChannel methodChannel = new MethodChannel(messenger, "com.signify.hue/ar_view_" + i10 + "/methods");
        this.f16222d = methodChannel;
        EventChannel eventChannel = new EventChannel(messenger, "com.signify.hue/ar_view_" + i10 + "/events");
        this.f16223e = eventChannel;
        this.f16228j = new ArrayList();
        this.f16230l = 1.0f;
        this.f16235q = 10;
        this.f16236r = 10;
        r rVarA = r.f16248c.a();
        this.f16237s = rVarA;
        C(abstractC2754j);
        rVarA.e("init view " + (abstractC2754j != null ? abstractC2754j.b() : null));
        T5.a aVar = new T5.a(platformContext, pVar);
        aVar.setAllowDestroy(false);
        aVar.setKeepScreenOn(true);
        aVar.setSessionConfiguration(new vc.p() { // from class: T5.e
            @Override // vc.p
            public final Object invoke(Object obj, Object obj2) {
                return m.b(this.f16211a, (Session) obj, (Config) obj2);
            }
        });
        aVar.setOnSessionCreated(new vc.l() { // from class: T5.f
            @Override // vc.l
            public final Object invoke(Object obj) {
                return m.f(this.f16212a, (Session) obj);
            }
        });
        aVar.setOnSessionResumed(new vc.l() { // from class: T5.g
            @Override // vc.l
            public final Object invoke(Object obj) {
                return m.c(this.f16213a, (Session) obj);
            }
        });
        aVar.setOnSessionPaused(new vc.l() { // from class: T5.h
            @Override // vc.l
            public final Object invoke(Object obj) {
                return m.g(this.f16214a, (Session) obj);
            }
        });
        aVar.setOnSessionFailed(new vc.l() { // from class: T5.i
            @Override // vc.l
            public final Object invoke(Object obj) {
                return m.a(this.f16215a, (Exception) obj);
            }
        });
        aVar.setOnTrackingFailureChanged(new vc.l() { // from class: T5.j
            @Override // vc.l
            public final Object invoke(Object obj) {
                return m.e(this.f16216a, (TrackingFailureReason) obj);
            }
        });
        aVar.setOnSessionUpdated(new vc.p() { // from class: T5.k
            @Override // vc.p
            public final Object invoke(Object obj, Object obj2) {
                return m.d(this.f16217a, (Session) obj, (Frame) obj2);
            }
        });
        C5513b planeRenderer = aVar.getPlaneRenderer();
        planeRenderer.i(false);
        planeRenderer.l(false);
        planeRenderer.j(false);
        aVar.setLifecycle(abstractC2754j);
        this.f16225g = aVar;
        eventChannel.setStreamHandler(new a());
        methodChannel.setMethodCallHandler(new MethodChannel.MethodCallHandler() { // from class: T5.l
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) throws IOException {
                m.i(this.f16218a, methodCall, result);
            }
        });
    }

    public static C4015H a(m mVar, Exception ex) {
        AbstractC4862t.e(ex, "ex");
        mVar.f16237s.e("onSessionFailed viewId=" + mVar.f16220b + " ex=" + ex);
        return C4015H.f34254a;
    }

    public static C4015H b(m mVar, Session session, Config config) {
        AbstractC4862t.e(session, "<unused var>");
        AbstractC4862t.e(config, "config");
        config.setUpdateMode(Config.UpdateMode.LATEST_CAMERA_IMAGE);
        config.setPlaneFindingMode(Config.PlaneFindingMode.HORIZONTAL_AND_VERTICAL);
        config.setDepthMode(Config.DepthMode.AUTOMATIC);
        config.setLightEstimationMode(Config.LightEstimationMode.ENVIRONMENTAL_HDR);
        config.setInstantPlacementMode(Config.InstantPlacementMode.DISABLED);
        mVar.f16237s.e("sessionConfiguration viewId=" + mVar.f16220b + " config=" + config);
        return C4015H.f34254a;
    }

    public static C4015H c(m mVar, Session session) {
        AbstractC4862t.e(session, "session");
        mVar.f16237s.e("onSessionResumed viewId=" + mVar.f16220b + " session=" + session);
        return C4015H.f34254a;
    }

    public static C4015H d(m mVar, Session session, Frame frame) {
        AbstractC4862t.e(session, "session");
        AbstractC4862t.e(frame, "frame");
        mVar.f16226h = session;
        mVar.f16232n = frame;
        mVar.z(frame);
        return C4015H.f34254a;
    }

    public static C4015H e(m mVar, TrackingFailureReason trackingFailureReason) {
        mVar.f16237s.e("onTrackingFailureChanged viewId=" + mVar.f16220b + " reason=" + trackingFailureReason);
        return C4015H.f34254a;
    }

    public static C4015H f(m mVar, Session session) {
        AbstractC4862t.e(session, "session");
        mVar.f16237s.e("onSessionCreated viewId=" + mVar.f16220b + " session=" + session);
        mVar.f16226h = session;
        return C4015H.f34254a;
    }

    public static C4015H g(m mVar, Session session) {
        AbstractC4862t.e(session, "session");
        mVar.f16237s.e("onSessionPaused viewId=" + mVar.f16220b + " session=" + session);
        return C4015H.f34254a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void i(m mVar, MethodCall call, MethodChannel.Result result) throws IOException {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1323983991:
                    if (str.equals("addHitPointUsingTriangulation")) {
                        mVar.s(call, result);
                        return;
                    }
                    break;
                case -601285070:
                    if (str.equals("removeHitPoints")) {
                        mVar.x(result);
                        return;
                    }
                    break;
                case 424378563:
                    if (str.equals("getFloorY")) {
                        mVar.v(result);
                        return;
                    }
                    break;
                case 1572475808:
                    if (str.equals("getHitPoints")) {
                        mVar.w(result);
                        return;
                    }
                    break;
                case 1669336885:
                    if (str.equals("cancelTriangulation")) {
                        mVar.t(result);
                        return;
                    }
                    break;
            }
        }
        mVar.f16237s.e(call.method + " not implemented");
        result.success(null);
    }

    public static /* synthetic */ void n(m mVar, C3091b c3091b, float f10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            f10 = 0.01f;
        }
        mVar.m(c3091b, f10);
    }

    public final cb.h A(float f10, float f11) {
        cb.h hVarB = Cb.f.b(this.f16225g.getView(), f10, f11);
        return new cb.h(hVarB.b(), cb.i.a(hVarB.a()));
    }

    public final void B() {
        for (p pVar : this.f16228j) {
            pVar.a().H();
            pVar.b().H();
        }
        this.f16228j.clear();
    }

    public final void C(AbstractC2754j abstractC2754j) {
        if (abstractC2754j != null) {
            abstractC2754j.a(new c());
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        Object objB;
        this.f16237s.e("dispose viewId=" + this.f16220b);
        B();
        this.f16222d.setMethodCallHandler(null);
        this.f16223e.setStreamHandler(null);
        this.f16224f = null;
        this.f16226h = null;
        try {
            C4035r.a aVar = C4035r.f34274b;
            this.f16225g.setAllowDestroy(true);
            this.f16225g.h();
            objB = C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            objB = C4035r.b(AbstractC4036s.a(th));
        }
        Throwable thE = C4035r.e(objB);
        if (thE != null) {
            this.f16237s.c("Failed to destroy ARSceneView viewId=" + this.f16220b, thE);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public View getView() {
        return this.f16225g;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(cb.C3091b r22, float r23) throws java.io.IOException {
        /*
            r21 = this;
            r0 = r21
            com.google.ar.core.Session r1 = r0.f16226h
            if (r1 != 0) goto L7
            goto Lb
        L7:
            com.google.ar.core.Frame r2 = r0.f16232n
            if (r2 != 0) goto Lc
        Lb:
            return
        Lc:
            T5.a r3 = r0.f16225g
            wb.k r4 = r3.getMaterialLoader()
            r9 = 14
            r10 = 0
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r6 = 0
            r7 = 0
            r8 = 0
            com.google.android.filament.MaterialInstance r17 = wb.k.l(r4, r5, r6, r7, r8, r9, r10)
            Ab.i r11 = new Ab.i
            T5.a r3 = r0.f16225g
            com.google.android.filament.Engine r12 = r3.getEngine()
            r19 = 92
            r20 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r13 = r23
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3 = r22
            fc.q r2 = r0.p(r3, r2)
            if (r2 == 0) goto L5a
            java.lang.Object r4 = r2.f()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r5 = 1069547520(0x3fc00000, float:1.5)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L4e
            goto L4f
        L4e:
            r2 = 0
        L4f:
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r2.e()
            cb.b r2 = (cb.C3091b) r2
            if (r2 == 0) goto L5a
            goto L5b
        L5a:
            r2 = r3
        L5b:
            float r4 = r2.a()
            float r5 = r2.b()
            float r6 = r2.c()
            com.google.ar.core.Pose r4 = com.google.ar.core.Pose.makeTranslation(r4, r5, r6)
            com.google.ar.core.Anchor r14 = r1.createAnchor(r4)
            java.lang.String r1 = "createAnchor(...)"
            kotlin.jvm.internal.AbstractC4862t.d(r14, r1)
            pb.b r12 = new pb.b
            T5.a r1 = r0.f16225g
            com.google.android.filament.Engine r13 = r1.getEngine()
            r19 = 60
            r20 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            cb.b r1 = new cb.b
            float r4 = r3.a()
            float r5 = r2.a()
            float r4 = r4 - r5
            float r5 = r3.b()
            float r6 = r2.b()
            float r5 = r5 - r6
            float r3 = r3.c()
            float r2 = r2.c()
            float r3 = r3 - r2
            r1.<init>(r4, r5, r3)
            r11.z0(r1)
            r12.G(r11)
            T5.a r1 = r0.f16225g
            r1.f(r12)
            java.util.List r0 = r0.f16228j
            T5.p r1 = new T5.p
            r1.<init>(r12, r11)
            r0.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.m.m(cb.b, float):void");
    }

    public final void o() {
        this.f16227i = null;
        EventChannel.EventSink eventSink = this.f16224f;
        if (eventSink != null) {
            eventSink.success(P.f(AbstractC4040w.a("triangulation", "cancelled")));
        }
    }

    public final C4034q p(C3091b c3091b, Frame frame) throws IOException {
        try {
            PointCloud pointCloudAcquirePointCloud = frame.acquirePointCloud();
            AbstractC4862t.b(pointCloudAcquirePointCloud);
            try {
                FloatBuffer points = pointCloudAcquirePointCloud.getPoints();
                if (!points.hasRemaining()) {
                    sc.c.a(pointCloudAcquirePointCloud, null);
                    return null;
                }
                float f10 = Float.POSITIVE_INFINITY;
                float f11 = 0.0f;
                C3091b c3091b2 = null;
                while (points.remaining() >= 4) {
                    float f12 = points.get();
                    float f13 = points.get();
                    float f14 = points.get();
                    float f15 = points.get();
                    if (f15 >= 0.4f) {
                        float fA = f12 - c3091b.a();
                        float fB = f13 - c3091b.b();
                        float fC = f14 - c3091b.c();
                        float fSqrt = (float) Math.sqrt((fA * fA) + (fB * fB) + (fC * fC));
                        if (fSqrt < f10) {
                            c3091b2 = new C3091b(f12, f13, f14);
                            f11 = f15;
                            f10 = fSqrt;
                        }
                    }
                }
                if (c3091b2 == null) {
                    sc.c.a(pointCloudAcquirePointCloud, null);
                    return null;
                }
                this.f16237s.e("Closest feature point: dist=" + f10 + " confidence=" + f11);
                C4034q c4034qA = AbstractC4040w.a(c3091b2, Float.valueOf(f10));
                sc.c.a(pointCloudAcquirePointCloud, null);
                return c4034qA;
            } finally {
            }
        } catch (Throwable unused) {
            r.d(this.f16237s, "Failed to acquire point cloud", null, 2, null);
            return null;
        }
    }

    public final Float q(Frame frame) {
        Session session = this.f16226h;
        Float fValueOf = null;
        if (session == null) {
            return null;
        }
        Collection<Plane> allTrackables = session.getAllTrackables(Plane.class);
        AbstractC4862t.d(allTrackables, "getAllTrackables(...)");
        float fTy = frame.getCamera().getPose().ty();
        for (Plane plane : allTrackables) {
            if (plane.getTrackingState() == TrackingState.TRACKING && plane.getType() == Plane.Type.HORIZONTAL_UPWARD_FACING && plane.getExtentX() * plane.getExtentZ() >= this.f16230l) {
                float fTy2 = plane.getCenterPose().ty();
                if (fTy2 < fTy) {
                    fValueOf = fValueOf != null ? Float.valueOf(Math.min(fValueOf.floatValue(), fTy2)) : Float.valueOf(fTy2);
                }
            }
        }
        return fValueOf;
    }

    public final s r(Frame frame) {
        Camera camera = frame.getCamera();
        AbstractC4862t.d(camera, "getCamera(...)");
        int i10 = b.f16240b[camera.getTrackingState().ordinal()];
        if (i10 == 1) {
            return s.NORMAL;
        }
        if (i10 == 2) {
            int i11 = b.f16239a[camera.getTrackingFailureReason().ordinal()];
            return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? s.NOT_AVAILABLE : s.BAD_STATE : s.INSUFFICIENT_LIGHT : s.INSUFFICIENT_FEATURES : s.EXCESSIVE_MOTION : s.INITIALIZING;
        }
        if (i10 == 3) {
            return s.NOT_AVAILABLE;
        }
        throw new C4032o();
    }

    public final void s(MethodCall methodCall, MethodChannel.Result result) throws IOException {
        Double d10 = (Double) methodCall.argument("x");
        Double d11 = (Double) methodCall.argument("y");
        if (d10 == null || d11 == null) {
            result.error("invalid_arguments", "Expected x and y as double values", null);
            return;
        }
        double d12 = this.f16225g.getResources().getDisplayMetrics().density;
        cb.h hVarA = A((float) (d10.doubleValue() * d12), (float) (d11.doubleValue() * d12));
        cb.h hVar = this.f16227i;
        if (hVar == null) {
            this.f16227i = hVarA;
            EventChannel.EventSink eventSink = this.f16224f;
            if (eventSink != null) {
                eventSink.success(P.f(AbstractC4040w.a("triangulation", "waitingForSecondScan")));
            }
            result.success(null);
            return;
        }
        AbstractC4862t.b(hVar);
        C4034q c4034qB = o.b(o.f16245a, hVar.b(), hVar.a(), hVarA.b(), hVarA.a(), 0.0f, 16, null);
        if (c4034qB == null) {
            EventChannel.EventSink eventSink2 = this.f16224f;
            if (eventSink2 != null) {
                eventSink2.success(P.f(AbstractC4040w.a("triangulation", "raysParallel")));
            }
            result.error("raysParallel", "raysParallel", null);
            return;
        }
        this.f16227i = null;
        n(this, (C3091b) c4034qB.e(), 0.0f, 2, null);
        EventChannel.EventSink eventSink3 = this.f16224f;
        if (eventSink3 != null) {
            eventSink3.success(P.f(AbstractC4040w.a("triangulation", "completed")));
        }
        result.success(null);
    }

    public final void t(MethodChannel.Result result) {
        o();
        result.success(null);
    }

    public final void u(Frame frame) {
        if (AbstractC5040e.a(frame, this.f16233o) > this.f16235q) {
            return;
        }
        this.f16233o = frame;
        Float fQ = q(frame);
        if (fQ != null) {
            float fFloatValue = fQ.floatValue();
            Float f10 = this.f16229k;
            if (f10 == null) {
                this.f16229k = fQ;
                EventChannel.EventSink eventSink = this.f16224f;
                if (eventSink != null) {
                    eventSink.success(P.f(AbstractC4040w.a("floorDetection", "found")));
                    return;
                }
                return;
            }
            if (Math.abs(f10.floatValue() - fFloatValue) <= 0.05f) {
                return;
            }
            this.f16229k = fQ;
            EventChannel.EventSink eventSink2 = this.f16224f;
            if (eventSink2 != null) {
                eventSink2.success(P.f(AbstractC4040w.a("floorDetection", "updated")));
            }
        }
    }

    public final void v(MethodChannel.Result result) {
        result.success(this.f16229k);
    }

    public final void w(MethodChannel.Result result) {
        List list = this.f16228j;
        ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3091b c3091bY = ((p) it.next()).b().Y();
            arrayList.add(Q.l(AbstractC4040w.a("x", Double.valueOf(c3091bY.a())), AbstractC4040w.a("y", Double.valueOf(c3091bY.b())), AbstractC4040w.a("z", Double.valueOf(c3091bY.c()))));
        }
        result.success(arrayList);
    }

    public final void x(MethodChannel.Result result) {
        B();
        result.success(null);
    }

    public final void y(Frame frame) {
        if (AbstractC5040e.a(frame, this.f16234p) > this.f16236r) {
            return;
        }
        this.f16234p = frame;
        s sVarR = r(frame);
        if (sVarR == this.f16231m) {
            return;
        }
        this.f16231m = sVarR;
        EventChannel.EventSink eventSink = this.f16224f;
        if (eventSink != null) {
            eventSink.success(P.f(AbstractC4040w.a("trackingQuality", sVarR.b())));
        }
    }

    public final void z(Frame frame) {
        u(frame);
        y(frame);
    }
}
