package M6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static P f9322a;

    public static synchronized I a(E e10) {
        try {
            if (f9322a == null) {
                f9322a = new P(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (I) f9322a.b(e10);
    }

    public static synchronized I b(String str) {
        return a(E.d("common").c());
    }
}
