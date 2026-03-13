package X9;

import N6.Ab;
import N6.Bb;
import N6.C1485sb;
import N6.C1498tb;
import N6.C1511ub;
import N6.C1524vb;
import N6.C1537wb;
import N6.C1550xb;
import N6.C1563yb;
import N6.C1576zb;
import N6.Cb;
import N6.Eb;
import N6.Fb;
import V9.a;
import android.graphics.Point;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements W9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fb f19414a;

    public n(Fb fb2) {
        this.f19414a = fb2;
    }

    public static a.b o(C1498tb c1498tb) {
        if (c1498tb == null) {
            return null;
        }
        return new a.b(c1498tb.l(), c1498tb.h(), c1498tb.d(), c1498tb.e(), c1498tb.f(), c1498tb.k(), c1498tb.r(), c1498tb.n());
    }

    @Override // W9.a
    public final a.c a() {
        C1511ub c1511ubF = this.f19414a.f();
        if (c1511ubF != null) {
            return new a.c(c1511ubF.n(), c1511ubF.f(), c1511ubF.h(), c1511ubF.k(), c1511ubF.l(), o(c1511ubF.e()), o(c1511ubF.d()));
        }
        return null;
    }

    @Override // W9.a
    public final String b() {
        return this.f19414a.x();
    }

    @Override // W9.a
    public final a.i c() {
        Ab abR = this.f19414a.r();
        if (abR != null) {
            return new a.i(abR.e(), abR.d());
        }
        return null;
    }

    @Override // W9.a
    public final a.e d() {
        C1537wb c1537wbK = this.f19414a.k();
        if (c1537wbK != null) {
            return new a.e(c1537wbK.l(), c1537wbK.r(), c1537wbK.z(), c1537wbK.x(), c1537wbK.t(), c1537wbK.f(), c1537wbK.d(), c1537wbK.e(), c1537wbK.h(), c1537wbK.y(), c1537wbK.v(), c1537wbK.n(), c1537wbK.k(), c1537wbK.w());
        }
        return null;
    }

    @Override // W9.a
    public final Rect e() {
        Point[] pointArrA = this.f19414a.A();
        if (pointArrA == null) {
            return null;
        }
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (Point point : pointArrA) {
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    @Override // W9.a
    public final String f() {
        return this.f19414a.y();
    }

    @Override // W9.a
    public final int g() {
        return this.f19414a.e();
    }

    @Override // W9.a
    public final int getFormat() {
        return this.f19414a.d();
    }

    @Override // W9.a
    public final a.k getUrl() {
        Cb cbV = this.f19414a.v();
        if (cbV != null) {
            return new a.k(cbV.d(), cbV.e());
        }
        return null;
    }

    @Override // W9.a
    public final a.j h() {
        Bb bbT = this.f19414a.t();
        if (bbT != null) {
            return new a.j(bbT.d(), bbT.e());
        }
        return null;
    }

    @Override // W9.a
    public final a.d i() {
        C1524vb c1524vbH = this.f19414a.h();
        if (c1524vbH == null) {
            return null;
        }
        C1576zb c1576zbD = c1524vbH.d();
        a.h hVar = c1576zbD == null ? null : new a.h(c1576zbD.e(), c1576zbD.l(), c1576zbD.k(), c1576zbD.d(), c1576zbD.h(), c1576zbD.f(), c1576zbD.n());
        String strE = c1524vbH.e();
        String strF = c1524vbH.f();
        Ab[] abArrL = c1524vbH.l();
        ArrayList arrayList = new ArrayList();
        if (abArrL != null) {
            for (Ab ab2 : abArrL) {
                if (ab2 != null) {
                    arrayList.add(new a.i(ab2.e(), ab2.d()));
                }
            }
        }
        C1550xb[] c1550xbArrK = c1524vbH.k();
        ArrayList arrayList2 = new ArrayList();
        if (c1550xbArrK != null) {
            for (C1550xb c1550xb : c1550xbArrK) {
                if (c1550xb != null) {
                    arrayList2.add(new a.f(c1550xb.d(), c1550xb.e(), c1550xb.h(), c1550xb.f()));
                }
            }
        }
        List listAsList = c1524vbH.n() != null ? Arrays.asList((String[]) AbstractC6056k.l(c1524vbH.n())) : new ArrayList();
        C1485sb[] c1485sbArrH = c1524vbH.h();
        ArrayList arrayList3 = new ArrayList();
        if (c1485sbArrH != null) {
            for (C1485sb c1485sb : c1485sbArrH) {
                if (c1485sb != null) {
                    arrayList3.add(new a.C0222a(c1485sb.d(), c1485sb.e()));
                }
            }
        }
        return new a.d(hVar, strE, strF, arrayList, arrayList2, listAsList, arrayList3);
    }

    @Override // W9.a
    public final byte[] j() {
        return this.f19414a.z();
    }

    @Override // W9.a
    public final Point[] k() {
        return this.f19414a.A();
    }

    @Override // W9.a
    public final a.f l() {
        C1550xb c1550xbL = this.f19414a.l();
        if (c1550xbL == null) {
            return null;
        }
        return new a.f(c1550xbL.d(), c1550xbL.e(), c1550xbL.h(), c1550xbL.f());
    }

    @Override // W9.a
    public final a.g m() {
        C1563yb c1563ybN = this.f19414a.n();
        if (c1563ybN != null) {
            return new a.g(c1563ybN.d(), c1563ybN.e());
        }
        return null;
    }

    @Override // W9.a
    public final a.l n() {
        Eb ebW = this.f19414a.w();
        if (ebW != null) {
            return new a.l(ebW.f(), ebW.e(), ebW.d());
        }
        return null;
    }
}
