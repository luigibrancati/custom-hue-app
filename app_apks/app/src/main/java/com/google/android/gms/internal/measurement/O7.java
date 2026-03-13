package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class O7 extends AbstractC3223j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable f29309c;

    public O7(String str, Callable callable) {
        super("internal.appMetadata");
        this.f29309c = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3223j
    public final InterfaceC3277p a(T1 t12, List list) {
        try {
            return V2.a(this.f29309c.call());
        } catch (Exception unused) {
            return InterfaceC3277p.f29567U;
        }
    }
}
