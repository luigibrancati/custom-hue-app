package oa;

import android.bluetooth.BluetoothGatt;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f41473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f41474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f41475c;

    public m0(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        this.f41473a = aVar;
        this.f41474b = aVar2;
        this.f41475c = aVar3;
    }

    public static m0 a(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        return new m0(aVar, aVar2, aVar3);
    }

    public static l0 c(sa.d dVar, BluetoothGatt bluetoothGatt, qa.k kVar) {
        return new l0(dVar, bluetoothGatt, kVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l0 get() {
        return c((sa.d) this.f41473a.get(), (BluetoothGatt) this.f41474b.get(), (qa.k) this.f41475c.get());
    }
}
