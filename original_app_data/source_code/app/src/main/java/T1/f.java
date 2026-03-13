package T1;

import G1.AbstractC0853a;
import G1.C0863k;
import G1.M;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class f implements n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f15905g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f15906h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f15907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f15908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f15909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f15910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0863k f15911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15912f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            f.this.h(message);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f15917d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f15918e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f15919f;

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f15914a = i10;
            this.f15915b = i11;
            this.f15916c = i12;
            this.f15918e = j10;
            this.f15919f = i13;
        }
    }

    public f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C0863k());
    }

    public static void e(J1.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f5869f;
        cryptoInfo.numBytesOfClearData = g(cVar.f5867d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = g(cVar.f5868e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) AbstractC0853a.e(f(cVar.f5865b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) AbstractC0853a.e(f(cVar.f5864a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f5866c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f5870g, cVar.f5871h));
    }

    public static byte[] f(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int[] g(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static b m() {
        ArrayDeque arrayDeque = f15905g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return (b) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void n(b bVar) {
        ArrayDeque arrayDeque = f15905g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    @Override // T1.n
    public void a(int i10, int i11, J1.c cVar, long j10, int i12) {
        b();
        b bVarM = m();
        bVarM.a(i10, i11, 0, j10, i12);
        e(cVar, bVarM.f15917d);
        ((Handler) M.i(this.f15909c)).obtainMessage(2, bVarM).sendToTarget();
    }

    @Override // T1.n
    public void b() {
        RuntimeException runtimeException = (RuntimeException) this.f15910d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void d() {
        this.f15911e.d();
        ((Handler) AbstractC0853a.e(this.f15909c)).obtainMessage(3).sendToTarget();
        this.f15911e.a();
    }

    @Override // T1.n
    public void flush() {
        if (this.f15912f) {
            try {
                l();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.os.Message r9) {
        /*
            r8 = this;
            int r2 = r9.what
            r3 = 1
            if (r2 == r3) goto L43
            r3 = 2
            if (r2 == r3) goto L2e
            r3 = 3
            r4 = 0
            if (r2 == r3) goto L28
            r3 = 4
            if (r2 == r3) goto L20
            java.util.concurrent.atomic.AtomicReference r0 = r8.f15910d
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            int r1 = r9.what
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.<init>(r1)
            T1.e.a(r0, r4, r2)
            goto L57
        L20:
            java.lang.Object r1 = r9.obj
            android.os.Bundle r1 = (android.os.Bundle) r1
            r8.k(r1)
            goto L57
        L28:
            G1.k r0 = r8.f15911e
            r0.f()
            goto L57
        L2e:
            java.lang.Object r1 = r9.obj
            r7 = r1
            T1.f$b r7 = (T1.f.b) r7
            int r1 = r7.f15914a
            int r2 = r7.f15915b
            android.media.MediaCodec$CryptoInfo r3 = r7.f15917d
            long r4 = r7.f15918e
            int r6 = r7.f15919f
            r0 = r8
            r0.j(r1, r2, r3, r4, r6)
        L41:
            r4 = r7
            goto L57
        L43:
            java.lang.Object r0 = r9.obj
            r7 = r0
            T1.f$b r7 = (T1.f.b) r7
            int r1 = r7.f15914a
            int r2 = r7.f15915b
            int r3 = r7.f15916c
            long r4 = r7.f15918e
            int r6 = r7.f15919f
            r0 = r8
            r0.i(r1, r2, r3, r4, r6)
            goto L41
        L57:
            if (r4 == 0) goto L5c
            n(r4)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.f.h(android.os.Message):void");
    }

    public final void i(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f15907a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            e.a(this.f15910d, null, e10);
        }
    }

    public final void j(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f15906h) {
                this.f15907a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            e.a(this.f15910d, null, e10);
        }
    }

    public final void k(Bundle bundle) {
        try {
            this.f15907a.setParameters(bundle);
        } catch (RuntimeException e10) {
            e.a(this.f15910d, null, e10);
        }
    }

    public final void l() {
        ((Handler) AbstractC0853a.e(this.f15909c)).removeCallbacksAndMessages(null);
        d();
    }

    @Override // T1.n
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        b();
        b bVarM = m();
        bVarM.a(i10, i11, i12, j10, i13);
        ((Handler) M.i(this.f15909c)).obtainMessage(1, bVarM).sendToTarget();
    }

    @Override // T1.n
    public void setParameters(Bundle bundle) {
        b();
        ((Handler) M.i(this.f15909c)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // T1.n
    public void shutdown() {
        if (this.f15912f) {
            flush();
            this.f15908b.quit();
        }
        this.f15912f = false;
    }

    @Override // T1.n
    public void start() {
        if (this.f15912f) {
            return;
        }
        this.f15908b.start();
        this.f15909c = new a(this.f15908b.getLooper());
        this.f15912f = true;
    }

    public f(MediaCodec mediaCodec, HandlerThread handlerThread, C0863k c0863k) {
        this.f15907a = mediaCodec;
        this.f15908b = handlerThread;
        this.f15911e = c0863k;
        this.f15910d = new AtomicReference();
    }
}
