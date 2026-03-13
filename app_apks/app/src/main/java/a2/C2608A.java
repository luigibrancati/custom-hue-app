package a2;

import D1.C0743a;
import D1.D;
import a2.InterfaceC2611D;
import java.util.Objects;

/* JADX INFO: renamed from: a2.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2608A extends p0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f20502m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final D.c f20503n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final D.b f20504o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f20505p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C2639z f20506q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f20507r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f20508s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f20509t;

    /* JADX INFO: renamed from: a2.A$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC2636w {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Object f20510h = new Object();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Object f20511f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f20512g;

        public a(D1.D d10, Object obj, Object obj2) {
            super(d10);
            this.f20511f = obj;
            this.f20512g = obj2;
        }

        public static a u(D1.r rVar) {
            return new a(new b(rVar), D.c.f1463q, f20510h);
        }

        public static a v(D1.D d10, Object obj, Object obj2) {
            return new a(d10, obj, obj2);
        }

        @Override // a2.AbstractC2636w, D1.D
        public int b(Object obj) {
            Object obj2;
            D1.D d10 = this.f20909e;
            if (f20510h.equals(obj) && (obj2 = this.f20512g) != null) {
                obj = obj2;
            }
            return d10.b(obj);
        }

        @Override // a2.AbstractC2636w, D1.D
        public D.b g(int i10, D.b bVar, boolean z10) {
            this.f20909e.g(i10, bVar, z10);
            if (Objects.equals(bVar.f1451b, this.f20512g) && z10) {
                bVar.f1451b = f20510h;
            }
            return bVar;
        }

        @Override // a2.AbstractC2636w, D1.D
        public Object m(int i10) {
            Object objM = this.f20909e.m(i10);
            return Objects.equals(objM, this.f20512g) ? f20510h : objM;
        }

        @Override // a2.AbstractC2636w, D1.D
        public D.c o(int i10, D.c cVar, long j10) {
            this.f20909e.o(i10, cVar, j10);
            if (Objects.equals(cVar.f1473a, this.f20511f)) {
                cVar.f1473a = D.c.f1463q;
            }
            return cVar;
        }

        public a t(D1.D d10) {
            return new a(d10, this.f20511f, this.f20512g);
        }
    }

    /* JADX INFO: renamed from: a2.A$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends D1.D {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final D1.r f20513e;

        public b(D1.r rVar) {
            this.f20513e = rVar;
        }

        @Override // D1.D
        public int b(Object obj) {
            return obj == a.f20510h ? 0 : -1;
        }

        @Override // D1.D
        public D.b g(int i10, D.b bVar, boolean z10) {
            bVar.t(z10 ? 0 : null, z10 ? a.f20510h : null, 0, -9223372036854775807L, 0L, C0743a.f1626g, true);
            return bVar;
        }

        @Override // D1.D
        public int i() {
            return 1;
        }

        @Override // D1.D
        public Object m(int i10) {
            return a.f20510h;
        }

        @Override // D1.D
        public D.c o(int i10, D.c cVar, long j10) {
            cVar.g(D.c.f1463q, this.f20513e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.f1483k = true;
            return cVar;
        }

        @Override // D1.D
        public int p() {
            return 1;
        }
    }

    public C2608A(InterfaceC2611D interfaceC2611D, boolean z10) {
        super(interfaceC2611D);
        this.f20502m = z10 && interfaceC2611D.p();
        this.f20503n = new D.c();
        this.f20504o = new D.b();
        D1.D dQ = interfaceC2611D.q();
        if (dQ == null) {
            this.f20505p = a.u(interfaceC2611D.f());
        } else {
            this.f20505p = a.v(dQ, null, null);
            this.f20509t = true;
        }
    }

    @Override // a2.AbstractC2622h, a2.AbstractC2615a
    public void F() {
        this.f20508s = false;
        this.f20507r = false;
        super.F();
    }

    @Override // a2.p0
    public InterfaceC2611D.b M(InterfaceC2611D.b bVar) {
        return bVar.a(X(bVar.f20522a));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // a2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void S(D1.D r15) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.C2608A.S(D1.D):void");
    }

    @Override // a2.p0
    public void V() {
        if (this.f20502m) {
            return;
        }
        this.f20507r = true;
        U();
    }

    @Override // a2.InterfaceC2611D
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public C2639z k(InterfaceC2611D.b bVar, e2.b bVar2, long j10) {
        C2639z c2639z = new C2639z(bVar, bVar2, j10);
        c2639z.y(this.f20872k);
        if (this.f20508s) {
            c2639z.a(bVar.a(Y(bVar.f20522a)));
            return c2639z;
        }
        this.f20506q = c2639z;
        if (!this.f20507r) {
            this.f20507r = true;
            U();
        }
        return c2639z;
    }

    public final Object X(Object obj) {
        return (this.f20505p.f20512g == null || !this.f20505p.f20512g.equals(obj)) ? obj : a.f20510h;
    }

    public final Object Y(Object obj) {
        return (this.f20505p.f20512g == null || !obj.equals(a.f20510h)) ? obj : this.f20505p.f20512g;
    }

    public D1.D Z() {
        return this.f20505p;
    }

    public final boolean a0(long j10) {
        C2639z c2639z = this.f20506q;
        int iB = this.f20505p.b(c2639z.f20923a.f20522a);
        if (iB == -1) {
            return false;
        }
        long j11 = this.f20505p.f(iB, this.f20504o).f1453d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        c2639z.w(j10);
        return true;
    }

    @Override // a2.p0, a2.InterfaceC2611D
    public void b(D1.r rVar) {
        if (this.f20509t) {
            this.f20505p = this.f20505p.t(new l0(this.f20505p.f20909e, rVar));
        } else {
            this.f20505p = a.u(rVar);
        }
        this.f20872k.b(rVar);
    }

    @Override // a2.InterfaceC2611D
    public void h(InterfaceC2610C interfaceC2610C) {
        ((C2639z) interfaceC2610C).x();
        if (interfaceC2610C == this.f20506q) {
            this.f20506q = null;
        }
    }
}
