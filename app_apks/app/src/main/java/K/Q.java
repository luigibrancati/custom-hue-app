package K;

import E.C0781c0;
import E.C0785e0;
import L.InterfaceC1093d0;
import L.InterfaceC1097f0;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h0 f6541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f6542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix f6545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final W f6546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f6548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final O7.e f6549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6550k = -1;

    public Q(InterfaceC1093d0 interfaceC1093d0, h0 h0Var, W w10, O7.e eVar, int i10) {
        this.f6540a = i10;
        this.f6541b = h0Var;
        h0Var.l();
        h0Var.n();
        this.f6544e = h0Var.j();
        this.f6543d = h0Var.m();
        this.f6542c = h0Var.h();
        this.f6545f = h0Var.o();
        this.f6546g = w10;
        this.f6547h = String.valueOf(interfaceC1093d0.hashCode());
        this.f6548i = new ArrayList();
        List listA = interfaceC1093d0.a();
        Objects.requireNonNull(listA);
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            this.f6548i.add(Integer.valueOf(((InterfaceC1097f0) it.next()).getId()));
        }
        this.f6549j = eVar;
    }

    public O7.e a() {
        return this.f6549j;
    }

    public Rect b() {
        return this.f6542c;
    }

    public int c() {
        return this.f6544e;
    }

    public C0781c0.g d() {
        return null;
    }

    public int e() {
        return this.f6540a;
    }

    public int f() {
        return this.f6543d;
    }

    public C0781c0.g g() {
        return null;
    }

    public Matrix h() {
        return this.f6545f;
    }

    public List i() {
        return this.f6548i;
    }

    public String j() {
        return this.f6547h;
    }

    public h0 k() {
        return this.f6541b;
    }

    public boolean l() {
        return this.f6546g.isAborted();
    }

    public boolean m() {
        d();
        g();
        return true;
    }

    public void n(C0785e0 c0785e0) {
        this.f6546g.b(c0785e0);
    }

    public void o(int i10) {
        if (this.f6550k != i10) {
            this.f6550k = i10;
            this.f6546g.d(i10);
        }
    }

    public void p() {
        this.f6546g.h();
    }

    public void q(C0781c0.h hVar) {
        this.f6546g.a(hVar);
    }

    public void r(androidx.camera.core.d dVar) {
        this.f6546g.c(dVar);
    }

    public void s() {
        if (this.f6550k != -1) {
            o(100);
        }
        this.f6546g.e();
    }

    public void t(Bitmap bitmap) {
        this.f6546g.f(bitmap);
    }

    public void u(C0785e0 c0785e0) {
        this.f6546g.g(c0785e0);
    }
}
