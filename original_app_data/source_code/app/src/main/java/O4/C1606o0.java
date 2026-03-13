package O4;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.AbstractC3524e1;
import com.google.android.gms.internal.play_billing.AbstractC3596q1;
import com.google.android.gms.internal.play_billing.B1;
import com.google.android.gms.internal.play_billing.C3521d4;
import com.google.android.gms.internal.play_billing.H1;
import com.google.android.gms.internal.play_billing.InterfaceC3576n;
import com.google.android.gms.internal.play_billing.InterfaceFutureC3649z1;
import com.google.android.gms.internal.play_billing.Y3;
import com.google.android.gms.internal.play_billing.d5;
import com.google.android.gms.internal.play_billing.h5;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: O4.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1606o0 extends C1593i {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Context f11132G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public volatile int f11133H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public volatile InterfaceC3576n f11134I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public volatile ServiceConnectionC1602m0 f11135J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public volatile B1 f11136K;

    public C1606o0(String str, Context context, InterfaceC1615t0 interfaceC1615t0, ExecutorService executorService) {
        super(null, context, null, null);
        this.f11133H = 0;
        this.f11132G = context;
    }

    public static final boolean x1(int i10) {
        return i10 > 0;
    }

    public final void A1(int i10, int i11, com.android.billingclient.api.a aVar) {
        Y3 y3B = AbstractC1613s0.b(i10, i11, aVar);
        Objects.requireNonNull(y3B, "ApiFailure should not be null");
        W0().f(y3B);
    }

    public final void B1(int i10) {
        C3521d4 c3521d4D = AbstractC1613s0.d(i10);
        Objects.requireNonNull(c3521d4D, "ApiSuccess should not be null");
        W0().d(c3521d4D);
    }

    public final void C1(int i10, Consumer consumer, Runnable runnable) {
        AbstractC3596q1.c(AbstractC3596q1.b(z1(i10), 28500L, TimeUnit.MILLISECONDS, u1()), new C1596j0(this, i10, consumer, runnable), a1());
    }

    public final /* synthetic */ com.android.billingclient.api.a D1(Activity activity, C1601m c1601m) {
        return super.i(activity, c1601m);
    }

    @Override // O4.C1593i, O4.AbstractC1591h
    public final void a(final C1579b c1579b, final InterfaceC1581c interfaceC1581c) {
        Objects.requireNonNull(interfaceC1581c);
        C1(3, new Consumer() { // from class: O4.g0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                interfaceC1581c.a((com.android.billingclient.api.a) obj);
            }
        }, new Runnable() { // from class: O4.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11060a.j1(c1579b, interfaceC1581c);
            }
        });
    }

    @Override // O4.C1593i, O4.AbstractC1591h
    public final void b(final C1603n c1603n, final InterfaceC1605o interfaceC1605o) {
        C1(4, new Consumer() { // from class: O4.d0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                interfaceC1605o.a((com.android.billingclient.api.a) obj, c1603n.a());
            }
        }, new Runnable() { // from class: O4.e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11047a.k1(c1603n, interfaceC1605o);
            }
        });
    }

    @Override // O4.C1593i, O4.AbstractC1591h
    public final void d() {
        v1();
        super.d();
    }

    @Override // O4.C1593i, O4.AbstractC1591h
    public final com.android.billingclient.api.a i(final Activity activity, final C1601m c1601m) {
        Consumer consumer = new Consumer() { // from class: O4.i0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f11095a.l1((com.android.billingclient.api.a) obj);
            }
        };
        Callable callable = new Callable() { // from class: O4.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f11039a.D1(activity, c1601m);
            }
        };
        int iT1 = t1(z1(2));
        if (x1(iT1)) {
            com.android.billingclient.api.a aVarY1 = y1(2, iT1);
            consumer.accept(aVarY1);
            return aVarY1;
        }
        try {
            return (com.android.billingclient.api.a) callable.call();
        } catch (Exception e10) {
            com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26628k;
            A1(115, 2, aVar);
            AbstractC3524e1.l("BillingClientTesting", "An internal error occurred.", e10);
            return aVar;
        }
    }

    public final /* synthetic */ void j1(C1579b c1579b, InterfaceC1581c interfaceC1581c) {
        super.a(c1579b, interfaceC1581c);
    }

    @Override // O4.C1593i, O4.AbstractC1591h
    public final void k(final C1620w c1620w, final InterfaceC1612s interfaceC1612s) {
        C1(7, new Consumer() { // from class: O4.a0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ArrayList arrayList = new ArrayList();
                interfaceC1612s.a((com.android.billingclient.api.a) obj, arrayList);
            }
        }, new Runnable() { // from class: O4.c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11042a.m1(c1620w, interfaceC1612s);
            }
        });
    }

    public final /* synthetic */ void k1(C1603n c1603n, InterfaceC1605o interfaceC1605o) {
        super.b(c1603n, interfaceC1605o);
    }

    public final /* synthetic */ void l1(com.android.billingclient.api.a aVar) {
        super.Y0(aVar);
    }

    public final /* synthetic */ void m1(C1620w c1620w, InterfaceC1612s interfaceC1612s) {
        super.k(c1620w, interfaceC1612s);
    }

    @Override // O4.C1593i, O4.AbstractC1591h
    public final void o(InterfaceC1595j interfaceC1595j) {
        w1();
        super.o(interfaceC1595j);
    }

    public final synchronized boolean o1() {
        if (this.f11133H == 2 && this.f11134I != null) {
            if (this.f11135J != null) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object q1(int i10, d5 d5Var) {
        String str;
        try {
            if (this.f11134I == null) {
                throw null;
            }
            InterfaceC3576n interfaceC3576n = this.f11134I;
            String packageName = this.f11132G.getPackageName();
            switch (i10) {
                case 2:
                    str = "LAUNCH_BILLING_FLOW";
                    break;
                case 3:
                    str = "ACKNOWLEDGE_PURCHASE";
                    break;
                case 4:
                    str = "CONSUME_ASYNC";
                    break;
                case 5:
                    str = "IS_FEATURE_SUPPORTED";
                    break;
                case 6:
                    str = "START_CONNECTION";
                    break;
                case 7:
                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                    break;
                default:
                    str = "QUERY_SKU_DETAILS_ASYNC";
                    break;
            }
            interfaceC3576n.d1(packageName, str, new BinderC1598k0(d5Var));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e10) {
            A1(107, 28, com.android.billingclient.api.d.f26617G);
            AbstractC3524e1.l("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            d5Var.b(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public final int t1(InterfaceFutureC3649z1 interfaceFutureC3649z1) {
        try {
            return ((Integer) interfaceFutureC3649z1.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e10) {
            this.A1(114, 28, com.android.billingclient.api.d.f26617G);
            AbstractC3524e1.l("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e10);
            return 0;
        } catch (Exception e11) {
            if (e11 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            this.A1(107, 28, com.android.billingclient.api.d.f26617G);
            AbstractC3524e1.l("BillingClientTesting", "An error occurred while retrieving billing override.", e11);
            return 0;
        }
    }

    public final synchronized B1 u1() {
        try {
            if (this.f11136K == null) {
                this.f11136K = H1.b(Executors.newSingleThreadScheduledExecutor());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11136K;
    }

    public final synchronized void v1() {
        B1(27);
        try {
            try {
                AbstractC1604n0 abstractC1604n0 = null;
                if (this.f11135J != null && this.f11134I != null) {
                    AbstractC3524e1.j("BillingClientTesting", "Unbinding from Billing Override Service.");
                    this.f11132G.unbindService(this.f11135J);
                    this.f11135J = new ServiceConnectionC1602m0(this, abstractC1604n0);
                }
                this.f11134I = null;
                if (this.f11136K != null) {
                    this.f11136K.shutdownNow();
                    this.f11136K = null;
                }
            } catch (RuntimeException e10) {
                AbstractC3524e1.l("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e10);
            }
            this.f11133H = 3;
        } catch (Throwable th) {
            this.f11133H = 3;
            throw th;
        }
    }

    public final synchronized void w1() {
        if (o1()) {
            AbstractC3524e1.j("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            B1(26);
            return;
        }
        int i10 = 1;
        if (this.f11133H == 1) {
            AbstractC3524e1.k("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.f11133H == 3) {
            AbstractC3524e1.k("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            A1(38, 26, com.android.billingclient.api.d.a(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.f11133H = 1;
        AbstractC3524e1.j("BillingClientTesting", "Starting Billing Override Service setup.");
        this.f11135J = new ServiceConnectionC1602m0(this, null);
        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        List<ResolveInfo> listQueryIntentServices = this.f11132G.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i10 = 41;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    AbstractC3524e1.k("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (this.f11132G.bindService(intent2, this.f11135J, 1)) {
                        AbstractC3524e1.j("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    }
                    AbstractC3524e1.k("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                }
                i10 = 39;
            }
        }
        this.f11133H = 0;
        AbstractC3524e1.j("BillingClientTesting", "Billing Override Service unavailable on device.");
        A1(i10, 26, com.android.billingclient.api.d.a(2, "Billing Override Service unavailable on device."));
    }

    public final com.android.billingclient.api.a y1(int i10, int i11) {
        com.android.billingclient.api.a aVarA = com.android.billingclient.api.d.a(i11, "Billing override value was set by a license tester.");
        A1(105, i10, aVarA);
        return aVarA;
    }

    public final InterfaceFutureC3649z1 z1(int i10) {
        if (o1()) {
            return h5.a(new C1588f0(this, i10));
        }
        AbstractC3524e1.k("BillingClientTesting", "Billing Override Service is not ready.");
        A1(106, 28, com.android.billingclient.api.d.a(-1, "Billing Override Service connection is disconnected."));
        return AbstractC3596q1.a(0);
    }

    public C1606o0(String str, C1609q c1609q, Context context, InterfaceC1627z0 interfaceC1627z0, InterfaceC1615t0 interfaceC1615t0, ExecutorService executorService) {
        super(null, c1609q, context, null, null, null);
        this.f11133H = 0;
        this.f11132G = context;
    }

    public C1606o0(String str, C1609q c1609q, Context context, InterfaceC1618v interfaceC1618v, S s10, InterfaceC1615t0 interfaceC1615t0, ExecutorService executorService) {
        super((String) null, c1609q, context, interfaceC1618v, (S) null, (InterfaceC1615t0) null, (ExecutorService) null);
        this.f11133H = 0;
        this.f11132G = context;
    }

    public C1606o0(String str, C1609q c1609q, Context context, InterfaceC1618v interfaceC1618v, InterfaceC1626z interfaceC1626z, InterfaceC1615t0 interfaceC1615t0, ExecutorService executorService) {
        super((String) null, c1609q, context, interfaceC1618v, interfaceC1626z, (InterfaceC1615t0) null, (ExecutorService) null);
        this.f11133H = 0;
        this.f11132G = context;
    }
}
