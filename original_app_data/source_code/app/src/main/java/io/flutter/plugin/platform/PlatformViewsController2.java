package io.flutter.plugin.platform;

import android.content.Context;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.flutter.Log;
import io.flutter.embedding.android.AndroidTouchProcessor;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.android.MotionEventTracker;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.systemchannels.PlatformViewCreationRequest;
import io.flutter.embedding.engine.systemchannels.PlatformViewTouch;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.view.AccessibilityBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class PlatformViewsController2 implements PlatformViewsAccessibilityDelegate {
    private static final String TAG = "PlatformViewsController2";
    private AndroidTouchProcessor androidTouchProcessor;
    private Context context;
    private FlutterView flutterView;
    private PlatformViewsChannel2 platformViewsChannel;
    private PlatformViewRegistryImpl registry;
    private TextInputPlugin textInputPlugin;
    private FlutterJNI flutterJNI = null;
    private Surface overlayerSurface = null;
    private SurfaceControl overlaySurfaceControl = null;
    final PlatformViewsChannel2.PlatformViewsHandler channelHandler = new PlatformViewsChannel2.PlatformViewsHandler() { // from class: io.flutter.plugin.platform.PlatformViewsController2.1
        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void clearFocus(int i10) {
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i10);
            if (platformView == null) {
                Log.e(PlatformViewsController2.TAG, "Clearing focus on an unknown view with id: " + i10);
                return;
            }
            View view = platformView.getView();
            if (view != null) {
                view.clearFocus();
                return;
            }
            Log.e(PlatformViewsController2.TAG, "Clearing focus on a null view with id: " + i10);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void createPlatformView(PlatformViewCreationRequest platformViewCreationRequest) {
            PlatformViewsController2.this.createFlutterPlatformView(platformViewCreationRequest);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void dispose(int i10) {
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i10);
            if (platformView == null) {
                Log.e(PlatformViewsController2.TAG, "Disposing unknown platform view with id: " + i10);
                return;
            }
            if (platformView.getView() != null) {
                View view = platformView.getView();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            PlatformViewsController2.this.platformViews.remove(i10);
            try {
                platformView.dispose();
            } catch (RuntimeException e10) {
                Log.e(PlatformViewsController2.TAG, "Disposing platform view threw an exception", e10);
            }
            FlutterMutatorView flutterMutatorView = (FlutterMutatorView) PlatformViewsController2.this.platformViewParent.get(i10);
            if (flutterMutatorView != null) {
                flutterMutatorView.removeAllViews();
                flutterMutatorView.unsetOnDescendantFocusChangeListener();
                ViewGroup viewGroup2 = (ViewGroup) flutterMutatorView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(flutterMutatorView);
                }
                PlatformViewsController2.this.platformViewParent.remove(i10);
            }
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public boolean isSurfaceControlEnabled() {
            return PlatformViewsController2.this.isHcppEnabled();
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void onTouch(PlatformViewTouch platformViewTouch) {
            int i10 = platformViewTouch.viewId;
            float f10 = PlatformViewsController2.this.context.getResources().getDisplayMetrics().density;
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i10);
            if (platformView == null) {
                Log.e(PlatformViewsController2.TAG, "Sending touch to an unknown view with id: " + i10);
                return;
            }
            View view = platformView.getView();
            if (view != null) {
                view.dispatchTouchEvent(PlatformViewsController2.this.toMotionEvent(f10, platformViewTouch));
                return;
            }
            Log.e(PlatformViewsController2.TAG, "Sending touch to a null view with id: " + i10);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void setDirection(int i10, int i11) {
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i10);
            if (platformView == null) {
                Log.e(PlatformViewsController2.TAG, "Setting direction to an unknown view with id: " + i10);
                return;
            }
            View view = platformView.getView();
            if (view != null) {
                view.setLayoutDirection(i11);
                return;
            }
            Log.e(PlatformViewsController2.TAG, "Setting direction to a null view with id: " + i10);
        }
    };
    private final AccessibilityEventsDelegate accessibilityEventsDelegate = new AccessibilityEventsDelegate();
    private final SparseArray<PlatformView> platformViews = new SparseArray<>();
    private final SparseArray<FlutterMutatorView> platformViewParent = new SparseArray<>();
    private final ArrayList<SurfaceControl.Transaction> pendingTransactions = new ArrayList<>();
    private final ArrayList<SurfaceControl.Transaction> activeTransactions = new ArrayList<>();
    private final MotionEventTracker motionEventTracker = MotionEventTracker.getInstance();

    public static /* synthetic */ void a(PlatformViewsController2 platformViewsController2, int i10, View view, boolean z10) {
        if (z10) {
            platformViewsController2.platformViewsChannel.invokeViewFocused(i10);
            return;
        }
        TextInputPlugin textInputPlugin = platformViewsController2.textInputPlugin;
        if (textInputPlugin != null) {
            textInputPlugin.clearPlatformViewClient(i10);
        }
    }

    private void diposeAllViews() {
        while (this.platformViews.size() > 0) {
            this.channelHandler.dispose(this.platformViews.keyAt(0));
        }
    }

    private float getDisplayDensity() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    private void lockInputConnection(VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.lockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionLocked();
    }

    private void maybeInvokeOnFlutterViewAttached(PlatformView platformView) {
        FlutterView flutterView = this.flutterView;
        if (flutterView == null) {
            Log.i(TAG, "null flutterView");
        } else {
            platformView.onFlutterViewAttached(flutterView);
        }
    }

    private static MotionEvent.PointerCoords parsePointerCoords(Object obj, float f10) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        double d10 = f10;
        pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d10);
        pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d10);
        pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d10);
        pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d10);
        pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d10);
        pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d10);
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> parsePointerCoordsList(Object obj, float f10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(parsePointerCoords(it.next(), f10));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties parsePointerProperties(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> parsePointerPropertiesList(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(parsePointerProperties(it.next()));
        }
        return arrayList;
    }

    private int toLogicalPixels(double d10, float f10) {
        return (int) Math.round(d10 / ((double) f10));
    }

    private int toPhysicalPixels(double d10) {
        return (int) Math.round(d10 * ((double) getDisplayDensity()));
    }

    private static void translateMotionEvent(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    private void unlockInputConnection(VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.unlockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionUnlocked();
    }

    private static boolean validateDirection(int i10) {
        return i10 == 0 || i10 == 1;
    }

    public void applyTransactions() {
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        for (int i10 = 0; i10 < this.pendingTransactions.size(); i10++) {
            transaction = transaction.merge(this.pendingTransactions.get(i10));
        }
        transaction.apply();
        this.pendingTransactions.clear();
    }

    public void attach(Context context, DartExecutor dartExecutor) {
        if (this.context != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.context = context;
        PlatformViewsChannel2 platformViewsChannel2 = new PlatformViewsChannel2(dartExecutor);
        this.platformViewsChannel = platformViewsChannel2;
        platformViewsChannel2.setPlatformViewsHandler(this.channelHandler);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void attachAccessibilityBridge(AccessibilityBridge accessibilityBridge) {
        this.accessibilityEventsDelegate.setAccessibilityBridge(accessibilityBridge);
    }

    public void attachTextInputPlugin(TextInputPlugin textInputPlugin) {
        this.textInputPlugin = textInputPlugin;
    }

    public void attachToFlutterRenderer(FlutterRenderer flutterRenderer) {
        this.androidTouchProcessor = new AndroidTouchProcessor(flutterRenderer, true);
    }

    public void attachToView(FlutterView flutterView) {
        this.flutterView = flutterView;
        for (int i10 = 0; i10 < this.platformViewParent.size(); i10++) {
            this.flutterView.addView(this.platformViewParent.valueAt(i10));
        }
        for (int i11 = 0; i11 < this.platformViews.size(); i11++) {
            this.platformViews.valueAt(i11).onFlutterViewAttached(this.flutterView);
        }
    }

    public PlatformView createFlutterPlatformView(PlatformViewCreationRequest platformViewCreationRequest) {
        PlatformViewFactory factory = this.registry.getFactory(platformViewCreationRequest.viewType);
        if (factory == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + platformViewCreationRequest.viewType);
        }
        PlatformView platformViewCreate = factory.create(this.context, platformViewCreationRequest.viewId, platformViewCreationRequest.params != null ? factory.getCreateArgsCodec().decodeMessage(platformViewCreationRequest.params) : null);
        View view = platformViewCreate.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(platformViewCreationRequest.direction);
        this.platformViews.put(platformViewCreationRequest.viewId, platformViewCreate);
        maybeInvokeOnFlutterViewAttached(platformViewCreate);
        return platformViewCreate;
    }

    public FlutterOverlaySurface createOverlaySurface() {
        if (this.overlayerSurface == null) {
            SurfaceControl.Builder builder = new SurfaceControl.Builder();
            builder.setBufferSize(this.flutterView.getWidth(), this.flutterView.getHeight());
            builder.setFormat(1);
            builder.setName("Flutter Overlay Surface");
            builder.setOpaque(false);
            builder.setHidden(false);
            SurfaceControl surfaceControlBuild = builder.build();
            SurfaceControl.Transaction transactionBuildReparentTransaction = this.flutterView.getRootSurfaceControl().buildReparentTransaction(surfaceControlBuild);
            transactionBuildReparentTransaction.setLayer(surfaceControlBuild, 1000);
            transactionBuildReparentTransaction.apply();
            this.overlayerSurface = new Surface(surfaceControlBuild);
            this.overlaySurfaceControl = surfaceControlBuild;
        }
        return new FlutterOverlaySurface(0, this.overlayerSurface);
    }

    public SurfaceControl.Transaction createTransaction() {
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        this.pendingTransactions.add(transaction);
        return transaction;
    }

    public void destroyOverlaySurface() {
        Surface surface = this.overlayerSurface;
        if (surface != null) {
            surface.release();
            this.overlayerSurface = null;
            this.overlaySurfaceControl = null;
        }
    }

    public void detach() {
        PlatformViewsChannel2 platformViewsChannel2 = this.platformViewsChannel;
        if (platformViewsChannel2 != null) {
            platformViewsChannel2.setPlatformViewsHandler(null);
        }
        destroyOverlaySurface();
        this.platformViewsChannel = null;
        this.context = null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void detachAccessibilityBridge() {
        this.accessibilityEventsDelegate.setAccessibilityBridge(null);
    }

    public void detachFromView() {
        for (int i10 = 0; i10 < this.platformViewParent.size(); i10++) {
            this.flutterView.removeView(this.platformViewParent.valueAt(i10));
        }
        destroyOverlaySurface();
        this.flutterView = null;
        for (int i11 = 0; i11 < this.platformViews.size(); i11++) {
            this.platformViews.valueAt(i11).onFlutterViewDetached();
        }
    }

    public void detachTextInputPlugin() {
        this.textInputPlugin = null;
    }

    public void disposePlatformView(int i10) {
        this.channelHandler.dispose(i10);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public View getPlatformViewById(int i10) {
        PlatformView platformView = this.platformViews.get(i10);
        if (platformView == null) {
            return null;
        }
        return platformView.getView();
    }

    public PlatformViewRegistry getRegistry() {
        return this.registry;
    }

    public void hideOverlaySurface() {
        if (this.overlaySurfaceControl == null) {
            return;
        }
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        transaction.setVisibility(this.overlaySurfaceControl, false);
        transaction.apply();
    }

    public boolean initializePlatformViewIfNeeded(final int i10) {
        PlatformView platformView = this.platformViews.get(i10);
        if (platformView == null) {
            return false;
        }
        if (this.platformViewParent.get(i10) != null) {
            return true;
        }
        View view = platformView.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Context context = this.context;
        FlutterMutatorView flutterMutatorView = new FlutterMutatorView(context, context.getResources().getDisplayMetrics().density, this.androidTouchProcessor);
        flutterMutatorView.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.g
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                PlatformViewsController2.a(this.f37618a, i10, view2, z10);
            }
        });
        this.platformViewParent.put(i10, flutterMutatorView);
        view.setImportantForAccessibility(4);
        flutterMutatorView.addView(view);
        this.flutterView.addView(flutterMutatorView);
        return true;
    }

    public boolean isHcppEnabled() {
        FlutterJNI flutterJNI = this.flutterJNI;
        if (flutterJNI == null) {
            return false;
        }
        return flutterJNI.IsSurfaceControlEnabled();
    }

    public void onDetachedFromJNI() {
        diposeAllViews();
    }

    public void onDisplayPlatformView(int i10, int i11, int i12, int i13, int i14, int i15, int i16, FlutterMutatorsStack flutterMutatorsStack) {
        if (initializePlatformViewIfNeeded(i10)) {
            FlutterMutatorView flutterMutatorView = this.platformViewParent.get(i10);
            flutterMutatorView.readyToDisplay(flutterMutatorsStack, i11, i12, i13, i14);
            flutterMutatorView.setVisibility(0);
            flutterMutatorView.bringToFront();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i15, i16);
            View view = this.platformViews.get(i10).getView();
            if (view != null) {
                view.setLayoutParams(layoutParams);
                view.bringToFront();
            }
        }
    }

    public void onEndFrame() {
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        for (int i10 = 0; i10 < this.activeTransactions.size(); i10++) {
            transaction = transaction.merge(this.activeTransactions.get(i10));
        }
        this.activeTransactions.clear();
        this.flutterView.invalidate();
        this.flutterView.getRootSurfaceControl().applyTransactionOnDraw(transaction);
    }

    public void onPreEngineRestart() {
        diposeAllViews();
    }

    public void setFlutterJNI(FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    public void setRegistry(PlatformViewRegistry platformViewRegistry) {
        this.registry = (PlatformViewRegistryImpl) platformViewRegistry;
    }

    public void showOverlaySurface() {
        if (this.overlaySurfaceControl == null) {
            return;
        }
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        transaction.setVisibility(this.overlaySurfaceControl, true);
        transaction.apply();
    }

    public synchronized void swapTransactions() {
        try {
            this.activeTransactions.clear();
            for (int i10 = 0; i10 < this.pendingTransactions.size(); i10++) {
                this.activeTransactions.add(this.pendingTransactions.get(i10));
            }
            this.pendingTransactions.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public MotionEvent toMotionEvent(float f10, PlatformViewTouch platformViewTouch) {
        MotionEvent motionEventPop = this.motionEventTracker.pop(MotionEventTracker.MotionEventId.from(platformViewTouch.motionEventId));
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) parsePointerCoordsList(platformViewTouch.rawPointerCoords, f10).toArray(new MotionEvent.PointerCoords[platformViewTouch.pointerCount]);
        if (motionEventPop != null) {
            translateMotionEvent(motionEventPop, pointerCoordsArr);
            return motionEventPop;
        }
        return MotionEvent.obtain(platformViewTouch.downTime.longValue(), platformViewTouch.eventTime.longValue(), platformViewTouch.action, platformViewTouch.pointerCount, (MotionEvent.PointerProperties[]) parsePointerPropertiesList(platformViewTouch.rawPointerPropertiesList).toArray(new MotionEvent.PointerProperties[platformViewTouch.pointerCount]), pointerCoordsArr, platformViewTouch.metaState, platformViewTouch.buttonState, platformViewTouch.xPrecision, platformViewTouch.yPrecision, platformViewTouch.deviceId, platformViewTouch.edgeFlags, platformViewTouch.source, platformViewTouch.flags);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public boolean usesVirtualDisplay(int i10) {
        return false;
    }

    private int toLogicalPixels(double d10) {
        return toLogicalPixels(d10, getDisplayDensity());
    }
}
