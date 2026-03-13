package La;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import android.util.Log;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Boolean f8631n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f8636e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n f8639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SQLiteDatabase f8640i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f8643l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f8637f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f8638g = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8641j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8642k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8644m = 0;

    public i(Context context, String str, int i10, boolean z10, int i11) {
        this.f8636e = context;
        this.f8633b = str;
        this.f8632a = z10;
        this.f8634c = i10;
        this.f8635d = i11;
    }

    public static /* synthetic */ Cursor f(C c10, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        c10.a(sQLiteQuery);
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static boolean i(Context context, String str, boolean z10) {
        try {
            String packageName = context.getPackageName();
            return (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128L)) : y(context, packageName, 128)).metaData.getBoolean(str, z10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean j(Context context) {
        return i(context, "com.tekartik.sqflite.wal_enabled", false);
    }

    public static void o(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    public static boolean x(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static ApplicationInfo y(Context context, String str, int i10) {
        return context.getPackageManager().getApplicationInfo(str, i10);
    }

    public String A() {
        return "[" + B() + "] ";
    }

    public String B() {
        Thread threadCurrentThread = Thread.currentThread();
        return this.f8634c + "," + threadCurrentThread.getName() + "(" + D.d(threadCurrentThread) + ")";
    }

    public SQLiteDatabase C() {
        return this.f8640i;
    }

    public void D(Exception exc, Na.e eVar) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            eVar.error("sqlite_error", "open_failed " + this.f8633b, null);
            return;
        }
        if (exc instanceof SQLException) {
            eVar.error("sqlite_error", exc.getMessage(), Na.h.a(eVar));
        } else {
            eVar.error("sqlite_error", exc.getMessage(), Na.h.a(eVar));
        }
    }

    public void E(final Na.e eVar) {
        R(eVar, new Runnable() { // from class: La.e
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f8625a.H(eVar);
            }
        });
    }

    public synchronized boolean F() {
        return this.f8641j > 0;
    }

    public final /* synthetic */ void G(Na.e eVar) {
        Boolean boolD = eVar.d();
        boolean z10 = Boolean.TRUE.equals(boolD) && eVar.b();
        if (z10) {
            int i10 = this.f8642k + 1;
            this.f8642k = i10;
            this.f8643l = Integer.valueOf(i10);
        }
        if (!w(eVar)) {
            if (z10) {
                this.f8643l = null;
            }
        } else if (z10) {
            HashMap map = new HashMap();
            map.put("transactionId", this.f8643l);
            eVar.success(map);
        } else {
            if (Boolean.FALSE.equals(boolD)) {
                this.f8643l = null;
            }
            eVar.success(null);
        }
    }

    public void L() {
        if (f8631n == null) {
            Boolean boolValueOf = Boolean.valueOf(j(this.f8636e));
            f8631n = boolValueOf;
            if (boolValueOf.booleanValue() && q.c(this.f8635d)) {
                Log.d("Sqflite", A() + "[sqflite] WAL enabled");
            }
        }
        this.f8640i = SQLiteDatabase.openDatabase(this.f8633b, null, f8631n.booleanValue() ? 805306368 : 268435456);
    }

    public void M() {
        this.f8640i = SQLiteDatabase.openDatabase(this.f8633b, null, 1, new a());
    }

    public void N(final Na.e eVar) {
        R(eVar, new Runnable() { // from class: La.c
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f8621a.I(eVar);
            }
        });
    }

    public void O(final Na.e eVar) {
        R(eVar, new Runnable() { // from class: La.b
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f8619a.J(eVar);
            }
        });
    }

    public final void P() {
        while (!this.f8637f.isEmpty() && this.f8643l == null) {
            ((Na.g) this.f8637f.get(0)).a();
            this.f8637f.remove(0);
        }
    }

    public void Q(final Na.e eVar) {
        R(eVar, new Runnable() { // from class: La.d
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f8623a.K(eVar);
            }
        });
    }

    public final void R(Na.e eVar, Runnable runnable) {
        Integer numG = eVar.g();
        Integer num = this.f8643l;
        if (num == null) {
            runnable.run();
            return;
        }
        if (numG == null || !(numG.equals(num) || numG.intValue() == -1)) {
            this.f8637f.add(new Na.g(eVar, runnable));
            return;
        }
        runnable.run();
        if (this.f8643l != null || this.f8637f.isEmpty()) {
            return;
        }
        this.f8639h.a(this, new Runnable() { // from class: La.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f8630a.P();
            }
        });
    }

    public void h(MethodCall methodCall, MethodChannel.Result result) {
        Na.c cVar;
        String method;
        Na.d dVar = new Na.d(methodCall, result);
        boolean zF = dVar.f();
        boolean zI = dVar.i();
        List list = (List) dVar.a("operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cVar = new Na.c((Map) it.next(), zF);
            method = cVar.getMethod();
            method.getClass();
            switch (method) {
                case "execute":
                    if (!p(cVar)) {
                        if (!zI) {
                            cVar.o(result);
                            return;
                        }
                        cVar.p(arrayList);
                        break;
                    } else {
                        cVar.q(arrayList);
                        break;
                    }
                    break;
                case "insert":
                    if (!H(cVar)) {
                        if (!zI) {
                            cVar.o(result);
                            return;
                        }
                        cVar.p(arrayList);
                        break;
                    } else {
                        cVar.q(arrayList);
                        break;
                    }
                    break;
                case "update":
                    if (!K(cVar)) {
                        if (!zI) {
                            cVar.o(result);
                            return;
                        }
                        cVar.p(arrayList);
                        break;
                    } else {
                        cVar.q(arrayList);
                        break;
                    }
                    break;
                case "query":
                    if (!I(cVar)) {
                        if (!zI) {
                            cVar.o(result);
                            return;
                        }
                        cVar.p(arrayList);
                        break;
                    } else {
                        cVar.q(arrayList);
                        break;
                    }
                    break;
                default:
                    result.error("bad_param", "Batch method '" + method + "' not supported", null);
                    return;
            }
        }
        if (zF) {
            result.success(null);
        } else {
            result.success(arrayList);
        }
    }

    public void k() {
        if (!this.f8638g.isEmpty() && q.b(this.f8635d)) {
            Log.d("Sqflite", A() + this.f8638g.size() + " cursor(s) are left opened");
        }
        this.f8640i.close();
    }

    public final void l(int i10) {
        s sVar = (s) this.f8638g.get(Integer.valueOf(i10));
        if (sVar != null) {
            m(sVar);
        }
    }

    public final void m(s sVar) {
        try {
            int i10 = sVar.f8671a;
            if (q.c(this.f8635d)) {
                Log.d("Sqflite", A() + "closing cursor " + i10);
            }
            this.f8638g.remove(Integer.valueOf(i10));
            sVar.f8673c.close();
        } catch (Exception unused) {
        }
    }

    public final Map n(Cursor cursor, Integer num) {
        HashMap map = null;
        int columnCount = 0;
        ArrayList arrayList = null;
        while (cursor.moveToNext()) {
            if (map == null) {
                ArrayList arrayList2 = new ArrayList();
                HashMap map2 = new HashMap();
                columnCount = cursor.getColumnCount();
                map2.put("columns", Arrays.asList(cursor.getColumnNames()));
                map2.put("rows", arrayList2);
                arrayList = arrayList2;
                map = map2;
            }
            arrayList.add(D.a(cursor, columnCount));
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return map == null ? new HashMap() : map;
    }

    public final boolean p(Na.e eVar) {
        if (!w(eVar)) {
            return false;
        }
        eVar.success(null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean H(Na.e r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: La.i.H(Na.e):boolean");
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final boolean I(Na.e eVar) throws Throwable {
        Cursor cursorRawQueryWithFactory;
        Integer num = (Integer) eVar.a("cursorPageSize");
        final C cE = eVar.e();
        if (q.b(this.f8635d)) {
            Log.d("Sqflite", A() + cE);
        }
        s sVar = null;
        try {
            cursorRawQueryWithFactory = z().rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: La.g
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return i.f(cE, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, cE.c(), C1169a.f8618a, null);
            try {
                try {
                    Map mapN = n(cursorRawQueryWithFactory, num);
                    if (num != null && !cursorRawQueryWithFactory.isLast() && !cursorRawQueryWithFactory.isAfterLast()) {
                        int i10 = this.f8644m + 1;
                        this.f8644m = i10;
                        mapN.put("cursorId", Integer.valueOf(i10));
                        s sVar2 = new s(i10, num.intValue(), cursorRawQueryWithFactory);
                        try {
                            this.f8638g.put(Integer.valueOf(i10), sVar2);
                            sVar = sVar2;
                        } catch (Exception e10) {
                            e = e10;
                            sVar = sVar2;
                            D(e, eVar);
                            if (sVar != null) {
                                m(sVar);
                            }
                            if (sVar != null || cursorRawQueryWithFactory == null) {
                                return false;
                            }
                            cursorRawQueryWithFactory.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            sVar = sVar2;
                            if (sVar == null && cursorRawQueryWithFactory != null) {
                                cursorRawQueryWithFactory.close();
                            }
                            throw th;
                        }
                    }
                    eVar.success(mapN);
                    if (sVar == null && cursorRawQueryWithFactory != null) {
                        cursorRawQueryWithFactory.close();
                    }
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            cursorRawQueryWithFactory = null;
        } catch (Throwable th3) {
            th = th3;
            cursorRawQueryWithFactory = null;
        }
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final boolean J(Na.e eVar) throws Throwable {
        boolean z10;
        Integer num = (Integer) eVar.a("cursorId");
        int iIntValue = num.intValue();
        boolean zEquals = Boolean.TRUE.equals(eVar.a("cancel"));
        if (q.c(this.f8635d)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(A());
            sb2.append("cursor ");
            sb2.append(iIntValue);
            sb2.append(zEquals ? " cancel" : " next");
            Log.d("Sqflite", sb2.toString());
        }
        s sVar = null;
        if (zEquals) {
            l(iIntValue);
            eVar.success(null);
            return true;
        }
        s sVar2 = (s) this.f8638g.get(num);
        int i10 = 0;
        try {
            try {
                if (sVar2 == null) {
                    throw new IllegalStateException("Cursor " + iIntValue + " not found");
                }
                Cursor cursor = sVar2.f8673c;
                Map mapN = n(cursor, Integer.valueOf(sVar2.f8672b));
                z10 = (cursor.isLast() || cursor.isAfterLast()) ? false : true;
                if (z10) {
                    try {
                        mapN.put("cursorId", num);
                    } catch (Exception e10) {
                        e = e10;
                        D(e, eVar);
                        if (sVar2 != null) {
                            m(sVar2);
                        } else {
                            sVar = sVar2;
                        }
                        if (!z10 && sVar != null) {
                            m(sVar);
                        }
                        return false;
                    }
                }
                eVar.success(mapN);
                if (!z10) {
                    m(sVar2);
                }
                return true;
            } catch (Exception e11) {
                e = e11;
                z10 = false;
            } catch (Throwable th) {
                th = th;
                if (i10 == 0) {
                    m(sVar2);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i10 = iIntValue;
            if (i10 == 0 && sVar2 != null) {
                m(sVar2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final boolean K(Na.e eVar) throws Throwable {
        if (!w(eVar)) {
            return false;
        }
        Cursor cursor = null;
        if (eVar.f()) {
            eVar.success(null);
            return true;
        }
        try {
            try {
                Cursor cursorRawQuery = C().rawQuery("SELECT changes()", null);
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.getCount() > 0 && cursorRawQuery.moveToFirst()) {
                            int i10 = cursorRawQuery.getInt(0);
                            if (q.b(this.f8635d)) {
                                Log.d("Sqflite", A() + "changed " + i10);
                            }
                            eVar.success(Integer.valueOf(i10));
                            cursorRawQuery.close();
                            return true;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        cursor = cursorRawQuery;
                        D(e, eVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.e("Sqflite", A() + "fail to read changes for Update/Delete");
                eVar.success(null);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public synchronized void u(Boolean bool) {
        try {
            if (Boolean.TRUE.equals(bool)) {
                this.f8641j++;
            } else if (Boolean.FALSE.equals(bool)) {
                this.f8641j--;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void v(final Na.e eVar) {
        R(eVar, new Runnable() { // from class: La.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f8627a.G(eVar);
            }
        });
    }

    public final boolean w(Na.e eVar) {
        C cE = eVar.e();
        if (q.b(this.f8635d)) {
            Log.d("Sqflite", A() + cE);
        }
        Boolean boolD = eVar.d();
        try {
            C().execSQL(cE.c(), cE.d());
            u(boolD);
            return true;
        } catch (Exception e10) {
            D(e10, eVar);
            return false;
        }
    }

    public SQLiteDatabase z() {
        return this.f8640i;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements DatabaseErrorHandler {
        public a() {
        }

        @Override // android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }
}
