package Oc;

import Cd.n0;
import Lc.AbstractC1192u;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1176d;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1184l;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1187o;
import Lc.InterfaceC1196y;
import Lc.X;
import Lc.a0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: Oc.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C1812f extends p implements InterfaceC1176d {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f12257E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1812f(InterfaceC1177e interfaceC1177e, InterfaceC1184l interfaceC1184l, Mc.g gVar, boolean z10, InterfaceC1174b.a aVar, a0 a0Var) {
        super(interfaceC1177e, interfaceC1184l, gVar, kd.h.f39575j, aVar, a0Var);
        if (interfaceC1177e == null) {
            g0(0);
        }
        if (gVar == null) {
            g0(1);
        }
        if (aVar == null) {
            g0(2);
        }
        if (a0Var == null) {
            g0(3);
        }
        this.f12257E = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void g0(int r8) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Oc.C1812f.g0(int):void");
    }

    public static C1812f n1(InterfaceC1177e interfaceC1177e, Mc.g gVar, boolean z10, a0 a0Var) {
        if (interfaceC1177e == null) {
            g0(4);
        }
        if (gVar == null) {
            g0(5);
        }
        if (a0Var == null) {
            g0(6);
        }
        return new C1812f(interfaceC1177e, null, gVar, z10, InterfaceC1174b.a.DECLARATION, a0Var);
    }

    @Override // Oc.p, Lc.InterfaceC1174b
    public void C0(Collection collection) {
        if (collection == null) {
            g0(22);
        }
    }

    @Override // Lc.InterfaceC1184l
    public boolean b0() {
        return this.f12257E;
    }

    @Override // Lc.InterfaceC1184l
    public InterfaceC1177e c0() {
        InterfaceC1177e interfaceC1177eB = b();
        if (interfaceC1177eB == null) {
            g0(18);
        }
        return interfaceC1177eB;
    }

    @Override // Oc.p, Lc.InterfaceC1196y, Lc.InterfaceC1174b, Lc.InterfaceC1173a
    public Collection d() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            g0(21);
        }
        return set;
    }

    @Override // Oc.p, Lc.InterfaceC1185m
    public Object j0(InterfaceC1187o interfaceC1187o, Object obj) {
        return interfaceC1187o.b(this, obj);
    }

    public final List k1() {
        InterfaceC1177e interfaceC1177eB = b();
        if (interfaceC1177eB.X().isEmpty()) {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                g0(16);
            }
            return list;
        }
        List listX = interfaceC1177eB.X();
        if (listX == null) {
            g0(15);
        }
        return listX;
    }

    public X l1() {
        InterfaceC1177e interfaceC1177eB = b();
        if (!interfaceC1177eB.z()) {
            return null;
        }
        InterfaceC1185m interfaceC1185mB = interfaceC1177eB.b();
        if (interfaceC1185mB instanceof InterfaceC1177e) {
            return ((InterfaceC1177e) interfaceC1185mB).J0();
        }
        return null;
    }

    @Override // Lc.InterfaceC1174b
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public InterfaceC1176d H0(InterfaceC1185m interfaceC1185m, Lc.D d10, AbstractC1192u abstractC1192u, InterfaceC1174b.a aVar, boolean z10) {
        InterfaceC1176d interfaceC1176d = (InterfaceC1176d) super.K0(interfaceC1185m, d10, abstractC1192u, aVar, z10);
        if (interfaceC1176d == null) {
            g0(27);
        }
        return interfaceC1176d;
    }

    @Override // Oc.p
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public C1812f L0(InterfaceC1185m interfaceC1185m, InterfaceC1196y interfaceC1196y, InterfaceC1174b.a aVar, kd.f fVar, Mc.g gVar, a0 a0Var) {
        if (interfaceC1185m == null) {
            g0(23);
        }
        if (aVar == null) {
            g0(24);
        }
        if (gVar == null) {
            g0(25);
        }
        if (a0Var == null) {
            g0(26);
        }
        InterfaceC1174b.a aVar2 = InterfaceC1174b.a.DECLARATION;
        if (aVar == aVar2 || aVar == InterfaceC1174b.a.SYNTHESIZED) {
            return new C1812f((InterfaceC1177e) interfaceC1185m, this, gVar, this.f12257E, aVar2, a0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC1185m + "\nkind: " + aVar);
    }

    @Override // Oc.AbstractC1817k, Lc.InterfaceC1185m
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public InterfaceC1177e b() {
        InterfaceC1177e interfaceC1177e = (InterfaceC1177e) super.b();
        if (interfaceC1177e == null) {
            g0(17);
        }
        return interfaceC1177e;
    }

    public C1812f q1(List list, AbstractC1192u abstractC1192u) {
        if (list == null) {
            g0(13);
        }
        if (abstractC1192u == null) {
            g0(14);
        }
        r1(list, abstractC1192u, b().q());
        return this;
    }

    public C1812f r1(List list, AbstractC1192u abstractC1192u, List list2) {
        if (list == null) {
            g0(10);
        }
        if (abstractC1192u == null) {
            g0(11);
        }
        if (list2 == null) {
            g0(12);
        }
        super.R0(null, l1(), k1(), list2, list, null, Lc.D.FINAL, abstractC1192u);
        return this;
    }

    @Override // Oc.p, Lc.InterfaceC1196y, Lc.c0
    public InterfaceC1176d c(n0 n0Var) {
        if (n0Var == null) {
            g0(20);
        }
        return (InterfaceC1176d) super.c(n0Var);
    }

    @Override // Oc.p, Oc.AbstractC1817k, Oc.AbstractC1816j, Lc.InterfaceC1185m
    public InterfaceC1176d a() {
        InterfaceC1176d interfaceC1176d = (InterfaceC1176d) super.a();
        if (interfaceC1176d == null) {
            g0(19);
        }
        return interfaceC1176d;
    }
}
