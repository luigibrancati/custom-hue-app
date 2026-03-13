package X6;

import android.os.RemoteException;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.z5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2545z5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f19348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U5 f19349b;

    public RunnableC2545z5(U5 u52, c7 c7Var) {
        this.f19348a = c7Var;
        Objects.requireNonNull(u52);
        this.f19349b = u52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U5 u52 = this.f19349b;
        InterfaceC2407i2 interfaceC2407i2N = u52.N();
        if (interfaceC2407i2N == null) {
            u52.f18400a.a().o().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            c7 c7Var = this.f19348a;
            AbstractC6056k.l(c7Var);
            interfaceC2407i2N.W5(c7Var);
            u52.J();
        } catch (RemoteException e10) {
            this.f19349b.f18400a.a().o().b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
