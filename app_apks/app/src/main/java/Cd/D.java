package Cd;

import Lc.InterfaceC1180h;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import jc.C4757a;
import kotlin.jvm.internal.AbstractC4862t;
import vd.C6105n;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class D implements e0, Gd.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public E f1259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f1260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1261c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements vc.l {
        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M invoke(Dd.g kotlinTypeRefiner) {
            AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
            return D.this.p(kotlinTypeRefiner).b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ vc.l f1263a;

        public b(vc.l lVar) {
            this.f1263a = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            E it = (E) obj;
            vc.l lVar = this.f1263a;
            AbstractC4862t.d(it, "it");
            String string = lVar.invoke(it).toString();
            E it2 = (E) obj2;
            vc.l lVar2 = this.f1263a;
            AbstractC4862t.d(it2, "it");
            return C4757a.a(string, lVar2.invoke(it2).toString());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f1264a = new c();

        public c() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(E it) {
            AbstractC4862t.e(it, "it");
            return it.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ vc.l f1265a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(vc.l lVar) {
            super(1);
            this.f1265a = lVar;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(E it) {
            vc.l lVar = this.f1265a;
            AbstractC4862t.d(it, "it");
            return lVar.invoke(it).toString();
        }
    }

    public D(Collection typesToIntersect) {
        AbstractC4862t.e(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(typesToIntersect);
        this.f1260b = linkedHashSet;
        this.f1261c = linkedHashSet.hashCode();
    }

    public static /* synthetic */ String e(D d10, vc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = c.f1264a;
        }
        return d10.d(lVar);
    }

    public final InterfaceC6099h a() {
        return C6105n.f46029d.a("member scope for intersection type", this.f1260b);
    }

    public final M b() {
        return F.l(a0.f1311b.h(), this, C4206t.k(), false, a(), new a());
    }

    public final E c() {
        return this.f1259a;
    }

    public final String d(vc.l getProperTypeRelatedToStringify) {
        AbstractC4862t.e(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return C4179C.q0(C4179C.J0(this.f1260b, new b(getProperTypeRelatedToStringify)), " & ", "{", "}", 0, null, new d(getProperTypeRelatedToStringify), 24, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            return AbstractC4862t.a(this.f1260b, ((D) obj).f1260b);
        }
        return false;
    }

    @Override // Cd.e0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public D p(Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection collectionO = o();
        ArrayList arrayList = new ArrayList(C4207u.v(collectionO, 10));
        Iterator it = collectionO.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            arrayList.add(((E) it.next()).X0(kotlinTypeRefiner));
            z10 = true;
        }
        D dG = null;
        if (z10) {
            E eC = c();
            dG = new D(arrayList).g(eC != null ? eC.X0(kotlinTypeRefiner) : null);
        }
        return dG == null ? this : dG;
    }

    public final D g(E e10) {
        return new D(this.f1260b, e10);
    }

    @Override // Cd.e0
    public List getParameters() {
        return C4206t.k();
    }

    public int hashCode() {
        return this.f1261c;
    }

    @Override // Cd.e0
    public Ic.g n() {
        Ic.g gVarN = ((E) this.f1260b.iterator().next()).N0().n();
        AbstractC4862t.d(gVarN, "intersectedTypes.iterato…xt().constructor.builtIns");
        return gVarN;
    }

    @Override // Cd.e0
    public Collection o() {
        return this.f1260b;
    }

    @Override // Cd.e0
    public InterfaceC1180h q() {
        return null;
    }

    @Override // Cd.e0
    public boolean r() {
        return false;
    }

    public String toString() {
        return e(this, null, 1, null);
    }

    public D(Collection collection, E e10) {
        this(collection);
        this.f1259a = e10;
    }
}
