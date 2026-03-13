package G3;

import C3.t;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f4470b = new h();

    @Override // G3.f
    public t a(Context context, c densityCompatHelper) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(densityCompatHelper, "densityCompatHelper");
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        AbstractC4862t.d(bounds, "getBounds(...)");
        return new t(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // G3.f
    public t b(Context context, c densityCompatHelper) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(densityCompatHelper, "densityCompatHelper");
        return g.f4469b.b(context, densityCompatHelper);
    }
}
