package M6;

import java.util.Objects;

/* JADX INFO: renamed from: M6.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1225p extends AbstractC1215f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f9352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f9353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f9354e;

    public C1225p(Object[] objArr, int i10, int i11) {
        this.f9352c = objArr;
        this.f9353d = i10;
        this.f9354e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        U.a(i10, this.f9354e, "index");
        Object obj = this.f9352c[i10 + i10 + this.f9353d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9354e;
    }
}
