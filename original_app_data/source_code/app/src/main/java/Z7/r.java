package Z7;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f20384b = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f20385a = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
    }

    public static r b() {
        return f20384b;
    }

    public synchronized void a(a aVar, Class cls) {
        try {
            a aVar2 = (a) this.f20385a.get(cls);
            if (aVar2 != null && !aVar2.equals(aVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f20385a.put(cls, aVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
