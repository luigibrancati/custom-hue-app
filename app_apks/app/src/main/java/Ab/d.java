package Ab;

import com.google.android.filament.Engine;
import com.google.android.filament.RenderableManager;
import fc.C4015H;
import java.util.List;
import jb.AbstractC4754a;
import kotlin.jvm.internal.AbstractC4862t;
import ub.AbstractC6014a;
import ub.AbstractC6015b;
import vc.l;
import xb.AbstractC6356b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends g {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final AbstractC6014a f273T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Engine engine, final AbstractC6014a geometry, final List materialInstances, final List primitivesOffsets, final l builderApply) {
        super(engine, 0, primitivesOffsets.size(), geometry.a(), materialInstances, new l() { // from class: Ab.c
            @Override // vc.l
            public final Object invoke(Object obj) {
                return d.L0(geometry, primitivesOffsets, materialInstances, builderApply, (RenderableManager.Builder) obj);
            }
        }, 2, null);
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(geometry, "geometry");
        AbstractC4862t.e(materialInstances, "materialInstances");
        AbstractC4862t.e(primitivesOffsets, "primitivesOffsets");
        AbstractC4862t.e(builderApply, "builderApply");
        this.f273T = geometry;
    }

    public static final C4015H L0(AbstractC6014a abstractC6014a, List list, List list2, l lVar, RenderableManager.Builder builder) {
        AbstractC4862t.e(builder, "<this>");
        AbstractC6015b.a(builder, abstractC6014a, list);
        AbstractC6356b.a(builder, list2);
        lVar.invoke(builder);
        return C4015H.f34254a;
    }

    @Override // Ab.g, Ab.f
    public void H() {
        super.H();
        AbstractC4754a.i(x(), M0());
    }

    public abstract AbstractC6014a M0();
}
