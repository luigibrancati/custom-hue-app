package Dd;

import Cd.AbstractC0724g;
import Cd.AbstractC0741y;
import Cd.D;
import Cd.E;
import Cd.F;
import Cd.e0;
import Cd.i0;
import Cd.s0;
import Cd.t0;
import Cd.u0;
import fc.C4032o;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4859p;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import pd.C5462c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f extends AbstractC0724g {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2665a = new a();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class b extends AbstractC4859p implements vc.l {
        public b(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f, Cc.c
        public final String getName() {
            return "prepareType";
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final Cc.g getOwner() {
            return M.b(f.class);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final String getSignature() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }

        @Override // vc.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final t0 invoke(Gd.i p02) {
            AbstractC4862t.e(p02, "p0");
            return ((f) this.receiver).a(p02);
        }
    }

    @Override // Cd.AbstractC0724g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 a(Gd.i type) {
        t0 t0VarD;
        AbstractC4862t.e(type, "type");
        if (!(type instanceof E)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        t0 t0VarQ0 = ((E) type).Q0();
        if (t0VarQ0 instanceof Cd.M) {
            t0VarD = c((Cd.M) t0VarQ0);
        } else {
            if (!(t0VarQ0 instanceof AbstractC0741y)) {
                throw new C4032o();
            }
            AbstractC0741y abstractC0741y = (AbstractC0741y) t0VarQ0;
            Cd.M mC = c(abstractC0741y.V0());
            Cd.M mC2 = c(abstractC0741y.W0());
            t0VarD = (mC == abstractC0741y.V0() && mC2 == abstractC0741y.W0()) ? t0VarQ0 : F.d(mC, mC2);
        }
        return s0.c(t0VarD, t0VarQ0, new b(this));
    }

    public final Cd.M c(Cd.M m10) {
        E type;
        e0 e0VarN0 = m10.N0();
        D dG = null;
        t0VarQ0 = null;
        t0 t0VarQ0 = null;
        if (!(e0VarN0 instanceof C5462c)) {
            if (!(e0VarN0 instanceof D) || !m10.O0()) {
                return m10;
            }
            D d10 = (D) e0VarN0;
            Collection collectionO = d10.o();
            ArrayList arrayList = new ArrayList(C4207u.v(collectionO, 10));
            Iterator it = collectionO.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                arrayList.add(Hd.a.u((E) it.next()));
                z10 = true;
            }
            if (z10) {
                E eC = d10.c();
                dG = new D(arrayList).g(eC != null ? Hd.a.u(eC) : null);
            }
            if (dG != null) {
                d10 = dG;
            }
            return d10.b();
        }
        C5462c c5462c = (C5462c) e0VarN0;
        i0 i0VarE = c5462c.E();
        if (i0VarE.b() != u0.IN_VARIANCE) {
            i0VarE = null;
        }
        if (i0VarE != null && (type = i0VarE.getType()) != null) {
            t0VarQ0 = type.Q0();
        }
        t0 t0Var = t0VarQ0;
        if (c5462c.b() == null) {
            i0 i0VarE2 = c5462c.E();
            Collection collectionO2 = c5462c.o();
            ArrayList arrayList2 = new ArrayList(C4207u.v(collectionO2, 10));
            Iterator it2 = collectionO2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((E) it2.next()).Q0());
            }
            c5462c.d(new j(i0VarE2, arrayList2, null, 4, null));
        }
        Gd.b bVar = Gd.b.FOR_SUBTYPING;
        j jVarB = c5462c.b();
        AbstractC4862t.b(jVarB);
        return new i(bVar, jVarB, t0Var, m10.M0(), m10.O0(), false, 32, null);
    }
}
