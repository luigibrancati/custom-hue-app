package T6;

import S6.f;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import s6.AbstractC5787f;
import s6.C5786e;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f16252a = "M";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f16253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile P f16254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Queue f16255d = new ConcurrentLinkedQueue();

    public static P a(Context context, f.a aVar) throws C5786e {
        AbstractC6056k.l(context);
        String str = f16252a;
        Log.d(str, "preferredRenderer: ".concat(String.valueOf(aVar)));
        if (f16254c == null) {
            int iF = AbstractC5787f.f(context, 13400000);
            if (iF != 0) {
                throw new C5786e(iF);
            }
            f16254c = e(context, aVar);
            try {
                int iC = f16254c.c();
                String packageName = context.getPackageName();
                if (iC != 2 || packageName.equals("com.google.android.apps.photos")) {
                    Log.d(str, "not early loading native code");
                } else {
                    Log.d(str, "early loading native code");
                    try {
                        f16254c.h1(ObjectWrapper.wrap(d(context, aVar)));
                    } catch (RemoteException e10) {
                        throw new U6.B(e10);
                    } catch (UnsatisfiedLinkError unused) {
                        Log.w(f16252a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                        f16253b = null;
                        f16254c = e(context, f.a.LEGACY);
                    }
                }
                try {
                    P p10 = f16254c;
                    Context contextD = d(context, aVar);
                    Objects.requireNonNull(contextD);
                    p10.q4(ObjectWrapper.wrap(contextD.getResources()), 20000000);
                    while (true) {
                        Queue queue = f16255d;
                        if (queue.isEmpty()) {
                            break;
                        }
                        try {
                            ((S6.r) AbstractC6056k.l((S6.r) queue.poll())).a(f16254c);
                        } catch (RemoteException e11) {
                            throw new U6.B(e11);
                        }
                    }
                } catch (RemoteException e12) {
                    throw new U6.B(e12);
                }
            } catch (RemoteException e13) {
                throw new U6.B(e13);
            }
        }
        return f16254c;
    }

    public static void b(S6.r rVar) {
        if (f16254c != null) {
            rVar.a(f16254c);
        } else {
            f16255d.add(rVar);
        }
    }

    public static Context c(Exception exc, Context context) {
        Log.e(f16252a, "Failed to load maps module, use pre-Chimera", exc);
        return AbstractC5787f.c(context);
    }

    public static Context d(Context context, f.a aVar) {
        Context contextC;
        Context context2 = f16253b;
        if (context2 != null) {
            return context2;
        }
        String str = aVar == f.a.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            contextC = DynamiteModule.e(context, DynamiteModule.f29111b, str).b();
        } catch (Exception e10) {
            if (str.equals("com.google.android.gms.maps_dynamite")) {
                contextC = c(e10, context);
            } else {
                try {
                    Log.d(f16252a, "Attempting to load maps_dynamite again.");
                    contextC = DynamiteModule.e(context, DynamiteModule.f29111b, "com.google.android.gms.maps_dynamite").b();
                } catch (Exception e11) {
                    contextC = c(e11, context);
                }
            }
        }
        f16253b = contextC;
        if (contextC != null) {
            return contextC;
        }
        throw new RuntimeException("Unable to load maps module, maps container context is null");
    }

    public static P e(Context context, f.a aVar) {
        Log.i(f16252a, "Making Creator dynamically");
        try {
            IBinder iBinder = (IBinder) f(((ClassLoader) AbstractC6056k.l(d(context, aVar).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                throw new RuntimeException("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return iInterfaceQueryLocalInterface instanceof P ? (P) iInterfaceQueryLocalInterface : new O(iBinder);
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e10);
        }
    }

    public static Object f(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()), e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()), e11);
        }
    }
}
