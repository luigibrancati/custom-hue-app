package ue;

import Fe.InterfaceC0844f;
import Fe.InterfaceC0845g;
import Fe.K;
import fc.C4015H;
import io.sentry.MeasurementUnit;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import pe.C5465a;
import pe.E;
import pe.v;
import pe.y;
import pe.z;
import ve.d;
import we.C6199b;
import xe.c;
import xe.g;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends g.d implements pe.j, d.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f45638w = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te.d f45639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f45640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E f45641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Socket f45642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Socket f45643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public pe.t f45644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z f45645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC0845g f45646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC0844f f45647k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f45648l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final pe.k f45649m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public xe.g f45650n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45651o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f45652p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f45653q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f45654r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f45655s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f45656t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List f45657u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f45658v;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public l(te.d taskRunner, m connectionPool, E route, Socket socket, Socket socket2, pe.t tVar, z zVar, InterfaceC0845g interfaceC0845g, InterfaceC0844f interfaceC0844f, int i10, pe.k connectionListener) {
        AbstractC4862t.e(taskRunner, "taskRunner");
        AbstractC4862t.e(connectionPool, "connectionPool");
        AbstractC4862t.e(route, "route");
        AbstractC4862t.e(connectionListener, "connectionListener");
        this.f45639c = taskRunner;
        this.f45640d = connectionPool;
        this.f45641e = route;
        this.f45642f = socket;
        this.f45643g = socket2;
        this.f45644h = tVar;
        this.f45645i = zVar;
        this.f45646j = interfaceC0845g;
        this.f45647k = interfaceC0844f;
        this.f45648l = i10;
        this.f45649m = connectionListener;
        this.f45656t = 1;
        this.f45657u = new ArrayList();
        this.f45658v = Long.MAX_VALUE;
    }

    public final boolean A(v vVar) {
        pe.t tVar;
        if (qe.p.f43482e && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        v vVarL = e().a().l();
        if (vVar.m() != vVarL.m()) {
            return false;
        }
        if (AbstractC4862t.a(vVar.h(), vVarL.h())) {
            return true;
        }
        if (!this.f45652p && (tVar = this.f45644h) != null) {
            AbstractC4862t.b(tVar);
            if (f(vVar, tVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // xe.g.d
    public synchronized void a(xe.g connection, xe.n settings) {
        try {
            AbstractC4862t.e(connection, "connection");
            AbstractC4862t.e(settings, "settings");
            int i10 = this.f45656t;
            int iD = settings.d();
            this.f45656t = iD;
            if (iD < i10) {
                this.f45640d.i(e().a());
            } else if (iD > i10) {
                this.f45640d.h();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    @Override // ve.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(ue.k r4, java.io.IOException r5) {
        /*
            r3 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.AbstractC4862t.e(r4, r0)
            monitor-enter(r3)
            boolean r0 = r5 instanceof xe.o     // Catch: java.lang.Throwable -> L26
            r1 = 1
            if (r0 == 0) goto L41
            r0 = r5
            xe.o r0 = (xe.o) r0     // Catch: java.lang.Throwable -> L26
            xe.b r0 = r0.f48306a     // Catch: java.lang.Throwable -> L26
            xe.b r2 = xe.b.REFUSED_STREAM     // Catch: java.lang.Throwable -> L26
            if (r0 != r2) goto L28
            int r4 = r3.f45655s     // Catch: java.lang.Throwable -> L26
            int r4 = r4 + r1
            r3.f45655s = r4     // Catch: java.lang.Throwable -> L26
            if (r4 <= r1) goto L4c
            boolean r4 = r3.f45651o     // Catch: java.lang.Throwable -> L26
            r4 = r4 ^ r1
            r3.f45651o = r1     // Catch: java.lang.Throwable -> L26
            int r5 = r3.f45653q     // Catch: java.lang.Throwable -> L26
            int r5 = r5 + r1
            r3.f45653q = r5     // Catch: java.lang.Throwable -> L26
            goto L6a
        L26:
            r4 = move-exception
            goto L75
        L28:
            xe.o r5 = (xe.o) r5     // Catch: java.lang.Throwable -> L26
            xe.b r5 = r5.f48306a     // Catch: java.lang.Throwable -> L26
            xe.b r0 = xe.b.CANCEL     // Catch: java.lang.Throwable -> L26
            if (r5 != r0) goto L36
            boolean r4 = r4.c()     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L4c
        L36:
            boolean r4 = r3.f45651o     // Catch: java.lang.Throwable -> L26
            r4 = r4 ^ r1
            r3.f45651o = r1     // Catch: java.lang.Throwable -> L26
            int r5 = r3.f45653q     // Catch: java.lang.Throwable -> L26
            int r5 = r5 + r1
            r3.f45653q = r5     // Catch: java.lang.Throwable -> L26
            goto L6a
        L41:
            boolean r0 = r3.q()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L4e
            boolean r0 = r5 instanceof xe.C6363a     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L4c
            goto L4e
        L4c:
            r4 = 0
            goto L6a
        L4e:
            boolean r0 = r3.f45651o     // Catch: java.lang.Throwable -> L26
            r0 = r0 ^ r1
            r3.f45651o = r1     // Catch: java.lang.Throwable -> L26
            int r2 = r3.f45654r     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L69
            if (r5 == 0) goto L64
            pe.y r4 = r4.p()     // Catch: java.lang.Throwable -> L26
            pe.E r2 = r3.e()     // Catch: java.lang.Throwable -> L26
            r3.g(r4, r2, r5)     // Catch: java.lang.Throwable -> L26
        L64:
            int r4 = r3.f45653q     // Catch: java.lang.Throwable -> L26
            int r4 = r4 + r1
            r3.f45653q = r4     // Catch: java.lang.Throwable -> L26
        L69:
            r4 = r0
        L6a:
            fc.H r5 = fc.C4015H.f34254a     // Catch: java.lang.Throwable -> L26
            monitor-exit(r3)
            if (r4 == 0) goto L74
            pe.k r4 = r3.f45649m
            r4.h(r3)
        L74:
            return
        L75:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.l.b(ue.k, java.io.IOException):void");
    }

    @Override // ve.d.a
    public void c() {
        synchronized (this) {
            this.f45651o = true;
            C4015H c4015h = C4015H.f34254a;
        }
        this.f45649m.h(this);
    }

    @Override // ve.d.a
    public void cancel() {
        Socket socket = this.f45642f;
        if (socket != null) {
            qe.p.f(socket);
        }
    }

    @Override // xe.g.d
    public void d(xe.j stream) {
        AbstractC4862t.e(stream, "stream");
        stream.e(xe.b.REFUSED_STREAM, null);
    }

    @Override // ve.d.a
    public E e() {
        return this.f45641e;
    }

    public final boolean f(v vVar, pe.t tVar) {
        List listD = tVar.d();
        if (!listD.isEmpty()) {
            De.d dVar = De.d.f2701a;
            String strH = vVar.h();
            Object obj = listD.get(0);
            AbstractC4862t.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (dVar.e(strH, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    public final void g(y client, E failedRoute, IOException failure) {
        AbstractC4862t.e(client, "client");
        AbstractC4862t.e(failedRoute, "failedRoute");
        AbstractC4862t.e(failure, "failure");
        if (failedRoute.b().type() != Proxy.Type.DIRECT) {
            C5465a c5465aA = failedRoute.a();
            c5465aA.i().connectFailed(c5465aA.l().r(), failedRoute.b().address(), failure);
        }
        client.p().b(failedRoute);
    }

    public final List h() {
        return this.f45657u;
    }

    public final pe.k i() {
        return this.f45649m;
    }

    public final long j() {
        return this.f45658v;
    }

    public final boolean k() {
        return this.f45651o;
    }

    public final int l() {
        return this.f45653q;
    }

    public pe.t m() {
        return this.f45644h;
    }

    public final synchronized void n() {
        this.f45654r++;
    }

    public final boolean o(C5465a address, List list) {
        AbstractC4862t.e(address, "address");
        if (qe.p.f43482e && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f45657u.size() >= this.f45656t || this.f45651o || !e().a().d(address)) {
            return false;
        }
        if (AbstractC4862t.a(address.l().h(), t().a().l().h())) {
            return true;
        }
        if (this.f45650n == null || list == null || !u(list) || address.e() != De.d.f2701a || !A(address.l())) {
            return false;
        }
        try {
            pe.g gVarA = address.a();
            AbstractC4862t.b(gVarA);
            String strH = address.l().h();
            pe.t tVarM = m();
            AbstractC4862t.b(tVarM);
            gVarA.a(strH, tVarM.d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean p(boolean z10) {
        long j10;
        if (qe.p.f43482e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f45642f;
        AbstractC4862t.b(socket);
        Socket socket2 = this.f45643g;
        AbstractC4862t.b(socket2);
        InterfaceC0845g interfaceC0845g = this.f45646j;
        AbstractC4862t.b(interfaceC0845g);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        xe.g gVar = this.f45650n;
        if (gVar != null) {
            return gVar.Q0(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.f45658v;
        }
        if (j10 < 10000000000L || !z10) {
            return true;
        }
        return qe.p.k(socket2, interfaceC0845g);
    }

    public final boolean q() {
        return this.f45650n != null;
    }

    public final ve.d r(y client, ve.g chain) throws SocketException {
        AbstractC4862t.e(client, "client");
        AbstractC4862t.e(chain, "chain");
        Socket socket = this.f45643g;
        AbstractC4862t.b(socket);
        InterfaceC0845g interfaceC0845g = this.f45646j;
        AbstractC4862t.b(interfaceC0845g);
        InterfaceC0844f interfaceC0844f = this.f45647k;
        AbstractC4862t.b(interfaceC0844f);
        xe.g gVar = this.f45650n;
        if (gVar != null) {
            return new xe.h(client, this, chain, gVar);
        }
        socket.setSoTimeout(chain.k());
        K kN = interfaceC0845g.n();
        long jH = chain.h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        kN.g(jH, timeUnit);
        interfaceC0844f.n().g(chain.j(), timeUnit);
        return new C6199b(client, this, interfaceC0845g, interfaceC0844f);
    }

    public final synchronized void s() {
        this.f45652p = true;
    }

    public E t() {
        return e();
    }

    public String toString() {
        Object objA;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(e().a().l().h());
        sb2.append(':');
        sb2.append(e().a().l().m());
        sb2.append(", proxy=");
        sb2.append(e().b());
        sb2.append(" hostAddress=");
        sb2.append(e().d());
        sb2.append(" cipherSuite=");
        pe.t tVar = this.f45644h;
        if (tVar == null || (objA = tVar.a()) == null) {
            objA = MeasurementUnit.NONE;
        }
        sb2.append(objA);
        sb2.append(" protocol=");
        sb2.append(this.f45645i);
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean u(List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            E e10 = (E) it.next();
            Proxy.Type type = e10.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && e().b().type() == type2 && AbstractC4862t.a(e().d(), e10.d())) {
                return true;
            }
        }
        return false;
    }

    public final void v(long j10) {
        this.f45658v = j10;
    }

    public final void w(boolean z10) {
        this.f45651o = z10;
    }

    public Socket x() {
        Socket socket = this.f45643g;
        AbstractC4862t.b(socket);
        return socket;
    }

    public final void y() throws SocketException {
        this.f45658v = System.nanoTime();
        z zVar = this.f45645i;
        if (zVar == z.HTTP_2 || zVar == z.H2_PRIOR_KNOWLEDGE) {
            z();
        }
    }

    public final void z() throws SocketException {
        Socket socket = this.f45643g;
        AbstractC4862t.b(socket);
        InterfaceC0845g interfaceC0845g = this.f45646j;
        AbstractC4862t.b(interfaceC0845g);
        InterfaceC0844f interfaceC0844f = this.f45647k;
        AbstractC4862t.b(interfaceC0844f);
        socket.setSoTimeout(0);
        Object obj = this.f45649m;
        xe.c cVar = obj instanceof xe.c ? (xe.c) obj : null;
        if (cVar == null) {
            cVar = c.a.f48121a;
        }
        xe.g gVarA = new g.b(true, this.f45639c).s(socket, e().a().l().h(), interfaceC0845g, interfaceC0844f).m(this).n(this.f45648l).b(cVar).a();
        this.f45650n = gVarA;
        this.f45656t = xe.g.f48158C.a().d();
        xe.g.o1(gVarA, false, 1, null);
    }
}
