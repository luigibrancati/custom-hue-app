package J6;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient i f6269c;

    public g(i iVar) {
        this.f6269c = iVar;
    }

    @Override // J6.i, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f6269c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        i iVar = this.f6269c;
        r.b(i10, iVar.size(), "index");
        return iVar.get(t(i10));
    }

    @Override // J6.i
    public final i h() {
        return this.f6269c;
    }

    @Override // J6.i, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f6269c.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return t(iLastIndexOf);
        }
        return -1;
    }

    @Override // J6.i
    /* JADX INFO: renamed from: k */
    public final i subList(int i10, int i11) {
        i iVar = this.f6269c;
        r.d(i10, i11, iVar.size());
        return iVar.subList(iVar.size() - i11, iVar.size() - i10).h();
    }

    @Override // J6.i, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f6269c.indexOf(obj);
        if (iIndexOf >= 0) {
            return t(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6269c.size();
    }

    @Override // J6.i, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    public final int t(int i10) {
        return (this.f6269c.size() - 1) - i10;
    }
}
