package com.google.android.gms.common.moduleinstall.internal;

import H6.b;
import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import y6.h;
import z6.InterfaceC6523f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zag extends zab implements InterfaceC6523f {
    public zag() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean I6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        h hVar = (h) b.a(parcel, h.CREATOR);
        b.d(parcel);
        d4(hVar);
        return true;
    }
}
