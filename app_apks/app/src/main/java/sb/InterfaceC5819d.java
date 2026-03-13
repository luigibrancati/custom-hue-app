package sb;

import com.google.android.filament.Box;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.RenderableManager;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: sb.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC5819d extends InterfaceC5817b {
    default MaterialInstance B() {
        return t(0);
    }

    default int m() {
        return v().getInstance(getEntity());
    }

    default void n(int i10, int i11) {
        v().setLayerMask(m(), i10, i11);
    }

    default Box r() {
        Box box = new Box();
        v().getAxisAlignedBoundingBox(m(), box);
        return box;
    }

    default MaterialInstance t(int i10) {
        MaterialInstance materialInstanceAt = v().getMaterialInstanceAt(m(), i10);
        AbstractC4862t.d(materialInstanceAt, "getMaterialInstanceAt(...)");
        return materialInstanceAt;
    }

    default RenderableManager v() {
        RenderableManager renderableManager = x().getRenderableManager();
        AbstractC4862t.d(renderableManager, "getRenderableManager(...)");
        return renderableManager;
    }

    default void z(boolean z10) {
        n(255, z10 ? 255 : 0);
    }
}
