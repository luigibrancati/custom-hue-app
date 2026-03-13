package La;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f8652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f8653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f8654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f8655f;

    public m(String str, int i10) {
        this.f8650a = str;
        this.f8651b = i10;
    }

    public boolean b() {
        k kVar = this.f8655f;
        return kVar != null && kVar.b();
    }

    public Integer d() {
        k kVar = this.f8655f;
        if (kVar != null) {
            return kVar.a();
        }
        return null;
    }

    public void e(final k kVar) {
        this.f8653d.post(new Runnable() { // from class: La.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f8648a.c(kVar);
            }
        });
    }

    public synchronized void f() {
        HandlerThread handlerThread = this.f8652c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f8652c = null;
            this.f8653d = null;
        }
    }

    public synchronized void g(Runnable runnable) {
        HandlerThread handlerThread = new HandlerThread(this.f8650a, this.f8651b);
        this.f8652c = handlerThread;
        handlerThread.start();
        this.f8653d = new Handler(this.f8652c.getLooper());
        this.f8654e = runnable;
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(k kVar) {
        kVar.f8647b.run();
        this.f8655f = kVar;
        this.f8654e.run();
    }
}
