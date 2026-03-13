package M6;

import java.util.List;

/* JADX INFO: renamed from: M6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1214e extends AbstractC1215f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f9329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f9330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC1215f f9331e;

    public C1214e(AbstractC1215f abstractC1215f, int i10, int i11) {
        this.f9331e = abstractC1215f;
        this.f9329c = i10;
        this.f9330d = i11;
    }

    @Override // M6.AbstractC1212c
    public final int d() {
        return this.f9331e.e() + this.f9329c + this.f9330d;
    }

    @Override // M6.AbstractC1212c
    public final int e() {
        return this.f9331e.e() + this.f9329c;
    }

    @Override // M6.AbstractC1212c
    public final Object[] f() {
        return this.f9331e.f();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        U.a(i10, this.f9330d, "index");
        return this.f9331e.get(i10 + this.f9329c);
    }

    @Override // M6.AbstractC1215f
    /* JADX INFO: renamed from: h */
    public final AbstractC1215f subList(int i10, int i11) {
        U.c(i10, i11, this.f9330d);
        int i12 = this.f9329c;
        return this.f9331e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9330d;
    }

    @Override // M6.AbstractC1215f, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
