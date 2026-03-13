package P2;

import P2.L;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class E implements L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f12706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1.C f12707b = new G1.C(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12711f;

    public E(D d10) {
        this.f12706a = d10;
    }

    @Override // P2.L
    public void a(G1.C c10, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int iG = z10 ? c10.g() + c10.L() : -1;
        if (this.f12711f) {
            if (!z10) {
                return;
            }
            this.f12711f = false;
            c10.a0(iG);
            this.f12709d = 0;
        }
        while (c10.a() > 0) {
            int i11 = this.f12709d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iL = c10.L();
                    c10.a0(c10.g() - 1);
                    if (iL == 255) {
                        this.f12711f = true;
                        return;
                    }
                }
                int iMin = Math.min(c10.a(), 3 - this.f12709d);
                c10.q(this.f12707b.f(), this.f12709d, iMin);
                int i12 = this.f12709d + iMin;
                this.f12709d = i12;
                if (i12 == 3) {
                    this.f12707b.a0(0);
                    this.f12707b.Z(3);
                    this.f12707b.b0(1);
                    int iL2 = this.f12707b.L();
                    int iL3 = this.f12707b.L();
                    this.f12710e = (iL2 & 128) != 0;
                    this.f12708c = (((iL2 & 15) << 8) | iL3) + 3;
                    int iB = this.f12707b.b();
                    int i13 = this.f12708c;
                    if (iB < i13) {
                        this.f12707b.d(Math.min(4098, Math.max(i13, this.f12707b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c10.a(), this.f12708c - this.f12709d);
                c10.q(this.f12707b.f(), this.f12709d, iMin2);
                int i14 = this.f12709d + iMin2;
                this.f12709d = i14;
                int i15 = this.f12708c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f12710e) {
                        this.f12707b.Z(i15);
                    } else {
                        if (G1.M.w(this.f12707b.f(), 0, this.f12708c, -1) != 0) {
                            this.f12711f = true;
                            return;
                        }
                        this.f12707b.Z(this.f12708c - 4);
                    }
                    this.f12707b.a0(0);
                    this.f12706a.a(this.f12707b);
                    this.f12709d = 0;
                }
            }
        }
    }

    @Override // P2.L
    public void b() {
        this.f12711f = true;
    }

    @Override // P2.L
    public void c(G1.H h10, i2.r rVar, L.d dVar) {
        this.f12706a.c(h10, rVar, dVar);
        this.f12711f = true;
    }
}
