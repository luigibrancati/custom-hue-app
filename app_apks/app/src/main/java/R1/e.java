package R1;

import e2.o;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f14316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f14317b;

    public e(k kVar, List list) {
        this.f14316a = kVar;
        this.f14317b = list;
    }

    @Override // R1.k
    public o.a a() {
        return new V1.b(this.f14316a.a(), this.f14317b);
    }

    @Override // R1.k
    public o.a b(h hVar, f fVar) {
        return new V1.b(this.f14316a.b(hVar, fVar), this.f14317b);
    }
}
