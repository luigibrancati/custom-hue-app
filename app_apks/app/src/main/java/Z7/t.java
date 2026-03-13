package Z7;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f20389b = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f20390a = new HashMap();

    public static t b() {
        return f20389b;
    }

    public synchronized P7.v a(String str) {
        if (!this.f20390a.containsKey(str)) {
            throw new GeneralSecurityException("Name " + str + " does not exist");
        }
        return (P7.v) this.f20390a.get(str);
    }

    public synchronized void c(String str, P7.v vVar) {
        try {
            if (!this.f20390a.containsKey(str)) {
                this.f20390a.put(str, vVar);
                return;
            }
            if (((P7.v) this.f20390a.get(str)).equals(vVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + this.f20390a.get(str) + "), cannot insert " + vVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void d(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c((String) entry.getKey(), (P7.v) entry.getValue());
        }
    }
}
