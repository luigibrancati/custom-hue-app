package Xa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.EventChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class d extends BroadcastReceiver implements EventChannel.StreamHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Xa.a f19434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EventChannel.EventSink f19435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f19436d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ConnectivityManager.NetworkCallback f19437e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            d dVar = d.this;
            dVar.i(dVar.f19434b.a(network));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            d dVar = d.this;
            dVar.i(dVar.f19434b.b(networkCapabilities));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            d.this.h();
        }
    }

    public d(Context context, Xa.a aVar) {
        this.f19433a = context;
        this.f19434b = aVar;
    }

    public final /* synthetic */ void f() {
        this.f19435c.success(this.f19434b.d());
    }

    public final /* synthetic */ void g(List list) {
        this.f19435c.success(list);
    }

    public final void h() {
        this.f19436d.postDelayed(new Runnable() { // from class: Xa.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f19432a.f();
            }
        }, 500L);
    }

    public final void i(final List list) {
        this.f19436d.post(new Runnable() { // from class: Xa.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f19430a.g(list);
            }
        });
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        if (this.f19437e != null) {
            this.f19434b.c().unregisterNetworkCallback(this.f19437e);
            this.f19437e = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f19435c = eventSink;
        this.f19437e = new a();
        this.f19434b.c().registerDefaultNetworkCallback(this.f19437e);
        i(this.f19434b.d());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        EventChannel.EventSink eventSink = this.f19435c;
        if (eventSink != null) {
            eventSink.success(this.f19434b.d());
        }
    }
}
