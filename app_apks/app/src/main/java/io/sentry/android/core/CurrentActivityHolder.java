package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class CurrentActivityHolder {
    private static final CurrentActivityHolder instance = new CurrentActivityHolder();
    private WeakReference<Activity> currentActivity;

    private CurrentActivityHolder() {
    }

    public static CurrentActivityHolder getInstance() {
        return instance;
    }

    public void clearActivity() {
        this.currentActivity = null;
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.currentActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void setActivity(Activity activity) {
        WeakReference<Activity> weakReference = this.currentActivity;
        if (weakReference == null || weakReference.get() != activity) {
            this.currentActivity = new WeakReference<>(activity);
        }
    }

    public void clearActivity(Activity activity) {
        WeakReference<Activity> weakReference = this.currentActivity;
        if (weakReference == null || weakReference.get() == activity) {
            this.currentActivity = null;
        }
    }
}
