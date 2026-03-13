package P2;

import G1.AbstractC0853a;
import P2.L;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class y implements L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1853m f13087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1.B f13088b = new G1.B(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13089c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public G1.H f13091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13095i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13096j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13097k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f13098l;

    public y(InterfaceC1853m interfaceC1853m) {
        this.f13087a = interfaceC1853m;
    }

    @Override // P2.L
    public void a(G1.C c10, int i10) {
        AbstractC0853a.i(this.f13091e);
        if ((i10 & 1) != 0) {
            int i11 = this.f13089c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    G1.t.h("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f13096j != -1) {
                        G1.t.h("PesReader", "Unexpected start indicator: expected " + this.f13096j + " more bytes");
                    }
                    this.f13087a.c(c10.j() == 0);
                }
            }
            h(1);
        }
        while (c10.a() > 0) {
            int i12 = this.f13089c;
            if (i12 == 0) {
                c10.b0(c10.a());
            } else if (i12 != 1) {
                if (i12 == 2) {
                    if (e(c10, this.f13088b.f4234a, Math.min(10, this.f13095i)) && e(c10, null, this.f13095i)) {
                        g();
                        i10 |= this.f13097k ? 4 : 0;
                        this.f13087a.e(this.f13098l, i10);
                        h(3);
                    }
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    int iA = c10.a();
                    int i13 = this.f13096j;
                    int i14 = i13 == -1 ? 0 : iA - i13;
                    if (i14 > 0) {
                        iA -= i14;
                        c10.Z(c10.g() + iA);
                    }
                    this.f13087a.a(c10);
                    int i15 = this.f13096j;
                    if (i15 != -1) {
                        int i16 = i15 - iA;
                        this.f13096j = i16;
                        if (i16 == 0) {
                            this.f13087a.c(false);
                            h(1);
                        }
                    }
                }
            } else if (e(c10, this.f13088b.f4234a, 9)) {
                h(f() ? 2 : 0);
            }
        }
    }

    @Override // P2.L
    public void b() {
        this.f13089c = 0;
        this.f13090d = 0;
        this.f13094h = false;
        this.f13087a.b();
    }

    @Override // P2.L
    public void c(G1.H h10, i2.r rVar, L.d dVar) {
        this.f13091e = h10;
        this.f13087a.d(rVar, dVar);
    }

    public boolean d(boolean z10) {
        return this.f13089c == 3 && this.f13096j == -1 && !(z10 && (this.f13087a instanceof C1854n)) && (!z10 || f());
    }

    public final boolean e(G1.C c10, byte[] bArr, int i10) {
        int iMin = Math.min(c10.a(), i10 - this.f13090d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c10.b0(iMin);
        } else {
            c10.q(bArr, this.f13090d, iMin);
        }
        int i11 = this.f13090d + iMin;
        this.f13090d = i11;
        return i11 == i10;
    }

    public final boolean f() {
        this.f13088b.p(0);
        int iH = this.f13088b.h(24);
        if (iH != 1) {
            G1.t.h("PesReader", "Unexpected start code prefix: " + iH);
            this.f13096j = -1;
            return false;
        }
        this.f13088b.r(8);
        int iH2 = this.f13088b.h(16);
        this.f13088b.r(5);
        this.f13097k = this.f13088b.g();
        this.f13088b.r(2);
        this.f13092f = this.f13088b.g();
        this.f13093g = this.f13088b.g();
        this.f13088b.r(6);
        int iH3 = this.f13088b.h(8);
        this.f13095i = iH3;
        if (iH2 == 0) {
            this.f13096j = -1;
        } else {
            int i10 = (iH2 - 3) - iH3;
            this.f13096j = i10;
            if (i10 < 0) {
                G1.t.h("PesReader", "Found negative packet payload size: " + this.f13096j);
                this.f13096j = -1;
            }
        }
        return true;
    }

    public final void g() {
        this.f13088b.p(0);
        this.f13098l = -9223372036854775807L;
        if (this.f13092f) {
            this.f13088b.r(4);
            long jH = ((long) this.f13088b.h(3)) << 30;
            this.f13088b.r(1);
            long jH2 = jH | ((long) (this.f13088b.h(15) << 15));
            this.f13088b.r(1);
            long jH3 = jH2 | ((long) this.f13088b.h(15));
            this.f13088b.r(1);
            if (!this.f13094h && this.f13093g) {
                this.f13088b.r(4);
                long jH4 = ((long) this.f13088b.h(3)) << 30;
                this.f13088b.r(1);
                long jH5 = jH4 | ((long) (this.f13088b.h(15) << 15));
                this.f13088b.r(1);
                long jH6 = jH5 | ((long) this.f13088b.h(15));
                this.f13088b.r(1);
                this.f13091e.b(jH6);
                this.f13094h = true;
            }
            this.f13098l = this.f13091e.b(jH3);
        }
    }

    public final void h(int i10) {
        this.f13089c = i10;
        this.f13090d = 0;
    }
}
