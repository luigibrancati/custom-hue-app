package x;

import L.AbstractC1114o;
import L.C1118q;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class X0 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1114o f46833a;

    public X0(AbstractC1114o abstractC1114o) {
        if (abstractC1114o == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f46833a = abstractC1114o;
    }

    public final int a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof L.k1) && (num = (Integer) ((L.k1) captureRequest.getTag()).d("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        L.k1 k1VarB;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            X0.h.b(tag instanceof L.k1, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            k1VarB = (L.k1) tag;
        } else {
            k1VarB = L.k1.b();
        }
        this.f46833a.b(a(captureRequest), new C6219f(k1VarB, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f46833a.c(a(captureRequest), new C1118q(C1118q.a.ERROR));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
        this.f46833a.d(a(captureRequest));
    }
}
