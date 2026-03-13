package O6;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class M5 extends N5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f11387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f11388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N5 f11389e;

    public M5(N5 n52, int i10, int i11) {
        this.f11389e = n52;
        this.f11387c = i10;
        this.f11388d = i11;
    }

    @Override // O6.M4
    public final int d() {
        return this.f11389e.e() + this.f11387c + this.f11388d;
    }

    @Override // O6.M4
    public final int e() {
        return this.f11389e.e() + this.f11387c;
    }

    @Override // O6.M4
    public final Object[] f() {
        return this.f11389e.f();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f11388d, "index");
        return this.f11389e.get(i10 + this.f11387c);
    }

    @Override // O6.N5
    /* JADX INFO: renamed from: h */
    public final N5 subList(int i10, int i11) {
        G1.c(i10, i11, this.f11388d);
        N5 n52 = this.f11389e;
        int i12 = this.f11387c;
        return n52.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11388d;
    }

    @Override // O6.N5, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
