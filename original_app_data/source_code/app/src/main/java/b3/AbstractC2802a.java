package b3;

import b3.AbstractC2802a;
import b3.t;
import b3.x;
import c3.C2940b;
import f3.AbstractC3989b;
import fc.AbstractC4036s;
import fc.AbstractC4040w;
import fc.C4015H;
import fc.C4034q;
import fc.C4035r;
import gc.C4205s;
import java.util.Iterator;
import java.util.List;
import k3.AbstractC4791a;
import k3.InterfaceC4792b;
import k3.InterfaceC4793c;
import k3.InterfaceC4794d;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import tc.AbstractC5877a;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: b3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2802a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0326a f25145c = new C0326a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25147b;

    /* JADX INFO: renamed from: b3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0326a {
        public /* synthetic */ C0326a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0326a() {
        }
    }

    /* JADX INFO: renamed from: b3.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b implements InterfaceC4793c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC4793c f25148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC2802a f25149b;

        /* JADX INFO: renamed from: b3.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0327a implements vc.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f25150a;

            public C0327a(String str) {
                this.f25150a = str;
            }

            @Override // vc.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(Throwable error) {
                AbstractC4862t.e(error, "error");
                throw new IllegalStateException("Unable to open database '" + this.f25150a + "'. Was a proper path / name used in Room's database builder?", error);
            }
        }

        public b(AbstractC2802a abstractC2802a, InterfaceC4793c actual) {
            AbstractC4862t.e(actual, "actual");
            this.f25149b = abstractC2802a;
            this.f25148a = actual;
        }

        public static final InterfaceC4792b d(AbstractC2802a abstractC2802a, b bVar, String str) throws Exception {
            if (abstractC2802a.f25147b) {
                throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
            }
            InterfaceC4792b interfaceC4792bA = bVar.f25148a.a(str);
            if (abstractC2802a.f25146a) {
                abstractC2802a.g(interfaceC4792bA);
                return interfaceC4792bA;
            }
            try {
                abstractC2802a.f25147b = true;
                abstractC2802a.i(interfaceC4792bA);
                return interfaceC4792bA;
            } finally {
                abstractC2802a.f25147b = false;
            }
        }

        @Override // k3.InterfaceC4793c
        public InterfaceC4792b a(String fileName) {
            AbstractC4862t.e(fileName, "fileName");
            return c(this.f25149b.A(fileName));
        }

        public final InterfaceC4792b c(final String str) {
            C2940b c2940b = new C2940b(str, (this.f25149b.f25146a || this.f25149b.f25147b || AbstractC4862t.a(str, ":memory:")) ? false : true);
            final AbstractC2802a abstractC2802a = this.f25149b;
            return (InterfaceC4792b) c2940b.b(new InterfaceC6082a() { // from class: b3.b
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return AbstractC2802a.b.d(abstractC2802a, this, str);
                }
            }, new C0327a(str));
        }
    }

    /* JADX INFO: renamed from: b3.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25151a;

        static {
            int[] iArr = new int[t.d.values().length];
            try {
                iArr[t.d.TRUNCATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.d.WRITE_AHEAD_LOGGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25151a = iArr;
        }
    }

    public String A(String fileName) {
        AbstractC4862t.e(fileName, "fileName");
        return fileName;
    }

    public final void B(InterfaceC4792b interfaceC4792b) throws Exception {
        l(interfaceC4792b);
        AbstractC4791a.a(interfaceC4792b, w.a(r().c()));
    }

    public final void f(InterfaceC4792b interfaceC4792b) throws Exception {
        Object objB;
        x.a aVarJ;
        if (t(interfaceC4792b)) {
            InterfaceC4794d interfaceC4794dA1 = interfaceC4792b.a1("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
            try {
                String strK0 = interfaceC4794dA1.X0() ? interfaceC4794dA1.K0(0) : null;
                AbstractC5877a.a(interfaceC4794dA1, null);
                if (AbstractC4862t.a(r().c(), strK0) || AbstractC4862t.a(r().d(), strK0)) {
                    return;
                }
                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + r().c() + ", found: " + strK0).toString());
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC5877a.a(interfaceC4794dA1, th);
                    throw th2;
                }
            }
        }
        AbstractC4791a.a(interfaceC4792b, "BEGIN EXCLUSIVE TRANSACTION");
        try {
            C4035r.a aVar = C4035r.f34274b;
            aVarJ = r().j(interfaceC4792b);
        } catch (Throwable th3) {
            C4035r.a aVar2 = C4035r.f34274b;
            objB = C4035r.b(AbstractC4036s.a(th3));
        }
        if (!aVarJ.f25250a) {
            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarJ.f25251b).toString());
        }
        r().h(interfaceC4792b);
        B(interfaceC4792b);
        objB = C4035r.b(C4015H.f34254a);
        if (C4035r.h(objB)) {
            AbstractC4791a.a(interfaceC4792b, "END TRANSACTION");
        }
        Throwable thE = C4035r.e(objB);
        if (thE == null) {
            C4035r.a(objB);
        } else {
            AbstractC4791a.a(interfaceC4792b, "ROLLBACK TRANSACTION");
            throw thE;
        }
    }

    public final void g(InterfaceC4792b interfaceC4792b) throws Exception {
        k(interfaceC4792b);
        h(interfaceC4792b);
        r().g(interfaceC4792b);
    }

    public final void h(InterfaceC4792b interfaceC4792b) throws Exception {
        InterfaceC4794d interfaceC4794dA1 = interfaceC4792b.a1("PRAGMA busy_timeout");
        try {
            interfaceC4794dA1.X0();
            long j10 = interfaceC4794dA1.getLong(0);
            AbstractC5877a.a(interfaceC4794dA1, null);
            if (j10 < 3000) {
                AbstractC4791a.a(interfaceC4792b, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC5877a.a(interfaceC4794dA1, th);
                throw th2;
            }
        }
    }

    public final void i(InterfaceC4792b interfaceC4792b) throws Exception {
        Object objB;
        j(interfaceC4792b);
        k(interfaceC4792b);
        h(interfaceC4792b);
        InterfaceC4794d interfaceC4794dA1 = interfaceC4792b.a1("PRAGMA user_version");
        try {
            interfaceC4794dA1.X0();
            int i10 = (int) interfaceC4794dA1.getLong(0);
            AbstractC5877a.a(interfaceC4794dA1, null);
            if (i10 != r().e()) {
                AbstractC4791a.a(interfaceC4792b, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    C4035r.a aVar = C4035r.f34274b;
                    if (i10 == 0) {
                        x(interfaceC4792b);
                    } else {
                        y(interfaceC4792b, i10, r().e());
                    }
                    AbstractC4791a.a(interfaceC4792b, "PRAGMA user_version = " + r().e());
                    objB = C4035r.b(C4015H.f34254a);
                } catch (Throwable th) {
                    C4035r.a aVar2 = C4035r.f34274b;
                    objB = C4035r.b(AbstractC4036s.a(th));
                }
                if (C4035r.h(objB)) {
                    AbstractC4791a.a(interfaceC4792b, "END TRANSACTION");
                }
                Throwable thE = C4035r.e(objB);
                if (thE != null) {
                    AbstractC4791a.a(interfaceC4792b, "ROLLBACK TRANSACTION");
                    throw thE;
                }
            }
            z(interfaceC4792b);
        } finally {
        }
    }

    public final void j(InterfaceC4792b interfaceC4792b) throws Exception {
        if (o().f25161g == t.d.WRITE_AHEAD_LOGGING) {
            AbstractC4791a.a(interfaceC4792b, "PRAGMA journal_mode = WAL");
        } else {
            AbstractC4791a.a(interfaceC4792b, "PRAGMA journal_mode = TRUNCATE");
        }
    }

    public final void k(InterfaceC4792b interfaceC4792b) throws Exception {
        if (o().f25161g == t.d.WRITE_AHEAD_LOGGING) {
            AbstractC4791a.a(interfaceC4792b, "PRAGMA synchronous = NORMAL");
        } else {
            AbstractC4791a.a(interfaceC4792b, "PRAGMA synchronous = FULL");
        }
    }

    public final void l(InterfaceC4792b interfaceC4792b) throws Exception {
        AbstractC4791a.a(interfaceC4792b, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    public final void m(InterfaceC4792b interfaceC4792b) throws Exception {
        if (!o().f25174t) {
            r().b(interfaceC4792b);
            return;
        }
        InterfaceC4794d interfaceC4794dA1 = interfaceC4792b.a1("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
        try {
            List listC = C4205s.c();
            while (interfaceC4794dA1.X0()) {
                String strK0 = interfaceC4794dA1.K0(0);
                if (!Od.C.P(strK0, "sqlite_", false, 2, null) && !AbstractC4862t.a(strK0, "android_metadata")) {
                    listC.add(AbstractC4040w.a(strK0, Boolean.valueOf(AbstractC4862t.a(interfaceC4794dA1.K0(1), "view"))));
                }
            }
            List<C4034q> listA = C4205s.a(listC);
            AbstractC5877a.a(interfaceC4794dA1, null);
            for (C4034q c4034q : listA) {
                String str = (String) c4034q.a();
                if (((Boolean) c4034q.b()).booleanValue()) {
                    AbstractC4791a.a(interfaceC4792b, "DROP VIEW IF EXISTS " + str);
                } else {
                    AbstractC4791a.a(interfaceC4792b, "DROP TABLE IF EXISTS " + str);
                }
            }
        } finally {
        }
    }

    public abstract List n();

    public abstract C2804c o();

    public final int p(t.d dVar) {
        AbstractC4862t.e(dVar, "<this>");
        int i10 = c.f25151a[dVar.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 4;
        }
        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + dVar + '\'').toString());
    }

    public final int q(t.d dVar) {
        AbstractC4862t.e(dVar, "<this>");
        int i10 = c.f25151a[dVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        throw new IllegalStateException(("Can't get max number of writers for journal mode '" + dVar + '\'').toString());
    }

    public abstract x r();

    public final boolean s(InterfaceC4792b interfaceC4792b) throws Exception {
        InterfaceC4794d interfaceC4794dA1 = interfaceC4792b.a1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (interfaceC4794dA1.X0()) {
                if (interfaceC4794dA1.getLong(0) == 0) {
                    z10 = true;
                }
            }
            AbstractC5877a.a(interfaceC4794dA1, null);
            return z10;
        } finally {
        }
    }

    public final boolean t(InterfaceC4792b interfaceC4792b) throws Exception {
        InterfaceC4794d interfaceC4794dA1 = interfaceC4792b.a1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z10 = false;
            if (interfaceC4794dA1.X0()) {
                if (interfaceC4794dA1.getLong(0) != 0) {
                    z10 = true;
                }
            }
            AbstractC5877a.a(interfaceC4794dA1, null);
            return z10;
        } finally {
        }
    }

    public final void u(InterfaceC4792b interfaceC4792b) {
        Iterator it = n().iterator();
        while (it.hasNext()) {
            ((t.b) it.next()).a(interfaceC4792b);
        }
    }

    public final void v(InterfaceC4792b interfaceC4792b) {
        Iterator it = n().iterator();
        while (it.hasNext()) {
            ((t.b) it.next()).c(interfaceC4792b);
        }
    }

    public final void w(InterfaceC4792b interfaceC4792b) {
        Iterator it = n().iterator();
        while (it.hasNext()) {
            ((t.b) it.next()).e(interfaceC4792b);
        }
    }

    public final void x(InterfaceC4792b connection) {
        AbstractC4862t.e(connection, "connection");
        boolean zS = s(connection);
        r().a(connection);
        if (!zS) {
            x.a aVarJ = r().j(connection);
            if (!aVarJ.f25250a) {
                throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarJ.f25251b).toString());
            }
        }
        B(connection);
        r().f(connection);
        u(connection);
    }

    public final void y(InterfaceC4792b connection, int i10, int i11) {
        AbstractC4862t.e(connection, "connection");
        List listB = h3.g.b(o().f25158d, i10, i11);
        if (listB == null) {
            if (!h3.g.d(o(), i10, i11)) {
                m(connection);
                v(connection);
                r().a(connection);
                return;
            } else {
                throw new IllegalStateException(("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
            }
        }
        r().i(connection);
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            ((AbstractC3989b) it.next()).a(connection);
        }
        x.a aVarJ = r().j(connection);
        if (aVarJ.f25250a) {
            r().h(connection);
            B(connection);
        } else {
            throw new IllegalStateException(("Migration didn't properly handle: " + aVarJ.f25251b).toString());
        }
    }

    public final void z(InterfaceC4792b connection) {
        AbstractC4862t.e(connection, "connection");
        f(connection);
        r().g(connection);
        w(connection);
        this.f25146a = true;
    }
}
