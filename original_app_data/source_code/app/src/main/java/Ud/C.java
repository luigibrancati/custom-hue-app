package Ud;

import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Wd.E f16989a = new Wd.E("NO_VALUE");

    public static final v a(int i10, int i11, Td.a aVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
        }
        if (i10 > 0 || i11 > 0 || aVar == Td.a.SUSPEND) {
            int i12 = i11 + i10;
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            return new B(i10, i12, aVar);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
    }

    public static final InterfaceC2313e d(A a10, InterfaceC4992i interfaceC4992i, int i10, Td.a aVar) {
        return ((i10 == 0 || i10 == -3) && aVar == Td.a.SUSPEND) ? a10 : new Vd.h(a10, interfaceC4992i, i10, aVar);
    }

    public static final Object e(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    public static final void f(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}
