package Cb;

import cb.AbstractC3094e;
import cb.C3090a;
import cb.C3091b;
import cb.C3092c;
import cb.C3093d;
import cb.h;
import com.google.android.filament.Camera;
import kotlin.jvm.internal.AbstractC4862t;
import xc.C6361d;
import zb.AbstractC6555a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final C3093d a(Camera camera) {
        AbstractC4862t.e(camera, "<this>");
        double[] dArr = new double[16];
        camera.getCullingProjectionMatrix(dArr);
        return AbstractC6555a.x(dArr);
    }

    public static final float b(Camera camera) {
        AbstractC4862t.e(camera, "<this>");
        return C6361d.a((((camera.getAperture() * camera.getAperture()) / camera.getShutterSpeed()) * 100.0f) / camera.getSensitivity());
    }

    public static final float c(Camera camera) {
        AbstractC4862t.e(camera, "<this>");
        return 1.0f / b(camera);
    }

    public static final C3093d d(Camera camera) {
        AbstractC4862t.e(camera, "<this>");
        float[] fArr = new float[16];
        camera.getViewMatrix(fArr);
        return AbstractC6555a.y(fArr);
    }

    public static final void e(Camera camera, C3093d inProjection, double d10, double d11, C3093d inProjectionForCulling) {
        AbstractC4862t.e(camera, "<this>");
        AbstractC4862t.e(inProjection, "inProjection");
        AbstractC4862t.e(inProjectionForCulling, "inProjectionForCulling");
        if (AbstractC4862t.a(inProjection, inProjectionForCulling)) {
            camera.setCustomProjection(AbstractC6555a.q(inProjection), d10, d11);
        } else {
            camera.setCustomProjection(AbstractC6555a.q(inProjection), AbstractC6555a.q(inProjectionForCulling), d10, d11);
        }
    }

    public static /* synthetic */ void f(Camera camera, C3093d c3093d, double d10, double d11, C3093d c3093d2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            d10 = camera.getNear();
        }
        double d12 = d10;
        if ((i10 & 4) != 0) {
            d11 = camera.getCullingFar();
        }
        e(camera, c3093d, d12, d11, (i10 & 8) != 0 ? c3093d : c3093d2);
    }

    public static final void g(Camera camera, C3093d value) {
        AbstractC4862t.e(camera, "<this>");
        AbstractC4862t.e(value, "value");
        f(camera, value, 0.0d, 0.0d, null, 14, null);
    }

    public static final h h(Camera camera, C3090a viewPosition) {
        AbstractC4862t.e(camera, "<this>");
        AbstractC4862t.e(viewPosition, "viewPosition");
        C3091b c3091bI = i(camera, viewPosition, 0.0f);
        C3091b c3091bI2 = i(camera, viewPosition, 1.0f);
        return new h(c3091bI, new C3091b(c3091bI2.a() - c3091bI.a(), c3091bI2.b() - c3091bI.b(), c3091bI2.c() - c3091bI.c()));
    }

    public static final C3091b i(Camera camera, C3090a viewPosition, float f10) {
        AbstractC4862t.e(camera, "<this>");
        AbstractC4862t.e(viewPosition, "viewPosition");
        C3091b c3091b = new C3091b(viewPosition.a(), viewPosition.b(), f10);
        C3091b c3091b2 = new C3091b(c3091b.a() * 2.0f, c3091b.b() * 2.0f, c3091b.c() * 2.0f);
        C3092c c3092cF = AbstractC3094e.a(a(camera).g(d(camera))).f(new C3092c(new C3091b(c3091b2.a() - 1.0f, c3091b2.b() - 1.0f, c3091b2.c() - 1.0f), 1.0f));
        if (AbstractC6555a.d(c3092cF.a(), 0.0f)) {
            return new C3091b(0.0f, 0.0f, 0.0f, 7, null);
        }
        C3091b c3091b3 = new C3091b(c3092cF.b(), c3092cF.c(), c3092cF.d());
        float fA = c3092cF.a();
        return new C3091b(c3091b3.a() / fA, c3091b3.b() / fA, c3091b3.c() / fA);
    }
}
