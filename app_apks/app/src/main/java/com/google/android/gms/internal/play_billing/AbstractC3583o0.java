package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3583o0 extends AbstractC3511c0 implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient AbstractC3541h0 f30203b;

    public static int l(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static AbstractC3583o0 s(int i10, Object... objArr) {
        if (i10 == 0) {
            return J0.f30045i;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new M0(obj);
        }
        int iL = l(i10);
        Object[] objArr2 = new Object[iL];
        int i11 = iL - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            AbstractC3630w0.a(obj2, i14);
            int iHashCode = obj2.hashCode();
            int iA = Z.a(iHashCode);
            while (true) {
                int i15 = iA & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iA++;
                }
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new M0(obj4);
        }
        if (l(i13) < iL / 2) {
            return s(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new J0(objArr, i12, objArr2, i11, i13);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC3583o0) && r() && ((AbstractC3583o0) obj).r() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public AbstractC3541h0 f() {
        AbstractC3541h0 abstractC3541h0 = this.f30203b;
        if (abstractC3541h0 != null) {
            return abstractC3541h0;
        }
        AbstractC3541h0 abstractC3541h0N = n();
        this.f30203b = abstractC3541h0N;
        return abstractC3541h0N;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return L0.a(this);
    }

    public AbstractC3541h0 n() {
        Object[] array = toArray();
        Q0 q02 = AbstractC3541h0.f30177b;
        return AbstractC3541h0.p(array, array.length);
    }

    public boolean r() {
        return false;
    }
}
