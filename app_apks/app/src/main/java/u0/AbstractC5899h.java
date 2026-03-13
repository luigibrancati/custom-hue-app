package u0;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: u0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5899h {
    public static final androidx.compose.ui.node.e a(androidx.compose.ui.node.e eVar) {
        androidx.compose.ui.node.b bVarM = eVar.M();
        while (true) {
            androidx.compose.ui.node.b bVarI = bVarM.I();
            if ((bVarI != null ? bVarI.x() : null) == null) {
                androidx.compose.ui.node.e eVarV0 = bVarM.G().v0();
                AbstractC4862t.b(eVarV0);
                return eVarV0;
            }
            androidx.compose.ui.node.b bVarI2 = bVarM.I();
            androidx.compose.ui.node.b bVarX = bVarI2 != null ? bVarI2.x() : null;
            AbstractC4862t.b(bVarX);
            if (bVarX.U()) {
                bVarM = bVarM.I();
                AbstractC4862t.b(bVarM);
            } else {
                androidx.compose.ui.node.b bVarI3 = bVarM.I();
                AbstractC4862t.b(bVarI3);
                bVarM = bVarI3.x();
                AbstractC4862t.b(bVarM);
            }
        }
    }
}
