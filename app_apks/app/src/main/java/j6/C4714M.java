package j6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import b6.AbstractC2840i;
import b6.AbstractC2847p;
import b6.C2839h;
import e6.C3940a;
import e6.C3941b;
import e6.C3942c;
import e6.C3943d;
import e6.C3944e;
import e6.C3945f;
import ec.InterfaceC3978a;
import f6.AbstractC3996a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k6.C4805a;
import k6.InterfaceC4806b;
import l6.InterfaceC4957a;
import m6.C5024a;

/* JADX INFO: renamed from: j6.M, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C4714M implements InterfaceC4725d, InterfaceC4806b, InterfaceC4724c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Y5.c f39023f = Y5.c.b("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f39024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4957a f39025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4957a f39026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC4726e f39027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3978a f39028e;

    /* JADX INFO: renamed from: j6.M$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        Object apply(Object obj);
    }

    /* JADX INFO: renamed from: j6.M$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39030b;

        public c(String str, String str2) {
            this.f39029a = str;
            this.f39030b = str2;
        }
    }

    /* JADX INFO: renamed from: j6.M$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        Object a();
    }

    public C4714M(InterfaceC4957a interfaceC4957a, InterfaceC4957a interfaceC4957a2, AbstractC4726e abstractC4726e, W w10, InterfaceC3978a interfaceC3978a) {
        this.f39024a = w10;
        this.f39025b = interfaceC4957a;
        this.f39026c = interfaceC4957a2;
        this.f39027d = abstractC4726e;
        this.f39028e = interfaceC3978a;
    }

    public static /* synthetic */ List C(SQLiteDatabase sQLiteDatabase) {
        return (List) s1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: j6.K
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.h((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ C3945f C0(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (C3945f) s1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: j6.D
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.f(j10, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ C3940a D(C4714M c4714m, Map map, C3940a.C0423a c0423a, Cursor cursor) {
        c4714m.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C3942c.b bVarG0 = c4714m.G0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C3942c.c().c(bVarG0).b(j10).a());
        }
        c4714m.n1(c0423a, map);
        return c0423a.e(c4714m.f1()).d(c4714m.c1()).c((String) c4714m.f39028e.get()).b();
    }

    public static /* synthetic */ Long G(C4714M c4714m, AbstractC2840i abstractC2840i, AbstractC2847p abstractC2847p, SQLiteDatabase sQLiteDatabase) {
        if (c4714m.i1()) {
            c4714m.b(1L, C3942c.b.CACHE_FULL, abstractC2840i.n());
            return -1L;
        }
        long jM0 = c4714m.M0(sQLiteDatabase, abstractC2847p);
        int iE = c4714m.f39027d.e();
        byte[] bArrA = abstractC2840i.e().a();
        boolean z10 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jM0));
        contentValues.put("transport_name", abstractC2840i.n());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC2840i.f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC2840i.o()));
        contentValues.put("payload_encoding", abstractC2840i.e().b().a());
        contentValues.put("code", abstractC2840i.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? bArrA : new byte[0]);
        contentValues.put("product_id", abstractC2840i.l());
        contentValues.put("pseudonymous_id", abstractC2840i.m());
        contentValues.put("experiment_ids_clear_blob", abstractC2840i.g());
        contentValues.put("experiment_ids_encrypted_blob", abstractC2840i.h());
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i10 = 1; i10 <= iCeil; i10++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i10 - 1) * iE, Math.min(i10 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : abstractC2840i.k().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    public static /* synthetic */ Object H(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Long K(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ Object S(Throwable th) {
        throw new C4805a("Timed out while trying to acquire the lock.", th);
    }

    public static /* synthetic */ Object Y(String str, C3942c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) s1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: j6.y
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
        contentValues.put("events_dropped_count", Long.valueOf(j10));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    public static /* synthetic */ Object a0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j10));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j10), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ C3945f f(long j10, Cursor cursor) {
        cursor.moveToNext();
        return C3945f.c().c(cursor.getLong(0)).b(j10).a();
    }

    public static /* synthetic */ List g(C4714M c4714m, AbstractC2847p abstractC2847p, SQLiteDatabase sQLiteDatabase) {
        List listK1 = c4714m.k1(sQLiteDatabase, abstractC2847p, c4714m.f39027d.d());
        for (Y5.f fVar : Y5.f.values()) {
            if (fVar != abstractC2847p.d()) {
                int iD = c4714m.f39027d.d() - listK1.size();
                if (iD <= 0) {
                    break;
                }
                listK1.addAll(c4714m.k1(sQLiteDatabase, abstractC2847p.f(fVar), iD));
            }
        }
        return c4714m.j1(listK1, c4714m.l1(sQLiteDatabase, listK1));
    }

    public static /* synthetic */ Integer g0(final C4714M c4714m, long j10, SQLiteDatabase sQLiteDatabase) {
        c4714m.getClass();
        String[] strArr = {String.valueOf(j10)};
        s1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: j6.s
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.k(this.f39080a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ List h(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC2847p.a().b(cursor.getString(1)).d(C5024a.b(cursor.getInt(2))).c(m1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Object i(C4714M c4714m, Cursor cursor) {
        c4714m.getClass();
        while (cursor.moveToNext()) {
            c4714m.b(cursor.getInt(0), C3942c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ SQLiteDatabase j(Throwable th) {
        throw new C4805a("Timed out while trying to open db.", th);
    }

    public static /* synthetic */ Object k(C4714M c4714m, Cursor cursor) {
        c4714m.getClass();
        while (cursor.moveToNext()) {
            c4714m.b(cursor.getInt(0), C3942c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Object k0(C4714M c4714m, List list, AbstractC2847p abstractC2847p, Cursor cursor) {
        c4714m.getClass();
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            AbstractC2840i.a aVarO = AbstractC2840i.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            if (z10) {
                aVarO.h(new C2839h(q1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarO.h(new C2839h(q1(cursor.getString(4)), c4714m.o1(j10)));
            }
            if (!cursor.isNull(6)) {
                aVarO.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                aVarO.l(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                aVarO.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                aVarO.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                aVarO.k(cursor.getBlob(11));
            }
            list.add(AbstractC4732k.a(j10, abstractC2847p, aVarO.d()));
        }
        return null;
    }

    public static /* synthetic */ Object m(final C4714M c4714m, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        c4714m.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        s1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: j6.v
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.i(this.f39085a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static byte[] m1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ Boolean o(C4714M c4714m, AbstractC2847p abstractC2847p, SQLiteDatabase sQLiteDatabase) {
        Long lG1 = c4714m.g1(sQLiteDatabase, abstractC2847p);
        return lG1 == null ? Boolean.FALSE : (Boolean) s1(c4714m.W0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lG1.toString()}), new b() { // from class: j6.u
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ Object p0(C4714M c4714m, SQLiteDatabase sQLiteDatabase) {
        c4714m.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c4714m.f39025b.a()).execute();
        return null;
    }

    public static /* synthetic */ Object q(long j10, AbstractC2847p abstractC2847p, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC2847p.b(), String.valueOf(C5024a.a(abstractC2847p.d()))}) < 1) {
            contentValues.put("backend_name", abstractC2847p.b());
            contentValues.put("priority", Integer.valueOf(C5024a.a(abstractC2847p.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static Y5.c q1(String str) {
        return str == null ? f39023f : Y5.c.b(str);
    }

    public static String r1(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((AbstractC4732k) it.next()).c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object s1(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ byte[] u(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ C3940a v0(final C4714M c4714m, String str, final Map map, final C3940a.C0423a c0423a, SQLiteDatabase sQLiteDatabase) {
        c4714m.getClass();
        return (C3940a) s1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: j6.A
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.D(this.f39009a, map, c0423a, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long x0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public final C3942c.b G0(int i10) {
        C3942c.b bVar = C3942c.b.REASON_UNKNOWN;
        if (i10 == bVar.getNumber()) {
            return bVar;
        }
        C3942c.b bVar2 = C3942c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.getNumber()) {
            return bVar2;
        }
        C3942c.b bVar3 = C3942c.b.CACHE_FULL;
        if (i10 == bVar3.getNumber()) {
            return bVar3;
        }
        C3942c.b bVar4 = C3942c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.getNumber()) {
            return bVar4;
        }
        C3942c.b bVar5 = C3942c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.getNumber()) {
            return bVar5;
        }
        C3942c.b bVar6 = C3942c.b.INVALID_PAYLOD;
        if (i10 == bVar6.getNumber()) {
            return bVar6;
        }
        C3942c.b bVar7 = C3942c.b.SERVER_ERROR;
        if (i10 == bVar7.getNumber()) {
            return bVar7;
        }
        AbstractC3996a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    @Override // j6.InterfaceC4725d
    public void H0(final AbstractC2847p abstractC2847p, final long j10) {
        h1(new b() { // from class: j6.p
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.q(j10, abstractC2847p, (SQLiteDatabase) obj);
            }
        });
    }

    public final void J0(final SQLiteDatabase sQLiteDatabase) {
        p1(new d() { // from class: j6.l
            @Override // j6.C4714M.d
            public final Object a() {
                return C4714M.H(sQLiteDatabase);
            }
        }, new b() { // from class: j6.w
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.S((Throwable) obj);
            }
        });
    }

    @Override // j6.InterfaceC4725d
    public Iterable L() {
        return (Iterable) h1(new b() { // from class: j6.G
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.C((SQLiteDatabase) obj);
            }
        });
    }

    public final long M0(SQLiteDatabase sQLiteDatabase, AbstractC2847p abstractC2847p) {
        Long lG1 = g1(sQLiteDatabase, abstractC2847p);
        if (lG1 != null) {
            return lG1.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", abstractC2847p.b());
        contentValues.put("priority", Integer.valueOf(C5024a.a(abstractC2847p.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (abstractC2847p.c() != null) {
            contentValues.put("extras", Base64.encodeToString(abstractC2847p.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public long Q0() {
        return d1() * e1();
    }

    public SQLiteDatabase W0() {
        final W w10 = this.f39024a;
        Objects.requireNonNull(w10);
        return (SQLiteDatabase) p1(new d() { // from class: j6.E
            @Override // j6.C4714M.d
            public final Object a() {
                return w10.getWritableDatabase();
            }
        }, new b() { // from class: j6.F
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.j((Throwable) obj);
            }
        });
    }

    @Override // j6.InterfaceC4725d
    public long X(AbstractC2847p abstractC2847p) {
        return ((Long) s1(W0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC2847p.b(), String.valueOf(C5024a.a(abstractC2847p.d()))}), new b() { // from class: j6.H
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.x0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // j6.InterfaceC4725d
    public AbstractC4732k Y0(final AbstractC2847p abstractC2847p, final AbstractC2840i abstractC2840i) {
        AbstractC3996a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", abstractC2847p.d(), abstractC2840i.n(), abstractC2847p.b());
        long jLongValue = ((Long) h1(new b() { // from class: j6.I
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.G(this.f39015a, abstractC2840i, abstractC2847p, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC4732k.a(jLongValue, abstractC2847p, abstractC2840i);
    }

    @Override // j6.InterfaceC4724c
    public void a() {
        h1(new b() { // from class: j6.q
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.p0(this.f39076a, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // j6.InterfaceC4724c
    public void b(final long j10, final C3942c.b bVar, final String str) {
        h1(new b() { // from class: j6.r
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.Y(str, bVar, j10, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // k6.InterfaceC4806b
    public Object c(InterfaceC4806b.a aVar) {
        SQLiteDatabase sQLiteDatabaseW0 = W0();
        J0(sQLiteDatabaseW0);
        try {
            Object objL = aVar.l();
            sQLiteDatabaseW0.setTransactionSuccessful();
            return objL;
        } finally {
            sQLiteDatabaseW0.endTransaction();
        }
    }

    public final C3941b c1() {
        return C3941b.b().b(C3944e.c().b(Q0()).c(AbstractC4726e.f39064a.f()).a()).a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39024a.close();
    }

    @Override // j6.InterfaceC4724c
    public C3940a d() {
        final C3940a.C0423a c0423aE = C3940a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C3940a) h1(new b() { // from class: j6.t
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.v0(this.f39081a, str, map, c0423aE, (SQLiteDatabase) obj);
            }
        });
    }

    public final long d1() {
        return W0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public final long e1() {
        return W0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public final C3945f f1() {
        final long jA = this.f39025b.a();
        return (C3945f) h1(new b() { // from class: j6.C
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.C0(jA, (SQLiteDatabase) obj);
            }
        });
    }

    public final Long g1(SQLiteDatabase sQLiteDatabase, AbstractC2847p abstractC2847p) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC2847p.b(), String.valueOf(C5024a.a(abstractC2847p.d()))));
        if (abstractC2847p.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC2847p.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) s1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: j6.n
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.K((Cursor) obj);
            }
        });
    }

    @Override // j6.InterfaceC4725d
    public void h0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + r1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            h1(new b() { // from class: j6.L
                @Override // j6.C4714M.b
                public final Object apply(Object obj) {
                    return C4714M.m(this.f39020a, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    public Object h1(b bVar) {
        SQLiteDatabase sQLiteDatabaseW0 = W0();
        sQLiteDatabaseW0.beginTransaction();
        try {
            Object objApply = bVar.apply(sQLiteDatabaseW0);
            sQLiteDatabaseW0.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseW0.endTransaction();
        }
    }

    @Override // j6.InterfaceC4725d
    public Iterable i0(final AbstractC2847p abstractC2847p) {
        return (Iterable) h1(new b() { // from class: j6.m
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.g(this.f39070a, abstractC2847p, (SQLiteDatabase) obj);
            }
        });
    }

    public final boolean i1() {
        return d1() * e1() >= this.f39027d.f();
    }

    public final List j1(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC4732k abstractC4732k = (AbstractC4732k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC4732k.c()))) {
                AbstractC2840i.a aVarP = abstractC4732k.b().p();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC4732k.c()))) {
                    aVarP.c(cVar.f39029a, cVar.f39030b);
                }
                listIterator.set(AbstractC4732k.a(abstractC4732k.c(), abstractC4732k.d(), aVarP.d()));
            }
        }
        return list;
    }

    public final List k1(SQLiteDatabase sQLiteDatabase, final AbstractC2847p abstractC2847p, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lG1 = g1(sQLiteDatabase, abstractC2847p);
        if (lG1 == null) {
            return arrayList;
        }
        s1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lG1.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: j6.x
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.k0(this.f39086a, arrayList, abstractC2847p, (Cursor) obj);
            }
        });
        return arrayList;
    }

    public final Map l1(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((AbstractC4732k) list.get(i10)).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        s1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: j6.z
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.a0(map, (Cursor) obj);
            }
        });
        return map;
    }

    public final void n1(C3940a.C0423a c0423a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0423a.a(C3943d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    public final byte[] o1(long j10) {
        return (byte[]) s1(W0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: j6.B
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.u((Cursor) obj);
            }
        });
    }

    public final Object p1(d dVar, b bVar) {
        long jA = this.f39026c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f39026c.a() >= ((long) this.f39027d.b()) + jA) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // j6.InterfaceC4725d
    public int w() {
        final long jA = this.f39025b.a() - this.f39027d.c();
        return ((Integer) h1(new b() { // from class: j6.J
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.g0(this.f39018a, jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // j6.InterfaceC4725d
    public boolean w0(final AbstractC2847p abstractC2847p) {
        return ((Boolean) h1(new b() { // from class: j6.o
            @Override // j6.C4714M.b
            public final Object apply(Object obj) {
                return C4714M.o(this.f39072a, abstractC2847p, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // j6.InterfaceC4725d
    public void x(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            W0().compileStatement("DELETE FROM events WHERE _id in " + r1(iterable)).execute();
        }
    }
}
