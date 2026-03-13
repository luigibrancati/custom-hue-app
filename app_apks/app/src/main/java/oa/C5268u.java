package oa;

import android.bluetooth.BluetoothGattDescriptor;

/* JADX INFO: renamed from: oa.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5268u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa.d f41488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qa.k f41489b;

    public C5268u(sa.d dVar, qa.k kVar) {
        this.f41488a = dVar;
        this.f41489b = kVar;
    }

    public Eb.a a(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        return this.f41488a.a(this.f41489b.e(bluetoothGattDescriptor, bArr)).W();
    }
}
