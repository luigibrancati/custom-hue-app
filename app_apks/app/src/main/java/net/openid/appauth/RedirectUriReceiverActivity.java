package net.openid.appauth;

import android.os.Bundle;
import i.ActivityC4309b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class RedirectUriReceiverActivity extends ActivityC4309b {
    @Override // androidx.fragment.app.ActivityC2740v, d.p, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(AuthorizationManagementActivity.c0(this, getIntent().getData()));
        finish();
    }
}
