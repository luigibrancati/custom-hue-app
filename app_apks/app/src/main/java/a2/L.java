package a2;

import G1.AbstractC0853a;
import G1.InterfaceC0864l;
import a2.InterfaceC2611D;
import a2.L;
import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface L {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC2611D.b f20550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList f20551c;

        /* JADX INFO: renamed from: a2.L$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0263a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f20552a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public L f20553b;

            public C0263a(Handler handler, L l10) {
                this.f20552a = handler;
                this.f20553b = l10;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public a A(int i10, InterfaceC2611D.b bVar) {
            return new a(this.f20551c, i10, bVar);
        }

        public void h(Handler handler, L l10) {
            AbstractC0853a.e(handler);
            AbstractC0853a.e(l10);
            this.f20551c.add(new C0263a(handler, l10));
        }

        public void i(final InterfaceC0864l interfaceC0864l) {
            for (C0263a c0263a : this.f20551c) {
                final L l10 = c0263a.f20553b;
                G1.M.W0(c0263a.f20552a, new Runnable() { // from class: a2.K
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC0864l.accept(l10);
                    }
                });
            }
        }

        public void j(int i10, D1.o oVar, int i11, Object obj, long j10) {
            k(new C2609B(1, i10, oVar, i11, obj, G1.M.o1(j10), -9223372036854775807L));
        }

        public void k(final C2609B c2609b) {
            i(new InterfaceC0864l() { // from class: a2.E
                @Override // G1.InterfaceC0864l
                public final void accept(Object obj) {
                    L.a aVar = this.f20527a;
                    ((L) obj).I(aVar.f20549a, aVar.f20550b, c2609b);
                }
            });
        }

        public void l(C2638y c2638y, int i10) {
            m(c2638y, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void m(C2638y c2638y, int i10, int i11, D1.o oVar, int i12, Object obj, long j10, long j11) {
            n(c2638y, new C2609B(i10, i11, oVar, i12, obj, G1.M.o1(j10), G1.M.o1(j11)));
        }

        public void n(final C2638y c2638y, final C2609B c2609b) {
            i(new InterfaceC0864l() { // from class: a2.I
                @Override // G1.InterfaceC0864l
                public final void accept(Object obj) {
                    L.a aVar = this.f20541a;
                    ((L) obj).L(aVar.f20549a, aVar.f20550b, c2638y, c2609b);
                }
            });
        }

        public void o(C2638y c2638y, int i10) {
            p(c2638y, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void p(C2638y c2638y, int i10, int i11, D1.o oVar, int i12, Object obj, long j10, long j11) {
            q(c2638y, new C2609B(i10, i11, oVar, i12, obj, G1.M.o1(j10), G1.M.o1(j11)));
        }

        public void q(final C2638y c2638y, final C2609B c2609b) {
            i(new InterfaceC0864l() { // from class: a2.G
                @Override // G1.InterfaceC0864l
                public final void accept(Object obj) {
                    L.a aVar = this.f20533a;
                    ((L) obj).E(aVar.f20549a, aVar.f20550b, c2638y, c2609b);
                }
            });
        }

        public void r(C2638y c2638y, int i10, int i11, D1.o oVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            t(c2638y, new C2609B(i10, i11, oVar, i12, obj, G1.M.o1(j10), G1.M.o1(j11)), iOException, z10);
        }

        public void s(C2638y c2638y, int i10, IOException iOException, boolean z10) {
            r(c2638y, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        public void t(final C2638y c2638y, final C2609B c2609b, final IOException iOException, final boolean z10) {
            i(new InterfaceC0864l() { // from class: a2.H
                @Override // G1.InterfaceC0864l
                public final void accept(Object obj) {
                    L.a aVar = this.f20536a;
                    ((L) obj).F(aVar.f20549a, aVar.f20550b, c2638y, c2609b, iOException, z10);
                }
            });
        }

        public void u(C2638y c2638y, int i10, int i11) {
            v(c2638y, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i11);
        }

        public void v(C2638y c2638y, int i10, int i11, D1.o oVar, int i12, Object obj, long j10, long j11, int i13) {
            w(c2638y, new C2609B(i10, i11, oVar, i12, obj, G1.M.o1(j10), G1.M.o1(j11)), i13);
        }

        public void w(final C2638y c2638y, final C2609B c2609b, final int i10) {
            i(new InterfaceC0864l() { // from class: a2.F
                @Override // G1.InterfaceC0864l
                public final void accept(Object obj) {
                    L.a aVar = this.f20529a;
                    ((L) obj).v(aVar.f20549a, aVar.f20550b, c2638y, c2609b, i10);
                }
            });
        }

        public void x(L l10) {
            for (C0263a c0263a : this.f20551c) {
                if (c0263a.f20553b == l10) {
                    this.f20551c.remove(c0263a);
                }
            }
        }

        public void y(int i10, long j10, long j11) {
            z(new C2609B(1, i10, null, 3, null, G1.M.o1(j10), G1.M.o1(j11)));
        }

        public void z(final C2609B c2609b) {
            final InterfaceC2611D.b bVar = (InterfaceC2611D.b) AbstractC0853a.e(this.f20550b);
            i(new InterfaceC0864l() { // from class: a2.J
                @Override // G1.InterfaceC0864l
                public final void accept(Object obj) {
                    L l10 = (L) obj;
                    l10.H(this.f20544a.f20549a, bVar, c2609b);
                }
            });
        }

        public a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, InterfaceC2611D.b bVar) {
            this.f20551c = copyOnWriteArrayList;
            this.f20549a = i10;
            this.f20550b = bVar;
        }
    }

    void E(int i10, InterfaceC2611D.b bVar, C2638y c2638y, C2609B c2609b);

    void F(int i10, InterfaceC2611D.b bVar, C2638y c2638y, C2609B c2609b, IOException iOException, boolean z10);

    void H(int i10, InterfaceC2611D.b bVar, C2609B c2609b);

    void I(int i10, InterfaceC2611D.b bVar, C2609B c2609b);

    void L(int i10, InterfaceC2611D.b bVar, C2638y c2638y, C2609B c2609b);

    void v(int i10, InterfaceC2611D.b bVar, C2638y c2638y, C2609B c2609b, int i11);
}
