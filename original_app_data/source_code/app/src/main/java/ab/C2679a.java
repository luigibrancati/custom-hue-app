package ab;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ab.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2679a implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2682d f21207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dev.fluttercommunity.plus.share.a f21208b;

    public C2679a(C2682d share, dev.fluttercommunity.plus.share.a manager) {
        AbstractC4862t.e(share, "share");
        AbstractC4862t.e(manager, "manager");
        this.f21207a = share;
        this.f21208b = manager;
    }

    public final void a(MethodCall methodCall) {
        if (!(methodCall.arguments instanceof Map)) {
            throw new IllegalArgumentException("Map arguments expected");
        }
    }

    public final void b(boolean z10, MethodChannel.Result result) {
        if (z10) {
            return;
        }
        result.success("dev.fluttercommunity.plus/share/unavailable");
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        a(call);
        this.f21208b.c(result);
        try {
            if (!AbstractC4862t.a(call.method, "share")) {
                result.notImplemented();
                return;
            }
            C2682d c2682d = this.f21207a;
            Object objArguments = call.arguments();
            AbstractC4862t.b(objArguments);
            c2682d.p((Map) objArguments, true);
            b(true, result);
        } catch (Throwable th) {
            this.f21208b.a();
            result.error("Share failed", th.getMessage(), th);
        }
    }
}
