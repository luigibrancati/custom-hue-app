package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3526e3 implements InterfaceC3639x3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC3556j3 f30157b = new C3514c3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3556j3 f30158a;

    public C3526e3() {
        K2 k2C = K2.c();
        C3615t3 c3615t3 = C3615t3.f30246c;
        C3520d3 c3520d3 = new C3520d3(k2C, f30157b);
        Charset charset = T2.f30091a;
        this.f30158a = c3520d3;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3639x3
    public final InterfaceC3633w3 a(Class cls) {
        I3 i32 = AbstractC3645y3.f30271a;
        if (!O2.class.isAssignableFrom(cls)) {
            C3615t3 c3615t3 = C3615t3.f30246c;
        }
        InterfaceC3550i3 interfaceC3550i3A = this.f30158a.a(cls);
        if (interfaceC3550i3A.zzb()) {
            C3615t3 c3615t32 = C3615t3.f30246c;
            return C3592p3.j(AbstractC3645y3.r(), E2.a(), interfaceC3550i3A.zza());
        }
        C3615t3 c3615t33 = C3615t3.f30246c;
        return C3586o3.A(cls, interfaceC3550i3A, AbstractC3603r3.a(), AbstractC3508b3.a(), AbstractC3645y3.r(), interfaceC3550i3A.b() + (-1) != 1 ? E2.a() : null, AbstractC3544h3.a());
    }
}
