package O6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class S5 extends N5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final N5 f11455e = new S5(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f11456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f11457d;

    public S5(Object[] objArr, int i10) {
        this.f11456c = objArr;
        this.f11457d = i10;
    }

    @Override // O6.N5, O6.M4
    public final int c(Object[] objArr, int i10) {
        System.arraycopy(this.f11456c, 0, objArr, 0, this.f11457d);
        return this.f11457d;
    }

    @Override // O6.M4
    public final int d() {
        return this.f11457d;
    }

    @Override // O6.M4
    public final int e() {
        return 0;
    }

    @Override // O6.M4
    public final Object[] f() {
        return this.f11456c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f11457d, "index");
        Object obj = this.f11456c[i10];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11457d;
    }
}
