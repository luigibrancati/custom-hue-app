package b0;

import c0.AbstractC2926a;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f24858a = new Object();

    public static final Object c(K k10, int i10) {
        Object obj;
        AbstractC4862t.e(k10, "<this>");
        int iA = AbstractC2926a.a(k10.f24855b, k10.f24857d, i10);
        if (iA < 0 || (obj = k10.f24856c[iA]) == f24858a) {
            return null;
        }
        return obj;
    }

    public static final void d(K k10, int i10) {
        AbstractC4862t.e(k10, "<this>");
        int iA = AbstractC2926a.a(k10.f24855b, k10.f24857d, i10);
        if (iA >= 0) {
            Object[] objArr = k10.f24856c;
            Object obj = objArr[iA];
            Object obj2 = f24858a;
            if (obj != obj2) {
                objArr[iA] = obj2;
                k10.f24854a = true;
            }
        }
    }

    public static final void e(K k10) {
        int i10 = k10.f24857d;
        int[] iArr = k10.f24855b;
        Object[] objArr = k10.f24856c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f24858a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        k10.f24854a = false;
        k10.f24857d = i11;
    }
}
