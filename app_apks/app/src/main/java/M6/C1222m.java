package M6;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: renamed from: M6.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1222m extends AbstractC1215f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1223n f9346c;

    public C1222m(C1223n c1223n) {
        this.f9346c = c1223n;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        U.a(i10, this.f9346c.f9349e, "index");
        int i11 = i10 + i10;
        Object obj = this.f9346c.f9348d[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.f9346c.f9348d[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9346c.f9349e;
    }
}
