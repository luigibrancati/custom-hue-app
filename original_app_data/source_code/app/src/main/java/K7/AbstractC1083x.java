package K7;

import K7.AbstractC1079t;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/* JADX INFO: renamed from: K7.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1083x implements Map, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map.Entry[] f7720d = new Map.Entry[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient AbstractC1085z f7721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient AbstractC1085z f7722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient AbstractC1079t f7723c;

    /* JADX INFO: renamed from: K7.x$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Comparator f7724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object[] f7725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f7727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C0120a f7728e;

        /* JADX INFO: renamed from: K7.x$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0120a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f7729a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f7730b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f7731c;

            public C0120a(Object obj, Object obj2, Object obj3) {
                this.f7729a = obj;
                this.f7730b = obj2;
                this.f7731c = obj3;
            }

            public IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f7729a + "=" + this.f7730b + " and " + this.f7729a + "=" + this.f7731c);
            }
        }

        public a() {
            this(4);
        }

        public static void j(Object[] objArr, int i10, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, M.b(comparator).f(F.l()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public AbstractC1083x a() {
            return c();
        }

        public final AbstractC1083x b(boolean z10) {
            Object[] objArrE;
            C0120a c0120a;
            C0120a c0120a2;
            if (z10 && (c0120a2 = this.f7728e) != null) {
                throw c0120a2.a();
            }
            int length = this.f7726c;
            if (this.f7724a == null) {
                objArrE = this.f7725b;
            } else {
                if (this.f7727d) {
                    this.f7725b = Arrays.copyOf(this.f7725b, length * 2);
                }
                objArrE = this.f7725b;
                if (!z10) {
                    objArrE = e(objArrE, this.f7726c);
                    if (objArrE.length < this.f7725b.length) {
                        length = objArrE.length >>> 1;
                    }
                }
                j(objArrE, length, this.f7724a);
            }
            this.f7727d = true;
            P pQ = P.q(length, objArrE, this);
            if (!z10 || (c0120a = this.f7728e) == null) {
                return pQ;
            }
            throw c0120a.a();
        }

        public AbstractC1083x c() {
            return b(true);
        }

        public final void d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f7725b;
            if (i11 > objArr.length) {
                this.f7725b = Arrays.copyOf(objArr, AbstractC1079t.b.c(objArr.length, i11));
                this.f7727d = false;
            }
        }

        public final Object[] e(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 += 2;
                    i12 += 2;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        public a f(Object obj, Object obj2) {
            d(this.f7726c + 1);
            AbstractC1069i.a(obj, obj2);
            Object[] objArr = this.f7725b;
            int i10 = this.f7726c;
            objArr[i10 * 2] = obj;
            objArr[(i10 * 2) + 1] = obj2;
            this.f7726c = i10 + 1;
            return this;
        }

        public a g(Map.Entry entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a h(Iterable iterable) {
            if (iterable instanceof Collection) {
                d(this.f7726c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g((Map.Entry) it.next());
            }
            return this;
        }

        public a i(Map map) {
            return h(map.entrySet());
        }

        public a(int i10) {
            this.f7725b = new Object[i10 * 2];
            this.f7726c = 0;
            this.f7727d = false;
        }
    }

    public static a a() {
        return new a();
    }

    public static AbstractC1083x b(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static AbstractC1083x c(Map map) {
        if ((map instanceof AbstractC1083x) && !(map instanceof SortedMap)) {
            AbstractC1083x abstractC1083x = (AbstractC1083x) map;
            if (!abstractC1083x.h()) {
                return abstractC1083x;
            }
        }
        return b(map.entrySet());
    }

    public static AbstractC1083x j() {
        return P.f7596h;
    }

    public static AbstractC1083x k(Object obj, Object obj2) {
        AbstractC1069i.a(obj, obj2);
        return P.p(1, new Object[]{obj, obj2});
    }

    public static AbstractC1083x l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        AbstractC1069i.a(obj, obj2);
        AbstractC1069i.a(obj3, obj4);
        AbstractC1069i.a(obj5, obj6);
        AbstractC1069i.a(obj7, obj8);
        return P.p(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static AbstractC1083x m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        AbstractC1069i.a(obj, obj2);
        AbstractC1069i.a(obj3, obj4);
        AbstractC1069i.a(obj5, obj6);
        AbstractC1069i.a(obj7, obj8);
        AbstractC1069i.a(obj9, obj10);
        return P.p(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    public static AbstractC1083x n(Map.Entry... entryArr) {
        return b(Arrays.asList(entryArr));
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract AbstractC1085z d();

    public abstract AbstractC1085z e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return F.c(this, obj);
    }

    public abstract AbstractC1079t f();

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC1085z entrySet() {
        AbstractC1085z abstractC1085z = this.f7721a;
        if (abstractC1085z != null) {
            return abstractC1085z;
        }
        AbstractC1085z abstractC1085zD = d();
        this.f7721a = abstractC1085zD;
        return abstractC1085zD;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public abstract boolean h();

    @Override // java.util.Map
    public int hashCode() {
        return U.d(entrySet());
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC1085z keySet() {
        AbstractC1085z abstractC1085z = this.f7722b;
        if (abstractC1085z != null) {
            return abstractC1085z;
        }
        AbstractC1085z abstractC1085zE = e();
        this.f7722b = abstractC1085zE;
        return abstractC1085zE;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC1079t values() {
        AbstractC1079t abstractC1079t = this.f7723c;
        if (abstractC1079t != null) {
            return abstractC1079t;
        }
        AbstractC1079t abstractC1079tF = f();
        this.f7723c = abstractC1079tF;
        return abstractC1079tF;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return F.k(this);
    }
}
