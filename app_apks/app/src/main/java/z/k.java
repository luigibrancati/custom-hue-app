package z;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends j {
    public k(Object obj) {
        super(obj);
    }

    @Override // z.i.a
    public void b(Surface surface) {
        ((OutputConfiguration) g()).addSurface(surface);
    }

    @Override // z.i.a
    public void e() {
        ((OutputConfiguration) g()).enableSurfaceSharing();
    }

    @Override // z.j, z.i.a
    public abstract Object g();
}
