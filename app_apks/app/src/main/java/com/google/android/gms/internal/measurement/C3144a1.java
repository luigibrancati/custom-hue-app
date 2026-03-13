package com.google.android.gms.internal.measurement;

import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3144a1 extends AbstractRunnableC3225j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f29406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f29407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C3323u1 f29408g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3144a1(C3323u1 c3323u1, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(c3323u1, false);
        this.f29406e = str;
        this.f29407f = obj;
        Objects.requireNonNull(c3323u1);
        this.f29408g = c3323u1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3225j1
    public final void a() {
        ((InterfaceC3287q0) AbstractC6056k.l(this.f29408g.n())).logHealthData(5, this.f29406e, ObjectWrapper.wrap(this.f29407f), ObjectWrapper.wrap(null), ObjectWrapper.wrap(null));
    }
}
