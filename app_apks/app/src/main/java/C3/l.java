package C3;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import vc.InterfaceC6082a;
import y3.C6394d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f1124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z3.d f1125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C6394d f1126c;

    public l(ClassLoader loader, z3.d consumerAdapter) {
        AbstractC4862t.e(loader, "loader");
        AbstractC4862t.e(consumerAdapter, "consumerAdapter");
        this.f1124a = loader;
        this.f1125b = consumerAdapter;
        this.f1126c = new C6394d(loader);
    }

    public static final boolean B(l lVar) throws NoSuchMethodException {
        Method method = lVar.k().getMethod("getDisplayFoldFeatures", null);
        Type genericReturnType = method.getGenericReturnType();
        AbstractC4862t.c(genericReturnType, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
        AbstractC4862t.c(type, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls = (Class) type;
        H3.a aVar = H3.a.f5305a;
        AbstractC4862t.b(method);
        return aVar.d(method) && aVar.c(method, List.class) && AbstractC4862t.a(cls, lVar.i());
    }

    public static final boolean E(l lVar) throws NoSuchMethodException, ClassNotFoundException {
        Method method = lVar.f1126c.c().getMethod("getWindowLayoutComponent", null);
        Class clsM = lVar.m();
        H3.a aVar = H3.a.f5305a;
        AbstractC4862t.b(method);
        return aVar.d(method) && aVar.c(method, clsM);
    }

    public static final boolean r(l lVar) throws NoSuchMethodException, ClassNotFoundException {
        Class clsI = lVar.i();
        Method method = clsI.getMethod("getType", null);
        Class cls = Integer.TYPE;
        Method method2 = clsI.getMethod("hasProperty", cls);
        Method method3 = clsI.getMethod("hasProperties", int[].class);
        H3.a aVar = H3.a.f5305a;
        AbstractC4862t.b(method);
        if (!aVar.d(method) || !aVar.c(method, cls)) {
            return false;
        }
        AbstractC4862t.b(method2);
        if (!aVar.d(method2)) {
            return false;
        }
        Class cls2 = Boolean.TYPE;
        if (!aVar.c(method2, cls2)) {
            return false;
        }
        AbstractC4862t.b(method3);
        return aVar.d(method3) && aVar.c(method3, cls2);
    }

    public static final boolean t(l lVar) throws NoSuchMethodException, ClassNotFoundException {
        Class clsJ = lVar.j();
        Method method = clsJ.getMethod("getBounds", null);
        Method method2 = clsJ.getMethod("getType", null);
        Method method3 = clsJ.getMethod("getState", null);
        H3.a aVar = H3.a.f5305a;
        AbstractC4862t.b(method);
        if (!aVar.b(method, M.b(Rect.class)) || !aVar.d(method)) {
            return false;
        }
        AbstractC4862t.b(method2);
        Class cls = Integer.TYPE;
        if (!aVar.b(method2, M.b(cls)) || !aVar.d(method2)) {
            return false;
        }
        AbstractC4862t.b(method3);
        return aVar.b(method3, M.b(cls)) && aVar.d(method3);
    }

    public static final boolean v(l lVar) throws NoSuchMethodException {
        Method method = lVar.m().getMethod("getSupportedWindowFeatures", null);
        H3.a aVar = H3.a.f5305a;
        AbstractC4862t.b(method);
        return aVar.d(method) && aVar.c(method, lVar.k());
    }

    public static final boolean x(l lVar) throws NoSuchMethodException, ClassNotFoundException {
        Class clsB = lVar.f1125b.b();
        if (clsB == null) {
            return false;
        }
        Class clsM = lVar.m();
        Method method = clsM.getMethod("addWindowLayoutInfoListener", Activity.class, clsB);
        Method method2 = clsM.getMethod("removeWindowLayoutInfoListener", clsB);
        H3.a aVar = H3.a.f5305a;
        AbstractC4862t.b(method);
        if (aVar.d(method)) {
            AbstractC4862t.b(method2);
            if (aVar.d(method2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean z(l lVar) throws NoSuchMethodException, ClassNotFoundException {
        Class clsM = lVar.m();
        Method method = clsM.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        Method method2 = clsM.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        H3.a aVar = H3.a.f5305a;
        AbstractC4862t.b(method);
        if (!aVar.d(method)) {
            return false;
        }
        AbstractC4862t.b(method2);
        return aVar.d(method2);
    }

    public final boolean A() {
        return H3.a.e("SupportedWindowFeatures is not valid", new InterfaceC6082a() { // from class: C3.g
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Boolean.valueOf(l.B(this.f1119a));
            }
        });
    }

    public final boolean C() {
        return this.f1126c.h() && D() && s();
    }

    public final boolean D() {
        return H3.a.e("WindowExtensions#getWindowLayoutComponent is not valid", new InterfaceC6082a() { // from class: C3.e
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Boolean.valueOf(l.E(this.f1117a));
            }
        });
    }

    public final boolean h() {
        int iA;
        if (C() && (iA = z3.e.f48718a.a()) >= 1) {
            return iA == 1 ? n() : iA < 5 ? o() : p();
        }
        return false;
    }

    public final Class i() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f1124a.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
        AbstractC4862t.d(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public final Class j() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f1124a.loadClass("androidx.window.extensions.layout.FoldingFeature");
        AbstractC4862t.d(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public final Class k() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f1124a.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
        AbstractC4862t.d(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public final WindowLayoutComponent l() {
        if (!h()) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public final Class m() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f1124a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        AbstractC4862t.d(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public final boolean n() {
        return w();
    }

    public final boolean o() {
        return n() && y();
    }

    public final boolean p() {
        return o() && q() && A() && u();
    }

    public final boolean q() {
        return H3.a.e("DisplayFoldFeature is not valid", new InterfaceC6082a() { // from class: C3.h
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Boolean.valueOf(l.r(this.f1120a));
            }
        });
    }

    public final boolean s() {
        return H3.a.e("FoldingFeature class is not valid", new InterfaceC6082a() { // from class: C3.f
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Boolean.valueOf(l.t(this.f1118a));
            }
        });
    }

    public final boolean u() {
        return H3.a.e("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new InterfaceC6082a() { // from class: C3.i
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Boolean.valueOf(l.v(this.f1121a));
            }
        });
    }

    public final boolean w() {
        return H3.a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new InterfaceC6082a() { // from class: C3.j
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Boolean.valueOf(l.x(this.f1122a));
            }
        });
    }

    public final boolean y() {
        return H3.a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new InterfaceC6082a() { // from class: C3.k
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Boolean.valueOf(l.z(this.f1123a));
            }
        });
    }
}
