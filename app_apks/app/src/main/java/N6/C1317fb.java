package N6;

/* JADX INFO: renamed from: N6.fb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1317fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C1317fb f10265a;

    public static synchronized C1317fb a() {
        try {
            if (f10265a == null) {
                f10265a = new C1317fb();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10265a;
    }
}
