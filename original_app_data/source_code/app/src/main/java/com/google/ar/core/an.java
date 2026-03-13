package com.google.ar.core;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class an extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f31180d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Handler f31181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ CameraCaptureSession.StateCallback f31182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SharedCamera f31183c;

    public an(SharedCamera sharedCamera, Handler handler, CameraCaptureSession.StateCallback stateCallback) {
        this.f31181a = handler;
        this.f31182b = stateCallback;
        Objects.requireNonNull(sharedCamera);
        this.f31183c = sharedCamera;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f31181a.post(new ak(this.f31182b, cameraCaptureSession, 7));
        this.f31183c.g(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f31181a.post(new ak(this.f31182b, cameraCaptureSession, 8));
        this.f31183c.h(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f31181a.post(new ak(this.f31182b, cameraCaptureSession, 5));
        this.f31183c.i(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.f31181a.post(new ak(this.f31182b, cameraCaptureSession, 4));
        SharedCamera sharedCamera = this.f31183c;
        sharedCamera.j(cameraCaptureSession);
        if (sharedCamera.n().a() != null) {
            sharedCamera.c();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f31181a.post(new ak(this.f31182b, cameraCaptureSession, 6));
        this.f31183c.k(cameraCaptureSession);
    }
}
