package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.h1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3406h1 extends AbstractC3454r0 {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C3452q2 zzc = C3452q2.c();

    public static void C(Class cls, AbstractC3406h1 abstractC3406h1) {
        abstractC3406h1.B();
        zzb.put(cls, abstractC3406h1);
    }

    public static final boolean E(AbstractC3406h1 abstractC3406h1, boolean z10) {
        byte bByteValue = ((Byte) abstractC3406h1.I(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zB = R1.a().b(abstractC3406h1.getClass()).b(abstractC3406h1);
        if (z10) {
            abstractC3406h1.I(2, true != zB ? null : abstractC3406h1, null);
        }
        return zB;
    }

    public static AbstractC3406h1 H(AbstractC3406h1 abstractC3406h1, byte[] bArr, int i10, int i11, S0 s02) throws C3455r1 {
        if (i11 == 0) {
            return abstractC3406h1;
        }
        AbstractC3406h1 abstractC3406h1M = abstractC3406h1.m();
        try {
            InterfaceC3382c2 interfaceC3382c2B = R1.a().b(abstractC3406h1M.getClass());
            interfaceC3382c2B.i(abstractC3406h1M, bArr, 0, i11, new C3474v0(s02));
            interfaceC3382c2B.c(abstractC3406h1M);
            return abstractC3406h1M;
        } catch (C3442o2 e10) {
            throw e10.a();
        } catch (C3455r1 e11) {
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof C3455r1) {
                throw ((C3455r1) e12.getCause());
            }
            throw new C3455r1(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new C3455r1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static C3401g1 j(J1 j12, Object obj, J1 j13, InterfaceC3421k1 interfaceC3421k1, int i10, D2 d22, Class cls) {
        return new C3401g1(j12, obj, j13, new C3396f1(null, i10, d22, false, false), cls);
    }

    public static AbstractC3406h1 l(Class cls) {
        Map map = zzb;
        AbstractC3406h1 abstractC3406h1 = (AbstractC3406h1) map.get(cls);
        if (abstractC3406h1 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC3406h1 = (AbstractC3406h1) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC3406h1 != null) {
            return abstractC3406h1;
        }
        AbstractC3406h1 abstractC3406h12 = (AbstractC3406h1) ((AbstractC3406h1) AbstractC3481w2.j(cls)).I(6, null, null);
        if (abstractC3406h12 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC3406h12);
        return abstractC3406h12;
    }

    public static AbstractC3406h1 n(AbstractC3406h1 abstractC3406h1, byte[] bArr, S0 s02) throws C3455r1 {
        AbstractC3406h1 abstractC3406h1H = H(abstractC3406h1, bArr, 0, bArr.length, s02);
        if (abstractC3406h1H == null || E(abstractC3406h1H, true)) {
            return abstractC3406h1H;
        }
        throw new C3442o2(abstractC3406h1H).a();
    }

    public static InterfaceC3431m1 o() {
        return Z0.e();
    }

    public static InterfaceC3431m1 p(InterfaceC3431m1 interfaceC3431m1) {
        int size = interfaceC3431m1.size();
        return interfaceC3431m1.g(size == 0 ? 10 : size + size);
    }

    public static InterfaceC3436n1 q() {
        return C3411i1.e();
    }

    public static InterfaceC3441o1 r() {
        return S1.d();
    }

    public static InterfaceC3441o1 u(InterfaceC3441o1 interfaceC3441o1) {
        int size = interfaceC3441o1.size();
        return interfaceC3441o1.g(size == 0 ? 10 : size + size);
    }

    public static Object y(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object z(J1 j12, String str, Object[] objArr) {
        return new T1(j12, str, objArr);
    }

    public final void A() {
        R1.a().b(getClass()).c(this);
        B();
    }

    public final void B() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void D(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean F() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int G(InterfaceC3382c2 interfaceC3382c2) {
        return R1.a().b(getClass()).e(this);
    }

    public abstract Object I(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final int a() {
        if (F()) {
            int iG = G(null);
            if (iG >= 0) {
                return iG;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iG);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iG2 = G(null);
        if (iG2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iG2;
            return iG2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iG2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3454r0
    public final int c(InterfaceC3382c2 interfaceC3382c2) {
        if (F()) {
            int iE = interfaceC3382c2.e(this);
            if (iE >= 0) {
                return iE;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iE);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iE2 = interfaceC3382c2.e(this);
        if (iE2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iE2;
            return iE2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iE2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final void e(O0 o02) {
        R1.a().b(getClass()).h(this, P0.L(o02));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return R1.a().b(getClass()).g(this, (AbstractC3406h1) obj);
    }

    public final int f() {
        return R1.a().b(getClass()).a(this);
    }

    public final AbstractC3381c1 g() {
        return (AbstractC3381c1) I(5, null, null);
    }

    public final int hashCode() {
        if (F()) {
            return f();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iF = f();
        this.zza = iF;
        return iF;
    }

    public final AbstractC3381c1 i() {
        AbstractC3381c1 abstractC3381c1 = (AbstractC3381c1) I(5, null, null);
        abstractC3381c1.m(this);
        return abstractC3381c1;
    }

    public final AbstractC3406h1 m() {
        return (AbstractC3406h1) I(4, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final /* synthetic */ I1 s() {
        return (AbstractC3381c1) I(5, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1
    public final /* synthetic */ J1 t() {
        return (AbstractC3406h1) I(6, null, null);
    }

    public final String toString() {
        return L1.a(this, super.toString());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1
    public final boolean v() {
        return E(this, true);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final /* synthetic */ I1 x() {
        AbstractC3381c1 abstractC3381c1 = (AbstractC3381c1) I(5, null, null);
        abstractC3381c1.m(this);
        return abstractC3381c1;
    }
}
