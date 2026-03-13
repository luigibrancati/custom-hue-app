package io.flutter.plugin.editing;

import Y0.E;
import Y0.S;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import androidx.annotation.Keep;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Keep
@SuppressLint({"NewApi", "Override"})
class ImeSyncDeferringInsetsCallback {
    private ImeVisibilityListener imeVisibilityListener;
    private WindowInsets lastWindowInsets;
    private View view;
    private final int deferredInsetTypes = WindowInsets.Type.ime();
    private boolean animating = false;
    private boolean needsSave = false;
    private AnimationCallback animationCallback = new AnimationCallback();
    private InsetsListener insetsListener = new InsetsListener();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Keep
    public class AnimationCallback extends WindowInsetsAnimation.Callback {
        public AnimationCallback() {
            super(1);
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
            if (ImeSyncDeferringInsetsCallback.this.animating && (windowInsetsAnimation.getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                ImeSyncDeferringInsetsCallback.this.animating = false;
                if (ImeSyncDeferringInsetsCallback.this.lastWindowInsets != null && ImeSyncDeferringInsetsCallback.this.view != null) {
                    ImeSyncDeferringInsetsCallback.this.view.dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                }
            }
            S sB = E.B(ImeSyncDeferringInsetsCallback.this.view);
            if (sB == null || ImeSyncDeferringInsetsCallback.this.imeVisibilityListener == null) {
                return;
            }
            ImeSyncDeferringInsetsCallback.this.imeVisibilityListener.onImeVisibilityChanged(sB.o(S.o.c()));
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
            ImeSyncDeferringInsetsCallback.this.needsSave = true;
            if ((windowInsetsAnimation.getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                ImeSyncDeferringInsetsCallback.this.animating = true;
            }
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
            if (ImeSyncDeferringInsetsCallback.this.animating && !ImeSyncDeferringInsetsCallback.this.needsSave) {
                Iterator<WindowInsetsAnimation> it = list.iterator();
                boolean z10 = false;
                while (it.hasNext()) {
                    if ((it.next().getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                        z10 = true;
                    }
                }
                if (z10) {
                    int windowSystemUiVisibility = ImeSyncDeferringInsetsCallback.this.view.getWindowSystemUiVisibility();
                    int i10 = ((windowSystemUiVisibility & 512) == 0 && (windowSystemUiVisibility & 2) == 0) ? windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom : 0;
                    WindowInsets.Builder builder = new WindowInsets.Builder(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                    builder.setInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes, Insets.of(0, 0, 0, Math.max(windowInsets.getInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes).bottom - i10, 0)));
                    ImeSyncDeferringInsetsCallback.this.view.onApplyWindowInsets(builder.build());
                }
            }
            return windowInsets;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ImeVisibilityListener {
        void onImeVisibilityChanged(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class InsetsListener implements View.OnApplyWindowInsetsListener {
        private InsetsListener() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ImeSyncDeferringInsetsCallback.this.view = view;
            if (ImeSyncDeferringInsetsCallback.this.needsSave) {
                ImeSyncDeferringInsetsCallback.this.lastWindowInsets = windowInsets;
                ImeSyncDeferringInsetsCallback.this.needsSave = false;
            }
            return ImeSyncDeferringInsetsCallback.this.animating ? WindowInsets.CONSUMED : view.onApplyWindowInsets(windowInsets);
        }
    }

    public ImeSyncDeferringInsetsCallback(View view) {
        this.view = view;
    }

    public WindowInsetsAnimation.Callback getAnimationCallback() {
        return this.animationCallback;
    }

    public ImeVisibilityListener getImeVisibilityListener() {
        return this.imeVisibilityListener;
    }

    public View.OnApplyWindowInsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    public void install() {
        this.view.setWindowInsetsAnimationCallback(this.animationCallback);
        this.view.setOnApplyWindowInsetsListener(this.insetsListener);
    }

    public void remove() {
        this.view.setWindowInsetsAnimationCallback(null);
        this.view.setOnApplyWindowInsetsListener(null);
    }

    public void setImeVisibilityListener(ImeVisibilityListener imeVisibilityListener) {
        this.imeVisibilityListener = imeVisibilityListener;
    }
}
