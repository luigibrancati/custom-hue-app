package ba;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import com.google.vr.dynamite.client.ILoadedInstanceCreator;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f25479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ILoadedInstanceCreator f25480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f25481c;

    public d(e eVar) {
        this.f25481c = eVar;
    }

    public static IBinder c(ClassLoader classLoader) {
        try {
            return (IBinder) classLoader.loadClass("com.google.vr.dynamite.LoadedInstanceCreator").getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException("Unable to find dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e10);
        } catch (IllegalAccessException e11) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e11);
        } catch (InstantiationException e12) {
            throw new IllegalStateException("Unable to instantiate the remote class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e12);
        } catch (NoSuchMethodException e13) {
            throw new IllegalStateException("No constructor for dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e13);
        } catch (InvocationTargetException e14) {
            throw new IllegalStateException("Unable to invoke constructor of dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e14);
        }
    }

    public final synchronized ILoadedInstanceCreator a(Context context) {
        ILoadedInstanceCreator c2899a;
        try {
            if (this.f25480b == null) {
                IBinder iBinderC = c(b(context).getClassLoader());
                if (iBinderC == null) {
                    c2899a = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderC.queryLocalInterface("com.google.vr.dynamite.client.ILoadedInstanceCreator");
                    c2899a = iInterfaceQueryLocalInterface instanceof ILoadedInstanceCreator ? (ILoadedInstanceCreator) iInterfaceQueryLocalInterface : new C2899a(iBinderC);
                }
                this.f25480b = c2899a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f25480b;
    }

    public final synchronized Context b(Context context) {
        if (this.f25479a == null) {
            try {
                this.f25479a = context.createPackageContext(this.f25481c.a(), 3);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new c();
            }
        }
        return this.f25479a;
    }
}
