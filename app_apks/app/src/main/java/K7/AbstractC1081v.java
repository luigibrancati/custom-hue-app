package K7;

import K7.AbstractC1079t;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: K7.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1081v extends AbstractC1079t implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z f7715b = new b(O.f7593e, 0);

    /* JADX INFO: renamed from: K7.v$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC1079t.a {
        public a() {
            this(4);
        }

        @Override // K7.AbstractC1079t.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            super.d(obj);
            return this;
        }

        public a i(Object... objArr) {
            super.e(objArr);
            return this;
        }

        public a j(Iterable iterable) {
            super.b(iterable);
            return this;
        }

        public AbstractC1081v k() {
            this.f7712c = true;
            return AbstractC1081v.p(this.f7710a, this.f7711b);
        }

        public AbstractC1081v l(Comparator comparator) {
            this.f7712c = true;
            Arrays.sort(this.f7710a, 0, this.f7711b, comparator);
            return AbstractC1081v.p(this.f7710a, this.f7711b);
        }

        public a(int i10) {
            super(i10);
        }
    }

    /* JADX INFO: renamed from: K7.v$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends AbstractC1061a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AbstractC1081v f7716c;

        public b(AbstractC1081v abstractC1081v, int i10) {
            super(abstractC1081v.size(), i10);
            this.f7716c = abstractC1081v;
        }

        @Override // K7.AbstractC1061a
        public Object a(int i10) {
            return this.f7716c.get(i10);
        }
    }

    /* JADX INFO: renamed from: K7.v$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends AbstractC1081v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final transient int f7717c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient int f7718d;

        public c(int i10, int i11) {
            this.f7717c = i10;
            this.f7718d = i11;
        }

        @Override // K7.AbstractC1081v, java.util.List
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public AbstractC1081v subList(int i10, int i11) {
            J7.n.n(i10, i11, this.f7718d);
            AbstractC1081v abstractC1081v = AbstractC1081v.this;
            int i12 = this.f7717c;
            return abstractC1081v.subList(i10 + i12, i11 + i12);
        }

        @Override // K7.AbstractC1079t
        public Object[] e() {
            return AbstractC1081v.this.e();
        }

        @Override // K7.AbstractC1079t
        public int f() {
            return AbstractC1081v.this.h() + this.f7717c + this.f7718d;
        }

        @Override // java.util.List
        public Object get(int i10) {
            J7.n.h(i10, this.f7718d);
            return AbstractC1081v.this.get(i10 + this.f7717c);
        }

        @Override // K7.AbstractC1079t
        public int h() {
            return AbstractC1081v.this.h() + this.f7717c;
        }

        @Override // K7.AbstractC1081v, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // K7.AbstractC1079t
        public boolean k() {
            return true;
        }

        @Override // K7.AbstractC1081v, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7718d;
        }

        @Override // K7.AbstractC1081v, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    public static AbstractC1081v A(Object obj) {
        return t(obj);
    }

    public static AbstractC1081v B(Object obj, Object obj2) {
        return t(obj, obj2);
    }

    public static AbstractC1081v E(Object obj, Object obj2, Object obj3) {
        return t(obj, obj2, obj3);
    }

    public static AbstractC1081v I(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return t(obj, obj2, obj3, obj4, obj5);
    }

    public static AbstractC1081v J(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return t(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static AbstractC1081v L(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        J7.n.e(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr2 = new Object[objArr.length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        return t(objArr2);
    }

    public static AbstractC1081v M(Comparator comparator, Iterable iterable) {
        J7.n.j(comparator);
        Object[] objArrK = A.k(iterable);
        L.b(objArrK);
        Arrays.sort(objArrK, comparator);
        return n(objArrK);
    }

    public static AbstractC1081v n(Object[] objArr) {
        return p(objArr, objArr.length);
    }

    public static AbstractC1081v p(Object[] objArr, int i10) {
        return i10 == 0 ? z() : new O(objArr, i10);
    }

    public static a r() {
        return new a();
    }

    public static a s(int i10) {
        AbstractC1069i.b(i10, "expectedSize");
        return new a(i10);
    }

    public static AbstractC1081v t(Object... objArr) {
        return n(L.b(objArr));
    }

    public static AbstractC1081v v(Collection collection) {
        if (!(collection instanceof AbstractC1079t)) {
            return t(collection.toArray());
        }
        AbstractC1081v abstractC1081vC = ((AbstractC1079t) collection).c();
        return abstractC1081vC.k() ? n(abstractC1081vC.toArray()) : abstractC1081vC;
    }

    public static AbstractC1081v w(Object[] objArr) {
        return objArr.length == 0 ? z() : t((Object[]) objArr.clone());
    }

    public static AbstractC1081v z() {
        return O.f7593e;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: N */
    public AbstractC1081v subList(int i10, int i11) {
        J7.n.n(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? z() : O(i10, i11);
    }

    public AbstractC1081v O(int i10, int i11) {
        return new c(i10, i11 - i10);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // K7.AbstractC1079t, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // K7.AbstractC1079t
    public int d(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return D.c(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return D.d(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Y iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return D.f(this, obj);
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
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Z listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Z listIterator(int i10) {
        J7.n.l(i10, size());
        return isEmpty() ? f7715b : new b(this, i10);
    }

    @Override // K7.AbstractC1079t
    public final AbstractC1081v c() {
        return this;
    }
}
