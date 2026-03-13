package org.webrtc;

import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public final class RenderSynchronizer {
    private static final float DEFAULT_TARGET_FPS = 30.0f;
    private static final String TAG = "RenderSynchronizer";
    private Choreographer choreographer;
    private boolean isListening;
    private long lastOpenedTimeNanos;
    private long lastRefreshTimeNanos;
    private final List<Listener> listeners;
    private final Object lock;
    private final Handler mainThreadHandler;
    private boolean renderWindowOpen;
    private final long targetFrameIntervalNanos;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface Listener {
        void onRenderWindowClose();

        void onRenderWindowOpen();
    }

    public RenderSynchronizer(float f10) {
        this.lock = new Object();
        this.listeners = new CopyOnWriteArrayList();
        this.targetFrameIntervalNanos = Math.round(TimeUnit.SECONDS.toNanos(1L) / f10);
        Handler handler = new Handler(Looper.getMainLooper());
        this.mainThreadHandler = handler;
        handler.post(new Runnable() { // from class: org.webrtc.P
            @Override // java.lang.Runnable
            public final void run() {
                this.f41651a.lambda$new$0();
            }
        });
        Logging.d(TAG, "Created");
    }

    private void closeRenderWindow() {
        this.renderWindowOpen = false;
        traceRenderWindowChange();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderWindowClose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.choreographer = Choreographer.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerListener$1() {
        this.choreographer.postFrameCallback(new O(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDisplayRefreshCycleBegin(long j10) {
        synchronized (this.lock) {
            try {
                if (this.listeners.isEmpty()) {
                    Logging.d(TAG, "No listeners, unsubscribing to frame callbacks");
                    this.isListening = false;
                    return;
                }
                this.choreographer.postFrameCallback(new O(this));
                long j11 = j10 - this.lastOpenedTimeNanos;
                long j12 = j10 - this.lastRefreshTimeNanos;
                this.lastRefreshTimeNanos = j10;
                if (Math.abs(j11 - this.targetFrameIntervalNanos) < Math.abs((j11 - this.targetFrameIntervalNanos) + j12)) {
                    this.lastOpenedTimeNanos = j10;
                    openRenderWindow();
                } else if (this.renderWindowOpen) {
                    closeRenderWindow();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void openRenderWindow() {
        this.renderWindowOpen = true;
        traceRenderWindowChange();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderWindowOpen();
        }
    }

    private void traceRenderWindowChange() {
        Trace.setCounter("RenderWindow", this.renderWindowOpen ? 1L : 0L);
    }

    public void registerListener(Listener listener) {
        this.listeners.add(listener);
        synchronized (this.lock) {
            try {
                if (!this.isListening) {
                    Logging.d(TAG, "First listener, subscribing to frame callbacks");
                    this.isListening = true;
                    this.mainThreadHandler.post(new Runnable() { // from class: org.webrtc.N
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f41649a.lambda$registerListener$1();
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public RenderSynchronizer() {
        this(DEFAULT_TARGET_FPS);
    }
}
