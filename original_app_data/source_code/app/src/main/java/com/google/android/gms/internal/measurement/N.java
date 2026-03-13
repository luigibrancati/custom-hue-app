package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class N implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f29279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29280b;

    public N(IBinder iBinder, String str) {
        this.f29279a = iBinder;
        this.f29280b = str;
    }

    public final Parcel D(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f29279a.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final void I6(int i10, Parcel parcel) {
        try {
            this.f29279a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel K() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f29280b);
        return parcelObtain;
    }

    public final void X(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f29279a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f29279a;
    }
}
