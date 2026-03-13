package com.google.android.gms.internal.measurement;

import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3207h1 extends AbstractRunnableC3225j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC3234k1 f29483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C3323u1 f29484f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3207h1(C3323u1 c3323u1, BinderC3234k1 binderC3234k1) {
        super(c3323u1, true);
        this.f29483e = binderC3234k1;
        Objects.requireNonNull(c3323u1);
        this.f29484f = c3323u1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3225j1
    public final void a() {
        ((InterfaceC3287q0) AbstractC6056k.l(this.f29484f.n())).registerOnMeasurementEventListener(this.f29483e);
    }
}
