package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3481w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f29958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f29959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f29960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC3476v2 f29961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f29962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f29963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f29964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f29965h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3481w2.<clinit>():void");
    }

    public static boolean A(Class cls) {
        int i10 = AbstractC3469u0.f29942a;
        try {
            Class cls2 = f29959b;
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
        return f29961d.g(obj, j10);
    }

    public static boolean C() {
        return f29963f;
    }

    public static boolean D() {
        return f29962e;
    }

    public static int E(Class cls) {
        if (f29963f) {
            return f29961d.f29952a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int a(Class cls) {
        if (f29963f) {
            return f29961d.f29952a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static Field b() {
        int i10 = AbstractC3469u0.f29942a;
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
        AbstractC3476v2 abstractC3476v2 = f29961d;
        long j11 = (-4) & j10;
        int i10 = abstractC3476v2.f29952a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        abstractC3476v2.f29952a.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    public static void e(Object obj, long j10, byte b10) {
        AbstractC3476v2 abstractC3476v2 = f29961d;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        abstractC3476v2.f29952a.putInt(obj, j11, ((255 & b10) << i10) | (abstractC3476v2.f29952a.getInt(obj, j11) & (~(255 << i10))));
    }

    public static double f(Object obj, long j10) {
        return f29961d.a(obj, j10);
    }

    public static float g(Object obj, long j10) {
        return f29961d.b(obj, j10);
    }

    public static int h(Object obj, long j10) {
        return f29961d.f29952a.getInt(obj, j10);
    }

    public static long i(Object obj, long j10) {
        return f29961d.f29952a.getLong(obj, j10);
    }

    public static Object j(Class cls) {
        try {
            return f29958a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object k(Object obj, long j10) {
        return f29961d.f29952a.getObject(obj, j10);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C3461s2());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(AbstractC3481w2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void r(Object obj, long j10, boolean z10) {
        f29961d.c(obj, j10, z10);
    }

    public static void s(byte[] bArr, long j10, byte b10) {
        f29961d.d(bArr, f29964g + j10, b10);
    }

    public static void t(Object obj, long j10, double d10) {
        f29961d.e(obj, j10, d10);
    }

    public static void u(Object obj, long j10, float f10) {
        f29961d.f(obj, j10, f10);
    }

    public static void v(Object obj, long j10, int i10) {
        f29961d.f29952a.putInt(obj, j10, i10);
    }

    public static void w(Object obj, long j10, long j11) {
        f29961d.f29952a.putLong(obj, j10, j11);
    }

    public static void x(Object obj, long j10, Object obj2) {
        f29961d.f29952a.putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj, long j10) {
        return ((byte) ((f29961d.f29952a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f29961d.f29952a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }
}
