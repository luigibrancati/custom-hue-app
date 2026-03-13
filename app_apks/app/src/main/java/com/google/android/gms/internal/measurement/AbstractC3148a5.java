package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3148a5 extends AbstractC3282p4 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected Z5 zzc = Z5.a();

    public static InterfaceC3202g5 A(InterfaceC3202g5 interfaceC3202g5) {
        int size = interfaceC3202g5.size();
        return interfaceC3202g5.q(size + size);
    }

    public static final boolean B(AbstractC3148a5 abstractC3148a5, boolean z10) {
        byte bByteValue = ((Byte) abstractC3148a5.C(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zB = K5.a().b(abstractC3148a5.getClass()).b(abstractC3148a5);
        if (z10) {
            abstractC3148a5.C(2, true != zB ? null : abstractC3148a5, null);
        }
        return zB;
    }

    public static AbstractC3148a5 s(Class cls) {
        Map map = zzd;
        AbstractC3148a5 abstractC3148a5 = (AbstractC3148a5) map.get(cls);
        if (abstractC3148a5 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC3148a5 = (AbstractC3148a5) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC3148a5 != null) {
            return abstractC3148a5;
        }
        AbstractC3148a5 abstractC3148a52 = (AbstractC3148a5) ((AbstractC3148a5) AbstractC3194f6.h(cls)).C(6, null, null);
        if (abstractC3148a52 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC3148a52);
        return abstractC3148a52;
    }

    public static void t(Class cls, AbstractC3148a5 abstractC3148a5) {
        abstractC3148a5.l();
        zzd.put(cls, abstractC3148a5);
    }

    public static Object u(C5 c52, String str, Object[] objArr) {
        return new M5(c52, str, objArr);
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

    public static InterfaceC3184e5 w() {
        return C3157b5.d();
    }

    public static InterfaceC3193f5 x() {
        return C3292q5.d();
    }

    public static InterfaceC3193f5 y(InterfaceC3193f5 interfaceC3193f5) {
        int size = interfaceC3193f5.size();
        return interfaceC3193f5.q(size + size);
    }

    public static InterfaceC3202g5 z() {
        return L5.d();
    }

    public abstract Object C(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.C5
    public final int a() {
        if (k()) {
            int iF = f(null);
            if (iF >= 0) {
                return iF;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iF).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iF);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iF2 = f(null);
        if (iF2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iF2;
            return iF2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iF2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iF2);
        throw new IllegalStateException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3282p4
    public final int c(N5 n52) {
        if (k()) {
            int iA = n52.a(this);
            if (iA >= 0) {
                return iA;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iA).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iA);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iA2 = n52.a(this);
        if (iA2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iA2;
            return iA2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iA2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iA2);
        throw new IllegalStateException(sb3.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return K5.a().b(getClass()).h(this, (AbstractC3148a5) obj);
    }

    public final int f(N5 n52) {
        return K5.a().b(getClass()).a(this);
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final void g(J4 j42) {
        K5.a().b(getClass()).g(this, K4.M(j42));
    }

    public final boolean h() {
        return B(this, true);
    }

    public final int hashCode() {
        if (k()) {
            return n();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iN = n();
        this.zza = iN;
        return iN;
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final /* synthetic */ B5 i() {
        return (X4) C(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.D5
    public final /* synthetic */ C5 j() {
        return (AbstractC3148a5) C(6, null, null);
    }

    public final boolean k() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void l() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final AbstractC3148a5 m() {
        return (AbstractC3148a5) C(4, null, null);
    }

    public final int n() {
        return K5.a().b(getClass()).c(this);
    }

    public final void o() {
        K5.a().b(getClass()).e(this);
        l();
    }

    public final X4 p() {
        return (X4) C(5, null, null);
    }

    public final X4 q() {
        X4 x42 = (X4) C(5, null, null);
        x42.x(this);
        return x42;
    }

    public final void r(int i10) {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final String toString() {
        return E5.a(this, super.toString());
    }
}
