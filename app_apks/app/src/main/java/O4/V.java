package O4;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.AbstractC3524e1;
import com.google.android.gms.internal.play_billing.AbstractC3635x;
import com.google.android.gms.internal.play_billing.zzab;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class V extends zzab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f11014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResultReceiver f11015b;

    public /* synthetic */ V(WeakReference weakReference, ResultReceiver resultReceiver, Z z10) {
        this.f11014a = weakReference;
        this.f11015b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3510c
    public final void a(Bundle bundle) {
        if (bundle == null) {
            this.f11015b.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            AbstractC3524e1.k("BillingClient", "Response bundle doesn't contain a response code");
            this.f11015b.send(6, bundle);
            return;
        }
        int iB = AbstractC3524e1.b(bundle, "BillingClient");
        if (iB != 0) {
            AbstractC3524e1.k("BillingClient", "Unable to launch intent for alternative billing only dialog" + iB);
            this.f11015b.send(iB, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        if (pendingIntent == null) {
            AbstractC3524e1.j("BillingClient", "User has acknowledged the alternative billing only dialog before.");
            this.f11015b.send(0, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.f11014a.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("alternative_billing_only_dialog_result_receiver", this.f11015b);
            intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e10) {
            AbstractC3524e1.l("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", e10);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 75);
            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("%s: %s", e10.getClass().getName(), AbstractC3635x.b(e10.getMessage())));
            this.f11015b.send(6, bundle2);
        }
    }
}
