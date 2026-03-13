package com.cloudwebrtc.webrtc;

import android.util.Log;
import org.webrtc.CameraVideoCapturer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
class CameraEventsHandler implements CameraVideoCapturer.CameraEventsHandler {
    private static final String TAG = "FlutterWebRTCPlugin";
    private CameraState state = CameraState.NEW;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum CameraState {
        NEW,
        OPENING,
        OPENED,
        CLOSED,
        DISCONNECTED,
        ERROR,
        FREEZED
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraClosed() {
        Log.d("FlutterWebRTCPlugin", "CameraEventsHandler.onFirstFrameAvailable");
        this.state = CameraState.CLOSED;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraDisconnected() {
        Log.d("FlutterWebRTCPlugin", "CameraEventsHandler.onCameraDisconnected");
        this.state = CameraState.DISCONNECTED;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraError(String str) {
        Log.d("FlutterWebRTCPlugin", String.format("CameraEventsHandler.onCameraError: errorDescription=%s", str));
        this.state = CameraState.ERROR;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraFreezed(String str) {
        Log.d("FlutterWebRTCPlugin", String.format("CameraEventsHandler.onCameraFreezed: errorDescription=%s", str));
        this.state = CameraState.FREEZED;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraOpening(String str) {
        Log.d("FlutterWebRTCPlugin", String.format("CameraEventsHandler.onCameraOpening: cameraName=%s", str));
        this.state = CameraState.OPENING;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onFirstFrameAvailable() {
        Log.d("FlutterWebRTCPlugin", "CameraEventsHandler.onFirstFrameAvailable");
        this.state = CameraState.OPENED;
    }

    public void waitForCameraClosed() {
        Log.d("FlutterWebRTCPlugin", "CameraEventsHandler.waitForCameraClosed");
        while (true) {
            CameraState cameraState = this.state;
            if (cameraState == CameraState.CLOSED || cameraState == CameraState.ERROR) {
                return;
            }
            try {
                Thread.sleep(1L);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
    }

    public void waitForCameraOpen() {
        Log.d("FlutterWebRTCPlugin", "CameraEventsHandler.waitForCameraOpen");
        while (true) {
            CameraState cameraState = this.state;
            if (cameraState == CameraState.OPENED || cameraState == CameraState.ERROR) {
                return;
            }
            try {
                Thread.sleep(1L);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
    }
}
