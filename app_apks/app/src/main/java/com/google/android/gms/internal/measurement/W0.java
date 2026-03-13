package com.google.android.gms.internal.measurement;

import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class W0 extends AbstractRunnableC3225j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzco f29377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C3323u1 f29378f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(C3323u1 c3323u1, zzco zzcoVar) {
        super(c3323u1, true);
        this.f29377e = zzcoVar;
        Objects.requireNonNull(c3323u1);
        this.f29378f = c3323u1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3225j1
    public final void a() {
        ((InterfaceC3287q0) AbstractC6056k.l(this.f29378f.n())).getCurrentScreenName(this.f29377e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3225j1
    public final void b() {
        this.f29377e.Z(null);
    }
}
