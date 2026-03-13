package com.google.android.gms.internal.measurement;

import android.app.Activity;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3279p1 extends AbstractRunnableC3225j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f29575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C3314t1 f29576f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3279p1(C3314t1 c3314t1, Activity activity) {
        super(c3314t1.f29608a, true);
        this.f29575e = activity;
        Objects.requireNonNull(c3314t1);
        this.f29576f = c3314t1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3225j1
    public final void a() {
        ((InterfaceC3287q0) AbstractC6056k.l(this.f29576f.f29608a.n())).onActivityStoppedByScionActivityInfo(C0.d(this.f29575e), this.f29507b);
    }
}
