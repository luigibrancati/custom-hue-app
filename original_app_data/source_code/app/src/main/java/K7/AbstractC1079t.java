package K7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: renamed from: K7.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1079t extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f7709a = new Object[0];

    /* JADX INFO: renamed from: K7.t$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f7710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7712c;

        public a(int i10) {
            AbstractC1069i.b(i10, "initialCapacity");
            this.f7710a = new Object[i10];
            this.f7711b = 0;
        }

        @Override // K7.AbstractC1079t.b
        public b b(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                g(collection.size());
                if (collection instanceof AbstractC1079t) {
                    this.f7711b = ((AbstractC1079t) collection).d(this.f7710a, this.f7711b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a d(Object obj) {
            J7.n.j(obj);
            g(1);
            Object[] objArr = this.f7710a;
            int i10 = this.f7711b;
            this.f7711b = i10 + 1;
            objArr[i10] = obj;
            return this;
        }

        public b e(Object... objArr) {
            f(objArr, objArr.length);
            return this;
        }

        public final void f(Object[] objArr, int i10) {
            L.c(objArr, i10);
            g(i10);
            System.arraycopy(objArr, 0, this.f7710a, this.f7711b, i10);
            this.f7711b += i10;
        }

        public final void g(int i10) {
            Object[] objArr = this.f7710a;
            int iC = b.c(objArr.length, this.f7711b + i10);
            if (iC > objArr.length || this.f7712c) {
                this.f7710a = Arrays.copyOf(this.f7710a, iC);
                this.f7712c = false;
            }
        }
    }

    /* JADX INFO: renamed from: K7.t$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {
        public static int c(int i10, int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i11 <= i10) {
                return i10;
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public abstract b a(Object obj);

        public b b(Iterable iterable) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public AbstractC1081v c() {
        return isEmpty() ? AbstractC1081v.z() : AbstractC1081v.n(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public int d(Object[] objArr, int i10) {
        Y it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    public Object[] e() {
        return null;
    }

    public int f() {
        throw new UnsupportedOperationException();
    }

    public int h() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean k();

    /* JADX INFO: renamed from: l */
    public abstract Y iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f7709a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        J7.n.j(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] objArrE = e();
            if (objArrE != null) {
                return N.a(objArrE, h(), f(), objArr);
            }
            objArr = L.d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        d(objArr, 0);
        return objArr;
    }
}
