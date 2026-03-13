package u0;

import androidx.compose.ui.node.NodeCoordinator;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.jvm.internal.AbstractC4862t;
import n0.AbstractC5066d;
import n0.C5068f;
import t0.AbstractC5826a;
import z0.AbstractC6493g;
import z0.AbstractC6494h;
import z0.AbstractC6495i;

/* JADX INFO: renamed from: u0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5898g implements InterfaceC5895d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.node.e f45027a;

    public C5898g(androidx.compose.ui.node.e eVar) {
        this.f45027a = eVar;
    }

    public final NodeCoordinator a() {
        return this.f45027a.c0();
    }

    public final long b() {
        androidx.compose.ui.node.e eVarA = AbstractC5899h.a(this.f45027a);
        InterfaceC5895d interfaceC5895dK = eVarA.K();
        AbstractC5066d.a aVar = AbstractC5066d.f40480a;
        return AbstractC5066d.e(c(interfaceC5895dK, aVar.a()), a().L0(eVarA.c0(), aVar.a()));
    }

    public long c(InterfaceC5895d interfaceC5895d, long j10) {
        return k(interfaceC5895d, j10, true);
    }

    @Override // u0.InterfaceC5895d
    public boolean d() {
        return a().d();
    }

    @Override // u0.InterfaceC5895d
    public long f() {
        androidx.compose.ui.node.e eVar = this.f45027a;
        return AbstractC6495i.b((((long) eVar.y()) << 32) | (((long) eVar.v()) & KeyboardMap.kValueMask));
    }

    @Override // u0.InterfaceC5895d
    public C5068f j(InterfaceC5895d interfaceC5895d, boolean z10) {
        return a().j(interfaceC5895d, z10);
    }

    @Override // u0.InterfaceC5895d
    public long k(InterfaceC5895d interfaceC5895d, long j10, boolean z10) {
        if (!(interfaceC5895d instanceof C5898g)) {
            androidx.compose.ui.node.e eVarA = AbstractC5899h.a(this.f45027a);
            long jK = k(eVarA.d0(), j10, z10);
            long jF0 = eVarA.f0();
            float fE = AbstractC6493g.e(jF0);
            long jE = AbstractC5066d.e(jK, AbstractC5066d.b((KeyboardMap.kValueMask & ((long) Float.floatToRawIntBits(AbstractC6493g.f(jF0)))) | (Float.floatToRawIntBits(fE) << 32)));
            InterfaceC5895d interfaceC5895dX0 = eVarA.c0().x0();
            if (interfaceC5895dX0 == null) {
                interfaceC5895dX0 = eVarA.c0().K();
            }
            return AbstractC5066d.f(jE, interfaceC5895dX0.k(interfaceC5895d, AbstractC5066d.f40480a.a(), z10));
        }
        androidx.compose.ui.node.e eVar = ((C5898g) interfaceC5895d).f45027a;
        eVar.c0().N0();
        androidx.compose.ui.node.e eVarV0 = a().n0(eVar.c0()).v0();
        if (eVarV0 != null) {
            long jG = AbstractC6493g.g(AbstractC6493g.h(eVar.i0(eVarV0, !z10), AbstractC6494h.c(j10)), this.f45027a.i0(eVarV0, !z10));
            return AbstractC5066d.b((((long) Float.floatToRawIntBits(AbstractC6493g.e(jG))) << 32) | (((long) Float.floatToRawIntBits(AbstractC6493g.f(jG))) & KeyboardMap.kValueMask));
        }
        androidx.compose.ui.node.e eVarA2 = AbstractC5899h.a(eVar);
        long jH = AbstractC6493g.h(AbstractC6493g.h(eVar.i0(eVarA2, !z10), eVarA2.f0()), AbstractC6494h.c(j10));
        androidx.compose.ui.node.e eVarA3 = AbstractC5899h.a(this.f45027a);
        long jG2 = AbstractC6493g.g(jH, AbstractC6493g.h(this.f45027a.i0(eVarA3, !z10), eVarA3.f0()));
        long jB = AbstractC5066d.b((((long) Float.floatToRawIntBits(AbstractC6493g.e(jG2))) << 32) | (KeyboardMap.kValueMask & ((long) Float.floatToRawIntBits(AbstractC6493g.f(jG2)))));
        NodeCoordinator nodeCoordinatorD0 = eVarA3.c0().D0();
        AbstractC4862t.b(nodeCoordinatorD0);
        NodeCoordinator nodeCoordinatorD02 = eVarA2.c0().D0();
        AbstractC4862t.b(nodeCoordinatorD02);
        return nodeCoordinatorD0.k(nodeCoordinatorD02, jB, z10);
    }

    @Override // u0.InterfaceC5895d
    public long l(long j10) {
        return a().l(AbstractC5066d.f(j10, b()));
    }

    @Override // u0.InterfaceC5895d
    public long o(long j10) {
        return a().o(AbstractC5066d.f(j10, b()));
    }

    @Override // u0.InterfaceC5895d
    public InterfaceC5895d q() {
        androidx.compose.ui.node.e eVarV0;
        if (!d()) {
            AbstractC5826a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator nodeCoordinatorD0 = a().M().G().D0();
        if (nodeCoordinatorD0 == null || (eVarV0 = nodeCoordinatorD0.v0()) == null) {
            return null;
        }
        return eVarV0.K();
    }
}
