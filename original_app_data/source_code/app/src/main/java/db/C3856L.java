package db;

import E.C0817v;
import T9.b;
import T9.d;
import android.app.Activity;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import db.C3857M;
import eb.C3977c;
import eb.EnumC3975a;
import eb.EnumC3976b;
import fc.AbstractC4040w;
import fc.C4015H;
import gc.C4179C;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.view.TextureRegistry;
import io.sentry.ProfilingTraceData;
import io.sentry.SentryBaseEvent;
import io.sentry.protocol.SentryThread;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: db.L, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3856L implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f33213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3869f f33214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3857M f33215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vc.l f33216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vc.l f33217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vc.l f33218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MethodChannel.Result f33219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vc.r f33220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final vc.l f33221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MethodChannel f33222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EventChannel f33223k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C3887x f33224l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vc.l f33225m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vc.l f33226n;

    /* JADX INFO: renamed from: db.L$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements C3857M.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodChannel.Result f33227a;

        public a(MethodChannel.Result result) {
            this.f33227a = result;
        }

        @Override // db.C3857M.b
        public void a(String str) {
            if (str == null) {
                this.f33227a.success(Boolean.TRUE);
                return;
            }
            if (AbstractC4862t.a(str, "MOBILE_SCANNER_CAMERA_PERMISSION_DENIED")) {
                this.f33227a.success(Boolean.FALSE);
            } else if (AbstractC4862t.a(str, "MOBILE_SCANNER_CAMERA_PERMISSION_REQUEST_PENDING")) {
                this.f33227a.error("MOBILE_SCANNER_CAMERA_PERMISSION_REQUEST_PENDING", "Another request is ongoing and multiple requests cannot be handled at once.", null);
            } else {
                this.f33227a.error("MOBILE_SCANNER_GENERIC_ERROR", "An unknown error occurred.", null);
            }
        }
    }

    public C3856L(Activity activity, C3869f barcodeHandler, BinaryMessenger binaryMessenger, C3857M permissions, vc.l addPermissionListener, TextureRegistry textureRegistry) {
        AbstractC4862t.e(activity, "activity");
        AbstractC4862t.e(barcodeHandler, "barcodeHandler");
        AbstractC4862t.e(binaryMessenger, "binaryMessenger");
        AbstractC4862t.e(permissions, "permissions");
        AbstractC4862t.e(addPermissionListener, "addPermissionListener");
        AbstractC4862t.e(textureRegistry, "textureRegistry");
        this.f33213a = activity;
        this.f33214b = barcodeHandler;
        this.f33215c = permissions;
        this.f33216d = addPermissionListener;
        this.f33217e = new vc.l() { // from class: db.C
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C3856L.o(this.f33203a, (String) obj);
            }
        };
        this.f33218f = new vc.l() { // from class: db.D
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C3856L.q(this.f33204a, (List) obj);
            }
        };
        vc.r rVar = new vc.r() { // from class: db.E
            @Override // vc.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return C3856L.u(this.f33205a, (List) obj, (byte[]) obj2, (Integer) obj3, (Integer) obj4);
            }
        };
        this.f33220h = rVar;
        vc.l lVar = new vc.l() { // from class: db.F
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C3856L.w(this.f33206a, (String) obj);
            }
        };
        this.f33221i = lVar;
        this.f33225m = new vc.l() { // from class: db.G
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C3856L.K(this.f33207a, ((Integer) obj).intValue());
            }
        };
        this.f33226n = new vc.l() { // from class: db.H
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C3856L.M(this.f33208a, ((Double) obj).doubleValue());
            }
        };
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "dev.steenbakker.mobile_scanner/scanner/method");
        this.f33222j = methodChannel;
        AbstractC4862t.b(methodChannel);
        methodChannel.setMethodCallHandler(this);
        C3872i c3872i = new C3872i(activity);
        EventChannel eventChannel = new EventChannel(binaryMessenger, "dev.steenbakker.mobile_scanner/scanner/deviceOrientation");
        this.f33223k = eventChannel;
        AbstractC4862t.b(eventChannel);
        eventChannel.setStreamHandler(c3872i);
        this.f33224l = new C3887x(activity, textureRegistry, rVar, lVar, c3872i, null, 32, null);
    }

    public static final C4015H E(final MethodChannel.Result result, final Exception it) {
        AbstractC4862t.e(it, "it");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: db.B
            @Override // java.lang.Runnable
            public final void run() {
                C3856L.F(it, result);
            }
        });
        return C4015H.f34254a;
    }

    public static final void F(Exception exc, MethodChannel.Result result) {
        if (exc instanceof C3865b) {
            result.error("MOBILE_SCANNER_ALREADY_STARTED_ERROR", "The scanner was already started.", null);
            return;
        }
        if (exc instanceof C3870g) {
            result.error("MOBILE_SCANNER_CAMERA_ERROR", "An error occurred when opening the camera.", null);
        } else if (exc instanceof C3861Q) {
            result.error("MOBILE_SCANNER_NO_CAMERA_ERROR", "No cameras available.", null);
        } else {
            result.error("MOBILE_SCANNER_GENERIC_ERROR", "An unknown error occurred.", null);
        }
    }

    public static final C4015H G(final MethodChannel.Result result, final C3977c it) {
        AbstractC4862t.e(it, "it");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: db.z
            @Override // java.lang.Runnable
            public final void run() {
                C3856L.H(result, it);
            }
        });
        return C4015H.f34254a;
    }

    public static final void H(MethodChannel.Result result, C3977c c3977c) {
        result.success(gc.Q.l(AbstractC4040w.a("textureId", Long.valueOf(c3977c.e())), AbstractC4040w.a(RRWebVideoEvent.JsonKeys.SIZE, gc.Q.l(AbstractC4040w.a("width", Double.valueOf(c3977c.i())), AbstractC4040w.a("height", Double.valueOf(c3977c.d())))), AbstractC4040w.a("naturalDeviceOrientation", c3977c.f()), AbstractC4040w.a("handlesCropAndRotation", Boolean.valueOf(c3977c.c())), AbstractC4040w.a("sensorOrientation", Integer.valueOf(c3977c.h())), AbstractC4040w.a("currentTorchState", Integer.valueOf(c3977c.b())), AbstractC4040w.a("numberOfCameras", Integer.valueOf(c3977c.g())), AbstractC4040w.a("cameraDirection", c3977c.a())));
    }

    public static final C4015H K(C3856L c3856l, int i10) {
        c3856l.f33214b.f(gc.Q.l(AbstractC4040w.a("name", "torchState"), AbstractC4040w.a("data", Integer.valueOf(i10))));
        return C4015H.f34254a;
    }

    public static final C4015H M(C3856L c3856l, double d10) {
        c3856l.f33214b.f(gc.Q.l(AbstractC4040w.a("name", "zoomScaleState"), AbstractC4040w.a("data", Double.valueOf(d10))));
        return C4015H.f34254a;
    }

    public static final C4015H o(final C3856L c3856l, final String it) {
        AbstractC4862t.e(it, "it");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: db.A
            @Override // java.lang.Runnable
            public final void run() {
                C3856L.p(this.f33199a, it);
            }
        });
        return C4015H.f34254a;
    }

    public static final void p(C3856L c3856l, String str) {
        MethodChannel.Result result = c3856l.f33219g;
        if (result != null) {
            result.error("MOBILE_SCANNER_BARCODE_ERROR", str, null);
        }
        c3856l.f33219g = null;
    }

    public static final C4015H q(final C3856L c3856l, final List it) {
        AbstractC4862t.e(it, "it");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: db.K
            @Override // java.lang.Runnable
            public final void run() {
                C3856L.r(this.f33211a, it);
            }
        });
        return C4015H.f34254a;
    }

    public static final void r(C3856L c3856l, List list) {
        MethodChannel.Result result = c3856l.f33219g;
        if (result != null) {
            result.success(gc.Q.l(AbstractC4040w.a("name", "barcode"), AbstractC4040w.a("data", list)));
        }
        c3856l.f33219g = null;
    }

    public static final boolean t(C3856L c3856l, float f10) {
        return c3856l.C(f10);
    }

    public static final C4015H u(C3856L c3856l, List barcodes, byte[] bArr, Integer num, Integer num2) {
        AbstractC4862t.e(barcodes, "barcodes");
        c3856l.f33214b.f(gc.Q.l(AbstractC4040w.a("name", "barcode"), AbstractC4040w.a("data", barcodes), AbstractC4040w.a("image", gc.Q.l(AbstractC4040w.a("bytes", bArr), AbstractC4040w.a("width", num != null ? Double.valueOf(num.intValue()) : null), AbstractC4040w.a("height", num2 != null ? Double.valueOf(num2.intValue()) : null)))));
        return C4015H.f34254a;
    }

    public static final C4015H w(C3856L c3856l, String error) {
        AbstractC4862t.e(error, "error");
        c3856l.f33214b.d("MOBILE_SCANNER_BARCODE_ERROR", error, null);
        return C4015H.f34254a;
    }

    public final void A(MethodCall methodCall, MethodChannel.Result result) {
        Double d10 = (Double) methodCall.argument("dx");
        Float fValueOf = d10 != null ? Float.valueOf((float) d10.doubleValue()) : null;
        Double d11 = (Double) methodCall.argument("dy");
        Float fValueOf2 = d11 != null ? Float.valueOf((float) d11.doubleValue()) : null;
        if (fValueOf == null || fValueOf2 == null || !Bc.j.c(0.0f, 1.0f).a(fValueOf) || !Bc.j.c(0.0f, 1.0f).a(fValueOf2)) {
            result.error("MOBILE_SCANNER_INVALID_FOCUS_POINT", "The focus coordinates are not valid.", null);
            return;
        }
        try {
            C3887x c3887x = this.f33224l;
            if (c3887x != null) {
                c3887x.M(fValueOf.floatValue(), fValueOf2.floatValue());
            }
            result.success(null);
        } catch (C3863T unused) {
            result.error("MOBILE_SCANNER_GENERIC_ERROR", "Cannot set focus when camera is stopped.", null);
        } catch (Exception e10) {
            result.error("MOBILE_SCANNER_GENERIC_ERROR", "An unknown error occurred.", e10.getLocalizedMessage());
        }
    }

    public final void B(MethodCall methodCall, MethodChannel.Result result) {
        try {
            C3887x c3887x = this.f33224l;
            AbstractC4862t.b(c3887x);
            Object obj = methodCall.arguments;
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Double");
            c3887x.N(((Double) obj).doubleValue());
            result.success(null);
        } catch (C3862S unused) {
            result.error("MOBILE_SCANNER_GENERIC_ERROR", "The zoom scale should be between 0 and 1 (both inclusive)", null);
        } catch (C3863T unused2) {
            result.error("MOBILE_SCANNER_SET_SCALE_WHEN_STOPPED_ERROR", "The zoom scale cannot be changed when the camera is stopped.", null);
        }
    }

    public final boolean C(float f10) {
        try {
            C3887x c3887x = this.f33224l;
            AbstractC4862t.b(c3887x);
            c3887x.P(f10);
            return true;
        } catch (C3863T unused) {
            return false;
        }
    }

    public final void D(MethodCall methodCall, final MethodChannel.Result result) {
        Boolean bool = (Boolean) methodCall.argument("torch");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Integer num = (Integer) methodCall.argument("facing");
        int iIntValue = num != null ? num.intValue() : 0;
        List list = (List) methodCall.argument("formats");
        Boolean bool2 = (Boolean) methodCall.argument("returnImage");
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Integer num2 = (Integer) methodCall.argument("speed");
        int iIntValue2 = num2 != null ? num2.intValue() : 1;
        Integer num3 = (Integer) methodCall.argument(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
        int iIntValue3 = num3 != null ? num3.intValue() : 250;
        List list2 = (List) methodCall.argument("cameraResolution");
        Boolean bool3 = (Boolean) methodCall.argument("autoZoom");
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        Size size = list2 != null ? new Size(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue()) : null;
        Boolean bool4 = (Boolean) methodCall.argument("invertImage");
        boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
        Double d10 = (Double) methodCall.argument("initialZoom");
        T9.b bVarS = s(list, zBooleanValue3);
        C0817v c0817v = iIntValue == 0 ? C0817v.f3027c : C0817v.f3028d;
        AbstractC4862t.b(c0817v);
        EnumC3976b enumC3976b = iIntValue2 != 0 ? iIntValue2 != 1 ? EnumC3976b.UNRESTRICTED : EnumC3976b.NORMAL : EnumC3976b.NO_DUPLICATES;
        C3887x c3887x = this.f33224l;
        AbstractC4862t.b(c3887x);
        c3887x.Q(bVarS, zBooleanValue2, c0817v, zBooleanValue, enumC3976b, this.f33225m, this.f33226n, new vc.l() { // from class: db.I
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C3856L.G(result, (C3977c) obj);
            }
        }, new vc.l() { // from class: db.J
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C3856L.E(result, (Exception) obj);
            }
        }, iIntValue3, size, zBooleanValue4, d10);
    }

    public final void I(MethodCall methodCall, MethodChannel.Result result) {
        Boolean bool = (Boolean) methodCall.argument("force");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        try {
            C3887x c3887x = this.f33224l;
            AbstractC4862t.b(c3887x);
            c3887x.U(zBooleanValue);
            result.success(null);
        } catch (C3866c unused) {
            result.success(null);
        }
    }

    public final void J(MethodChannel.Result result) {
        C3887x c3887x = this.f33224l;
        if (c3887x != null) {
            c3887x.W();
        }
        result.success(null);
    }

    public final void L(MethodCall methodCall, MethodChannel.Result result) {
        C3887x c3887x = this.f33224l;
        if (c3887x != null) {
            c3887x.O((List) methodCall.argument("rect"));
        }
        result.success(null);
    }

    public final void n(MethodCall methodCall, MethodChannel.Result result) {
        this.f33219g = result;
        List list = (List) methodCall.argument("formats");
        Object objArgument = methodCall.argument("filePath");
        AbstractC4862t.b(objArgument);
        C3887x c3887x = this.f33224l;
        AbstractC4862t.b(c3887x);
        Uri uriFromFile = Uri.fromFile(new File((String) objArgument));
        AbstractC4862t.d(uriFromFile, "fromFile(...)");
        c3887x.r(uriFromFile, s(list, false), this.f33218f, this.f33217e);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) throws Exception {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1688013509:
                    if (str.equals("resetScale")) {
                        z(result);
                        return;
                    }
                    break;
                case -655811320:
                    if (str.equals("toggleTorch")) {
                        J(result);
                        return;
                    }
                    break;
                case 3540994:
                    if (str.equals("stop")) {
                        I(call, result);
                        return;
                    }
                    break;
                case 16698223:
                    if (str.equals("analyzeImage")) {
                        n(call, result);
                        return;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        y(call, result);
                        return;
                    }
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        D(call, result);
                        return;
                    }
                    break;
                case 109757585:
                    if (str.equals(SentryThread.JsonKeys.STATE)) {
                        result.success(Integer.valueOf(this.f33215c.d(this.f33213a)));
                        return;
                    }
                    break;
                case 1095692943:
                    if (str.equals(SentryBaseEvent.JsonKeys.REQUEST)) {
                        this.f33215c.e(this.f33213a, this.f33216d, new a(result));
                        return;
                    }
                    break;
                case 1392317846:
                    if (str.equals("setFocus")) {
                        A(call, result);
                        return;
                    }
                    break;
                case 1403963912:
                    if (str.equals("setScale")) {
                        B(call, result);
                        return;
                    }
                    break;
                case 2023844470:
                    if (str.equals("updateScanWindow")) {
                        L(call, result);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }

    public final T9.b s(List list, boolean z10) {
        b.a aVarB;
        if (list == null) {
            aVarB = new b.a();
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(EnumC3975a.Companion.a(((Number) it.next()).intValue()).b()));
            }
            if (arrayList.size() == 1) {
                aVarB = new b.a().b(((Number) C4179C.h0(arrayList)).intValue(), new int[0]);
            } else {
                b.a aVar = new b.a();
                int iIntValue = ((Number) C4179C.h0(arrayList)).intValue();
                int[] iArrU0 = C4179C.U0(arrayList.subList(1, arrayList.size()));
                aVarB = aVar.b(iIntValue, Arrays.copyOf(iArrU0, iArrU0.length));
            }
        }
        if (z10) {
            aVarB.c(new d.a(new d.b() { // from class: db.y
                @Override // T9.d.b
                public final boolean a(float f10) {
                    return C3856L.t(this.f33311a, f10);
                }
            }).b(x()).a());
        }
        return aVarB.a();
    }

    public final void v(ActivityPluginBinding activityPluginBinding) throws C3866c {
        AbstractC4862t.e(activityPluginBinding, "activityPluginBinding");
        MethodChannel methodChannel = this.f33222j;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f33222j = null;
        EventChannel eventChannel = this.f33223k;
        if (eventChannel != null) {
            eventChannel.setStreamHandler(null);
        }
        this.f33223k = null;
        this.f33214b.c();
        C3887x c3887x = this.f33224l;
        if (c3887x != null) {
            c3887x.E();
        }
        this.f33224l = null;
        PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListenerC = this.f33215c.c();
        if (requestPermissionsResultListenerC != null) {
            activityPluginBinding.removeRequestPermissionsResultListener(requestPermissionsResultListenerC);
        }
    }

    public final float x() {
        Object systemService = this.f33213a.getSystemService("camera");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        float fFloatValue = 1.0f;
        try {
            for (String str : cameraManager.getCameraIdList()) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                AbstractC4862t.d(cameraCharacteristics, "getCameraCharacteristics(...)");
                Float f10 = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
                if (f10 != null && f10.floatValue() > fFloatValue) {
                    fFloatValue = f10.floatValue();
                }
            }
            return fFloatValue;
        } catch (Exception e10) {
            e10.printStackTrace();
            return fFloatValue;
        }
    }

    public final void y(MethodCall methodCall, MethodChannel.Result result) throws Exception {
        Boolean bool = (Boolean) methodCall.argument("force");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        try {
            C3887x c3887x = this.f33224l;
            AbstractC4862t.b(c3887x);
            c3887x.I(zBooleanValue);
            result.success(null);
        } catch (Exception e10) {
            if (!(e10 instanceof C3864a) && !(e10 instanceof C3866c)) {
                throw e10;
            }
            result.success(null);
        }
    }

    public final void z(MethodChannel.Result result) {
        try {
            C3887x c3887x = this.f33224l;
            AbstractC4862t.b(c3887x);
            c3887x.L();
            result.success(null);
        } catch (C3863T unused) {
            result.error("MOBILE_SCANNER_SET_SCALE_WHEN_STOPPED_ERROR", "The zoom scale cannot be changed when the camera is stopped.", null);
        }
    }
}
