package com.google.android.gms.internal.play_billing;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class P3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f30074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f30075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f30076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final O3 f30077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f30078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f30079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f30080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f30081h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.P3.<clinit>():void");
    }

    public static boolean A(Class cls) {
        int i10 = AbstractC3525e2.f30156a;
        try {
            Class cls2 = f30075b;
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

    public static boolean B(Object obj, long j10) {
        return f30077d.g(obj, j10);
    }

    public static boolean C() {
        return f30079f;
    }

    public static boolean D() {
        return f30078e;
    }

    public static int E(Class cls) {
        if (f30079f) {
            return f30077d.f30069a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int a(Class cls) {
        if (f30079f) {
            return f30077d.f30069a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static Field b() {
        int i10 = AbstractC3525e2.f30156a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, SentryLockReason.JsonKeys.ADDRESS);
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    public static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(Object obj, long j10, byte b10) {
        O3 o32 = f30077d;
        long j11 = (-4) & j10;
        int i10 = o32.f30069a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        o32.f30069a.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    public static void e(Object obj, long j10, byte b10) {
        O3 o32 = f30077d;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        o32.f30069a.putInt(obj, j11, ((255 & b10) << i10) | (o32.f30069a.getInt(obj, j11) & (~(255 << i10))));
    }

    public static double f(Object obj, long j10) {
        return f30077d.a(obj, j10);
    }

    public static float g(Object obj, long j10) {
        return f30077d.b(obj, j10);
    }

    public static int h(Object obj, long j10) {
        return f30077d.f30069a.getInt(obj, j10);
    }

    public static long i(Object obj, long j10) {
        return f30077d.f30069a.getLong(obj, j10);
    }

    public static Object j(Class cls) {
        try {
            return f30074a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object k(Object obj, long j10) {
        return f30077d.f30069a.getObject(obj, j10);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new L3());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(P3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void r(Object obj, long j10, boolean z10) {
        f30077d.c(obj, j10, z10);
    }

    public static void s(byte[] bArr, long j10, byte b10) {
        f30077d.d(bArr, f30080g + j10, b10);
    }

    public static void t(Object obj, long j10, double d10) {
        f30077d.e(obj, j10, d10);
    }

    public static void u(Object obj, long j10, float f10) {
        f30077d.f(obj, j10, f10);
    }

    public static void v(Object obj, long j10, int i10) {
        f30077d.f30069a.putInt(obj, j10, i10);
    }

    public static void w(Object obj, long j10, long j11) {
        f30077d.f30069a.putLong(obj, j10, j11);
    }

    public static void x(Object obj, long j10, Object obj2) {
        f30077d.f30069a.putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj, long j10) {
        return ((byte) ((f30077d.f30069a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f30077d.f30069a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }
}
