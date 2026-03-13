package Y8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f19832a;

    public static synchronized c d() {
        try {
            if (f19832a == null) {
                f19832a = new c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19832a;
    }

    @Override // Y8.v
    public String a() {
        return "isEnabled";
    }

    @Override // Y8.v
    public String b() {
        return "firebase_performance_collection_enabled";
    }
}
