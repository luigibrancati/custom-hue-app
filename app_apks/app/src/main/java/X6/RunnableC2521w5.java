package X6;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.w5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2521w5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f19287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G f19289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f19290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U5 f19291e;

    public RunnableC2521w5(U5 u52, boolean z10, c7 c7Var, boolean z11, G g10, Bundle bundle) {
        this.f19287a = c7Var;
        this.f19288b = z11;
        this.f19289c = g10;
        this.f19290d = bundle;
        Objects.requireNonNull(u52);
        this.f19291e = u52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U5 u52 = this.f19291e;
        InterfaceC2407i2 interfaceC2407i2N = u52.N();
        if (interfaceC2407i2N == null) {
            u52.f18400a.a().o().a("Failed to send default event parameters to service");
            return;
        }
        if (u52.f18400a.w().H(null, AbstractC2383f2.f18877c1)) {
            c7 c7Var = this.f19287a;
            AbstractC6056k.l(c7Var);
            this.f19291e.b0(interfaceC2407i2N, this.f19288b ? null : this.f19289c, c7Var);
            return;
        }
        try {
            c7 c7Var2 = this.f19287a;
            AbstractC6056k.l(c7Var2);
            interfaceC2407i2N.k0(this.f19290d, c7Var2);
            u52.J();
        } catch (RemoteException e10) {
            this.f19291e.f18400a.a().o().b("Failed to send default event parameters to service", e10);
        }
    }
}
