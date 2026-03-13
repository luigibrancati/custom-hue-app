package y3;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: y3.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6394d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f48382a;

    public C6394d(ClassLoader loader) {
        AbstractC4862t.e(loader, "loader");
        this.f48382a = loader;
    }

    public static final Class f(C6394d c6394d) throws ClassNotFoundException {
        Class<?> clsLoadClass = c6394d.f48382a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        AbstractC4862t.d(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public static final boolean g(C6394d c6394d) throws NoSuchMethodException, ClassNotFoundException {
        Method declaredMethod = c6394d.d().getDeclaredMethod("getWindowExtensions", null);
        Class clsC = c6394d.c();
        H3.a aVar = H3.a.f5305a;
        AbstractC4862t.b(declaredMethod);
        return aVar.c(declaredMethod, clsC) && aVar.d(declaredMethod);
    }

    public final Class c() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f48382a.loadClass("androidx.window.extensions.WindowExtensions");
        AbstractC4862t.d(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public final Class d() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f48382a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        AbstractC4862t.d(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public final boolean e() {
        return H3.a.f5305a.a(new InterfaceC6082a() { // from class: y3.c
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C6394d.f(this.f48381a);
            }
        });
    }

    public final boolean h() {
        return e() && H3.a.e("WindowExtensionsProvider#getWindowExtensions is not valid", new InterfaceC6082a() { // from class: y3.b
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Boolean.valueOf(C6394d.g(this.f48380a));
            }
        });
    }
}
