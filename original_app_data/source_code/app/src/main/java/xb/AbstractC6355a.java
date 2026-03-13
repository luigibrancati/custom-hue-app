package xb;

import cb.C3091b;
import cb.C3092c;
import com.google.android.filament.LightManager;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: xb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6355a {
    public static final LightManager.Builder a(LightManager.Builder builder, C3092c linearColor) {
        AbstractC4862t.e(builder, "<this>");
        AbstractC4862t.e(linearColor, "linearColor");
        builder.color(linearColor.b(), linearColor.c(), linearColor.d());
        return builder;
    }

    public static final void b(LightManager lightManager, int i10, C3091b direction) {
        AbstractC4862t.e(lightManager, "<this>");
        AbstractC4862t.e(direction, "direction");
        lightManager.setDirection(i10, direction.a(), direction.b(), direction.c());
    }
}
