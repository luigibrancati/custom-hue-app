package androidx.media3.exoplayer.rtsp;

import G1.AbstractC0853a;
import G1.M;
import android.net.Uri;
import androidx.media3.exoplayer.rtsp.g;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j extends I1.b implements a, g.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedBlockingQueue f23831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f23832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f23833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23834h;

    public j(long j10) {
        super(true);
        this.f23832f = j10;
        this.f23831e = new LinkedBlockingQueue();
        this.f23833g = new byte[0];
        this.f23834h = -1;
    }

    @Override // androidx.media3.exoplayer.rtsp.a
    public String b() {
        AbstractC0853a.g(this.f23834h != -1);
        return M.G("RTP/AVP/TCP;unicast;interleaved=%d-%d", Integer.valueOf(this.f23834h), Integer.valueOf(this.f23834h + 1));
    }

    @Override // androidx.media3.exoplayer.rtsp.a
    public int c() {
        return this.f23834h;
    }

    @Override // I1.f
    public long f(I1.j jVar) {
        this.f23834h = jVar.f5437a.getPort();
        return -1L;
    }

    @Override // I1.f
    public Uri getUri() {
        return null;
    }

    @Override // androidx.media3.exoplayer.rtsp.a
    public boolean k() {
        return false;
    }

    @Override // androidx.media3.exoplayer.rtsp.g.b
    public void l(byte[] bArr) {
        this.f23831e.add(bArr);
    }

    @Override // D1.InterfaceC0749g
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int iMin = Math.min(i11, this.f23833g.length);
        System.arraycopy(this.f23833g, 0, bArr, i10, iMin);
        byte[] bArr2 = this.f23833g;
        this.f23833g = Arrays.copyOfRange(bArr2, iMin, bArr2.length);
        if (iMin == i11) {
            return iMin;
        }
        try {
            byte[] bArr3 = (byte[]) this.f23831e.poll(this.f23832f, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int iMin2 = Math.min(i11 - iMin, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i10 + iMin, iMin2);
            if (iMin2 < bArr3.length) {
                this.f23833g = Arrays.copyOfRange(bArr3, iMin2, bArr3.length);
            }
            return iMin + iMin2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // I1.f
    public void close() {
    }

    @Override // androidx.media3.exoplayer.rtsp.a
    public g.b n() {
        return this;
    }
}
