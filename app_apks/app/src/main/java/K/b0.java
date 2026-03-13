package K;

import E.AbstractC0807p0;
import E.C0785e0;
import K.X;
import K.h0;
import L.C1095e0;
import android.util.Log;
import androidx.camera.core.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class b0 implements X, b.a, h0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0981x f6588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0982y f6589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public U f6590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f6591e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deque f6587a = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6592f = false;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements O.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0968j f6593a;

        public a(C0968j c0968j) {
            this.f6593a = c0968j;
        }

        @Override // O.c
        public void a(Throwable th) {
            if (this.f6593a.b()) {
                return;
            }
            int iF = ((C1095e0) this.f6593a.a().get(0)).f();
            if (th instanceof C0785e0) {
                b0.this.f6589c.j(X.a.c(iF, (C0785e0) th));
            } else {
                b0.this.f6589c.j(X.a.c(iF, new C0785e0(2, "Failed to submit capture request", th)));
            }
            b0.this.f6588b.c();
        }

        @Override // O.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            b0.this.f6588b.c();
        }
    }

    public b0(InterfaceC0981x interfaceC0981x) {
        M.x.b();
        this.f6588b = interfaceC0981x;
        this.f6591e = new ArrayList();
    }

    public static /* synthetic */ void f(b0 b0Var) {
        b0Var.f6590d = null;
        b0Var.h();
    }

    @Override // androidx.camera.core.b.a
    public void a(androidx.camera.core.d dVar) {
        N.a.d().execute(new Runnable() { // from class: K.Y
            @Override // java.lang.Runnable
            public final void run() {
                this.f6574a.h();
            }
        });
    }

    @Override // K.X
    public void b() {
        M.x.b();
        C0785e0 c0785e0 = new C0785e0(3, "Camera is closed.", null);
        Iterator it = this.f6587a.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).u(c0785e0);
        }
        this.f6587a.clear();
        Iterator it2 = new ArrayList(this.f6591e).iterator();
        while (it2.hasNext()) {
            ((U) it2.next()).l(c0785e0);
        }
    }

    @Override // K.X
    public void c(C0982y c0982y) {
        M.x.b();
        this.f6589c = c0982y;
        c0982y.k(this);
    }

    @Override // K.h0.a
    public void d(h0 h0Var) {
        M.x.b();
        AbstractC0807p0.a("TakePictureManagerImpl", "Add a new request for retrying.");
        this.f6587a.addFirst(h0Var);
        h();
    }

    public boolean g() {
        return this.f6590d != null;
    }

    public void h() {
        M.x.b();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (g()) {
            Log.d("TakePictureManagerImpl", "There is already a request in-flight.");
            return;
        }
        if (this.f6592f) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        if (this.f6589c.h() == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        h0 h0Var = (h0) this.f6587a.poll();
        if (h0Var == null) {
            Log.d("TakePictureManagerImpl", "No new request.");
            return;
        }
        U u10 = new U(h0Var, this);
        j(u10);
        X0.d dVarE = this.f6589c.e(h0Var, u10, u10.o());
        C0968j c0968j = (C0968j) dVarE.f17986a;
        Objects.requireNonNull(c0968j);
        Q q10 = (Q) dVarE.f17987b;
        Objects.requireNonNull(q10);
        this.f6589c.m(q10);
        u10.s(i(c0968j));
    }

    public final O7.e i(C0968j c0968j) {
        M.x.b();
        this.f6588b.b();
        O7.e eVarA = this.f6588b.a(c0968j.a());
        O.n.j(eVarA, new a(c0968j), N.a.d());
        return eVarA;
    }

    public final void j(final U u10) {
        X0.h.i(!g());
        this.f6590d = u10;
        u10.o().b(new Runnable() { // from class: K.Z
            @Override // java.lang.Runnable
            public final void run() {
                b0.f(this.f6575a);
            }
        }, N.a.a());
        this.f6591e.add(u10);
        u10.p().b(new Runnable() { // from class: K.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6578a.f6591e.remove(u10);
            }
        }, N.a.a());
    }

    @Override // K.X
    public void pause() {
        M.x.b();
        this.f6592f = true;
        U u10 = this.f6590d;
        if (u10 != null) {
            u10.m();
        }
    }

    @Override // K.X
    public void resume() {
        M.x.b();
        this.f6592f = false;
        h();
    }
}
