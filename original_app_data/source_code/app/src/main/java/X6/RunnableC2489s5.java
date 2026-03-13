package X6;

import android.os.RemoteException;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.s5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2489s5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f19217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U5 f19218b;

    public RunnableC2489s5(U5 u52, c7 c7Var, boolean z10) {
        this.f19217a = c7Var;
        Objects.requireNonNull(u52);
        this.f19218b = u52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U5 u52 = this.f19218b;
        InterfaceC2407i2 interfaceC2407i2N = u52.N();
        if (interfaceC2407i2N == null) {
            u52.f18400a.a().o().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            c7 c7Var = this.f19217a;
            AbstractC6056k.l(c7Var);
            C2416j3 c2416j3 = u52.f18400a;
            C2436m c2436mW = c2416j3.w();
            C2375e2 c2375e2 = AbstractC2383f2.f18877c1;
            if (c2436mW.H(null, c2375e2)) {
                u52.b0(interfaceC2407i2N, null, c7Var);
            }
            interfaceC2407i2N.b2(c7Var);
            u52.f18400a.E().v();
            c2416j3.w().H(null, c2375e2);
            u52.b0(interfaceC2407i2N, null, c7Var);
            u52.J();
        } catch (RemoteException e10) {
            this.f19218b.f18400a.a().o().b("Failed to send app launch to the service", e10);
        }
    }
}
