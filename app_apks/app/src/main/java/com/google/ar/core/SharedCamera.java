package com.google.ar.core;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class SharedCamera {
    private static final String TAG = "ArSdk-SharedCamera";
    private final Session session;
    private Handler sharedCameraHandler;
    private final ap sharedCameraInfo = new ap(null);
    private boolean cameraSharedWithAr = false;

    public SharedCamera(Session session) {
        HandlerThread handlerThread = new HandlerThread("SharedCameraHandlerThread");
        handlerThread.start();
        this.sharedCameraHandler = new Handler(handlerThread.getLooper());
        this.session = session;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: close, reason: merged with bridge method [inline-methods] */
    public void b() {
        Handler handler = this.sharedCameraHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.sharedCameraHandler.getLooper().quit();
            this.sharedCameraHandler = null;
        }
    }

    private ImageReader getCpuImageReader() {
        return nativeSharedCameraGetImageReader(this.session.nativeWrapperHandle, this.sharedCameraInfo.a());
    }

    private ImageReader getCpuImageReaderMotionTracking() {
        return nativeSharedCameraGetImageReaderMotionTracking(this.session.nativeWrapperHandle, this.sharedCameraInfo.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getGpuSurface, reason: merged with bridge method [inline-methods] */
    public Surface m() {
        return nativeSharedCameraGetSurface(this.session.nativeWrapperHandle, this.sharedCameraInfo.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getGpuSurfaceTexture, reason: merged with bridge method [inline-methods] */
    public SurfaceTexture l() {
        return nativeSharedCameraGetSurfaceTexture(this.session.nativeWrapperHandle, this.sharedCameraInfo.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setDummyOnImageAvailableListener$0(ImageReader imageReader) {
        Image imageAcquireLatestImage = imageReader.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            imageAcquireLatestImage.close();
        }
    }

    private native void nativeSharedCameraCaptureSessionActive(long j10, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionClosed(long j10, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionConfigureFailed(long j10, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionConfigured(long j10, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionReady(long j10, CameraCaptureSession cameraCaptureSession);

    private native ImageReader nativeSharedCameraGetImageReader(long j10, CameraDevice cameraDevice);

    private native ImageReader nativeSharedCameraGetImageReaderMotionTracking(long j10, CameraDevice cameraDevice);

    private native Surface nativeSharedCameraGetSurface(long j10, CameraDevice cameraDevice);

    private native SurfaceTexture nativeSharedCameraGetSurfaceTexture(long j10, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnClosed(long j10, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnDisconnected(long j10, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnOpened(long j10, CameraDevice cameraDevice);

    private native void nativeSharedCameraSetAppSurfaces(long j10, String str, List<Surface> list);

    private native void nativeSharedCameraSetCaptureCallback(long j10, CameraCaptureSession.CaptureCallback captureCallback, Handler handler);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCaptureSessionActive, reason: merged with bridge method [inline-methods] */
    public void g(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionActive(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCaptureSessionClosed, reason: merged with bridge method [inline-methods] */
    public void h(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionClosed(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCaptureSessionConfigureFailed, reason: merged with bridge method [inline-methods] */
    public void i(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionConfigureFailed(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCaptureSessionConfigured, reason: merged with bridge method [inline-methods] */
    public void j(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionConfigured(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCaptureSessionReady, reason: merged with bridge method [inline-methods] */
    public void k(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionReady(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onDeviceClosed, reason: merged with bridge method [inline-methods] */
    public void e(CameraDevice cameraDevice) {
        nativeSharedCameraOnClosed(this.session.nativeWrapperHandle, cameraDevice);
        this.cameraSharedWithAr = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onDeviceDisconnected, reason: merged with bridge method [inline-methods] */
    public void f(CameraDevice cameraDevice) {
        nativeSharedCameraOnDisconnected(this.session.nativeWrapperHandle, cameraDevice);
        this.cameraSharedWithAr = false;
        this.sharedCameraInfo.b(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onDeviceOpened, reason: merged with bridge method [inline-methods] */
    public void d(CameraDevice cameraDevice) {
        this.sharedCameraInfo.b(cameraDevice);
        this.cameraSharedWithAr = true;
        nativeSharedCameraOnOpened(this.session.nativeWrapperHandle, cameraDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setDummyListenerToAvoidImageBufferStarvation, reason: merged with bridge method [inline-methods] */
    public void c() {
        setDummyOnImageAvailableListener(getCpuImageReader());
        setDummyOnImageAvailableListener(getCpuImageReaderMotionTracking());
    }

    private void setDummyOnImageAvailableListener(ImageReader imageReader) {
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(ao.f31184a, this.sharedCameraHandler);
        }
    }

    public CameraDevice.StateCallback createARDeviceStateCallback(CameraDevice.StateCallback stateCallback, Handler handler) {
        return new am(this, handler, stateCallback);
    }

    public CameraCaptureSession.StateCallback createARSessionStateCallback(CameraCaptureSession.StateCallback stateCallback, Handler handler) {
        return new an(this, handler, stateCallback);
    }

    public List<Surface> getArCoreSurfaces() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.sharedCameraInfo.f());
        ImageReader cpuImageReaderMotionTracking = getCpuImageReaderMotionTracking();
        if (cpuImageReaderMotionTracking != null) {
            arrayList.add(cpuImageReaderMotionTracking.getSurface());
        }
        arrayList.add(getCpuImageReader().getSurface());
        return arrayList;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.sharedCameraInfo.d();
    }

    public final /* synthetic */ ap n() {
        return this.sharedCameraInfo;
    }

    public void pause() {
        if (this.sharedCameraInfo.a() != null) {
            c();
        }
    }

    public void setAppSurfaces(String str, List<Surface> list) {
        this.sharedCameraInfo.c(str, list);
        nativeSharedCameraSetAppSurfaces(this.session.nativeWrapperHandle, str, list);
    }

    public void setCaptureCallback(CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        nativeSharedCameraSetCaptureCallback(this.session.nativeWrapperHandle, captureCallback, handler);
    }
}
