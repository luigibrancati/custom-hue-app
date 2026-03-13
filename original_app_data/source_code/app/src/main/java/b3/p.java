package b3;

import b3.AbstractC2802a;
import b3.t;
import b3.x;
import e3.C3927a;
import e3.C3928b;
import e3.C3929c;
import fc.C4015H;
import gc.C4179C;
import gc.C4206t;
import java.util.List;
import k3.InterfaceC4792b;
import k3.InterfaceC4793c;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4877c;
import l3.InterfaceC4878d;
import lc.InterfaceC4988e;
import n3.C5082b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC2802a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2804c f25194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f25195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f25196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d3.e f25197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC4877c f25198h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends x {
        public a() {
            super(-1, "", "");
        }

        @Override // b3.x
        public void a(InterfaceC4792b connection) {
            AbstractC4862t.e(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // b3.x
        public void b(InterfaceC4792b connection) {
            AbstractC4862t.e(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // b3.x
        public void f(InterfaceC4792b connection) {
            AbstractC4862t.e(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // b3.x
        public void g(InterfaceC4792b connection) {
            AbstractC4862t.e(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // b3.x
        public void h(InterfaceC4792b connection) {
            AbstractC4862t.e(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // b3.x
        public void i(InterfaceC4792b connection) {
            AbstractC4862t.e(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // b3.x
        public x.a j(InterfaceC4792b connection) {
            AbstractC4862t.e(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b extends InterfaceC4878d.a {
        public b(int i10) {
            super(i10);
        }

        @Override // l3.InterfaceC4878d.a
        public void d(InterfaceC4877c db2) {
            AbstractC4862t.e(db2, "db");
            p.this.x(new C3927a(db2));
        }

        @Override // l3.InterfaceC4878d.a
        public void e(InterfaceC4877c db2, int i10, int i11) {
            AbstractC4862t.e(db2, "db");
            g(db2, i10, i11);
        }

        @Override // l3.InterfaceC4878d.a
        public void f(InterfaceC4877c db2) {
            AbstractC4862t.e(db2, "db");
            p.this.z(new C3927a(db2));
            p.this.f25198h = db2;
        }

        @Override // l3.InterfaceC4878d.a
        public void g(InterfaceC4877c db2, int i10, int i11) {
            AbstractC4862t.e(db2, "db");
            p.this.y(new C3927a(db2), i10, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends t.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ vc.l f25200a;

        public c(vc.l lVar) {
            this.f25200a = lVar;
        }

        @Override // b3.t.b
        public void f(InterfaceC4877c db2) {
            AbstractC4862t.e(db2, "db");
            this.f25200a.invoke(db2);
        }
    }

    public p(C2804c config, x openDelegate) {
        d3.e eVarB;
        AbstractC4862t.e(config, "config");
        AbstractC4862t.e(openDelegate, "openDelegate");
        this.f25194d = config;
        this.f25195e = openDelegate;
        List list = config.f25159e;
        this.f25196f = list == null ? C4206t.k() : list;
        InterfaceC4793c interfaceC4793c = config.f25175u;
        if (interfaceC4793c != null) {
            if (interfaceC4793c instanceof C5082b) {
                AbstractC2802a.b bVar = new AbstractC2802a.b(this, interfaceC4793c);
                String str = config.f25156b;
                eVarB = new d3.b(bVar, str != null ? str : ":memory:");
            } else {
                eVarB = config.f25156b == null ? d3.k.b(new AbstractC2802a.b(this, interfaceC4793c), ":memory:") : d3.k.a(new AbstractC2802a.b(this, interfaceC4793c), config.f25156b, p(config.f25161g), q(config.f25161g));
            }
            this.f25197g = eVarB;
        } else {
            if (config.f25157c == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            this.f25197g = new C3928b(new C3929c(config.f25157c.a(InterfaceC4878d.b.f39842f.a(config.f25155a).d(config.f25156b).c(new b(openDelegate.e())).b())));
        }
        H();
    }

    public static final C4015H D(p pVar, InterfaceC4877c db2) {
        AbstractC4862t.e(db2, "db");
        pVar.f25198h = db2;
        return C4015H.f34254a;
    }

    @Override // b3.AbstractC2802a
    public String A(String fileName) {
        AbstractC4862t.e(fileName, "fileName");
        if (AbstractC4862t.a(fileName, ":memory:")) {
            return fileName;
        }
        String absolutePath = o().f25155a.getDatabasePath(fileName).getAbsolutePath();
        AbstractC4862t.b(absolutePath);
        return absolutePath;
    }

    public final void F() {
        this.f25197g.close();
    }

    public final InterfaceC4878d G() {
        C3929c c3929cB;
        d3.e eVar = this.f25197g;
        C3928b c3928b = eVar instanceof C3928b ? (C3928b) eVar : null;
        if (c3928b == null || (c3929cB = c3928b.b()) == null) {
            return null;
        }
        return c3929cB.b();
    }

    public final void H() {
        boolean z10 = o().f25161g == t.d.WRITE_AHEAD_LOGGING;
        InterfaceC4878d interfaceC4878dG = G();
        if (interfaceC4878dG != null) {
            interfaceC4878dG.setWriteAheadLoggingEnabled(z10);
        }
    }

    public final C2804c I(C2804c c2804c, vc.l lVar) {
        List listK = c2804c.f25159e;
        if (listK == null) {
            listK = C4206t.k();
        }
        return C2804c.b(c2804c, null, null, null, null, C4179C.D0(listK, new c(lVar)), false, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, 4194287, null);
    }

    public final boolean J() {
        InterfaceC4877c interfaceC4877c = this.f25198h;
        if (interfaceC4877c != null) {
            return interfaceC4877c.isOpen();
        }
        return false;
    }

    public Object K(boolean z10, vc.p pVar, InterfaceC4988e interfaceC4988e) {
        return this.f25197g.O0(z10, pVar, interfaceC4988e);
    }

    @Override // b3.AbstractC2802a
    public List n() {
        return this.f25196f;
    }

    @Override // b3.AbstractC2802a
    public C2804c o() {
        return this.f25194d;
    }

    @Override // b3.AbstractC2802a
    public x r() {
        return this.f25195e;
    }

    public p(C2804c config, vc.l supportOpenHelperFactory) {
        AbstractC4862t.e(config, "config");
        AbstractC4862t.e(supportOpenHelperFactory, "supportOpenHelperFactory");
        this.f25194d = config;
        this.f25195e = new a();
        List list = config.f25159e;
        this.f25196f = list == null ? C4206t.k() : list;
        this.f25197g = new C3928b(new C3929c((InterfaceC4878d) supportOpenHelperFactory.invoke(I(config, new vc.l() { // from class: b3.o
            @Override // vc.l
            public final Object invoke(Object obj) {
                return p.D(this.f25193a, (InterfaceC4877c) obj);
            }
        }))));
        H();
    }
}
