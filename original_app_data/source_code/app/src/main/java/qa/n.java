package qa;

import android.bluetooth.BluetoothGatt;
import la.C4980l;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class n extends ma.s {
    public n(j0 j0Var, BluetoothGatt bluetoothGatt, x xVar) {
        super(bluetoothGatt, j0Var, C4980l.f40011k, xVar);
    }

    @Override // ma.s
    public Eb.r p(j0 j0Var) {
        return j0Var.h().L();
    }

    @Override // ma.s
    public boolean q(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.readRemoteRssi();
    }

    @Override // ma.s
    public String toString() {
        return "ReadRssiOperation{" + super.toString() + '}';
    }
}
