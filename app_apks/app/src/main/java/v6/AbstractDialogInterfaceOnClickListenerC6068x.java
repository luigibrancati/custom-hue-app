package v6;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import u6.InterfaceC5958h;

/* JADX INFO: renamed from: v6.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC6068x implements DialogInterface.OnClickListener {
    public static AbstractDialogInterfaceOnClickListenerC6068x b(Activity activity, Intent intent, int i10) {
        return new C6066v(intent, activity, i10);
    }

    public static AbstractDialogInterfaceOnClickListenerC6068x c(InterfaceC5958h interfaceC5958h, Intent intent, int i10) {
        return new C6067w(intent, interfaceC5958h, 2);
    }

    public abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e10) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e10);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
