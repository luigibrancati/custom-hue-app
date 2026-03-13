package Y8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f19831a;

    public static synchronized b e() {
        try {
            if (f19831a == null) {
                f19831a = new b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19831a;
    }

    @Override // Y8.v
    public String b() {
        return "firebase_performance_collection_deactivated";
    }

    public Boolean d() {
        return Boolean.FALSE;
    }
}
