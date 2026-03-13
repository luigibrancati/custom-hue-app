package a2;

import G1.AbstractC0853a;
import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: a2.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2637x implements I1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I1.f f20910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f20912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f20913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20914e;

    /* JADX INFO: renamed from: a2.x$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(G1.C c10);
    }

    public C2637x(I1.f fVar, int i10, a aVar) {
        AbstractC0853a.a(i10 > 0);
        this.f20910a = fVar;
        this.f20911b = i10;
        this.f20912c = aVar;
        this.f20913d = new byte[1];
        this.f20914e = i10;
    }

    @Override // I1.f
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // I1.f
    public long f(I1.j jVar) {
        throw new UnsupportedOperationException();
    }

    @Override // I1.f
    public Map g() {
        return this.f20910a.g();
    }

    @Override // I1.f
    public Uri getUri() {
        return this.f20910a.getUri();
    }

    @Override // I1.f
    public void h(I1.x xVar) {
        AbstractC0853a.e(xVar);
        this.f20910a.h(xVar);
    }

    public final boolean l() {
        if (this.f20910a.read(this.f20913d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f20913d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = this.f20910a.read(bArr, i12, i11);
            if (i13 == -1) {
                return false;
            }
            i12 += i13;
            i11 -= i13;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f20912c.a(new G1.C(bArr, i10));
        }
        return true;
    }

    @Override // D1.InterfaceC0749g
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f20914e == 0) {
            if (!l()) {
                return -1;
            }
            this.f20914e = this.f20911b;
        }
        int i12 = this.f20910a.read(bArr, i10, Math.min(this.f20914e, i11));
        if (i12 != -1) {
            this.f20914e -= i12;
        }
        return i12;
    }
}
