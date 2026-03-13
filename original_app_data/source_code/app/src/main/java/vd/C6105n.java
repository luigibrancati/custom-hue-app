package vd;

import Cd.E;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1185m;
import Lc.U;
import Lc.Z;
import fc.C4034q;
import gc.C4179C;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import od.AbstractC5291m;

/* JADX INFO: renamed from: vd.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6105n extends AbstractC6092a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46029d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC6099h f46031c;

    /* JADX INFO: renamed from: vd.n$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final InterfaceC6099h a(String message, Collection types) {
            AbstractC4862t.e(message, "message");
            AbstractC4862t.e(types, "types");
            ArrayList arrayList = new ArrayList(C4207u.v(types, 10));
            Iterator it = types.iterator();
            while (it.hasNext()) {
                arrayList.add(((E) it.next()).o());
            }
            Md.e eVarB = Ld.a.b(arrayList);
            InterfaceC6099h interfaceC6099hB = C6093b.f45968d.b(message, eVarB);
            return eVarB.size() <= 1 ? interfaceC6099hB : new C6105n(message, interfaceC6099hB, null);
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: vd.n$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46032a = new b();

        public b() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1173a invoke(InterfaceC1173a selectMostSpecificInEachOverridableGroup) {
            AbstractC4862t.e(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    /* JADX INFO: renamed from: vd.n$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f46033a = new c();

        public c() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1173a invoke(Z selectMostSpecificInEachOverridableGroup) {
            AbstractC4862t.e(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    /* JADX INFO: renamed from: vd.n$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f46034a = new d();

        public d() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1173a invoke(U selectMostSpecificInEachOverridableGroup) {
            AbstractC4862t.e(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    public /* synthetic */ C6105n(String str, InterfaceC6099h interfaceC6099h, AbstractC4854k abstractC4854k) {
        this(str, interfaceC6099h);
    }

    public static final InterfaceC6099h j(String str, Collection collection) {
        return f46029d.a(str, collection);
    }

    @Override // vd.AbstractC6092a, vd.InterfaceC6099h
    public Collection a(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return AbstractC5291m.a(super.a(name, location), c.f46033a);
    }

    @Override // vd.AbstractC6092a, vd.InterfaceC6099h
    public Collection c(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return AbstractC5291m.a(super.c(name, location), d.f46034a);
    }

    @Override // vd.AbstractC6092a, vd.InterfaceC6102k
    public Collection f(C6095d kindFilter, vc.l nameFilter) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        AbstractC4862t.e(nameFilter, "nameFilter");
        Collection collectionF = super.f(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionF) {
            if (((InterfaceC1185m) obj) instanceof InterfaceC1173a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        C4034q c4034q = new C4034q(arrayList, arrayList2);
        List list = (List) c4034q.a();
        List list2 = (List) c4034q.b();
        AbstractC4862t.c(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return C4179C.C0(AbstractC5291m.a(list, b.f46032a), list2);
    }

    @Override // vd.AbstractC6092a
    public InterfaceC6099h i() {
        return this.f46031c;
    }

    public C6105n(String str, InterfaceC6099h interfaceC6099h) {
        this.f46030b = str;
        this.f46031c = interfaceC6099h;
    }
}
