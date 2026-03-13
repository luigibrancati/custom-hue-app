package Dd;

import Cd.B;
import Cd.C0732o;
import Cd.D;
import Cd.E;
import Cd.Q;
import Cd.a0;
import Cd.t0;
import gc.C4179C;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4859p;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f2695a = new u();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static final a START = new c("START", 0);
        public static final a ACCEPT_NULL = new C0042a("ACCEPT_NULL", 1);
        public static final a UNKNOWN = new d("UNKNOWN", 2);
        public static final a NOT_NULL = new b("NOT_NULL", 3);
        private static final /* synthetic */ a[] $VALUES = a();

        /* JADX INFO: renamed from: Dd.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0042a extends a {
            public C0042a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // Dd.u.a
            public a b(t0 nextType) {
                AbstractC4862t.e(nextType, "nextType");
                return j(nextType);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends a {
            public b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // Dd.u.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public b b(t0 nextType) {
                AbstractC4862t.e(nextType, "nextType");
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c extends a {
            public c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // Dd.u.a
            public a b(t0 nextType) {
                AbstractC4862t.e(nextType, "nextType");
                return j(nextType);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class d extends a {
            public d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // Dd.u.a
            public a b(t0 nextType) {
                AbstractC4862t.e(nextType, "nextType");
                a aVarJ = j(nextType);
                return aVarJ == a.ACCEPT_NULL ? this : aVarJ;
            }
        }

        public /* synthetic */ a(String str, int i10, AbstractC4854k abstractC4854k) {
            this(str, i10);
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{START, ACCEPT_NULL, UNKNOWN, NOT_NULL};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public abstract a b(t0 t0Var);

        public final a j(t0 t0Var) {
            AbstractC4862t.e(t0Var, "<this>");
            if (t0Var.O0()) {
                return ACCEPT_NULL;
            }
            if (t0Var instanceof C0732o) {
                ((C0732o) t0Var).Z0();
            }
            return n.f2690a.a(t0Var) ? NOT_NULL : UNKNOWN;
        }

        public a(String str, int i10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f2696a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set set) {
            super(0);
            this.f2696a = set;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "This collections cannot be empty! input types: " + C4179C.q0(this.f2696a, null, null, null, 0, null, null, 63, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class c extends AbstractC4859p implements vc.p {
        public c(Object obj) {
            super(2, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f, Cc.c
        public final String getName() {
            return "isStrictSupertype";
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final Cc.g getOwner() {
            return M.b(u.class);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final String getSignature() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // vc.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E p02, E p12) {
            AbstractC4862t.e(p02, "p0");
            AbstractC4862t.e(p12, "p1");
            return Boolean.valueOf(((u) this.receiver).e(p02, p12));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class d extends AbstractC4859p implements vc.p {
        public d(Object obj) {
            super(2, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f, Cc.c
        public final String getName() {
            return "equalTypes";
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final Cc.g getOwner() {
            return M.b(m.class);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final String getSignature() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // vc.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E p02, E p12) {
            AbstractC4862t.e(p02, "p0");
            AbstractC4862t.e(p12, "p1");
            return Boolean.valueOf(((m) this.receiver).c(p02, p12));
        }
    }

    public final Collection b(Collection collection, vc.p pVar) {
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        AbstractC4862t.d(it, "filteredTypes.iterator()");
        while (it.hasNext()) {
            Cd.M upper = (Cd.M) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Cd.M lower = (Cd.M) it2.next();
                    if (lower != upper) {
                        AbstractC4862t.d(lower, "lower");
                        AbstractC4862t.d(upper, "upper");
                        if (((Boolean) pVar.invoke(lower, upper)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final Cd.M c(List types) {
        AbstractC4862t.e(types, "types");
        types.size();
        ArrayList<Cd.M> arrayList = new ArrayList();
        Iterator it = types.iterator();
        while (it.hasNext()) {
            Cd.M m10 = (Cd.M) it.next();
            if (m10.N0() instanceof D) {
                Collection<E> collectionO = m10.N0().o();
                AbstractC4862t.d(collectionO, "type.constructor.supertypes");
                ArrayList arrayList2 = new ArrayList(C4207u.v(collectionO, 10));
                for (E it2 : collectionO) {
                    AbstractC4862t.d(it2, "it");
                    Cd.M mD = B.d(it2);
                    if (m10.O0()) {
                        mD = mD.R0(true);
                    }
                    arrayList2.add(mD);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(m10);
            }
        }
        a aVarB = a.START;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            aVarB = aVarB.b((t0) it3.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Cd.M mI : arrayList) {
            if (aVarB == a.NOT_NULL) {
                if (mI instanceof i) {
                    mI = Q.k((i) mI);
                }
                mI = Q.i(mI, false, 1, null);
            }
            linkedHashSet.add(mI);
        }
        ArrayList arrayList3 = new ArrayList(C4207u.v(types, 10));
        Iterator it4 = types.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((Cd.M) it4.next()).M0());
        }
        Iterator it5 = arrayList3.iterator();
        if (!it5.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it5.next();
        while (it5.hasNext()) {
            next = ((a0) next).l((a0) it5.next());
        }
        return d(linkedHashSet).T0((a0) next);
    }

    public final Cd.M d(Set set) {
        if (set.size() == 1) {
            return (Cd.M) C4179C.E0(set);
        }
        new b(set);
        Collection collectionB = b(set, new c(this));
        collectionB.isEmpty();
        Cd.M mB = qd.n.f43446f.b(collectionB);
        if (mB != null) {
            return mB;
        }
        Collection collectionB2 = b(collectionB, new d(l.f2684b.a()));
        collectionB2.isEmpty();
        return collectionB2.size() < 2 ? (Cd.M) C4179C.E0(collectionB2) : new D(set).b();
    }

    public final boolean e(E e10, E e11) {
        m mVarA = l.f2684b.a();
        return mVarA.b(e10, e11) && !mVarA.b(e11, e10);
    }
}
