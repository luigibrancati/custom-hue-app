package dd;

import Lc.a0;
import Od.F;
import com.fasterxml.jackson.core.JsonPointer;
import dd.C3916u;
import dd.InterfaceC3913r;
import fd.c;
import gc.C4206t;
import gc.C4207u;
import id.AbstractC4376a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jd.AbstractC4763d;
import jd.C4761b;
import jd.C4768i;
import kotlin.jvm.internal.AbstractC4862t;
import md.i;
import td.C5881d;
import yd.EnumC6469b;
import yd.InterfaceC6473f;
import yd.z;

/* JADX INFO: renamed from: dd.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3897b implements InterfaceC6473f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3911p f33391a;

    /* JADX INFO: renamed from: dd.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {
        public abstract Map a();
    }

    /* JADX INFO: renamed from: dd.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum EnumC0409b {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* JADX INFO: renamed from: dd.b$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33392a;

        static {
            int[] iArr = new int[EnumC6469b.values().length];
            try {
                iArr[EnumC6469b.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6469b.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6469b.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f33392a = iArr;
        }
    }

    public AbstractC3897b(InterfaceC3911p kotlinClassFinder) {
        AbstractC4862t.e(kotlinClassFinder, "kotlinClassFinder");
        this.f33391a = kotlinClassFinder;
    }

    public static /* synthetic */ List n(AbstractC3897b abstractC3897b, yd.z zVar, C3916u c3916u, boolean z10, boolean z11, Boolean bool, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        if ((i10 & 16) != 0) {
            bool = null;
        }
        if ((i10 & 32) != 0) {
            z12 = false;
        }
        return abstractC3897b.m(zVar, c3916u, z10, z11, bool, z12);
    }

    public static /* synthetic */ C3916u s(AbstractC3897b abstractC3897b, md.p pVar, hd.c cVar, hd.g gVar, EnumC6469b enumC6469b, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return abstractC3897b.r(pVar, cVar, gVar, enumC6469b, z10);
    }

    @Override // yd.InterfaceC6473f
    public List a(fd.q proto, hd.c nameResolver) {
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(nameResolver, "nameResolver");
        Object objO = proto.o(AbstractC4376a.f37383f);
        AbstractC4862t.d(objO, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<fd.b> iterable = (Iterable) objO;
        ArrayList arrayList = new ArrayList(C4207u.v(iterable, 10));
        for (fd.b it : iterable) {
            AbstractC4862t.d(it, "it");
            arrayList.add(y(it, nameResolver));
        }
        return arrayList;
    }

    @Override // yd.InterfaceC6473f
    public List b(yd.z container, fd.g proto) {
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(proto, "proto");
        C3916u.a aVar = C3916u.f33461b;
        String string = container.b().getString(proto.z());
        String strC = ((z.a) container).e().c();
        AbstractC4862t.d(strC, "container as ProtoContai…Class).classId.asString()");
        return n(this, container, aVar.a(string, C4761b.b(strC)), false, false, null, false, 60, null);
    }

    @Override // yd.InterfaceC6473f
    public List c(yd.z container, md.p proto, EnumC6469b kind) {
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(kind, "kind");
        C3916u c3916uS = s(this, proto, container.b(), container.d(), kind, false, 16, null);
        return c3916uS != null ? n(this, container, C3916u.f33461b.e(c3916uS, 0), false, false, null, false, 60, null) : C4206t.k();
    }

    @Override // yd.InterfaceC6473f
    public List e(yd.z container, fd.n proto) {
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(proto, "proto");
        return x(container, proto, EnumC0409b.BACKING_FIELD);
    }

    @Override // yd.InterfaceC6473f
    public List f(yd.z container, fd.n proto) {
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(proto, "proto");
        return x(container, proto, EnumC0409b.DELEGATE_FIELD);
    }

    @Override // yd.InterfaceC6473f
    public List g(yd.z container, md.p callableProto, EnumC6469b kind, int i10, fd.u proto) {
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(callableProto, "callableProto");
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(proto, "proto");
        C3916u c3916uS = s(this, callableProto, container.b(), container.d(), kind, false, 16, null);
        if (c3916uS == null) {
            return C4206t.k();
        }
        return n(this, container, C3916u.f33461b.e(c3916uS, i10 + l(container, callableProto)), false, false, null, false, 60, null);
    }

    @Override // yd.InterfaceC6473f
    public List h(fd.s proto, hd.c nameResolver) {
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(nameResolver, "nameResolver");
        Object objO = proto.o(AbstractC4376a.f37385h);
        AbstractC4862t.d(objO, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<fd.b> iterable = (Iterable) objO;
        ArrayList arrayList = new ArrayList(C4207u.v(iterable, 10));
        for (fd.b it : iterable) {
            AbstractC4862t.d(it, "it");
            arrayList.add(y(it, nameResolver));
        }
        return arrayList;
    }

    @Override // yd.InterfaceC6473f
    public List i(z.a container) {
        AbstractC4862t.e(container, "container");
        InterfaceC3913r interfaceC3913rZ = z(container);
        if (interfaceC3913rZ != null) {
            ArrayList arrayList = new ArrayList(1);
            interfaceC3913rZ.d(new d(arrayList), q(interfaceC3913rZ));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.a()).toString());
    }

    @Override // yd.InterfaceC6473f
    public List k(yd.z container, md.p proto, EnumC6469b kind) {
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(kind, "kind");
        if (kind == EnumC6469b.PROPERTY) {
            return x(container, (fd.n) proto, EnumC0409b.PROPERTY);
        }
        C3916u c3916uS = s(this, proto, container.b(), container.d(), kind, false, 16, null);
        return c3916uS == null ? C4206t.k() : n(this, container, c3916uS, false, false, null, false, 60, null);
    }

    public final int l(yd.z zVar, md.p pVar) {
        if (pVar instanceof fd.i) {
            return hd.f.g((fd.i) pVar) ? 1 : 0;
        }
        if (pVar instanceof fd.n) {
            return hd.f.h((fd.n) pVar) ? 1 : 0;
        }
        if (!(pVar instanceof fd.d)) {
            throw new UnsupportedOperationException("Unsupported message: " + pVar.getClass());
        }
        AbstractC4862t.c(zVar, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
        z.a aVar = (z.a) zVar;
        if (aVar.g() == c.EnumC0446c.ENUM_CLASS) {
            return 2;
        }
        return aVar.i() ? 1 : 0;
    }

    public final List m(yd.z zVar, C3916u c3916u, boolean z10, boolean z11, Boolean bool, boolean z12) {
        InterfaceC3913r interfaceC3913rO = o(zVar, t(zVar, z10, z11, bool, z12));
        if (interfaceC3913rO == null) {
            return C4206t.k();
        }
        List list = (List) p(interfaceC3913rO).a().get(c3916u);
        return list == null ? C4206t.k() : list;
    }

    public final InterfaceC3913r o(yd.z container, InterfaceC3913r interfaceC3913r) {
        AbstractC4862t.e(container, "container");
        if (interfaceC3913r != null) {
            return interfaceC3913r;
        }
        if (container instanceof z.a) {
            return z((z.a) container);
        }
        return null;
    }

    public abstract a p(InterfaceC3913r interfaceC3913r);

    public byte[] q(InterfaceC3913r kotlinClass) {
        AbstractC4862t.e(kotlinClass, "kotlinClass");
        return null;
    }

    public final C3916u r(md.p proto, hd.c nameResolver, hd.g typeTable, EnumC6469b kind, boolean z10) {
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(nameResolver, "nameResolver");
        AbstractC4862t.e(typeTable, "typeTable");
        AbstractC4862t.e(kind, "kind");
        if (proto instanceof fd.d) {
            C3916u.a aVar = C3916u.f33461b;
            AbstractC4763d.b bVarB = C4768i.f39178a.b((fd.d) proto, nameResolver, typeTable);
            if (bVarB == null) {
                return null;
            }
            return aVar.b(bVarB);
        }
        if (proto instanceof fd.i) {
            C3916u.a aVar2 = C3916u.f33461b;
            AbstractC4763d.b bVarE = C4768i.f39178a.e((fd.i) proto, nameResolver, typeTable);
            if (bVarE == null) {
                return null;
            }
            return aVar2.b(bVarE);
        }
        if (proto instanceof fd.n) {
            i.f propertySignature = AbstractC4376a.f37381d;
            AbstractC4862t.d(propertySignature, "propertySignature");
            AbstractC4376a.d dVar = (AbstractC4376a.d) hd.e.a((i.d) proto, propertySignature);
            if (dVar == null) {
                return null;
            }
            int i10 = c.f33392a[kind.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return AbstractC3898c.a((fd.n) proto, nameResolver, typeTable, true, true, z10);
                }
                if (!dVar.B()) {
                    return null;
                }
                C3916u.a aVar3 = C3916u.f33461b;
                AbstractC4376a.c cVarW = dVar.w();
                AbstractC4862t.d(cVarW, "signature.setter");
                return aVar3.c(nameResolver, cVarW);
            }
            if (dVar.A()) {
                C3916u.a aVar4 = C3916u.f33461b;
                AbstractC4376a.c cVarV = dVar.v();
                AbstractC4862t.d(cVarV, "signature.getter");
                return aVar4.c(nameResolver, cVarV);
            }
        }
        return null;
    }

    public final InterfaceC3913r t(yd.z container, boolean z10, boolean z11, Boolean bool, boolean z12) {
        z.a aVarH;
        AbstractC4862t.e(container, "container");
        if (z10) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
            }
            if (container instanceof z.a) {
                z.a aVar = (z.a) container;
                if (aVar.g() == c.EnumC0446c.INTERFACE) {
                    InterfaceC3911p interfaceC3911p = this.f33391a;
                    kd.b bVarD = aVar.e().d(kd.f.s("DefaultImpls"));
                    AbstractC4862t.d(bVarD, "container.classId.create…EFAULT_IMPLS_CLASS_NAME))");
                    return AbstractC3912q.b(interfaceC3911p, bVarD);
                }
            }
            if (bool.booleanValue() && (container instanceof z.b)) {
                a0 a0VarC = container.c();
                C3907l c3907l = a0VarC instanceof C3907l ? (C3907l) a0VarC : null;
                C5881d c5881dF = c3907l != null ? c3907l.f() : null;
                if (c5881dF != null) {
                    InterfaceC3911p interfaceC3911p2 = this.f33391a;
                    String strF = c5881dF.f();
                    AbstractC4862t.d(strF, "facadeClassName.internalName");
                    kd.b bVarM = kd.b.m(new kd.c(Od.C.K(strF, JsonPointer.SEPARATOR, '.', false, 4, null)));
                    AbstractC4862t.d(bVarM, "topLevel(FqName(facadeCl…lName.replace('/', '.')))");
                    return AbstractC3912q.b(interfaceC3911p2, bVarM);
                }
            }
        }
        if (z11 && (container instanceof z.a)) {
            z.a aVar2 = (z.a) container;
            if (aVar2.g() == c.EnumC0446c.COMPANION_OBJECT && (aVarH = aVar2.h()) != null && (aVarH.g() == c.EnumC0446c.CLASS || aVarH.g() == c.EnumC0446c.ENUM_CLASS || (z12 && (aVarH.g() == c.EnumC0446c.INTERFACE || aVarH.g() == c.EnumC0446c.ANNOTATION_CLASS)))) {
                return z(aVarH);
            }
        }
        if (!(container instanceof z.b) || !(container.c() instanceof C3907l)) {
            return null;
        }
        a0 a0VarC2 = container.c();
        AbstractC4862t.c(a0VarC2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        C3907l c3907l2 = (C3907l) a0VarC2;
        InterfaceC3913r interfaceC3913rG = c3907l2.g();
        return interfaceC3913rG == null ? AbstractC3912q.b(this.f33391a, c3907l2.d()) : interfaceC3913rG;
    }

    public final boolean u(kd.b classId) {
        InterfaceC3913r interfaceC3913rB;
        AbstractC4862t.e(classId, "classId");
        return classId.g() != null && AbstractC4862t.a(classId.j().b(), "Container") && (interfaceC3913rB = AbstractC3912q.b(this.f33391a, classId)) != null && Hc.a.f5349a.c(interfaceC3913rB);
    }

    public abstract InterfaceC3913r.a v(kd.b bVar, a0 a0Var, List list);

    public final InterfaceC3913r.a w(kd.b annotationClassId, a0 source, List result) {
        AbstractC4862t.e(annotationClassId, "annotationClassId");
        AbstractC4862t.e(source, "source");
        AbstractC4862t.e(result, "result");
        if (Hc.a.f5349a.b().contains(annotationClassId)) {
            return null;
        }
        return v(annotationClassId, source, result);
    }

    public final List x(yd.z zVar, fd.n nVar, EnumC0409b enumC0409b) {
        Boolean boolD = hd.b.f36523A.d(nVar.V());
        AbstractC4862t.d(boolD, "IS_CONST.get(proto.flags)");
        boolD.booleanValue();
        boolean zF = C4768i.f(nVar);
        if (enumC0409b == EnumC0409b.PROPERTY) {
            C3916u c3916uB = AbstractC3898c.b(nVar, zVar.b(), zVar.d(), false, true, false, 40, null);
            return c3916uB == null ? C4206t.k() : n(this, zVar, c3916uB, true, false, boolD, zF, 8, null);
        }
        C3916u c3916uB2 = AbstractC3898c.b(nVar, zVar.b(), zVar.d(), true, false, false, 48, null);
        if (c3916uB2 == null) {
            return C4206t.k();
        }
        return F.V(c3916uB2.a(), "$delegate", false, 2, null) != (enumC0409b == EnumC0409b.DELEGATE_FIELD) ? C4206t.k() : m(zVar, c3916uB2, true, true, boolD, zF);
    }

    public abstract Object y(fd.b bVar, hd.c cVar);

    public final InterfaceC3913r z(z.a aVar) {
        a0 a0VarC = aVar.c();
        C3915t c3915t = a0VarC instanceof C3915t ? (C3915t) a0VarC : null;
        if (c3915t != null) {
            return c3915t.d();
        }
        return null;
    }

    /* JADX INFO: renamed from: dd.b$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements InterfaceC3913r.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f33394b;

        public d(ArrayList arrayList) {
            this.f33394b = arrayList;
        }

        @Override // dd.InterfaceC3913r.c
        public InterfaceC3913r.a c(kd.b classId, a0 source) {
            AbstractC4862t.e(classId, "classId");
            AbstractC4862t.e(source, "source");
            return AbstractC3897b.this.w(classId, source, this.f33394b);
        }

        @Override // dd.InterfaceC3913r.c
        public void a() {
        }
    }
}
