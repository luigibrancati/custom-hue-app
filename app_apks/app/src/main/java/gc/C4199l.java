package gc;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: gc.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4199l extends AbstractC4195h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f35605d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object[] f35606e = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f35608b = f35606e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35609c;

    /* JADX INFO: renamed from: gc.l$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    private final void k(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f35608b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f35606e) {
            this.f35608b = new Object[Bc.k.e(i10, 10)];
        } else {
            f(AbstractC4191d.f35593a.e(objArr.length, i10));
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        s();
        k(size() + elements.size());
        e(r(this.f35607a + size()), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        s();
        k(size() + 1);
        int iH = h(this.f35607a);
        this.f35607a = iH;
        this.f35608b[iH] = obj;
        this.f35609c = size() + 1;
    }

    public final void addLast(Object obj) {
        s();
        k(size() + 1);
        this.f35608b[r(this.f35607a + size())] = obj;
        this.f35609c = size() + 1;
    }

    @Override // gc.AbstractC4195h
    public int c() {
        return this.f35609c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            s();
            p(this.f35607a, r(this.f35607a + size()));
        }
        this.f35607a = 0;
        this.f35609c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // gc.AbstractC4195h
    public Object d(int i10) {
        AbstractC4191d.f35593a.b(i10, size());
        if (i10 == C4206t.m(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        s();
        int iR = r(this.f35607a + i10);
        Object obj = this.f35608b[iR];
        if (i10 < (size() >> 1)) {
            int i11 = this.f35607a;
            if (iR >= i11) {
                Object[] objArr = this.f35608b;
                C4202o.m(objArr, objArr, i11 + 1, i11, iR);
            } else {
                Object[] objArr2 = this.f35608b;
                C4202o.m(objArr2, objArr2, 1, 0, iR);
                Object[] objArr3 = this.f35608b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f35607a;
                C4202o.m(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f35608b;
            int i13 = this.f35607a;
            objArr4[i13] = null;
            this.f35607a = l(i13);
        } else {
            int iR2 = r(this.f35607a + C4206t.m(this));
            if (iR <= iR2) {
                Object[] objArr5 = this.f35608b;
                C4202o.m(objArr5, objArr5, iR, iR + 1, iR2 + 1);
            } else {
                Object[] objArr6 = this.f35608b;
                C4202o.m(objArr6, objArr6, iR, iR + 1, objArr6.length);
                Object[] objArr7 = this.f35608b;
                objArr7[objArr7.length - 1] = objArr7[0];
                C4202o.m(objArr7, objArr7, 0, 1, iR2 + 1);
            }
            this.f35608b[iR2] = null;
        }
        this.f35609c = size() - 1;
        return obj;
    }

    public final void e(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f35608b.length;
        while (i10 < length && it.hasNext()) {
            this.f35608b[i10] = it.next();
            i10++;
        }
        int i11 = this.f35607a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f35608b[i12] = it.next();
        }
        this.f35609c = size() + collection.size();
    }

    public final void f(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f35608b;
        C4202o.m(objArr2, objArr, 0, this.f35607a, objArr2.length);
        Object[] objArr3 = this.f35608b;
        int length = objArr3.length;
        int i11 = this.f35607a;
        C4202o.m(objArr3, objArr, length - i11, 0, i11);
        this.f35607a = 0;
        this.f35608b = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC4191d.f35593a.b(i10, size());
        return this.f35608b[r(this.f35607a + i10)];
    }

    public final int h(int i10) {
        return i10 == 0 ? C4204q.a0(this.f35608b) : i10 - 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iR = r(this.f35607a + size());
        int length = this.f35607a;
        if (length < iR) {
            while (length < iR) {
                if (AbstractC4862t.a(obj, this.f35608b[length])) {
                    i10 = this.f35607a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iR) {
            return -1;
        }
        int length2 = this.f35608b.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iR; i11++) {
                    if (AbstractC4862t.a(obj, this.f35608b[i11])) {
                        length = i11 + this.f35608b.length;
                        i10 = this.f35607a;
                    }
                }
                return -1;
            }
            if (AbstractC4862t.a(obj, this.f35608b[length])) {
                i10 = this.f35607a;
                break;
            }
            length++;
        }
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final int l(int i10) {
        if (i10 == C4204q.a0(this.f35608b)) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iA0;
        int i10;
        int iR = r(this.f35607a + size());
        int i11 = this.f35607a;
        if (i11 < iR) {
            iA0 = iR - 1;
            if (i11 <= iA0) {
                while (!AbstractC4862t.a(obj, this.f35608b[iA0])) {
                    if (iA0 != i11) {
                        iA0--;
                    }
                }
                i10 = this.f35607a;
                return iA0 - i10;
            }
            return -1;
        }
        if (i11 > iR) {
            int i12 = iR - 1;
            while (true) {
                if (-1 >= i12) {
                    iA0 = C4204q.a0(this.f35608b);
                    int i13 = this.f35607a;
                    if (i13 <= iA0) {
                        while (!AbstractC4862t.a(obj, this.f35608b[iA0])) {
                            if (iA0 != i13) {
                                iA0--;
                            }
                        }
                        i10 = this.f35607a;
                    }
                } else {
                    if (AbstractC4862t.a(obj, this.f35608b[i12])) {
                        iA0 = i12 + this.f35608b.length;
                        i10 = this.f35607a;
                        break;
                    }
                    i12--;
                }
            }
        }
        return -1;
    }

    public final int n(int i10) {
        return i10 < 0 ? i10 + this.f35608b.length : i10;
    }

    public final void p(int i10, int i11) {
        if (i10 < i11) {
            C4202o.x(this.f35608b, null, i10, i11);
            return;
        }
        Object[] objArr = this.f35608b;
        C4202o.x(objArr, null, i10, objArr.length);
        C4202o.x(this.f35608b, null, 0, i11);
    }

    public final int r(int i10) {
        Object[] objArr = this.f35608b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        d(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        int iR;
        AbstractC4862t.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f35608b.length != 0) {
            int iR2 = r(this.f35607a + size());
            int i10 = this.f35607a;
            if (i10 < iR2) {
                iR = i10;
                while (i10 < iR2) {
                    Object obj = this.f35608b[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f35608b[iR] = obj;
                        iR++;
                    }
                    i10++;
                }
                C4202o.x(this.f35608b, null, iR, iR2);
            } else {
                int length = this.f35608b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f35608b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f35608b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iR = r(i11);
                for (int i12 = 0; i12 < iR2; i12++) {
                    Object[] objArr2 = this.f35608b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f35608b[iR] = obj3;
                        iR = l(iR);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                s();
                this.f35609c = n(iR - this.f35607a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        s();
        Object[] objArr = this.f35608b;
        int i10 = this.f35607a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f35607a = l(i10);
        this.f35609c = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        s();
        int iR = r(this.f35607a + C4206t.m(this));
        Object[] objArr = this.f35608b;
        Object obj = objArr[iR];
        objArr[iR] = null;
        this.f35609c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        AbstractC4191d.f35593a.d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == size()) {
            clear();
            return;
        }
        if (i12 == 1) {
            d(i10);
            return;
        }
        s();
        if (i10 < size() - i11) {
            w(i10, i11);
            int iR = r(this.f35607a + i12);
            p(this.f35607a, iR);
            this.f35607a = iR;
        } else {
            x(i10, i11);
            int iR2 = r(this.f35607a + size());
            p(n(iR2 - i12), iR2);
        }
        this.f35609c = size() - i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int iR;
        AbstractC4862t.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f35608b.length != 0) {
            int iR2 = r(this.f35607a + size());
            int i10 = this.f35607a;
            if (i10 < iR2) {
                iR = i10;
                while (i10 < iR2) {
                    Object obj = this.f35608b[i10];
                    if (elements.contains(obj)) {
                        this.f35608b[iR] = obj;
                        iR++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                C4202o.x(this.f35608b, null, iR, iR2);
            } else {
                int length = this.f35608b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f35608b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f35608b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iR = r(i11);
                for (int i12 = 0; i12 < iR2; i12++) {
                    Object[] objArr2 = this.f35608b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f35608b[iR] = obj3;
                        iR = l(iR);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                s();
                this.f35609c = n(iR - this.f35607a);
            }
        }
        return z10;
    }

    public final void s() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        AbstractC4191d.f35593a.b(i10, size());
        int iR = r(this.f35607a + i10);
        Object[] objArr = this.f35608b;
        Object obj2 = objArr[iR];
        objArr[iR] = obj;
        return obj2;
    }

    public final Object t() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC4862t.e(array, "array");
        if (array.length < size()) {
            array = C4200m.a(array, size());
        }
        Object[] objArr = array;
        int iR = r(this.f35607a + size());
        int i10 = this.f35607a;
        if (i10 < iR) {
            C4202o.r(this.f35608b, objArr, 0, i10, iR, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f35608b;
            C4202o.m(objArr2, objArr, 0, this.f35607a, objArr2.length);
            Object[] objArr3 = this.f35608b;
            C4202o.m(objArr3, objArr, objArr3.length - this.f35607a, 0, iR);
        }
        return C4205s.e(size(), objArr);
    }

    public final Object v() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    public final void w(int i10, int i11) {
        int iR = r(this.f35607a + (i10 - 1));
        int iR2 = r(this.f35607a + (i11 - 1));
        while (i10 > 0) {
            int i12 = iR + 1;
            int iMin = Math.min(i10, Math.min(i12, iR2 + 1));
            Object[] objArr = this.f35608b;
            int i13 = iR2 - iMin;
            int i14 = iR - iMin;
            C4202o.m(objArr, objArr, i13 + 1, i14 + 1, i12);
            iR = n(i14);
            iR2 = n(i13);
            i10 -= iMin;
        }
    }

    public final void x(int i10, int i11) {
        int iR = r(this.f35607a + i11);
        int iR2 = r(this.f35607a + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f35608b;
            i11 = Math.min(size, Math.min(objArr.length - iR, objArr.length - iR2));
            Object[] objArr2 = this.f35608b;
            int i12 = iR + i11;
            C4202o.m(objArr2, objArr2, iR2, iR, i12);
            iR = r(i12);
            iR2 = r(iR2 + i11);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        AbstractC4191d.f35593a.c(i10, size());
        if (i10 == size()) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        s();
        k(size() + 1);
        int iR = r(this.f35607a + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int iH = h(iR);
            int iH2 = h(this.f35607a);
            int i11 = this.f35607a;
            if (iH >= i11) {
                Object[] objArr = this.f35608b;
                objArr[iH2] = objArr[i11];
                C4202o.m(objArr, objArr, i11, i11 + 1, iH + 1);
            } else {
                Object[] objArr2 = this.f35608b;
                C4202o.m(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f35608b;
                objArr3[objArr3.length - 1] = objArr3[0];
                C4202o.m(objArr3, objArr3, 0, 1, iH + 1);
            }
            this.f35608b[iH] = obj;
            this.f35607a = iH2;
        } else {
            int iR2 = r(this.f35607a + size());
            if (iR < iR2) {
                Object[] objArr4 = this.f35608b;
                C4202o.m(objArr4, objArr4, iR + 1, iR, iR2);
            } else {
                Object[] objArr5 = this.f35608b;
                C4202o.m(objArr5, objArr5, 1, 0, iR2);
                Object[] objArr6 = this.f35608b;
                objArr6[0] = objArr6[objArr6.length - 1];
                C4202o.m(objArr6, objArr6, iR + 1, iR, objArr6.length - 1);
            }
            this.f35608b[iR] = obj;
        }
        this.f35609c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        AbstractC4862t.e(elements, "elements");
        AbstractC4191d.f35593a.c(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        s();
        k(size() + elements.size());
        int iR = r(this.f35607a + size());
        int iR2 = r(this.f35607a + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f35607a;
            int length = i11 - size;
            if (iR2 < i11) {
                Object[] objArr = this.f35608b;
                C4202o.m(objArr, objArr, length, i11, objArr.length);
                if (size >= iR2) {
                    Object[] objArr2 = this.f35608b;
                    C4202o.m(objArr2, objArr2, objArr2.length - size, 0, iR2);
                } else {
                    Object[] objArr3 = this.f35608b;
                    C4202o.m(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f35608b;
                    C4202o.m(objArr4, objArr4, 0, size, iR2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f35608b;
                C4202o.m(objArr5, objArr5, length, i11, iR2);
            } else {
                Object[] objArr6 = this.f35608b;
                length += objArr6.length;
                int i12 = iR2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    C4202o.m(objArr6, objArr6, length, i11, iR2);
                } else {
                    C4202o.m(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.f35608b;
                    C4202o.m(objArr7, objArr7, 0, this.f35607a + length2, iR2);
                }
            }
            this.f35607a = length;
            e(n(iR2 - size), elements);
        } else {
            int i13 = iR2 + size;
            if (iR2 < iR) {
                int i14 = size + iR;
                Object[] objArr8 = this.f35608b;
                if (i14 <= objArr8.length) {
                    C4202o.m(objArr8, objArr8, i13, iR2, iR);
                } else if (i13 >= objArr8.length) {
                    C4202o.m(objArr8, objArr8, i13 - objArr8.length, iR2, iR);
                } else {
                    int length3 = iR - (i14 - objArr8.length);
                    C4202o.m(objArr8, objArr8, 0, length3, iR);
                    Object[] objArr9 = this.f35608b;
                    C4202o.m(objArr9, objArr9, i13, iR2, length3);
                }
            } else {
                Object[] objArr10 = this.f35608b;
                C4202o.m(objArr10, objArr10, size, 0, iR);
                Object[] objArr11 = this.f35608b;
                if (i13 >= objArr11.length) {
                    C4202o.m(objArr11, objArr11, i13 - objArr11.length, iR2, objArr11.length);
                } else {
                    C4202o.m(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f35608b;
                    C4202o.m(objArr12, objArr12, i13, iR2, objArr12.length - size);
                }
            }
            e(iR2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
