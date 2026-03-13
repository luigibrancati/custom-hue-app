package n3;

import Od.F;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import fc.C4025h;
import java.util.Arrays;
import java.util.Locale;
import k3.AbstractC4791a;
import k3.InterfaceC4794d;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import n3.AbstractC5083c;

/* JADX INFO: renamed from: n3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5083c implements InterfaceC4794d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f40539d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f40540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40542c;

    /* JADX INFO: renamed from: n3.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final AbstractC5083c a(SQLiteDatabase db2, String sql) {
            AbstractC4862t.e(db2, "db");
            AbstractC4862t.e(sql, "sql");
            return b(sql) ? new C0535c(db2, sql) : new b(db2, sql);
        }

        public final boolean b(String str) {
            String string = F.e1(str).toString();
            if (string.length() < 3) {
                return false;
            }
            String strSubstring = string.substring(0, 3);
            AbstractC4862t.d(strSubstring, "substring(...)");
            String upperCase = strSubstring.toUpperCase(Locale.ROOT);
            AbstractC4862t.d(upperCase, "toUpperCase(...)");
            int iHashCode = upperCase.hashCode();
            if (iHashCode != 79487) {
                if (iHashCode != 81978) {
                    if (iHashCode == 85954 && upperCase.equals("WIT")) {
                        return true;
                    }
                } else if (upperCase.equals("SEL")) {
                    return true;
                }
            } else if (upperCase.equals("PRA")) {
                return true;
            }
            return false;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: n3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0535c extends AbstractC5083c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f40544k = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f40545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long[] f40546f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public double[] f40547g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String[] f40548h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[][] f40549i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Cursor f40550j;

        /* JADX INFO: renamed from: n3.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {
            public /* synthetic */ a(AbstractC4854k abstractC4854k) {
                this();
            }

            public a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0535c(SQLiteDatabase db2, String sql) {
            super(db2, sql, null);
            AbstractC4862t.e(db2, "db");
            AbstractC4862t.e(sql, "sql");
            this.f40545e = new int[0];
            this.f40546f = new long[0];
            this.f40547g = new double[0];
            this.f40548h = new String[0];
            this.f40549i = new byte[0][];
        }

        private final void h(int i10, int i11) {
            int i12 = i11 + 1;
            int[] iArr = this.f40545e;
            if (iArr.length < i12) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
                AbstractC4862t.d(iArrCopyOf, "copyOf(...)");
                this.f40545e = iArrCopyOf;
            }
            if (i10 == 1) {
                long[] jArr = this.f40546f;
                if (jArr.length < i12) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i12);
                    AbstractC4862t.d(jArrCopyOf, "copyOf(...)");
                    this.f40546f = jArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                double[] dArr = this.f40547g;
                if (dArr.length < i12) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i12);
                    AbstractC4862t.d(dArrCopyOf, "copyOf(...)");
                    this.f40547g = dArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 == 3) {
                String[] strArr = this.f40548h;
                if (strArr.length < i12) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i12);
                    AbstractC4862t.d(objArrCopyOf, "copyOf(...)");
                    this.f40548h = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 != 4) {
                return;
            }
            byte[][] bArr = this.f40549i;
            if (bArr.length < i12) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i12);
                AbstractC4862t.d(objArrCopyOf2, "copyOf(...)");
                this.f40549i = (byte[][]) objArrCopyOf2;
            }
        }

        private final void i() {
            if (this.f40550j == null) {
                this.f40550j = a().rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: n3.d
                    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                        return AbstractC5083c.C0535c.j(this.f40551a, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                    }
                }, b(), new String[0], null);
            }
        }

        public static final Cursor j(C0535c c0535c, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            AbstractC4862t.b(sQLiteQuery);
            c0535c.g(sQLiteQuery);
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }

        private final void k(Cursor cursor, int i10) {
            if (i10 < 0 || i10 >= cursor.getColumnCount()) {
                AbstractC4791a.b(25, "column index out of range");
                throw new C4025h();
            }
        }

        private final Cursor m() {
            Cursor cursor = this.f40550j;
            if (cursor != null) {
                return cursor;
            }
            AbstractC4791a.b(21, "no row");
            throw new C4025h();
        }

        @Override // k3.InterfaceC4794d
        public String K0(int i10) {
            d();
            Cursor cursorM = m();
            k(cursorM, i10);
            String string = cursorM.getString(i10);
            AbstractC4862t.d(string, "getString(...)");
            return string;
        }

        @Override // k3.InterfaceC4794d
        public void N(int i10, String value) {
            AbstractC4862t.e(value, "value");
            d();
            h(3, i10);
            this.f40545e[i10] = 3;
            this.f40548h[i10] = value;
        }

        @Override // k3.InterfaceC4794d
        public boolean X0() {
            d();
            i();
            Cursor cursor = this.f40550j;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // k3.InterfaceC4794d, java.lang.AutoCloseable
        public void close() {
            if (!isClosed()) {
                reset();
            }
            c(true);
        }

        public final void g(SQLiteProgram sQLiteProgram) {
            int length = this.f40545e.length;
            for (int i10 = 1; i10 < length; i10++) {
                int i11 = this.f40545e[i10];
                if (i11 == 1) {
                    sQLiteProgram.bindLong(i10, this.f40546f[i10]);
                } else if (i11 == 2) {
                    sQLiteProgram.bindDouble(i10, this.f40547g[i10]);
                } else if (i11 == 3) {
                    sQLiteProgram.bindString(i10, this.f40548h[i10]);
                } else if (i11 == 4) {
                    sQLiteProgram.bindBlob(i10, this.f40549i[i10]);
                } else if (i11 == 5) {
                    sQLiteProgram.bindNull(i10);
                }
            }
        }

        @Override // k3.InterfaceC4794d
        public byte[] getBlob(int i10) {
            d();
            Cursor cursorM = m();
            k(cursorM, i10);
            byte[] blob = cursorM.getBlob(i10);
            AbstractC4862t.d(blob, "getBlob(...)");
            return blob;
        }

        @Override // k3.InterfaceC4794d
        public int getColumnCount() {
            d();
            i();
            Cursor cursor = this.f40550j;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // k3.InterfaceC4794d
        public String getColumnName(int i10) {
            d();
            i();
            Cursor cursor = this.f40550j;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            k(cursor, i10);
            String columnName = cursor.getColumnName(i10);
            AbstractC4862t.d(columnName, "getColumnName(...)");
            return columnName;
        }

        @Override // k3.InterfaceC4794d
        public long getLong(int i10) {
            d();
            Cursor cursorM = m();
            k(cursorM, i10);
            return cursorM.getLong(i10);
        }

        @Override // k3.InterfaceC4794d
        public boolean isNull(int i10) {
            d();
            Cursor cursorM = m();
            k(cursorM, i10);
            return cursorM.isNull(i10);
        }

        @Override // k3.InterfaceC4794d
        public void r(int i10, long j10) {
            d();
            h(1, i10);
            this.f40545e[i10] = 1;
            this.f40546f[i10] = j10;
        }

        @Override // k3.InterfaceC4794d
        public void reset() {
            d();
            Cursor cursor = this.f40550j;
            if (cursor != null) {
                cursor.close();
            }
            this.f40550j = null;
        }

        @Override // k3.InterfaceC4794d
        public void s(int i10, byte[] value) {
            AbstractC4862t.e(value, "value");
            d();
            h(4, i10);
            this.f40545e[i10] = 4;
            this.f40549i[i10] = value;
        }

        @Override // k3.InterfaceC4794d
        public void t(int i10) {
            d();
            h(5, i10);
            this.f40545e[i10] = 5;
        }
    }

    public /* synthetic */ AbstractC5083c(SQLiteDatabase sQLiteDatabase, String str, AbstractC4854k abstractC4854k) {
        this(sQLiteDatabase, str);
    }

    public final SQLiteDatabase a() {
        return this.f40540a;
    }

    public final String b() {
        return this.f40541b;
    }

    public final void c(boolean z10) {
        this.f40542c = z10;
    }

    public final void d() {
        if (this.f40542c) {
            AbstractC4791a.b(21, "statement is closed");
            throw new C4025h();
        }
    }

    public final boolean isClosed() {
        return this.f40542c;
    }

    public AbstractC5083c(SQLiteDatabase sQLiteDatabase, String str) {
        this.f40540a = sQLiteDatabase;
        this.f40541b = str;
    }

    /* JADX INFO: renamed from: n3.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5083c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SQLiteStatement f40543e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SQLiteDatabase db2, String sql) {
            super(db2, sql, null);
            AbstractC4862t.e(db2, "db");
            AbstractC4862t.e(sql, "sql");
            SQLiteStatement sQLiteStatementCompileStatement = db2.compileStatement(sql);
            AbstractC4862t.d(sQLiteStatementCompileStatement, "compileStatement(...)");
            this.f40543e = sQLiteStatementCompileStatement;
        }

        @Override // k3.InterfaceC4794d
        public String K0(int i10) {
            d();
            AbstractC4791a.b(21, "no row");
            throw new C4025h();
        }

        @Override // k3.InterfaceC4794d
        public void N(int i10, String value) {
            AbstractC4862t.e(value, "value");
            d();
            this.f40543e.bindString(i10, value);
        }

        @Override // k3.InterfaceC4794d
        public boolean X0() {
            d();
            this.f40543e.execute();
            return false;
        }

        @Override // k3.InterfaceC4794d, java.lang.AutoCloseable
        public void close() {
            this.f40543e.close();
            c(true);
        }

        @Override // k3.InterfaceC4794d
        public byte[] getBlob(int i10) {
            d();
            AbstractC4791a.b(21, "no row");
            throw new C4025h();
        }

        @Override // k3.InterfaceC4794d
        public int getColumnCount() {
            d();
            return 0;
        }

        @Override // k3.InterfaceC4794d
        public String getColumnName(int i10) {
            d();
            AbstractC4791a.b(21, "no row");
            throw new C4025h();
        }

        @Override // k3.InterfaceC4794d
        public long getLong(int i10) {
            d();
            AbstractC4791a.b(21, "no row");
            throw new C4025h();
        }

        @Override // k3.InterfaceC4794d
        public boolean isNull(int i10) {
            d();
            AbstractC4791a.b(21, "no row");
            throw new C4025h();
        }

        @Override // k3.InterfaceC4794d
        public void r(int i10, long j10) {
            d();
            this.f40543e.bindLong(i10, j10);
        }

        @Override // k3.InterfaceC4794d
        public void s(int i10, byte[] value) {
            AbstractC4862t.e(value, "value");
            d();
            this.f40543e.bindBlob(i10, value);
        }

        @Override // k3.InterfaceC4794d
        public void t(int i10) {
            d();
            this.f40543e.bindNull(i10);
        }

        @Override // k3.InterfaceC4794d
        public void reset() {
        }
    }
}
