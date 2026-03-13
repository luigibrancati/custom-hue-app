package r6;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: renamed from: r6.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5668x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Messenger f43798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.cloudmessaging.a f43799b;

    public C5668x(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f43798a = new Messenger(iBinder);
            this.f43799b = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f43799b = new com.google.android.gms.cloudmessaging.a(iBinder);
            this.f43798a = null;
        }
    }

    public final void a(Message message) throws RemoteException {
        Messenger messenger = this.f43798a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        com.google.android.gms.cloudmessaging.a aVar = this.f43799b;
        if (aVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        aVar.b(message);
    }
}
