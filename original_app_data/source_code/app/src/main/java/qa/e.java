package qa;

import android.bluetooth.BluetoothGatt;
import la.C4980l;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class e extends ma.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f43345f;

    public e(j0 j0Var, BluetoothGatt bluetoothGatt, x xVar, int i10, x xVar2) {
        super(bluetoothGatt, j0Var, C4980l.f40013m, xVar);
        this.f43344e = i10;
        this.f43345f = xVar2;
    }

    public static String u(int i10) {
        return i10 != 0 ? i10 != 2 ? "CONNECTION_PRIORITY_HIGH" : "CONNECTION_PRIORITY_LOW_POWER" : "CONNECTION_PRIORITY_BALANCED";
    }

    @Override // ma.s
    public Eb.r p(j0 j0Var) {
        x xVar = this.f43345f;
        return Eb.r.H(xVar.f43411a, xVar.f43412b, xVar.f43413c);
    }

    @Override // ma.s
    public boolean q(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.requestConnectionPriority(this.f43344e);
    }

    @Override // ma.s
    public String toString() {
        return "ConnectionPriorityChangeOperation{" + super.toString() + ", connectionPriority=" + u(this.f43344e) + ", successTimeout=" + this.f43345f + '}';
    }
}
