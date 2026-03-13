package qa;

import android.bluetooth.BluetoothManager;
import oa.C5249a;
import oa.InterfaceC5260l;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f43365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f43366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f43367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X3.a f43368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X3.a f43369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X3.a f43370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final X3.a f43371g;

    public h(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4, X3.a aVar5, X3.a aVar6, X3.a aVar7) {
        this.f43365a = aVar;
        this.f43366b = aVar2;
        this.f43367c = aVar3;
        this.f43368d = aVar4;
        this.f43369e = aVar5;
        this.f43370f = aVar6;
        this.f43371g = aVar7;
    }

    public static h a(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4, X3.a aVar5, X3.a aVar6, X3.a aVar7) {
        return new h(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static g c(j0 j0Var, C5249a c5249a, String str, BluetoothManager bluetoothManager, Eb.q qVar, x xVar, InterfaceC5260l interfaceC5260l) {
        return new g(j0Var, c5249a, str, bluetoothManager, qVar, xVar, interfaceC5260l);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c((j0) this.f43365a.get(), (C5249a) this.f43366b.get(), (String) this.f43367c.get(), (BluetoothManager) this.f43368d.get(), (Eb.q) this.f43369e.get(), (x) this.f43370f.get(), (InterfaceC5260l) this.f43371g.get());
    }
}
