package n3;

import android.database.sqlite.SQLiteDatabase;
import fc.C4025h;
import k3.AbstractC4791a;
import k3.InterfaceC4792b;
import k3.InterfaceC4794d;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: n3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5081a implements InterfaceC4792b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f40538a;

    public C5081a(SQLiteDatabase db2) {
        AbstractC4862t.e(db2, "db");
        this.f40538a = db2;
    }

    public final SQLiteDatabase a() {
        return this.f40538a;
    }

    @Override // k3.InterfaceC4792b
    public InterfaceC4794d a1(String sql) {
        AbstractC4862t.e(sql, "sql");
        if (this.f40538a.isOpen()) {
            return AbstractC5083c.f40539d.a(this.f40538a, sql);
        }
        AbstractC4791a.b(21, "connection is closed");
        throw new C4025h();
    }

    @Override // k3.InterfaceC4792b, java.lang.AutoCloseable
    public void close() {
        this.f40538a.close();
    }
}
