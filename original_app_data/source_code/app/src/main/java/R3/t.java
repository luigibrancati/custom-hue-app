package R3;

import I3.AbstractC0890u;
import android.content.Context;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14544a;

    static {
        String strI = AbstractC0890u.i("ProcessUtils");
        AbstractC4862t.d(strI, "tagWithPrefix(...)");
        f14544a = strI;
    }

    public static final String a(Context context) {
        return C1931a.f14518a.a();
    }

    public static final boolean b(Context context, androidx.work.a configuration) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(configuration, "configuration");
        String strA = a(context);
        String strC = configuration.c();
        return (strC == null || strC.length() == 0) ? AbstractC4862t.a(strA, context.getApplicationInfo().processName) : AbstractC4862t.a(strA, configuration.c());
    }
}
