package Xa;

import android.content.Context;
import android.net.ConnectivityManager;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class f implements FlutterPlugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MethodChannel f19440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EventChannel f19441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f19442c;

    public final void a(BinaryMessenger binaryMessenger, Context context) {
        this.f19440a = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity");
        this.f19441b = new EventChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity_status");
        a aVar = new a((ConnectivityManager) context.getSystemService("connectivity"));
        e eVar = new e(aVar);
        this.f19442c = new d(context, aVar);
        this.f19440a.setMethodCallHandler(eVar);
        this.f19441b.setStreamHandler(this.f19442c);
    }

    public final void b() {
        this.f19440a.setMethodCallHandler(null);
        this.f19441b.setStreamHandler(null);
        this.f19442c.onCancel(null);
        this.f19440a = null;
        this.f19441b = null;
        this.f19442c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        a(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        b();
    }
}
