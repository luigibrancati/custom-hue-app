package qa;

import android.bluetooth.BluetoothGatt;
import oa.j0;
import pa.C5452c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f43380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f43381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f43382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X3.a f43383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X3.a f43384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X3.a f43385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final X3.a f43386g;

    public m(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4, X3.a aVar5, X3.a aVar6, X3.a aVar7) {
        this.f43380a = aVar;
        this.f43381b = aVar2;
        this.f43382c = aVar3;
        this.f43383d = aVar4;
        this.f43384e = aVar5;
        this.f43385f = aVar6;
        this.f43386g = aVar7;
    }

    public static m a(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4, X3.a aVar5, X3.a aVar6, X3.a aVar7) {
        return new m(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static l c(j0 j0Var, BluetoothGatt bluetoothGatt, C5452c c5452c, x xVar, Eb.q qVar, Eb.q qVar2, X3.a aVar) {
        return new l(j0Var, bluetoothGatt, c5452c, xVar, qVar, qVar2, aVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c((j0) this.f43380a.get(), (BluetoothGatt) this.f43381b.get(), (C5452c) this.f43382c.get(), (x) this.f43383d.get(), (Eb.q) this.f43384e.get(), (Eb.q) this.f43385f.get(), this.f43386g);
    }
}
