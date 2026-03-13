package xb;

import com.google.android.filament.MaterialInstance;
import com.google.android.filament.RenderableManager;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: xb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6356b {
    public static final void a(RenderableManager.Builder builder, List materialInstances) {
        AbstractC4862t.e(builder, "<this>");
        AbstractC4862t.e(materialInstances, "materialInstances");
        int i10 = 0;
        for (Object obj : materialInstances) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C4206t.u();
            }
            MaterialInstance materialInstance = (MaterialInstance) obj;
            if (materialInstance != null) {
                builder.material(i10, materialInstance);
            }
            i10 = i11;
        }
    }

    public static final Object b(RenderableManager renderableManager, int i10) {
        AbstractC4862t.e(renderableManager, "<this>");
        try {
            C4035r.a aVar = C4035r.f34274b;
            renderableManager.destroy(i10);
            return C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            return C4035r.b(AbstractC4036s.a(th));
        }
    }
}
