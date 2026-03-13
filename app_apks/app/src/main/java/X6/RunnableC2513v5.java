package X6;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: renamed from: X6.v5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2513v5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2362c5 f19259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U5 f19260b;

    public RunnableC2513v5(U5 u52, C2362c5 c2362c5) {
        this.f19259a = c2362c5;
        Objects.requireNonNull(u52);
        this.f19260b = u52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U5 u52 = this.f19260b;
        InterfaceC2407i2 interfaceC2407i2N = u52.N();
        if (interfaceC2407i2N == null) {
            u52.f18400a.a().o().a("Failed to send current screen to service");
            return;
        }
        try {
            C2362c5 c2362c5 = this.f19259a;
            if (c2362c5 == null) {
                interfaceC2407i2N.n4(0L, null, null, u52.f18400a.d().getPackageName());
            } else {
                interfaceC2407i2N.n4(c2362c5.f18733c, c2362c5.f18731a, c2362c5.f18732b, u52.f18400a.d().getPackageName());
            }
            u52.J();
        } catch (RemoteException e10) {
            this.f19260b.f18400a.a().o().b("Failed to send current screen to the service", e10);
        }
    }
}
