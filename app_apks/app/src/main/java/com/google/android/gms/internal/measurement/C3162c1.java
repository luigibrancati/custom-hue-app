package com.google.android.gms.internal.measurement;

import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3162c1 extends AbstractRunnableC3225j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f29430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzco f29431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C3323u1 f29432g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3162c1(C3323u1 c3323u1, String str, zzco zzcoVar) {
        super(c3323u1, true);
        this.f29430e = str;
        this.f29431f = zzcoVar;
        Objects.requireNonNull(c3323u1);
        this.f29432g = c3323u1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3225j1
    public final void a() {
        ((InterfaceC3287q0) AbstractC6056k.l(this.f29432g.n())).getMaxUserProperties(this.f29430e, this.f29431f);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3225j1
    public final void b() {
        this.f29431f.Z(null);
    }
}
