package y;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class v extends u {
    public v(Context context) {
        super(context);
    }

    @Override // y.t.a
    public CameraCharacteristics c(String str) throws C6369e {
        try {
            return this.f48325a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw C6369e.d(e10);
        }
    }

    @Override // y.t.a
    public void e(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C6369e {
        try {
            this.f48325a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw C6369e.d(e10);
        }
    }
}
