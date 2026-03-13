package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K extends AbstractC3337w {
    @Override // com.google.android.gms.internal.measurement.AbstractC3337w
    public final InterfaceC3277p a(String str, T1 t12, List list) {
        if (str == null || str.isEmpty() || !t12.d(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        InterfaceC3277p interfaceC3277pH = t12.h(str);
        if (interfaceC3277pH instanceof AbstractC3223j) {
            return ((AbstractC3223j) interfaceC3277pH).a(t12, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
