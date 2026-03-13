package O6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class G5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static F5 f11295a;

    public static synchronized C1794x5 a(AbstractC1759s5 abstractC1759s5) {
        try {
            if (f11295a == null) {
                f11295a = new F5(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C1794x5) f11295a.b(abstractC1759s5);
    }

    public static synchronized C1794x5 b(String str) {
        return a(AbstractC1759s5.d("vision-common").c());
    }
}
