package qa;

import android.bluetooth.BluetoothGatt;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import ka.Q;
import la.C4975g;
import la.C4980l;
import oa.j0;
import pa.C5452c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class w extends ma.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BluetoothGatt f43409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5452c f43410f;

    public w(j0 j0Var, BluetoothGatt bluetoothGatt, C5452c c5452c, x xVar) {
        super(bluetoothGatt, j0Var, C4980l.f40003c, xVar);
        this.f43409e = bluetoothGatt;
        this.f43410f = c5452c;
    }

    public static /* synthetic */ Eb.v w(final BluetoothGatt bluetoothGatt, Eb.q qVar) {
        return bluetoothGatt.getServices().size() == 0 ? Eb.r.n(new C4975g(bluetoothGatt, C4980l.f40003c)) : Eb.r.H(5L, TimeUnit.SECONDS, qVar).q(new Jb.e() { // from class: qa.u
            @Override // Jb.e
            public final Object apply(Object obj) {
                return Eb.r.s(new Callable() { // from class: qa.v
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return w.x(bluetoothGatt);
                    }
                });
            }
        });
    }

    public static /* synthetic */ Q x(BluetoothGatt bluetoothGatt) {
        return new Q(bluetoothGatt.getServices());
    }

    @Override // ma.s
    public Eb.r p(j0 j0Var) {
        return j0Var.i().L().m(new Jb.d() { // from class: qa.s
            @Override // Jb.d
            public final void accept(Object obj) {
                w wVar = this.f43404a;
                wVar.f43410f.m((Q) obj, wVar.f43409e.getDevice());
            }
        });
    }

    @Override // ma.s
    public boolean q(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.discoverServices();
    }

    @Override // ma.s
    public Eb.r s(final BluetoothGatt bluetoothGatt, j0 j0Var, final Eb.q qVar) {
        return Eb.r.h(new Callable() { // from class: qa.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return w.w(bluetoothGatt, qVar);
            }
        });
    }

    @Override // ma.s
    public String toString() {
        return "ServiceDiscoveryOperation{" + super.toString() + '}';
    }
}
