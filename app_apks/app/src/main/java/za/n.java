package za;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import io.flutter.plugin.common.EventChannel;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements EventChannel.StreamHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BroadcastReceiver f48862b;

    public n(Context context) {
        AbstractC4862t.e(context, "context");
        this.f48861a = context;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        BroadcastReceiver broadcastReceiver = this.f48862b;
        if (broadcastReceiver != null) {
            this.f48861a.unregisterReceiver(broadcastReceiver);
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        o oVar = new o(this.f48861a, eventSink);
        this.f48862b = oVar;
        this.f48861a.registerReceiver(oVar, new IntentFilter("android.location.MODE_CHANGED"));
    }
}
