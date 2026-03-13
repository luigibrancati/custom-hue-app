package y;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class u extends x {
    public u(Context context) {
        super(context, null);
    }

    @Override // y.t.a
    public void b(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f48325a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // y.t.a
    public void g(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f48325a.unregisterAvailabilityCallback(availabilityCallback);
    }
}
