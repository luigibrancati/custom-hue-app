package x4;

import E4.g;
import F4.f;
import Od.C;
import android.location.Location;
import fc.C4015H;
import gc.U;
import io.sentry.util.StringUtils;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import q4.C5488d;
import q4.C5497m;

/* JADX INFO: renamed from: x4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C6298c implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f47444d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f47445e = U.h("", "9774d56d682e549c", "unknown", "000000000000000", "Android", "DEFACE", StringUtils.PROPER_NIL_UUID);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.a f47446a = f.a.Before;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D4.a f47447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public B4.a f47448c;

    /* JADX INFO: renamed from: x4.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final boolean a(String deviceId) {
            AbstractC4862t.e(deviceId, "deviceId");
            return (deviceId.length() == 0 || C6298c.f47445e.contains(deviceId)) ? false : true;
        }

        public a() {
        }
    }

    @Override // F4.f
    public void a(D4.a aVar) {
        AbstractC4862t.e(aVar, "<set-?>");
        this.f47447b = aVar;
    }

    @Override // F4.f
    public void e(D4.a amplitude) {
        AbstractC4862t.e(amplitude, "amplitude");
        super.e(amplitude);
        D4.b bVarL = amplitude.l();
        AbstractC4862t.c(bVarL, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        C5488d c5488d = (C5488d) bVarL;
        this.f47448c = new B4.a(c5488d.C(), c5488d.I(), c5488d.N().w(), c5488d.N().x());
        k(c5488d);
    }

    @Override // F4.f
    public E4.a g(E4.a event) {
        AbstractC4862t.e(event, "event");
        i(event);
        return event;
    }

    @Override // F4.f
    public f.a getType() {
        return this.f47446a;
    }

    public final void i(E4.a aVar) {
        E4.f fVarK;
        g gVarR;
        String strQ;
        D4.b bVarL = j().l();
        AbstractC4862t.c(bVarL, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        C5488d c5488d = (C5488d) bVarL;
        if (aVar.M() == null) {
            aVar.B0(Long.valueOf(System.currentTimeMillis()));
            C4015H c4015h = C4015H.f34254a;
        }
        if (aVar.u() == null) {
            aVar.j0(UUID.randomUUID().toString());
            C4015H c4015h2 = C4015H.f34254a;
        }
        if (aVar.x() == null) {
            aVar.m0("amplitude-analytics-android/1.22.4");
            C4015H c4015h3 = C4015H.f34254a;
        }
        if (aVar.N() == null) {
            aVar.C0(j().w().c());
            C4015H c4015h4 = C4015H.f34254a;
        }
        if (aVar.l() == null) {
            aVar.a0(j().w().b());
            C4015H c4015h5 = C4015H.f34254a;
        }
        C5497m c5497mN = c5488d.N();
        if (c5488d.F()) {
            c5497mN.v(C5497m.f43258b.a());
        }
        B4.a aVar2 = null;
        if (c5497mN.K()) {
            B4.a aVar3 = this.f47448c;
            if (aVar3 == null) {
                AbstractC4862t.p("contextProvider");
                aVar3 = null;
            }
            aVar.D0(aVar3.s());
        }
        if (c5497mN.H()) {
            B4.a aVar4 = this.f47448c;
            if (aVar4 == null) {
                AbstractC4862t.p("contextProvider");
                aVar4 = null;
            }
            aVar.p0(aVar4.q());
        }
        if (c5497mN.I()) {
            B4.a aVar5 = this.f47448c;
            if (aVar5 == null) {
                AbstractC4862t.p("contextProvider");
                aVar5 = null;
            }
            aVar.q0(aVar5.r());
        }
        if (c5497mN.A()) {
            B4.a aVar6 = this.f47448c;
            if (aVar6 == null) {
                AbstractC4862t.p("contextProvider");
                aVar6 = null;
            }
            aVar.Z(aVar6.h());
        }
        if (c5497mN.B()) {
            B4.a aVar7 = this.f47448c;
            if (aVar7 == null) {
                AbstractC4862t.p("contextProvider");
                aVar7 = null;
            }
            aVar.b0(aVar7.n());
        }
        if (c5497mN.C()) {
            B4.a aVar8 = this.f47448c;
            if (aVar8 == null) {
                AbstractC4862t.p("contextProvider");
                aVar8 = null;
            }
            aVar.c0(aVar8.o());
        }
        if (c5497mN.y()) {
            B4.a aVar9 = this.f47448c;
            if (aVar9 == null) {
                AbstractC4862t.p("contextProvider");
                aVar9 = null;
            }
            aVar.V(aVar9.j());
        }
        if (c5497mN.E() && aVar.v() == null) {
            aVar.k0("$remote");
            C4015H c4015h6 = C4015H.f34254a;
        }
        if (c5497mN.z() && aVar.v() != "$remote") {
            B4.a aVar10 = this.f47448c;
            if (aVar10 == null) {
                AbstractC4862t.p("contextProvider");
                aVar10 = null;
            }
            aVar.X(aVar10.k());
        }
        if (c5497mN.F()) {
            B4.a aVar11 = this.f47448c;
            if (aVar11 == null) {
                AbstractC4862t.p("contextProvider");
                aVar11 = null;
            }
            aVar.l0(aVar11.m());
        }
        if (c5497mN.J()) {
            aVar.t0("Android");
        }
        if (c5497mN.G()) {
            B4.a aVar12 = this.f47448c;
            if (aVar12 == null) {
                AbstractC4862t.p("contextProvider");
                aVar12 = null;
            }
            Location locationP = aVar12.p();
            if (locationP != null) {
                aVar.n0(Double.valueOf(locationP.getLatitude()));
                aVar.o0(Double.valueOf(locationP.getLongitude()));
            }
        }
        if (c5497mN.w()) {
            B4.a aVar13 = this.f47448c;
            if (aVar13 == null) {
                AbstractC4862t.p("contextProvider");
                aVar13 = null;
            }
            String strF = aVar13.f();
            if (strF != null) {
                aVar.P(strF);
            }
        }
        if (c5497mN.x()) {
            B4.a aVar14 = this.f47448c;
            if (aVar14 == null) {
                AbstractC4862t.p("contextProvider");
            } else {
                aVar2 = aVar14;
            }
            String strG = aVar2.g();
            if (strG != null) {
                aVar.R(strG);
            }
        }
        if (aVar.C() == null && (strQ = j().l().q()) != null) {
            aVar.r0(strQ);
            C4015H c4015h7 = C4015H.f34254a;
        }
        if (aVar.D() == null && (gVarR = j().l().r()) != null) {
            aVar.s0(gVarR.a());
            C4015H c4015h8 = C4015H.f34254a;
        }
        if (aVar.t() != null || (fVarK = j().l().k()) == null) {
            return;
        }
        aVar.i0(fVarK.a());
        C4015H c4015h9 = C4015H.f34254a;
    }

    public D4.a j() {
        D4.a aVar = this.f47447b;
        if (aVar != null) {
            return aVar;
        }
        AbstractC4862t.p("amplitude");
        return null;
    }

    public final void k(C5488d configuration) {
        AbstractC4862t.e(configuration, "configuration");
        String strE = configuration.E();
        if (strE != null) {
            l(strE);
            return;
        }
        String strB = j().w().b();
        B4.a aVar = null;
        if (strB == null || !f47444d.a(strB) || C.D(strB, "S", false, 2, null)) {
            if (!configuration.L() && configuration.O()) {
                B4.a aVar2 = this.f47448c;
                if (aVar2 == null) {
                    AbstractC4862t.p("contextProvider");
                    aVar2 = null;
                }
                if (!aVar2.t()) {
                    B4.a aVar3 = this.f47448c;
                    if (aVar3 == null) {
                        AbstractC4862t.p("contextProvider");
                        aVar3 = null;
                    }
                    String strF = aVar3.f();
                    if (strF != null && f47444d.a(strF)) {
                        l(strF);
                        return;
                    }
                }
            }
            if (configuration.P()) {
                B4.a aVar4 = this.f47448c;
                if (aVar4 == null) {
                    AbstractC4862t.p("contextProvider");
                } else {
                    aVar = aVar4;
                }
                String strG = aVar.g();
                if (strG != null && f47444d.a(strG)) {
                    l(strG + 'S');
                    return;
                }
            }
            String string = UUID.randomUUID().toString();
            AbstractC4862t.d(string, "toString(...)");
            l(string + 'R');
        }
    }

    public void l(String deviceId) {
        AbstractC4862t.e(deviceId, "deviceId");
        j().B(deviceId);
    }
}
