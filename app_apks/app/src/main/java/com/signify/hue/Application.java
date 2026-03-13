package com.signify.hue;

import Ib.f;
import Jb.d;
import bc.AbstractC2904a;
import com.braze.Braze;
import com.braze.BrazeActivityLifecycleCallbackListener;
import com.braze.configuration.BrazeConfig;
import com.braze.support.BrazeLogger;
import com.signify.geofence.GeofenceTransitionsIntentService;
import com.signify.hue.Application;
import fc.C4015H;
import io.flutter.app.FlutterApplication;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;
import vc.l;
import za.j;
import za.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/signify/hue/Application;", "Lio/flutter/app/FlutterApplication;", "Lza/p;", "<init>", "()V", "Lfc/H;", "applyFeatureConfig", "Lorg/json/JSONObject;", "featureConfig", "configureBrazeLogging", "(Lorg/json/JSONObject;)V", "configureBrazeEnvironment", "onCreate", "Lio/flutter/embedding/engine/FlutterEngine;", "engine", "registerWith", "(Lio/flutter/embedding/engine/FlutterEngine;)V", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Application extends FlutterApplication implements p {
    private static final String BRAZE_ENVIRONMENT_KEY = "braze_development_environment";
    private static final String BRAZE_LOGGING_KEY = "braze_verbose_logging";
    private static final String FEATURE_TOGGLES_KEY = "flutter.feature_toggles";
    private static final String SHARED_PREFERENCES_KEY = "FlutterSharedPreferences";

    private final void applyFeatureConfig() {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
        AbstractC4862t.d(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: Aa.a
            @Override // java.lang.Runnable
            public final void run() {
                Application.applyFeatureConfig$lambda$2(this.f261a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyFeatureConfig$lambda$2(Application application) {
        String string = application.getSharedPreferences("FlutterSharedPreferences", 0).getString(FEATURE_TOGGLES_KEY, "{}");
        JSONObject jSONObject = new JSONObject(string != null ? string : "{}");
        application.configureBrazeLogging(jSONObject);
        application.configureBrazeEnvironment(jSONObject);
    }

    private final void configureBrazeEnvironment(JSONObject featureConfig) {
        if (featureConfig.has(BRAZE_ENVIRONMENT_KEY) ? featureConfig.getJSONObject(BRAZE_ENVIRONMENT_KEY).getBoolean("value") : false) {
            BrazeConfig brazeConfigBuild = new BrazeConfig.Builder().setApiKey("c0626240-cac2-4a7e-9ca9-0256346dbfd1").setCustomEndpoint("sdk.iad-03.braze.com").build();
            Braze.Companion companion = Braze.INSTANCE;
            companion.disableSdk(this);
            companion.configure(this, brazeConfigBuild);
            companion.enableSdk(this);
        }
    }

    private final void configureBrazeLogging(JSONObject featureConfig) {
        BrazeLogger.setLogLevel(featureConfig.has(BRAZE_LOGGING_KEY) ? featureConfig.getJSONObject(BRAZE_LOGGING_KEY).getBoolean("value") : false ? 2 : 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onCreate$lambda$0(Throwable th) throws Throwable {
        if (th instanceof f) {
            return C4015H.f34254a;
        }
        throw th;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        final l lVar = new l() { // from class: Aa.b
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Application.onCreate$lambda$0((Throwable) obj);
            }
        };
        AbstractC2904a.y(new d() { // from class: Aa.c
            @Override // Jb.d
            public final void accept(Object obj) {
                lVar.invoke(obj);
            }
        });
        registerActivityLifecycleCallbacks(new BrazeActivityLifecycleCallbackListener(false, false, null, null, 15, null));
        GeofenceTransitionsIntentService.INSTANCE.a(this);
        new j().a(this);
        applyFeatureConfig();
    }

    @Override // za.p
    public void registerWith(FlutterEngine engine) {
        AbstractC4862t.e(engine, "engine");
        GeneratedPluginRegistrant.registerWith(engine);
    }
}
