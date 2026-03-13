package Z7;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class M extends RuntimeException {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        Object get();
    }

    public M(String str) {
        super(str);
    }

    public static Object a(a aVar) {
        try {
            return aVar.get();
        } catch (Exception e10) {
            throw new M(e10);
        }
    }

    public M(String str, Throwable th) {
        super(str, th);
    }

    public M(Throwable th) {
        super(th);
    }
}
