package za;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import io.flutter.plugin.common.EventChannel;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48863b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EventChannel.EventSink f48864a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public o(Context context, EventChannel.EventSink eventSink) {
        AbstractC4862t.e(context, "context");
        this.f48864a = eventSink;
        if (eventSink != null) {
            eventSink.success(Boolean.valueOf(a(context)));
        }
    }

    public final boolean a(Context context) {
        Object systemService = context.getSystemService("location");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        EventChannel.EventSink eventSink;
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(intent, "intent");
        if (!AbstractC4862t.a(intent.getAction(), "android.location.MODE_CHANGED") || (eventSink = this.f48864a) == null) {
            return;
        }
        eventSink.success(Boolean.valueOf(a(context)));
    }
}
