package com.google.android.gms.common.internal.service;

import H6.b;
import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import x6.InterfaceC6312b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zaj extends zab implements InterfaceC6312b {
    public zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean I6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        int i12 = parcel.readInt();
        b.d(parcel);
        R(i12);
        return true;
    }
}
