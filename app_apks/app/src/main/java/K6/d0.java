package K6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0 f7540e = new d0(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f7541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f7542d;

    public d0(Object[] objArr, int i10) {
        this.f7541c = objArr;
        this.f7542d = i10;
    }

    @Override // K6.Z
    public final Object[] c() {
        return this.f7541c;
    }

    @Override // K6.Z
    public final int d() {
        return 0;
    }

    @Override // K6.Z
    public final int e() {
        return this.f7542d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        W.c(i10, this.f7542d, "index");
        Object obj = this.f7541c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // K6.Z
    public final boolean h() {
        return false;
    }

    @Override // K6.c0, K6.Z
    public final int k(Object[] objArr, int i10) {
        System.arraycopy(this.f7541c, 0, objArr, 0, this.f7542d);
        return this.f7542d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7542d;
    }
}
