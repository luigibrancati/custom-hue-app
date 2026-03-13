package ra;

import android.bluetooth.BluetoothDevice;
import ua.EnumC6011b;
import ua.EnumC6012c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class o implements ma.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BluetoothDevice f43886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ua.e f43889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumC6012c f43890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EnumC6011b f43891f;

    public o(BluetoothDevice bluetoothDevice, int i10, long j10, ua.e eVar, EnumC6012c enumC6012c, EnumC6011b enumC6011b) {
        this.f43886a = bluetoothDevice;
        this.f43887b = i10;
        this.f43888c = j10;
        this.f43889d = eVar;
        this.f43890e = enumC6012c;
        this.f43891f = enumC6011b;
    }

    @Override // ma.r
    public String a() {
        BluetoothDevice bluetoothDeviceC = c();
        if (bluetoothDeviceC == null) {
            return null;
        }
        return bluetoothDeviceC.getName();
    }

    @Override // ma.r
    public ua.e b() {
        return this.f43889d;
    }

    public BluetoothDevice c() {
        return this.f43886a;
    }

    public int d() {
        return this.f43887b;
    }

    public EnumC6012c e() {
        return this.f43890e;
    }

    public long f() {
        return this.f43888c;
    }

    public EnumC6011b g() {
        return this.f43891f;
    }

    @Override // ma.r
    public String getAddress() {
        return this.f43886a.getAddress();
    }
}
