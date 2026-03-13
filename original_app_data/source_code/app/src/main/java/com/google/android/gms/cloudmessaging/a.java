package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import r6.C5654j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C5654j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Messenger f29007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IMessengerCompat f29008b;

    public a(IBinder iBinder) {
        this.f29007a = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.f29007a;
        return messenger != null ? messenger.getBinder() : this.f29008b.asBinder();
    }

    public final void b(Message message) throws RemoteException {
        Messenger messenger = this.f29007a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f29008b.e4(message);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((a) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f29007a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f29008b.asBinder());
        }
    }
}
