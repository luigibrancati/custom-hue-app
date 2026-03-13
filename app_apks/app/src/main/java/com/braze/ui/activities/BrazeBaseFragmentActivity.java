package com.braze.ui.activities;

import androidx.fragment.app.ActivityC2740v;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/braze/ui/activities/BrazeBaseFragmentActivity;", "Landroidx/fragment/app/v;", "<init>", "()V", "Lfc/H;", "onStart", "onResume", "onPause", "onStop", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BrazeBaseFragmentActivity extends ActivityC2740v {
    @Override // androidx.fragment.app.ActivityC2740v, android.app.Activity
    public void onPause() {
        super.onPause();
        BrazeInAppMessageManager.INSTANCE.getInstance().unregisterInAppMessageManager(this);
    }

    @Override // androidx.fragment.app.ActivityC2740v, android.app.Activity
    public void onResume() {
        super.onResume();
        BrazeInAppMessageManager.INSTANCE.getInstance().registerInAppMessageManager(this);
    }

    @Override // androidx.fragment.app.ActivityC2740v, android.app.Activity
    public void onStart() {
        super.onStart();
        if (BrazeInternal.INSTANCE.getConfigurationProvider(this).getShouldUseWindowFlagSecureInActivities()) {
            getWindow().setFlags(8192, 8192);
        }
        Braze.INSTANCE.getInstance(this).openSession(this);
    }

    @Override // androidx.fragment.app.ActivityC2740v, android.app.Activity
    public void onStop() {
        super.onStop();
        Braze.INSTANCE.getInstance(this).closeSession(this);
    }
}
