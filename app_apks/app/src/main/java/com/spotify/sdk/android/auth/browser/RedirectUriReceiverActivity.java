package com.spotify.sdk.android.auth.browser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.sdk.android.auth.LoginActivity;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class RedirectUriReceiverActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) LoginActivity.class);
        intent.setData(getIntent().getData());
        intent.addFlags(603979776);
        startActivity(intent);
        finish();
    }
}
