package N6;

/* JADX INFO: renamed from: N6.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1461r0 extends D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1487t0 f10435c;

    public C1461r0(AbstractC1487t0 abstractC1487t0, int i10) {
        super(abstractC1487t0.size(), i10);
        this.f10435c = abstractC1487t0;
    }

    @Override // N6.D
    public final Object a(int i10) {
        return this.f10435c.get(i10);
    }
}
