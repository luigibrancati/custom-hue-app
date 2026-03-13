package ka;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import ka.E;
import ka.G;
import ka.InterfaceC4817a;
import la.C4981m;
import ra.InterfaceC5683A;
import sa.InterfaceC5813a;
import ta.C5865c;
import ua.C6013d;
import ua.InterfaceC6010a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class L extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5813a f39444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ta.H f39445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ma.o f39446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC5683A f39447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ra.q f39448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Jb.e f39449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC4817a.b f39450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Eb.q f39451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f39452i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C5865c f39453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ta.F f39454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Eb.k f39455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ta.w f39456m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final V3.a f39457n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC6010a f39458o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ta.p f39459p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ta.j f39460q;

    public L(C5865c c5865c, ta.F f10, InterfaceC5813a interfaceC5813a, Eb.k kVar, ta.H h10, ta.w wVar, V3.a aVar, ma.o oVar, InterfaceC5683A interfaceC5683A, ra.q qVar, Jb.e eVar, Eb.q qVar2, InterfaceC4817a.b bVar, InterfaceC6010a interfaceC6010a, ta.p pVar, ta.j jVar) {
        this.f39444a = interfaceC5813a;
        this.f39453j = c5865c;
        this.f39454k = f10;
        this.f39455l = kVar;
        this.f39445b = h10;
        this.f39456m = wVar;
        this.f39457n = aVar;
        this.f39446c = oVar;
        this.f39447d = interfaceC5683A;
        this.f39448e = qVar;
        this.f39449f = eVar;
        this.f39451h = qVar2;
        this.f39450g = bVar;
        this.f39458o = interfaceC6010a;
        this.f39459p = pVar;
        this.f39460q = jVar;
    }

    public static /* synthetic */ Eb.n g(L l10, ua.g gVar, C6013d[] c6013dArr) {
        l10.f39448e.a(gVar.h());
        ra.z zVarA = l10.f39447d.a(gVar, c6013dArr);
        return l10.f39444a.a(zVarA.f43936a).K0(l10.f39451h).j(zVarA.f43937b).Z(l10.f39449f).z(new Jb.d() { // from class: ka.I
            @Override // Jb.d
            public final void accept(Object obj) {
                L.i((ua.f) obj);
            }
        }).d0(l10.k());
    }

    public static /* synthetic */ boolean h(E.b bVar) {
        return bVar != E.b.f39434c;
    }

    public static /* synthetic */ void i(ua.f fVar) {
        if (ma.q.i()) {
            ma.q.k("%s", fVar);
        }
    }

    @Override // ka.G
    public P b(String str) {
        l();
        return this.f39446c.a(str);
    }

    @Override // ka.G
    public G.a c() {
        return !this.f39454k.b() ? G.a.BLUETOOTH_NOT_AVAILABLE : !this.f39456m.b() ? G.a.LOCATION_PERMISSION_NOT_GRANTED : !this.f39454k.c() ? G.a.BLUETOOTH_NOT_ENABLED : !this.f39456m.a() ? G.a.LOCATION_SERVICES_NOT_ENABLED : G.a.READY;
    }

    @Override // ka.G
    public Eb.k d() {
        return (Eb.k) this.f39457n.get();
    }

    @Override // ka.G
    public Eb.k e(final ua.g gVar, final C6013d... c6013dArr) {
        return Eb.k.o(new Callable() { // from class: ka.H
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return L.g(this.f39441a, gVar, c6013dArr);
            }
        });
    }

    public void finalize() throws Throwable {
        this.f39450g.a();
        super.finalize();
    }

    public Eb.k k() {
        return this.f39455l.I(new Jb.g() { // from class: ka.J
            @Override // Jb.g
            public final boolean test(Object obj) {
                return L.h((E.b) obj);
            }
        }).K().d(new Jb.e() { // from class: ka.K
            @Override // Jb.e
            public final Object apply(Object obj) {
                return Eb.h.c(new C4981m(1));
            }
        }).h();
    }

    public final void l() {
        if (!this.f39454k.b()) {
            throw new UnsupportedOperationException("RxAndroidBle library needs a BluetoothAdapter to be available in the system to work. If this is a test on an emulator then you can use 'https://github.com/Polidea/RxAndroidBle/tree/master/mockrxandroidble'");
        }
    }
}
