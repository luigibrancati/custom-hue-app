package oa;

import android.bluetooth.BluetoothGatt;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f41393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f41394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f41395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X3.a f41396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X3.a f41397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X3.a f41398f;

    public f0(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4, X3.a aVar5, X3.a aVar6) {
        this.f41393a = aVar;
        this.f41394b = aVar2;
        this.f41395c = aVar3;
        this.f41396d = aVar4;
        this.f41397e = aVar5;
        this.f41398f = aVar6;
    }

    public static f0 a(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4, X3.a aVar5, X3.a aVar6) {
        return new f0(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static e0 c(byte[] bArr, byte[] bArr2, byte[] bArr3, BluetoothGatt bluetoothGatt, j0 j0Var, Object obj) {
        return new e0(bArr, bArr2, bArr3, bluetoothGatt, j0Var, (C5268u) obj);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e0 get() {
        return c((byte[]) this.f41393a.get(), (byte[]) this.f41394b.get(), (byte[]) this.f41395c.get(), (BluetoothGatt) this.f41396d.get(), (j0) this.f41397e.get(), this.f41398f.get());
    }
}
