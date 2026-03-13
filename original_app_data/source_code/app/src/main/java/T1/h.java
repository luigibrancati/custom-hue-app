package T1;

import G1.AbstractC0853a;
import G1.M;
import T1.m;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import b0.C2782f;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f15922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f15923c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaFormat f15928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaFormat f15929i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f15930j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f15931k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f15932l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IllegalStateException f15934n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m.c f15935o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15921a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2782f f15924d = new C2782f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2782f f15925e = new C2782f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f15926f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f15927g = new ArrayDeque();

    public h(HandlerThread handlerThread) {
        this.f15922b = handlerThread;
    }

    public final void b(MediaFormat mediaFormat) {
        this.f15925e.a(-2);
        this.f15927g.add(mediaFormat);
    }

    public int c() {
        synchronized (this.f15921a) {
            try {
                j();
                int iE = -1;
                if (i()) {
                    return -1;
                }
                if (!this.f15924d.d()) {
                    iE = this.f15924d.e();
                }
                return iE;
            } finally {
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f15921a) {
            try {
                j();
                if (i()) {
                    return -1;
                }
                if (this.f15925e.d()) {
                    return -1;
                }
                int iE = this.f15925e.e();
                if (iE >= 0) {
                    AbstractC0853a.i(this.f15928h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f15926f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iE == -2) {
                    this.f15928h = (MediaFormat) this.f15927g.remove();
                }
                return iE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.f15921a) {
            this.f15932l++;
            ((Handler) M.i(this.f15923c)).post(new Runnable() { // from class: T1.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15920a.n();
                }
            });
        }
    }

    public final void f() {
        if (!this.f15927g.isEmpty()) {
            this.f15929i = (MediaFormat) this.f15927g.getLast();
        }
        this.f15924d.b();
        this.f15925e.b();
        this.f15926f.clear();
        this.f15927g.clear();
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f15921a) {
            try {
                mediaFormat = this.f15928h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        AbstractC0853a.g(this.f15923c == null);
        this.f15922b.start();
        Handler handler = new Handler(this.f15922b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f15923c = handler;
    }

    public final boolean i() {
        return this.f15932l > 0 || this.f15933m;
    }

    public final void j() {
        k();
        m();
        l();
    }

    public final void k() {
        IllegalStateException illegalStateException = this.f15934n;
        if (illegalStateException == null) {
            return;
        }
        this.f15934n = null;
        throw illegalStateException;
    }

    public final void l() {
        MediaCodec.CryptoException cryptoException = this.f15931k;
        if (cryptoException == null) {
            return;
        }
        this.f15931k = null;
        throw cryptoException;
    }

    public final void m() {
        MediaCodec.CodecException codecException = this.f15930j;
        if (codecException == null) {
            return;
        }
        this.f15930j = null;
        throw codecException;
    }

    public final void n() {
        synchronized (this.f15921a) {
            try {
                if (this.f15933m) {
                    return;
                }
                long j10 = this.f15932l - 1;
                this.f15932l = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 < 0) {
                    o(new IllegalStateException());
                } else {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(IllegalStateException illegalStateException) {
        synchronized (this.f15921a) {
            this.f15934n = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f15921a) {
            this.f15931k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f15921a) {
            this.f15930j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f15921a) {
            try {
                this.f15924d.a(i10);
                m.c cVar = this.f15935o;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f15921a) {
            try {
                MediaFormat mediaFormat = this.f15929i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f15929i = null;
                }
                this.f15925e.a(i10);
                this.f15926f.add(bufferInfo);
                m.c cVar = this.f15935o;
                if (cVar != null) {
                    cVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f15921a) {
            b(mediaFormat);
            this.f15929i = null;
        }
    }

    public void p(m.c cVar) {
        synchronized (this.f15921a) {
            this.f15935o = cVar;
        }
    }

    public void q() {
        synchronized (this.f15921a) {
            this.f15933m = true;
            this.f15922b.quit();
            f();
        }
    }
}
