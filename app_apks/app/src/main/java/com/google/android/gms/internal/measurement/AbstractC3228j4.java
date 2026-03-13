package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3228j4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f29510g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile AbstractC3183e4 f29511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f29512i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3174d4 f29513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f29515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f29516d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f29517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f29518f;

    static {
        new AtomicReference();
        J7.n.k(new Object() { // from class: com.google.android.gms.internal.measurement.h4
        }, "BuildInfo must be non-null");
        f29512i = new AtomicInteger();
    }

    public /* synthetic */ AbstractC3228j4(C3174d4 c3174d4, String str, Object obj, boolean z10, byte[] bArr) {
        if (c3174d4.f29438a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f29513a = c3174d4;
        this.f29514b = str;
        this.f29515c = obj;
        this.f29518f = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.e4 r0 = com.google.android.gms.internal.measurement.AbstractC3228j4.f29511h
            if (r0 != 0) goto L4d
            if (r3 != 0) goto L7
            goto L4d
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.AbstractC3228j4.f29510g
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.e4 r1 = com.google.android.gms.internal.measurement.AbstractC3228j4.f29511h     // Catch: java.lang.Throwable -> L47
            if (r1 != 0) goto L49
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.e4 r1 = com.google.android.gms.internal.measurement.AbstractC3228j4.f29511h     // Catch: java.lang.Throwable -> L21
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L18
            r3 = r2
        L18:
            if (r1 == 0) goto L23
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> L21
            if (r2 == r3) goto L43
            goto L23
        L21:
            r3 = move-exception
            goto L45
        L23:
            if (r1 == 0) goto L2e
            com.google.android.gms.internal.measurement.O3.f()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.C3246l4.d()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.U3.e()     // Catch: java.lang.Throwable -> L21
        L2e:
            com.google.android.gms.internal.measurement.i4 r1 = new com.google.android.gms.internal.measurement.i4     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            J7.t r1 = J7.u.a(r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.K3 r2 = new com.google.android.gms.internal.measurement.K3     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.AbstractC3228j4.f29511h = r2     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.AbstractC3228j4.f29512i     // Catch: java.lang.Throwable -> L21
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L21
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            goto L49
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L47
        L47:
            r3 = move-exception
            goto L4b
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r3
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC3228j4.b(android.content.Context):void");
    }

    public static void c() {
        f29512i.incrementAndGet();
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[PHI: r2
      0x004a: PHI (r2v1 J7.k) = (r2v0 J7.k), (r2v0 J7.k), (r2v7 J7.k) binds: [B:8:0x0016, B:10:0x001c, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:20:0x0050, B:22:0x005b, B:24:0x0065, B:28:0x0088, B:30:0x0090, B:42:0x00b7, B:45:0x00bf, B:46:0x00c2, B:47:0x00c6, B:34:0x0099, B:36:0x009d, B:38:0x00ad, B:40:0x00b3, B:26:0x0076, B:48:0x00ca), top: B:54:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:20:0x0050, B:22:0x005b, B:24:0x0065, B:28:0x0088, B:30:0x0090, B:42:0x00b7, B:45:0x00bf, B:46:0x00c2, B:47:0x00c6, B:34:0x0099, B:36:0x009d, B:38:0x00ad, B:40:0x00b3, B:26:0x0076, B:48:0x00ca), top: B:54:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:20:0x0050, B:22:0x005b, B:24:0x0065, B:28:0x0088, B:30:0x0090, B:42:0x00b7, B:45:0x00bf, B:46:0x00c2, B:47:0x00c6, B:34:0x0099, B:36:0x009d, B:38:0x00ad, B:40:0x00b3, B:26:0x0076, B:48:0x00ca), top: B:54:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d() {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC3228j4.d():java.lang.Object");
    }
}
