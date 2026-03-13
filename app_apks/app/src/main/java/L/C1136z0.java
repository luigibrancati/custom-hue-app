package L;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: renamed from: L.z0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1136z0 extends AbstractC1109l0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Surface f8226o;

    public C1136z0(Surface surface, Size size, int i10) {
        super(size, i10);
        this.f8226o = surface;
    }

    @Override // L.AbstractC1109l0
    public O7.e o() {
        return O.n.p(this.f8226o);
    }

    public C1136z0(Surface surface) {
        this.f8226o = surface;
    }
}
