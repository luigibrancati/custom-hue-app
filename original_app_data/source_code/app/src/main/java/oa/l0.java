package oa;

import android.bluetooth.BluetoothGatt;
import cc.AbstractC3096a;
import dc.C3890a;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa.d f41459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BluetoothGatt f41460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qa.k f41461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Eb.r f41462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dc.d f41463e = C3890a.Q0().O0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41464f = false;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Jb.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f41465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TimeUnit f41466b;

        public a(long j10, TimeUnit timeUnit) {
            this.f41465a = j10;
            this.f41466b = timeUnit;
        }

        @Override // Jb.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Hb.c cVar) {
            l0.this.f41463e.c(new qa.x(this.f41465a, this.f41466b, AbstractC3096a.a()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Jb.a {
        public b() {
        }

        @Override // Jb.a
        public void run() {
            l0.this.f41464f = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements Jb.a {
        public c() {
        }

        @Override // Jb.a
        public void run() {
            l0.this.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements Jb.e {
        @Override // Jb.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ka.Q apply(List list) {
            return new ka.Q(list);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements Jb.g {
        public e() {
        }

        @Override // Jb.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(List list) {
            return list.size() > 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f implements Callable {
        public f() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            return l0.this.f41460b.getServices();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class g implements Jb.e {
        public g() {
        }

        @Override // Jb.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Eb.r apply(qa.x xVar) {
            return l0.this.f41459a.a(l0.this.f41461c.f(xVar.f43411a, xVar.f43412b)).L();
        }
    }

    public l0(sa.d dVar, BluetoothGatt bluetoothGatt, qa.k kVar) {
        this.f41459a = dVar;
        this.f41460b = bluetoothGatt;
        this.f41461c = kVar;
        d();
    }

    public static Jb.e f() {
        return new d();
    }

    public Eb.r a(long j10, TimeUnit timeUnit) {
        return this.f41464f ? this.f41462d : this.f41462d.l(new a(j10, timeUnit));
    }

    public final Eb.h b() {
        return Eb.r.s(new f()).p(new e());
    }

    public final Eb.r c() {
        return this.f41463e.L();
    }

    public void d() {
        this.f41464f = false;
        this.f41462d = b().e(f()).g(c().q(e())).m(Lb.a.a(new b())).k(Lb.a.a(new c())).e();
    }

    public final Jb.e e() {
        return new g();
    }
}
