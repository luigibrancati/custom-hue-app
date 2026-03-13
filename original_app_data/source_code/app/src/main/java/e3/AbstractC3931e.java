package e3;

import Od.F;
import android.database.Cursor;
import fc.C4025h;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import k3.AbstractC4791a;
import k3.InterfaceC4794d;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4877c;
import l3.InterfaceC4879e;
import l3.InterfaceC4880f;
import l3.g;

/* JADX INFO: renamed from: e3.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3931e implements InterfaceC4794d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f33682d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4877c f33683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f33685c;

    /* JADX INFO: renamed from: e3.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final AbstractC3931e a(InterfaceC4877c db2, String sql) {
            AbstractC4862t.e(db2, "db");
            AbstractC4862t.e(sql, "sql");
            return b(sql) ? new b(db2, sql) : new c(db2, sql);
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

    /* JADX INFO: renamed from: e3.e$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC3931e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f33686k = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f33687e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long[] f33688f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public double[] f33689g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String[] f33690h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[][] f33691i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Cursor f33692j;

        /* JADX INFO: renamed from: e3.e$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {
            public /* synthetic */ a(AbstractC4854k abstractC4854k) {
                this();
            }

            public a() {
            }
        }

        /* JADX INFO: renamed from: e3.e$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0421b implements InterfaceC4880f {
            public C0421b() {
            }

            @Override // l3.InterfaceC4880f
            public String a() {
                return b.this.b();
            }

            @Override // l3.InterfaceC4880f
            public void b(InterfaceC4879e statement) {
                AbstractC4862t.e(statement, "statement");
                int length = b.this.f33687e.length;
                for (int i10 = 1; i10 < length; i10++) {
                    int i11 = b.this.f33687e[i10];
                    if (i11 == 1) {
                        statement.r(i10, b.this.f33688f[i10]);
                    } else if (i11 == 2) {
                        statement.I(i10, b.this.f33689g[i10]);
                    } else if (i11 == 3) {
                        String str = b.this.f33690h[i10];
                        AbstractC4862t.b(str);
                        statement.s0(i10, str);
                    } else if (i11 == 4) {
                        byte[] bArr = b.this.f33691i[i10];
                        AbstractC4862t.b(bArr);
                        statement.s(i10, bArr);
                    } else if (i11 == 5) {
                        statement.t(i10);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC4877c db2, String sql) {
            super(db2, sql, null);
            AbstractC4862t.e(db2, "db");
            AbstractC4862t.e(sql, "sql");
            this.f33687e = new int[0];
            this.f33688f = new long[0];
            this.f33689g = new double[0];
            this.f33690h = new String[0];
            this.f33691i = new byte[0][];
        }

        @Override // k3.InterfaceC4794d
        public String K0(int i10) {
            d();
            Cursor cursorU = u();
            q(cursorU, i10);
            String string = cursorU.getString(i10);
            AbstractC4862t.d(string, "getString(...)");
            return string;
        }

        @Override // k3.InterfaceC4794d
        public void N(int i10, String value) {
            AbstractC4862t.e(value, "value");
            d();
            m(3, i10);
            this.f33687e[i10] = 3;
            this.f33690h[i10] = value;
        }

        @Override // k3.InterfaceC4794d
        public boolean X0() {
            d();
            o();
            Cursor cursor = this.f33692j;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // k3.InterfaceC4794d, java.lang.AutoCloseable
        public void close() {
            if (!isClosed()) {
                k();
                reset();
            }
            c(true);
        }

        @Override // k3.InterfaceC4794d
        public byte[] getBlob(int i10) {
            d();
            Cursor cursorU = u();
            q(cursorU, i10);
            byte[] blob = cursorU.getBlob(i10);
            AbstractC4862t.d(blob, "getBlob(...)");
            return blob;
        }

        @Override // k3.InterfaceC4794d
        public int getColumnCount() {
            d();
            o();
            Cursor cursor = this.f33692j;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // k3.InterfaceC4794d
        public String getColumnName(int i10) {
            d();
            o();
            Cursor cursor = this.f33692j;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            q(cursor, i10);
            String columnName = cursor.getColumnName(i10);
            AbstractC4862t.d(columnName, "getColumnName(...)");
            return columnName;
        }

        @Override // k3.InterfaceC4794d
        public long getLong(int i10) {
            d();
            Cursor cursorU = u();
            q(cursorU, i10);
            return cursorU.getLong(i10);
        }

        @Override // k3.InterfaceC4794d
        public boolean isNull(int i10) {
            d();
            Cursor cursorU = u();
            q(cursorU, i10);
            return cursorU.isNull(i10);
        }

        public void k() {
            d();
            this.f33687e = new int[0];
            this.f33688f = new long[0];
            this.f33689g = new double[0];
            this.f33690h = new String[0];
            this.f33691i = new byte[0][];
        }

        public final void m(int i10, int i11) {
            int i12 = i11 + 1;
            int[] iArr = this.f33687e;
            if (iArr.length < i12) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
                AbstractC4862t.d(iArrCopyOf, "copyOf(...)");
                this.f33687e = iArrCopyOf;
            }
            if (i10 == 1) {
                long[] jArr = this.f33688f;
                if (jArr.length < i12) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i12);
                    AbstractC4862t.d(jArrCopyOf, "copyOf(...)");
                    this.f33688f = jArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                double[] dArr = this.f33689g;
                if (dArr.length < i12) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i12);
                    AbstractC4862t.d(dArrCopyOf, "copyOf(...)");
                    this.f33689g = dArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 == 3) {
                String[] strArr = this.f33690h;
                if (strArr.length < i12) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i12);
                    AbstractC4862t.d(objArrCopyOf, "copyOf(...)");
                    this.f33690h = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 != 4) {
                return;
            }
            byte[][] bArr = this.f33691i;
            if (bArr.length < i12) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i12);
                AbstractC4862t.d(objArrCopyOf2, "copyOf(...)");
                this.f33691i = (byte[][]) objArrCopyOf2;
            }
        }

        public final void o() {
            if (this.f33692j == null) {
                this.f33692j = a().T0(new C0421b());
            }
        }

        public final void q(Cursor cursor, int i10) {
            if (i10 < 0 || i10 >= cursor.getColumnCount()) {
                AbstractC4791a.b(25, "column index out of range");
                throw new C4025h();
            }
        }

        @Override // k3.InterfaceC4794d
        public void r(int i10, long j10) {
            d();
            m(1, i10);
            this.f33687e[i10] = 1;
            this.f33688f[i10] = j10;
        }

        @Override // k3.InterfaceC4794d
        public void reset() {
            d();
            Cursor cursor = this.f33692j;
            if (cursor != null) {
                cursor.close();
            }
            this.f33692j = null;
        }

        @Override // k3.InterfaceC4794d
        public void s(int i10, byte[] value) {
            AbstractC4862t.e(value, "value");
            d();
            m(4, i10);
            this.f33687e[i10] = 4;
            this.f33691i[i10] = value;
        }

        @Override // k3.InterfaceC4794d
        public void t(int i10) {
            d();
            m(5, i10);
            this.f33687e[i10] = 5;
        }

        public final Cursor u() {
            Cursor cursor = this.f33692j;
            if (cursor != null) {
                return cursor;
            }
            AbstractC4791a.b(21, "no row");
            throw new C4025h();
        }
    }

    public /* synthetic */ AbstractC3931e(InterfaceC4877c interfaceC4877c, String str, AbstractC4854k abstractC4854k) {
        this(interfaceC4877c, str);
    }

    public final InterfaceC4877c a() {
        return this.f33683a;
    }

    public final String b() {
        return this.f33684b;
    }

    public final void c(boolean z10) {
        this.f33685c = z10;
    }

    public final void d() {
        if (this.f33685c) {
            AbstractC4791a.b(21, "statement is closed");
            throw new C4025h();
        }
    }

    public final boolean isClosed() {
        return this.f33685c;
    }

    public AbstractC3931e(InterfaceC4877c interfaceC4877c, String str) {
        this.f33683a = interfaceC4877c;
        this.f33684b = str;
    }

    /* JADX INFO: renamed from: e3.e$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC3931e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final g f33694e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC4877c db2, String sql) {
            super(db2, sql, null);
            AbstractC4862t.e(db2, "db");
            AbstractC4862t.e(sql, "sql");
            this.f33694e = db2.u0(sql);
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
            this.f33694e.s0(i10, value);
        }

        @Override // k3.InterfaceC4794d
        public boolean X0() {
            d();
            this.f33694e.l();
            return false;
        }

        @Override // k3.InterfaceC4794d, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f33694e.close();
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
            this.f33694e.r(i10, j10);
        }

        @Override // k3.InterfaceC4794d
        public void s(int i10, byte[] value) {
            AbstractC4862t.e(value, "value");
            d();
            this.f33694e.s(i10, value);
        }

        @Override // k3.InterfaceC4794d
        public void t(int i10) {
            d();
            this.f33694e.t(i10);
        }

        @Override // k3.InterfaceC4794d
        public void reset() {
        }
    }
}
