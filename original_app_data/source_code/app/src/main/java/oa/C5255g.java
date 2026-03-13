package oa;

import android.bluetooth.BluetoothGatt;

/* JADX INFO: renamed from: oa.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5255g implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f41399a;

    public C5255g(X3.a aVar) {
        this.f41399a = aVar;
    }

    public static C5255g a(X3.a aVar) {
        return new C5255g(aVar);
    }

    public static BluetoothGatt c(C5249a c5249a) {
        return (BluetoothGatt) W3.e.d(AbstractC5252d.c(c5249a));
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BluetoothGatt get() {
        return c((C5249a) this.f41399a.get());
    }
}
