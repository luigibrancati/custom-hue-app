package qa;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.os.DeadObjectException;
import java.util.concurrent.Callable;
import ka.N;
import la.C4973e;
import la.C4974f;
import la.C4975g;
import la.C4980l;
import oa.C5249a;
import oa.InterfaceC5260l;
import oa.j0;
import pa.AbstractC5451b;
import ta.C5864b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class c extends ma.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BluetoothDevice f43330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5864b f43331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f43332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5249a f43333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f43334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f43335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC5260l f43336g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Jb.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sa.i f43337a;

        public a(sa.i iVar) {
            this.f43337a = iVar;
        }

        @Override // Jb.a
        public void run() {
            this.f43337a.release();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Eb.w {
        public b() {
        }

        @Override // Eb.w
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Eb.r a(Eb.r rVar) {
            c cVar = c.this;
            if (cVar.f43335f) {
                return rVar;
            }
            x xVar = cVar.f43334e;
            return rVar.E(xVar.f43411a, xVar.f43412b, xVar.f43413c, cVar.s());
        }
    }

    /* JADX INFO: renamed from: qa.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class CallableC0578c implements Callable {
        public CallableC0578c() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BluetoothGatt call() {
            throw new C4975g(c.this.f43333d.a(), C4980l.f40002b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements Eb.u {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Jb.g {
            public a() {
            }

            @Override // Jb.g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean test(N.a aVar) {
                return aVar == N.a.CONNECTED;
            }
        }

        public d() {
        }

        @Override // Eb.u
        public void a(Eb.s sVar) {
            sVar.b((ac.b) c.this.p().i(c.this.f43332c.e().I(new a())).x(c.this.f43332c.l().L()).e().D(ta.t.b(sVar)));
            c.this.f43336g.a(N.a.CONNECTING);
            c cVar = c.this;
            c.this.f43333d.b(cVar.f43331b.a(cVar.f43330a, cVar.f43335f, cVar.f43332c.a()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements Callable {
        public e() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BluetoothGatt call() {
            c.this.f43336g.a(N.a.CONNECTED);
            return c.this.f43333d.a();
        }
    }

    public c(BluetoothDevice bluetoothDevice, C5864b c5864b, j0 j0Var, C5249a c5249a, x xVar, boolean z10, InterfaceC5260l interfaceC5260l) {
        this.f43330a = bluetoothDevice;
        this.f43331b = c5864b;
        this.f43332c = j0Var;
        this.f43333d = c5249a;
        this.f43334e = xVar;
        this.f43335f = z10;
        this.f43336g = interfaceC5260l;
    }

    @Override // ma.j
    public void b(Eb.l lVar, sa.i iVar) {
        lVar.b((ac.b) q().f(u()).j(new a(iVar)).D(ta.t.a(lVar)));
        if (this.f43335f) {
            iVar.release();
        }
    }

    @Override // ma.j
    public C4974f j(DeadObjectException deadObjectException) {
        return new C4973e(deadObjectException, this.f43330a.getAddress(), -1);
    }

    public Eb.r p() {
        return Eb.r.s(new e());
    }

    public final Eb.r q() {
        return Eb.r.g(new d());
    }

    public Eb.r s() {
        return Eb.r.s(new CallableC0578c());
    }

    public String toString() {
        return "ConnectOperation{" + AbstractC5451b.d(this.f43330a.getAddress()) + ", autoConnect=" + this.f43335f + '}';
    }

    public final Eb.w u() {
        return new b();
    }
}
