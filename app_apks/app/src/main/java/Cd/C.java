package Cd;

import Lc.InterfaceC1180h;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C extends l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lc.f0[] f1256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0[] f1257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1258e;

    public /* synthetic */ C(Lc.f0[] f0VarArr, i0[] i0VarArr, boolean z10, int i10, AbstractC4854k abstractC4854k) {
        this(f0VarArr, i0VarArr, (i10 & 4) != 0 ? false : z10);
    }

    @Override // Cd.l0
    public boolean b() {
        return this.f1258e;
    }

    @Override // Cd.l0
    public i0 e(E key) {
        AbstractC4862t.e(key, "key");
        InterfaceC1180h interfaceC1180hQ = key.N0().q();
        Lc.f0 f0Var = interfaceC1180hQ instanceof Lc.f0 ? (Lc.f0) interfaceC1180hQ : null;
        if (f0Var == null) {
            return null;
        }
        int index = f0Var.getIndex();
        Lc.f0[] f0VarArr = this.f1256c;
        if (index >= f0VarArr.length || !AbstractC4862t.a(f0VarArr[index].k(), f0Var.k())) {
            return null;
        }
        return this.f1257d[index];
    }

    @Override // Cd.l0
    public boolean f() {
        return this.f1257d.length == 0;
    }

    public final i0[] i() {
        return this.f1257d;
    }

    public final Lc.f0[] j() {
        return this.f1256c;
    }

    public C(Lc.f0[] parameters, i0[] arguments, boolean z10) {
        AbstractC4862t.e(parameters, "parameters");
        AbstractC4862t.e(arguments, "arguments");
        this.f1256c = parameters;
        this.f1257d = arguments;
        this.f1258e = z10;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C(List parameters, List argumentsList) {
        this((Lc.f0[]) parameters.toArray(new Lc.f0[0]), (i0[]) argumentsList.toArray(new i0[0]), false, 4, null);
        AbstractC4862t.e(parameters, "parameters");
        AbstractC4862t.e(argumentsList, "argumentsList");
    }
}
