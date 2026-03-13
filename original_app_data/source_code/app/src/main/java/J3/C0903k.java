package J3;

import f3.AbstractC3989b;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4877c;

/* JADX INFO: renamed from: J3.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0903k extends AbstractC3989b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0903k f6014c = new C0903k();

    public C0903k() {
        super(3, 4);
    }

    @Override // f3.AbstractC3989b
    public void b(InterfaceC4877c db2) {
        AbstractC4862t.e(db2, "db");
        db2.z("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
