package com.braze.lrucache;

import java.io.Closeable;
import java.io.FileInputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileInputStream f27827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f27828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f27829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27831e;

    public i(FileInputStream fileInputStream, Charset charset) {
        charset.getClass();
        if (!charset.equals(j.f27832a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f27827a = fileInputStream;
        this.f27828b = charset;
        this.f27829c = new byte[8192];
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a() {
        /*
            r8 = this;
            java.io.FileInputStream r0 = r8.f27827a
            monitor-enter(r0)
            byte[] r1 = r8.f27829c     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto La5
            int r2 = r8.f27830d     // Catch: java.lang.Throwable -> L1d
            int r3 = r8.f27831e     // Catch: java.lang.Throwable -> L1d
            r4 = -1
            r5 = 0
            if (r2 < r3) goto L26
            java.io.FileInputStream r2 = r8.f27827a     // Catch: java.lang.Throwable -> L1d
            int r3 = r1.length     // Catch: java.lang.Throwable -> L1d
            int r1 = r2.read(r1, r5, r3)     // Catch: java.lang.Throwable -> L1d
            if (r1 == r4) goto L20
            r8.f27830d = r5     // Catch: java.lang.Throwable -> L1d
            r8.f27831e = r1     // Catch: java.lang.Throwable -> L1d
            goto L26
        L1d:
            r8 = move-exception
            goto Lad
        L20:
            java.io.EOFException r8 = new java.io.EOFException     // Catch: java.lang.Throwable -> L1d
            r8.<init>()     // Catch: java.lang.Throwable -> L1d
            throw r8     // Catch: java.lang.Throwable -> L1d
        L26:
            int r1 = r8.f27830d     // Catch: java.lang.Throwable -> L1d
        L28:
            int r2 = r8.f27831e     // Catch: java.lang.Throwable -> L1d
            r3 = 10
            if (r1 == r2) goto L57
            byte[] r2 = r8.f27829c     // Catch: java.lang.Throwable -> L1d
            r6 = r2[r1]     // Catch: java.lang.Throwable -> L1d
            if (r6 != r3) goto L54
            int r3 = r8.f27830d     // Catch: java.lang.Throwable -> L1d
            if (r1 == r3) goto L41
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L1d
            r6 = 13
            if (r5 != r6) goto L41
            goto L42
        L41:
            r4 = r1
        L42:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L1d
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r8.f27828b     // Catch: java.lang.Throwable -> L1d
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L1d
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L1d
            int r1 = r1 + 1
            r8.f27830d = r1     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r5
        L54:
            int r1 = r1 + 1
            goto L28
        L57:
            com.braze.lrucache.h r1 = new com.braze.lrucache.h     // Catch: java.lang.Throwable -> L1d
            int r2 = r8.f27831e     // Catch: java.lang.Throwable -> L1d
            int r6 = r8.f27830d     // Catch: java.lang.Throwable -> L1d
            int r2 = r2 - r6
            int r2 = r2 + 80
            r1.<init>(r8, r2)     // Catch: java.lang.Throwable -> L1d
        L63:
            byte[] r2 = r8.f27829c     // Catch: java.lang.Throwable -> L1d
            int r6 = r8.f27830d     // Catch: java.lang.Throwable -> L1d
            int r7 = r8.f27831e     // Catch: java.lang.Throwable -> L1d
            int r7 = r7 - r6
            r1.write(r2, r6, r7)     // Catch: java.lang.Throwable -> L1d
            r8.f27831e = r4     // Catch: java.lang.Throwable -> L1d
            java.io.FileInputStream r2 = r8.f27827a     // Catch: java.lang.Throwable -> L1d
            byte[] r6 = r8.f27829c     // Catch: java.lang.Throwable -> L1d
            int r7 = r6.length     // Catch: java.lang.Throwable -> L1d
            int r2 = r2.read(r6, r5, r7)     // Catch: java.lang.Throwable -> L1d
            if (r2 == r4) goto L9f
            r8.f27830d = r5     // Catch: java.lang.Throwable -> L1d
            r8.f27831e = r2     // Catch: java.lang.Throwable -> L1d
            r2 = r5
        L7f:
            int r6 = r8.f27831e     // Catch: java.lang.Throwable -> L1d
            if (r2 == r6) goto L63
            byte[] r6 = r8.f27829c     // Catch: java.lang.Throwable -> L1d
            r7 = r6[r2]     // Catch: java.lang.Throwable -> L1d
            if (r7 != r3) goto L9c
            int r3 = r8.f27830d     // Catch: java.lang.Throwable -> L1d
            if (r2 == r3) goto L92
            int r4 = r2 - r3
            r1.write(r6, r3, r4)     // Catch: java.lang.Throwable -> L1d
        L92:
            int r2 = r2 + 1
            r8.f27830d = r2     // Catch: java.lang.Throwable -> L1d
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r8
        L9c:
            int r2 = r2 + 1
            goto L7f
        L9f:
            java.io.EOFException r8 = new java.io.EOFException     // Catch: java.lang.Throwable -> L1d
            r8.<init>()     // Catch: java.lang.Throwable -> L1d
            throw r8     // Catch: java.lang.Throwable -> L1d
        La5:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "LineReader is closed"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            throw r8     // Catch: java.lang.Throwable -> L1d
        Lad:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.lrucache.i.a():java.lang.String");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f27827a) {
            try {
                if (this.f27829c != null) {
                    this.f27829c = null;
                    this.f27827a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
