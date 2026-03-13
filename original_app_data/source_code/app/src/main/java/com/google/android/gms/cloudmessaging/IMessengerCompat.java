package com.google.android.gms.cloudmessaging;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface IMessengerCompat extends IInterface {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Impl extends Binder implements IMessengerCompat {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            throw null;
        }

        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void e4(Message message) {
            throw null;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            throw null;
        }
    }

    void e4(Message message);
}
