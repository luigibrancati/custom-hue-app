package pe;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC4862t;
import pe.v;

/* JADX INFO: renamed from: pe.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5465a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f42600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SocketFactory f42601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f42602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f42603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f42604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC5466b f42605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Proxy f42606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ProxySelector f42607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v f42608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f42609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f42610k;

    public C5465a(String uriHost, int i10, r dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, InterfaceC5466b proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        AbstractC4862t.e(uriHost, "uriHost");
        AbstractC4862t.e(dns, "dns");
        AbstractC4862t.e(socketFactory, "socketFactory");
        AbstractC4862t.e(proxyAuthenticator, "proxyAuthenticator");
        AbstractC4862t.e(protocols, "protocols");
        AbstractC4862t.e(connectionSpecs, "connectionSpecs");
        AbstractC4862t.e(proxySelector, "proxySelector");
        this.f42600a = dns;
        this.f42601b = socketFactory;
        this.f42602c = sSLSocketFactory;
        this.f42603d = hostnameVerifier;
        this.f42604e = gVar;
        this.f42605f = proxyAuthenticator;
        this.f42606g = proxy;
        this.f42607h = proxySelector;
        this.f42608i = new v.a().s(sSLSocketFactory != null ? "https" : "http").f(uriHost).m(i10).a();
        this.f42609j = qe.p.s(protocols);
        this.f42610k = qe.p.s(connectionSpecs);
    }

    public final g a() {
        return this.f42604e;
    }

    public final List b() {
        return this.f42610k;
    }

    public final r c() {
        return this.f42600a;
    }

    public final boolean d(C5465a that) {
        AbstractC4862t.e(that, "that");
        return AbstractC4862t.a(this.f42600a, that.f42600a) && AbstractC4862t.a(this.f42605f, that.f42605f) && AbstractC4862t.a(this.f42609j, that.f42609j) && AbstractC4862t.a(this.f42610k, that.f42610k) && AbstractC4862t.a(this.f42607h, that.f42607h) && AbstractC4862t.a(this.f42606g, that.f42606g) && AbstractC4862t.a(this.f42602c, that.f42602c) && AbstractC4862t.a(this.f42603d, that.f42603d) && AbstractC4862t.a(this.f42604e, that.f42604e) && this.f42608i.m() == that.f42608i.m();
    }

    public final HostnameVerifier e() {
        return this.f42603d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5465a)) {
            return false;
        }
        C5465a c5465a = (C5465a) obj;
        return AbstractC4862t.a(this.f42608i, c5465a.f42608i) && d(c5465a);
    }

    public final List f() {
        return this.f42609j;
    }

    public final Proxy g() {
        return this.f42606g;
    }

    public final InterfaceC5466b h() {
        return this.f42605f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f42608i.hashCode()) * 31) + this.f42600a.hashCode()) * 31) + this.f42605f.hashCode()) * 31) + this.f42609j.hashCode()) * 31) + this.f42610k.hashCode()) * 31) + this.f42607h.hashCode()) * 31) + Objects.hashCode(this.f42606g)) * 31) + Objects.hashCode(this.f42602c)) * 31) + Objects.hashCode(this.f42603d)) * 31) + Objects.hashCode(this.f42604e);
    }

    public final ProxySelector i() {
        return this.f42607h;
    }

    public final SocketFactory j() {
        return this.f42601b;
    }

    public final SSLSocketFactory k() {
        return this.f42602c;
    }

    public final v l() {
        return this.f42608i;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f42608i.h());
        sb3.append(':');
        sb3.append(this.f42608i.m());
        sb3.append(", ");
        if (this.f42606g != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f42606g;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f42607h;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append('}');
        return sb3.toString();
    }
}
