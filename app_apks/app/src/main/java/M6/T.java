package M6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static T f9324a;

    public static synchronized T a() {
        try {
            if (f9324a == null) {
                f9324a = new T();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f9324a;
    }

    public static void b() {
        S.a();
    }
}
