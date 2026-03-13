package O4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.AbstractC3524e1;
import com.google.android.gms.internal.play_billing.AbstractC3541h0;
import com.google.android.gms.internal.play_billing.B2;
import com.google.android.gms.internal.play_billing.Y3;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class N0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O0 f10982c;

    public N0(O0 o02, boolean z10) {
        this.f10982c = o02;
        this.f10981b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f10980a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f10981b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f10980a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter, String str) {
        N0 n02;
        try {
            try {
                if (this.f10980a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    n02 = this;
                    context.registerReceiver(n02, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f10981b ? 4 : 2);
                } else {
                    n02 = this;
                    context.registerReceiver(n02, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                n02.f10980a = true;
                return;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        throw th;
    }

    public final synchronized void c(Context context) {
        if (!this.f10980a) {
            AbstractC3524e1.k("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f10980a = false;
        }
    }

    public final void d(Bundle bundle, com.android.billingclient.api.a aVar, int i10) {
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                this.f10982c.f10989d.f(Y3.D(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), B2.a()));
            } else {
                this.f10982c.f10989d.f(AbstractC1613s0.b(23, i10, aVar));
            }
        } catch (Throwable unused) {
            AbstractC3524e1.k("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            AbstractC3524e1.k("BillingBroadcastManager", "Bundle is null.");
            InterfaceC1615t0 interfaceC1615t0 = this.f10982c.f10989d;
            com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26628k;
            interfaceC1615t0.f(AbstractC1613s0.b(11, 1, aVar));
            O0 o02 = this.f10982c;
            if (o02.f10987b != null) {
                o02.f10987b.onPurchasesUpdated(aVar, null);
                return;
            }
            return;
        }
        com.android.billingclient.api.a aVarF = AbstractC3524e1.f(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i10 = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List listI = AbstractC3524e1.i(extras);
            if (aVarF.b() == 0) {
                this.f10982c.f10989d.d(AbstractC1613s0.d(i10));
            } else {
                d(extras, aVarF, i10);
            }
            this.f10982c.f10987b.onPurchasesUpdated(aVarF, listI);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (aVarF.b() != 0) {
                d(extras, aVarF, i10);
                this.f10982c.f10987b.onPurchasesUpdated(aVarF, AbstractC3541h0.s());
                return;
            }
            O0 o03 = this.f10982c;
            O0.a(o03);
            if (o03.f10988c == null) {
                AbstractC3524e1.k("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                InterfaceC1615t0 interfaceC1615t02 = this.f10982c.f10989d;
                com.android.billingclient.api.a aVar2 = com.android.billingclient.api.d.f26628k;
                interfaceC1615t02.f(AbstractC1613s0.b(77, i10, aVar2));
                this.f10982c.f10987b.onPurchasesUpdated(aVar2, AbstractC3541h0.s());
                return;
            }
            String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string == null) {
                AbstractC3524e1.k("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                InterfaceC1615t0 interfaceC1615t03 = this.f10982c.f10989d;
                com.android.billingclient.api.a aVar3 = com.android.billingclient.api.d.f26628k;
                interfaceC1615t03.f(AbstractC1613s0.b(16, i10, aVar3));
                this.f10982c.f10987b.onPurchasesUpdated(aVar3, AbstractC3541h0.s());
                return;
            }
            try {
                if (this.f10982c.f10988c != null) {
                    this.f10982c.f10988c.a(new A(string));
                    this.f10982c.f10989d.d(AbstractC1613s0.d(i10));
                    return;
                }
                JSONArray jSONArrayOptJSONArray = new JSONObject(string).optJSONArray("products");
                ArrayList arrayList = new ArrayList();
                if (jSONArrayOptJSONArray != null) {
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                        if (jSONObjectOptJSONObject != null) {
                            arrayList.add(new C1600l0(jSONObjectOptJSONObject, null));
                        }
                    }
                }
                O0.a(this.f10982c);
                throw null;
            } catch (JSONException unused) {
                AbstractC3524e1.k("BillingBroadcastManager", String.format("Error when parsing invalid user choice data: [%s]", string));
                InterfaceC1615t0 interfaceC1615t04 = this.f10982c.f10989d;
                com.android.billingclient.api.a aVar4 = com.android.billingclient.api.d.f26628k;
                interfaceC1615t04.f(AbstractC1613s0.b(17, i10, aVar4));
                this.f10982c.f10987b.onPurchasesUpdated(aVar4, AbstractC3541h0.s());
            }
        }
    }
}
