package com.google.android.gms.internal.measurement;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3194f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f29462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f29463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f29464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC3185e6 f29465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f29466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f29467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f29468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f29469h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC3194f6.<clinit>():void");
    }

    public static /* synthetic */ boolean A(Object obj, long j10) {
        return ((byte) ((f29465d.f29452a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ void D(Throwable th) {
        Logger.getLogger(AbstractC3194f6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static int E(Class cls) {
        if (f29467f) {
            return f29465d.f29452a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int a(Class cls) {
        if (f29467f) {
            return f29465d.f29452a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static Field b() {
        int i10 = AbstractC3308s4.f29604a;
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
        Unsafe unsafe = f29465d.f29452a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    public static void e(Object obj, long j10, byte b10) {
        Unsafe unsafe = f29465d.f29452a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    public static boolean f() {
        return f29467f;
    }

    public static boolean g() {
        return f29466e;
    }

    public static Object h(Class cls) {
        try {
            return f29462a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int i(Object obj, long j10) {
        return f29465d.f29452a.getInt(obj, j10);
    }

    public static void j(Object obj, long j10, int i10) {
        f29465d.f29452a.putInt(obj, j10, i10);
    }

    public static long k(Object obj, long j10) {
        return f29465d.f29452a.getLong(obj, j10);
    }

    public static void l(Object obj, long j10, long j11) {
        f29465d.f29452a.putLong(obj, j10, j11);
    }

    public static boolean m(Object obj, long j10) {
        return f29465d.b(obj, j10);
    }

    public static void n(Object obj, long j10, boolean z10) {
        f29465d.c(obj, j10, z10);
    }

    public static float o(Object obj, long j10) {
        return f29465d.d(obj, j10);
    }

    public static void p(Object obj, long j10, float f10) {
        f29465d.e(obj, j10, f10);
    }

    public static double q(Object obj, long j10) {
        return f29465d.f(obj, j10);
    }

    public static void r(Object obj, long j10, double d10) {
        f29465d.g(obj, j10, d10);
    }

    public static Object s(Object obj, long j10) {
        return f29465d.f29452a.getObject(obj, j10);
    }

    public static void t(Object obj, long j10, Object obj2) {
        f29465d.f29452a.putObject(obj, j10, obj2);
    }

    public static void u(byte[] bArr, long j10, byte b10) {
        f29465d.a(bArr, f29468g + j10, b10);
    }

    public static Unsafe v() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C3158b6());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean w(Class cls) {
        int i10 = AbstractC3308s4.f29604a;
        try {
            Class cls2 = f29463b;
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

    public static /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f29465d.f29452a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }
}
