package G1;

/* JADX INFO: renamed from: G1.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C0863k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0860h f4300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4301b;

    public C0863k() {
        this(InterfaceC0860h.f4292a);
    }

    public synchronized void a() {
        while (!this.f4301b) {
            this.f4300a.f();
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f4301b) {
            try {
                this.f4300a.f();
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c(long j10) {
        if (j10 <= 0) {
            return this.f4301b;
        }
        long jC = this.f4300a.c();
        long j11 = j10 + jC;
        if (j11 < jC) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f4301b && jC < j11) {
                try {
                    this.f4300a.f();
                    wait(j11 - jC);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                jC = this.f4300a.c();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f4301b;
    }

    public synchronized boolean d() {
        boolean z10;
        z10 = this.f4301b;
        this.f4301b = false;
        return z10;
    }

    public synchronized boolean e() {
        return this.f4301b;
    }

    public synchronized boolean f() {
        if (this.f4301b) {
            return false;
        }
        this.f4301b = true;
        notifyAll();
        return true;
    }

    public C0863k(InterfaceC0860h interfaceC0860h) {
        this.f4300a = interfaceC0860h;
    }
}
