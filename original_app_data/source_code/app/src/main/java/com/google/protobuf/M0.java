package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class M0 extends AbstractList implements V, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f32131a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements ListIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ListIterator f32132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32133b;

        public a(int i10) {
            this.f32133b = i10;
            this.f32132a = M0.this.f32131a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f32132a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f32132a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f32132a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f32132a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f32132a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f32132a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator f32135a;

        public b() {
            this.f32135a = M0.this.f32131a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f32135a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f32135a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public M0(V v10) {
        this.f32131a = v10;
    }

    @Override // com.google.protobuf.V
    public void F(AbstractC3722j abstractC3722j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.V
    public Object W0(int i10) {
        return this.f32131a.W0(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f32131a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }

    @Override // com.google.protobuf.V
    public List o() {
        return this.f32131a.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f32131a.size();
    }

    @Override // com.google.protobuf.V
    public V u() {
        return this;
    }
}
