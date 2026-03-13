package io.flutter.plugin.platform;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface PlatformView {
    void dispose();

    View getView();

    @SuppressLint({"NewApi"})
    default void onFlutterViewDetached() {
    }

    @SuppressLint({"NewApi"})
    default void onInputConnectionLocked() {
    }

    @SuppressLint({"NewApi"})
    default void onInputConnectionUnlocked() {
    }

    @SuppressLint({"NewApi"})
    default void onFlutterViewAttached(View view) {
    }
}
