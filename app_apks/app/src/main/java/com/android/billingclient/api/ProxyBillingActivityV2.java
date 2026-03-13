package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.AbstractC3524e1;
import d.p;
import f.C3982a;
import f.h;
import g.h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f.c f26591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f.c f26592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ResultReceiver f26593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ResultReceiver f26594d;

    public final void J(C3982a c3982a) {
        Intent intentA = c3982a.a();
        int iB = AbstractC3524e1.f(intentA, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f26593c;
        if (resultReceiver != null) {
            resultReceiver.send(iB, intentA == null ? null : intentA.getExtras());
        }
        if (c3982a.b() != -1 || iB != 0) {
            AbstractC3524e1.k("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + c3982a.b() + " and billing's responseCode: " + iB);
        }
        finish();
    }

    public final void K(C3982a c3982a) {
        Intent intentA = c3982a.a();
        int iB = AbstractC3524e1.f(intentA, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f26594d;
        if (resultReceiver != null) {
            resultReceiver.send(iB, intentA == null ? null : intentA.getExtras());
        }
        if (c3982a.b() != -1 || iB != 0) {
            AbstractC3524e1.k("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(c3982a.b()), Integer.valueOf(iB)));
        }
        finish();
    }

    @Override // d.p, androidx.core.app.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f26591a = registerForActivityResult(new h(), new f.b() { // from class: O4.D0
            @Override // f.b
            public final void a(Object obj) {
                this.f10946a.J((C3982a) obj);
            }
        });
        this.f26592b = registerForActivityResult(new h(), new f.b() { // from class: O4.E0
            @Override // f.b
            public final void a(Object obj) {
                this.f10949a.K((C3982a) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f26593c = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f26594d = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        AbstractC3524e1.j("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f26593c = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f26591a.a(new h.a(pendingIntent).a());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f26594d = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f26592b.a(new h.a(pendingIntent2).a());
        }
    }

    @Override // d.p, androidx.core.app.g, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f26593c;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f26594d;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
