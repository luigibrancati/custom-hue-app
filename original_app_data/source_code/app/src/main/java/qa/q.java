package qa;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import pa.AbstractC5451b;
import ra.C5689e;
import ra.C5690f;
import ta.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class q extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5690f f43393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5689e f43394c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements BluetoothAdapter.LeScanCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Eb.l f43395a;

        public a(Eb.l lVar) {
            this.f43395a = lVar;
        }

        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public void onLeScan(BluetoothDevice bluetoothDevice, int i10, byte[] bArr) {
            if (!q.this.f43394c.a() && ma.q.l(3) && ma.q.i()) {
                ma.q.b("%s, name=%s, rssi=%d, data=%s", AbstractC5451b.d(bluetoothDevice.getAddress()), bluetoothDevice.getName(), Integer.valueOf(i10), AbstractC5451b.a(bArr));
            }
            ra.o oVarB = q.this.f43393b.b(bluetoothDevice, i10, bArr);
            if (q.this.f43394c.b(oVarB)) {
                this.f43395a.c(oVarB);
            }
        }
    }

    public q(F f10, C5690f c5690f, C5689e c5689e) {
        super(f10);
        this.f43393b = c5690f;
        this.f43394c = c5689e;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ScanOperationApi18{");
        if (this.f43394c.a()) {
            str = "";
        } else {
            str = "ANY_MUST_MATCH -> " + this.f43394c;
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // qa.p
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public BluetoothAdapter.LeScanCallback p(Eb.l lVar) {
        return new a(lVar);
    }

    @Override // qa.p
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public boolean q(F f10, BluetoothAdapter.LeScanCallback leScanCallback) {
        if (this.f43394c.a()) {
            ma.q.b("No library side filtering —> debug logs of scanned devices disabled", new Object[0]);
        }
        return f10.e(leScanCallback);
    }

    @Override // qa.p
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void s(F f10, BluetoothAdapter.LeScanCallback leScanCallback) {
        f10.g(leScanCallback);
    }
}
