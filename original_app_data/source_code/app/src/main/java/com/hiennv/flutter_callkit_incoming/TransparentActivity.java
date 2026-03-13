package com.hiennv.flutter_callkit_incoming;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.ar.core.ImageMetadata;
import com.hiennv.flutter_callkit_incoming.CallkitIncomingBroadcastReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/TransparentActivity;", "Landroid/app/Activity;", "<init>", "()V", "Lfc/H;", "onStart", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Companion", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransparentActivity extends Activity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/TransparentActivity$Companion;", "", "<init>", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "action", "", "data", "Landroid/os/Bundle;", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Intent getIntent(Context context, String action, Bundle data) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(action, "action");
            Intent intent = new Intent(context, (Class<?>) TransparentActivity.class);
            intent.setAction(action);
            intent.putExtra("data", data);
            intent.addFlags(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
            intent.addFlags(1073741824);
            intent.addFlags(131072);
            intent.addFlags(67108864);
            intent.addFlags(536870912);
            return intent;
        }

        private Companion() {
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundleExtra = getIntent().getBundleExtra("data");
        CallkitIncomingBroadcastReceiver.Companion companion = CallkitIncomingBroadcastReceiver.INSTANCE;
        String action = getIntent().getAction();
        AbstractC4862t.b(action);
        Intent intent = companion.getIntent(this, action, bundleExtra);
        intent.addFlags(268435456);
        sendBroadcast(intent);
        startActivity(AppUtils.INSTANCE.getAppIntent(this, getIntent().getAction(), bundleExtra));
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        setVisible(false);
    }
}
