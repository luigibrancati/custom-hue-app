package N6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class O0 extends AbstractC1487t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f9979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f9980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f9981e = 1;

    public O0(Object[] objArr, int i10, int i11) {
        this.f9979c = objArr;
        this.f9980d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC1564z.a(i10, this.f9981e, "index");
        Object obj = this.f9979c[i10 + i10 + this.f9980d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9981e;
    }
}
