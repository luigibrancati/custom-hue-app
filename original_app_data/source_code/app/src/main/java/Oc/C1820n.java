package Oc;

import Cd.C0728k;
import Cd.e0;
import Lc.AbstractC1191t;
import Lc.AbstractC1192u;
import Lc.EnumC1178f;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1176d;
import Lc.InterfaceC1177e;
import Lc.a0;
import Lc.h0;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import od.AbstractC5287i;
import od.C5289k;
import vc.InterfaceC6082a;
import vd.AbstractC6100i;
import vd.C6095d;
import vd.InterfaceC6099h;

/* JADX INFO: renamed from: Oc.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C1820n extends AbstractC1813g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e0 f12272i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC6099h f12273j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bd.i f12274k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Mc.g f12275l;

    /* JADX INFO: renamed from: Oc.n$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractC6100i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bd.g f12276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bd.g f12277c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bd.i f12278d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C1820n f12279e;

        /* JADX INFO: renamed from: Oc.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0162a implements vc.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1820n f12280a;

            public C0162a(C1820n c1820n) {
                this.f12280a = c1820n;
            }

            @Override // vc.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection invoke(kd.f fVar) {
                return a.this.m(fVar);
            }
        }

        /* JADX INFO: renamed from: Oc.n$a$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class b implements vc.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1820n f12282a;

            public b(C1820n c1820n) {
                this.f12282a = c1820n;
            }

            @Override // vc.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection invoke(kd.f fVar) {
                return a.this.n(fVar);
            }
        }

        /* JADX INFO: renamed from: Oc.n$a$c */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class c implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1820n f12284a;

            public c(C1820n c1820n) {
                this.f12284a = c1820n;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection invoke() {
                return a.this.l();
            }
        }

        /* JADX INFO: renamed from: Oc.n$a$d */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class d extends AbstractC5287i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Set f12286a;

            public d(Set set) {
                this.f12286a = set;
            }

            public static /* synthetic */ void f(int i10) {
                Object[] objArr = new Object[3];
                if (i10 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i10 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i10 == 1 || i10 == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // od.AbstractC5288j
            public void a(InterfaceC1174b interfaceC1174b) {
                if (interfaceC1174b == null) {
                    f(0);
                }
                C5289k.K(interfaceC1174b, null);
                this.f12286a.add(interfaceC1174b);
            }

            @Override // od.AbstractC5287i
            public void e(InterfaceC1174b interfaceC1174b, InterfaceC1174b interfaceC1174b2) {
                if (interfaceC1174b == null) {
                    f(1);
                }
                if (interfaceC1174b2 == null) {
                    f(2);
                }
            }
        }

        public a(C1820n c1820n, Bd.n nVar) {
            if (nVar == null) {
                h(0);
            }
            this.f12279e = c1820n;
            this.f12276b = nVar.g(new C0162a(c1820n));
            this.f12277c = nVar.g(new b(c1820n));
            this.f12278d = nVar.f(new c(c1820n));
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static /* synthetic */ void h(int r13) {
            /*
                Method dump skipped, instruction units count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Oc.C1820n.a.h(int):void");
        }

        @Override // vd.AbstractC6100i, vd.InterfaceC6099h
        public Collection a(kd.f fVar, Tc.b bVar) {
            if (fVar == null) {
                h(5);
            }
            if (bVar == null) {
                h(6);
            }
            Collection collection = (Collection) this.f12276b.invoke(fVar);
            if (collection == null) {
                h(7);
            }
            return collection;
        }

        @Override // vd.AbstractC6100i, vd.InterfaceC6099h
        public Set b() {
            Set set = (Set) this.f12279e.f12274k.invoke();
            if (set == null) {
                h(17);
            }
            return set;
        }

        @Override // vd.AbstractC6100i, vd.InterfaceC6099h
        public Collection c(kd.f fVar, Tc.b bVar) {
            if (fVar == null) {
                h(1);
            }
            if (bVar == null) {
                h(2);
            }
            Collection collection = (Collection) this.f12277c.invoke(fVar);
            if (collection == null) {
                h(3);
            }
            return collection;
        }

        @Override // vd.AbstractC6100i, vd.InterfaceC6099h
        public Set d() {
            Set set = (Set) this.f12279e.f12274k.invoke();
            if (set == null) {
                h(19);
            }
            return set;
        }

        @Override // vd.AbstractC6100i, vd.InterfaceC6102k
        public Collection f(C6095d c6095d, vc.l lVar) {
            if (c6095d == null) {
                h(13);
            }
            if (lVar == null) {
                h(14);
            }
            Collection collection = (Collection) this.f12278d.invoke();
            if (collection == null) {
                h(15);
            }
            return collection;
        }

        @Override // vd.AbstractC6100i, vd.InterfaceC6099h
        public Set g() {
            Set set = Collections.EMPTY_SET;
            if (set == null) {
                h(18);
            }
            return set;
        }

        public final Collection l() {
            HashSet hashSet = new HashSet();
            for (kd.f fVar : (Set) this.f12279e.f12274k.invoke()) {
                Tc.d dVar = Tc.d.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(a(fVar, dVar));
                hashSet.addAll(c(fVar, dVar));
            }
            return hashSet;
        }

        public final Collection m(kd.f fVar) {
            if (fVar == null) {
                h(8);
            }
            return p(fVar, o().a(fVar, Tc.d.FOR_NON_TRACKED_SCOPE));
        }

        public final Collection n(kd.f fVar) {
            if (fVar == null) {
                h(4);
            }
            return p(fVar, o().c(fVar, Tc.d.FOR_NON_TRACKED_SCOPE));
        }

        public final InterfaceC6099h o() {
            InterfaceC6099h interfaceC6099hO = ((Cd.E) this.f12279e.k().o().iterator().next()).o();
            if (interfaceC6099hO == null) {
                h(9);
            }
            return interfaceC6099hO;
        }

        public final Collection p(kd.f fVar, Collection collection) {
            if (fVar == null) {
                h(10);
            }
            if (collection == null) {
                h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C5289k.f41544f.v(fVar, collection, Collections.EMPTY_SET, this.f12279e, new d(linkedHashSet));
            return linkedHashSet;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1820n(Bd.n nVar, InterfaceC1177e interfaceC1177e, Cd.E e10, kd.f fVar, Bd.i iVar, Mc.g gVar, a0 a0Var) {
        super(nVar, interfaceC1177e, fVar, a0Var, false);
        if (nVar == null) {
            E0(6);
        }
        if (interfaceC1177e == null) {
            E0(7);
        }
        if (e10 == null) {
            E0(8);
        }
        if (fVar == null) {
            E0(9);
        }
        if (iVar == null) {
            E0(10);
        }
        if (gVar == null) {
            E0(11);
        }
        if (a0Var == null) {
            E0(12);
        }
        this.f12275l = gVar;
        this.f12272i = new C0728k(this, Collections.EMPTY_LIST, Collections.singleton(e10), nVar);
        this.f12273j = new a(this, nVar);
        this.f12274k = iVar;
    }

    private static /* synthetic */ void E0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static C1820n L0(Bd.n nVar, InterfaceC1177e interfaceC1177e, kd.f fVar, Bd.i iVar, Mc.g gVar, a0 a0Var) {
        if (nVar == null) {
            E0(0);
        }
        if (interfaceC1177e == null) {
            E0(1);
        }
        if (fVar == null) {
            E0(2);
        }
        if (iVar == null) {
            E0(3);
        }
        if (gVar == null) {
            E0(4);
        }
        if (a0Var == null) {
            E0(5);
        }
        return new C1820n(nVar, interfaceC1177e, interfaceC1177e.p(), fVar, iVar, gVar, a0Var);
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC1176d C() {
        return null;
    }

    @Override // Oc.t
    public InterfaceC6099h D0(Dd.g gVar) {
        if (gVar == null) {
            E0(13);
        }
        InterfaceC6099h interfaceC6099h = this.f12273j;
        if (interfaceC6099h == null) {
            E0(14);
        }
        return interfaceC6099h;
    }

    @Override // Lc.InterfaceC1177e
    public boolean I0() {
        return false;
    }

    @Override // Lc.InterfaceC1177e
    public h0 S() {
        return null;
    }

    @Override // Lc.C
    public boolean V() {
        return false;
    }

    @Override // Lc.InterfaceC1177e
    public boolean Z() {
        return false;
    }

    @Override // Lc.InterfaceC1177e
    public boolean d0() {
        return false;
    }

    @Override // Lc.InterfaceC1177e
    public EnumC1178f f() {
        EnumC1178f enumC1178f = EnumC1178f.ENUM_ENTRY;
        if (enumC1178f == null) {
            E0(18);
        }
        return enumC1178f;
    }

    @Override // Mc.a
    public Mc.g getAnnotations() {
        Mc.g gVar = this.f12275l;
        if (gVar == null) {
            E0(21);
        }
        return gVar;
    }

    @Override // Lc.InterfaceC1177e, Lc.InterfaceC1189q, Lc.C
    public AbstractC1192u getVisibility() {
        AbstractC1192u abstractC1192u = AbstractC1191t.f8775e;
        if (abstractC1192u == null) {
            E0(20);
        }
        return abstractC1192u;
    }

    @Override // Lc.InterfaceC1177e
    public boolean i0() {
        return false;
    }

    @Override // Lc.InterfaceC1177e
    public boolean isInline() {
        return false;
    }

    @Override // Lc.InterfaceC1180h
    public e0 k() {
        e0 e0Var = this.f12272i;
        if (e0Var == null) {
            E0(17);
        }
        return e0Var;
    }

    @Override // Lc.C
    public boolean k0() {
        return false;
    }

    @Override // Lc.InterfaceC1177e
    public Collection l() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            E0(16);
        }
        return list;
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC6099h l0() {
        InterfaceC6099h.b bVar = InterfaceC6099h.b.f46015b;
        if (bVar == null) {
            E0(15);
        }
        return bVar;
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC1177e m0() {
        return null;
    }

    @Override // Lc.InterfaceC1177e, Lc.InterfaceC1181i
    public List q() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            E0(22);
        }
        return list;
    }

    @Override // Lc.InterfaceC1177e, Lc.C
    public Lc.D r() {
        Lc.D d10 = Lc.D.FINAL;
        if (d10 == null) {
            E0(19);
        }
        return d10;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    @Override // Lc.InterfaceC1177e
    public Collection x() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            E0(23);
        }
        return list;
    }

    @Override // Lc.InterfaceC1181i
    public boolean z() {
        return false;
    }
}
