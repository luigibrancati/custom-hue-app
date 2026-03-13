package qa;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface k {
    i a(int i10);

    C5511a b(BluetoothGattCharacteristic bluetoothGattCharacteristic);

    n c();

    e d(int i10, long j10, TimeUnit timeUnit);

    f e(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr);

    w f(long j10, TimeUnit timeUnit);

    b g(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr);
}
