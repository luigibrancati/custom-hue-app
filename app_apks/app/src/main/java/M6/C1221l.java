package M6;

import java.util.Objects;

/* JADX INFO: renamed from: M6.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1221l extends AbstractC1215f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC1215f f9343e = new C1221l(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f9344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f9345d;

    public C1221l(Object[] objArr, int i10) {
        this.f9344c = objArr;
        this.f9345d = i10;
    }

    @Override // M6.AbstractC1215f, M6.AbstractC1212c
    public final int c(Object[] objArr, int i10) {
        System.arraycopy(this.f9344c, 0, objArr, 0, this.f9345d);
        return this.f9345d;
    }

    @Override // M6.AbstractC1212c
    public final int d() {
        return this.f9345d;
    }

    @Override // M6.AbstractC1212c
    public final int e() {
        return 0;
    }

    @Override // M6.AbstractC1212c
    public final Object[] f() {
        return this.f9344c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        U.a(i10, this.f9345d, "index");
        Object obj = this.f9344c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9345d;
    }
}
