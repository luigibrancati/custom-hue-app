package com.bbflight.background_downloader;

import I3.C0874d;
import I3.M;
import I3.x;
import Q4.C1899t;
import Q4.C1904y;
import Q4.C1905z;
import Q4.NotificationConfig;
import Q4.P;
import Q4.Q;
import Q4.ResumeData;
import Q4.Task;
import Q4.Y;
import Q4.g0;
import Q4.u0;
import Q4.v0;
import Rd.AbstractC2128g;
import Rd.AbstractC2132i;
import Rd.C2123d0;
import Rd.InterfaceC2157v;
import Rd.U0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.NotificationManagerCompat;
import com.bbflight.background_downloader.TaskWorker;
import com.bbflight.background_downloader.i;
import fc.AbstractC4036s;
import fc.AbstractC4040w;
import fc.C4015H;
import gc.C4206t;
import gc.C4207u;
import he.AbstractC4304b;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.sentry.protocol.App;
import io.sentry.protocol.FeatureFlag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.T;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import nc.AbstractC5160d;
import oc.InterfaceC5276a;
import org.apache.tika.metadata.HttpHeaders;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0084\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001iB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0010\u0010\fJ\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0012\u0010\fJ\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0013\u0010\fJ\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0015\u0010\fJ\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0016\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u001b\u0010\fJ\u0010\u0010\u001c\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b#\u0010\fJ\u001a\u0010$\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b$\u0010\fJ\u0017\u0010%\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010\u0018J\u0018\u0010&\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b&\u0010\fJ\u0010\u0010'\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b'\u0010\u001dJ\u001a\u0010(\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b(\u0010\fJ\u001a\u0010)\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b)\u0010\fJ\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b,\u0010\u0018J\u0017\u0010-\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010\u0018J\u000f\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b/\u00100J\u001a\u00101\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b1\u0010\fJ\u001a\u00102\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b2\u0010\fJ\u001a\u00103\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b3\u0010\fJ\u001a\u00104\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b4\u0010\fJ\u001a\u00105\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b5\u0010\fJ\u0012\u00106\u001a\u0004\u0018\u00010\u0014H\u0082@¢\u0006\u0004\b6\u0010\u001dJ\u001a\u00107\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b7\u0010\fJ\u001a\u00108\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b8\u0010\fJ\u001a\u00109\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b9\u0010\fJ\u0019\u0010:\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0011H\u0002¢\u0006\u0004\b<\u0010=J\u0019\u0010>\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b>\u0010;J\u0017\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b?\u0010@J!\u0010D\u001a\u00020C2\u0006\u0010A\u001a\u00020\u00112\b\u0010B\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\bD\u0010EJ\u001a\u0010F\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\bF\u0010\fJ\u0019\u0010I\u001a\u00020\n2\b\u0010H\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020C2\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020CH\u0002¢\u0006\u0004\bO\u0010\u0007J\u0017\u0010R\u001a\u00020C2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020C2\u0006\u0010L\u001a\u00020PH\u0016¢\u0006\u0004\bT\u0010SJ\u001f\u0010W\u001a\u00020C2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020C2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bY\u0010NJ\u000f\u0010Z\u001a\u00020CH\u0016¢\u0006\u0004\bZ\u0010\u0007J\u0017\u0010[\u001a\u00020C2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\b[\u0010NJ\u000f\u0010\\\u001a\u00020CH\u0016¢\u0006\u0004\b\\\u0010\u0007J/\u0010b\u001a\u00020\n2\u0006\u0010]\u001a\u00020\u000f2\u000e\u0010_\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110^2\u0006\u0010a\u001a\u00020`H\u0016¢\u0006\u0004\bb\u0010cJ)\u0010f\u001a\u00020\n2\u0006\u0010]\u001a\u00020\u000f2\u0006\u0010d\u001a\u00020\u000f2\b\u0010e\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bf\u0010gR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010m\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010jR\u0016\u0010q\u001a\u00020n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010u\u001a\u00020r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010w\u001a\u00020r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bv\u0010tR\u0018\u0010{\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR(\u0010\u0083\u0001\u001a\u0004\u0018\u00010|8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0085\u0001"}, d2 = {"Lcom/bbflight/background_downloader/a;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;", "Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;", "<init>", "()V", "Lio/flutter/plugin/common/MethodCall;", "call", "", "D0", "(Lio/flutter/plugin/common/MethodCall;Llc/e;)Ljava/lang/Object;", "", "E0", "", "W0", "", "r0", "s0", "", "I0", "Y0", "M0", "(Lio/flutter/plugin/common/MethodCall;)Z", "N0", "(Lio/flutter/plugin/common/MethodCall;)Ljava/util/List;", "c1", "R0", "(Llc/e;)Ljava/lang/Object;", "S0", "Q0", "prefsKey", "d1", "(Ljava/lang/String;)Ljava/lang/String;", "J0", "L0", "K0", "V0", "G0", "b1", "a1", "O0", "(Lio/flutter/plugin/common/MethodCall;)I", "U0", "X0", "", "H0", "()J", "T0", "v0", "x0", "y0", "z0", "t0", "u0", "B0", "C0", "w0", "(Lio/flutter/plugin/common/MethodCall;)Ljava/lang/Object;", "P0", "()Ljava/lang/String;", "F0", "Z0", "(Lio/flutter/plugin/common/MethodCall;)Ljava/lang/String;", "key", "value", "Lfc/H;", "e1", "(Ljava/lang/String;Ljava/lang/Integer;)V", "A0", "Landroid/content/Intent;", "intent", "q0", "(Landroid/content/Intent;)Z", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "binding", "m0", "(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "o0", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "onAttachedToActivity", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "requestCode", "", App.JsonKeys.APP_PERMISSIONS, "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)Z", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)Z", "Lio/flutter/plugin/common/MethodChannel;", "a", "Lio/flutter/plugin/common/MethodChannel;", "channel", "b", "backgroundChannel", "Landroid/content/Context;", "c", "Landroid/content/Context;", "applicationContext", "LRd/M;", "d", "LRd/M;", "mainScope", "e", "defaultScope", "Lio/flutter/plugin/common/BinaryMessenger;", "f", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Landroid/app/Activity;", "g", "Landroid/app/Activity;", "p0", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "activity", "h", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware, PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static MethodChannel f26711j;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f26723v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static boolean f26726y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static f f26727z;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public MethodChannel channel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public MethodChannel backgroundChannel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Context applicationContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public Rd.M mainScope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Rd.M defaultScope;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public BinaryMessenger binaryMessenger;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Activity activity;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Map f26710i = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Map f26712k = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Map f26713l = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Q4.N f26714m = Q4.N.asSetByTask;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Map f26715n = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Map f26716o = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Set f26717p = Collections.synchronizedSet(new LinkedHashSet());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Set f26718q = Collections.synchronizedSet(new LinkedHashSet());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Map f26719r = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Set f26720s = Collections.synchronizedSet(new LinkedHashSet());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Set f26721t = Collections.synchronizedSet(new LinkedHashSet());

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Map f26722u = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ReentrantReadWriteLock f26724w = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Map f26725x = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class A extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26735j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f26737l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(String str, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26737l = str;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new A(this.f26737l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((A) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f26735j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            M.a aVar = I3.M.f5571a;
            Context context = a.this.applicationContext;
            if (context == null) {
                AbstractC4862t.p("applicationContext");
                context = null;
            }
            I3.y yVarA = aVar.a(context).a("taskId=" + this.f26737l);
            try {
                return yVarA.a().get();
            } catch (Throwable unused) {
                return AbstractC5158b.c(Log.w("BackgroundDownloader", "Could not kill task wih id " + this.f26737l + " in operation: " + yVarA));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class B extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26738j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f26739k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f26740l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f26741m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f26742n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f26743o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f26744p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f26745q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26746r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a f26747s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(MethodCall methodCall, a aVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26746r = methodCall;
            this.f26747s = aVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new B(this.f26746r, this.f26747s, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((B) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Context context;
            Object objF = C5046c.f();
            int i10 = this.f26745q;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                Object obj2 = this.f26746r.arguments;
                AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                Object obj3 = list.get(0);
                AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj3;
                InterfaceC5276a interfaceC5276aB = P.b();
                Object obj4 = list.get(1);
                AbstractC4862t.c(obj4, "null cannot be cast to non-null type kotlin.Int");
                P p10 = (P) interfaceC5276aB.get(((Integer) obj4).intValue());
                Object obj5 = list.get(2);
                AbstractC4862t.c(obj5, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) obj5;
                String str3 = (String) list.get(3);
                Object obj6 = list.get(4);
                AbstractC4862t.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                i.a aVar = i.f27255a;
                Context context2 = this.f26747s.applicationContext;
                if (context2 == null) {
                    AbstractC4862t.p("applicationContext");
                    context2 = null;
                }
                Q4.I iA = aVar.a(context2, Q4.J.androidSharedStorage);
                if (iA != Q4.I.granted) {
                    Log.i("BackgroundDownloader", "No permission to move to shared storage");
                    return null;
                }
                Context context3 = this.f26747s.applicationContext;
                if (context3 == null) {
                    AbstractC4862t.p("applicationContext");
                    context = null;
                } else {
                    context = context3;
                }
                this.f26738j = nc.l.a(list);
                this.f26739k = nc.l.a(str);
                this.f26740l = nc.l.a(p10);
                this.f26741m = nc.l.a(str2);
                this.f26742n = nc.l.a(str3);
                this.f26743o = nc.l.a(iA);
                this.f26744p = zBooleanValue;
                this.f26745q = 1;
                obj = Q.d(context, str, p10, str2, str3, zBooleanValue, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return (String) obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26748j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f26750l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ P f26751m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f26752n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f26753o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(String str, P p10, String str2, boolean z10, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26750l = str;
            this.f26751m = p10;
            this.f26752n = str2;
            this.f26753o = z10;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new C(this.f26750l, this.f26751m, this.f26752n, this.f26753o, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((C) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f26748j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            Context context = a.this.applicationContext;
            if (context == null) {
                AbstractC4862t.p("applicationContext");
                context = null;
            }
            return Q.f(context, this.f26750l, this.f26751m, this.f26752n, this.f26753o);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class D extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26754j;

        public D(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new D(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((D) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f26754j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            return a.this.d1("com.bbflight.background_downloader.progressUpdateMap.v2");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class E extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26756j;

        public E(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new E(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((E) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f26756j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            return a.this.d1("com.bbflight.background_downloader.resumeDataMap.v2");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class F extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26758j;

        public F(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new F(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((F) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f26758j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            return a.this.d1("com.bbflight.background_downloader.statusUpdateMap.v2");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class G extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26760j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f26761k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f26763m;

        public G(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f26761k = obj;
            this.f26763m |= Integer.MIN_VALUE;
            return a.this.T0(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class H extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26764j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26766l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public H(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26766l = methodCall;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new H(this.f26766l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((H) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f26764j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            Context context = a.this.applicationContext;
            if (context == null) {
                AbstractC4862t.p("applicationContext");
                context = null;
            }
            SharedPreferences.Editor editorEdit = T2.b.a(context).edit();
            Long l10 = (Long) this.f26766l.arguments;
            if (l10 != null) {
                Log.d("BackgroundDownloader", "Registering callbackDispatcher handle " + l10);
                editorEdit.putLong("com.bbflight.background_downloader.callbackDispatcherRawHandle", l10.longValue());
            } else {
                editorEdit.remove("com.bbflight.background_downloader.config.proxyAddress");
            }
            editorEdit.apply();
            return editorEdit;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class I extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26767j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f26768k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f26769l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f26770m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26771n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ a f26772o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I(MethodCall methodCall, a aVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26771n = methodCall;
            this.f26772o = aVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new I(this.f26771n, this.f26772o, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((I) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f26770m;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                Object obj2 = this.f26771n.arguments;
                AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                InterfaceC5276a interfaceC5276aB = Q4.N.b();
                Object obj3 = list.get(0);
                AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Int");
                Q4.N n10 = (Q4.N) interfaceC5276aB.get(((Integer) obj3).intValue());
                Object obj4 = list.get(1);
                AbstractC4862t.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                v0 v0Var = v0.f13901a;
                Context context = this.f26772o.applicationContext;
                if (context == null) {
                    AbstractC4862t.p("applicationContext");
                    context = null;
                }
                k kVar = new k(context, n10, zBooleanValue);
                this.f26767j = nc.l.a(list);
                this.f26768k = nc.l.a(n10);
                this.f26769l = zBooleanValue;
                this.f26770m = 1;
                if (v0Var.e(kVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return AbstractC5158b.a(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class J extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26773j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f26774k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f26775l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f26776m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f26777n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f26778o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f26779p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f26780q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f26781r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f26782s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26783t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f26784u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f26785v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26786w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ a f26787x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public J(MethodCall methodCall, a aVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26786w = methodCall;
            this.f26787x = aVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new J(this.f26786w, this.f26787x, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((J) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:109|(1:152)|110|(1:112)|115|154|118|(1:120)|121|(3:124|(1:126)|127)(1:123)|128|129|168|(1:91)) */
        /* JADX WARN: Can't wrap try/catch for region: R(9:166|97|(2:99|100)(1:103)|104|105|156|106|(14:109|152|110|(1:112)|115|154|118|(1:120)|121|(3:124|(1:126)|127)(1:123)|128|129|168|(1:91))|114) */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x041c, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x04c0, code lost:
        
            if (r2.A(r0, r29) == r14) goto L114;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x054b, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:131:0x054c, code lost:
        
            r12 = r3;
            r2 = r20;
            r4 = r9;
            r3 = r24;
            r1 = r27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:165:0x0376, code lost:
        
            r20 = r1;
            r17 = r15;
            r15 = 1;
            r6 = r6;
            r1 = r17;
            r5 = r5;
            r7 = r7;
            r8 = r8;
            r0 = r0;
            r4 = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x017e, code lost:
        
            if (r4 == r14) goto L114;
         */
        /* JADX WARN: Path cross not found for [B:27:0x0162, B:24:0x0155], limit reached: 173 */
        /* JADX WARN: Removed duplicated region for block: B:112:0x048d A[Catch: Exception -> 0x04ce, TRY_LEAVE, TryCatch #1 {Exception -> 0x04ce, blocks: (B:110:0x0485, B:112:0x048d), top: B:152:0x0485 }] */
        /* JADX WARN: Removed duplicated region for block: B:120:0x04ed A[Catch: Exception -> 0x041c, TryCatch #2 {Exception -> 0x041c, blocks: (B:118:0x04db, B:120:0x04ed, B:121:0x04f1, B:123:0x04f9, B:128:0x0540, B:99:0x0417, B:124:0x0505, B:126:0x050b, B:127:0x050f), top: B:154:0x04db }] */
        /* JADX WARN: Removed duplicated region for block: B:123:0x04f9 A[Catch: Exception -> 0x041c, TryCatch #2 {Exception -> 0x041c, blocks: (B:118:0x04db, B:120:0x04ed, B:121:0x04f1, B:123:0x04f9, B:128:0x0540, B:99:0x0417, B:124:0x0505, B:126:0x050b, B:127:0x050f), top: B:154:0x04db }] */
        /* JADX WARN: Removed duplicated region for block: B:124:0x0505 A[Catch: Exception -> 0x041c, TryCatch #2 {Exception -> 0x041c, blocks: (B:118:0x04db, B:120:0x04ed, B:121:0x04f1, B:123:0x04f9, B:128:0x0540, B:99:0x0417, B:124:0x0505, B:126:0x050b, B:127:0x050f), top: B:154:0x04db }] */
        /* JADX WARN: Removed duplicated region for block: B:142:0x05ac  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0189  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0197  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x022b  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0311  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x034f  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0357  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0386  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x03cc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x048b -> B:115:0x04c3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x04c0 -> B:115:0x04c3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x056f -> B:91:0x03c6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0342 -> B:80:0x0345). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x034f -> B:83:0x0376). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1518
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.J.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class K extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26788j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f26789k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26790l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f26791m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public K(MethodCall methodCall, a aVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26790l = methodCall;
            this.f26791m = aVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new K(this.f26790l, this.f26791m, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((K) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c6 A[RETURN] */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = mc.C5046c.f()
                int r1 = r5.f26789k
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r5.f26788j
                java.lang.String r0 = (java.lang.String) r0
                fc.AbstractC4036s.b(r6)
                goto L5a
            L14:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1c:
                fc.AbstractC4036s.b(r6)
                io.flutter.plugin.common.MethodCall r6 = r5.f26790l
                java.lang.Object r6 = r6.arguments
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
                kotlin.jvm.internal.AbstractC4862t.c(r6, r1)
                java.lang.String r6 = (java.lang.String) r6
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "Returning task for taskId "
                r1.append(r4)
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                java.lang.String r4 = "BackgroundDownloader"
                android.util.Log.v(r4, r1)
                com.bbflight.background_downloader.a$a r1 = com.bbflight.background_downloader.a.INSTANCE
                com.bbflight.background_downloader.f r1 = r1.p()
                if (r1 == 0) goto L5b
                ae.a r1 = r1.w()
                if (r1 == 0) goto L5b
                r5.f26788j = r6
                r5.f26789k = r2
                java.lang.Object r1 = ae.InterfaceC2687a.C0267a.a(r1, r3, r5, r2, r3)
                if (r1 != r0) goto L59
                return r0
            L59:
                r0 = r6
            L5a:
                r6 = r0
            L5b:
                com.bbflight.background_downloader.a$a r0 = com.bbflight.background_downloader.a.INSTANCE
                com.bbflight.background_downloader.f r1 = r0.p()
                if (r1 == 0) goto L68
                Q4.X r1 = r1.B(r6)
                goto L69
            L68:
                r1 = r3
            L69:
                if (r1 != 0) goto La1
                java.util.concurrent.locks.ReentrantReadWriteLock r1 = r0.v()
                com.bbflight.background_downloader.a r5 = r5.f26791m
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
                r1.lock()
                android.content.Context r5 = com.bbflight.background_downloader.a.b(r5)     // Catch: java.lang.Throwable -> L85
                if (r5 != 0) goto L87
                java.lang.String r5 = "applicationContext"
                kotlin.jvm.internal.AbstractC4862t.p(r5)     // Catch: java.lang.Throwable -> L85
                r5 = r3
                goto L87
            L85:
                r5 = move-exception
                goto L9d
            L87:
                android.content.SharedPreferences r5 = T2.b.a(r5)     // Catch: java.lang.Throwable -> L85
                kotlin.jvm.internal.AbstractC4862t.b(r5)     // Catch: java.lang.Throwable -> L85
                java.util.Map r5 = com.bbflight.background_downloader.m.b(r5)     // Catch: java.lang.Throwable -> L85
                java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> L85
                fc.H r6 = fc.C4015H.f34254a     // Catch: java.lang.Throwable -> L85
                r1.unlock()
                r1 = r5
                goto La1
            L9d:
                r1.unlock()
                throw r5
            La1:
                com.bbflight.background_downloader.f r5 = r0.p()
                if (r5 == 0) goto Lb0
                ae.a r5 = r5.w()
                if (r5 == 0) goto Lb0
                ae.InterfaceC2687a.C0267a.c(r5, r3, r2, r3)
            Lb0:
                Q4.X r1 = (Q4.Task) r1
                if (r1 == 0) goto Lc6
                he.b$a r5 = he.AbstractC4304b.f36582d
                r5.d()
                Q4.X$b r6 = Q4.Task.INSTANCE
                ce.b r6 = r6.serializer()
                ce.g r6 = (ce.g) r6
                java.lang.String r5 = r5.b(r6, r1)
                return r5
            Lc6:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.K.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class L extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26792j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f26793k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f26794l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public double f26795m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f26796n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26797o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public L(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26797o = methodCall;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new L(this.f26797o, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((L) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f26796n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return null;
            }
            AbstractC4036s.b(obj);
            Object obj2 = this.f26797o.arguments;
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj2;
            Object obj3 = list.get(0);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(1);
            AbstractC4862t.c(obj4, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj4;
            Object obj5 = list.get(2);
            AbstractC4862t.c(obj5, "null cannot be cast to non-null type kotlin.Double");
            double dDoubleValue = ((Double) obj5).doubleValue();
            h hVar = (h) a.INSTANCE.t().get(str);
            if (hVar == null) {
                return null;
            }
            this.f26792j = nc.l.a(list);
            this.f26793k = nc.l.a(str);
            this.f26794l = nc.l.a(str2);
            this.f26795m = dDoubleValue;
            this.f26796n = 1;
            if (hVar.h0(str2, dDoubleValue, this) == objF) {
                return objF;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class M extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26798j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f26799k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f26800l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f26801m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f26802n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f26803o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f26804p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f26805q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26806r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public M(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26806r = methodCall;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new M(this.f26806r, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((M) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Y y10;
            Exception exc;
            String str;
            Object objF = C5046c.f();
            int i10 = this.f26805q;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                Object obj2 = this.f26806r.arguments;
                AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                Object obj3 = list.get(0);
                AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) obj3;
                Object obj4 = list.get(1);
                AbstractC4862t.c(obj4, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) obj4;
                Object obj5 = list.get(2);
                AbstractC4862t.c(obj5, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj5).intValue();
                String str4 = (String) list.get(3);
                if (str4 != null) {
                    try {
                        AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                        aVar.d();
                        y10 = (Y) aVar.a(Y.INSTANCE.serializer(), str4);
                    } catch (Exception e10) {
                        exc = e10;
                        str = str4;
                        Log.w("BackgroundDownloader", "Exception " + exc);
                        Log.w("BackgroundDownloader", "exceptionJson = " + str);
                        exc.printStackTrace();
                    }
                } else {
                    y10 = null;
                }
                String str5 = (String) list.get(4);
                h hVar = (h) a.INSTANCE.t().get(str2);
                if (hVar != null) {
                    g0 g0Var = (g0) g0.q().get(iIntValue);
                    this.f26798j = nc.l.a(list);
                    this.f26799k = nc.l.a(str2);
                    this.f26800l = nc.l.a(str3);
                    this.f26801m = str4;
                    this.f26802n = nc.l.a(y10);
                    this.f26803o = nc.l.a(str5);
                    this.f26804p = iIntValue;
                    this.f26805q = 1;
                    if (hVar.i0(str3, g0Var, y10, str5, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f26801m;
                try {
                    AbstractC4036s.b(obj);
                } catch (Exception e11) {
                    exc = e11;
                    Log.w("BackgroundDownloader", "Exception " + exc);
                    Log.w("BackgroundDownloader", "exceptionJson = " + str);
                    exc.printStackTrace();
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class N extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26807j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26808k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a f26809l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public N(MethodCall methodCall, a aVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26808k = methodCall;
            this.f26809l = aVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new N(this.f26808k, this.f26809l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((N) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f26807j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            Object obj2 = this.f26808k.arguments;
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj2;
            Object obj3 = list.get(0);
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(1);
            AbstractC4862t.c(obj4, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj4;
            Integer num = (Integer) list.get(2);
            g gVar = g.f27137a;
            Context context = this.f26809l.applicationContext;
            if (context == null) {
                AbstractC4862t.p("applicationContext");
                context = null;
            }
            gVar.l(context, str, str2, num);
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class O extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26810j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26811k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a f26812l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ MethodChannel.Result f26813m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public O(MethodCall methodCall, a aVar, MethodChannel.Result result, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26811k = methodCall;
            this.f26812l = aVar;
            this.f26813m = result;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new O(this.f26811k, this.f26812l, this.f26813m, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((O) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:179:0x035e, code lost:
        
            if (r5 == r0) goto L180;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1160
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.O.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bbflight.background_downloader.a$a, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {

        /* JADX INFO: renamed from: com.bbflight.background_downloader.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0343a extends AbstractC5160d {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Object f26814j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public Object f26815k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public Object f26816l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public Object f26817m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public Object f26818n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public Object f26819o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public Object f26820p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public Object f26821q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public Object f26822r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public Object f26823s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26824t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f26825u;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public int f26827w;

            public C0343a(InterfaceC4988e interfaceC4988e) {
                super(interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) {
                this.f26825u = obj;
                this.f26827w |= Integer.MIN_VALUE;
                return Companion.this.c(null, null, null, this);
            }
        }

        /* JADX INFO: renamed from: com.bbflight.background_downloader.a$a$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends nc.m implements vc.p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f26828j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ I3.y f26829k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(I3.y yVar, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f26829k = yVar;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return new b(this.f26829k, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
                return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C5046c.f();
                if (this.f26828j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return this.f26829k.a().get();
            }
        }

        /* JADX INFO: renamed from: com.bbflight.background_downloader.a$a$c */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c extends nc.m implements vc.p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f26830j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ I3.M f26831k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f26832l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(I3.M m10, String str, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f26831k = m10;
                this.f26832l = str;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return new c(this.f26831k, this.f26832l, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
                return ((c) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C5046c.f();
                if (this.f26830j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return this.f26831k.f("taskId=" + this.f26832l).get();
            }
        }

        /* JADX INFO: renamed from: com.bbflight.background_downloader.a$a$d */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class d extends AbstractC5160d {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Object f26833j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public Object f26834k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public Object f26835l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public Object f26836m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public Object f26837n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public Object f26838o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public Object f26839p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f26840q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f26841r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26843t;

            public d(InterfaceC4988e interfaceC4988e) {
                super(interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) {
                this.f26841r = obj;
                this.f26843t |= Integer.MIN_VALUE;
                return Companion.this.e(null, null, this);
            }
        }

        /* JADX INFO: renamed from: com.bbflight.background_downloader.a$a$e */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class e extends AbstractC5160d {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Object f26844j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public Object f26845k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public Object f26846l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public Object f26847m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public Object f26848n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public Object f26849o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public Object f26850p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public long f26851q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f26852r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public int f26853s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26854t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public boolean f26855u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f26856v;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public int f26858x;

            public e(InterfaceC4988e interfaceC4988e) {
                super(interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) {
                this.f26856v = obj;
                this.f26858x |= Integer.MIN_VALUE;
                return Companion.this.g(null, null, null, null, 0L, null, this);
            }
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public static /* synthetic */ MethodChannel b(Companion companion, a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar = null;
            }
            if ((i10 & 2) != 0) {
                str = "bgd_non_existent_id";
            }
            return companion.a(aVar, str);
        }

        public static /* synthetic */ Object h(Companion companion, Context context, Task task, String str, ResumeData o10, long j10, a aVar, InterfaceC4988e interfaceC4988e, int i10, Object obj) {
            return companion.g(context, task, str, o10, (i10 & 16) != 0 ? 0L : j10, (i10 & 32) != 0 ? null : aVar, interfaceC4988e);
        }

        public final boolean A(String taskId) {
            AbstractC4862t.e(taskId, "taskId");
            u().add(taskId);
            return true;
        }

        public final void B(Map map) {
            a.f26716o = map;
        }

        public final void C(boolean z10) {
            a.f26726y = z10;
        }

        public final void D(Q4.N n10) {
            AbstractC4862t.e(n10, "<set-?>");
            a.f26714m = n10;
        }

        public final boolean E(Task task) {
            AbstractC4862t.e(task, "task");
            if (x() != Q4.N.forAllTasks) {
                return x() == Q4.N.asSetByTask && task.getRequiresWiFi();
            }
            return true;
        }

        public final MethodChannel a(a aVar, String taskId) {
            MethodChannel methodChannel;
            AbstractC4862t.e(taskId, "taskId");
            if (aVar != null && (methodChannel = aVar.backgroundChannel) != null) {
                return methodChannel;
            }
            MethodChannel methodChannel2 = (MethodChannel) i().get(taskId);
            return methodChannel2 == null ? l() : methodChannel2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:120:0x047d, code lost:
        
            if (r6.A(r0, r15) == r2) goto L133;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x03a1, code lost:
        
            if (r6 != r2) goto L98;
         */
        /* JADX WARN: Removed duplicated region for block: B:109:0x03d5  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0456  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x048d  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x049b  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x055c  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0590  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01ca  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x027f A[Catch: Exception -> 0x02a6, TryCatch #5 {Exception -> 0x02a6, blocks: (B:70:0x02a9, B:72:0x02b5, B:74:0x02f2, B:73:0x02c1, B:63:0x0277, B:65:0x027f), top: B:153:0x0277 }] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x02b5 A[Catch: Exception -> 0x02a6, TryCatch #5 {Exception -> 0x02a6, blocks: (B:70:0x02a9, B:72:0x02b5, B:74:0x02f2, B:73:0x02c1, B:63:0x0277, B:65:0x027f), top: B:153:0x0277 }] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x02c1 A[Catch: Exception -> 0x02a6, TryCatch #5 {Exception -> 0x02a6, blocks: (B:70:0x02a9, B:72:0x02b5, B:74:0x02f2, B:73:0x02c1, B:63:0x0277, B:65:0x027f), top: B:153:0x0277 }] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x055c -> B:161:0x0563). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(android.content.Context r39, java.lang.String r40, I3.M r41, lc.InterfaceC4988e r42) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1452
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.Companion.c(android.content.Context, java.lang.String, I3.M, lc.e):java.lang.Object");
        }

        public final Object d(Context context, Task task, InterfaceC4988e interfaceC4988e) {
            Context context2;
            Log.d("BackgroundDownloader", "Canceling inactive task");
            SharedPreferences sharedPreferencesA = T2.b.a(context);
            String str = (String) s().get(task.getTaskId());
            if (str != null) {
                g gVar = g.f27137a;
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                context2 = context;
                gVar.l(context2, aVar.b(Task.INSTANCE.serializer(), task), str, AbstractC5158b.c(g0.canceled.ordinal()));
            } else {
                context2 = context;
            }
            TaskWorker.Companion companion = TaskWorker.INSTANCE;
            g0 g0Var = g0.canceled;
            AbstractC4862t.b(sharedPreferencesA);
            Object objB = TaskWorker.Companion.b(companion, task, g0Var, sharedPreferencesA, null, null, null, null, null, null, context2, interfaceC4988e, 504, null);
            return objB == C5046c.f() ? objB : C4015H.f34254a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x013a, code lost:
        
            if (r15 == r1) goto L49;
         */
        /* JADX WARN: Path cross not found for [B:25:0x00b2, B:22:0x00a2], limit reached: 63 */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r15v12 */
        /* JADX WARN: Type inference failed for: r15v13, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r15v15 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0112 -> B:53:0x0146). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x013a -> B:50:0x013d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object e(android.content.Context r13, java.lang.Iterable r14, lc.InterfaceC4988e r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 348
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.Companion.e(android.content.Context, java.lang.Iterable, lc.e):java.lang.Object");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final x.a f(Task task, androidx.work.b bVar, C0874d c0874d) {
            x.a aVar;
            String taskType = task.getTaskType();
            switch (taskType.hashCode()) {
                case -2093100556:
                    if (taskType.equals("ParallelDownloadTask")) {
                        aVar = new x.a(ParallelDownloadTaskWorker.class);
                        break;
                    }
                    Log.w("BackgroundDownloader", "Unknown taskType: " + task.getTaskType());
                    return null;
                case -1975386727:
                    if (taskType.equals("UriDownloadTask")) {
                        aVar = new x.a(DownloadTaskWorker.class);
                        break;
                    }
                    Log.w("BackgroundDownloader", "Unknown taskType: " + task.getTaskType());
                    return null;
                case -683424481:
                    if (taskType.equals("MultiUploadTask")) {
                        aVar = new x.a(UploadTaskWorker.class);
                        break;
                    }
                    Log.w("BackgroundDownloader", "Unknown taskType: " + task.getTaskType());
                    return null;
                case 415156626:
                    if (taskType.equals("UriUploadTask")) {
                        aVar = new x.a(UploadTaskWorker.class);
                        break;
                    }
                    Log.w("BackgroundDownloader", "Unknown taskType: " + task.getTaskType());
                    return null;
                case 1273381453:
                    if (taskType.equals("DownloadTask")) {
                        aVar = new x.a(DownloadTaskWorker.class);
                        break;
                    }
                    Log.w("BackgroundDownloader", "Unknown taskType: " + task.getTaskType());
                    return null;
                case 1750379334:
                    if (taskType.equals("UploadTask")) {
                        aVar = new x.a(UploadTaskWorker.class);
                        break;
                    }
                    Log.w("BackgroundDownloader", "Unknown taskType: " + task.getTaskType());
                    return null;
                case 1853692015:
                    if (taskType.equals("DataTask")) {
                        aVar = new x.a(DataTaskWorker.class);
                        break;
                    }
                    Log.w("BackgroundDownloader", "Unknown taskType: " + task.getTaskType());
                    return null;
                default:
                    Log.w("BackgroundDownloader", "Unknown taskType: " + task.getTaskType());
                    return null;
            }
            ((x.a) ((x.a) ((x.a) ((x.a) aVar.m(bVar)).i(c0874d)).a("BackgroundDownloader")).a("taskId=" + task.getTaskId())).a("group=" + task.getGroup());
            return aVar;
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0362  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x03b7  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x03e0  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x03e5  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x03e9 A[LOOP:0: B:120:0x03e7->B:121:0x03e9, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:126:0x042b A[LOOP:1: B:125:0x0429->B:126:0x042b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object g(android.content.Context r30, Q4.Task r31, java.lang.String r32, Q4.ResumeData r33, long r34, com.bbflight.background_downloader.a r36, lc.InterfaceC4988e r37) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1102
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.Companion.g(android.content.Context, Q4.X, java.lang.String, Q4.O, long, com.bbflight.background_downloader.a, lc.e):java.lang.Object");
        }

        public final Map i() {
            return a.f26712k;
        }

        public final Map j() {
            return a.f26716o;
        }

        public final Set k() {
            return a.f26718q;
        }

        public final MethodChannel l() {
            return a.f26711j;
        }

        public final Map m() {
            return a.f26713l;
        }

        public final boolean n() {
            return a.f26723v;
        }

        public final boolean o() {
            return a.f26726y;
        }

        public final f p() {
            return a.f26727z;
        }

        public final Map q() {
            return a.f26715n;
        }

        public final Map r() {
            return a.f26710i;
        }

        public final Map s() {
            return a.f26722u;
        }

        public final Map t() {
            return a.f26719r;
        }

        public final Set u() {
            return a.f26717p;
        }

        public final ReentrantReadWriteLock v() {
            return a.f26724w;
        }

        public final Map w() {
            return a.f26725x;
        }

        public final Q4.N x() {
            return a.f26714m;
        }

        public final Set y() {
            return a.f26721t;
        }

        public final Set z() {
            return a.f26720s;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.bbflight.background_downloader.a$b, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C3119b extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26859j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f26860k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f26861l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f26862m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f26864o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f26865p;

        /* JADX INFO: renamed from: com.bbflight.background_downloader.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0344a extends nc.m implements vc.p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f26866j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ a f26867k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f26868l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ int f26869m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2157v f26870n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0344a(a aVar, String str, int i10, InterfaceC2157v interfaceC2157v, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f26867k = aVar;
                this.f26868l = str;
                this.f26869m = i10;
                this.f26870n = interfaceC2157v;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return new C0344a(this.f26867k, this.f26868l, this.f26869m, this.f26870n, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
                return ((C0344a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C5046c.f();
                if (this.f26866j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                MethodChannel methodChannel = this.f26867k.backgroundChannel;
                if (methodChannel == null) {
                    return null;
                }
                methodChannel.invokeMethod("notificationTap", C4206t.n(this.f26868l, AbstractC5158b.c(this.f26869m)), new C1905z(this.f26870n));
                return C4015H.f34254a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3119b(String str, int i10, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26864o = str;
            this.f26865p = i10;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new C3119b(this.f26864o, this.f26865p, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((C3119b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[PHI: r6 r7
          0x0044: PHI (r6v5 ??) = (r6v1 ??), (r6v7 ??), (r6v8 ??) binds: [B:34:0x00a6, B:39:0x00bc, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x0044: PHI (r7v4 int) = (r7v1 int), (r7v5 int), (r7v6 int) binds: [B:34:0x00a6, B:39:0x00bc, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v16 */
        /* JADX WARN: Type inference failed for: r6v17 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4, types: [int] */
        /* JADX WARN: Type inference failed for: r6v5, types: [int] */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r6v8 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a6 -> B:19:0x0044). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ba -> B:39:0x00bc). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                r14 = this;
                java.lang.Object r1 = mc.C5046c.f()
                int r0 = r14.f26862m
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r0 == 0) goto L3e
                if (r0 == r5) goto L32
                if (r0 == r3) goto L23
                if (r0 != r2) goto L1b
                int r0 = r14.f26860k
                int r6 = r14.f26859j
                fc.AbstractC4036s.b(r15)
                goto Lbc
            L1b:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L23:
                int r6 = r14.f26860k
                int r7 = r14.f26859j
                java.lang.Object r0 = r14.f26861l
                Rd.v r0 = (Rd.InterfaceC2157v) r0
                fc.AbstractC4036s.b(r15)     // Catch: java.lang.Exception -> L2f
                goto L88
            L2f:
                r0 = move-exception
                r15 = r0
                goto L90
            L32:
                int r6 = r14.f26860k
                int r7 = r14.f26859j
                java.lang.Object r0 = r14.f26861l
                Rd.v r0 = (Rd.InterfaceC2157v) r0
                fc.AbstractC4036s.b(r15)     // Catch: java.lang.Exception -> L2f
                goto L75
            L3e:
                fc.AbstractC4036s.b(r15)
                r15 = 0
                r6 = r15
                r7 = r6
            L44:
                r15 = 5
                if (r7 >= r15) goto Lc0
                if (r6 != 0) goto Lc0
                com.bbflight.background_downloader.a r15 = com.bbflight.background_downloader.a.this     // Catch: java.lang.Exception -> L2f
                io.flutter.plugin.common.MethodChannel r15 = com.bbflight.background_downloader.a.c(r15)     // Catch: java.lang.Exception -> L2f
                if (r15 == 0) goto La6
                Rd.v r12 = Rd.AbstractC2161x.b(r4, r5, r4)     // Catch: java.lang.Exception -> L2f
                Rd.J0 r15 = Rd.C2123d0.c()     // Catch: java.lang.Exception -> L2f
                com.bbflight.background_downloader.a$b$a r8 = new com.bbflight.background_downloader.a$b$a     // Catch: java.lang.Exception -> L2f
                com.bbflight.background_downloader.a r9 = com.bbflight.background_downloader.a.this     // Catch: java.lang.Exception -> L2f
                java.lang.String r10 = r14.f26864o     // Catch: java.lang.Exception -> L2f
                int r11 = r14.f26865p     // Catch: java.lang.Exception -> L2f
                r13 = 0
                r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L2f
                r14.f26861l = r12     // Catch: java.lang.Exception -> L2f
                r14.f26859j = r7     // Catch: java.lang.Exception -> L2f
                r14.f26860k = r6     // Catch: java.lang.Exception -> L2f
                r14.f26862m = r5     // Catch: java.lang.Exception -> L2f
                java.lang.Object r15 = Rd.AbstractC2128g.g(r15, r8, r14)     // Catch: java.lang.Exception -> L2f
                if (r15 != r1) goto L74
                goto Lb9
            L74:
                r0 = r12
            L75:
                java.lang.Object r15 = nc.l.a(r0)     // Catch: java.lang.Exception -> L2f
                r14.f26861l = r15     // Catch: java.lang.Exception -> L2f
                r14.f26859j = r7     // Catch: java.lang.Exception -> L2f
                r14.f26860k = r6     // Catch: java.lang.Exception -> L2f
                r14.f26862m = r3     // Catch: java.lang.Exception -> L2f
                java.lang.Object r15 = r0.i(r14)     // Catch: java.lang.Exception -> L2f
                if (r15 != r1) goto L88
                goto Lb9
            L88:
                java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.lang.Exception -> L2f
                boolean r15 = r15.booleanValue()     // Catch: java.lang.Exception -> L2f
                r6 = r15
                goto La6
            L90:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r8 = "Exception in handleIntent: "
                r0.append(r8)
                r0.append(r15)
                java.lang.String r15 = r0.toString()
                java.lang.String r0 = "BackgroundDownloader"
                android.util.Log.v(r0, r15)
            La6:
                if (r6 != 0) goto L44
                r8 = 100
                long r8 = r8 << r7
                r14.f26861l = r4
                r14.f26859j = r7
                r14.f26860k = r6
                r14.f26862m = r2
                java.lang.Object r15 = Rd.X.a(r8, r14)
                if (r15 != r1) goto Lba
            Lb9:
                return r1
            Lba:
                r0 = r6
                r6 = r7
            Lbc:
                int r7 = r6 + 1
                r6 = r0
                goto L44
            Lc0:
                fc.H r14 = fc.C4015H.f34254a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.C3119b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bbflight.background_downloader.a$c, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C3120c extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26871j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f26872k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f26873l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26874m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ a f26875n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3120c(MethodCall methodCall, a aVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26874m = methodCall;
            this.f26875n = aVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new C3120c(this.f26874m, this.f26875n, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((C3120c) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[LOOP:0: B:22:0x005e->B:24:0x0064, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x017f  */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 563
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.C3120c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bbflight.background_downloader.a$d, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C3121d extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26876j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f26877k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26878l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f26879m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3121d(MethodCall methodCall, a aVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26878l = methodCall;
            this.f26879m = aVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new C3121d(this.f26878l, this.f26879m, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((C3121d) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f26877k;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return obj;
            }
            AbstractC4036s.b(obj);
            Object obj2 = this.f26878l.arguments;
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            List list = (List) obj2;
            Companion companion = a.INSTANCE;
            Context context = this.f26879m.applicationContext;
            if (context == null) {
                AbstractC4862t.p("applicationContext");
                context = null;
            }
            this.f26876j = nc.l.a(list);
            this.f26877k = 1;
            Object objE = companion.e(context, list, this);
            return objE == objF ? objF : objE;
        }
    }

    /* JADX INFO: renamed from: com.bbflight.background_downloader.a$e, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C3122e extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f26880j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f26882l;

        public C3122e(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f26880j = obj;
            this.f26882l |= Integer.MIN_VALUE;
            return a.this.t0(this);
        }
    }

    /* JADX INFO: renamed from: com.bbflight.background_downloader.a$f, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C3123f extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26883j;

        public C3123f(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new C3123f(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((C3123f) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f26883j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            e.a();
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: com.bbflight.background_downloader.a$g, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C3124g extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26884j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f26885k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f26887m;

        public C3124g(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f26885k = obj;
            this.f26887m |= Integer.MIN_VALUE;
            return a.this.u0(null, this);
        }
    }

    /* JADX INFO: renamed from: com.bbflight.background_downloader.a$h, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C3125h extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26888j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26890l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3125h(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26890l = methodCall;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new C3125h(this.f26890l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((C3125h) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f26888j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            a.this.e1("com.bbflight.background_downloader.config.checkAvailableSpace", (Integer) this.f26890l.arguments);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: com.bbflight.background_downloader.a$i, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C3126i extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26891j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f26892k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f26894m;

        public C3126i(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f26892k = obj;
            this.f26894m |= Integer.MIN_VALUE;
            return a.this.v0(null, this);
        }
    }

    /* JADX INFO: renamed from: com.bbflight.background_downloader.a$j, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C3127j extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26895j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26896k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a f26897l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3127j(MethodCall methodCall, a aVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26896k = methodCall;
            this.f26897l = aVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new C3127j(this.f26896k, this.f26897l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((C3127j) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            C5046c.f();
            if (this.f26895j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            Object obj2 = this.f26896k.arguments;
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj2).intValue();
            this.f26897l.e1("com.bbflight.background_downloader.config.foregroundFileSize", AbstractC5158b.c(iIntValue));
            if (iIntValue == -1) {
                str = "Disabled foreground mode for all tasks";
            } else if (iIntValue != 0) {
                str = "Set foreground file size threshold to " + iIntValue + " MB";
            } else {
                str = "Enabled foreground mode for all tasks";
            }
            return AbstractC5158b.c(Log.v("BackgroundDownloader", str));
        }
    }

    /* JADX INFO: renamed from: com.bbflight.background_downloader.a$k, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C3128k extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26898j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f26899k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f26901m;

        public C3128k(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f26899k = obj;
            this.f26901m |= Integer.MIN_VALUE;
            return a.this.x0(null, this);
        }
    }

    /* JADX INFO: renamed from: com.bbflight.background_downloader.a$l, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C3129l extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26902j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26904l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3129l(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26904l = methodCall;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new C3129l(this.f26904l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((C3129l) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f26902j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            Context context = a.this.applicationContext;
            if (context == null) {
                AbstractC4862t.p("applicationContext");
                context = null;
            }
            SharedPreferences.Editor editorEdit = T2.b.a(context).edit();
            String str = (String) this.f26904l.arguments;
            if (str != null) {
                editorEdit.putString("com.bbflight.background_downloader.config.proxyAddress", str);
            } else {
                editorEdit.remove("com.bbflight.background_downloader.config.proxyAddress");
            }
            editorEdit.apply();
            return editorEdit;
        }
    }

    /* JADX INFO: renamed from: com.bbflight.background_downloader.a$m, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C3130m extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26905j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f26906k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f26908m;

        public C3130m(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f26906k = obj;
            this.f26908m |= Integer.MIN_VALUE;
            return a.this.y0(null, this);
        }
    }

    /* JADX INFO: renamed from: com.bbflight.background_downloader.a$n, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C3131n extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26909j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26911l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3131n(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26911l = methodCall;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new C3131n(this.f26911l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((C3131n) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f26909j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            a.this.e1("com.bbflight.background_downloader.config.proxyPort", (Integer) this.f26911l.arguments);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: com.bbflight.background_downloader.a$o, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C3132o extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26912j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f26913k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f26915m;

        public C3132o(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f26913k = obj;
            this.f26915m |= Integer.MIN_VALUE;
            return a.this.z0(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class p extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26916j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26918l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26918l = methodCall;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new p(this.f26918l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((p) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f26916j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            a.this.e1("com.bbflight.background_downloader.config.requestTimeout", (Integer) this.f26918l.arguments);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class q extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26919j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f26920k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f26922m;

        public q(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f26920k = obj;
            this.f26922m |= Integer.MIN_VALUE;
            return a.this.A0(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class r extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26923j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26925l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26925l = methodCall;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new r(this.f26925l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((r) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f26923j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            a.this.e1("com.bbflight.background_downloader.config.skipExistingFiles", (Integer) this.f26925l.arguments);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class s extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26926j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f26927k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f26929m;

        public s(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f26927k = obj;
            this.f26929m |= Integer.MIN_VALUE;
            return a.this.B0(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class t extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26930j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26932l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26932l = methodCall;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new t(this.f26932l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((t) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f26930j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            a.this.e1("com.bbflight.background_downloader.config.useCacheDir", (Integer) this.f26932l.arguments);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class u extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26933j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f26934k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f26936m;

        public u(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f26934k = obj;
            this.f26936m |= Integer.MIN_VALUE;
            return a.this.C0(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class v extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26937j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26939l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26939l = methodCall;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new v(this.f26939l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((v) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f26937j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            a.this.e1("com.bbflight.background_downloader.config.useExternalStorage", (Integer) this.f26939l.arguments);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class w extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26940j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f26941k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f26942l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f26943m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f26944n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f26945o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f26946p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26947q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ a f26948r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(MethodCall methodCall, a aVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26947q = methodCall;
            this.f26948r = aVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new w(this.f26947q, this.f26948r, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((w) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0153, code lost:
        
            if (r0 == r14) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0239, code lost:
        
            if (com.bbflight.background_downloader.TaskWorker.Companion.b(r0, r1, r2, r7, null, null, null, null, null, null, r4, r25, 504, null) == r14) goto L54;
         */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01ec  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0201  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0205  */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 643
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.w.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class x extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26949j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f26950k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f26951l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f26952m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f26953n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f26954o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f26955p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f26956q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f26957r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f26958s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26959t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f26960u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f26961v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f26962w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f26963x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ MethodCall f26965z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26965z = methodCall;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new x(this.f26965z, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((x) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:(1:167)|39|(3:206|41|42)|45|46|161|47|48|200|49|50|(11:53|214|54|55|125|(0)(0)|202|156|157|220|(1:27))|122) */
        /* JADX WARN: Can't wrap try/catch for region: R(13:167|39|(3:206|41|42)|45|46|161|47|48|200|49|50|(11:53|214|54|55|125|(0)(0)|202|156|157|220|(1:27))|122) */
        /* JADX WARN: Can't wrap try/catch for region: R(19:86|87|171|102|173|103|(3:189|105|106)|109|212|110|(3:169|112|113)|116|117|163|118|119|196|120|(9:123|124|125|(0)(0)|202|156|157|220|(1:27))) */
        /* JADX WARN: Can't wrap try/catch for region: R(20:(1:185)|68|(3:210|70|71)|74|175|75|76|177|77|78|198|79|80|204|81|82|208|83|(19:86|87|171|102|173|103|(3:189|105|106)|109|212|110|(3:169|112|113)|116|117|163|118|119|196|120|(9:123|124|125|(0)(0)|202|156|157|220|(1:27)))|122) */
        /* JADX WARN: Can't wrap try/catch for region: R(20:185|68|(3:210|70|71)|74|175|75|76|177|77|78|198|79|80|204|81|82|208|83|(19:86|87|171|102|173|103|(3:189|105|106)|109|212|110|(3:169|112|113)|116|117|163|118|119|196|120|(9:123|124|125|(0)(0)|202|156|157|220|(1:27)))|122) */
        /* JADX WARN: Can't wrap try/catch for region: R(7:29|(1:31)(1:35)|181|36|216|37|(13:167|39|(3:206|41|42)|45|46|161|47|48|200|49|50|(11:53|214|54|55|125|(0)(0)|202|156|157|220|(1:27))|122)(4:65|194|66|(20:185|68|(3:210|70|71)|74|175|75|76|177|77|78|198|79|80|204|81|82|208|83|(19:86|87|171|102|173|103|(3:189|105|106)|109|212|110|(3:169|112|113)|116|117|163|118|119|196|120|(9:123|124|125|(0)(0)|202|156|157|220|(1:27)))|122)(19:101|171|102|173|103|(0)|109|212|110|(0)|116|117|163|118|119|196|120|(0)|122))) */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x0497, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x0498, code lost:
        
            r13 = r32;
            r4 = r1;
            r11 = r18;
            r15 = r15;
            r28 = r28;
            r29 = r29;
            r30 = r30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x049d, code lost:
        
            r9 = r22;
            r10 = r23;
            r18 = r24;
            r6 = r25;
            r7 = r28;
            r5 = r29;
            r3 = r30;
            r11 = r11;
            r15 = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x04ad, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x04ae, code lost:
        
            r30 = r1;
            r1 = r2;
            r29 = r6;
            r25 = r7;
            r28 = r8;
            r32 = r15;
            r15 = r26;
            r21 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:131:0x04c3, code lost:
        
            r13 = r32;
            r4 = r1;
            r11 = r11;
            r15 = r15;
            r28 = r28;
            r29 = r29;
            r30 = r30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:132:0x04c7, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:133:0x04c8, code lost:
        
            r30 = r1;
            r1 = r2;
            r29 = r6;
            r25 = r7;
            r28 = r8;
            r32 = r15;
            r15 = r26;
            r21 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:134:0x04de, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:135:0x04df, code lost:
        
            r30 = r1;
            r1 = r2;
            r29 = r6;
            r25 = r7;
            r28 = r8;
            r32 = r15;
            r15 = r26;
            r21 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x04f2, code lost:
        
            r15 = r15;
            r28 = r28;
            r29 = r29;
            r30 = r30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:137:0x04f5, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x04f6, code lost:
        
            r30 = r1;
            r1 = r2;
            r21 = r4;
            r29 = r6;
            r25 = r7;
            r28 = r8;
            r32 = r15;
            r15 = r26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:143:0x0527, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:144:0x0528, code lost:
        
            r9 = r1;
            r7 = r6;
            r1 = r15;
            r20 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0296, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x02b0, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x02b1, code lost:
        
            r27 = r1;
            r20 = true;
            r7 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0379, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x037a, code lost:
        
            r21 = r4;
            r3 = r9;
            r5 = r11;
            r6 = r13;
            r9 = r22;
            r10 = r23;
            r18 = r24;
            r19 = r25;
            r4 = r2;
            r13 = r21;
            r11 = r7;
            r7 = r15;
            r15 = r26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0394, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0395, code lost:
        
            r5 = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x0397, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0398, code lost:
        
            r4 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x039a, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x039b, code lost:
        
            r9 = r27 == true ? 1 : 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x039e, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x039f, code lost:
        
            r2 = r2;
            r7 = r7;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:123:0x0475  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x05c4  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x05c7  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x03f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:189:0x03c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x01ac A[Catch: Exception -> 0x01cf, TryCatch #13 {Exception -> 0x01cf, blocks: (B:27:0x01a6, B:29:0x01ac, B:31:0x01bd, B:26:0x0162), top: B:187:0x0162 }] */
        /* JADX WARN: Type inference failed for: r0v103 */
        /* JADX WARN: Type inference failed for: r0v108 */
        /* JADX WARN: Type inference failed for: r0v109 */
        /* JADX WARN: Type inference failed for: r0v110 */
        /* JADX WARN: Type inference failed for: r0v111 */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v17 */
        /* JADX WARN: Type inference failed for: r0v18, types: [int] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v31 */
        /* JADX WARN: Type inference failed for: r0v32 */
        /* JADX WARN: Type inference failed for: r0v33 */
        /* JADX WARN: Type inference failed for: r0v38 */
        /* JADX WARN: Type inference failed for: r0v64 */
        /* JADX WARN: Type inference failed for: r0v66 */
        /* JADX WARN: Type inference failed for: r0v67 */
        /* JADX WARN: Type inference failed for: r0v68 */
        /* JADX WARN: Type inference failed for: r0v87 */
        /* JADX WARN: Type inference failed for: r11v10 */
        /* JADX WARN: Type inference failed for: r11v12 */
        /* JADX WARN: Type inference failed for: r11v14 */
        /* JADX WARN: Type inference failed for: r11v15 */
        /* JADX WARN: Type inference failed for: r11v16 */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r11v18 */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v23 */
        /* JADX WARN: Type inference failed for: r11v26 */
        /* JADX WARN: Type inference failed for: r11v28 */
        /* JADX WARN: Type inference failed for: r11v3 */
        /* JADX WARN: Type inference failed for: r11v30 */
        /* JADX WARN: Type inference failed for: r11v31 */
        /* JADX WARN: Type inference failed for: r11v32 */
        /* JADX WARN: Type inference failed for: r11v33 */
        /* JADX WARN: Type inference failed for: r11v34 */
        /* JADX WARN: Type inference failed for: r11v35 */
        /* JADX WARN: Type inference failed for: r11v5 */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r12v1 */
        /* JADX WARN: Type inference failed for: r12v11 */
        /* JADX WARN: Type inference failed for: r12v12 */
        /* JADX WARN: Type inference failed for: r12v13 */
        /* JADX WARN: Type inference failed for: r12v14 */
        /* JADX WARN: Type inference failed for: r12v15 */
        /* JADX WARN: Type inference failed for: r12v16 */
        /* JADX WARN: Type inference failed for: r12v17 */
        /* JADX WARN: Type inference failed for: r12v18 */
        /* JADX WARN: Type inference failed for: r12v19 */
        /* JADX WARN: Type inference failed for: r12v2 */
        /* JADX WARN: Type inference failed for: r12v3 */
        /* JADX WARN: Type inference failed for: r12v4 */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r12v9 */
        /* JADX WARN: Type inference failed for: r13v19 */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v24 */
        /* JADX WARN: Type inference failed for: r13v26 */
        /* JADX WARN: Type inference failed for: r13v34 */
        /* JADX WARN: Type inference failed for: r13v35 */
        /* JADX WARN: Type inference failed for: r15v1 */
        /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r15v12 */
        /* JADX WARN: Type inference failed for: r15v13 */
        /* JADX WARN: Type inference failed for: r15v14 */
        /* JADX WARN: Type inference failed for: r15v15 */
        /* JADX WARN: Type inference failed for: r15v16 */
        /* JADX WARN: Type inference failed for: r15v17 */
        /* JADX WARN: Type inference failed for: r15v18 */
        /* JADX WARN: Type inference failed for: r15v19 */
        /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r15v20 */
        /* JADX WARN: Type inference failed for: r15v21 */
        /* JADX WARN: Type inference failed for: r15v22 */
        /* JADX WARN: Type inference failed for: r15v23, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Type inference failed for: r15v24, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r15v25 */
        /* JADX WARN: Type inference failed for: r15v26 */
        /* JADX WARN: Type inference failed for: r15v27 */
        /* JADX WARN: Type inference failed for: r15v28, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r15v29 */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v30 */
        /* JADX WARN: Type inference failed for: r15v31 */
        /* JADX WARN: Type inference failed for: r15v32 */
        /* JADX WARN: Type inference failed for: r15v34 */
        /* JADX WARN: Type inference failed for: r15v35 */
        /* JADX WARN: Type inference failed for: r15v36 */
        /* JADX WARN: Type inference failed for: r15v37 */
        /* JADX WARN: Type inference failed for: r15v38 */
        /* JADX WARN: Type inference failed for: r15v4 */
        /* JADX WARN: Type inference failed for: r15v41 */
        /* JADX WARN: Type inference failed for: r15v42 */
        /* JADX WARN: Type inference failed for: r15v43 */
        /* JADX WARN: Type inference failed for: r15v44 */
        /* JADX WARN: Type inference failed for: r15v45 */
        /* JADX WARN: Type inference failed for: r15v46 */
        /* JADX WARN: Type inference failed for: r15v47 */
        /* JADX WARN: Type inference failed for: r15v48 */
        /* JADX WARN: Type inference failed for: r15v49 */
        /* JADX WARN: Type inference failed for: r15v5 */
        /* JADX WARN: Type inference failed for: r15v50 */
        /* JADX WARN: Type inference failed for: r15v51 */
        /* JADX WARN: Type inference failed for: r15v52 */
        /* JADX WARN: Type inference failed for: r15v53 */
        /* JADX WARN: Type inference failed for: r15v54 */
        /* JADX WARN: Type inference failed for: r15v6 */
        /* JADX WARN: Type inference failed for: r15v7 */
        /* JADX WARN: Type inference failed for: r15v9 */
        /* JADX WARN: Type inference failed for: r18v10 */
        /* JADX WARN: Type inference failed for: r18v12 */
        /* JADX WARN: Type inference failed for: r18v4 */
        /* JADX WARN: Type inference failed for: r18v6 */
        /* JADX WARN: Type inference failed for: r18v8 */
        /* JADX WARN: Type inference failed for: r19v2 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v20, types: [int] */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v24 */
        /* JADX WARN: Type inference failed for: r1v25 */
        /* JADX WARN: Type inference failed for: r1v26 */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r1v34 */
        /* JADX WARN: Type inference failed for: r1v39 */
        /* JADX WARN: Type inference failed for: r1v40 */
        /* JADX WARN: Type inference failed for: r1v41, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v43 */
        /* JADX WARN: Type inference failed for: r1v50 */
        /* JADX WARN: Type inference failed for: r1v51 */
        /* JADX WARN: Type inference failed for: r1v52 */
        /* JADX WARN: Type inference failed for: r26v16 */
        /* JADX WARN: Type inference failed for: r26v17 */
        /* JADX WARN: Type inference failed for: r26v18 */
        /* JADX WARN: Type inference failed for: r26v19 */
        /* JADX WARN: Type inference failed for: r26v2 */
        /* JADX WARN: Type inference failed for: r26v20 */
        /* JADX WARN: Type inference failed for: r26v22 */
        /* JADX WARN: Type inference failed for: r26v23 */
        /* JADX WARN: Type inference failed for: r26v26 */
        /* JADX WARN: Type inference failed for: r26v27 */
        /* JADX WARN: Type inference failed for: r26v28 */
        /* JADX WARN: Type inference failed for: r26v4 */
        /* JADX WARN: Type inference failed for: r27v12 */
        /* JADX WARN: Type inference failed for: r27v14 */
        /* JADX WARN: Type inference failed for: r27v15 */
        /* JADX WARN: Type inference failed for: r27v16 */
        /* JADX WARN: Type inference failed for: r27v18 */
        /* JADX WARN: Type inference failed for: r28v0 */
        /* JADX WARN: Type inference failed for: r28v1 */
        /* JADX WARN: Type inference failed for: r28v10 */
        /* JADX WARN: Type inference failed for: r28v2 */
        /* JADX WARN: Type inference failed for: r28v3 */
        /* JADX WARN: Type inference failed for: r28v4 */
        /* JADX WARN: Type inference failed for: r28v5 */
        /* JADX WARN: Type inference failed for: r28v6 */
        /* JADX WARN: Type inference failed for: r28v7 */
        /* JADX WARN: Type inference failed for: r28v8 */
        /* JADX WARN: Type inference failed for: r28v9 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v26 */
        /* JADX WARN: Type inference failed for: r3v27 */
        /* JADX WARN: Type inference failed for: r3v29 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v44 */
        /* JADX WARN: Type inference failed for: r3v45 */
        /* JADX WARN: Type inference failed for: r3v46 */
        /* JADX WARN: Type inference failed for: r3v47 */
        /* JADX WARN: Type inference failed for: r3v49 */
        /* JADX WARN: Type inference failed for: r3v50 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v18 */
        /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v20 */
        /* JADX WARN: Type inference failed for: r6v34 */
        /* JADX WARN: Type inference failed for: r6v36 */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v46 */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v12 */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r7v18 */
        /* JADX WARN: Type inference failed for: r7v19 */
        /* JADX WARN: Type inference failed for: r7v20 */
        /* JADX WARN: Type inference failed for: r7v21 */
        /* JADX WARN: Type inference failed for: r7v22 */
        /* JADX WARN: Type inference failed for: r7v23 */
        /* JADX WARN: Type inference failed for: r7v24 */
        /* JADX WARN: Type inference failed for: r7v25 */
        /* JADX WARN: Type inference failed for: r7v26 */
        /* JADX WARN: Type inference failed for: r7v27 */
        /* JADX WARN: Type inference failed for: r7v36 */
        /* JADX WARN: Type inference failed for: r7v37, types: [com.bbflight.background_downloader.a] */
        /* JADX WARN: Type inference failed for: r7v38 */
        /* JADX WARN: Type inference failed for: r7v39 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v40 */
        /* JADX WARN: Type inference failed for: r7v41, types: [com.bbflight.background_downloader.a] */
        /* JADX WARN: Type inference failed for: r7v42 */
        /* JADX WARN: Type inference failed for: r7v43 */
        /* JADX WARN: Type inference failed for: r7v44 */
        /* JADX WARN: Type inference failed for: r7v45 */
        /* JADX WARN: Type inference failed for: r7v46 */
        /* JADX WARN: Type inference failed for: r7v48 */
        /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v52 */
        /* JADX WARN: Type inference failed for: r7v53 */
        /* JADX WARN: Type inference failed for: r7v54 */
        /* JADX WARN: Type inference failed for: r7v59 */
        /* JADX WARN: Type inference failed for: r7v63 */
        /* JADX WARN: Type inference failed for: r7v64 */
        /* JADX WARN: Type inference failed for: r7v65 */
        /* JADX WARN: Type inference failed for: r7v66 */
        /* JADX WARN: Type inference failed for: r7v67 */
        /* JADX WARN: Type inference failed for: r7v68 */
        /* JADX WARN: Type inference failed for: r7v69 */
        /* JADX WARN: Type inference failed for: r7v70 */
        /* JADX WARN: Type inference failed for: r7v71 */
        /* JADX WARN: Type inference failed for: r7v72 */
        /* JADX WARN: Type inference failed for: r7v73 */
        /* JADX WARN: Type inference failed for: r7v74 */
        /* JADX WARN: Type inference failed for: r7v75 */
        /* JADX WARN: Type inference failed for: r7v76 */
        /* JADX WARN: Type inference failed for: r7v77 */
        /* JADX WARN: Type inference failed for: r7v78 */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r7v9 */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v20 */
        /* JADX WARN: Type inference failed for: r9v22 */
        /* JADX WARN: Type inference failed for: r9v28 */
        /* JADX WARN: Type inference failed for: r9v39 */
        /* JADX WARN: Type inference failed for: r9v55 */
        /* JADX WARN: Type inference failed for: r9v56 */
        /* JADX WARN: Type inference failed for: r9v62 */
        /* JADX WARN: Type inference failed for: r9v63 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x0475 -> B:124:0x0485). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x0591 -> B:153:0x05c2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x027c -> B:125:0x048c). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1524
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.x.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class y extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26966j;

        public y(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new y(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((y) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f26966j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            Context context = a.this.applicationContext;
            if (context == null) {
                AbstractC4862t.p("applicationContext");
                context = null;
            }
            return AbstractC5158b.c(T2.b.a(context).getInt("com.bbflight.background_downloader.requireWifi", 0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class z extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26968j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f26969k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f26970l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f26972n;

        public z(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f26970l = obj;
            this.f26972n |= Integer.MIN_VALUE;
            return a.this.I0(null, this);
        }
    }

    public static final boolean n0(a aVar, Intent intent) {
        return aVar.q0(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A0(io.flutter.plugin.common.MethodCall r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.bbflight.background_downloader.a.q
            if (r0 == 0) goto L13
            r0 = r7
            com.bbflight.background_downloader.a$q r0 = (com.bbflight.background_downloader.a.q) r0
            int r1 = r0.f26922m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26922m = r1
            goto L18
        L13:
            com.bbflight.background_downloader.a$q r0 = new com.bbflight.background_downloader.a$q
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26920k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f26922m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.f26919j
            io.flutter.plugin.common.MethodCall r5 = (io.flutter.plugin.common.MethodCall) r5
            fc.AbstractC4036s.b(r7)
            goto L5b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            fc.AbstractC4036s.b(r7)
            Rd.M r7 = r5.defaultScope
            if (r7 != 0) goto L43
            java.lang.String r7 = "defaultScope"
            kotlin.jvm.internal.AbstractC4862t.p(r7)
            r7 = r4
        L43:
            lc.i r7 = r7.getCoroutineContext()
            com.bbflight.background_downloader.a$r r2 = new com.bbflight.background_downloader.a$r
            r2.<init>(r6, r4)
            java.lang.Object r5 = nc.l.a(r6)
            r0.f26919j = r5
            r0.f26922m = r3
            java.lang.Object r5 = Rd.AbstractC2128g.g(r7, r2, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.A0(io.flutter.plugin.common.MethodCall, lc.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object B0(io.flutter.plugin.common.MethodCall r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.bbflight.background_downloader.a.s
            if (r0 == 0) goto L13
            r0 = r7
            com.bbflight.background_downloader.a$s r0 = (com.bbflight.background_downloader.a.s) r0
            int r1 = r0.f26929m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26929m = r1
            goto L18
        L13:
            com.bbflight.background_downloader.a$s r0 = new com.bbflight.background_downloader.a$s
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26927k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f26929m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.f26926j
            io.flutter.plugin.common.MethodCall r5 = (io.flutter.plugin.common.MethodCall) r5
            fc.AbstractC4036s.b(r7)
            goto L5b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            fc.AbstractC4036s.b(r7)
            Rd.M r7 = r5.defaultScope
            if (r7 != 0) goto L43
            java.lang.String r7 = "defaultScope"
            kotlin.jvm.internal.AbstractC4862t.p(r7)
            r7 = r4
        L43:
            lc.i r7 = r7.getCoroutineContext()
            com.bbflight.background_downloader.a$t r2 = new com.bbflight.background_downloader.a$t
            r2.<init>(r6, r4)
            java.lang.Object r5 = nc.l.a(r6)
            r0.f26926j = r5
            r0.f26929m = r3
            java.lang.Object r5 = Rd.AbstractC2128g.g(r7, r2, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.B0(io.flutter.plugin.common.MethodCall, lc.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object C0(io.flutter.plugin.common.MethodCall r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.bbflight.background_downloader.a.u
            if (r0 == 0) goto L13
            r0 = r7
            com.bbflight.background_downloader.a$u r0 = (com.bbflight.background_downloader.a.u) r0
            int r1 = r0.f26936m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26936m = r1
            goto L18
        L13:
            com.bbflight.background_downloader.a$u r0 = new com.bbflight.background_downloader.a$u
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26934k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f26936m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.f26933j
            io.flutter.plugin.common.MethodCall r5 = (io.flutter.plugin.common.MethodCall) r5
            fc.AbstractC4036s.b(r7)
            goto L5b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            fc.AbstractC4036s.b(r7)
            Rd.M r7 = r5.defaultScope
            if (r7 != 0) goto L43
            java.lang.String r7 = "defaultScope"
            kotlin.jvm.internal.AbstractC4862t.p(r7)
            r7 = r4
        L43:
            lc.i r7 = r7.getCoroutineContext()
            com.bbflight.background_downloader.a$v r2 = new com.bbflight.background_downloader.a$v
            r2.<init>(r6, r4)
            java.lang.Object r5 = nc.l.a(r6)
            r0.f26933j = r5
            r0.f26936m = r3
            java.lang.Object r5 = Rd.AbstractC2128g.g(r7, r2, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.C0(io.flutter.plugin.common.MethodCall, lc.e):java.lang.Object");
    }

    public final Object D0(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
        Rd.M m10 = this.defaultScope;
        if (m10 == null) {
            AbstractC4862t.p("defaultScope");
            m10 = null;
        }
        return AbstractC2128g.g(m10.getCoroutineContext(), new w(methodCall, this, null), interfaceC4988e);
    }

    public final Object E0(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
        Rd.M m10 = this.defaultScope;
        if (m10 == null) {
            AbstractC4862t.p("defaultScope");
            m10 = null;
        }
        return AbstractC2128g.g(m10.getCoroutineContext(), new x(methodCall, null), interfaceC4988e);
    }

    public final Object F0(MethodCall call) {
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
        f26723v = ((Boolean) obj).booleanValue();
        return null;
    }

    public final Object G0(InterfaceC4988e interfaceC4988e) {
        Rd.M m10 = this.defaultScope;
        if (m10 == null) {
            AbstractC4862t.p("defaultScope");
            m10 = null;
        }
        return AbstractC2128g.g(m10.getCoroutineContext(), new y(null), interfaceC4988e);
    }

    public final long H0() {
        return 540000L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object I0(io.flutter.plugin.common.MethodCall r7, lc.InterfaceC4988e r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.bbflight.background_downloader.a.z
            if (r0 == 0) goto L13
            r0 = r8
            com.bbflight.background_downloader.a$z r0 = (com.bbflight.background_downloader.a.z) r0
            int r1 = r0.f26972n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26972n = r1
            goto L18
        L13:
            com.bbflight.background_downloader.a$z r0 = new com.bbflight.background_downloader.a$z
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f26970l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f26972n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f26969k
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f26968j
            io.flutter.plugin.common.MethodCall r6 = (io.flutter.plugin.common.MethodCall) r6
            fc.AbstractC4036s.b(r8)
            goto L6e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            fc.AbstractC4036s.b(r8)
            java.lang.Object r8 = r7.arguments
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.AbstractC4862t.c(r8, r2)
            java.lang.String r8 = (java.lang.String) r8
            Rd.M r2 = r6.defaultScope
            if (r2 != 0) goto L50
            java.lang.String r2 = "defaultScope"
            kotlin.jvm.internal.AbstractC4862t.p(r2)
            r2 = r4
        L50:
            lc.i r2 = r2.getCoroutineContext()
            com.bbflight.background_downloader.a$A r5 = new com.bbflight.background_downloader.a$A
            r5.<init>(r8, r4)
            java.lang.Object r6 = nc.l.a(r7)
            r0.f26968j = r6
            java.lang.Object r6 = nc.l.a(r8)
            r0.f26969k = r6
            r0.f26972n = r3
            java.lang.Object r6 = Rd.AbstractC2128g.g(r2, r5, r0)
            if (r6 != r1) goto L6e
            return r1
        L6e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.I0(io.flutter.plugin.common.MethodCall, lc.e):java.lang.Object");
    }

    public final Object J0(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
        Rd.M m10 = this.defaultScope;
        if (m10 == null) {
            AbstractC4862t.p("defaultScope");
            m10 = null;
        }
        return AbstractC2128g.g(m10.getCoroutineContext(), new B(methodCall, this, null), interfaceC4988e);
    }

    public final boolean K0(MethodCall call) {
        Task task;
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        String str = (String) list.get(0);
        if (str != null) {
            AbstractC4304b.a aVar = AbstractC4304b.f36582d;
            aVar.d();
            task = (Task) aVar.a(Task.INSTANCE.serializer(), str);
        } else {
            task = null;
        }
        String strP = (String) list.get(1);
        if (strP == null) {
            AbstractC4862t.b(task);
            Context context = this.applicationContext;
            if (context == null) {
                AbstractC4862t.p("applicationContext");
                context = null;
            }
            strP = Task.p(task, context, null, 2, null);
        }
        String strB = (String) list.get(2);
        if (strB == null) {
            strB = Q.b(strP);
        }
        Activity activity = this.activity;
        if (activity == null) {
            return false;
        }
        AbstractC4862t.b(activity);
        return Q4.H.a(activity, strP, strB);
    }

    public final Object L0(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
        Object obj = methodCall.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
        InterfaceC5276a interfaceC5276aB = P.b();
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Int");
        P p10 = (P) interfaceC5276aB.get(((Integer) obj3).intValue());
        Object obj4 = list.get(2);
        AbstractC4862t.c(obj4, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj4;
        Object obj5 = list.get(3);
        AbstractC4862t.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        Rd.M m10 = this.defaultScope;
        if (m10 == null) {
            AbstractC4862t.p("defaultScope");
            m10 = null;
        }
        return AbstractC2128g.g(m10.getCoroutineContext(), new C(str, p10, str2, zBooleanValue, null), interfaceC4988e);
    }

    public final boolean M0(MethodCall call) {
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.String");
        return INSTANCE.A((String) obj);
    }

    public final List N0(MethodCall call) throws Q4.D {
        Object obj = call.arguments;
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            throw new Q4.D("INVALID_ARGUMENT", "Expected a list of task IDs", null);
        }
        ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
        for (Object obj2 : list) {
            arrayList.add(Boolean.valueOf(obj2 instanceof String ? INSTANCE.A((String) obj2) : false));
        }
        return arrayList;
    }

    public final int O0(MethodCall call) {
        InterfaceC5276a interfaceC5276aB = Q4.J.b();
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Int");
        Q4.J j10 = (Q4.J) interfaceC5276aB.get(((Integer) obj).intValue());
        i.a aVar = i.f27255a;
        Context context = this.applicationContext;
        if (context == null) {
            AbstractC4862t.p("applicationContext");
            context = null;
        }
        return aVar.a(context, j10).ordinal();
    }

    public final String P0() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public final Object Q0(InterfaceC4988e interfaceC4988e) {
        Rd.M m10 = this.defaultScope;
        if (m10 == null) {
            AbstractC4862t.p("defaultScope");
            m10 = null;
        }
        return AbstractC2128g.g(m10.getCoroutineContext(), new D(null), interfaceC4988e);
    }

    public final Object R0(InterfaceC4988e interfaceC4988e) {
        Rd.M m10 = this.defaultScope;
        if (m10 == null) {
            AbstractC4862t.p("defaultScope");
            m10 = null;
        }
        return AbstractC2128g.g(m10.getCoroutineContext(), new E(null), interfaceC4988e);
    }

    public final Object S0(InterfaceC4988e interfaceC4988e) {
        Rd.M m10 = this.defaultScope;
        if (m10 == null) {
            AbstractC4862t.p("defaultScope");
            m10 = null;
        }
        return AbstractC2128g.g(m10.getCoroutineContext(), new F(null), interfaceC4988e);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object T0(io.flutter.plugin.common.MethodCall r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.bbflight.background_downloader.a.G
            if (r0 == 0) goto L13
            r0 = r7
            com.bbflight.background_downloader.a$G r0 = (com.bbflight.background_downloader.a.G) r0
            int r1 = r0.f26763m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26763m = r1
            goto L18
        L13:
            com.bbflight.background_downloader.a$G r0 = new com.bbflight.background_downloader.a$G
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26761k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f26763m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.f26760j
            io.flutter.plugin.common.MethodCall r5 = (io.flutter.plugin.common.MethodCall) r5
            fc.AbstractC4036s.b(r7)
            goto L5b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            fc.AbstractC4036s.b(r7)
            Rd.M r7 = r5.defaultScope
            if (r7 != 0) goto L43
            java.lang.String r7 = "defaultScope"
            kotlin.jvm.internal.AbstractC4862t.p(r7)
            r7 = r4
        L43:
            lc.i r7 = r7.getCoroutineContext()
            com.bbflight.background_downloader.a$H r2 = new com.bbflight.background_downloader.a$H
            r2.<init>(r6, r4)
            java.lang.Object r5 = nc.l.a(r6)
            r0.f26760j = r5
            r0.f26763m = r3
            java.lang.Object r5 = Rd.AbstractC2128g.g(r7, r2, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.T0(io.flutter.plugin.common.MethodCall, lc.e):java.lang.Object");
    }

    public final boolean U0(MethodCall call) {
        InterfaceC5276a interfaceC5276aB = Q4.J.b();
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Int");
        return i.f27255a.c(this, (Q4.J) interfaceC5276aB.get(((Integer) obj).intValue()));
    }

    public final Object V0(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
        Rd.M m10 = this.defaultScope;
        if (m10 == null) {
            AbstractC4862t.p("defaultScope");
            m10 = null;
        }
        return AbstractC2128g.g(m10.getCoroutineContext(), new I(methodCall, this, null), interfaceC4988e);
    }

    public final Object W0(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
        Rd.M m10 = this.defaultScope;
        if (m10 == null) {
            AbstractC4862t.p("defaultScope");
            m10 = null;
        }
        return AbstractC2128g.g(m10.getCoroutineContext(), new J(methodCall, this, null), interfaceC4988e);
    }

    public final boolean X0(MethodCall call) {
        InterfaceC5276a interfaceC5276aB = Q4.J.b();
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Int");
        return i.f27255a.e(this, (Q4.J) interfaceC5276aB.get(((Integer) obj).intValue()));
    }

    public final Object Y0(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
        Rd.M m10 = this.defaultScope;
        if (m10 == null) {
            AbstractC4862t.p("defaultScope");
            m10 = null;
        }
        return AbstractC2128g.g(m10.getCoroutineContext(), new K(methodCall, this, null), interfaceC4988e);
    }

    public final String Z0(MethodCall call) {
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj3;
        AbstractC4304b.a aVar = AbstractC4304b.f36582d;
        aVar.d();
        Task task = (Task) aVar.a(Task.INSTANCE.serializer(), (String) obj2);
        Map mapM = str.length() > 0 ? gc.Q.m(AbstractC4040w.a(HttpHeaders.CONTENT_DISPOSITION, C4206t.q(str))) : gc.Q.m(AbstractC4040w.a("", new ArrayList()));
        Context context = this.applicationContext;
        if (context == null) {
            AbstractC4862t.p("applicationContext");
            context = null;
        }
        return Task.Z(task, context, mapM, false, 4, null).getFilename();
    }

    public final Object a1(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
        Rd.M m10 = this.defaultScope;
        if (m10 == null) {
            AbstractC4862t.p("defaultScope");
            m10 = null;
        }
        return AbstractC2128g.g(m10.getCoroutineContext(), new L(methodCall, null), interfaceC4988e);
    }

    public final Object b1(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
        Rd.M m10 = this.defaultScope;
        if (m10 == null) {
            AbstractC4862t.p("defaultScope");
            m10 = null;
        }
        return AbstractC2128g.g(m10.getCoroutineContext(), new M(methodCall, null), interfaceC4988e);
    }

    public final Object c1(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
        Rd.M m10 = this.defaultScope;
        if (m10 == null) {
            AbstractC4862t.p("defaultScope");
            m10 = null;
        }
        return AbstractC2128g.g(m10.getCoroutineContext(), new N(methodCall, this, null), interfaceC4988e);
    }

    public final String d1(String prefsKey) {
        ReentrantReadWriteLock reentrantReadWriteLock = f26724w;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Context context = this.applicationContext;
            if (context == null) {
                AbstractC4862t.p("applicationContext");
                context = null;
            }
            SharedPreferences sharedPreferencesA = T2.b.a(context);
            String string = sharedPreferencesA.getString(prefsKey, "{}");
            AbstractC4862t.b(sharedPreferencesA);
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.remove(prefsKey);
            editorEdit.apply();
            String str = string != null ? string : "{}";
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            return str;
        } catch (Throwable th) {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final void e1(String key, Integer value) {
        Context context = this.applicationContext;
        if (context == null) {
            AbstractC4862t.p("applicationContext");
            context = null;
        }
        SharedPreferences.Editor editorEdit = T2.b.a(context).edit();
        if (value != null) {
            editorEdit.putInt(key, value.intValue());
        } else {
            editorEdit.remove(key);
        }
        editorEdit.apply();
        Log.d("BackgroundDownloader", "Setting preference key " + key + " to " + value);
    }

    public final void m0(ActivityPluginBinding binding) {
        o0();
        this.activity = binding.getActivity();
        binding.addRequestPermissionsResultListener(this);
        binding.addActivityResultListener(this);
        binding.addOnNewIntentListener(new PluginRegistry.NewIntentListener() { // from class: Q4.f
            @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
            public final boolean onNewIntent(Intent intent) {
                return com.bbflight.background_downloader.a.n0(this.f13857a, intent);
            }
        });
        if (f26710i.isEmpty()) {
            Map notificationButtonText = f26710i;
            AbstractC4862t.d(notificationButtonText, "notificationButtonText");
            Activity activity = this.activity;
            AbstractC4862t.b(activity);
            notificationButtonText.put("Cancel", activity.getString(Q4.L.f13784a));
            Map notificationButtonText2 = f26710i;
            AbstractC4862t.d(notificationButtonText2, "notificationButtonText");
            Activity activity2 = this.activity;
            AbstractC4862t.b(activity2);
            notificationButtonText2.put("Pause", activity2.getString(Q4.L.f13787d));
            Map notificationButtonText3 = f26710i;
            AbstractC4862t.d(notificationButtonText3, "notificationButtonText");
            Activity activity3 = this.activity;
            AbstractC4862t.b(activity3);
            notificationButtonText3.put("Resume", activity3.getString(Q4.L.f13788e));
        }
    }

    public final void o0() {
        this.activity = null;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int requestCode, int resultCode, Intent data) {
        C1899t c1899t = C1899t.f13896a;
        Context context = this.applicationContext;
        Context context2 = null;
        if (context == null) {
            AbstractC4862t.p("applicationContext");
            context = null;
        }
        if (c1899t.a(context, requestCode, resultCode, data)) {
            return true;
        }
        C1904y c1904y = C1904y.f13915a;
        Context context3 = this.applicationContext;
        if (context3 == null) {
            AbstractC4862t.p("applicationContext");
        } else {
            context2 = context3;
        }
        return c1904y.b(context2, requestCode, resultCode, data);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        m0(binding);
        q0(binding.getActivity().getIntent());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        AbstractC4862t.e(flutterPluginBinding, "flutterPluginBinding");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        this.applicationContext = applicationContext;
        Context context = null;
        this.mainScope = Rd.N.a(U0.b(null, 1, null).plus(C2123d0.c()));
        this.defaultScope = Rd.N.a(U0.b(null, 1, null).plus(C2123d0.a()));
        this.binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.bbflight.background_downloader.background");
        this.backgroundChannel = methodChannel;
        if (f26711j == null) {
            f26711j = methodChannel;
        }
        MethodChannel methodChannel2 = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.bbflight.background_downloader");
        this.channel = methodChannel2;
        methodChannel2.setMethodCallHandler(this);
        new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.bbflight.background_downloader.uriutils").setMethodCallHandler(new u0(this));
        Context context2 = this.applicationContext;
        if (context2 == null) {
            AbstractC4862t.p("applicationContext");
            context2 = null;
        }
        SharedPreferences sharedPreferencesA = T2.b.a(context2);
        M.a aVar = I3.M.f5571a;
        Context context3 = this.applicationContext;
        if (context3 == null) {
            AbstractC4862t.p("applicationContext");
        } else {
            context = context3;
        }
        boolean zIsEmpty = ((List) aVar.a(context).f("BackgroundDownloader").get()).isEmpty();
        if (zIsEmpty) {
            ReentrantReadWriteLock reentrantReadWriteLock = f26724w;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i10 = 0; i10 < readHoldCount; i10++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                AbstractC4862t.b(sharedPreferencesA);
                SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
                editorEdit.remove("com.bbflight.background_downloader.taskMap.v2");
                editorEdit.apply();
                C4015H c4015h = C4015H.f34254a;
                int i11 = 0;
            } finally {
                for (int i12 = 0; i12 < readHoldCount; i12++) {
                    lock.lock();
                }
                writeLock.unlock();
            }
        }
        f26714m = (Q4.N) Q4.N.b().get(sharedPreferencesA.getInt("com.bbflight.background_downloader.requireWifi", 0));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        o0();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        o0();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        Rd.M m10 = this.mainScope;
        if (m10 == null) {
            AbstractC4862t.p("mainScope");
            m10 = null;
        }
        Rd.N.c(m10, null, 1, null);
        Rd.M m11 = this.defaultScope;
        if (m11 == null) {
            AbstractC4862t.p("defaultScope");
            m11 = null;
        }
        Rd.N.c(m11, null, 1, null);
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.channel = null;
        Map bgChannelByTaskId = f26712k;
        AbstractC4862t.d(bgChannelByTaskId, "bgChannelByTaskId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : bgChannelByTaskId.entrySet()) {
            if (!AbstractC4862t.a(entry.getValue(), this.backgroundChannel)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        f26712k = T.c(linkedHashMap);
        if (AbstractC4862t.a(f26711j, this.backgroundChannel)) {
            f26711j = null;
        }
        this.backgroundChannel = null;
        this.binaryMessenger = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Rd.M m10;
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        Rd.M m11 = this.mainScope;
        if (m11 == null) {
            AbstractC4862t.p("mainScope");
            m10 = null;
        } else {
            m10 = m11;
        }
        AbstractC2132i.d(m10, null, null, new O(call, this, result, null), 3, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        m0(binding);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        AbstractC4862t.e(permissions, "permissions");
        AbstractC4862t.e(grantResults, "grantResults");
        return i.f27255a.b(this, requestCode, grantResults);
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final Activity getActivity() {
        return this.activity;
    }

    public final boolean q0(Intent intent) {
        NotificationConfig notificationConfig;
        Activity activity;
        if (intent == null || !AbstractC4862t.a(intent.getAction(), NotificationReceiver.actionTap)) {
            return false;
        }
        String stringExtra = intent.getStringExtra(NotificationReceiver.keyTask);
        if (stringExtra == null) {
            return true;
        }
        int intExtra = intent.getIntExtra(NotificationReceiver.keyNotificationType, 0);
        int intExtra2 = intent.getIntExtra(NotificationReceiver.keyNotificationId, 0);
        Context context = null;
        if (stringExtra.length() > 0) {
            AbstractC2132i.d(Rd.N.a(C2123d0.a()), null, null, new C3119b(stringExtra, intExtra, null), 3, null);
            if (intExtra == Q4.G.complete.ordinal()) {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                Task task = (Task) aVar.a(Task.INSTANCE.serializer(), stringExtra);
                Bundle extras = intent.getExtras();
                String string = extras != null ? extras.getString(NotificationReceiver.keyNotificationConfig) : null;
                if (string != null) {
                    aVar.d();
                    notificationConfig = (NotificationConfig) aVar.a(NotificationConfig.INSTANCE.serializer(), string);
                } else {
                    notificationConfig = null;
                }
                if (notificationConfig != null && notificationConfig.getTapOpensFile() && (activity = this.activity) != null) {
                    AbstractC4862t.b(activity);
                    String strP = Task.p(task, activity, null, 2, null);
                    Activity activity2 = this.activity;
                    AbstractC4862t.b(activity2);
                    Q4.H.a(activity2, strP, Q.b(strP));
                }
            }
        }
        if (intExtra2 != 0 && (intExtra == Q4.G.complete.ordinal() || intExtra == Q4.G.error.ordinal())) {
            Context context2 = this.applicationContext;
            if (context2 == null) {
                AbstractC4862t.p("applicationContext");
            } else {
                context = context2;
            }
            NotificationManagerCompat.from(context).cancel(intExtra2);
        }
        return true;
    }

    public final Object r0(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
        Rd.M m10 = this.defaultScope;
        if (m10 == null) {
            AbstractC4862t.p("defaultScope");
            m10 = null;
        }
        return AbstractC2128g.g(m10.getCoroutineContext(), new C3120c(methodCall, this, null), interfaceC4988e);
    }

    public final Object s0(MethodCall methodCall, InterfaceC4988e interfaceC4988e) {
        Rd.M m10 = this.defaultScope;
        if (m10 == null) {
            AbstractC4862t.p("defaultScope");
            m10 = null;
        }
        return AbstractC2128g.g(m10.getCoroutineContext(), new C3121d(methodCall, this, null), interfaceC4988e);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t0(lc.InterfaceC4988e r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.bbflight.background_downloader.a.C3122e
            if (r0 == 0) goto L13
            r0 = r6
            com.bbflight.background_downloader.a$e r0 = (com.bbflight.background_downloader.a.C3122e) r0
            int r1 = r0.f26882l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26882l = r1
            goto L18
        L13:
            com.bbflight.background_downloader.a$e r0 = new com.bbflight.background_downloader.a$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f26880j
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f26882l
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            fc.AbstractC4036s.b(r6)
            goto L51
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            fc.AbstractC4036s.b(r6)
            Rd.M r5 = r5.defaultScope
            if (r5 != 0) goto L3f
            java.lang.String r5 = "defaultScope"
            kotlin.jvm.internal.AbstractC4862t.p(r5)
            r5 = r4
        L3f:
            lc.i r5 = r5.getCoroutineContext()
            com.bbflight.background_downloader.a$f r6 = new com.bbflight.background_downloader.a$f
            r6.<init>(r4)
            r0.f26882l = r3
            java.lang.Object r5 = Rd.AbstractC2128g.g(r5, r6, r0)
            if (r5 != r1) goto L51
            return r1
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.t0(lc.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u0(io.flutter.plugin.common.MethodCall r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.bbflight.background_downloader.a.C3124g
            if (r0 == 0) goto L13
            r0 = r7
            com.bbflight.background_downloader.a$g r0 = (com.bbflight.background_downloader.a.C3124g) r0
            int r1 = r0.f26887m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26887m = r1
            goto L18
        L13:
            com.bbflight.background_downloader.a$g r0 = new com.bbflight.background_downloader.a$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26885k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f26887m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.f26884j
            io.flutter.plugin.common.MethodCall r5 = (io.flutter.plugin.common.MethodCall) r5
            fc.AbstractC4036s.b(r7)
            goto L5b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            fc.AbstractC4036s.b(r7)
            Rd.M r7 = r5.defaultScope
            if (r7 != 0) goto L43
            java.lang.String r7 = "defaultScope"
            kotlin.jvm.internal.AbstractC4862t.p(r7)
            r7 = r4
        L43:
            lc.i r7 = r7.getCoroutineContext()
            com.bbflight.background_downloader.a$h r2 = new com.bbflight.background_downloader.a$h
            r2.<init>(r6, r4)
            java.lang.Object r5 = nc.l.a(r6)
            r0.f26884j = r5
            r0.f26887m = r3
            java.lang.Object r5 = Rd.AbstractC2128g.g(r7, r2, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.u0(io.flutter.plugin.common.MethodCall, lc.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v0(io.flutter.plugin.common.MethodCall r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.bbflight.background_downloader.a.C3126i
            if (r0 == 0) goto L13
            r0 = r7
            com.bbflight.background_downloader.a$i r0 = (com.bbflight.background_downloader.a.C3126i) r0
            int r1 = r0.f26894m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26894m = r1
            goto L18
        L13:
            com.bbflight.background_downloader.a$i r0 = new com.bbflight.background_downloader.a$i
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26892k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f26894m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.f26891j
            io.flutter.plugin.common.MethodCall r5 = (io.flutter.plugin.common.MethodCall) r5
            fc.AbstractC4036s.b(r7)
            goto L5b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            fc.AbstractC4036s.b(r7)
            Rd.M r7 = r5.defaultScope
            if (r7 != 0) goto L43
            java.lang.String r7 = "defaultScope"
            kotlin.jvm.internal.AbstractC4862t.p(r7)
            r7 = r4
        L43:
            lc.i r7 = r7.getCoroutineContext()
            com.bbflight.background_downloader.a$j r2 = new com.bbflight.background_downloader.a$j
            r2.<init>(r6, r5, r4)
            java.lang.Object r5 = nc.l.a(r6)
            r0.f26891j = r5
            r0.f26894m = r3
            java.lang.Object r5 = Rd.AbstractC2128g.g(r7, r2, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.v0(io.flutter.plugin.common.MethodCall, lc.e):java.lang.Object");
    }

    public final Object w0(MethodCall call) {
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        if (list.isEmpty()) {
            f26727z = null;
        } else {
            f fVar = f26727z;
            if (fVar == null) {
                Context context = this.applicationContext;
                if (context == null) {
                    AbstractC4862t.p("applicationContext");
                    context = null;
                }
                M.a aVar = I3.M.f5571a;
                Context context2 = this.applicationContext;
                if (context2 == null) {
                    AbstractC4862t.p("applicationContext");
                    context2 = null;
                }
                fVar = new f(context, aVar.a(context2));
            }
            f26727z = fVar;
            Object obj2 = list.get(0);
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Int");
            fVar.x(((Integer) obj2).intValue());
            f fVar2 = f26727z;
            if (fVar2 != null) {
                Object obj3 = list.get(1);
                AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Int");
                fVar2.z(((Integer) obj3).intValue());
            }
            f fVar3 = f26727z;
            if (fVar3 != null) {
                Object obj4 = list.get(2);
                AbstractC4862t.c(obj4, "null cannot be cast to non-null type kotlin.Int");
                fVar3.y(((Integer) obj4).intValue());
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x0(io.flutter.plugin.common.MethodCall r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.bbflight.background_downloader.a.C3128k
            if (r0 == 0) goto L13
            r0 = r7
            com.bbflight.background_downloader.a$k r0 = (com.bbflight.background_downloader.a.C3128k) r0
            int r1 = r0.f26901m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26901m = r1
            goto L18
        L13:
            com.bbflight.background_downloader.a$k r0 = new com.bbflight.background_downloader.a$k
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26899k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f26901m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.f26898j
            io.flutter.plugin.common.MethodCall r5 = (io.flutter.plugin.common.MethodCall) r5
            fc.AbstractC4036s.b(r7)
            goto L5b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            fc.AbstractC4036s.b(r7)
            Rd.M r7 = r5.defaultScope
            if (r7 != 0) goto L43
            java.lang.String r7 = "defaultScope"
            kotlin.jvm.internal.AbstractC4862t.p(r7)
            r7 = r4
        L43:
            lc.i r7 = r7.getCoroutineContext()
            com.bbflight.background_downloader.a$l r2 = new com.bbflight.background_downloader.a$l
            r2.<init>(r6, r4)
            java.lang.Object r5 = nc.l.a(r6)
            r0.f26898j = r5
            r0.f26901m = r3
            java.lang.Object r5 = Rd.AbstractC2128g.g(r7, r2, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.x0(io.flutter.plugin.common.MethodCall, lc.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y0(io.flutter.plugin.common.MethodCall r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.bbflight.background_downloader.a.C3130m
            if (r0 == 0) goto L13
            r0 = r7
            com.bbflight.background_downloader.a$m r0 = (com.bbflight.background_downloader.a.C3130m) r0
            int r1 = r0.f26908m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26908m = r1
            goto L18
        L13:
            com.bbflight.background_downloader.a$m r0 = new com.bbflight.background_downloader.a$m
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26906k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f26908m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.f26905j
            io.flutter.plugin.common.MethodCall r5 = (io.flutter.plugin.common.MethodCall) r5
            fc.AbstractC4036s.b(r7)
            goto L5b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            fc.AbstractC4036s.b(r7)
            Rd.M r7 = r5.defaultScope
            if (r7 != 0) goto L43
            java.lang.String r7 = "defaultScope"
            kotlin.jvm.internal.AbstractC4862t.p(r7)
            r7 = r4
        L43:
            lc.i r7 = r7.getCoroutineContext()
            com.bbflight.background_downloader.a$n r2 = new com.bbflight.background_downloader.a$n
            r2.<init>(r6, r4)
            java.lang.Object r5 = nc.l.a(r6)
            r0.f26905j = r5
            r0.f26908m = r3
            java.lang.Object r5 = Rd.AbstractC2128g.g(r7, r2, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.y0(io.flutter.plugin.common.MethodCall, lc.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z0(io.flutter.plugin.common.MethodCall r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.bbflight.background_downloader.a.C3132o
            if (r0 == 0) goto L13
            r0 = r7
            com.bbflight.background_downloader.a$o r0 = (com.bbflight.background_downloader.a.C3132o) r0
            int r1 = r0.f26915m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26915m = r1
            goto L18
        L13:
            com.bbflight.background_downloader.a$o r0 = new com.bbflight.background_downloader.a$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26913k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f26915m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.f26912j
            io.flutter.plugin.common.MethodCall r5 = (io.flutter.plugin.common.MethodCall) r5
            fc.AbstractC4036s.b(r7)
            goto L5b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            fc.AbstractC4036s.b(r7)
            Rd.M r7 = r5.defaultScope
            if (r7 != 0) goto L43
            java.lang.String r7 = "defaultScope"
            kotlin.jvm.internal.AbstractC4862t.p(r7)
            r7 = r4
        L43:
            lc.i r7 = r7.getCoroutineContext()
            com.bbflight.background_downloader.a$p r2 = new com.bbflight.background_downloader.a$p
            r2.<init>(r6, r4)
            java.lang.Object r5 = nc.l.a(r6)
            r0.f26912j = r5
            r0.f26915m = r3
            java.lang.Object r5 = Rd.AbstractC2128g.g(r7, r2, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.a.z0(io.flutter.plugin.common.MethodCall, lc.e):java.lang.Object");
    }
}
