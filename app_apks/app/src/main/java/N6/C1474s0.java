package N6;

import java.util.List;

/* JADX INFO: renamed from: N6.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1474s0 extends AbstractC1487t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f10446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f10447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC1487t0 f10448e;

    public C1474s0(AbstractC1487t0 abstractC1487t0, int i10, int i11) {
        this.f10448e = abstractC1487t0;
        this.f10446c = i10;
        this.f10447d = i11;
    }

    @Override // N6.AbstractC1423o0
    public final int d() {
        return this.f10448e.e() + this.f10446c + this.f10447d;
    }

    @Override // N6.AbstractC1423o0
    public final int e() {
        return this.f10448e.e() + this.f10446c;
    }

    @Override // N6.AbstractC1423o0
    public final Object[] f() {
        return this.f10448e.f();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC1564z.a(i10, this.f10447d, "index");
        return this.f10448e.get(i10 + this.f10446c);
    }

    @Override // N6.AbstractC1487t0
    /* JADX INFO: renamed from: h */
    public final AbstractC1487t0 subList(int i10, int i11) {
        AbstractC1564z.e(i10, i11, this.f10447d);
        int i12 = this.f10446c;
        return this.f10448e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10447d;
    }

    @Override // N6.AbstractC1487t0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
