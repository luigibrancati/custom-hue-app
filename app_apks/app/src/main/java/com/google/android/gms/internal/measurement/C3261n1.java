package com.google.android.gms.internal.measurement;

import android.app.Activity;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3261n1 extends AbstractRunnableC3225j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f29556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C3314t1 f29557f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3261n1(C3314t1 c3314t1, Activity activity) {
        super(c3314t1.f29608a, true);
        this.f29556e = activity;
        Objects.requireNonNull(c3314t1);
        this.f29557f = c3314t1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3225j1
    public final void a() {
        ((InterfaceC3287q0) AbstractC6056k.l(this.f29557f.f29608a.n())).onActivityResumedByScionActivityInfo(C0.d(this.f29556e), this.f29507b);
    }
}
