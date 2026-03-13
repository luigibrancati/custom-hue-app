package ma;

import android.bluetooth.BluetoothDevice;
import ea.C3974b;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import ka.N;
import ka.P;
import ka.z;
import la.C4970b;
import oa.InterfaceC5262n;
import pa.AbstractC5451b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class m implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BluetoothDevice f40248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5262n f40249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3974b f40250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ta.j f40251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f40252e = new AtomicBoolean(false);

    public m(BluetoothDevice bluetoothDevice, InterfaceC5262n interfaceC5262n, C3974b c3974b, ta.j jVar) {
        this.f40248a = bluetoothDevice;
        this.f40249b = interfaceC5262n;
        this.f40250c = c3974b;
        this.f40251d = jVar;
    }

    public static /* synthetic */ Eb.n f(final m mVar, z zVar) {
        return mVar.f40252e.compareAndSet(false, true) ? mVar.f40249b.a(zVar).v(new Jb.a() { // from class: ma.l
            @Override // Jb.a
            public final void run() {
                this.f40247a.f40252e.set(false);
            }
        }) : Eb.k.G(new C4970b(mVar.f40248a.getAddress()));
    }

    @Override // ka.P
    public Eb.k a(boolean z10) {
        return g(new z.a().b(z10).c(true).a());
    }

    @Override // ka.P
    public BluetoothDevice b() {
        return this.f40248a;
    }

    @Override // ka.P
    public String c() {
        return this.f40248a.getAddress();
    }

    @Override // ka.P
    public Eb.k d() {
        return this.f40250c.t().q0(1L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return this.f40248a.equals(((m) obj).f40248a);
        }
        return false;
    }

    public Eb.k g(final z zVar) {
        return Eb.k.o(new Callable() { // from class: ma.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m.f(this.f40245a, zVar);
            }
        });
    }

    @Override // ka.P
    public N.a getConnectionState() {
        return (N.a) this.f40250c.T0();
    }

    @Override // ka.P
    public String getName() {
        return h(false);
    }

    public final String h(boolean z10) {
        return (!z10 || this.f40251d.a()) ? this.f40248a.getName() : "[NO BLUETOOTH_CONNECT PERMISSION]";
    }

    public int hashCode() {
        return this.f40248a.hashCode();
    }

    public String toString() {
        return "RxBleDeviceImpl{" + AbstractC5451b.d(this.f40248a.getAddress()) + ", name=" + h(true) + '}';
    }
}
