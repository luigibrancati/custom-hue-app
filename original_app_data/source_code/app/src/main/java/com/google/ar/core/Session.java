package com.google.ar.core;

import android.content.Context;
import android.net.Uri;
import com.google.ar.core.Anchor;
import com.google.ar.core.Config;
import com.google.ar.core.HostCloudAnchorFuture;
import com.google.ar.core.ResolveCloudAnchorFuture;
import com.google.ar.core.VpsAvailabilityFuture;
import com.google.ar.core.annotations.UsedByNative;
import com.google.ar.core.exceptions.FatalException;
import io.sentry.protocol.SentryStackFrame;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Session {
    private static final String TAG = "ARCore-Session";
    final p faceCache;
    final long nativeSymbolTableHandle;
    long nativeWrapperHandle;
    private SharedCamera sharedCamera;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Feature {
        FRONT_CAMERA(1),
        SHARED_CAMERA(1000);

        final int nativeCode;

        Feature(int i10) {
            this.nativeCode = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum FeatureMapQuality {
        INSUFFICIENT(0),
        SUFFICIENT(1),
        GOOD(2);

        final int nativeCode;

        FeatureMapQuality(int i10) {
            this.nativeCode = i10;
        }

        public static FeatureMapQuality forNumber(int i10) {
            for (FeatureMapQuality featureMapQuality : values()) {
                if (featureMapQuality.nativeCode == i10) {
                    return featureMapQuality;
                }
            }
            throw new FatalException(p.b((byte) 53, i10, "Unexpected value for native FeatureMapQuality, value="));
        }
    }

    public Session() {
        this.faceCache = new p();
        this.sharedCamera = null;
        this.nativeWrapperHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    @Deprecated
    public static Session createForSharedCamera(Context context) {
        return new Session(context, EnumSet.of(Feature.SHARED_CAMERA));
    }

    public static ByteBuffer directByteBufferOrDefault(ByteBuffer byteBuffer) {
        return byteBuffer == null ? ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder()) : byteBuffer.order(ByteOrder.nativeOrder());
    }

    public static void loadDynamicSymbolsAfterSessionCreate() {
        ArImage.nativeLoadSymbols();
        ImageMetadata.nativeLoadSymbols();
    }

    private native long[] nativeAcquireAllAnchors(long j10);

    private native long nativeAcquireEarth(long j10);

    private native int nativeCheckModuleAvailability(long j10, int i10);

    private native void nativeCloseSession(long j10);

    private native void nativeConfigure(long j10, long j11);

    private native long nativeCreateAnchor(long j10, Pose pose);

    private static native long nativeCreateSessionAndWrapperWithFeatures(Context context, int[] iArr);

    public static native long nativeCreateSessionWrapperFromHandle(long j10, long j11);

    private native int nativeEstimateFeatureMapQualityForHosting(long j10, Pose pose);

    private native long nativeGetCameraConfig(long j10);

    private native void nativeGetConfig(long j10, long j11);

    private native int nativeGetPlaybackStatus(long j10);

    private native void nativeGetRandomAccessStats(long j10, long j11);

    private native int nativeGetRecordingStatus(long j10);

    private native long[] nativeGetSupportedCameraConfigs(long j10);

    private native long[] nativeGetSupportedCameraConfigsWithFilter(long j10, long j11);

    private native long nativeGetSymbolTable(long j10);

    private native long nativeHostCloudAnchor(long j10, long j11);

    private native long[] nativeHostCloudAnchorAsync(long j10, long j11, int i10, HostCloudAnchorFuture.CallbackWrapper callbackWrapper);

    private native long nativeHostCloudAnchorWithTtl(long j10, long j11, int i10);

    private native boolean nativeIsSupported(long j10, long j11);

    private native void nativePause(long j10);

    private native void nativeRequestModuleInstallDeferred(long j10, int[] iArr);

    private native void nativeRequestModuleInstallImmediate(long j10, int[] iArr);

    private native long nativeResolveCloudAnchor(long j10, String str);

    private native long[] nativeResolveCloudAnchorAsync(long j10, String str, ResolveCloudAnchorFuture.CallbackWrapper callbackWrapper);

    private native void nativeResume(long j10);

    private native int nativeSetCameraConfig(long j10, long j11);

    private native void nativeSetCameraTextureName(long j10, int i10);

    private native void nativeSetCameraTextureNames(long j10, int[] iArr);

    private native void nativeSetDisplayGeometry(long j10, int i10, int i11, int i12);

    private native void nativeSetPlaybackDataset(long j10, String str);

    private native void nativeSetPlaybackDatasetUri(long j10, String str);

    private native void nativeStartRecording(long j10, long j11);

    private native void nativeStopRecording(long j10);

    private native void nativeUpdate(long j10, long j11);

    private void pauseSharedCameraIfInUse() {
        SharedCamera sharedCamera = this.sharedCamera;
        if (sharedCamera != null) {
            sharedCamera.pause();
        }
    }

    public static void throwExceptionFromArStatus(int i10) throws Exception {
        throwExceptionFromArStatus(null, i10, null, null);
    }

    public VpsAvailabilityFuture checkVpsAvailabilityAsync(double d10, double d11, Consumer<VpsAvailability> consumer) {
        long[] jArrNativeCheckVpsAvailabilityAsync = nativeCheckVpsAvailabilityAsync(this.nativeWrapperHandle, d10, d11, consumer != null ? new VpsAvailabilityFuture.CallbackWrapper(consumer) : null);
        return new VpsAvailabilityFuture(this, jArrNativeCheckVpsAvailabilityAsync[0], jArrNativeCheckVpsAvailabilityAsync[1]);
    }

    public void close() {
        nativeCloseSession(this.nativeWrapperHandle);
    }

    public void configure(Config config) {
        nativeConfigure(this.nativeWrapperHandle, config.nativeHandle);
    }

    public Collection<Anchor> convertNativeAnchorsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(new Anchor(j10, this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public List<CameraConfig> convertNativeCameraConfigsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(new CameraConfig(this, j10));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Collection<TrackData> convertNativeTrackDataToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(new TrackData(j10, this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public <T extends Trackable> Collection<T> convertNativeTrackablesToCollection(Class<T> cls, long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            Trackable trackableCreateTrackable = createTrackable(j10);
            if (trackableCreateTrackable != null) {
                arrayList.add(cls.cast(trackableCreateTrackable));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Anchor createAnchor(Pose pose) {
        return new Anchor(nativeCreateAnchor(this.nativeWrapperHandle, pose), this);
    }

    public Trackable createTrackable(long j10) {
        ai aiVar;
        int iInternalGetType = TrackableBase.internalGetType(this.nativeWrapperHandle, j10);
        ai[] aiVarArrValues = ai.values();
        int length = aiVarArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                aiVar = null;
                break;
            }
            aiVar = aiVarArrValues[i10];
            if (aiVar.f31168k == iInternalGetType) {
                break;
            }
            i10++;
        }
        if (aiVar == null) {
            TrackableBase.internalReleaseNativeHandle(this.nativeSymbolTableHandle, j10);
            return null;
        }
        switch (aiVar.ordinal()) {
            case 0:
            case 1:
                return null;
            case 2:
                return new Plane(j10, this);
            case 3:
                return new Point(j10, this);
            case 4:
                return new AugmentedImage(j10, this);
            case 5:
                return this.faceCache.a(j10, this);
            case 6:
                return new StreetscapeGeometry(j10, this);
            case 7:
                return getEarth();
            case 8:
                return new DepthPoint(j10, this);
            case 9:
                return new InstantPlacementPoint(j10, this);
            default:
                throw null;
        }
    }

    public FeatureMapQuality estimateFeatureMapQualityForHosting(Pose pose) {
        return FeatureMapQuality.forNumber(nativeEstimateFeatureMapQualityForHosting(this.nativeWrapperHandle, pose));
    }

    public void finalize() throws Throwable {
        long j10 = this.nativeWrapperHandle;
        if (j10 != 0) {
            nativeDestroySessionWrapper(j10);
            this.nativeWrapperHandle = 0L;
        }
        super.finalize();
    }

    public Collection<Anchor> getAllAnchors() {
        return convertNativeAnchorsToCollection(nativeAcquireAllAnchors(this.nativeWrapperHandle));
    }

    public <T extends Trackable> Collection<T> getAllTrackables(Class<T> cls) {
        ai aiVarA = ai.a(cls);
        return aiVarA == ai.UNKNOWN_TO_JAVA ? Collections.EMPTY_LIST : convertNativeTrackablesToCollection(cls, nativeAcquireAllTrackables(this.nativeWrapperHandle, aiVarA.f31168k));
    }

    public CameraConfig getCameraConfig() {
        return new CameraConfig(this, nativeGetCameraConfig(this.nativeWrapperHandle));
    }

    public Config getConfig() {
        Config config = new Config(this);
        getConfig(config);
        return config;
    }

    public Earth getEarth() {
        long jNativeAcquireEarth = nativeAcquireEarth(this.nativeWrapperHandle);
        if (jNativeAcquireEarth != 0) {
            return new Earth(jNativeAcquireEarth, this);
        }
        return null;
    }

    public PlaybackStatus getPlaybackStatus() {
        return PlaybackStatus.forNumber(nativeGetPlaybackStatus(this.nativeWrapperHandle));
    }

    public RecordingStatus getRecordingStatus() {
        return RecordingStatus.forNumber(nativeGetRecordingStatus(this.nativeWrapperHandle));
    }

    public SharedCamera getSharedCamera() {
        SharedCamera sharedCamera = this.sharedCamera;
        if (sharedCamera != null) {
            return sharedCamera;
        }
        throw new IllegalStateException("Shared camera is not in use, please create session using new Session(context, EnumSet.of(Session.Feature.SHARED_CAMERA)).");
    }

    @Deprecated
    public List<CameraConfig> getSupportedCameraConfigs() {
        return convertNativeCameraConfigsToCollection(nativeGetSupportedCameraConfigs(this.nativeWrapperHandle));
    }

    @Deprecated
    public Anchor hostCloudAnchor(Anchor anchor) {
        return new Anchor(nativeHostCloudAnchor(this.nativeWrapperHandle, anchor.nativeHandle), this);
    }

    public HostCloudAnchorFuture hostCloudAnchorAsync(Anchor anchor, int i10, BiConsumer<String, Anchor.CloudAnchorState> biConsumer) {
        long[] jArrNativeHostCloudAnchorAsync = nativeHostCloudAnchorAsync(this.nativeWrapperHandle, anchor.nativeHandle, i10, biConsumer != null ? new HostCloudAnchorFuture.CallbackWrapper(biConsumer) : null);
        return new HostCloudAnchorFuture(this, jArrNativeHostCloudAnchorAsync[0], jArrNativeHostCloudAnchorAsync[1]);
    }

    @Deprecated
    public Anchor hostCloudAnchorWithTtl(Anchor anchor, int i10) {
        return new Anchor(nativeHostCloudAnchorWithTtl(this.nativeWrapperHandle, anchor.nativeHandle, i10), this);
    }

    public boolean isDepthModeSupported(Config.DepthMode depthMode) {
        return nativeIsDepthModeSupported(this.nativeWrapperHandle, depthMode.nativeCode);
    }

    public boolean isGeospatialModeSupported(Config.GeospatialMode geospatialMode) {
        return nativeIsGeospatialModeSupported(this.nativeWrapperHandle, geospatialMode.nativeCode);
    }

    public boolean isImageStabilizationModeSupported(Config.ImageStabilizationMode imageStabilizationMode) {
        return nativeIsImageStabilizationModeSupported(this.nativeWrapperHandle, imageStabilizationMode.nativeCode);
    }

    public boolean isSemanticModeSupported(Config.SemanticMode semanticMode) {
        return nativeIsSemanticModeSupported(this.nativeWrapperHandle, semanticMode.nativeCode);
    }

    public boolean isSharedCameraUsed() {
        return this.sharedCamera != null;
    }

    @Deprecated
    public boolean isSupported(Config config) {
        return nativeIsSupported(this.nativeWrapperHandle, config.nativeHandle);
    }

    public native long[] nativeAcquireAllTrackables(long j10, int i10);

    public native long[] nativeCheckVpsAvailabilityAsync(long j10, double d10, double d11, VpsAvailabilityFuture.CallbackWrapper callbackWrapper);

    public native void nativeDestroySessionWrapper(long j10);

    public native long nativeGetSessionNativeHandle(long j10);

    public native boolean nativeIsDepthModeSupported(long j10, int i10);

    public native boolean nativeIsGeospatialModeSupported(long j10, int i10);

    public native boolean nativeIsImageStabilizationModeSupported(long j10, int i10);

    public native boolean nativeIsSemanticModeSupported(long j10, int i10);

    public native long nativeReleaseSessionOwnership(long j10);

    public void pause() {
        pauseSharedCameraIfInUse();
        nativePause(this.nativeWrapperHandle);
    }

    @Deprecated
    public Anchor resolveCloudAnchor(String str) {
        return new Anchor(nativeResolveCloudAnchor(this.nativeWrapperHandle, str), this);
    }

    public ResolveCloudAnchorFuture resolveCloudAnchorAsync(String str, BiConsumer<Anchor, Anchor.CloudAnchorState> biConsumer) {
        long[] jArrNativeResolveCloudAnchorAsync = nativeResolveCloudAnchorAsync(this.nativeWrapperHandle, str, biConsumer != null ? new ResolveCloudAnchorFuture.CallbackWrapper(this, biConsumer) : null);
        return new ResolveCloudAnchorFuture(this, jArrNativeResolveCloudAnchorAsync[0], jArrNativeResolveCloudAnchorAsync[1]);
    }

    public void resume() {
        nativeResume(this.nativeWrapperHandle);
    }

    public void setCameraConfig(CameraConfig cameraConfig) {
        nativeSetCameraConfig(this.nativeWrapperHandle, cameraConfig.nativeHandle);
    }

    public void setCameraTextureName(int i10) {
        nativeSetCameraTextureName(this.nativeWrapperHandle, i10);
    }

    public void setCameraTextureNames(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("textureIds must be an array with at least 1 entry.");
        }
        nativeSetCameraTextureNames(this.nativeWrapperHandle, iArr);
    }

    public void setDisplayGeometry(int i10, int i11, int i12) {
        nativeSetDisplayGeometry(this.nativeWrapperHandle, i10, i11, i12);
    }

    @Deprecated
    public void setPlaybackDataset(String str) {
        nativeSetPlaybackDataset(this.nativeWrapperHandle, str);
    }

    public void setPlaybackDatasetUri(Uri uri) {
        nativeSetPlaybackDatasetUri(this.nativeWrapperHandle, uri.toString());
    }

    public void startRecording(RecordingConfig recordingConfig) {
        if (recordingConfig == null) {
            throw new IllegalArgumentException();
        }
        nativeStartRecording(this.nativeWrapperHandle, recordingConfig.nativeHandle);
    }

    public void stopRecording() {
        nativeStopRecording(this.nativeWrapperHandle);
    }

    public Frame update() {
        Frame frame = new Frame(this);
        nativeUpdate(this.nativeWrapperHandle, frame.nativeHandle);
        return frame;
    }

    public Session(long j10) {
        this.faceCache = new p();
        this.sharedCamera = null;
        this.nativeWrapperHandle = j10;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(j10);
    }

    @UsedByNative("session_jni.cc")
    public static void throwExceptionFromArStatus(String str, int i10, String[] strArr, int[] iArr) throws Exception {
        int length;
        for (ah ahVar : ah.values()) {
            if (ahVar.f31154G == i10) {
                Class cls = ahVar.f31155H;
                if (cls == null) {
                    return;
                }
                if (strArr == null || iArr == null || (length = strArr.length) != iArr.length) {
                    length = 0;
                }
                String str2 = ahVar.f31156I;
                if (str2 == null && str == null) {
                    throw ((Exception) cls.getConstructor(null).newInstance(null));
                }
                if (str2 != null) {
                    str = str == null ? str2 : str2.concat(str);
                }
                Exception exc = (Exception) cls.getConstructor(String.class).newInstance(str);
                StackTraceElement[] stackTrace = exc.getStackTrace();
                StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + length];
                int i11 = 0;
                while (i11 < length) {
                    stackTraceElementArr[i11] = new StackTraceElement("ARCore", SentryStackFrame.JsonKeys.NATIVE, strArr[i11], iArr[i11]);
                    i11++;
                }
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stackTraceElementArr[i11] = stackTraceElement;
                    i11++;
                }
                exc.setStackTrace(stackTraceElementArr);
                throw exc;
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 23);
        sb2.append("Unexpected error code: ");
        sb2.append(i10);
        throw new FatalException(sb2.toString());
    }

    public void getConfig(Config config) {
        nativeGetConfig(this.nativeWrapperHandle, config.nativeHandle);
    }

    public List<CameraConfig> getSupportedCameraConfigs(CameraConfigFilter cameraConfigFilter) {
        if (cameraConfigFilter != null) {
            long[] jArrNativeGetSupportedCameraConfigsWithFilter = nativeGetSupportedCameraConfigsWithFilter(this.nativeWrapperHandle, cameraConfigFilter.nativeHandle);
            ArrayList arrayList = new ArrayList(jArrNativeGetSupportedCameraConfigsWithFilter.length);
            for (long j10 : jArrNativeGetSupportedCameraConfigsWithFilter) {
                arrayList.add(new CameraConfig(this, j10));
            }
            return Collections.unmodifiableList(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public Session(Context context) {
        this(context, EnumSet.noneOf(Feature.class));
    }

    public Session(Context context, Set<Feature> set) {
        this.faceCache = new p();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        int[] iArr = new int[set.size() + 1];
        Iterator<Feature> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().nativeCode;
            i10++;
        }
        iArr[i10] = 0;
        long jNativeCreateSessionAndWrapperWithFeatures = nativeCreateSessionAndWrapperWithFeatures(context, iArr);
        this.nativeWrapperHandle = jNativeCreateSessionAndWrapperWithFeatures;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(jNativeCreateSessionAndWrapperWithFeatures);
        if (set.contains(Feature.SHARED_CAMERA)) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
    }
}
