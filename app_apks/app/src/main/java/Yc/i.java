package Yc;

import Lc.InterfaceC1177e;
import Lc.InterfaceC1185m;
import Uc.p;
import Yc.b;
import bd.EnumC2908D;
import bd.InterfaceC2915g;
import bd.u;
import dd.AbstractC3912q;
import dd.InterfaceC3911p;
import dd.InterfaceC3913r;
import ed.C3979a;
import fc.C4032o;
import gc.C4206t;
import gc.U;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;
import vd.C6095d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u f19969n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h f19970o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Bd.j f19971p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Bd.h f19972q;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kd.f f19973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC2915g f19974b;

        public a(kd.f name, InterfaceC2915g interfaceC2915g) {
            AbstractC4862t.e(name, "name");
            this.f19973a = name;
            this.f19974b = interfaceC2915g;
        }

        public final InterfaceC2915g a() {
            return this.f19974b;
        }

        public final kd.f b() {
            return this.f19973a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC4862t.a(this.f19973a, ((a) obj).f19973a);
        }

        public int hashCode() {
            return this.f19973a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterfaceC1177e f19975a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC1177e descriptor) {
                super(null);
                AbstractC4862t.e(descriptor, "descriptor");
                this.f19975a = descriptor;
            }

            public final InterfaceC1177e a() {
                return this.f19975a;
            }
        }

        /* JADX INFO: renamed from: Yc.i$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0255b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0255b f19976a = new C0255b();

            public C0255b() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f19977a = new c();

            public c() {
                super(null);
            }
        }

        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements vc.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Xc.g f19979b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Xc.g gVar) {
            super(1);
            this.f19979b = gVar;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1177e invoke(a request) {
            AbstractC4862t.e(request, "request");
            kd.b bVar = new kd.b(i.this.C().e(), request.b());
            InterfaceC3911p.a aVarA = request.a() != null ? this.f19979b.a().j().a(request.a()) : this.f19979b.a().j().b(bVar);
            InterfaceC3913r interfaceC3913rA = aVarA != null ? aVarA.a() : null;
            kd.b bVarC = interfaceC3913rA != null ? interfaceC3913rA.c() : null;
            if (bVarC != null && (bVarC.l() || bVarC.k())) {
                return null;
            }
            b bVarR = i.this.R(interfaceC3913rA);
            if (bVarR instanceof b.a) {
                return ((b.a) bVarR).a();
            }
            if (bVarR instanceof b.c) {
                return null;
            }
            if (!(bVarR instanceof b.C0255b)) {
                throw new C4032o();
            }
            InterfaceC2915g interfaceC2915gA = request.a();
            if (interfaceC2915gA == null) {
                p pVarD = this.f19979b.a().d();
                if (aVarA != null) {
                    android.support.v4.media.session.a.a(null);
                }
                interfaceC2915gA = pVarD.c(new p.a(bVar, null, null, 4, null));
            }
            InterfaceC2915g interfaceC2915g = interfaceC2915gA;
            if ((interfaceC2915g != null ? interfaceC2915g.K() : null) != EnumC2908D.BINARY) {
                kd.c cVarE = interfaceC2915g != null ? interfaceC2915g.e() : null;
                if (cVarE == null || cVarE.d() || !AbstractC4862t.a(cVarE.e(), i.this.C().e())) {
                    return null;
                }
                f fVar = new f(this.f19979b, i.this.C(), interfaceC2915g, null, 8, null);
                this.f19979b.a().e().a(fVar);
                return fVar;
            }
            throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + interfaceC2915g + "\nClassId: " + bVar + "\nfindKotlinClass(JavaClass) = " + AbstractC3912q.a(this.f19979b.a().j(), interfaceC2915g) + "\nfindKotlinClass(ClassId) = " + AbstractC3912q.b(this.f19979b.a().j(), bVar) + '\n');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Xc.g f19980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f19981b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Xc.g gVar, i iVar) {
            super(0);
            this.f19980a = gVar;
            this.f19981b = iVar;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            return this.f19980a.a().d().b(this.f19981b.C().e());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Xc.g c10, u jPackage, h ownerDescriptor) {
        super(c10);
        AbstractC4862t.e(c10, "c");
        AbstractC4862t.e(jPackage, "jPackage");
        AbstractC4862t.e(ownerDescriptor, "ownerDescriptor");
        this.f19969n = jPackage;
        this.f19970o = ownerDescriptor;
        this.f19971p = c10.e().h(new d(c10, this));
        this.f19972q = c10.e().b(new c(c10));
    }

    public final InterfaceC1177e N(kd.f fVar, InterfaceC2915g interfaceC2915g) {
        if (!kd.h.f39566a.a(fVar)) {
            return null;
        }
        Set set = (Set) this.f19971p.invoke();
        if (interfaceC2915g != null || set == null || set.contains(fVar.b())) {
            return (InterfaceC1177e) this.f19972q.invoke(new a(fVar, interfaceC2915g));
        }
        return null;
    }

    public final InterfaceC1177e O(InterfaceC2915g javaClass) {
        AbstractC4862t.e(javaClass, "javaClass");
        return N(javaClass.getName(), javaClass);
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6102k
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public InterfaceC1177e e(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return N(name, null);
    }

    @Override // Yc.j
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public h C() {
        return this.f19970o;
    }

    public final b R(InterfaceC3913r interfaceC3913r) {
        if (interfaceC3913r == null) {
            return b.C0255b.f19976a;
        }
        if (interfaceC3913r.e().c() != C3979a.EnumC0429a.CLASS) {
            return b.c.f19977a;
        }
        InterfaceC1177e interfaceC1177eK = w().a().b().k(interfaceC3913r);
        return interfaceC1177eK != null ? new b.a(interfaceC1177eK) : b.C0255b.f19976a;
    }

    @Override // Yc.j, vd.AbstractC6100i, vd.InterfaceC6099h
    public Collection c(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return C4206t.k();
    }

    @Override // Yc.j, vd.AbstractC6100i, vd.InterfaceC6102k
    public Collection f(C6095d kindFilter, vc.l nameFilter) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        AbstractC4862t.e(nameFilter, "nameFilter");
        C6095d.a aVar = C6095d.f45974c;
        if (!kindFilter.a(aVar.e() | aVar.c())) {
            return C4206t.k();
        }
        Iterable iterable = (Iterable) v().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC1185m interfaceC1185m = (InterfaceC1185m) obj;
            if (interfaceC1185m instanceof InterfaceC1177e) {
                kd.f name = ((InterfaceC1177e) interfaceC1185m).getName();
                AbstractC4862t.d(name, "it.name");
                if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // Yc.j
    public Set l(C6095d kindFilter, vc.l lVar) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        if (!kindFilter.a(C6095d.f45974c.e())) {
            return U.d();
        }
        Set set = (Set) this.f19971p.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(kd.f.s((String) it.next()));
            }
            return hashSet;
        }
        u uVar = this.f19969n;
        if (lVar == null) {
            lVar = Md.d.a();
        }
        Collection<InterfaceC2915g> collectionF = uVar.F(lVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC2915g interfaceC2915g : collectionF) {
            kd.f name = interfaceC2915g.K() == EnumC2908D.SOURCE ? null : interfaceC2915g.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // Yc.j
    public Set n(C6095d kindFilter, vc.l lVar) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        return U.d();
    }

    @Override // Yc.j
    public Yc.b p() {
        return b.a.f19892a;
    }

    @Override // Yc.j
    public void r(Collection result, kd.f name) {
        AbstractC4862t.e(result, "result");
        AbstractC4862t.e(name, "name");
    }

    @Override // Yc.j
    public Set t(C6095d kindFilter, vc.l lVar) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        return U.d();
    }
}
