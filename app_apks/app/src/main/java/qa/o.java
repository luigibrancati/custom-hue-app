package qa;

import android.bluetooth.BluetoothGatt;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f43387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f43388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f43389c;

    public o(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        this.f43387a = aVar;
        this.f43388b = aVar2;
        this.f43389c = aVar3;
    }

    public static o a(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        return new o(aVar, aVar2, aVar3);
    }

    public static n c(j0 j0Var, BluetoothGatt bluetoothGatt, x xVar) {
        return new n(j0Var, bluetoothGatt, xVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c((j0) this.f43387a.get(), (BluetoothGatt) this.f43388b.get(), (x) this.f43389c.get());
    }
}
