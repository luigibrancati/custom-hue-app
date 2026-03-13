package la;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;

/* JADX INFO: renamed from: la.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C4977i extends C4979k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BluetoothGattCharacteristic f39997d;

    public C4977i(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10, C4980l c4980l) {
        super(bluetoothGatt, i10, c4980l);
        this.f39997d = bluetoothGattCharacteristic;
    }
}
