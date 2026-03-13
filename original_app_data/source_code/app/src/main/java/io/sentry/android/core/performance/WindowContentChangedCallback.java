package io.sentry.android.core.performance;

import android.view.Window;
import io.sentry.android.core.internal.gestures.WindowCallbackAdapter;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class WindowContentChangedCallback extends WindowCallbackAdapter {
    private final Runnable callback;

    public WindowContentChangedCallback(Window.Callback callback, Runnable runnable) {
        super(callback);
        this.callback = runnable;
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        this.callback.run();
    }
}
