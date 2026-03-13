package X6;

import com.google.android.gms.internal.measurement.C3290q3;
import java.util.Objects;

/* JADX INFO: renamed from: X6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2364d extends AbstractC2356c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.G1 f18769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C2372e f18770h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2364d(C2372e c2372e, String str, int i10, com.google.android.gms.internal.measurement.G1 g12) {
        super(str, i10);
        Objects.requireNonNull(c2372e);
        this.f18770h = c2372e;
        this.f18769g = g12;
    }

    @Override // X6.AbstractC2356c
    public final int a() {
        return this.f18769g.E();
    }

    @Override // X6.AbstractC2356c
    public final boolean b() {
        return true;
    }

    @Override // X6.AbstractC2356c
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(Long l10, Long l11, C3290q3 c3290q3, boolean z10) {
        com.google.android.gms.internal.measurement.L6.a();
        C2416j3 c2416j3 = this.f18770h.f18400a;
        boolean zH = c2416j3.w().H(this.f18719a, AbstractC2383f2.f18826E0);
        com.google.android.gms.internal.measurement.G1 g12 = this.f18769g;
        boolean zH2 = g12.H();
        boolean zI = g12.I();
        boolean zK = g12.K();
        byte b10 = zH2 || zI || zK;
        Boolean boolE = null;
        boolE = null;
        boolE = null;
        boolE = null;
        boolE = null;
        if (z10 && b10 != true) {
            c2416j3.a().w().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f18720b), g12.D() ? Integer.valueOf(g12.E()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.A1 a1G = g12.G();
        boolean zI2 = a1G.I();
        if (c3290q3.I()) {
            if (a1G.F()) {
                boolE = AbstractC2356c.e(AbstractC2356c.g(c3290q3.J(), a1G.G()), zI2);
            } else {
                c2416j3.a().r().b("No number filter for long property. property", c2416j3.D().c(c3290q3.F()));
            }
        } else if (c3290q3.M()) {
            if (a1G.F()) {
                boolE = AbstractC2356c.e(AbstractC2356c.h(c3290q3.N(), a1G.G()), zI2);
            } else {
                c2416j3.a().r().b("No number filter for double property. property", c2416j3.D().c(c3290q3.F()));
            }
        } else if (!c3290q3.G()) {
            c2416j3.a().r().b("User property has no value, property", c2416j3.D().c(c3290q3.F()));
        } else if (a1G.D()) {
            boolE = AbstractC2356c.e(AbstractC2356c.f(c3290q3.H(), a1G.E(), c2416j3.a()), zI2);
        } else if (!a1G.F()) {
            c2416j3.a().r().b("No string or number filter defined. property", c2416j3.D().c(c3290q3.F()));
        } else if (V6.O(c3290q3.H())) {
            boolE = AbstractC2356c.e(AbstractC2356c.i(c3290q3.H(), a1G.G()), zI2);
        } else {
            c2416j3.a().r().c("Invalid user property value for Numeric number filter. property, value", c2416j3.D().c(c3290q3.F()), c3290q3.H());
        }
        c2416j3.a().w().b("Property filter result", boolE == null ? "null" : boolE);
        if (boolE == null) {
            return false;
        }
        this.f18721c = Boolean.TRUE;
        if (zK && !boolE.booleanValue()) {
            return true;
        }
        if (!z10 || g12.H()) {
            this.f18722d = boolE;
        }
        if (boolE.booleanValue() && b10 != false && c3290q3.D()) {
            long jE = c3290q3.E();
            if (l10 != null) {
                jE = l10.longValue();
            }
            if (zH && g12.H() && !g12.I() && l11 != null) {
                jE = l11.longValue();
            }
            if (g12.I()) {
                this.f18724f = Long.valueOf(jE);
            } else {
                this.f18723e = Long.valueOf(jE);
            }
        }
        return true;
    }
}
