package o4;

import D4.d;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import fc.C4015H;
import gc.Q;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.ProfilingTraceData;
import io.sentry.SentryBaseEvent;
import io.sentry.TraceContext;
import io.sentry.clientreport.DiscardedEvent;
import io.sentry.protocol.App;
import io.sentry.protocol.FeatureFlag;
import io.sentry.protocol.Geo;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import q4.C5485a;
import q4.C5488d;
import q4.C5490f;
import q4.C5497m;
import r4.C5530a;
import r4.C5531b;
import vc.l;
import z4.C6510i;

/* JADX INFO: renamed from: o4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u0003:\u0001,B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010!J#\u0010'\u001a\u00020&2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b*\u0010+R\"\u0010.\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00180\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00101R\"\u00109\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010:R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010=¨\u0006?"}, d2 = {"Lo4/b;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "binding", "Lfc/H;", "onAttachedToActivity", "(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "Lq4/a;", "amplitude", "", "appLifecycles", "deepLinks", "g", "(Lq4/a;ZZ)V", "Lq4/d;", "c", "(Lio/flutter/plugin/common/MethodCall;)Lq4/d;", "", "", "", "map", "Lq4/m;", "b", "(Ljava/util/Map;)Lq4/m;", "LE4/a;", "e", "(Lio/flutter/plugin/common/MethodCall;)LE4/a;", "a", "Ljava/util/Map;", "instances", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "Ljava/lang/ref/WeakReference;", "activity", "Landroid/content/Context;", "Landroid/content/Context;", "d", "()Landroid/content/Context;", "f", "(Landroid/content/Context;)V", "ctxt", "Z", "appOpenedTracked", "Lio/flutter/plugin/common/MethodChannel;", "Lio/flutter/plugin/common/MethodChannel;", "channel", "amplitude_flutter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C5205b implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Map instances = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public WeakReference activity = new WeakReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Context ctxt;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean appOpenedTracked;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public MethodChannel channel;

    public static final C4015H h(C5485a c5485a, boolean z10, C5205b c5205b, boolean z11, Throwable th) throws PackageManager.NameNotFoundException {
        Activity activity;
        Activity activity2;
        if (th != null) {
            System.out.println((Object) ("isBuilt computation failed with exception: " + th));
        } else {
            C6510i c6510i = new C6510i(c5485a);
            if (z10 && !c5205b.appOpenedTracked && (activity2 = (Activity) c5205b.activity.get()) != null) {
                PackageInfo packageInfo = activity2.getPackageManager().getPackageInfo(activity2.getPackageName(), 0);
                AbstractC4862t.b(packageInfo);
                c6510i.i(packageInfo, true);
                c5205b.appOpenedTracked = true;
            }
            if (z11 && (activity = (Activity) c5205b.activity.get()) != null) {
                c6510i.k(activity);
            }
        }
        return C4015H.f34254a;
    }

    public final C5497m b(Map map) {
        C5497m c5497m = new C5497m();
        Object obj = map.get("ipAddress");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null && !bool.booleanValue()) {
            c5497m.m();
        }
        Object obj2 = map.get("language");
        Boolean bool2 = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        if (bool2 != null && !bool2.booleanValue()) {
            c5497m.n();
        }
        Object obj3 = map.get("platform");
        Boolean bool3 = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        if (bool3 != null && !bool3.booleanValue()) {
            c5497m.r();
        }
        Object obj4 = map.get(Geo.JsonKeys.REGION);
        Boolean bool4 = obj4 instanceof Boolean ? (Boolean) obj4 : null;
        if (bool4 != null && !bool4.booleanValue()) {
            c5497m.s();
        }
        Object obj5 = map.get("dma");
        Boolean bool5 = obj5 instanceof Boolean ? (Boolean) obj5 : null;
        if (bool5 != null && !bool5.booleanValue()) {
            c5497m.l();
        }
        Object obj6 = map.get("country");
        Boolean bool6 = obj6 instanceof Boolean ? (Boolean) obj6 : null;
        if (bool6 != null && !bool6.booleanValue()) {
            c5497m.h();
        }
        Object obj7 = map.get(Geo.JsonKeys.CITY);
        Boolean bool7 = obj7 instanceof Boolean ? (Boolean) obj7 : null;
        if (bool7 != null && !bool7.booleanValue()) {
            c5497m.g();
        }
        Object obj8 = map.get("carrier");
        Boolean bool8 = obj8 instanceof Boolean ? (Boolean) obj8 : null;
        if (bool8 != null && !bool8.booleanValue()) {
            c5497m.f();
        }
        Object obj9 = map.get("deviceModel");
        Boolean bool9 = obj9 instanceof Boolean ? (Boolean) obj9 : null;
        if (bool9 != null && !bool9.booleanValue()) {
            c5497m.k();
        }
        Object obj10 = map.get("deviceManufacturer");
        Boolean bool10 = obj10 instanceof Boolean ? (Boolean) obj10 : null;
        if (bool10 != null && !bool10.booleanValue()) {
            c5497m.j();
        }
        Object obj11 = map.get("osVersion");
        Boolean bool11 = obj11 instanceof Boolean ? (Boolean) obj11 : null;
        if (bool11 != null && !bool11.booleanValue()) {
            c5497m.q();
        }
        Object obj12 = map.get("osName");
        Boolean bool12 = obj12 instanceof Boolean ? (Boolean) obj12 : null;
        if (bool12 != null && !bool12.booleanValue()) {
            c5497m.p();
        }
        Object obj13 = map.get("versionName");
        Boolean bool13 = obj13 instanceof Boolean ? (Boolean) obj13 : null;
        if (bool13 != null && !bool13.booleanValue()) {
            c5497m.u();
        }
        Object obj14 = map.get("adid");
        Boolean bool14 = obj14 instanceof Boolean ? (Boolean) obj14 : null;
        if (bool14 != null && !bool14.booleanValue()) {
            c5497m.c();
        }
        Object obj15 = map.get("appSetId");
        Boolean bool15 = obj15 instanceof Boolean ? (Boolean) obj15 : null;
        if (bool15 != null && !bool15.booleanValue()) {
            c5497m.e();
        }
        Object obj16 = map.get("deviceBrand");
        Boolean bool16 = obj16 instanceof Boolean ? (Boolean) obj16 : null;
        if (bool16 != null && !bool16.booleanValue()) {
            c5497m.i();
        }
        Object obj17 = map.get("latLng");
        Boolean bool17 = obj17 instanceof Boolean ? (Boolean) obj17 : null;
        if (bool17 != null && !bool17.booleanValue()) {
            c5497m.o();
        }
        Object obj18 = map.get("apiLevel");
        Boolean bool18 = obj18 instanceof Boolean ? (Boolean) obj18 : null;
        if (bool18 != null && !bool18.booleanValue()) {
            c5497m.d();
        }
        return c5497m;
    }

    public final C5488d c(MethodCall call) {
        Object objArgument = call.argument("apiKey");
        AbstractC4862t.b(objArgument);
        C5488d c5488d = new C5488d((String) objArgument, d(), 0, 0, null, false, null, null, null, null, null, 0, false, null, null, null, null, false, false, false, null, false, false, false, 0L, null, 0L, null, null, false, null, null, null, null, null, -4, 7, null);
        Integer num = (Integer) call.argument("flushQueueSize");
        if (num != null) {
            c5488d.W(num.intValue());
        }
        Integer num2 = (Integer) call.argument("flushIntervalMillis");
        if (num2 != null) {
            c5488d.U(num2.intValue());
        }
        String str = (String) call.argument("instanceName");
        if (str != null) {
            c5488d.Y(str);
        }
        Boolean bool = (Boolean) call.argument("optOut");
        if (bool != null) {
            c5488d.d0(bool.booleanValue());
        }
        Integer num3 = (Integer) call.argument("minIdLength");
        if (num3 != null) {
            c5488d.b0(Integer.valueOf(num3.intValue()));
        }
        String str2 = (String) call.argument("partnerId");
        if (str2 != null) {
            c5488d.e0(str2);
        }
        Integer num4 = (Integer) call.argument("flushMaxRetries");
        if (num4 != null) {
            c5488d.V(num4.intValue());
        }
        Boolean bool2 = (Boolean) call.argument("useBatch");
        if (bool2 != null) {
            c5488d.k0(bool2.booleanValue());
        }
        String str3 = (String) call.argument("serverZone");
        if (str3 != null) {
            String upperCase = str3.toUpperCase(Locale.ROOT);
            AbstractC4862t.d(upperCase, "toUpperCase(...)");
            c5488d.g0(d.valueOf(upperCase));
        }
        String str4 = (String) call.argument("serverUrl");
        if (str4 != null) {
            c5488d.f0(str4);
        }
        if (((Integer) call.argument("minTimeBetweenSessionsMillis")) != null) {
            c5488d.c0(r2.intValue());
        }
        Map map = (Map) call.argument("defaultTracking");
        if (map != null) {
            Object obj = map.get("sessions");
            Boolean bool3 = obj instanceof Boolean ? (Boolean) obj : null;
            boolean zBooleanValue = bool3 != null ? bool3.booleanValue() : true;
            Object obj2 = map.get("appLifecycles");
            Boolean bool4 = obj2 instanceof Boolean ? (Boolean) obj2 : null;
            boolean zBooleanValue2 = bool4 != null ? bool4.booleanValue() : false;
            Object obj3 = map.get("deepLinks");
            Boolean bool5 = obj3 instanceof Boolean ? (Boolean) obj3 : null;
            c5488d.Q(new C5490f(zBooleanValue, zBooleanValue2, bool5 != null ? bool5.booleanValue() : false, false));
        }
        Map map2 = (Map) call.argument("trackingOptions");
        if (map2 != null) {
            c5488d.h0(b(map2));
        }
        Boolean bool6 = (Boolean) call.argument("enableCoppaControl");
        if (bool6 != null) {
            c5488d.S(bool6.booleanValue());
        }
        Boolean bool7 = (Boolean) call.argument("flushEventsOnClose");
        if (bool7 != null) {
            c5488d.T(bool7.booleanValue());
        }
        if (((Integer) call.argument("identifyBatchIntervalMillis")) != null) {
            c5488d.X(r2.intValue());
        }
        Boolean bool8 = (Boolean) call.argument("migrateLegacyData");
        if (bool8 != null) {
            c5488d.a0(bool8.booleanValue());
        }
        Boolean bool9 = (Boolean) call.argument("locationListening");
        if (bool9 != null) {
            c5488d.Z(bool9.booleanValue());
        }
        Boolean bool10 = (Boolean) call.argument("useAdvertisingIdForDeviceId");
        if (bool10 != null) {
            c5488d.i0(bool10.booleanValue());
        }
        Boolean bool11 = (Boolean) call.argument("useAppSetIdForDeviceId");
        if (bool11 != null) {
            c5488d.j0(bool11.booleanValue());
        }
        String str5 = (String) call.argument("deviceId");
        if (str5 != null) {
            c5488d.R(str5);
        }
        return c5488d;
    }

    public final Context d() {
        Context context = this.ctxt;
        if (context != null) {
            return context;
        }
        AbstractC4862t.p("ctxt");
        return null;
    }

    public final E4.a e(MethodCall call) {
        Object objArgument = call.argument("event");
        AbstractC4862t.b(objArgument);
        Map map = (Map) objArgument;
        E4.a aVar = new E4.a();
        Object obj = map.get("event_type");
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.String");
        aVar.M0((String) obj);
        Object obj2 = map.get("event_properties");
        Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
        if (map2 != null) {
            aVar.L0(Q.w(map2));
        }
        Object obj3 = map.get("user_properties");
        Map map3 = obj3 instanceof Map ? (Map) obj3 : null;
        if (map3 != null) {
            aVar.P0(Q.w(map3));
        }
        Object obj4 = map.get("groups");
        Map map4 = obj4 instanceof Map ? (Map) obj4 : null;
        if (map4 != null) {
            aVar.O0(Q.w(map4));
        }
        Object obj5 = map.get("group_properties");
        Map map5 = obj5 instanceof Map ? (Map) obj5 : null;
        if (map5 != null) {
            aVar.N0(Q.w(map5));
        }
        Object obj6 = map.get(TraceContext.JsonKeys.USER_ID);
        String str = obj6 instanceof String ? (String) obj6 : null;
        if (str != null) {
            aVar.C0(str);
        }
        Object obj7 = map.get("device_id");
        String str2 = obj7 instanceof String ? (String) obj7 : null;
        if (str2 != null) {
            aVar.a0(str2);
        }
        Object obj8 = map.get("timestamp");
        if ((obj8 instanceof Integer ? (Integer) obj8 : null) != null) {
            aVar.B0(Long.valueOf(r0.intValue()));
        }
        Object obj9 = map.get("event_id");
        if ((obj9 instanceof Integer ? (Integer) obj9 : null) != null) {
            aVar.e0(Long.valueOf(r0.intValue()));
        }
        Object obj10 = map.get("session_id");
        if ((obj10 instanceof Integer ? (Integer) obj10 : null) != null) {
            aVar.A0(Long.valueOf(r0.intValue()));
        }
        Object obj11 = map.get("insert_id");
        String str3 = obj11 instanceof String ? (String) obj11 : null;
        if (str3 != null) {
            aVar.j0(str3);
        }
        Object obj12 = map.get("location_lat");
        Double d10 = obj12 instanceof Double ? (Double) obj12 : null;
        if (d10 != null) {
            aVar.n0(Double.valueOf(d10.doubleValue()));
        }
        Object obj13 = map.get("location_lng");
        Double d11 = obj13 instanceof Double ? (Double) obj13 : null;
        if (d11 != null) {
            aVar.o0(Double.valueOf(d11.doubleValue()));
        }
        Object obj14 = map.get(App.JsonKeys.APP_VERSION);
        String str4 = obj14 instanceof String ? (String) obj14 : null;
        if (str4 != null) {
            aVar.S(str4);
        }
        Object obj15 = map.get(ProfilingTraceData.JsonKeys.RELEASE);
        String str5 = obj15 instanceof String ? (String) obj15 : null;
        if (str5 != null) {
            aVar.D0(str5);
        }
        Object obj16 = map.get("platform");
        String str6 = obj16 instanceof String ? (String) obj16 : null;
        if (str6 != null) {
            aVar.t0(str6);
        }
        Object obj17 = map.get("os_name");
        String str7 = obj17 instanceof String ? (String) obj17 : null;
        if (str7 != null) {
            aVar.p0(str7);
        }
        Object obj18 = map.get("os_version");
        String str8 = obj18 instanceof String ? (String) obj18 : null;
        if (str8 != null) {
            aVar.q0(str8);
        }
        Object obj19 = map.get("device_brand");
        String str9 = obj19 instanceof String ? (String) obj19 : null;
        if (str9 != null) {
            aVar.Z(str9);
        }
        Object obj20 = map.get(ProfilingTraceData.JsonKeys.DEVICE_MANUFACTURER);
        String str10 = obj20 instanceof String ? (String) obj20 : null;
        if (str10 != null) {
            aVar.b0(str10);
        }
        Object obj21 = map.get(ProfilingTraceData.JsonKeys.DEVICE_MODEL);
        String str11 = obj21 instanceof String ? (String) obj21 : null;
        if (str11 != null) {
            aVar.c0(str11);
        }
        Object obj22 = map.get("carrier");
        String str12 = obj22 instanceof String ? (String) obj22 : null;
        if (str12 != null) {
            aVar.V(str12);
        }
        Object obj23 = map.get("country");
        String str13 = obj23 instanceof String ? (String) obj23 : null;
        if (str13 != null) {
            aVar.X(str13);
        }
        Object obj24 = map.get(Geo.JsonKeys.REGION);
        String str14 = obj24 instanceof String ? (String) obj24 : null;
        if (str14 != null) {
            aVar.x0(str14);
        }
        Object obj25 = map.get(Geo.JsonKeys.CITY);
        String str15 = obj25 instanceof String ? (String) obj25 : null;
        if (str15 != null) {
            aVar.W(str15);
        }
        Object obj26 = map.get("dma");
        String str16 = obj26 instanceof String ? (String) obj26 : null;
        if (str16 != null) {
            aVar.d0(str16);
        }
        Object obj27 = map.get("idfa");
        String str17 = obj27 instanceof String ? (String) obj27 : null;
        if (str17 != null) {
            aVar.g0(str17);
        }
        Object obj28 = map.get("idfv");
        String str18 = obj28 instanceof String ? (String) obj28 : null;
        if (str18 != null) {
            aVar.h0(str18);
        }
        Object obj29 = map.get("adid");
        String str19 = obj29 instanceof String ? (String) obj29 : null;
        if (str19 != null) {
            aVar.P(str19);
        }
        Object obj30 = map.get("app_set_id");
        String str20 = obj30 instanceof String ? (String) obj30 : null;
        if (str20 != null) {
            aVar.R(str20);
        }
        Object obj31 = map.get("android_id");
        String str21 = obj31 instanceof String ? (String) obj31 : null;
        if (str21 != null) {
            aVar.Q(str21);
        }
        Object obj32 = map.get("language");
        String str22 = obj32 instanceof String ? (String) obj32 : null;
        if (str22 != null) {
            aVar.l0(str22);
        }
        Object obj33 = map.get("library");
        String str23 = obj33 instanceof String ? (String) obj33 : null;
        if (str23 != null) {
            aVar.m0(str23);
        }
        Object obj34 = map.get("ip");
        String str24 = obj34 instanceof String ? (String) obj34 : null;
        if (str24 != null) {
            aVar.k0(str24);
        }
        Object obj35 = map.get("plan");
        Map map6 = obj35 instanceof Map ? (Map) obj35 : null;
        if (map6 != null) {
            Object obj36 = map6.get("branch");
            String str25 = obj36 instanceof String ? (String) obj36 : null;
            Object obj37 = map6.get("source");
            String str26 = obj37 instanceof String ? (String) obj37 : null;
            Object obj38 = map6.get("version");
            String str27 = obj38 instanceof String ? (String) obj38 : null;
            Object obj39 = map6.get("versionId");
            aVar.s0(new C5531b(str25, str26, str27, obj39 instanceof String ? (String) obj39 : null));
        }
        Object obj40 = map.get("ingestion_metadata");
        Map map7 = obj40 instanceof Map ? (Map) obj40 : null;
        if (map7 != null) {
            Object obj41 = map7.get("sourceName");
            String str28 = obj41 instanceof String ? (String) obj41 : null;
            Object obj42 = map7.get("sourceVersion");
            aVar.i0(new C5530a(str28, obj42 instanceof String ? (String) obj42 : null));
        }
        Object obj43 = map.get("revenue");
        Double d12 = obj43 instanceof Double ? (Double) obj43 : null;
        if (d12 != null) {
            aVar.y0(Double.valueOf(d12.doubleValue()));
        }
        Object obj44 = map.get("price");
        Double d13 = obj44 instanceof Double ? (Double) obj44 : null;
        if (d13 != null) {
            aVar.u0(Double.valueOf(d13.doubleValue()));
        }
        Object obj45 = map.get(DiscardedEvent.JsonKeys.QUANTITY);
        Integer num = obj45 instanceof Integer ? (Integer) obj45 : null;
        if (num != null) {
            aVar.w0(Integer.valueOf(num.intValue()));
        }
        Object obj46 = map.get("product_id");
        String str29 = obj46 instanceof String ? (String) obj46 : null;
        if (str29 != null) {
            aVar.v0(str29);
        }
        Object obj47 = map.get("revenue_type");
        String str30 = obj47 instanceof String ? (String) obj47 : null;
        if (str30 != null) {
            aVar.z0(str30);
        }
        Object obj48 = map.get("currency");
        String str31 = obj48 instanceof String ? (String) obj48 : null;
        if (str31 != null) {
            aVar.Y(str31);
        }
        Object obj49 = map.get(SentryBaseEvent.JsonKeys.EXTRA);
        Map map8 = obj49 instanceof Map ? (Map) obj49 : null;
        if (map8 != null) {
            aVar.f0(map8);
        }
        Object obj50 = map.get("partner_id");
        String str32 = obj50 instanceof String ? (String) obj50 : null;
        if (str32 != null) {
            aVar.r0(str32);
        }
        return aVar;
    }

    public final void f(Context context) {
        AbstractC4862t.e(context, "<set-?>");
        this.ctxt = context;
    }

    public final void g(final C5485a amplitude, final boolean appLifecycles, final boolean deepLinks) {
        amplitude.z().u(new l() { // from class: o4.a
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C5205b.h(amplitude, appLifecycles, this, deepLinks, (Throwable) obj);
            }
        });
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.activity = new WeakReference(binding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        Context applicationContext = binding.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        f(applicationContext);
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "amplitude_flutter");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.activity = new WeakReference(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.activity = new WeakReference(null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            AbstractC4862t.p("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c5, code lost:
    
        if (r0.equals("groupIdentify") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        if (r0.equals("setGroup") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d9, code lost:
    
        if (r0.equals("revenue") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0177, code lost:
    
        if (r0.equals("track") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b9, code lost:
    
        if (r0.equals("identify") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01bd, code lost:
    
        D4.a.G(r2, e(r9), null, null, 6, null);
        r2.r().a("Track " + r9.method + " event: " + r9.arguments);
        r8 = new java.lang.StringBuilder();
        r8.append(r9.method);
        r8.append(" called..");
        r10.success(r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0202, code lost:
    
        return;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r9, io.flutter.plugin.common.MethodChannel.Result r10) {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.C5205b.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.activity = new WeakReference(binding.getActivity());
    }
}
