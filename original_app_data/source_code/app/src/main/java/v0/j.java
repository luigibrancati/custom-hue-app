package v0;

import androidx.compose.ui.node.Owner;
import fc.C4025h;
import t0.AbstractC5826a;
import z0.AbstractC6491e;
import z0.InterfaceC6489c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC6489c f45722a = AbstractC6491e.b(1.0f, 0.0f, 2, null);

    public static final Owner b(androidx.compose.ui.node.b bVar) {
        bVar.H();
        AbstractC5826a.c("LayoutNode should be attached to an owner");
        throw new C4025h();
    }
}
