package n3;

import android.database.sqlite.SQLiteDatabase;
import k3.InterfaceC4792b;
import k3.InterfaceC4793c;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: n3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5082b implements InterfaceC4793c {
    @Override // k3.InterfaceC4793c
    public InterfaceC4792b a(String fileName) {
        AbstractC4862t.e(fileName, "fileName");
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(fileName, (SQLiteDatabase.CursorFactory) null);
        AbstractC4862t.b(sQLiteDatabaseOpenOrCreateDatabase);
        return new C5081a(sQLiteDatabaseOpenOrCreateDatabase);
    }
}
