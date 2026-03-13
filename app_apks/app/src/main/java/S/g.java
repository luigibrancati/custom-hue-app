package S;

import E.C0822x0;
import L.AbstractC1109l0;
import L.a1;
import android.media.MediaCodec;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15226a;

    public g() {
        this.f15226a = R.b.b(SurfaceOrderQuirk.class) != null;
    }

    public static /* synthetic */ int a(g gVar, a1.f fVar, a1.f fVar2) {
        gVar.getClass();
        return gVar.b(fVar.f()) - gVar.b(fVar2.f());
    }

    public final int b(AbstractC1109l0 abstractC1109l0) {
        if (abstractC1109l0.g() == MediaCodec.class) {
            return 2;
        }
        return (abstractC1109l0.g() == C0822x0.class || abstractC1109l0.g() == Y.f.class) ? 0 : 1;
    }

    public void c(List list) {
        if (this.f15226a) {
            Collections.sort(list, new Comparator() { // from class: S.f
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return g.a(this.f15225a, (a1.f) obj, (a1.f) obj2);
                }
            });
        }
    }
}
