package com.google.ar.core;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import com.google.ar.core.ArCoreApk;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class ak implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f31170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Object f31171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Object f31172c;

    public /* synthetic */ ak(Object obj, Object obj2, int i10) {
        this.f31170a = i10;
        this.f31171b = obj;
        this.f31172c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.function.Consumer] */
    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f31170a) {
            case 0:
                int i10 = am.f31176d;
                ((CameraDevice.StateCallback) this.f31171b).onOpened((CameraDevice) this.f31172c);
                break;
            case 1:
                this.f31172c.accept(this.f31171b);
                break;
            case 2:
                int i11 = am.f31176d;
                ((CameraDevice.StateCallback) this.f31171b).onDisconnected((CameraDevice) this.f31172c);
                break;
            case 3:
                int i12 = am.f31176d;
                ((CameraDevice.StateCallback) this.f31171b).onClosed((CameraDevice) this.f31172c);
                break;
            case 4:
                int i13 = an.f31180d;
                ((CameraCaptureSession.StateCallback) this.f31171b).onConfigured((CameraCaptureSession) this.f31172c);
                break;
            case 5:
                int i14 = an.f31180d;
                ((CameraCaptureSession.StateCallback) this.f31171b).onConfigureFailed((CameraCaptureSession) this.f31172c);
                break;
            case 6:
                int i15 = an.f31180d;
                ((CameraCaptureSession.StateCallback) this.f31171b).onReady((CameraCaptureSession) this.f31172c);
                break;
            case 7:
                int i16 = an.f31180d;
                ((CameraCaptureSession.StateCallback) this.f31171b).onActive((CameraCaptureSession) this.f31172c);
                break;
            default:
                int i17 = an.f31180d;
                ((CameraCaptureSession.StateCallback) this.f31171b).onClosed((CameraCaptureSession) this.f31172c);
                break;
        }
    }

    public /* synthetic */ ak(Consumer consumer, ArCoreApk.Availability availability, int i10) {
        this.f31170a = i10;
        this.f31172c = consumer;
        this.f31171b = availability;
    }
}
