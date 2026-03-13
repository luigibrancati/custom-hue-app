package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3243l1 extends AbstractRunnableC3225j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f29534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f29535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C3314t1 f29536g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3243l1(C3314t1 c3314t1, Bundle bundle, Activity activity) {
        super(c3314t1.f29608a, true);
        this.f29534e = bundle;
        this.f29535f = activity;
        Objects.requireNonNull(c3314t1);
        this.f29536g = c3314t1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3225j1
    public final void a() {
        Bundle bundle;
        Bundle bundle2 = this.f29534e;
        if (bundle2 != null) {
            bundle = new Bundle();
            if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = bundle2.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        InterfaceC3287q0 interfaceC3287q0 = (InterfaceC3287q0) AbstractC6056k.l(this.f29536g.f29608a.n());
        Activity activity = this.f29535f;
        interfaceC3287q0.onActivityCreatedByScionActivityInfo(C0.d(activity), bundle, this.f29507b);
    }
}
