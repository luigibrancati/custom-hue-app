package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class G0 extends AbstractRunnableC3225j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f29198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f29199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bundle f29200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C3323u1 f29201h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(C3323u1 c3323u1, String str, String str2, Bundle bundle) {
        super(c3323u1, true);
        this.f29198e = str;
        this.f29199f = str2;
        this.f29200g = bundle;
        Objects.requireNonNull(c3323u1);
        this.f29201h = c3323u1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3225j1
    public final void a() {
        ((InterfaceC3287q0) AbstractC6056k.l(this.f29201h.n())).clearConditionalUserProperty(this.f29198e, this.f29199f, this.f29200g);
    }
}
