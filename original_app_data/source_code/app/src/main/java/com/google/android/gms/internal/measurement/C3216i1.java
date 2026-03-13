package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3216i1 extends AbstractRunnableC3225j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f29492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f29493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f29494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f29495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f29496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f29497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C3323u1 f29498k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3216i1(C3323u1 c3323u1, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(c3323u1, true);
        this.f29492e = l10;
        this.f29493f = str;
        this.f29494g = str2;
        this.f29495h = bundle;
        this.f29496i = z10;
        this.f29497j = z11;
        Objects.requireNonNull(c3323u1);
        this.f29498k = c3323u1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3225j1
    public final void a() {
        Long l10 = this.f29492e;
        ((InterfaceC3287q0) AbstractC6056k.l(this.f29498k.n())).logEvent(this.f29493f, this.f29494g, this.f29495h, this.f29496i, this.f29497j, l10 == null ? this.f29506a : l10.longValue());
    }
}
