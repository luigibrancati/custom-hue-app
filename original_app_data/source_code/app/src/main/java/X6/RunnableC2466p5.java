package X6;

import android.os.RemoteException;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.p5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2466p5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f19157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U5 f19158b;

    public RunnableC2466p5(U5 u52, c7 c7Var) {
        this.f19157a = c7Var;
        Objects.requireNonNull(u52);
        this.f19158b = u52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U5 u52 = this.f19158b;
        InterfaceC2407i2 interfaceC2407i2N = u52.N();
        if (interfaceC2407i2N == null) {
            u52.f18400a.a().o().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            c7 c7Var = this.f19157a;
            AbstractC6056k.l(c7Var);
            interfaceC2407i2N.B3(c7Var);
        } catch (RemoteException e10) {
            this.f19158b.f18400a.a().o().b("Failed to reset data on the service: remote exception", e10);
        }
        this.f19158b.J();
    }
}
