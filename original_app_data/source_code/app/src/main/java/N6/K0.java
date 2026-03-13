package N6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K0 extends AbstractC1487t0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC1487t0 f9793e = new K0(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f9794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f9795d;

    public K0(Object[] objArr, int i10) {
        this.f9794c = objArr;
        this.f9795d = i10;
    }

    @Override // N6.AbstractC1487t0, N6.AbstractC1423o0
    public final int c(Object[] objArr, int i10) {
        System.arraycopy(this.f9794c, 0, objArr, i10, this.f9795d);
        return i10 + this.f9795d;
    }

    @Override // N6.AbstractC1423o0
    public final int d() {
        return this.f9795d;
    }

    @Override // N6.AbstractC1423o0
    public final int e() {
        return 0;
    }

    @Override // N6.AbstractC1423o0
    public final Object[] f() {
        return this.f9794c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC1564z.a(i10, this.f9795d, "index");
        Object obj = this.f9794c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9795d;
    }
}
