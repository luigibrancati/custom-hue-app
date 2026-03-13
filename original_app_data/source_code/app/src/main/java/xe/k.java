package xe;

import Fe.C0843e;
import Fe.InterfaceC0844f;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import qe.p;
import xe.e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f48285g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f48286h = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0844f f48287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0843e f48289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f48291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e.b f48292f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public k(InterfaceC0844f sink, boolean z10) {
        AbstractC4862t.e(sink, "sink");
        this.f48287a = sink;
        this.f48288b = z10;
        C0843e c0843e = new C0843e();
        this.f48289c = c0843e;
        this.f48290d = 16384;
        this.f48292f = new e.b(0, false, c0843e, 3, null);
    }

    public final synchronized void a(n peerSettings) {
        try {
            AbstractC4862t.e(peerSettings, "peerSettings");
            if (this.f48291e) {
                throw new IOException("closed");
            }
            this.f48290d = peerSettings.e(this.f48290d);
            if (peerSettings.b() != -1) {
                this.f48292f.e(peerSettings.b());
            }
            f(0, 0, 4, 1);
            this.f48287a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f48291e) {
                throw new IOException("closed");
            }
            if (this.f48288b) {
                Logger logger = f48286h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(p.h(">> CONNECTION " + f.f48154b.x(), new Object[0]));
                }
                this.f48287a.U(f.f48154b);
                this.f48287a.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(boolean z10, int i10, C0843e c0843e, int i11) {
        if (this.f48291e) {
            throw new IOException("closed");
        }
        d(i10, z10 ? 1 : 0, c0843e, i11);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f48291e = true;
        this.f48287a.close();
    }

    public final void d(int i10, int i11, C0843e c0843e, int i12) {
        f(i10, i12, 0, i11);
        if (i12 > 0) {
            InterfaceC0844f interfaceC0844f = this.f48287a;
            AbstractC4862t.b(c0843e);
            interfaceC0844f.J(c0843e, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            r0 = 8
            if (r11 == r0) goto L1d
            java.util.logging.Logger r0 = xe.k.f48286h
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r1 = r0.isLoggable(r1)
            if (r1 == 0) goto L1d
            xe.f r2 = xe.f.f48153a
            r3 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            java.lang.String r9 = r2.c(r3, r4, r5, r6, r7)
            r0.fine(r9)
            goto L21
        L1d:
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
        L21:
            int r9 = r8.f48290d
            if (r5 > r9) goto L62
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 & r4
            if (r9 != 0) goto L47
            Fe.f r9 = r8.f48287a
            qe.m.K(r9, r5)
            Fe.f r9 = r8.f48287a
            r10 = r6 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            Fe.f r9 = r8.f48287a
            r10 = r7 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            Fe.f r8 = r8.f48287a
            r9 = 2147483647(0x7fffffff, float:NaN)
            r9 = r9 & r4
            r8.writeInt(r9)
            return
        L47:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "reserved bit set: "
            r8.append(r9)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L62:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "FRAME_SIZE_ERROR length > "
            r9.append(r10)
            int r8 = r8.f48290d
            r9.append(r8)
            java.lang.String r8 = ": "
            r9.append(r8)
            r9.append(r5)
            java.lang.String r8 = r9.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xe.k.f(int, int, int, int):void");
    }

    public final synchronized void flush() {
        if (this.f48291e) {
            throw new IOException("closed");
        }
        this.f48287a.flush();
    }

    public final synchronized void g(int i10, b errorCode, byte[] debugData) {
        try {
            AbstractC4862t.e(errorCode, "errorCode");
            AbstractC4862t.e(debugData, "debugData");
            if (this.f48291e) {
                throw new IOException("closed");
            }
            if (errorCode.b() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            f(0, debugData.length + 8, 7, 0);
            this.f48287a.writeInt(i10);
            this.f48287a.writeInt(errorCode.b());
            if (!(debugData.length == 0)) {
                this.f48287a.write(debugData);
            }
            this.f48287a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void h(boolean z10, int i10, List headerBlock) {
        AbstractC4862t.e(headerBlock, "headerBlock");
        if (this.f48291e) {
            throw new IOException("closed");
        }
        this.f48292f.g(headerBlock);
        long size = this.f48289c.size();
        long jMin = Math.min(this.f48290d, size);
        int i11 = size == jMin ? 4 : 0;
        if (z10) {
            i11 |= 1;
        }
        f(i10, (int) jMin, 1, i11);
        this.f48287a.J(this.f48289c, jMin);
        if (size > jMin) {
            u(i10, size - jMin);
        }
    }

    public final int i() {
        return this.f48290d;
    }

    public final synchronized void j(boolean z10, int i10, int i11) {
        if (this.f48291e) {
            throw new IOException("closed");
        }
        f(0, 8, 6, z10 ? 1 : 0);
        this.f48287a.writeInt(i10);
        this.f48287a.writeInt(i11);
        this.f48287a.flush();
    }

    public final synchronized void k(int i10, int i11, List requestHeaders) {
        AbstractC4862t.e(requestHeaders, "requestHeaders");
        if (this.f48291e) {
            throw new IOException("closed");
        }
        this.f48292f.g(requestHeaders);
        long size = this.f48289c.size();
        int iMin = (int) Math.min(((long) this.f48290d) - 4, size);
        long j10 = iMin;
        f(i10, iMin + 4, 5, size == j10 ? 4 : 0);
        this.f48287a.writeInt(i11 & Integer.MAX_VALUE);
        this.f48287a.J(this.f48289c, j10);
        if (size > j10) {
            u(i10, size - j10);
        }
    }

    public final synchronized void m(int i10, b errorCode) {
        AbstractC4862t.e(errorCode, "errorCode");
        if (this.f48291e) {
            throw new IOException("closed");
        }
        if (errorCode.b() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        f(i10, 4, 3, 0);
        this.f48287a.writeInt(errorCode.b());
        this.f48287a.flush();
    }

    public final synchronized void o(n settings) {
        try {
            AbstractC4862t.e(settings, "settings");
            if (this.f48291e) {
                throw new IOException("closed");
            }
            int i10 = 0;
            f(0, settings.i() * 6, 4, 0);
            while (i10 < 10) {
                if (settings.f(i10)) {
                    this.f48287a.writeShort(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                    this.f48287a.writeInt(settings.a(i10));
                }
                i10++;
            }
            this.f48287a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void q(int i10, long j10) {
        int i11;
        long j11;
        try {
            if (this.f48291e) {
                throw new IOException("closed");
            }
            if (j10 == 0 || j10 > 2147483647L) {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
            }
            Logger logger = f48286h;
            if (logger.isLoggable(Level.FINE)) {
                i11 = i10;
                j11 = j10;
                logger.fine(f.f48153a.d(false, i11, 4, j11));
            } else {
                i11 = i10;
                j11 = j10;
            }
            f(i11, 4, 8, 0);
            this.f48287a.writeInt((int) j11);
            this.f48287a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void u(int i10, long j10) {
        while (j10 > 0) {
            long jMin = Math.min(this.f48290d, j10);
            j10 -= jMin;
            f(i10, (int) jMin, 9, j10 == 0 ? 4 : 0);
            this.f48287a.J(this.f48289c, jMin);
        }
    }
}
