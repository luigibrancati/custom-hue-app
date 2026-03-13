package na;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: na.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5154d extends WeakReference {

    /* JADX INFO: renamed from: na.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        C5154d a(ma.b bVar);
    }

    public C5154d(ma.b bVar) {
        super(bVar);
    }

    public boolean a(Object obj) {
        ma.b bVar = (ma.b) get();
        return (obj instanceof ma.b) && bVar != null && bVar.a() == ((ma.b) obj).a();
    }

    public boolean b() {
        return get() == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WeakReference)) {
            return false;
        }
        ma.b bVar = (ma.b) get();
        Object obj2 = ((WeakReference) obj).get();
        return bVar != null && (obj2 instanceof ma.b) && bVar.a().equals(((ma.b) obj2).a());
    }

    public int hashCode() {
        if (get() != 0) {
            return ((ma.b) get()).hashCode();
        }
        return 0;
    }
}
