package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import v6.InterfaceC6052g;
import v6.Q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements IGmsServiceBroker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f29099a;

    public g(IBinder iBinder) {
        this.f29099a = iBinder;
    }

    @Override // com.google.android.gms.common.internal.IGmsServiceBroker
    public final void M2(InterfaceC6052g interfaceC6052g, b bVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(interfaceC6052g != null ? interfaceC6052g.asBinder() : null);
            if (bVar != null) {
                parcelObtain.writeInt(1);
                Q.a(bVar, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f29099a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f29099a;
    }
}
