package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K0 extends AbstractC3589p0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final K0 f30057f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient AbstractC3541h0 f30058e;

    static {
        Q0 q02 = AbstractC3541h0.f30177b;
        f30057f = new K0(D0.f30011e, C3624v0.f30257a);
    }

    public K0(AbstractC3541h0 abstractC3541h0, Comparator comparator) {
        super(comparator);
        this.f30058e = abstractC3541h0;
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final P0 descendingIterator() {
        return this.f30058e.l().listIterator(0);
    }

    public final int B(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f30058e, obj, this.f30218c);
        return iBinarySearch >= 0 ? z10 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    public final int E(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f30058e, obj, this.f30218c);
        return iBinarySearch >= 0 ? z10 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    public final K0 I(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == this.f30058e.size()) {
                return this;
            }
            i10 = 0;
        }
        if (i10 >= i11) {
            return AbstractC3589p0.z(this.f30218c);
        }
        AbstractC3541h0 abstractC3541h0 = this.f30058e;
        return new K0(abstractC3541h0.subList(i10, i11), this.f30218c);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final int c(Object[] objArr, int i10) {
        return this.f30058e.c(objArr, 0);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        AbstractC3541h0 abstractC3541h0 = this.f30058e;
        int iE = E(obj, true);
        if (iE == abstractC3541h0.size()) {
            return null;
        }
        return this.f30058e.get(iE);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f30058e, obj, this.f30218c) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (!O0.a(this.f30218c, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        Q0 q0ListIterator = this.f30058e.listIterator(0);
        Iterator it = collection.iterator();
        if (!q0ListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        E next2 = q0ListIterator.next();
        while (true) {
            try {
                int iCompare = this.f30218c.compare(next2, next);
                if (iCompare >= 0) {
                    if (iCompare != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!q0ListIterator.hasNext()) {
                        return false;
                    }
                    next2 = q0ListIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final int d() {
        return this.f30058e.d();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final int e() {
        return this.f30058e.e();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3583o0, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f30058e.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!O0.a(this.f30218c, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            Q0 q0ListIterator = this.f30058e.listIterator(0);
            while (q0ListIterator.hasNext()) {
                E next = q0ListIterator.next();
                Object next2 = it.next();
                if (next2 == null || this.f30218c.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3583o0, com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final AbstractC3541h0 f() {
        return this.f30058e;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3589p0, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f30058e.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iB = B(obj, true) - 1;
        if (iB == -1) {
            return null;
        }
        return this.f30058e.get(iB);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        AbstractC3541h0 abstractC3541h0 = this.f30058e;
        int iE = E(obj, false);
        if (iE == abstractC3541h0.size()) {
            return null;
        }
        return this.f30058e.get(iE);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f30058e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final Object[] k() {
        return this.f30058e.k();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3589p0, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f30058e.get(r1.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iB = B(obj, false) - 1;
        if (iB == -1) {
            return null;
        }
        return this.f30058e.get(iB);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f30058e.size();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3589p0
    public final AbstractC3589p0 t() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f30218c);
        return isEmpty() ? AbstractC3589p0.z(comparatorReverseOrder) : new K0(this.f30058e.l(), comparatorReverseOrder);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3589p0
    public final AbstractC3589p0 v(Object obj, boolean z10) {
        return I(0, B(obj, z10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3589p0
    public final AbstractC3589p0 x(Object obj, boolean z10, Object obj2, boolean z11) {
        return y(obj, z10).v(obj2, z11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3589p0
    public final AbstractC3589p0 y(Object obj, boolean z10) {
        return I(E(obj, z10), this.f30058e.size());
    }
}
