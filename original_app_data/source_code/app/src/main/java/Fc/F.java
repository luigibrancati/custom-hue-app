package Fc;

import java.lang.ref.SoftReference;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class F {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends c implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC6082a f3838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile SoftReference f3839c;

        public a(Object obj, InterfaceC6082a interfaceC6082a) {
            if (interfaceC6082a == null) {
                e(0);
            }
            this.f3839c = null;
            this.f3838b = interfaceC6082a;
            if (obj != null) {
                this.f3839c = new SoftReference(a(obj));
            }
        }

        public static /* synthetic */ void e(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // Fc.F.c, vc.InterfaceC6082a
        public Object invoke() {
            Object obj;
            SoftReference softReference = this.f3839c;
            if (softReference != null && (obj = softReference.get()) != null) {
                return c(obj);
            }
            Object objInvoke = this.f3838b.invoke();
            this.f3839c = new SoftReference(a(objInvoke));
            return objInvoke;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC6082a f3840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile Object f3841c;

        public b(InterfaceC6082a interfaceC6082a) {
            if (interfaceC6082a == null) {
                e(0);
            }
            this.f3841c = null;
            this.f3840b = interfaceC6082a;
        }

        private static /* synthetic */ void e(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"));
        }

        @Override // Fc.F.c, vc.InterfaceC6082a
        public Object invoke() {
            Object obj = this.f3841c;
            if (obj != null) {
                return c(obj);
            }
            Object objInvoke = this.f3840b.invoke();
            this.f3841c = a(objInvoke);
            return objInvoke;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Object f3842a = new a();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a {
        }

        public Object a(Object obj) {
            return obj == null ? f3842a : obj;
        }

        public final Object b(Object obj, Object obj2) {
            return invoke();
        }

        public Object c(Object obj) {
            if (obj == f3842a) {
                return null;
            }
            return obj;
        }

        public abstract Object invoke();
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static b b(InterfaceC6082a interfaceC6082a) {
        if (interfaceC6082a == null) {
            a(0);
        }
        return new b(interfaceC6082a);
    }

    public static a c(Object obj, InterfaceC6082a interfaceC6082a) {
        if (interfaceC6082a == null) {
            a(1);
        }
        return new a(obj, interfaceC6082a);
    }

    public static a d(InterfaceC6082a interfaceC6082a) {
        if (interfaceC6082a == null) {
            a(2);
        }
        return c(null, interfaceC6082a);
    }
}
