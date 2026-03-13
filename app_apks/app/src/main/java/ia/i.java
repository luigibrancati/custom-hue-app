package ia;

import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements MethodChannel.Result {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MethodChannel.Result f37375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f37376b;

    public i(MethodChannel.Result methodResult) {
        AbstractC4862t.e(methodResult, "methodResult");
        this.f37375a = methodResult;
        this.f37376b = new Handler(Looper.getMainLooper());
    }

    public static final void d(i iVar, String str, String str2, Object obj) {
        iVar.f37375a.error(str, str2, obj);
    }

    public static final void e(i iVar) {
        iVar.f37375a.notImplemented();
    }

    public static final void f(i iVar, Object obj) {
        iVar.f37375a.success(obj);
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void error(final String errorCode, final String str, final Object obj) {
        AbstractC4862t.e(errorCode, "errorCode");
        this.f37376b.post(new Runnable() { // from class: ia.f
            @Override // java.lang.Runnable
            public final void run() {
                i.d(this.f37368a, errorCode, str, obj);
            }
        });
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void notImplemented() {
        this.f37376b.post(new Runnable() { // from class: ia.h
            @Override // java.lang.Runnable
            public final void run() {
                i.e(this.f37374a);
            }
        });
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void success(final Object obj) {
        this.f37376b.post(new Runnable() { // from class: ia.g
            @Override // java.lang.Runnable
            public final void run() {
                i.f(this.f37372a, obj);
            }
        });
    }
}
