package O4;

import android.content.Context;
import com.google.android.gms.internal.play_billing.AbstractC3524e1;
import com.google.android.gms.internal.play_billing.C3521d4;
import com.google.android.gms.internal.play_billing.C3569l4;
import com.google.android.gms.internal.play_billing.C3610s4;
import com.google.android.gms.internal.play_billing.C3622u4;
import com.google.android.gms.internal.play_billing.J4;
import com.google.android.gms.internal.play_billing.L4;
import com.google.android.gms.internal.play_billing.R4;
import com.google.android.gms.internal.play_billing.V4;
import com.google.android.gms.internal.play_billing.Y3;

/* JADX INFO: renamed from: O4.w0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1621w0 implements InterfaceC1615t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3622u4 f11181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1625y0 f11182c;

    public C1621w0(Context context, C3622u4 c3622u4) {
        this.f11182c = new C1625y0(context);
        this.f11181b = c3622u4;
    }

    @Override // O4.InterfaceC1615t0
    public final void a(C3569l4 c3569l4) {
        try {
            J4 j4J = L4.J();
            j4J.y(this.f11181b);
            j4J.x(c3569l4);
            this.f11182c.a((L4) j4J.r());
        } catch (Throwable th) {
            AbstractC3524e1.l("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // O4.InterfaceC1615t0
    public final void b(R4 r42) {
        try {
            C1625y0 c1625y0 = this.f11182c;
            J4 j4J = L4.J();
            j4J.y(this.f11181b);
            j4J.z(r42);
            c1625y0.a((L4) j4J.r());
        } catch (Throwable th) {
            AbstractC3524e1.l("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // O4.InterfaceC1615t0
    public final void c(Y3 y32, int i10) {
        try {
            C3610s4 c3610s4 = (C3610s4) this.f11181b.p();
            c3610s4.v(i10);
            this.f11181b = (C3622u4) c3610s4.r();
            f(y32);
        } catch (Throwable th) {
            AbstractC3524e1.l("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // O4.InterfaceC1615t0
    public final void d(C3521d4 c3521d4) {
        if (c3521d4 == null) {
            return;
        }
        try {
            J4 j4J = L4.J();
            j4J.y(this.f11181b);
            j4J.w(c3521d4);
            this.f11182c.a((L4) j4J.r());
        } catch (Throwable th) {
            AbstractC3524e1.l("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // O4.InterfaceC1615t0
    public final void e(V4 v42) {
        if (v42 == null) {
            return;
        }
        try {
            J4 j4J = L4.J();
            j4J.y(this.f11181b);
            j4J.A(v42);
            this.f11182c.a((L4) j4J.r());
        } catch (Throwable th) {
            AbstractC3524e1.l("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // O4.InterfaceC1615t0
    public final void f(Y3 y32) {
        if (y32 == null) {
            return;
        }
        try {
            J4 j4J = L4.J();
            j4J.y(this.f11181b);
            j4J.v(y32);
            this.f11182c.a((L4) j4J.r());
        } catch (Throwable th) {
            AbstractC3524e1.l("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // O4.InterfaceC1615t0
    public final void g(C3521d4 c3521d4, int i10) {
        try {
            C3610s4 c3610s4 = (C3610s4) this.f11181b.p();
            c3610s4.v(i10);
            this.f11181b = (C3622u4) c3610s4.r();
            d(c3521d4);
        } catch (Throwable th) {
            AbstractC3524e1.l("BillingLogger", "Unable to log.", th);
        }
    }
}
