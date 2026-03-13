package X6;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC3304s0;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.r5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2481r5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f19189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3304s0 f19190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U5 f19191c;

    public RunnableC2481r5(U5 u52, c7 c7Var, InterfaceC3304s0 interfaceC3304s0) {
        this.f19189a = c7Var;
        this.f19190b = interfaceC3304s0;
        Objects.requireNonNull(u52);
        this.f19191c = u52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3304s0 interfaceC3304s0;
        a7 a7VarC;
        U5 u52;
        C2416j3 c2416j3;
        String strO4 = null;
        try {
            try {
                u52 = this.f19191c;
                c2416j3 = u52.f18400a;
            } catch (RemoteException e10) {
                this.f19191c.f18400a.a().o().b("Failed to get app instance id", e10);
            }
            if (c2416j3.x().w().o(R3.ANALYTICS_STORAGE)) {
                InterfaceC2407i2 interfaceC2407i2N = u52.N();
                if (interfaceC2407i2N != null) {
                    c7 c7Var = this.f19189a;
                    AbstractC6056k.l(c7Var);
                    strO4 = interfaceC2407i2N.o4(c7Var);
                    if (strO4 != null) {
                        u52.f18400a.B().E(strO4);
                        c2416j3.x().f18427h.b(strO4);
                    }
                    u52.J();
                    U5 u53 = this.f19191c;
                    interfaceC3304s0 = this.f19190b;
                    a7VarC = u53.f18400a.C();
                    a7VarC.a0(interfaceC3304s0, strO4);
                }
                c2416j3.a().o().a("Failed to get app instance id");
            } else {
                c2416j3.a().t().a("Analytics storage consent denied; will not get app instance id");
                u52.f18400a.B().E(null);
                c2416j3.x().f18427h.b(null);
            }
            a7VarC = c2416j3.C();
            interfaceC3304s0 = this.f19190b;
            a7VarC.a0(interfaceC3304s0, strO4);
        } catch (Throwable th) {
            U5 u54 = this.f19191c;
            u54.f18400a.C().a0(this.f19190b, null);
            throw th;
        }
    }
}
