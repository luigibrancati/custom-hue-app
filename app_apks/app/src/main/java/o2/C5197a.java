package o2;

import D1.o;
import G1.C;
import i2.AbstractC4321a;
import i2.O;
import java.util.Collections;
import o2.AbstractC5201e;

/* JADX INFO: renamed from: o2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5197a extends AbstractC5201e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f41118e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41121d;

    public C5197a(O o10) {
        super(o10);
    }

    @Override // o2.AbstractC5201e
    public boolean b(C c10) throws AbstractC5201e.a {
        if (this.f41119b) {
            c10.b0(1);
        } else {
            int iL = c10.L();
            int i10 = (iL >> 4) & 15;
            this.f41121d = i10;
            if (i10 == 2) {
                this.f41142a.e(new o.b().W("video/x-flv").y0("audio/mpeg").T(1).z0(f41118e[(iL >> 2) & 3]).P());
                this.f41120c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f41142a.e(new o.b().W("video/x-flv").y0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").T(1).z0(8000).P());
                this.f41120c = true;
            } else if (i10 != 10) {
                throw new AbstractC5201e.a("Audio format not supported: " + this.f41121d);
            }
            this.f41119b = true;
        }
        return true;
    }

    @Override // o2.AbstractC5201e
    public boolean c(C c10, long j10) {
        if (this.f41121d == 2) {
            int iA = c10.a();
            this.f41142a.b(c10, iA);
            this.f41142a.d(j10, 1, iA, 0, null);
            return true;
        }
        int iL = c10.L();
        if (iL != 0 || this.f41120c) {
            if (this.f41121d == 10 && iL != 1) {
                return false;
            }
            int iA2 = c10.a();
            this.f41142a.b(c10, iA2);
            this.f41142a.d(j10, 1, iA2, 0, null);
            return true;
        }
        int iA3 = c10.a();
        byte[] bArr = new byte[iA3];
        c10.q(bArr, 0, iA3);
        AbstractC4321a.b bVarF = AbstractC4321a.f(bArr);
        this.f41142a.e(new o.b().W("video/x-flv").y0("audio/mp4a-latm").U(bVarF.f36924c).T(bVarF.f36923b).z0(bVarF.f36922a).k0(Collections.singletonList(bArr)).P());
        this.f41120c = true;
        return false;
    }
}
