package a2;

import G1.AbstractC0853a;
import L1.B0;
import P1.t;
import a2.InterfaceC2611D;
import a2.L;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: a2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2615a implements InterfaceC2611D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20692a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f20693b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L.a f20694c = new L.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t.a f20695d = new t.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Looper f20696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D1.D f20697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public B0 f20698g;

    public final B0 B() {
        return (B0) AbstractC0853a.i(this.f20698g);
    }

    public final boolean C() {
        return !this.f20693b.isEmpty();
    }

    public abstract void D(I1.x xVar);

    public final void E(D1.D d10) {
        this.f20697f = d10;
        Iterator it = this.f20692a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2611D.c) it.next()).a(this, d10);
        }
    }

    public abstract void F();

    @Override // a2.InterfaceC2611D
    public final void c(Handler handler, L l10) {
        AbstractC0853a.e(handler);
        AbstractC0853a.e(l10);
        this.f20694c.h(handler, l10);
    }

    @Override // a2.InterfaceC2611D
    public final void d(InterfaceC2611D.c cVar) {
        this.f20692a.remove(cVar);
        if (!this.f20692a.isEmpty()) {
            e(cVar);
            return;
        }
        this.f20696e = null;
        this.f20697f = null;
        this.f20698g = null;
        this.f20693b.clear();
        F();
    }

    @Override // a2.InterfaceC2611D
    public final void e(InterfaceC2611D.c cVar) {
        boolean zIsEmpty = this.f20693b.isEmpty();
        this.f20693b.remove(cVar);
        if (zIsEmpty || !this.f20693b.isEmpty()) {
            return;
        }
        z();
    }

    @Override // a2.InterfaceC2611D
    public final void i(L l10) {
        this.f20694c.x(l10);
    }

    @Override // a2.InterfaceC2611D
    public final void j(InterfaceC2611D.c cVar) {
        AbstractC0853a.e(this.f20696e);
        boolean zIsEmpty = this.f20693b.isEmpty();
        this.f20693b.add(cVar);
        if (zIsEmpty) {
            A();
        }
    }

    @Override // a2.InterfaceC2611D
    public final void l(Handler handler, P1.t tVar) {
        AbstractC0853a.e(handler);
        AbstractC0853a.e(tVar);
        this.f20695d.g(handler, tVar);
    }

    @Override // a2.InterfaceC2611D
    public final void m(InterfaceC2611D.c cVar, I1.x xVar, B0 b02) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f20696e;
        AbstractC0853a.a(looper == null || looper == looperMyLooper);
        this.f20698g = b02;
        D1.D d10 = this.f20697f;
        this.f20692a.add(cVar);
        if (this.f20696e == null) {
            this.f20696e = looperMyLooper;
            this.f20693b.add(cVar);
            D(xVar);
        } else if (d10 != null) {
            j(cVar);
            cVar.a(this, d10);
        }
    }

    @Override // a2.InterfaceC2611D
    public final void r(P1.t tVar) {
        this.f20695d.n(tVar);
    }

    public final t.a u(int i10, InterfaceC2611D.b bVar) {
        return this.f20695d.o(i10, bVar);
    }

    public final t.a v(InterfaceC2611D.b bVar) {
        return this.f20695d.o(0, bVar);
    }

    public final L.a x(int i10, InterfaceC2611D.b bVar) {
        return this.f20694c.A(i10, bVar);
    }

    public final L.a y(InterfaceC2611D.b bVar) {
        return this.f20694c.A(0, bVar);
    }

    public void A() {
    }

    public void z() {
    }
}
