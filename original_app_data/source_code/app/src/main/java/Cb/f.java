package Cb;

import android.view.MotionEvent;
import cb.C3090a;
import cb.h;
import com.google.android.filament.Camera;
import com.google.android.filament.View;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static final h a(View view, MotionEvent motionEvent) {
        AbstractC4862t.e(view, "<this>");
        AbstractC4862t.e(motionEvent, "motionEvent");
        return b(view, motionEvent.getX(), motionEvent.getY());
    }

    public static final h b(View view, float f10, float f11) {
        AbstractC4862t.e(view, "<this>");
        Camera camera = view.getCamera();
        AbstractC4862t.b(camera);
        return a.h(camera, new C3090a(f10 / view.getViewport().width, 1.0f - (f11 / view.getViewport().height)));
    }
}
