package Wd;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f17902a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f17902a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
