package b1;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final ViewParent a(View view) {
        AbstractC4862t.e(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(AbstractC2790a.f24963a);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final void b(View view, ViewParent viewParent) {
        AbstractC4862t.e(view, "<this>");
        view.setTag(AbstractC2790a.f24963a, viewParent);
    }
}
