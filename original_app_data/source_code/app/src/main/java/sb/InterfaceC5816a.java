package sb;

import cb.C3093d;
import com.google.android.filament.Camera;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: sb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC5816a extends InterfaceC5817b {
    default float A() {
        return k();
    }

    default void C(C3093d value) {
        AbstractC4862t.e(value, "value");
        Cb.a.g(h(), value);
    }

    default void D(float f10, float f11, float f12) {
        h().setExposure(f10, f11, f12);
    }

    default void E(double d10, double d11, double d12, double d13) {
        h().setLensProjection(d10, d11, d12, d13);
    }

    default Camera h() {
        Camera cameraComponent = x().getCameraComponent(getEntity());
        AbstractC4862t.b(cameraComponent);
        return cameraComponent;
    }

    default float k() {
        return h().getCullingFar();
    }

    default float u() {
        return h().getNear();
    }
}
