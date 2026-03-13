package y;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;

/* JADX INFO: renamed from: y.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6379o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f48320a;

    /* JADX INFO: renamed from: y.o$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(z.o oVar);
    }

    public C6379o(CameraDevice cameraDevice, Handler handler) {
        this.f48320a = new r(cameraDevice);
    }

    public static C6379o b(CameraDevice cameraDevice, Handler handler) {
        return new C6379o(cameraDevice, handler);
    }

    public void a(z.o oVar) {
        this.f48320a.a(oVar);
    }
}
