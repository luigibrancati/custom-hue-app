package O6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L5 extends I2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N5 f11374c;

    public L5(N5 n52, int i10) {
        super(n52.size(), i10);
        this.f11374c = n52;
    }

    @Override // O6.I2
    public final Object a(int i10) {
        return this.f11374c.get(i10);
    }
}
