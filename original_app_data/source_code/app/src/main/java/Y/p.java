package Y;

import L.AbstractC1122s0;
import L.I;
import M.y;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class p extends AbstractC1122s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19574c;

    public p(I i10) {
        super(i10);
        this.f19573b = "virtual-" + i10.d() + "-" + UUID.randomUUID().toString();
    }

    @Override // L.AbstractC1122s0, E.InterfaceC0815u
    public int c() {
        return p(0);
    }

    @Override // L.AbstractC1122s0, L.I
    public String d() {
        return this.f19573b;
    }

    @Override // L.AbstractC1122s0, E.InterfaceC0815u
    public int p(int i10) {
        return y.t(super.p(i10) - this.f19574c);
    }

    public void s(int i10) {
        this.f19574c = i10;
    }
}
