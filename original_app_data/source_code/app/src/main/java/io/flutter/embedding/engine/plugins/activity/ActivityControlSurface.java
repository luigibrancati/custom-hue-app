package io.flutter.embedding.engine.plugins.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2754j;
import io.flutter.embedding.android.ExclusiveAppComponent;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ActivityControlSurface {
    void attachToActivity(ExclusiveAppComponent<Activity> exclusiveAppComponent, AbstractC2754j abstractC2754j);

    void detachFromActivity();

    void detachFromActivityForConfigChanges();

    boolean onActivityResult(int i10, int i11, Intent intent);

    void onNewIntent(Intent intent);

    boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);

    void onRestoreInstanceState(Bundle bundle);

    void onSaveInstanceState(Bundle bundle);

    void onUserLeaveHint();
}
