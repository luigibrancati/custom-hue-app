package v6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import s6.C5783b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class V extends AbstractC6050e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f45810g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f45811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile Handler f45812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final U f45813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final A6.a f45814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f45815l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f45816m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile Executor f45817n;

    public V(Context context, Looper looper, Executor executor) {
        U u10 = new U(this, null);
        this.f45813j = u10;
        this.f45811h = context.getApplicationContext();
        this.f45812i = new J6.o(looper, u10);
        this.f45814k = A6.a.b();
        this.f45815l = 5000L;
        this.f45816m = 300000L;
        this.f45817n = executor;
    }

    @Override // v6.AbstractC6050e
    public final C5783b c(S s10, ServiceConnection serviceConnection, String str, Executor executor) {
        C5783b c5783bJ;
        AbstractC6056k.m(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f45810g;
        synchronized (map) {
            try {
                T t10 = (T) map.get(s10);
                if (executor == null) {
                    executor = this.f45817n;
                }
                if (t10 == null) {
                    t10 = new T(this, s10);
                    t10.b(serviceConnection, serviceConnection, str);
                    c5783bJ = t10.j(str, executor);
                    map.put(s10, t10);
                } else {
                    this.f45812i.removeMessages(0, s10);
                    if (t10.f(serviceConnection)) {
                        String string = s10.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(string);
                        throw new IllegalStateException(sb2.toString());
                    }
                    t10.b(serviceConnection, serviceConnection, str);
                    int iE = t10.e();
                    if (iE == 1) {
                        serviceConnection.onServiceConnected(t10.i(), t10.h());
                    } else if (iE == 2) {
                        c5783bJ = t10.j(str, executor);
                    }
                    c5783bJ = null;
                }
                if (t10.d()) {
                    return C5783b.f44145f;
                }
                if (c5783bJ == null) {
                    c5783bJ = new C5783b(-1);
                }
                return c5783bJ;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v6.AbstractC6050e
    public final void e(S s10, ServiceConnection serviceConnection, String str) {
        AbstractC6056k.m(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f45810g;
        synchronized (map) {
            try {
                T t10 = (T) map.get(s10);
                if (t10 == null) {
                    String string = s10.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(string);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!t10.f(serviceConnection)) {
                    String string2 = s10.toString();
                    StringBuilder sb3 = new StringBuilder(string2.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(string2);
                    throw new IllegalStateException(sb3.toString());
                }
                t10.c(serviceConnection, str);
                if (t10.g()) {
                    this.f45812i.sendMessageDelayed(this.f45812i.obtainMessage(0, s10), this.f45815l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ HashMap f() {
        return this.f45810g;
    }

    public final /* synthetic */ Context g() {
        return this.f45811h;
    }

    public final /* synthetic */ Handler h() {
        return this.f45812i;
    }

    public final /* synthetic */ A6.a i() {
        return this.f45814k;
    }

    public final /* synthetic */ long j() {
        return this.f45816m;
    }
}
