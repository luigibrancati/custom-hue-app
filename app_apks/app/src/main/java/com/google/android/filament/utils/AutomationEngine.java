package com.google.android.filament.utils;

import com.google.android.filament.ColorGrading;
import com.google.android.filament.Engine;
import com.google.android.filament.Entity;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.LightManager;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.View;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class AutomationEngine {
    private ColorGrading mColorGrading;
    private final long mNativeObject;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Options {
        public float sleepDuration = 0.2f;
        public int minFrameCount = 2;
        public boolean verbose = true;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class ViewerContent {

        @Entity
        public int[] assetLights;
        public IndirectLight indirectLight;
        public LightManager lightManager;
        public MaterialInstance[] materials;
        public Renderer renderer;
        public Scene scene;

        @Entity
        public int sunlight;
        public View view;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class ViewerOptions {
        public float cameraAperture = 16.0f;
        public float cameraSpeed = 125.0f;
        public float cameraISO = 100.0f;
        public float cameraNear = 0.1f;
        public float cameraFar = 100.0f;
        public float groundShadowStrength = 0.75f;
        public boolean groundPlaneEnabled = false;
        public boolean skyboxEnabled = true;
        public float cameraFocalLength = 28.0f;
        public float cameraFocusDistance = 0.0f;
        public boolean autoScaleEnabled = true;
        public boolean autoInstancingEnabled = false;
    }

    public AutomationEngine(String str) {
        long jNCreateAutomationEngine = nCreateAutomationEngine(str);
        this.mNativeObject = jNCreateAutomationEngine;
        if (jNCreateAutomationEngine == 0) {
            throw new IllegalStateException("Couldn't create AutomationEngine");
        }
    }

    private static native void nApplySettings(long j10, long j11, String str, long j12, long[] jArr, long j13, int i10, int[] iArr, long j14, long j15, long j16);

    private static native long nCreateAutomationEngine(String str);

    private static native long nCreateDefaultAutomationEngine();

    private static native void nDestroy(long j10);

    private static native long nGetColorGrading(long j10, long j11);

    private static native void nGetViewerOptions(long j10, Object obj);

    private static native void nSetOptions(long j10, float f10, int i10, boolean z10);

    private static native boolean nShouldClose(long j10);

    private static native void nSignalBatchMode(long j10);

    private static native void nStartBatchMode(long j10);

    private static native void nStartRunning(long j10);

    private static native void nStopRunning(long j10);

    private static native void nTick(long j10, long j11, long j12, long[] jArr, long j13, float f10);

    public void applySettings(Engine engine, String str, ViewerContent viewerContent) {
        long[] jArr;
        if (viewerContent.view == null || viewerContent.renderer == null) {
            throw new IllegalStateException("Must provide a View and Renderer");
        }
        if (viewerContent.lightManager == null || viewerContent.scene == null) {
            throw new IllegalStateException("Must provide a LightManager and Scene");
        }
        MaterialInstance[] materialInstanceArr = viewerContent.materials;
        if (materialInstanceArr != null) {
            int length = materialInstanceArr.length;
            jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = viewerContent.materials[i10].getNativeObject();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        long nativeObject = viewerContent.view.getNativeObject();
        IndirectLight indirectLight = viewerContent.indirectLight;
        nApplySettings(this.mNativeObject, engine.getNativeObject(), str, nativeObject, jArr2, indirectLight == null ? 0L : indirectLight.getNativeObject(), viewerContent.sunlight, viewerContent.assetLights, viewerContent.lightManager.getNativeObject(), viewerContent.scene.getNativeObject(), viewerContent.renderer.getNativeObject());
    }

    public void finalize() throws Throwable {
        nDestroy(this.mNativeObject);
        super.finalize();
    }

    public ColorGrading getColorGrading(Engine engine) {
        long jNGetColorGrading = nGetColorGrading(this.mNativeObject, engine.getNativeObject());
        ColorGrading colorGrading = this.mColorGrading;
        if (colorGrading == null || colorGrading.getNativeObject() != jNGetColorGrading) {
            this.mColorGrading = jNGetColorGrading == 0 ? null : new ColorGrading(jNGetColorGrading);
        }
        return this.mColorGrading;
    }

    public ViewerOptions getViewerOptions() {
        ViewerOptions viewerOptions = new ViewerOptions();
        nGetViewerOptions(this.mNativeObject, viewerOptions);
        return viewerOptions;
    }

    public void setOptions(Options options) {
        nSetOptions(this.mNativeObject, options.sleepDuration, options.minFrameCount, options.verbose);
    }

    public boolean shouldClose() {
        return nShouldClose(this.mNativeObject);
    }

    public void signalBatchMode() {
        nSignalBatchMode(this.mNativeObject);
    }

    public void startBatchMode() {
        nStartBatchMode(this.mNativeObject);
    }

    public void startRunning() {
        nStartRunning(this.mNativeObject);
    }

    public void stopRunning() {
        nStopRunning(this.mNativeObject);
    }

    public void tick(Engine engine, ViewerContent viewerContent, float f10) {
        long[] jArr;
        if (viewerContent.view == null || viewerContent.renderer == null) {
            throw new IllegalStateException("Must provide a View and Renderer");
        }
        MaterialInstance[] materialInstanceArr = viewerContent.materials;
        if (materialInstanceArr != null) {
            int length = materialInstanceArr.length;
            jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = viewerContent.materials[i10].getNativeObject();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        nTick(this.mNativeObject, engine.getNativeObject(), viewerContent.view.getNativeObject(), jArr2, viewerContent.renderer.getNativeObject(), f10);
    }

    public AutomationEngine() {
        long jNCreateDefaultAutomationEngine = nCreateDefaultAutomationEngine();
        this.mNativeObject = jNCreateDefaultAutomationEngine;
        if (jNCreateDefaultAutomationEngine == 0) {
            throw new IllegalStateException("Couldn't create AutomationEngine");
        }
    }
}
