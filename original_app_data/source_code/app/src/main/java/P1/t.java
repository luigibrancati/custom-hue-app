package P1;

import G1.AbstractC0853a;
import G1.M;
import P1.t;
import a2.InterfaceC2611D;
import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface t {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC2611D.b f12671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList f12672c;

        /* JADX INFO: renamed from: P1.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0166a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f12673a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public t f12674b;

            public C0166a(Handler handler, t tVar) {
                this.f12673a = handler;
                this.f12674b = tVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void g(Handler handler, t tVar) {
            AbstractC0853a.e(handler);
            AbstractC0853a.e(tVar);
            this.f12672c.add(new C0166a(handler, tVar));
        }

        public void h() {
            for (C0166a c0166a : this.f12672c) {
                final t tVar = c0166a.f12674b;
                M.W0(c0166a.f12673a, new Runnable() { // from class: P1.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f12668a;
                        tVar.B(aVar.f12670a, aVar.f12671b);
                    }
                });
            }
        }

        public void i() {
            for (C0166a c0166a : this.f12672c) {
                final t tVar = c0166a.f12674b;
                M.W0(c0166a.f12673a, new Runnable() { // from class: P1.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f12664a;
                        tVar.A(aVar.f12670a, aVar.f12671b);
                    }
                });
            }
        }

        public void j() {
            for (C0166a c0166a : this.f12672c) {
                final t tVar = c0166a.f12674b;
                M.W0(c0166a.f12673a, new Runnable() { // from class: P1.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f12666a;
                        tVar.z(aVar.f12670a, aVar.f12671b);
                    }
                });
            }
        }

        public void k(final int i10) {
            for (C0166a c0166a : this.f12672c) {
                final t tVar = c0166a.f12674b;
                M.W0(c0166a.f12673a, new Runnable() { // from class: P1.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f12659a;
                        tVar.K(aVar.f12670a, aVar.f12671b, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            for (C0166a c0166a : this.f12672c) {
                final t tVar = c0166a.f12674b;
                M.W0(c0166a.f12673a, new Runnable() { // from class: P1.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f12656a;
                        tVar.u(aVar.f12670a, aVar.f12671b, exc);
                    }
                });
            }
        }

        public void m() {
            for (C0166a c0166a : this.f12672c) {
                final t tVar = c0166a.f12674b;
                M.W0(c0166a.f12673a, new Runnable() { // from class: P1.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f12662a;
                        tVar.J(aVar.f12670a, aVar.f12671b);
                    }
                });
            }
        }

        public void n(t tVar) {
            for (C0166a c0166a : this.f12672c) {
                if (c0166a.f12674b == tVar) {
                    this.f12672c.remove(c0166a);
                }
            }
        }

        public a o(int i10, InterfaceC2611D.b bVar) {
            return new a(this.f12672c, i10, bVar);
        }

        public a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, InterfaceC2611D.b bVar) {
            this.f12672c = copyOnWriteArrayList;
            this.f12670a = i10;
            this.f12671b = bVar;
        }
    }

    void A(int i10, InterfaceC2611D.b bVar);

    void B(int i10, InterfaceC2611D.b bVar);

    void J(int i10, InterfaceC2611D.b bVar);

    void K(int i10, InterfaceC2611D.b bVar, int i11);

    void u(int i10, InterfaceC2611D.b bVar, Exception exc);

    void z(int i10, InterfaceC2611D.b bVar);
}
