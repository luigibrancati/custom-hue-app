package com.philips.lighting.hue2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import io.flutter.embedding.android.FlutterActivity;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/philips/lighting/hue2/ContentActivity;", "Lio/flutter/embedding/android/FlutterActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfc/H;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "com/philips/lighting/hue2/ContentActivity$a", "a", "Lcom/philips/lighting/hue2/ContentActivity$a;", "widgetCreationListener", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContentActivity extends FlutterActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final a widgetCreationListener = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ContentActivity.this.finish();
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerReceiver(this.widgetCreationListener, new IntentFilter("com.signify.widgets.HueWidgetCreationFlowEnded"), 4);
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.widgetCreationListener);
        super.onDestroy();
    }
}
