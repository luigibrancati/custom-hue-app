package m3;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import fc.C4029l;
import fc.C4032o;
import fc.InterfaceC4028k;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import l3.C4876b;
import l3.InterfaceC4877c;
import l3.InterfaceC4878d;
import m3.C5015g;
import o3.C5203a;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: m3.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5015g implements InterfaceC4878d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f40171h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4878d.a f40174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f40175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f40176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC4028k f40177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f40178g;

    /* JADX INFO: renamed from: m3.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: m3.g$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C5013e f40179a;

        public b(C5013e c5013e) {
            this.f40179a = c5013e;
        }

        public final C5013e a() {
            return this.f40179a;
        }

        public final void b(C5013e c5013e) {
            this.f40179a = c5013e;
        }
    }

    /* JADX INFO: renamed from: m3.g$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0528c f40180h = new C0528c(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f40181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f40182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC4878d.a f40183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f40184d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f40185e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final C5203a f40186f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f40187g;

        /* JADX INFO: renamed from: m3.g$c$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends RuntimeException {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f40188a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Throwable f40189b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b callbackName, Throwable cause) {
                super(cause);
                AbstractC4862t.e(callbackName, "callbackName");
                AbstractC4862t.e(cause, "cause");
                this.f40188a = callbackName;
                this.f40189b = cause;
            }

            public final b a() {
                return this.f40188a;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f40189b;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: m3.g$c$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b {
            private static final /* synthetic */ InterfaceC5276a $ENTRIES;
            private static final /* synthetic */ b[] $VALUES;
            public static final b ON_CONFIGURE = new b("ON_CONFIGURE", 0);
            public static final b ON_CREATE = new b("ON_CREATE", 1);
            public static final b ON_UPGRADE = new b("ON_UPGRADE", 2);
            public static final b ON_DOWNGRADE = new b("ON_DOWNGRADE", 3);
            public static final b ON_OPEN = new b("ON_OPEN", 4);

            static {
                b[] bVarArrA = a();
                $VALUES = bVarArrA;
                $ENTRIES = AbstractC5277b.a(bVarArrA);
            }

            public b(String str, int i10) {
            }

            public static final /* synthetic */ b[] a() {
                return new b[]{ON_CONFIGURE, ON_CREATE, ON_UPGRADE, ON_DOWNGRADE, ON_OPEN};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) $VALUES.clone();
            }
        }

        /* JADX INFO: renamed from: m3.g$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0528c {
            public /* synthetic */ C0528c(AbstractC4854k abstractC4854k) {
                this();
            }

            public final C5013e a(b refHolder, SQLiteDatabase sqLiteDatabase) {
                AbstractC4862t.e(refHolder, "refHolder");
                AbstractC4862t.e(sqLiteDatabase, "sqLiteDatabase");
                C5013e c5013eA = refHolder.a();
                if (c5013eA != null && c5013eA.m(sqLiteDatabase)) {
                    return c5013eA;
                }
                C5013e c5013e = new C5013e(sqLiteDatabase);
                refHolder.b(c5013e);
                return c5013e;
            }

            public C0528c() {
            }
        }

        /* JADX INFO: renamed from: m3.g$c$d */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public /* synthetic */ class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f40190a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f40190a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b dbRef, final InterfaceC4878d.a callback, boolean z10) {
            String string;
            super(context, str, null, callback.f39841a, new DatabaseErrorHandler() { // from class: m3.h
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    C5015g.c.b(callback, dbRef, sQLiteDatabase);
                }
            });
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(dbRef, "dbRef");
            AbstractC4862t.e(callback, "callback");
            this.f40181a = context;
            this.f40182b = dbRef;
            this.f40183c = callback;
            this.f40184d = z10;
            if (str == null) {
                string = UUID.randomUUID().toString();
                AbstractC4862t.d(string, "toString(...)");
            } else {
                string = str;
            }
            this.f40186f = new C5203a(string, context.getCacheDir(), false);
        }

        public static final void b(InterfaceC4878d.a aVar, b bVar, SQLiteDatabase sQLiteDatabase) {
            C0528c c0528c = f40180h;
            AbstractC4862t.b(sQLiteDatabase);
            aVar.c(c0528c.a(bVar, sQLiteDatabase));
        }

        public final InterfaceC4877c c(boolean z10) {
            InterfaceC4877c interfaceC4877cD;
            try {
                this.f40186f.b((this.f40187g || getDatabaseName() == null) ? false : true);
                this.f40185e = false;
                SQLiteDatabase sQLiteDatabaseG = g(z10);
                if (this.f40185e) {
                    close();
                    interfaceC4877cD = c(z10);
                } else {
                    interfaceC4877cD = d(sQLiteDatabaseG);
                }
                this.f40186f.d();
                return interfaceC4877cD;
            } catch (Throwable th) {
                this.f40186f.d();
                throw th;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                C5203a.c(this.f40186f, false, 1, null);
                super.close();
                this.f40182b.b(null);
                this.f40187g = false;
            } finally {
                this.f40186f.d();
            }
        }

        public final C5013e d(SQLiteDatabase sqLiteDatabase) {
            AbstractC4862t.e(sqLiteDatabase, "sqLiteDatabase");
            return f40180h.a(this.f40182b, sqLiteDatabase);
        }

        public final SQLiteDatabase f(boolean z10) {
            if (z10) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                AbstractC4862t.b(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            AbstractC4862t.b(readableDatabase);
            return readableDatabase;
        }

        public final SQLiteDatabase g(boolean z10) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z11 = this.f40187g;
            if (databaseName != null && !z11 && (parentFile = this.f40181a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return f(z10);
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return this.f(z10);
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof a) {
                        a aVar = (a) th;
                        Throwable cause = aVar.getCause();
                        int i10 = d.f40190a[aVar.a().ordinal()];
                        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                            throw cause;
                        }
                        if (i10 != 5) {
                            throw new C4032o();
                        }
                        if (!(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                        th = cause;
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.f40184d) {
                        throw th;
                    }
                    this.f40181a.deleteDatabase(databaseName);
                    try {
                        return this.f(z10);
                    } catch (a e10) {
                        throw e10.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db2) {
            AbstractC4862t.e(db2, "db");
            if (!this.f40185e && this.f40183c.f39841a != db2.getVersion()) {
                db2.setMaxSqlCacheSize(1);
            }
            try {
                this.f40183c.b(d(db2));
            } catch (Throwable th) {
                throw new a(b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            AbstractC4862t.e(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f40183c.d(d(sqLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db2, int i10, int i11) {
            AbstractC4862t.e(db2, "db");
            this.f40185e = true;
            try {
                this.f40183c.e(d(db2), i10, i11);
            } catch (Throwable th) {
                throw new a(b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db2) {
            AbstractC4862t.e(db2, "db");
            if (!this.f40185e) {
                try {
                    this.f40183c.f(d(db2));
                } catch (Throwable th) {
                    throw new a(b.ON_OPEN, th);
                }
            }
            this.f40187g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i10, int i11) {
            AbstractC4862t.e(sqLiteDatabase, "sqLiteDatabase");
            this.f40185e = true;
            try {
                this.f40183c.g(d(sqLiteDatabase), i10, i11);
            } catch (Throwable th) {
                throw new a(b.ON_UPGRADE, th);
            }
        }
    }

    public C5015g(Context context, String str, InterfaceC4878d.a callback, boolean z10, boolean z11) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(callback, "callback");
        this.f40172a = context;
        this.f40173b = str;
        this.f40174c = callback;
        this.f40175d = z10;
        this.f40176e = z11;
        this.f40177f = C4029l.b(new InterfaceC6082a() { // from class: m3.f
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C5015g.c(this.f40170a);
            }
        });
    }

    public static final c c(C5015g c5015g) {
        c cVar;
        if (c5015g.f40173b == null || !c5015g.f40175d) {
            cVar = new c(c5015g.f40172a, c5015g.f40173b, new b(null), c5015g.f40174c, c5015g.f40176e);
        } else {
            cVar = new c(c5015g.f40172a, new File(C4876b.a(c5015g.f40172a), c5015g.f40173b).getAbsolutePath(), new b(null), c5015g.f40174c, c5015g.f40176e);
        }
        cVar.setWriteAheadLoggingEnabled(c5015g.f40178g);
        return cVar;
    }

    @Override // l3.InterfaceC4878d
    public InterfaceC4877c E0() {
        return b().c(false);
    }

    @Override // l3.InterfaceC4878d
    public InterfaceC4877c F0() {
        return b().c(true);
    }

    public final c b() {
        return (c) this.f40177f.getValue();
    }

    @Override // l3.InterfaceC4878d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f40177f.isInitialized()) {
            b().close();
        }
    }

    @Override // l3.InterfaceC4878d
    public String getDatabaseName() {
        return this.f40173b;
    }

    @Override // l3.InterfaceC4878d
    public void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f40177f.isInitialized()) {
            b().setWriteAheadLoggingEnabled(z10);
        }
        this.f40178g = z10;
    }
}
