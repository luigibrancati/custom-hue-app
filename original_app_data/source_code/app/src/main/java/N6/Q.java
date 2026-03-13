package N6;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Q extends O implements List {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ S f10007f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s10, Object obj, List list, O o10) {
        super(s10, obj, list, o10);
        this.f10007f = s10;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        zzb();
        boolean zIsEmpty = this.f9975b.isEmpty();
        ((List) this.f9975b).add(i10, obj);
        this.f10007f.f10033e++;
        if (zIsEmpty) {
            c();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f9975b).addAll(i10, collection);
        if (zAddAll) {
            int size2 = this.f9975b.size();
            this.f10007f.f10033e += size2 - size;
            if (size == 0) {
                c();
                return true;
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzb();
        return ((List) this.f9975b).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f9975b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f9975b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new P(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        zzb();
        Object objRemove = ((List) this.f9975b).remove(i10);
        S s10 = this.f10007f;
        s10.f10033e--;
        d();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        zzb();
        return ((List) this.f9975b).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        zzb();
        List listSubList = ((List) this.f9975b).subList(i10, i11);
        O o10 = this.f9976c;
        if (o10 == null) {
            o10 = this;
        }
        return this.f10007f.p(this.f9974a, listSubList, o10);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        zzb();
        return new P(this, i10);
    }
}
