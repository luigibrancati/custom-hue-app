package Ed;

import Cd.E;
import Cd.e0;
import Lc.G;
import Lc.InterfaceC1185m;
import Lc.U;
import gc.C4206t;
import gc.T;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f3414a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G f3415b = d.f3395a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E f3417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final E f3418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final U f3419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set f3420g;

    static {
        String str = String.format(b.ERROR_CLASS.b(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        AbstractC4862t.d(str, "format(this, *args)");
        kd.f fVarW = kd.f.w(str);
        AbstractC4862t.d(fVarW, "special(ErrorEntity.ERRO….format(\"unknown class\"))");
        f3416c = new a(fVarW);
        f3417d = d(j.CYCLIC_SUPERTYPES, new String[0]);
        f3418e = d(j.ERROR_PROPERTY_TYPE, new String[0]);
        e eVar = new e();
        f3419f = eVar;
        f3420g = T.c(eVar);
    }

    public static final f a(g kind, boolean z10, String... formatParams) {
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(formatParams, "formatParams");
        return z10 ? new l(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)) : new f(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final f b(g kind, String... formatParams) {
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(formatParams, "formatParams");
        return a(kind, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final h d(j kind, String... formatParams) {
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(formatParams, "formatParams");
        return f3414a.g(kind, C4206t.k(), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean m(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m == null) {
            return false;
        }
        k kVar = f3414a;
        return kVar.n(interfaceC1185m) || kVar.n(interfaceC1185m.b()) || interfaceC1185m == f3415b;
    }

    public static final boolean o(E e10) {
        if (e10 == null) {
            return false;
        }
        e0 e0VarN0 = e10.N0();
        return (e0VarN0 instanceof i) && ((i) e0VarN0).a() == j.UNINFERRED_TYPE_VARIABLE;
    }

    public final h c(j kind, e0 typeConstructor, String... formatParams) {
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(typeConstructor, "typeConstructor");
        AbstractC4862t.e(formatParams, "formatParams");
        return f(kind, C4206t.k(), typeConstructor, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final i e(j kind, String... formatParams) {
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(formatParams, "formatParams");
        return new i(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final h f(j kind, List arguments, e0 typeConstructor, String... formatParams) {
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(arguments, "arguments");
        AbstractC4862t.e(typeConstructor, "typeConstructor");
        AbstractC4862t.e(formatParams, "formatParams");
        return new h(typeConstructor, b(g.ERROR_TYPE_SCOPE, typeConstructor.toString()), kind, arguments, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final h g(j kind, List arguments, String... formatParams) {
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(arguments, "arguments");
        AbstractC4862t.e(formatParams, "formatParams");
        return f(kind, arguments, e(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final a h() {
        return f3416c;
    }

    public final G i() {
        return f3415b;
    }

    public final Set j() {
        return f3420g;
    }

    public final E k() {
        return f3418e;
    }

    public final E l() {
        return f3417d;
    }

    public final boolean n(InterfaceC1185m interfaceC1185m) {
        return interfaceC1185m instanceof a;
    }

    public final String p(E type) {
        AbstractC4862t.e(type, "type");
        Hd.a.s(type);
        e0 e0VarN0 = type.N0();
        if (e0VarN0 != null) {
            return ((i) e0VarN0).b(0);
        }
        throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
    }
}
