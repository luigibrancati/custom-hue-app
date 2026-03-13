package Md;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class e extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9466b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9467a = new b();

        public static b a() {
            return f9467a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9468b;

        public c() {
            super();
            this.f9468b = ((AbstractList) e.this).modCount;
        }

        @Override // Md.e.d
        public void a() {
            if (((AbstractList) e.this).modCount == this.f9468b) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) e.this).modCount + "; expected: " + this.f9468b);
        }

        @Override // Md.e.d
        public Object b() {
            return e.this.f9466b;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            e.this.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class d implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f9470a;

        public d() {
        }

        public abstract void a();

        public abstract Object b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f9470a;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f9470a) {
                throw new NoSuchElementException();
            }
            this.f9470a = true;
            a();
            return b();
        }
    }

    public static /* synthetic */ void c(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i10 == 2 || i10 == 3) {
            objArr[1] = "iterator";
        } else if (i10 == 5 || i10 == 6 || i10 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        int i10 = this.f9465a;
        if (i10 == 0) {
            this.f9466b = obj;
        } else if (i10 == 1) {
            this.f9466b = new Object[]{this.f9466b, obj};
        } else {
            Object[] objArr = (Object[]) this.f9466b;
            int length = objArr.length;
            if (i10 >= length) {
                int i11 = ((length * 3) / 2) + 1;
                int i12 = i10 + 1;
                if (i11 < i12) {
                    i11 = i12;
                }
                Object[] objArr2 = new Object[i11];
                this.f9466b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f9465a] = obj;
        }
        this.f9465a++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f9466b = null;
        this.f9465a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f9465a)) {
            return i11 == 1 ? this.f9466b : ((Object[]) this.f9466b)[i10];
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f9465a);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        int i10 = this.f9465a;
        if (i10 == 0) {
            b bVarA = b.a();
            if (bVarA == null) {
                c(2);
            }
            return bVarA;
        }
        if (i10 == 1) {
            return new c();
        }
        Iterator it = super.iterator();
        if (it == null) {
            c(3);
        }
        return it;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        int i11;
        Object obj;
        if (i10 < 0 || i10 >= (i11 = this.f9465a)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f9465a);
        }
        if (i11 == 1) {
            obj = this.f9466b;
            this.f9466b = null;
        } else {
            Object[] objArr = (Object[]) this.f9466b;
            Object obj2 = objArr[i10];
            if (i11 == 2) {
                this.f9466b = objArr[1 - i10];
            } else {
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    System.arraycopy(objArr, i10 + 1, objArr, i10, i12);
                }
                objArr[this.f9465a - 1] = null;
            }
            obj = obj2;
        }
        this.f9465a--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f9465a)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f9465a);
        }
        if (i11 == 1) {
            Object obj2 = this.f9466b;
            this.f9466b = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.f9466b;
        Object obj3 = objArr[i10];
        objArr[i10] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9465a;
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        int i10 = this.f9465a;
        if (i10 >= 2) {
            Arrays.sort((Object[]) this.f9466b, 0, i10, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            c(4);
        }
        int length = objArr.length;
        int i10 = this.f9465a;
        if (i10 == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f9466b;
                return objArr2;
            }
            objArr[0] = this.f9466b;
        } else {
            if (length < i10) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f9466b, i10, objArr.getClass());
                if (objArrCopyOf == null) {
                    c(6);
                }
                return objArrCopyOf;
            }
            if (i10 != 0) {
                System.arraycopy(this.f9466b, 0, objArr, 0, i10);
            }
        }
        int i11 = this.f9465a;
        if (length > i11) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        if (i10 >= 0 && i10 <= (i11 = this.f9465a)) {
            if (i11 == 0) {
                this.f9466b = obj;
            } else if (i11 == 1 && i10 == 0) {
                this.f9466b = new Object[]{obj, this.f9466b};
            } else {
                Object[] objArr = new Object[i11 + 1];
                if (i11 == 1) {
                    objArr[0] = this.f9466b;
                } else {
                    Object[] objArr2 = (Object[]) this.f9466b;
                    System.arraycopy(objArr2, 0, objArr, 0, i10);
                    System.arraycopy(objArr2, i10, objArr, i10 + 1, this.f9465a - i10);
                }
                objArr[i10] = obj;
                this.f9466b = objArr;
            }
            this.f9465a++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f9465a);
    }
}
