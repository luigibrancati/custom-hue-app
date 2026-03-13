package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3540h extends AbstractC3558k implements InterfaceC3546i {
    public C3540h(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3546i
    public final int A0(int i10, String str, String str2) {
        Parcel parcelD = D();
        parcelD.writeInt(3);
        parcelD.writeString(str);
        parcelD.writeString(str2);
        Parcel parcelK = K(5, parcelD);
        int i11 = parcelK.readInt();
        parcelK.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3546i
    public final Bundle A2(int i10, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel parcelD = D();
        parcelD.writeInt(i10);
        parcelD.writeString(str);
        parcelD.writeString(str2);
        parcelD.writeString(str3);
        parcelD.writeString(null);
        AbstractC3564l.c(parcelD, bundle);
        Parcel parcelK = K(8, parcelD);
        Bundle bundle2 = (Bundle) AbstractC3564l.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3546i
    public final Bundle A6(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelD = D();
        parcelD.writeInt(9);
        parcelD.writeString(str);
        parcelD.writeString(str2);
        AbstractC3564l.c(parcelD, bundle);
        Parcel parcelK = K(902, parcelD);
        Bundle bundle2 = (Bundle) AbstractC3564l.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC3546i
    public final void E2(int i10, String str, Bundle bundle, InterfaceC3510c interfaceC3510c) {
        Parcel parcelD = D();
        parcelD.writeInt(21);
        parcelD.writeString(str);
        AbstractC3564l.c(parcelD, bundle);
        parcelD.writeStrongBinder(interfaceC3510c);
        I6(1601, parcelD);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3546i
    public final Bundle H1(int i10, String str, String str2, String str3) {
        Parcel parcelD = D();
        parcelD.writeInt(3);
        parcelD.writeString(str);
        parcelD.writeString(str2);
        parcelD.writeString(str3);
        Parcel parcelK = K(4, parcelD);
        Bundle bundle = (Bundle) AbstractC3564l.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC3546i
    public final void S5(int i10, String str, Bundle bundle, InterfaceC3528f interfaceC3528f) {
        Parcel parcelD = D();
        parcelD.writeInt(21);
        parcelD.writeString(str);
        AbstractC3564l.c(parcelD, bundle);
        parcelD.writeStrongBinder(interfaceC3528f);
        I6(1401, parcelD);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3546i
    public final Bundle T3(int i10, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelD = D();
        parcelD.writeInt(i10);
        parcelD.writeString(str);
        parcelD.writeString(str2);
        AbstractC3564l.c(parcelD, bundle);
        AbstractC3564l.c(parcelD, bundle2);
        Parcel parcelK = K(901, parcelD);
        Bundle bundle3 = (Bundle) AbstractC3564l.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3546i
    public final Bundle W4(int i10, String str, String str2, String str3, String str4) {
        Parcel parcelD = D();
        parcelD.writeInt(3);
        parcelD.writeString(str);
        parcelD.writeString(str2);
        parcelD.writeString(str3);
        parcelD.writeString(null);
        Parcel parcelK = K(3, parcelD);
        Bundle bundle = (Bundle) AbstractC3564l.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC3546i
    public final void X4(int i10, String str, Bundle bundle, j5 j5Var) {
        Parcel parcelD = D();
        parcelD.writeInt(21);
        parcelD.writeString(str);
        AbstractC3564l.c(parcelD, bundle);
        parcelD.writeStrongBinder(j5Var);
        I6(1501, parcelD);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3546i
    public final Bundle Y3(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelD = D();
        parcelD.writeInt(9);
        parcelD.writeString(str);
        parcelD.writeString(str2);
        AbstractC3564l.c(parcelD, bundle);
        Parcel parcelK = K(12, parcelD);
        Bundle bundle2 = (Bundle) AbstractC3564l.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC3546i
    public final void c3(int i10, String str, Bundle bundle, InterfaceC3516d interfaceC3516d) {
        Parcel parcelD = D();
        parcelD.writeInt(18);
        parcelD.writeString(str);
        AbstractC3564l.c(parcelD, bundle);
        parcelD.writeStrongBinder(interfaceC3516d);
        X(1301, parcelD);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3546i
    public final int g4(int i10, String str, String str2) {
        Parcel parcelD = D();
        parcelD.writeInt(i10);
        parcelD.writeString(str);
        parcelD.writeString(str2);
        Parcel parcelK = K(1, parcelD);
        int i11 = parcelK.readInt();
        parcelK.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3546i
    public final int i6(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelD = D();
        parcelD.writeInt(i10);
        parcelD.writeString(str);
        parcelD.writeString(str2);
        AbstractC3564l.c(parcelD, bundle);
        Parcel parcelK = K(10, parcelD);
        int i11 = parcelK.readInt();
        parcelK.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3546i
    public final Bundle l4(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelD = D();
        parcelD.writeInt(6);
        parcelD.writeString(str);
        parcelD.writeString(str2);
        parcelD.writeString(str3);
        AbstractC3564l.c(parcelD, bundle);
        Parcel parcelK = K(9, parcelD);
        Bundle bundle2 = (Bundle) AbstractC3564l.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3546i
    public final Bundle u3(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelD = D();
        parcelD.writeInt(i10);
        parcelD.writeString(str);
        parcelD.writeString(str2);
        parcelD.writeString(str3);
        AbstractC3564l.c(parcelD, bundle);
        Parcel parcelK = K(11, parcelD);
        Bundle bundle2 = (Bundle) AbstractC3564l.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle2;
    }
}
