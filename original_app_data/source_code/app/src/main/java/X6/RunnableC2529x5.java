package X6;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC3304s0;
import java.util.Objects;

/* JADX INFO: renamed from: X6.x5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2529x5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f19309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3304s0 f19311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U5 f19312d;

    public RunnableC2529x5(U5 u52, I i10, String str, InterfaceC3304s0 interfaceC3304s0) {
        this.f19309a = i10;
        this.f19310b = str;
        this.f19311c = interfaceC3304s0;
        Objects.requireNonNull(u52);
        this.f19312d = u52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3304s0 interfaceC3304s0;
        a7 a7VarC;
        U5 u52;
        InterfaceC2407i2 interfaceC2407i2N;
        byte[] bArrE4 = null;
        try {
            try {
                u52 = this.f19312d;
                interfaceC2407i2N = u52.N();
            } catch (RemoteException e10) {
                this.f19312d.f18400a.a().o().b("Failed to send event to the service to bundle", e10);
            }
            if (interfaceC2407i2N == null) {
                C2416j3 c2416j3 = u52.f18400a;
                c2416j3.a().o().a("Discarding data. Failed to send event to service to bundle");
                a7VarC = c2416j3.C();
                interfaceC3304s0 = this.f19311c;
                a7VarC.d0(interfaceC3304s0, bArrE4);
            }
            bArrE4 = interfaceC2407i2N.E4(this.f19309a, this.f19310b);
            u52.J();
            U5 u53 = this.f19312d;
            interfaceC3304s0 = this.f19311c;
            a7VarC = u53.f18400a.C();
            a7VarC.d0(interfaceC3304s0, bArrE4);
        } catch (Throwable th) {
            U5 u54 = this.f19312d;
            u54.f18400a.C().d0(this.f19311c, null);
            throw th;
        }
    }
}
