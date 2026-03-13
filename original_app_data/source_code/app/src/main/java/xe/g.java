package xe;

import Fe.C0843e;
import Fe.C0846h;
import Fe.InterfaceC0844f;
import Fe.InterfaceC0845g;
import fc.C4015H;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v;
import qe.p;
import vc.InterfaceC6082a;
import xe.c;
import xe.i;
import ye.C6480a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final c f48158C = new c(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final n f48159D;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final e f48160A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Set f48161B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f48163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f48164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f48167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f48168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te.d f48169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final te.c f48170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final te.c f48171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final te.c f48172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f48173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f48174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f48175n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f48176o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f48177p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f48178q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f48179r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xe.c f48180s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f48181t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n f48182u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C6480a f48183v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f48184w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f48185x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Socket f48186y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final xe.k f48187z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f48189b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10) {
            super(0);
            this.f48189b = j10;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            boolean z10;
            g gVar = g.this;
            synchronized (gVar) {
                if (gVar.f48175n < gVar.f48174m) {
                    z10 = true;
                } else {
                    gVar.f48174m++;
                    z10 = false;
                }
            }
            if (z10) {
                g.this.K(null);
                return -1L;
            }
            g.this.s1(false, 1, 0);
            return Long.valueOf(this.f48189b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f48190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final te.d f48191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Socket f48192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f48193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InterfaceC0845g f48194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC0844f f48195f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public d f48196g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public m f48197h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f48198i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public xe.c f48199j;

        public b(boolean z10, te.d taskRunner) {
            AbstractC4862t.e(taskRunner, "taskRunner");
            this.f48190a = z10;
            this.f48191b = taskRunner;
            this.f48196g = d.f48201b;
            this.f48197h = m.f48301b;
            this.f48199j = c.a.f48121a;
        }

        public final g a() {
            return new g(this);
        }

        public final b b(xe.c flowControlListener) {
            AbstractC4862t.e(flowControlListener, "flowControlListener");
            this.f48199j = flowControlListener;
            return this;
        }

        public final boolean c() {
            return this.f48190a;
        }

        public final String d() {
            String str = this.f48193d;
            if (str != null) {
                return str;
            }
            AbstractC4862t.p("connectionName");
            return null;
        }

        public final xe.c e() {
            return this.f48199j;
        }

        public final d f() {
            return this.f48196g;
        }

        public final int g() {
            return this.f48198i;
        }

        public final m h() {
            return this.f48197h;
        }

        public final InterfaceC0844f i() {
            InterfaceC0844f interfaceC0844f = this.f48195f;
            if (interfaceC0844f != null) {
                return interfaceC0844f;
            }
            AbstractC4862t.p("sink");
            return null;
        }

        public final Socket j() {
            Socket socket = this.f48192c;
            if (socket != null) {
                return socket;
            }
            AbstractC4862t.p("socket");
            return null;
        }

        public final InterfaceC0845g k() {
            InterfaceC0845g interfaceC0845g = this.f48194e;
            if (interfaceC0845g != null) {
                return interfaceC0845g;
            }
            AbstractC4862t.p("source");
            return null;
        }

        public final te.d l() {
            return this.f48191b;
        }

        public final b m(d listener) {
            AbstractC4862t.e(listener, "listener");
            this.f48196g = listener;
            return this;
        }

        public final b n(int i10) {
            this.f48198i = i10;
            return this;
        }

        public final void o(String str) {
            AbstractC4862t.e(str, "<set-?>");
            this.f48193d = str;
        }

        public final void p(InterfaceC0844f interfaceC0844f) {
            AbstractC4862t.e(interfaceC0844f, "<set-?>");
            this.f48195f = interfaceC0844f;
        }

        public final void q(Socket socket) {
            AbstractC4862t.e(socket, "<set-?>");
            this.f48192c = socket;
        }

        public final void r(InterfaceC0845g interfaceC0845g) {
            AbstractC4862t.e(interfaceC0845g, "<set-?>");
            this.f48194e = interfaceC0845g;
        }

        public final b s(Socket socket, String peerName, InterfaceC0845g source, InterfaceC0844f sink) {
            String str;
            AbstractC4862t.e(socket, "socket");
            AbstractC4862t.e(peerName, "peerName");
            AbstractC4862t.e(source, "source");
            AbstractC4862t.e(sink, "sink");
            q(socket);
            if (this.f48190a) {
                str = p.f43483f + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            o(str);
            r(source);
            p(sink);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {
        public /* synthetic */ c(AbstractC4854k abstractC4854k) {
            this();
        }

        public final n a() {
            return g.f48159D;
        }

        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f48200a = new b(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f48201b = new a();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends d {
            @Override // xe.g.d
            public void d(xe.j stream) {
                AbstractC4862t.e(stream, "stream");
                stream.e(xe.b.REFUSED_STREAM, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b {
            public /* synthetic */ b(AbstractC4854k abstractC4854k) {
                this();
            }

            public b() {
            }
        }

        public void a(g connection, n settings) {
            AbstractC4862t.e(connection, "connection");
            AbstractC4862t.e(settings, "settings");
        }

        public abstract void d(xe.j jVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f48215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C0843e f48216c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f48217d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f48218e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i10, C0843e c0843e, int i11, boolean z10) {
            super(0);
            this.f48215b = i10;
            this.f48216c = c0843e;
            this.f48217d = i11;
            this.f48218e = z10;
        }

        @Override // vc.InterfaceC6082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m273invoke();
            return C4015H.f34254a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m273invoke() {
            g gVar = g.this;
            int i10 = this.f48215b;
            C0843e c0843e = this.f48216c;
            int i11 = this.f48217d;
            boolean z10 = this.f48218e;
            try {
                boolean zA = gVar.f48173l.a(i10, c0843e, i11, z10);
                if (zA) {
                    gVar.M0().m(i10, xe.b.CANCEL);
                }
                if (zA || z10) {
                    synchronized (gVar) {
                        gVar.f48161B.remove(Integer.valueOf(i10));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: xe.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0668g extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f48220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f48221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f48222d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0668g(int i10, List list, boolean z10) {
            super(0);
            this.f48220b = i10;
            this.f48221c = list;
            this.f48222d = z10;
        }

        @Override // vc.InterfaceC6082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m274invoke();
            return C4015H.f34254a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m274invoke() {
            boolean zD = g.this.f48173l.d(this.f48220b, this.f48221c, this.f48222d);
            g gVar = g.this;
            int i10 = this.f48220b;
            boolean z10 = this.f48222d;
            if (zD) {
                try {
                    gVar.M0().m(i10, xe.b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (zD || z10) {
                synchronized (gVar) {
                    gVar.f48161B.remove(Integer.valueOf(i10));
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f48224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f48225c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i10, List list) {
            super(0);
            this.f48224b = i10;
            this.f48225c = list;
        }

        @Override // vc.InterfaceC6082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m275invoke();
            return C4015H.f34254a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m275invoke() {
            boolean zC = g.this.f48173l.c(this.f48224b, this.f48225c);
            g gVar = g.this;
            int i10 = this.f48224b;
            if (zC) {
                try {
                    gVar.M0().m(i10, xe.b.CANCEL);
                    synchronized (gVar) {
                        gVar.f48161B.remove(Integer.valueOf(i10));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class i extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f48227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ xe.b f48228c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i10, xe.b bVar) {
            super(0);
            this.f48227b = i10;
            this.f48228c = bVar;
        }

        @Override // vc.InterfaceC6082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m276invoke();
            return C4015H.f34254a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m276invoke() {
            g.this.f48173l.b(this.f48227b, this.f48228c);
            g gVar = g.this;
            int i10 = this.f48227b;
            synchronized (gVar) {
                gVar.f48161B.remove(Integer.valueOf(i10));
                C4015H c4015h = C4015H.f34254a;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class j extends v implements InterfaceC6082a {
        public j() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m277invoke();
            return C4015H.f34254a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m277invoke() {
            g.this.s1(false, 2, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class k extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f48231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ xe.b f48232c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i10, xe.b bVar) {
            super(0);
            this.f48231b = i10;
            this.f48232c = bVar;
        }

        @Override // vc.InterfaceC6082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m278invoke();
            return C4015H.f34254a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m278invoke() {
            try {
                g.this.t1(this.f48231b, this.f48232c);
            } catch (IOException e10) {
                g.this.K(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class l extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f48234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f48235c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(int i10, long j10) {
            super(0);
            this.f48234b = i10;
            this.f48235c = j10;
        }

        @Override // vc.InterfaceC6082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m279invoke();
            return C4015H.f34254a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m279invoke() {
            try {
                g.this.M0().q(this.f48234b, this.f48235c);
            } catch (IOException e10) {
                g.this.K(e10);
            }
        }
    }

    static {
        n nVar = new n();
        nVar.h(7, 65535);
        nVar.h(5, 16384);
        f48159D = nVar;
    }

    public g(b builder) {
        AbstractC4862t.e(builder, "builder");
        boolean zC = builder.c();
        this.f48162a = zC;
        this.f48163b = builder.f();
        this.f48164c = new LinkedHashMap();
        String strD = builder.d();
        this.f48165d = strD;
        this.f48167f = builder.c() ? 3 : 2;
        te.d dVarL = builder.l();
        this.f48169h = dVarL;
        te.c cVarK = dVarL.k();
        this.f48170i = cVarK;
        this.f48171j = dVarL.k();
        this.f48172k = dVarL.k();
        this.f48173l = builder.h();
        this.f48180s = builder.e();
        n nVar = new n();
        if (builder.c()) {
            nVar.h(7, 16777216);
        }
        this.f48181t = nVar;
        this.f48182u = f48159D;
        this.f48183v = new C6480a(0);
        this.f48185x = this.f48182u.c();
        this.f48186y = builder.j();
        this.f48187z = new xe.k(builder.i(), zC);
        this.f48160A = new e(this, new xe.i(builder.k(), zC));
        this.f48161B = new LinkedHashSet();
        if (builder.g() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.g());
            cVarK.k(strD + " ping", nanos, new a(nanos));
        }
    }

    public static /* synthetic */ void o1(g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        gVar.n1(z10);
    }

    public final synchronized xe.j C0(int i10) {
        return (xe.j) this.f48164c.get(Integer.valueOf(i10));
    }

    public final Map G0() {
        return this.f48164c;
    }

    public final void H(xe.b connectionCode, xe.b streamCode, IOException iOException) {
        int i10;
        Object[] array;
        AbstractC4862t.e(connectionCode, "connectionCode");
        AbstractC4862t.e(streamCode, "streamCode");
        if (p.f43482e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            m1(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f48164c.isEmpty()) {
                    array = null;
                } else {
                    array = this.f48164c.values().toArray(new xe.j[0]);
                    this.f48164c.clear();
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
        xe.j[] jVarArr = (xe.j[]) array;
        if (jVarArr != null) {
            for (xe.j jVar : jVarArr) {
                try {
                    jVar.e(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f48187z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f48186y.close();
        } catch (IOException unused4) {
        }
        this.f48170i.q();
        this.f48171j.q();
        this.f48172k.q();
    }

    public final long J0() {
        return this.f48185x;
    }

    public final void K(IOException iOException) {
        xe.b bVar = xe.b.PROTOCOL_ERROR;
        H(bVar, bVar, iOException);
    }

    public final xe.k M0() {
        return this.f48187z;
    }

    public final synchronized boolean Q0(long j10) {
        if (this.f48168g) {
            return false;
        }
        if (this.f48177p < this.f48176o) {
            if (j10 >= this.f48179r) {
                return false;
            }
        }
        return true;
    }

    public final boolean S() {
        return this.f48162a;
    }

    public final xe.j W0(int i10, List list, boolean z10) {
        g gVar;
        Throwable th;
        int i11;
        xe.j jVar;
        boolean z11;
        boolean z12 = !z10;
        synchronized (this.f48187z) {
            try {
                synchronized (this) {
                    try {
                        if (this.f48167f > 1073741823) {
                            try {
                                m1(xe.b.REFUSED_STREAM);
                            } catch (Throwable th2) {
                                th = th2;
                                gVar = this;
                            }
                        }
                        try {
                            if (this.f48168g) {
                                throw new C6363a();
                            }
                            i11 = this.f48167f;
                            this.f48167f = i11 + 2;
                            jVar = new xe.j(i11, this, z12, false, null);
                            z11 = !z10 || this.f48184w >= this.f48185x || jVar.s() >= jVar.r();
                            if (jVar.v()) {
                                this.f48164c.put(Integer.valueOf(i11), jVar);
                            }
                            C4015H c4015h = C4015H.f34254a;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        gVar = this;
                    }
                    th = th;
                    throw th;
                }
                if (i10 == 0) {
                    this.f48187z.h(z12, i11, list);
                } else {
                    if (this.f48162a) {
                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                    }
                    this.f48187z.k(i10, i11, list);
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        if (z11) {
            this.f48187z.flush();
        }
        return jVar;
    }

    public final String Y() {
        return this.f48165d;
    }

    public final xe.c a0() {
        return this.f48180s;
    }

    public final xe.j c1(List requestHeaders, boolean z10) {
        AbstractC4862t.e(requestHeaders, "requestHeaders");
        return W0(0, requestHeaders, z10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        H(xe.b.NO_ERROR, xe.b.CANCEL, null);
    }

    public final void d1(int i10, InterfaceC0845g source, int i11, boolean z10) {
        AbstractC4862t.e(source, "source");
        C0843e c0843e = new C0843e();
        long j10 = i11;
        source.j0(j10);
        source.V0(c0843e, j10);
        te.c.d(this.f48171j, this.f48165d + '[' + i10 + "] onData", 0L, false, new f(i10, c0843e, i11, z10), 6, null);
    }

    public final void e1(int i10, List requestHeaders, boolean z10) {
        AbstractC4862t.e(requestHeaders, "requestHeaders");
        te.c.d(this.f48171j, this.f48165d + '[' + i10 + "] onHeaders", 0L, false, new C0668g(i10, requestHeaders, z10), 6, null);
    }

    public final void f1(int i10, List requestHeaders) {
        AbstractC4862t.e(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.f48161B.contains(Integer.valueOf(i10))) {
                u1(i10, xe.b.PROTOCOL_ERROR);
                return;
            }
            this.f48161B.add(Integer.valueOf(i10));
            te.c.d(this.f48171j, this.f48165d + '[' + i10 + "] onRequest", 0L, false, new h(i10, requestHeaders), 6, null);
        }
    }

    public final void flush() {
        this.f48187z.flush();
    }

    public final int g0() {
        return this.f48166e;
    }

    public final void g1(int i10, xe.b errorCode) {
        AbstractC4862t.e(errorCode, "errorCode");
        te.c.d(this.f48171j, this.f48165d + '[' + i10 + "] onReset", 0L, false, new i(i10, errorCode), 6, null);
    }

    public final boolean h1(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final synchronized xe.j i1(int i10) {
        xe.j jVar;
        jVar = (xe.j) this.f48164c.remove(Integer.valueOf(i10));
        AbstractC4862t.c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return jVar;
    }

    public final void j1() {
        synchronized (this) {
            long j10 = this.f48177p;
            long j11 = this.f48176o;
            if (j10 < j11) {
                return;
            }
            this.f48176o = j11 + 1;
            this.f48179r = System.nanoTime() + ((long) 1000000000);
            C4015H c4015h = C4015H.f34254a;
            te.c.d(this.f48170i, this.f48165d + " ping", 0L, false, new j(), 6, null);
        }
    }

    public final d k0() {
        return this.f48163b;
    }

    public final void k1(int i10) {
        this.f48166e = i10;
    }

    public final void l1(n nVar) {
        AbstractC4862t.e(nVar, "<set-?>");
        this.f48182u = nVar;
    }

    public final void m1(xe.b statusCode) {
        AbstractC4862t.e(statusCode, "statusCode");
        synchronized (this.f48187z) {
            J j10 = new J();
            synchronized (this) {
                if (this.f48168g) {
                    return;
                }
                this.f48168g = true;
                int i10 = this.f48166e;
                j10.f39774a = i10;
                C4015H c4015h = C4015H.f34254a;
                this.f48187z.g(i10, statusCode, qe.m.f43470a);
            }
        }
    }

    public final void n1(boolean z10) {
        if (z10) {
            this.f48187z.b();
            this.f48187z.o(this.f48181t);
            if (this.f48181t.c() != 65535) {
                this.f48187z.q(0, r9 - 65535);
            }
        }
        te.c.d(this.f48169h.k(), this.f48165d, 0L, false, this.f48160A, 6, null);
    }

    public final int p0() {
        return this.f48167f;
    }

    public final synchronized void p1(long j10) {
        try {
            C6480a.c(this.f48183v, j10, 0L, 2, null);
            long jA = this.f48183v.a();
            if (jA >= this.f48181t.c() / 2) {
                v1(0, jA);
                C6480a.c(this.f48183v, 0L, jA, 1, null);
            }
            this.f48180s.a(this.f48183v);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f48187z.i());
        r6 = r2;
        r8.f48184w += r6;
        r4 = fc.C4015H.f34254a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q1(int r9, boolean r10, Fe.C0843e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            xe.k r8 = r8.f48187z
            r8.c(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r4 = r8.f48184w     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            long r6 = r8.f48185x     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L39
            java.util.Map r2 = r8.f48164c     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            if (r2 == 0) goto L31
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.AbstractC4862t.c(r8, r2)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            r8.wait()     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            goto L12
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            throw r9     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
        L39:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2f
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2f
            xe.k r4 = r8.f48187z     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.i()     // Catch: java.lang.Throwable -> L2f
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.f48184w     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.f48184w = r4     // Catch: java.lang.Throwable -> L2f
            fc.H r4 = fc.C4015H.f34254a     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            xe.k r4 = r8.f48187z
            if (r10 == 0) goto L5d
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = r3
        L5e:
            r4.c(r5, r9, r11, r2)
            goto Ld
        L62:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r9.interrupt()     // Catch: java.lang.Throwable -> L2f
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2f
            r9.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r9     // Catch: java.lang.Throwable -> L2f
        L6f:
            monitor-exit(r8)
            throw r9
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xe.g.q1(int, boolean, Fe.e, long):void");
    }

    public final void r1(int i10, boolean z10, List alternating) {
        AbstractC4862t.e(alternating, "alternating");
        this.f48187z.h(z10, i10, alternating);
    }

    public final void s1(boolean z10, int i10, int i11) {
        try {
            this.f48187z.j(z10, i10, i11);
        } catch (IOException e10) {
            K(e10);
        }
    }

    public final void t1(int i10, xe.b statusCode) {
        AbstractC4862t.e(statusCode, "statusCode");
        this.f48187z.m(i10, statusCode);
    }

    public final void u1(int i10, xe.b errorCode) {
        AbstractC4862t.e(errorCode, "errorCode");
        te.c.d(this.f48170i, this.f48165d + '[' + i10 + "] writeSynReset", 0L, false, new k(i10, errorCode), 6, null);
    }

    public final n v0() {
        return this.f48181t;
    }

    public final void v1(int i10, long j10) {
        te.c.d(this.f48170i, this.f48165d + '[' + i10 + "] windowUpdate", 0L, false, new l(i10, j10), 6, null);
    }

    public final n x0() {
        return this.f48182u;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class e implements i.c, InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xe.i f48202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f48203b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f48204a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ L f48205b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, L l10) {
                super(0);
                this.f48204a = gVar;
                this.f48205b = l10;
            }

            @Override // vc.InterfaceC6082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m269invoke();
                return C4015H.f34254a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m269invoke() {
                this.f48204a.k0().a(this.f48204a, (n) this.f48205b.f39776a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f48206a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ xe.j f48207b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(g gVar, xe.j jVar) {
                super(0);
                this.f48206a = gVar;
                this.f48207b = jVar;
            }

            @Override // vc.InterfaceC6082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m270invoke();
                return C4015H.f34254a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m270invoke() {
                try {
                    this.f48206a.k0().d(this.f48207b);
                } catch (IOException e10) {
                    Ae.h.f493a.g().k("Http2Connection.Listener failure for " + this.f48206a.Y(), 4, e10);
                    try {
                        this.f48207b.e(xe.b.PROTOCOL_ERROR, e10);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c extends v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f48208a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f48209b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f48210c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(g gVar, int i10, int i11) {
                super(0);
                this.f48208a = gVar;
                this.f48209b = i10;
                this.f48210c = i11;
            }

            @Override // vc.InterfaceC6082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m271invoke();
                return C4015H.f34254a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m271invoke() {
                this.f48208a.s1(true, this.f48209b, this.f48210c);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class d extends v implements InterfaceC6082a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f48212b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n f48213c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(boolean z10, n nVar) {
                super(0);
                this.f48212b = z10;
                this.f48213c = nVar;
            }

            @Override // vc.InterfaceC6082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m272invoke();
                return C4015H.f34254a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m272invoke() {
                e.this.p(this.f48212b, this.f48213c);
            }
        }

        public e(g gVar, xe.i reader) {
            AbstractC4862t.e(reader, "reader");
            this.f48203b = gVar;
            this.f48202a = reader;
        }

        @Override // xe.i.c
        public void a(boolean z10, int i10, InterfaceC0845g source, int i11) {
            AbstractC4862t.e(source, "source");
            if (this.f48203b.h1(i10)) {
                this.f48203b.d1(i10, source, i11, z10);
                return;
            }
            xe.j jVarC0 = this.f48203b.C0(i10);
            if (jVarC0 == null) {
                this.f48203b.u1(i10, xe.b.PROTOCOL_ERROR);
                long j10 = i11;
                this.f48203b.p1(j10);
                source.skip(j10);
                return;
            }
            jVarC0.x(source, i11);
            if (z10) {
                jVarC0.y(p.f43478a, true);
            }
        }

        @Override // xe.i.c
        public void b(boolean z10, int i10, int i11, List headerBlock) {
            AbstractC4862t.e(headerBlock, "headerBlock");
            if (this.f48203b.h1(i10)) {
                this.f48203b.e1(i10, headerBlock, z10);
                return;
            }
            g gVar = this.f48203b;
            synchronized (gVar) {
                xe.j jVarC0 = gVar.C0(i10);
                if (jVarC0 != null) {
                    C4015H c4015h = C4015H.f34254a;
                    jVarC0.y(p.p(headerBlock), z10);
                    return;
                }
                if (gVar.f48168g) {
                    return;
                }
                if (i10 <= gVar.g0()) {
                    return;
                }
                if (i10 % 2 == gVar.p0() % 2) {
                    return;
                }
                xe.j jVar = new xe.j(i10, gVar, false, z10, p.p(headerBlock));
                gVar.k1(i10);
                gVar.G0().put(Integer.valueOf(i10), jVar);
                te.c.d(gVar.f48169h.k(), gVar.Y() + '[' + i10 + "] onStream", 0L, false, new b(gVar, jVar), 6, null);
            }
        }

        @Override // xe.i.c
        public void c(int i10, long j10) {
            if (i10 == 0) {
                g gVar = this.f48203b;
                synchronized (gVar) {
                    gVar.f48185x = gVar.J0() + j10;
                    AbstractC4862t.c(gVar, "null cannot be cast to non-null type java.lang.Object");
                    gVar.notifyAll();
                    C4015H c4015h = C4015H.f34254a;
                }
                return;
            }
            xe.j jVarC0 = this.f48203b.C0(i10);
            if (jVarC0 != null) {
                synchronized (jVarC0) {
                    jVarC0.b(j10);
                    C4015H c4015h2 = C4015H.f34254a;
                }
            }
        }

        @Override // xe.i.c
        public void e(boolean z10, n settings) {
            AbstractC4862t.e(settings, "settings");
            te.c.d(this.f48203b.f48170i, this.f48203b.Y() + " applyAndAckSettings", 0L, false, new d(z10, settings), 6, null);
        }

        @Override // xe.i.c
        public void f(int i10, int i11, List requestHeaders) {
            AbstractC4862t.e(requestHeaders, "requestHeaders");
            this.f48203b.f1(i11, requestHeaders);
        }

        @Override // vc.InterfaceC6082a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            r();
            return C4015H.f34254a;
        }

        @Override // xe.i.c
        public void j(int i10, xe.b errorCode, C0846h debugData) {
            int i11;
            Object[] array;
            AbstractC4862t.e(errorCode, "errorCode");
            AbstractC4862t.e(debugData, "debugData");
            debugData.size();
            g gVar = this.f48203b;
            synchronized (gVar) {
                array = gVar.G0().values().toArray(new xe.j[0]);
                gVar.f48168g = true;
                C4015H c4015h = C4015H.f34254a;
            }
            for (xe.j jVar : (xe.j[]) array) {
                if (jVar.l() > i10 && jVar.u()) {
                    jVar.z(xe.b.REFUSED_STREAM);
                    this.f48203b.i1(jVar.l());
                }
            }
        }

        @Override // xe.i.c
        public void k(int i10, xe.b errorCode) {
            AbstractC4862t.e(errorCode, "errorCode");
            if (this.f48203b.h1(i10)) {
                this.f48203b.g1(i10, errorCode);
                return;
            }
            xe.j jVarI1 = this.f48203b.i1(i10);
            if (jVarI1 != null) {
                jVarI1.z(errorCode);
            }
        }

        @Override // xe.i.c
        public void l(boolean z10, int i10, int i11) {
            if (!z10) {
                te.c.d(this.f48203b.f48170i, this.f48203b.Y() + " ping", 0L, false, new c(this.f48203b, i10, i11), 6, null);
                return;
            }
            g gVar = this.f48203b;
            synchronized (gVar) {
                try {
                    if (i10 == 1) {
                        gVar.f48175n++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            gVar.f48178q++;
                            AbstractC4862t.c(gVar, "null cannot be cast to non-null type java.lang.Object");
                            gVar.notifyAll();
                        }
                        C4015H c4015h = C4015H.f34254a;
                    } else {
                        gVar.f48177p++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void p(boolean z10, n settings) {
            long jC;
            int i10;
            xe.j[] jVarArr;
            AbstractC4862t.e(settings, "settings");
            L l10 = new L();
            xe.k kVarM0 = this.f48203b.M0();
            g gVar = this.f48203b;
            synchronized (kVarM0) {
                synchronized (gVar) {
                    try {
                        n nVarX0 = gVar.x0();
                        if (!z10) {
                            n nVar = new n();
                            nVar.g(nVarX0);
                            nVar.g(settings);
                            settings = nVar;
                        }
                        l10.f39776a = settings;
                        jC = ((long) settings.c()) - ((long) nVarX0.c());
                        jVarArr = (jC == 0 || gVar.G0().isEmpty()) ? null : (xe.j[]) gVar.G0().values().toArray(new xe.j[0]);
                        gVar.l1((n) l10.f39776a);
                        te.c.d(gVar.f48172k, gVar.Y() + " onSettings", 0L, false, new a(gVar, l10), 6, null);
                        C4015H c4015h = C4015H.f34254a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    gVar.M0().a((n) l10.f39776a);
                } catch (IOException e10) {
                    gVar.K(e10);
                }
                C4015H c4015h2 = C4015H.f34254a;
            }
            if (jVarArr != null) {
                for (xe.j jVar : jVarArr) {
                    synchronized (jVar) {
                        jVar.b(jC);
                        C4015H c4015h3 = C4015H.f34254a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable, xe.i] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void r() throws Throwable {
            xe.b bVar;
            xe.b bVar2;
            xe.b bVar3 = xe.b.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f48202a.c(this);
                    while (this.f48202a.b(false, this)) {
                    }
                    bVar2 = xe.b.NO_ERROR;
                } catch (IOException e11) {
                    e10 = e11;
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar3;
                    this.f48203b.H(bVar, bVar3, e10);
                    qe.m.f(this.f48202a);
                    throw th;
                }
                try {
                    bVar3 = xe.b.CANCEL;
                    this.f48203b.H(bVar2, bVar3, null);
                    bVar = bVar2;
                } catch (IOException e12) {
                    e10 = e12;
                    bVar3 = xe.b.PROTOCOL_ERROR;
                    g gVar = this.f48203b;
                    gVar.H(bVar3, bVar3, e10);
                    bVar = gVar;
                }
                this = this.f48202a;
                qe.m.f(this);
            } catch (Throwable th2) {
                th = th2;
                this.f48203b.H(bVar, bVar3, e10);
                qe.m.f(this.f48202a);
                throw th;
            }
        }

        @Override // xe.i.c
        public void i() {
        }

        @Override // xe.i.c
        public void n(int i10, int i11, int i12, boolean z10) {
        }
    }
}
