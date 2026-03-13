package u6;

import b7.C2878l;
import java.util.Objects;
import s6.C5785d;
import t6.C5843a;
import u6.C5967m;

/* JADX INFO: renamed from: u6.P, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5934P extends AbstractC5966l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C5967m.a f45125e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5934P(C5967m.a aVar, C5960i c5960i, C5785d[] c5785dArr, boolean z10, int i10) {
        super(c5960i, c5785dArr, z10, i10);
        Objects.requireNonNull(aVar);
        this.f45125e = aVar;
    }

    @Override // u6.AbstractC5966l
    public final void d(C5843a.b bVar, C2878l c2878l) {
        this.f45125e.f().accept(bVar, c2878l);
    }
}
