package x7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f47499a;

    public /* synthetic */ o(q qVar, p pVar) {
        this.f47499a = qVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f47499a.f47502b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f47499a.c().post(new m(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f47499a.f47502b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f47499a.c().post(new n(this));
    }
}
