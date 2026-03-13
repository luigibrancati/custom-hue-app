package mb;

import cb.C3093d;
import com.google.ar.core.Camera;
import com.google.ar.core.TrackingState;
import kotlin.jvm.internal.AbstractC4862t;
import zb.AbstractC6555a;

/* JADX INFO: renamed from: mb.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5039d {
    public static final C3093d a(Camera camera, float f10, float f11) {
        AbstractC4862t.e(camera, "<this>");
        float[] fArr = new float[16];
        camera.getProjectionMatrix(fArr, 0, f10, f11);
        return AbstractC6555a.y(fArr);
    }

    public static final boolean b(Camera camera) {
        AbstractC4862t.e(camera, "<this>");
        return camera.getTrackingState() == TrackingState.TRACKING;
    }
}
