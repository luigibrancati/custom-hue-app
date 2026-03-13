package qa;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import la.C4980l;
import oa.j0;
import pa.AbstractC5451b;
import ta.AbstractC5868f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class b extends ma.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BluetoothGattCharacteristic f43328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f43329f;

    public b(j0 j0Var, BluetoothGatt bluetoothGatt, x xVar, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        super(bluetoothGatt, j0Var, C4980l.f40005e, xVar);
        this.f43328e = bluetoothGattCharacteristic;
        this.f43329f = bArr;
    }

    @Override // ma.s
    public Eb.r p(j0 j0Var) {
        return j0Var.d().I(AbstractC5868f.a(this.f43328e.getUuid())).L().u(AbstractC5868f.c());
    }

    @Override // ma.s
    public boolean q(BluetoothGatt bluetoothGatt) {
        this.f43328e.setValue(this.f43329f);
        return bluetoothGatt.writeCharacteristic(this.f43328e);
    }

    @Override // ma.s
    public String toString() {
        return "CharacteristicWriteOperation{" + super.toString() + ", characteristic=" + new AbstractC5451b.a(this.f43328e.getUuid(), this.f43329f, true) + '}';
    }
}
