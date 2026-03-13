package ta;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.content.Context;

/* JADX INFO: renamed from: ta.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5864b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44846a;

    public C5864b(Context context) {
        this.f44846a = context;
    }

    public BluetoothGatt a(BluetoothDevice bluetoothDevice, boolean z10, BluetoothGattCallback bluetoothGattCallback) {
        if (bluetoothDevice == null) {
            return null;
        }
        return b(bluetoothGattCallback, bluetoothDevice, z10);
    }

    public final BluetoothGatt b(BluetoothGattCallback bluetoothGattCallback, BluetoothDevice bluetoothDevice, boolean z10) {
        ma.q.p("Connecting without reflection", new Object[0]);
        return bluetoothDevice.connectGatt(this.f44846a, z10, bluetoothGattCallback, 2);
    }
}
