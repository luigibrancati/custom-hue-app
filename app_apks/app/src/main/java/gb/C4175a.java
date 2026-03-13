package gb;

import android.os.Vibrator;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: renamed from: gb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4175a implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Vibrator f35575a;

    public C4175a(Vibrator vibrator) {
        this.f35575a = vibrator;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("vibrate")) {
            if (this.f35575a.hasVibrator()) {
                this.f35575a.vibrate(((Integer) methodCall.argument("duration")).intValue());
            }
            result.success(null);
            return;
        }
        if (methodCall.method.equals("canVibrate")) {
            result.success(Boolean.valueOf(this.f35575a.hasVibrator()));
            return;
        }
        if (methodCall.method.equals("impact")) {
            if (this.f35575a.hasVibrator()) {
                this.f35575a.vibrate(1L);
            }
            result.success(null);
            return;
        }
        if (methodCall.method.equals("selection")) {
            if (this.f35575a.hasVibrator()) {
                this.f35575a.vibrate(3L);
            }
            result.success(null);
            return;
        }
        if (methodCall.method.equals("success")) {
            if (this.f35575a.hasVibrator()) {
                this.f35575a.vibrate(50);
            }
            result.success(null);
            return;
        }
        if (methodCall.method.equals("warning")) {
            if (this.f35575a.hasVibrator()) {
                this.f35575a.vibrate(250);
            }
            result.success(null);
            return;
        }
        if (methodCall.method.equals("error")) {
            if (this.f35575a.hasVibrator()) {
                this.f35575a.vibrate(500);
            }
            result.success(null);
            return;
        }
        if (methodCall.method.equals("heavy")) {
            if (this.f35575a.hasVibrator()) {
                this.f35575a.vibrate(100);
            }
            result.success(null);
        } else if (methodCall.method.equals("medium")) {
            if (this.f35575a.hasVibrator()) {
                this.f35575a.vibrate(40);
            }
            result.success(null);
        } else {
            if (!methodCall.method.equals("light")) {
                result.notImplemented();
                return;
            }
            if (this.f35575a.hasVibrator()) {
                this.f35575a.vibrate(10);
            }
            result.success(null);
        }
    }
}
