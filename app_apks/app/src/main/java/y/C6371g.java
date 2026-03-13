package y;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: y.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C6371g extends AbstractC6372h {
    public C6371g(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // y.C6370f.a
    public int b(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f48313a.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // y.C6370f.a
    public int c(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f48313a.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    @Override // y.C6370f.a
    public int d(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f48313a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
