package y;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class w extends v {
    public w(Context context) {
        super(context);
    }

    @Override // y.t.a
    public Set d() throws C6369e {
        try {
            return this.f48325a.getConcurrentCameraIds();
        } catch (CameraAccessException e10) {
            throw C6369e.d(e10);
        }
    }
}
