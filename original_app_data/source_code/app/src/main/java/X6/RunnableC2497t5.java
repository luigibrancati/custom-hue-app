package X6;

import android.os.RemoteException;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.t5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2497t5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f19231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U5 f19232b;

    public RunnableC2497t5(U5 u52, c7 c7Var) {
        this.f19231a = c7Var;
        Objects.requireNonNull(u52);
        this.f19232b = u52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U5 u52 = this.f19232b;
        InterfaceC2407i2 interfaceC2407i2N = u52.N();
        if (interfaceC2407i2N == null) {
            u52.f18400a.a().r().a("Failed to send app backgrounded");
            return;
        }
        try {
            c7 c7Var = this.f19231a;
            AbstractC6056k.l(c7Var);
            interfaceC2407i2N.E3(c7Var);
            u52.J();
        } catch (RemoteException e10) {
            this.f19232b.f18400a.a().o().b("Failed to send app backgrounded to the service", e10);
        }
    }
}
