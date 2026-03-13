package ra;

import la.C4981m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class r implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ta.F f43892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ta.w f43893b;

    public r(ta.F f10, ta.w wVar) {
        this.f43892a = f10;
        this.f43893b = wVar;
    }

    @Override // ra.q
    public void a(boolean z10) {
        if (!this.f43892a.b()) {
            throw new C4981m(2);
        }
        if (!this.f43892a.c()) {
            throw new C4981m(1);
        }
        if (!this.f43893b.b()) {
            throw new C4981m(3);
        }
        if (z10 && !this.f43893b.a()) {
            throw new C4981m(4);
        }
    }
}
