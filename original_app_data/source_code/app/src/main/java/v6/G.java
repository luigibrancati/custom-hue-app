package v6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f45783a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f45784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f45785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f45786d;

    public static int a(Context context) {
        b(context);
        return f45786d;
    }

    public static void b(Context context) {
        synchronized (f45783a) {
            try {
                if (f45784b) {
                    return;
                }
                f45784b = true;
                try {
                    Bundle bundle = D6.d.a(context).c(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                        return;
                    }
                    f45785c = bundle.getString("com.google.app.id");
                    f45786d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
