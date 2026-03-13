package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class U implements Parcelable.Creator {
    public static void c(T t10, Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.e(parcel, 2, t10.f31634a, false);
        w6.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            if (w6.b.m(iU) != 2) {
                w6.b.D(parcel, iU);
            } else {
                bundleA = w6.b.a(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new T(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T[] newArray(int i10) {
        return new T[i10];
    }
}
