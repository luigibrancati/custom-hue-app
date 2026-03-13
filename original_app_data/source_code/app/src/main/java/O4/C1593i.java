package O4;

import O4.C1601m;
import O4.C1620w;
import O4.r;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.google.android.gms.internal.play_billing.A1;
import com.google.android.gms.internal.play_billing.AbstractC3524e1;
import com.google.android.gms.internal.play_billing.AbstractC3539g4;
import com.google.android.gms.internal.play_billing.AbstractC3541h0;
import com.google.android.gms.internal.play_billing.AbstractC3595q0;
import com.google.android.gms.internal.play_billing.AbstractC3629w;
import com.google.android.gms.internal.play_billing.C3509b4;
import com.google.android.gms.internal.play_billing.C3521d4;
import com.google.android.gms.internal.play_billing.C3527e4;
import com.google.android.gms.internal.play_billing.C3551i4;
import com.google.android.gms.internal.play_billing.C3610s4;
import com.google.android.gms.internal.play_billing.C3622u4;
import com.google.android.gms.internal.play_billing.C3646y4;
import com.google.android.gms.internal.play_billing.C4;
import com.google.android.gms.internal.play_billing.H1;
import com.google.android.gms.internal.play_billing.InterfaceC3546i;
import com.google.android.gms.internal.play_billing.S1;
import com.google.android.gms.internal.play_billing.T1;
import com.google.android.gms.internal.play_billing.W3;
import com.google.android.gms.internal.play_billing.W4;
import com.google.android.gms.internal.play_billing.Y3;
import com.google.android.gms.internal.play_billing.Y4;
import io.sentry.TransactionOptions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONException;

/* JADX INFO: renamed from: O4.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C1593i extends AbstractC1591h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f11063A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C1609q f11064B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f11065C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ExecutorService f11066D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public volatile A1 f11067E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Long f11068F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f11070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f11072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile O0 f11073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f11074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC1615t0 f11075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile InterfaceC3546i f11076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile T f11077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11079k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11080l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f11082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f11085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11086r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11087s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11088t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11089u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11090v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f11091w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11092x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f11093y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11094z;

    public C1593i(Context context, C1609q c1609q, InterfaceC1618v interfaceC1618v, String str, String str2, InterfaceC1626z interfaceC1626z, InterfaceC1615t0 interfaceC1615t0, ExecutorService executorService) {
        this.f11069a = new Object();
        this.f11070b = 0;
        this.f11072d = new Handler(Looper.getMainLooper());
        this.f11080l = 0;
        this.f11068F = Long.valueOf(new Random().nextLong());
        this.f11071c = str;
        p(context, interfaceC1618v, c1609q, interfaceC1626z, str, null);
    }

    public static String S() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "7.1.1";
        }
    }

    public static final String d0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
    }

    public static Future t(Callable callable, long j10, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: O4.F
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    AbstractC3524e1.k("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e10) {
            AbstractC3524e1.l("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ boolean z0(C1593i c1593i) {
        boolean z10;
        synchronized (c1593i.f11069a) {
            z10 = true;
            if (c1593i.f11070b != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public final Handler F0() {
        return Looper.myLooper() == null ? this.f11072d : new Handler(Looper.myLooper());
    }

    public final Y G0(String str) {
        InterfaceC3546i interfaceC3546i;
        AbstractC3524e1.j("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleD = AbstractC3524e1.d(this.f11083o, this.f11091w, this.f11064B.a(), this.f11064B.b(), this.f11071c, this.f11068F.longValue());
        String string = null;
        while (this.f11081m) {
            try {
                synchronized (this.f11069a) {
                    interfaceC3546i = this.f11076h;
                }
                if (interfaceC3546i == null) {
                    return f0(com.android.billingclient.api.d.f26630m, 119, "Service reset to null", null);
                }
                Bundle bundleL4 = interfaceC3546i.l4(6, this.f11074f.getPackageName(), str, string, bundleD);
                H0 h0A = com.android.billingclient.api.e.a(bundleL4, "BillingClient", "getPurchaseHistory()");
                com.android.billingclient.api.a aVarA = h0A.a();
                if (aVarA != com.android.billingclient.api.d.f26629l) {
                    L0(h0A.b(), 11, aVarA);
                    return new Y(aVarA, null);
                }
                ArrayList<String> stringArrayList = bundleL4.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleL4.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleL4.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z10 = false;
                for (int i10 = 0; i10 < stringArrayList2.size(); i10++) {
                    String str2 = stringArrayList2.get(i10);
                    String str3 = stringArrayList3.get(i10);
                    AbstractC3524e1.j("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i10))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str2, str3);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.e())) {
                            AbstractC3524e1.k("BillingClient", "BUG: empty/null token!");
                            z10 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e10) {
                        return f0(com.android.billingclient.api.d.f26628k, 51, "Got an exception trying to decode the purchase!", e10);
                    }
                }
                if (z10) {
                    L0(26, 11, com.android.billingclient.api.d.f26628k);
                }
                string = bundleL4.getString("INAPP_CONTINUATION_TOKEN");
                AbstractC3524e1.j("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new Y(com.android.billingclient.api.d.f26629l, arrayList);
                }
            } catch (DeadObjectException e11) {
                return f0(com.android.billingclient.api.d.f26630m, 59, "Got exception trying to get purchase history", e11);
            } catch (Exception e12) {
                return f0(com.android.billingclient.api.d.f26628k, 59, "Got exception trying to get purchase history", e12);
            }
        }
        AbstractC3524e1.k("BillingClient", "getPurchaseHistory is not supported on current device");
        return new Y(com.android.billingclient.api.d.f26634q, null);
    }

    public final com.android.billingclient.api.a H0() {
        AbstractC3524e1.j("BillingClient", "Service connection is valid. No need to re-initialize.");
        C3509b4 c3509b4G = C3521d4.G();
        c3509b4G.x(6);
        W4 w4E = Y4.E();
        w4E.v(true);
        c3509b4G.w(w4E);
        W((C3521d4) c3509b4G.r());
        return com.android.billingclient.api.d.f26629l;
    }

    public final void J0(InterfaceC1599l interfaceC1599l, com.android.billingclient.api.a aVar, int i10, Exception exc) {
        AbstractC3524e1.l("BillingClient", "getBillingConfig got an exception.", exc);
        M0(i10, 13, aVar, AbstractC1613s0.a(exc));
        interfaceC1599l.a(aVar, null);
    }

    public final void K0(InterfaceC1585e interfaceC1585e, com.android.billingclient.api.a aVar, int i10, Exception exc) {
        M0(i10, 16, aVar, AbstractC1613s0.a(exc));
        interfaceC1585e.a(aVar);
    }

    public final void L0(int i10, int i11, com.android.billingclient.api.a aVar) {
        try {
            V(AbstractC1613s0.b(i10, i11, aVar));
        } catch (Throwable th) {
            AbstractC3524e1.l("BillingClient", "Unable to log.", th);
        }
    }

    public final void M0(int i10, int i11, com.android.billingclient.api.a aVar, String str) {
        try {
            V(AbstractC1613s0.c(i10, i11, aVar, str));
        } catch (Throwable th) {
            AbstractC3524e1.l("BillingClient", "Unable to log.", th);
        }
    }

    public final void N0(int i10) {
        try {
            W(AbstractC1613s0.d(i10));
        } catch (Throwable th) {
            AbstractC3524e1.l("BillingClient", "Unable to log.", th);
        }
    }

    public final /* synthetic */ Bundle P0(int i10, String str, String str2, C1601m c1601m, Bundle bundle) {
        InterfaceC3546i interfaceC3546i;
        try {
            synchronized (this.f11069a) {
                interfaceC3546i = this.f11076h;
            }
            return interfaceC3546i == null ? AbstractC3524e1.m(com.android.billingclient.api.d.f26630m, 119) : interfaceC3546i.A2(i10, this.f11074f.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e10) {
            return AbstractC3524e1.n(com.android.billingclient.api.d.f26630m, 5, AbstractC1613s0.a(e10));
        } catch (Exception e11) {
            return AbstractC3524e1.n(com.android.billingclient.api.d.f26628k, 5, AbstractC1613s0.a(e11));
        }
    }

    public final com.android.billingclient.api.a Q() {
        int[] iArr = {0, 3};
        synchronized (this.f11069a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f11070b == iArr[i10]) {
                    return com.android.billingclient.api.d.f26630m;
                }
            }
            return com.android.billingclient.api.d.f26628k;
        }
    }

    public final /* synthetic */ Bundle Q0(String str, String str2) {
        InterfaceC3546i interfaceC3546i;
        try {
            synchronized (this.f11069a) {
                interfaceC3546i = this.f11076h;
            }
            return interfaceC3546i == null ? AbstractC3524e1.m(com.android.billingclient.api.d.f26630m, 119) : interfaceC3546i.W4(3, this.f11074f.getPackageName(), str, str2, null);
        } catch (DeadObjectException e10) {
            return AbstractC3524e1.n(com.android.billingclient.api.d.f26630m, 5, AbstractC1613s0.a(e10));
        } catch (Exception e11) {
            return AbstractC3524e1.n(com.android.billingclient.api.d.f26628k, 5, AbstractC1613s0.a(e11));
        }
    }

    public final String R(C1620w c1620w) {
        if (TextUtils.isEmpty(null)) {
            return this.f11074f.getPackageName();
        }
        return null;
    }

    public final synchronized ExecutorService T() {
        try {
            if (this.f11066D == null) {
                this.f11066D = Executors.newFixedThreadPool(AbstractC3524e1.f30155a, new M(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11066D;
    }

    public final X T0(C1620w c1620w) {
        InterfaceC3546i interfaceC3546i;
        ArrayList arrayList = new ArrayList();
        String strC = c1620w.c();
        AbstractC3541h0 abstractC3541h0B = c1620w.b();
        int size = abstractC3541h0B.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 20;
            ArrayList arrayList2 = new ArrayList(abstractC3541h0B.subList(i10, i11 > size ? size : i11));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList3.add(((C1620w.b) arrayList2.get(i12)).b());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.f11071c);
            try {
                synchronized (this.f11069a) {
                    interfaceC3546i = this.f11076h;
                }
                if (interfaceC3546i == null) {
                    return e0(com.android.billingclient.api.d.f26630m, 119, "Service has been reset to null.", null);
                }
                boolean z10 = true;
                int i13 = true != this.f11092x ? 17 : 20;
                String packageName = this.f11074f.getPackageName();
                boolean zC0 = c0();
                String str = this.f11071c;
                R(c1620w);
                R(c1620w);
                R(c1620w);
                R(c1620w);
                long jLongValue = this.f11068F.longValue();
                Bundle bundle2 = new Bundle();
                AbstractC3524e1.c(bundle2, str, jLongValue);
                bundle2.putBoolean("enablePendingPurchases", true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                if (zC0) {
                    bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                }
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                int size3 = arrayList2.size();
                int i14 = 0;
                boolean z11 = false;
                boolean z12 = false;
                while (i14 < size3) {
                    C1620w.b bVar = (C1620w.b) arrayList2.get(i14);
                    boolean z13 = z10;
                    arrayList4.add(null);
                    z11 |= !TextUtils.isEmpty(null);
                    String strC2 = bVar.c();
                    InterfaceC3546i interfaceC3546i2 = interfaceC3546i;
                    if (strC2.equals("first_party")) {
                        AbstractC3629w.c(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                        arrayList5.add(null);
                        z12 = z13;
                    }
                    i14++;
                    interfaceC3546i = interfaceC3546i2;
                    z10 = z13;
                }
                InterfaceC3546i interfaceC3546i3 = interfaceC3546i;
                if (z11) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z12 && !TextUtils.isEmpty(null)) {
                    bundle2.putString("accountName", null);
                }
                Bundle bundleT3 = interfaceC3546i3.T3(i13, packageName, strC, bundle, bundle2);
                if (bundleT3 == null) {
                    return e0(com.android.billingclient.api.d.f26613C, 44, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!bundleT3.containsKey("DETAILS_LIST")) {
                    int iB = AbstractC3524e1.b(bundleT3, "BillingClient");
                    String strG = AbstractC3524e1.g(bundleT3, "BillingClient");
                    if (iB == 0) {
                        return e0(com.android.billingclient.api.d.a(6, strG), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return e0(com.android.billingclient.api.d.a(iB, strG), 23, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iB, null);
                }
                ArrayList<String> stringArrayList = bundleT3.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return e0(com.android.billingclient.api.d.f26613C, 46, "queryProductDetailsAsync got null response list", null);
                }
                for (int i15 = 0; i15 < stringArrayList.size(); i15++) {
                    try {
                        r rVar = new r(stringArrayList.get(i15));
                        AbstractC3524e1.j("BillingClient", "Got product details: ".concat(rVar.toString()));
                        arrayList.add(rVar);
                    } catch (JSONException e10) {
                        return e0(com.android.billingclient.api.d.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                    }
                }
                i10 = i11;
            } catch (DeadObjectException e11) {
                return e0(com.android.billingclient.api.d.f26630m, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e11);
            } catch (Exception e12) {
                return e0(com.android.billingclient.api.d.f26628k, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e12);
            }
        }
        return new X(0, "", arrayList);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [O4.i] */
    /* JADX WARN: Type inference failed for: r1v3, types: [O4.i] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    public final void U(C1603n c1603n, InterfaceC1605o interfaceC1605o) throws Throwable {
        ?? r12;
        InterfaceC3546i interfaceC3546i;
        int iA0;
        String strG;
        String strA = c1603n.a();
        try {
            StringBuilder sb2 = new StringBuilder();
            r12 = "Consuming purchase with token: ";
            sb2.append("Consuming purchase with token: ");
            sb2.append(strA);
            AbstractC3524e1.j("BillingClient", sb2.toString());
            synchronized (this.f11069a) {
                try {
                    try {
                        interfaceC3546i = this.f11076h;
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                } catch (DeadObjectException e10) {
                    e = e10;
                } catch (Exception e11) {
                    e = e11;
                    r12.l0(interfaceC1605o, strA, com.android.billingclient.api.d.f26628k, 29, "Error consuming purchase!", e);
                    return;
                }
            }
            if (interfaceC3546i == null) {
                l0(interfaceC1605o, strA, com.android.billingclient.api.d.f26630m, 119, "Service has been reset to null.", null);
                return;
            }
            if (this.f11083o) {
                String packageName = this.f11074f.getPackageName();
                boolean z10 = this.f11083o;
                String str = this.f11071c;
                long jLongValue = this.f11068F.longValue();
                Bundle bundle = new Bundle();
                if (z10) {
                    AbstractC3524e1.c(bundle, str, jLongValue);
                }
                Bundle bundleY3 = interfaceC3546i.Y3(9, packageName, strA, bundle);
                iA0 = bundleY3.getInt("RESPONSE_CODE");
                strG = AbstractC3524e1.g(bundleY3, "BillingClient");
            } else {
                iA0 = interfaceC3546i.A0(3, this.f11074f.getPackageName(), strA);
                strG = "";
            }
            com.android.billingclient.api.a aVarA = com.android.billingclient.api.d.a(iA0, strG);
            if (iA0 == 0) {
                AbstractC3524e1.j("BillingClient", "Successfully consumed purchase.");
                interfaceC1605o.a(aVarA, strA);
                return;
            } else {
                l0(interfaceC1605o, strA, aVarA, 23, "Error consuming purchase with token. Response code: " + iA0, null);
                return;
            }
        } catch (DeadObjectException e12) {
            e = e12;
            r12 = this;
        } catch (Exception e13) {
            e = e13;
            r12 = this;
        }
        r12.l0(interfaceC1605o, strA, com.android.billingclient.api.d.f26630m, 29, "Error consuming purchase!", e);
    }

    public final void V(Y3 y32) {
        try {
            this.f11075g.c(y32, this.f11080l);
        } catch (Throwable th) {
            AbstractC3524e1.l("BillingClient", "Unable to log.", th);
        }
    }

    public final void W(C3521d4 c3521d4) {
        try {
            this.f11075g.g(c3521d4, this.f11080l);
        } catch (Throwable th) {
            AbstractC3524e1.l("BillingClient", "Unable to log.", th);
        }
    }

    public final InterfaceC1615t0 W0() {
        return this.f11075g;
    }

    public final void X(String str, final InterfaceC1614t interfaceC1614t) {
        if (!h()) {
            com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26630m;
            L0(2, 11, aVar);
            interfaceC1614t.a(aVar, null);
        } else if (t(new O(this, str, interfaceC1614t), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new Runnable() { // from class: O4.I
            @Override // java.lang.Runnable
            public final void run() {
                this.f10962a.v0(interfaceC1614t);
            }
        }, F0(), T()) == null) {
            com.android.billingclient.api.a aVarQ = Q();
            L0(25, 11, aVarQ);
            interfaceC1614t.a(aVarQ, null);
        }
    }

    public final void Y(String str, final InterfaceC1616u interfaceC1616u) {
        if (!h()) {
            com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26630m;
            L0(2, 9, aVar);
            interfaceC1616u.a(aVar, AbstractC3541h0.s());
        } else {
            if (TextUtils.isEmpty(str)) {
                AbstractC3524e1.k("BillingClient", "Please provide a valid product type.");
                com.android.billingclient.api.a aVar2 = com.android.billingclient.api.d.f26625h;
                L0(50, 9, aVar2);
                interfaceC1616u.a(aVar2, AbstractC3541h0.s());
                return;
            }
            if (t(new N(this, str, interfaceC1616u), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new Runnable() { // from class: O4.C
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10942a.w0(interfaceC1616u);
                }
            }, F0(), T()) == null) {
                com.android.billingclient.api.a aVarQ = Q();
                L0(25, 9, aVarQ);
                interfaceC1616u.a(aVarQ, AbstractC3541h0.s());
            }
        }
    }

    public final com.android.billingclient.api.a Y0(final com.android.billingclient.api.a aVar) {
        if (Thread.interrupted()) {
            return aVar;
        }
        this.f11072d.post(new Runnable() { // from class: O4.Q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10995a.p0(aVar);
            }
        });
        return aVar;
    }

    public final void Z(int i10) {
        synchronized (this.f11069a) {
            try {
                if (this.f11070b == 3) {
                    return;
                }
                AbstractC3524e1.j("BillingClient", "Setting clientState from " + d0(this.f11070b) + " to " + d0(i10));
                this.f11070b = i10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // O4.AbstractC1591h
    public void a(final C1579b c1579b, final InterfaceC1581c interfaceC1581c) {
        if (!h()) {
            com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26630m;
            L0(2, 3, aVar);
            interfaceC1581c.a(aVar);
            return;
        }
        if (TextUtils.isEmpty(c1579b.a())) {
            AbstractC3524e1.k("BillingClient", "Please provide a valid purchase token.");
            com.android.billingclient.api.a aVar2 = com.android.billingclient.api.d.f26627j;
            L0(26, 3, aVar2);
            interfaceC1581c.a(aVar2);
            return;
        }
        if (!this.f11083o) {
            com.android.billingclient.api.a aVar3 = com.android.billingclient.api.d.f26619b;
            L0(27, 3, aVar3);
            interfaceC1581c.a(aVar3);
        } else if (t(new Callable() { // from class: O4.U0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f11011a.d1(interfaceC1581c, c1579b);
                return null;
            }
        }, TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new Runnable() { // from class: O4.V0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11016a.o0(interfaceC1581c);
            }
        }, F0(), T()) == null) {
            com.android.billingclient.api.a aVarQ = Q();
            L0(25, 3, aVarQ);
            interfaceC1581c.a(aVarQ);
        }
    }

    public final synchronized void a0() {
        ExecutorService executorService = this.f11066D;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f11066D = null;
            this.f11067E = null;
        }
    }

    public final synchronized A1 a1() {
        try {
            if (this.f11067E == null) {
                this.f11067E = H1.a(T());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11067E;
    }

    @Override // O4.AbstractC1591h
    public void b(final C1603n c1603n, final InterfaceC1605o interfaceC1605o) {
        if (!h()) {
            com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26630m;
            L0(2, 4, aVar);
            interfaceC1605o.a(aVar, c1603n.a());
        } else if (t(new Callable() { // from class: O4.G
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                this.f10954a.e1(c1603n, interfaceC1605o);
                return null;
            }
        }, TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new Runnable() { // from class: O4.H
            @Override // java.lang.Runnable
            public final void run() {
                this.f10957a.q0(interfaceC1605o, c1603n);
            }
        }, F0(), T()) == null) {
            com.android.billingclient.api.a aVarQ = Q();
            L0(25, 4, aVarQ);
            interfaceC1605o.a(aVarQ, c1603n.a());
        }
    }

    public final void b0() {
        synchronized (this.f11069a) {
            if (this.f11077i != null) {
                try {
                    this.f11074f.unbindService(this.f11077i);
                } catch (Throwable th) {
                    try {
                        AbstractC3524e1.l("BillingClient", "There was an exception while unbinding service!", th);
                        this.f11076h = null;
                        this.f11077i = null;
                    } finally {
                        this.f11076h = null;
                        this.f11077i = null;
                    }
                }
            }
        }
    }

    @Override // O4.AbstractC1591h
    public void c(final InterfaceC1589g interfaceC1589g) {
        if (!h()) {
            m0(interfaceC1589g, com.android.billingclient.api.d.f26630m, 2, null);
            return;
        }
        if (!this.f11093y) {
            AbstractC3524e1.k("BillingClient", "Current client doesn't support alternative billing only.");
            m0(interfaceC1589g, com.android.billingclient.api.d.f26615E, 66, null);
        } else if (t(new Callable() { // from class: O4.Y0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f11030a.h1(interfaceC1589g);
                return null;
            }
        }, TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new Runnable() { // from class: O4.Z0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11032a.r0(interfaceC1589g);
            }
        }, F0(), T()) == null) {
            m0(interfaceC1589g, Q(), 25, null);
        }
    }

    public final boolean c0() {
        return this.f11091w && this.f11064B.b();
    }

    @Override // O4.AbstractC1591h
    public void d() {
        N0(12);
        synchronized (this.f11069a) {
            try {
            } finally {
            }
            if (this.f11073e != null) {
                this.f11073e.f();
                try {
                    AbstractC3524e1.j("BillingClient", "Unbinding from service.");
                    b0();
                } catch (Throwable th) {
                    AbstractC3524e1.l("BillingClient", "There was an exception while unbinding from the service while ending connection!", th);
                }
                try {
                    a0();
                } finally {
                    try {
                    } finally {
                    }
                }
            } else {
                AbstractC3524e1.j("BillingClient", "Unbinding from service.");
                b0();
                a0();
            }
        }
    }

    public final /* synthetic */ Object d1(InterfaceC1581c interfaceC1581c, C1579b c1579b) {
        InterfaceC3546i interfaceC3546i;
        try {
            synchronized (this.f11069a) {
                interfaceC3546i = this.f11076h;
            }
            if (interfaceC3546i == null) {
                j0(interfaceC1581c, com.android.billingclient.api.d.f26630m, 119, null);
                return null;
            }
            String packageName = this.f11074f.getPackageName();
            String strA = c1579b.a();
            String str = this.f11071c;
            long jLongValue = this.f11068F.longValue();
            Bundle bundle = new Bundle();
            AbstractC3524e1.c(bundle, str, jLongValue);
            Bundle bundleA6 = interfaceC3546i.A6(9, packageName, strA, bundle);
            interfaceC1581c.a(com.android.billingclient.api.d.a(AbstractC3524e1.b(bundleA6, "BillingClient"), AbstractC3524e1.g(bundleA6, "BillingClient")));
            return null;
        } catch (DeadObjectException e10) {
            j0(interfaceC1581c, com.android.billingclient.api.d.f26630m, 28, e10);
            return null;
        } catch (Exception e11) {
            j0(interfaceC1581c, com.android.billingclient.api.d.f26628k, 28, e11);
            return null;
        }
    }

    @Override // O4.AbstractC1591h
    public void e(C1607p c1607p, final InterfaceC1599l interfaceC1599l) {
        if (!h()) {
            AbstractC3524e1.k("BillingClient", "Service disconnected.");
            com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26630m;
            L0(2, 13, aVar);
            interfaceC1599l.a(aVar, null);
            return;
        }
        if (!this.f11090v) {
            AbstractC3524e1.k("BillingClient", "Current client doesn't support get billing config.");
            com.android.billingclient.api.a aVar2 = com.android.billingclient.api.d.f26611A;
            L0(32, 13, aVar2);
            interfaceC1599l.a(aVar2, null);
            return;
        }
        if (t(new Callable() { // from class: O4.W0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f11021a.f1(interfaceC1599l);
                return null;
            }
        }, TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new Runnable() { // from class: O4.X0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11026a.s0(interfaceC1599l);
            }
        }, F0(), T()) == null) {
            com.android.billingclient.api.a aVarQ = Q();
            L0(25, 13, aVarQ);
            interfaceC1599l.a(aVarQ, null);
        }
    }

    public final X e0(com.android.billingclient.api.a aVar, int i10, String str, Exception exc) {
        AbstractC3524e1.l("BillingClient", str, exc);
        M0(i10, 7, aVar, AbstractC1613s0.a(exc));
        return new X(aVar.b(), aVar.a(), new ArrayList());
    }

    public final /* synthetic */ Object e1(C1603n c1603n, InterfaceC1605o interfaceC1605o) throws Throwable {
        U(c1603n, interfaceC1605o);
        return null;
    }

    @Override // O4.AbstractC1591h
    public void f(final InterfaceC1583d interfaceC1583d) {
        if (!h()) {
            k0(interfaceC1583d, com.android.billingclient.api.d.f26630m, 2, null);
            return;
        }
        if (!this.f11093y) {
            AbstractC3524e1.k("BillingClient", "Current client doesn't support alternative billing only.");
            k0(interfaceC1583d, com.android.billingclient.api.d.f26615E, 66, null);
        } else if (t(new Callable() { // from class: O4.D
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f10944a.i1(interfaceC1583d);
                return null;
            }
        }, TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new Runnable() { // from class: O4.E
            @Override // java.lang.Runnable
            public final void run() {
                this.f10947a.t0(interfaceC1583d);
            }
        }, F0(), T()) == null) {
            k0(interfaceC1583d, Q(), 25, null);
        }
    }

    public final Y f0(com.android.billingclient.api.a aVar, int i10, String str, Exception exc) {
        AbstractC3524e1.l("BillingClient", str, exc);
        M0(i10, 11, aVar, AbstractC1613s0.a(exc));
        return new Y(aVar, null);
    }

    public final /* synthetic */ Object f1(InterfaceC1599l interfaceC1599l) {
        InterfaceC3546i interfaceC3546i;
        try {
            synchronized (this.f11069a) {
                interfaceC3546i = this.f11076h;
            }
            if (interfaceC3546i == null) {
                J0(interfaceC1599l, com.android.billingclient.api.d.f26630m, 119, null);
            } else {
                String packageName = this.f11074f.getPackageName();
                String str = this.f11071c;
                long jLongValue = this.f11068F.longValue();
                Bundle bundle = new Bundle();
                AbstractC3524e1.c(bundle, str, jLongValue);
                interfaceC3546i.c3(18, packageName, bundle, new com.android.billingclient.api.c(interfaceC1599l, this.f11075g, this.f11080l, null));
            }
        } catch (DeadObjectException e10) {
            J0(interfaceC1599l, com.android.billingclient.api.d.f26630m, 62, e10);
        } catch (Exception e11) {
            J0(interfaceC1599l, com.android.billingclient.api.d.f26628k, 62, e11);
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // O4.AbstractC1591h
    public final com.android.billingclient.api.a g(String str) {
        if (!h()) {
            com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26630m;
            if (aVar.b() != 0) {
                L0(2, 5, aVar);
                return aVar;
            }
            N0(5);
            return aVar;
        }
        com.android.billingclient.api.a aVar2 = com.android.billingclient.api.d.f26618a;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    com.android.billingclient.api.a aVar3 = this.f11079k ? com.android.billingclient.api.d.f26629l : com.android.billingclient.api.d.f26633p;
                    i0(aVar3, 10, 3);
                    return aVar3;
                }
                break;
            case 96321:
                if (str.equals("aaa")) {
                    com.android.billingclient.api.a aVar4 = this.f11087s ? com.android.billingclient.api.d.f26629l : com.android.billingclient.api.d.f26636s;
                    i0(aVar4, 31, 6);
                    return aVar4;
                }
                break;
            case 97314:
                if (str.equals("bbb")) {
                    com.android.billingclient.api.a aVar5 = this.f11085q ? com.android.billingclient.api.d.f26629l : com.android.billingclient.api.d.f26640w;
                    i0(aVar5, 30, 5);
                    return aVar5;
                }
                break;
            case 98307:
                if (str.equals("ccc")) {
                    com.android.billingclient.api.a aVar6 = this.f11088t ? com.android.billingclient.api.d.f26629l : com.android.billingclient.api.d.f26637t;
                    i0(aVar6, 19, 8);
                    return aVar6;
                }
                break;
            case 99300:
                if (str.equals("ddd")) {
                    com.android.billingclient.api.a aVar7 = this.f11086r ? com.android.billingclient.api.d.f26629l : com.android.billingclient.api.d.f26638u;
                    i0(aVar7, 21, 7);
                    return aVar7;
                }
                break;
            case 100293:
                if (str.equals("eee")) {
                    com.android.billingclient.api.a aVar8 = this.f11088t ? com.android.billingclient.api.d.f26629l : com.android.billingclient.api.d.f26637t;
                    i0(aVar8, 61, 9);
                    return aVar8;
                }
                break;
            case 101286:
                if (str.equals("fff")) {
                    com.android.billingclient.api.a aVar9 = this.f11089u ? com.android.billingclient.api.d.f26629l : com.android.billingclient.api.d.f26639v;
                    i0(aVar9, 20, 10);
                    return aVar9;
                }
                break;
            case 102279:
                if (str.equals("ggg")) {
                    com.android.billingclient.api.a aVar10 = this.f11090v ? com.android.billingclient.api.d.f26629l : com.android.billingclient.api.d.f26611A;
                    i0(aVar10, 32, 11);
                    return aVar10;
                }
                break;
            case 103272:
                if (str.equals("hhh")) {
                    com.android.billingclient.api.a aVar11 = this.f11090v ? com.android.billingclient.api.d.f26629l : com.android.billingclient.api.d.f26612B;
                    i0(aVar11, 33, 12);
                    return aVar11;
                }
                break;
            case 104265:
                if (str.equals("iii")) {
                    com.android.billingclient.api.a aVar12 = this.f11092x ? com.android.billingclient.api.d.f26629l : com.android.billingclient.api.d.f26614D;
                    i0(aVar12, 60, 13);
                    return aVar12;
                }
                break;
            case 105258:
                if (str.equals("jjj")) {
                    com.android.billingclient.api.a aVar13 = this.f11093y ? com.android.billingclient.api.d.f26629l : com.android.billingclient.api.d.f26615E;
                    i0(aVar13, 66, 14);
                    return aVar13;
                }
                break;
            case 106251:
                if (str.equals("kkk")) {
                    com.android.billingclient.api.a aVar14 = this.f11094z ? com.android.billingclient.api.d.f26629l : com.android.billingclient.api.d.f26641x;
                    i0(aVar14, 103, 18);
                    return aVar14;
                }
                break;
            case 107244:
                if (str.equals("lll")) {
                    com.android.billingclient.api.a aVar15 = this.f11063A ? com.android.billingclient.api.d.f26629l : com.android.billingclient.api.d.f26642y;
                    i0(aVar15, 116, 19);
                    return aVar15;
                }
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    com.android.billingclient.api.a aVar16 = this.f11082n ? com.android.billingclient.api.d.f26629l : com.android.billingclient.api.d.f26635r;
                    i0(aVar16, 35, 4);
                    return aVar16;
                }
                break;
            case 1987365622:
                if (str.equals("subscriptions")) {
                    com.android.billingclient.api.a aVar17 = this.f11078j ? com.android.billingclient.api.d.f26629l : com.android.billingclient.api.d.f26632o;
                    i0(aVar17, 9, 2);
                    return aVar17;
                }
                break;
        }
        AbstractC3524e1.k("BillingClient", "Unsupported feature: ".concat(str));
        com.android.billingclient.api.a aVar18 = com.android.billingclient.api.d.f26643z;
        i0(aVar18, 34, 1);
        return aVar18;
    }

    public final F0 g0(int i10, com.android.billingclient.api.a aVar, int i11, String str, Exception exc) {
        M0(i11, 9, aVar, AbstractC1613s0.a(exc));
        AbstractC3524e1.l("BillingClient", str, exc);
        return new F0(aVar, null);
    }

    @Override // O4.AbstractC1591h
    public final boolean h() {
        boolean z10;
        synchronized (this.f11069a) {
            try {
                z10 = false;
                if (this.f11070b == 2 && this.f11076h != null && this.f11077i != null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final F0 h0(String str, int i10) {
        InterfaceC3546i interfaceC3546i;
        C1593i c1593i = this;
        AbstractC3524e1.j("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleD = AbstractC3524e1.d(c1593i.f11083o, c1593i.f11091w, c1593i.f11064B.a(), c1593i.f11064B.b(), c1593i.f11071c, c1593i.f11068F.longValue());
        String string = null;
        do {
            try {
                synchronized (c1593i.f11069a) {
                    interfaceC3546i = c1593i.f11076h;
                }
                if (interfaceC3546i == null) {
                    return c1593i.g0(9, com.android.billingclient.api.d.f26630m, 119, "Service has been reset to null", null);
                }
                Bundle bundleU3 = c1593i.f11083o ? interfaceC3546i.u3(true != c1593i.f11091w ? 9 : 19, c1593i.f11074f.getPackageName(), str, string, bundleD) : interfaceC3546i.H1(3, c1593i.f11074f.getPackageName(), str, string);
                H0 h0A = com.android.billingclient.api.e.a(bundleU3, "BillingClient", "getPurchase()");
                com.android.billingclient.api.a aVarA = h0A.a();
                if (aVarA != com.android.billingclient.api.d.f26629l) {
                    return c1593i.g0(9, aVarA, h0A.b(), "Purchase bundle invalid", null);
                }
                ArrayList<String> stringArrayList = bundleU3.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleU3.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleU3.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z10 = false;
                for (int i11 = 0; i11 < stringArrayList2.size(); i11++) {
                    String str2 = stringArrayList2.get(i11);
                    String str3 = stringArrayList3.get(i11);
                    AbstractC3524e1.j("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i11))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.j())) {
                            AbstractC3524e1.k("BillingClient", "BUG: empty/null token!");
                            z10 = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e10) {
                        return g0(9, com.android.billingclient.api.d.f26628k, 51, "Got an exception trying to decode the purchase!", e10);
                    }
                }
                c1593i = this;
                if (z10) {
                    c1593i.L0(26, 9, com.android.billingclient.api.d.f26628k);
                }
                string = bundleU3.getString("INAPP_CONTINUATION_TOKEN");
                AbstractC3524e1.j("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
            } catch (DeadObjectException e11) {
                return g0(9, com.android.billingclient.api.d.f26630m, 52, "Got exception trying to get purchases try to reconnect", e11);
            } catch (Exception e12) {
                return c1593i.g0(9, com.android.billingclient.api.d.f26628k, 52, "Got exception trying to get purchases try to reconnect", e12);
            }
        } while (!TextUtils.isEmpty(string));
        return new F0(com.android.billingclient.api.d.f26629l, arrayList);
    }

    public final /* synthetic */ Void h1(InterfaceC1589g interfaceC1589g) {
        InterfaceC3546i interfaceC3546i;
        try {
            synchronized (this.f11069a) {
                interfaceC3546i = this.f11076h;
            }
            if (interfaceC3546i == null) {
                m0(interfaceC1589g, com.android.billingclient.api.d.f26630m, 119, null);
            } else {
                interfaceC3546i.X4(21, this.f11074f.getPackageName(), AbstractC3524e1.e(this.f11071c, this.f11068F.longValue()), new U(interfaceC1589g, this.f11075g, this.f11080l, null));
            }
        } catch (DeadObjectException e10) {
            m0(interfaceC1589g, com.android.billingclient.api.d.f26630m, 70, e10);
        } catch (Exception e11) {
            m0(interfaceC1589g, com.android.billingclient.api.d.f26628k, 70, e11);
        }
        return null;
    }

    @Override // O4.AbstractC1591h
    public com.android.billingclient.api.a i(Activity activity, final C1601m c1601m) {
        String str;
        String str2;
        Future futureT;
        int iA;
        String string;
        String str3;
        boolean z10;
        String str4;
        C1601m.b bVar;
        boolean z11;
        String str5;
        int i10;
        final int i11;
        if (this.f11073e == null || this.f11073e.d() == null) {
            com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26616F;
            L0(12, 2, aVar);
            return aVar;
        }
        if (!h()) {
            com.android.billingclient.api.a aVar2 = com.android.billingclient.api.d.f26630m;
            L0(2, 2, aVar2);
            Y0(aVar2);
            return aVar2;
        }
        ArrayList arrayListH = c1601m.h();
        List listI = c1601m.i();
        android.support.v4.media.session.a.a(AbstractC3595q0.a(arrayListH, null));
        C1601m.b bVar2 = (C1601m.b) AbstractC3595q0.a(listI, null);
        final String strD = bVar2.b().d();
        final String strE = bVar2.b().e();
        if (strE.equals("subs") && !this.f11078j) {
            AbstractC3524e1.k("BillingClient", "Current client doesn't support subscriptions.");
            com.android.billingclient.api.a aVar3 = com.android.billingclient.api.d.f26632o;
            L0(9, 2, aVar3);
            Y0(aVar3);
            return aVar3;
        }
        if (c1601m.r() && !this.f11081m) {
            AbstractC3524e1.k("BillingClient", "Current client doesn't support extra params for buy intent.");
            com.android.billingclient.api.a aVar4 = com.android.billingclient.api.d.f26626i;
            L0(18, 2, aVar4);
            Y0(aVar4);
            return aVar4;
        }
        if (arrayListH.size() > 1 && !this.f11088t) {
            AbstractC3524e1.k("BillingClient", "Current client doesn't support multi-item purchases.");
            com.android.billingclient.api.a aVar5 = com.android.billingclient.api.d.f26637t;
            L0(19, 2, aVar5);
            Y0(aVar5);
            return aVar5;
        }
        if (!listI.isEmpty() && !this.f11089u) {
            AbstractC3524e1.k("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            com.android.billingclient.api.a aVar6 = com.android.billingclient.api.d.f26639v;
            L0(20, 2, aVar6);
            Y0(aVar6);
            return aVar6;
        }
        com.android.billingclient.api.a aVarC = c1601m.c();
        if (aVarC != com.android.billingclient.api.d.f26629l) {
            L0(120, 2, aVarC);
            Y0(aVarC);
            return aVarC;
        }
        if (this.f11081m) {
            boolean z12 = this.f11083o;
            boolean z13 = this.f11091w;
            boolean zA = this.f11064B.a();
            boolean zB = this.f11064B.b();
            boolean z14 = this.f11065C;
            String str6 = this.f11071c;
            long jLongValue = this.f11068F.longValue();
            final String packageName = this.f11074f.getPackageName();
            final Bundle bundle = new Bundle();
            AbstractC3524e1.c(bundle, str6, jLongValue);
            if (c1601m.b() != 0) {
                bundle.putInt("prorationMode", c1601m.b());
            }
            if (!TextUtils.isEmpty(c1601m.d())) {
                bundle.putString("accountId", c1601m.d());
            }
            if (!TextUtils.isEmpty(c1601m.e())) {
                bundle.putString("obfuscatedProfileId", c1601m.e());
            }
            if (c1601m.q()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(c1601m.f())) {
                bundle.putString("oldSkuPurchaseToken", c1601m.f());
            }
            if (TextUtils.isEmpty(null)) {
                str3 = null;
            } else {
                str3 = null;
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!TextUtils.isEmpty(c1601m.g())) {
                bundle.putString("originalExternalTransactionId", c1601m.g());
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("paymentsPurchaseParams", str3);
            }
            if (z12 && zA) {
                z10 = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z10 = true;
            }
            if (z13 && zB) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z10);
            }
            if (z14) {
                bundle.putBoolean("enableAlternativeBilling", z10);
            }
            if (c1601m.i().stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.play_billing.a
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i12 = AbstractC3524e1.f30155a;
                    return false;
                }
            })) {
                S1 s1C = T1.C();
                s1C.v((Iterable) c1601m.i().stream().filter(new Predicate() { // from class: com.google.android.gms.internal.play_billing.r
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        int i12 = AbstractC3524e1.f30155a;
                        return false;
                    }
                }).map(new Function() { // from class: com.google.android.gms.internal.play_billing.T
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        int i12 = AbstractC3524e1.f30155a;
                        String strD2 = ((C1601m.b) obj).b().d();
                        Q1 q1C = R1.C();
                        V1 v1C = W1.C();
                        v1C.v("subs:" + packageName + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + strD2);
                        q1C.v(v1C);
                        W1.C();
                        throw null;
                    }
                }).collect(AbstractC3541h0.w()));
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((T1) s1C.r()).d());
            }
            if (arrayListH.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList<>(listI.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(listI.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                str = "BUY_INTENT";
                ArrayList<Integer> arrayList6 = new ArrayList<>();
                str4 = "proxyPackageVersion";
                for (int i12 = 0; i12 < listI.size(); i12++) {
                    C1601m.b bVar3 = (C1601m.b) listI.get(i12);
                    r rVarB = bVar3.b();
                    if (rVarB.i().isEmpty()) {
                        bVar = bVar3;
                    } else {
                        bVar = bVar3;
                        arrayList3.add(rVarB.i());
                    }
                    arrayList4.add(bVar.c());
                    String strJ = rVarB.j();
                    if (rVarB.k() != null && !rVarB.k().isEmpty()) {
                        Iterator it = rVarB.k().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            r.b bVar4 = (r.b) it.next();
                            if (!TextUtils.isEmpty(bVar4.f())) {
                                strJ = bVar4.f();
                                break;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strJ)) {
                        arrayList5.add(strJ);
                    }
                    if (i12 > 0) {
                        arrayList.add(((C1601m.b) listI.get(i12)).b().d());
                        arrayList2.add(((C1601m.b) listI.get(i12)).b().e());
                    }
                }
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                bundle.putIntegerArrayList("AUTO_PAY_BALANCE_THRESHOLD_LIST", arrayList6);
                if (!arrayList3.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                ArrayList<String> arrayList7 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it2 = arrayListH.iterator();
                if (it2.hasNext()) {
                    android.support.v4.media.session.a.a(it2.next());
                    throw null;
                }
                if (!arrayList7.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList7);
                }
                if (arrayListH.size() > 1) {
                    ArrayList<String> arrayList8 = new ArrayList<>(arrayListH.size() - 1);
                    ArrayList<String> arrayList9 = new ArrayList<>(arrayListH.size() - 1);
                    if (1 < arrayListH.size()) {
                        android.support.v4.media.session.a.a(arrayListH.get(1));
                        throw null;
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList8);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList9);
                }
                str4 = "proxyPackageVersion";
                str = "BUY_INTENT";
            }
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f11086r) {
                com.android.billingclient.api.a aVar7 = com.android.billingclient.api.d.f26638u;
                L0(21, 2, aVar7);
                Y0(aVar7);
                return aVar7;
            }
            if (bVar2 == null || TextUtils.isEmpty(bVar2.b().h())) {
                z11 = false;
            } else {
                bundle.putString("skuPackageName", bVar2.b().h());
                z11 = true;
            }
            str2 = null;
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("accountName", null);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                AbstractC3524e1.k("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundle.putString("proxyPackage", stringExtra);
                try {
                    str5 = str4;
                } catch (PackageManager.NameNotFoundException unused) {
                    str5 = str4;
                }
                try {
                    bundle.putString(str5, this.f11074f.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused2) {
                    bundle.putString(str5, "package not found");
                }
            }
            if (this.f11089u && !listI.isEmpty()) {
                i10 = 17;
            } else if (this.f11087s && z11) {
                i10 = 15;
            } else if (this.f11083o) {
                i11 = 9;
                futureT = t(new Callable() { // from class: O4.L
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f10969a.P0(i11, strD, strE, c1601m, bundle);
                    }
                }, 5000L, null, this.f11072d, T());
            } else {
                i10 = 6;
            }
            i11 = i10;
            futureT = t(new Callable() { // from class: O4.L
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f10969a.P0(i11, strD, strE, c1601m, bundle);
                }
            }, 5000L, null, this.f11072d, T());
        } else {
            str = "BUY_INTENT";
            str2 = null;
            futureT = t(new Callable() { // from class: O4.R0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f10997a.Q0(strD, strE);
                }
            }, 5000L, null, this.f11072d, T());
        }
        try {
            try {
                if (futureT == null) {
                    com.android.billingclient.api.a aVar8 = com.android.billingclient.api.d.f26621d;
                    L0(25, 2, aVar8);
                    Y0(aVar8);
                    return aVar8;
                }
                Bundle bundle2 = (Bundle) futureT.get(5000L, TimeUnit.MILLISECONDS);
                int iB = AbstractC3524e1.b(bundle2, "BillingClient");
                String strG = AbstractC3524e1.g(bundle2, "BillingClient");
                if (iB == 0) {
                    Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                    String str7 = str;
                    intent2.putExtra(str7, (PendingIntent) bundle2.getParcelable(str7));
                    activity.startActivity(intent2);
                    return com.android.billingclient.api.d.f26629l;
                }
                AbstractC3524e1.k("BillingClient", "Unable to buy item, Error response code: " + iB);
                com.android.billingclient.api.a aVarA = com.android.billingclient.api.d.a(iB, strG);
                if (bundle2 == null) {
                    iA = 1;
                } else {
                    try {
                        Object obj = bundle2.get("LOG_REASON");
                        if (obj != null) {
                            if (obj instanceof Integer) {
                                iA = AbstractC3539g4.a(((Integer) obj).intValue());
                            } else {
                                AbstractC3524e1.k("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                            }
                        }
                    } catch (Throwable th) {
                        AbstractC3524e1.k("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                    }
                    iA = 1;
                }
                if (iA == 1) {
                    iA = 23;
                }
                if (bundle2 == null) {
                    string = str2;
                } else {
                    try {
                        string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                    } catch (Throwable th2) {
                        AbstractC3524e1.k("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                        string = str2;
                    }
                }
                M0(iA, 2, aVarA, string);
                Y0(aVarA);
                return aVarA;
            } catch (Exception e10) {
                AbstractC3524e1.l("BillingClient", "Exception while launching billing flow. Try to reconnect", e10);
                com.android.billingclient.api.a aVar9 = com.android.billingclient.api.d.f26630m;
                M0(5, 2, aVar9, AbstractC1613s0.a(e10));
                Y0(aVar9);
                return aVar9;
            }
        } catch (CancellationException | TimeoutException e11) {
            AbstractC3524e1.l("BillingClient", "Time out while launching billing flow. Try to reconnect", e11);
            com.android.billingclient.api.a aVar10 = com.android.billingclient.api.d.f26631n;
            M0(4, 2, aVar10, AbstractC1613s0.a(e11));
            Y0(aVar10);
            return aVar10;
        }
    }

    public final void i0(com.android.billingclient.api.a aVar, int i10, int i11) {
        C3521d4 c3521d4 = null;
        Y3 y32 = null;
        if (aVar.b() == 0) {
            int i12 = AbstractC1613s0.f11173a;
            try {
                C3509b4 c3509b4G = C3521d4.G();
                c3509b4G.x(5);
                C3646y4 c3646y4E = C4.E();
                c3646y4E.v(i11);
                c3509b4G.v((C4) c3646y4E.r());
                c3521d4 = (C3521d4) c3509b4G.r();
            } catch (Exception e10) {
                AbstractC3524e1.l("BillingLogger", "Unable to create logging payload", e10);
            }
            W(c3521d4);
            return;
        }
        int i13 = AbstractC1613s0.f11173a;
        try {
            W3 w3H = Y3.H();
            C3527e4 c3527e4H = C3551i4.H();
            c3527e4H.x(aVar.b());
            c3527e4H.w(aVar.a());
            c3527e4H.y(i10);
            w3H.v(c3527e4H);
            w3H.x(5);
            C3646y4 c3646y4E2 = C4.E();
            c3646y4E2.v(i11);
            w3H.w((C4) c3646y4E2.r());
            y32 = (Y3) w3H.r();
        } catch (Exception e11) {
            AbstractC3524e1.l("BillingLogger", "Unable to create logging payload", e11);
        }
        V(y32);
    }

    public final /* synthetic */ Void i1(InterfaceC1583d interfaceC1583d) {
        InterfaceC3546i interfaceC3546i;
        try {
            synchronized (this.f11069a) {
                interfaceC3546i = this.f11076h;
            }
            if (interfaceC3546i == null) {
                k0(interfaceC1583d, com.android.billingclient.api.d.f26630m, 119, null);
            } else {
                interfaceC3546i.S5(21, this.f11074f.getPackageName(), AbstractC3524e1.e(this.f11071c, this.f11068F.longValue()), new W(interfaceC1583d, this.f11075g, this.f11080l, null));
            }
        } catch (DeadObjectException e10) {
            k0(interfaceC1583d, com.android.billingclient.api.d.f26630m, 69, e10);
        } catch (Exception e11) {
            k0(interfaceC1583d, com.android.billingclient.api.d.f26628k, 69, e11);
        }
        return null;
    }

    public final void j0(InterfaceC1581c interfaceC1581c, com.android.billingclient.api.a aVar, int i10, Exception exc) {
        AbstractC3524e1.l("BillingClient", "Error in acknowledge purchase!", exc);
        M0(i10, 3, aVar, AbstractC1613s0.a(exc));
        interfaceC1581c.a(aVar);
    }

    @Override // O4.AbstractC1591h
    public void k(final C1620w c1620w, final InterfaceC1612s interfaceC1612s) {
        if (!h()) {
            com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26630m;
            L0(2, 7, aVar);
            interfaceC1612s.a(aVar, new ArrayList());
        } else {
            if (!this.f11089u) {
                AbstractC3524e1.k("BillingClient", "Querying product details is not supported.");
                com.android.billingclient.api.a aVar2 = com.android.billingclient.api.d.f26639v;
                L0(20, 7, aVar2);
                interfaceC1612s.a(aVar2, new ArrayList());
                return;
            }
            if (t(new Callable() { // from class: O4.J
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    X xT0 = this.f10964a.T0(c1620w);
                    interfaceC1612s.a(com.android.billingclient.api.d.a(xT0.a(), xT0.b()), xT0.c());
                    return null;
                }
            }, TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new Runnable() { // from class: O4.K
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10967a.u0(interfaceC1612s);
                }
            }, F0(), T()) == null) {
                com.android.billingclient.api.a aVarQ = Q();
                L0(25, 7, aVarQ);
                interfaceC1612s.a(aVarQ, new ArrayList());
            }
        }
    }

    public final void k0(InterfaceC1583d interfaceC1583d, com.android.billingclient.api.a aVar, int i10, Exception exc) {
        M0(i10, 14, aVar, AbstractC1613s0.a(exc));
        interfaceC1583d.a(aVar);
    }

    @Override // O4.AbstractC1591h
    public final void l(C1622x c1622x, InterfaceC1614t interfaceC1614t) {
        X(c1622x.b(), interfaceC1614t);
    }

    public final void l0(InterfaceC1605o interfaceC1605o, String str, com.android.billingclient.api.a aVar, int i10, String str2, Exception exc) {
        AbstractC3524e1.l("BillingClient", str2, exc);
        M0(i10, 4, aVar, AbstractC1613s0.a(exc));
        interfaceC1605o.a(aVar, str);
    }

    @Override // O4.AbstractC1591h
    public final void m(C1624y c1624y, InterfaceC1616u interfaceC1616u) {
        Y(c1624y.b(), interfaceC1616u);
    }

    public final void m0(InterfaceC1589g interfaceC1589g, com.android.billingclient.api.a aVar, int i10, Exception exc) {
        M0(i10, 15, aVar, AbstractC1613s0.a(exc));
        interfaceC1589g.a(aVar, null);
    }

    @Override // O4.AbstractC1591h
    public com.android.billingclient.api.a n(final Activity activity, final InterfaceC1585e interfaceC1585e) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!h()) {
            com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26630m;
            L0(2, 16, aVar);
            return aVar;
        }
        if (!this.f11093y) {
            AbstractC3524e1.k("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            com.android.billingclient.api.a aVar2 = com.android.billingclient.api.d.f26615E;
            L0(66, 16, aVar2);
            return aVar2;
        }
        final com.android.billingclient.api.b bVar = new com.android.billingclient.api.b(this, this.f11072d, interfaceC1585e);
        if (t(new Callable() { // from class: O4.S0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f11000a.r(interfaceC1585e, activity, bVar);
                return null;
            }
        }, TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new Runnable() { // from class: O4.T0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11006a.x0(interfaceC1585e);
            }
        }, this.f11072d, T()) != null) {
            return com.android.billingclient.api.d.f26629l;
        }
        com.android.billingclient.api.a aVarQ = Q();
        L0(25, 16, aVarQ);
        return aVarQ;
    }

    @Override // O4.AbstractC1591h
    public void o(InterfaceC1595j interfaceC1595j) {
        com.android.billingclient.api.a aVarH0;
        com.android.billingclient.api.a aVar;
        synchronized (this.f11069a) {
            try {
                if (h()) {
                    aVarH0 = H0();
                } else {
                    if (this.f11070b == 1) {
                        AbstractC3524e1.k("BillingClient", "Client is already in the process of connecting to billing service.");
                        aVar = com.android.billingclient.api.d.f26622e;
                        L0(37, 6, aVar);
                    } else if (this.f11070b == 3) {
                        AbstractC3524e1.k("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        aVar = com.android.billingclient.api.d.f26630m;
                        L0(38, 6, aVar);
                    } else {
                        Z(1);
                        b0();
                        AbstractC3524e1.j("BillingClient", "Starting in-app billing setup.");
                        this.f11077i = new T(this, interfaceC1595j, null);
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.f11074f.getPackageManager().queryIntentServices(intent, 0);
                        int i10 = 41;
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            Z(0);
                            AbstractC3524e1.j("BillingClient", "Billing service unavailable on device.");
                            com.android.billingclient.api.a aVar2 = com.android.billingclient.api.d.f26620c;
                            L0(i10, 6, aVar2);
                            aVarH0 = aVar2;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            i10 = 40;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    AbstractC3524e1.k("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f11071c);
                                    synchronized (this.f11069a) {
                                        try {
                                            if (this.f11070b == 2) {
                                                aVarH0 = H0();
                                            } else if (this.f11070b != 1) {
                                                AbstractC3524e1.k("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                aVar = com.android.billingclient.api.d.f26630m;
                                                L0(117, 6, aVar);
                                            } else {
                                                T t10 = this.f11077i;
                                                if (this.f11074f.bindService(intent2, t10, 1)) {
                                                    AbstractC3524e1.j("BillingClient", "Service was bonded successfully.");
                                                    aVarH0 = null;
                                                } else {
                                                    AbstractC3524e1.k("BillingClient", "Connection to Billing service is blocked.");
                                                    i10 = 39;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                AbstractC3524e1.k("BillingClient", "The device doesn't have valid Play Store.");
                            }
                            Z(0);
                            AbstractC3524e1.j("BillingClient", "Billing service unavailable on device.");
                            com.android.billingclient.api.a aVar22 = com.android.billingclient.api.d.f26620c;
                            L0(i10, 6, aVar22);
                            aVarH0 = aVar22;
                        }
                    }
                    aVarH0 = aVar;
                }
            } finally {
            }
        }
        if (aVarH0 != null) {
            interfaceC1595j.onBillingSetupFinished(aVarH0);
        }
    }

    public final /* synthetic */ void o0(InterfaceC1581c interfaceC1581c) {
        com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26631n;
        L0(24, 3, aVar);
        interfaceC1581c.a(aVar);
    }

    public final void p(Context context, InterfaceC1618v interfaceC1618v, C1609q c1609q, InterfaceC1626z interfaceC1626z, String str, InterfaceC1615t0 interfaceC1615t0) {
        this.f11074f = context.getApplicationContext();
        C3610s4 c3610s4H = C3622u4.H();
        c3610s4H.y(str);
        c3610s4H.x(this.f11074f.getPackageName());
        c3610s4H.w(this.f11068F.longValue());
        if (interfaceC1615t0 != null) {
            this.f11075g = interfaceC1615t0;
        } else {
            this.f11075g = new C1621w0(this.f11074f, (C3622u4) c3610s4H.r());
        }
        if (interfaceC1618v == null) {
            AbstractC3524e1.k("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f11073e = new O0(this.f11074f, interfaceC1618v, null, null, interfaceC1626z, this.f11075g);
        this.f11064B = c1609q;
        this.f11065C = interfaceC1626z != null;
    }

    public final /* synthetic */ void p0(com.android.billingclient.api.a aVar) {
        if (this.f11073e.d() != null) {
            this.f11073e.d().onPurchasesUpdated(aVar, null);
        } else {
            AbstractC3524e1.k("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    public final void q(Context context, InterfaceC1618v interfaceC1618v, C1609q c1609q, S s10, String str, InterfaceC1615t0 interfaceC1615t0) {
        this.f11074f = context.getApplicationContext();
        C3610s4 c3610s4H = C3622u4.H();
        c3610s4H.y(str);
        c3610s4H.x(this.f11074f.getPackageName());
        c3610s4H.w(this.f11068F.longValue());
        if (interfaceC1615t0 != null) {
            this.f11075g = interfaceC1615t0;
        } else {
            this.f11075g = new C1621w0(this.f11074f, (C3622u4) c3610s4H.r());
        }
        if (interfaceC1618v == null) {
            AbstractC3524e1.k("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f11073e = new O0(this.f11074f, interfaceC1618v, null, s10, null, this.f11075g);
        this.f11064B = c1609q;
        this.f11065C = s10 != null;
        this.f11074f.getPackageName();
    }

    public final /* synthetic */ void q0(InterfaceC1605o interfaceC1605o, C1603n c1603n) {
        com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26631n;
        L0(24, 4, aVar);
        interfaceC1605o.a(aVar, c1603n.a());
    }

    public final /* synthetic */ Void r(InterfaceC1585e interfaceC1585e, Activity activity, ResultReceiver resultReceiver) {
        InterfaceC3546i interfaceC3546i;
        try {
            synchronized (this.f11069a) {
                interfaceC3546i = this.f11076h;
            }
            if (interfaceC3546i == null) {
                K0(interfaceC1585e, com.android.billingclient.api.d.f26630m, 119, null);
            } else {
                interfaceC3546i.E2(21, this.f11074f.getPackageName(), AbstractC3524e1.e(this.f11071c, this.f11068F.longValue()), new V(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e10) {
            K0(interfaceC1585e, com.android.billingclient.api.d.f26630m, 74, e10);
        } catch (Exception e11) {
            K0(interfaceC1585e, com.android.billingclient.api.d.f26628k, 74, e11);
        }
        return null;
    }

    public final /* synthetic */ void r0(InterfaceC1589g interfaceC1589g) {
        m0(interfaceC1589g, com.android.billingclient.api.d.f26631n, 24, null);
    }

    public final /* synthetic */ void s0(InterfaceC1599l interfaceC1599l) {
        com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26631n;
        L0(24, 13, aVar);
        interfaceC1599l.a(aVar, null);
    }

    public final /* synthetic */ void t0(InterfaceC1583d interfaceC1583d) {
        k0(interfaceC1583d, com.android.billingclient.api.d.f26631n, 24, null);
    }

    public final /* synthetic */ void u0(InterfaceC1612s interfaceC1612s) {
        com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26631n;
        L0(24, 7, aVar);
        interfaceC1612s.a(aVar, new ArrayList());
    }

    public final /* synthetic */ void v0(InterfaceC1614t interfaceC1614t) {
        com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26631n;
        L0(24, 11, aVar);
        interfaceC1614t.a(aVar, null);
    }

    public final /* synthetic */ void w0(InterfaceC1616u interfaceC1616u) {
        com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26631n;
        L0(24, 9, aVar);
        interfaceC1616u.a(aVar, AbstractC3541h0.s());
    }

    public final /* synthetic */ void x0(InterfaceC1585e interfaceC1585e) {
        K0(interfaceC1585e, com.android.billingclient.api.d.f26631n, 24, null);
    }

    public C1593i(String str, Context context, InterfaceC1615t0 interfaceC1615t0, ExecutorService executorService) {
        this.f11069a = new Object();
        this.f11070b = 0;
        this.f11072d = new Handler(Looper.getMainLooper());
        this.f11080l = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.f11068F = lValueOf;
        String strS = S();
        this.f11071c = strS;
        this.f11074f = context.getApplicationContext();
        C3610s4 c3610s4H = C3622u4.H();
        c3610s4H.y(strS);
        c3610s4H.x(this.f11074f.getPackageName());
        c3610s4H.w(lValueOf.longValue());
        this.f11075g = new C1621w0(this.f11074f, (C3622u4) c3610s4H.r());
        this.f11074f.getPackageName();
    }

    public C1593i(String str, C1609q c1609q, Context context, InterfaceC1627z0 interfaceC1627z0, InterfaceC1615t0 interfaceC1615t0, ExecutorService executorService) {
        this.f11069a = new Object();
        this.f11070b = 0;
        this.f11072d = new Handler(Looper.getMainLooper());
        this.f11080l = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.f11068F = lValueOf;
        this.f11071c = S();
        this.f11074f = context.getApplicationContext();
        C3610s4 c3610s4H = C3622u4.H();
        c3610s4H.y(S());
        c3610s4H.x(this.f11074f.getPackageName());
        c3610s4H.w(lValueOf.longValue());
        this.f11075g = new C1621w0(this.f11074f, (C3622u4) c3610s4H.r());
        AbstractC3524e1.k("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f11073e = new O0(this.f11074f, null, null, null, null, this.f11075g);
        this.f11064B = c1609q;
        this.f11074f.getPackageName();
    }

    public C1593i(String str, C1609q c1609q, Context context, InterfaceC1618v interfaceC1618v, S s10, InterfaceC1615t0 interfaceC1615t0, ExecutorService executorService) {
        String strS = S();
        this.f11069a = new Object();
        this.f11070b = 0;
        this.f11072d = new Handler(Looper.getMainLooper());
        this.f11080l = 0;
        this.f11068F = Long.valueOf(new Random().nextLong());
        this.f11071c = strS;
        q(context, interfaceC1618v, c1609q, null, strS, null);
    }

    public C1593i(String str, C1609q c1609q, Context context, InterfaceC1618v interfaceC1618v, InterfaceC1626z interfaceC1626z, InterfaceC1615t0 interfaceC1615t0, ExecutorService executorService) {
        this(context, c1609q, interfaceC1618v, S(), null, interfaceC1626z, null, null);
    }
}
