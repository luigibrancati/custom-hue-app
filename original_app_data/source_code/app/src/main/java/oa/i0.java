package oa;

import android.bluetooth.BluetoothGatt;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f41419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f41420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f41421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X3.a f41422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X3.a f41423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X3.a f41424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final X3.a f41425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final X3.a f41426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final X3.a f41427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final X3.a f41428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final X3.a f41429k;

    public i0(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4, X3.a aVar5, X3.a aVar6, X3.a aVar7, X3.a aVar8, X3.a aVar9, X3.a aVar10, X3.a aVar11) {
        this.f41419a = aVar;
        this.f41420b = aVar2;
        this.f41421c = aVar3;
        this.f41422d = aVar4;
        this.f41423e = aVar5;
        this.f41424f = aVar6;
        this.f41425g = aVar7;
        this.f41426h = aVar8;
        this.f41427i = aVar9;
        this.f41428j = aVar10;
        this.f41429k = aVar11;
    }

    public static i0 a(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4, X3.a aVar5, X3.a aVar6, X3.a aVar7, X3.a aVar8, X3.a aVar9, X3.a aVar10, X3.a aVar11) {
        return new i0(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11);
    }

    public static h0 c(sa.d dVar, j0 j0Var, BluetoothGatt bluetoothGatt, Object obj, Object obj2, Object obj3, Object obj4, qa.k kVar, X3.a aVar, Eb.q qVar, C5244B c5244b) {
        return new h0(dVar, j0Var, bluetoothGatt, (l0) obj, (e0) obj2, (N) obj3, (C5268u) obj4, kVar, aVar, qVar, c5244b);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h0 get() {
        return c((sa.d) this.f41419a.get(), (j0) this.f41420b.get(), (BluetoothGatt) this.f41421c.get(), this.f41422d.get(), this.f41423e.get(), this.f41424f.get(), this.f41425g.get(), (qa.k) this.f41426h.get(), this.f41427i, (Eb.q) this.f41428j.get(), (C5244B) this.f41429k.get());
    }
}
