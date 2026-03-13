package ma;

import android.bluetooth.BluetoothDevice;
import ea.C3974b;
import oa.InterfaceC5262n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f40253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f40254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f40255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X3.a f40256d;

    public n(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        this.f40253a = aVar;
        this.f40254b = aVar2;
        this.f40255c = aVar3;
        this.f40256d = aVar4;
    }

    public static n a(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        return new n(aVar, aVar2, aVar3, aVar4);
    }

    public static m c(BluetoothDevice bluetoothDevice, InterfaceC5262n interfaceC5262n, C3974b c3974b, ta.j jVar) {
        return new m(bluetoothDevice, interfaceC5262n, c3974b, jVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c((BluetoothDevice) this.f40253a.get(), (InterfaceC5262n) this.f40254b.get(), (C3974b) this.f40255c.get(), (ta.j) this.f40256d.get());
    }
}
