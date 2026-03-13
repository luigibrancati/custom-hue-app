package N6;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: N6.g1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1320g1 extends Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f10267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f10268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f10269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f10270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f10271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f10272f;

    /* JADX INFO: renamed from: N6.g1$a */
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
                f10269c = unsafe.objectFieldOffset(AbstractC1346i1.class.getDeclaredField("c"));
                f10268b = unsafe.objectFieldOffset(AbstractC1346i1.class.getDeclaredField("b"));
                f10270d = unsafe.objectFieldOffset(AbstractC1346i1.class.getDeclaredField("a"));
                f10271e = unsafe.objectFieldOffset(C1333h1.class.getDeclaredField("a"));
                f10272f = unsafe.objectFieldOffset(C1333h1.class.getDeclaredField("b"));
                f10267a = unsafe;
            } catch (NoSuchFieldException e10) {
                throw new RuntimeException(e10);
            }
        } catch (PrivilegedActionException e11) {
            throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
        }
    }

    public /* synthetic */ C1320g1(AbstractC1424o1 abstractC1424o1) {
        super(null);
    }

    @Override // N6.Y0
    public final C1255b1 a(AbstractC1346i1 abstractC1346i1, C1255b1 c1255b1) {
        C1255b1 c1255b12;
        do {
            c1255b12 = abstractC1346i1.f10311b;
            if (c1255b1 == c1255b12) {
                break;
            }
        } while (!e(abstractC1346i1, c1255b12, c1255b1));
        return c1255b12;
    }

    @Override // N6.Y0
    public final C1333h1 b(AbstractC1346i1 abstractC1346i1, C1333h1 c1333h1) {
        C1333h1 c1333h12;
        do {
            c1333h12 = abstractC1346i1.f10312c;
            if (c1333h1 == c1333h12) {
                break;
            }
        } while (!g(abstractC1346i1, c1333h12, c1333h1));
        return c1333h12;
    }

    @Override // N6.Y0
    public final void c(C1333h1 c1333h1, C1333h1 c1333h12) {
        f10267a.putObject(c1333h1, f10272f, c1333h12);
    }

    @Override // N6.Y0
    public final void d(C1333h1 c1333h1, Thread thread) {
        f10267a.putObject(c1333h1, f10271e, thread);
    }

    @Override // N6.Y0
    public final boolean e(AbstractC1346i1 abstractC1346i1, C1255b1 c1255b1, C1255b1 c1255b12) {
        return AbstractC1411n1.a(f10267a, abstractC1346i1, f10268b, c1255b1, c1255b12);
    }

    @Override // N6.Y0
    public final boolean f(AbstractC1346i1 abstractC1346i1, Object obj, Object obj2) {
        return AbstractC1411n1.a(f10267a, abstractC1346i1, f10270d, obj, obj2);
    }

    @Override // N6.Y0
    public final boolean g(AbstractC1346i1 abstractC1346i1, C1333h1 c1333h1, C1333h1 c1333h12) {
        return AbstractC1411n1.a(f10267a, abstractC1346i1, f10269c, c1333h1, c1333h12);
    }
}
