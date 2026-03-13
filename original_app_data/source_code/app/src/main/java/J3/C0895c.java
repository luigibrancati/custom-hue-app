package J3;

import I3.InterfaceC0872b;
import b3.t;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4877c;

/* JADX INFO: renamed from: J3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0895c extends t.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0872b f5983a;

    public C0895c(InterfaceC0872b clock) {
        AbstractC4862t.e(clock, "clock");
        this.f5983a = clock;
    }

    @Override // b3.t.b
    public void f(InterfaceC4877c db2) {
        AbstractC4862t.e(db2, "db");
        super.f(db2);
        db2.v();
        try {
            db2.z(h());
            db2.P();
        } finally {
            db2.V();
        }
    }

    public final long g() {
        return this.f5983a.a() - H.f5969a;
    }

    public final String h() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + g() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
