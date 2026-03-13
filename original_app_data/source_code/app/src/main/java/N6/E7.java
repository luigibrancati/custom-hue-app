package N6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class E7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public F7 f9707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f9708b;

    public final E7 a(F7 f72) {
        this.f9707a = f72;
        return this;
    }

    public final E7 b(Integer num) {
        this.f9708b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final H7 d() {
        return new H7(this, null);
    }
}
