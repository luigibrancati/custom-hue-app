package X6;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC3304s0;
import java.util.ArrayList;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class E5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c7 f18245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3304s0 f18246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U5 f18247e;

    public E5(U5 u52, String str, String str2, c7 c7Var, InterfaceC3304s0 interfaceC3304s0) {
        this.f18243a = str;
        this.f18244b = str2;
        this.f18245c = c7Var;
        this.f18246d = interfaceC3304s0;
        Objects.requireNonNull(u52);
        this.f18247e = u52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3304s0 interfaceC3304s0;
        a7 a7VarC;
        U5 u52;
        InterfaceC2407i2 interfaceC2407i2N;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                u52 = this.f18247e;
                interfaceC2407i2N = u52.N();
            } catch (RemoteException e10) {
                this.f18247e.f18400a.a().o().d("Failed to get conditional properties; remote exception", this.f18243a, this.f18244b, e10);
            }
            if (interfaceC2407i2N == null) {
                C2416j3 c2416j3 = u52.f18400a;
                c2416j3.a().o().c("Failed to get conditional properties; not connected to service", this.f18243a, this.f18244b);
                a7VarC = c2416j3.C();
                interfaceC3304s0 = this.f18246d;
                a7VarC.g0(interfaceC3304s0, arrayList);
            }
            c7 c7Var = this.f18245c;
            AbstractC6056k.l(c7Var);
            arrayList = a7.h0(interfaceC2407i2N.u4(this.f18243a, this.f18244b, c7Var));
            u52.J();
            U5 u53 = this.f18247e;
            interfaceC3304s0 = this.f18246d;
            a7VarC = u53.f18400a.C();
            a7VarC.g0(interfaceC3304s0, arrayList);
        } catch (Throwable th) {
            U5 u54 = this.f18247e;
            u54.f18400a.C().g0(this.f18246d, arrayList);
            throw th;
        }
    }
}
