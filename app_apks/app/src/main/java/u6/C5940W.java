package u6;

import b7.C2878l;
import java.util.Objects;
import s6.C5785d;
import t6.C5843a;
import u6.AbstractC5970p;

/* JADX INFO: renamed from: u6.W, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5940W extends AbstractC5970p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC5970p.a f45131d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5940W(AbstractC5970p.a aVar, C5785d[] c5785dArr, boolean z10, int i10) {
        super(c5785dArr, z10, i10);
        Objects.requireNonNull(aVar);
        this.f45131d = aVar;
    }

    @Override // u6.AbstractC5970p
    public final void b(C5843a.b bVar, C2878l c2878l) {
        this.f45131d.f().accept(bVar, c2878l);
    }
}
