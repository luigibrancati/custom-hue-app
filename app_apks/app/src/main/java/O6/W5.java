package O6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class W5 extends N5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f11509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f11510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f11511e;

    public W5(Object[] objArr, int i10, int i11) {
        this.f11509c = objArr;
        this.f11510d = i10;
        this.f11511e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f11511e, "index");
        Object obj = this.f11509c[i10 + i10 + this.f11510d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11511e;
    }
}
