package w4;

import Od.C;
import Od.F;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import gc.C4206t;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A4.a f46178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File f46179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f46180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46181d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, String databaseName, A4.a logger) {
        super(context, databaseName, (SQLiteDatabase.CursorFactory) null, 4);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(databaseName, "databaseName");
        AbstractC4862t.e(logger, "logger");
        this.f46178a = logger;
        File databasePath = context.getDatabasePath(databaseName);
        AbstractC4862t.d(databasePath, "getDatabasePath(...)");
        this.f46179b = databasePath;
        this.f46180c = true;
        this.f46181d = 4;
    }

    public final synchronized void C(long j10) {
        if (this.f46181d < 4) {
            return;
        }
        q("identify_interceptor", j10);
    }

    public final synchronized void D(String key) {
        AbstractC4862t.e(key, "key");
        F("long_store", key);
    }

    public final void F(String str, String str2) {
        try {
            try {
                getWritableDatabase().delete(str, "key = ?", new String[]{str2});
            } catch (SQLiteException e10) {
                B4.b.f644c.a().d("remove value from " + str + " failed: " + e10.getMessage());
                a();
            } catch (StackOverflowError e11) {
                B4.b.f644c.a().d("remove value from " + str + " failed: " + e11.getMessage());
                a();
            }
        } finally {
            close();
        }
    }

    public final void a() {
        try {
            close();
        } catch (Exception e10) {
            B4.b.f644c.a().d("close failed: " + e10.getMessage());
        }
    }

    public final void b(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (message == null || message.length() == 0) {
            throw runtimeException;
        }
        if (!C.P(message, "Cursor window allocation of", false, 2, null) && !C.P(message, "Could not allocate CursorWindow", false, 2, null)) {
            throw runtimeException;
        }
        throw new C6125b(message);
    }

    public final synchronized Long c(String key) {
        AbstractC4862t.e(key, "key");
        return (Long) f("long_store", key);
    }

    public final synchronized String d(String key) {
        AbstractC4862t.e(key, "key");
        return (String) f("store", key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[PHI: r4 r11
      0x0099: PHI (r4v14 w4.c) = (r4v11 w4.c), (r4v12 w4.c), (r4v13 w4.c), (r4v16 w4.c) binds: [B:61:0x00cd, B:53:0x0097, B:58:0x00a5, B:63:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r11v8 android.database.Cursor) = 
      (r11v5 android.database.Cursor)
      (r11v6 android.database.Cursor)
      (r11v7 android.database.Cursor)
      (r11v9 android.database.Cursor)
     binds: [B:61:0x00cd, B:53:0x0097, B:58:0x00a5, B:63:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cd  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.lang.String r12, java.lang.String r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.c.f(java.lang.String, java.lang.String):java.lang.Object");
    }

    public final void g(IllegalStateException illegalStateException) {
        String message = illegalStateException.getMessage();
        if (message == null || message.length() == 0 || !F.V(message, "Couldn't read", false, 2, null) || !F.V(message, "CursorWindow", false, 2, null)) {
            throw illegalStateException;
        }
        a();
    }

    public final Cursor h(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3) {
        return sQLiteDatabase.query(str, strArr, str2, strArr2, null, null, str3, null);
    }

    public final synchronized List i() {
        return j("events");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4 A[PHI: r4 r5
      0x00a4: PHI (r4v6 android.database.Cursor) = 
      (r4v1 android.database.Cursor)
      (r4v2 android.database.Cursor)
      (r4v4 android.database.Cursor)
      (r4v7 android.database.Cursor)
     binds: [B:61:0x00d8, B:53:0x00a2, B:58:0x00b0, B:63:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r5v12 w4.c) = (r5v7 w4.c), (r5v8 w4.c), (r5v10 w4.c), (r5v14 w4.c) binds: [B:61:0x00d8, B:53:0x00a2, B:58:0x00b0, B:63:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List j(java.lang.String r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.c.j(java.lang.String):java.util.List");
    }

    public final synchronized List k() {
        return j("identifys");
    }

    public final synchronized List m() {
        if (this.f46181d < 4) {
            return C4206t.k();
        }
        return j("identify_interceptor");
    }

    public final synchronized void o(long j10) {
        q("events", j10);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db2) {
        AbstractC4862t.e(db2, "db");
        this.f46180c = false;
        this.f46178a.d("Attempt to re-create existing legacy database file " + this.f46179b.getAbsolutePath());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.f46181d = i10;
    }

    public final void q(String str, long j10) {
        try {
            try {
                try {
                    getWritableDatabase().delete(str, "id = ?", new String[]{String.valueOf(j10)});
                } catch (SQLiteException e10) {
                    B4.b.f644c.a().d("remove events from " + str + " failed: " + e10.getMessage());
                    a();
                }
            } catch (StackOverflowError e11) {
                B4.b.f644c.a().d("remove events from " + str + " failed: " + e11.getMessage());
                a();
            }
        } finally {
            close();
        }
    }

    public final synchronized void u(long j10) {
        q("identifys", j10);
    }
}
