package ca;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class e implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MethodChannel f26451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3089a f26452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f26453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f26454d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements MethodChannel.Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MethodChannel.Result f26455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f26456b = new Handler(Looper.getMainLooper());

        public a(MethodChannel.Result result) {
            this.f26455a = result;
        }

        public final /* synthetic */ void c(String str, String str2, Object obj) {
            this.f26455a.error(str, str2, obj);
        }

        public final /* synthetic */ void d(Object obj) {
            this.f26455a.success(obj);
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void error(final String str, final String str2, final Object obj) {
            this.f26456b.post(new Runnable() { // from class: ca.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26447a.c(str, str2, obj);
                }
            });
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            Handler handler = this.f26456b;
            MethodChannel.Result result = this.f26455a;
            Objects.requireNonNull(result);
            handler.post(new com.cloudwebrtc.webrtc.utils.a(result));
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(final Object obj) {
            this.f26456b.post(new Runnable() { // from class: ca.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26445a.d(obj);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MethodCall f26457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MethodChannel.Result f26458b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ca.b f26460a;

            public a(ca.b bVar) {
                this.f26460a = bVar;
            }

            @Override // ca.f
            public void a(Exception exc) {
                b.this.d(exc);
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // ca.f
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r42) {
                try {
                    String str = b.this.f26457a.method;
                    switch (str.hashCode()) {
                        case -1703690313:
                            if (str.equals("isDeviceSecure")) {
                                b.this.f26458b.success(Boolean.valueOf(e.this.f26452b.F()));
                                return;
                            }
                            break;
                        case -1413382213:
                            if (str.equals("isBiometricAvailable")) {
                                b.this.f26458b.success(Boolean.valueOf(e.this.f26452b.E()));
                                return;
                            }
                            break;
                        case -1335458389:
                            if (str.equals("delete")) {
                                b bVar = b.this;
                                e.this.f26452b.r(e.this.d(bVar.f26457a));
                                b.this.f26458b.success(null);
                                return;
                            }
                            break;
                        case -358737930:
                            if (str.equals("deleteAll")) {
                                e.this.f26452b.s();
                                b.this.f26458b.success(null);
                                return;
                            }
                            break;
                        case 3496342:
                            if (str.equals("read")) {
                                b bVar2 = b.this;
                                String strD = e.this.d(bVar2.f26457a);
                                if (!e.this.f26452b.o(strD)) {
                                    b.this.f26458b.success(null);
                                    return;
                                } else {
                                    b.this.f26458b.success(e.this.f26452b.N(strD));
                                    return;
                                }
                            }
                            break;
                        case 113399775:
                            if (str.equals("write")) {
                                b bVar3 = b.this;
                                String strD2 = e.this.d(bVar3.f26457a);
                                b bVar4 = b.this;
                                String strE = e.this.e(bVar4.f26457a);
                                if (strE == null) {
                                    b.this.f26458b.error("null", null, null);
                                    return;
                                } else {
                                    e.this.f26452b.T(strD2, strE);
                                    b.this.f26458b.success(null);
                                    return;
                                }
                            }
                            break;
                        case 208013248:
                            if (str.equals("containsKey")) {
                                b bVar5 = b.this;
                                b.this.f26458b.success(Boolean.valueOf(e.this.f26452b.o(e.this.d(bVar5.f26457a))));
                                return;
                            }
                            break;
                        case 1080375339:
                            if (str.equals("readAll")) {
                                b.this.f26458b.success(e.this.f26452b.O());
                                return;
                            }
                            break;
                    }
                    b.this.f26458b.notImplemented();
                } catch (Exception e10) {
                    if (!this.f26460a.k()) {
                        b.this.d(e10);
                        return;
                    }
                    try {
                        e.this.f26452b.s();
                        b.this.f26458b.success("Data has been reset");
                    } catch (Exception e11) {
                        b.this.d(e11);
                    }
                }
            }
        }

        public b(MethodCall methodCall, MethodChannel.Result result) {
            this.f26457a = methodCall;
            this.f26458b = result;
        }

        public final void d(Exception exc) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            this.f26458b.error("Exception encountered", exc.getMessage() != null ? exc.getMessage() : "Unknown error", stringWriter.toString());
        }

        @Override // java.lang.Runnable
        public void run() {
            ca.b bVar = new ca.b((Map) ((Map) this.f26457a.arguments).get(RRWebOptionsEvent.EVENT_TAG));
            e.this.f26452b.A(bVar, new a(bVar));
        }
    }

    public final String d(MethodCall methodCall) {
        return this.f26452b.m((String) ((Map) methodCall.arguments).get("key"));
    }

    public final String e(MethodCall methodCall) {
        return (String) ((Map) methodCall.arguments).get("value");
    }

    public void f(BinaryMessenger binaryMessenger, Context context) {
        try {
            this.f26452b = new C3089a(context);
            HandlerThread handlerThread = new HandlerThread("com.it_nomads.fluttersecurestorage.worker");
            this.f26453c = handlerThread;
            handlerThread.start();
            this.f26454d = new Handler(this.f26453c.getLooper());
            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.it_nomads.com/flutter_secure_storage");
            this.f26451a = methodChannel;
            methodChannel.setMethodCallHandler(this);
        } catch (Exception e10) {
            Log.e("FlutterSecureStoragePlugin", "Registration failed", e10);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        f(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        if (this.f26451a != null) {
            this.f26453c.quitSafely();
            this.f26453c = null;
            this.f26451a.setMethodCallHandler(null);
            this.f26451a = null;
        }
        this.f26452b = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        this.f26454d.post(new b(methodCall, new a(result)));
    }
}
