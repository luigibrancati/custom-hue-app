package com.google.ar.core;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class am extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f31176d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Handler f31177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ CameraDevice.StateCallback f31178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SharedCamera f31179c;

    public am(SharedCamera sharedCamera, Handler handler, CameraDevice.StateCallback stateCallback) {
        this.f31177a = handler;
        this.f31178b = stateCallback;
        Objects.requireNonNull(sharedCamera);
        this.f31179c = sharedCamera;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.f31177a.post(new ak(this.f31178b, cameraDevice, 3));
        this.f31179c.e(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f31177a.post(new ak(this.f31178b, cameraDevice, 2));
        this.f31179c.f(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(final CameraDevice cameraDevice, final int i10) {
        final CameraDevice.StateCallback stateCallback = this.f31178b;
        this.f31177a.post(new Runnable() { // from class: com.google.ar.core.al
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                int i11 = am.f31176d;
                stateCallback.onError(cameraDevice, i10);
            }
        });
        this.f31179c.b();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        SharedCamera sharedCamera = this.f31179c;
        sharedCamera.n().b(cameraDevice);
        this.f31177a.post(new ak(this.f31178b, cameraDevice, 0));
        sharedCamera.d(cameraDevice);
        sharedCamera.n().e(sharedCamera.l());
        sharedCamera.n().g(sharedCamera.m());
    }
}
