package P2;

import D1.o;
import G1.AbstractC0853a;
import P2.L;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: P2.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1852l implements InterfaceC1853m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i2.O[] f12872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12876g = -9223372036854775807L;

    public C1852l(List list, String str) {
        this.f12870a = list;
        this.f12871b = str;
        this.f12872c = new i2.O[list.size()];
    }

    @Override // P2.InterfaceC1853m
    public void a(G1.C c10) {
        if (this.f12873d) {
            if (this.f12874e != 2 || f(c10, 32)) {
                if (this.f12874e != 1 || f(c10, 0)) {
                    int iG = c10.g();
                    int iA = c10.a();
                    for (i2.O o10 : this.f12872c) {
                        c10.a0(iG);
                        o10.b(c10, iA);
                    }
                    this.f12875f += iA;
                }
            }
        }
    }

    @Override // P2.InterfaceC1853m
    public void b() {
        this.f12873d = false;
        this.f12876g = -9223372036854775807L;
    }

    @Override // P2.InterfaceC1853m
    public void c(boolean z10) {
        if (this.f12873d) {
            AbstractC0853a.g(this.f12876g != -9223372036854775807L);
            for (i2.O o10 : this.f12872c) {
                o10.d(this.f12876g, 1, this.f12875f, 0, null);
            }
            this.f12873d = false;
        }
    }

    @Override // P2.InterfaceC1853m
    public void d(i2.r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f12872c.length; i10++) {
            L.a aVar = (L.a) this.f12870a.get(i10);
            dVar.a();
            i2.O oF = rVar.f(dVar.c(), 3);
            oF.e(new o.b().j0(dVar.b()).W(this.f12871b).y0("application/dvbsubs").k0(Collections.singletonList(aVar.f12761c)).n0(aVar.f12759a).P());
            this.f12872c[i10] = oF;
        }
    }

    @Override // P2.InterfaceC1853m
    public void e(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f12873d = true;
        this.f12876g = j10;
        this.f12875f = 0;
        this.f12874e = 2;
    }

    public final boolean f(G1.C c10, int i10) {
        if (c10.a() == 0) {
            return false;
        }
        if (c10.L() != i10) {
            this.f12873d = false;
        }
        this.f12874e--;
        return this.f12873d;
    }
}
