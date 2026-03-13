package com.google.android.gms.internal.play_billing;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3589p0 extends AbstractC3583o0 implements NavigableSet, N0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Comparator f30218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient AbstractC3589p0 f30219d;

    public AbstractC3589p0(Comparator comparator) {
        this.f30218c = comparator;
    }

    public static K0 z(Comparator comparator) {
        if (C3624v0.f30257a.equals(comparator)) {
            return K0.f30057f;
        }
        Q0 q02 = AbstractC3541h0.f30177b;
        return new K0(D0.f30011e, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet, com.google.android.gms.internal.play_billing.N0
    public final Comparator comparator() {
        return this.f30218c;
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        AbstractC3589p0 abstractC3589p0 = this.f30219d;
        if (abstractC3589p0 != null) {
            return abstractC3589p0;
        }
        AbstractC3589p0 abstractC3589p0T = t();
        this.f30219d = abstractC3589p0T;
        abstractC3589p0T.f30219d = this;
        return abstractC3589p0T;
    }

    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        return v(obj, false);
    }

    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public abstract AbstractC3589p0 t();

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        return y(obj, true);
    }

    public abstract AbstractC3589p0 v(Object obj, boolean z10);

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final AbstractC3589p0 subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.f30218c.compare(obj, obj2) <= 0) {
            return x(obj, z10, obj2, z11);
        }
        throw new IllegalArgumentException();
    }

    public abstract AbstractC3589p0 x(Object obj, boolean z10, Object obj2, boolean z11);

    public abstract AbstractC3589p0 y(Object obj, boolean z10);

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        return v(obj, z10);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        return y(obj, z10);
    }
}
