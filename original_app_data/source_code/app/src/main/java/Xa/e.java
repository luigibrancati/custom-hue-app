package Xa;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class e implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f19439a;

    public e(a aVar) {
        this.f19439a = aVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (ExternalParsersConfigReaderMetKeys.CHECK_TAG.equals(methodCall.method)) {
            result.success(this.f19439a.d());
        } else {
            result.notImplemented();
        }
    }
}
