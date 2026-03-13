package io.flutter.plugin.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.Log;
import io.flutter.embedding.android.AndroidTouchProcessor;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.util.ViewUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class PlatformViewWrapper extends FrameLayout {
    private static final String TAG = "PlatformViewWrapper";
    private ViewTreeObserver.OnGlobalFocusChangeListener activeFocusListener;
    private int left;
    private int prevLeft;
    private int prevTop;
    private PlatformViewRenderTarget renderTarget;
    private int top;
    private AndroidTouchProcessor touchProcessor;

    public PlatformViewWrapper(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void draw(Canvas canvas) {
        PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
        if (platformViewRenderTarget == null) {
            super.draw(canvas);
            Log.e(TAG, "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = platformViewRenderTarget.getSurface();
        if (!surface.isValid()) {
            Log.e(TAG, "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        if (canvasLockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(canvasLockHardwareCanvas);
        } finally {
            this.renderTarget.scheduleFrame();
            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.activeFocusListener;
    }

    public int getRenderTargetHeight() {
        PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
        if (platformViewRenderTarget != null) {
            return platformViewRenderTarget.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
        if (platformViewRenderTarget != null) {
            return platformViewRenderTarget.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"NewApi"})
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.touchProcessor == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i10 = this.left;
            this.prevLeft = i10;
            int i11 = this.top;
            this.prevTop = i11;
            matrix.postTranslate(i10, i11);
        } else if (action != 2) {
            matrix.postTranslate(this.left, this.top);
        } else {
            matrix.postTranslate(this.prevLeft, this.prevTop);
            this.prevLeft = this.left;
            this.prevTop = this.top;
        }
        return this.touchProcessor.onTouchEvent(motionEvent, matrix);
    }

    public void release() {
        PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
        if (platformViewRenderTarget != null) {
            platformViewRenderTarget.release();
            this.renderTarget = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void resizeRenderTarget(int i10, int i11) {
        PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
        if (platformViewRenderTarget != null) {
            platformViewRenderTarget.resize(i10, i11);
        }
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.left = layoutParams.leftMargin;
        this.top = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(final View.OnFocusChangeListener onFocusChangeListener) {
        unsetOnDescendantFocusChangeListener();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.activeFocusListener == null) {
            ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: io.flutter.plugin.platform.PlatformViewWrapper.1
                @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
                public void onGlobalFocusChanged(View view, View view2) {
                    View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
                    PlatformViewWrapper platformViewWrapper = PlatformViewWrapper.this;
                    onFocusChangeListener2.onFocusChange(platformViewWrapper, ViewUtils.childHasFocus(platformViewWrapper));
                }
            };
            this.activeFocusListener = onGlobalFocusChangeListener;
            viewTreeObserver.addOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    public void setTouchProcessor(AndroidTouchProcessor androidTouchProcessor) {
        this.touchProcessor = androidTouchProcessor;
    }

    public void unsetOnDescendantFocusChangeListener() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.activeFocusListener) == null) {
            return;
        }
        this.activeFocusListener = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    public PlatformViewWrapper(Context context, PlatformViewRenderTarget platformViewRenderTarget) {
        this(context);
        this.renderTarget = platformViewRenderTarget;
        Surface surface = platformViewRenderTarget.getSurface();
        if (surface == null || FlutterRenderer.debugDisableSurfaceClear) {
            return;
        }
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        } finally {
            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }
}
