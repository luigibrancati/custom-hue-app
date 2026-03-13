package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import fc.C4015H;
import gc.y;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.OnRootViewsChangedListener;
import io.sentry.android.replay.WindowsKt;
import io.sentry.android.replay.util.FixedWindowCallback;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.util.AutoClosableReentrantLock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import tc.AbstractC5877a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R0\u0010\u0019\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00170\u0016j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0017`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lio/sentry/android/replay/gestures/GestureRecorder;", "Lio/sentry/android/replay/OnRootViewsChangedListener;", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/android/replay/gestures/TouchRecorderCallback;", "touchRecorderCallback", "<init>", "(Lio/sentry/SentryOptions;Lio/sentry/android/replay/gestures/TouchRecorderCallback;)V", "Landroid/view/View;", "Lfc/H;", "startGestureTracking", "(Landroid/view/View;)V", "stopGestureTracking", "root", "", "added", "onRootViewsChanged", "(Landroid/view/View;Z)V", "stop", "()V", "Lio/sentry/SentryOptions;", "Lio/sentry/android/replay/gestures/TouchRecorderCallback;", "Ljava/util/ArrayList;", "Ljava/lang/ref/WeakReference;", "Lkotlin/collections/ArrayList;", "rootViews", "Ljava/util/ArrayList;", "Lio/sentry/util/AutoClosableReentrantLock;", "rootViewsLock", "Lio/sentry/util/AutoClosableReentrantLock;", "SentryReplayGestureRecorder", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GestureRecorder implements OnRootViewsChangedListener {
    public static final int $stable = 8;
    private final SentryOptions options;
    private final ArrayList<WeakReference<View>> rootViews;
    private final AutoClosableReentrantLock rootViewsLock;
    private final TouchRecorderCallback touchRecorderCallback;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/sentry/android/replay/gestures/GestureRecorder$SentryReplayGestureRecorder;", "Lio/sentry/android/replay/util/FixedWindowCallback;", RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/SentryOptions;", "touchRecorderCallback", "Lio/sentry/android/replay/gestures/TouchRecorderCallback;", "delegate", "Landroid/view/Window$Callback;", "(Lio/sentry/SentryOptions;Lio/sentry/android/replay/gestures/TouchRecorderCallback;Landroid/view/Window$Callback;)V", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SentryReplayGestureRecorder extends FixedWindowCallback {
        public static final int $stable = 8;
        private final SentryOptions options;
        private final TouchRecorderCallback touchRecorderCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SentryReplayGestureRecorder(SentryOptions options, TouchRecorderCallback touchRecorderCallback, Window.Callback callback) {
            super(callback);
            AbstractC4862t.e(options, "options");
            this.options = options;
            this.touchRecorderCallback = touchRecorderCallback;
        }

        @Override // io.sentry.android.replay.util.FixedWindowCallback, android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent event) {
            if (event != null) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(event);
                AbstractC4862t.d(motionEventObtainNoHistory, "obtainNoHistory(...)");
                try {
                    TouchRecorderCallback touchRecorderCallback = this.touchRecorderCallback;
                    if (touchRecorderCallback != null) {
                        touchRecorderCallback.onTouchEvent(motionEventObtainNoHistory);
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
            return super.dispatchTouchEvent(event);
        }
    }

    public GestureRecorder(SentryOptions options, TouchRecorderCallback touchRecorderCallback) {
        AbstractC4862t.e(options, "options");
        AbstractC4862t.e(touchRecorderCallback, "touchRecorderCallback");
        this.options = options;
        this.touchRecorderCallback = touchRecorderCallback;
        this.rootViews = new ArrayList<>();
        this.rootViewsLock = new AutoClosableReentrantLock();
    }

    private final void startGestureTracking(View view) {
        Window phoneWindow = WindowsKt.getPhoneWindow(view);
        if (phoneWindow == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
            return;
        }
        Window.Callback callback = phoneWindow.getCallback();
        if (callback instanceof SentryReplayGestureRecorder) {
            return;
        }
        phoneWindow.setCallback(new SentryReplayGestureRecorder(this.options, this.touchRecorderCallback, callback));
    }

    private final void stopGestureTracking(View view) {
        Window phoneWindow = WindowsKt.getPhoneWindow(view);
        if (phoneWindow == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = phoneWindow.getCallback();
        if (callback instanceof SentryReplayGestureRecorder) {
            phoneWindow.setCallback(((SentryReplayGestureRecorder) callback).delegate);
        }
    }

    @Override // io.sentry.android.replay.OnRootViewsChangedListener
    public void onRootViewsChanged(View root, boolean added) throws Exception {
        AbstractC4862t.e(root, "root");
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.rootViewsLock.acquire();
        try {
            if (added) {
                this.rootViews.add(new WeakReference<>(root));
                startGestureTracking(root);
                C4015H c4015h = C4015H.f34254a;
            } else {
                stopGestureTracking(root);
                y.I(this.rootViews, new GestureRecorder$onRootViewsChanged$1$1(root));
            }
            AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
        } finally {
        }
    }

    public final void stop() throws Exception {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.rootViewsLock.acquire();
        try {
            Iterator<T> it = this.rootViews.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    AbstractC4862t.b(view);
                    stopGestureTracking(view);
                }
            }
            this.rootViews.clear();
            C4015H c4015h = C4015H.f34254a;
            AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
        } finally {
        }
    }
}
