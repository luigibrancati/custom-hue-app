package pd;

import Cd.M;
import Cd.a0;
import Cd.i0;
import Dd.g;
import Ed.k;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vd.InterfaceC6099h;

/* JADX INFO: renamed from: pd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5460a extends M implements Gd.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f42541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5461b f42542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f42543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f42544e;

    public /* synthetic */ C5460a(i0 i0Var, InterfaceC5461b interfaceC5461b, boolean z10, a0 a0Var, int i10, AbstractC4854k abstractC4854k) {
        this(i0Var, (i10 & 2) != 0 ? new C5462c(i0Var) : interfaceC5461b, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? a0.f1311b.h() : a0Var);
    }

    @Override // Cd.E
    public List L0() {
        return C4206t.k();
    }

    @Override // Cd.E
    public a0 M0() {
        return this.f42544e;
    }

    @Override // Cd.E
    public boolean O0() {
        return this.f42543d;
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: V0 */
    public M T0(a0 newAttributes) {
        AbstractC4862t.e(newAttributes, "newAttributes");
        return new C5460a(this.f42541b, N0(), O0(), newAttributes);
    }

    @Override // Cd.E
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public InterfaceC5461b N0() {
        return this.f42542c;
    }

    @Override // Cd.M
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public C5460a R0(boolean z10) {
        return z10 == O0() ? this : new C5460a(this.f42541b, N0(), z10, M0());
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public C5460a X0(g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        i0 i0VarP = this.f42541b.p(kotlinTypeRefiner);
        AbstractC4862t.d(i0VarP, "typeProjection.refine(kotlinTypeRefiner)");
        return new C5460a(i0VarP, N0(), O0(), M0());
    }

    @Override // Cd.E
    public InterfaceC6099h o() {
        return k.a(Ed.g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // Cd.M
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Captured(");
        sb2.append(this.f42541b);
        sb2.append(')');
        sb2.append(O0() ? "?" : "");
        return sb2.toString();
    }

    public C5460a(i0 typeProjection, InterfaceC5461b constructor, boolean z10, a0 attributes) {
        AbstractC4862t.e(typeProjection, "typeProjection");
        AbstractC4862t.e(constructor, "constructor");
        AbstractC4862t.e(attributes, "attributes");
        this.f42541b = typeProjection;
        this.f42542c = constructor;
        this.f42543d = z10;
        this.f42544e = attributes;
    }
}
