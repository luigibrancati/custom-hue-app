package D2;

import D1.o;
import D1.u;
import D2.i;
import G1.AbstractC0853a;
import G1.C;
import K7.AbstractC1081v;
import i2.H;
import i2.S;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f2184o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f2185p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2186n;

    public static boolean n(C c10, byte[] bArr) {
        if (c10.a() < bArr.length) {
            return false;
        }
        int iG = c10.g();
        byte[] bArr2 = new byte[bArr.length];
        c10.q(bArr2, 0, bArr.length);
        c10.a0(iG);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(C c10) {
        return n(c10, f2184o);
    }

    @Override // D2.i
    public long f(C c10) {
        return c(H.e(c10.f()));
    }

    @Override // D2.i
    public boolean h(C c10, long j10, i.b bVar) {
        if (n(c10, f2184o)) {
            byte[] bArrCopyOf = Arrays.copyOf(c10.f(), c10.j());
            int iC = H.c(bArrCopyOf);
            List listA = H.a(bArrCopyOf);
            if (bVar.f2200a != null) {
                return true;
            }
            bVar.f2200a = new o.b().W("audio/ogg").y0("audio/opus").T(iC).z0(48000).k0(listA).P();
            return true;
        }
        byte[] bArr = f2185p;
        if (!n(c10, bArr)) {
            AbstractC0853a.i(bVar.f2200a);
            return false;
        }
        AbstractC0853a.i(bVar.f2200a);
        if (this.f2186n) {
            return true;
        }
        this.f2186n = true;
        c10.b0(bArr.length);
        u uVarD = S.d(AbstractC1081v.w(S.k(c10, false, false).f36904b));
        if (uVarD == null) {
            return true;
        }
        bVar.f2200a = bVar.f2200a.b().r0(uVarD.b(bVar.f2200a.f1802l)).P();
        return true;
    }

    @Override // D2.i
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f2186n = false;
        }
    }
}
