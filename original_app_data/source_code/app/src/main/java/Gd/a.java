package Gd;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends ArrayList implements l {
    public a(int i10) {
        super(i10);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof m) {
            return e((m) obj);
        }
        return false;
    }

    public /* bridge */ boolean e(m mVar) {
        return super.contains(mVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof m) {
            return p((m) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof m) {
            return r((m) obj);
        }
        return -1;
    }

    public /* bridge */ int n() {
        return super.size();
    }

    public /* bridge */ int p(m mVar) {
        return super.indexOf(mVar);
    }

    public /* bridge */ int r(m mVar) {
        return super.lastIndexOf(mVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof m) {
            return s((m) obj);
        }
        return false;
    }

    public /* bridge */ boolean s(m mVar) {
        return super.remove(mVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return n();
    }
}
