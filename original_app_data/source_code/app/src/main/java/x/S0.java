package x;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class S0 {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f46779a = new ArrayList();

        public a(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
                if (!(stateCallback instanceof b)) {
                    this.f46779a.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Iterator it = this.f46779a.iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            Iterator it = this.f46779a.iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            Iterator it = this.f46779a.iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i10);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Iterator it = this.f46779a.iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
            }
        }
    }

    public static CameraDevice.StateCallback a(List list) {
        return list.isEmpty() ? b() : list.size() == 1 ? (CameraDevice.StateCallback) list.get(0) : new a(list);
    }

    public static CameraDevice.StateCallback b() {
        return new b();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends CameraDevice.StateCallback {
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
        }
    }
}
