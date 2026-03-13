package u6;

import b7.C2878l;
import s6.C5785d;
import u6.C5960i;

/* JADX INFO: renamed from: u6.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5945a0 extends AbstractC5941X {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5960i.a f45137c;

    public C5945a0(C5960i.a aVar, C2878l c2878l) {
        super(4, c2878l);
        this.f45137c = aVar;
    }

    @Override // u6.AbstractC5931M
    public final C5785d[] f(C5919A c5919a) {
        C5933O c5933o = (C5933O) c5919a.u().get(this.f45137c);
        if (c5933o == null) {
            return null;
        }
        return c5933o.f45122a.c();
    }

    @Override // u6.AbstractC5931M
    public final boolean g(C5919A c5919a) {
        C5933O c5933o = (C5933O) c5919a.u().get(this.f45137c);
        return c5933o != null && c5933o.f45122a.e();
    }

    @Override // u6.AbstractC5941X
    public final void h(C5919A c5919a) {
        C5933O c5933o = (C5933O) c5919a.u().remove(this.f45137c);
        if (c5933o == null) {
            this.f45132b.e(Boolean.FALSE);
            return;
        }
        c5933o.f45123b.b(c5919a.t(), this.f45132b);
        c5933o.f45122a.a();
    }

    @Override // u6.AbstractC5947b0
    public final /* bridge */ /* synthetic */ void c(C5973s c5973s, boolean z10) {
    }
}
