package e0;

import gc.C4202o;
import gc.C4206t;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC4853j;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;
import wc.InterfaceC6185b;

/* JADX INFO: renamed from: e0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3921a implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f33520d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f33521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f33522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33523c;

    /* JADX INFO: renamed from: e0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0415a implements List, InterfaceC6185b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C3921a f33524a;

        public C0415a(C3921a c3921a) {
            this.f33524a = c3921a;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            return this.f33524a.d(obj);
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            return this.f33524a.f(i10, collection);
        }

        public int c() {
            return this.f33524a.o();
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f33524a.k();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f33524a.l(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            return this.f33524a.n(collection);
        }

        public Object d(int i10) {
            AbstractC3922b.a(this, i10);
            return this.f33524a.u(i10);
        }

        @Override // java.util.List
        public Object get(int i10) {
            AbstractC3922b.a(this, i10);
            return this.f33524a.f33521a[i10];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f33524a.p(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f33524a.o() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f33524a.r(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return d(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            return this.f33524a.t(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            return this.f33524a.x(collection);
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            AbstractC3922b.a(this, i10);
            return this.f33524a.y(i10, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return c();
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            AbstractC3922b.b(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC4853j.a(this);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f33524a.c(i10, obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            return this.f33524a.h(collection);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f33524a.s(obj);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC4853j.b(this, objArr);
        }
    }

    /* JADX INFO: renamed from: e0.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements List, InterfaceC6185b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f33525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f33526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33527c;

        public b(List list, int i10, int i11) {
            this.f33525a = list;
            this.f33526b = i10;
            this.f33527c = i11;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            List list = this.f33525a;
            int i10 = this.f33527c;
            this.f33527c = i10 + 1;
            list.add(i10, obj);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            this.f33525a.addAll(i10 + this.f33526b, collection);
            int size = collection.size();
            this.f33527c += size;
            return size > 0;
        }

        public int c() {
            return this.f33527c - this.f33526b;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.f33527c - 1;
            int i11 = this.f33526b;
            if (i11 <= i10) {
                while (true) {
                    this.f33525a.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f33527c = this.f33526b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i10 = this.f33527c;
            for (int i11 = this.f33526b; i11 < i10; i11++) {
                if (AbstractC4862t.a(this.f33525a.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public Object d(int i10) {
            AbstractC3922b.a(this, i10);
            this.f33527c--;
            return this.f33525a.remove(i10 + this.f33526b);
        }

        @Override // java.util.List
        public Object get(int i10) {
            AbstractC3922b.a(this, i10);
            return this.f33525a.get(i10 + this.f33526b);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.f33527c;
            for (int i11 = this.f33526b; i11 < i10; i11++) {
                if (AbstractC4862t.a(this.f33525a.get(i11), obj)) {
                    return i11 - this.f33526b;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f33527c == this.f33526b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.f33527c - 1;
            int i11 = this.f33526b;
            if (i11 > i10) {
                return -1;
            }
            while (!AbstractC4862t.a(this.f33525a.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f33526b;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return d(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            int i10 = this.f33527c;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f33527c;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            int i10 = this.f33527c;
            int i11 = i10 - 1;
            int i12 = this.f33526b;
            if (i12 <= i11) {
                while (true) {
                    if (!collection.contains(this.f33525a.get(i11))) {
                        this.f33525a.remove(i11);
                        this.f33527c--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f33527c;
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            AbstractC3922b.a(this, i10);
            return this.f33525a.set(i10 + this.f33526b, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return c();
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            AbstractC3922b.b(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC4853j.a(this);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f33525a.add(i10 + this.f33526b, obj);
            this.f33527c++;
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i10 = this.f33527c;
            for (int i11 = this.f33526b; i11 < i10; i11++) {
                if (AbstractC4862t.a(this.f33525a.get(i11), obj)) {
                    this.f33525a.remove(i11);
                    this.f33527c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC4853j.b(this, objArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            this.f33525a.addAll(this.f33527c, collection);
            int size = collection.size();
            this.f33527c += size;
            return size > 0;
        }
    }

    /* JADX INFO: renamed from: e0.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements ListIterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f33528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f33529b;

        public c(List list, int i10) {
            this.f33528a = list;
            this.f33529b = i10;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f33528a.add(this.f33529b, obj);
            this.f33529b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f33529b < this.f33528a.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f33529b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            List list = this.f33528a;
            int i10 = this.f33529b;
            this.f33529b = i10 + 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f33529b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i10 = this.f33529b - 1;
            this.f33529b = i10;
            return this.f33528a.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f33529b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.f33529b - 1;
            this.f33529b = i10;
            this.f33528a.remove(i10);
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f33528a.set(this.f33529b, obj);
        }
    }

    public C3921a(Object[] objArr, int i10) {
        this.f33521a = objArr;
        this.f33523c = i10;
    }

    public final void c(int i10, Object obj) {
        int i11 = this.f33523c + 1;
        if (this.f33521a.length < i11) {
            w(i11);
        }
        Object[] objArr = this.f33521a;
        int i12 = this.f33523c;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i12 - i10);
        }
        objArr[i10] = obj;
        this.f33523c++;
    }

    public final boolean d(Object obj) {
        int i10 = this.f33523c + 1;
        if (this.f33521a.length < i10) {
            w(i10);
        }
        Object[] objArr = this.f33521a;
        int i11 = this.f33523c;
        objArr[i11] = obj;
        this.f33523c = i11 + 1;
        return true;
    }

    public final boolean e(int i10, C3921a c3921a) {
        int i11 = c3921a.f33523c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f33523c + i11;
        if (this.f33521a.length < i12) {
            w(i12);
        }
        Object[] objArr = this.f33521a;
        int i13 = this.f33523c;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + i11, i13 - i10);
        }
        System.arraycopy(c3921a.f33521a, 0, objArr, i10, i11);
        this.f33523c += i11;
        return true;
    }

    public final boolean f(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i12 = this.f33523c + size;
        if (this.f33521a.length < i12) {
            w(i12);
        }
        Object[] objArr = this.f33521a;
        int i13 = this.f33523c;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i13 - i10);
        }
        for (Object obj : collection) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                C4206t.u();
            }
            objArr[i11 + i10] = obj;
            i11 = i14;
        }
        this.f33523c += size;
        return true;
    }

    public final boolean h(Collection collection) {
        return f(this.f33523c, collection);
    }

    public final List j() {
        List list = this.f33522b;
        if (list != null) {
            return list;
        }
        C0415a c0415a = new C0415a(this);
        this.f33522b = c0415a;
        return c0415a;
    }

    public final void k() {
        Object[] objArr = this.f33521a;
        int i10 = this.f33523c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f33523c = 0;
    }

    public final boolean l(Object obj) {
        int iO = o() - 1;
        if (iO >= 0) {
            for (int i10 = 0; !AbstractC4862t.a(this.f33521a[i10], obj); i10++) {
                if (i10 != iO) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean n(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!l(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int o() {
        return this.f33523c;
    }

    public final int p(Object obj) {
        Object[] objArr = this.f33521a;
        int i10 = this.f33523c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (AbstractC4862t.a(obj, objArr[i11])) {
                return i11;
            }
        }
        return -1;
    }

    public final int r(Object obj) {
        Object[] objArr = this.f33521a;
        for (int i10 = this.f33523c - 1; i10 >= 0; i10--) {
            if (AbstractC4862t.a(obj, objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean s(Object obj) {
        int iP = p(obj);
        if (iP < 0) {
            return false;
        }
        u(iP);
        return true;
    }

    public final boolean t(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = this.f33523c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            s(it.next());
        }
        return i10 != this.f33523c;
    }

    public final Object u(int i10) {
        Object[] objArr = this.f33521a;
        Object obj = objArr[i10];
        if (i10 != o() - 1) {
            int i11 = i10 + 1;
            System.arraycopy(objArr, i11, objArr, i10, this.f33523c - i11);
        }
        int i12 = this.f33523c - 1;
        this.f33523c = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void v(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f33523c;
            if (i11 < i12) {
                Object[] objArr = this.f33521a;
                System.arraycopy(objArr, i11, objArr, i10, i12 - i11);
            }
            int i13 = this.f33523c - (i11 - i10);
            int iO = o() - 1;
            if (i13 <= iO) {
                int i14 = i13;
                while (true) {
                    this.f33521a[i14] = null;
                    if (i14 == iO) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f33523c = i13;
        }
    }

    public final void w(int i10) {
        Object[] objArr = this.f33521a;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i10, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f33521a = objArr2;
    }

    public final boolean x(Collection collection) {
        int i10 = this.f33523c;
        for (int iO = o() - 1; -1 < iO; iO--) {
            if (!collection.contains(this.f33521a[iO])) {
                u(iO);
            }
        }
        return i10 != this.f33523c;
    }

    public final Object y(int i10, Object obj) {
        Object[] objArr = this.f33521a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final void z(Comparator comparator) {
        C4202o.G(this.f33521a, comparator, 0, this.f33523c);
    }
}
