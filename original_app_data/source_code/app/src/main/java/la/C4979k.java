package la;

import android.bluetooth.BluetoothGatt;
import pa.AbstractC5451b;
import va.AbstractC6076a;

/* JADX INFO: renamed from: la.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C4979k extends C4974f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BluetoothGatt f39999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4980l f40001c;

    public C4979k(BluetoothGatt bluetoothGatt, int i10, C4980l c4980l) {
        super(a(bluetoothGatt, i10, c4980l));
        this.f39999a = bluetoothGatt;
        this.f40000b = i10;
        this.f40001c = c4980l;
    }

    public static String a(BluetoothGatt bluetoothGatt, int i10, C4980l c4980l) {
        if (i10 == -1) {
            return String.format("GATT exception from MAC address %s, with type %s", c(bluetoothGatt), c4980l);
        }
        return String.format("GATT exception from %s, status %d (%s), type %s. (Look up status 0x%02x here %s)", AbstractC5451b.c(bluetoothGatt), Integer.valueOf(i10), AbstractC6076a.a(i10), c4980l, Integer.valueOf(i10), "https://cs.android.com/android/platform/superproject/+/master:packages/modules/Bluetooth/system/stack/include/gatt_api.h");
    }

    public static String c(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt == null || bluetoothGatt.getDevice() == null) {
            return null;
        }
        return bluetoothGatt.getDevice().getAddress();
    }

    public C4980l b() {
        return this.f40001c;
    }

    public C4979k(BluetoothGatt bluetoothGatt, C4980l c4980l) {
        this(bluetoothGatt, -1, c4980l);
    }
}
