package X6;

import android.os.RemoteException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.q5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2474q5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f19171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c7 f19172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U5 f19173c;

    public RunnableC2474q5(U5 u52, AtomicReference atomicReference, c7 c7Var) {
        this.f19171a = atomicReference;
        this.f19172b = c7Var;
        Objects.requireNonNull(u52);
        this.f19173c = u52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        U5 u52;
        C2416j3 c2416j3;
        AtomicReference atomicReference2 = this.f19171a;
        synchronized (atomicReference2) {
            try {
                try {
                    u52 = this.f19173c;
                    c2416j3 = u52.f18400a;
                } catch (RemoteException e10) {
                    this.f19173c.f18400a.a().o().b("Failed to get app instance id", e10);
                    atomicReference = this.f19171a;
                }
                if (c2416j3.x().w().o(R3.ANALYTICS_STORAGE)) {
                    InterfaceC2407i2 interfaceC2407i2N = u52.N();
                    if (interfaceC2407i2N != null) {
                        c7 c7Var = this.f19172b;
                        AbstractC6056k.l(c7Var);
                        atomicReference2.set(interfaceC2407i2N.o4(c7Var));
                        String str = (String) atomicReference2.get();
                        if (str != null) {
                            u52.f18400a.B().E(str);
                            c2416j3.x().f18427h.b(str);
                        }
                        u52.J();
                        atomicReference = this.f19171a;
                        atomicReference.notify();
                        return;
                    }
                    c2416j3.a().o().a("Failed to get app instance id");
                } else {
                    c2416j3.a().t().a("Analytics storage consent denied; will not get app instance id");
                    u52.f18400a.B().E(null);
                    c2416j3.x().f18427h.b(null);
                    atomicReference2.set(null);
                }
                atomicReference2.notify();
            } catch (Throwable th) {
                this.f19171a.notify();
                throw th;
            }
        }
    }
}
