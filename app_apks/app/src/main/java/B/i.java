package B;

import E.AbstractC0807p0;
import L.AbstractC1109l0;
import L.X0;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f506c;

    public i(X0 x02, X0 x03) {
        this.f504a = x03.a(TextureViewIsClosedQuirk.class);
        this.f505b = x02.a(PreviewOrientationIncorrectQuirk.class);
        this.f506c = x02.a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public void a(List list) {
        if (!b() || list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC1109l0) it.next()).d();
        }
        AbstractC0807p0.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    public boolean b() {
        return this.f504a || this.f505b || this.f506c;
    }
}
