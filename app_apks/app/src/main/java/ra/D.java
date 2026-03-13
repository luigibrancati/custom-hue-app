package ra;

import ua.C6013d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class D implements InterfaceC5683A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ta.F f43850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5690f f43851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f43852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5685a f43853d;

    public D(ta.F f10, C5690f c5690f, x xVar, C5685a c5685a) {
        this.f43850a = f10;
        this.f43851b = c5690f;
        this.f43852c = xVar;
        this.f43853d = c5685a;
    }

    @Override // ra.InterfaceC5683A
    public z a(ua.g gVar, C6013d... c6013dArr) {
        return new z(new qa.r(this.f43850a, this.f43851b, this.f43853d, gVar, new C5689e(c6013dArr), null), this.f43852c.a(gVar.b()));
    }
}
