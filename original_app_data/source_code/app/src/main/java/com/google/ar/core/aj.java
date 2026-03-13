package com.google.ar.core;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class aj {
    public static PendingIntent a(Context context) {
        try {
            Bundle bundleCall = context.getContentResolver().call(new Uri.Builder().scheme("content").authority("com.google.ar.core.services.arcorecontentprovider").path("").build(), "getSetupIntent", context.getPackageName(), (Bundle) null);
            if (bundleCall != null) {
                PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("intent");
                if (pendingIntent != null) {
                    return pendingIntent;
                }
                String string = bundleCall.getString("exceptionType", "");
                if (!string.isEmpty()) {
                    if (string.equals(UnavailableDeviceNotCompatibleException.class.getName())) {
                        throw new UnavailableDeviceNotCompatibleException();
                    }
                    if (string.equals(UnavailableUserDeclinedInstallationException.class.getName())) {
                        throw new UnavailableUserDeclinedInstallationException();
                    }
                    Class<? extends U> clsAsSubclass = Class.forName(string).asSubclass(RuntimeException.class);
                    String string2 = bundleCall.getString("exceptionText", null);
                    if (string2 != null) {
                        throw ((RuntimeException) clsAsSubclass.getConstructor(String.class).newInstance(string2));
                    }
                    throw ((RuntimeException) clsAsSubclass.getConstructor(null).newInstance(null));
                }
            }
            return null;
        } catch (ReflectiveOperationException | RuntimeException e10) {
            Log.i("ARCore-SetupContentReso", "Post-install failed", e10);
            return null;
        }
    }
}
