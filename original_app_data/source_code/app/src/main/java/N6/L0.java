package N6;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L0 extends AbstractC1487t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M0 f9803c;

    public L0(M0 m02) {
        this.f9803c = m02;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        AbstractC1564z.a(i10, this.f9803c.f9817e, "index");
        int i11 = i10 + i10;
        Object obj = this.f9803c.f9816d[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.f9803c.f9816d[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9803c.f9817e;
    }
}
