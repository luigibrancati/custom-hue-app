package com.google.android.gms.internal.measurement;

import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class E0 extends AbstractRunnableC3225j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f29164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f29165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f29166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f29167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C3323u1 f29168i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(C3323u1 c3323u1, String str, String str2, Object obj, boolean z10) {
        super(c3323u1, true);
        this.f29164e = str;
        this.f29165f = str2;
        this.f29166g = obj;
        this.f29167h = z10;
        Objects.requireNonNull(c3323u1);
        this.f29168i = c3323u1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3225j1
    public final void a() {
        ((InterfaceC3287q0) AbstractC6056k.l(this.f29168i.n())).setUserProperty(this.f29164e, this.f29165f, ObjectWrapper.wrap(this.f29166g), this.f29167h, this.f29506a);
    }
}
