package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.SentryOptions;
import io.sentry.SpanStatus;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryWindowCallback extends WindowCallbackAdapter {
    private final Window.Callback delegate;
    private final GestureDetectorCompat gestureDetector;
    private final SentryGestureListener gestureListener;
    private final MotionEventObtainer motionEventObtainer;
    private final SentryOptions options;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface MotionEventObtainer {
        default MotionEvent obtain(MotionEvent motionEvent) {
            return MotionEvent.obtain(motionEvent);
        }
    }

    public SentryWindowCallback(Window.Callback callback, Context context, SentryGestureListener sentryGestureListener, SentryOptions sentryOptions) {
        this(callback, new GestureDetectorCompat(context, sentryGestureListener, new Handler(Looper.getMainLooper())), sentryGestureListener, sentryOptions, new MotionEventObtainer() { // from class: io.sentry.android.core.internal.gestures.SentryWindowCallback.1
        });
    }

    private void handleTouchEvent(MotionEvent motionEvent) {
        this.gestureDetector.a(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            this.gestureListener.onUp(motionEvent);
        }
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            try {
                handleTouchEvent(this.motionEventObtainer.obtain(motionEvent));
            } finally {
                try {
                } finally {
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Window.Callback getDelegate() {
        return this.delegate;
    }

    public void stopTracking() {
        this.gestureListener.stopTracing(SpanStatus.CANCELLED);
    }

    public SentryWindowCallback(Window.Callback callback, GestureDetectorCompat gestureDetectorCompat, SentryGestureListener sentryGestureListener, SentryOptions sentryOptions, MotionEventObtainer motionEventObtainer) {
        super(callback);
        this.delegate = callback;
        this.gestureListener = sentryGestureListener;
        this.options = sentryOptions;
        this.gestureDetector = gestureDetectorCompat;
        this.motionEventObtainer = motionEventObtainer;
    }
}
