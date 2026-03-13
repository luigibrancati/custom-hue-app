package Z;

import Z.d;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraDevice.CameraDeviceSetup f20077a;

    public b(CameraManager cameraManager, String str) {
        this.f20077a = cameraManager.getCameraDeviceSetup(str);
    }

    public static long b() {
        String property = System.getProperty("ro.build.date.utc");
        if (property == null) {
            return 0L;
        }
        try {
            return Long.parseLong(property) * 1000;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // Z.d
    public d.a a(SessionConfiguration sessionConfiguration) {
        return new d.a(this.f20077a.isSessionConfigurationSupported(sessionConfiguration) ? 1 : 2, 2, b());
    }
}
