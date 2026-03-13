package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class PlayCoreDialogWrapperActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ResultReceiver f31025a;

    public final void a() {
        ResultReceiver resultReceiver = this.f31025a;
        if (resultReceiver != null) {
            resultReceiver.send(3, new Bundle());
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 0 && (resultReceiver = this.f31025a) != null) {
            if (i11 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i11 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        PlayCoreDialogWrapperActivity playCoreDialogWrapperActivity;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            Intent intent2 = new Intent();
            intent2.putExtra("window_flags", intExtra);
            intent = intent2;
        } else {
            intent = null;
        }
        super.onCreate(bundle);
        if (bundle != null) {
            this.f31025a = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.f31025a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        Bundle extras = getIntent().getExtras();
        PendingIntent pendingIntent = extras != null ? (PendingIntent) extras.get("confirmation_intent") : null;
        if (extras == null || pendingIntent == null) {
            a();
            finish();
            return;
        }
        try {
            playCoreDialogWrapperActivity = this;
        } catch (IntentSender.SendIntentException unused) {
            playCoreDialogWrapperActivity = this;
        }
        try {
            playCoreDialogWrapperActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 0, intent, 0, 0, 0);
        } catch (IntentSender.SendIntentException unused2) {
            playCoreDialogWrapperActivity.a();
            playCoreDialogWrapperActivity.finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f31025a);
    }
}
