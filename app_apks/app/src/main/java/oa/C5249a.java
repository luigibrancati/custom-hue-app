package oa;

import android.bluetooth.BluetoothGatt;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: oa.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5249a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f41371a = new AtomicReference();

    public BluetoothGatt a() {
        return (BluetoothGatt) this.f41371a.get();
    }

    public void b(BluetoothGatt bluetoothGatt) {
        T1.e.a(this.f41371a, null, bluetoothGatt);
    }
}
