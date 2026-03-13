package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final K5 f29253c = new K5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f29255b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O5 f29254a = new C3318t5();

    public static K5 a() {
        return f29253c;
    }

    public final N5 b(Class cls) {
        AbstractC3211h5.a(cls, "messageType");
        ConcurrentMap concurrentMap = this.f29255b;
        N5 n52 = (N5) concurrentMap.get(cls);
        if (n52 != null) {
            return n52;
        }
        N5 n5A = this.f29254a.a(cls);
        AbstractC3211h5.a(cls, "messageType");
        N5 n53 = (N5) concurrentMap.putIfAbsent(cls, n5A);
        return n53 != null ? n53 : n5A;
    }
}
