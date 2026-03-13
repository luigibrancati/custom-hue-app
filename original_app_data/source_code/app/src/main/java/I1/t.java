package I1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f5509a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f5510b;

    public synchronized void a(Map map) {
        this.f5510b = null;
        this.f5509a.clear();
        this.f5509a.putAll(map);
    }

    public synchronized Map b() {
        try {
            if (this.f5510b == null) {
                this.f5510b = Collections.unmodifiableMap(new HashMap(this.f5509a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f5510b;
    }
}
