package Dd;

import Cd.C0722e;
import Cd.E;
import Cd.d0;
import Cd.t0;
import Dd.f;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import od.C5289k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f2687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f2688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5289k f2689e;

    public m(g kotlinTypeRefiner, f kotlinTypePreparator) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC4862t.e(kotlinTypePreparator, "kotlinTypePreparator");
        this.f2687c = kotlinTypeRefiner;
        this.f2688d = kotlinTypePreparator;
        C5289k c5289kM = C5289k.m(d());
        AbstractC4862t.d(c5289kM, "createWithTypeRefiner(kotlinTypeRefiner)");
        this.f2689e = c5289kM;
    }

    @Override // Dd.l
    public C5289k a() {
        return this.f2689e;
    }

    @Override // Dd.e
    public boolean b(E subtype, E supertype) {
        AbstractC4862t.e(subtype, "subtype");
        AbstractC4862t.e(supertype, "supertype");
        return g(a.b(true, false, null, f(), d(), 6, null), subtype.Q0(), supertype.Q0());
    }

    @Override // Dd.e
    public boolean c(E a10, E b10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        return e(a.b(false, false, null, f(), d(), 6, null), a10.Q0(), b10.Q0());
    }

    @Override // Dd.l
    public g d() {
        return this.f2687c;
    }

    public final boolean e(d0 d0Var, t0 a10, t0 b10) {
        AbstractC4862t.e(d0Var, "<this>");
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        return C0722e.f1329a.k(d0Var, a10, b10);
    }

    public f f() {
        return this.f2688d;
    }

    public final boolean g(d0 d0Var, t0 subType, t0 superType) {
        AbstractC4862t.e(d0Var, "<this>");
        AbstractC4862t.e(subType, "subType");
        AbstractC4862t.e(superType, "superType");
        return C0722e.t(C0722e.f1329a, d0Var, subType, superType, false, 8, null);
    }

    public /* synthetic */ m(g gVar, f fVar, int i10, AbstractC4854k abstractC4854k) {
        this(gVar, (i10 & 2) != 0 ? f.a.f2665a : fVar);
    }
}
