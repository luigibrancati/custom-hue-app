package yd;

import Lc.AbstractC1192u;
import Lc.EnumC1178f;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1176d;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1185m;
import Lc.K;
import Lc.U;
import Lc.X;
import Lc.Z;
import Lc.a0;
import Lc.e0;
import Lc.j0;
import Mc.g;
import com.google.android.libraries.barhopper.RecognitionOptions;
import fc.C4034q;
import gc.C4179C;
import gc.C4205s;
import gc.C4206t;
import gc.C4207u;
import gc.Q;
import hd.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import od.AbstractC5282d;
import sd.AbstractC5823c;
import vc.InterfaceC6082a;
import yd.z;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f48618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6472e f48619b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ md.p f48621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ EnumC6469b f48622c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(md.p pVar, EnumC6469b enumC6469b) {
            super(0);
            this.f48621b = pVar;
            this.f48622c = enumC6469b;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List listV0;
            w wVar = w.this;
            z zVarC = wVar.c(wVar.f48618a.e());
            if (zVarC != null) {
                listV0 = C4179C.V0(w.this.f48618a.c().d().k(zVarC, this.f48621b, this.f48622c));
            } else {
                listV0 = null;
            }
            return listV0 == null ? C4206t.k() : listV0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f48624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fd.n f48625c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, fd.n nVar) {
            super(0);
            this.f48624b = z10;
            this.f48625c = nVar;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List listV0;
            w wVar = w.this;
            z zVarC = wVar.c(wVar.f48618a.e());
            if (zVarC != null) {
                boolean z10 = this.f48624b;
                w wVar2 = w.this;
                fd.n nVar = this.f48625c;
                listV0 = z10 ? C4179C.V0(wVar2.f48618a.c().d().f(zVarC, nVar)) : C4179C.V0(wVar2.f48618a.c().d().e(zVarC, nVar));
            } else {
                listV0 = null;
            }
            return listV0 == null ? C4206t.k() : listV0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ md.p f48627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ EnumC6469b f48628c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(md.p pVar, EnumC6469b enumC6469b) {
            super(0);
            this.f48627b = pVar;
            this.f48628c = enumC6469b;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List listC;
            w wVar = w.this;
            z zVarC = wVar.c(wVar.f48618a.e());
            if (zVarC != null) {
                listC = w.this.f48618a.c().d().c(zVarC, this.f48627b, this.f48628c);
            } else {
                listC = null;
            }
            return listC == null ? C4206t.k() : listC;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fd.n f48630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ad.j f48631c;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ w f48632a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ fd.n f48633b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Ad.j f48634c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w wVar, fd.n nVar, Ad.j jVar) {
                super(0);
                this.f48632a = wVar;
                this.f48633b = nVar;
                this.f48634c = jVar;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final qd.g invoke() {
                w wVar = this.f48632a;
                z zVarC = wVar.c(wVar.f48618a.e());
                AbstractC4862t.b(zVarC);
                InterfaceC6470c interfaceC6470cD = this.f48632a.f48618a.c().d();
                fd.n nVar = this.f48633b;
                Cd.E returnType = this.f48634c.getReturnType();
                AbstractC4862t.d(returnType, "property.returnType");
                return (qd.g) interfaceC6470cD.d(zVarC, nVar, returnType);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(fd.n nVar, Ad.j jVar) {
            super(0);
            this.f48630b = nVar;
            this.f48631c = jVar;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bd.j invoke() {
            return w.this.f48618a.h().h(new a(w.this, this.f48630b, this.f48631c));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fd.n f48636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ad.j f48637c;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ w f48638a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ fd.n f48639b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Ad.j f48640c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w wVar, fd.n nVar, Ad.j jVar) {
                super(0);
                this.f48638a = wVar;
                this.f48639b = nVar;
                this.f48640c = jVar;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final qd.g invoke() {
                w wVar = this.f48638a;
                z zVarC = wVar.c(wVar.f48618a.e());
                AbstractC4862t.b(zVarC);
                InterfaceC6470c interfaceC6470cD = this.f48638a.f48618a.c().d();
                fd.n nVar = this.f48639b;
                Cd.E returnType = this.f48640c.getReturnType();
                AbstractC4862t.d(returnType, "property.returnType");
                return (qd.g) interfaceC6470cD.j(zVarC, nVar, returnType);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(fd.n nVar, Ad.j jVar) {
            super(0);
            this.f48636b = nVar;
            this.f48637c = jVar;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bd.j invoke() {
            return w.this.f48618a.h().h(new a(w.this, this.f48636b, this.f48637c));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ z f48642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ md.p f48643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ EnumC6469b f48644d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f48645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ fd.u f48646f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(z zVar, md.p pVar, EnumC6469b enumC6469b, int i10, fd.u uVar) {
            super(0);
            this.f48642b = zVar;
            this.f48643c = pVar;
            this.f48644d = enumC6469b;
            this.f48645e = i10;
            this.f48646f = uVar;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return C4179C.V0(w.this.f48618a.c().d().g(this.f48642b, this.f48643c, this.f48644d, this.f48645e, this.f48646f));
        }
    }

    public w(m c10) {
        AbstractC4862t.e(c10, "c");
        this.f48618a = c10;
        this.f48619b = new C6472e(c10.c().p(), c10.c().q());
    }

    public final z c(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m instanceof K) {
            return new z.b(((K) interfaceC1185m).e(), this.f48618a.g(), this.f48618a.j(), this.f48618a.d());
        }
        if (interfaceC1185m instanceof Ad.d) {
            return ((Ad.d) interfaceC1185m).f1();
        }
        return null;
    }

    public final Mc.g d(md.p pVar, int i10, EnumC6469b enumC6469b) {
        return !hd.b.f36540c.d(i10).booleanValue() ? Mc.g.f9435K.b() : new Ad.n(this.f48618a.h(), new a(pVar, enumC6469b));
    }

    public final X e() {
        InterfaceC1185m interfaceC1185mE = this.f48618a.e();
        InterfaceC1177e interfaceC1177e = interfaceC1185mE instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1185mE : null;
        if (interfaceC1177e != null) {
            return interfaceC1177e.J0();
        }
        return null;
    }

    public final Mc.g f(fd.n nVar, boolean z10) {
        return !hd.b.f36540c.d(nVar.V()).booleanValue() ? Mc.g.f9435K.b() : new Ad.n(this.f48618a.h(), new b(z10, nVar));
    }

    public final Mc.g g(md.p pVar, EnumC6469b enumC6469b) {
        return new Ad.a(this.f48618a.h(), new c(pVar, enumC6469b));
    }

    public final void h(Ad.k kVar, X x10, X x11, List list, List list2, List list3, Cd.E e10, Lc.D d10, AbstractC1192u abstractC1192u, Map map) {
        kVar.o1(x10, x11, list, list2, list3, e10, d10, abstractC1192u, map);
    }

    public final InterfaceC1176d i(fd.d proto, boolean z10) {
        AbstractC4862t.e(proto, "proto");
        InterfaceC1185m interfaceC1185mE = this.f48618a.e();
        AbstractC4862t.c(interfaceC1185mE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        InterfaceC1177e interfaceC1177e = (InterfaceC1177e) interfaceC1185mE;
        int iD = proto.D();
        EnumC6469b enumC6469b = EnumC6469b.FUNCTION;
        Ad.c cVar = new Ad.c(interfaceC1177e, null, d(proto, iD, enumC6469b), z10, InterfaceC1174b.a.DECLARATION, proto, this.f48618a.g(), this.f48618a.j(), this.f48618a.k(), this.f48618a.d(), null, RecognitionOptions.UPC_E, null);
        w wVarF = m.b(this.f48618a, cVar, C4206t.k(), null, null, null, null, 60, null).f();
        List listG = proto.G();
        AbstractC4862t.d(listG, "proto.valueParameterList");
        cVar.q1(wVarF.o(listG, proto, enumC6469b), AbstractC6464B.a(C6463A.f48513a, (fd.x) hd.b.f36541d.d(proto.D())));
        cVar.g1(interfaceC1177e.p());
        cVar.W0(interfaceC1177e.k0());
        cVar.Y0(!hd.b.f36551n.d(proto.D()).booleanValue());
        return cVar;
    }

    public final Z j(fd.i proto) {
        Cd.E eQ;
        AbstractC4862t.e(proto, "proto");
        int iX = proto.n0() ? proto.X() : k(proto.Z());
        EnumC6469b enumC6469b = EnumC6469b.FUNCTION;
        Mc.g gVarD = d(proto, iX, enumC6469b);
        Mc.g gVarG = hd.f.g(proto) ? g(proto, enumC6469b) : Mc.g.f9435K.b();
        Ad.k kVar = new Ad.k(this.f48618a.e(), null, gVarD, x.b(this.f48618a.g(), proto.Y()), AbstractC6464B.b(C6463A.f48513a, (fd.j) hd.b.f36552o.d(iX)), proto, this.f48618a.g(), this.f48618a.j(), AbstractC4862t.a(AbstractC5823c.l(this.f48618a.e()).c(x.b(this.f48618a.g(), proto.Y())), AbstractC6465C.f48525a) ? hd.h.f36571b.b() : this.f48618a.k(), this.f48618a.d(), null, RecognitionOptions.UPC_E, null);
        m mVar = this.f48618a;
        List listG0 = proto.g0();
        AbstractC4862t.d(listG0, "proto.typeParameterList");
        m mVarB = m.b(mVar, kVar, listG0, null, null, null, null, 60, null);
        fd.q qVarK = hd.f.k(proto, this.f48618a.j());
        X xI = (qVarK == null || (eQ = mVarB.i().q(qVarK)) == null) ? null : AbstractC5282d.i(kVar, eQ, gVarG);
        X xE = e();
        List listC = hd.f.c(proto, this.f48618a.j());
        ArrayList arrayList = new ArrayList();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            X xN = n((fd.q) it.next(), mVarB, kVar);
            if (xN != null) {
                arrayList.add(xN);
            }
        }
        List listJ = mVarB.i().j();
        w wVarF = mVarB.f();
        List listK0 = proto.k0();
        AbstractC4862t.d(listK0, "proto.valueParameterList");
        List listO = wVarF.o(listK0, proto, EnumC6469b.FUNCTION);
        Cd.E eQ2 = mVarB.i().q(hd.f.m(proto, this.f48618a.j()));
        C6463A c6463a = C6463A.f48513a;
        h(kVar, xI, xE, arrayList, listJ, listO, eQ2, c6463a.b((fd.k) hd.b.f36542e.d(iX)), AbstractC6464B.a(c6463a, (fd.x) hd.b.f36541d.d(iX)), Q.i());
        Boolean boolD = hd.b.f36553p.d(iX);
        AbstractC4862t.d(boolD, "IS_OPERATOR.get(flags)");
        kVar.f1(boolD.booleanValue());
        Boolean boolD2 = hd.b.f36554q.d(iX);
        AbstractC4862t.d(boolD2, "IS_INFIX.get(flags)");
        kVar.c1(boolD2.booleanValue());
        Boolean boolD3 = hd.b.f36557t.d(iX);
        AbstractC4862t.d(boolD3, "IS_EXTERNAL_FUNCTION.get(flags)");
        kVar.X0(boolD3.booleanValue());
        Boolean boolD4 = hd.b.f36555r.d(iX);
        AbstractC4862t.d(boolD4, "IS_INLINE.get(flags)");
        kVar.e1(boolD4.booleanValue());
        Boolean boolD5 = hd.b.f36556s.d(iX);
        AbstractC4862t.d(boolD5, "IS_TAILREC.get(flags)");
        kVar.i1(boolD5.booleanValue());
        Boolean boolD6 = hd.b.f36558u.d(iX);
        AbstractC4862t.d(boolD6, "IS_SUSPEND.get(flags)");
        kVar.h1(boolD6.booleanValue());
        Boolean boolD7 = hd.b.f36559v.d(iX);
        AbstractC4862t.d(boolD7, "IS_EXPECT_FUNCTION.get(flags)");
        kVar.W0(boolD7.booleanValue());
        kVar.Y0(!hd.b.f36560w.d(iX).booleanValue());
        C4034q c4034qA = this.f48618a.c().h().a(proto, kVar, this.f48618a.j(), mVarB.i());
        if (c4034qA != null) {
            kVar.U0((InterfaceC1173a.InterfaceC0132a) c4034qA.e(), c4034qA.f());
        }
        return kVar;
    }

    public final int k(int i10) {
        return (i10 & 63) + ((i10 >> 8) << 6);
    }

    public final U l(fd.n proto) {
        m mVar;
        b.d dVar;
        b.d dVar2;
        Oc.D d10;
        Oc.D d11;
        Oc.E e10;
        Cd.E eQ;
        AbstractC4862t.e(proto, "proto");
        int iV = proto.j0() ? proto.V() : k(proto.Y());
        InterfaceC1185m interfaceC1185mE = this.f48618a.e();
        Mc.g gVarD = d(proto, iV, EnumC6469b.PROPERTY);
        C6463A c6463a = C6463A.f48513a;
        Lc.D dB = c6463a.b((fd.k) hd.b.f36542e.d(iV));
        AbstractC1192u abstractC1192uA = AbstractC6464B.a(c6463a, (fd.x) hd.b.f36541d.d(iV));
        Boolean boolD = hd.b.f36561x.d(iV);
        AbstractC4862t.d(boolD, "IS_VAR.get(flags)");
        boolean zBooleanValue = boolD.booleanValue();
        kd.f fVarB = x.b(this.f48618a.g(), proto.X());
        InterfaceC1174b.a aVarB = AbstractC6464B.b(c6463a, (fd.j) hd.b.f36552o.d(iV));
        Boolean boolD2 = hd.b.f36524B.d(iV);
        AbstractC4862t.d(boolD2, "IS_LATEINIT.get(flags)");
        boolean zBooleanValue2 = boolD2.booleanValue();
        Boolean boolD3 = hd.b.f36523A.d(iV);
        AbstractC4862t.d(boolD3, "IS_CONST.get(flags)");
        boolean zBooleanValue3 = boolD3.booleanValue();
        Boolean boolD4 = hd.b.f36526D.d(iV);
        AbstractC4862t.d(boolD4, "IS_EXTERNAL_PROPERTY.get(flags)");
        boolean zBooleanValue4 = boolD4.booleanValue();
        Boolean boolD5 = hd.b.f36527E.d(iV);
        AbstractC4862t.d(boolD5, "IS_DELEGATED.get(flags)");
        boolean zBooleanValue5 = boolD5.booleanValue();
        Boolean boolD6 = hd.b.f36528F.d(iV);
        int i10 = iV;
        AbstractC4862t.d(boolD6, "IS_EXPECT_PROPERTY.get(flags)");
        Ad.j jVar = new Ad.j(interfaceC1185mE, null, gVarD, dB, abstractC1192uA, zBooleanValue, fVarB, aVarB, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, boolD6.booleanValue(), proto, this.f48618a.g(), this.f48618a.j(), this.f48618a.k(), this.f48618a.d());
        m mVar2 = this.f48618a;
        List listH0 = proto.h0();
        AbstractC4862t.d(listH0, "proto.typeParameterList");
        m mVarB = m.b(mVar2, jVar, listH0, null, null, null, null, 60, null);
        Boolean boolD7 = hd.b.f36562y.d(i10);
        AbstractC4862t.d(boolD7, "HAS_GETTER.get(flags)");
        boolean zBooleanValue6 = boolD7.booleanValue();
        Mc.g gVarG = (zBooleanValue6 && hd.f.h(proto)) ? g(proto, EnumC6469b.PROPERTY_GETTER) : Mc.g.f9435K.b();
        Cd.E eQ2 = mVarB.i().q(hd.f.n(proto, this.f48618a.j()));
        List listJ = mVarB.i().j();
        X xE = e();
        fd.q qVarL = hd.f.l(proto, this.f48618a.j());
        X xI = (qVarL == null || (eQ = mVarB.i().q(qVarL)) == null) ? null : AbstractC5282d.i(jVar, eQ, gVarG);
        List listD = hd.f.d(proto, this.f48618a.j());
        ArrayList arrayList = new ArrayList(C4207u.v(listD, 10));
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(n((fd.q) it.next(), mVarB, jVar));
        }
        jVar.b1(eQ2, listJ, xE, xI, arrayList);
        Boolean boolD8 = hd.b.f36540c.d(i10);
        AbstractC4862t.d(boolD8, "HAS_ANNOTATIONS.get(flags)");
        boolean zBooleanValue7 = boolD8.booleanValue();
        b.d dVar3 = hd.b.f36541d;
        fd.x xVar = (fd.x) dVar3.d(i10);
        b.d dVar4 = hd.b.f36542e;
        int iB = hd.b.b(zBooleanValue7, xVar, (fd.k) dVar4.d(i10), false, false, false);
        if (zBooleanValue6) {
            int iW = proto.k0() ? proto.W() : iB;
            Boolean boolD9 = hd.b.f36532J.d(iW);
            AbstractC4862t.d(boolD9, "IS_NOT_DEFAULT.get(getterFlags)");
            boolean zBooleanValue8 = boolD9.booleanValue();
            Boolean boolD10 = hd.b.f36533K.d(iW);
            AbstractC4862t.d(boolD10, "IS_EXTERNAL_ACCESSOR.get(getterFlags)");
            boolean zBooleanValue9 = boolD10.booleanValue();
            Boolean boolD11 = hd.b.f36534L.d(iW);
            AbstractC4862t.d(boolD11, "IS_INLINE_ACCESSOR.get(getterFlags)");
            boolean zBooleanValue10 = boolD11.booleanValue();
            Mc.g gVarD2 = d(proto, iW, EnumC6469b.PROPERTY_GETTER);
            if (zBooleanValue8) {
                C6463A c6463a2 = C6463A.f48513a;
                mVar = mVarB;
                dVar = dVar3;
                dVar2 = dVar4;
                d10 = new Oc.D(jVar, gVarD2, c6463a2.b((fd.k) dVar4.d(iW)), AbstractC6464B.a(c6463a2, (fd.x) dVar3.d(iW)), !zBooleanValue8, zBooleanValue9, zBooleanValue10, jVar.f(), null, a0.f8746a);
            } else {
                mVar = mVarB;
                dVar = dVar3;
                dVar2 = dVar4;
                d10 = AbstractC5282d.d(jVar, gVarD2);
                AbstractC4862t.d(d10, "{\n                Descri…nnotations)\n            }");
            }
            d10.P0(jVar.getReturnType());
        } else {
            mVar = mVarB;
            dVar = dVar3;
            dVar2 = dVar4;
            d10 = null;
        }
        Boolean boolD12 = hd.b.f36563z.d(i10);
        AbstractC4862t.d(boolD12, "HAS_SETTER.get(flags)");
        if (boolD12.booleanValue()) {
            if (proto.r0()) {
                iB = proto.d0();
            }
            int i11 = iB;
            Boolean boolD13 = hd.b.f36532J.d(i11);
            AbstractC4862t.d(boolD13, "IS_NOT_DEFAULT.get(setterFlags)");
            boolean zBooleanValue11 = boolD13.booleanValue();
            Boolean boolD14 = hd.b.f36533K.d(i11);
            AbstractC4862t.d(boolD14, "IS_EXTERNAL_ACCESSOR.get(setterFlags)");
            boolean zBooleanValue12 = boolD14.booleanValue();
            Boolean boolD15 = hd.b.f36534L.d(i11);
            AbstractC4862t.d(boolD15, "IS_INLINE_ACCESSOR.get(setterFlags)");
            boolean zBooleanValue13 = boolD15.booleanValue();
            EnumC6469b enumC6469b = EnumC6469b.PROPERTY_SETTER;
            Mc.g gVarD3 = d(proto, i11, enumC6469b);
            if (zBooleanValue11) {
                C6463A c6463a3 = C6463A.f48513a;
                d11 = d10;
                Oc.E e11 = new Oc.E(jVar, gVarD3, c6463a3.b((fd.k) dVar2.d(i11)), AbstractC6464B.a(c6463a3, (fd.x) dVar.d(i11)), !zBooleanValue11, zBooleanValue12, zBooleanValue13, jVar.f(), null, a0.f8746a);
                e11.Q0((j0) C4179C.F0(m.b(mVar, e11, C4206t.k(), null, null, null, null, 60, null).f().o(C4205s.d(proto.e0()), proto, enumC6469b)));
                e10 = e11;
            } else {
                d11 = d10;
                e10 = AbstractC5282d.e(jVar, gVarD3, Mc.g.f9435K.b());
                AbstractC4862t.d(e10, "{\n                Descri…          )\n            }");
            }
        } else {
            d11 = d10;
            e10 = null;
        }
        Boolean boolD16 = hd.b.f36525C.d(i10);
        AbstractC4862t.d(boolD16, "HAS_CONSTANT.get(flags)");
        if (boolD16.booleanValue()) {
            jVar.L0(new d(proto, jVar));
        }
        InterfaceC1185m interfaceC1185mE2 = this.f48618a.e();
        InterfaceC1177e interfaceC1177e = interfaceC1185mE2 instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1185mE2 : null;
        if ((interfaceC1177e != null ? interfaceC1177e.f() : null) == EnumC1178f.ANNOTATION_CLASS) {
            jVar.L0(new e(proto, jVar));
        }
        jVar.V0(d11, e10, new Oc.o(f(proto, false), jVar), new Oc.o(f(proto, true), jVar));
        return jVar;
    }

    public final e0 m(fd.r proto) {
        AbstractC4862t.e(proto, "proto");
        g.a aVar = Mc.g.f9435K;
        List<fd.b> listL = proto.L();
        AbstractC4862t.d(listL, "proto.annotationList");
        ArrayList arrayList = new ArrayList(C4207u.v(listL, 10));
        for (fd.b it : listL) {
            C6472e c6472e = this.f48619b;
            AbstractC4862t.d(it, "it");
            arrayList.add(c6472e.a(it, this.f48618a.g()));
        }
        Ad.l lVar = new Ad.l(this.f48618a.h(), this.f48618a.e(), aVar.a(arrayList), x.b(this.f48618a.g(), proto.R()), AbstractC6464B.a(C6463A.f48513a, (fd.x) hd.b.f36541d.d(proto.Q())), proto, this.f48618a.g(), this.f48618a.j(), this.f48618a.k(), this.f48618a.d());
        m mVar = this.f48618a;
        List listU = proto.U();
        AbstractC4862t.d(listU, "proto.typeParameterList");
        m mVarB = m.b(mVar, lVar, listU, null, null, null, null, 60, null);
        lVar.Q0(mVarB.i().j(), mVarB.i().l(hd.f.r(proto, this.f48618a.j()), false), mVarB.i().l(hd.f.e(proto, this.f48618a.j()), false));
        return lVar;
    }

    public final X n(fd.q qVar, m mVar, InterfaceC1173a interfaceC1173a) {
        return AbstractC5282d.b(interfaceC1173a, mVar.i().q(qVar), null, Mc.g.f9435K.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List o(java.util.List r20, md.p r21, yd.EnumC6469b r22) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.w.o(java.util.List, md.p, yd.b):java.util.List");
    }
}
