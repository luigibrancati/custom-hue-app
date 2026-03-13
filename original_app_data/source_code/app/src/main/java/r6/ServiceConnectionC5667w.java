package r6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: r6.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC5667w implements ServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5668x f43794c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C5640C f43797f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43792a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Messenger f43793b = new Messenger(new I6.f(Looper.getMainLooper(), new Handler.Callback() { // from class: r6.t
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i10);
            }
            ServiceConnectionC5667w serviceConnectionC5667w = this.f43789a;
            synchronized (serviceConnectionC5667w) {
                try {
                    AbstractC5670z abstractC5670z = (AbstractC5670z) serviceConnectionC5667w.f43796e.get(i10);
                    if (abstractC5670z == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                        return true;
                    }
                    serviceConnectionC5667w.f43796e.remove(i10);
                    serviceConnectionC5667w.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        abstractC5670z.c(new C5638A(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    abstractC5670z.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Queue f43795d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f43796e = new SparseArray();

    public /* synthetic */ ServiceConnectionC5667w(C5640C c5640c, AbstractC5666v abstractC5666v) {
        this.f43797f = c5640c;
    }

    public final synchronized void a(int i10, String str) {
        b(i10, str, null);
    }

    public final synchronized void b(int i10, String str, Throwable th) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i11 = this.f43792a;
            if (i11 == 0) {
                throw new IllegalStateException();
            }
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f43792a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f43792a = 4;
            A6.a.b().c(this.f43797f.f43742a, this);
            C5638A c5638a = new C5638A(i10, str, th);
            Iterator it = this.f43795d.iterator();
            while (it.hasNext()) {
                ((AbstractC5670z) it.next()).c(c5638a);
            }
            this.f43795d.clear();
            for (int i12 = 0; i12 < this.f43796e.size(); i12++) {
                ((AbstractC5670z) this.f43796e.valueAt(i12)).c(c5638a);
            }
            this.f43796e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c() {
        this.f43797f.f43743b.execute(new Runnable() { // from class: r6.q
            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC5670z abstractC5670z;
                while (true) {
                    final ServiceConnectionC5667w serviceConnectionC5667w = this.f43786a;
                    synchronized (serviceConnectionC5667w) {
                        try {
                            if (serviceConnectionC5667w.f43792a != 2) {
                                return;
                            }
                            if (serviceConnectionC5667w.f43795d.isEmpty()) {
                                serviceConnectionC5667w.f();
                                return;
                            } else {
                                abstractC5670z = (AbstractC5670z) serviceConnectionC5667w.f43795d.poll();
                                serviceConnectionC5667w.f43796e.put(abstractC5670z.f43800a, abstractC5670z);
                                serviceConnectionC5667w.f43797f.f43743b.schedule(new Runnable() { // from class: r6.u
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        serviceConnectionC5667w.e(abstractC5670z.f43800a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } finally {
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(abstractC5670z)));
                    }
                    C5640C c5640c = serviceConnectionC5667w.f43797f;
                    Messenger messenger = serviceConnectionC5667w.f43793b;
                    int i10 = abstractC5670z.f43802c;
                    Context context = c5640c.f43742a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i10;
                    messageObtain.arg1 = abstractC5670z.f43800a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", abstractC5670z.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", abstractC5670z.f43803d);
                    messageObtain.setData(bundle);
                    try {
                        serviceConnectionC5667w.f43794c.a(messageObtain);
                    } catch (RemoteException e10) {
                        serviceConnectionC5667w.a(2, e10.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void d() {
        if (this.f43792a == 1) {
            a(1, "Timed out while binding");
        }
    }

    public final synchronized void e(int i10) {
        AbstractC5670z abstractC5670z = (AbstractC5670z) this.f43796e.get(i10);
        if (abstractC5670z != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i10);
            this.f43796e.remove(i10);
            abstractC5670z.c(new C5638A(3, "Timed out waiting for response", null));
            f();
        }
    }

    public final synchronized void f() {
        try {
            if (this.f43792a == 2 && this.f43795d.isEmpty() && this.f43796e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f43792a = 3;
                A6.a.b().c(this.f43797f.f43742a, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g(AbstractC5670z abstractC5670z) {
        int i10 = this.f43792a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f43795d.add(abstractC5670z);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f43795d.add(abstractC5670z);
            c();
            return true;
        }
        this.f43795d.add(abstractC5670z);
        AbstractC6056k.p(this.f43792a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f43792a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (A6.a.b().a(this.f43797f.f43742a, intent, this, 1)) {
                this.f43797f.f43743b.schedule(new Runnable() { // from class: r6.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f43787a.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e10) {
            b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f43797f.f43743b.execute(new Runnable() { // from class: r6.p
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC5667w serviceConnectionC5667w = this.f43784a;
                IBinder iBinder2 = iBinder;
                synchronized (serviceConnectionC5667w) {
                    if (iBinder2 == null) {
                        serviceConnectionC5667w.a(0, "Null service connection");
                        return;
                    }
                    try {
                        serviceConnectionC5667w.f43794c = new C5668x(iBinder2);
                        serviceConnectionC5667w.f43792a = 2;
                        serviceConnectionC5667w.c();
                    } catch (RemoteException e10) {
                        serviceConnectionC5667w.a(0, e10.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f43797f.f43743b.execute(new Runnable() { // from class: r6.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f43788a.a(2, "Service disconnected");
            }
        });
    }
}
