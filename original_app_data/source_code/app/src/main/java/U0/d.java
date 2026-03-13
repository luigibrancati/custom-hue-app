package U0;

import android.os.CancellationSignal;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f16572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f16573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16574d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void onCancel();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f16571a) {
                    return;
                }
                this.f16571a = true;
                this.f16574d = true;
                a aVar = this.f16572b;
                Object obj = this.f16573c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f16574d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f16574d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public void b(a aVar) {
        synchronized (this) {
            try {
                c();
                if (this.f16572b == aVar) {
                    return;
                }
                this.f16572b = aVar;
                if (this.f16571a && aVar != null) {
                    aVar.onCancel();
                }
            } finally {
            }
        }
    }

    public final void c() {
        while (this.f16574d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
