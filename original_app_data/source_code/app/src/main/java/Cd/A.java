package Cd;

import kotlin.jvm.internal.AbstractC4862t;
import nd.AbstractC5164c;
import nd.InterfaceC5167f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class A extends AbstractC0741y implements r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0741y f1254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E f1255e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(AbstractC0741y origin, E enhancement) {
        super(origin.V0(), origin.W0());
        AbstractC4862t.e(origin, "origin");
        AbstractC4862t.e(enhancement, "enhancement");
        this.f1254d = origin;
        this.f1255e = enhancement;
    }

    @Override // Cd.t0
    public t0 R0(boolean z10) {
        return s0.d(G0().R0(z10), g0().Q0().R0(z10));
    }

    @Override // Cd.t0
    public t0 T0(a0 newAttributes) {
        AbstractC4862t.e(newAttributes, "newAttributes");
        return s0.d(G0().T0(newAttributes), g0());
    }

    @Override // Cd.AbstractC0741y
    public M U0() {
        return G0().U0();
    }

    @Override // Cd.AbstractC0741y
    public String X0(AbstractC5164c renderer, InterfaceC5167f options) {
        AbstractC4862t.e(renderer, "renderer");
        AbstractC4862t.e(options, "options");
        return options.d() ? renderer.w(g0()) : G0().X0(renderer, options);
    }

    @Override // Cd.r0
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public AbstractC0741y G0() {
        return this.f1254d;
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public A X0(Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        E eA = kotlinTypeRefiner.a(G0());
        AbstractC4862t.c(eA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new A((AbstractC0741y) eA, kotlinTypeRefiner.a(g0()));
    }

    @Override // Cd.r0
    public E g0() {
        return this.f1255e;
    }

    @Override // Cd.AbstractC0741y
    public String toString() {
        return "[@EnhancedForWarnings(" + g0() + ")] " + G0();
    }
}
