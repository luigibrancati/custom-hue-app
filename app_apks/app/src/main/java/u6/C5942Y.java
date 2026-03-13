package u6;

import b7.C2878l;
import s6.C5785d;
import u6.C5960i;

/* JADX INFO: renamed from: u6.Y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5942Y extends AbstractC5941X {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5933O f45133c;

    public C5942Y(C5933O c5933o, C2878l c2878l) {
        super(3, c2878l);
        this.f45133c = c5933o;
    }

    @Override // u6.AbstractC5931M
    public final C5785d[] f(C5919A c5919a) {
        return this.f45133c.f45122a.c();
    }

    @Override // u6.AbstractC5931M
    public final boolean g(C5919A c5919a) {
        return this.f45133c.f45122a.e();
    }

    @Override // u6.AbstractC5941X
    public final void h(C5919A c5919a) {
        C5933O c5933o = this.f45133c;
        AbstractC5966l abstractC5966l = c5933o.f45122a;
        abstractC5966l.d(c5919a.t(), this.f45132b);
        C5960i.a aVarB = abstractC5966l.b();
        if (aVarB != null) {
            c5919a.u().put(aVarB, c5933o);
        }
    }

    @Override // u6.AbstractC5947b0
    public final /* bridge */ /* synthetic */ void c(C5973s c5973s, boolean z10) {
    }
}
