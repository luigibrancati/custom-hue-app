package S2;

import android.os.Build;
import android.window.BackEvent;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final b a(BackEvent backEvent) {
        AbstractC4862t.e(backEvent, "backEvent");
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new b(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }
}
