package la;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattDescriptor;

/* JADX INFO: renamed from: la.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C4978j extends C4979k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BluetoothGattDescriptor f39998d;

    public C4978j(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10, C4980l c4980l) {
        super(bluetoothGatt, i10, c4980l);
        this.f39998d = bluetoothGattDescriptor;
    }
}
