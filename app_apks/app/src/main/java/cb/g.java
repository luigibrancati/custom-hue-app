package cb;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public static final C3095f a(C3095f a10, C3095f b10, float f10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        float f11 = 1.0f - f10;
        C3095f c3095f = new C3095f(a10.b() * f11, a10.c() * f11, a10.d() * f11, f11 * a10.a());
        C3095f c3095f2 = new C3095f(b10.b() * f10, b10.c() * f10, b10.d() * f10, f10 * b10.a());
        return new C3095f(c3095f.b() + c3095f2.b(), c3095f.c() + c3095f2.c(), c3095f.d() + c3095f2.d(), c3095f.a() + c3095f2.a());
    }

    public static final C3095f b(C3095f a10, C3095f b10, float f10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        return c(a(a10, b10, f10));
    }

    public static final C3095f c(C3095f q10) {
        AbstractC4862t.e(q10, "q");
        float fSqrt = 1.0f / ((float) Math.sqrt((((q10.b() * q10.b()) + (q10.c() * q10.c())) + (q10.d() * q10.d())) + (q10.a() * q10.a())));
        return new C3095f(q10.b() * fSqrt, q10.c() * fSqrt, q10.d() * fSqrt, q10.a() * fSqrt);
    }

    public static final C3095f d(C3095f a10, C3095f b10, float f10, float f11) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        float fB = (a10.b() * b10.b()) + (a10.c() * b10.c()) + (a10.d() * b10.d()) + (a10.a() * b10.a());
        if (fB < 0.0f) {
            fB = -fB;
            b10 = b10.f();
        }
        if (fB >= f11) {
            return b(a10, b10, f10);
        }
        float fSin = (float) Math.sin((float) Math.acos(fB));
        float fSin2 = (float) Math.sin((1.0f - f10) * r9);
        C3095f c3095f = new C3095f(a10.b() * fSin2, a10.c() * fSin2, a10.d() * fSin2, a10.a() * fSin2);
        C3095f c3095f2 = new C3095f(c3095f.b() / fSin, c3095f.c() / fSin, c3095f.d() / fSin, c3095f.a() / fSin);
        float fSin3 = (float) Math.sin(f10 * r9);
        C3095f c3095f3 = new C3095f(b10.b() * fSin3, b10.c() * fSin3, b10.d() * fSin3, b10.a() * fSin3);
        C3095f c3095f4 = new C3095f(c3095f3.b() / fSin, c3095f3.c() / fSin, c3095f3.d() / fSin, c3095f3.a() / fSin);
        return new C3095f(c3095f2.b() + c3095f4.b(), c3095f2.c() + c3095f4.c(), c3095f2.d() + c3095f4.d(), c3095f2.a() + c3095f4.a());
    }

    public static /* synthetic */ C3095f e(C3095f c3095f, C3095f c3095f2, float f10, float f11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f11 = 0.9995f;
        }
        return d(c3095f, c3095f2, f10, f11);
    }
}
