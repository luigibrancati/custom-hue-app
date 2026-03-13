package com.google.crypto.tink.shaded.protobuf;

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
/* JADX INFO: loaded from: classes3.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f31534a = D();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f31535b = AbstractC3657d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f31536c = o(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f31537d = o(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f31538e = B();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f31539f = T();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f31540g = S();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f31541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f31542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f31543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f31544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f31545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f31546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f31547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f31548o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f31549p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f31550q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f31551r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f31552s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f31553t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long f31554u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f31555v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f31556w;

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

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public boolean c(Object obj, long j10) {
            return p0.f31556w ? p0.s(obj, j10) : p0.t(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public byte d(Object obj, long j10) {
            return p0.f31556w ? p0.v(obj, j10) : p0.w(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public void k(Object obj, long j10, boolean z10) {
            if (p0.f31556w) {
                p0.I(obj, j10, z10);
            } else {
                p0.J(obj, j10, z10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public void l(Object obj, long j10, byte b10) {
            if (p0.f31556w) {
                p0.L(obj, j10, b10);
            } else {
                p0.M(obj, j10, b10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public boolean s() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public boolean c(Object obj, long j10) {
            return p0.f31556w ? p0.s(obj, j10) : p0.t(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public byte d(Object obj, long j10) {
            return p0.f31556w ? p0.v(obj, j10) : p0.w(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public void k(Object obj, long j10, boolean z10) {
            if (p0.f31556w) {
                p0.I(obj, j10, z10);
            } else {
                p0.J(obj, j10, z10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public void l(Object obj, long j10, byte b10) {
            if (p0.f31556w) {
                p0.L(obj, j10, b10);
            } else {
                p0.M(obj, j10, b10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public boolean s() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public boolean c(Object obj, long j10) {
            return this.f31557a.getBoolean(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public byte d(Object obj, long j10) {
            return this.f31557a.getByte(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public double e(Object obj, long j10) {
            return this.f31557a.getDouble(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public float f(Object obj, long j10) {
            return this.f31557a.getFloat(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public void k(Object obj, long j10, boolean z10) {
            this.f31557a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public void l(Object obj, long j10, byte b10) {
            this.f31557a.putByte(obj, j10, b10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public void m(Object obj, long j10, double d10) {
            this.f31557a.putDouble(obj, j10, d10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public void n(Object obj, long j10, float f10) {
            this.f31557a.putFloat(obj, j10, f10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f31557a.getClass();
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
                p0.G(th);
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.e
        public boolean s() {
            if (!super.s()) {
                return false;
            }
            try {
                Class<?> cls = this.f31557a.getClass();
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
                p0.G(th);
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Unsafe f31557a;

        public e(Unsafe unsafe) {
            this.f31557a = unsafe;
        }

        public final int a(Class cls) {
            return this.f31557a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f31557a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f31557a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f31557a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f31557a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f31557a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(Object obj, long j10, int i10) {
            this.f31557a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f31557a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f31557a.putObject(obj, j10, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.f31557a;
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
                p0.G(th);
                return false;
            }
        }

        public boolean s() {
            Unsafe unsafe = this.f31557a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return p0.n() != null;
            } catch (Throwable th) {
                p0.G(th);
                return false;
            }
        }
    }

    static {
        long jL = l(byte[].class);
        f31541h = jL;
        f31542i = l(boolean[].class);
        f31543j = m(boolean[].class);
        f31544k = l(int[].class);
        f31545l = m(int[].class);
        f31546m = l(long[].class);
        f31547n = m(long[].class);
        f31548o = l(float[].class);
        f31549p = m(float[].class);
        f31550q = l(double[].class);
        f31551r = m(double[].class);
        f31552s = l(Object[].class);
        f31553t = m(Object[].class);
        f31554u = q(n());
        f31555v = (int) (jL & 7);
        f31556w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static long A(Object obj, long j10) {
        return f31538e.h(obj, j10);
    }

    public static e B() {
        Unsafe unsafe = f31534a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC3657d.c()) {
            return new d(unsafe);
        }
        if (f31536c) {
            return new c(unsafe);
        }
        if (f31537d) {
            return new b(unsafe);
        }
        return null;
    }

    public static Object C(Object obj, long j10) {
        return f31538e.i(obj, j10);
    }

    public static Unsafe D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean E() {
        return f31540g;
    }

    public static boolean F() {
        return f31539f;
    }

    public static void G(Throwable th) {
        Logger.getLogger(p0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void H(Object obj, long j10, boolean z10) {
        f31538e.k(obj, j10, z10);
    }

    public static void I(Object obj, long j10, boolean z10) {
        L(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    public static void J(Object obj, long j10, boolean z10) {
        M(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    public static void K(byte[] bArr, long j10, byte b10) {
        f31538e.l(bArr, f31541h + j10, b10);
    }

    public static void L(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iZ = z(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        P(obj, j11, ((255 & b10) << i10) | (iZ & (~(255 << i10))));
    }

    public static void M(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        P(obj, j11, ((255 & b10) << i10) | (z(obj, j11) & (~(255 << i10))));
    }

    public static void N(Object obj, long j10, double d10) {
        f31538e.m(obj, j10, d10);
    }

    public static void O(Object obj, long j10, float f10) {
        f31538e.n(obj, j10, f10);
    }

    public static void P(Object obj, long j10, int i10) {
        f31538e.o(obj, j10, i10);
    }

    public static void Q(Object obj, long j10, long j11) {
        f31538e.p(obj, j10, j11);
    }

    public static void R(Object obj, long j10, Object obj2) {
        f31538e.q(obj, j10, obj2);
    }

    public static boolean S() {
        e eVar = f31538e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    public static boolean T() {
        e eVar = f31538e;
        if (eVar == null) {
            return false;
        }
        return eVar.s();
    }

    public static Object k(Class cls) {
        try {
            return f31534a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int l(Class cls) {
        if (f31540g) {
            return f31538e.a(cls);
        }
        return -1;
    }

    public static int m(Class cls) {
        if (f31540g) {
            return f31538e.b(cls);
        }
        return -1;
    }

    public static Field n() {
        Field fieldP;
        if (AbstractC3657d.c() && (fieldP = p(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldP;
        }
        Field fieldP2 = p(Buffer.class, SentryLockReason.JsonKeys.ADDRESS);
        if (fieldP2 == null || fieldP2.getType() != Long.TYPE) {
            return null;
        }
        return fieldP2;
    }

    public static boolean o(Class cls) {
        if (!AbstractC3657d.c()) {
            return false;
        }
        try {
            Class cls2 = f31535b;
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

    public static Field p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long q(Field field) {
        e eVar;
        if (field == null || (eVar = f31538e) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    public static boolean r(Object obj, long j10) {
        return f31538e.c(obj, j10);
    }

    public static boolean s(Object obj, long j10) {
        return v(obj, j10) != 0;
    }

    public static boolean t(Object obj, long j10) {
        return w(obj, j10) != 0;
    }

    public static byte u(byte[] bArr, long j10) {
        return f31538e.d(bArr, f31541h + j10);
    }

    public static byte v(Object obj, long j10) {
        return (byte) ((z(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte w(Object obj, long j10) {
        return (byte) ((z(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static double x(Object obj, long j10) {
        return f31538e.e(obj, j10);
    }

    public static float y(Object obj, long j10) {
        return f31538e.f(obj, j10);
    }

    public static int z(Object obj, long j10) {
        return f31538e.g(obj, j10);
    }
}
