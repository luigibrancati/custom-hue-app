package La;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f8646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f8647b;

    public k(j jVar, Runnable runnable) {
        this.f8646a = jVar;
        this.f8647b = runnable;
    }

    public Integer a() {
        j jVar = this.f8646a;
        if (jVar != null) {
            return Integer.valueOf(jVar.a());
        }
        return null;
    }

    public boolean b() {
        j jVar = this.f8646a;
        return jVar != null && jVar.b();
    }
}
