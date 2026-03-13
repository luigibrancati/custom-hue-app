package K6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends Y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f7535c;

    public a0(c0 c0Var, int i10) {
        super(c0Var.size(), i10);
        this.f7535c = c0Var;
    }

    @Override // K6.Y
    public final Object a(int i10) {
        return this.f7535c.get(i10);
    }
}
