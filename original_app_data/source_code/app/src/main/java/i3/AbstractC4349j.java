package i3;

import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: i3.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4349j {
    public static Bundle a(Bundle source) {
        AbstractC4862t.e(source, "source");
        return source;
    }

    public static final void b(Bundle bundle, Bundle from) {
        AbstractC4862t.e(from, "from");
        bundle.putAll(from);
    }

    public static final void c(Bundle bundle, String key, Bundle value) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        bundle.putBundle(key, value);
    }

    public static final void d(Bundle bundle, String key, List value) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        bundle.putStringArrayList(key, AbstractC4350k.a(value));
    }

    public static final void e(Bundle bundle, String key) {
        AbstractC4862t.e(key, "key");
        bundle.remove(key);
    }
}
