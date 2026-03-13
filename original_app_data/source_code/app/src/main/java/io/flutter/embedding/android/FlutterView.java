package io.flutter.embedding.android;

import C3.c;
import C3.n;
import C3.s;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import io.flutter.Log;
import io.flutter.embedding.android.FlutterImageView;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.renderer.RenderSurface;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.editing.ScribePlugin;
import io.flutter.plugin.editing.SpellCheckPlugin;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.plugin.localization.LocalizationPlugin;
import io.flutter.plugin.mouse.MouseCursorPlugin;
import io.flutter.util.ViewUtils;
import io.flutter.view.AccessibilityBridge;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterView extends FrameLayout implements MouseCursorPlugin.MouseCursorViewDelegate, KeyboardManager.ViewDelegate {
    private static final String GBOARD_PACKAGE_NAME = "com.google.android.inputmethod.latin";
    private static final String TAG = "FlutterView";
    private AccessibilityBridge accessibilityBridge;
    private AndroidTouchProcessor androidTouchProcessor;
    private FlutterViewDelegate delegate;
    private FlutterEngine flutterEngine;
    private final Set<FlutterEngineAttachmentListener> flutterEngineAttachmentListeners;
    private FlutterImageView flutterImageView;
    private FlutterSurfaceView flutterSurfaceView;
    private FlutterTextureView flutterTextureView;
    private final FlutterUiDisplayListener flutterUiDisplayListener;
    private final Set<FlutterUiDisplayListener> flutterUiDisplayListeners;
    private boolean isFlutterUiDisplayed;
    private KeyboardManager keyboardManager;
    private LocalizationPlugin localizationPlugin;
    private MouseCursorPlugin mouseCursorPlugin;
    private final AccessibilityBridge.OnAccessibilityChangeListener onAccessibilityChangeListener;
    private RenderSurface previousRenderSurface;
    RenderSurface renderSurface;
    private ScribePlugin scribePlugin;
    private SpellCheckPlugin spellCheckPlugin;
    private final ContentObserver systemSettingsObserver;
    private TextInputPlugin textInputPlugin;
    private TextServicesManager textServicesManager;
    private final FlutterRenderer.ViewportMetrics viewportMetrics;
    private X0.a windowInfoListener;
    private WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepo;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface FlutterEngineAttachmentListener {
        void onFlutterEngineAttachedToFlutterView(FlutterEngine flutterEngine);

        void onFlutterEngineDetachedFromFlutterView();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum ZeroSides {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public FlutterView(Context context) {
        this(context, (AttributeSet) null, new FlutterSurfaceView(context));
    }

    @SuppressLint({"DiscouragedPrivateApi"})
    private View findViewByAccessibilityIdRootedAtCurrentView(int i10, View view) {
        Method declaredMethod;
        try {
            declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (declaredMethod.invoke(view, null).equals(Integer.valueOf(i10))) {
            return view;
        }
        if (view instanceof ViewGroup) {
            int i11 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i11 >= viewGroup.getChildCount()) {
                    break;
                }
                View viewFindViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i10, viewGroup.getChildAt(i11));
                if (viewFindViewByAccessibilityIdRootedAtCurrentView != null) {
                    return viewFindViewByAccessibilityIdRootedAtCurrentView;
                }
                i11++;
            }
        }
        return null;
    }

    private int guessBottomKeyboardInset(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < ((double) getRootView().getHeight()) * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void init() {
        Log.v(TAG, "Initializing FlutterView");
        if (this.flutterSurfaceView != null) {
            Log.v(TAG, "Internally using a FlutterSurfaceView.");
            addView(this.flutterSurfaceView);
        } else if (this.flutterTextureView != null) {
            Log.v(TAG, "Internally using a FlutterTextureView.");
            addView(this.flutterTextureView);
        } else {
            Log.v(TAG, "Internally using a FlutterImageView.");
            addView(this.flutterImageView);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAutofill(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseImageView() {
        FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView != null) {
            flutterImageView.closeImageReader();
            removeView(this.flutterImageView);
            this.flutterImageView = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetWillNotDraw(boolean z10, boolean z11) {
        boolean z12 = false;
        if (this.flutterEngine.getRenderer().isSoftwareRenderingEnabled()) {
            setWillNotDraw(false);
            return;
        }
        if (!z10 && !z11) {
            z12 = true;
        }
        setWillNotDraw(z12);
    }

    private void sendViewportMetricsToFlutter() {
        if (!isAttachedToFlutterEngine()) {
            Log.w(TAG, "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.viewportMetrics.devicePixelRatio = getResources().getDisplayMetrics().density;
        this.viewportMetrics.physicalTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.flutterEngine.getRenderer().setViewportMetrics(this.viewportMetrics);
    }

    public boolean acquireLatestImageViewFrame() {
        FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView != null) {
            return flutterImageView.acquireLatestImage();
        }
        return false;
    }

    public void addFlutterEngineAttachmentListener(FlutterEngineAttachmentListener flutterEngineAttachmentListener) {
        this.flutterEngineAttachmentListeners.add(flutterEngineAttachmentListener);
    }

    public void addOnFirstFrameRenderedListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterUiDisplayListeners.add(flutterUiDisplayListener);
    }

    public void attachOverlaySurfaceToRender(FlutterImageView flutterImageView) {
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterImageView.attachToRenderer(flutterEngine.getRenderer());
        }
    }

    public void attachToFlutterEngine(FlutterEngine flutterEngine) {
        Log.v(TAG, "Attaching to a FlutterEngine: " + flutterEngine);
        if (isAttachedToFlutterEngine()) {
            if (flutterEngine == this.flutterEngine) {
                Log.v(TAG, "Already attached to this engine. Doing nothing.");
                return;
            } else {
                Log.v(TAG, "Currently attached to a different engine. Detaching and then attaching to new engine.");
                detachFromFlutterEngine();
            }
        }
        this.flutterEngine = flutterEngine;
        FlutterRenderer renderer = flutterEngine.getRenderer();
        this.isFlutterUiDisplayed = renderer.isDisplayingFlutterUi();
        this.renderSurface.attachToRenderer(renderer);
        renderer.addIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        this.mouseCursorPlugin = new MouseCursorPlugin(this, this.flutterEngine.getMouseCursorChannel());
        this.textInputPlugin = new TextInputPlugin(this, this.flutterEngine.getTextInputChannel(), this.flutterEngine.getScribeChannel(), this.flutterEngine.getPlatformViewsController(), this.flutterEngine.getPlatformViewsController2());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.textServicesManager = textServicesManager;
            this.spellCheckPlugin = new SpellCheckPlugin(textServicesManager, this.flutterEngine.getSpellCheckChannel());
        } catch (Exception unused) {
            Log.e(TAG, "TextServicesManager not supported by device, spell check disabled.");
        }
        this.scribePlugin = new ScribePlugin(this, this.textInputPlugin.getInputMethodManager(), this.flutterEngine.getScribeChannel());
        this.localizationPlugin = this.flutterEngine.getLocalizationPlugin();
        this.keyboardManager = new KeyboardManager(this);
        this.androidTouchProcessor = new AndroidTouchProcessor(this.flutterEngine.getRenderer(), false);
        AccessibilityBridge accessibilityBridge = new AccessibilityBridge(this, flutterEngine.getAccessibilityChannel(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), flutterEngine.getPlatformViewsControllerDelegator());
        this.accessibilityBridge = accessibilityBridge;
        accessibilityBridge.setOnAccessibilityChangeListener(this.onAccessibilityChangeListener);
        resetWillNotDraw(this.accessibilityBridge.isAccessibilityEnabled(), this.accessibilityBridge.isTouchExplorationEnabled());
        this.flutterEngine.getPlatformViewsController().attachAccessibilityBridge(this.accessibilityBridge);
        this.flutterEngine.getPlatformViewsController().attachToFlutterRenderer(this.flutterEngine.getRenderer());
        this.flutterEngine.getPlatformViewsController2().attachAccessibilityBridge(this.accessibilityBridge);
        this.flutterEngine.getPlatformViewsController2().attachToFlutterRenderer(this.flutterEngine.getRenderer());
        this.textInputPlugin.getInputMethodManager().restartInput(this);
        sendUserSettingsToFlutter();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.systemSettingsObserver);
        sendViewportMetricsToFlutter();
        flutterEngine.getPlatformViewsController().attachToView(this);
        flutterEngine.getPlatformViewsController2().attachToView(this);
        Iterator<FlutterEngineAttachmentListener> it = this.flutterEngineAttachmentListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterEngineAttachedToFlutterView(flutterEngine);
        }
        if (this.isFlutterUiDisplayed) {
            this.flutterUiDisplayListener.onFlutterUiDisplayed();
        }
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.textInputPlugin.autofill(sparseArray);
    }

    public ZeroSides calculateShouldZeroSides() {
        Context context = getContext();
        if (context.getResources().getConfiguration().orientation == 2) {
            int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
            if (rotation == 1) {
                return ZeroSides.RIGHT;
            }
            if (rotation == 3) {
                return ZeroSides.LEFT;
            }
            if (rotation == 0 || rotation == 2) {
                return ZeroSides.BOTH;
            }
        }
        return ZeroSides.NONE;
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        FlutterEngine flutterEngine = this.flutterEngine;
        return flutterEngine != null ? flutterEngine.getPlatformViewsController().checkInputConnectionProxy(view) : super.checkInputConnectionProxy(view);
    }

    public void convertToImageView() {
        this.renderSurface.pause();
        FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView == null) {
            FlutterImageView flutterImageViewCreateImageView = createImageView();
            this.flutterImageView = flutterImageViewCreateImageView;
            addView(flutterImageViewCreateImageView);
        } else {
            flutterImageView.resizeIfNeeded(getWidth(), getHeight());
        }
        this.previousRenderSurface = this.renderSurface;
        FlutterImageView flutterImageView2 = this.flutterImageView;
        this.renderSurface = flutterImageView2;
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterImageView2.attachToRenderer(flutterEngine.getRenderer());
        }
    }

    public FlutterImageView createImageView() {
        return new FlutterImageView(getContext(), getWidth(), getHeight(), FlutterImageView.SurfaceKind.background);
    }

    public WindowInfoRepositoryCallbackAdapterWrapper createWindowInfoRepo() {
        try {
            return new WindowInfoRepositoryCallbackAdapterWrapper(new B3.a(n.f1127a.d(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void detachFromFlutterEngine() {
        Log.v(TAG, "Detaching from a FlutterEngine: " + this.flutterEngine);
        if (!isAttachedToFlutterEngine()) {
            Log.v(TAG, "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        Iterator<FlutterEngineAttachmentListener> it = this.flutterEngineAttachmentListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterEngineDetachedFromFlutterView();
        }
        getContext().getContentResolver().unregisterContentObserver(this.systemSettingsObserver);
        this.flutterEngine.getPlatformViewsController().detachFromView();
        this.flutterEngine.getPlatformViewsController2().detachFromView();
        this.flutterEngine.getPlatformViewsController().detachAccessibilityBridge();
        this.flutterEngine.getPlatformViewsController2().detachAccessibilityBridge();
        this.accessibilityBridge.release();
        this.accessibilityBridge = null;
        this.textInputPlugin.getInputMethodManager().restartInput(this);
        this.textInputPlugin.destroy();
        this.keyboardManager.destroy();
        SpellCheckPlugin spellCheckPlugin = this.spellCheckPlugin;
        if (spellCheckPlugin != null) {
            spellCheckPlugin.destroy();
        }
        MouseCursorPlugin mouseCursorPlugin = this.mouseCursorPlugin;
        if (mouseCursorPlugin != null) {
            mouseCursorPlugin.destroy();
        }
        FlutterRenderer renderer = this.flutterEngine.getRenderer();
        this.isFlutterUiDisplayed = false;
        renderer.removeIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        renderer.stopRenderingToSurface();
        renderer.setSemanticsEnabled(false);
        RenderSurface renderSurface = this.previousRenderSurface;
        if (renderSurface != null && this.renderSurface == this.flutterImageView) {
            this.renderSurface = renderSurface;
        }
        this.renderSurface.detachFromRenderer();
        releaseImageView();
        this.previousRenderSurface = null;
        this.flutterEngine = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (isAttachedToFlutterEngine() && this.keyboardManager.handleEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public View findViewByAccessibilityIdTraversal(int i10) {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            return (View) declaredMethod.invoke(this, Integer.valueOf(i10));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge == null || !accessibilityBridge.isAccessibilityEnabled()) {
            return null;
        }
        return this.accessibilityBridge;
    }

    public FlutterEngine getAttachedFlutterEngine() {
        return this.flutterEngine;
    }

    @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
    public BinaryMessenger getBinaryMessenger() {
        return this.flutterEngine.getDartExecutor();
    }

    public FlutterImageView getCurrentImageSurface() {
        return this.flutterImageView;
    }

    @Override // io.flutter.plugin.mouse.MouseCursorPlugin.MouseCursorViewDelegate
    public PointerIcon getSystemPointerIcon(int i10) {
        return PointerIcon.getSystemIcon(getContext(), i10);
    }

    public FlutterRenderer.ViewportMetrics getViewportMetrics() {
        return this.viewportMetrics;
    }

    public boolean hasRenderedFirstFrame() {
        return this.isFlutterUiDisplayed;
    }

    public boolean isAttachedToFlutterEngine() {
        FlutterEngine flutterEngine = this.flutterEngine;
        return flutterEngine != null && flutterEngine.getRenderer() == this.renderSurface.getAttachedRenderer();
    }

    @Override // android.view.View
    @SuppressLint({"InlinedApi", "NewApi", "DeprecatedSinceApi"})
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        getWindowSystemUiVisibility();
        getWindowSystemUiVisibility();
        Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
        FlutterRenderer.ViewportMetrics viewportMetrics = this.viewportMetrics;
        viewportMetrics.viewPaddingTop = insets.top;
        viewportMetrics.viewPaddingRight = insets.right;
        viewportMetrics.viewPaddingBottom = insets.bottom;
        viewportMetrics.viewPaddingLeft = insets.left;
        Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
        FlutterRenderer.ViewportMetrics viewportMetrics2 = this.viewportMetrics;
        viewportMetrics2.viewInsetTop = insets2.top;
        viewportMetrics2.viewInsetRight = insets2.right;
        viewportMetrics2.viewInsetBottom = insets2.bottom;
        viewportMetrics2.viewInsetLeft = insets2.left;
        Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
        FlutterRenderer.ViewportMetrics viewportMetrics3 = this.viewportMetrics;
        viewportMetrics3.systemGestureInsetTop = insets3.top;
        viewportMetrics3.systemGestureInsetRight = insets3.right;
        viewportMetrics3.systemGestureInsetBottom = insets3.bottom;
        viewportMetrics3.systemGestureInsetLeft = insets3.left;
        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
        if (displayCutout != null) {
            Insets waterfallInsets = displayCutout.getWaterfallInsets();
            FlutterRenderer.ViewportMetrics viewportMetrics4 = this.viewportMetrics;
            viewportMetrics4.viewPaddingTop = Math.max(Math.max(viewportMetrics4.viewPaddingTop, waterfallInsets.top), displayCutout.getSafeInsetTop());
            FlutterRenderer.ViewportMetrics viewportMetrics5 = this.viewportMetrics;
            viewportMetrics5.viewPaddingRight = Math.max(Math.max(viewportMetrics5.viewPaddingRight, waterfallInsets.right), displayCutout.getSafeInsetRight());
            FlutterRenderer.ViewportMetrics viewportMetrics6 = this.viewportMetrics;
            viewportMetrics6.viewPaddingBottom = Math.max(Math.max(viewportMetrics6.viewPaddingBottom, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
            FlutterRenderer.ViewportMetrics viewportMetrics7 = this.viewportMetrics;
            viewportMetrics7.viewPaddingLeft = Math.max(Math.max(viewportMetrics7.viewPaddingLeft, waterfallInsets.left), displayCutout.getSafeInsetLeft());
        }
        ArrayList arrayList = new ArrayList();
        DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
        if (displayCutout2 != null) {
            for (Rect rect : displayCutout2.getBoundingRects()) {
                Log.v(TAG, "DisplayCutout area reported with bounds = " + rect.toString());
                arrayList.add(new FlutterRenderer.DisplayFeature(rect, FlutterRenderer.DisplayFeatureType.CUTOUT, FlutterRenderer.DisplayFeatureState.UNKNOWN));
            }
        }
        this.viewportMetrics.setDisplayCutouts(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            this.delegate.growViewportMetricsToCaptionBar(getContext(), this.viewportMetrics);
        }
        Log.v(TAG, "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.viewportMetrics.viewPaddingTop + ", Left: " + this.viewportMetrics.viewPaddingLeft + ", Right: " + this.viewportMetrics.viewPaddingRight + "\nKeyboard insets: Bottom: " + this.viewportMetrics.viewInsetBottom + ", Left: " + this.viewportMetrics.viewInsetLeft + ", Right: " + this.viewportMetrics.viewInsetRight + "System Gesture Insets - Left: " + this.viewportMetrics.systemGestureInsetLeft + ", Top: " + this.viewportMetrics.systemGestureInsetTop + ", Right: " + this.viewportMetrics.systemGestureInsetRight + ", Bottom: " + this.viewportMetrics.viewInsetBottom);
        sendViewportMetricsToFlutter();
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.windowInfoRepo = createWindowInfoRepo();
        Activity activity = ViewUtils.getActivity(getContext());
        if (this.windowInfoRepo == null || activity == null) {
            return;
        }
        this.windowInfoListener = new X0.a() { // from class: io.flutter.embedding.android.b
            @Override // X0.a
            public final void accept(Object obj) {
                this.f37555a.setWindowInfoListenerDisplayFeatures((s) obj);
            }
        };
        this.windowInfoRepo.addWindowLayoutInfoListener(activity, L0.a.i(getContext()), this.windowInfoListener);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.flutterEngine != null) {
            Log.v(TAG, "Configuration changed. Sending locales and user settings to Flutter.");
            this.localizationPlugin.sendLocalesToFlutter(configuration);
            sendUserSettingsToFlutter();
            ViewUtils.calculateMaximumDisplayMetrics(getContext(), this.flutterEngine);
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !isAttachedToFlutterEngine() ? super.onCreateInputConnection(editorInfo) : this.textInputPlugin.createInputConnection(this, this.keyboardManager, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        X0.a aVar;
        WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepositoryCallbackAdapterWrapper = this.windowInfoRepo;
        if (windowInfoRepositoryCallbackAdapterWrapper != null && (aVar = this.windowInfoListener) != null) {
            windowInfoRepositoryCallbackAdapterWrapper.removeWindowLayoutInfoListener(aVar);
        }
        this.windowInfoListener = null;
        this.windowInfoRepo = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (isAttachedToFlutterEngine() && this.androidTouchProcessor.onGenericMotionEvent(motionEvent, getContext())) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !isAttachedToFlutterEngine() ? super.onHoverEvent(motionEvent) : this.accessibilityBridge.onAccessibilityHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        super.onProvideAutofillVirtualStructure(viewStructure, i10);
        this.textInputPlugin.onProvideAutofillVirtualStructure(viewStructure, i10);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Log.v(TAG, "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i12 + " x " + i13 + ", it is now " + i10 + " x " + i11);
        FlutterRenderer.ViewportMetrics viewportMetrics = this.viewportMetrics;
        viewportMetrics.width = i10;
        viewportMetrics.height = i11;
        sendViewportMetricsToFlutter();
    }

    @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
    public boolean onTextInputKeyEvent(KeyEvent keyEvent) {
        return this.textInputPlugin.handleKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isAttachedToFlutterEngine()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        return this.androidTouchProcessor.onTouchEvent(motionEvent);
    }

    @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
    public void redispatch(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    public void removeFlutterEngineAttachmentListener(FlutterEngineAttachmentListener flutterEngineAttachmentListener) {
        this.flutterEngineAttachmentListeners.remove(flutterEngineAttachmentListener);
    }

    public void removeOnFirstFrameRenderedListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterUiDisplayListeners.remove(flutterUiDisplayListener);
    }

    public void revertImageView(final Runnable runnable) {
        if (this.flutterImageView == null) {
            Log.v(TAG, "Tried to revert the image view, but no image view is used.");
            return;
        }
        RenderSurface renderSurface = this.previousRenderSurface;
        if (renderSurface == null) {
            Log.v(TAG, "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.renderSurface = renderSurface;
        this.previousRenderSurface = null;
        final FlutterRenderer renderer = this.flutterEngine.getRenderer();
        if (this.flutterEngine != null && renderer != null) {
            this.renderSurface.resume();
            renderer.addIsDisplayingFlutterUiListener(new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.4
                @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                public void onFlutterUiDisplayed() {
                    renderer.removeIsDisplayingFlutterUiListener(this);
                    runnable.run();
                    FlutterView flutterView = FlutterView.this;
                    if ((flutterView.renderSurface instanceof FlutterImageView) || flutterView.flutterImageView == null) {
                        return;
                    }
                    FlutterView.this.flutterImageView.detachFromRenderer();
                    FlutterView.this.releaseImageView();
                }

                @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                public void onFlutterUiNoLongerDisplayed() {
                }
            });
        } else {
            this.flutterImageView.detachFromRenderer();
            releaseImageView();
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sendUserSettingsToFlutter() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            if (r0 != r1) goto L13
            io.flutter.embedding.engine.systemchannels.SettingsChannel$PlatformBrightness r0 = io.flutter.embedding.engine.systemchannels.SettingsChannel.PlatformBrightness.dark
            goto L15
        L13:
            io.flutter.embedding.engine.systemchannels.SettingsChannel$PlatformBrightness r0 = io.flutter.embedding.engine.systemchannels.SettingsChannel.PlatformBrightness.light
        L15:
            android.view.textservice.TextServicesManager r1 = r6.textServicesManager
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L4a
            java.util.List r1 = r1.getEnabledSpellCheckerInfos()
            java.util.Iterator r1 = r1.iterator()
        L23:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L3d
            java.lang.Object r4 = r1.next()
            android.view.textservice.SpellCheckerInfo r4 = (android.view.textservice.SpellCheckerInfo) r4
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r5 = "com.google.android.inputmethod.latin"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L23
            r1 = r3
            goto L3e
        L3d:
            r1 = r2
        L3e:
            android.view.textservice.TextServicesManager r4 = r6.textServicesManager
            boolean r4 = r4.isSpellCheckerEnabled()
            if (r4 == 0) goto L4a
            if (r1 == 0) goto L4a
            r1 = r3
            goto L4b
        L4a:
            r1 = r2
        L4b:
            io.flutter.embedding.engine.FlutterEngine r4 = r6.flutterEngine
            io.flutter.embedding.engine.systemchannels.SettingsChannel r4 = r4.getSettingsChannel()
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r4 = r4.startMessage()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r4 = r4.setTextScaleFactor(r5)
            android.content.res.Resources r5 = r6.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r4 = r4.setDisplayMetrics(r5)
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r1 = r4.setNativeSpellCheckServiceDefined(r1)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r3)
            if (r4 != r3) goto L84
            r2 = r3
        L84:
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r1 = r1.setBrieflyShowPassword(r2)
            android.content.Context r6 = r6.getContext()
            boolean r6 = android.text.format.DateFormat.is24HourFormat(r6)
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r6 = r1.setUse24HourFormat(r6)
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r6 = r6.setPlatformBrightness(r0)
            r6.send()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.FlutterView.sendUserSettingsToFlutter():void");
    }

    public void setDelegate(FlutterViewDelegate flutterViewDelegate) {
        this.delegate = flutterViewDelegate;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        RenderSurface renderSurface = this.renderSurface;
        if (renderSurface instanceof FlutterSurfaceView) {
            ((FlutterSurfaceView) renderSurface).setVisibility(i10);
        }
    }

    public void setWindowInfoListenerDisplayFeatures(s sVar) {
        List<C3.a> listA = sVar.a();
        ArrayList arrayList = new ArrayList();
        for (C3.a aVar : listA) {
            Log.v(TAG, "WindowInfoTracker Display Feature reported with bounds = " + aVar.getBounds().toString() + " and type = " + aVar.getClass().getSimpleName());
            if (aVar instanceof C3.c) {
                C3.c cVar = (C3.c) aVar;
                arrayList.add(new FlutterRenderer.DisplayFeature(aVar.getBounds(), cVar.a() == c.a.f1103d ? FlutterRenderer.DisplayFeatureType.HINGE : FlutterRenderer.DisplayFeatureType.FOLD, cVar.getState() == c.b.f1106c ? FlutterRenderer.DisplayFeatureState.POSTURE_FLAT : cVar.getState() == c.b.f1107d ? FlutterRenderer.DisplayFeatureState.POSTURE_HALF_OPENED : FlutterRenderer.DisplayFeatureState.UNKNOWN));
            } else {
                arrayList.add(new FlutterRenderer.DisplayFeature(aVar.getBounds(), FlutterRenderer.DisplayFeatureType.UNKNOWN, FlutterRenderer.DisplayFeatureState.UNKNOWN));
            }
        }
        this.viewportMetrics.setDisplayFeatures(arrayList);
        sendViewportMetricsToFlutter();
    }

    @Deprecated
    public FlutterView(Context context, RenderMode renderMode) {
        super(context, null);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z10, boolean z11) {
                FlutterView.this.resetWillNotDraw(z10, z11);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z10) {
                super.onChange(z10);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                Log.v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new FlutterViewDelegate();
        if (renderMode == RenderMode.surface) {
            FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView(context);
            this.flutterSurfaceView = flutterSurfaceView;
            this.renderSurface = flutterSurfaceView;
        } else {
            if (renderMode != RenderMode.texture) {
                throw new IllegalArgumentException("RenderMode not supported with this constructor: " + renderMode);
            }
            FlutterTextureView flutterTextureView = new FlutterTextureView(context);
            this.flutterTextureView = flutterTextureView;
            this.renderSurface = flutterTextureView;
        }
        init();
    }

    @Deprecated
    public FlutterView(Context context, TransparencyMode transparencyMode) {
        this(context, (AttributeSet) null, new FlutterSurfaceView(context, transparencyMode == TransparencyMode.transparent));
    }

    public FlutterView(Context context, FlutterSurfaceView flutterSurfaceView) {
        this(context, (AttributeSet) null, flutterSurfaceView);
    }

    public FlutterView(Context context, FlutterTextureView flutterTextureView) {
        this(context, (AttributeSet) null, flutterTextureView);
    }

    public FlutterView(Context context, FlutterImageView flutterImageView) {
        this(context, (AttributeSet) null, flutterImageView);
    }

    public FlutterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new FlutterSurfaceView(context));
    }

    @Deprecated
    public FlutterView(Context context, RenderMode renderMode, TransparencyMode transparencyMode) {
        super(context, null);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z10, boolean z11) {
                FlutterView.this.resetWillNotDraw(z10, z11);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z10) {
                super.onChange(z10);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                Log.v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new FlutterViewDelegate();
        if (renderMode == RenderMode.surface) {
            FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView(context, transparencyMode == TransparencyMode.transparent);
            this.flutterSurfaceView = flutterSurfaceView;
            this.renderSurface = flutterSurfaceView;
        } else if (renderMode == RenderMode.texture) {
            FlutterTextureView flutterTextureView = new FlutterTextureView(context);
            this.flutterTextureView = flutterTextureView;
            this.renderSurface = flutterTextureView;
        } else {
            throw new IllegalArgumentException("RenderMode not supported with this constructor: " + renderMode);
        }
        init();
    }

    private FlutterView(Context context, AttributeSet attributeSet, FlutterSurfaceView flutterSurfaceView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z10, boolean z11) {
                FlutterView.this.resetWillNotDraw(z10, z11);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z10) {
                super.onChange(z10);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                Log.v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new FlutterViewDelegate();
        this.flutterSurfaceView = flutterSurfaceView;
        this.renderSurface = flutterSurfaceView;
        init();
    }

    private FlutterView(Context context, AttributeSet attributeSet, FlutterTextureView flutterTextureView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z10, boolean z11) {
                FlutterView.this.resetWillNotDraw(z10, z11);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z10) {
                super.onChange(z10);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                Log.v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new FlutterViewDelegate();
        this.flutterTextureView = flutterTextureView;
        this.renderSurface = flutterTextureView;
        init();
    }

    private FlutterView(Context context, AttributeSet attributeSet, FlutterImageView flutterImageView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z10, boolean z11) {
                FlutterView.this.resetWillNotDraw(z10, z11);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z10) {
                super.onChange(z10);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                Log.v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new FlutterViewDelegate();
        this.flutterImageView = flutterImageView;
        this.renderSurface = flutterImageView;
        init();
    }
}
