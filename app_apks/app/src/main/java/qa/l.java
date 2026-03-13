package qa;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.concurrent.TimeUnit;
import oa.j0;
import pa.C5452c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f43373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BluetoothGatt f43374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5452c f43375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f43376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Eb.q f43377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Eb.q f43378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final X3.a f43379g;

    public l(j0 j0Var, BluetoothGatt bluetoothGatt, C5452c c5452c, x xVar, Eb.q qVar, Eb.q qVar2, X3.a aVar) {
        this.f43373a = j0Var;
        this.f43374b = bluetoothGatt;
        this.f43375c = c5452c;
        this.f43376d = xVar;
        this.f43377e = qVar;
        this.f43378f = qVar2;
        this.f43379g = aVar;
    }

    @Override // qa.k
    public i a(int i10) {
        return new i(this.f43373a, this.f43374b, this.f43376d, i10);
    }

    @Override // qa.k
    public C5511a b(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return new C5511a(this.f43373a, this.f43374b, this.f43376d, bluetoothGattCharacteristic);
    }

    @Override // qa.k
    public n c() {
        return (n) this.f43379g.get();
    }

    @Override // qa.k
    public e d(int i10, long j10, TimeUnit timeUnit) {
        return new e(this.f43373a, this.f43374b, this.f43376d, i10, new x(j10, timeUnit, this.f43378f));
    }

    @Override // qa.k
    public f e(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        return new f(this.f43373a, this.f43374b, this.f43376d, 2, bluetoothGattDescriptor, bArr);
    }

    @Override // qa.k
    public w f(long j10, TimeUnit timeUnit) {
        return new w(this.f43373a, this.f43374b, this.f43375c, new x(j10, timeUnit, this.f43378f));
    }

    @Override // qa.k
    public b g(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return new b(this.f43373a, this.f43374b, this.f43376d, bluetoothGattCharacteristic, bArr);
    }
}
