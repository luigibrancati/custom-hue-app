package ue;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import pe.E;
import pe.v;
import pe.z;

/* JADX INFO: renamed from: ue.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6021a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f45553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pe.k f45554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ve.g f45555c;

    public C6021a(k call, pe.k poolConnectionListener, ve.g chain) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(poolConnectionListener, "poolConnectionListener");
        AbstractC4862t.e(chain, "chain");
        this.f45553a = call;
        this.f45554b = poolConnectionListener;
        this.f45555c = chain;
    }

    @Override // ue.d
    public void a(pe.j connection, E route) {
        AbstractC4862t.e(connection, "connection");
        AbstractC4862t.e(route, "route");
        this.f45554b.b(connection, route, this.f45553a);
    }

    @Override // ue.d
    public void b(E route, z zVar, IOException e10) {
        AbstractC4862t.e(route, "route");
        AbstractC4862t.e(e10, "e");
        y().i(this.f45553a, route.d(), route.b(), null, e10);
        this.f45554b.c(route, this.f45553a, e10);
    }

    @Override // ue.d
    public boolean c() {
        return this.f45553a.c();
    }

    @Override // ue.d
    public void d(l connection) {
        AbstractC4862t.e(connection, "connection");
        connection.i().e(connection, this.f45553a);
    }

    @Override // ue.d
    public void e(E route) {
        AbstractC4862t.e(route, "route");
        this.f45553a.p().p().a(route);
    }

    @Override // ue.d
    public void f(l connection) {
        AbstractC4862t.e(connection, "connection");
        connection.i().f(connection);
    }

    @Override // ue.d
    public void g(String socketHost, List result) {
        AbstractC4862t.e(socketHost, "socketHost");
        AbstractC4862t.e(result, "result");
        y().m(this.f45553a, socketHost, result);
    }

    @Override // ue.d
    public void h(pe.j connection) {
        AbstractC4862t.e(connection, "connection");
        y().l(this.f45553a, connection);
    }

    @Override // ue.d
    public void i(pe.j connection) {
        AbstractC4862t.e(connection, "connection");
        y().k(this.f45553a, connection);
    }

    @Override // ue.d
    public void j(E route, z zVar) {
        AbstractC4862t.e(route, "route");
        y().h(this.f45553a, route.d(), route.b(), zVar);
    }

    @Override // ue.d
    public void k(l connection) {
        AbstractC4862t.e(connection, "connection");
        this.f45553a.g(connection);
    }

    @Override // ue.d
    public void l(v url, List proxies) {
        AbstractC4862t.e(url, "url");
        AbstractC4862t.e(proxies, "proxies");
        y().o(this.f45553a, url, proxies);
    }

    @Override // ue.d
    public void m(l connection) {
        AbstractC4862t.e(connection, "connection");
        connection.i().h(connection);
    }

    @Override // ue.d
    public boolean n() {
        return !AbstractC4862t.a(this.f45555c.i().i(), "GET");
    }

    @Override // ue.d
    public void o(l connection) {
        AbstractC4862t.e(connection, "connection");
        connection.i().g(connection, this.f45553a);
    }

    @Override // ue.d
    public void p(E route) {
        AbstractC4862t.e(route, "route");
        y().j(this.f45553a, route.d(), route.b());
        this.f45554b.d(route, this.f45553a);
    }

    @Override // ue.d
    public void q(pe.t tVar) {
        y().B(this.f45553a, tVar);
    }

    @Override // ue.d
    public void r(c connectPlan) {
        AbstractC4862t.e(connectPlan, "connectPlan");
        this.f45553a.v().add(connectPlan);
    }

    @Override // ue.d
    public void s(String socketHost) {
        AbstractC4862t.e(socketHost, "socketHost");
        y().n(this.f45553a, socketHost);
    }

    @Override // ue.d
    public void t(c connectPlan) {
        AbstractC4862t.e(connectPlan, "connectPlan");
        this.f45553a.v().remove(connectPlan);
    }

    @Override // ue.d
    public void u() {
        y().C(this.f45553a);
    }

    @Override // ue.d
    public Socket v() {
        return this.f45553a.B();
    }

    @Override // ue.d
    public l w() {
        return this.f45553a.q();
    }

    @Override // ue.d
    public void x(v url) {
        AbstractC4862t.e(url, "url");
        y().p(this.f45553a, url);
    }

    public final pe.s y() {
        return this.f45553a.r();
    }
}
