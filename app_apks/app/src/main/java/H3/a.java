package H3;

import Cc.d;
import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.AbstractC4862t;
import uc.AbstractC6017a;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5305a = new a();

    public static final boolean e(String errorMessage, InterfaceC6082a block) {
        AbstractC4862t.e(errorMessage, "errorMessage");
        AbstractC4862t.e(block, "block");
        try {
            boolean zBooleanValue = ((Boolean) block.invoke()).booleanValue();
            if (!zBooleanValue) {
                Log.e("ReflectionGuard", errorMessage);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: " + errorMessage);
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: " + errorMessage);
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: " + errorMessage);
            return false;
        }
    }

    public final boolean a(InterfaceC6082a classLoader) {
        AbstractC4862t.e(classLoader, "classLoader");
        try {
            classLoader.invoke();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean b(Method method, d clazz) {
        AbstractC4862t.e(method, "<this>");
        AbstractC4862t.e(clazz, "clazz");
        return c(method, AbstractC6017a.b(clazz));
    }

    public final boolean c(Method method, Class clazz) {
        AbstractC4862t.e(method, "<this>");
        AbstractC4862t.e(clazz, "clazz");
        return method.getReturnType().equals(clazz);
    }

    public final boolean d(Method method) {
        AbstractC4862t.e(method, "<this>");
        return Modifier.isPublic(method.getModifiers());
    }
}
