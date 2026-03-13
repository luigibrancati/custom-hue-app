package com.google.ar.core.dependencies;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class c implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f31189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31190b;

    public c(IBinder iBinder, String str) {
        this.f31189a = iBinder;
        this.f31190b = str;
    }

    public final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f31190b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31189a;
    }

    public final Parcel b(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f31189a.transact(i10, parcel, parcelObtain, 0);
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

    public final void c(int i10, Parcel parcel) {
        try {
            this.f31189a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
