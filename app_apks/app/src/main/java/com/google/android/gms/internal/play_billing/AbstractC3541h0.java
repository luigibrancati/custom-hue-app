package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.stream.Collector;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3541h0 extends AbstractC3511c0 implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Q0 f30177b = new C3523e0(D0.f30011e, 0);

    public static AbstractC3541h0 p(Object[] objArr, int i10) {
        return i10 == 0 ? D0.f30011e : new D0(objArr, i10);
    }

    public static AbstractC3541h0 r(Collection collection) {
        if (!(collection instanceof AbstractC3511c0)) {
            Object[] array = collection.toArray();
            int length = array.length;
            AbstractC3630w0.b(array, length);
            return p(array, length);
        }
        AbstractC3541h0 abstractC3541h0F = ((AbstractC3511c0) collection).f();
        if (!abstractC3541h0F.h()) {
            return abstractC3541h0F;
        }
        Object[] array2 = abstractC3541h0F.toArray();
        return p(array2, array2.length);
    }

    public static AbstractC3541h0 s() {
        return D0.f30011e;
    }

    public static AbstractC3541h0 t(Object obj) {
        Object[] objArr = {obj};
        AbstractC3630w0.b(objArr, 1);
        return p(objArr, 1);
    }

    public static Collector w() {
        return N.a();
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public int c(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i10 = 0; i10 < size; i10++) {
                if (!AbstractC3623v.a(get(i10), list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !AbstractC3623v.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public AbstractC3541h0 l() {
        return size() <= 1 ? this : new C3529f0(this);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC3541h0 subList(int i10, int i11) {
        AbstractC3629w.e(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? D0.f30011e : new C3535g0(this, i10, i12);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final Q0 listIterator(int i10) {
        AbstractC3629w.b(i10, size(), "index");
        return isEmpty() ? f30177b : new C3523e0(this, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final AbstractC3541h0 f() {
        return this;
    }
}
