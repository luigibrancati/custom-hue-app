package yd;

import Lc.AbstractC1195x;
import Lc.G;
import Lc.InterfaceC1176d;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.J;
import Lc.a0;
import Lc.j0;
import fc.C4034q;
import fd.b;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import gc.M;
import gc.P;
import gc.Q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import od.AbstractC5283e;
import qd.C5515a;
import qd.C5516b;
import qd.C5517c;

/* JADX INFO: renamed from: yd.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6472e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f48551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f48552b;

    /* JADX INFO: renamed from: yd.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48553a;

        static {
            int[] iArr = new int[b.C0442b.c.EnumC0445c.values().length];
            try {
                iArr[b.C0442b.c.EnumC0445c.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.C0442b.c.EnumC0445c.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.C0442b.c.EnumC0445c.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.C0442b.c.EnumC0445c.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.C0442b.c.EnumC0445c.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.C0442b.c.EnumC0445c.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.C0442b.c.EnumC0445c.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.C0442b.c.EnumC0445c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.C0442b.c.EnumC0445c.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.C0442b.c.EnumC0445c.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[b.C0442b.c.EnumC0445c.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[b.C0442b.c.EnumC0445c.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[b.C0442b.c.EnumC0445c.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f48553a = iArr;
        }
    }

    public C6472e(G module, J notFoundClasses) {
        AbstractC4862t.e(module, "module");
        AbstractC4862t.e(notFoundClasses, "notFoundClasses");
        this.f48551a = module;
        this.f48552b = notFoundClasses;
    }

    public final Mc.c a(fd.b proto, hd.c nameResolver) {
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(nameResolver, "nameResolver");
        InterfaceC1177e interfaceC1177eE = e(x.a(nameResolver, proto.u()));
        Map mapI = Q.i();
        if (proto.r() != 0 && !Ed.k.m(interfaceC1177eE) && AbstractC5283e.t(interfaceC1177eE)) {
            Collection collectionL = interfaceC1177eE.l();
            AbstractC4862t.d(collectionL, "annotationClass.constructors");
            InterfaceC1176d interfaceC1176d = (InterfaceC1176d) C4179C.G0(collectionL);
            if (interfaceC1176d != null) {
                List listI = interfaceC1176d.i();
                AbstractC4862t.d(listI, "constructor.valueParameters");
                LinkedHashMap linkedHashMap = new LinkedHashMap(Bc.k.e(P.e(C4207u.v(listI, 10)), 16));
                for (Object obj : listI) {
                    linkedHashMap.put(((j0) obj).getName(), obj);
                }
                List<b.C0442b> listS = proto.s();
                AbstractC4862t.d(listS, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (b.C0442b it : listS) {
                    AbstractC4862t.d(it, "it");
                    C4034q c4034qD = d(it, linkedHashMap, nameResolver);
                    if (c4034qD != null) {
                        arrayList.add(c4034qD);
                    }
                }
                mapI = Q.s(arrayList);
            }
        }
        return new Mc.d(interfaceC1177eE.p(), mapI, a0.f8746a);
    }

    public final boolean b(qd.g gVar, Cd.E e10, b.C0442b.c cVar) {
        b.C0442b.c.EnumC0445c enumC0445cN = cVar.N();
        int i10 = enumC0445cN == null ? -1 : a.f48553a[enumC0445cN.ordinal()];
        if (i10 == 10) {
            InterfaceC1180h interfaceC1180hQ = e10.N0().q();
            InterfaceC1177e interfaceC1177e = interfaceC1180hQ instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1180hQ : null;
            return interfaceC1177e == null || Ic.g.k0(interfaceC1177e);
        }
        if (i10 != 13) {
            return AbstractC4862t.a(gVar.a(this.f48551a), e10);
        }
        if (!(gVar instanceof C5516b) || ((List) ((C5516b) gVar).b()).size() != cVar.D().size()) {
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
        }
        Cd.E eK = c().k(e10);
        AbstractC4862t.d(eK, "builtIns.getArrayElementType(expectedType)");
        C5516b c5516b = (C5516b) gVar;
        Iterable iterableL = C4206t.l((Collection) c5516b.b());
        if ((iterableL instanceof Collection) && ((Collection) iterableL).isEmpty()) {
            return true;
        }
        Iterator it = iterableL.iterator();
        while (it.hasNext()) {
            int iNextInt = ((M) it).nextInt();
            qd.g gVar2 = (qd.g) ((List) c5516b.b()).get(iNextInt);
            b.C0442b.c cVarB = cVar.B(iNextInt);
            AbstractC4862t.d(cVarB, "value.getArrayElement(i)");
            if (!b(gVar2, eK, cVarB)) {
                return false;
            }
        }
        return true;
    }

    public final Ic.g c() {
        return this.f48551a.n();
    }

    public final C4034q d(b.C0442b c0442b, Map map, hd.c cVar) {
        j0 j0Var = (j0) map.get(x.b(cVar, c0442b.q()));
        if (j0Var == null) {
            return null;
        }
        kd.f fVarB = x.b(cVar, c0442b.q());
        Cd.E type = j0Var.getType();
        AbstractC4862t.d(type, "parameter.type");
        b.C0442b.c cVarR = c0442b.r();
        AbstractC4862t.d(cVarR, "proto.value");
        return new C4034q(fVarB, g(type, cVarR, cVar));
    }

    public final InterfaceC1177e e(kd.b bVar) {
        return AbstractC1195x.c(this.f48551a, bVar, this.f48552b);
    }

    public final qd.g f(Cd.E expectedType, b.C0442b.c value, hd.c nameResolver) {
        AbstractC4862t.e(expectedType, "expectedType");
        AbstractC4862t.e(value, "value");
        AbstractC4862t.e(nameResolver, "nameResolver");
        Boolean boolD = hd.b.f36537O.d(value.J());
        AbstractC4862t.d(boolD, "IS_UNSIGNED.get(value.flags)");
        boolean zBooleanValue = boolD.booleanValue();
        b.C0442b.c.EnumC0445c enumC0445cN = value.N();
        switch (enumC0445cN == null ? -1 : a.f48553a[enumC0445cN.ordinal()]) {
            case 1:
                byte bL = (byte) value.L();
                return zBooleanValue ? new qd.v(bL) : new qd.d(bL);
            case 2:
                return new qd.e((char) value.L());
            case 3:
                short sL = (short) value.L();
                return zBooleanValue ? new qd.y(sL) : new qd.t(sL);
            case 4:
                int iL = (int) value.L();
                return zBooleanValue ? new qd.w(iL) : new qd.m(iL);
            case 5:
                long jL = value.L();
                return zBooleanValue ? new qd.x(jL) : new qd.q(jL);
            case 6:
                return new qd.l(value.K());
            case 7:
                return new qd.i(value.G());
            case 8:
                return new C5517c(value.L() != 0);
            case 9:
                return new qd.u(nameResolver.getString(value.M()));
            case 10:
                return new qd.p(x.a(nameResolver, value.E()), value.A());
            case 11:
                return new qd.j(x.a(nameResolver, value.E()), x.b(nameResolver, value.I()));
            case 12:
                fd.b bVarZ = value.z();
                AbstractC4862t.d(bVarZ, "value.annotation");
                return new C5515a(a(bVarZ, nameResolver));
            case 13:
                List<b.C0442b.c> listD = value.D();
                AbstractC4862t.d(listD, "value.arrayElementList");
                ArrayList arrayList = new ArrayList(C4207u.v(listD, 10));
                for (b.C0442b.c it : listD) {
                    Cd.M mI = c().i();
                    AbstractC4862t.d(mI, "builtIns.anyType");
                    AbstractC4862t.d(it, "it");
                    arrayList.add(f(mI, it, nameResolver));
                }
                return new n(arrayList, expectedType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.N() + " (expected " + expectedType + ')').toString());
        }
    }

    public final qd.g g(Cd.E e10, b.C0442b.c cVar, hd.c cVar2) {
        qd.g gVarF = f(e10, cVar, cVar2);
        if (!b(gVarF, e10, cVar)) {
            gVarF = null;
        }
        if (gVarF != null) {
            return gVarF;
        }
        return qd.k.f43444b.a("Unexpected argument value: actual type " + cVar.N() + " != expected type " + e10);
    }
}
