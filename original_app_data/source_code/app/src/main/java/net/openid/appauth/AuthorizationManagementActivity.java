package net.openid.appauth;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import i.ActivityC4309b;
import ke.AbstractC4843e;
import ke.InterfaceC4842d;
import ne.C5176a;
import net.openid.appauth.a;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class AuthorizationManagementActivity extends ActivityC4309b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40873c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Intent f40874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC4842d f40875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PendingIntent f40876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f40877g;

    public static Intent b0(Context context) {
        return new Intent(context, (Class<?>) AuthorizationManagementActivity.class);
    }

    public static Intent c0(Context context, Uri uri) {
        Intent intentB0 = b0(context);
        intentB0.setData(uri);
        intentB0.addFlags(603979776);
        return intentB0;
    }

    public static Intent d0(Context context, InterfaceC4842d interfaceC4842d, Intent intent) {
        return e0(context, interfaceC4842d, intent, null, null);
    }

    public static Intent e0(Context context, InterfaceC4842d interfaceC4842d, Intent intent, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Intent intentB0 = b0(context);
        intentB0.putExtra("authIntent", intent);
        intentB0.putExtra("authRequest", interfaceC4842d.a());
        intentB0.putExtra("authRequestType", ke.f.c(interfaceC4842d));
        intentB0.putExtra("completeIntent", pendingIntent);
        intentB0.putExtra("cancelIntent", pendingIntent2);
        return intentB0;
    }

    public final Intent f0(Uri uri) {
        if (uri.getQueryParameterNames().contains("error")) {
            return a.j(uri).n();
        }
        AbstractC4843e abstractC4843eD = ke.f.d(this.f40875e, uri);
        if ((this.f40875e.getState() != null || abstractC4843eD.a() == null) && (this.f40875e.getState() == null || this.f40875e.getState().equals(abstractC4843eD.a()))) {
            return abstractC4843eD.d();
        }
        C5176a.h("State returned in authorization response (%s) does not match state from request (%s) - discarding response", abstractC4843eD.a(), this.f40875e.getState());
        return a.C0544a.f40892j.n();
    }

    public final void g0(Bundle bundle) {
        if (bundle == null) {
            C5176a.h("No stored state - unable to handle response", new Object[0]);
            finish();
            return;
        }
        this.f40874d = (Intent) bundle.getParcelable("authIntent");
        this.f40873c = bundle.getBoolean("authStarted", false);
        this.f40876f = (PendingIntent) bundle.getParcelable("completeIntent");
        this.f40877g = (PendingIntent) bundle.getParcelable("cancelIntent");
        try {
            String string = bundle.getString("authRequest", null);
            this.f40875e = string != null ? ke.f.b(string, bundle.getString("authRequestType", null)) : null;
        } catch (JSONException unused) {
            k0(this.f40877g, a.C0544a.f40883a.n(), 0);
        }
    }

    public final void h0() {
        C5176a.a("Authorization flow canceled by user", new Object[0]);
        k0(this.f40877g, a.l(a.b.f40895b, null).n(), 0);
    }

    public final void i0() {
        Uri data = getIntent().getData();
        Intent intentF0 = f0(data);
        if (intentF0 == null) {
            C5176a.c("Failed to extract OAuth2 response from redirect", new Object[0]);
        } else {
            intentF0.setData(data);
            k0(this.f40876f, intentF0, -1);
        }
    }

    public final void j0() {
        C5176a.a("Authorization flow canceled due to missing browser", new Object[0]);
        k0(this.f40877g, a.l(a.b.f40896c, null).n(), 0);
    }

    public final void k0(PendingIntent pendingIntent, Intent intent, int i10) {
        if (pendingIntent == null) {
            setResult(i10, intent);
            return;
        }
        try {
            pendingIntent.send(this, 0, intent);
        } catch (PendingIntent.CanceledException e10) {
            C5176a.c("Failed to send cancel intent", e10);
        }
    }

    @Override // androidx.fragment.app.ActivityC2740v, d.p, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            g0(getIntent().getExtras());
        } else {
            g0(bundle);
        }
    }

    @Override // d.p, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.ActivityC2740v, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f40873c) {
            if (getIntent().getData() != null) {
                i0();
            } else {
                h0();
            }
            finish();
            return;
        }
        try {
            startActivity(this.f40874d);
            this.f40873c = true;
        } catch (ActivityNotFoundException unused) {
            j0();
            finish();
        }
    }

    @Override // d.p, androidx.core.app.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("authStarted", this.f40873c);
        bundle.putParcelable("authIntent", this.f40874d);
        bundle.putString("authRequest", this.f40875e.a());
        bundle.putString("authRequestType", ke.f.c(this.f40875e));
        bundle.putParcelable("completeIntent", this.f40876f);
        bundle.putParcelable("cancelIntent", this.f40877g);
    }
}
