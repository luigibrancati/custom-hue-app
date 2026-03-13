package P2;

import D1.o;
import G1.AbstractC0853a;
import P2.L;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC1853m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13006a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i2.O f13008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13009d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13012g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1.C f13007b = new G1.C(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13010e = -9223372036854775807L;

    public r(String str) {
        this.f13006a = str;
    }

    @Override // P2.InterfaceC1853m
    public void a(G1.C c10) {
        AbstractC0853a.i(this.f13008c);
        if (this.f13009d) {
            int iA = c10.a();
            int i10 = this.f13012g;
            if (i10 < 10) {
                int iMin = Math.min(iA, 10 - i10);
                System.arraycopy(c10.f(), c10.g(), this.f13007b.f(), this.f13012g, iMin);
                if (this.f13012g + iMin == 10) {
                    this.f13007b.a0(0);
                    if (73 != this.f13007b.L() || 68 != this.f13007b.L() || 51 != this.f13007b.L()) {
                        G1.t.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f13009d = false;
                        return;
                    } else {
                        this.f13007b.b0(3);
                        this.f13011f = this.f13007b.K() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f13011f - this.f13012g);
            this.f13008c.b(c10, iMin2);
            this.f13012g += iMin2;
        }
    }

    @Override // P2.InterfaceC1853m
    public void b() {
        this.f13009d = false;
        this.f13010e = -9223372036854775807L;
    }

    @Override // P2.InterfaceC1853m
    public void c(boolean z10) {
        int i10;
        AbstractC0853a.i(this.f13008c);
        if (this.f13009d && (i10 = this.f13011f) != 0 && this.f13012g == i10) {
            AbstractC0853a.g(this.f13010e != -9223372036854775807L);
            this.f13008c.d(this.f13010e, 1, this.f13011f, 0, null);
            this.f13009d = false;
        }
    }

    @Override // P2.InterfaceC1853m
    public void d(i2.r rVar, L.d dVar) {
        dVar.a();
        i2.O oF = rVar.f(dVar.c(), 5);
        this.f13008c = oF;
        oF.e(new o.b().j0(dVar.b()).W(this.f13006a).y0("application/id3").P());
    }

    @Override // P2.InterfaceC1853m
    public void e(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f13009d = true;
        this.f13010e = j10;
        this.f13011f = 0;
        this.f13012g = 0;
    }
}
