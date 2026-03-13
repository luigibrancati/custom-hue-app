package J3;

import f3.AbstractC3989b;
import k3.AbstractC4791a;
import k3.InterfaceC4792b;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class O extends AbstractC3989b {
    public O() {
        super(18, 19);
    }

    @Override // f3.AbstractC3989b
    public void a(InterfaceC4792b connection) throws Exception {
        AbstractC4862t.e(connection, "connection");
        AbstractC4791a.a(connection, "ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
