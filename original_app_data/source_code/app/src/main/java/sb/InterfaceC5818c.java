package sb;

import cb.C3091b;
import cb.C3092c;
import com.google.android.filament.LightManager;
import kotlin.jvm.internal.AbstractC4862t;
import xb.AbstractC6355a;
import zb.AbstractC6555a;

/* JADX INFO: renamed from: sb.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC5818c extends InterfaceC5817b {
    default float F() {
        return w().getIntensity(j());
    }

    default int j() {
        return w().getInstance(getEntity());
    }

    default void o(float f10) {
        w().setIntensity(j(), f10);
    }

    default void q(C3091b value) {
        AbstractC4862t.e(value, "value");
        AbstractC6355a.b(w(), j(), value);
    }

    default C3092c s() {
        float[] fArr = new float[3];
        w().getColor(j(), fArr);
        return AbstractC6555a.p(fArr);
    }

    default LightManager w() {
        LightManager lightManager = x().getLightManager();
        AbstractC4862t.d(lightManager, "getLightManager(...)");
        return lightManager;
    }

    default void y(C3092c value) {
        AbstractC4862t.e(value, "value");
        w().setColor(j(), value.b(), value.c(), value.d());
    }
}
