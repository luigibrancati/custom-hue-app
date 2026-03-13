package ff;

import android.content.Context;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class d extends b implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Context f34763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static d f34764d;

    public static void f(Context context, BinaryMessenger binaryMessenger) {
        if (f34764d == null) {
            f34764d = new d();
        }
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "xyz.canardoux.flutter_sound_player");
        f34764d.b(methodChannel);
        methodChannel.setMethodCallHandler(f34764d);
        f34763c = context;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        c cVar;
        String str = methodCall.method;
        str.getClass();
        if (str.equals("resetPlugin")) {
            e(methodCall, result);
            return;
        }
        cVar = (c) a(methodCall);
        String str2 = methodCall.method;
        str2.getClass();
        switch (str2) {
            case "startPlayer":
                cVar.R(methodCall, result);
                break;
            case "pausePlayer":
                cVar.J(methodCall, result);
                break;
            case "feedInt16":
                cVar.C(methodCall, result);
                break;
            case "setSubscriptionDuration":
                cVar.O(methodCall, result);
                break;
            case "stopPlayer":
                cVar.T(methodCall, result);
                break;
            case "setVolumePan":
                cVar.Q(methodCall, result);
                break;
            case "setLogLevel":
                cVar.M(methodCall, result);
                break;
            case "getPlayerState":
                cVar.E(methodCall, result);
                break;
            case "feedFloat32":
                cVar.B(methodCall, result);
                break;
            case "isDecoderSupported":
                cVar.H(methodCall, result);
                break;
            case "feed":
                cVar.A(methodCall, result);
                break;
            case "closePlayer":
                cVar.z(methodCall, result);
                break;
            case "openPlayer":
                c cVar2 = new c(methodCall);
                c(methodCall, cVar2);
                cVar2.I(methodCall, result);
                break;
            case "seekToPlayer":
                cVar.L(methodCall, result);
                break;
            case "setVolume":
                cVar.P(methodCall, result);
                break;
            case "getProgress":
                cVar.F(methodCall, result);
                break;
            case "getResourcePath":
                cVar.G(methodCall, result);
                break;
            case "setSpeed":
                cVar.N(methodCall, result);
                break;
            case "resumePlayer":
                cVar.K(methodCall, result);
                break;
            case "startPlayerFromMic":
                cVar.S(methodCall, result);
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
