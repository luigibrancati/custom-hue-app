package v6;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import s6.C5783b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f45788a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    public static Intent a(Context context, S s10) throws H {
        Bundle bundleCall;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        String strA = s10.a();
        if (strA == null) {
            return new Intent().setComponent(s10.c());
        }
        Intent intent = null;
        if (s10.d()) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", strA);
            try {
                contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f45788a);
            } catch (RemoteException | IllegalArgumentException e10) {
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundleCall = null;
            }
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new RemoteException("Failed to acquire ContentProviderClient");
            }
            try {
                bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                contentProviderClientAcquireUnstableContentProviderClient.release();
                if (bundleCall != null) {
                    Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                    if (intent2 != null) {
                        intent = intent2;
                    } else {
                        PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                        if (pendingIntent != null) {
                            StringBuilder sb2 = new StringBuilder(strA.length() + 72);
                            sb2.append("Dynamic lookup for intent failed for action ");
                            sb2.append(strA);
                            sb2.append(" but has possible resolution");
                            Log.w("ServiceBindIntentUtils", sb2.toString());
                            throw new H(new C5783b(25, pendingIntent));
                        }
                    }
                }
                if (intent == null) {
                    Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(strA));
                }
            } catch (Throwable th) {
                contentProviderClientAcquireUnstableContentProviderClient.release();
                throw th;
            }
        }
        return intent == null ? new Intent(strA).setPackage(s10.b()) : intent;
    }
}
