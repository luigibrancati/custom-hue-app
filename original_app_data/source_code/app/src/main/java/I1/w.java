package I1;

import G1.AbstractC0853a;
import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class w implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f5519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f5521c = Uri.EMPTY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f5522d = Collections.EMPTY_MAP;

    public w(f fVar) {
        this.f5519a = (f) AbstractC0853a.e(fVar);
    }

    @Override // I1.f
    public void close() {
        this.f5519a.close();
    }

    @Override // I1.f
    public long f(j jVar) {
        this.f5521c = jVar.f5437a;
        this.f5522d = Collections.EMPTY_MAP;
        try {
            return this.f5519a.f(jVar);
        } finally {
            Uri uri = getUri();
            if (uri != null) {
                this.f5521c = uri;
            }
            this.f5522d = g();
        }
    }

    @Override // I1.f
    public Map g() {
        return this.f5519a.g();
    }

    @Override // I1.f
    public Uri getUri() {
        return this.f5519a.getUri();
    }

    @Override // I1.f
    public void h(x xVar) {
        AbstractC0853a.e(xVar);
        this.f5519a.h(xVar);
    }

    public long l() {
        return this.f5520b;
    }

    @Override // D1.InterfaceC0749g
    public int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f5519a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f5520b += (long) i12;
        }
        return i12;
    }

    public Uri t() {
        return this.f5521c;
    }

    public Map u() {
        return this.f5522d;
    }

    public void v() {
        this.f5520b = 0L;
    }
}
