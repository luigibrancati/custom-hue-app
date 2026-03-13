package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f29102b;

    public i(a aVar, int i10) {
        Objects.requireNonNull(aVar);
        this.f29102b = aVar;
        this.f29101a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f29102b.Y(16);
            return;
        }
        a aVar = this.f29102b;
        synchronized (aVar.a0()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar.b0((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGmsServiceBroker)) ? new g(iBinder) : (IGmsServiceBroker) iInterfaceQueryLocalInterface);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f29102b.U(0, null, this.f29101a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a aVar = this.f29102b;
        synchronized (aVar.a0()) {
            aVar.b0(null);
        }
        a aVar2 = this.f29102b;
        int i10 = this.f29101a;
        Handler handler = aVar2.f29056l;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
