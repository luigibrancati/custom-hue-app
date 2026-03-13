package X2;

import android.content.Context;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {
    /* JADX WARN: Illegal instructions before constructor call */
    public f(Context context) {
        AbstractC4862t.e(context, "context");
        Object systemService = context.getSystemService((Class<Object>) d.a());
        AbstractC4862t.d(systemService, "context.getSystemService…ementManager::class.java)");
        super(e.a(systemService));
    }
}
