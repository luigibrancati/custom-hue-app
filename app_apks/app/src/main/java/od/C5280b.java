package od;

import Cd.e0;
import Dd.e;
import Lc.InterfaceC1173a;

/* JADX INFO: renamed from: od.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C5280b implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1173a f41532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1173a f41533c;

    public C5280b(boolean z10, InterfaceC1173a interfaceC1173a, InterfaceC1173a interfaceC1173a2) {
        this.f41531a = z10;
        this.f41532b = interfaceC1173a;
        this.f41533c = interfaceC1173a2;
    }

    @Override // Dd.e.a
    public boolean a(e0 e0Var, e0 e0Var2) {
        return C5281c.d(this.f41531a, this.f41532b, this.f41533c, e0Var, e0Var2);
    }
}
