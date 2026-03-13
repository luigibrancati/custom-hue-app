package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        C3468u c3468u = null;
        String strG = null;
        String strG2 = null;
        C3473v[] c3473vArr = null;
        C3458s[] c3458sArr = null;
        String[] strArrH = null;
        C3434n[] c3434nArr = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 1:
                    c3468u = (C3468u) w6.b.f(parcel, iU, C3468u.CREATOR);
                    break;
                case 2:
                    strG = w6.b.g(parcel, iU);
                    break;
                case 3:
                    strG2 = w6.b.g(parcel, iU);
                    break;
                case 4:
                    c3473vArr = (C3473v[]) w6.b.j(parcel, iU, C3473v.CREATOR);
                    break;
                case 5:
                    c3458sArr = (C3458s[]) w6.b.j(parcel, iU, C3458s.CREATOR);
                    break;
                case 6:
                    strArrH = w6.b.h(parcel, iU);
                    break;
                case 7:
                    c3434nArr = (C3434n[]) w6.b.j(parcel, iU, C3434n.CREATOR);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new C3449q(c3468u, strG, strG2, c3473vArr, c3458sArr, strArrH, c3434nArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3449q[i10];
    }
}
