package Ab;

import com.google.android.filament.Box;
import com.google.android.filament.Engine;
import com.google.android.filament.EntityManager;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.RenderableManager;
import gc.C4206t;
import java.util.List;
import jb.AbstractC4754a;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import sb.InterfaceC5819d;
import vc.l;
import zb.AbstractC6555a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends f implements InterfaceC5819d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Engine engine, int i10) {
        super(engine, i10);
        AbstractC4862t.e(engine, "engine");
    }

    @Override // Ab.f
    public void G0() {
        super.G0();
        z(h0());
    }

    @Override // Ab.f
    public void H() {
        super.H();
        AbstractC4754a.q(x(), getEntity());
    }

    public final void J0() {
        t0(AbstractC6555a.A(r()));
    }

    @Override // sb.InterfaceC5819d
    public /* bridge */ int m() {
        return super.m();
    }

    @Override // sb.InterfaceC5819d
    public /* bridge */ void n(int i10, int i11) {
        super.n(i10, i11);
    }

    @Override // sb.InterfaceC5819d
    public /* bridge */ Box r() {
        return super.r();
    }

    @Override // sb.InterfaceC5819d
    public /* bridge */ MaterialInstance t(int i10) {
        return super.t(i10);
    }

    @Override // sb.InterfaceC5819d
    public /* bridge */ RenderableManager v() {
        return super.v();
    }

    @Override // sb.InterfaceC5819d
    public /* bridge */ void z(boolean z10) {
        super.z(z10);
    }

    public /* synthetic */ g(Engine engine, int i10, int i11, Box box, List list, l lVar, int i12, AbstractC4854k abstractC4854k) {
        this(engine, (i12 & 2) != 0 ? EntityManager.get().create() : i10, i11, box, (i12 & 16) != 0 ? C4206t.k() : list, lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Engine engine, int i10, int i11, Box boundingBox, List materialInstances, l builder) {
        this(engine, i10);
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(boundingBox, "boundingBox");
        AbstractC4862t.e(materialInstances, "materialInstances");
        AbstractC4862t.e(builder, "builder");
        RenderableManager.Builder builderBoundingBox = new RenderableManager.Builder(i11).boundingBox(boundingBox);
        int i12 = 0;
        for (Object obj : materialInstances) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C4206t.u();
            }
            MaterialInstance materialInstance = (MaterialInstance) obj;
            if (materialInstance != null) {
                builderBoundingBox.material(i12, materialInstance);
            }
            i12 = i13;
        }
        AbstractC4862t.d(builderBoundingBox, "apply(...)");
        builder.invoke(builderBoundingBox);
        builderBoundingBox.build(engine, i10);
        J0();
    }
}
