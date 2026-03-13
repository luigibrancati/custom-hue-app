package I1;

import G1.AbstractC0853a;
import G1.M;
import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f5426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f5427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5429h;

    public e() {
        super(false);
    }

    @Override // I1.f
    public void close() {
        if (this.f5427f != null) {
            this.f5427f = null;
            u();
        }
        this.f5426e = null;
    }

    @Override // I1.f
    public long f(j jVar) throws g, D1.w {
        v(jVar);
        this.f5426e = jVar;
        Uri uriNormalizeScheme = jVar.f5437a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        AbstractC0853a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrH1 = M.h1(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrH1.length != 2) {
            throw D1.w.b("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrH1[1];
        if (strArrH1[0].contains(";base64")) {
            try {
                this.f5427f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw D1.w.b("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f5427f = M.u0(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
        }
        long j10 = jVar.f5443g;
        byte[] bArr = this.f5427f;
        if (j10 > bArr.length) {
            this.f5427f = null;
            throw new g(2008);
        }
        int i10 = (int) j10;
        this.f5428g = i10;
        int length = bArr.length - i10;
        this.f5429h = length;
        long j11 = jVar.f5444h;
        if (j11 != -1) {
            this.f5429h = (int) Math.min(length, j11);
        }
        w(jVar);
        long j12 = jVar.f5444h;
        return j12 != -1 ? j12 : this.f5429h;
    }

    @Override // I1.f
    public Uri getUri() {
        j jVar = this.f5426e;
        if (jVar != null) {
            return jVar.f5437a;
        }
        return null;
    }

    @Override // D1.InterfaceC0749g
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f5429h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(M.i(this.f5427f), this.f5428g, bArr, i10, iMin);
        this.f5428g += iMin;
        this.f5429h -= iMin;
        t(iMin);
        return iMin;
    }
}
