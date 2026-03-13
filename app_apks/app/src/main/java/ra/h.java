package ra;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class h implements Jb.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ma.o f43882a;

    public h(ma.o oVar) {
        this.f43882a = oVar;
    }

    @Override // Jb.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ua.f apply(o oVar) {
        return new ua.f(this.f43882a.a(oVar.c().getAddress()), oVar.d(), oVar.f(), oVar.e(), oVar.b(), oVar.g());
    }
}
