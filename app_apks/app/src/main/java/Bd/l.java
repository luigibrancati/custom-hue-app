package Bd;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread f840b = Thread.currentThread();

    public l(Object obj) {
        this.f839a = obj;
    }

    public Object a() {
        if (b()) {
            return this.f839a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        return this.f840b == Thread.currentThread();
    }
}
