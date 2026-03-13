package E3;

import C3.c;
import C3.d;
import C3.s;
import C3.t;
import C3.w;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f3257a = new h();

    public final C3.c a(t windowMetrics, FoldingFeature oemFeature) {
        d.b bVarA;
        c.b bVar;
        AbstractC4862t.e(windowMetrics, "windowMetrics");
        AbstractC4862t.e(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            bVarA = d.b.f1113b.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = d.b.f1113b.b();
        }
        int state = oemFeature.getState();
        if (state == 1) {
            bVar = c.b.f1106c;
        } else {
            if (state != 2) {
                return null;
            }
            bVar = c.b.f1107d;
        }
        Rect bounds = oemFeature.getBounds();
        AbstractC4862t.d(bounds, "getBounds(...)");
        if (!d(windowMetrics, new z3.b(bounds))) {
            return null;
        }
        Rect bounds2 = oemFeature.getBounds();
        AbstractC4862t.d(bounds2, "getBounds(...)");
        return new C3.d(new z3.b(bounds2), bVarA, bVar);
    }

    public final s b(t windowMetrics, WindowLayoutInfo info) {
        AbstractC4862t.e(windowMetrics, "windowMetrics");
        AbstractC4862t.e(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        AbstractC4862t.d(displayFeatures, "getDisplayFeatures(...)");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            C3.c cVarA = foldingFeature instanceof FoldingFeature ? f3257a.a(windowMetrics, foldingFeature) : null;
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return new s(arrayList);
    }

    public final s c(Context context, WindowLayoutInfo info) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(info, "info");
        return b(new w(null, 1, null).c(context), info);
    }

    public final boolean d(t tVar, z3.b bVar) {
        Rect rectA = tVar.a();
        if (bVar.e()) {
            return false;
        }
        if (bVar.d() != rectA.width() && bVar.a() != rectA.height()) {
            return false;
        }
        if (bVar.d() >= rectA.width() || bVar.a() >= rectA.height()) {
            return (bVar.d() == rectA.width() && bVar.a() == rectA.height()) ? false : true;
        }
        return false;
    }
}
