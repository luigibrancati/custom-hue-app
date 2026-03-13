package O4;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.play_billing.AbstractC3524e1;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: O4.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1591h {

    /* JADX INFO: renamed from: O4.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile C1609q f11054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f11055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile InterfaceC1618v f11056c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile InterfaceC1626z f11057d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f11058e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f11059f;

        public /* synthetic */ a(Context context, P0 p02) {
            this.f11055b = context;
        }

        public AbstractC1591h a() {
            if (this.f11055b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f11056c == null) {
                if (this.f11057d != null) {
                    throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
                }
                if (!this.f11058e && !this.f11059f) {
                    throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
                }
                Context context = this.f11055b;
                return f() ? new C1606o0(null, context, null, null) : new C1593i(null, context, null, null);
            }
            if (this.f11054a == null || !this.f11054a.a()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.f11056c == null) {
                C1609q c1609q = this.f11054a;
                Context context2 = this.f11055b;
                return f() ? new C1606o0(null, c1609q, context2, null, null, null) : new C1593i(null, c1609q, context2, null, null, null);
            }
            if (this.f11057d == null) {
                C1609q c1609q2 = this.f11054a;
                Context context3 = this.f11055b;
                InterfaceC1618v interfaceC1618v = this.f11056c;
                return f() ? new C1606o0((String) null, c1609q2, context3, interfaceC1618v, (S) null, (InterfaceC1615t0) null, (ExecutorService) null) : new C1593i((String) null, c1609q2, context3, interfaceC1618v, (S) null, (InterfaceC1615t0) null, (ExecutorService) null);
            }
            C1609q c1609q3 = this.f11054a;
            Context context4 = this.f11055b;
            InterfaceC1618v interfaceC1618v2 = this.f11056c;
            InterfaceC1626z interfaceC1626z = this.f11057d;
            return f() ? new C1606o0((String) null, c1609q3, context4, interfaceC1618v2, interfaceC1626z, (InterfaceC1615t0) null, (ExecutorService) null) : new C1593i((String) null, c1609q3, context4, interfaceC1618v2, interfaceC1626z, (InterfaceC1615t0) null, (ExecutorService) null);
        }

        public a b() {
            this.f11058e = true;
            return this;
        }

        public a c(C1609q c1609q) {
            this.f11054a = c1609q;
            return this;
        }

        public a d(InterfaceC1626z interfaceC1626z) {
            this.f11057d = interfaceC1626z;
            return this;
        }

        public a e(InterfaceC1618v interfaceC1618v) {
            this.f11056c = interfaceC1618v;
            return this;
        }

        public final boolean f() {
            try {
                return this.f11055b.getPackageManager().getApplicationInfo(this.f11055b.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e10) {
                AbstractC3524e1.l("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e10);
                return false;
            }
        }
    }

    public static a j(Context context) {
        return new a(context, null);
    }

    public abstract void a(C1579b c1579b, InterfaceC1581c interfaceC1581c);

    public abstract void b(C1603n c1603n, InterfaceC1605o interfaceC1605o);

    public abstract void c(InterfaceC1589g interfaceC1589g);

    public abstract void d();

    public abstract void e(C1607p c1607p, InterfaceC1599l interfaceC1599l);

    public abstract void f(InterfaceC1583d interfaceC1583d);

    public abstract com.android.billingclient.api.a g(String str);

    public abstract boolean h();

    public abstract com.android.billingclient.api.a i(Activity activity, C1601m c1601m);

    public abstract void k(C1620w c1620w, InterfaceC1612s interfaceC1612s);

    public abstract void l(C1622x c1622x, InterfaceC1614t interfaceC1614t);

    public abstract void m(C1624y c1624y, InterfaceC1616u interfaceC1616u);

    public abstract com.android.billingclient.api.a n(Activity activity, InterfaceC1585e interfaceC1585e);

    public abstract void o(InterfaceC1595j interfaceC1595j);
}
