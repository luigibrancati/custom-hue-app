package O4;

import com.google.android.gms.internal.play_billing.AbstractC3524e1;
import com.google.android.gms.internal.play_billing.AbstractC3635x;
import com.google.android.gms.internal.play_billing.C3509b4;
import com.google.android.gms.internal.play_billing.C3521d4;
import com.google.android.gms.internal.play_billing.C3527e4;
import com.google.android.gms.internal.play_billing.C3551i4;
import com.google.android.gms.internal.play_billing.W3;
import com.google.android.gms.internal.play_billing.Y3;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: renamed from: O4.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1613s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11173a = 0;

    static {
        int i10 = InterfaceC1615t0.f11174a;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + AbstractC3635x.b(exc.getMessage());
            int i10 = AbstractC3524e1.f30155a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            AbstractC3524e1.l("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static Y3 b(int i10, int i11, com.android.billingclient.api.a aVar) {
        try {
            W3 w3H = Y3.H();
            C3527e4 c3527e4H = C3551i4.H();
            c3527e4H.x(aVar.b());
            c3527e4H.w(aVar.a());
            c3527e4H.y(i10);
            w3H.v(c3527e4H);
            w3H.x(i11);
            return (Y3) w3H.r();
        } catch (Exception e10) {
            AbstractC3524e1.l("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }

    public static Y3 c(int i10, int i11, com.android.billingclient.api.a aVar, String str) {
        try {
            C3527e4 c3527e4H = C3551i4.H();
            c3527e4H.x(aVar.b());
            c3527e4H.w(aVar.a());
            c3527e4H.y(i10);
            if (str != null) {
                c3527e4H.v(str);
            }
            W3 w3H = Y3.H();
            w3H.v(c3527e4H);
            w3H.x(i11);
            return (Y3) w3H.r();
        } catch (Throwable th) {
            AbstractC3524e1.l("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static C3521d4 d(int i10) {
        try {
            C3509b4 c3509b4G = C3521d4.G();
            c3509b4G.x(i10);
            return (C3521d4) c3509b4G.r();
        } catch (Exception e10) {
            AbstractC3524e1.l("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
