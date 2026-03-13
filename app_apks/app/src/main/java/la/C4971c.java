package la;

import android.bluetooth.BluetoothGattCharacteristic;

/* JADX INFO: renamed from: la.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C4971c extends C4974f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BluetoothGattCharacteristic f39991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39992b;

    public C4971c(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10, Throwable th) {
        super(a(bluetoothGattCharacteristic, i10), th);
        this.f39991a = bluetoothGattCharacteristic;
        this.f39992b = i10;
    }

    public static String a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        return b(i10) + " (code " + i10 + ") with characteristic UUID " + bluetoothGattCharacteristic.getUuid();
    }

    public static String b(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Unknown error" : "Cannot write client characteristic config descriptor" : "Cannot find client characteristic config descriptor" : "Cannot set local notification";
    }
}
