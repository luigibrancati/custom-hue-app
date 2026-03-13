package O4;

import android.content.Context;
import com.google.android.gms.internal.play_billing.AbstractC3524e1;
import com.google.android.gms.internal.play_billing.L4;

/* JADX INFO: renamed from: O4.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1625y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Y5.i f11188b;

    public C1625y0(Context context) {
        try {
            b6.u.f(context);
            this.f11188b = b6.u.c().g(Z5.a.f20273g).a("PLAY_BILLING_LIBRARY", L4.class, Y5.c.b("proto"), new Y5.h() { // from class: O4.x0
                @Override // Y5.h
                public final Object apply(Object obj) {
                    return ((L4) obj).d();
                }
            });
        } catch (Throwable unused) {
            this.f11187a = true;
        }
    }

    public final void a(L4 l42) {
        if (this.f11187a) {
            AbstractC3524e1.k("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f11188b.a(Y5.d.f(l42));
        } catch (Throwable unused) {
            AbstractC3524e1.k("BillingLogger", "logging failed.");
        }
    }
}
