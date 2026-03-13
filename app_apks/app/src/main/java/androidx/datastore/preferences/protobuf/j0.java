package androidx.datastore.preferences.protobuf;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f22856a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f22857b = AbstractC2698d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f22858c = m(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f22859d = m(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f22860e = y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f22861f = Q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f22862g = P();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f22863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f22864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f22865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f22866k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f22867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f22868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f22869n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f22870o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f22871p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f22872q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f22873r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f22874s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f22875t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long f22876u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f22877v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f22878w;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public boolean c(Object obj, long j10) {
            return j0.f22878w ? j0.q(obj, j10) : j0.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public double d(Object obj, long j10) {
            return Double.longBitsToDouble(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public float e(Object obj, long j10) {
            return Float.intBitsToFloat(f(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void j(Object obj, long j10, boolean z10) {
            if (j0.f22878w) {
                j0.F(obj, j10, z10);
            } else {
                j0.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void k(Object obj, long j10, byte b10) {
            if (j0.f22878w) {
                j0.I(obj, j10, b10);
            } else {
                j0.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public boolean r() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public boolean c(Object obj, long j10) {
            return j0.f22878w ? j0.q(obj, j10) : j0.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public double d(Object obj, long j10) {
            return Double.longBitsToDouble(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public float e(Object obj, long j10) {
            return Float.intBitsToFloat(f(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void j(Object obj, long j10, boolean z10) {
            if (j0.f22878w) {
                j0.F(obj, j10, z10);
            } else {
                j0.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void k(Object obj, long j10, byte b10) {
            if (j0.f22878w) {
                j0.I(obj, j10, b10);
            } else {
                j0.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public boolean r() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public boolean c(Object obj, long j10) {
            return this.f22879a.getBoolean(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public double d(Object obj, long j10) {
            return this.f22879a.getDouble(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public float e(Object obj, long j10) {
            return this.f22879a.getFloat(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void j(Object obj, long j10, boolean z10) {
            this.f22879a.putBoolean(obj, j10, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void k(Object obj, long j10, byte b10) {
            this.f22879a.putByte(obj, j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void l(Object obj, long j10, double d10) {
            this.f22879a.putDouble(obj, j10, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void m(Object obj, long j10, float f10) {
            this.f22879a.putFloat(obj, j10, f10);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.f22879a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                j0.D(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f22879a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                j0.D(th);
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Unsafe f22879a;

        public e(Unsafe unsafe) {
            this.f22879a = unsafe;
        }

        public final int a(Class cls) {
            return this.f22879a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f22879a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract double d(Object obj, long j10);

        public abstract float e(Object obj, long j10);

        public final int f(Object obj, long j10) {
            return this.f22879a.getInt(obj, j10);
        }

        public final long g(Object obj, long j10) {
            return this.f22879a.getLong(obj, j10);
        }

        public final Object h(Object obj, long j10) {
            return this.f22879a.getObject(obj, j10);
        }

        public final long i(Field field) {
            return this.f22879a.objectFieldOffset(field);
        }

        public abstract void j(Object obj, long j10, boolean z10);

        public abstract void k(Object obj, long j10, byte b10);

        public abstract void l(Object obj, long j10, double d10);

        public abstract void m(Object obj, long j10, float f10);

        public final void n(Object obj, long j10, int i10) {
            this.f22879a.putInt(obj, j10, i10);
        }

        public final void o(Object obj, long j10, long j11) {
            this.f22879a.putLong(obj, j10, j11);
        }

        public final void p(Object obj, long j10, Object obj2) {
            this.f22879a.putObject(obj, j10, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.f22879a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                j0.D(th);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.f22879a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return j0.l() != null;
            } catch (Throwable th) {
                j0.D(th);
                return false;
            }
        }
    }

    static {
        long j10 = j(byte[].class);
        f22863h = j10;
        f22864i = j(boolean[].class);
        f22865j = k(boolean[].class);
        f22866k = j(int[].class);
        f22867l = k(int[].class);
        f22868m = j(long[].class);
        f22869n = k(long[].class);
        f22870o = j(float[].class);
        f22871p = k(float[].class);
        f22872q = j(double[].class);
        f22873r = k(double[].class);
        f22874s = j(Object[].class);
        f22875t = k(Object[].class);
        f22876u = o(l());
        f22877v = (int) (j10 & 7);
        f22878w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Unsafe A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean B() {
        return f22862g;
    }

    public static boolean C() {
        return f22861f;
    }

    public static void D(Throwable th) {
        Logger.getLogger(j0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void E(Object obj, long j10, boolean z10) {
        f22860e.j(obj, j10, z10);
    }

    public static void F(Object obj, long j10, boolean z10) {
        I(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    public static void G(Object obj, long j10, boolean z10) {
        J(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    public static void H(byte[] bArr, long j10, byte b10) {
        f22860e.k(bArr, f22863h + j10, b10);
    }

    public static void I(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iW = w(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (iW & (~(255 << i10))));
    }

    public static void J(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (w(obj, j11) & (~(255 << i10))));
    }

    public static void K(Object obj, long j10, double d10) {
        f22860e.l(obj, j10, d10);
    }

    public static void L(Object obj, long j10, float f10) {
        f22860e.m(obj, j10, f10);
    }

    public static void M(Object obj, long j10, int i10) {
        f22860e.n(obj, j10, i10);
    }

    public static void N(Object obj, long j10, long j11) {
        f22860e.o(obj, j10, j11);
    }

    public static void O(Object obj, long j10, Object obj2) {
        f22860e.p(obj, j10, obj2);
    }

    public static boolean P() {
        e eVar = f22860e;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    public static boolean Q() {
        e eVar = f22860e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    public static Object i(Class cls) {
        try {
            return f22856a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int j(Class cls) {
        if (f22862g) {
            return f22860e.a(cls);
        }
        return -1;
    }

    public static int k(Class cls) {
        if (f22862g) {
            return f22860e.b(cls);
        }
        return -1;
    }

    public static Field l() {
        Field fieldN;
        if (AbstractC2698d.c() && (fieldN = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldN;
        }
        Field fieldN2 = n(Buffer.class, SentryLockReason.JsonKeys.ADDRESS);
        if (fieldN2 == null || fieldN2.getType() != Long.TYPE) {
            return null;
        }
        return fieldN2;
    }

    public static boolean m(Class cls) {
        if (!AbstractC2698d.c()) {
            return false;
        }
        try {
            Class cls2 = f22857b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f22860e) == null) {
            return -1L;
        }
        return eVar.i(field);
    }

    public static boolean p(Object obj, long j10) {
        return f22860e.c(obj, j10);
    }

    public static boolean q(Object obj, long j10) {
        return s(obj, j10) != 0;
    }

    public static boolean r(Object obj, long j10) {
        return t(obj, j10) != 0;
    }

    public static byte s(Object obj, long j10) {
        return (byte) ((w(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte t(Object obj, long j10) {
        return (byte) ((w(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static double u(Object obj, long j10) {
        return f22860e.d(obj, j10);
    }

    public static float v(Object obj, long j10) {
        return f22860e.e(obj, j10);
    }

    public static int w(Object obj, long j10) {
        return f22860e.f(obj, j10);
    }

    public static long x(Object obj, long j10) {
        return f22860e.g(obj, j10);
    }

    public static e y() {
        Unsafe unsafe = f22856a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC2698d.c()) {
            return new d(unsafe);
        }
        if (f22858c) {
            return new c(unsafe);
        }
        if (f22859d) {
            return new b(unsafe);
        }
        return null;
    }

    public static Object z(Object obj, long j10) {
        return f22860e.h(obj, j10);
    }
}
