package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class R1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final R1 f29797c = new R1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f29799b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3387d2 f29798a = new C1();

    public static R1 a() {
        return f29797c;
    }

    public final InterfaceC3382c2 b(Class cls) {
        AbstractC3446p1.c(cls, "messageType");
        InterfaceC3382c2 interfaceC3382c2 = (InterfaceC3382c2) this.f29799b.get(cls);
        if (interfaceC3382c2 != null) {
            return interfaceC3382c2;
        }
        InterfaceC3382c2 interfaceC3382c2A = this.f29798a.a(cls);
        AbstractC3446p1.c(cls, "messageType");
        InterfaceC3382c2 interfaceC3382c22 = (InterfaceC3382c2) this.f29799b.putIfAbsent(cls, interfaceC3382c2A);
        return interfaceC3382c22 == null ? interfaceC3382c2A : interfaceC3382c22;
    }
}
