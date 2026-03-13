package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3337w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29713a = new ArrayList();

    public abstract InterfaceC3277p a(String str, T1 t12, List list);

    public final InterfaceC3277p b(String str) {
        if (this.f29713a.contains(AbstractC3324u2.e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
