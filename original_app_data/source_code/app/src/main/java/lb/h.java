package lb;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC2758n;
import cb.C3091b;
import cb.C3092c;
import com.google.android.filament.Engine;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.Texture;
import com.google.android.filament.View;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.ar.core.Camera;
import com.google.ar.core.CameraConfig;
import com.google.ar.core.Config;
import com.google.ar.core.Frame;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.Session;
import com.google.ar.core.TrackingFailureReason;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import gc.C4179C;
import gc.U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import jb.AbstractC4755b;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;
import mb.AbstractC5038c;
import mb.AbstractC5039d;
import mb.C5037b;
import nb.C5156b;
import ob.C5275b;
import pb.AbstractC5453a;
import pb.AbstractC5456d;
import qb.C5513b;
import tb.C5872a;
import vb.C6078b;
import vc.l;
import vc.p;
import wb.C6183a;
import wb.k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends AbstractC4755b {

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public static final a f40038H0 = new a(null);

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public static final int f40039I0 = 8;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public TrackingFailureReason f40040A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public p f40041B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final l f40042C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final c f40043D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public List f40044E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public AbstractC5453a f40045F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public C5156b f40046G0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final Set f40047W;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final l f40048k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public l f40049l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public l f40050m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public l f40051n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public l f40052o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public l f40053p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public p f40054q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final lb.c f40055r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Frame f40056s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public p f40057t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public C5156b f40058u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final C5513b f40059v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public IndirectLight f40060w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Ab.e f40061x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public C5275b f40062y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public C5275b.C0552b f40063z0;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final AbstractC5453a a(Engine engine) {
            AbstractC4862t.e(engine, "engine");
            return new b(engine);
        }

        public final C5156b b(k materialLoader) {
            AbstractC4862t.e(materialLoader, "materialLoader");
            return new C5156b(materialLoader, null, null, 6, null);
        }

        public final C5872a c(Engine engine) {
            AbstractC4862t.e(engine, "engine");
            return AbstractC4755b.a.g(AbstractC4755b.f39106Q, engine, true, null, null, null, 20, null);
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5453a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Engine engine) {
            super(engine);
            AbstractC4862t.e(engine, "engine");
            D(16.0f, 0.008f, 100.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class c implements DefaultLifecycleObserver {
        public c() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
            lb.c arCore = h.this.getArCore();
            Context context = h.this.getContext();
            AbstractC4862t.d(context, "getContext(...)");
            arCore.g(context, h.this.getActivity(), h.this.getSessionFeatures());
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
            h.this.t();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
            h.this.getArCore().t();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
            lb.c arCore = h.this.getArCore();
            Context context = h.this.getContext();
            AbstractC4862t.d(context, "getContext(...)");
            arCore.u(context, h.this.getActivity());
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStart(InterfaceC2758n interfaceC2758n) {
            super.onStart(interfaceC2758n);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStop(InterfaceC2758n interfaceC2758n) {
            super.onStop(interfaceC2758n);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class d extends AbstractC4860q implements l {
        public d(Object obj) {
            super(1, obj, h.class, "onSessionCreated", "onSessionCreated(Lcom/google/ar/core/Session;)V", 0);
        }

        public final void i(Session p02) {
            AbstractC4862t.e(p02, "p0");
            ((h) this.receiver).w(p02);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((Session) obj);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class e extends AbstractC4860q implements l {
        public e(Object obj) {
            super(1, obj, h.class, "onSessionResumed", "onSessionResumed(Lcom/google/ar/core/Session;)V", 0);
        }

        public final void i(Session p02) {
            AbstractC4862t.e(p02, "p0");
            ((h) this.receiver).A(p02);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((Session) obj);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class f extends AbstractC4860q implements l {
        public f(Object obj) {
            super(1, obj, h.class, "onSessionPaused", "onSessionPaused(Lcom/google/ar/core/Session;)V", 0);
        }

        public final void i(Session p02) {
            AbstractC4862t.e(p02, "p0");
            ((h) this.receiver).z(p02);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((Session) obj);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class g extends AbstractC4860q implements l {
        public g(Object obj) {
            super(1, obj, h.class, "onSessionFailed", "onSessionFailed(Ljava/lang/Exception;)V", 0);
        }

        public final void i(Exception p02) {
            AbstractC4862t.e(p02, "p0");
            ((h) this.receiver).y(p02);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((Exception) obj);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: lb.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class C0524h extends AbstractC4860q implements p {
        public C0524h(Object obj) {
            super(2, obj, h.class, "onSessionConfigChanged", "onSessionConfigChanged(Lcom/google/ar/core/Session;Lcom/google/ar/core/Config;)V", 0);
        }

        public final void i(Session p02, Config p12) {
            AbstractC4862t.e(p02, "p0");
            AbstractC4862t.e(p12, "p1");
            ((h) this.receiver).v(p02, p12);
        }

        @Override // vc.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            i((Session) obj, (Config) obj2);
            return C4015H.f34254a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet, int i10, int i11, d.p pVar, AbstractC2754j abstractC2754j, Engine engine, wb.l lVar, k kVar, C6183a c6183a, Scene scene, View view, Renderer renderer, AbstractC5453a abstractC5453a, Ab.e eVar, C5872a c5872a, boolean z10, rb.g gVar, C5156b c5156b, Set sessionFeatures, l lVar2, p pVar2, Ab.j jVar, l lVar3, l lVar4, l lVar5, l lVar6, l lVar7, C6078b.a aVar, p pVar3, p pVar4) {
        C5156b c5156bB;
        AbstractC5453a abstractC5453aA;
        super(context, attributeSet, i10, i11, engine, lVar, kVar, c6183a, scene, view, renderer, abstractC5453a, eVar, c5872a, z10, gVar, null, jVar, aVar, pVar3, pVar, abstractC2754j);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(sessionFeatures, "sessionFeatures");
        this.f40047W = sessionFeatures;
        this.f40048k0 = lVar2;
        this.f40049l0 = lVar3;
        this.f40050m0 = lVar4;
        this.f40051n0 = lVar5;
        this.f40052o0 = lVar6;
        this.f40053p0 = lVar7;
        this.f40054q0 = pVar4;
        this.f40055r0 = new lb.c(new d(this), new e(this), new f(this), new g(this), new C0524h(this));
        this.f40057t0 = pVar2;
        if (c5156b == null) {
            c5156bB = f40038H0.b(getMaterialLoader());
            this.f40046G0 = c5156bB;
        } else {
            c5156bB = c5156b;
        }
        this.f40058u0 = c5156bB;
        this.f40059v0 = new C5513b(getEngine(), getModelLoader(), getMaterialLoader(), getScene());
        this.f40060w0 = super.getIndirectLight();
        this.f40061x0 = super.getMainLightNode();
        this.f40062y0 = new C5275b(getEngine(), getEnvironmentLoader().f());
        c cVar = new c();
        this.f40043D0 = cVar;
        this.f40044E0 = new ArrayList();
        if (abstractC5453a == null) {
            abstractC5453aA = f40038H0.a(getEngine());
            this.f40045F0 = abstractC5453aA;
        } else {
            abstractC5453aA = abstractC5453a;
        }
        setCameraNode(abstractC5453aA);
        setEnvironment(c5872a == null ? f40038H0.c(getEngine()) : c5872a);
        if (abstractC2754j != null) {
            abstractC2754j.a(cVar);
        }
    }

    public static final C4015H B(Config config) {
        AbstractC4862t.e(config, "config");
        config.setFocusMode(Config.FocusMode.AUTO);
        return C4015H.f34254a;
    }

    public static final C4015H q(p pVar, Config it) {
        AbstractC4862t.e(it, "it");
        return C4015H.f34254a;
    }

    private final void setIndirectLightEstimated(IndirectLight indirectLight) {
        super.setIndirectLight(indirectLight);
    }

    private final void setLightEstimation(C5275b.C0552b c0552b) {
        IndirectLight indirectLight;
        Texture irradianceTexture;
        IndirectLight indirectLight2;
        Texture reflectionsTexture;
        float[] rotation;
        Ab.e mainLightEstimatedNode;
        Ab.e mainLightEstimatedNode2;
        if (AbstractC4862t.a(this.f40063z0, c0552b)) {
            return;
        }
        this.f40063z0 = c0552b;
        if (c0552b != null) {
            Ab.e eVar = this.f40061x0;
            if (eVar != null) {
                C3092c c3092cB = c0552b.b();
                if (c3092cB != null && (mainLightEstimatedNode2 = getMainLightEstimatedNode()) != null) {
                    C3092c c3092cS = eVar.s();
                    mainLightEstimatedNode2.y(new C3092c(c3092cS.b() * c3092cB.b(), c3092cS.c() * c3092cB.c(), c3092cS.d() * c3092cB.d(), c3092cS.a() * c3092cB.a()));
                }
                Float fD = c0552b.d();
                if (fD != null) {
                    float fFloatValue = fD.floatValue();
                    Ab.e mainLightEstimatedNode3 = getMainLightEstimatedNode();
                    if (mainLightEstimatedNode3 != null) {
                        mainLightEstimatedNode3.o(eVar.F() * fFloatValue);
                    }
                }
                C3091b c3091bC = c0552b.c();
                if (c3091bC != null && (mainLightEstimatedNode = getMainLightEstimatedNode()) != null) {
                    mainLightEstimatedNode.q(c3091bC);
                }
            }
            IndirectLight.Builder builder = new IndirectLight.Builder();
            float[] fArrA = c0552b.a();
            if ((fArrA == null || builder.irradiance(3, fArrA) == null) && (indirectLight = this.f40060w0) != null && (irradianceTexture = indirectLight.getIrradianceTexture()) != null) {
                builder.irradiance(irradianceTexture);
            }
            Texture textureE = c0552b.e();
            if ((textureE == null || builder.reflections(textureE) == null) && (indirectLight2 = this.f40060w0) != null && (reflectionsTexture = indirectLight2.getReflectionsTexture()) != null) {
                builder.reflections(reflectionsTexture);
            }
            IndirectLight indirectLight3 = this.f40060w0;
            if (indirectLight3 != null) {
                builder.intensity(indirectLight3.getIntensity());
            }
            IndirectLight indirectLight4 = this.f40060w0;
            if (indirectLight4 != null && (rotation = indirectLight4.getRotation(null)) != null) {
                builder.rotation(rotation);
            }
            setIndirectLightEstimated(builder.build(getEngine()));
        }
        l lVar = this.f40042C0;
        if (lVar != null) {
            lVar.invoke(c0552b);
        }
    }

    private final void setTrackingFailureReason(TrackingFailureReason trackingFailureReason) {
        if (this.f40040A0 != trackingFailureReason) {
            this.f40040A0 = trackingFailureReason;
            l lVar = this.f40053p0;
            if (lVar != null) {
                lVar.invoke(trackingFailureReason);
            }
        }
    }

    public static final void u(h hVar) {
        hVar.getArCore().k();
    }

    public static final C4015H x(h hVar, Session session, Config config) {
        AbstractC4862t.e(config, "config");
        config.setUpdateMode(Config.UpdateMode.LATEST_CAMERA_IMAGE);
        p pVar = hVar.f40057t0;
        if (pVar != null) {
            pVar.invoke(session, config);
        }
        return C4015H.f34254a;
    }

    public final void A(Session session) {
        AbstractC4862t.e(session, "session");
        AbstractC5038c.a(session, new l() { // from class: lb.f
            @Override // vc.l
            public final Object invoke(Object obj) {
                return h.B((Config) obj);
            }
        });
        l lVar = this.f40050m0;
        if (lVar != null) {
            lVar.invoke(session);
        }
    }

    public void C(Session session, Frame frame) {
        TrackingFailureReason trackingFailureReason;
        AbstractC4862t.e(session, "session");
        AbstractC4862t.e(frame, "frame");
        this.f40056s0 = frame;
        Camera camera = frame.getCamera();
        AbstractC4862t.d(camera, "getCamera(...)");
        boolean zB = AbstractC5039d.b(camera);
        C5156b c5156b = this.f40058u0;
        if (c5156b != null) {
            c5156b.e(session, frame);
        }
        getCameraNode().U0(session, frame);
        C5275b c5275b = this.f40062y0;
        TrackingFailureReason trackingFailureReason2 = null;
        setLightEstimation(c5275b != null ? c5275b.e(session, frame, getCameraNode().h()) : null);
        this.f40059v0.m(session, frame);
        List<Ab.f> childNodes = getChildNodes();
        ArrayList arrayList = new ArrayList();
        for (Object obj : childNodes) {
            if (obj instanceof AbstractC5456d) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC5456d) it.next()).S0(session, frame);
        }
        if (!zB && (trackingFailureReason = camera.getTrackingFailureReason()) != TrackingFailureReason.NONE) {
            trackingFailureReason2 = trackingFailureReason;
        }
        setTrackingFailureReason(trackingFailureReason2);
        p pVar = this.f40054q0;
        if (pVar != null) {
            pVar.invoke(session, frame);
        }
    }

    public lb.c getArCore() {
        return this.f40055r0;
    }

    public final C5156b getCameraStream() {
        return this.f40058u0;
    }

    public final Frame getFrame() {
        return this.f40056s0;
    }

    @Override // jb.AbstractC4755b
    public final IndirectLight getIndirectLight() {
        return this.f40060w0;
    }

    public final IndirectLight getIndirectLightEstimated() {
        return super.getIndirectLight();
    }

    @Override // jb.AbstractC4755b
    public AbstractC2754j getLifecycle() {
        return super.getLifecycle();
    }

    public final C5275b.C0552b getLightEstimation() {
        return this.f40063z0;
    }

    public final C5275b getLightEstimator() {
        return this.f40062y0;
    }

    public final Ab.e getMainLightEstimatedNode() {
        return super.getMainLightNode();
    }

    @Override // jb.AbstractC4755b
    public final Ab.e getMainLightNode() {
        return this.f40061x0;
    }

    public final l getOnLightEstimationUpdated() {
        return this.f40042C0;
    }

    public final p getOnSessionConfigChanged() {
        return this.f40041B0;
    }

    public final l getOnSessionCreated() {
        return this.f40049l0;
    }

    public final l getOnSessionFailed() {
        return this.f40052o0;
    }

    public final l getOnSessionPaused() {
        return this.f40051n0;
    }

    public final l getOnSessionResumed() {
        return this.f40050m0;
    }

    public final p getOnSessionUpdated() {
        return this.f40054q0;
    }

    public final l getOnTrackingFailureChanged() {
        return this.f40053p0;
    }

    public final C5513b getPlaneRenderer() {
        return this.f40059v0;
    }

    public final C5037b getSession() {
        return getArCore().o();
    }

    public final l getSessionCameraConfig() {
        return this.f40048k0;
    }

    public final p getSessionConfiguration() {
        return this.f40057t0;
    }

    public final Set<Session.Feature> getSessionFeatures() {
        return this.f40047W;
    }

    public final TrackingFailureReason getTrackingFailureReason() {
        return this.f40040A0;
    }

    @Override // jb.AbstractC4755b
    public void h() {
        C4015H c4015h;
        C4015H c4015h2;
        if (!i()) {
            C4015H c4015h3 = null;
            try {
                C4035r.a aVar = C4035r.f34274b;
                AbstractC5453a abstractC5453a = this.f40045F0;
                if (abstractC5453a != null) {
                    abstractC5453a.H();
                    c4015h2 = C4015H.f34254a;
                } else {
                    c4015h2 = null;
                }
                C4035r.b(c4015h2);
            } catch (Throwable th) {
                C4035r.a aVar2 = C4035r.f34274b;
                C4035r.b(AbstractC4036s.a(th));
            }
            try {
                C5156b c5156b = this.f40046G0;
                if (c5156b != null) {
                    c5156b.b();
                    c4015h = C4015H.f34254a;
                } else {
                    c4015h = null;
                }
                C4035r.b(c4015h);
            } catch (Throwable th2) {
                C4035r.a aVar3 = C4035r.f34274b;
                C4035r.b(AbstractC4036s.a(th2));
            }
            try {
                C5275b c5275b = this.f40062y0;
                if (c5275b != null) {
                    c5275b.b();
                    c4015h3 = C4015H.f34254a;
                }
                C4035r.b(c4015h3);
            } catch (Throwable th3) {
                C4035r.a aVar4 = C4035r.f34274b;
                C4035r.b(AbstractC4036s.a(th3));
            }
            try {
                this.f40059v0.d();
                C4035r.b(C4015H.f34254a);
            } catch (Throwable th4) {
                C4035r.a aVar5 = C4035r.f34274b;
                C4035r.b(AbstractC4036s.a(th4));
            }
            try {
                t();
                C4035r.b(C4015H.f34254a);
            } catch (Throwable th5) {
                C4035r.a aVar6 = C4035r.f34274b;
                C4035r.b(AbstractC4036s.a(th5));
            }
        }
        try {
            C4035r.a aVar7 = C4035r.f34274b;
            super.h();
            C4035r.b(C4015H.f34254a);
        } catch (Throwable th6) {
            C4035r.a aVar8 = C4035r.f34274b;
            C4035r.b(AbstractC4036s.a(th6));
        }
    }

    @Override // jb.AbstractC4755b
    public void j(long j10) {
        Frame frameD;
        C5037b session = getSession();
        if (session != null && (frameD = session.d()) != null) {
            C(session, frameD);
        }
        super.j(j10);
    }

    @Override // jb.AbstractC4755b
    public void k(int i10, int i11) {
        super.k(i10, i11);
        this.f40059v0.k(new Size(i10, i11));
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        C5037b session = getSession();
        if (session != null) {
            session.setDisplayGeometry(getDisplay().getRotation(), getWidth(), getHeight());
        }
    }

    public final void setCameraStream(C5156b c5156b) {
        if (AbstractC4862t.a(this.f40058u0, c5156b)) {
            return;
        }
        C5156b c5156b2 = this.f40058u0;
        if (c5156b2 != null) {
            getScene().removeEntity(c5156b2.getEntity());
        }
        this.f40058u0 = c5156b;
        if (c5156b != null) {
            C5037b session = getSession();
            if (session != null) {
                session.setCameraTextureNames(c5156b.c());
            }
            getScene().addEntity(c5156b.getEntity());
        }
    }

    public final void setFrame(Frame frame) {
        this.f40056s0 = frame;
    }

    @Override // jb.AbstractC4755b
    public final void setIndirectLight(IndirectLight indirectLight) {
        super.setIndirectLight(indirectLight);
        this.f40060w0 = indirectLight;
    }

    @Override // jb.AbstractC4755b
    public void setLifecycle(AbstractC2754j abstractC2754j) {
        AbstractC2754j lifecycle = super.getLifecycle();
        if (lifecycle != null) {
            lifecycle.c(this.f40043D0);
        }
        super.setLifecycle(abstractC2754j);
        if (abstractC2754j != null) {
            abstractC2754j.a(this.f40043D0);
        }
    }

    public final void setLightEstimator(C5275b c5275b) {
        this.f40062y0 = c5275b;
    }

    public final void setMainLightEstimatedNode(Ab.e eVar) {
        super.setMainLightNode(eVar);
    }

    @Override // jb.AbstractC4755b
    public final void setMainLightNode(Ab.e eVar) {
        super.setMainLightNode(eVar);
        this.f40061x0 = eVar;
    }

    public final void setOnSessionConfigChanged(p pVar) {
        this.f40041B0 = pVar;
    }

    public final void setOnSessionCreated(l lVar) {
        this.f40049l0 = lVar;
    }

    public final void setOnSessionFailed(l lVar) {
        this.f40052o0 = lVar;
    }

    public final void setOnSessionPaused(l lVar) {
        this.f40051n0 = lVar;
    }

    public final void setOnSessionResumed(l lVar) {
        this.f40050m0 = lVar;
    }

    public final void setOnSessionUpdated(p pVar) {
        this.f40054q0 = pVar;
    }

    public final void setOnTrackingFailureChanged(l lVar) {
        this.f40053p0 = lVar;
    }

    public final void setSessionConfiguration(final p pVar) {
        this.f40057t0 = pVar;
        C5037b session = getSession();
        if (session != null) {
            AbstractC5038c.a(session, new l() { // from class: lb.g
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return h.q(pVar, (Config) obj);
                }
            });
        }
    }

    public final void t() {
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: lb.e
            @Override // java.lang.Runnable
            public final void run() {
                h.u(this.f40036a);
            }
        });
    }

    public final void v(Session session, Config config) {
        AbstractC4862t.e(session, "session");
        AbstractC4862t.e(config, "config");
        setFrontFaceWindingInverted(session.getCameraConfig().getFacingDirection() == CameraConfig.FacingDirection.FRONT);
        p pVar = this.f40041B0;
        if (pVar != null) {
            pVar.invoke(session, config);
        }
    }

    public final void w(final Session session) {
        AbstractC4862t.e(session, "session");
        C5156b c5156b = this.f40058u0;
        if (c5156b != null) {
            session.setCameraTextureNames(c5156b.c());
        }
        l lVar = this.f40048k0;
        if (lVar != null) {
            session.setCameraConfig((CameraConfig) lVar.invoke(session));
        }
        AbstractC5038c.a(session, new l() { // from class: lb.d
            @Override // vc.l
            public final Object invoke(Object obj) {
                return h.x(this.f40034a, session, (Config) obj);
            }
        });
        C5156b c5156b2 = this.f40058u0;
        if (c5156b2 != null) {
            getScene().addEntity(c5156b2.getEntity());
        }
        Iterator it = C4179C.V0(this.f40044E0).iterator();
        while (it.hasNext()) {
            ((l) it.next()).invoke(session);
        }
        l lVar2 = this.f40049l0;
        if (lVar2 != null) {
            lVar2.invoke(session);
        }
    }

    public final void y(Exception exception) {
        AbstractC4862t.e(exception, "exception");
        l lVar = this.f40052o0;
        if (lVar != null) {
            lVar.invoke(exception);
        }
    }

    public final void z(Session session) {
        AbstractC4862t.e(session, "session");
        l lVar = this.f40051n0;
        if (lVar != null) {
            lVar.invoke(session);
        }
    }

    @Override // jb.AbstractC4755b
    public AbstractC5453a getCameraNode() {
        Ab.b bVar = get_cameraNode();
        AbstractC4862t.c(bVar, "null cannot be cast to non-null type io.github.sceneview.ar.node.ARCameraNode");
        return (AbstractC5453a) bVar;
    }

    public /* synthetic */ h(Context context, AttributeSet attributeSet, int i10, int i11, d.p pVar, AbstractC2754j abstractC2754j, Engine engine, wb.l lVar, k kVar, C6183a c6183a, Scene scene, View view, Renderer renderer, AbstractC5453a abstractC5453a, Ab.e eVar, C5872a c5872a, boolean z10, rb.g gVar, C5156b c5156b, Set set, l lVar2, p pVar2, Ab.j jVar, l lVar3, l lVar4, l lVar5, l lVar6, l lVar7, C6078b.a aVar, p pVar3, p pVar4, int i12, AbstractC4854k abstractC4854k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) == 0 ? i11 : 0, (i12 & 16) != 0 ? null : pVar, (i12 & 32) != 0 ? null : abstractC2754j, (i12 & 64) != 0 ? null : engine, (i12 & 128) != 0 ? null : lVar, (i12 & 256) != 0 ? null : kVar, (i12 & 512) != 0 ? null : c6183a, (i12 & RecognitionOptions.UPC_E) != 0 ? null : scene, (i12 & RecognitionOptions.PDF417) != 0 ? null : view, (i12 & RecognitionOptions.AZTEC) != 0 ? null : renderer, (i12 & 8192) != 0 ? null : abstractC5453a, (i12 & 16384) != 0 ? null : eVar, (i12 & 32768) != 0 ? null : c5872a, (i12 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? true : z10, (i12 & 131072) != 0 ? null : gVar, (i12 & 262144) != 0 ? null : c5156b, (i12 & ImageMetadata.LENS_APERTURE) != 0 ? U.d() : set, (i12 & ImageMetadata.SHADING_MODE) != 0 ? null : lVar2, (i12 & 2097152) != 0 ? null : pVar2, (i12 & 4194304) != 0 ? null : jVar, (i12 & 8388608) != 0 ? null : lVar3, (i12 & 16777216) != 0 ? null : lVar4, (i12 & 33554432) != 0 ? null : lVar5, (i12 & 67108864) != 0 ? null : lVar6, (i12 & 134217728) != 0 ? null : lVar7, (i12 & 268435456) != 0 ? null : aVar, (i12 & 536870912) != 0 ? null : pVar3, (i12 & 1073741824) != 0 ? null : pVar4);
    }
}
