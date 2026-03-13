package X6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.a;
import java.util.Objects;
import s6.C5783b;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class O5 implements ServiceConnection, a.InterfaceC0356a, a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f18463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile C2494t2 f18464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U5 f18465c;

    public O5(U5 u52) {
        Objects.requireNonNull(u52);
        this.f18465c = u52;
    }

    @Override // com.google.android.gms.common.internal.a.b
    public final void D(C5783b c5783b) {
        U5 u52 = this.f18465c;
        u52.f18400a.b().o();
        C2542z2 c2542z2Y = u52.f18400a.y();
        if (c2542z2Y != null) {
            c2542z2Y.w().b("Service connection failed", c5783b);
        }
        synchronized (this) {
            this.f18463a = false;
            this.f18464b = null;
        }
        this.f18465c.f18400a.b().t(new N5(this, c5783b));
    }

    @Override // com.google.android.gms.common.internal.a.InterfaceC0356a
    public final void K(Bundle bundle) {
        this.f18465c.f18400a.b().o();
        synchronized (this) {
            try {
                AbstractC6056k.l(this.f18464b);
                this.f18465c.f18400a.b().t(new J5(this, (InterfaceC2407i2) this.f18464b.C()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f18464b = null;
                this.f18463a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.a.InterfaceC0356a
    public final void X(int i10) {
        C2416j3 c2416j3 = this.f18465c.f18400a;
        c2416j3.b().o();
        c2416j3.a().v().a("Service connection suspended");
        c2416j3.b().t(new K5(this));
    }

    public final void a(Intent intent) {
        U5 u52 = this.f18465c;
        u52.h();
        Context contextD = u52.f18400a.d();
        A6.a aVarB = A6.a.b();
        synchronized (this) {
            try {
                if (this.f18463a) {
                    this.f18465c.f18400a.a().w().a("Connection attempt already in progress");
                    return;
                }
                U5 u53 = this.f18465c;
                u53.f18400a.a().w().a("Using local app measurement service");
                this.f18463a = true;
                aVarB.a(contextD, intent, u53.M(), 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (this.f18464b != null && (this.f18464b.isConnected() || this.f18464b.b())) {
            this.f18464b.k();
        }
        this.f18464b = null;
    }

    public final void c() {
        U5 u52 = this.f18465c;
        u52.h();
        Context contextD = u52.f18400a.d();
        synchronized (this) {
            try {
                if (this.f18463a) {
                    this.f18465c.f18400a.a().w().a("Connection attempt already in progress");
                    return;
                }
                if (this.f18464b != null && (this.f18464b.b() || this.f18464b.isConnected())) {
                    this.f18465c.f18400a.a().w().a("Already awaiting connection attempt");
                    return;
                }
                this.f18464b = new C2494t2(contextD, Looper.getMainLooper(), this, this);
                this.f18465c.f18400a.a().w().a("Connecting to remote service");
                this.f18463a = true;
                AbstractC6056k.l(this.f18464b);
                this.f18464b.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void d(boolean z10) {
        this.f18463a = false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f18465c.f18400a.b().o();
        synchronized (this) {
            if (iBinder == null) {
                this.f18463a = false;
                this.f18465c.f18400a.a().o().a("Service connected with null binder");
                return;
            }
            InterfaceC2407i2 c2391g2 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c2391g2 = iInterfaceQueryLocalInterface instanceof InterfaceC2407i2 ? (InterfaceC2407i2) iInterfaceQueryLocalInterface : new C2391g2(iBinder);
                    this.f18465c.f18400a.a().w().a("Bound to IMeasurementService interface");
                } else {
                    this.f18465c.f18400a.a().o().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f18465c.f18400a.a().o().a("Service connect failed to get IMeasurementService");
            }
            if (c2391g2 == null) {
                this.f18463a = false;
                try {
                    A6.a aVarB = A6.a.b();
                    U5 u52 = this.f18465c;
                    aVarB.c(u52.f18400a.d(), u52.M());
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f18465c.f18400a.b().t(new G5(this, c2391g2));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2416j3 c2416j3 = this.f18465c.f18400a;
        c2416j3.b().o();
        c2416j3.a().v().a("Service disconnected");
        c2416j3.b().t(new H5(this, componentName));
    }
}
