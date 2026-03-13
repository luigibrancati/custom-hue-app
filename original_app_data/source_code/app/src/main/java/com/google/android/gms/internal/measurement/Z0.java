package com.google.android.gms.internal.measurement;

import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Z0 extends AbstractRunnableC3225j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f29394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f29395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f29396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zzco f29397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C3323u1 f29398i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(C3323u1 c3323u1, String str, String str2, boolean z10, zzco zzcoVar) {
        super(c3323u1, true);
        this.f29394e = str;
        this.f29395f = str2;
        this.f29396g = z10;
        this.f29397h = zzcoVar;
        Objects.requireNonNull(c3323u1);
        this.f29398i = c3323u1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3225j1
    public final void a() {
        ((InterfaceC3287q0) AbstractC6056k.l(this.f29398i.n())).getUserProperties(this.f29394e, this.f29395f, this.f29396g, this.f29397h);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3225j1
    public final void b() {
        this.f29397h.Z(null);
    }
}
