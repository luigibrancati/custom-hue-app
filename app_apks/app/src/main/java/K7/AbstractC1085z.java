package K7;

import K7.AbstractC1079t;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: K7.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1085z extends AbstractC1079t implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient AbstractC1081v f7747b;

    /* JADX INFO: renamed from: K7.z$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC1079t.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object[] f7748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7749e;

        public a() {
            super(4);
        }

        @Override // K7.AbstractC1079t.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            J7.n.j(obj);
            if (this.f7748d != null && AbstractC1085z.r(this.f7711b) <= this.f7748d.length) {
                k(obj);
                return this;
            }
            this.f7748d = null;
            super.d(obj);
            return this;
        }

        public a i(Object... objArr) {
            if (this.f7748d == null) {
                super.e(objArr);
                return this;
            }
            for (Object obj : objArr) {
                a(obj);
            }
            return this;
        }

        public a j(Iterable iterable) {
            J7.n.j(iterable);
            if (this.f7748d == null) {
                super.b(iterable);
                return this;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public final void k(Object obj) {
            Objects.requireNonNull(this.f7748d);
            int length = this.f7748d.length - 1;
            int iHashCode = obj.hashCode();
            int iB = AbstractC1078s.b(iHashCode);
            while (true) {
                int i10 = iB & length;
                Object[] objArr = this.f7748d;
                Object obj2 = objArr[i10];
                if (obj2 == null) {
                    objArr[i10] = obj;
                    this.f7749e += iHashCode;
                    super.d(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    iB = i10 + 1;
                }
            }
        }

        public AbstractC1085z l() {
            AbstractC1085z abstractC1085zS;
            int i10 = this.f7711b;
            if (i10 == 0) {
                return AbstractC1085z.y();
            }
            if (i10 == 1) {
                Object obj = this.f7710a[0];
                Objects.requireNonNull(obj);
                return AbstractC1085z.z(obj);
            }
            if (this.f7748d == null || AbstractC1085z.r(i10) != this.f7748d.length) {
                abstractC1085zS = AbstractC1085z.s(this.f7711b, this.f7710a);
                this.f7711b = abstractC1085zS.size();
            } else {
                Object[] objArrCopyOf = AbstractC1085z.J(this.f7711b, this.f7710a.length) ? Arrays.copyOf(this.f7710a, this.f7711b) : this.f7710a;
                abstractC1085zS = new Q(objArrCopyOf, this.f7749e, this.f7748d, r5.length - 1, this.f7711b);
            }
            this.f7712c = true;
            this.f7748d = null;
            return abstractC1085zS;
        }
    }

    public static AbstractC1085z A(Object obj, Object obj2) {
        return s(2, obj, obj2);
    }

    public static AbstractC1085z B(Object obj, Object obj2, Object obj3) {
        return s(3, obj, obj2, obj3);
    }

    public static AbstractC1085z E(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return s(5, obj, obj2, obj3, obj4, obj5);
    }

    public static AbstractC1085z I(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        J7.n.e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return s(length, objArr2);
    }

    public static boolean J(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public static int r(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            J7.n.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static AbstractC1085z s(int i10, Object... objArr) {
        if (i10 == 0) {
            return y();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return z(obj);
        }
        int iR = r(i10);
        Object[] objArr2 = new Object[iR];
        int i11 = iR - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object objA = L.a(objArr[i14], i14);
            int iHashCode = objA.hashCode();
            int iB = AbstractC1078s.b(iHashCode);
            while (true) {
                int i15 = iB & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = objA;
                    objArr2[i15] = objA;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new V(obj3);
        }
        if (r(i13) < iR / 2) {
            return s(i13, objArr);
        }
        if (J(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new Q(objArr, i12, objArr2, i11, i13);
    }

    public static AbstractC1085z t(Collection collection) {
        if ((collection instanceof AbstractC1085z) && !(collection instanceof SortedSet)) {
            AbstractC1085z abstractC1085z = (AbstractC1085z) collection;
            if (!abstractC1085z.k()) {
                return abstractC1085z;
            }
        }
        Object[] array = collection.toArray();
        return s(array.length, array);
    }

    public static AbstractC1085z v(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? s(objArr.length, (Object[]) objArr.clone()) : z(objArr[0]) : y();
    }

    public static AbstractC1085z y() {
        return Q.f7611i;
    }

    public static AbstractC1085z z(Object obj) {
        return new V(obj);
    }

    @Override // K7.AbstractC1079t
    public AbstractC1081v c() {
        AbstractC1081v abstractC1081v = this.f7747b;
        if (abstractC1081v != null) {
            return abstractC1081v;
        }
        AbstractC1081v abstractC1081vW = w();
        this.f7747b = abstractC1081vW;
        return abstractC1081vW;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC1085z) && x() && ((AbstractC1085z) obj).x() && hashCode() != obj.hashCode()) {
            return false;
        }
        return U.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return U.d(this);
    }

    @Override // K7.AbstractC1079t
    /* JADX INFO: renamed from: l */
    public abstract Y iterator();

    public AbstractC1081v w() {
        return AbstractC1081v.n(toArray());
    }

    public boolean x() {
        return false;
    }
}
