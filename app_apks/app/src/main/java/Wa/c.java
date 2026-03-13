package Wa;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.protocol.FeatureFlags;
import io.sentry.protocol.SentryStackFrame;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f17875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MethodChannel f17876b;

    public c(b bVar) {
        this.f17875a = bVar;
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "action_location_source_settings":
                return "android.settings.LOCATION_SOURCE_SETTINGS";
            case "action_application_details_settings":
                return "android.settings.APPLICATION_DETAILS_SETTINGS";
            case "settings":
                return "android.settings.SETTINGS";
            case "action_view":
                return "android.intent.action.VIEW";
            case "action_voice":
                return "android.intent.action.VOICE_COMMAND";
            default:
                return str;
        }
    }

    public static Bundle b(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (obj instanceof Integer) {
                    bundle.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof String) {
                    bundle.putString(str, (String) obj);
                } else if (obj instanceof Boolean) {
                    bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(str, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    bundle.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof byte[]) {
                    bundle.putByteArray(str, (byte[]) obj);
                } else if (obj instanceof int[]) {
                    bundle.putIntArray(str, (int[]) obj);
                } else if (obj instanceof long[]) {
                    bundle.putLongArray(str, (long[]) obj);
                } else if (obj instanceof double[]) {
                    bundle.putDoubleArray(str, (double[]) obj);
                } else if (e(obj, Integer.class)) {
                    bundle.putIntegerArrayList(str, (ArrayList) obj);
                } else if (e(obj, String.class)) {
                    bundle.putStringArrayList(str, (ArrayList) obj);
                } else {
                    if (!d(obj)) {
                        throw new UnsupportedOperationException("Unsupported type " + obj);
                    }
                    bundle.putBundle(str, b((Map) obj));
                }
            }
        }
        return bundle;
    }

    public static Bundle c(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                int i10 = 0;
                if (e(obj, Boolean.class)) {
                    ArrayList arrayList = (ArrayList) obj;
                    boolean[] zArr = new boolean[arrayList.size()];
                    while (i10 < arrayList.size()) {
                        zArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue();
                        i10++;
                    }
                    bundle.putBooleanArray(str, zArr);
                } else if (e(obj, Integer.class)) {
                    ArrayList arrayList2 = (ArrayList) obj;
                    int[] iArr = new int[arrayList2.size()];
                    while (i10 < arrayList2.size()) {
                        iArr[i10] = ((Integer) arrayList2.get(i10)).intValue();
                        i10++;
                    }
                    bundle.putIntArray(str, iArr);
                } else if (e(obj, Long.class)) {
                    ArrayList arrayList3 = (ArrayList) obj;
                    long[] jArr = new long[arrayList3.size()];
                    while (i10 < arrayList3.size()) {
                        jArr[i10] = ((Long) arrayList3.get(i10)).longValue();
                        i10++;
                    }
                    bundle.putLongArray(str, jArr);
                } else if (e(obj, Double.class)) {
                    ArrayList arrayList4 = (ArrayList) obj;
                    double[] dArr = new double[arrayList4.size()];
                    while (i10 < arrayList4.size()) {
                        dArr[i10] = ((Double) arrayList4.get(i10)).doubleValue();
                        i10++;
                    }
                    bundle.putDoubleArray(str, dArr);
                } else {
                    if (!e(obj, String.class)) {
                        throw new UnsupportedOperationException("Unsupported type " + obj);
                    }
                    ArrayList arrayList5 = (ArrayList) obj;
                    bundle.putStringArray(str, (String[]) arrayList5.toArray(new String[arrayList5.size()]));
                }
            }
        }
        return bundle;
    }

    public static boolean d(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        for (Object obj2 : ((Map) obj).keySet()) {
            if (obj2 != null && !(obj2 instanceof String)) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(Object obj, Class cls) {
        if (!(obj instanceof ArrayList)) {
            return false;
        }
        for (Object obj2 : (ArrayList) obj) {
            if (obj2 != null && !cls.isInstance(obj2)) {
                return false;
            }
        }
        return true;
    }

    public void f(BinaryMessenger binaryMessenger) {
        if (this.f17876b != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            g();
        }
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/android_intent");
        this.f17876b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public void g() {
        MethodChannel methodChannel = this.f17876b;
        if (methodChannel == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no methodChannel had been initialized.");
        } else {
            methodChannel.setMethodCallHandler(null);
            this.f17876b = null;
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        try {
            String strA = a((String) methodCall.argument("action"));
            Integer num = (Integer) methodCall.argument(FeatureFlags.TYPE);
            String str = (String) methodCall.argument("category");
            Uri uri = methodCall.argument("data") != null ? Uri.parse((String) methodCall.argument("data")) : null;
            Bundle bundleB = b((Map) methodCall.argument("arguments"));
            bundleB.putAll(c((Map) methodCall.argument("arrayArguments")));
            String str2 = (String) methodCall.argument(SentryStackFrame.JsonKeys.PACKAGE);
            Intent intentA = this.f17875a.a(strA, num, str, uri, bundleB, str2, (TextUtils.isEmpty(str2) || TextUtils.isEmpty((String) methodCall.argument("componentName"))) ? null : new ComponentName(str2, (String) methodCall.argument("componentName")), (String) methodCall.argument("type"));
            if ("parseAndLaunch".equalsIgnoreCase(methodCall.method)) {
                try {
                    this.f17875a.f(this.f17875a.e((String) methodCall.argument("uri")));
                    result.success(null);
                    return;
                } catch (URISyntaxException e10) {
                    result.error("parse_error", "Failed to parse URI", e10.getMessage());
                    return;
                }
            }
            if ("launch".equalsIgnoreCase(methodCall.method)) {
                if (intentA != null && !this.f17875a.b(intentA)) {
                    Log.i("MethodCallHandlerImpl", "Cannot resolve explicit intent, falling back to implicit");
                    intentA.setPackage(null);
                }
                this.f17875a.f(intentA);
                result.success(null);
                return;
            }
            if ("launchChooser".equalsIgnoreCase(methodCall.method)) {
                this.f17875a.d(intentA, (String) methodCall.argument("chooserTitle"));
                result.success(null);
                return;
            }
            if ("sendBroadcast".equalsIgnoreCase(methodCall.method)) {
                this.f17875a.g(intentA);
                result.success(null);
                return;
            }
            if ("sendService".equalsIgnoreCase(methodCall.method)) {
                this.f17875a.h(intentA);
                result.success(null);
            } else if ("canResolveActivity".equalsIgnoreCase(methodCall.method)) {
                result.success(Boolean.valueOf(this.f17875a.b(intentA)));
            } else if ("getResolvedActivity".equalsIgnoreCase(methodCall.method)) {
                result.success(this.f17875a.c(intentA));
            } else {
                result.notImplemented();
            }
        } catch (Throwable th) {
            result.error("error", th.getMessage(), null);
        }
    }
}
