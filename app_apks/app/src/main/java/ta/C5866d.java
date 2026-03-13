package ta;

import android.bluetooth.BluetoothManager;

/* JADX INFO: renamed from: ta.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5866d implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f44848a;

    public C5866d(X3.a aVar) {
        this.f44848a = aVar;
    }

    public static C5866d a(X3.a aVar) {
        return new C5866d(aVar);
    }

    public static C5865c c(BluetoothManager bluetoothManager) {
        return new C5865c(bluetoothManager);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5865c get() {
        return c((BluetoothManager) this.f44848a.get());
    }
}
