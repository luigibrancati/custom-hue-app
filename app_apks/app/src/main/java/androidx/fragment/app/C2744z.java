package androidx.fragment.app;

import androidx.fragment.app.ComponentCallbacksC2736q;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: androidx.fragment.app.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C2744z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0.J f23383a = new b0.J();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return ComponentCallbacksC2736q.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        b0.J j10 = f23383a;
        b0.J j11 = (b0.J) j10.get(classLoader);
        if (j11 == null) {
            j11 = new b0.J();
            j10.put(classLoader, j11);
        }
        Class cls = (Class) j11.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        j11.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new ComponentCallbacksC2736q.l("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new ComponentCallbacksC2736q.l("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    public ComponentCallbacksC2736q a(ClassLoader classLoader, String str) {
        try {
            return (ComponentCallbacksC2736q) d(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e10) {
            throw new ComponentCallbacksC2736q.l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new ComponentCallbacksC2736q.l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new ComponentCallbacksC2736q.l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new ComponentCallbacksC2736q.l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }
}
