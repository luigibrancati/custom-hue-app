package Y5;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static d f(Object obj) {
        return new a(null, obj, f.DEFAULT, null, null);
    }

    public static d g(Object obj, g gVar) {
        return new a(null, obj, f.DEFAULT, gVar, null);
    }

    public static d h(Object obj) {
        return new a(null, obj, f.VERY_LOW, null, null);
    }

    public static d i(Object obj) {
        return new a(null, obj, f.HIGHEST, null, null);
    }

    public abstract Integer a();

    public abstract e b();

    public abstract Object c();

    public abstract f d();

    public abstract g e();
}
