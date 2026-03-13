package S8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f15423a;

    public static b b() {
        if (f15423a == null) {
            f15423a = new b();
        }
        return f15423a;
    }

    @Override // S8.a
    public long a() {
        return System.currentTimeMillis();
    }
}
