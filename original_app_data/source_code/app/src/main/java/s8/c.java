package s8;

import android.os.Bundle;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import r8.g;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class c implements InterfaceC5811b, InterfaceC5810a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f44319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f44321c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CountDownLatch f44323e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f44322d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44324f = false;

    public c(e eVar, int i10, TimeUnit timeUnit) {
        this.f44319a = eVar;
        this.f44320b = i10;
        this.f44321c = timeUnit;
    }

    @Override // s8.InterfaceC5810a
    public void a(String str, Bundle bundle) {
        synchronized (this.f44322d) {
            try {
                g.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f44323e = new CountDownLatch(1);
                this.f44324f = false;
                this.f44319a.a(str, bundle);
                g.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f44323e.await(this.f44320b, this.f44321c)) {
                        this.f44324f = true;
                        g.f().i("App exception callback received from Analytics listener.");
                    } else {
                        g.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f44323e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // s8.InterfaceC5811b
    public void onEvent(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f44323e;
        if (countDownLatch != null && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str)) {
            countDownLatch.countDown();
        }
    }
}
