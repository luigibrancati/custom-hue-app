package X6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import io.sentry.protocol.App;

/* JADX INFO: renamed from: X6.q2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2471q2 extends AbstractC2399h2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f19162e = {App.JsonKeys.APP_VERSION, "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2455o2 f19163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19164d;

    public C2471q2(C2416j3 c2416j3) {
        super(c2416j3);
        Context contextD = this.f18400a.d();
        this.f18400a.w();
        this.f19163c = new C2455o2(this, contextD, "google_app_measurement_local.db");
    }

    @Override // X6.AbstractC2399h2
    public final boolean m() {
        return false;
    }

    public final void o() {
        int iDelete;
        h();
        try {
            SQLiteDatabase sQLiteDatabaseW = w();
            if (sQLiteDatabaseW == null || (iDelete = sQLiteDatabaseW.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f18400a.a().w().b("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e10) {
            this.f18400a.a().o().b("Error resetting local analytics data. error", e10);
        }
    }

    public final boolean p(I i10) {
        Parcel parcelObtain = Parcel.obtain();
        J.a(i10, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return z(0, bArrMarshall);
        }
        this.f18400a.a().p().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean q(W6 w62) {
        Parcel parcelObtain = Parcel.obtain();
        X6.a(w62, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return z(1, bArrMarshall);
        }
        this.f18400a.a().p().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean r(C2404i c2404i) {
        C2416j3 c2416j3 = this.f18400a;
        byte[] bArrT = c2416j3.C().T(c2404i);
        if (bArrT.length <= 131072) {
            return z(2, bArrT);
        }
        c2416j3.a().p().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean s(G g10) {
        C2416j3 c2416j3 = this.f18400a;
        byte[] bArrT = c2416j3.C().T(g10);
        if (bArrT == null) {
            c2416j3.a().p().a("Null default event parameters; not writing to database");
            return false;
        }
        if (bArrT.length <= 131072) {
            return z(4, bArrT);
        }
        c2416j3.a().p().a("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0366 A[PHI: r6 r11 r13 r17 r19 r21
      0x0366: PHI (r6v14 int) = (r6v7 int), (r6v10 int), (r6v15 int) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v4 int) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r13v9 ??) = (r13v5 ??), (r13v7 ??), (r13v10 ??) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r17v8 java.lang.String) = (r17v3 java.lang.String), (r17v5 java.lang.String), (r17v9 java.lang.String) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r19v8 java.lang.String) = (r19v3 java.lang.String), (r19v5 java.lang.String), (r19v9 java.lang.String) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r21v8 java.lang.String) = (r21v3 java.lang.String), (r21v5 java.lang.String), (r21v9 java.lang.String) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x032f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x038e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x038e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x038e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [android.database.sqlite.SQLiteClosable, android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r15v5, types: [X6.m] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r17v43 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List t(int r30) {
        /*
            Method dump skipped, instruction units count: 953
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2471q2.t(int):java.util.List");
    }

    public final boolean u() {
        return z(3, new byte[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068 A[PHI: r4
      0x0068: PHI (r4v4 int) = (r4v2 int), (r4v1 int), (r4v1 int) binds: [B:28:0x0066, B:25:0x005f, B:32:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v() {
        /*
            r10 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r10.h()
            boolean r1 = r10.f19164d
            r2 = 0
            if (r1 == 0) goto Lc
            goto L97
        Lc:
            boolean r1 = r10.x()
            if (r1 == 0) goto L97
            r1 = 5
            r4 = r1
            r3 = r2
        L15:
            if (r3 >= r1) goto L88
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r10.w()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L60 android.database.sqlite.SQLiteFullException -> L6c
            if (r5 != 0) goto L23
            r10.f19164d = r6     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L60 android.database.sqlite.SQLiteFullException -> L6c
            goto L97
        L23:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L60 android.database.sqlite.SQLiteFullException -> L6c
            java.lang.String r7 = "messages"
            java.lang.String r8 = "type == ?"
            r9 = 3
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L60 android.database.sqlite.SQLiteFullException -> L6c
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L60 android.database.sqlite.SQLiteFullException -> L6c
            r5.delete(r7, r8, r9)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L60 android.database.sqlite.SQLiteFullException -> L6c
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L60 android.database.sqlite.SQLiteFullException -> L6c
            r5.endTransaction()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L60 android.database.sqlite.SQLiteFullException -> L6c
            r5.close()
            return r6
        L40:
            r10 = move-exception
            goto L82
        L42:
            r7 = move-exception
            if (r5 == 0) goto L4e
            boolean r8 = r5.inTransaction()     // Catch: java.lang.Throwable -> L40
            if (r8 == 0) goto L4e
            r5.endTransaction()     // Catch: java.lang.Throwable -> L40
        L4e:
            X6.j3 r8 = r10.f18400a     // Catch: java.lang.Throwable -> L40
            X6.z2 r8 = r8.a()     // Catch: java.lang.Throwable -> L40
            X6.x2 r8 = r8.o()     // Catch: java.lang.Throwable -> L40
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L40
            r10.f19164d = r6     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L7f
            goto L68
        L60:
            long r6 = (long) r4     // Catch: java.lang.Throwable -> L40
            android.os.SystemClock.sleep(r6)     // Catch: java.lang.Throwable -> L40
            int r4 = r4 + 20
            if (r5 == 0) goto L7f
        L68:
            r5.close()
            goto L7f
        L6c:
            r7 = move-exception
            X6.j3 r8 = r10.f18400a     // Catch: java.lang.Throwable -> L40
            X6.z2 r8 = r8.a()     // Catch: java.lang.Throwable -> L40
            X6.x2 r8 = r8.o()     // Catch: java.lang.Throwable -> L40
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L40
            r10.f19164d = r6     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L7f
            goto L68
        L7f:
            int r3 = r3 + 1
            goto L15
        L82:
            if (r5 == 0) goto L87
            r5.close()
        L87:
            throw r10
        L88:
            X6.j3 r10 = r10.f18400a
            X6.z2 r10 = r10.a()
            X6.x2 r10 = r10.r()
            java.lang.String r0 = "Error deleting app launch break from local database in reasonable time"
            r10.a(r0)
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2471q2.v():boolean");
    }

    public final SQLiteDatabase w() {
        if (this.f19164d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f19163c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f19164d = true;
        return null;
    }

    public final boolean x() {
        C2416j3 c2416j3 = this.f18400a;
        Context contextD = c2416j3.d();
        c2416j3.w();
        return contextD.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3 A[Catch: SQLiteException -> 0x0098, SQLiteDatabaseLockedException -> 0x009f, SQLiteFullException -> 0x00a3, all -> 0x0164, TRY_ENTER, TryCatch #1 {all -> 0x0164, blocks: (B:30:0x008d, B:32:0x0093, B:43:0x00b3, B:45:0x00d7, B:47:0x00e1, B:49:0x00e9, B:59:0x0103, B:73:0x012b, B:75:0x0131, B:76:0x0134, B:93:0x016b, B:83:0x0154), top: B:107:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0160 A[PHI: r8 r10 r17
      0x0160: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r10v8 android.database.sqlite.SQLiteDatabase) = 
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v7 android.database.sqlite.SQLiteDatabase)
      (r10v9 android.database.sqlite.SQLiteDatabase)
     binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z(int r19, byte[] r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.C2471q2.z(int, byte[]):boolean");
    }
}
