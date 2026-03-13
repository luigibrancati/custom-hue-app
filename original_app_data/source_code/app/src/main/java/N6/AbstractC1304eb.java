package N6;

/* JADX INFO: renamed from: N6.eb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1304eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C1278cb f10238a;

    public static synchronized Sa a(Ka ka2) {
        try {
            if (f10238a == null) {
                f10238a = new C1278cb(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Sa) f10238a.b(ka2);
    }

    public static synchronized Sa b(String str) {
        return a(Ka.d(str).c());
    }
}
