package androidx.media3.exoplayer.rtsp;

import G1.AbstractC0853a;
import G1.M;
import I1.x;
import I1.y;
import android.net.Uri;
import androidx.media3.exoplayer.rtsp.g;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f23836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f23837b;

    public l(long j10) {
        this.f23836a = new y(2000, N7.g.e(j10));
    }

    @Override // androidx.media3.exoplayer.rtsp.a
    public String b() {
        int iC = c();
        AbstractC0853a.g(iC != -1);
        return M.G("RTP/AVP;unicast;client_port=%d-%d", Integer.valueOf(iC), Integer.valueOf(iC + 1));
    }

    @Override // androidx.media3.exoplayer.rtsp.a
    public int c() {
        int iC = this.f23836a.c();
        if (iC == -1) {
            return -1;
        }
        return iC;
    }

    @Override // I1.f
    public void close() {
        this.f23836a.close();
        l lVar = this.f23837b;
        if (lVar != null) {
            lVar.close();
        }
    }

    @Override // I1.f
    public long f(I1.j jVar) {
        return this.f23836a.f(jVar);
    }

    @Override // I1.f
    public Uri getUri() {
        return this.f23836a.getUri();
    }

    @Override // I1.f
    public void h(x xVar) {
        this.f23836a.h(xVar);
    }

    @Override // androidx.media3.exoplayer.rtsp.a
    public boolean k() {
        return true;
    }

    public void l(l lVar) {
        AbstractC0853a.a(this != lVar);
        this.f23837b = lVar;
    }

    @Override // androidx.media3.exoplayer.rtsp.a
    public g.b n() {
        return null;
    }

    @Override // D1.InterfaceC0749g
    public int read(byte[] bArr, int i10, int i11) throws y.a {
        try {
            return this.f23836a.read(bArr, i10, i11);
        } catch (y.a e10) {
            if (e10.f5430a == 2002) {
                return -1;
            }
            throw e10;
        }
    }
}
