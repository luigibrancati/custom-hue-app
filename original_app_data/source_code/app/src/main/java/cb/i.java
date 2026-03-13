package cb;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i {
    public static final C3091b a(C3091b v10) {
        AbstractC4862t.e(v10, "v");
        float fSqrt = 1.0f / ((float) Math.sqrt(((v10.a() * v10.a()) + (v10.b() * v10.b())) + (v10.c() * v10.c())));
        return new C3091b(v10.a() * fSqrt, v10.b() * fSqrt, v10.c() * fSqrt);
    }
}
