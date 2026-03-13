package T5;

import cb.C3091b;
import fc.C4034q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f16245a = new o();

    public static /* synthetic */ C4034q b(o oVar, C3091b c3091b, C3091b c3091b2, C3091b c3091b3, C3091b c3091b4, float f10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            f10 = 5.0f;
        }
        return oVar.a(c3091b, c3091b2, c3091b3, c3091b4, f10);
    }

    public final C4034q a(C3091b o12, C3091b d12, C3091b o22, C3091b d22, float f10) {
        AbstractC4862t.e(o12, "o1");
        AbstractC4862t.e(d12, "d1");
        AbstractC4862t.e(o22, "o2");
        AbstractC4862t.e(d22, "d2");
        C3091b c3091bA = cb.i.a(d12);
        C3091b c3091bA2 = cb.i.a(d22);
        float fA = ((((c3091bA.a() * c3091bA2.a()) + (c3091bA.b() * c3091bA2.b())) + (c3091bA.c() * c3091bA2.c())) * (((c3091bA.a() * c3091bA2.a()) + (c3091bA.b() * c3091bA2.b())) + (c3091bA.c() * c3091bA2.c()))) - ((((c3091bA.a() * c3091bA.a()) + (c3091bA.b() * c3091bA.b())) + (c3091bA.c() * c3091bA.c())) * (((c3091bA2.a() * c3091bA2.a()) + (c3091bA2.b() * c3091bA2.b())) + (c3091bA2.c() * c3091bA2.c())));
        double d10 = (f10 * 3.1415927f) / 180.0f;
        if (Math.abs(fA) < ((float) Math.sin(d10)) * ((float) Math.sin(d10))) {
            return null;
        }
        C3091b c3091b = new C3091b(o22.a() - o12.a(), o22.b() - o12.b(), o22.c() - o12.c());
        float fA2 = (c3091bA.a() * c3091bA2.a()) + (c3091bA.b() * c3091bA2.b()) + (c3091bA.c() * c3091bA2.c());
        C3091b c3091b2 = new C3091b(c3091bA2.a() * fA2, c3091bA2.b() * fA2, c3091bA2.c() * fA2);
        float fA3 = (c3091bA2.a() * c3091bA2.a()) + (c3091bA2.b() * c3091bA2.b()) + (c3091bA2.c() * c3091bA2.c());
        C3091b c3091b3 = new C3091b(c3091bA.a() * fA3, c3091bA.b() * fA3, c3091bA.c() * fA3);
        C3091b c3091b4 = new C3091b(c3091b2.a() - c3091b3.a(), c3091b2.b() - c3091b3.b(), c3091b2.c() - c3091b3.c());
        float fA4 = (1.0f / fA) * ((c3091b4.a() * c3091b.a()) + (c3091b4.b() * c3091b.b()) + (c3091b4.c() * c3091b.c()));
        float f11 = (-1.0f) / fA;
        float fA5 = (c3091bA2.a() * c3091bA.a()) + (c3091bA2.b() * c3091bA.b()) + (c3091bA2.c() * c3091bA.c());
        C3091b c3091b5 = new C3091b(c3091bA.a() * fA5, c3091bA.b() * fA5, c3091bA.c() * fA5);
        float fA6 = (c3091bA.a() * c3091bA.a()) + (c3091bA.b() * c3091bA.b()) + (c3091bA.c() * c3091bA.c());
        C3091b c3091b6 = new C3091b(c3091bA2.a() * fA6, c3091bA2.b() * fA6, c3091bA2.c() * fA6);
        C3091b c3091b7 = new C3091b(c3091b5.a() - c3091b6.a(), c3091b5.b() - c3091b6.b(), c3091b5.c() - c3091b6.c());
        float fA7 = f11 * ((c3091b7.a() * c3091b.a()) + (c3091b7.b() * c3091b.b()) + (c3091b7.c() * c3091b.c()));
        C3091b c3091b8 = new C3091b(d12.a() * fA4, d12.b() * fA4, d12.c() * fA4);
        C3091b c3091b9 = new C3091b(o12.a() + c3091b8.a(), o12.b() + c3091b8.b(), o12.c() + c3091b8.c());
        C3091b c3091b10 = new C3091b(d22.a() * fA7, d22.b() * fA7, d22.c() * fA7);
        C3091b c3091b11 = new C3091b(o22.a() + c3091b10.a(), o22.b() + c3091b10.b(), o22.c() + c3091b10.c());
        C3091b c3091b12 = new C3091b(c3091b9.a() - c3091b11.a(), c3091b9.b() - c3091b11.b(), c3091b9.c() - c3091b11.c());
        float fSqrt = (float) Math.sqrt((c3091b12.a() * c3091b12.a()) + (c3091b12.b() * c3091b12.b()) + (c3091b12.c() * c3091b12.c()));
        C3091b c3091b13 = new C3091b(c3091b9.a() + c3091b11.a(), c3091b9.b() + c3091b11.b(), c3091b9.c() + c3091b11.c());
        return new C4034q(new C3091b(c3091b13.a() / 2.0f, c3091b13.b() / 2.0f, c3091b13.c() / 2.0f), Float.valueOf(fSqrt));
    }
}
