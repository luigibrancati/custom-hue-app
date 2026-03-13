package Q5;

import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d implements MethodChannel.Result {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f13927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MethodChannel.Result f13928b;

    public d(MethodChannel.Result result) {
        AbstractC4862t.e(result, "result");
        this.f13927a = new Handler(Looper.getMainLooper());
        this.f13928b = result;
    }

    public static final void d(d dVar, String str, String str2, Object obj) {
        dVar.f13928b.error(str, str2, obj);
    }

    public static final void e(d dVar) {
        dVar.f13928b.notImplemented();
    }

    public static final void f(d dVar, Object obj) {
        dVar.f13928b.success(obj);
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void error(final String errorCode, final String str, final Object obj) {
        AbstractC4862t.e(errorCode, "errorCode");
        this.f13927a.post(new Runnable() { // from class: Q5.b
            @Override // java.lang.Runnable
            public final void run() {
                d.d(this.f13922a, errorCode, str, obj);
            }
        });
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void notImplemented() {
        this.f13927a.post(new Runnable() { // from class: Q5.c
            @Override // java.lang.Runnable
            public final void run() {
                d.e(this.f13926a);
            }
        });
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void success(final Object obj) {
        this.f13927a.post(new Runnable() { // from class: Q5.a
            @Override // java.lang.Runnable
            public final void run() {
                d.f(this.f13920a, obj);
            }
        });
    }
}
