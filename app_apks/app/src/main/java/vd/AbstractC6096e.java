package vd;

import Lc.InterfaceC1174b;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1196y;
import Lc.U;
import Lc.Z;
import gc.C4179C;
import gc.C4206t;
import gc.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.v;
import od.AbstractC5287i;
import od.C5289k;
import vc.InterfaceC6082a;
import vd.InterfaceC6102k;

/* JADX INFO: renamed from: vd.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6096e extends AbstractC6100i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f46002d = {M.g(new E(M.b(AbstractC6096e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1177e f46003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bd.i f46004c;

    /* JADX INFO: renamed from: vd.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {
        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List listI = AbstractC6096e.this.i();
            return C4179C.C0(listI, AbstractC6096e.this.j(listI));
        }
    }

    /* JADX INFO: renamed from: vd.e$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5287i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f46006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC6096e f46007b;

        public b(ArrayList arrayList, AbstractC6096e abstractC6096e) {
            this.f46006a = arrayList;
            this.f46007b = abstractC6096e;
        }

        @Override // od.AbstractC5288j
        public void a(InterfaceC1174b fakeOverride) {
            AbstractC4862t.e(fakeOverride, "fakeOverride");
            C5289k.K(fakeOverride, null);
            this.f46006a.add(fakeOverride);
        }

        @Override // od.AbstractC5287i
        public void e(InterfaceC1174b fromSuper, InterfaceC1174b fromCurrent) {
            AbstractC4862t.e(fromSuper, "fromSuper");
            AbstractC4862t.e(fromCurrent, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f46007b.l() + ": " + fromSuper + " vs " + fromCurrent).toString());
        }
    }

    public AbstractC6096e(Bd.n storageManager, InterfaceC1177e containingClass) {
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(containingClass, "containingClass");
        this.f46003b = containingClass;
        this.f46004c = storageManager.f(new a());
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6099h
    public Collection a(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        List listK = k();
        Md.e eVar = new Md.e();
        for (Object obj : listK) {
            if ((obj instanceof Z) && AbstractC4862t.a(((Z) obj).getName(), name)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6099h
    public Collection c(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        List listK = k();
        Md.e eVar = new Md.e();
        for (Object obj : listK) {
            if ((obj instanceof U) && AbstractC4862t.a(((U) obj).getName(), name)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6102k
    public Collection f(C6095d kindFilter, vc.l nameFilter) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        AbstractC4862t.e(nameFilter, "nameFilter");
        return !kindFilter.a(C6095d.f45987p.m()) ? C4206t.k() : k();
    }

    public abstract List i();

    public final List j(List list) {
        Collection collectionK;
        ArrayList arrayList = new ArrayList(3);
        Collection collectionO = this.f46003b.k().o();
        AbstractC4862t.d(collectionO, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collectionO.iterator();
        while (it.hasNext()) {
            y.C(arrayList2, InterfaceC6102k.a.a(((Cd.E) it.next()).o(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof InterfaceC1174b) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            kd.f name = ((InterfaceC1174b) obj2).getName();
            Object arrayList4 = linkedHashMap.get(name);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(name, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            kd.f fVar = (kd.f) entry.getKey();
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((InterfaceC1174b) obj3) instanceof InterfaceC1196y);
                Object arrayList5 = linkedHashMap2.get(boolValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList5);
                }
                ((List) arrayList5).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                C5289k c5289k = C5289k.f41544f;
                if (zBooleanValue) {
                    collectionK = new ArrayList();
                    for (Object obj4 : list) {
                        if (AbstractC4862t.a(((InterfaceC1196y) obj4).getName(), fVar)) {
                            collectionK.add(obj4);
                        }
                    }
                } else {
                    collectionK = C4206t.k();
                }
                c5289k.v(fVar, list3, collectionK, this.f46003b, new b(arrayList, this));
            }
        }
        return Md.a.c(arrayList);
    }

    public final List k() {
        return (List) Bd.m.a(this.f46004c, this, f46002d[0]);
    }

    public final InterfaceC1177e l() {
        return this.f46003b;
    }
}
