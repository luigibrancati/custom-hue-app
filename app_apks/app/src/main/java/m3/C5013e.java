package m3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.text.TextUtils;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import l3.AbstractC4875a;
import l3.InterfaceC4877c;
import l3.InterfaceC4880f;
import vc.InterfaceC6082a;
import vc.r;

/* JADX INFO: renamed from: m3.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5013e implements InterfaceC4877c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40164b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f40165c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f40166d = new String[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final InterfaceC4028k f40167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final InterfaceC4028k f40168f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f40169a;

    /* JADX INFO: renamed from: m3.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Method c() {
            return (Method) C5013e.f40168f.getValue();
        }

        public final Method d() {
            return (Method) C5013e.f40167e.getValue();
        }

        public a() {
        }
    }

    static {
        EnumC4031n enumC4031n = EnumC4031n.NONE;
        f40167e = C4029l.a(enumC4031n, new InterfaceC6082a() { // from class: m3.c
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C5013e.j();
            }
        });
        f40168f = C4029l.a(enumC4031n, new InterfaceC6082a() { // from class: m3.d
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C5013e.h();
            }
        });
    }

    public C5013e(SQLiteDatabase delegate) {
        AbstractC4862t.e(delegate, "delegate");
        this.f40169a = delegate;
    }

    public static final Method h() {
        Class<?> returnType;
        try {
            Method methodD = f40164b.d();
            if (methodD == null || (returnType = methodD.getReturnType()) == null) {
                return null;
            }
            Class cls = Integer.TYPE;
            return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Method j() {
        try {
            Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final SQLiteCursor o(InterfaceC4880f interfaceC4880f, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        AbstractC4862t.b(sQLiteQuery);
        interfaceC4880f.b(new C5018j(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static final Cursor q(r rVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return (Cursor) rVar.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // l3.InterfaceC4877c
    public int D0(String table, int i10, ContentValues values, String str, Object[] objArr) {
        AbstractC4862t.e(table, "table");
        AbstractC4862t.e(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append(f40165c[i10]);
        sb2.append(table);
        sb2.append(" SET ");
        int i11 = 0;
        for (String str2 : values.keySet()) {
            sb2.append(i11 > 0 ? "," : "");
            sb2.append(str2);
            objArr2[i11] = values.get(str2);
            sb2.append("=?");
            i11++;
        }
        if (objArr != null) {
            for (int i12 = size; i12 < length; i12++) {
                objArr2[i12] = objArr[i12 - size];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        l3.g gVarU0 = u0(sb2.toString());
        AbstractC4875a.f39838a.b(gVarU0, objArr2);
        return gVarU0.E();
    }

    @Override // l3.InterfaceC4877c
    public void P() {
        this.f40169a.setTransactionSuccessful();
    }

    @Override // l3.InterfaceC4877c
    public void Q(String sql, Object[] bindArgs) {
        AbstractC4862t.e(sql, "sql");
        AbstractC4862t.e(bindArgs, "bindArgs");
        this.f40169a.execSQL(sql, bindArgs);
    }

    @Override // l3.InterfaceC4877c
    public void R() {
        this.f40169a.beginTransactionNonExclusive();
    }

    @Override // l3.InterfaceC4877c
    public boolean R0() {
        return this.f40169a.inTransaction();
    }

    @Override // l3.InterfaceC4877c
    public Cursor T0(final InterfaceC4880f query) {
        AbstractC4862t.e(query, "query");
        final r rVar = new r() { // from class: m3.a
            @Override // vc.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return C5013e.o(query, (SQLiteDatabase) obj, (SQLiteCursorDriver) obj2, (String) obj3, (SQLiteQuery) obj4);
            }
        };
        Cursor cursorRawQueryWithFactory = this.f40169a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: m3.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return C5013e.q(rVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.a(), f40166d, null);
        AbstractC4862t.d(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // l3.InterfaceC4877c
    public boolean U0() {
        return this.f40169a.isWriteAheadLoggingEnabled();
    }

    @Override // l3.InterfaceC4877c
    public void V() {
        this.f40169a.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f40169a.close();
    }

    @Override // l3.InterfaceC4877c
    public String getPath() {
        return this.f40169a.getPath();
    }

    public void i(SQLiteTransactionListener transactionListener) {
        AbstractC4862t.e(transactionListener, "transactionListener");
        this.f40169a.beginTransactionWithListener(transactionListener);
    }

    @Override // l3.InterfaceC4877c
    public boolean isOpen() {
        return this.f40169a.isOpen();
    }

    public final void k(SQLiteTransactionListener sQLiteTransactionListener) throws IllegalAccessException, InvocationTargetException {
        a aVar = f40164b;
        if (aVar.c() == null || aVar.d() == null) {
            if (sQLiteTransactionListener != null) {
                i(sQLiteTransactionListener);
                return;
            } else {
                v();
                return;
            }
        }
        Method methodC = aVar.c();
        AbstractC4862t.b(methodC);
        Method methodD = aVar.d();
        AbstractC4862t.b(methodD);
        Object objInvoke = methodD.invoke(this.f40169a, null);
        if (objInvoke == null) {
            throw new IllegalStateException("Required value was null.");
        }
        methodC.invoke(objInvoke, 0, sQLiteTransactionListener, 0, null);
    }

    public final boolean m(SQLiteDatabase sqLiteDatabase) {
        AbstractC4862t.e(sqLiteDatabase, "sqLiteDatabase");
        return AbstractC4862t.a(this.f40169a, sqLiteDatabase);
    }

    @Override // l3.InterfaceC4877c
    public void r0(int i10) {
        this.f40169a.setVersion(i10);
    }

    @Override // l3.InterfaceC4877c
    public l3.g u0(String sql) {
        AbstractC4862t.e(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f40169a.compileStatement(sql);
        AbstractC4862t.d(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new C5019k(sQLiteStatementCompileStatement);
    }

    @Override // l3.InterfaceC4877c
    public void v() {
        this.f40169a.beginTransaction();
    }

    @Override // l3.InterfaceC4877c
    public List y() {
        return this.f40169a.getAttachedDbs();
    }

    @Override // l3.InterfaceC4877c
    public void y0() throws IllegalAccessException, InvocationTargetException {
        k(null);
    }

    @Override // l3.InterfaceC4877c
    public void z(String sql) {
        AbstractC4862t.e(sql, "sql");
        this.f40169a.execSQL(sql);
    }
}
