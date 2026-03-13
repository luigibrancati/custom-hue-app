package x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import y.C6370f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface U1 {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        z.o b(int i10, List list, c cVar);

        Executor getExecutor();

        O7.e h(List list, long j10);

        O7.e i(CameraDevice cameraDevice, z.o oVar, List list);

        boolean stop();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f46818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f46819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f46820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C6230i1 f46821d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final L.X0 f46822e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final L.X0 f46823f;

        public b(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, C6230i1 c6230i1, L.X0 x02, L.X0 x03) {
            this.f46818a = executor;
            this.f46819b = scheduledExecutorService;
            this.f46820c = handler;
            this.f46821d = c6230i1;
            this.f46822e = x02;
            this.f46823f = x03;
        }

        public a a() {
            return new e2(this.f46822e, this.f46823f, this.f46821d, this.f46818a, this.f46819b, this.f46820c);
        }
    }

    void a();

    void c(int i10);

    void close();

    void d();

    CameraDevice e();

    int f(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    List g(CaptureRequest captureRequest);

    int j(List list, CameraCaptureSession.CaptureCallback captureCallback);

    int k(List list, CameraCaptureSession.CaptureCallback captureCallback);

    C6370f l();

    c m();

    void n();

    O7.e o();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c {
        public void p(U1 u12) {
        }

        public void q(U1 u12) {
        }

        public void r(U1 u12) {
        }

        public void s(U1 u12) {
        }

        public void t(U1 u12) {
        }

        public void u(U1 u12) {
        }

        public void v(U1 u12) {
        }

        public void w(U1 u12, Surface surface) {
        }
    }
}
