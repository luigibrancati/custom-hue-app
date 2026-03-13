package y;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import y.t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class x implements t.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraManager f48325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f48326b;

    public x(Context context, Object obj) {
        this.f48325a = (CameraManager) context.getSystemService("camera");
        this.f48326b = obj;
    }

    @Override // y.t.a
    public CameraManager a() {
        return this.f48325a;
    }

    @Override // y.t.a
    public String[] f() throws C6369e {
        try {
            return this.f48325a.getCameraIdList();
        } catch (CameraAccessException e10) {
            throw C6369e.d(e10);
        }
    }
}
