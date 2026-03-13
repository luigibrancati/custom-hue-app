package androidx.lifecycle;

import android.app.Application;
import gc.C4204q;
import gc.C4205s;
import gc.C4206t;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4846c;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f23411a = C4206t.n(Application.class, C.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f23412b = C4205s.d(C.class);

    public static final Constructor c(Class modelClass, List signature) {
        AbstractC4862t.e(modelClass, "modelClass");
        AbstractC4862t.e(signature, "signature");
        Iterator itA = AbstractC4846c.a(modelClass.getConstructors());
        while (itA.hasNext()) {
            Constructor constructor = (Constructor) itA.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC4862t.d(parameterTypes, "getParameterTypes(...)");
            List listO0 = C4204q.O0(parameterTypes);
            if (AbstractC4862t.a(signature, listO0)) {
                AbstractC4862t.c(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactory_androidKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == listO0.size() && listO0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final N d(Class modelClass, Constructor constructor, Object... params) {
        AbstractC4862t.e(modelClass, "modelClass");
        AbstractC4862t.e(constructor, "constructor");
        AbstractC4862t.e(params, "params");
        try {
            return (N) constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e12.getCause());
        }
    }
}
