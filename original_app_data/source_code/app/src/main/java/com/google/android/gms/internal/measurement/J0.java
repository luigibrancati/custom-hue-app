package com.google.android.gms.internal.measurement;

import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class J0 extends AbstractRunnableC3225j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0 f29237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f29238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f29239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C3323u1 f29240h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(C3323u1 c3323u1, C0 c02, String str, String str2) {
        super(c3323u1, true);
        this.f29237e = c02;
        this.f29238f = str;
        this.f29239g = str2;
        Objects.requireNonNull(c3323u1);
        this.f29240h = c3323u1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3225j1
    public final void a() {
        ((InterfaceC3287q0) AbstractC6056k.l(this.f29240h.n())).setCurrentScreenByScionActivityInfo(this.f29237e, this.f29238f, this.f29239g, this.f29506a);
    }
}
