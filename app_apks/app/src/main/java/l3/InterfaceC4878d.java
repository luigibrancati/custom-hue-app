package l3;

import Od.C;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: l3.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4878d extends Closeable {

    /* JADX INFO: renamed from: l3.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0521a f39840b = new C0521a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39841a;

        /* JADX INFO: renamed from: l3.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0521a {
            public /* synthetic */ C0521a(AbstractC4854k abstractC4854k) {
                this();
            }

            public C0521a() {
            }
        }

        public a(int i10) {
            this.f39841a = i10;
        }

        public final void a(String str) {
            if (C.E(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = AbstractC4862t.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void b(InterfaceC4877c db2) {
            AbstractC4862t.e(db2, "db");
        }

        public void c(InterfaceC4877c db2) {
            AbstractC4862t.e(db2, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db2 + ".path");
            if (!db2.isOpen()) {
                String path = db2.getPath();
                if (path != null) {
                    a(path);
                    return;
                }
                return;
            }
            List listY = null;
            try {
                try {
                    listY = db2.y();
                } finally {
                    if (listY != null) {
                        Iterator it = listY.iterator();
                        while (it.hasNext()) {
                            Object second = ((Pair) it.next()).second;
                            AbstractC4862t.d(second, "second");
                            a((String) second);
                        }
                    } else {
                        String path2 = db2.getPath();
                        if (path2 != null) {
                            a(path2);
                        }
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                db2.close();
            } catch (IOException unused2) {
            }
            if (listY != null) {
                return;
            }
        }

        public abstract void d(InterfaceC4877c interfaceC4877c);

        public void e(InterfaceC4877c db2, int i10, int i11) {
            AbstractC4862t.e(db2, "db");
            throw new SQLiteException("Can't downgrade database from version " + i10 + " to " + i11);
        }

        public abstract void f(InterfaceC4877c interfaceC4877c);

        public abstract void g(InterfaceC4877c interfaceC4877c, int i10, int i11);
    }

    /* JADX INFO: renamed from: l3.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C0522b f39842f = new C0522b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f39843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f39845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f39846d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f39847e;

        /* JADX INFO: renamed from: l3.d$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Context f39848a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f39849b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public a f39850c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f39851d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f39852e;

            public a(Context context) {
                AbstractC4862t.e(context, "context");
                this.f39848a = context;
            }

            public a a(boolean z10) {
                this.f39852e = z10;
                return this;
            }

            public b b() {
                String str;
                a aVar = this.f39850c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f39851d && ((str = this.f39849b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f39848a, this.f39849b, aVar, this.f39851d, this.f39852e);
            }

            public a c(a callback) {
                AbstractC4862t.e(callback, "callback");
                this.f39850c = callback;
                return this;
            }

            public a d(String str) {
                this.f39849b = str;
                return this;
            }

            public a e(boolean z10) {
                this.f39851d = z10;
                return this;
            }
        }

        /* JADX INFO: renamed from: l3.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0522b {
            public /* synthetic */ C0522b(AbstractC4854k abstractC4854k) {
                this();
            }

            public final a a(Context context) {
                AbstractC4862t.e(context, "context");
                return new a(context);
            }

            public C0522b() {
            }
        }

        public b(Context context, String str, a callback, boolean z10, boolean z11) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(callback, "callback");
            this.f39843a = context;
            this.f39844b = str;
            this.f39845c = callback;
            this.f39846d = z10;
            this.f39847e = z11;
        }
    }

    /* JADX INFO: renamed from: l3.d$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        InterfaceC4878d a(b bVar);
    }

    InterfaceC4877c E0();

    InterfaceC4877c F0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
