package ra;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanResult;
import ta.H;
import ua.EnumC6011b;
import ua.EnumC6012c;

/* JADX INFO: renamed from: ra.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5690f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f43878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f43879b;

    public C5690f(H h10, j jVar) {
        this.f43878a = h10;
        this.f43879b = jVar;
    }

    public static EnumC6012c d(int i10) {
        if (i10 == 1) {
            return EnumC6012c.CALLBACK_TYPE_ALL_MATCHES;
        }
        if (i10 == 2) {
            return EnumC6012c.CALLBACK_TYPE_FIRST_MATCH;
        }
        if (i10 == 4) {
            return EnumC6012c.CALLBACK_TYPE_MATCH_LOST;
        }
        ma.q.q("Unknown callback type %d -> check android.bluetooth.le.ScanSettings", Integer.valueOf(i10));
        return EnumC6012c.CALLBACK_TYPE_UNKNOWN;
    }

    public o a(int i10, ScanResult scanResult) {
        return new o(scanResult.getDevice(), scanResult.getRssi(), scanResult.getTimestampNanos(), new w(scanResult.getScanRecord(), this.f43878a), d(i10), this.f43879b.a(scanResult));
    }

    public o b(BluetoothDevice bluetoothDevice, int i10, byte[] bArr) {
        return new o(bluetoothDevice, i10, System.nanoTime(), this.f43878a.b(bArr), EnumC6012c.CALLBACK_TYPE_UNSPECIFIED, EnumC6011b.LEGACY_UNKNOWN);
    }

    public o c(ScanResult scanResult) {
        return new o(scanResult.getDevice(), scanResult.getRssi(), scanResult.getTimestampNanos(), new w(scanResult.getScanRecord(), this.f43878a), EnumC6012c.CALLBACK_TYPE_BATCH, this.f43879b.a(scanResult));
    }
}
