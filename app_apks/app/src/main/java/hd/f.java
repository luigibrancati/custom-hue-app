package hd;

import fd.n;
import fd.q;
import fd.r;
import fd.s;
import fd.u;
import gc.C4207u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static final q a(q qVar, g typeTable) {
        AbstractC4862t.e(qVar, "<this>");
        AbstractC4862t.e(typeTable, "typeTable");
        if (qVar.e0()) {
            return qVar.M();
        }
        if (qVar.f0()) {
            return typeTable.a(qVar.N());
        }
        return null;
    }

    public static final List b(fd.c cVar, g typeTable) {
        AbstractC4862t.e(cVar, "<this>");
        AbstractC4862t.e(typeTable, "typeTable");
        List listS0 = cVar.s0();
        if (listS0.isEmpty()) {
            listS0 = null;
        }
        if (listS0 == null) {
            List<Integer> contextReceiverTypeIdList = cVar.r0();
            AbstractC4862t.d(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            listS0 = new ArrayList(C4207u.v(contextReceiverTypeIdList, 10));
            for (Integer it : contextReceiverTypeIdList) {
                AbstractC4862t.d(it, "it");
                listS0.add(typeTable.a(it.intValue()));
            }
        }
        return listS0;
    }

    public static final List c(fd.i iVar, g typeTable) {
        AbstractC4862t.e(iVar, "<this>");
        AbstractC4862t.e(typeTable, "typeTable");
        List listT = iVar.T();
        if (listT.isEmpty()) {
            listT = null;
        }
        if (listT == null) {
            List<Integer> contextReceiverTypeIdList = iVar.S();
            AbstractC4862t.d(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            listT = new ArrayList(C4207u.v(contextReceiverTypeIdList, 10));
            for (Integer it : contextReceiverTypeIdList) {
                AbstractC4862t.d(it, "it");
                listT.add(typeTable.a(it.intValue()));
            }
        }
        return listT;
    }

    public static final List d(n nVar, g typeTable) {
        AbstractC4862t.e(nVar, "<this>");
        AbstractC4862t.e(typeTable, "typeTable");
        List listS = nVar.S();
        if (listS.isEmpty()) {
            listS = null;
        }
        if (listS == null) {
            List<Integer> contextReceiverTypeIdList = nVar.R();
            AbstractC4862t.d(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            listS = new ArrayList(C4207u.v(contextReceiverTypeIdList, 10));
            for (Integer it : contextReceiverTypeIdList) {
                AbstractC4862t.d(it, "it");
                listS.add(typeTable.a(it.intValue()));
            }
        }
        return listS;
    }

    public static final q e(r rVar, g typeTable) {
        AbstractC4862t.e(rVar, "<this>");
        AbstractC4862t.e(typeTable, "typeTable");
        if (rVar.Y()) {
            q expandedType = rVar.O();
            AbstractC4862t.d(expandedType, "expandedType");
            return expandedType;
        }
        if (rVar.Z()) {
            return typeTable.a(rVar.P());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    public static final q f(q qVar, g typeTable) {
        AbstractC4862t.e(qVar, "<this>");
        AbstractC4862t.e(typeTable, "typeTable");
        if (qVar.j0()) {
            return qVar.W();
        }
        if (qVar.k0()) {
            return typeTable.a(qVar.X());
        }
        return null;
    }

    public static final boolean g(fd.i iVar) {
        AbstractC4862t.e(iVar, "<this>");
        return iVar.q0() || iVar.r0();
    }

    public static final boolean h(n nVar) {
        AbstractC4862t.e(nVar, "<this>");
        return nVar.n0() || nVar.o0();
    }

    public static final q i(fd.c cVar, g typeTable) {
        AbstractC4862t.e(cVar, "<this>");
        AbstractC4862t.e(typeTable, "typeTable");
        if (cVar.k1()) {
            return cVar.F0();
        }
        if (cVar.l1()) {
            return typeTable.a(cVar.G0());
        }
        return null;
    }

    public static final q j(q qVar, g typeTable) {
        AbstractC4862t.e(qVar, "<this>");
        AbstractC4862t.e(typeTable, "typeTable");
        if (qVar.m0()) {
            return qVar.Z();
        }
        if (qVar.n0()) {
            return typeTable.a(qVar.a0());
        }
        return null;
    }

    public static final q k(fd.i iVar, g typeTable) {
        AbstractC4862t.e(iVar, "<this>");
        AbstractC4862t.e(typeTable, "typeTable");
        if (iVar.q0()) {
            return iVar.a0();
        }
        if (iVar.r0()) {
            return typeTable.a(iVar.b0());
        }
        return null;
    }

    public static final q l(n nVar, g typeTable) {
        AbstractC4862t.e(nVar, "<this>");
        AbstractC4862t.e(typeTable, "typeTable");
        if (nVar.n0()) {
            return nVar.Z();
        }
        if (nVar.o0()) {
            return typeTable.a(nVar.a0());
        }
        return null;
    }

    public static final q m(fd.i iVar, g typeTable) {
        AbstractC4862t.e(iVar, "<this>");
        AbstractC4862t.e(typeTable, "typeTable");
        if (iVar.s0()) {
            q returnType = iVar.c0();
            AbstractC4862t.d(returnType, "returnType");
            return returnType;
        }
        if (iVar.t0()) {
            return typeTable.a(iVar.d0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final q n(n nVar, g typeTable) {
        AbstractC4862t.e(nVar, "<this>");
        AbstractC4862t.e(typeTable, "typeTable");
        if (nVar.p0()) {
            q returnType = nVar.b0();
            AbstractC4862t.d(returnType, "returnType");
            return returnType;
        }
        if (nVar.q0()) {
            return typeTable.a(nVar.c0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final List o(fd.c cVar, g typeTable) {
        AbstractC4862t.e(cVar, "<this>");
        AbstractC4862t.e(typeTable, "typeTable");
        List listW0 = cVar.W0();
        if (listW0.isEmpty()) {
            listW0 = null;
        }
        if (listW0 == null) {
            List<Integer> supertypeIdList = cVar.V0();
            AbstractC4862t.d(supertypeIdList, "supertypeIdList");
            listW0 = new ArrayList(C4207u.v(supertypeIdList, 10));
            for (Integer it : supertypeIdList) {
                AbstractC4862t.d(it, "it");
                listW0.add(typeTable.a(it.intValue()));
            }
        }
        return listW0;
    }

    public static final q p(q.b bVar, g typeTable) {
        AbstractC4862t.e(bVar, "<this>");
        AbstractC4862t.e(typeTable, "typeTable");
        if (bVar.v()) {
            return bVar.s();
        }
        if (bVar.w()) {
            return typeTable.a(bVar.t());
        }
        return null;
    }

    public static final q q(u uVar, g typeTable) {
        AbstractC4862t.e(uVar, "<this>");
        AbstractC4862t.e(typeTable, "typeTable");
        if (uVar.N()) {
            q type = uVar.G();
            AbstractC4862t.d(type, "type");
            return type;
        }
        if (uVar.O()) {
            return typeTable.a(uVar.I());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static final q r(r rVar, g typeTable) {
        AbstractC4862t.e(rVar, "<this>");
        AbstractC4862t.e(typeTable, "typeTable");
        if (rVar.c0()) {
            q underlyingType = rVar.V();
            AbstractC4862t.d(underlyingType, "underlyingType");
            return underlyingType;
        }
        if (rVar.d0()) {
            return typeTable.a(rVar.W());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    public static final List s(s sVar, g typeTable) {
        AbstractC4862t.e(sVar, "<this>");
        AbstractC4862t.e(typeTable, "typeTable");
        List listN = sVar.N();
        if (listN.isEmpty()) {
            listN = null;
        }
        if (listN == null) {
            List<Integer> upperBoundIdList = sVar.M();
            AbstractC4862t.d(upperBoundIdList, "upperBoundIdList");
            listN = new ArrayList(C4207u.v(upperBoundIdList, 10));
            for (Integer it : upperBoundIdList) {
                AbstractC4862t.d(it, "it");
                listN.add(typeTable.a(it.intValue()));
            }
        }
        return listN;
    }

    public static final q t(u uVar, g typeTable) {
        AbstractC4862t.e(uVar, "<this>");
        AbstractC4862t.e(typeTable, "typeTable");
        if (uVar.P()) {
            return uVar.J();
        }
        if (uVar.Q()) {
            return typeTable.a(uVar.K());
        }
        return null;
    }
}
