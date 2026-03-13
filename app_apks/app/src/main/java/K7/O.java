package K7;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class O extends AbstractC1081v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC1081v f7593e = new O(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f7594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f7595d;

    public O(Object[] objArr, int i10) {
        this.f7594c = objArr;
        this.f7595d = i10;
    }

    @Override // K7.AbstractC1081v, K7.AbstractC1079t
    public int d(Object[] objArr, int i10) {
        System.arraycopy(this.f7594c, 0, objArr, i10, this.f7595d);
        return i10 + this.f7595d;
    }

    @Override // K7.AbstractC1079t
    public Object[] e() {
        return this.f7594c;
    }

    @Override // K7.AbstractC1079t
    public int f() {
        return this.f7595d;
    }

    @Override // java.util.List
    public Object get(int i10) {
        J7.n.h(i10, this.f7595d);
        Object obj = this.f7594c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // K7.AbstractC1079t
    public int h() {
        return 0;
    }

    @Override // K7.AbstractC1079t
    public boolean k() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7595d;
    }
}
