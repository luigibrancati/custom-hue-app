package S6;

import T6.M;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: renamed from: S6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2199e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15395a = "e";

    public static void a(Context context, String str) {
        try {
            M.b(new r(context, str));
        } catch (RemoteException e10) {
            Log.e(f15395a, "Failed to add internal usage attribution id.", e10);
        }
    }
}
