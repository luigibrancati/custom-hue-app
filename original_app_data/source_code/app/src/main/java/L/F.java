package L;

import E.C0781c0;
import E.InterfaceC0802n;
import K.InterfaceC0967i;
import L.a1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface F extends InterfaceC0802n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f7895a = new b();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements InterfaceC0967i {
        public a() {
        }

        @Override // K.InterfaceC0967i
        public O7.e a() {
            return O.n.p(null);
        }

        @Override // K.InterfaceC0967i
        public O7.e b() {
            return O.n.p(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C1118q f7897a;

        public c(C1118q c1118q) {
            this.f7897a = c1118q;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        void a();

        void b(List list);
    }

    void a(a1.b bVar);

    void b();

    O7.e d(List list, int i10, int i11);

    void f(int i10);

    void g(InterfaceC1099g0 interfaceC1099g0);

    InterfaceC1099g0 i();

    default O7.e l(int i10, int i11) {
        return O.n.p(new a());
    }

    void m();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements F {
        @Override // E.InterfaceC0802n
        public O7.e c(float f10) {
            return O.n.p(null);
        }

        @Override // L.F
        public O7.e d(List list, int i10, int i11) {
            return O.n.p(Collections.EMPTY_LIST);
        }

        @Override // E.InterfaceC0802n
        public O7.e e(float f10) {
            return O.n.p(null);
        }

        @Override // E.InterfaceC0802n
        public O7.e h(boolean z10) {
            return O.n.p(null);
        }

        @Override // L.F
        public InterfaceC1099g0 i() {
            return null;
        }

        @Override // E.InterfaceC0802n
        public O7.e k(E.L l10) {
            return O.n.p(E.M.b());
        }

        @Override // L.F
        public void b() {
        }

        @Override // L.F
        public void m() {
        }

        @Override // L.F
        public void a(a1.b bVar) {
        }

        @Override // L.F
        public void f(int i10) {
        }

        @Override // L.F
        public void g(InterfaceC1099g0 interfaceC1099g0) {
        }
    }

    default void j(C0781c0.i iVar) {
    }
}
