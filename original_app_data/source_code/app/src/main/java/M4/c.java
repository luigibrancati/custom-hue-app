package M4;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9271b;

    @Override // M4.k
    public void a(String str) {
        this.f9270a = str;
    }

    @Override // M4.k
    public void b(String str) {
        this.f9271b = str;
    }

    @Override // M4.k
    public e load() {
        return new e(this.f9270a, this.f9271b);
    }
}
