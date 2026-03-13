package j9;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile d f39101b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f39102a = new HashSet();

    public static d a() {
        d dVar;
        d dVar2 = f39101b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = f39101b;
                if (dVar == null) {
                    dVar = new d();
                    f39101b = dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public Set b() {
        Set setUnmodifiableSet;
        synchronized (this.f39102a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f39102a);
        }
        return setUnmodifiableSet;
    }
}
