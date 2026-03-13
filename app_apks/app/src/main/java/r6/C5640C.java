package r6;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: r6.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5640C {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C5640C f43741e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f43743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ServiceConnectionC5667w f43744c = new ServiceConnectionC5667w(this, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43745d = 1;

    public C5640C(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f43743b = scheduledExecutorService;
        this.f43742a = context.getApplicationContext();
    }

    public static synchronized C5640C b(Context context) {
        try {
            if (f43741e == null) {
                I6.e.a();
                f43741e = new C5640C(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new C6.b("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f43741e;
    }

    public final Task c(int i10, Bundle bundle) {
        return g(new C5669y(f(), i10, bundle));
    }

    public final Task d(int i10, Bundle bundle) {
        return g(new C5639B(f(), i10, bundle));
    }

    public final synchronized int f() {
        int i10;
        i10 = this.f43745d;
        this.f43745d = i10 + 1;
        return i10;
    }

    public final synchronized Task g(AbstractC5670z abstractC5670z) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(abstractC5670z.toString()));
            }
            if (!this.f43744c.g(abstractC5670z)) {
                ServiceConnectionC5667w serviceConnectionC5667w = new ServiceConnectionC5667w(this, null);
                this.f43744c = serviceConnectionC5667w;
                serviceConnectionC5667w.g(abstractC5670z);
            }
        } catch (Throwable th) {
            throw th;
        }
        return abstractC5670z.f43801b.a();
    }
}
