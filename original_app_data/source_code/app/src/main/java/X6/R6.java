package X6;

import android.app.BroadcastOptions;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import b0.C2777a;
import com.google.android.gms.internal.measurement.AbstractC3161c0;
import com.google.android.gms.internal.measurement.C3190f2;
import com.google.android.gms.internal.measurement.C3213h7;
import com.google.android.gms.internal.measurement.C3229j5;
import com.google.android.gms.internal.measurement.C3281p3;
import com.google.android.gms.internal.measurement.C3290q3;
import com.google.android.gms.internal.measurement.C3297r2;
import com.google.android.gms.internal.measurement.C3332v2;
import com.google.android.gms.internal.measurement.EnumC3227j3;
import io.sentry.TransactionOptions;
import io.sentry.protocol.App;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class R6 implements N3 {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static volatile R6 f18515K;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f18516A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Map f18517B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Map f18518C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Map f18519D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C2362c5 f18521F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f18522G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public AbstractC2539z f18523H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f18524I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2344a3 f18526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E2 f18527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2515w f18528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public H2 f18529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2506u6 f18530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2372e f18531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final V6 f18532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public X4 f18533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public W5 f18534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final E6 f18535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Q2 f18536k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C2416j3 f18537l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f18539n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f18540o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f18541p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f18544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f18545t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f18546u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f18547v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public FileLock f18548w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FileChannel f18549x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f18550y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List f18551z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f18538m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Deque f18542q = new LinkedList();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Map f18520E = new HashMap();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Z6 f18525J = new M6(this);

    public R6(S6 s62, C2416j3 c2416j3) {
        AbstractC6056k.l(s62);
        this.f18537l = C2416j3.O(s62.f18562a, null, null);
        this.f18516A = -1L;
        this.f18535j = new E6(this);
        V6 v62 = new V6(this);
        v62.k();
        this.f18532g = v62;
        E2 e22 = new E2(this);
        e22.k();
        this.f18527b = e22;
        C2344a3 c2344a3 = new C2344a3(this);
        c2344a3.k();
        this.f18526a = c2344a3;
        this.f18517B = new HashMap();
        this.f18518C = new HashMap();
        this.f18519D = new HashMap();
        b().t(new F6(this, s62));
    }

    public static R6 F(Context context) {
        AbstractC6056k.l(context);
        AbstractC6056k.l(context.getApplicationContext());
        if (f18515K == null) {
            synchronized (R6.class) {
                try {
                    if (f18515K == null) {
                        f18515K = new R6((S6) AbstractC6056k.l(new S6(context)), null);
                    }
                } finally {
                }
            }
        }
        return f18515K;
    }

    public static final void G(com.google.android.gms.internal.measurement.M2 m22, int i10, String str) {
        List listZ = m22.z();
        for (int i11 = 0; i11 < listZ.size(); i11++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.R2) listZ.get(i11)).E())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.Q2 q2P = com.google.android.gms.internal.measurement.R2.P();
        q2P.A("_err");
        q2P.E(i10);
        com.google.android.gms.internal.measurement.R2 r22 = (com.google.android.gms.internal.measurement.R2) q2P.w();
        com.google.android.gms.internal.measurement.Q2 q2P2 = com.google.android.gms.internal.measurement.R2.P();
        q2P2.A("_ev");
        q2P2.C(str);
        com.google.android.gms.internal.measurement.R2 r23 = (com.google.android.gms.internal.measurement.R2) q2P2.w();
        m22.E(r22);
        m22.E(r23);
    }

    public static final void H(com.google.android.gms.internal.measurement.M2 m22, String str) {
        List listZ = m22.z();
        for (int i10 = 0; i10 < listZ.size(); i10++) {
            if (str.equals(((com.google.android.gms.internal.measurement.R2) listZ.get(i10)).E())) {
                m22.I(i10);
                return;
            }
        }
    }

    public static String Q(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static void W(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    public static final boolean X(c7 c7Var) {
        return !TextUtils.isEmpty(c7Var.f18744b);
    }

    public static final C6 Y(C6 c62) {
        if (c62 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (c62.i()) {
            return c62;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(c62.getClass())));
    }

    public static final Boolean Z(c7 c7Var) {
        Boolean bool = c7Var.f18758p;
        String str = c7Var.f18740C;
        if (!TextUtils.isEmpty(str)) {
            P3 p3A = C2382f1.c(str).a();
            P3 p32 = P3.UNINITIALIZED;
            int iOrdinal = p3A.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[Catch: all -> 0x0016, TryCatch #2 {all -> 0x0016, blocks: (B:4:0x0013, B:8:0x001b, B:16:0x0034, B:21:0x0080, B:20:0x0071, B:22:0x008c, B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7, B:88:0x0267), top: B:95:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c A[Catch: all -> 0x0016, PHI: r0
      0x008c: PHI (r0v2 int) = (r0v0 int), (r0v37 int) binds: [B:9:0x0027, B:15:0x0032] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x0016, blocks: (B:4:0x0013, B:8:0x001b, B:16:0x0034, B:21:0x0080, B:20:0x0071, B:22:0x008c, B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7, B:88:0x0267), top: B:95:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7), top: B:94:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7), top: B:94:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:32:0x00eb, B:33:0x00f4, B:35:0x00fc, B:37:0x0113, B:41:0x013d, B:43:0x0147, B:47:0x0158, B:48:0x015d, B:50:0x0163, B:52:0x017a, B:54:0x019f, B:56:0x01ba, B:58:0x01dd, B:59:0x01ee, B:60:0x01f2, B:62:0x01f8, B:63:0x01ff, B:66:0x020c, B:68:0x0210, B:71:0x0217, B:72:0x0218), top: B:93:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163 A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:32:0x00eb, B:33:0x00f4, B:35:0x00fc, B:37:0x0113, B:41:0x013d, B:43:0x0147, B:47:0x0158, B:48:0x015d, B:50:0x0163, B:52:0x017a, B:54:0x019f, B:56:0x01ba, B:58:0x01dd, B:59:0x01ee, B:60:0x01f2, B:62:0x01f8, B:63:0x01ff, B:66:0x020c, B:68:0x0210, B:71:0x0217, B:72:0x0218), top: B:93:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ba A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:32:0x00eb, B:33:0x00f4, B:35:0x00fc, B:37:0x0113, B:41:0x013d, B:43:0x0147, B:47:0x0158, B:48:0x015d, B:50:0x0163, B:52:0x017a, B:54:0x019f, B:56:0x01ba, B:58:0x01dd, B:59:0x01ee, B:60:0x01f2, B:62:0x01f8, B:63:0x01ff, B:66:0x020c, B:68:0x0210, B:71:0x0217, B:72:0x0218), top: B:93:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f8 A[Catch: all -> 0x0155, TRY_LEAVE, TryCatch #0 {all -> 0x0155, blocks: (B:32:0x00eb, B:33:0x00f4, B:35:0x00fc, B:37:0x0113, B:41:0x013d, B:43:0x0147, B:47:0x0158, B:48:0x015d, B:50:0x0163, B:52:0x017a, B:54:0x019f, B:56:0x01ba, B:58:0x01dd, B:59:0x01ee, B:60:0x01f2, B:62:0x01f8, B:63:0x01ff, B:66:0x020c, B:68:0x0210, B:71:0x0217, B:72:0x0218), top: B:93:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0242 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7), top: B:94:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0256 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7), top: B:94:0x00a3, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(boolean r19, int r20, java.lang.Throwable r21, byte[] r22, java.lang.String r23, java.util.List r24) {
        /*
            Method dump skipped, instruction units count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.R6.A(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    public final void A0() {
        b().h();
        F0().u();
        C2515w c2515wF0 = F0();
        c2515wF0.h();
        c2515wF0.j();
        if (c2515wF0.a0()) {
            C2375e2 c2375e2 = AbstractC2383f2.f18926w0;
            if (((Long) c2375e2.b(null)).longValue() != 0) {
                SQLiteDatabase sQLiteDatabaseU0 = c2515wF0.u0();
                C2416j3 c2416j3 = c2515wF0.f18400a;
                int iDelete = sQLiteDatabaseU0.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(c2416j3.e().a()), String.valueOf(c2375e2.b(null))});
                if (iDelete > 0) {
                    c2416j3.a().w().b("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(iDelete));
                }
            }
        }
        if (this.f18534i.f18636h.a() == 0) {
            this.f18534i.f18636h.b(e().a());
        }
        R();
    }

    public final void B(F2 f22) {
        b().h();
        if (TextUtils.isEmpty(f22.r0())) {
            C((String) AbstractC6056k.l(f22.o0()), 204, null, null, null);
            return;
        }
        String str = (String) AbstractC6056k.l(f22.o0());
        a().w().b("Fetching remote configuration", str);
        C3190f2 c3190f2W = D0().w(str);
        String strY = D0().y(str);
        C2777a c2777a = null;
        if (c3190f2W != null) {
            if (!TextUtils.isEmpty(strY)) {
                c2777a = new C2777a();
                c2777a.put("If-Modified-Since", strY);
            }
            String strZ = D0().z(str);
            if (!TextUtils.isEmpty(strZ)) {
                if (c2777a == null) {
                    c2777a = new C2777a();
                }
                c2777a.put("If-None-Match", strZ);
            }
        }
        this.f18545t = true;
        E0().o(f22, c2777a, new B2() { // from class: X6.Q6
            @Override // X6.B2
            public final /* synthetic */ void a(String str2, int i10, Throwable th, byte[] bArr, Map map) {
                this.f18487a.C(str2, i10, th, bArr, map);
            }
        });
    }

    public final C2436m B0() {
        return ((C2416j3) AbstractC6056k.l(this.f18537l)).w();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.R6.C(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final E6 C0() {
        return this.f18535j;
    }

    public final void D(Runnable runnable) {
        b().h();
        if (this.f18541p == null) {
            this.f18541p = new ArrayList();
        }
        this.f18541p.add(runnable);
    }

    public final C2344a3 D0() {
        C2344a3 c2344a3 = this.f18526a;
        Y(c2344a3);
        return c2344a3;
    }

    public final void E() {
        b().h();
        O0();
        if (this.f18539n) {
            return;
        }
        this.f18539n = true;
        if (a0()) {
            FileChannel fileChannel = this.f18549x;
            b().h();
            int i10 = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                a().o().a("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i11 = fileChannel.read(byteBufferAllocate);
                    if (i11 == 4) {
                        byteBufferAllocate.flip();
                        i10 = byteBufferAllocate.getInt();
                    } else if (i11 != -1) {
                        a().r().b("Unexpected data length. Bytes read", Integer.valueOf(i11));
                    }
                } catch (IOException e10) {
                    a().o().b("Failed to read from channel", e10);
                }
            }
            int iT = this.f18537l.L().t();
            b().h();
            if (i10 > iT) {
                a().o().c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i10), Integer.valueOf(iT));
                return;
            }
            if (i10 < iT) {
                FileChannel fileChannel2 = this.f18549x;
                b().h();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    a().o().a("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iT);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            a().o().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        a().w().c("Storage version upgraded. Previous, current version", Integer.valueOf(i10), Integer.valueOf(iT));
                        return;
                    } catch (IOException e11) {
                        a().o().b("Failed to write to channel", e11);
                    }
                }
                a().o().c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i10), Integer.valueOf(iT));
            }
        }
    }

    public final E2 E0() {
        E2 e22 = this.f18527b;
        Y(e22);
        return e22;
    }

    public final C2515w F0() {
        C2515w c2515w = this.f18528c;
        Y(c2515w);
        return c2515w;
    }

    public final H2 G0() {
        H2 h22 = this.f18529d;
        if (h22 != null) {
            return h22;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final C2506u6 H0() {
        C2506u6 c2506u6 = this.f18530e;
        Y(c2506u6);
        return c2506u6;
    }

    public final int I(String str, C2452o c2452o) {
        R3 r32;
        P3 p3M;
        C2344a3 c2344a3 = this.f18526a;
        if (c2344a3.R(str) == null) {
            c2452o.c(R3.AD_PERSONALIZATION, EnumC2444n.FAILSAFE);
            return 1;
        }
        F2 f2J0 = F0().J0(str);
        if (f2J0 != null && C2382f1.c(f2J0.I()).a() == P3.POLICY && (p3M = c2344a3.m(str, (r32 = R3.AD_PERSONALIZATION))) != P3.UNINITIALIZED) {
            c2452o.c(r32, EnumC2444n.REMOTE_ENFORCED_DEFAULT);
            return p3M == P3.GRANTED ? 0 : 1;
        }
        R3 r33 = R3.AD_PERSONALIZATION;
        c2452o.c(r33, EnumC2444n.REMOTE_DEFAULT);
        return c2344a3.P(str, r33) ? 0 : 1;
    }

    public final C2372e I0() {
        C2372e c2372e = this.f18531f;
        Y(c2372e);
        return c2372e;
    }

    public final Map J(com.google.android.gms.internal.measurement.N2 n22) {
        HashMap map = new HashMap();
        K0();
        for (Map.Entry entry : V6.t(n22, "gad_").entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    public final X4 J0() {
        X4 x42 = this.f18533h;
        Y(x42);
        return x42;
    }

    public final AbstractC2539z K() {
        if (this.f18523H == null) {
            this.f18523H = new I6(this, this.f18537l);
        }
        return this.f18523H;
    }

    public final V6 K0() {
        V6 v62 = this.f18532g;
        Y(v62);
        return v62;
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void v0() {
        b().h();
        if (this.f18542q.isEmpty() || K().c()) {
            return;
        }
        long jMax = Math.max(0L, ((long) ((Integer) AbstractC2383f2.f18822C0.b(null)).intValue()) - (e().c() - this.f18524I));
        a().w().b("Scheduling notify next app runnable, delay in ms", Long.valueOf(jMax));
        K().b(jMax);
    }

    public final W5 L0() {
        return this.f18534i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:8|(5:9|10|(4:12|13|(4:15|(1:22)|25|488)(18:26|27|(2:35|(3:37|(1:44)(1:43)|45)(0))(1:34)|46|(2:48|(3:50|(4:53|(1:493)(2:59|490)|60|51)|489))|61|62|(5:64|65|(3:68|(0)|(7:117|(5:121|(2:123|504)(2:124|(2:126|503)(1:505))|127|118|119)|502|128|(2:131|(3:137|(1:139)(2:140|(3:142|(3:145|(1:147)(1:521)|143)|520))|148)(2:135|136))(1:130)|149|(2:151|(6:(2:156|(6:158|159|193|(9:195|(4:198|(2:211|(2:213|507)(1:509))(5:202|(5:205|(2:208|206)|511|209|203)|510|210|508)|214|196)|506|215|(4:218|(3:513|220|516)(1:515)|514|216)|512|221|(2:224|222)|517)(1:225)|226|487))|160|193|(0)(0)|226|487)(7:161|162|192|193|(0)(0)|226|487))(2:163|(8:165|(6:(2:170|(6:172|159|193|(0)(0)|226|487))|173|193|(0)(0)|226|487)|162|192|193|(0)(0)|226|487)(7:174|(2:185|(2:186|(2:188|(2:519|190)(1:191))(1:518)))(0)|192|193|(0)(0)|226|487)))(3:136|149|(0)(0)))|71|(0)(0))(1:72)|70|(3:73|74|(3:76|(2:78|496)(2:79|(2:81|495)(1:497))|82)(1:494))|83|(1:87)(1:86)|(1:89)|90|(1:92)(1:93)|94|(2:97|(4:99|(4:102|(2:104|500)(2:105|(2:107|499)(1:501))|108|100)|498|(1:(1:114)(1:115))(1:(1:111)(2:112|(0)(0)))))|(0)(0))|227)(1:486)|475|476)|228|(3:230|(2:232|(2:234|524)(2:235|(1:525)(3:237|(1:239)(1:240)|(1:527)(2:244|523))))(0)|245)|522|246|(3:247|248|(1:528)(2:250|(2:529|252)(1:530)))|253|(1:255)(2:256|(1:258))|259|(1:261)(1:262)|263|(1:265)(1:266)|267|(6:270|(1:272)|273|(2:275|532)(1:533)|276|268)|531|277|(2:282|(1:286))(1:281)|287|(1:289)|290|(1:292)|293|(1:301)|302|(10:484|304|(7:307|308|(5:310|(1:314)|(1:331)(5:318|(1:322)|324|(1:329)(1:328)|330)|332|333)(7:335|336|(6:477|338|339|344|(6:346|(3:349|(3:542|351|(3:353|359|(1:361)(7:362|(6:364|(1:366)|369|(1:371)(1:373)|372|(4:375|(1:383)|384|540)(4:385|(3:387|(1:389)|390)(5:391|(1:393)(1:394)|395|(3:397|(1:399)|400)(2:402|(1:404))|401)|405|538))(1:368)|367|369|(0)(0)|372|(0)(0)))(2:354|(0)(0)))(1:357)|347)|541|358|359|(0)(0))(3:358|359|(0)(0))|406)(1:343)|342|344|(0)(0)|406)|334|539|406|305)|537|407|(1:409)|410|(2:413|411)|543|414)(1:415)|416|(1:418)(13:420|(9:422|(1:424)(1:425)|426|(1:428)(1:429)|430|(1:432)(1:433)|434|(1:436)(1:437)|438)|439|(4:441|442|(2:450|(1:452)(1:453))(1:447)|454)(1:455)|456|(3:(2:460|535)(1:536)|461|457)|534|462|(1:464)|465|480|466|470)|419|439|(0)(0)|456|(1:457)|534|462|(0)|465|480|466|470) */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0dda, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0ddb, code lost:
    
        r3.f18400a.a().o().c("Failed to remove unused event metadata. appId", X6.C2542z2.x(r1), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03bd A[Catch: all -> 0x00f6, TryCatch #3 {all -> 0x00f6, blocks: (B:3:0x0017, B:5:0x002e, B:8:0x0038, B:9:0x004e, B:12:0x0060, B:15:0x008a, B:17:0x00bf, B:20:0x00d0, B:22:0x00da, B:227:0x06d0, B:26:0x0107, B:29:0x0119, B:31:0x011f, B:46:0x0163, B:48:0x0171, B:51:0x0191, B:53:0x0197, B:55:0x01a7, B:57:0x01b5, B:59:0x01c5, B:60:0x01d2, B:61:0x01d5, B:64:0x01eb, B:73:0x021e, B:76:0x0228, B:78:0x0236, B:82:0x027d, B:79:0x0253, B:81:0x0263, B:86:0x028a, B:89:0x02bf, B:90:0x02e9, B:92:0x0322, B:94:0x0328, B:97:0x0334, B:99:0x036b, B:100:0x0386, B:102:0x038c, B:104:0x039a, B:108:0x03af, B:105:0x03a3, B:111:0x03b6, B:114:0x03bd, B:115:0x03d5, B:117:0x03ee, B:118:0x03fa, B:121:0x0404, B:127:0x0427, B:124:0x0416, B:149:0x04a5, B:151:0x04b1, B:154:0x04c2, B:156:0x04d3, B:158:0x04df, B:193:0x05ab, B:195:0x05b1, B:196:0x05bd, B:198:0x05c3, B:200:0x05d3, B:202:0x05dd, B:203:0x05ee, B:205:0x05f4, B:206:0x060f, B:208:0x0615, B:209:0x0633, B:210:0x0640, B:214:0x0665, B:211:0x0646, B:213:0x0652, B:215:0x066c, B:216:0x0682, B:218:0x0688, B:220:0x069b, B:221:0x06a8, B:222:0x06ac, B:224:0x06b2, B:226:0x06be, B:163:0x04fc, B:165:0x050a, B:168:0x051d, B:170:0x052f, B:172:0x053b, B:174:0x054b, B:176:0x055a, B:179:0x0566, B:181:0x0570, B:183:0x057a, B:186:0x0585, B:188:0x058b, B:190:0x059b, B:191:0x05a6, B:131:0x042f, B:133:0x043b, B:135:0x0447, B:148:0x048d, B:140:0x0465, B:143:0x0477, B:145:0x047d, B:147:0x0487, B:35:0x012b, B:37:0x0138, B:39:0x0144, B:41:0x014a, B:45:0x0155, B:230:0x06ea, B:232:0x06f8, B:234:0x0701, B:245:0x0731, B:235:0x0709, B:237:0x0712, B:239:0x0718, B:242:0x0724, B:244:0x072c, B:246:0x0734, B:247:0x0740, B:250:0x0748, B:252:0x075a, B:253:0x0765, B:255:0x076d, B:259:0x0793, B:261:0x07ad, B:263:0x07c2, B:265:0x07dc, B:267:0x07f1, B:268:0x07ff, B:270:0x0805, B:272:0x0815, B:273:0x081c, B:275:0x0828, B:276:0x082f, B:277:0x0832, B:279:0x0874, B:281:0x087a, B:287:0x08a1, B:289:0x08a9, B:290:0x08b2, B:292:0x08b8, B:293:0x08be, B:295:0x08d3, B:297:0x08e3, B:299:0x08f3, B:301:0x08fb, B:302:0x08fe, B:310:0x0974, B:312:0x098d, B:314:0x09a3, B:316:0x09a8, B:318:0x09ac, B:320:0x09b0, B:322:0x09ba, B:324:0x09c3, B:326:0x09c7, B:328:0x09cd, B:330:0x09d8, B:332:0x09e6, B:338:0x0a0e, B:341:0x0a16, B:282:0x0888, B:284:0x088e, B:286:0x0894, B:266:0x07ee, B:262:0x07bf, B:256:0x0773, B:258:0x0779), top: B:482:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03d5 A[Catch: all -> 0x00f6, TryCatch #3 {all -> 0x00f6, blocks: (B:3:0x0017, B:5:0x002e, B:8:0x0038, B:9:0x004e, B:12:0x0060, B:15:0x008a, B:17:0x00bf, B:20:0x00d0, B:22:0x00da, B:227:0x06d0, B:26:0x0107, B:29:0x0119, B:31:0x011f, B:46:0x0163, B:48:0x0171, B:51:0x0191, B:53:0x0197, B:55:0x01a7, B:57:0x01b5, B:59:0x01c5, B:60:0x01d2, B:61:0x01d5, B:64:0x01eb, B:73:0x021e, B:76:0x0228, B:78:0x0236, B:82:0x027d, B:79:0x0253, B:81:0x0263, B:86:0x028a, B:89:0x02bf, B:90:0x02e9, B:92:0x0322, B:94:0x0328, B:97:0x0334, B:99:0x036b, B:100:0x0386, B:102:0x038c, B:104:0x039a, B:108:0x03af, B:105:0x03a3, B:111:0x03b6, B:114:0x03bd, B:115:0x03d5, B:117:0x03ee, B:118:0x03fa, B:121:0x0404, B:127:0x0427, B:124:0x0416, B:149:0x04a5, B:151:0x04b1, B:154:0x04c2, B:156:0x04d3, B:158:0x04df, B:193:0x05ab, B:195:0x05b1, B:196:0x05bd, B:198:0x05c3, B:200:0x05d3, B:202:0x05dd, B:203:0x05ee, B:205:0x05f4, B:206:0x060f, B:208:0x0615, B:209:0x0633, B:210:0x0640, B:214:0x0665, B:211:0x0646, B:213:0x0652, B:215:0x066c, B:216:0x0682, B:218:0x0688, B:220:0x069b, B:221:0x06a8, B:222:0x06ac, B:224:0x06b2, B:226:0x06be, B:163:0x04fc, B:165:0x050a, B:168:0x051d, B:170:0x052f, B:172:0x053b, B:174:0x054b, B:176:0x055a, B:179:0x0566, B:181:0x0570, B:183:0x057a, B:186:0x0585, B:188:0x058b, B:190:0x059b, B:191:0x05a6, B:131:0x042f, B:133:0x043b, B:135:0x0447, B:148:0x048d, B:140:0x0465, B:143:0x0477, B:145:0x047d, B:147:0x0487, B:35:0x012b, B:37:0x0138, B:39:0x0144, B:41:0x014a, B:45:0x0155, B:230:0x06ea, B:232:0x06f8, B:234:0x0701, B:245:0x0731, B:235:0x0709, B:237:0x0712, B:239:0x0718, B:242:0x0724, B:244:0x072c, B:246:0x0734, B:247:0x0740, B:250:0x0748, B:252:0x075a, B:253:0x0765, B:255:0x076d, B:259:0x0793, B:261:0x07ad, B:263:0x07c2, B:265:0x07dc, B:267:0x07f1, B:268:0x07ff, B:270:0x0805, B:272:0x0815, B:273:0x081c, B:275:0x0828, B:276:0x082f, B:277:0x0832, B:279:0x0874, B:281:0x087a, B:287:0x08a1, B:289:0x08a9, B:290:0x08b2, B:292:0x08b8, B:293:0x08be, B:295:0x08d3, B:297:0x08e3, B:299:0x08f3, B:301:0x08fb, B:302:0x08fe, B:310:0x0974, B:312:0x098d, B:314:0x09a3, B:316:0x09a8, B:318:0x09ac, B:320:0x09b0, B:322:0x09ba, B:324:0x09c3, B:326:0x09c7, B:328:0x09cd, B:330:0x09d8, B:332:0x09e6, B:338:0x0a0e, B:341:0x0a16, B:282:0x0888, B:284:0x088e, B:286:0x0894, B:266:0x07ee, B:262:0x07bf, B:256:0x0773, B:258:0x0779), top: B:482:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ee A[Catch: all -> 0x00f6, TryCatch #3 {all -> 0x00f6, blocks: (B:3:0x0017, B:5:0x002e, B:8:0x0038, B:9:0x004e, B:12:0x0060, B:15:0x008a, B:17:0x00bf, B:20:0x00d0, B:22:0x00da, B:227:0x06d0, B:26:0x0107, B:29:0x0119, B:31:0x011f, B:46:0x0163, B:48:0x0171, B:51:0x0191, B:53:0x0197, B:55:0x01a7, B:57:0x01b5, B:59:0x01c5, B:60:0x01d2, B:61:0x01d5, B:64:0x01eb, B:73:0x021e, B:76:0x0228, B:78:0x0236, B:82:0x027d, B:79:0x0253, B:81:0x0263, B:86:0x028a, B:89:0x02bf, B:90:0x02e9, B:92:0x0322, B:94:0x0328, B:97:0x0334, B:99:0x036b, B:100:0x0386, B:102:0x038c, B:104:0x039a, B:108:0x03af, B:105:0x03a3, B:111:0x03b6, B:114:0x03bd, B:115:0x03d5, B:117:0x03ee, B:118:0x03fa, B:121:0x0404, B:127:0x0427, B:124:0x0416, B:149:0x04a5, B:151:0x04b1, B:154:0x04c2, B:156:0x04d3, B:158:0x04df, B:193:0x05ab, B:195:0x05b1, B:196:0x05bd, B:198:0x05c3, B:200:0x05d3, B:202:0x05dd, B:203:0x05ee, B:205:0x05f4, B:206:0x060f, B:208:0x0615, B:209:0x0633, B:210:0x0640, B:214:0x0665, B:211:0x0646, B:213:0x0652, B:215:0x066c, B:216:0x0682, B:218:0x0688, B:220:0x069b, B:221:0x06a8, B:222:0x06ac, B:224:0x06b2, B:226:0x06be, B:163:0x04fc, B:165:0x050a, B:168:0x051d, B:170:0x052f, B:172:0x053b, B:174:0x054b, B:176:0x055a, B:179:0x0566, B:181:0x0570, B:183:0x057a, B:186:0x0585, B:188:0x058b, B:190:0x059b, B:191:0x05a6, B:131:0x042f, B:133:0x043b, B:135:0x0447, B:148:0x048d, B:140:0x0465, B:143:0x0477, B:145:0x047d, B:147:0x0487, B:35:0x012b, B:37:0x0138, B:39:0x0144, B:41:0x014a, B:45:0x0155, B:230:0x06ea, B:232:0x06f8, B:234:0x0701, B:245:0x0731, B:235:0x0709, B:237:0x0712, B:239:0x0718, B:242:0x0724, B:244:0x072c, B:246:0x0734, B:247:0x0740, B:250:0x0748, B:252:0x075a, B:253:0x0765, B:255:0x076d, B:259:0x0793, B:261:0x07ad, B:263:0x07c2, B:265:0x07dc, B:267:0x07f1, B:268:0x07ff, B:270:0x0805, B:272:0x0815, B:273:0x081c, B:275:0x0828, B:276:0x082f, B:277:0x0832, B:279:0x0874, B:281:0x087a, B:287:0x08a1, B:289:0x08a9, B:290:0x08b2, B:292:0x08b8, B:293:0x08be, B:295:0x08d3, B:297:0x08e3, B:299:0x08f3, B:301:0x08fb, B:302:0x08fe, B:310:0x0974, B:312:0x098d, B:314:0x09a3, B:316:0x09a8, B:318:0x09ac, B:320:0x09b0, B:322:0x09ba, B:324:0x09c3, B:326:0x09c7, B:328:0x09cd, B:330:0x09d8, B:332:0x09e6, B:338:0x0a0e, B:341:0x0a16, B:282:0x0888, B:284:0x088e, B:286:0x0894, B:266:0x07ee, B:262:0x07bf, B:256:0x0773, B:258:0x0779), top: B:482:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04b1 A[Catch: all -> 0x00f6, TryCatch #3 {all -> 0x00f6, blocks: (B:3:0x0017, B:5:0x002e, B:8:0x0038, B:9:0x004e, B:12:0x0060, B:15:0x008a, B:17:0x00bf, B:20:0x00d0, B:22:0x00da, B:227:0x06d0, B:26:0x0107, B:29:0x0119, B:31:0x011f, B:46:0x0163, B:48:0x0171, B:51:0x0191, B:53:0x0197, B:55:0x01a7, B:57:0x01b5, B:59:0x01c5, B:60:0x01d2, B:61:0x01d5, B:64:0x01eb, B:73:0x021e, B:76:0x0228, B:78:0x0236, B:82:0x027d, B:79:0x0253, B:81:0x0263, B:86:0x028a, B:89:0x02bf, B:90:0x02e9, B:92:0x0322, B:94:0x0328, B:97:0x0334, B:99:0x036b, B:100:0x0386, B:102:0x038c, B:104:0x039a, B:108:0x03af, B:105:0x03a3, B:111:0x03b6, B:114:0x03bd, B:115:0x03d5, B:117:0x03ee, B:118:0x03fa, B:121:0x0404, B:127:0x0427, B:124:0x0416, B:149:0x04a5, B:151:0x04b1, B:154:0x04c2, B:156:0x04d3, B:158:0x04df, B:193:0x05ab, B:195:0x05b1, B:196:0x05bd, B:198:0x05c3, B:200:0x05d3, B:202:0x05dd, B:203:0x05ee, B:205:0x05f4, B:206:0x060f, B:208:0x0615, B:209:0x0633, B:210:0x0640, B:214:0x0665, B:211:0x0646, B:213:0x0652, B:215:0x066c, B:216:0x0682, B:218:0x0688, B:220:0x069b, B:221:0x06a8, B:222:0x06ac, B:224:0x06b2, B:226:0x06be, B:163:0x04fc, B:165:0x050a, B:168:0x051d, B:170:0x052f, B:172:0x053b, B:174:0x054b, B:176:0x055a, B:179:0x0566, B:181:0x0570, B:183:0x057a, B:186:0x0585, B:188:0x058b, B:190:0x059b, B:191:0x05a6, B:131:0x042f, B:133:0x043b, B:135:0x0447, B:148:0x048d, B:140:0x0465, B:143:0x0477, B:145:0x047d, B:147:0x0487, B:35:0x012b, B:37:0x0138, B:39:0x0144, B:41:0x014a, B:45:0x0155, B:230:0x06ea, B:232:0x06f8, B:234:0x0701, B:245:0x0731, B:235:0x0709, B:237:0x0712, B:239:0x0718, B:242:0x0724, B:244:0x072c, B:246:0x0734, B:247:0x0740, B:250:0x0748, B:252:0x075a, B:253:0x0765, B:255:0x076d, B:259:0x0793, B:261:0x07ad, B:263:0x07c2, B:265:0x07dc, B:267:0x07f1, B:268:0x07ff, B:270:0x0805, B:272:0x0815, B:273:0x081c, B:275:0x0828, B:276:0x082f, B:277:0x0832, B:279:0x0874, B:281:0x087a, B:287:0x08a1, B:289:0x08a9, B:290:0x08b2, B:292:0x08b8, B:293:0x08be, B:295:0x08d3, B:297:0x08e3, B:299:0x08f3, B:301:0x08fb, B:302:0x08fe, B:310:0x0974, B:312:0x098d, B:314:0x09a3, B:316:0x09a8, B:318:0x09ac, B:320:0x09b0, B:322:0x09ba, B:324:0x09c3, B:326:0x09c7, B:328:0x09cd, B:330:0x09d8, B:332:0x09e6, B:338:0x0a0e, B:341:0x0a16, B:282:0x0888, B:284:0x088e, B:286:0x0894, B:266:0x07ee, B:262:0x07bf, B:256:0x0773, B:258:0x0779), top: B:482:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04fc A[Catch: all -> 0x00f6, TryCatch #3 {all -> 0x00f6, blocks: (B:3:0x0017, B:5:0x002e, B:8:0x0038, B:9:0x004e, B:12:0x0060, B:15:0x008a, B:17:0x00bf, B:20:0x00d0, B:22:0x00da, B:227:0x06d0, B:26:0x0107, B:29:0x0119, B:31:0x011f, B:46:0x0163, B:48:0x0171, B:51:0x0191, B:53:0x0197, B:55:0x01a7, B:57:0x01b5, B:59:0x01c5, B:60:0x01d2, B:61:0x01d5, B:64:0x01eb, B:73:0x021e, B:76:0x0228, B:78:0x0236, B:82:0x027d, B:79:0x0253, B:81:0x0263, B:86:0x028a, B:89:0x02bf, B:90:0x02e9, B:92:0x0322, B:94:0x0328, B:97:0x0334, B:99:0x036b, B:100:0x0386, B:102:0x038c, B:104:0x039a, B:108:0x03af, B:105:0x03a3, B:111:0x03b6, B:114:0x03bd, B:115:0x03d5, B:117:0x03ee, B:118:0x03fa, B:121:0x0404, B:127:0x0427, B:124:0x0416, B:149:0x04a5, B:151:0x04b1, B:154:0x04c2, B:156:0x04d3, B:158:0x04df, B:193:0x05ab, B:195:0x05b1, B:196:0x05bd, B:198:0x05c3, B:200:0x05d3, B:202:0x05dd, B:203:0x05ee, B:205:0x05f4, B:206:0x060f, B:208:0x0615, B:209:0x0633, B:210:0x0640, B:214:0x0665, B:211:0x0646, B:213:0x0652, B:215:0x066c, B:216:0x0682, B:218:0x0688, B:220:0x069b, B:221:0x06a8, B:222:0x06ac, B:224:0x06b2, B:226:0x06be, B:163:0x04fc, B:165:0x050a, B:168:0x051d, B:170:0x052f, B:172:0x053b, B:174:0x054b, B:176:0x055a, B:179:0x0566, B:181:0x0570, B:183:0x057a, B:186:0x0585, B:188:0x058b, B:190:0x059b, B:191:0x05a6, B:131:0x042f, B:133:0x043b, B:135:0x0447, B:148:0x048d, B:140:0x0465, B:143:0x0477, B:145:0x047d, B:147:0x0487, B:35:0x012b, B:37:0x0138, B:39:0x0144, B:41:0x014a, B:45:0x0155, B:230:0x06ea, B:232:0x06f8, B:234:0x0701, B:245:0x0731, B:235:0x0709, B:237:0x0712, B:239:0x0718, B:242:0x0724, B:244:0x072c, B:246:0x0734, B:247:0x0740, B:250:0x0748, B:252:0x075a, B:253:0x0765, B:255:0x076d, B:259:0x0793, B:261:0x07ad, B:263:0x07c2, B:265:0x07dc, B:267:0x07f1, B:268:0x07ff, B:270:0x0805, B:272:0x0815, B:273:0x081c, B:275:0x0828, B:276:0x082f, B:277:0x0832, B:279:0x0874, B:281:0x087a, B:287:0x08a1, B:289:0x08a9, B:290:0x08b2, B:292:0x08b8, B:293:0x08be, B:295:0x08d3, B:297:0x08e3, B:299:0x08f3, B:301:0x08fb, B:302:0x08fe, B:310:0x0974, B:312:0x098d, B:314:0x09a3, B:316:0x09a8, B:318:0x09ac, B:320:0x09b0, B:322:0x09ba, B:324:0x09c3, B:326:0x09c7, B:328:0x09cd, B:330:0x09d8, B:332:0x09e6, B:338:0x0a0e, B:341:0x0a16, B:282:0x0888, B:284:0x088e, B:286:0x0894, B:266:0x07ee, B:262:0x07bf, B:256:0x0773, B:258:0x0779), top: B:482:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05b1 A[Catch: all -> 0x00f6, TryCatch #3 {all -> 0x00f6, blocks: (B:3:0x0017, B:5:0x002e, B:8:0x0038, B:9:0x004e, B:12:0x0060, B:15:0x008a, B:17:0x00bf, B:20:0x00d0, B:22:0x00da, B:227:0x06d0, B:26:0x0107, B:29:0x0119, B:31:0x011f, B:46:0x0163, B:48:0x0171, B:51:0x0191, B:53:0x0197, B:55:0x01a7, B:57:0x01b5, B:59:0x01c5, B:60:0x01d2, B:61:0x01d5, B:64:0x01eb, B:73:0x021e, B:76:0x0228, B:78:0x0236, B:82:0x027d, B:79:0x0253, B:81:0x0263, B:86:0x028a, B:89:0x02bf, B:90:0x02e9, B:92:0x0322, B:94:0x0328, B:97:0x0334, B:99:0x036b, B:100:0x0386, B:102:0x038c, B:104:0x039a, B:108:0x03af, B:105:0x03a3, B:111:0x03b6, B:114:0x03bd, B:115:0x03d5, B:117:0x03ee, B:118:0x03fa, B:121:0x0404, B:127:0x0427, B:124:0x0416, B:149:0x04a5, B:151:0x04b1, B:154:0x04c2, B:156:0x04d3, B:158:0x04df, B:193:0x05ab, B:195:0x05b1, B:196:0x05bd, B:198:0x05c3, B:200:0x05d3, B:202:0x05dd, B:203:0x05ee, B:205:0x05f4, B:206:0x060f, B:208:0x0615, B:209:0x0633, B:210:0x0640, B:214:0x0665, B:211:0x0646, B:213:0x0652, B:215:0x066c, B:216:0x0682, B:218:0x0688, B:220:0x069b, B:221:0x06a8, B:222:0x06ac, B:224:0x06b2, B:226:0x06be, B:163:0x04fc, B:165:0x050a, B:168:0x051d, B:170:0x052f, B:172:0x053b, B:174:0x054b, B:176:0x055a, B:179:0x0566, B:181:0x0570, B:183:0x057a, B:186:0x0585, B:188:0x058b, B:190:0x059b, B:191:0x05a6, B:131:0x042f, B:133:0x043b, B:135:0x0447, B:148:0x048d, B:140:0x0465, B:143:0x0477, B:145:0x047d, B:147:0x0487, B:35:0x012b, B:37:0x0138, B:39:0x0144, B:41:0x014a, B:45:0x0155, B:230:0x06ea, B:232:0x06f8, B:234:0x0701, B:245:0x0731, B:235:0x0709, B:237:0x0712, B:239:0x0718, B:242:0x0724, B:244:0x072c, B:246:0x0734, B:247:0x0740, B:250:0x0748, B:252:0x075a, B:253:0x0765, B:255:0x076d, B:259:0x0793, B:261:0x07ad, B:263:0x07c2, B:265:0x07dc, B:267:0x07f1, B:268:0x07ff, B:270:0x0805, B:272:0x0815, B:273:0x081c, B:275:0x0828, B:276:0x082f, B:277:0x0832, B:279:0x0874, B:281:0x087a, B:287:0x08a1, B:289:0x08a9, B:290:0x08b2, B:292:0x08b8, B:293:0x08be, B:295:0x08d3, B:297:0x08e3, B:299:0x08f3, B:301:0x08fb, B:302:0x08fe, B:310:0x0974, B:312:0x098d, B:314:0x09a3, B:316:0x09a8, B:318:0x09ac, B:320:0x09b0, B:322:0x09ba, B:324:0x09c3, B:326:0x09c7, B:328:0x09cd, B:330:0x09d8, B:332:0x09e6, B:338:0x0a0e, B:341:0x0a16, B:282:0x0888, B:284:0x088e, B:286:0x0894, B:266:0x07ee, B:262:0x07bf, B:256:0x0773, B:258:0x0779), top: B:482:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0709 A[Catch: all -> 0x00f6, TryCatch #3 {all -> 0x00f6, blocks: (B:3:0x0017, B:5:0x002e, B:8:0x0038, B:9:0x004e, B:12:0x0060, B:15:0x008a, B:17:0x00bf, B:20:0x00d0, B:22:0x00da, B:227:0x06d0, B:26:0x0107, B:29:0x0119, B:31:0x011f, B:46:0x0163, B:48:0x0171, B:51:0x0191, B:53:0x0197, B:55:0x01a7, B:57:0x01b5, B:59:0x01c5, B:60:0x01d2, B:61:0x01d5, B:64:0x01eb, B:73:0x021e, B:76:0x0228, B:78:0x0236, B:82:0x027d, B:79:0x0253, B:81:0x0263, B:86:0x028a, B:89:0x02bf, B:90:0x02e9, B:92:0x0322, B:94:0x0328, B:97:0x0334, B:99:0x036b, B:100:0x0386, B:102:0x038c, B:104:0x039a, B:108:0x03af, B:105:0x03a3, B:111:0x03b6, B:114:0x03bd, B:115:0x03d5, B:117:0x03ee, B:118:0x03fa, B:121:0x0404, B:127:0x0427, B:124:0x0416, B:149:0x04a5, B:151:0x04b1, B:154:0x04c2, B:156:0x04d3, B:158:0x04df, B:193:0x05ab, B:195:0x05b1, B:196:0x05bd, B:198:0x05c3, B:200:0x05d3, B:202:0x05dd, B:203:0x05ee, B:205:0x05f4, B:206:0x060f, B:208:0x0615, B:209:0x0633, B:210:0x0640, B:214:0x0665, B:211:0x0646, B:213:0x0652, B:215:0x066c, B:216:0x0682, B:218:0x0688, B:220:0x069b, B:221:0x06a8, B:222:0x06ac, B:224:0x06b2, B:226:0x06be, B:163:0x04fc, B:165:0x050a, B:168:0x051d, B:170:0x052f, B:172:0x053b, B:174:0x054b, B:176:0x055a, B:179:0x0566, B:181:0x0570, B:183:0x057a, B:186:0x0585, B:188:0x058b, B:190:0x059b, B:191:0x05a6, B:131:0x042f, B:133:0x043b, B:135:0x0447, B:148:0x048d, B:140:0x0465, B:143:0x0477, B:145:0x047d, B:147:0x0487, B:35:0x012b, B:37:0x0138, B:39:0x0144, B:41:0x014a, B:45:0x0155, B:230:0x06ea, B:232:0x06f8, B:234:0x0701, B:245:0x0731, B:235:0x0709, B:237:0x0712, B:239:0x0718, B:242:0x0724, B:244:0x072c, B:246:0x0734, B:247:0x0740, B:250:0x0748, B:252:0x075a, B:253:0x0765, B:255:0x076d, B:259:0x0793, B:261:0x07ad, B:263:0x07c2, B:265:0x07dc, B:267:0x07f1, B:268:0x07ff, B:270:0x0805, B:272:0x0815, B:273:0x081c, B:275:0x0828, B:276:0x082f, B:277:0x0832, B:279:0x0874, B:281:0x087a, B:287:0x08a1, B:289:0x08a9, B:290:0x08b2, B:292:0x08b8, B:293:0x08be, B:295:0x08d3, B:297:0x08e3, B:299:0x08f3, B:301:0x08fb, B:302:0x08fe, B:310:0x0974, B:312:0x098d, B:314:0x09a3, B:316:0x09a8, B:318:0x09ac, B:320:0x09b0, B:322:0x09ba, B:324:0x09c3, B:326:0x09c7, B:328:0x09cd, B:330:0x09d8, B:332:0x09e6, B:338:0x0a0e, B:341:0x0a16, B:282:0x0888, B:284:0x088e, B:286:0x0894, B:266:0x07ee, B:262:0x07bf, B:256:0x0773, B:258:0x0779), top: B:482:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0a4b A[Catch: all -> 0x0a7c, TryCatch #4 {all -> 0x0a7c, blocks: (B:304:0x0940, B:305:0x0953, B:307:0x0959, B:406:0x0c1c, B:336:0x09f8, B:344:0x0a31, B:346:0x0a4b, B:347:0x0a53, B:349:0x0a59, B:351:0x0a6b, B:359:0x0a86, B:361:0x0a9a, B:362:0x0abd, B:364:0x0ac9, B:366:0x0adf, B:369:0x0b24, B:375:0x0b40, B:377:0x0b4b, B:379:0x0b4f, B:381:0x0b53, B:383:0x0b57, B:384:0x0b63, B:385:0x0b6f, B:387:0x0b75, B:389:0x0b8b, B:390:0x0b90, B:405:0x0c19, B:391:0x0ba8, B:393:0x0bac, B:397:0x0bcf, B:399:0x0bef, B:400:0x0bf6, B:404:0x0c0c, B:394:0x0bb7, B:407:0x0c2a, B:409:0x0c39, B:410:0x0c3f, B:411:0x0c47, B:413:0x0c4d, B:416:0x0c67, B:418:0x0c77, B:439:0x0cf5, B:420:0x0c90, B:422:0x0c96, B:424:0x0c9e, B:426:0x0ca5, B:432:0x0cb3, B:434:0x0cba, B:436:0x0ce6, B:438:0x0ced, B:437:0x0cea, B:433:0x0cb7, B:425:0x0ca2), top: B:484:0x0940 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0a84 A[PHI: r10
      0x0a84: PHI (r10v7 java.lang.String) = (r10v6 java.lang.String), (r10v22 java.lang.String) binds: [B:345:0x0a49, B:541:0x0a84] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0a9a A[Catch: all -> 0x0a7c, TryCatch #4 {all -> 0x0a7c, blocks: (B:304:0x0940, B:305:0x0953, B:307:0x0959, B:406:0x0c1c, B:336:0x09f8, B:344:0x0a31, B:346:0x0a4b, B:347:0x0a53, B:349:0x0a59, B:351:0x0a6b, B:359:0x0a86, B:361:0x0a9a, B:362:0x0abd, B:364:0x0ac9, B:366:0x0adf, B:369:0x0b24, B:375:0x0b40, B:377:0x0b4b, B:379:0x0b4f, B:381:0x0b53, B:383:0x0b57, B:384:0x0b63, B:385:0x0b6f, B:387:0x0b75, B:389:0x0b8b, B:390:0x0b90, B:405:0x0c19, B:391:0x0ba8, B:393:0x0bac, B:397:0x0bcf, B:399:0x0bef, B:400:0x0bf6, B:404:0x0c0c, B:394:0x0bb7, B:407:0x0c2a, B:409:0x0c39, B:410:0x0c3f, B:411:0x0c47, B:413:0x0c4d, B:416:0x0c67, B:418:0x0c77, B:439:0x0cf5, B:420:0x0c90, B:422:0x0c96, B:424:0x0c9e, B:426:0x0ca5, B:432:0x0cb3, B:434:0x0cba, B:436:0x0ce6, B:438:0x0ced, B:437:0x0cea, B:433:0x0cb7, B:425:0x0ca2), top: B:484:0x0940 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0abd A[Catch: all -> 0x0a7c, TryCatch #4 {all -> 0x0a7c, blocks: (B:304:0x0940, B:305:0x0953, B:307:0x0959, B:406:0x0c1c, B:336:0x09f8, B:344:0x0a31, B:346:0x0a4b, B:347:0x0a53, B:349:0x0a59, B:351:0x0a6b, B:359:0x0a86, B:361:0x0a9a, B:362:0x0abd, B:364:0x0ac9, B:366:0x0adf, B:369:0x0b24, B:375:0x0b40, B:377:0x0b4b, B:379:0x0b4f, B:381:0x0b53, B:383:0x0b57, B:384:0x0b63, B:385:0x0b6f, B:387:0x0b75, B:389:0x0b8b, B:390:0x0b90, B:405:0x0c19, B:391:0x0ba8, B:393:0x0bac, B:397:0x0bcf, B:399:0x0bef, B:400:0x0bf6, B:404:0x0c0c, B:394:0x0bb7, B:407:0x0c2a, B:409:0x0c39, B:410:0x0c3f, B:411:0x0c47, B:413:0x0c4d, B:416:0x0c67, B:418:0x0c77, B:439:0x0cf5, B:420:0x0c90, B:422:0x0c96, B:424:0x0c9e, B:426:0x0ca5, B:432:0x0cb3, B:434:0x0cba, B:436:0x0ce6, B:438:0x0ced, B:437:0x0cea, B:433:0x0cb7, B:425:0x0ca2), top: B:484:0x0940 }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0b3b  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0b40 A[Catch: all -> 0x0a7c, TryCatch #4 {all -> 0x0a7c, blocks: (B:304:0x0940, B:305:0x0953, B:307:0x0959, B:406:0x0c1c, B:336:0x09f8, B:344:0x0a31, B:346:0x0a4b, B:347:0x0a53, B:349:0x0a59, B:351:0x0a6b, B:359:0x0a86, B:361:0x0a9a, B:362:0x0abd, B:364:0x0ac9, B:366:0x0adf, B:369:0x0b24, B:375:0x0b40, B:377:0x0b4b, B:379:0x0b4f, B:381:0x0b53, B:383:0x0b57, B:384:0x0b63, B:385:0x0b6f, B:387:0x0b75, B:389:0x0b8b, B:390:0x0b90, B:405:0x0c19, B:391:0x0ba8, B:393:0x0bac, B:397:0x0bcf, B:399:0x0bef, B:400:0x0bf6, B:404:0x0c0c, B:394:0x0bb7, B:407:0x0c2a, B:409:0x0c39, B:410:0x0c3f, B:411:0x0c47, B:413:0x0c4d, B:416:0x0c67, B:418:0x0c77, B:439:0x0cf5, B:420:0x0c90, B:422:0x0c96, B:424:0x0c9e, B:426:0x0ca5, B:432:0x0cb3, B:434:0x0cba, B:436:0x0ce6, B:438:0x0ced, B:437:0x0cea, B:433:0x0cb7, B:425:0x0ca2), top: B:484:0x0940 }] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0b6f A[Catch: all -> 0x0a7c, TryCatch #4 {all -> 0x0a7c, blocks: (B:304:0x0940, B:305:0x0953, B:307:0x0959, B:406:0x0c1c, B:336:0x09f8, B:344:0x0a31, B:346:0x0a4b, B:347:0x0a53, B:349:0x0a59, B:351:0x0a6b, B:359:0x0a86, B:361:0x0a9a, B:362:0x0abd, B:364:0x0ac9, B:366:0x0adf, B:369:0x0b24, B:375:0x0b40, B:377:0x0b4b, B:379:0x0b4f, B:381:0x0b53, B:383:0x0b57, B:384:0x0b63, B:385:0x0b6f, B:387:0x0b75, B:389:0x0b8b, B:390:0x0b90, B:405:0x0c19, B:391:0x0ba8, B:393:0x0bac, B:397:0x0bcf, B:399:0x0bef, B:400:0x0bf6, B:404:0x0c0c, B:394:0x0bb7, B:407:0x0c2a, B:409:0x0c39, B:410:0x0c3f, B:411:0x0c47, B:413:0x0c4d, B:416:0x0c67, B:418:0x0c77, B:439:0x0cf5, B:420:0x0c90, B:422:0x0c96, B:424:0x0c9e, B:426:0x0ca5, B:432:0x0cb3, B:434:0x0cba, B:436:0x0ce6, B:438:0x0ced, B:437:0x0cea, B:433:0x0cb7, B:425:0x0ca2), top: B:484:0x0940 }] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0cfb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0d5d  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0d7c  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0dad A[Catch: all -> 0x0d21, TryCatch #1 {all -> 0x0d21, blocks: (B:442:0x0cfd, B:444:0x0d12, B:447:0x0d19, B:454:0x0d4d, B:456:0x0d5f, B:457:0x0d76, B:460:0x0d7e, B:461:0x0d83, B:462:0x0d93, B:464:0x0dad, B:465:0x0dc8, B:466:0x0dd0, B:470:0x0dee, B:469:0x0ddb, B:450:0x0d24, B:452:0x0d30, B:453:0x0d36, B:471:0x0df7), top: B:479:0x002c, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r11v14, types: [com.google.android.gms.internal.measurement.M2, com.google.android.gms.internal.measurement.X4] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [com.google.android.gms.internal.measurement.M2, com.google.android.gms.internal.measurement.X4] */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [com.google.android.gms.internal.measurement.M2, com.google.android.gms.internal.measurement.X4] */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [X6.R6] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [X6.R6] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v20 */
    /* JADX WARN: Type inference failed for: r21v21 */
    /* JADX WARN: Type inference failed for: r21v22 */
    /* JADX WARN: Type inference failed for: r21v23 */
    /* JADX WARN: Type inference failed for: r28v10 */
    /* JADX WARN: Type inference failed for: r28v14 */
    /* JADX WARN: Type inference failed for: r28v15 */
    /* JADX WARN: Type inference failed for: r28v16 */
    /* JADX WARN: Type inference failed for: r28v17 */
    /* JADX WARN: Type inference failed for: r28v18 */
    /* JADX WARN: Type inference failed for: r28v19 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v20 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v115 */
    /* JADX WARN: Type inference failed for: r2v116 */
    /* JADX WARN: Type inference failed for: r2v117 */
    /* JADX WARN: Type inference failed for: r2v118 */
    /* JADX WARN: Type inference failed for: r2v119 */
    /* JADX WARN: Type inference failed for: r2v120 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [X6.R6] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33, types: [X6.R6] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X6.R6] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X6.R6] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r9v10, types: [com.google.android.gms.internal.measurement.Y2] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v17, types: [com.google.android.gms.internal.measurement.Y2] */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.google.android.gms.internal.measurement.X4, com.google.android.gms.internal.measurement.Y2] */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.google.android.gms.internal.measurement.Y2] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean M(java.lang.String r44, long r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.R6.M(java.lang.String, long):boolean");
    }

    public final C2486s2 M0() {
        return this.f18537l.D();
    }

    public final void N(com.google.android.gms.internal.measurement.Y2 y22, long j10, boolean z10) {
        Object obj;
        String str = true != z10 ? "_lte" : "_se";
        Y6 y6B0 = F0().B0(y22.J(), str);
        Y6 y62 = (y6B0 == null || (obj = y6B0.f18663e) == null) ? new Y6(y22.J(), "auto", str, e().a(), Long.valueOf(j10)) : new Y6(y22.J(), "auto", str, e().a(), Long.valueOf(((Long) obj).longValue() + j10));
        C3281p3 c3281p3O = C3290q3.O();
        c3281p3O.A(str);
        c3281p3O.z(e().a());
        Object obj2 = y62.f18663e;
        c3281p3O.D(((Long) obj2).longValue());
        C3290q3 c3290q3 = (C3290q3) c3281p3O.w();
        int iX = V6.X(y22, str);
        if (iX >= 0) {
            y22.i1(iX, c3290q3);
        } else {
            y22.j1(c3290q3);
        }
        if (j10 > 0) {
            F0().A0(y62);
            a().w().c("Updated engagement user property. scope, value", true != z10 ? "lifetime" : "session-scoped", obj2);
        }
    }

    public final a7 N0() {
        return ((C2416j3) AbstractC6056k.l(this.f18537l)).C();
    }

    public final boolean O(com.google.android.gms.internal.measurement.M2 m22, com.google.android.gms.internal.measurement.M2 m23) {
        AbstractC6056k.a("_e".equals(m22.J()));
        K0();
        com.google.android.gms.internal.measurement.R2 r2R = V6.r((com.google.android.gms.internal.measurement.N2) m22.w(), "_sc");
        String strG = r2R == null ? null : r2R.G();
        K0();
        com.google.android.gms.internal.measurement.R2 r2R2 = V6.r((com.google.android.gms.internal.measurement.N2) m23.w(), "_pc");
        String strG2 = r2R2 != null ? r2R2.G() : null;
        if (strG2 == null || !strG2.equals(strG)) {
            return false;
        }
        AbstractC6056k.a("_e".equals(m22.J()));
        K0();
        com.google.android.gms.internal.measurement.R2 r2R3 = V6.r((com.google.android.gms.internal.measurement.N2) m22.w(), "_et");
        if (r2R3 == null || !r2R3.H() || r2R3.I() <= 0) {
            return true;
        }
        long jI = r2R3.I();
        K0();
        com.google.android.gms.internal.measurement.R2 r2R4 = V6.r((com.google.android.gms.internal.measurement.N2) m23.w(), "_et");
        if (r2R4 != null && r2R4.I() > 0) {
            jI += r2R4.I();
        }
        K0();
        V6.o(m23, "_et", Long.valueOf(jI));
        K0();
        V6.o(m22, "_fr", 1L);
        return true;
    }

    public final void O0() {
        if (!this.f18538m.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final boolean P() {
        b().h();
        O0();
        return F0().B() || !TextUtils.isEmpty(F0().r());
    }

    public final void P0(c7 c7Var) {
        b().h();
        O0();
        String str = c7Var.f18743a;
        AbstractC6056k.f(str);
        S3 s3F = S3.f(c7Var.f18761s, c7Var.f18766x);
        g(str);
        a().w().c("Setting storage consent for package", str, s3F);
        f(str, s3F);
    }

    public final void Q0(c7 c7Var) {
        b().h();
        O0();
        String str = c7Var.f18743a;
        AbstractC6056k.f(str);
        A aG = A.g(c7Var.f18767y);
        a().w().c("Setting DMA consent for package", str, aG);
        b().h();
        O0();
        P3 p3C = A.h(S0(str), 100).c();
        this.f18518C.put(str, aG);
        F0().V(str, aG);
        P3 p3C2 = A.h(S0(str), 100).c();
        b().h();
        O0();
        P3 p32 = P3.DENIED;
        boolean z10 = p3C == p32 && p3C2 == P3.GRANTED;
        boolean z11 = p3C == P3.GRANTED && p3C2 == p32;
        if (z10 || z11) {
            a().w().b("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (F0().L0(h(), str, false, false, false, false, false, false, false).f19200f < B0().E(str, AbstractC2383f2.f18908n0)) {
                bundle.putLong("_r", 1L);
                a().w().c("_dcu realtime event count", str, Long.valueOf(F0().L0(h(), str, false, false, false, false, false, true, false).f19200f));
            }
            this.f18525J.a(str, "_dcu", bundle);
        }
    }

    public final void R() {
        long jMax;
        long jMax2;
        b().h();
        O0();
        if (this.f18540o > 0) {
            long jAbs = 3600000 - Math.abs(e().c() - this.f18540o);
            if (jAbs > 0) {
                a().w().b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                G0().b();
                H0().n();
                return;
            }
            this.f18540o = 0L;
        }
        if (!this.f18537l.m() || !P()) {
            a().w().a("Nothing to upload or uploading impossible");
            G0().b();
            H0().n();
            return;
        }
        long jA = e().a();
        B0();
        long jMax3 = Math.max(0L, ((Long) AbstractC2383f2.f18847P.b(null)).longValue());
        boolean z10 = true;
        if (!F0().D() && !F0().s()) {
            z10 = false;
        }
        if (z10) {
            String strI = B0().i();
            if (TextUtils.isEmpty(strI) || ".none.".equals(strI)) {
                B0();
                jMax = Math.max(0L, ((Long) AbstractC2383f2.f18835J.b(null)).longValue());
            } else {
                B0();
                jMax = Math.max(0L, ((Long) AbstractC2383f2.f18837K.b(null)).longValue());
            }
        } else {
            B0();
            jMax = Math.max(0L, ((Long) AbstractC2383f2.f18833I.b(null)).longValue());
        }
        long jA2 = this.f18534i.f18636h.a();
        long jA3 = this.f18534i.f18637i.a();
        long j10 = 0;
        boolean z11 = z10;
        long jMax4 = Math.max(F0().y(), F0().A());
        if (jMax4 == 0) {
            jMax2 = 0;
        } else {
            long jAbs2 = jA - Math.abs(jMax4 - jA);
            long jAbs3 = jA - Math.abs(jA2 - jA);
            long jAbs4 = jA - Math.abs(jA3 - jA);
            jMax2 = jMax3 + jAbs2;
            long jMax5 = Math.max(jAbs3, jAbs4);
            if (z11 && jMax5 > 0) {
                jMax2 = Math.min(jAbs2, jMax5) + jMax;
            }
            if (!K0().S(jMax5, jMax)) {
                jMax2 = jMax5 + jMax;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i10 = 0;
                while (true) {
                    B0();
                    if (i10 >= Math.min(20, Math.max(0, ((Integer) AbstractC2383f2.f18851R.b(null)).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    B0();
                    jMax2 += Math.max(j10, ((Long) AbstractC2383f2.f18849Q.b(null)).longValue()) * (1 << i10);
                    if (jMax2 > jAbs4) {
                        break;
                    }
                    i10++;
                    j10 = 0;
                }
            }
            j10 = 0;
        }
        if (jMax2 == j10) {
            a().w().a("Next upload time is 0");
            G0().b();
            H0().n();
            return;
        }
        if (!E0().m()) {
            a().w().a("No network");
            G0().a();
            H0().n();
            return;
        }
        long jA4 = this.f18534i.f18635g.a();
        B0();
        long jMax6 = Math.max(0L, ((Long) AbstractC2383f2.f18829G.b(null)).longValue());
        if (!K0().S(jA4, jMax6)) {
            jMax2 = Math.max(jMax2, jA4 + jMax6);
        }
        G0().b();
        long jA5 = jMax2 - e().a();
        if (jA5 <= 0) {
            B0();
            jA5 = Math.max(0L, ((Long) AbstractC2383f2.f18839L.b(null)).longValue());
            this.f18534i.f18636h.b(e().a());
        }
        a().w().b("Upload scheduled in approximately ms", Long.valueOf(jA5));
        H0().m(jA5);
    }

    public final A R0(String str) {
        b().h();
        O0();
        Map map = this.f18518C;
        A a10 = (A) map.get(str);
        if (a10 != null) {
            return a10;
        }
        A aU = F0().U(str);
        map.put(str, aU);
        return aU;
    }

    public final void S() {
        b().h();
        if (this.f18545t || this.f18546u || this.f18547v) {
            a().w().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f18545t), Boolean.valueOf(this.f18546u), Boolean.valueOf(this.f18547v));
            return;
        }
        a().w().a("Stopping uploading service(s)");
        List list = this.f18541p;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) AbstractC6056k.l(this.f18541p)).clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final Bundle S0(String str) {
        b().h();
        O0();
        if (D0().R(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        S3 s3G = g(str);
        bundle.putAll(s3G.n());
        bundle.putAll(T0(str, R0(str), s3G, new C2452o()).f());
        Y6 y6B0 = F0().B0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (y6B0 != null ? y6B0.f18663e.equals(1L) : I(str, new C2452o())) ? "granted" : "denied");
        return bundle;
    }

    public final Boolean T(F2 f22) {
        try {
            if (f22.F0() != -2147483648L) {
                if (f22.F0() == D6.d.a(this.f18537l.d()).e(f22.o0(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = D6.d.a(this.f18537l.d()).e(f22.o0(), 0).versionName;
                String strD0 = f22.D0();
                if (strD0 != null && strD0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X6.A T0(java.lang.String r10, X6.A r11, X6.S3 r12, X6.C2452o r13) {
        /*
            r9 = this;
            X6.a3 r0 = r9.D0()
            com.google.android.gms.internal.measurement.Z1 r0 = r0.R(r10)
            java.lang.String r1 = "-"
            r2 = 90
            if (r0 != 0) goto L31
            X6.P3 r9 = r11.c()
            X6.P3 r10 = X6.P3.DENIED
            if (r9 != r10) goto L20
            int r2 = r11.b()
            X6.R3 r9 = X6.R3.AD_USER_DATA
            r13.b(r9, r2)
            goto L27
        L20:
            X6.R3 r9 = X6.R3.AD_USER_DATA
            X6.n r10 = X6.EnumC2444n.FAILSAFE
            r13.c(r9, r10)
        L27:
            X6.A r9 = new X6.A
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r9.<init>(r10, r2, r11, r1)
            return r9
        L31:
            X6.P3 r0 = r11.c()
            X6.P3 r3 = X6.P3.GRANTED
            if (r0 == r3) goto L85
            X6.P3 r4 = X6.P3.DENIED
            if (r0 != r4) goto L3e
            goto L85
        L3e:
            X6.P3 r11 = X6.P3.POLICY
            if (r0 != r11) goto L55
            X6.a3 r11 = r9.f18526a
            X6.R3 r0 = X6.R3.AD_USER_DATA
            X6.P3 r11 = r11.m(r10, r0)
            X6.P3 r5 = X6.P3.UNINITIALIZED
            if (r11 == r5) goto L55
            X6.n r12 = X6.EnumC2444n.REMOTE_ENFORCED_DEFAULT
            r13.c(r0, r12)
            r0 = r11
            goto L8e
        L55:
            X6.a3 r11 = r9.f18526a
            X6.R3 r0 = X6.R3.AD_USER_DATA
            X6.R3 r5 = r11.Q(r10, r0)
            X6.P3 r12 = r12.p()
            r6 = 1
            if (r12 == r3) goto L66
            if (r12 != r4) goto L68
        L66:
            r7 = r6
            goto L69
        L68:
            r7 = 0
        L69:
            X6.R3 r8 = X6.R3.AD_STORAGE
            if (r5 != r8) goto L76
            if (r7 == 0) goto L76
            X6.n r11 = X6.EnumC2444n.REMOTE_DELEGATION
            r13.c(r0, r11)
            r0 = r12
            goto L8e
        L76:
            X6.n r12 = X6.EnumC2444n.REMOTE_DEFAULT
            r13.c(r0, r12)
            boolean r11 = r11.P(r10, r0)
            if (r6 == r11) goto L83
            r0 = r4
            goto L8e
        L83:
            r0 = r3
            goto L8e
        L85:
            int r2 = r11.b()
            X6.R3 r11 = X6.R3.AD_USER_DATA
            r13.b(r11, r2)
        L8e:
            X6.a3 r11 = r9.f18526a
            boolean r11 = r11.S(r10)
            X6.a3 r9 = r9.D0()
            java.util.SortedSet r9 = r9.T(r10)
            X6.P3 r10 = X6.P3.DENIED
            if (r0 == r10) goto Lbb
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto La7
            goto Lbb
        La7:
            X6.A r10 = new X6.A
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r11)
            java.lang.String r0 = ""
            if (r11 == 0) goto Lb7
            java.lang.String r0 = android.text.TextUtils.join(r0, r9)
        Lb7:
            r10.<init>(r12, r2, r13, r0)
            return r10
        Lbb:
            X6.A r9 = new X6.A
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r9.<init>(r10, r2, r11, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.R6.T0(java.lang.String, X6.A, X6.S3, X6.o):X6.A");
    }

    public final c7 U(String str) {
        F2 f2J0 = F0().J0(str);
        if (f2J0 == null || TextUtils.isEmpty(f2J0.D0())) {
            a().v().b("No app data available; dropping", str);
            return null;
        }
        Boolean boolT = T(f2J0);
        if (boolT == null || boolT.booleanValue()) {
            return new c7(str, f2J0.r0(), f2J0.D0(), f2J0.F0(), f2J0.H0(), f2J0.J0(), f2J0.L0(), (String) null, f2J0.d(), false, f2J0.x0(), 0L, 0, f2J0.P(), false, f2J0.R(), f2J0.b(), f2J0.T(), g(str).l(), "", (String) null, f2J0.V(), f2J0.X(), g(str).b(), R0(str).e(), f2J0.b0(), f2J0.j0(), f2J0.l0(), f2J0.I(), 0L, f2J0.M());
        }
        a().o().b("App version does not match; dropping. appId", C2542z2.x(str));
        return null;
    }

    public final boolean V(String str, String str2) {
        E eV0 = F0().v0(str, str2);
        return eV0 == null || eV0.f18223c < 1;
    }

    @Override // X6.N3
    public final C2542z2 a() {
        return ((C2416j3) AbstractC6056k.l(this.f18537l)).a();
    }

    public final boolean a0() {
        b().h();
        FileLock fileLock = this.f18548w;
        if (fileLock != null && fileLock.isValid()) {
            a().w().a("Storage concurrent access okay");
            return true;
        }
        this.f18528c.f18400a.w();
        File filesDir = this.f18537l.d().getFilesDir();
        com.google.android.gms.internal.measurement.W.a();
        AbstractC3161c0 abstractC3161c0 = AbstractC3161c0.f29429a;
        try {
            FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
            this.f18549x = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.f18548w = fileLockTryLock;
            if (fileLockTryLock != null) {
                a().w().a("Storage concurrent access okay");
                return true;
            }
            a().o().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e10) {
            a().o().b("Failed to acquire storage lock", e10);
            return false;
        } catch (IOException e11) {
            a().o().b("Failed to access storage lock file", e11);
            return false;
        } catch (OverlappingFileLockException e12) {
            a().r().b("Storage lock already acquired", e12);
            return false;
        }
    }

    @Override // X6.N3
    public final C2384f3 b() {
        return ((C2416j3) AbstractC6056k.l(this.f18537l)).b();
    }

    public final void b0(c7 c7Var) {
        if (this.f18550y != null) {
            ArrayList arrayList = new ArrayList();
            this.f18551z = arrayList;
            arrayList.addAll(this.f18550y);
        }
        C2515w c2515wF0 = F0();
        String str = (String) AbstractC6056k.l(c7Var.f18743a);
        AbstractC6056k.f(str);
        c2515wF0.h();
        c2515wF0.j();
        try {
            SQLiteDatabase sQLiteDatabaseU0 = c2515wF0.u0();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseU0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseU0.delete("events", "app_id=?", strArr) + sQLiteDatabaseU0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseU0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseU0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseU0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseU0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseU0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseU0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseU0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseU0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseU0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseU0.delete("upload_queue", "app_id=?", strArr);
            com.google.android.gms.internal.measurement.F6.a();
            C2416j3 c2416j3 = c2515wF0.f18400a;
            if (c2416j3.w().H(null, AbstractC2383f2.f18895i1)) {
                iDelete += sQLiteDatabaseU0.delete("no_data_mode_events", "app_id=?", strArr);
            }
            if (iDelete > 0) {
                c2416j3.a().w().c("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e10) {
            c2515wF0.f18400a.a().o().c("Error resetting analytics data. appId, error", C2542z2.x(str), e10);
        }
        if (c7Var.f18750h) {
            h0(c7Var);
        }
    }

    @Override // X6.N3
    public final C2380f c() {
        return this.f18537l.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c0(X6.W6 r22, X6.c7 r23) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.R6.c0(X6.W6, X6.c7):void");
    }

    @Override // X6.N3
    public final Context d() {
        return this.f18537l.d();
    }

    public final void d0(String str, c7 c7Var) {
        b().h();
        O0();
        if (X(c7Var)) {
            if (!c7Var.f18750h) {
                o0(c7Var);
                return;
            }
            Boolean boolZ = Z(c7Var);
            if ("_npa".equals(str) && boolZ != null) {
                a().v().a("Falling back to manifest metadata value for ad personalization");
                c0(new W6("_npa", e().a(), Long.valueOf(true != boolZ.booleanValue() ? 0L : 1L), "auto"), c7Var);
                return;
            }
            C2526x2 c2526x2V = a().v();
            C2416j3 c2416j3 = this.f18537l;
            c2526x2V.b("Removing user property", c2416j3.D().c(str));
            F0().r0();
            try {
                o0(c7Var);
                if ("_id".equals(str)) {
                    F0().z0((String) AbstractC6056k.l(c7Var.f18743a), "_lair");
                }
                F0().z0((String) AbstractC6056k.l(c7Var.f18743a), str);
                F0().s0();
                a().v().b("User property removed", c2416j3.D().c(str));
                F0().t0();
            } catch (Throwable th) {
                F0().t0();
                throw th;
            }
        }
    }

    @Override // X6.N3
    public final B6.e e() {
        return ((C2416j3) AbstractC6056k.l(this.f18537l)).e();
    }

    public final void e0() {
        this.f18543r++;
    }

    public final void f(String str, S3 s32) {
        b().h();
        O0();
        this.f18517B.put(str, s32);
        F0().L(str, s32);
    }

    public final void f0() {
        this.f18544s++;
    }

    public final S3 g(String str) {
        S3 s32 = S3.f18556c;
        b().h();
        O0();
        S3 s3J = (S3) this.f18517B.get(str);
        if (s3J == null) {
            s3J = F0().J(str);
            if (s3J == null) {
                s3J = S3.f18556c;
            }
            f(str, s3J);
        }
        return s3J;
    }

    public final C2416j3 g0() {
        return this.f18537l;
    }

    public final long h() {
        long jA = e().a();
        W5 w52 = this.f18534i;
        w52.j();
        w52.h();
        K2 k22 = w52.f18638j;
        long jA2 = k22.a();
        if (jA2 == 0) {
            jA2 = ((long) w52.f18400a.C().q0().nextInt(86400000)) + 1;
            k22.b(jA2);
        }
        return ((((jA + jA2) / 1000) / 60) / 60) / 24;
    }

    public final void h0(c7 c7Var) {
        long j10;
        long j11;
        E eV0;
        boolean z10;
        String str;
        PackageInfo packageInfoE;
        ApplicationInfo applicationInfoC;
        long j12;
        boolean z11;
        b().h();
        O0();
        AbstractC6056k.l(c7Var);
        String str2 = c7Var.f18743a;
        AbstractC6056k.f(str2);
        if (X(c7Var)) {
            F2 f2J0 = F0().J0(str2);
            if (f2J0 != null && TextUtils.isEmpty(f2J0.r0()) && !TextUtils.isEmpty(c7Var.f18744b)) {
                f2J0.i(0L);
                F0().K0(f2J0, false, false);
                D0().B(str2);
            }
            if (!c7Var.f18750h) {
                o0(c7Var);
                return;
            }
            long jA = c7Var.f18754l;
            if (jA == 0) {
                jA = e().a();
            }
            long j13 = jA;
            int i10 = c7Var.f18755m;
            if (i10 != 0 && i10 != 1) {
                a().r().c("Incorrect app type, assuming installed app. appId, appType", C2542z2.x(str2), Integer.valueOf(i10));
                i10 = 0;
            }
            F0().r0();
            try {
                Y6 y6B0 = F0().B0(str2, "_npa");
                Boolean boolZ = Z(c7Var);
                if (y6B0 != null && !"auto".equals(y6B0.f18660b)) {
                    j10 = j13;
                    j11 = 1;
                } else if (boolZ != null) {
                    W6 w62 = new W6("_npa", j13, Long.valueOf(true != boolZ.booleanValue() ? 0L : 1L), "auto");
                    j11 = 1;
                    j10 = j13;
                    if (y6B0 == null || !y6B0.f18663e.equals(w62.f18642d)) {
                        c0(w62, c7Var);
                    }
                } else {
                    j10 = j13;
                    j11 = 1;
                    if (y6B0 != null) {
                        d0("_npa", c7Var);
                    }
                }
                if (B0().H(null, AbstractC2383f2.f18877c1)) {
                    n0(c7Var, c7Var.f18741D);
                } else {
                    n0(c7Var, j10);
                }
                o0(c7Var);
                if (i10 == 0) {
                    eV0 = F0().v0(str2, "_f");
                    z10 = false;
                } else {
                    eV0 = F0().v0(str2, "_v");
                    z10 = true;
                }
                if (eV0 == null) {
                    long j14 = ((j10 / 3600000) + j11) * 3600000;
                    if (z10) {
                        long j15 = j10;
                        c0(new W6("_fvt", j15, Long.valueOf(j14), "auto"), c7Var);
                        b().h();
                        O0();
                        Bundle bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        bundle.putLong("_r", 1L);
                        bundle.putLong("_et", 1L);
                        if (c7Var.f18757o) {
                            bundle.putLong("_dac", 1L);
                        }
                        if (B0().H(null, AbstractC2383f2.f18901k1)) {
                            bundle.putLong("_elt", e().a());
                        }
                        j(new I("_v", new G(bundle), "auto", j15), c7Var);
                    } else {
                        Long lValueOf = Long.valueOf(j14);
                        long j16 = j10;
                        c0(new W6("_fot", j16, lValueOf, "auto"), c7Var);
                        b().h();
                        Q2 q22 = (Q2) AbstractC6056k.l(this.f18536k);
                        if (str2 == null || str2.isEmpty()) {
                            str = "_elt";
                            q22.f18480a.a().s().a("Install Referrer Reporter was called with invalid app package name");
                        } else {
                            C2416j3 c2416j3 = q22.f18480a;
                            c2416j3.b().h();
                            if (q22.a()) {
                                P2 p22 = new P2(q22, str2);
                                c2416j3.b().h();
                                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                str = "_elt";
                                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                PackageManager packageManager = c2416j3.d().getPackageManager();
                                if (packageManager == null) {
                                    c2416j3.a().s().a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                } else {
                                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                        c2416j3.a().u().a("Play Service for fetching Install Referrer is unavailable on device");
                                    } else {
                                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                        if (serviceInfo != null) {
                                            String str3 = serviceInfo.packageName;
                                            if (serviceInfo.name != null && "com.android.vending".equals(str3) && q22.a()) {
                                                try {
                                                    c2416j3.a().w().b("Install Referrer Service is", A6.a.b().a(c2416j3.d(), new Intent(intent), p22, 1) ? "available" : "not available");
                                                } catch (RuntimeException e10) {
                                                    q22.f18480a.a().o().b("Exception occurred while binding to Install Referrer Service", e10.getMessage());
                                                }
                                            } else {
                                                c2416j3.a().r().a("Play Store version 8.3.73 or higher required for Install Referrer");
                                            }
                                        }
                                    }
                                }
                            } else {
                                c2416j3.a().u().a("Install Referrer Reporter is not available");
                                str = "_elt";
                            }
                        }
                        b().h();
                        O0();
                        Bundle bundle2 = new Bundle();
                        long j17 = j11;
                        bundle2.putLong("_c", j17);
                        bundle2.putLong("_r", j17);
                        bundle2.putLong("_uwa", 0L);
                        bundle2.putLong("_pfo", 0L);
                        bundle2.putLong("_sys", 0L);
                        bundle2.putLong("_sysu", 0L);
                        bundle2.putLong("_et", j17);
                        if (c7Var.f18757o) {
                            bundle2.putLong("_dac", j17);
                        }
                        String str4 = (String) AbstractC6056k.l(c7Var.f18743a);
                        C2515w c2515wF0 = F0();
                        AbstractC6056k.f(str4);
                        c2515wF0.h();
                        c2515wF0.j();
                        long jZ = c2515wF0.z(str4, "first_open_count");
                        C2416j3 c2416j32 = this.f18537l;
                        if (c2416j32.d().getPackageManager() == null) {
                            a().o().b("PackageManager is null, first open report might be inaccurate. appId", C2542z2.x(str4));
                        } else {
                            try {
                                packageInfoE = D6.d.a(c2416j32.d()).e(str4, 0);
                            } catch (PackageManager.NameNotFoundException e11) {
                                a().o().c("Package info is null, first open report might be inaccurate. appId", C2542z2.x(str4), e11);
                                packageInfoE = null;
                            }
                            if (packageInfoE != null) {
                                long j18 = packageInfoE.firstInstallTime;
                                if (j18 != 0) {
                                    if (j18 != packageInfoE.lastUpdateTime) {
                                        if (!B0().H(null, AbstractC2383f2.f18836J0)) {
                                            bundle2.putLong("_uwa", 1L);
                                        } else if (jZ == 0) {
                                            bundle2.putLong("_uwa", 1L);
                                            jZ = 0;
                                        }
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    c0(new W6("_fi", j16, Long.valueOf(true != z11 ? 0L : 1L), "auto"), c7Var);
                                }
                            }
                            try {
                                applicationInfoC = D6.d.a(this.f18537l.d()).c(str4, 0);
                            } catch (PackageManager.NameNotFoundException e12) {
                                a().o().c("Application info is null, first open report might be inaccurate. appId", C2542z2.x(str4), e12);
                                applicationInfoC = null;
                            }
                            if (applicationInfoC != null) {
                                if ((applicationInfoC.flags & 1) != 0) {
                                    j12 = 1;
                                    bundle2.putLong("_sys", 1L);
                                } else {
                                    j12 = 1;
                                }
                                if ((applicationInfoC.flags & 128) != 0) {
                                    bundle2.putLong("_sysu", j12);
                                }
                            }
                        }
                        if (jZ >= 0) {
                            bundle2.putLong("_pfo", jZ);
                        }
                        if (B0().H(null, AbstractC2383f2.f18901k1)) {
                            bundle2.putLong(str, e().a());
                        }
                        j(new I("_f", new G(bundle2), "auto", j16), c7Var);
                    }
                } else {
                    long j19 = j10;
                    if (c7Var.f18751i) {
                        j(new I("_cd", new G(new Bundle()), "auto", j19), c7Var);
                    }
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th) {
                F0().t0();
                throw th;
            }
        }
    }

    public final void i(I i10, String str) {
        F2 f2J0 = F0().J0(str);
        if (f2J0 == null || TextUtils.isEmpty(f2J0.D0())) {
            a().v().b("No app data available; dropping event", str);
            return;
        }
        Boolean boolT = T(f2J0);
        if (boolT == null) {
            if (!"_ui".equals(i10.f18343a)) {
                a().r().b("Could not find package. appId", C2542z2.x(str));
            }
        } else if (!boolT.booleanValue()) {
            a().o().b("App version does not match; dropping event. appId", C2542z2.x(str));
            return;
        }
        j(i10, new c7(str, f2J0.r0(), f2J0.D0(), f2J0.F0(), f2J0.H0(), f2J0.J0(), f2J0.L0(), (String) null, f2J0.d(), false, f2J0.x0(), 0L, 0, f2J0.P(), false, f2J0.R(), f2J0.b(), f2J0.T(), g(str).l(), "", (String) null, f2J0.V(), f2J0.X(), g(str).b(), R0(str).e(), f2J0.b0(), f2J0.j0(), f2J0.l0(), f2J0.I(), 0L, f2J0.M()));
    }

    public final void i0(c7 c7Var) throws Throwable {
        b().h();
        O0();
        AbstractC6056k.l(c7Var);
        String str = c7Var.f18743a;
        AbstractC6056k.f(str);
        int i10 = 0;
        if (B0().H(null, AbstractC2383f2.f18818A0)) {
            long jA = e().a();
            int iE = B0().E(null, AbstractC2383f2.f18897j0);
            B0();
            long jN = jA - C2436m.n();
            while (i10 < iE && M(null, jN)) {
                i10++;
            }
        } else {
            B0();
            long jP = C2436m.p();
            while (i10 < jP && M(str, 0L)) {
                i10++;
            }
        }
        if (B0().H(null, AbstractC2383f2.f18820B0)) {
            b().h();
            v0();
        }
        if (this.f18535j.j(str, EnumC3227j3.a(c7Var.f18742E))) {
            a().w().b("[sgtm] Going background, trigger client side upload. appId", str);
            s(str, e().a());
        }
    }

    public final void j(I i10, c7 c7Var) {
        String str = c7Var.f18743a;
        AbstractC6056k.f(str);
        A2 a2A = A2.a(i10);
        N0().w(a2A.f18148d, F0().G(str));
        N0().u(a2A, B0().w(str));
        I iB = a2A.b();
        if (!B0().H(null, AbstractC2383f2.f18889g1) && "_cmp".equals(iB.f18343a)) {
            G g10 = iB.f18344b;
            if ("referrer API v2".equals(g10.h("_cis"))) {
                String strH = g10.h("gclid");
                if (!TextUtils.isEmpty(strH)) {
                    c0(new W6("_lgclid", iB.f18346d, strH, "auto"), c7Var);
                }
            }
        }
        k(iB, c7Var);
    }

    public final void j0(C2404i c2404i) {
        c7 c7VarU = U((String) AbstractC6056k.l(c2404i.f18977a));
        if (c7VarU != null) {
            k0(c2404i, c7VarU);
        }
    }

    public final void k(I i10, c7 c7Var) {
        I i11;
        List<C2404i> listI0;
        List<C2404i> listI02;
        List<C2404i> listI03;
        String str;
        AbstractC6056k.l(c7Var);
        String str2 = c7Var.f18743a;
        AbstractC6056k.f(str2);
        b().h();
        O0();
        long j10 = i10.f18346d;
        A2 a2A = A2.a(i10);
        b().h();
        a7.k0((this.f18521F == null || (str = this.f18522G) == null || !str.equals(str2)) ? null : this.f18521F, a2A.f18148d, false);
        I iB = a2A.b();
        K0();
        if (V6.p(iB, c7Var)) {
            if (!c7Var.f18750h) {
                o0(c7Var);
                return;
            }
            List list = c7Var.f18760r;
            if (list != null) {
                String str3 = iB.f18343a;
                if (!list.contains(str3)) {
                    a().v().d("Dropping non-safelisted event. appId, event name, origin", str2, iB.f18343a, iB.f18345c);
                    return;
                } else {
                    Bundle bundleL = iB.f18344b.l();
                    bundleL.putLong("ga_safelisted", 1L);
                    i11 = new I(str3, new G(bundleL), iB.f18345c, iB.f18346d);
                }
            } else {
                i11 = iB;
            }
            F0().r0();
            try {
                String str4 = i11.f18343a;
                if ("_s".equals(str4) && !F0().C(str2, "_s") && i11.f18344b.e("_sid").longValue() != 0) {
                    if (F0().C(str2, "_f") || F0().C(str2, "_v")) {
                        F0().I(str2, null, "_sid", l(str2, i11));
                    } else {
                        F0().I(str2, Long.valueOf(e().a() - 15000), "_sid", l(str2, i11));
                    }
                }
                C2515w c2515wF0 = F0();
                AbstractC6056k.f(str2);
                c2515wF0.h();
                c2515wF0.j();
                if (j10 < 0) {
                    c2515wF0.f18400a.a().r().c("Invalid time querying timed out conditional properties", C2542z2.x(str2), Long.valueOf(j10));
                    listI0 = Collections.EMPTY_LIST;
                } else {
                    listI0 = c2515wF0.I0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j10)});
                }
                for (C2404i c2404i : listI0) {
                    if (c2404i != null) {
                        a().w().d("User property timed out", c2404i.f18977a, this.f18537l.D().c(c2404i.f18979c.f18640b), c2404i.f18979c.d());
                        I i12 = c2404i.f18983g;
                        if (i12 != null) {
                            m(new I(i12, j10), c7Var);
                        }
                        F0().G0(str2, c2404i.f18979c.f18640b);
                    }
                }
                C2515w c2515wF02 = F0();
                AbstractC6056k.f(str2);
                c2515wF02.h();
                c2515wF02.j();
                if (j10 < 0) {
                    c2515wF02.f18400a.a().r().c("Invalid time querying expired conditional properties", C2542z2.x(str2), Long.valueOf(j10));
                    listI02 = Collections.EMPTY_LIST;
                } else {
                    listI02 = c2515wF02.I0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j10)});
                }
                ArrayList arrayList = new ArrayList(listI02.size());
                for (C2404i c2404i2 : listI02) {
                    if (c2404i2 != null) {
                        a().w().d("User property expired", c2404i2.f18977a, this.f18537l.D().c(c2404i2.f18979c.f18640b), c2404i2.f18979c.d());
                        F0().z0(str2, c2404i2.f18979c.f18640b);
                        I i13 = c2404i2.f18987k;
                        if (i13 != null) {
                            arrayList.add(i13);
                        }
                        F0().G0(str2, c2404i2.f18979c.f18640b);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m(new I((I) it.next(), j10), c7Var);
                }
                C2515w c2515wF03 = F0();
                AbstractC6056k.f(str2);
                AbstractC6056k.f(str4);
                c2515wF03.h();
                c2515wF03.j();
                if (j10 < 0) {
                    C2416j3 c2416j3 = c2515wF03.f18400a;
                    c2416j3.a().r().d("Invalid time querying triggered conditional properties", C2542z2.x(str2), c2416j3.D().a(str4), Long.valueOf(j10));
                    listI03 = Collections.EMPTY_LIST;
                } else {
                    listI03 = c2515wF03.I0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j10)});
                }
                ArrayList arrayList2 = new ArrayList(listI03.size());
                for (C2404i c2404i3 : listI03) {
                    if (c2404i3 != null) {
                        W6 w62 = c2404i3.f18979c;
                        Y6 y62 = new Y6((String) AbstractC6056k.l(c2404i3.f18977a), c2404i3.f18978b, w62.f18640b, j10, AbstractC6056k.l(w62.d()));
                        if (F0().A0(y62)) {
                            a().w().d("User property triggered", c2404i3.f18977a, this.f18537l.D().c(y62.f18661c), y62.f18663e);
                        } else {
                            a().o().d("Too many active user properties, ignoring", C2542z2.x(c2404i3.f18977a), this.f18537l.D().c(y62.f18661c), y62.f18663e);
                        }
                        I i14 = c2404i3.f18985i;
                        if (i14 != null) {
                            arrayList2.add(i14);
                        }
                        c2404i3.f18979c = new W6(y62);
                        c2404i3.f18981e = true;
                        F0().E0(c2404i3);
                    }
                }
                m(i11, c7Var);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    m(new I((I) it2.next(), j10), c7Var);
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th) {
                F0().t0();
                throw th;
            }
        }
    }

    public final void k0(C2404i c2404i, c7 c7Var) {
        AbstractC6056k.l(c2404i);
        AbstractC6056k.f(c2404i.f18977a);
        AbstractC6056k.l(c2404i.f18978b);
        AbstractC6056k.l(c2404i.f18979c);
        AbstractC6056k.f(c2404i.f18979c.f18640b);
        b().h();
        O0();
        if (X(c7Var)) {
            if (!c7Var.f18750h) {
                o0(c7Var);
                return;
            }
            C2404i c2404i2 = new C2404i(c2404i);
            boolean z10 = false;
            c2404i2.f18981e = false;
            F0().r0();
            try {
                C2404i c2404iF0 = F0().F0((String) AbstractC6056k.l(c2404i2.f18977a), c2404i2.f18979c.f18640b);
                if (c2404iF0 != null && !c2404iF0.f18978b.equals(c2404i2.f18978b)) {
                    a().r().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f18537l.D().c(c2404i2.f18979c.f18640b), c2404i2.f18978b, c2404iF0.f18978b);
                }
                if (c2404iF0 != null && c2404iF0.f18981e) {
                    c2404i2.f18978b = c2404iF0.f18978b;
                    c2404i2.f18980d = c2404iF0.f18980d;
                    c2404i2.f18984h = c2404iF0.f18984h;
                    c2404i2.f18982f = c2404iF0.f18982f;
                    c2404i2.f18985i = c2404iF0.f18985i;
                    c2404i2.f18981e = true;
                    W6 w62 = c2404i2.f18979c;
                    c2404i2.f18979c = new W6(w62.f18640b, c2404iF0.f18979c.f18641c, w62.d(), c2404iF0.f18979c.f18644f);
                } else if (TextUtils.isEmpty(c2404i2.f18982f)) {
                    W6 w63 = c2404i2.f18979c;
                    c2404i2.f18979c = new W6(w63.f18640b, c2404i2.f18980d, w63.d(), c2404i2.f18979c.f18644f);
                    c2404i2.f18981e = true;
                    z10 = true;
                }
                if (c2404i2.f18981e) {
                    W6 w64 = c2404i2.f18979c;
                    Y6 y62 = new Y6((String) AbstractC6056k.l(c2404i2.f18977a), c2404i2.f18978b, w64.f18640b, w64.f18641c, AbstractC6056k.l(w64.d()));
                    if (F0().A0(y62)) {
                        a().v().d("User property updated immediately", c2404i2.f18977a, this.f18537l.D().c(y62.f18661c), y62.f18663e);
                    } else {
                        a().o().d("(2)Too many active user properties, ignoring", C2542z2.x(c2404i2.f18977a), this.f18537l.D().c(y62.f18661c), y62.f18663e);
                    }
                    if (z10 && c2404i2.f18985i != null) {
                        m(new I(c2404i2.f18985i, c2404i2.f18980d), c7Var);
                    }
                }
                if (F0().E0(c2404i2)) {
                    a().v().d("Conditional property added", c2404i2.f18977a, this.f18537l.D().c(c2404i2.f18979c.f18640b), c2404i2.f18979c.d());
                } else {
                    a().o().d("Too many conditional properties, ignoring", C2542z2.x(c2404i2.f18977a), this.f18537l.D().c(c2404i2.f18979c.f18640b), c2404i2.f18979c.d());
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th) {
                F0().t0();
                throw th;
            }
        }
    }

    public final Bundle l(String str, I i10) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", i10.f18344b.e("_sid").longValue());
        Y6 y6B0 = F0().B0(str, "_sno");
        if (y6B0 != null) {
            Object obj = y6B0.f18663e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final void l0(C2404i c2404i) {
        c7 c7VarU = U((String) AbstractC6056k.l(c2404i.f18977a));
        if (c7VarU != null) {
            m0(c2404i, c7VarU);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0366 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018d A[PHI: r28 r29
      0x018d: PHI (r28v6 java.lang.String) = (r28v1 java.lang.String), (r28v1 java.lang.String), (r28v7 java.lang.String) binds: [B:70:0x020c, B:72:0x021a, B:52:0x0189] A[DONT_GENERATE, DONT_INLINE]
      0x018d: PHI (r29v6 java.lang.String) = (r29v1 java.lang.String), (r29v1 java.lang.String), (r29v7 java.lang.String) binds: [B:70:0x020c, B:72:0x021a, B:52:0x0189] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019d A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fc A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020e A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0306 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(X6.I r45, X6.c7 r46) {
        /*
            Method dump skipped, instruction units count: 2923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.R6.m(X6.I, X6.c7):void");
    }

    public final void m0(C2404i c2404i, c7 c7Var) {
        AbstractC6056k.l(c2404i);
        AbstractC6056k.f(c2404i.f18977a);
        AbstractC6056k.l(c2404i.f18979c);
        AbstractC6056k.f(c2404i.f18979c.f18640b);
        b().h();
        O0();
        if (X(c7Var)) {
            if (!c7Var.f18750h) {
                o0(c7Var);
                return;
            }
            F0().r0();
            try {
                o0(c7Var);
                String str = (String) AbstractC6056k.l(c2404i.f18977a);
                C2404i c2404iF0 = F0().F0(str, c2404i.f18979c.f18640b);
                if (c2404iF0 != null) {
                    a().v().c("Removing conditional user property", c2404i.f18977a, this.f18537l.D().c(c2404i.f18979c.f18640b));
                    F0().G0(str, c2404i.f18979c.f18640b);
                    if (c2404iF0.f18981e) {
                        F0().z0(str, c2404i.f18979c.f18640b);
                    }
                    I i10 = c2404i.f18987k;
                    if (i10 != null) {
                        G g10 = i10.f18344b;
                        m((I) AbstractC6056k.l(N0().R(str, ((I) AbstractC6056k.l(i10)).f18343a, g10 != null ? g10.l() : null, c2404iF0.f18978b, i10.f18346d, true, true)), c7Var);
                    }
                } else {
                    a().r().c("Conditional user property doesn't exist", C2542z2.x(c2404i.f18977a), this.f18537l.D().c(c2404i.f18979c.f18640b));
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th) {
                F0().t0();
                throw th;
            }
        }
    }

    public final void n(F2 f22, com.google.android.gms.internal.measurement.Y2 y22) {
        C3290q3 c3290q3;
        b().h();
        O0();
        C2452o c2452oD = C2452o.d(y22.b0());
        String strO0 = f22.o0();
        b().h();
        O0();
        S3 s3G = g(strO0);
        P3 p32 = P3.UNINITIALIZED;
        int iOrdinal = s3G.p().ordinal();
        if (iOrdinal == 1) {
            c2452oD.c(R3.AD_STORAGE, EnumC2444n.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            c2452oD.b(R3.AD_STORAGE, s3G.b());
        } else {
            c2452oD.c(R3.AD_STORAGE, EnumC2444n.FAILSAFE);
        }
        int iOrdinal2 = s3G.q().ordinal();
        if (iOrdinal2 == 1) {
            c2452oD.c(R3.ANALYTICS_STORAGE, EnumC2444n.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            c2452oD.b(R3.ANALYTICS_STORAGE, s3G.b());
        } else {
            c2452oD.c(R3.ANALYTICS_STORAGE, EnumC2444n.FAILSAFE);
        }
        String strO02 = f22.o0();
        b().h();
        O0();
        A aT0 = T0(strO02, R0(strO02), g(strO02), c2452oD);
        y22.e0(((Boolean) AbstractC6056k.l(aT0.j())).booleanValue());
        if (!TextUtils.isEmpty(aT0.k())) {
            y22.h0(aT0.k());
        }
        b().h();
        O0();
        Iterator it = y22.f1().iterator();
        while (true) {
            if (it.hasNext()) {
                c3290q3 = (C3290q3) it.next();
                if ("_npa".equals(c3290q3.F())) {
                    break;
                }
            } else {
                c3290q3 = null;
                break;
            }
        }
        if (c3290q3 != null) {
            R3 r32 = R3.AD_PERSONALIZATION;
            if (c2452oD.a(r32) == EnumC2444n.UNSET) {
                Y6 y6B0 = F0().B0(f22.o0(), "_npa");
                if (y6B0 != null) {
                    String str = y6B0.f18660b;
                    if ("tcf".equals(str)) {
                        c2452oD.c(r32, EnumC2444n.TCF);
                    } else if (App.TYPE.equals(str)) {
                        c2452oD.c(r32, EnumC2444n.API);
                    } else {
                        c2452oD.c(r32, EnumC2444n.MANIFEST);
                    }
                } else {
                    Boolean boolR = f22.R();
                    if (boolR == null || ((boolR.booleanValue() && c3290q3.J() != 1) || !(boolR.booleanValue() || c3290q3.J() == 0))) {
                        c2452oD.c(r32, EnumC2444n.API);
                    } else {
                        c2452oD.c(r32, EnumC2444n.MANIFEST);
                    }
                }
            }
        } else {
            int I10 = I(f22.o0(), c2452oD);
            C3281p3 c3281p3O = C3290q3.O();
            c3281p3O.A("_npa");
            c3281p3O.z(e().a());
            c3281p3O.D(I10);
            y22.j1((C3290q3) c3281p3O.w());
            a().w().c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(I10));
        }
        y22.c0(c2452oD.toString());
        boolean zS = this.f18526a.S(f22.o0());
        List listW0 = y22.W0();
        int i10 = 0;
        for (int i11 = 0; i11 < listW0.size(); i11++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.N2) listW0.get(i11)).G())) {
                com.google.android.gms.internal.measurement.M2 m22 = (com.google.android.gms.internal.measurement.M2) ((com.google.android.gms.internal.measurement.N2) listW0.get(i11)).q();
                List listZ = m22.z();
                int i12 = 0;
                while (true) {
                    if (i12 >= listZ.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.R2) listZ.get(i12)).E())) {
                        String strG = ((com.google.android.gms.internal.measurement.R2) listZ.get(i12)).G();
                        if (zS && strG.length() > 4) {
                            char[] charArray = strG.toCharArray();
                            int i13 = 1;
                            while (true) {
                                if (i13 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13)) {
                                    i10 = i13;
                                    break;
                                }
                                i13++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 | 1);
                            strG = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.Q2 q2P = com.google.android.gms.internal.measurement.R2.P();
                        q2P.A("_tcfd");
                        q2P.C(strG);
                        m22.D(i12, q2P);
                    } else {
                        i12++;
                    }
                }
                y22.a1(i11, m22);
                return;
            }
        }
    }

    public final void n0(c7 c7Var, long j10) {
        F2 f2J0 = F0().J0((String) AbstractC6056k.l(c7Var.f18743a));
        if (f2J0 != null && N0().p(c7Var.f18744b, f2J0.r0())) {
            a().r().b("New GMP App Id passed in. Removing cached database data. appId", C2542z2.x(f2J0.o0()));
            C2515w c2515wF0 = F0();
            String strO0 = f2J0.o0();
            c2515wF0.j();
            c2515wF0.h();
            AbstractC6056k.f(strO0);
            try {
                SQLiteDatabase sQLiteDatabaseU0 = c2515wF0.u0();
                String[] strArr = {strO0};
                int iDelete = sQLiteDatabaseU0.delete("events", "app_id=?", strArr) + sQLiteDatabaseU0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseU0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseU0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseU0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseU0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseU0.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseU0.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseU0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseU0.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseU0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseU0.delete("trigger_uris", "app_id=?", strArr);
                com.google.android.gms.internal.measurement.F6.a();
                C2416j3 c2416j3 = c2515wF0.f18400a;
                if (c2416j3.w().H(null, AbstractC2383f2.f18895i1)) {
                    iDelete += sQLiteDatabaseU0.delete("no_data_mode_events", "app_id=?", strArr);
                }
                if (iDelete > 0) {
                    c2416j3.a().w().c("Deleted application data. app, records", strO0, Integer.valueOf(iDelete));
                }
            } catch (SQLiteException e10) {
                c2515wF0.f18400a.a().o().c("Error deleting application data. appId, error", C2542z2.x(strO0), e10);
            }
            f2J0 = null;
        }
        if (f2J0 != null) {
            boolean z10 = (f2J0.F0() == -2147483648L || f2J0.F0() == c7Var.f18752j) ? false : true;
            String strD0 = f2J0.D0();
            if (z10 || ((f2J0.F0() != -2147483648L || strD0 == null || strD0.equals(c7Var.f18745c)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strD0);
                I i10 = new I("_au", new G(bundle), "auto", j10);
                if (B0().H(null, AbstractC2383f2.f18880d1)) {
                    j(i10, c7Var);
                } else {
                    k(i10, c7Var);
                }
            }
        }
    }

    public final void o(F2 f22, com.google.android.gms.internal.measurement.Y2 y22) {
        b().h();
        O0();
        C3297r2 c3297r2E0 = C3332v2.e0();
        byte[] bArrK = f22.K();
        if (bArrK != null) {
            try {
                c3297r2E0 = (C3297r2) V6.W(c3297r2E0, bArrK);
            } catch (C3229j5 unused) {
                a().r().b("Failed to parse locally stored ad campaign info. appId", C2542z2.x(f22.o0()));
            }
        }
        for (com.google.android.gms.internal.measurement.N2 n22 : y22.W0()) {
            if (n22.G().equals("_cmp")) {
                String str = (String) V6.v(n22, "gclid", "");
                String str2 = (String) V6.v(n22, "gbraid", "");
                String str3 = (String) V6.v(n22, "gad_source", "");
                String[] strArrSplit = ((String) AbstractC2383f2.f18892h1.b(null)).split(",");
                K0();
                if (!V6.s(n22, strArrSplit).isEmpty()) {
                    long jLongValue = ((Long) V6.v(n22, "click_timestamp", 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = n22.I();
                    }
                    if ("referrer API v2".equals(V6.u(n22, "_cis"))) {
                        if (jLongValue > c3297r2E0.N()) {
                            if (str.isEmpty()) {
                                c3297r2E0.I();
                            } else {
                                c3297r2E0.H(str);
                            }
                            if (str2.isEmpty()) {
                                c3297r2E0.K();
                            } else {
                                c3297r2E0.J(str2);
                            }
                            if (str3.isEmpty()) {
                                c3297r2E0.M();
                            } else {
                                c3297r2E0.L(str3);
                            }
                            c3297r2E0.O(jLongValue);
                            c3297r2E0.R();
                            c3297r2E0.S(J(n22));
                        }
                    } else if (jLongValue > c3297r2E0.F()) {
                        if (str.isEmpty()) {
                            c3297r2E0.A();
                        } else {
                            c3297r2E0.z(str);
                        }
                        if (str2.isEmpty()) {
                            c3297r2E0.C();
                        } else {
                            c3297r2E0.B(str2);
                        }
                        if (str3.isEmpty()) {
                            c3297r2E0.E();
                        } else {
                            c3297r2E0.D(str3);
                        }
                        c3297r2E0.G(jLongValue);
                        c3297r2E0.P();
                        c3297r2E0.Q(J(n22));
                    }
                }
            }
        }
        if (!((C3332v2) c3297r2E0.w()).equals(C3332v2.f0())) {
            y22.o0((C3332v2) c3297r2E0.w());
        }
        f22.J(((C3332v2) c3297r2E0.w()).b());
        if (f22.A()) {
            F0().K0(f22, false, false);
        }
        if (B0().H(null, AbstractC2383f2.f18889g1)) {
            F0().z0(f22.o0(), "_lgclid");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X6.F2 o0(X6.c7 r13) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.R6.o0(X6.c7):X6.F2");
    }

    public final String p(S3 s32) {
        if (!s32.o(R3.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        N0().q0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final String p0(c7 c7Var) {
        try {
            return (String) b().r(new J6(this, c7Var)).get(TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            a().o().c("Failed to get app instance id. appId", C2542z2.x(c7Var.f18743a), e10);
            return null;
        }
    }

    public final void q(List list) {
        AbstractC6056k.a(!list.isEmpty());
        if (this.f18550y != null) {
            a().o().a("Set uploading progress before finishing the previous upload");
        } else {
            this.f18550y = new ArrayList(list);
        }
    }

    public final List q0(c7 c7Var, Bundle bundle) {
        b().h();
        C3213h7.a();
        C2436m c2436mB0 = B0();
        String str = c7Var.f18743a;
        if (!c2436mB0.H(str, AbstractC2383f2.f18850Q0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    a().o().a("Uri sources and timestamps do not match");
                } else {
                    for (int i10 = 0; i10 < intArray.length; i10++) {
                        C2515w c2515wF0 = F0();
                        int i11 = intArray[i10];
                        long j10 = longArray[i10];
                        AbstractC6056k.f(str);
                        c2515wF0.h();
                        c2515wF0.j();
                        try {
                            int iDelete = c2515wF0.u0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j10)});
                            C2526x2 c2526x2W = c2515wF0.f18400a.a().w();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iDelete).length() + 46);
                            sb2.append("Pruned ");
                            sb2.append(iDelete);
                            sb2.append(" trigger URIs. appId, source, timestamp");
                            c2526x2W.d(sb2.toString(), str, Integer.valueOf(i11), Long.valueOf(j10));
                        } catch (SQLiteException e10) {
                            c2515wF0.f18400a.a().o().c("Error pruning trigger URIs. appId", C2542z2.x(str), e10);
                        }
                    }
                }
            }
        }
        C2515w c2515wF02 = F0();
        String str2 = c7Var.f18743a;
        AbstractC6056k.f(str2);
        c2515wF02.h();
        c2515wF02.j();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = c2515wF02.u0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new C2482r6(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e11) {
                c2515wF02.f18400a.a().o().c("Error querying trigger uris. appId", C2542z2.x(str2), e11);
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X6.R6] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
    public final void r() {
        SQLiteException e10;
        F2 f2J0;
        b().h();
        O0();
        this.f18547v = true;
        try {
            C2416j3 c2416j3 = this.f18537l;
            c2416j3.c();
            Boolean boolX = c2416j3.J().x();
            if (boolX == null) {
                a().r().a("Upload data called on the client side before use of service was decided");
            } else if (boolX.booleanValue()) {
                a().o().a("Upload called in the client side when service should be used");
            } else if (this.f18540o > 0) {
                R();
            } else {
                b().h();
                if (this.f18550y != null) {
                    a().w().a("Uploading requested multiple times");
                } else if (E0().m()) {
                    ?? A10 = e().a();
                    ?? r72 = 0;
                    cursorRawQuery = null;
                    Cursor cursorRawQuery = null;
                    string = null;
                    string = null;
                    String string = null;
                    int iE = B0().E(null, AbstractC2383f2.f18897j0);
                    B0();
                    long jN = A10 - C2436m.n();
                    for (int i10 = 0; i10 < iE && M(null, jN); i10++) {
                    }
                    C3213h7.a();
                    b().h();
                    v0();
                    long jA = this.f18534i.f18636h.a();
                    if (jA != 0) {
                        a().v().b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(A10 - jA)));
                    }
                    String strR = F0().r();
                    long j10 = -1;
                    if (TextUtils.isEmpty(strR)) {
                        try {
                            this.f18516A = -1L;
                            C2515w c2515wF0 = F0();
                            B0();
                            long jN2 = A10 - C2436m.n();
                            c2515wF0.h();
                            c2515wF0.j();
                            try {
                                A10 = c2515wF0.u0().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jN2)});
                            } catch (SQLiteException e11) {
                                e10 = e11;
                                A10 = 0;
                            } catch (Throwable th) {
                                th = th;
                                if (r72 == 0) {
                                    throw th;
                                }
                                throw th;
                            }
                            try {
                                if (A10.moveToFirst()) {
                                    string = A10.getString(0);
                                } else {
                                    c2515wF0.f18400a.a().w().a("No expired configs for apps with pending events");
                                }
                            } catch (SQLiteException e12) {
                                e10 = e12;
                                A10 = A10;
                                c2515wF0.f18400a.a().o().b("Error selecting expired configs", e10);
                                if (A10 != 0) {
                                }
                                if (!TextUtils.isEmpty(string)) {
                                    B(f2J0);
                                }
                                this.f18547v = false;
                                S();
                            }
                            A10.close();
                            if (!TextUtils.isEmpty(string) && (f2J0 = F0().J0(string)) != null) {
                                B(f2J0);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r72 = A10;
                        }
                    } else {
                        if (this.f18516A == -1) {
                            C2515w c2515wF02 = F0();
                            try {
                                try {
                                    cursorRawQuery = c2515wF02.u0().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        j10 = cursorRawQuery.getLong(0);
                                    }
                                } catch (SQLiteException e13) {
                                    c2515wF02.f18400a.a().o().b("Error querying raw events", e13);
                                    if (cursorRawQuery != null) {
                                    }
                                    this.f18516A = j10;
                                    s(strR, A10);
                                    this.f18547v = false;
                                    S();
                                }
                                cursorRawQuery.close();
                                this.f18516A = j10;
                            } finally {
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                            }
                        }
                        s(strR, A10);
                    }
                } else {
                    a().w().a("Network not connected, ignoring upload request");
                    R();
                }
            }
            this.f18547v = false;
            S();
        } catch (Throwable th3) {
            this.f18547v = false;
            S();
            throw th3;
        }
    }

    public final void r0(String str, C2388g c2388g) {
        b().h();
        O0();
        C2515w c2515wF0 = F0();
        long j10 = c2388g.f18947a;
        U6 u6N = c2515wF0.n(j10);
        if (u6N == null) {
            a().r().c("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(j10));
            return;
        }
        String strE = u6N.e();
        if (c2388g.f18948b != Z4.SUCCESS.zza()) {
            if (c2388g.f18948b == Z4.BACKOFF.zza()) {
                Map map = this.f18520E;
                P6 p62 = (P6) map.get(strE);
                if (p62 == null) {
                    p62 = new P6(this);
                    map.put(strE, p62);
                } else {
                    p62.a();
                }
                a().w().d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, strE, Long.valueOf((p62.c() - e().a()) / 1000));
            }
            C2515w c2515wF02 = F0();
            Long lValueOf = Long.valueOf(c2388g.f18947a);
            c2515wF02.w(lValueOf);
            a().w().c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, lValueOf);
            return;
        }
        Map map2 = this.f18520E;
        if (map2.containsKey(strE)) {
            map2.remove(strE);
        }
        C2515w c2515wF03 = F0();
        Long lValueOf2 = Long.valueOf(j10);
        c2515wF03.q(lValueOf2);
        a().w().c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, lValueOf2);
        long j11 = c2388g.f18949c;
        if (j11 > 0) {
            C2515w c2515wF04 = F0();
            c2515wF04.h();
            c2515wF04.j();
            Long lValueOf3 = Long.valueOf(j11);
            AbstractC6056k.l(lValueOf3);
            ContentValues contentValues = new ContentValues();
            contentValues.put("upload_type", Integer.valueOf(EnumC2346a5.GOOGLE_SIGNAL.zza()));
            C2416j3 c2416j3 = c2515wF04.f18400a;
            contentValues.put("creation_timestamp", Long.valueOf(c2416j3.e().a()));
            try {
                if (c2515wF04.u0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j11), str, String.valueOf(EnumC2346a5.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                    c2416j3.a().r().c("Google Signal pending batch not updated. appId, rowId", str, lValueOf3);
                }
                a().w().c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(c2388g.f18949c));
                u(str);
            } catch (SQLiteException e10) {
                c2515wF04.f18400a.a().o().d("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j11), e10);
                throw e10;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x045e A[PHI: r10 r16 r23
      0x045e: PHI (r10v39 java.util.List) = (r10v53 java.util.List), (r10v38 java.util.List) binds: [B:184:0x0484, B:176:0x045c] A[DONT_GENERATE, DONT_INLINE]
      0x045e: PHI (r16v7 java.util.List) = (r16v12 java.util.List), (r16v13 java.util.List) binds: [B:184:0x0484, B:176:0x045c] A[DONT_GENERATE, DONT_INLINE]
      0x045e: PHI (r23v12 android.database.Cursor) = (r23v18 android.database.Cursor), (r23v22 android.database.Cursor) binds: [B:184:0x0484, B:176:0x045c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[PHI: r0 r10 r23
      0x006b: PHI (r0v117 java.util.List) = (r0v8 java.util.List), (r0v141 java.util.List) binds: [B:108:0x022a, B:16:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r10v57 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v59 android.database.Cursor) binds: [B:108:0x022a, B:16:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r23v28 long) = (r23v2 long), (r23v29 long) binds: [B:108:0x022a, B:16:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:475:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:476:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(java.lang.String r33, long r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.R6.s(java.lang.String, long):void");
    }

    public final void s0(boolean z10) {
        R();
    }

    public final boolean t(String str, String str2) {
        F2 f2J0 = F0().J0(str);
        if (f2J0 != null && N0().P(str, f2J0.l0())) {
            this.f18520E.remove(str2);
            return true;
        }
        P6 p62 = (P6) this.f18520E.get(str2);
        if (p62 == null) {
            return true;
        }
        return p62.b();
    }

    public final void t0(String str, C2362c5 c2362c5) {
        b().h();
        String str2 = this.f18522G;
        if (str2 == null || str2.equals(str) || c2362c5 != null) {
            this.f18522G = str;
            this.f18521F = c2362c5;
        }
    }

    public final void u(String str) {
        com.google.android.gms.internal.measurement.X2 x2D;
        b().h();
        O0();
        this.f18547v = true;
        try {
            C2416j3 c2416j3 = this.f18537l;
            c2416j3.c();
            Boolean boolX = c2416j3.J().x();
            if (boolX == null) {
                a().r().a("Upload data called on the client side before use of service was decided");
            } else if (boolX.booleanValue()) {
                a().o().a("Upload called in the client side when service should be used");
            } else if (this.f18540o > 0) {
                R();
            } else if (!E0().m()) {
                a().w().a("Network not connected, ignoring upload request");
                R();
            } else if (F0().p(str)) {
                C2515w c2515wF0 = F0();
                AbstractC6056k.f(str);
                c2515wF0.h();
                c2515wF0.j();
                List listO = c2515wF0.o(str, C2538y6.d(EnumC2346a5.GOOGLE_SIGNAL), 1);
                U6 u62 = listO.isEmpty() ? null : (U6) listO.get(0);
                if (u62 != null && (x2D = u62.d()) != null) {
                    a().w().d("[sgtm] Uploading data from upload queue. appId, type, url", str, u62.f(), u62.e());
                    byte[] bArrB = x2D.b();
                    if (Log.isLoggable(a().z(), 2)) {
                        a().w().d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrB.length), K0().K(x2D));
                    }
                    D6 d6A = u62.a();
                    this.f18546u = true;
                    E0().n(str, d6A, x2D, new H6(this, str, u62));
                }
            } else {
                a().w().b("[sgtm] Upload queue has no batches for appId", str);
            }
            this.f18547v = false;
            S();
        } catch (Throwable th) {
            this.f18547v = false;
            S();
            throw th;
        }
    }

    public final /* synthetic */ void u0(S6 s62) {
        b().h();
        this.f18536k = new Q2(this);
        C2515w c2515w = new C2515w(this);
        c2515w.k();
        this.f18528c = c2515w;
        B0().t((InterfaceC2428l) AbstractC6056k.l(this.f18526a));
        W5 w52 = new W5(this);
        w52.k();
        this.f18534i = w52;
        C2372e c2372e = new C2372e(this);
        c2372e.k();
        this.f18531f = c2372e;
        X4 x42 = new X4(this);
        x42.k();
        this.f18533h = x42;
        C2506u6 c2506u6 = new C2506u6(this);
        c2506u6.k();
        this.f18530e = c2506u6;
        this.f18529d = new H2(this);
        if (this.f18543r != this.f18544s) {
            a().o().c("Not all upload components initialized", Integer.valueOf(this.f18543r), Integer.valueOf(this.f18544s));
        }
        this.f18538m.set(true);
        a().w().a("UploadController is now fully initialized");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x000d, B:19:0x005a, B:22:0x0080, B:13:0x001e, B:15:0x0048, B:17:0x0052, B:18:0x0056), top: B:27:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.lang.String r4, int r5, java.lang.Throwable r6, byte[] r7, X6.U6 r8) {
        /*
            r3 = this;
            X6.f3 r0 = r3.b()
            r0.h()
            r3.O0()
            r0 = 0
            if (r7 != 0) goto L13
            byte[] r7 = new byte[r0]     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r4 = move-exception
            goto L9b
        L13:
            r1 = 200(0xc8, float:2.8E-43)
            if (r5 == r1) goto L1c
            r1 = 204(0xcc, float:2.86E-43)
            if (r5 != r1) goto L5a
            r5 = r1
        L1c:
            if (r6 != 0) goto L5a
            X6.w r6 = r3.F0()     // Catch: java.lang.Throwable -> L10
            long r7 = r8.c()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L10
            r6.q(r7)     // Catch: java.lang.Throwable -> L10
            X6.z2 r6 = r3.a()     // Catch: java.lang.Throwable -> L10
            X6.x2 r6 = r6.w()     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r6.c(r7, r4, r5)     // Catch: java.lang.Throwable -> L10
            X6.E2 r5 = r3.E0()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.m()     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L56
            X6.w r5 = r3.F0()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.p(r4)     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L56
            r3.u(r4)     // Catch: java.lang.Throwable -> L10
            goto L95
        L56:
            r3.R()     // Catch: java.lang.Throwable -> L10
            goto L95
        L5a:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L10
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L10
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L10
            int r7 = r1.length()     // Catch: java.lang.Throwable -> L10
            r2 = 32
            int r7 = java.lang.Math.min(r2, r7)     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = r1.substring(r0, r7)     // Catch: java.lang.Throwable -> L10
            X6.z2 r1 = r3.a()     // Catch: java.lang.Throwable -> L10
            X6.x2 r1 = r1.t()     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            if (r6 != 0) goto L80
            r6 = r7
        L80:
            r1.d(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L10
            X6.w r4 = r3.F0()     // Catch: java.lang.Throwable -> L10
            long r5 = r8.c()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r4.w(r5)     // Catch: java.lang.Throwable -> L10
            r3.R()     // Catch: java.lang.Throwable -> L10
        L95:
            r3.f18546u = r0
            r3.S()
            return
        L9b:
            r3.f18546u = r0
            r3.S()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.R6.v(java.lang.String, int, java.lang.Throwable, byte[], X6.U6):void");
    }

    public final void w(String str, boolean z10, Long l10, Long l11) {
        F2 f2J0 = F0().J0(str);
        if (f2J0 != null) {
            f2J0.e0(z10);
            f2J0.g0(l10);
            f2J0.i0(l11);
            if (f2J0.A()) {
                F0().K0(f2J0, false, false);
            }
        }
    }

    public final void x(String str, com.google.android.gms.internal.measurement.Y2 y22) {
        int iX;
        int iIndexOf;
        Set setF = D0().F(str);
        if (setF != null) {
            y22.S0(setF);
        }
        if (D0().J(str)) {
            y22.F();
        }
        if (D0().K(str)) {
            String strC = y22.C();
            if (!TextUtils.isEmpty(strC) && (iIndexOf = strC.indexOf(".")) != -1) {
                y22.D(strC.substring(0, iIndexOf));
            }
        }
        if (D0().L(str) && (iX = V6.X(y22, "_id")) != -1) {
            y22.m1(iX);
        }
        if (D0().M(str)) {
            y22.H0();
        }
        if (D0().N(str)) {
            y22.W();
            if (g(str).o(R3.ANALYTICS_STORAGE)) {
                Map map = this.f18519D;
                O6 o62 = (O6) map.get(str);
                if (o62 == null || o62.f18467b + B0().D(str, AbstractC2383f2.f18903l0) < e().c()) {
                    o62 = new O6(this, (byte[]) null);
                    map.put(str, o62);
                }
                y22.T0(o62.f18466a);
            }
        }
        if (D0().O(str)) {
            y22.R0();
        }
    }

    public final /* synthetic */ C2416j3 x0() {
        return this.f18537l;
    }

    public final void y(com.google.android.gms.internal.measurement.Y2 y22, N6 n62) {
        for (int i10 = 0; i10 < y22.X0(); i10++) {
            com.google.android.gms.internal.measurement.M2 m22 = (com.google.android.gms.internal.measurement.M2) y22.Y0(i10).q();
            Iterator it = m22.z().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.R2) it.next()).E())) {
                    if (n62.f18450a.Y0() >= B0().E(n62.f18450a.D(), AbstractC2383f2.f18906m0)) {
                        int iE = B0().E(n62.f18450a.D(), AbstractC2383f2.f18932z0);
                        String strL0 = null;
                        if (iE <= 0) {
                            if (B0().H(n62.f18450a.D(), AbstractC2383f2.f18854S0)) {
                                strL0 = N0().l0();
                                com.google.android.gms.internal.measurement.Q2 q2P = com.google.android.gms.internal.measurement.R2.P();
                                q2P.A("_tu");
                                q2P.C(strL0);
                                m22.E((com.google.android.gms.internal.measurement.R2) q2P.w());
                            }
                            com.google.android.gms.internal.measurement.Q2 q2P2 = com.google.android.gms.internal.measurement.R2.P();
                            q2P2.A("_tr");
                            q2P2.E(1L);
                            m22.E((com.google.android.gms.internal.measurement.R2) q2P2.w());
                            C2482r6 c2482r6I = K0().I(n62.f18450a.D(), y22, m22, strL0);
                            if (c2482r6I != null) {
                                a().w().c("Generated trigger URI. appId, uri", n62.f18450a.D(), c2482r6I.f19192a);
                                F0().K(n62.f18450a.D(), c2482r6I);
                                Deque deque = this.f18542q;
                                if (!deque.contains(n62.f18450a.D())) {
                                    deque.add(n62.f18450a.D());
                                }
                            }
                        } else if (F0().L0(h(), n62.f18450a.D(), false, false, false, false, false, false, true).f19201g > iE) {
                            com.google.android.gms.internal.measurement.Q2 q2P3 = com.google.android.gms.internal.measurement.R2.P();
                            q2P3.A("_tnr");
                            q2P3.E(1L);
                            m22.E((com.google.android.gms.internal.measurement.R2) q2P3.w());
                        } else {
                            if (B0().H(n62.f18450a.D(), AbstractC2383f2.f18854S0)) {
                                strL0 = N0().l0();
                                com.google.android.gms.internal.measurement.Q2 q2P4 = com.google.android.gms.internal.measurement.R2.P();
                                q2P4.A("_tu");
                                q2P4.C(strL0);
                                m22.E((com.google.android.gms.internal.measurement.R2) q2P4.w());
                            }
                            com.google.android.gms.internal.measurement.Q2 q2P5 = com.google.android.gms.internal.measurement.R2.P();
                            q2P5.A("_tr");
                            q2P5.E(1L);
                            m22.E((com.google.android.gms.internal.measurement.R2) q2P5.w());
                            C2482r6 c2482r6I2 = K0().I(n62.f18450a.D(), y22, m22, strL0);
                            if (c2482r6I2 != null) {
                                a().w().c("Generated trigger URI. appId, uri", n62.f18450a.D(), c2482r6I2.f19192a);
                                F0().K(n62.f18450a.D(), c2482r6I2);
                                Deque deque2 = this.f18542q;
                                if (!deque2.contains(n62.f18450a.D())) {
                                    deque2.add(n62.f18450a.D());
                                }
                            }
                        }
                    }
                    y22.Z0(i10, (com.google.android.gms.internal.measurement.N2) m22.w());
                }
            }
        }
    }

    public final /* synthetic */ Deque y0() {
        return this.f18542q;
    }

    public final void z(String str, com.google.android.gms.internal.measurement.Q2 q22, Bundle bundle, String str2) {
        List listB = B6.f.b("_o", "_sn", "_sc", "_si");
        long jY = (a7.N(q22.z()) || a7.N(str)) ? B0().y(str2, true) : B0().x(str2, true);
        long jCodePointCount = q22.B().codePointCount(0, q22.B().length());
        a7 a7VarN0 = N0();
        String strZ = q22.z();
        B0();
        String strQ = a7VarN0.q(strZ, 40, true);
        if (jCodePointCount <= jY || listB.contains(q22.z())) {
            return;
        }
        if ("_ev".equals(q22.z())) {
            bundle.putString("_ev", N0().q(q22.B(), B0().y(str2, true), true));
            return;
        }
        a().t().c("Param value is too long; discarded. Name, value length", strQ, Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strQ);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(q22.z());
    }

    public final /* synthetic */ void z0(long j10) {
        this.f18524I = j10;
    }
}
