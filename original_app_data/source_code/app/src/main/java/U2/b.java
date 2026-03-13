package U2;

import android.content.Context;
import android.util.Log;
import kotlin.jvm.internal.AbstractC4862t;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f16595a = new b();

    public final Object a(Context context, String tag, l manager) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(tag, "tag");
        AbstractC4862t.e(manager, "manager");
        try {
            return manager.invoke(context);
        } catch (NoClassDefFoundError unused) {
            Log.d(tag, "Unable to find adservices code, check manifest for uses-library tag, versionS=" + a.f16592a.b());
            return null;
        }
    }
}
