package M6;

/* JADX INFO: renamed from: M6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1213d extends W {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1215f f9328c;

    public C1213d(AbstractC1215f abstractC1215f, int i10) {
        super(abstractC1215f.size(), i10);
        this.f9328c = abstractC1215f;
    }

    @Override // M6.W
    public final Object a(int i10) {
        return this.f9328c.get(i10);
    }
}
