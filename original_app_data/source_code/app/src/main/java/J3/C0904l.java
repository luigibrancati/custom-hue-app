package J3;

import f3.AbstractC3989b;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4877c;

/* JADX INFO: renamed from: J3.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0904l extends AbstractC3989b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0904l f6019c = new C0904l();

    public C0904l() {
        super(4, 5);
    }

    @Override // f3.AbstractC3989b
    public void b(InterfaceC4877c db2) {
        AbstractC4862t.e(db2, "db");
        db2.z("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        db2.z("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
