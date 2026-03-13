package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class N7 extends AbstractC3223j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3311s7 f29292c;

    public N7(InterfaceC3311s7 interfaceC3311s7) {
        super("internal.logger");
        this.f29292c = interfaceC3311s7;
        this.f29503b.put("log", new M7(this, false, true));
        this.f29503b.put("silent", new C3293q6(this, "silent"));
        ((AbstractC3223j) this.f29503b.get("silent")).k("log", new M7(this, true, true));
        this.f29503b.put("unmonitored", new R6(this, "unmonitored"));
        ((AbstractC3223j) this.f29503b.get("unmonitored")).k("log", new M7(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3223j
    public final InterfaceC3277p a(T1 t12, List list) {
        return InterfaceC3277p.f29567U;
    }

    public final /* synthetic */ InterfaceC3311s7 i() {
        return this.f29292c;
    }
}
