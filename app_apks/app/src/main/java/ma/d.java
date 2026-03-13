package ma;

import android.bluetooth.BluetoothDevice;
import ta.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f40234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f40235b;

    public d(X3.a aVar, X3.a aVar2) {
        this.f40234a = aVar;
        this.f40235b = aVar2;
    }

    public static d a(X3.a aVar, X3.a aVar2) {
        return new d(aVar, aVar2);
    }

    public static BluetoothDevice c(String str, F f10) {
        return (BluetoothDevice) W3.e.d(c.a(str, f10));
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BluetoothDevice get() {
        return c((String) this.f40234a.get(), (F) this.f40235b.get());
    }
}
