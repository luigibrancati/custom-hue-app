package I3;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b.c f5643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.C0093b f5644b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f5645a;

            public a(Throwable th) {
                this.f5645a = th;
            }

            public String toString() {
                return "FAILURE (" + this.f5645a.getMessage() + ")";
            }
        }

        /* JADX INFO: renamed from: I3.y$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0093b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            public C0093b() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            public c() {
            }
        }
    }

    static {
        f5643a = new b.c();
        f5644b = new b.C0093b();
    }

    O7.e a();
}
