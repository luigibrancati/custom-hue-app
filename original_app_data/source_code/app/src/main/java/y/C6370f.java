package y;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: y.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6370f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f48312a;

    /* JADX INFO: renamed from: y.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        CameraCaptureSession a();

        int b(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int c(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int d(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);
    }

    public C6370f(CameraCaptureSession cameraCaptureSession, Handler handler) {
        this.f48312a = new C6371g(cameraCaptureSession);
    }

    public static C6370f e(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C6370f(cameraCaptureSession, handler);
    }

    public int a(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f48312a.b(list, executor, captureCallback);
    }

    public int b(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f48312a.c(list, executor, captureCallback);
    }

    public int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f48312a.d(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession d() {
        return this.f48312a.a();
    }
}
