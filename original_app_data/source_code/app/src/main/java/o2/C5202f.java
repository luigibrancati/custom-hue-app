package o2;

import D1.o;
import D1.w;
import G1.C;
import H1.g;
import i2.C4324d;
import i2.O;
import o2.AbstractC5201e;

/* JADX INFO: renamed from: o2.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5202f extends AbstractC5201e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f41143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f41144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41148g;

    public C5202f(O o10) {
        super(o10);
        this.f41143b = new C(g.f5132a);
        this.f41144c = new C(4);
    }

    @Override // o2.AbstractC5201e
    public boolean b(C c10) throws AbstractC5201e.a {
        int iL = c10.L();
        int i10 = (iL >> 4) & 15;
        int i11 = iL & 15;
        if (i11 == 7) {
            this.f41148g = i10;
            return i10 != 5;
        }
        throw new AbstractC5201e.a("Video format not supported: " + i11);
    }

    @Override // o2.AbstractC5201e
    public boolean c(C c10, long j10) throws w {
        int iL = c10.L();
        long jV = j10 + (((long) c10.v()) * 1000);
        if (iL == 0 && !this.f41146e) {
            C c11 = new C(new byte[c10.a()]);
            c10.q(c11.f(), 0, c10.a());
            C4324d c4324dB = C4324d.b(c11);
            this.f41145d = c4324dB.f36952b;
            this.f41142a.e(new o.b().W("video/x-flv").y0("video/avc").U(c4324dB.f36962l).F0(c4324dB.f36953c).h0(c4324dB.f36954d).u0(c4324dB.f36961k).k0(c4324dB.f36951a).P());
            this.f41146e = true;
            return false;
        }
        if (iL != 1 || !this.f41146e) {
            return false;
        }
        int i10 = this.f41148g == 1 ? 1 : 0;
        if (!this.f41147f && i10 == 0) {
            return false;
        }
        byte[] bArrF = this.f41144c.f();
        bArrF[0] = 0;
        bArrF[1] = 0;
        bArrF[2] = 0;
        int i11 = 4 - this.f41145d;
        int i12 = 0;
        while (c10.a() > 0) {
            c10.q(this.f41144c.f(), i11, this.f41145d);
            this.f41144c.a0(0);
            int iP = this.f41144c.P();
            this.f41143b.a0(0);
            this.f41142a.b(this.f41143b, 4);
            this.f41142a.b(c10, iP);
            i12 = i12 + 4 + iP;
        }
        this.f41142a.d(jV, i10, i12, 0, null);
        this.f41147f = true;
        return true;
    }
}
