package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3570m extends AbstractC3558k implements InterfaceC3576n {
    public C3570m(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC3576n
    public final void d1(String str, String str2, InterfaceC3582o interfaceC3582o) {
        Parcel parcelD = D();
        parcelD.writeString(str);
        parcelD.writeString(str2);
        int i10 = AbstractC3564l.f30194a;
        parcelD.writeStrongBinder(interfaceC3582o);
        I6(1, parcelD);
    }
}
