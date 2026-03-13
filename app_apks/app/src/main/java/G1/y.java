package G1;

import G1.y;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static y f4349f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f4350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f4351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4354e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final y f4355a;

            public a(y yVar) {
                this.f4355a = yVar;
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f4355a.m(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, y yVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) AbstractC0853a.e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(yVar);
                telephonyManager.registerTelephonyCallback(yVar.f4350a, aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                yVar.m(5);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        void a(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f4356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f4357b;

        public d(c cVar, Executor executor) {
            this.f4356a = new WeakReference(cVar);
            this.f4357b = executor;
        }

        public static /* synthetic */ void a(d dVar) {
            c cVar = (c) dVar.f4356a.get();
            if (cVar != null) {
                cVar.a(y.this.g());
            }
        }

        public void b() {
            this.f4357b.execute(new Runnable() { // from class: G1.z
                @Override // java.lang.Runnable
                public final void run() {
                    y.d.a(this.f4360a);
                }
            });
        }

        public boolean c() {
            return this.f4356a.get() == null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            y.this.f4350a.execute(new Runnable() { // from class: G1.A
                @Override // java.lang.Runnable
                public final void run() {
                    y.this.i(context);
                }
            });
        }
    }

    public y(final Context context) {
        Executor executorA = AbstractC0854b.a();
        this.f4350a = executorA;
        this.f4351b = new CopyOnWriteArrayList();
        this.f4352c = new Object();
        this.f4353d = 0;
        executorA.execute(new Runnable() { // from class: G1.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f4347a.j(context);
            }
        });
    }

    public static synchronized y e(Context context) {
        try {
            if (f4349f == null) {
                f4349f = new y(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4349f;
    }

    public static int f(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return 9;
        }
    }

    public static int h(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return f(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    public int g() {
        int i10;
        synchronized (this.f4352c) {
            i10 = this.f4353d;
        }
        return i10;
    }

    public final void i(Context context) {
        int iH = h(context);
        if (iH == 5) {
            b.a(context, this);
        } else {
            m(iH);
        }
    }

    public final void j(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new e(), intentFilter);
    }

    public void k(c cVar, Executor executor) {
        boolean z10;
        l();
        d dVar = new d(cVar, executor);
        synchronized (this.f4352c) {
            this.f4351b.add(dVar);
            z10 = this.f4354e;
        }
        if (z10) {
            dVar.b();
        }
    }

    public final void l() {
        for (d dVar : this.f4351b) {
            if (dVar.c()) {
                this.f4351b.remove(dVar);
            }
        }
    }

    public final void m(int i10) {
        l();
        synchronized (this.f4352c) {
            try {
                if (this.f4354e && this.f4353d == i10) {
                    return;
                }
                this.f4354e = true;
                this.f4353d = i10;
                Iterator it = this.f4351b.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
