package J3;

import android.content.Context;
import f3.AbstractC3989b;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4877c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends AbstractC3989b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f6009c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context) {
        super(9, 10);
        AbstractC4862t.e(context, "context");
        this.f6009c = context;
    }

    @Override // f3.AbstractC3989b
    public void b(InterfaceC4877c db2) {
        AbstractC4862t.e(db2, "db");
        db2.z("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        R3.s.c(this.f6009c, db2);
        R3.l.c(this.f6009c, db2);
    }
}
