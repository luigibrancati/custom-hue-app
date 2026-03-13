package ta;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import java.util.List;
import la.C4974f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C4974f f44839b = new C4974f("bluetoothAdapter is null");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BluetoothAdapter f44840a;

    public F(BluetoothAdapter bluetoothAdapter) {
        this.f44840a = bluetoothAdapter;
    }

    public BluetoothDevice a(String str) {
        BluetoothAdapter bluetoothAdapter = this.f44840a;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.getRemoteDevice(str);
        }
        throw f44839b;
    }

    public boolean b() {
        return this.f44840a != null;
    }

    public boolean c() {
        BluetoothAdapter bluetoothAdapter = this.f44840a;
        return bluetoothAdapter != null && bluetoothAdapter.isEnabled();
    }

    public void d(List list, ScanSettings scanSettings, ScanCallback scanCallback) {
        BluetoothAdapter bluetoothAdapter = this.f44840a;
        if (bluetoothAdapter == null) {
            throw f44839b;
        }
        bluetoothAdapter.getBluetoothLeScanner().startScan((List<ScanFilter>) list, scanSettings, scanCallback);
    }

    public boolean e(BluetoothAdapter.LeScanCallback leScanCallback) {
        BluetoothAdapter bluetoothAdapter = this.f44840a;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.startLeScan(leScanCallback);
        }
        throw f44839b;
    }

    public void f(ScanCallback scanCallback) {
        BluetoothAdapter bluetoothAdapter = this.f44840a;
        if (bluetoothAdapter == null) {
            throw f44839b;
        }
        if (!bluetoothAdapter.isEnabled()) {
            ma.q.p("BluetoothAdapter is disabled, calling BluetoothLeScanner.stopScan(ScanCallback) may cause IllegalStateException", new Object[0]);
            return;
        }
        BluetoothLeScanner bluetoothLeScanner = this.f44840a.getBluetoothLeScanner();
        if (bluetoothLeScanner == null) {
            ma.q.q("Cannot call BluetoothLeScanner.stopScan(ScanCallback) on 'null' reference; BluetoothAdapter.isEnabled() == %b", Boolean.valueOf(this.f44840a.isEnabled()));
        } else {
            bluetoothLeScanner.stopScan(scanCallback);
        }
    }

    public void g(BluetoothAdapter.LeScanCallback leScanCallback) {
        BluetoothAdapter bluetoothAdapter = this.f44840a;
        if (bluetoothAdapter == null) {
            throw f44839b;
        }
        bluetoothAdapter.stopLeScan(leScanCallback);
    }
}
