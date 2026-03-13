package pd;

import Cd.E;
import Cd.i0;
import Cd.u0;
import Dd.g;
import Dd.j;
import Lc.InterfaceC1180h;
import gc.C4205s;
import gc.C4206t;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: pd.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5462c implements InterfaceC5461b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f42545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f42546b;

    public C5462c(i0 projection) {
        AbstractC4862t.e(projection, "projection");
        this.f42545a = projection;
        E().b();
        u0 u0Var = u0.INVARIANT;
    }

    @Override // pd.InterfaceC5461b
    public i0 E() {
        return this.f42545a;
    }

    public Void a() {
        return null;
    }

    public final j b() {
        return this.f42546b;
    }

    @Override // Cd.e0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C5462c p(g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        i0 i0VarP = E().p(kotlinTypeRefiner);
        AbstractC4862t.d(i0VarP, "projection.refine(kotlinTypeRefiner)");
        return new C5462c(i0VarP);
    }

    public final void d(j jVar) {
        this.f42546b = jVar;
    }

    @Override // Cd.e0
    public List getParameters() {
        return C4206t.k();
    }

    @Override // Cd.e0
    public Ic.g n() {
        Ic.g gVarN = E().getType().N0().n();
        AbstractC4862t.d(gVarN, "projection.type.constructor.builtIns");
        return gVarN;
    }

    @Override // Cd.e0
    public Collection o() {
        E type = E().b() == u0.OUT_VARIANCE ? E().getType() : n().I();
        AbstractC4862t.d(type, "if (projection.projectio… builtIns.nullableAnyType");
        return C4205s.d(type);
    }

    @Override // Cd.e0
    public /* bridge */ /* synthetic */ InterfaceC1180h q() {
        return (InterfaceC1180h) a();
    }

    @Override // Cd.e0
    public boolean r() {
        return false;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + E() + ')';
    }
}
