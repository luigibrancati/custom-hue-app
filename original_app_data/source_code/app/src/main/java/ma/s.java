package ma;

import android.bluetooth.BluetoothGatt;
import android.os.DeadObjectException;
import java.util.concurrent.TimeUnit;
import la.C4973e;
import la.C4974f;
import la.C4975g;
import la.C4976h;
import la.C4980l;
import oa.j0;
import pa.AbstractC5451b;
import qa.x;
import ta.E;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BluetoothGatt f40265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f40266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4980l f40267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f40268d;

    public s(BluetoothGatt bluetoothGatt, j0 j0Var, C4980l c4980l, x xVar) {
        this.f40265a = bluetoothGatt;
        this.f40266b = j0Var;
        this.f40267c = c4980l;
        this.f40268d = xVar;
    }

    @Override // ma.j
    public final void b(Eb.l lVar, sa.i iVar) {
        E e10 = new E(lVar, iVar);
        Eb.r rVarP = p(this.f40266b);
        x xVar = this.f40268d;
        long j10 = xVar.f43411a;
        TimeUnit timeUnit = xVar.f43412b;
        Eb.q qVar = xVar.f43413c;
        rVarP.E(j10, timeUnit, qVar, s(this.f40265a, this.f40266b, qVar)).J().f(e10);
        if (q(this.f40265a)) {
            return;
        }
        e10.cancel();
        e10.onError(new C4976h(this.f40265a, this.f40267c));
    }

    @Override // ma.j
    public C4974f j(DeadObjectException deadObjectException) {
        return new C4973e(deadObjectException, this.f40265a.getDevice().getAddress(), -1);
    }

    public abstract Eb.r p(j0 j0Var);

    public abstract boolean q(BluetoothGatt bluetoothGatt);

    public Eb.r s(BluetoothGatt bluetoothGatt, j0 j0Var, Eb.q qVar) {
        return Eb.r.n(new C4975g(this.f40265a, this.f40267c));
    }

    public String toString() {
        return AbstractC5451b.c(this.f40265a);
    }
}
