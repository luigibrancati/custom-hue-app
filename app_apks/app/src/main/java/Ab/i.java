package Ab;

import cb.C3091b;
import com.google.android.filament.Engine;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.RenderableManager;
import fc.C4015H;
import gc.C4179C;
import gc.C4205s;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import ub.d;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class i extends d {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final ub.d f327U;

    public i(Engine engine, ub.d dVar, List list, List list2, l lVar) {
        super(engine, dVar, list, list2, lVar);
        this.f327U = dVar;
    }

    public static final C4015H O0(RenderableManager.Builder builder) {
        AbstractC4862t.e(builder, "<this>");
        return C4015H.f34254a;
    }

    @Override // Ab.d
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public ub.d M0() {
        return this.f327U;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Engine engine, ub.d geometry, MaterialInstance materialInstance, l builderApply) {
        this(engine, geometry, C4205s.d(materialInstance), C4205s.d(new Bc.f(0, ((Bc.f) C4179C.s0(geometry.d())).d())), builderApply);
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(geometry, "geometry");
        AbstractC4862t.e(builderApply, "builderApply");
    }

    public /* synthetic */ i(Engine engine, float f10, C3091b c3091b, int i10, int i11, MaterialInstance materialInstance, l lVar, int i12, AbstractC4854k abstractC4854k) {
        this(engine, (i12 & 2) != 0 ? ub.d.f45537l.b() : f10, (i12 & 4) != 0 ? ub.d.f45537l.a() : c3091b, (i12 & 8) != 0 ? ub.d.f45537l.d() : i10, (i12 & 16) != 0 ? ub.d.f45537l.c() : i11, (i12 & 32) != 0 ? null : materialInstance, (i12 & 64) != 0 ? new l() { // from class: Ab.h
            @Override // vc.l
            public final Object invoke(Object obj) {
                return i.O0((RenderableManager.Builder) obj);
            }
        } : lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Engine engine, float f10, C3091b center, int i10, int i11, MaterialInstance materialInstance, l builderApply) {
        this(engine, new d.a().k(f10).j(center).m(i10).l(i11).h(engine), materialInstance, builderApply);
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(center, "center");
        AbstractC4862t.e(builderApply, "builderApply");
    }
}
