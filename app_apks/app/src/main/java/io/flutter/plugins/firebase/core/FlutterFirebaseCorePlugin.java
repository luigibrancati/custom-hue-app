package io.flutter.plugins.firebase.core;

import android.content.Context;
import android.os.Looper;
import b7.C2878l;
import b7.InterfaceC2872f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h8.C4288f;
import h8.n;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterFirebaseCorePlugin implements FlutterPlugin, GeneratedAndroidFirebaseCore.FirebaseCoreHostApi, GeneratedAndroidFirebaseCore.FirebaseAppHostApi {
    public static Map<String, String> customAuthDomain = new HashMap();
    private Context applicationContext;
    private boolean coreInitialized = false;

    private Task<GeneratedAndroidFirebaseCore.CoreInitializeResponse> firebaseAppToMap(final C4288f c4288f) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f37710a.lambda$firebaseAppToMap$0(c4288f, c2878l);
            }
        });
        return c2878l.a();
    }

    private GeneratedAndroidFirebaseCore.CoreFirebaseOptions firebaseOptionsToMap(h8.n nVar) {
        GeneratedAndroidFirebaseCore.CoreFirebaseOptions.Builder builder = new GeneratedAndroidFirebaseCore.CoreFirebaseOptions.Builder();
        builder.setApiKey(nVar.b());
        builder.setAppId(nVar.c());
        if (nVar.f() != null) {
            builder.setMessagingSenderId(nVar.f());
        }
        if (nVar.g() != null) {
            builder.setProjectId(nVar.g());
        }
        builder.setDatabaseURL(nVar.d());
        builder.setStorageBucket(nVar.h());
        builder.setTrackingId(nVar.e());
        return builder.build();
    }

    public static /* synthetic */ void g(String str, Boolean bool, C2878l c2878l) {
        try {
            C4288f.p(str).C(bool.booleanValue());
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    public static /* synthetic */ void h(GeneratedAndroidFirebaseCore.VoidResult voidResult, Task task) {
        if (task.q()) {
            voidResult.success();
        } else {
            voidResult.error(task.l());
        }
    }

    public static /* synthetic */ void i(String str, Boolean bool, C2878l c2878l) {
        try {
            C4288f.p(str).D(bool);
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$firebaseAppToMap$0(C4288f c4288f, C2878l c2878l) {
        try {
            GeneratedAndroidFirebaseCore.CoreInitializeResponse.Builder builder = new GeneratedAndroidFirebaseCore.CoreInitializeResponse.Builder();
            builder.setName(c4288f.q());
            builder.setOptions(firebaseOptionsToMap(c4288f.r()));
            builder.setIsAutomaticDataCollectionEnabled(Boolean.valueOf(c4288f.x()));
            builder.setPluginConstants((Map) Tasks.await(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(c4288f)));
            c2878l.c(builder.build());
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeApp$3(GeneratedAndroidFirebaseCore.CoreFirebaseOptions coreFirebaseOptions, String str, C2878l c2878l) {
        try {
            h8.n nVarA = new n.b().b(coreFirebaseOptions.getApiKey()).c(coreFirebaseOptions.getAppId()).d(coreFirebaseOptions.getDatabaseURL()).f(coreFirebaseOptions.getMessagingSenderId()).g(coreFirebaseOptions.getProjectId()).h(coreFirebaseOptions.getStorageBucket()).e(coreFirebaseOptions.getTrackingId()).a();
            try {
                Looper.prepare();
            } catch (Exception unused) {
            }
            if (coreFirebaseOptions.getAuthDomain() != null) {
                customAuthDomain.put(str, coreFirebaseOptions.getAuthDomain());
            }
            c2878l.c((GeneratedAndroidFirebaseCore.CoreInitializeResponse) Tasks.await(firebaseAppToMap(C4288f.w(this.applicationContext, nVarA, str))));
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeCore$4(C2878l c2878l) {
        try {
            if (this.coreInitialized) {
                Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            } else {
                this.coreInitialized = true;
            }
            List listN = C4288f.n(this.applicationContext);
            ArrayList arrayList = new ArrayList(listN.size());
            Iterator it = listN.iterator();
            while (it.hasNext()) {
                arrayList.add((GeneratedAndroidFirebaseCore.CoreInitializeResponse) Tasks.await(firebaseAppToMap((C4288f) it.next())));
            }
            c2878l.c(arrayList);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$optionsFromResource$5(C2878l c2878l) {
        try {
            h8.n nVarA = h8.n.a(this.applicationContext);
            if (nVarA == null) {
                c2878l.b(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
            } else {
                c2878l.c(firebaseOptionsToMap(nVarA));
            }
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    private <T> void listenToResponse(C2878l c2878l, final GeneratedAndroidFirebaseCore.Result<T> result) {
        c2878l.a().b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.core.g
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FlutterFirebaseCorePlugin.o(result, task);
            }
        });
    }

    private void listenToVoidResponse(C2878l c2878l, final GeneratedAndroidFirebaseCore.VoidResult voidResult) {
        c2878l.a().b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.core.e
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FlutterFirebaseCorePlugin.h(voidResult, task);
            }
        });
    }

    public static /* synthetic */ void m(String str, C2878l c2878l) {
        try {
            try {
                C4288f.p(str).j();
            } catch (IllegalStateException unused) {
            }
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    public static /* synthetic */ void o(GeneratedAndroidFirebaseCore.Result result, Task task) {
        if (task.q()) {
            result.success(task.m());
        } else {
            result.error(task.l());
        }
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi
    public void delete(final String str, GeneratedAndroidFirebaseCore.VoidResult voidResult) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.f
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCorePlugin.m(str, c2878l);
            }
        });
        listenToVoidResponse(c2878l, voidResult);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi
    public void initializeApp(final String str, final GeneratedAndroidFirebaseCore.CoreFirebaseOptions coreFirebaseOptions, GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.CoreInitializeResponse> result) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f37692a.lambda$initializeApp$3(coreFirebaseOptions, str, c2878l);
            }
        });
        listenToResponse(c2878l, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi
    public void initializeCore(GeneratedAndroidFirebaseCore.Result<List<GeneratedAndroidFirebaseCore.CoreInitializeResponse>> result) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f37708a.lambda$initializeCore$4(c2878l);
            }
        });
        listenToResponse(c2878l, result);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.setUp(flutterPluginBinding.getBinaryMessenger(), this);
        GeneratedAndroidFirebaseCore.FirebaseAppHostApi.setUp(flutterPluginBinding.getBinaryMessenger(), this);
        this.applicationContext = flutterPluginBinding.getApplicationContext();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.applicationContext = null;
        GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.setUp(flutterPluginBinding.getBinaryMessenger(), null);
        GeneratedAndroidFirebaseCore.FirebaseAppHostApi.setUp(flutterPluginBinding.getBinaryMessenger(), null);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi
    public void optionsFromResource(GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.CoreFirebaseOptions> result) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f37702a.lambda$optionsFromResource$5(c2878l);
            }
        });
        listenToResponse(c2878l, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi
    public void setAutomaticDataCollectionEnabled(final String str, final Boolean bool, GeneratedAndroidFirebaseCore.VoidResult voidResult) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.c
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCorePlugin.i(str, bool, c2878l);
            }
        });
        listenToVoidResponse(c2878l, voidResult);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi
    public void setAutomaticResourceManagementEnabled(final String str, final Boolean bool, GeneratedAndroidFirebaseCore.VoidResult voidResult) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.b
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCorePlugin.g(str, bool, c2878l);
            }
        });
        listenToVoidResponse(c2878l, voidResult);
    }
}
