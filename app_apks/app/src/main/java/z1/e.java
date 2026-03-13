package z1;

import d.AbstractC3782A;
import fc.C4015H;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f48698a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f48699b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f48700c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f48701d;

    public final void d(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(closeable, "closeable");
        if (this.f48701d) {
            f(closeable);
            return;
        }
        synchronized (this.f48698a) {
            autoCloseable = (AutoCloseable) this.f48699b.put(key, closeable);
        }
        f(autoCloseable);
    }

    public final void e() {
        if (this.f48701d) {
            return;
        }
        this.f48701d = true;
        synchronized (this.f48698a) {
            try {
                Iterator it = this.f48699b.values().iterator();
                while (it.hasNext()) {
                    f((AutoCloseable) it.next());
                }
                Iterator it2 = this.f48700c.iterator();
                while (it2.hasNext()) {
                    f((AutoCloseable) it2.next());
                }
                this.f48700c.clear();
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                AbstractC3782A.a(autoCloseable);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final AutoCloseable g(String key) {
        AutoCloseable autoCloseable;
        AbstractC4862t.e(key, "key");
        synchronized (this.f48698a) {
            autoCloseable = (AutoCloseable) this.f48699b.get(key);
        }
        return autoCloseable;
    }
}
