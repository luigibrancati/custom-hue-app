package com.google.android.gms.common.moduleinstall.internal;

import H6.b;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import y6.C6440b;
import y6.C6443e;
import y6.g;
import z6.InterfaceC6521d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zad extends zab implements InterfaceC6521d {
    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean I6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) b.a(parcel, Status.CREATOR);
            C6440b c6440b = (C6440b) b.a(parcel, C6440b.CREATOR);
            b.d(parcel);
            U4(status, c6440b);
        } else if (i10 == 2) {
            Status status2 = (Status) b.a(parcel, Status.CREATOR);
            g gVar = (g) b.a(parcel, g.CREATOR);
            b.d(parcel);
            k6(status2, gVar);
        } else if (i10 == 3) {
            Status status3 = (Status) b.a(parcel, Status.CREATOR);
            C6443e c6443e = (C6443e) b.a(parcel, C6443e.CREATOR);
            b.d(parcel);
            H6(status3, c6443e);
        } else {
            if (i10 != 4) {
                return false;
            }
            Status status4 = (Status) b.a(parcel, Status.CREATOR);
            b.d(parcel);
            g1(status4);
        }
        return true;
    }
}
