package v0;

import androidx.compose.ui.node.NodeCoordinator;
import e0.C3921a;
import kotlin.jvm.internal.AbstractC4854k;
import l0.InterfaceC4869e;
import o0.InterfaceC5187d;
import q0.C5475a;
import r0.AbstractC5523a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i implements q0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5475a f45721a;

    public i() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void a(InterfaceC5187d interfaceC5187d, long j10, NodeCoordinator nodeCoordinator, InterfaceC4869e.c cVar, AbstractC5523a abstractC5523a) {
        int iA = p.a(4);
        C3921a c3921a = null;
        while (cVar != null) {
            if ((cVar.e() & iA) != 0 && (cVar instanceof AbstractC6030e)) {
                int i10 = 0;
                for (InterfaceC4869e.c cVarJ = ((AbstractC6030e) cVar).j(); cVarJ != null; cVarJ = cVarJ.c()) {
                    if ((cVarJ.e() & iA) != 0) {
                        i10++;
                        if (i10 == 1) {
                            cVar = cVarJ;
                        } else {
                            if (c3921a == null) {
                                c3921a = new C3921a(new InterfaceC4869e.c[16], 0);
                            }
                            if (cVar != null) {
                                c3921a.d(cVar);
                                cVar = null;
                            }
                            c3921a.d(cVarJ);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            cVar = AbstractC6029d.c(c3921a);
        }
    }

    public i(C5475a c5475a) {
        this.f45721a = c5475a;
    }

    public /* synthetic */ i(C5475a c5475a, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? new C5475a() : c5475a);
    }
}
