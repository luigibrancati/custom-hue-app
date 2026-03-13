package z;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends n {
    public j(Object obj) {
        super(obj);
    }

    @Override // z.i.a
    public abstract Object g();

    @Override // z.i.a
    public Surface getSurface() {
        return ((OutputConfiguration) g()).getSurface();
    }
}
