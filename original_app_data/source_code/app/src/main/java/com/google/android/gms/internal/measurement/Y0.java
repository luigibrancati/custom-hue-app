package com.google.android.gms.internal.measurement;

import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Y0 extends AbstractRunnableC3225j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzco f29389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C3323u1 f29390f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(C3323u1 c3323u1, zzco zzcoVar) {
        super(c3323u1, true);
        this.f29389e = zzcoVar;
        Objects.requireNonNull(c3323u1);
        this.f29390f = c3323u1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3225j1
    public final void a() {
        ((InterfaceC3287q0) AbstractC6056k.l(this.f29390f.n())).getCurrentScreenClass(this.f29389e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3225j1
    public final void b() {
        this.f29389e.Z(null);
    }
}
