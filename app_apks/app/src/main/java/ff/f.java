package ff;

import android.content.Context;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class f extends b implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Context f34767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static f f34768d;

    public static void f(Context context, BinaryMessenger binaryMessenger) {
        if (f34768d == null) {
            f34768d = new f();
        }
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "xyz.canardoux.flutter_sound_recorder");
        f34768d.b(methodChannel);
        methodChannel.setMethodCallHandler(f34768d);
        f34767c = context;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        e eVar;
        String str = methodCall.method;
        str.getClass();
        if (str.equals("resetPlugin")) {
            e(methodCall, result);
            return;
        }
        eVar = (e) a(methodCall);
        String str2 = methodCall.method;
        str2.getClass();
        switch (str2) {
            case "resumeRecorder":
                eVar.F(methodCall, result);
                break;
            case "stopRecorder":
                eVar.J(methodCall, result);
                break;
            case "setSubscriptionDuration":
                eVar.H(methodCall, result);
                break;
            case "deleteRecord":
                eVar.A(methodCall, result);
                break;
            case "startRecorder":
                eVar.I(methodCall, result);
                break;
            case "setLogLevel":
                eVar.G(methodCall, result);
                break;
            case "isEncoderSupported":
                eVar.C(methodCall, result);
                break;
            case "closeRecorder":
                eVar.z(methodCall, result);
                break;
            case "getRecordURL":
                eVar.B(methodCall, result);
                break;
            case "pauseRecorder":
                eVar.E(methodCall, result);
                break;
            case "openRecorder":
                e eVar2 = new e(methodCall);
                c(methodCall, eVar2);
                eVar2.D(methodCall, result);
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
