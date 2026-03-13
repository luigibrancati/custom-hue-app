package Ed;

import Cd.M;
import Cd.a0;
import Cd.e0;
import gc.C4206t;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.S;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f3404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC6099h f3405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f3406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f3407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f3409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3410h;

    public /* synthetic */ h(e0 e0Var, InterfaceC6099h interfaceC6099h, j jVar, List list, boolean z10, String[] strArr, int i10, AbstractC4854k abstractC4854k) {
        this(e0Var, interfaceC6099h, jVar, (i10 & 8) != 0 ? C4206t.k() : list, (i10 & 16) != 0 ? false : z10, strArr);
    }

    @Override // Cd.E
    public List L0() {
        return this.f3407e;
    }

    @Override // Cd.E
    public a0 M0() {
        return a0.f1311b.h();
    }

    @Override // Cd.E
    public e0 N0() {
        return this.f3404b;
    }

    @Override // Cd.E
    public boolean O0() {
        return this.f3408f;
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: U0 */
    public M R0(boolean z10) {
        e0 e0VarN0 = N0();
        InterfaceC6099h interfaceC6099hO = o();
        j jVar = this.f3406d;
        List listL0 = L0();
        String[] strArr = this.f3409g;
        return new h(e0VarN0, interfaceC6099hO, jVar, listL0, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: V0 */
    public M T0(a0 newAttributes) {
        AbstractC4862t.e(newAttributes, "newAttributes");
        return this;
    }

    public final String W0() {
        return this.f3410h;
    }

    public final j X0() {
        return this.f3406d;
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public h X0(Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // Cd.E
    public InterfaceC6099h o() {
        return this.f3405c;
    }

    public h(e0 constructor, InterfaceC6099h memberScope, j kind, List arguments, boolean z10, String... formatParams) {
        AbstractC4862t.e(constructor, "constructor");
        AbstractC4862t.e(memberScope, "memberScope");
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(arguments, "arguments");
        AbstractC4862t.e(formatParams, "formatParams");
        this.f3404b = constructor;
        this.f3405c = memberScope;
        this.f3406d = kind;
        this.f3407e = arguments;
        this.f3408f = z10;
        this.f3409g = formatParams;
        S s10 = S.f39781a;
        String strB = kind.b();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(strB, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC4862t.d(str, "format(format, *args)");
        this.f3410h = str;
    }
}
