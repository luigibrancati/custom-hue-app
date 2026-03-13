package jb;

import android.content.Context;
import android.content.res.AssetManager;
import android.opengl.EGLContext;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import androidx.fragment.app.d0;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC2758n;
import androidx.lifecycle.S;
import cb.C3091b;
import cb.C3092c;
import com.google.android.filament.ColorGrading;
import com.google.android.filament.Colors;
import com.google.android.filament.Engine;
import com.google.android.filament.Fence;
import com.google.android.filament.Filament;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.LightManager;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.Skybox;
import com.google.android.filament.SwapChain;
import com.google.android.filament.ToneMapper;
import com.google.android.filament.View;
import com.google.android.filament.Viewport;
import com.google.android.filament.android.DisplayHelper;
import com.google.android.filament.android.UiHelper;
import com.google.android.filament.gltfio.Gltfio;
import com.google.android.filament.utils.KTX1Loader;
import com.google.android.filament.utils.Utils;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import gc.C4179C;
import gc.C4206t;
import java.util.Iterator;
import java.util.List;
import jb.AbstractC4755b;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;
import tb.C5872a;
import vb.C6077a;
import vb.C6078b;
import vc.InterfaceC6082a;
import vc.p;
import wb.C6183a;
import wb.l;
import xb.AbstractC6355a;
import zb.AbstractC6555a;

/* JADX INFO: renamed from: jb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4755b extends SurfaceView {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final a f39106Q = new a(null);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f39107R = 8;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final C3092c f39108S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final float f39109T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final C3091b f39110V;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public EGLContext f39111A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Engine f39112B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Scene f39113C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public View f39114D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Renderer f39115E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public l f39116F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public wb.k f39117G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public C6183a f39118H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public rb.g f39119I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Ab.b f39120J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Ab.e f39121P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f39122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Engine f39123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f39124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wb.k f39125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C6183a f39126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C5872a f39127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f39128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Renderer f39129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final UiHelper f39130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ab.b f39131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ab.e f39132k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f39133l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final rb.g f39134m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public vc.l f39135n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C6078b f39136o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C6077a f39137p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d.p f39138q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AbstractC2754j f39139r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f39140s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DisplayHelper f39141t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SwapChain f39142u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e f39143v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f39144w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public MotionEvent f39145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Cb.e f39146y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Long f39147z;

    /* JADX INFO: renamed from: jb.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static /* synthetic */ C5872a g(a aVar, Engine engine, boolean z10, IndirectLight indirectLight, Skybox skybox, List list, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            boolean z11 = z10;
            IndirectLight indirectLight2 = (i10 & 4) != 0 ? null : indirectLight;
            if ((i10 & 8) != 0) {
                skybox = new Skybox.Builder().color(AbstractC6555a.e(0.0f, z11 ? 1.0f : 0.0f).i()).build(engine);
            }
            return aVar.e(engine, z11, indirectLight2, skybox, (i10 & 16) != 0 ? null : list);
        }

        public final Ab.b a(Engine engine) {
            AbstractC4862t.e(engine, "engine");
            return new C0510b(engine);
        }

        public final rb.g b(View view) {
            AbstractC4862t.e(view, "view");
            return new rb.g(view);
        }

        public final EGLContext c() {
            return Cb.d.f1235a.a();
        }

        public final Engine d(EGLContext eglContext) {
            AbstractC4862t.e(eglContext, "eglContext");
            Engine engineCreate = Engine.create(eglContext);
            AbstractC4862t.d(engineCreate, "create(...)");
            return engineCreate;
        }

        public final C5872a e(Engine engine, boolean z10, IndirectLight indirectLight, Skybox skybox, List list) {
            AbstractC4862t.e(engine, "engine");
            return new C5872a(indirectLight, skybox, list);
        }

        public final C5872a f(C6183a environmentLoader, boolean z10) {
            AbstractC4862t.e(environmentLoader, "environmentLoader");
            Engine engineE = environmentLoader.e();
            KTX1Loader kTX1Loader = KTX1Loader.INSTANCE;
            Engine engineE2 = environmentLoader.e();
            AssetManager assets = environmentLoader.d().getAssets();
            AbstractC4862t.d(assets, "getAssets(...)");
            return g(this, engineE, z10, KTX1Loader.createIndirectLight$default(kTX1Loader, engineE2, Cb.c.b(assets, "environments/neutral/neutral_ibl.ktx"), null, 4, null).getIndirectLight(), null, null, 24, null);
        }

        public final C6183a h(Engine engine, Context context) {
            AbstractC4862t.e(engine, "engine");
            AbstractC4862t.e(context, "context");
            return AbstractC4754a.a(engine, context);
        }

        public final Ab.e i(Engine engine) {
            AbstractC4862t.e(engine, "engine");
            return new c(engine);
        }

        public final wb.k j(Engine engine, Context context) {
            AbstractC4862t.e(engine, "engine");
            AbstractC4862t.e(context, "context");
            return AbstractC4754a.b(engine, context);
        }

        public final l k(Engine engine, Context context) {
            AbstractC4862t.e(engine, "engine");
            AbstractC4862t.e(context, "context");
            return AbstractC4754a.c(engine, context);
        }

        public final Renderer l(Engine engine) {
            AbstractC4862t.e(engine, "engine");
            Renderer rendererCreateRenderer = engine.createRenderer();
            AbstractC4862t.d(rendererCreateRenderer, "createRenderer(...)");
            return rendererCreateRenderer;
        }

        public final Scene m(Engine engine) {
            AbstractC4862t.e(engine, "engine");
            Scene sceneCreateScene = engine.createScene();
            AbstractC4862t.d(sceneCreateScene, "createScene(...)");
            return sceneCreateScene;
        }

        public final View n(Engine engine) {
            AbstractC4862t.e(engine, "engine");
            View viewCreateView = engine.createView();
            View.RenderQuality renderQuality = viewCreateView.getRenderQuality();
            View.QualityLevel qualityLevel = View.QualityLevel.MEDIUM;
            renderQuality.hdrColorBuffer = qualityLevel;
            viewCreateView.setRenderQuality(renderQuality);
            View.DynamicResolutionOptions dynamicResolutionOptions = viewCreateView.getDynamicResolutionOptions();
            dynamicResolutionOptions.enabled = false;
            dynamicResolutionOptions.homogeneousScaling = true;
            dynamicResolutionOptions.quality = qualityLevel;
            viewCreateView.setDynamicResolutionOptions(dynamicResolutionOptions);
            View.MultiSampleAntiAliasingOptions multiSampleAntiAliasingOptions = viewCreateView.getMultiSampleAntiAliasingOptions();
            multiSampleAntiAliasingOptions.enabled = false;
            viewCreateView.setMultiSampleAntiAliasingOptions(multiSampleAntiAliasingOptions);
            viewCreateView.setAntiAliasing(View.AntiAliasing.FXAA);
            View.AmbientOcclusionOptions ambientOcclusionOptions = viewCreateView.getAmbientOcclusionOptions();
            ambientOcclusionOptions.enabled = false;
            viewCreateView.setAmbientOcclusionOptions(ambientOcclusionOptions);
            viewCreateView.setColorGrading(new ColorGrading.Builder().toneMapper(new ToneMapper.Filmic()).build(engine));
            viewCreateView.setShadowingEnabled(false);
            AbstractC4862t.d(viewCreateView, "apply(...)");
            return viewCreateView;
        }

        public final C3092c o() {
            return AbstractC4755b.f39108S;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: jb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0510b extends Ab.b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0510b(Engine engine) {
            super(engine, null, 2, 0 == true ? 1 : 0);
            AbstractC4862t.e(engine, "engine");
            C0(AbstractC6555a.c(new C3091b(0.0f, 0.0f, 1.0f), null, null, 6, null));
            D(16.0f, 0.008f, 100.0f);
        }
    }

    /* JADX INFO: renamed from: jb.b$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends Ab.e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Engine engine) {
            super(engine, LightManager.Type.DIRECTIONAL, 0, new vc.l() { // from class: jb.c
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AbstractC4755b.c.K0((LightManager.Builder) obj);
                }
            }, 4, null);
            AbstractC4862t.e(engine, "engine");
        }

        public static final C4015H K0(LightManager.Builder builder) {
            AbstractC4862t.e(builder, "<this>");
            AbstractC6355a.a(builder, AbstractC4755b.f39106Q.o());
            builder.intensity(100000.0f);
            builder.direction(0.0f, -1.0f, 0.0f);
            builder.castShadows(true);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: jb.b$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class d implements Choreographer.FrameCallback {
        public d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            Choreographer.getInstance().postFrameCallback(this);
            AbstractC4755b.this.j(j10);
        }
    }

    /* JADX INFO: renamed from: jb.b$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class e implements DefaultLifecycleObserver {
        public e() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onCreate(InterfaceC2758n interfaceC2758n) {
            super.onCreate(interfaceC2758n);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
            AbstractC4755b.this.getViewNodeWindowManager();
            AbstractC4755b.this.h();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
            Choreographer.getInstance().removeFrameCallback(AbstractC4755b.this.f39144w);
            AbstractC4755b.this.getViewNodeWindowManager();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
            AbstractC4755b.this.getViewNodeWindowManager();
            Choreographer.getInstance().removeFrameCallback(AbstractC4755b.this.f39144w);
            Choreographer.getInstance().postFrameCallback(AbstractC4755b.this.f39144w);
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

    /* JADX INFO: renamed from: jb.b$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class f implements UiHelper.RendererCallback {
        public f() {
        }

        @Override // com.google.android.filament.android.UiHelper.RendererCallback
        public void onDetachedFromSurface() {
            AbstractC4755b.this.f39141t.detach();
            SwapChain swapChain = AbstractC4755b.this.f39142u;
            if (swapChain != null) {
                AbstractC4755b abstractC4755b = AbstractC4755b.this;
                try {
                    C4035r.a aVar = C4035r.f34274b;
                    abstractC4755b.getEngine().destroySwapChain(swapChain);
                    C4035r.b(C4015H.f34254a);
                } catch (Throwable th) {
                    C4035r.a aVar2 = C4035r.f34274b;
                    C4035r.b(AbstractC4036s.a(th));
                }
                abstractC4755b.getEngine().flushAndWait();
                abstractC4755b.f39142u = null;
            }
        }

        @Override // com.google.android.filament.android.UiHelper.RendererCallback
        public void onNativeWindowChanged(Surface surface) {
            Object objB;
            AbstractC4862t.e(surface, "surface");
            SwapChain swapChain = AbstractC4755b.this.f39142u;
            if (swapChain != null) {
                AbstractC4755b abstractC4755b = AbstractC4755b.this;
                try {
                    C4035r.a aVar = C4035r.f34274b;
                    abstractC4755b.getEngine().destroySwapChain(swapChain);
                    objB = C4035r.b(C4015H.f34254a);
                } catch (Throwable th) {
                    C4035r.a aVar2 = C4035r.f34274b;
                    objB = C4035r.b(AbstractC4036s.a(th));
                }
                C4035r.a(objB);
            }
            AbstractC4755b abstractC4755b2 = AbstractC4755b.this;
            abstractC4755b2.f39142u = abstractC4755b2.getEngine().createSwapChain(surface);
            AbstractC4755b.this.f39141t.attach(AbstractC4755b.this.getRenderer(), AbstractC4755b.this.getDisplay());
        }

        @Override // com.google.android.filament.android.UiHelper.RendererCallback
        public void onResized(int i10, int i11) {
            AbstractC4755b.this.k(i10, i11);
            Fence fenceCreateFence = AbstractC4755b.this.getEngine().createFence();
            AbstractC4755b abstractC4755b = AbstractC4755b.this;
            fenceCreateFence.wait(Fence.Mode.FLUSH, -1L);
            abstractC4755b.getEngine().destroyFence(fenceCreateFence);
        }
    }

    /* JADX INFO: renamed from: jb.b$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class g extends AbstractC4860q implements vc.l {
        public g(Object obj) {
            super(1, obj, AbstractC4755b.class, "addNode", "addNode$sceneview_release(Lio/github/sceneview/node/Node;)V", 0);
        }

        public final void i(Ab.f p02) {
            AbstractC4862t.e(p02, "p0");
            ((AbstractC4755b) this.receiver).g(p02);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((Ab.f) obj);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: jb.b$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class h extends AbstractC4860q implements vc.l {
        public h(Object obj) {
            super(1, obj, AbstractC4755b.class, "removeNode", "removeNode$sceneview_release(Lio/github/sceneview/node/Node;)V", 0);
        }

        public final void i(Ab.f p02) {
            AbstractC4862t.e(p02, "p0");
            ((AbstractC4755b) this.receiver).l(p02);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((Ab.f) obj);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: jb.b$i */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class i extends AbstractC4860q implements InterfaceC6082a {
        public i(Object obj) {
            super(0, obj, AbstractC4755b.class, "getHeight", "getHeight()I", 0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(((AbstractC4755b) this.receiver).getHeight());
        }
    }

    /* JADX INFO: renamed from: jb.b$j */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class j extends AbstractC4860q implements vc.l {
        public j(Object obj) {
            super(1, obj, AbstractC4755b.class, "addNode", "addNode$sceneview_release(Lio/github/sceneview/node/Node;)V", 0);
        }

        public final void i(Ab.f p02) {
            AbstractC4862t.e(p02, "p0");
            ((AbstractC4755b) this.receiver).g(p02);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((Ab.f) obj);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: jb.b$k */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class k extends AbstractC4860q implements vc.l {
        public k(Object obj) {
            super(1, obj, AbstractC4755b.class, "removeNode", "removeNode$sceneview_release(Lio/github/sceneview/node/Node;)V", 0);
        }

        public final void i(Ab.f p02) {
            AbstractC4862t.e(p02, "p0");
            ((AbstractC4755b) this.receiver).l(p02);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((Ab.f) obj);
            return C4015H.f34254a;
        }
    }

    static {
        Gltfio.init();
        Filament.init();
        Utils.init();
        float[] fArrCct = Colors.cct(6500.0f);
        AbstractC4862t.d(fArrCct, "cct(...)");
        f39108S = AbstractC6555a.p(fArrCct);
        f39109T = 100000.0f;
        f39110V = new C3091b(0.0f, 0.0f, -4.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4755b(Context context, AttributeSet attributeSet, int i10, int i11, Engine engine, l lVar, wb.k kVar, C6183a c6183a, Scene scene, View view, Renderer renderer, Ab.b bVar, Ab.e eVar, C5872a c5872a, boolean z10, rb.g gVar, C6077a.InterfaceC0627a interfaceC0627a, Ab.j jVar, C6078b.a aVar, p pVar, d.p pVar2, AbstractC2754j abstractC2754j) {
        View viewN;
        Scene sceneM;
        Renderer rendererL;
        Ab.e eVarI;
        rb.g gVarB;
        Ab.b bVarA;
        super(context, attributeSet, i10, i11);
        AbstractC4862t.e(context, "context");
        this.f39122a = pVar;
        if (engine == null) {
            a aVar2 = f39106Q;
            EGLContext eGLContextC = aVar2.c();
            this.f39111A = eGLContextC;
            engine = aVar2.d(eGLContextC);
            this.f39112B = engine;
        }
        this.f39123b = engine;
        if (lVar == null) {
            lVar = f39106Q.k(engine, context);
            this.f39116F = lVar;
        }
        this.f39124c = lVar;
        if (kVar == null) {
            kVar = f39106Q.j(engine, context);
            this.f39117G = kVar;
        }
        this.f39125d = kVar;
        if (c6183a == null) {
            c6183a = f39106Q.h(engine, context);
            this.f39118H = c6183a;
        }
        this.f39126e = c6183a;
        this.f39127f = c5872a == null ? f39106Q.f(c6183a, z10) : c5872a;
        if (view == null) {
            viewN = f39106Q.n(engine);
            this.f39114D = viewN;
        } else {
            viewN = view;
        }
        viewN.setBlendMode(z10 ? View.BlendMode.OPAQUE : View.BlendMode.TRANSLUCENT);
        if (scene == null) {
            sceneM = f39106Q.m(engine);
            this.f39113C = sceneM;
        } else {
            sceneM = scene;
        }
        sceneM.setIndirectLight(this.f39127f.a());
        sceneM.setSkybox(this.f39127f.b());
        viewN.setScene(sceneM);
        this.f39128g = viewN;
        if (renderer == null) {
            rendererL = f39106Q.l(engine);
            this.f39115E = rendererL;
        } else {
            rendererL = renderer;
        }
        if (!z10) {
            Renderer.ClearOptions clearOptions = rendererL.getClearOptions();
            clearOptions.clear = !z10;
            rendererL.setClearOptions(clearOptions);
        }
        this.f39129h = rendererL;
        UiHelper uiHelper = new UiHelper(UiHelper.ContextErrorPolicy.DONT_CHECK);
        uiHelper.setRenderCallback(new f());
        uiHelper.setOpaque(z10);
        uiHelper.attachTo(this);
        this.f39130i = uiHelper;
        if (eVar == null) {
            eVarI = f39106Q.i(engine);
            this.f39121P = eVarI;
        } else {
            eVarI = eVar;
        }
        this.f39132k = eVarI;
        this.f39133l = C4206t.k();
        if (gVar == null) {
            gVarB = f39106Q.b(viewN);
            this.f39119I = gVarB;
        } else {
            gVarB = gVar;
        }
        this.f39134m = gVarB;
        this.f39136o = new C6078b(context, aVar);
        this.f39137p = new C6077a(new i(this), interfaceC0627a);
        this.f39138q = pVar2;
        this.f39139r = abstractC2754j;
        this.f39141t = new DisplayHelper(context);
        e eVar2 = new e();
        this.f39143v = eVar2;
        this.f39144w = new d();
        Ab.e eVar3 = this.f39132k;
        if (eVar3 != null) {
            g(eVar3);
        }
        if (bVar == null) {
            bVarA = f39106Q.a(engine);
            this.f39120J = bVarA;
        } else {
            bVarA = bVar;
        }
        setCameraNode(bVarA);
        AbstractC2754j lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.a(eVar2);
        }
        setKeepScreenOn(true);
    }

    public final void f(Ab.f node) {
        AbstractC4862t.e(node, "node");
        setChildNodes(C4179C.D0(this.f39133l, node));
    }

    public final void g(Ab.f node) {
        AbstractC4862t.e(node, "node");
        node.u0(this.f39134m);
        if (!node.U().isEmpty()) {
            getScene().addEntities(C4179C.U0(node.U()));
        }
        node.L().add(new g(this));
        node.M().add(new h(this));
        node.i0(getScene());
        Iterator it = node.I().iterator();
        while (it.hasNext()) {
            g((Ab.f) it.next());
        }
    }

    public d.p getActivity() {
        d.p pVar = this.f39138q;
        if (pVar != null) {
            return pVar;
        }
        try {
            return d0.a(this).requireActivity();
        } catch (Exception unused) {
            Context context = this.getContext();
            if (context instanceof d.p) {
                return (d.p) context;
            }
            return null;
        }
    }

    public final C6077a getCameraGestureDetector() {
        return this.f39137p;
    }

    public final C6077a.InterfaceC0627a getCameraManipulator() {
        C6077a c6077a = this.f39137p;
        if (c6077a != null) {
            c6077a.b();
        }
        return null;
    }

    public Ab.b getCameraNode() {
        Ab.b bVar = this.f39131j;
        AbstractC4862t.b(bVar);
        return bVar;
    }

    public final List<Ab.f> getChildNodes() {
        return this.f39133l;
    }

    public final rb.g getCollisionSystem() {
        return this.f39134m;
    }

    public final Engine getEngine() {
        return this.f39123b;
    }

    public final C5872a getEnvironment() {
        return this.f39127f;
    }

    public final C6183a getEnvironmentLoader() {
        return this.f39126e;
    }

    public final C6078b getGestureDetector() {
        return this.f39136o;
    }

    public IndirectLight getIndirectLight() {
        return getScene().getIndirectLight();
    }

    public AbstractC2754j getLifecycle() {
        return this.f39139r;
    }

    public Ab.e getMainLightNode() {
        return this.f39132k;
    }

    public final wb.k getMaterialLoader() {
        return this.f39125d;
    }

    public final l getModelLoader() {
        return this.f39124c;
    }

    public final vc.l getOnFrame() {
        return this.f39135n;
    }

    public final C6078b.a getOnGestureListener() {
        C6078b c6078b = this.f39136o;
        if (c6078b != null) {
            c6078b.a();
        }
        return null;
    }

    public final p getOnTouchEvent() {
        return this.f39122a;
    }

    public final Renderer getRenderer() {
        return this.f39129h;
    }

    public final Scene getScene() {
        Scene scene = this.f39128g.getScene();
        AbstractC4862t.b(scene);
        return scene;
    }

    public final Skybox getSkybox() {
        return getScene().getSkybox();
    }

    public final UiHelper getUiHelper() {
        return this.f39130i;
    }

    public final View getView() {
        return this.f39128g;
    }

    public final Ab.j getViewNodeWindowManager() {
        return null;
    }

    public final Ab.b get_cameraNode() {
        return this.f39131j;
    }

    public void h() {
        if (this.f39140s) {
            return;
        }
        setLifecycle(null);
        Choreographer.getInstance().removeFrameCallback(this.f39144w);
        try {
            C4035r.a aVar = C4035r.f34274b;
            this.f39130i.detach();
            C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            C4035r.b(AbstractC4036s.a(th));
        }
        Ab.b bVar = this.f39120J;
        if (bVar != null) {
            bVar.H();
        }
        Ab.e eVar = this.f39121P;
        if (eVar != null) {
            eVar.H();
        }
        Renderer renderer = this.f39115E;
        if (renderer != null) {
            C4035r.a(AbstractC4754a.r(this.f39123b, renderer));
        }
        View view = this.f39114D;
        if (view != null) {
            C4035r.a(AbstractC4754a.x(this.f39123b, view));
        }
        Scene scene = this.f39113C;
        if (scene != null) {
            C4035r.a(AbstractC4754a.s(this.f39123b, scene));
        }
        C6183a c6183a = this.f39118H;
        if (c6183a != null) {
            c6183a.b();
        }
        wb.k kVar = this.f39117G;
        if (kVar != null) {
            C4035r.a(AbstractC4754a.n(this.f39123b, kVar));
        }
        l lVar = this.f39116F;
        if (lVar != null) {
            C4035r.a(AbstractC4754a.p(this.f39123b, lVar));
        }
        Engine engine = this.f39112B;
        if (engine != null) {
            C4035r.a(AbstractC4754a.f(engine));
        }
        EGLContext eGLContext = this.f39111A;
        if (eGLContext != null) {
            Cb.d.f1235a.d(eGLContext);
        }
        this.f39140s = true;
    }

    public final boolean i() {
        return this.f39140s;
    }

    public void j(long j10) {
        this.f39124c.f();
        Iterator it = this.f39133l.iterator();
        while (it.hasNext()) {
            ((Ab.f) it.next()).j0(j10);
        }
        if (this.f39130i.isReadyToRender()) {
            getCameraManipulator();
            vc.l lVar = this.f39135n;
            if (lVar != null) {
                lVar.invoke(Long.valueOf(j10));
            }
            Renderer renderer = this.f39129h;
            SwapChain swapChain = this.f39142u;
            AbstractC4862t.b(swapChain);
            if (renderer.beginFrame(swapChain, j10)) {
                this.f39129h.render(this.f39128g);
                Cb.e eVar = this.f39146y;
                if (eVar != null) {
                    eVar.a(this);
                }
                this.f39129h.endFrame();
            }
        }
        this.f39147z = Long.valueOf(j10);
    }

    public void k(int i10, int i11) {
        this.f39128g.setViewport(new Viewport(0, 0, i10, i11));
        getCameraManipulator();
        Ab.b.P0(getCameraNode(), 0.0d, 0.0f, 0.0f, 0.0d, 15, null);
    }

    public final void l(Ab.f node) {
        AbstractC4862t.e(node, "node");
        node.u0(null);
        if (!node.U().isEmpty()) {
            getScene().removeEntities(C4179C.U0(node.U()));
        }
        node.L().remove(new j(this));
        node.M().remove(new k(this));
        node.l0(getScene());
        Iterator it = node.I().iterator();
        while (it.hasNext()) {
            l((Ab.f) it.next());
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        Object objB;
        super.onAttachedToWindow();
        if (getLifecycle() == null) {
            try {
                C4035r.a aVar = C4035r.f34274b;
                InterfaceC2758n interfaceC2758nA = S.a(this);
                objB = C4035r.b(interfaceC2758nA != null ? interfaceC2758nA.getLifecycle() : null);
            } catch (Throwable th) {
                C4035r.a aVar2 = C4035r.f34274b;
                objB = C4035r.b(AbstractC4036s.a(th));
            }
            setLifecycle((AbstractC2754j) (C4035r.g(objB) ? null : objB));
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        if (!this.f39140s) {
            h();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Object next;
        Ab.f fVarF;
        AbstractC4862t.e(event, "event");
        if (super.onTouchEvent(event)) {
            return false;
        }
        this.f39145x = event;
        Iterator it = this.f39134m.d(event).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((rb.h) next).f().g0()) {
                break;
            }
        }
        rb.h hVar = (rb.h) next;
        p pVar = this.f39122a;
        if ((pVar == null || !((Boolean) pVar.invoke(event, hVar)).booleanValue()) && (hVar == null || (fVarF = hVar.f()) == null || !fVarF.o0(event, hVar))) {
            C6078b c6078b = this.f39136o;
            if (c6078b != null) {
                c6078b.c(event, hVar);
            }
            C6077a c6077a = this.f39137p;
            if (c6077a != null) {
                c6077a.f(event);
            }
        }
        return true;
    }

    public final void setCameraManipulator(C6077a.InterfaceC0627a interfaceC0627a) {
        C6077a c6077a = this.f39137p;
        if (c6077a != null) {
            c6077a.g(interfaceC0627a);
        }
    }

    public final void setCameraNode(Ab.b cameraNode) {
        AbstractC4862t.e(cameraNode, "cameraNode");
        if (AbstractC4862t.a(this.f39131j, cameraNode)) {
            return;
        }
        Ab.b bVar = this.f39131j;
        if (bVar != null) {
            bVar.u0(null);
        }
        this.f39131j = cameraNode;
        cameraNode.u0(this.f39134m);
        cameraNode.N0(this.f39128g);
        this.f39128g.setCamera(cameraNode.h());
    }

    public final void setChildNodes(List<? extends Ab.f> value) {
        AbstractC4862t.e(value, "value");
        List listY0 = C4179C.y0(this.f39133l, C4179C.Z0(value));
        List listY02 = C4179C.y0(value, C4179C.Z0(this.f39133l));
        this.f39133l = C4179C.V0(value);
        Iterator it = listY0.iterator();
        while (it.hasNext()) {
            l((Ab.f) it.next());
        }
        Iterator it2 = listY02.iterator();
        while (it2.hasNext()) {
            g((Ab.f) it2.next());
        }
    }

    public final void setDestroyed(boolean z10) {
        this.f39140s = z10;
    }

    public final void setEnvironment(C5872a value) {
        AbstractC4862t.e(value, "value");
        if (AbstractC4862t.a(this.f39127f, value)) {
            return;
        }
        this.f39127f = value;
        setIndirectLight(value.a());
        setSkybox(this.f39127f.b());
    }

    public final void setFrontFaceWindingInverted(boolean z10) {
        this.f39128g.setFrontFaceWindingInverted(z10);
    }

    public void setIndirectLight(IndirectLight indirectLight) {
        if (AbstractC4862t.a(getScene().getIndirectLight(), indirectLight)) {
            return;
        }
        getScene().setIndirectLight(indirectLight);
    }

    public void setLifecycle(AbstractC2754j abstractC2754j) {
        AbstractC2754j abstractC2754j2 = this.f39139r;
        if (abstractC2754j2 != null) {
            abstractC2754j2.c(this.f39143v);
        }
        this.f39139r = abstractC2754j;
        if (abstractC2754j != null) {
            abstractC2754j.a(this.f39143v);
        }
    }

    public void setMainLightNode(Ab.e eVar) {
        if (AbstractC4862t.a(this.f39132k, eVar)) {
            return;
        }
        Ab.e eVar2 = this.f39132k;
        if (eVar2 != null) {
            l(eVar2);
        }
        this.f39132k = eVar;
        if (eVar != null) {
            g(eVar);
        }
    }

    public final void setOnFrame(vc.l lVar) {
        this.f39135n = lVar;
    }

    public final void setOnGestureListener(C6078b.a aVar) {
        C6078b c6078b = this.f39136o;
        if (c6078b != null) {
            c6078b.d(aVar);
        }
    }

    public final void setOnTouchEvent(p pVar) {
        this.f39122a = pVar;
    }

    public final void setScene(Scene value) {
        AbstractC4862t.e(value, "value");
        if (AbstractC4862t.a(this.f39128g.getScene(), value)) {
            return;
        }
        this.f39128g.setScene(value);
    }

    public final void setSkybox(Skybox skybox) {
        if (AbstractC4862t.a(getScene().getSkybox(), skybox)) {
            return;
        }
        getScene().setSkybox(skybox);
    }

    public final void set_cameraNode(Ab.b bVar) {
        this.f39131j = bVar;
    }

    public final void setViewNodeWindowManager(Ab.j jVar) {
    }
}
