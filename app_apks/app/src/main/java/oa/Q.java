package oa;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import ka.InterfaceC4816B;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothGattCallback f41353a;

    public void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattCallback bluetoothGattCallback = this.f41353a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
        }
    }

    public void b(BluetoothGatt bluetoothGatt, int i10, int i11) {
        BluetoothGattCallback bluetoothGattCallback = this.f41353a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onConnectionStateChange(bluetoothGatt, i10, i11);
        }
    }

    public void c(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
        BluetoothGattCallback bluetoothGattCallback = this.f41353a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i10);
        }
    }

    public void d(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
        BluetoothGattCallback bluetoothGattCallback = this.f41353a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i10);
        }
    }

    public void e(BluetoothGatt bluetoothGatt, int i10, int i11) {
        BluetoothGattCallback bluetoothGattCallback = this.f41353a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onMtuChanged(bluetoothGatt, i10, i11);
        }
    }

    public void g(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        BluetoothGattCallback bluetoothGattCallback = this.f41353a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i10);
        }
    }

    public void h(BluetoothGatt bluetoothGatt, int i10, int i11) {
        BluetoothGattCallback bluetoothGattCallback = this.f41353a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onReadRemoteRssi(bluetoothGatt, i10, i11);
        }
    }

    public void i(BluetoothGatt bluetoothGatt, int i10) {
        BluetoothGattCallback bluetoothGattCallback = this.f41353a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onReliableWriteCompleted(bluetoothGatt, i10);
        }
    }

    public void j(BluetoothGatt bluetoothGatt, int i10) {
        BluetoothGattCallback bluetoothGattCallback = this.f41353a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onServicesDiscovered(bluetoothGatt, i10);
        }
    }

    public void k(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        BluetoothGattCallback bluetoothGattCallback = this.f41353a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i10);
        }
    }

    public void l(BluetoothGattCallback bluetoothGattCallback) {
        this.f41353a = bluetoothGattCallback;
    }

    public void m(InterfaceC4816B interfaceC4816B) {
    }

    public void f(BluetoothGatt bluetoothGatt, int i10, int i11, int i12, int i13) {
    }
}
