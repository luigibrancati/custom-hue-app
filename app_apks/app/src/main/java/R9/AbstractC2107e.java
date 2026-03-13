package R9;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: R9.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2107e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f14954a = new HashMap();

    public abstract Object a(Object obj);

    public Object b(Object obj) {
        synchronized (this.f14954a) {
            try {
                if (this.f14954a.containsKey(obj)) {
                    return this.f14954a.get(obj);
                }
                Object objA = a(obj);
                this.f14954a.put(obj, objA);
                return objA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
