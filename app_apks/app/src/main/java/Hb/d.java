package Hb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static c a() {
        return Kb.d.INSTANCE;
    }

    public static c b() {
        return d(Lb.a.f8701b);
    }

    public static c c(Jb.a aVar) {
        Lb.b.e(aVar, "run is null");
        return new a(aVar);
    }

    public static c d(Runnable runnable) {
        Lb.b.e(runnable, "run is null");
        return new f(runnable);
    }
}
