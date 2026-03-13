package s6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: s6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceConnectionC5782a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f44143a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f44144b = new LinkedBlockingQueue();

    public IBinder a(long j10, TimeUnit timeUnit) throws TimeoutException {
        AbstractC6056k.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f44143a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f44143a = true;
        IBinder iBinder = (IBinder) this.f44144b.poll(j10, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f44144b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
