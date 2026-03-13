package ha;

import android.graphics.Color;
import android.util.Log;
import com.lyokone.location.FlutterLocationService;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f36409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FlutterLocationService f36410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MethodChannel f36411c;

    public final void a(MethodCall methodCall, MethodChannel.Result result) {
        Boolean bool = (Boolean) methodCall.argument("enable");
        FlutterLocationService flutterLocationService = this.f36410b;
        if (flutterLocationService == null || bool == null) {
            result.success(0);
            return;
        }
        if (flutterLocationService.b()) {
            if (bool.booleanValue()) {
                this.f36410b.d();
                result.success(1);
                return;
            } else {
                this.f36410b.c();
                result.success(0);
                return;
            }
        }
        if (bool.booleanValue()) {
            this.f36410b.l(result);
            this.f36410b.j();
        } else {
            this.f36410b.c();
            result.success(0);
        }
    }

    public final void b(MethodChannel.Result result) {
        FlutterLocationService flutterLocationService = this.f36410b;
        if (flutterLocationService != null) {
            result.success(Integer.valueOf(flutterLocationService.getIsForeground() ? 1 : 0));
        } else {
            result.success(0);
        }
    }

    public final void c(MethodCall methodCall, MethodChannel.Result result) {
        try {
            String str = (String) methodCall.argument("channelName");
            if (str == null) {
                str = "Location background service";
            }
            String str2 = str;
            String str3 = (String) methodCall.argument("title");
            if (str3 == null) {
                str3 = "Location background service running";
            }
            String str4 = str3;
            String str5 = (String) methodCall.argument("iconName");
            if (str5 == null) {
                str5 = "navigation_empty_icon";
            }
            String str6 = str5;
            String str7 = (String) methodCall.argument("subtitle");
            String str8 = (String) methodCall.argument("description");
            Boolean bool = (Boolean) methodCall.argument("onTapBringToFront");
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            String str9 = (String) methodCall.argument("color");
            result.success(this.f36410b.a(new h(str2, str4, str6, str7, str8, str9 != null ? Integer.valueOf(Color.parseColor(str9)) : null, bool.booleanValue())));
        } catch (Exception e10) {
            result.error("CHANGE_NOTIFICATION_OPTIONS_ERROR", "An unexpected error happened during notification options change:" + e10.getMessage(), null);
        }
    }

    public final void d(MethodCall methodCall, MethodChannel.Result result) {
        try {
            Integer num = (Integer) this.f36409a.f36406r.get(((Integer) methodCall.argument("accuracy")).intValue());
            Long l10 = new Long(((Integer) methodCall.argument("interval")).intValue());
            this.f36409a.g(num, l10, Long.valueOf(l10.longValue() / 2), new Float(((Double) methodCall.argument("distanceFilter")).doubleValue()));
            result.success(1);
        } catch (Exception e10) {
            result.error("CHANGE_SETTINGS_ERROR", "An unexcepted error happened during location settings change:" + e10.getMessage(), null);
        }
    }

    public final void e(MethodChannel.Result result) {
        f fVar = this.f36409a;
        fVar.f36404p = result;
        if (fVar.h()) {
            this.f36409a.r();
        } else {
            this.f36409a.m();
        }
    }

    public final void f(MethodChannel.Result result) {
        if (this.f36409a.h()) {
            result.success(1);
        } else {
            result.success(0);
        }
    }

    public final void g(MethodChannel.Result result) {
        f fVar = this.f36409a;
        fVar.f36402n = result;
        fVar.m();
    }

    public final void h(MethodChannel.Result result) {
        try {
            result.success(Integer.valueOf(this.f36409a.i() ? 1 : 0));
        } catch (Exception unused) {
            result.error("SERVICE_STATUS_ERROR", "Location service status couldn't be determined", null);
        }
    }

    public void i(f fVar) {
        this.f36409a = fVar;
    }

    public void j(FlutterLocationService flutterLocationService) {
        this.f36410b = flutterLocationService;
    }

    public void k(BinaryMessenger binaryMessenger) {
        if (this.f36411c != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            l();
        }
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "lyokone/location");
        this.f36411c = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public void l() {
        MethodChannel methodChannel = this.f36411c;
        if (methodChannel == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
        } else {
            methodChannel.setMethodCallHandler(null);
            this.f36411c = null;
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "isBackgroundModeEnabled":
                b(result);
                break;
            case "enableBackgroundMode":
                a(methodCall, result);
                break;
            case "getLocation":
                e(result);
                break;
            case "requestService":
                this.f36409a.n(result);
                break;
            case "hasPermission":
                f(result);
                break;
            case "changeNotificationOptions":
                c(methodCall, result);
                break;
            case "serviceEnabled":
                h(result);
                break;
            case "requestPermission":
                g(result);
                break;
            case "changeSettings":
                d(methodCall, result);
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
