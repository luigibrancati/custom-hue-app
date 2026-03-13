package K6;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f7536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f7537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0 f7538e;

    public b0(c0 c0Var, int i10, int i11) {
        this.f7538e = c0Var;
        this.f7536c = i10;
        this.f7537d = i11;
    }

    @Override // K6.Z
    public final Object[] c() {
        return this.f7538e.c();
    }

    @Override // K6.Z
    public final int d() {
        return this.f7538e.d() + this.f7536c;
    }

    @Override // K6.Z
    public final int e() {
        return this.f7538e.d() + this.f7536c + this.f7537d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        W.c(i10, this.f7537d, "index");
        return this.f7538e.get(i10 + this.f7536c);
    }

    @Override // K6.Z
    public final boolean h() {
        return true;
    }

    @Override // K6.c0
    /* JADX INFO: renamed from: l */
    public final c0 subList(int i10, int i11) {
        W.e(i10, i11, this.f7537d);
        int i12 = this.f7536c;
        return this.f7538e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7537d;
    }

    @Override // K6.c0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
