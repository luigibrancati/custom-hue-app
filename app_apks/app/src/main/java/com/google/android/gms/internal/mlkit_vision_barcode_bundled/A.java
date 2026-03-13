package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        String strG = null;
        String strG2 = null;
        byte[] bArrB = null;
        Point[] pointArr = null;
        C3458s c3458s = null;
        C3473v c3473v = null;
        C3478w c3478w = null;
        C3488y c3488y = null;
        C3483x c3483x = null;
        C3463t c3463t = null;
        C3444p c3444p = null;
        C3449q c3449q = null;
        r rVar = null;
        int iW = 0;
        int iW2 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 1:
                    iW = w6.b.w(parcel, iU);
                    break;
                case 2:
                    strG = w6.b.g(parcel, iU);
                    break;
                case 3:
                    strG2 = w6.b.g(parcel, iU);
                    break;
                case 4:
                    bArrB = w6.b.b(parcel, iU);
                    break;
                case 5:
                    pointArr = (Point[]) w6.b.j(parcel, iU, Point.CREATOR);
                    break;
                case 6:
                    iW2 = w6.b.w(parcel, iU);
                    break;
                case 7:
                    c3458s = (C3458s) w6.b.f(parcel, iU, C3458s.CREATOR);
                    break;
                case 8:
                    c3473v = (C3473v) w6.b.f(parcel, iU, C3473v.CREATOR);
                    break;
                case 9:
                    c3478w = (C3478w) w6.b.f(parcel, iU, C3478w.CREATOR);
                    break;
                case 10:
                    c3488y = (C3488y) w6.b.f(parcel, iU, C3488y.CREATOR);
                    break;
                case 11:
                    c3483x = (C3483x) w6.b.f(parcel, iU, C3483x.CREATOR);
                    break;
                case 12:
                    c3463t = (C3463t) w6.b.f(parcel, iU, C3463t.CREATOR);
                    break;
                case 13:
                    c3444p = (C3444p) w6.b.f(parcel, iU, C3444p.CREATOR);
                    break;
                case 14:
                    c3449q = (C3449q) w6.b.f(parcel, iU, C3449q.CREATOR);
                    break;
                case 15:
                    rVar = (r) w6.b.f(parcel, iU, r.CREATOR);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new C3493z(iW, strG, strG2, bArrB, pointArr, iW2, c3458s, c3473v, c3478w, c3488y, c3483x, c3463t, c3444p, c3449q, rVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3493z[i10];
    }
}
