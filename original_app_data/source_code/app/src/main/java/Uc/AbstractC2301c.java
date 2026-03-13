package Uc;

import cd.C3105i;
import cd.EnumC3104h;
import fc.AbstractC4040w;
import gc.C4205s;
import gc.C4206t;
import gc.P;
import gc.Q;
import gc.U;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Uc.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2301c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kd.c f16906a = new kd.c("javax.annotation.meta.TypeQualifierNickname");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kd.c f16907b = new kd.c("javax.annotation.meta.TypeQualifier");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kd.c f16908c = new kd.c("javax.annotation.meta.TypeQualifierDefault");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kd.c f16909d = new kd.c("kotlin.annotations.jvm.UnderMigration");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f16910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map f16911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Map f16912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set f16913h;

    static {
        EnumC2300b enumC2300b = EnumC2300b.FIELD;
        EnumC2300b enumC2300b2 = EnumC2300b.METHOD_RETURN_TYPE;
        EnumC2300b enumC2300b3 = EnumC2300b.VALUE_PARAMETER;
        List listN = C4206t.n(enumC2300b, enumC2300b2, enumC2300b3, EnumC2300b.TYPE_PARAMETER_BOUNDS, EnumC2300b.TYPE_USE);
        f16910e = listN;
        kd.c cVarI = C.i();
        EnumC3104h enumC3104h = EnumC3104h.NOT_NULL;
        Map mapF = P.f(AbstractC4040w.a(cVarI, new r(new C3105i(enumC3104h, false, 2, null), listN, false)));
        f16911f = mapF;
        f16912g = Q.p(Q.l(AbstractC4040w.a(new kd.c("javax.annotation.ParametersAreNullableByDefault"), new r(new C3105i(EnumC3104h.NULLABLE, false, 2, null), C4205s.d(enumC2300b3), false, 4, null)), AbstractC4040w.a(new kd.c("javax.annotation.ParametersAreNonnullByDefault"), new r(new C3105i(enumC3104h, false, 2, null), C4205s.d(enumC2300b3), false, 4, null))), mapF);
        f16913h = U.h(C.f(), C.e());
    }

    public static final Map a() {
        return f16912g;
    }

    public static final Set b() {
        return f16913h;
    }

    public static final Map c() {
        return f16911f;
    }

    public static final kd.c d() {
        return f16909d;
    }

    public static final kd.c e() {
        return f16908c;
    }

    public static final kd.c f() {
        return f16907b;
    }

    public static final kd.c g() {
        return f16906a;
    }
}
