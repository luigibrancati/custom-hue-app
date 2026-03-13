package Ab;

import cb.C3093d;
import com.google.android.filament.Camera;
import com.google.android.filament.Engine;
import com.google.android.filament.EntityManager;
import com.google.android.filament.View;
import com.google.android.filament.Viewport;
import fc.C4015H;
import jb.AbstractC4754a;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import sb.InterfaceC5816a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends f implements InterfaceC5816a {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public double f263T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public float f264U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f265V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public View f266W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f267X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f268Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Engine engine, int i10) {
        super(engine, i10);
        AbstractC4862t.e(engine, "engine");
        this.f263T = 28.0d;
        this.f264U = 0.01f;
        this.f265V = 1000.0f;
    }

    public static final C4015H K0(Camera camera) {
        AbstractC4862t.e(camera, "<this>");
        return C4015H.f34254a;
    }

    public static /* synthetic */ void P0(b bVar, double d10, float f10, float f11, double d11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateProjection");
        }
        if ((i10 & 1) != 0) {
            d10 = bVar.f263T;
        }
        double d12 = d10;
        if ((i10 & 2) != 0) {
            f10 = bVar.f264U;
        }
        float f12 = f10;
        if ((i10 & 4) != 0) {
            f11 = bVar.f265V;
        }
        float f13 = f11;
        if ((i10 & 8) != 0) {
            d11 = bVar.L0();
        }
        bVar.O0(d12, f12, f13, d11);
    }

    @Override // sb.InterfaceC5816a
    public float A() {
        return super.A();
    }

    @Override // sb.InterfaceC5816a
    public /* bridge */ void C(C3093d c3093d) {
        super.C(c3093d);
    }

    @Override // sb.InterfaceC5816a
    public /* bridge */ void D(float f10, float f11, float f12) {
        super.D(f10, f11, f12);
    }

    @Override // sb.InterfaceC5816a
    public /* bridge */ void E(double d10, double d11, double d12, double d13) {
        super.E(d10, d11, d12, d13);
    }

    @Override // Ab.f
    public void H() {
        AbstractC4754a.g(x(), h());
        super.H();
    }

    public final double L0() {
        Viewport viewportM0 = M0();
        if (viewportM0 == null) {
            return 1.0d;
        }
        Double dValueOf = Double.valueOf(((double) viewportM0.width) / ((double) viewportM0.height));
        if (Double.isNaN(dValueOf.doubleValue())) {
            dValueOf = null;
        }
        if (dValueOf != null) {
            return dValueOf.doubleValue();
        }
        return 1.0d;
    }

    public final Viewport M0() {
        View view = this.f266W;
        if (view != null) {
            return view.getViewport();
        }
        return null;
    }

    public final void N0(View view) {
        AbstractC4862t.e(view, "view");
        this.f266W = view;
        P0(this, 0.0d, 0.0f, 0.0f, 0.0d, 15, null);
    }

    public void O0(double d10, float f10, float f11, double d11) {
        if (this.f266W != null) {
            E(d10, d11, f10, f11);
        }
    }

    @Override // Ab.f
    public boolean b0() {
        return this.f268Y;
    }

    @Override // Ab.f
    public boolean g0() {
        return this.f267X;
    }

    @Override // sb.InterfaceC5816a
    public /* bridge */ Camera h() {
        return super.h();
    }

    @Override // sb.InterfaceC5816a
    public /* bridge */ float k() {
        return super.k();
    }

    @Override // sb.InterfaceC5816a
    public float u() {
        return super.u();
    }

    public /* synthetic */ b(Engine engine, l lVar, int i10, AbstractC4854k abstractC4854k) {
        this(engine, (i10 & 2) != 0 ? new l() { // from class: Ab.a
            @Override // vc.l
            public final Object invoke(Object obj) {
                return b.K0((Camera) obj);
            }
        } : lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Engine engine, l camera) {
        this(engine, EntityManager.get().create());
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(camera, "camera");
        Camera cameraCreateCamera = engine.createCamera(getEntity());
        AbstractC4862t.d(cameraCreateCamera, "createCamera(...)");
        camera.invoke(cameraCreateCamera);
    }
}
