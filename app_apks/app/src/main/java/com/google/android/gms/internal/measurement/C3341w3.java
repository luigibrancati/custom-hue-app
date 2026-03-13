package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3341w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f29714a = new HashMap();

    public final void a(String str, Callable callable) {
        this.f29714a.put(str, callable);
    }
}
