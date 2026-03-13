package ue;

import gc.C4205s;
import gc.C4206t;
import gc.y;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import pe.C5465a;
import pe.E;
import pe.v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f45693i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5465a f45694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f45695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f45696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f45697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f45698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f45700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f45701h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            AbstractC4862t.e(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                AbstractC4862t.d(hostName, "getHostName(...)");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            AbstractC4862t.d(hostAddress, "getHostAddress(...)");
            return hostAddress;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f45702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45703b;

        public b(List routes) {
            AbstractC4862t.e(routes, "routes");
            this.f45702a = routes;
        }

        public final List a() {
            return this.f45702a;
        }

        public final boolean b() {
            return this.f45703b < this.f45702a.size();
        }

        public final E c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List list = this.f45702a;
            int i10 = this.f45703b;
            this.f45703b = i10 + 1;
            return (E) list.get(i10);
        }
    }

    public s(C5465a address, q routeDatabase, d connectionUser, boolean z10) {
        AbstractC4862t.e(address, "address");
        AbstractC4862t.e(routeDatabase, "routeDatabase");
        AbstractC4862t.e(connectionUser, "connectionUser");
        this.f45694a = address;
        this.f45695b = routeDatabase;
        this.f45696c = connectionUser;
        this.f45697d = z10;
        this.f45698e = C4206t.k();
        this.f45700g = C4206t.k();
        this.f45701h = new ArrayList();
        f(address.l(), address.g());
    }

    public static final List g(Proxy proxy, v vVar, s sVar) {
        if (proxy != null) {
            return C4205s.d(proxy);
        }
        URI uriR = vVar.r();
        if (uriR.getHost() == null) {
            return qe.p.j(Proxy.NO_PROXY);
        }
        List<Proxy> listSelect = sVar.f45694a.i().select(uriR);
        if (listSelect == null || listSelect.isEmpty()) {
            return qe.p.j(Proxy.NO_PROXY);
        }
        AbstractC4862t.b(listSelect);
        return qe.p.s(listSelect);
    }

    public final boolean a() {
        return b() || !this.f45701h.isEmpty();
    }

    public final boolean b() {
        return this.f45699f < this.f45698e.size();
    }

    public final b c() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            Iterator it = this.f45700g.iterator();
            while (it.hasNext()) {
                E e10 = new E(this.f45694a, proxyD, (InetSocketAddress) it.next());
                if (this.f45695b.c(e10)) {
                    this.f45701h.add(e10);
                } else {
                    arrayList.add(e10);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            y.C(arrayList, this.f45701h);
            this.f45701h.clear();
        }
        return new b(arrayList);
    }

    public final Proxy d() throws SocketException, UnknownHostException {
        if (b()) {
            List list = this.f45698e;
            int i10 = this.f45699f;
            this.f45699f = i10 + 1;
            Proxy proxy = (Proxy) list.get(i10);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f45694a.l().h() + "; exhausted proxy configurations: " + this.f45698e);
    }

    public final void e(Proxy proxy) throws SocketException, UnknownHostException {
        String strH;
        int iM;
        List listA;
        ArrayList arrayList = new ArrayList();
        this.f45700g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strH = this.f45694a.l().h();
            iM = this.f45694a.l().m();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
            }
            a aVar = f45693i;
            AbstractC4862t.b(socketAddressAddress);
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strH = aVar.a(inetSocketAddress);
            iM = inetSocketAddress.getPort();
        }
        if (1 > iM || iM >= 65536) {
            throw new SocketException("No route to " + strH + ':' + iM + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strH, iM));
            return;
        }
        if (qe.f.a(strH)) {
            listA = C4205s.d(InetAddress.getByName(strH));
        } else {
            this.f45696c.s(strH);
            listA = this.f45694a.c().a(strH);
            if (listA.isEmpty()) {
                throw new UnknownHostException(this.f45694a.c() + " returned no addresses for " + strH);
            }
            this.f45696c.g(strH, listA);
        }
        if (this.f45697d) {
            listA = j.a(listA);
        }
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), iM));
        }
    }

    public final void f(v vVar, Proxy proxy) {
        this.f45696c.x(vVar);
        List listG = g(proxy, vVar, this);
        this.f45698e = listG;
        this.f45699f = 0;
        this.f45696c.l(vVar, listG);
    }
}
