package cb;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: cb.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3094e {
    public static final C3093d a(C3093d m10) {
        AbstractC4862t.e(m10, "m");
        C3093d c3093d = new C3093d((C3092c) null, (C3092c) null, (C3092c) null, (C3092c) null, 15, (AbstractC4854k) null);
        float fD = m10.e().d() * m10.b().a();
        float fD2 = m10.b().d() * m10.e().a();
        float fD3 = m10.d().d() * m10.b().a();
        float fD4 = m10.b().d() * m10.d().a();
        float fD5 = m10.d().d() * m10.e().a();
        float fD6 = m10.e().d() * m10.d().a();
        float fD7 = m10.c().d() * m10.b().a();
        float fD8 = m10.b().d() * m10.c().a();
        float fD9 = m10.c().d() * m10.e().a();
        float fD10 = m10.e().d() * m10.c().a();
        float fD11 = m10.c().d() * m10.d().a();
        float fD12 = m10.d().d() * m10.c().a();
        c3093d.c().f((m10.d().c() * fD) + (m10.e().c() * fD4) + (m10.b().c() * fD5));
        C3092c c3092cC = c3093d.c();
        c3092cC.f(c3092cC.b() - (((m10.d().c() * fD2) + (m10.e().c() * fD3)) + (m10.b().c() * fD6)));
        c3093d.c().g((m10.c().c() * fD2) + (m10.e().c() * fD7) + (m10.b().c() * fD10));
        C3092c c3092cC2 = c3093d.c();
        c3092cC2.g(c3092cC2.c() - (((m10.c().c() * fD) + (m10.e().c() * fD8)) + (m10.b().c() * fD9)));
        c3093d.c().h((m10.c().c() * fD3) + (m10.d().c() * fD8) + (m10.b().c() * fD11));
        C3092c c3092cC3 = c3093d.c();
        c3092cC3.h(c3092cC3.d() - (((m10.c().c() * fD4) + (m10.d().c() * fD7)) + (m10.b().c() * fD12)));
        c3093d.c().e((m10.c().c() * fD6) + (m10.d().c() * fD9) + (m10.e().c() * fD12));
        C3092c c3092cC4 = c3093d.c();
        c3092cC4.e(c3092cC4.a() - (((m10.c().c() * fD5) + (m10.d().c() * fD10)) + (m10.e().c() * fD11)));
        c3093d.d().f((m10.d().b() * fD2) + (m10.e().b() * fD3) + (m10.b().b() * fD6));
        C3092c c3092cD = c3093d.d();
        c3092cD.f(c3092cD.b() - (((m10.d().b() * fD) + (m10.e().b() * fD4)) + (m10.b().b() * fD5)));
        c3093d.d().g((fD * m10.c().b()) + (m10.e().b() * fD8) + (m10.b().b() * fD9));
        C3092c c3092cD2 = c3093d.d();
        c3092cD2.g(c3092cD2.c() - (((fD2 * m10.c().b()) + (m10.e().b() * fD7)) + (m10.b().b() * fD10)));
        c3093d.d().h((fD4 * m10.c().b()) + (fD7 * m10.d().b()) + (m10.b().b() * fD12));
        C3092c c3092cD3 = c3093d.d();
        c3092cD3.h(c3092cD3.d() - (((fD3 * m10.c().b()) + (fD8 * m10.d().b())) + (m10.b().b() * fD11)));
        c3093d.d().e((fD5 * m10.c().b()) + (fD10 * m10.d().b()) + (fD11 * m10.e().b()));
        C3092c c3092cD4 = c3093d.d();
        c3092cD4.e(c3092cD4.a() - (((fD6 * m10.c().b()) + (fD9 * m10.d().b())) + (fD12 * m10.e().b())));
        float fB = m10.e().b() * m10.b().c();
        float fB2 = m10.b().b() * m10.e().c();
        float fB3 = m10.d().b() * m10.b().c();
        float fB4 = m10.b().b() * m10.d().c();
        float fB5 = m10.d().b() * m10.e().c();
        float fB6 = m10.e().b() * m10.d().c();
        float fB7 = m10.c().b() * m10.b().c();
        float fB8 = m10.b().b() * m10.c().c();
        float fB9 = m10.c().b() * m10.e().c();
        float fB10 = m10.e().b() * m10.c().c();
        float fB11 = m10.c().b() * m10.d().c();
        float fB12 = m10.d().b() * m10.c().c();
        c3093d.e().f((m10.d().a() * fB) + (m10.e().a() * fB4) + (m10.b().a() * fB5));
        C3092c c3092cE = c3093d.e();
        c3092cE.f(c3092cE.b() - (((m10.d().a() * fB2) + (m10.e().a() * fB3)) + (m10.b().a() * fB6)));
        c3093d.e().g((m10.c().a() * fB2) + (m10.e().a() * fB7) + (m10.b().a() * fB10));
        C3092c c3092cE2 = c3093d.e();
        c3092cE2.g(c3092cE2.c() - (((m10.c().a() * fB) + (m10.e().a() * fB8)) + (m10.b().a() * fB9)));
        c3093d.e().h((m10.c().a() * fB3) + (m10.d().a() * fB8) + (m10.b().a() * fB11));
        C3092c c3092cE3 = c3093d.e();
        c3092cE3.h(c3092cE3.d() - (((m10.c().a() * fB4) + (m10.d().a() * fB7)) + (m10.b().a() * fB12)));
        c3093d.e().e((m10.c().a() * fB6) + (m10.d().a() * fB9) + (m10.e().a() * fB12));
        C3092c c3092cE4 = c3093d.e();
        c3092cE4.e(c3092cE4.a() - (((m10.c().a() * fB5) + (m10.d().a() * fB10)) + (m10.e().a() * fB11)));
        c3093d.b().f((m10.e().d() * fB3) + (m10.b().d() * fB6) + (m10.d().d() * fB2));
        C3092c c3092cB = c3093d.b();
        c3092cB.f(c3092cB.b() - (((m10.b().d() * fB5) + (m10.d().d() * fB)) + (m10.e().d() * fB4)));
        c3093d.b().g((m10.b().d() * fB9) + (fB * m10.c().d()) + (m10.e().d() * fB8));
        C3092c c3092cB2 = c3093d.b();
        c3092cB2.g(c3092cB2.c() - (((m10.e().d() * fB7) + (m10.b().d() * fB10)) + (fB2 * m10.c().d())));
        c3093d.b().h((fB7 * m10.d().d()) + (m10.b().d() * fB12) + (fB4 * m10.c().d()));
        C3092c c3092cB3 = c3093d.b();
        c3092cB3.h(c3092cB3.d() - (((m10.b().d() * fB11) + (fB3 * m10.c().d())) + (fB8 * m10.d().d())));
        c3093d.b().e((fB11 * m10.e().d()) + (fB5 * m10.c().d()) + (fB10 * m10.d().d()));
        C3092c c3092cB4 = c3093d.b();
        c3092cB4.e(c3092cB4.a() - (((fB9 * m10.d().d()) + (fB12 * m10.e().d())) + (fB6 * m10.c().d())));
        return c3093d.a((m10.c().b() * c3093d.c().b()) + (m10.d().b() * c3093d.c().c()) + (m10.e().b() * c3093d.c().d()) + (m10.b().b() * c3093d.c().a()));
    }

    public static final C3095f b(C3093d m10) {
        C3095f c3095f;
        AbstractC4862t.e(m10, "m");
        if (m10.c().b() + m10.d().c() + m10.e().d() > 0.0f) {
            float fSqrt = ((float) Math.sqrt(r0 + 1.0f)) * 2.0f;
            c3095f = new C3095f((m10.d().d() - m10.e().c()) / fSqrt, (m10.e().b() - m10.c().d()) / fSqrt, (m10.c().c() - m10.d().b()) / fSqrt, fSqrt * 0.25f);
        } else if (m10.c().b() > m10.d().c() && m10.c().b() > m10.e().d()) {
            float fSqrt2 = ((float) Math.sqrt(((m10.c().b() + 1.0f) - m10.d().c()) - m10.e().d())) * 2.0f;
            c3095f = new C3095f(0.25f * fSqrt2, (m10.d().b() + m10.c().c()) / fSqrt2, (m10.e().b() + m10.c().d()) / fSqrt2, (m10.d().d() - m10.e().c()) / fSqrt2);
        } else if (m10.d().c() > m10.e().d()) {
            float fSqrt3 = ((float) Math.sqrt(((m10.d().c() + 1.0f) - m10.c().b()) - m10.e().d())) * 2.0f;
            c3095f = new C3095f((m10.d().b() + m10.c().c()) / fSqrt3, 0.25f * fSqrt3, (m10.e().c() + m10.d().d()) / fSqrt3, (m10.e().b() - m10.c().d()) / fSqrt3);
        } else {
            float fSqrt4 = ((float) Math.sqrt(((m10.e().d() + 1.0f) - m10.c().b()) - m10.d().c())) * 2.0f;
            c3095f = new C3095f((m10.e().b() + m10.c().d()) / fSqrt4, (m10.e().c() + m10.d().d()) / fSqrt4, 0.25f * fSqrt4, (m10.c().c() - m10.d().b()) / fSqrt4);
        }
        return g.c(c3095f);
    }

    public static final C3093d c(C3093d m10) {
        AbstractC4862t.e(m10, "m");
        C3092c c3092cC = m10.c();
        C3091b c3091bA = i.a(new C3091b(c3092cC.b(), c3092cC.c(), c3092cC.d()));
        C3092c c3092cD = m10.d();
        C3091b c3091bA2 = i.a(new C3091b(c3092cD.b(), c3092cD.c(), c3092cD.d()));
        C3092c c3092cE = m10.e();
        return new C3093d(c3091bA, c3091bA2, i.a(new C3091b(c3092cE.b(), c3092cE.c(), c3092cE.d())), (C3091b) null, 8, (AbstractC4854k) null);
    }

    public static final C3093d d(C3095f quaternion) {
        AbstractC4862t.e(quaternion, "quaternion");
        C3095f c3095fC = g.c(quaternion);
        return new C3093d(new C3092c(1.0f - (((c3095fC.c() * c3095fC.c()) + (c3095fC.d() * c3095fC.d())) * 2.0f), ((c3095fC.b() * c3095fC.c()) + (c3095fC.d() * c3095fC.a())) * 2.0f, ((c3095fC.b() * c3095fC.d()) - (c3095fC.c() * c3095fC.a())) * 2.0f, 0.0f, 8, null), new C3092c(((c3095fC.b() * c3095fC.c()) - (c3095fC.d() * c3095fC.a())) * 2.0f, 1.0f - (((c3095fC.b() * c3095fC.b()) + (c3095fC.d() * c3095fC.d())) * 2.0f), ((c3095fC.c() * c3095fC.d()) + (c3095fC.b() * c3095fC.a())) * 2.0f, 0.0f, 8, null), new C3092c(((c3095fC.b() * c3095fC.d()) + (c3095fC.c() * c3095fC.a())) * 2.0f, ((c3095fC.c() * c3095fC.d()) - (c3095fC.b() * c3095fC.a())) * 2.0f, 1.0f - (((c3095fC.b() * c3095fC.b()) + (c3095fC.c() * c3095fC.c())) * 2.0f), 0.0f, 8, null), (C3092c) null, 8, (AbstractC4854k) null);
    }

    public static final C3093d e(C3091b s10) {
        AbstractC4862t.e(s10, "s");
        return new C3093d(new C3092c(s10.a(), 0.0f, 0.0f, 0.0f, 14, null), new C3092c(0.0f, s10.b(), 0.0f, 0.0f, 13, null), new C3092c(0.0f, 0.0f, s10.c(), 0.0f, 11, null), (C3092c) null, 8, (AbstractC4854k) null);
    }

    public static final C3093d f(C3091b t10) {
        AbstractC4862t.e(t10, "t");
        return new C3093d((C3092c) null, (C3092c) null, (C3092c) null, new C3092c(t10, 1.0f), 7, (AbstractC4854k) null);
    }
}
