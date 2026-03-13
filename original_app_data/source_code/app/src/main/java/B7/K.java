package B7;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K implements N, J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f694c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile N f695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f696b = f694c;

    public K(N n10) {
        this.f695a = n10;
    }

    public static J a(N n10) {
        return n10 instanceof J ? (J) n10 : new K(n10);
    }

    public static N b(N n10) {
        n10.getClass();
        return n10 instanceof K ? n10 : new K(n10);
    }

    @Override // B7.N
    public final Object zza() {
        Object objZza;
        Object obj = this.f696b;
        Object obj2 = f694c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.f696b;
                if (objZza == obj2) {
                    objZza = this.f695a.zza();
                    Object obj3 = this.f696b;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.f696b = objZza;
                    this.f695a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objZza;
    }
}
