package y;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class r extends q {
    public r(CameraDevice cameraDevice) {
        super((CameraDevice) X0.h.g(cameraDevice), null);
    }

    @Override // y.C6379o.a
    public void a(z.o oVar) throws C6369e {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) oVar.e();
        X0.h.g(sessionConfiguration);
        try {
            this.f48321a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e10) {
            throw C6369e.d(e10);
        }
    }
}
