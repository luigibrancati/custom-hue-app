package qa;

import android.bluetooth.BluetoothGatt;
import la.C4980l;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class i extends ma.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43372e;

    public i(j0 j0Var, BluetoothGatt bluetoothGatt, x xVar, int i10) {
        super(bluetoothGatt, j0Var, C4980l.f40012l, xVar);
        this.f43372e = i10;
    }

    @Override // ma.s
    public Eb.r p(j0 j0Var) {
        return j0Var.g().L();
    }

    @Override // ma.s
    public boolean q(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.requestMtu(this.f43372e);
    }

    @Override // ma.s
    public String toString() {
        return "MtuRequestOperation{" + super.toString() + ", mtu=" + this.f43372e + '}';
    }
}
