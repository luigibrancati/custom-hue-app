package G3;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f4462b = new b();

    @Override // G3.a
    public Rect a(Context context) {
        AbstractC4862t.e(context, "context");
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
        AbstractC4862t.d(bounds, "getBounds(...)");
        return bounds;
    }
}
