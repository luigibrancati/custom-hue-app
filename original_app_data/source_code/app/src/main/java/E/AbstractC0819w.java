package E;

/* JADX INFO: renamed from: E.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0819w {

    /* JADX INFO: renamed from: E.w$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {
        public static a a(int i10) {
            return b(i10, null);
        }

        public static a b(int i10, Throwable th) {
            return new C0786f(i10, th);
        }

        public abstract Throwable c();

        public abstract int d();
    }

    /* JADX INFO: renamed from: E.w$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static AbstractC0819w a(b bVar) {
        return b(bVar, null);
    }

    public static AbstractC0819w b(b bVar, a aVar) {
        return new C0784e(bVar, aVar);
    }

    public abstract a c();

    public abstract b d();
}
