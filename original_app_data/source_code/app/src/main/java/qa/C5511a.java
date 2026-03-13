package qa;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import la.C4980l;
import oa.j0;
import pa.AbstractC5451b;
import ta.AbstractC5868f;

/* JADX INFO: renamed from: qa.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5511a extends ma.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BluetoothGattCharacteristic f43327e;

    public C5511a(j0 j0Var, BluetoothGatt bluetoothGatt, x xVar, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(bluetoothGatt, j0Var, C4980l.f40004d, xVar);
        this.f43327e = bluetoothGattCharacteristic;
    }

    @Override // ma.s
    public Eb.r p(j0 j0Var) {
        return j0Var.c().I(AbstractC5868f.a(this.f43327e.getUuid())).L().u(AbstractC5868f.c());
    }

    @Override // ma.s
    public boolean q(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.readCharacteristic(this.f43327e);
    }

    @Override // ma.s
    public String toString() {
        return "CharacteristicReadOperation{" + super.toString() + ", characteristic=" + AbstractC5451b.t(this.f43327e, false) + '}';
    }
}
