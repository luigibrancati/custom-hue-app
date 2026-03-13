package J6;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f6270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f6271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f6272e;

    public h(i iVar, int i10, int i11) {
        Objects.requireNonNull(iVar);
        this.f6272e = iVar;
        this.f6270c = i10;
        this.f6271d = i11;
    }

    @Override // J6.d
    public final Object[] c() {
        return this.f6272e.c();
    }

    @Override // J6.d
    public final int d() {
        return this.f6272e.d() + this.f6270c;
    }

    @Override // J6.d
    public final int e() {
        return this.f6272e.d() + this.f6270c + this.f6271d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        r.b(i10, this.f6271d, "index");
        return this.f6272e.get(i10 + this.f6270c);
    }

    @Override // J6.i
    /* JADX INFO: renamed from: k */
    public final i subList(int i10, int i11) {
        r.d(i10, i11, this.f6271d);
        int i12 = this.f6270c;
        return this.f6272e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6271d;
    }

    @Override // J6.i, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
