package f3;

import e3.C3927a;
import fc.C4033p;
import k3.InterfaceC4792b;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4877c;

/* JADX INFO: renamed from: f3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3989b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34133b;

    public AbstractC3989b(int i10, int i11) {
        this.f34132a = i10;
        this.f34133b = i11;
    }

    public void a(InterfaceC4792b connection) {
        AbstractC4862t.e(connection, "connection");
        if (!(connection instanceof C3927a)) {
            throw new C4033p("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        b(((C3927a) connection).a());
    }

    public void b(InterfaceC4877c db2) {
        AbstractC4862t.e(db2, "db");
        throw new C4033p("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
