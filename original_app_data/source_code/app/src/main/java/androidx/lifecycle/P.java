package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f23432a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f23432a.values().iterator();
        while (it.hasNext()) {
            ((N) it.next()).b();
        }
        this.f23432a.clear();
    }

    public final N b(String key) {
        AbstractC4862t.e(key, "key");
        return (N) this.f23432a.get(key);
    }

    public final Set c() {
        return new HashSet(this.f23432a.keySet());
    }

    public final void d(String key, N viewModel) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(viewModel, "viewModel");
        N n10 = (N) this.f23432a.put(key, viewModel);
        if (n10 != null) {
            n10.b();
        }
    }
}
