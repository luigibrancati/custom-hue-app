package v0;

import androidx.compose.ui.node.NodeCoordinator;
import e0.C3921a;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import l0.InterfaceC4869e;
import u0.C5904m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.node.b f45726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f45727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.ui.node.a f45728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NodeCoordinator f45729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4869e.c f45730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC4869e.c f45731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C3921a f45732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3921a f45733h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends InterfaceC4869e.c {
        public String toString() {
            return "<Head>";
        }
    }

    public n(androidx.compose.ui.node.b bVar) {
        this.f45726a = bVar;
        a aVar = new a();
        aVar.h(-1);
        this.f45727b = aVar;
        androidx.compose.ui.node.a aVar2 = new androidx.compose.ui.node.a(bVar);
        this.f45728c = aVar2;
        this.f45729d = aVar2;
        v vVarB0 = aVar2.B0();
        this.f45730e = vVarB0;
        this.f45731f = vVarB0;
        this.f45733h = new C3921a(new InterfaceC4869e[16], 0);
    }

    public final int a() {
        return this.f45731f.b();
    }

    public final InterfaceC4869e.c b() {
        return this.f45731f;
    }

    public final androidx.compose.ui.node.a c() {
        return this.f45728c;
    }

    public final List d() {
        C3921a c3921a = this.f45732g;
        if (c3921a == null) {
            return C4206t.k();
        }
        int i10 = 0;
        C3921a c3921a2 = new C3921a(new C5904m[c3921a.o()], 0);
        InterfaceC4869e.c cVarB = b();
        while (cVarB != null && cVarB != f()) {
            NodeCoordinator nodeCoordinatorD = cVarB.d();
            if (nodeCoordinatorD == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator");
            }
            nodeCoordinatorD.u0();
            this.f45728c.u0();
            InterfaceC4869e.c cVarC = cVarB.c();
            if (cVarC == this.f45730e) {
                cVarB.d();
                cVarC.d();
            }
            c3921a2.d(new C5904m((InterfaceC4869e) c3921a.f33521a[i10], nodeCoordinatorD, null));
            cVarB = cVarB.c();
            i10++;
        }
        return c3921a2.j();
    }

    public final NodeCoordinator e() {
        return this.f45729d;
    }

    public final InterfaceC4869e.c f() {
        return this.f45730e;
    }

    public final boolean g(int i10) {
        return (a() & i10) != 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        if (this.f45731f == this.f45730e) {
            sb2.append("]");
        } else {
            InterfaceC4869e.c cVarB = b();
            while (true) {
                if (cVarB == null || cVarB == f()) {
                    break;
                }
                sb2.append(String.valueOf(cVarB));
                if (cVarB.c() == this.f45730e) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
                cVarB = cVarB.c();
            }
        }
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }
}
