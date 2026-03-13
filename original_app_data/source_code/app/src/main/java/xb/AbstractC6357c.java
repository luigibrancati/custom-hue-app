package xb;

import cb.C3093d;
import com.google.android.filament.TransformManager;
import kotlin.jvm.internal.AbstractC4862t;
import zb.AbstractC6555a;

/* JADX INFO: renamed from: xb.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6357c {
    public static final Integer a(TransformManager transformManager, int i10) {
        AbstractC4862t.e(transformManager, "<this>");
        Integer numValueOf = Integer.valueOf(transformManager.getParent(i10));
        if (numValueOf.intValue() != 0) {
            return numValueOf;
        }
        return null;
    }

    public static final C3093d b(TransformManager transformManager, int i10) {
        AbstractC4862t.e(transformManager, "<this>");
        float[] fArr = new float[16];
        transformManager.getTransform(i10, fArr);
        return AbstractC6555a.y(fArr);
    }

    public static final C3093d c(TransformManager transformManager, int i10) {
        AbstractC4862t.e(transformManager, "<this>");
        float[] fArr = new float[16];
        transformManager.getWorldTransform(i10, fArr);
        return AbstractC6555a.y(fArr);
    }

    public static final void d(TransformManager transformManager, int i10, C3093d localTransform) {
        AbstractC4862t.e(transformManager, "<this>");
        AbstractC4862t.e(localTransform, "localTransform");
        transformManager.setTransform(i10, AbstractC6555a.r(localTransform));
    }
}
