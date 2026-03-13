package B;

import L.h1;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtraCroppingQuirk f507a;

    public k() {
        this((ExtraCroppingQuirk) A.d.b(ExtraCroppingQuirk.class));
    }

    public Size a(Size size) {
        Size sizeD;
        ExtraCroppingQuirk extraCroppingQuirk = this.f507a;
        return (extraCroppingQuirk == null || (sizeD = extraCroppingQuirk.d(h1.d.PRIV)) == null || sizeD.getWidth() * sizeD.getHeight() <= size.getWidth() * size.getHeight()) ? size : sizeD;
    }

    public k(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f507a = extraCroppingQuirk;
    }
}
