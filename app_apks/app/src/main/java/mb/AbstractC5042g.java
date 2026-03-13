package mb;

import cb.C3091b;
import cb.C3093d;
import com.google.ar.core.Pose;
import kotlin.jvm.internal.AbstractC4862t;
import zb.AbstractC6555a;

/* JADX INFO: renamed from: mb.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5042g {
    public static final float a(Pose pose, Pose cameraPose) {
        AbstractC4862t.e(pose, "<this>");
        AbstractC4862t.e(cameraPose, "cameraPose");
        float[] fArr = new float[3];
        pose.getTransformedAxis(1, 1.0f, fArr, 0);
        C3091b c3091bV = AbstractC6555a.v(fArr);
        C3091b c3091bB = b(pose);
        C3091b c3091bB2 = b(cameraPose);
        C3091b c3091b = new C3091b(c3091bB2.a() - c3091bB.a(), c3091bB2.b() - c3091bB.b(), c3091bB2.c() - c3091bB.c());
        return (c3091b.a() * c3091bV.a()) + (c3091b.b() * c3091bV.b()) + (c3091b.c() * c3091bV.c());
    }

    public static final C3091b b(Pose pose) {
        AbstractC4862t.e(pose, "<this>");
        return new C3091b(pose.tx(), pose.ty(), pose.tz());
    }

    public static final C3093d c(Pose pose) {
        AbstractC4862t.e(pose, "<this>");
        float[] fArr = new float[16];
        pose.toMatrix(fArr, 0);
        return AbstractC6555a.y(fArr);
    }
}
