package Cd;

import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class N extends M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f1286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC6099h f1289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vc.l f1290f;

    public N(e0 constructor, List arguments, boolean z10, InterfaceC6099h memberScope, vc.l refinedTypeFactory) {
        AbstractC4862t.e(constructor, "constructor");
        AbstractC4862t.e(arguments, "arguments");
        AbstractC4862t.e(memberScope, "memberScope");
        AbstractC4862t.e(refinedTypeFactory, "refinedTypeFactory");
        this.f1286b = constructor;
        this.f1287c = arguments;
        this.f1288d = z10;
        this.f1289e = memberScope;
        this.f1290f = refinedTypeFactory;
        if (!(o() instanceof Ed.f) || (o() instanceof Ed.l)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + o() + '\n' + N0());
    }

    @Override // Cd.E
    public List L0() {
        return this.f1287c;
    }

    @Override // Cd.E
    public a0 M0() {
        return a0.f1311b.h();
    }

    @Override // Cd.E
    public e0 N0() {
        return this.f1286b;
    }

    @Override // Cd.E
    public boolean O0() {
        return this.f1288d;
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: U0 */
    public M R0(boolean z10) {
        return z10 == O0() ? this : z10 ? new K(this) : new I(this);
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: V0 */
    public M T0(a0 newAttributes) {
        AbstractC4862t.e(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new O(this, newAttributes);
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public M X0(Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        M m10 = (M) this.f1290f.invoke(kotlinTypeRefiner);
        return m10 == null ? this : m10;
    }

    @Override // Cd.E
    public InterfaceC6099h o() {
        return this.f1289e;
    }
}
