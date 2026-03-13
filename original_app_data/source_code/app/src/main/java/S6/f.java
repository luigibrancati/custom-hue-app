package S6;

import T6.M;
import T6.P;
import U6.AbstractC2277d;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import s6.C5786e;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15396a = "f";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f15397b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f15398c = a.LEGACY;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a {
        LEGACY,
        LATEST
    }

    public static synchronized int a(Context context) {
        return b(context, null, null);
    }

    public static synchronized int b(Context context, a aVar, h hVar) {
        AbstractC6056k.m(context, "Context is null");
        Log.d(f15396a, "preferredRenderer: ".concat(String.valueOf(aVar)));
        if (!f15397b) {
            try {
                P pA = M.a(context, aVar);
                try {
                    AbstractC2196b.k(pA.d());
                    AbstractC2277d.f(pA.k());
                    int i10 = 1;
                    f15397b = true;
                    if (aVar != null) {
                        int iOrdinal = aVar.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                throw new RuntimeException(null, null);
                            }
                            i10 = 2;
                        }
                    } else {
                        i10 = 0;
                    }
                    try {
                        if (pA.c() == 2) {
                            f15398c = a.LATEST;
                        }
                        pA.O4(ObjectWrapper.wrap(context), i10);
                    } catch (RemoteException e10) {
                        Log.e(f15396a, "Failed to retrieve renderer type or log initialization.", e10);
                    }
                    Log.d(f15396a, "loadedRenderer: ".concat(String.valueOf(f15398c)));
                    if (hVar != null) {
                        hVar.onMapsSdkInitialized(f15398c);
                    }
                } catch (RemoteException e11) {
                    throw new U6.B(e11);
                }
            } catch (C5786e e12) {
                return e12.f44158a;
            }
        } else if (hVar != null) {
            hVar.onMapsSdkInitialized(f15398c);
        }
        return 0;
    }
}
