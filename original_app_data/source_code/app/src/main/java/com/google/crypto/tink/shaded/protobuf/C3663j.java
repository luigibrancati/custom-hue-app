package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.J;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3663j implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3662i f31505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31508d = 0;

    public C3663j(AbstractC3662i abstractC3662i) {
        AbstractC3662i abstractC3662i2 = (AbstractC3662i) AbstractC3678z.b(abstractC3662i, "input");
        this.f31505a = abstractC3662i2;
        abstractC3662i2.f31468e = this;
    }

    public static C3663j N(AbstractC3662i abstractC3662i) {
        C3663j c3663j = abstractC3662i.f31468e;
        return c3663j != null ? c3663j : new C3663j(abstractC3662i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void A(List list) throws A.a {
        S(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void B(List list) throws A {
        int iD;
        int iD2;
        if (!(list instanceof AbstractC3674v)) {
            int iB = r0.b(this.f31506b);
            if (iB == 2) {
                int iE = this.f31505a.E();
                V(iE);
                int iF = this.f31505a.f() + iE;
                do {
                    list.add(Float.valueOf(this.f31505a.u()));
                } while (this.f31505a.f() < iF);
                return;
            }
            if (iB != 5) {
                throw A.e();
            }
            do {
                list.add(Float.valueOf(this.f31505a.u()));
                if (this.f31505a.g()) {
                    return;
                } else {
                    iD = this.f31505a.D();
                }
            } while (iD == this.f31506b);
            this.f31508d = iD;
            return;
        }
        AbstractC3674v abstractC3674v = (AbstractC3674v) list;
        int iB2 = r0.b(this.f31506b);
        if (iB2 == 2) {
            int iE2 = this.f31505a.E();
            V(iE2);
            int iF2 = this.f31505a.f() + iE2;
            do {
                abstractC3674v.d(this.f31505a.u());
            } while (this.f31505a.f() < iF2);
            return;
        }
        if (iB2 != 5) {
            throw A.e();
        }
        do {
            abstractC3674v.d(this.f31505a.u());
            if (this.f31505a.g()) {
                return;
            } else {
                iD2 = this.f31505a.D();
            }
        } while (iD2 == this.f31506b);
        this.f31508d = iD2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public boolean C() {
        int i10;
        if (this.f31505a.g() || (i10 = this.f31506b) == this.f31507c) {
            return false;
        }
        return this.f31505a.G(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int D() throws A.a {
        U(5);
        return this.f31505a.x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void E(List list) throws A.a {
        int iD;
        if (r0.b(this.f31506b) != 2) {
            throw A.e();
        }
        do {
            list.add(n());
            if (this.f31505a.g()) {
                return;
            } else {
                iD = this.f31505a.D();
            }
        } while (iD == this.f31506b);
        this.f31508d = iD;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void F(List list) throws A {
        int iD;
        int iD2;
        if (!(list instanceof AbstractC3666m)) {
            int iB = r0.b(this.f31506b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f31505a.q()));
                    if (this.f31505a.g()) {
                        return;
                    } else {
                        iD = this.f31505a.D();
                    }
                } while (iD == this.f31506b);
                this.f31508d = iD;
                return;
            }
            if (iB != 2) {
                throw A.e();
            }
            int iE = this.f31505a.E();
            W(iE);
            int iF = this.f31505a.f() + iE;
            do {
                list.add(Double.valueOf(this.f31505a.q()));
            } while (this.f31505a.f() < iF);
            return;
        }
        AbstractC3666m abstractC3666m = (AbstractC3666m) list;
        int iB2 = r0.b(this.f31506b);
        if (iB2 == 1) {
            do {
                abstractC3666m.G0(this.f31505a.q());
                if (this.f31505a.g()) {
                    return;
                } else {
                    iD2 = this.f31505a.D();
                }
            } while (iD2 == this.f31506b);
            this.f31508d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw A.e();
        }
        int iE2 = this.f31505a.E();
        W(iE2);
        int iF2 = this.f31505a.f() + iE2;
        do {
            abstractC3666m.G0(this.f31505a.q());
        } while (this.f31505a.f() < iF2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long G() throws A.a {
        U(0);
        return this.f31505a.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public String H() throws A.a {
        U(2);
        return this.f31505a.C();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void I(Object obj, f0 f0Var, C3669p c3669p) throws A.a {
        U(3);
        O(obj, f0Var, c3669p);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void J(Map map, J.a aVar, C3669p c3669p) throws A.a {
        U(2);
        this.f31505a.n(this.f31505a.E());
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void K(Object obj, f0 f0Var, C3669p c3669p) throws A {
        U(2);
        P(obj, f0Var, c3669p);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void L(List list, f0 f0Var, C3669p c3669p) throws A.a {
        int iD;
        if (r0.b(this.f31506b) != 2) {
            throw A.e();
        }
        int i10 = this.f31506b;
        do {
            list.add(R(f0Var, c3669p));
            if (this.f31505a.g() || this.f31508d != 0) {
                return;
            } else {
                iD = this.f31505a.D();
            }
        } while (iD == i10);
        this.f31508d = iD;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void M(List list, f0 f0Var, C3669p c3669p) throws A.a {
        int iD;
        if (r0.b(this.f31506b) != 3) {
            throw A.e();
        }
        int i10 = this.f31506b;
        do {
            list.add(Q(f0Var, c3669p));
            if (this.f31505a.g() || this.f31508d != 0) {
                return;
            } else {
                iD = this.f31505a.D();
            }
        } while (iD == i10);
        this.f31508d = iD;
    }

    public final void O(Object obj, f0 f0Var, C3669p c3669p) {
        int i10 = this.f31507c;
        this.f31507c = r0.c(r0.a(this.f31506b), 4);
        try {
            f0Var.h(obj, this, c3669p);
            if (this.f31506b == this.f31507c) {
            } else {
                throw A.h();
            }
        } finally {
            this.f31507c = i10;
        }
    }

    public final void P(Object obj, f0 f0Var, C3669p c3669p) throws A {
        int iE = this.f31505a.E();
        this.f31505a.b();
        int iN = this.f31505a.n(iE);
        this.f31505a.f31464a++;
        f0Var.h(obj, this, c3669p);
        this.f31505a.a(0);
        r3.f31464a--;
        this.f31505a.m(iN);
    }

    public final Object Q(f0 f0Var, C3669p c3669p) {
        Object objNewInstance = f0Var.newInstance();
        O(objNewInstance, f0Var, c3669p);
        f0Var.b(objNewInstance);
        return objNewInstance;
    }

    public final Object R(f0 f0Var, C3669p c3669p) throws A {
        Object objNewInstance = f0Var.newInstance();
        P(objNewInstance, f0Var, c3669p);
        f0Var.b(objNewInstance);
        return objNewInstance;
    }

    public void S(List list, boolean z10) throws A.a {
        int iD;
        if (r0.b(this.f31506b) != 2) {
            throw A.e();
        }
        do {
            list.add(z10 ? H() : y());
            if (this.f31505a.g()) {
                return;
            } else {
                iD = this.f31505a.D();
            }
        } while (iD == this.f31506b);
        this.f31508d = iD;
    }

    public final void T(int i10) throws A {
        if (this.f31505a.f() != i10) {
            throw A.m();
        }
    }

    public final void U(int i10) throws A.a {
        if (r0.b(this.f31506b) != i10) {
            throw A.e();
        }
    }

    public final void V(int i10) throws A {
        if ((i10 & 3) != 0) {
            throw A.h();
        }
    }

    public final void W(int i10) throws A {
        if ((i10 & 7) != 0) {
            throw A.h();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long a() throws A.a {
        U(1);
        return this.f31505a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void b(List list) throws A {
        int iD;
        int iD2;
        if (!(list instanceof AbstractC3677y)) {
            int iB = r0.b(this.f31506b);
            if (iB == 2) {
                int iE = this.f31505a.E();
                V(iE);
                int iF = this.f31505a.f() + iE;
                do {
                    list.add(Integer.valueOf(this.f31505a.x()));
                } while (this.f31505a.f() < iF);
                return;
            }
            if (iB != 5) {
                throw A.e();
            }
            do {
                list.add(Integer.valueOf(this.f31505a.x()));
                if (this.f31505a.g()) {
                    return;
                } else {
                    iD = this.f31505a.D();
                }
            } while (iD == this.f31506b);
            this.f31508d = iD;
            return;
        }
        AbstractC3677y abstractC3677y = (AbstractC3677y) list;
        int iB2 = r0.b(this.f31506b);
        if (iB2 == 2) {
            int iE2 = this.f31505a.E();
            V(iE2);
            int iF2 = this.f31505a.f() + iE2;
            do {
                abstractC3677y.x0(this.f31505a.x());
            } while (this.f31505a.f() < iF2);
            return;
        }
        if (iB2 != 5) {
            throw A.e();
        }
        do {
            abstractC3677y.x0(this.f31505a.x());
            if (this.f31505a.g()) {
                return;
            } else {
                iD2 = this.f31505a.D();
            }
        } while (iD2 == this.f31506b);
        this.f31508d = iD2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void c(List list) throws A {
        int iD;
        int iD2;
        if (!(list instanceof H)) {
            int iB = r0.b(this.f31506b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f31505a.A()));
                    if (this.f31505a.g()) {
                        return;
                    } else {
                        iD = this.f31505a.D();
                    }
                } while (iD == this.f31506b);
                this.f31508d = iD;
                return;
            }
            if (iB != 2) {
                throw A.e();
            }
            int iF = this.f31505a.f() + this.f31505a.E();
            do {
                list.add(Long.valueOf(this.f31505a.A()));
            } while (this.f31505a.f() < iF);
            T(iF);
            return;
        }
        H h10 = (H) list;
        int iB2 = r0.b(this.f31506b);
        if (iB2 == 0) {
            do {
                h10.C0(this.f31505a.A());
                if (this.f31505a.g()) {
                    return;
                } else {
                    iD2 = this.f31505a.D();
                }
            } while (iD2 == this.f31506b);
            this.f31508d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw A.e();
        }
        int iF2 = this.f31505a.f() + this.f31505a.E();
        do {
            h10.C0(this.f31505a.A());
        } while (this.f31505a.f() < iF2);
        T(iF2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public boolean d() throws A.a {
        U(0);
        return this.f31505a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long e() throws A.a {
        U(1);
        return this.f31505a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void f(List list) throws A {
        int iD;
        int iD2;
        if (!(list instanceof H)) {
            int iB = r0.b(this.f31506b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f31505a.F()));
                    if (this.f31505a.g()) {
                        return;
                    } else {
                        iD = this.f31505a.D();
                    }
                } while (iD == this.f31506b);
                this.f31508d = iD;
                return;
            }
            if (iB != 2) {
                throw A.e();
            }
            int iF = this.f31505a.f() + this.f31505a.E();
            do {
                list.add(Long.valueOf(this.f31505a.F()));
            } while (this.f31505a.f() < iF);
            T(iF);
            return;
        }
        H h10 = (H) list;
        int iB2 = r0.b(this.f31506b);
        if (iB2 == 0) {
            do {
                h10.C0(this.f31505a.F());
                if (this.f31505a.g()) {
                    return;
                } else {
                    iD2 = this.f31505a.D();
                }
            } while (iD2 == this.f31506b);
            this.f31508d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw A.e();
        }
        int iF2 = this.f31505a.f() + this.f31505a.E();
        do {
            h10.C0(this.f31505a.F());
        } while (this.f31505a.f() < iF2);
        T(iF2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int g() throws A.a {
        U(0);
        return this.f31505a.E();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int getTag() {
        return this.f31506b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void h(List list) throws A {
        int iD;
        int iD2;
        if (!(list instanceof H)) {
            int iB = r0.b(this.f31506b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f31505a.w()));
                    if (this.f31505a.g()) {
                        return;
                    } else {
                        iD = this.f31505a.D();
                    }
                } while (iD == this.f31506b);
                this.f31508d = iD;
                return;
            }
            if (iB != 2) {
                throw A.e();
            }
            int iF = this.f31505a.f() + this.f31505a.E();
            do {
                list.add(Long.valueOf(this.f31505a.w()));
            } while (this.f31505a.f() < iF);
            T(iF);
            return;
        }
        H h10 = (H) list;
        int iB2 = r0.b(this.f31506b);
        if (iB2 == 0) {
            do {
                h10.C0(this.f31505a.w());
                if (this.f31505a.g()) {
                    return;
                } else {
                    iD2 = this.f31505a.D();
                }
            } while (iD2 == this.f31506b);
            this.f31508d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw A.e();
        }
        int iF2 = this.f31505a.f() + this.f31505a.E();
        do {
            h10.C0(this.f31505a.w());
        } while (this.f31505a.f() < iF2);
        T(iF2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void i(List list) throws A {
        int iD;
        int iD2;
        if (!(list instanceof AbstractC3677y)) {
            int iB = r0.b(this.f31506b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f31505a.r()));
                    if (this.f31505a.g()) {
                        return;
                    } else {
                        iD = this.f31505a.D();
                    }
                } while (iD == this.f31506b);
                this.f31508d = iD;
                return;
            }
            if (iB != 2) {
                throw A.e();
            }
            int iF = this.f31505a.f() + this.f31505a.E();
            do {
                list.add(Integer.valueOf(this.f31505a.r()));
            } while (this.f31505a.f() < iF);
            T(iF);
            return;
        }
        AbstractC3677y abstractC3677y = (AbstractC3677y) list;
        int iB2 = r0.b(this.f31506b);
        if (iB2 == 0) {
            do {
                abstractC3677y.x0(this.f31505a.r());
                if (this.f31505a.g()) {
                    return;
                } else {
                    iD2 = this.f31505a.D();
                }
            } while (iD2 == this.f31506b);
            this.f31508d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw A.e();
        }
        int iF2 = this.f31505a.f() + this.f31505a.E();
        do {
            abstractC3677y.x0(this.f31505a.r());
        } while (this.f31505a.f() < iF2);
        T(iF2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int j() throws A.a {
        U(0);
        return this.f31505a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int k() throws A.a {
        U(0);
        return this.f31505a.z();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void l(List list) throws A {
        int iD;
        int iD2;
        if (!(list instanceof AbstractC3659f)) {
            int iB = r0.b(this.f31506b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f31505a.o()));
                    if (this.f31505a.g()) {
                        return;
                    } else {
                        iD = this.f31505a.D();
                    }
                } while (iD == this.f31506b);
                this.f31508d = iD;
                return;
            }
            if (iB != 2) {
                throw A.e();
            }
            int iF = this.f31505a.f() + this.f31505a.E();
            do {
                list.add(Boolean.valueOf(this.f31505a.o()));
            } while (this.f31505a.f() < iF);
            T(iF);
            return;
        }
        AbstractC3659f abstractC3659f = (AbstractC3659f) list;
        int iB2 = r0.b(this.f31506b);
        if (iB2 == 0) {
            do {
                abstractC3659f.d(this.f31505a.o());
                if (this.f31505a.g()) {
                    return;
                } else {
                    iD2 = this.f31505a.D();
                }
            } while (iD2 == this.f31506b);
            this.f31508d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw A.e();
        }
        int iF2 = this.f31505a.f() + this.f31505a.E();
        do {
            abstractC3659f.d(this.f31505a.o());
        } while (this.f31505a.f() < iF2);
        T(iF2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void m(List list) throws A.a {
        S(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public AbstractC3661h n() throws A.a {
        U(2);
        return this.f31505a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int o() throws A.a {
        U(0);
        return this.f31505a.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void p(List list) throws A {
        int iD;
        int iD2;
        if (!(list instanceof H)) {
            int iB = r0.b(this.f31506b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f31505a.t()));
                    if (this.f31505a.g()) {
                        return;
                    } else {
                        iD = this.f31505a.D();
                    }
                } while (iD == this.f31506b);
                this.f31508d = iD;
                return;
            }
            if (iB != 2) {
                throw A.e();
            }
            int iE = this.f31505a.E();
            W(iE);
            int iF = this.f31505a.f() + iE;
            do {
                list.add(Long.valueOf(this.f31505a.t()));
            } while (this.f31505a.f() < iF);
            return;
        }
        H h10 = (H) list;
        int iB2 = r0.b(this.f31506b);
        if (iB2 == 1) {
            do {
                h10.C0(this.f31505a.t());
                if (this.f31505a.g()) {
                    return;
                } else {
                    iD2 = this.f31505a.D();
                }
            } while (iD2 == this.f31506b);
            this.f31508d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw A.e();
        }
        int iE2 = this.f31505a.E();
        W(iE2);
        int iF2 = this.f31505a.f() + iE2;
        do {
            h10.C0(this.f31505a.t());
        } while (this.f31505a.f() < iF2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void q(List list) throws A {
        int iD;
        int iD2;
        if (!(list instanceof AbstractC3677y)) {
            int iB = r0.b(this.f31506b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f31505a.z()));
                    if (this.f31505a.g()) {
                        return;
                    } else {
                        iD = this.f31505a.D();
                    }
                } while (iD == this.f31506b);
                this.f31508d = iD;
                return;
            }
            if (iB != 2) {
                throw A.e();
            }
            int iF = this.f31505a.f() + this.f31505a.E();
            do {
                list.add(Integer.valueOf(this.f31505a.z()));
            } while (this.f31505a.f() < iF);
            T(iF);
            return;
        }
        AbstractC3677y abstractC3677y = (AbstractC3677y) list;
        int iB2 = r0.b(this.f31506b);
        if (iB2 == 0) {
            do {
                abstractC3677y.x0(this.f31505a.z());
                if (this.f31505a.g()) {
                    return;
                } else {
                    iD2 = this.f31505a.D();
                }
            } while (iD2 == this.f31506b);
            this.f31508d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw A.e();
        }
        int iF2 = this.f31505a.f() + this.f31505a.E();
        do {
            abstractC3677y.x0(this.f31505a.z());
        } while (this.f31505a.f() < iF2);
        T(iF2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long r() throws A.a {
        U(0);
        return this.f31505a.F();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public double readDouble() throws A.a {
        U(1);
        return this.f31505a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public float readFloat() throws A.a {
        U(5);
        return this.f31505a.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void s(List list) throws A {
        int iD;
        int iD2;
        if (!(list instanceof AbstractC3677y)) {
            int iB = r0.b(this.f31506b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f31505a.E()));
                    if (this.f31505a.g()) {
                        return;
                    } else {
                        iD = this.f31505a.D();
                    }
                } while (iD == this.f31506b);
                this.f31508d = iD;
                return;
            }
            if (iB != 2) {
                throw A.e();
            }
            int iF = this.f31505a.f() + this.f31505a.E();
            do {
                list.add(Integer.valueOf(this.f31505a.E()));
            } while (this.f31505a.f() < iF);
            T(iF);
            return;
        }
        AbstractC3677y abstractC3677y = (AbstractC3677y) list;
        int iB2 = r0.b(this.f31506b);
        if (iB2 == 0) {
            do {
                abstractC3677y.x0(this.f31505a.E());
                if (this.f31505a.g()) {
                    return;
                } else {
                    iD2 = this.f31505a.D();
                }
            } while (iD2 == this.f31506b);
            this.f31508d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw A.e();
        }
        int iF2 = this.f31505a.f() + this.f31505a.E();
        do {
            abstractC3677y.x0(this.f31505a.E());
        } while (this.f31505a.f() < iF2);
        T(iF2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int t() throws A.a {
        U(5);
        return this.f31505a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void u(List list) throws A {
        int iD;
        int iD2;
        if (!(list instanceof H)) {
            int iB = r0.b(this.f31506b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f31505a.y()));
                    if (this.f31505a.g()) {
                        return;
                    } else {
                        iD = this.f31505a.D();
                    }
                } while (iD == this.f31506b);
                this.f31508d = iD;
                return;
            }
            if (iB != 2) {
                throw A.e();
            }
            int iE = this.f31505a.E();
            W(iE);
            int iF = this.f31505a.f() + iE;
            do {
                list.add(Long.valueOf(this.f31505a.y()));
            } while (this.f31505a.f() < iF);
            return;
        }
        H h10 = (H) list;
        int iB2 = r0.b(this.f31506b);
        if (iB2 == 1) {
            do {
                h10.C0(this.f31505a.y());
                if (this.f31505a.g()) {
                    return;
                } else {
                    iD2 = this.f31505a.D();
                }
            } while (iD2 == this.f31506b);
            this.f31508d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw A.e();
        }
        int iE2 = this.f31505a.E();
        W(iE2);
        int iF2 = this.f31505a.f() + iE2;
        do {
            h10.C0(this.f31505a.y());
        } while (this.f31505a.f() < iF2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void v(List list) throws A {
        int iD;
        int iD2;
        if (!(list instanceof AbstractC3677y)) {
            int iB = r0.b(this.f31506b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f31505a.v()));
                    if (this.f31505a.g()) {
                        return;
                    } else {
                        iD = this.f31505a.D();
                    }
                } while (iD == this.f31506b);
                this.f31508d = iD;
                return;
            }
            if (iB != 2) {
                throw A.e();
            }
            int iF = this.f31505a.f() + this.f31505a.E();
            do {
                list.add(Integer.valueOf(this.f31505a.v()));
            } while (this.f31505a.f() < iF);
            T(iF);
            return;
        }
        AbstractC3677y abstractC3677y = (AbstractC3677y) list;
        int iB2 = r0.b(this.f31506b);
        if (iB2 == 0) {
            do {
                abstractC3677y.x0(this.f31505a.v());
                if (this.f31505a.g()) {
                    return;
                } else {
                    iD2 = this.f31505a.D();
                }
            } while (iD2 == this.f31506b);
            this.f31508d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw A.e();
        }
        int iF2 = this.f31505a.f() + this.f31505a.E();
        do {
            abstractC3677y.x0(this.f31505a.v());
        } while (this.f31505a.f() < iF2);
        T(iF2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void w(List list) throws A {
        int iD;
        int iD2;
        if (!(list instanceof AbstractC3677y)) {
            int iB = r0.b(this.f31506b);
            if (iB == 2) {
                int iE = this.f31505a.E();
                V(iE);
                int iF = this.f31505a.f() + iE;
                do {
                    list.add(Integer.valueOf(this.f31505a.s()));
                } while (this.f31505a.f() < iF);
                return;
            }
            if (iB != 5) {
                throw A.e();
            }
            do {
                list.add(Integer.valueOf(this.f31505a.s()));
                if (this.f31505a.g()) {
                    return;
                } else {
                    iD = this.f31505a.D();
                }
            } while (iD == this.f31506b);
            this.f31508d = iD;
            return;
        }
        AbstractC3677y abstractC3677y = (AbstractC3677y) list;
        int iB2 = r0.b(this.f31506b);
        if (iB2 == 2) {
            int iE2 = this.f31505a.E();
            V(iE2);
            int iF2 = this.f31505a.f() + iE2;
            do {
                abstractC3677y.x0(this.f31505a.s());
            } while (this.f31505a.f() < iF2);
            return;
        }
        if (iB2 != 5) {
            throw A.e();
        }
        do {
            abstractC3677y.x0(this.f31505a.s());
            if (this.f31505a.g()) {
                return;
            } else {
                iD2 = this.f31505a.D();
            }
        } while (iD2 == this.f31506b);
        this.f31508d = iD2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long x() throws A.a {
        U(0);
        return this.f31505a.A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public String y() throws A.a {
        U(2);
        return this.f31505a.B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int z() {
        int i10 = this.f31508d;
        if (i10 != 0) {
            this.f31506b = i10;
            this.f31508d = 0;
        } else {
            this.f31506b = this.f31505a.D();
        }
        int i11 = this.f31506b;
        if (i11 == 0 || i11 == this.f31507c) {
            return Integer.MAX_VALUE;
        }
        return r0.a(i11);
    }
}
