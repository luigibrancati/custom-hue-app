package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.lifecycle.AbstractC2754j;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterLifecycleAdapter {
    public static AbstractC2754j getActivityLifecycle(ActivityPluginBinding activityPluginBinding) {
        return ((HiddenLifecycleReference) activityPluginBinding.getLifecycle()).getLifecycle();
    }
}
