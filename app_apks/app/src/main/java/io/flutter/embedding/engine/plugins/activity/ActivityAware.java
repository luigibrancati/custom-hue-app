package io.flutter.embedding.engine.plugins.activity;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ActivityAware {
    void onAttachedToActivity(ActivityPluginBinding activityPluginBinding);

    void onDetachedFromActivity();

    void onDetachedFromActivityForConfigChanges();

    void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding);
}
