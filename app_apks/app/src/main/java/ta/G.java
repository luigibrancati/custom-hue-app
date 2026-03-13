package ta;

import android.bluetooth.BluetoothAdapter;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class G implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f44841a;

    public G(X3.a aVar) {
        this.f44841a = aVar;
    }

    public static G a(X3.a aVar) {
        return new G(aVar);
    }

    public static F c(BluetoothAdapter bluetoothAdapter) {
        return new F(bluetoothAdapter);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public F get() {
        return c((BluetoothAdapter) this.f44841a.get());
    }
}
