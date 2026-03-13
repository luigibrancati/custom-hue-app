package Dd;

import Cd.M;
import Cd.a0;
import Cd.i0;
import Cd.t0;
import Lc.f0;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends M implements Gd.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gd.b f2668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f2669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t0 f2670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f2671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2673g;

    public /* synthetic */ i(Gd.b bVar, j jVar, t0 t0Var, a0 a0Var, boolean z10, boolean z11, int i10, AbstractC4854k abstractC4854k) {
        this(bVar, jVar, t0Var, (i10 & 8) != 0 ? a0.f1311b.h() : a0Var, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11);
    }

    @Override // Cd.E
    public List L0() {
        return C4206t.k();
    }

    @Override // Cd.E
    public a0 M0() {
        return this.f2671e;
    }

    @Override // Cd.E
    public boolean O0() {
        return this.f2672f;
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: V0 */
    public M T0(a0 newAttributes) {
        AbstractC4862t.e(newAttributes, "newAttributes");
        return new i(this.f2668b, N0(), this.f2670d, newAttributes, O0(), this.f2673g);
    }

    public final Gd.b W0() {
        return this.f2668b;
    }

    @Override // Cd.E
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public j N0() {
        return this.f2669c;
    }

    public final t0 Y0() {
        return this.f2670d;
    }

    public final boolean Z0() {
        return this.f2673g;
    }

    @Override // Cd.M
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public i R0(boolean z10) {
        return new i(this.f2668b, N0(), this.f2670d, M0(), z10, false, 32, null);
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public i X0(g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        Gd.b bVar = this.f2668b;
        j jVarE = N0().p(kotlinTypeRefiner);
        t0 t0Var = this.f2670d;
        return new i(bVar, jVarE, t0Var != null ? kotlinTypeRefiner.a(t0Var).Q0() : null, M0(), O0(), false, 32, null);
    }

    @Override // Cd.E
    public InterfaceC6099h o() {
        return Ed.k.a(Ed.g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public i(Gd.b captureStatus, j constructor, t0 t0Var, a0 attributes, boolean z10, boolean z11) {
        AbstractC4862t.e(captureStatus, "captureStatus");
        AbstractC4862t.e(constructor, "constructor");
        AbstractC4862t.e(attributes, "attributes");
        this.f2668b = captureStatus;
        this.f2669c = constructor;
        this.f2670d = t0Var;
        this.f2671e = attributes;
        this.f2672f = z10;
        this.f2673g = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(Gd.b captureStatus, t0 t0Var, i0 projection, f0 typeParameter) {
        AbstractC4862t.e(captureStatus, "captureStatus");
        AbstractC4862t.e(projection, "projection");
        AbstractC4862t.e(typeParameter, "typeParameter");
        a0 a0Var = null;
        boolean z10 = false;
        boolean z11 = false;
        this(captureStatus, new j(projection, null, null, typeParameter, 6, null), t0Var, a0Var, z10, z11, 56, null);
    }
}
