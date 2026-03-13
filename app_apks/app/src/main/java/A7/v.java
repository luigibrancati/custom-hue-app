package A7;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0684h f219a;

    public /* synthetic */ v(q qVar) {
    }

    public final v a(C0684h c0684h) {
        this.f219a = c0684h;
        return this;
    }

    public final F b() {
        C0684h c0684h = this.f219a;
        if (c0684h != null) {
            return new x(c0684h, null);
        }
        throw new IllegalStateException(String.valueOf(C0684h.class.getCanonicalName()).concat(" must be set"));
    }
}
