package u6;

import b7.C2878l;
import java.util.Objects;
import t6.C5843a;
import u6.C5960i;
import u6.C5967m;

/* JADX INFO: renamed from: u6.Q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5935Q extends AbstractC5972r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5967m.a f45126b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5935Q(C5967m.a aVar, C5960i.a aVar2) {
        super(aVar2);
        Objects.requireNonNull(aVar);
        this.f45126b = aVar;
    }

    @Override // u6.AbstractC5972r
    public final void b(C5843a.b bVar, C2878l c2878l) {
        this.f45126b.g().accept(bVar, c2878l);
    }
}
