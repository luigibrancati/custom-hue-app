package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class O2 extends AbstractC3507b2 {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected J3 zzc = J3.c();

    public static final boolean B(O2 o22, boolean z10) {
        byte bByteValue = ((Byte) o22.l(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zB = C3615t3.a().b(o22.getClass()).b(o22);
        if (z10) {
            o22.l(2, true != zB ? null : o22, null);
        }
        return zB;
    }

    public static O2 j(O2 o22, byte[] bArr, int i10, int i11, B2 b22) throws V2 {
        if (i11 == 0) {
            return o22;
        }
        O2 o2R = o22.r();
        try {
            InterfaceC3633w3 interfaceC3633w3B = C3615t3.a().b(o2R.getClass());
            interfaceC3633w3B.i(o2R, bArr, 0, i11, new C3531f2(b22));
            interfaceC3633w3B.c(o2R);
            return o2R;
        } catch (H3 e10) {
            throw e10.a();
        } catch (V2 e11) {
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof V2) {
                throw ((V2) e12.getCause());
            }
            throw new V2(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new V2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static O2 q(Class cls) {
        Map map = zzb;
        O2 o22 = (O2) map.get(cls);
        if (o22 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                o22 = (O2) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (o22 != null) {
            return o22;
        }
        O2 o23 = (O2) ((O2) P3.j(cls)).l(6, null, null);
        if (o23 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, o23);
        return o23;
    }

    public static O2 s(O2 o22, byte[] bArr, B2 b22) throws V2 {
        O2 o2J = j(o22, bArr, 0, bArr.length, b22);
        if (o2J == null || B(o2J, true)) {
            return o2J;
        }
        throw new H3(o2J).a();
    }

    public static R2 t() {
        return P2.e();
    }

    public static S2 u() {
        return C3621u3.d();
    }

    public static Object v(Method method, Object obj, Object... objArr) {
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

    public static Object w(InterfaceC3568l3 interfaceC3568l3, String str, Object[] objArr) {
        return new C3627v3(interfaceC3568l3, str, objArr);
    }

    public static void z(Class cls, O2 o22) {
        o22.y();
        zzb.put(cls, o22);
    }

    public final void A(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3568l3
    public final void a(AbstractC3638x2 abstractC3638x2) {
        C3615t3.a().b(getClass()).h(this, C3644y2.L(abstractC3638x2));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3507b2
    public final int b(InterfaceC3633w3 interfaceC3633w3) {
        if (i()) {
            int iE = interfaceC3633w3.e(this);
            if (iE >= 0) {
                return iE;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iE);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iE2 = interfaceC3633w3.e(this);
        if (iE2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iE2;
            return iE2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iE2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C3615t3.a().b(getClass()).g(this, (O2) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3574m3
    public final /* synthetic */ InterfaceC3568l3 g() {
        return (O2) l(6, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3568l3
    public final int h() {
        if (i()) {
            int iK = k(null);
            if (iK >= 0) {
                return iK;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iK);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iK2 = k(null);
        if (iK2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iK2;
            return iK2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iK2);
    }

    public final int hashCode() {
        if (i()) {
            return m();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iM = m();
        this.zza = iM;
        return iM;
    }

    public final boolean i() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int k(InterfaceC3633w3 interfaceC3633w3) {
        return C3615t3.a().b(getClass()).e(this);
    }

    public abstract Object l(int i10, Object obj, Object obj2);

    public final int m() {
        return C3615t3.a().b(getClass()).a(this);
    }

    public final L2 n() {
        return (L2) l(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3568l3
    public final /* synthetic */ InterfaceC3562k3 o() {
        return (L2) l(5, null, null);
    }

    public final L2 p() {
        L2 l22 = (L2) l(5, null, null);
        l22.q(this);
        return l22;
    }

    public final O2 r() {
        return (O2) l(4, null, null);
    }

    public final String toString() {
        return AbstractC3580n3.a(this, super.toString());
    }

    public final void x() {
        C3615t3.a().b(getClass()).c(this);
        y();
    }

    public final void y() {
        this.zzd &= Integer.MAX_VALUE;
    }
}
