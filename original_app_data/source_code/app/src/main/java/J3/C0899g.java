package J3;

import f3.AbstractC3989b;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4877c;

/* JADX INFO: renamed from: J3.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0899g extends AbstractC3989b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0899g f5992c = new C0899g();

    public C0899g() {
        super(12, 13);
    }

    @Override // f3.AbstractC3989b
    public void b(InterfaceC4877c db2) {
        AbstractC4862t.e(db2, "db");
        db2.z("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db2.z("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
