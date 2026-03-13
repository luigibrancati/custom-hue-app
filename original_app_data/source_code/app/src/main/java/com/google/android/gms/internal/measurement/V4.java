package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class V4 extends AbstractC3223j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q5 f29367c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V4(C3283p5 c3283p5, String str, Q5 q52) {
        super("getValue");
        this.f29367c = q52;
        Objects.requireNonNull(c3283p5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3223j
    public final InterfaceC3277p a(T1 t12, List list) {
        AbstractC3324u2.a("getValue", 2, list);
        InterfaceC3277p interfaceC3277pA = t12.a((InterfaceC3277p) list.get(0));
        InterfaceC3277p interfaceC3277pA2 = t12.a((InterfaceC3277p) list.get(1));
        String strA = this.f29367c.a(interfaceC3277pA.b());
        return strA != null ? new C3312t(strA) : interfaceC3277pA2;
    }
}
