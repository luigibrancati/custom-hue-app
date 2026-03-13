package J3;

import f3.AbstractC3989b;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4877c;

/* JADX INFO: renamed from: J3.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0900h extends AbstractC3989b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0900h f6008c = new C0900h();

    public C0900h() {
        super(15, 16);
    }

    @Override // f3.AbstractC3989b
    public void b(InterfaceC4877c db2) {
        AbstractC4862t.e(db2, "db");
        db2.z("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
        db2.z("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
        db2.z("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
        db2.z("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
        db2.z("DROP TABLE `SystemIdInfo`");
        db2.z("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
    }
}
