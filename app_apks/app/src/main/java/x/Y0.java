package x;

import L.AbstractC1114o;
import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class Y0 extends AbstractC1114o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f46853a;

    public Y0(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f46853a = captureCallback;
    }

    public static Y0 e(CameraCaptureSession.CaptureCallback captureCallback) {
        return new Y0(captureCallback);
    }

    public CameraCaptureSession.CaptureCallback f() {
        return this.f46853a;
    }
}
