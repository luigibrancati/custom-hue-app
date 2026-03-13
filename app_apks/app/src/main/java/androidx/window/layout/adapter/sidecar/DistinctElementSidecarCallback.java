package androidx.window.layout.adapter.sidecar;

import F3.e;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f24678b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f24680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f24681e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24677a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f24679c = new WeakHashMap();

    public DistinctElementSidecarCallback(e eVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f24680d = eVar;
        this.f24681e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f24677a) {
            try {
                if (this.f24680d.e(this.f24678b, sidecarDeviceState)) {
                    return;
                }
                this.f24678b = sidecarDeviceState;
                this.f24681e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f24677a) {
            try {
                if (this.f24680d.h((SidecarWindowLayoutInfo) this.f24679c.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f24679c.put(iBinder, sidecarWindowLayoutInfo);
                this.f24681e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
