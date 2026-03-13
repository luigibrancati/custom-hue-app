package G3;

import android.content.Context;
import android.view.WindowManager;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f4465b = new d();

    @Override // G3.c
    public float a(Context context) {
        AbstractC4862t.e(context, "context");
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
