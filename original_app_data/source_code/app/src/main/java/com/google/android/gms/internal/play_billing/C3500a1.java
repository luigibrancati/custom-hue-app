package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3500a1 extends R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f30118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f30119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f30120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f30121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f30122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f30123f;

    /* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a1$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Object run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f30120c = unsafe.objectFieldOffset(AbstractC3512c1.class.getDeclaredField("c"));
                f30119b = unsafe.objectFieldOffset(AbstractC3512c1.class.getDeclaredField("b"));
                f30121d = unsafe.objectFieldOffset(AbstractC3512c1.class.getDeclaredField("a"));
                f30122e = unsafe.objectFieldOffset(C3506b1.class.getDeclaredField("a"));
                f30123f = unsafe.objectFieldOffset(C3506b1.class.getDeclaredField("b"));
                f30118a = unsafe;
            } catch (NoSuchFieldException e10) {
                throw new RuntimeException(e10);
            }
        } catch (PrivilegedActionException e11) {
            throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
        }
    }

    public /* synthetic */ C3500a1(AbstractC3536g1 abstractC3536g1) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final U0 a(AbstractC3512c1 abstractC3512c1, U0 u02) {
        U0 u03;
        do {
            u03 = abstractC3512c1.f30139b;
            if (u02 == u03) {
                break;
            }
        } while (!e(abstractC3512c1, u03, u02));
        return u03;
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final C3506b1 b(AbstractC3512c1 abstractC3512c1, C3506b1 c3506b1) {
        C3506b1 c3506b12;
        do {
            c3506b12 = abstractC3512c1.f30140c;
            if (c3506b1 == c3506b12) {
                break;
            }
        } while (!g(abstractC3512c1, c3506b12, c3506b1));
        return c3506b12;
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final void c(C3506b1 c3506b1, C3506b1 c3506b12) {
        f30118a.putObject(c3506b1, f30123f, c3506b12);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final void d(C3506b1 c3506b1, Thread thread) {
        f30118a.putObject(c3506b1, f30122e, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final boolean e(AbstractC3512c1 abstractC3512c1, U0 u02, U0 u03) {
        return AbstractC3530f1.a(f30118a, abstractC3512c1, f30119b, u02, u03);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final boolean f(AbstractC3512c1 abstractC3512c1, Object obj, Object obj2) {
        return AbstractC3530f1.a(f30118a, abstractC3512c1, f30121d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final boolean g(AbstractC3512c1 abstractC3512c1, C3506b1 c3506b1, C3506b1 c3506b12) {
        return AbstractC3530f1.a(f30118a, abstractC3512c1, f30120c, c3506b1, c3506b12);
    }
}
