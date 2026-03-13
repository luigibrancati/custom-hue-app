package qa;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import la.C4980l;
import oa.j0;
import pa.AbstractC5451b;
import ta.AbstractC5868f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class f extends ma.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BluetoothGattDescriptor f43346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f43347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f43348g;

    public f(j0 j0Var, BluetoothGatt bluetoothGatt, x xVar, int i10, BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        super(bluetoothGatt, j0Var, C4980l.f40009i, xVar);
        this.f43348g = i10;
        this.f43346e = bluetoothGattDescriptor;
        this.f43347f = bArr;
    }

    @Override // ma.s
    public Eb.r p(j0 j0Var) {
        return j0Var.f().I(AbstractC5868f.b(this.f43346e)).L().u(AbstractC5868f.c());
    }

    @Override // ma.s
    public boolean q(BluetoothGatt bluetoothGatt) {
        this.f43346e.setValue(this.f43347f);
        BluetoothGattCharacteristic characteristic = this.f43346e.getCharacteristic();
        int writeType = characteristic.getWriteType();
        characteristic.setWriteType(this.f43348g);
        boolean zWriteDescriptor = bluetoothGatt.writeDescriptor(this.f43346e);
        characteristic.setWriteType(writeType);
        return zWriteDescriptor;
    }

    @Override // ma.s
    public String toString() {
        return "DescriptorWriteOperation{" + super.toString() + ", descriptor=" + new AbstractC5451b.a(this.f43346e.getUuid(), this.f43347f, true) + '}';
    }
}
