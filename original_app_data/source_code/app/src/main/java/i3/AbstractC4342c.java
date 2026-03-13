package i3;

import android.os.Bundle;
import fc.C4025h;
import gc.P;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: i3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4342c {
    public static Bundle a(Bundle source) {
        AbstractC4862t.e(source, "source");
        return source;
    }

    public static final boolean b(Bundle bundle, String key) {
        AbstractC4862t.e(key, "key");
        return bundle.containsKey(key);
    }

    public static final Bundle c(Bundle bundle, String key) {
        AbstractC4862t.e(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        AbstractC4343d.a(key);
        throw new C4025h();
    }

    public static final Bundle d(Bundle bundle, String key) {
        AbstractC4862t.e(key, "key");
        return bundle.getBundle(key);
    }

    public static final List e(Bundle bundle, String key) {
        AbstractC4862t.e(key, "key");
        return bundle.getStringArrayList(key);
    }

    public static final boolean f(Bundle bundle) {
        return bundle.isEmpty();
    }

    public static final Map g(Bundle bundle) {
        Map mapD = P.d(bundle.size());
        for (String str : bundle.keySet()) {
            AbstractC4862t.b(str);
            mapD.put(str, bundle.get(str));
        }
        return P.b(mapD);
    }
}
