package J6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f6268c;

    public f(i iVar, int i10) {
        super(iVar.size(), i10);
        this.f6268c = iVar;
    }

    @Override // J6.u
    public final Object a(int i10) {
        return this.f6268c.get(i10);
    }
}
