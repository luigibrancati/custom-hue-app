package X6;

import android.os.RemoteException;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f18154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U5 f18155b;

    public A5(U5 u52, c7 c7Var) {
        this.f18154a = c7Var;
        Objects.requireNonNull(u52);
        this.f18155b = u52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U5 u52 = this.f18155b;
        InterfaceC2407i2 interfaceC2407i2N = u52.N();
        if (interfaceC2407i2N == null) {
            u52.f18400a.a().o().a("Failed to send consent settings to service");
            return;
        }
        try {
            c7 c7Var = this.f18154a;
            AbstractC6056k.l(c7Var);
            interfaceC2407i2N.N0(c7Var);
            u52.J();
        } catch (RemoteException e10) {
            this.f18155b.f18400a.a().o().b("Failed to send consent settings to the service", e10);
        }
    }
}
