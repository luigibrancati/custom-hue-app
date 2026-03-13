package w9;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f46400a = c();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends H {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Method f46401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f46402c;

        public a(Method method, Object obj) {
            this.f46401b = method;
            this.f46402c = obj;
        }

        @Override // w9.H
        public Object d(Class cls) {
            H.b(cls);
            return this.f46401b.invoke(this.f46402c, cls);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends H {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Method f46403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f46404c;

        public b(Method method, int i10) {
            this.f46403b = method;
            this.f46404c = i10;
        }

        @Override // w9.H
        public Object d(Class cls) {
            H.b(cls);
            return this.f46403b.invoke(null, cls, Integer.valueOf(this.f46404c));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends H {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Method f46405b;

        public c(Method method) {
            this.f46405b = method;
        }

        @Override // w9.H
        public Object d(Class cls) {
            H.b(cls);
            return this.f46405b.invoke(null, cls, Object.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d extends H {
        @Override // w9.H
        public Object d(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    public static void b(Class cls) {
        String strS = u.s(cls);
        if (strS == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strS);
    }

    public static H c() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, iIntValue);
                }
            } catch (Exception unused2) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new c(declaredMethod3);
            }
        } catch (Exception unused3) {
            return new d();
        }
    }

    public abstract Object d(Class cls);
}
