package La;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class r implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f8669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f8670d;

    public r(String str, int i10) {
        this.f8667a = str;
        this.f8668b = i10;
    }

    @Override // La.n
    public void c() {
        HandlerThread handlerThread = this.f8669c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f8669c = null;
            this.f8670d = null;
        }
    }

    @Override // La.n
    public void d(k kVar) {
        this.f8670d.post(kVar.f8647b);
    }

    @Override // La.n
    public void start() {
        HandlerThread handlerThread = new HandlerThread(this.f8667a, this.f8668b);
        this.f8669c = handlerThread;
        handlerThread.start();
        this.f8670d = new Handler(this.f8669c.getLooper());
    }
}
