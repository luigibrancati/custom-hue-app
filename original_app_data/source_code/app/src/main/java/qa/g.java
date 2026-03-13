package qa;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.os.DeadObjectException;
import ka.N;
import la.C4973e;
import la.C4974f;
import oa.C5249a;
import oa.InterfaceC5260l;
import oa.j0;
import pa.AbstractC5451b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class g extends ma.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f43349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5249a f43350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BluetoothManager f43352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Eb.q f43353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f43354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC5260l f43355g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends Eb.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BluetoothGatt f43359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j0 f43360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Eb.q f43361c;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Jb.e {
            public a() {
            }

            @Override // Jb.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public BluetoothGatt apply(N.a aVar) {
                return b.this.f43359a;
            }
        }

        /* JADX INFO: renamed from: qa.g$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0579b implements Jb.g {
            public C0579b() {
            }

            @Override // Jb.g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean test(N.a aVar) {
                return aVar == N.a.DISCONNECTED;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f43359a.disconnect();
            }
        }

        public b(BluetoothGatt bluetoothGatt, j0 j0Var, Eb.q qVar) {
            this.f43359a = bluetoothGatt;
            this.f43360b = j0Var;
            this.f43361c = qVar;
        }

        @Override // Eb.r
        public void C(Eb.t tVar) {
            this.f43360b.e().I(new C0579b()).L().u(new a()).c(tVar);
            this.f43361c.a().b(new c());
        }
    }

    public g(j0 j0Var, C5249a c5249a, String str, BluetoothManager bluetoothManager, Eb.q qVar, x xVar, InterfaceC5260l interfaceC5260l) {
        this.f43349a = j0Var;
        this.f43350b = c5249a;
        this.f43351c = str;
        this.f43352d = bluetoothManager;
        this.f43353e = qVar;
        this.f43354f = xVar;
        this.f43355g = interfaceC5260l;
    }

    @Override // ma.j
    public void b(Eb.l lVar, sa.i iVar) {
        this.f43355g.a(N.a.DISCONNECTING);
        BluetoothGatt bluetoothGattA = this.f43350b.a();
        if (bluetoothGattA != null) {
            s(bluetoothGattA).y(this.f43353e).c(new a(lVar, iVar));
        } else {
            ma.q.q("Disconnect operation has been executed but GATT instance was null - considering disconnected.", new Object[0]);
            p(lVar, iVar);
        }
    }

    @Override // ma.j
    public C4974f j(DeadObjectException deadObjectException) {
        return new C4973e(deadObjectException, this.f43351c, -1);
    }

    public void p(Eb.e eVar, sa.i iVar) {
        this.f43355g.a(N.a.DISCONNECTED);
        iVar.release();
        eVar.a();
    }

    public final Eb.r q(BluetoothGatt bluetoothGatt) {
        b bVar = new b(bluetoothGatt, this.f43349a, this.f43353e);
        x xVar = this.f43354f;
        return bVar.E(xVar.f43411a, xVar.f43412b, xVar.f43413c, Eb.r.t(bluetoothGatt));
    }

    public final Eb.r s(BluetoothGatt bluetoothGatt) {
        return u(bluetoothGatt) ? Eb.r.t(bluetoothGatt) : q(bluetoothGatt);
    }

    public String toString() {
        return "DisconnectOperation{" + AbstractC5451b.d(this.f43351c) + '}';
    }

    public final boolean u(BluetoothGatt bluetoothGatt) {
        return this.f43352d.getConnectionState(bluetoothGatt.getDevice(), 7) == 0;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Eb.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Eb.l f43356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sa.i f43357b;

        public a(Eb.l lVar, sa.i iVar) {
            this.f43356a = lVar;
            this.f43357b = iVar;
        }

        @Override // Eb.t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BluetoothGatt bluetoothGatt) {
            bluetoothGatt.close();
            g.this.p(this.f43356a, this.f43357b);
        }

        @Override // Eb.t
        public void onError(Throwable th) {
            ma.q.r(th, "Disconnect operation has been executed but finished with an error - considering disconnected.", new Object[0]);
            g.this.p(this.f43356a, this.f43357b);
        }

        @Override // Eb.t
        public void b(Hb.c cVar) {
        }
    }
}
