package J3;

import f3.InterfaceC3988a;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4877c;

/* JADX INFO: renamed from: J3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0894b implements InterfaceC3988a {
    @Override // f3.InterfaceC3988a
    public void a(InterfaceC4877c db2) {
        AbstractC4862t.e(db2, "db");
        db2.z("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }
}
