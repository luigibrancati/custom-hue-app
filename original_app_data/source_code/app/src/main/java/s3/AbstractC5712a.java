package s3;

/* JADX INFO: renamed from: s3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5712a {
    public static void a(String str, int i10) {
        AbstractC5714c.a(g(str), i10);
    }

    public static void b(String str) {
        AbstractC5713b.a(g(str));
    }

    public static void c(String str, int i10) {
        AbstractC5714c.b(g(str), i10);
    }

    public static void d() {
        AbstractC5713b.b();
    }

    public static boolean e() {
        return AbstractC5714c.c();
    }

    public static void f(String str, int i10) {
        AbstractC5714c.d(g(str), i10);
    }

    public static String g(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
