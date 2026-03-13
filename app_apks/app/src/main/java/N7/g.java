package N7;

import J7.n;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends h {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractList implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f10587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10589c;

        public a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(int i10) {
            n.h(i10, size());
            return Integer.valueOf(this.f10587a[this.f10588b + i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && g.l(this.f10587a, ((Integer) obj).intValue(), this.f10588b, this.f10589c) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Integer set(int i10, Integer num) {
            n.h(i10, size());
            int[] iArr = this.f10587a;
            int i11 = this.f10588b;
            int i12 = iArr[i11 + i10];
            iArr[i11 + i10] = ((Integer) n.j(num)).intValue();
            return Integer.valueOf(i12);
        }

        public int[] e() {
            return Arrays.copyOfRange(this.f10587a, this.f10588b, this.f10589c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f10587a[this.f10588b + i10] != aVar.f10587a[aVar.f10588b + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iJ = 1;
            for (int i10 = this.f10588b; i10 < this.f10589c; i10++) {
                iJ = (iJ * 31) + g.j(this.f10587a[i10]);
            }
            return iJ;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iL;
            if (!(obj instanceof Integer) || (iL = g.l(this.f10587a, ((Integer) obj).intValue(), this.f10588b, this.f10589c)) < 0) {
                return -1;
            }
            return iL - this.f10588b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iM;
            if (!(obj instanceof Integer) || (iM = g.m(this.f10587a, ((Integer) obj).intValue(), this.f10588b, this.f10589c)) < 0) {
                return -1;
            }
            return iM - this.f10588b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f10589c - this.f10588b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i10, int i11) {
            n.n(i10, i11, size());
            if (i10 == i11) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.f10587a;
            int i12 = this.f10588b;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f10587a[this.f10588b]);
            int i10 = this.f10588b;
            while (true) {
                i10++;
                if (i10 >= this.f10589c) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f10587a[i10]);
            }
        }

        public a(int[] iArr, int i10, int i11) {
            this.f10587a = iArr;
            this.f10588b = i10;
            this.f10589c = i11;
        }
    }

    public static List c(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new a(iArr);
    }

    public static int d(long j10) {
        int i10 = (int) j10;
        n.g(j10 == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", j10);
        return i10;
    }

    public static int e(long j10) {
        int i10 = (int) j10;
        n.g(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int[] f(int[]... iArr) {
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int[] iArr3 = new int[d(length)];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return iArr3;
    }

    public static int g(int i10, int i11, int i12) {
        n.f(i11 <= i12, "min (%s) must be less than or equal to max (%s)", i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }

    public static int h(byte[] bArr) {
        n.f(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return i(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int i(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & ForkServer.ERROR) << 16) | ((b12 & ForkServer.ERROR) << 8) | (b13 & ForkServer.ERROR);
    }

    public static int k(int[] iArr, int i10) {
        return l(iArr, i10, 0, iArr.length);
    }

    public static int l(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int m(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static int n(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static int[] o(Collection collection) {
        if (collection instanceof a) {
            return ((a) collection).e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) n.j(array[i10])).intValue();
        }
        return iArr;
    }

    public static Integer p(String str) {
        return q(str, 10);
    }

    public static Integer q(String str, int i10) {
        Long lE = i.e(str, i10);
        if (lE == null || lE.longValue() != lE.intValue()) {
            return null;
        }
        return Integer.valueOf(lE.intValue());
    }

    public static int j(int i10) {
        return i10;
    }
}
