package X6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import java.util.Objects;

/* JADX INFO: renamed from: X6.o2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2455o2 extends com.google.android.gms.internal.measurement.Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2471q2 f19137a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2455o2(C2471q2 c2471q2, Context context, String str) {
        super(context, "google_app_measurement_local.db", null, 1);
        Objects.requireNonNull(c2471q2);
        this.f19137a = c2471q2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e10) {
            throw e10;
        } catch (SQLiteException unused) {
            C2416j3 c2416j3 = this.f19137a.f18400a;
            c2416j3.a().o().a("Opening the local database failed, dropping and recreating it");
            c2416j3.w();
            if (!c2416j3.d().getDatabasePath("google_app_measurement_local.db").delete()) {
                c2416j3.a().o().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e11) {
                this.f19137a.f18400a.a().o().b("Failed to open local database. Events will bypass local storage", e11);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC2523x.b(this.f19137a.f18400a.a(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        AbstractC2523x.a(this.f19137a.f18400a.a(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", C2471q2.f19162e);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
