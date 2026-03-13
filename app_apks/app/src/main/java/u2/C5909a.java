package u2;

import D1.t;
import D1.u;
import D1.v;
import G1.C;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: u2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5909a implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f45051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f45052h;

    public C5909a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f45045a = i10;
        this.f45046b = str;
        this.f45047c = str2;
        this.f45048d = i11;
        this.f45049e = i12;
        this.f45050f = i13;
        this.f45051g = i14;
        this.f45052h = bArr;
    }

    public static C5909a d(C c10) {
        int iU = c10.u();
        String strU = v.u(c10.J(c10.u(), StandardCharsets.US_ASCII));
        String strI = c10.I(c10.u());
        int iU2 = c10.u();
        int iU3 = c10.u();
        int iU4 = c10.u();
        int iU5 = c10.u();
        int iU6 = c10.u();
        byte[] bArr = new byte[iU6];
        c10.q(bArr, 0, iU6);
        return new C5909a(iU, strU, strI, iU2, iU3, iU4, iU5, bArr);
    }

    @Override // D1.u.a
    public void b(t.b bVar) {
        bVar.K(this.f45052h, this.f45045a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5909a.class == obj.getClass()) {
            C5909a c5909a = (C5909a) obj;
            if (this.f45045a == c5909a.f45045a && this.f45046b.equals(c5909a.f45046b) && this.f45047c.equals(c5909a.f45047c) && this.f45048d == c5909a.f45048d && this.f45049e == c5909a.f45049e && this.f45050f == c5909a.f45050f && this.f45051g == c5909a.f45051g && Arrays.equals(this.f45052h, c5909a.f45052h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f45045a) * 31) + this.f45046b.hashCode()) * 31) + this.f45047c.hashCode()) * 31) + this.f45048d) * 31) + this.f45049e) * 31) + this.f45050f) * 31) + this.f45051g) * 31) + Arrays.hashCode(this.f45052h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f45046b + ", description=" + this.f45047c;
    }
}
