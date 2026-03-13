package E4;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import vc.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public String f3262P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Map f3263Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Map f3264R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Map f3265S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Map f3266T;

    public final Map E0() {
        return this.f3263Q;
    }

    public String F0() {
        String str = this.f3262P;
        if (str != null) {
            return str;
        }
        AbstractC4862t.p("eventType");
        return null;
    }

    public final Map G0() {
        return this.f3266T;
    }

    public final Map H0() {
        return this.f3265S;
    }

    public final Map I0() {
        return this.f3264R;
    }

    public boolean J0() {
        return (N() == null && l() == null) ? false : true;
    }

    public final void K0(b options) {
        AbstractC4862t.e(options, "options");
        String strN = options.N();
        if (strN != null) {
            C0(strN);
        }
        String strL = options.l();
        if (strL != null) {
            a0(strL);
        }
        Long lM = options.M();
        if (lM != null) {
            B0(Long.valueOf(lM.longValue()));
        }
        Long lP = options.p();
        if (lP != null) {
            e0(Long.valueOf(lP.longValue()));
        }
        String strU = options.u();
        if (strU != null) {
            j0(strU);
        }
        Double dY = options.y();
        if (dY != null) {
            n0(Double.valueOf(dY.doubleValue()));
        }
        Double dZ = options.z();
        if (dZ != null) {
            o0(Double.valueOf(dZ.doubleValue()));
        }
        String strD = options.d();
        if (strD != null) {
            S(strD);
        }
        String strO = options.O();
        if (strO != null) {
            D0(strO);
        }
        String strE = options.E();
        if (strE != null) {
            t0(strE);
        }
        String strA = options.A();
        if (strA != null) {
            p0(strA);
        }
        String strB = options.B();
        if (strB != null) {
            q0(strB);
        }
        String strK = options.k();
        if (strK != null) {
            Z(strK);
        }
        String strM = options.m();
        if (strM != null) {
            b0(strM);
        }
        String strN2 = options.n();
        if (strN2 != null) {
            c0(strN2);
        }
        String strG = options.g();
        if (strG != null) {
            V(strG);
        }
        String strI = options.i();
        if (strI != null) {
            X(strI);
        }
        String strI2 = options.I();
        if (strI2 != null) {
            x0(strI2);
        }
        String strH = options.h();
        if (strH != null) {
            W(strH);
        }
        String strO2 = options.o();
        if (strO2 != null) {
            d0(strO2);
        }
        String strR = options.r();
        if (strR != null) {
            g0(strR);
        }
        String strS = options.s();
        if (strS != null) {
            h0(strS);
        }
        String strA2 = options.a();
        if (strA2 != null) {
            P(strA2);
        }
        String strC = options.c();
        if (strC != null) {
            R(strC);
        }
        String strB2 = options.b();
        if (strB2 != null) {
            Q(strB2);
        }
        String strW = options.w();
        if (strW != null) {
            l0(strW);
        }
        String strX = options.x();
        if (strX != null) {
            m0(strX);
        }
        String strV = options.v();
        if (strV != null) {
            k0(strV);
        }
        g gVarD = options.D();
        if (gVarD != null) {
            s0(gVarD);
        }
        f fVarT = options.t();
        if (fVarT != null) {
            i0(fVarT);
        }
        Double dJ = options.J();
        if (dJ != null) {
            y0(Double.valueOf(dJ.doubleValue()));
        }
        Double dF = options.F();
        if (dF != null) {
            u0(Double.valueOf(dF.doubleValue()));
        }
        Integer numH = options.H();
        if (numH != null) {
            w0(Integer.valueOf(numH.intValue()));
        }
        String strG2 = options.G();
        if (strG2 != null) {
            v0(strG2);
        }
        String strK2 = options.K();
        if (strK2 != null) {
            z0(strK2);
        }
        String strJ = options.j();
        if (strJ != null) {
            Y(strJ);
        }
        Map mapQ = options.q();
        if (mapQ != null) {
            f0(mapQ);
        }
        q qVarF = options.f();
        if (qVarF != null) {
            U(qVarF);
        }
        String strC2 = options.C();
        if (strC2 != null) {
            r0(strC2);
        }
        Long L10 = options.L();
        if (L10 != null) {
            A0(Long.valueOf(L10.longValue()));
        }
    }

    public final void L0(Map map) {
        this.f3263Q = map;
    }

    public void M0(String str) {
        AbstractC4862t.e(str, "<set-?>");
        this.f3262P = str;
    }

    public final void N0(Map map) {
        this.f3266T = map;
    }

    public final void O0(Map map) {
        this.f3265S = map;
    }

    public final void P0(Map map) {
        this.f3264R = map;
    }
}
