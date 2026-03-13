package g3;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import b3.InterfaceC2805d;
import fc.C4015H;
import g3.C4138h;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.E;
import l3.InterfaceC4877c;
import l3.InterfaceC4878d;
import l3.InterfaceC4879e;
import l3.InterfaceC4880f;

/* JADX INFO: renamed from: g3.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4138h implements InterfaceC4878d, InterfaceC2805d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4878d f35403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4132b f35404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f35405c;

    /* JADX INFO: renamed from: g3.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC4877c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C4132b f35406a;

        /* JADX INFO: renamed from: g3.h$a$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public /* synthetic */ class b extends AbstractC4860q implements vc.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f35408a = new b();

            public b() {
                super(1, InterfaceC4877c.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // vc.l
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(InterfaceC4877c p02) {
                AbstractC4862t.e(p02, "p0");
                return Boolean.valueOf(p02.R0());
            }
        }

        public a(C4132b autoCloser) {
            AbstractC4862t.e(autoCloser, "autoCloser");
            this.f35406a = autoCloser;
        }

        public static final C4015H g(int i10, InterfaceC4877c db2) {
            AbstractC4862t.e(db2, "db");
            db2.r0(i10);
            return C4015H.f34254a;
        }

        public static final C4015H h(String str, InterfaceC4877c db2) {
            AbstractC4862t.e(db2, "db");
            db2.z(str);
            return C4015H.f34254a;
        }

        public static final C4015H i(String str, Object[] objArr, InterfaceC4877c db2) {
            AbstractC4862t.e(db2, "db");
            db2.Q(str, objArr);
            return C4015H.f34254a;
        }

        public static final Object k(InterfaceC4877c it) {
            AbstractC4862t.e(it, "it");
            return null;
        }

        public static final int m(String str, int i10, ContentValues contentValues, String str2, Object[] objArr, InterfaceC4877c db2) {
            AbstractC4862t.e(db2, "db");
            return db2.D0(str, i10, contentValues, str2, objArr);
        }

        @Override // l3.InterfaceC4877c
        public int D0(final String table, final int i10, final ContentValues values, final String str, final Object[] objArr) {
            AbstractC4862t.e(table, "table");
            AbstractC4862t.e(values, "values");
            return ((Number) this.f35406a.h(new vc.l() { // from class: g3.e
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return Integer.valueOf(C4138h.a.m(table, i10, values, str, objArr, (InterfaceC4877c) obj));
                }
            })).intValue();
        }

        @Override // l3.InterfaceC4877c
        public void P() {
            InterfaceC4877c interfaceC4877cI = this.f35406a.i();
            AbstractC4862t.b(interfaceC4877cI);
            interfaceC4877cI.P();
        }

        @Override // l3.InterfaceC4877c
        public void Q(final String sql, final Object[] bindArgs) {
            AbstractC4862t.e(sql, "sql");
            AbstractC4862t.e(bindArgs, "bindArgs");
            this.f35406a.h(new vc.l() { // from class: g3.g
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return C4138h.a.i(sql, bindArgs, (InterfaceC4877c) obj);
                }
            });
        }

        @Override // l3.InterfaceC4877c
        public void R() {
            try {
                this.f35406a.j().R();
            } catch (Throwable th) {
                this.f35406a.g();
                throw th;
            }
        }

        @Override // l3.InterfaceC4877c
        public boolean R0() {
            if (this.f35406a.i() == null) {
                return false;
            }
            return ((Boolean) this.f35406a.h(b.f35408a)).booleanValue();
        }

        @Override // l3.InterfaceC4877c
        public Cursor T0(InterfaceC4880f query) {
            AbstractC4862t.e(query, "query");
            try {
                return new c(this.f35406a.j().T0(query), this.f35406a);
            } catch (Throwable th) {
                this.f35406a.g();
                throw th;
            }
        }

        @Override // l3.InterfaceC4877c
        public boolean U0() {
            return ((Boolean) this.f35406a.h(new E() { // from class: g3.h.a.c
                @Override // kotlin.jvm.internal.E, Cc.n
                public Object get(Object obj) {
                    return Boolean.valueOf(((InterfaceC4877c) obj).U0());
                }
            })).booleanValue();
        }

        @Override // l3.InterfaceC4877c
        public void V() {
            try {
                InterfaceC4877c interfaceC4877cI = this.f35406a.i();
                AbstractC4862t.b(interfaceC4877cI);
                interfaceC4877cI.V();
            } finally {
                this.f35406a.g();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f35406a.f();
        }

        @Override // l3.InterfaceC4877c
        public String getPath() {
            return (String) this.f35406a.h(new E() { // from class: g3.h.a.d
                @Override // kotlin.jvm.internal.E, Cc.n
                public Object get(Object obj) {
                    return ((InterfaceC4877c) obj).getPath();
                }
            });
        }

        @Override // l3.InterfaceC4877c
        public boolean isOpen() {
            InterfaceC4877c interfaceC4877cI = this.f35406a.i();
            if (interfaceC4877cI != null) {
                return interfaceC4877cI.isOpen();
            }
            return false;
        }

        public final void j() {
            this.f35406a.h(new vc.l() { // from class: g3.c
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return C4138h.a.k((InterfaceC4877c) obj);
                }
            });
        }

        @Override // l3.InterfaceC4877c
        public void r0(final int i10) {
            this.f35406a.h(new vc.l() { // from class: g3.d
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return C4138h.a.g(i10, (InterfaceC4877c) obj);
                }
            });
        }

        @Override // l3.InterfaceC4877c
        public l3.g u0(String sql) {
            AbstractC4862t.e(sql, "sql");
            return new b(sql, this.f35406a);
        }

        @Override // l3.InterfaceC4877c
        public void v() {
            try {
                this.f35406a.j().v();
            } catch (Throwable th) {
                this.f35406a.g();
                throw th;
            }
        }

        @Override // l3.InterfaceC4877c
        public List y() {
            return (List) this.f35406a.h(new E() { // from class: g3.h.a.a
                @Override // kotlin.jvm.internal.E, Cc.n
                public Object get(Object obj) {
                    return ((InterfaceC4877c) obj).y();
                }
            });
        }

        @Override // l3.InterfaceC4877c
        public void z(final String sql) {
            AbstractC4862t.e(sql, "sql");
            this.f35406a.h(new vc.l() { // from class: g3.f
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return C4138h.a.h(sql, (InterfaceC4877c) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g3.h$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements l3.g {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f35411h = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C4132b f35413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f35414c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long[] f35415d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double[] f35416e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String[] f35417f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[][] f35418g;

        /* JADX INFO: renamed from: g3.h$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {
            public /* synthetic */ a(AbstractC4854k abstractC4854k) {
                this();
            }

            public a() {
            }
        }

        public b(String sql, C4132b autoCloser) {
            AbstractC4862t.e(sql, "sql");
            AbstractC4862t.e(autoCloser, "autoCloser");
            this.f35412a = sql;
            this.f35413b = autoCloser;
            this.f35414c = new int[0];
            this.f35415d = new long[0];
            this.f35416e = new double[0];
            this.f35417f = new String[0];
            this.f35418g = new byte[0][];
        }

        public static final C4015H h(l3.g statement) {
            AbstractC4862t.e(statement, "statement");
            statement.l();
            return C4015H.f34254a;
        }

        public static final int i(l3.g obj) {
            AbstractC4862t.e(obj, "obj");
            return obj.E();
        }

        public static final Object k(b bVar, vc.l lVar, InterfaceC4877c db2) {
            AbstractC4862t.e(db2, "db");
            l3.g gVarU0 = db2.u0(bVar.f35412a);
            bVar.d(gVarU0);
            return lVar.invoke(gVarU0);
        }

        @Override // l3.g
        public int E() {
            return ((Number) j(new vc.l() { // from class: g3.j
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return Integer.valueOf(C4138h.b.i((l3.g) obj));
                }
            })).intValue();
        }

        @Override // l3.InterfaceC4879e
        public void I(int i10, double d10) {
            g(2, i10);
            this.f35414c[i10] = 2;
            this.f35416e[i10] = d10;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            f();
        }

        public final void d(InterfaceC4879e interfaceC4879e) {
            int length = this.f35414c.length;
            for (int i10 = 1; i10 < length; i10++) {
                int i11 = this.f35414c[i10];
                if (i11 == 1) {
                    interfaceC4879e.r(i10, this.f35415d[i10]);
                } else if (i11 == 2) {
                    interfaceC4879e.I(i10, this.f35416e[i10]);
                } else if (i11 == 3) {
                    String str = this.f35417f[i10];
                    AbstractC4862t.b(str);
                    interfaceC4879e.s0(i10, str);
                } else if (i11 == 4) {
                    byte[] bArr = this.f35418g[i10];
                    AbstractC4862t.b(bArr);
                    interfaceC4879e.s(i10, bArr);
                } else if (i11 == 5) {
                    interfaceC4879e.t(i10);
                }
            }
        }

        public void f() {
            this.f35414c = new int[0];
            this.f35415d = new long[0];
            this.f35416e = new double[0];
            this.f35417f = new String[0];
            this.f35418g = new byte[0][];
        }

        public final void g(int i10, int i11) {
            int i12 = i11 + 1;
            int[] iArr = this.f35414c;
            if (iArr.length < i12) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
                AbstractC4862t.d(iArrCopyOf, "copyOf(...)");
                this.f35414c = iArrCopyOf;
            }
            if (i10 == 1) {
                long[] jArr = this.f35415d;
                if (jArr.length < i12) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i12);
                    AbstractC4862t.d(jArrCopyOf, "copyOf(...)");
                    this.f35415d = jArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                double[] dArr = this.f35416e;
                if (dArr.length < i12) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i12);
                    AbstractC4862t.d(dArrCopyOf, "copyOf(...)");
                    this.f35416e = dArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 == 3) {
                String[] strArr = this.f35417f;
                if (strArr.length < i12) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i12);
                    AbstractC4862t.d(objArrCopyOf, "copyOf(...)");
                    this.f35417f = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 != 4) {
                return;
            }
            byte[][] bArr = this.f35418g;
            if (bArr.length < i12) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i12);
                AbstractC4862t.d(objArrCopyOf2, "copyOf(...)");
                this.f35418g = (byte[][]) objArrCopyOf2;
            }
        }

        public final Object j(final vc.l lVar) {
            return this.f35413b.h(new vc.l() { // from class: g3.k
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return C4138h.b.k(this.f35421a, lVar, (InterfaceC4877c) obj);
                }
            });
        }

        @Override // l3.g
        public void l() {
            j(new vc.l() { // from class: g3.i
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return C4138h.b.h((l3.g) obj);
                }
            });
        }

        @Override // l3.InterfaceC4879e
        public void r(int i10, long j10) {
            g(1, i10);
            this.f35414c[i10] = 1;
            this.f35415d[i10] = j10;
        }

        @Override // l3.InterfaceC4879e
        public void s(int i10, byte[] value) {
            AbstractC4862t.e(value, "value");
            g(4, i10);
            this.f35414c[i10] = 4;
            this.f35418g[i10] = value;
        }

        @Override // l3.InterfaceC4879e
        public void s0(int i10, String value) {
            AbstractC4862t.e(value, "value");
            g(3, i10);
            this.f35414c[i10] = 3;
            this.f35417f[i10] = value;
        }

        @Override // l3.InterfaceC4879e
        public void t(int i10) {
            g(5, i10);
            this.f35414c[i10] = 5;
        }
    }

    /* JADX INFO: renamed from: g3.h$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements Cursor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Cursor f35419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C4132b f35420b;

        public c(Cursor delegate, C4132b autoCloser) {
            AbstractC4862t.e(delegate, "delegate");
            AbstractC4862t.e(autoCloser, "autoCloser");
            this.f35419a = delegate;
            this.f35420b = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f35419a.close();
            this.f35420b.g();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f35419a.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f35419a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i10) {
            return this.f35419a.getBlob(i10);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f35419a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f35419a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f35419a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i10) {
            return this.f35419a.getColumnName(i10);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f35419a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f35419a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i10) {
            return this.f35419a.getDouble(i10);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f35419a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i10) {
            return this.f35419a.getFloat(i10);
        }

        @Override // android.database.Cursor
        public int getInt(int i10) {
            return this.f35419a.getInt(i10);
        }

        @Override // android.database.Cursor
        public long getLong(int i10) {
            return this.f35419a.getLong(i10);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return this.f35419a.getNotificationUri();
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f35419a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i10) {
            return this.f35419a.getShort(i10);
        }

        @Override // android.database.Cursor
        public String getString(int i10) {
            return this.f35419a.getString(i10);
        }

        @Override // android.database.Cursor
        public int getType(int i10) {
            return this.f35419a.getType(i10);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f35419a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f35419a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f35419a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f35419a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f35419a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f35419a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i10) {
            return this.f35419a.isNull(i10);
        }

        @Override // android.database.Cursor
        public boolean move(int i10) {
            return this.f35419a.move(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f35419a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f35419a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f35419a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i10) {
            return this.f35419a.moveToPosition(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f35419a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f35419a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f35419a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f35419a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f35419a.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle bundle) {
            this.f35419a.setExtras(bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f35419a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f35419a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f35419a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public C4138h(InterfaceC4878d delegate, C4132b autoCloser) {
        AbstractC4862t.e(delegate, "delegate");
        AbstractC4862t.e(autoCloser, "autoCloser");
        this.f35403a = delegate;
        this.f35404b = autoCloser;
        this.f35405c = new a(autoCloser);
        autoCloser.l(a());
    }

    @Override // l3.InterfaceC4878d
    public InterfaceC4877c E0() {
        this.f35405c.j();
        return this.f35405c;
    }

    @Override // l3.InterfaceC4878d
    public InterfaceC4877c F0() {
        this.f35405c.j();
        return this.f35405c;
    }

    @Override // b3.InterfaceC2805d
    public InterfaceC4878d a() {
        return this.f35403a;
    }

    public final C4132b b() {
        return this.f35404b;
    }

    @Override // l3.InterfaceC4878d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f35405c.close();
    }

    @Override // l3.InterfaceC4878d
    public String getDatabaseName() {
        return this.f35403a.getDatabaseName();
    }

    @Override // l3.InterfaceC4878d
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f35403a.setWriteAheadLoggingEnabled(z10);
    }
}
