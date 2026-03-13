package zb;

import android.graphics.Color;
import cb.AbstractC3094e;
import cb.C3091b;
import cb.C3092c;
import cb.C3093d;
import cb.C3095f;
import cb.h;
import cb.i;
import com.google.android.filament.Box;
import gc.C4179C;
import gc.C4204q;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import rb.C5692a;
import rb.j;
import rb.m;
import rb.p;

/* JADX INFO: renamed from: zb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6555a {
    public static final C5692a A(Box box) {
        AbstractC4862t.e(box, "<this>");
        C3091b c3091bI = i(box);
        return new C5692a(z(new C3091b(c3091bI.a() * 2.0f, c3091bI.b() * 2.0f, c3091bI.c() * 2.0f)), z(h(box)));
    }

    public static final Box a(C3091b center, C3091b halfExtent) {
        AbstractC4862t.e(center, "center");
        AbstractC4862t.e(halfExtent, "halfExtent");
        return new Box(center.d(), halfExtent.d());
    }

    public static final C3093d b(C3091b position, C3095f quaternion, C3091b scale) {
        AbstractC4862t.e(position, "position");
        AbstractC4862t.e(quaternion, "quaternion");
        AbstractC4862t.e(scale, "scale");
        return AbstractC3094e.f(position).g(AbstractC3094e.d(quaternion)).g(AbstractC3094e.e(scale));
    }

    public static /* synthetic */ C3093d c(C3091b c3091b, C3095f c3095f, C3091b c3091b2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c3091b = new C3091b(0.0f, 0.0f, 0.0f, 7, null);
        }
        if ((i10 & 2) != 0) {
            c3095f = new C3095f(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        }
        if ((i10 & 4) != 0) {
            c3091b2 = new C3091b(1.0f);
        }
        return b(c3091b, c3095f, c3091b2);
    }

    public static final boolean d(float f10, float f11) {
        return Math.abs(f10 - f11) < Math.max(Math.ulp(f10), Math.ulp(f11)) * ((float) 2);
    }

    public static final C3092c e(float f10, float f11) {
        return f(f10, f10, f10, f11);
    }

    public static final C3092c f(float f10, float f11, float f12, float f13) {
        return new C3092c(f10, f11, f12, f13);
    }

    public static final C3092c g(int i10) {
        return f(Color.red(i10) / 255.0f, Color.green(i10) / 255.0f, Color.blue(i10) / 255.0f, Color.alpha(i10) / 255.0f);
    }

    public static final C3091b h(Box box) {
        AbstractC4862t.e(box, "<this>");
        float[] center = box.getCenter();
        AbstractC4862t.d(center, "getCenter(...)");
        return v(center);
    }

    public static final C3091b i(Box box) {
        AbstractC4862t.e(box, "<this>");
        float[] halfExtent = box.getHalfExtent();
        AbstractC4862t.d(halfExtent, "getHalfExtent(...)");
        return w(halfExtent);
    }

    public static final C3095f j(C3093d c3093d) {
        AbstractC4862t.e(c3093d, "<this>");
        return AbstractC3094e.c(c3093d).h();
    }

    public static final C3091b k(C3091b start, C3091b end, float f10) {
        AbstractC4862t.e(start, "start");
        AbstractC4862t.e(end, "end");
        float f11 = 1.0f - f10;
        return new C3091b((start.a() * f11) + (end.a() * f10), (start.b() * f11) + (end.b() * f10), (start.c() * f11) + (end.c() * f10));
    }

    public static final C3095f l(C3091b normal) {
        C3091b c3091bA;
        C3091b c3091bA2;
        AbstractC4862t.e(normal, "normal");
        C3091b c3091b = new C3091b(0.0f, 1.0f, 0.0f, 5, null);
        C3091b c3091b2 = new C3091b((c3091b.b() * normal.c()) - (c3091b.c() * normal.b()), (c3091b.c() * normal.a()) - (c3091b.a() * normal.c()), (c3091b.a() * normal.b()) - (c3091b.b() * normal.a()));
        if ((c3091b2.a() * c3091b2.a()) + (c3091b2.b() * c3091b2.b()) + (c3091b2.c() * c3091b2.c()) == 0.0f) {
            C3091b c3091b3 = new C3091b(1.0f, 0.0f, 0.0f, 6, null);
            c3091bA2 = i.a(new C3091b((normal.b() * c3091b3.c()) - (normal.c() * c3091b3.b()), (normal.c() * c3091b3.a()) - (normal.a() * c3091b3.c()), (normal.a() * c3091b3.b()) - (normal.b() * c3091b3.a())));
            c3091bA = i.a(new C3091b((c3091bA2.b() * normal.c()) - (c3091bA2.c() * normal.b()), (c3091bA2.c() * normal.a()) - (c3091bA2.a() * normal.c()), (c3091bA2.a() * normal.b()) - (c3091bA2.b() * normal.a())));
        } else {
            c3091bA = i.a(c3091b2);
            c3091bA2 = i.a(new C3091b((normal.b() * c3091bA.c()) - (normal.c() * c3091bA.b()), (normal.c() * c3091bA.a()) - (normal.a() * c3091bA.c()), (normal.a() * c3091bA.b()) - (normal.b() * c3091bA.a())));
        }
        return new C3093d(c3091bA, c3091bA2, normal, (C3091b) null, 8, (AbstractC4854k) null).h();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0012 A[PHI: r9
      0x0012: PHI (r9v4 float) = (r9v0 float), (r9v1 float) binds: [B:3:0x0010, B:6:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final cb.C3093d m(cb.C3093d r6, cb.C3093d r7, double r8, float r10) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.AbstractC6555a.m(cb.d, cb.d, double, float):cb.d");
    }

    public static final C3091b n(C3093d c3093d, C3091b v10) {
        AbstractC4862t.e(c3093d, "<this>");
        AbstractC4862t.e(v10, "v");
        C3092c c3092cF = c3093d.f(new C3092c(v10, 1.0f));
        return new C3091b(c3092cF.b(), c3092cF.c(), c3092cF.d());
    }

    public static final m o(h hVar) {
        AbstractC4862t.e(hVar, "<this>");
        return new m(z(hVar.b()), z(hVar.a()));
    }

    public static final C3092c p(float[] fArr) {
        AbstractC4862t.e(fArr, "<this>");
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        Float fB0 = C4204q.b0(fArr, 3);
        return new C3092c(f10, f11, f12, fB0 != null ? fB0.floatValue() : 1.0f);
    }

    public static final double[] q(C3093d c3093d) {
        AbstractC4862t.e(c3093d, "<this>");
        float[] fArrR = r(c3093d);
        ArrayList arrayList = new ArrayList(fArrR.length);
        for (float f10 : fArrR) {
            arrayList.add(Double.valueOf(f10));
        }
        return C4179C.R0(arrayList);
    }

    public static final float[] r(C3093d c3093d) {
        AbstractC4862t.e(c3093d, "<this>");
        return new float[]{c3093d.c().b(), c3093d.c().c(), c3093d.c().d(), c3093d.c().a(), c3093d.d().b(), c3093d.d().c(), c3093d.d().d(), c3093d.d().a(), c3093d.e().b(), c3093d.e().c(), c3093d.e().d(), c3093d.e().a(), c3093d.b().b(), c3093d.b().c(), c3093d.b().d(), c3093d.b().a()};
    }

    public static final C3091b s(p pVar) {
        AbstractC4862t.e(pVar, "<this>");
        return new C3091b(pVar.f43970a, pVar.f43971b, pVar.f43972c);
    }

    public static final C3092c t(C3092c c3092c) {
        AbstractC4862t.e(c3092c, "<this>");
        double d10 = 2.2f;
        c3092c.f((float) Math.pow(c3092c.b(), d10));
        c3092c.g((float) Math.pow(c3092c.c(), d10));
        c3092c.h((float) Math.pow(c3092c.d(), d10));
        c3092c.e((float) Math.pow(c3092c.a(), d10));
        return c3092c;
    }

    public static final j u(C3093d c3093d) {
        AbstractC4862t.e(c3093d, "<this>");
        return new j(r(c3093d));
    }

    public static final C3091b v(float[] fArr) {
        AbstractC4862t.e(fArr, "<this>");
        return new C3091b(fArr[0], fArr[1], fArr[2]);
    }

    public static final C3091b w(float[] fArr) {
        AbstractC4862t.e(fArr, "<this>");
        return new C3091b(fArr[0], fArr[1], fArr[2]);
    }

    public static final C3093d x(double[] dArr) {
        AbstractC4862t.e(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Float.valueOf((float) d10));
        }
        return y(C4179C.S0(arrayList));
    }

    public static final C3093d y(float[] fArr) {
        AbstractC4862t.e(fArr, "<this>");
        return new C3093d(new C3092c(fArr[0], fArr[1], fArr[2], fArr[3]), new C3092c(fArr[4], fArr[5], fArr[6], fArr[7]), new C3092c(fArr[8], fArr[9], fArr[10], fArr[11]), new C3092c(fArr[12], fArr[13], fArr[14], fArr[15]));
    }

    public static final p z(C3091b c3091b) {
        AbstractC4862t.e(c3091b, "<this>");
        return new p(c3091b.a(), c3091b.b(), c3091b.c());
    }
}
