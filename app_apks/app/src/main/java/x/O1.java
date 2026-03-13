package x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class O1 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureRequest f46690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f46691b;

    public O1(CaptureRequest forwardedRequest, CameraCaptureSession.CaptureCallback delegate) {
        AbstractC4862t.e(forwardedRequest, "forwardedRequest");
        AbstractC4862t.e(delegate, "delegate");
        this.f46690a = forwardedRequest;
        this.f46691b = delegate;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession session, CaptureRequest request, Surface target, long j10) {
        AbstractC4862t.e(session, "session");
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(target, "target");
        this.f46691b.onCaptureBufferLost(session, this.f46690a, target, j10);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) {
        AbstractC4862t.e(session, "session");
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(result, "result");
        this.f46691b.onCaptureCompleted(session, this.f46690a, result);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession session, CaptureRequest request, CaptureFailure failure) {
        AbstractC4862t.e(session, "session");
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(failure, "failure");
        this.f46691b.onCaptureFailed(session, this.f46690a, failure);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession session, CaptureRequest request, CaptureResult partialResult) {
        AbstractC4862t.e(session, "session");
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(partialResult, "partialResult");
        this.f46691b.onCaptureProgressed(session, this.f46690a, partialResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession session, int i10) {
        AbstractC4862t.e(session, "session");
        this.f46691b.onCaptureSequenceAborted(session, i10);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession session, int i10, long j10) {
        AbstractC4862t.e(session, "session");
        this.f46691b.onCaptureSequenceCompleted(session, i10, j10);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession session, CaptureRequest request, long j10, long j11) {
        AbstractC4862t.e(session, "session");
        AbstractC4862t.e(request, "request");
        this.f46691b.onCaptureStarted(session, this.f46690a, j10, j11);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(CameraCaptureSession session, CaptureRequest request, long j10, long j11) {
        AbstractC4862t.e(session, "session");
        AbstractC4862t.e(request, "request");
        this.f46691b.onReadoutStarted(session, this.f46690a, j10, j11);
    }
}
