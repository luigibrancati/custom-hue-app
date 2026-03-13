package u0;

import androidx.compose.ui.node.NodeCoordinator;
import n0.AbstractC5066d;

/* JADX INFO: renamed from: u0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5896e {
    public static final InterfaceC5895d a(InterfaceC5895d interfaceC5895d) {
        InterfaceC5895d interfaceC5895d2;
        InterfaceC5895d interfaceC5895dQ = interfaceC5895d.q();
        while (true) {
            InterfaceC5895d interfaceC5895d3 = interfaceC5895dQ;
            interfaceC5895d2 = interfaceC5895d;
            interfaceC5895d = interfaceC5895d3;
            if (interfaceC5895d == null) {
                break;
            }
            interfaceC5895dQ = interfaceC5895d.q();
        }
        NodeCoordinator nodeCoordinator = interfaceC5895d2 instanceof NodeCoordinator ? (NodeCoordinator) interfaceC5895d2 : null;
        if (nodeCoordinator == null) {
            return interfaceC5895d2;
        }
        NodeCoordinator nodeCoordinatorD0 = nodeCoordinator.D0();
        while (true) {
            NodeCoordinator nodeCoordinator2 = nodeCoordinatorD0;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            nodeCoordinatorD0 = nodeCoordinator.D0();
        }
    }

    public static final long b(InterfaceC5895d interfaceC5895d) {
        return interfaceC5895d.o(AbstractC5066d.f40480a.a());
    }
}
