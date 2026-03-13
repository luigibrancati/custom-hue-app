package J6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f6274e = new k(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f6275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f6276d;

    public k(Object[] objArr, int i10) {
        this.f6275c = objArr;
        this.f6276d = i10;
    }

    @Override // J6.d
    public final Object[] c() {
        return this.f6275c;
    }

    @Override // J6.d
    public final int d() {
        return 0;
    }

    @Override // J6.d
    public final int e() {
        return this.f6276d;
    }

    @Override // J6.i, J6.d
    public final int f(Object[] objArr, int i10) {
        Object[] objArr2 = this.f6275c;
        int i11 = this.f6276d;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        r.b(i10, this.f6276d, "index");
        Object obj = this.f6275c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6276d;
    }
}
