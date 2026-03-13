package g1;

/* JADX INFO: renamed from: g1.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4096f extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34916c;

    public C4096f(Object obj, int i10, int i11) {
        super(i11, null);
        this.f34915b = obj;
        this.f34916c = i10;
    }

    public final void b() {
        Object obj = this.f34915b;
        if ((obj != null ? obj.hashCode() : 0) != this.f34916c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object c() {
        return this.f34915b;
    }
}
