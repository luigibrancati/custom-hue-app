package com.google.protobuf;

import com.google.protobuf.I;
import com.google.protobuf.Q0;
import com.google.protobuf.S;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3725k0 implements A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3717g0 f32301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J0 f32302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f32303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E f32304d;

    public C3725k0(J0 j02, E e10, InterfaceC3717g0 interfaceC3717g0) {
        this.f32302b = j02;
        this.f32303c = e10.e(interfaceC3717g0);
        this.f32304d = e10;
        this.f32301a = interfaceC3717g0;
    }

    private int j(J0 j02, Object obj) {
        return j02.i(j02.g(obj));
    }

    private void k(J0 j02, E e10, Object obj, z0 z0Var, D d10) throws Throwable {
        J0 j03;
        C3725k0 c3725k0;
        E e11;
        z0 z0Var2;
        D d11;
        Object objF = j02.f(obj);
        I iD = e10.d(obj);
        while (z0Var.z() != Integer.MAX_VALUE) {
            try {
                c3725k0 = this;
                j03 = j02;
                e11 = e10;
                z0Var2 = z0Var;
                d11 = d10;
            } catch (Throwable th) {
                th = th;
                j03 = j02;
            }
            try {
                if (!c3725k0.m(z0Var2, d11, e11, iD, j03, objF)) {
                    j03.o(obj, objF);
                    return;
                }
                this = c3725k0;
                z0Var = z0Var2;
                d10 = d11;
                e10 = e11;
                j02 = j03;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                j03.o(obj, objF);
                throw th3;
            }
        }
        j02.o(obj, objF);
    }

    public static C3725k0 l(J0 j02, E e10, InterfaceC3717g0 interfaceC3717g0) {
        return new C3725k0(j02, e10, interfaceC3717g0);
    }

    @Override // com.google.protobuf.A0
    public void a(Object obj, Object obj2) {
        C0.G(this.f32302b, obj, obj2);
        if (this.f32303c) {
            C0.E(this.f32304d, obj, obj2);
        }
    }

    @Override // com.google.protobuf.A0
    public void b(Object obj) {
        this.f32302b.j(obj);
        this.f32304d.f(obj);
    }

    @Override // com.google.protobuf.A0
    public final boolean c(Object obj) {
        return this.f32304d.c(obj).s();
    }

    @Override // com.google.protobuf.A0
    public int d(Object obj) {
        int iJ = j(this.f32302b, obj);
        return this.f32303c ? iJ + this.f32304d.c(obj).j() : iJ;
    }

    @Override // com.google.protobuf.A0
    public int e(Object obj) {
        int iHashCode = this.f32302b.g(obj).hashCode();
        return this.f32303c ? (iHashCode * 53) + this.f32304d.c(obj).hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.A0
    public boolean f(Object obj, Object obj2) {
        if (!this.f32302b.g(obj).equals(this.f32302b.g(obj2))) {
            return false;
        }
        if (this.f32303c) {
            return this.f32304d.c(obj).equals(this.f32304d.c(obj2));
        }
        return true;
    }

    @Override // com.google.protobuf.A0
    public void g(Object obj, R0 r02) {
        Iterator itW = this.f32304d.c(obj).w();
        while (itW.hasNext()) {
            Map.Entry entry = (Map.Entry) itW.next();
            I.b bVar = (I.b) entry.getKey();
            if (bVar.k() != Q0.c.MESSAGE || bVar.f() || bVar.h()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof S.a) {
                bVar.getNumber();
                ((S.a) entry).a();
                throw null;
            }
            r02.b(bVar.getNumber(), entry.getValue());
        }
        n(this.f32302b, obj, r02);
    }

    @Override // com.google.protobuf.A0
    public void h(Object obj, z0 z0Var, D d10) throws Throwable {
        k(this.f32302b, this.f32304d, obj, z0Var, d10);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf A[EDGE_INSN: B:62:0x00cf->B:34:0x00cf BREAK  A[LOOP:1: B:17:0x006f->B:65:0x006f], SYNTHETIC] */
    @Override // com.google.protobuf.A0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(java.lang.Object r11, byte[] r12, int r13, int r14, com.google.protobuf.AbstractC3716g.b r15) throws com.google.protobuf.O {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C3725k0.i(java.lang.Object, byte[], int, int, com.google.protobuf.g$b):void");
    }

    public final boolean m(z0 z0Var, D d10, E e10, I i10, J0 j02, Object obj) throws O {
        int tag = z0Var.getTag();
        int iG = 0;
        if (tag != Q0.f32175a) {
            if (Q0.b(tag) != 2) {
                return z0Var.C();
            }
            Object objB = e10.b(d10, this.f32301a, Q0.a(tag));
            if (objB == null) {
                return j02.m(obj, z0Var, 0);
            }
            e10.h(z0Var, objB, d10, i10);
            return true;
        }
        Object objB2 = null;
        AbstractC3722j abstractC3722jN = null;
        while (z0Var.z() != Integer.MAX_VALUE) {
            int tag2 = z0Var.getTag();
            if (tag2 == Q0.f32177c) {
                iG = z0Var.g();
                objB2 = e10.b(d10, this.f32301a, iG);
            } else if (tag2 == Q0.f32178d) {
                if (objB2 != null) {
                    e10.h(z0Var, objB2, d10, i10);
                } else {
                    abstractC3722jN = z0Var.n();
                }
            } else if (!z0Var.C()) {
                break;
            }
        }
        if (z0Var.getTag() != Q0.f32176b) {
            throw O.b();
        }
        if (abstractC3722jN != null) {
            if (objB2 != null) {
                e10.i(abstractC3722jN, objB2, d10, i10);
            } else {
                j02.d(obj, iG, abstractC3722jN);
            }
        }
        return true;
    }

    public final void n(J0 j02, Object obj, R0 r02) {
        j02.s(j02.g(obj), r02);
    }

    @Override // com.google.protobuf.A0
    public Object newInstance() {
        InterfaceC3717g0 interfaceC3717g0 = this.f32301a;
        return interfaceC3717g0 instanceof GeneratedMessageLite ? ((GeneratedMessageLite) interfaceC3717g0).newMutableInstance() : interfaceC3717g0.newBuilderForType().buildPartial();
    }
}
