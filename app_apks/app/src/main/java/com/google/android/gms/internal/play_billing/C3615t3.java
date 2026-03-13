package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3615t3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3615t3 f30246c = new C3615t3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f30248b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3639x3 f30247a = new C3526e3();

    public static C3615t3 a() {
        return f30246c;
    }

    public final InterfaceC3633w3 b(Class cls) {
        T2.c(cls, "messageType");
        InterfaceC3633w3 interfaceC3633w3 = (InterfaceC3633w3) this.f30248b.get(cls);
        if (interfaceC3633w3 != null) {
            return interfaceC3633w3;
        }
        InterfaceC3633w3 interfaceC3633w3A = this.f30247a.a(cls);
        T2.c(cls, "messageType");
        InterfaceC3633w3 interfaceC3633w32 = (InterfaceC3633w3) this.f30248b.putIfAbsent(cls, interfaceC3633w3A);
        return interfaceC3633w32 == null ? interfaceC3633w3A : interfaceC3633w32;
    }
}
