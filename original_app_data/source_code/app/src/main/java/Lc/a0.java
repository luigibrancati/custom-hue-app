package Lc;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f8746a = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements a0 {
        public static /* synthetic */ void d(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // Lc.a0
        public b0 b() {
            b0 b0Var = b0.f8747a;
            if (b0Var == null) {
                d(0);
            }
            return b0Var;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    b0 b();
}
