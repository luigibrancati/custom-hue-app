package io.flutter.plugins.videoplayer;

import K1.C1013o;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ExoPlayerUtils {
    private ExoPlayerUtils() {
    }

    public static C1013o createRenderersFactoryWithFallback(Context context) {
        C1013o c1013o = new C1013o(context);
        c1013o.p(1);
        c1013o.o(true);
        return c1013o;
    }
}
