package af;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface c {
    void a(String str);

    void b(String str);

    void c(String str);

    boolean d();

    void debug(String str, Object... objArr);

    void e(String str, Object obj, Object obj2);

    void error(String str, Object... objArr);

    boolean f();

    void g(String str, Object obj, Object obj2);

    String getName();

    boolean h();

    void i(String str, Object obj, Object obj2);

    default boolean j(bf.b bVar) {
        int iB = bVar.b();
        if (iB == 0) {
            return k();
        }
        if (iB == 10) {
            return f();
        }
        if (iB == 20) {
            return h();
        }
        if (iB == 30) {
            return d();
        }
        if (iB == 40) {
            return r();
        }
        throw new IllegalArgumentException("Level [" + bVar + "] not recognized.");
    }

    boolean k();

    void l(String str, Throwable th);

    void m(String str, Object obj, Object obj2);

    void n(String str, Object obj);

    void o(String str, Object obj);

    void p(String str, Object obj);

    void q(String str, Throwable th);

    boolean r();

    void s(String str, Object obj, Object obj2);

    void t(String str, Object obj);

    void u(String str, Object obj);

    void v(String str, Throwable th);

    void w(String str);

    void warn(String str, Object... objArr);
}
