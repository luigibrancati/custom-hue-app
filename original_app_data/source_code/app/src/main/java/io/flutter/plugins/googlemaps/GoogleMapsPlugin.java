package io.flutter.plugins.googlemaps;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.C2759o;
import androidx.lifecycle.InterfaceC2758n;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.lifecycle.FlutterLifecycleAdapter;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class GoogleMapsPlugin implements FlutterPlugin, ActivityAware {
    private static final String VIEW_TYPE = "plugins.flutter.dev/google_maps_android";
    AbstractC2754j lifecycle;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.lifecycle = FlutterLifecycleAdapter.getActivityLifecycle(activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        flutterPluginBinding.getPlatformViewRegistry().registerViewFactory(VIEW_TYPE, new GoogleMapFactory(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext(), new LifecycleProvider() { // from class: io.flutter.plugins.googlemaps.GoogleMapsPlugin.1
            @Override // io.flutter.plugins.googlemaps.LifecycleProvider
            public AbstractC2754j getLifecycle() {
                return GoogleMapsPlugin.this.lifecycle;
            }
        }));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.lifecycle = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ProxyLifecycleProvider implements Application.ActivityLifecycleCallbacks, InterfaceC2758n, LifecycleProvider {
        private final C2759o lifecycle = new C2759o(this);
        private final int registrarActivityHashCode;

        public ProxyLifecycleProvider(Activity activity) {
            this.registrarActivityHashCode = activity.hashCode();
            activity.getApplication().registerActivityLifecycleCallbacks(this);
        }

        @Override // androidx.lifecycle.InterfaceC2758n
        public AbstractC2754j getLifecycle() {
            return this.lifecycle;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity.hashCode() != this.registrarActivityHashCode) {
                return;
            }
            this.lifecycle.h(AbstractC2754j.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity.hashCode() != this.registrarActivityHashCode) {
                return;
            }
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
            this.lifecycle.h(AbstractC2754j.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (activity.hashCode() != this.registrarActivityHashCode) {
                return;
            }
            this.lifecycle.h(AbstractC2754j.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity.hashCode() != this.registrarActivityHashCode) {
                return;
            }
            this.lifecycle.h(AbstractC2754j.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (activity.hashCode() != this.registrarActivityHashCode) {
                return;
            }
            this.lifecycle.h(AbstractC2754j.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (activity.hashCode() != this.registrarActivityHashCode) {
                return;
            }
            this.lifecycle.h(AbstractC2754j.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
