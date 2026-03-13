package Q4;

import Rd.InterfaceC2157v;
import android.util.Log;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class A implements MethodChannel.Result {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2157v f13755a;

    public A(InterfaceC2157v completer) {
        AbstractC4862t.e(completer, "completer");
        this.f13755a = completer;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void error(String errorCode, String str, Object obj) {
        AbstractC4862t.e(errorCode, "errorCode");
        Log.i("BackgroundDownloader", "Flutter result error " + errorCode + ": " + str);
        this.f13755a.C(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void notImplemented() {
        Log.i("BackgroundDownloader", "Flutter method not implemented");
        this.f13755a.C(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void success(Object obj) {
        if (obj == null) {
            obj = null;
        }
        this.f13755a.C(obj);
    }
}
