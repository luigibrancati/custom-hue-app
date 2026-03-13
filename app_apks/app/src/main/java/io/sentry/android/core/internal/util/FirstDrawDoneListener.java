package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.android.core.internal.gestures.NoOpWindowCallback;
import io.sentry.android.core.performance.WindowContentChangedCallback;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FirstDrawDoneListener implements ViewTreeObserver.OnDrawListener {
    private final Runnable callback;
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());
    private final AtomicReference<View> viewReference;

    private FirstDrawDoneListener(View view, Runnable runnable) {
        this.viewReference = new AtomicReference<>(view);
        this.callback = runnable;
    }

    public static /* synthetic */ void a(FirstDrawDoneListener firstDrawDoneListener, View view) {
        firstDrawDoneListener.getClass();
        view.getViewTreeObserver().removeOnDrawListener(firstDrawDoneListener);
    }

    public static /* synthetic */ void b(Window window, Window.Callback callback, Runnable runnable, BuildInfoProvider buildInfoProvider) {
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            window.setCallback(callback);
            registerForNextDraw(viewPeekDecorView, runnable, buildInfoProvider);
        }
    }

    private static boolean isAliveAndAttached(View view) {
        return view.getViewTreeObserver().isAlive() && view.isAttachedToWindow();
    }

    public static void registerForNextDraw(Activity activity, final Runnable runnable, final BuildInfoProvider buildInfoProvider) {
        final Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                registerForNextDraw(viewPeekDecorView, runnable, buildInfoProvider);
            } else {
                final Window.Callback callback = window.getCallback();
                window.setCallback(new WindowContentChangedCallback(callback != null ? callback : new NoOpWindowCallback(), new Runnable() { // from class: io.sentry.android.core.internal.util.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        FirstDrawDoneListener.b(window, callback, runnable, buildInfoProvider);
                    }
                }));
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View andSet = this.viewReference.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.g
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                FirstDrawDoneListener.a(this.f38557a, andSet);
            }
        });
        this.mainThreadHandler.postAtFrontOfQueue(this.callback);
    }

    public static void registerForNextDraw(View view, Runnable runnable, BuildInfoProvider buildInfoProvider) {
        FirstDrawDoneListener firstDrawDoneListener = new FirstDrawDoneListener(view, runnable);
        if (buildInfoProvider.getSdkInfoVersion() < 26 && !isAliveAndAttached(view)) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: io.sentry.android.core.internal.util.FirstDrawDoneListener.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    view2.getViewTreeObserver().addOnDrawListener(FirstDrawDoneListener.this);
                    view2.removeOnAttachStateChangeListener(this);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                }
            });
        } else {
            view.getViewTreeObserver().addOnDrawListener(firstDrawDoneListener);
        }
    }
}
