package K1;

import G1.AbstractC0853a;
import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Looper f7012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f7013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7014d;

    public b1() {
        this(null);
    }

    public Looper a() {
        Looper looper;
        synchronized (this.f7011a) {
            try {
                if (this.f7012b == null) {
                    AbstractC0853a.g(this.f7014d == 0 && this.f7013c == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f7013c = handlerThread;
                    handlerThread.start();
                    this.f7012b = this.f7013c.getLooper();
                }
                this.f7014d++;
                looper = this.f7012b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public void b() {
        HandlerThread handlerThread;
        synchronized (this.f7011a) {
            try {
                AbstractC0853a.g(this.f7014d > 0);
                int i10 = this.f7014d - 1;
                this.f7014d = i10;
                if (i10 == 0 && (handlerThread = this.f7013c) != null) {
                    handlerThread.quit();
                    this.f7013c = null;
                    this.f7012b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b1(Looper looper) {
        this.f7011a = new Object();
        this.f7012b = looper;
        this.f7013c = null;
        this.f7014d = 0;
    }
}
