package Zc;

import Cd.AbstractC0741y;
import Cd.E;
import Cd.L;
import Cd.M;
import Cd.a0;
import Cd.h0;
import Cd.i0;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Od.F;
import fc.C4034q;
import gc.C4179C;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import nd.AbstractC5164c;
import nd.InterfaceC5167f;
import vc.l;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends AbstractC0741y implements L {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f20456a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String it) {
            AbstractC4862t.e(it, "it");
            return "(raw) " + it;
        }
    }

    public h(M m10, M m11, boolean z10) {
        super(m10, m11);
        if (z10) {
            return;
        }
        Dd.e.f2664a.b(m10, m11);
    }

    public static final boolean a1(String str, String str2) {
        return AbstractC4862t.a(str, F.B0(str2, "out ")) || AbstractC4862t.a(str2, "*");
    }

    public static final List b1(AbstractC5164c abstractC5164c, E e10) {
        List listL0 = e10.L0();
        ArrayList arrayList = new ArrayList(C4207u.v(listL0, 10));
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            arrayList.add(abstractC5164c.x((i0) it.next()));
        }
        return arrayList;
    }

    public static final String c1(String str, String str2) {
        if (!F.U(str, '<', false, 2, null)) {
            return str;
        }
        return F.X0(str, '<', null, 2, null) + '<' + str2 + '>' + F.U0(str, '>', null, 2, null);
    }

    @Override // Cd.AbstractC0741y
    public M U0() {
        return V0();
    }

    @Override // Cd.AbstractC0741y
    public String X0(AbstractC5164c renderer, InterfaceC5167f options) {
        AbstractC4862t.e(renderer, "renderer");
        AbstractC4862t.e(options, "options");
        String strW = renderer.w(V0());
        String strW2 = renderer.w(W0());
        if (options.h()) {
            return "raw (" + strW + ".." + strW2 + ')';
        }
        if (W0().L0().isEmpty()) {
            return renderer.t(strW, strW2, Hd.a.i(this));
        }
        List listB1 = b1(renderer, V0());
        List listB12 = b1(renderer, W0());
        String strQ0 = C4179C.q0(listB1, ", ", null, null, 0, null, a.f20456a, 30, null);
        List<C4034q> listD1 = C4179C.d1(listB1, listB12);
        if (listD1 == null || !listD1.isEmpty()) {
            for (C4034q c4034q : listD1) {
                if (!a1((String) c4034q.e(), (String) c4034q.f())) {
                    break;
                }
            }
            strW2 = c1(strW2, strQ0);
        } else {
            strW2 = c1(strW2, strQ0);
        }
        String strC1 = c1(strW, strQ0);
        return AbstractC4862t.a(strC1, strW2) ? strC1 : renderer.t(strC1, strW2, Hd.a.i(this));
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public h R0(boolean z10) {
        return new h(V0().R0(z10), W0().R0(z10));
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public AbstractC0741y X0(Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        E eA = kotlinTypeRefiner.a(V0());
        AbstractC4862t.c(eA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        E eA2 = kotlinTypeRefiner.a(W0());
        AbstractC4862t.c(eA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new h((M) eA, (M) eA2, true);
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public h T0(a0 newAttributes) {
        AbstractC4862t.e(newAttributes, "newAttributes");
        return new h(V0().T0(newAttributes), W0().T0(newAttributes));
    }

    @Override // Cd.AbstractC0741y, Cd.E
    public InterfaceC6099h o() {
        InterfaceC1180h interfaceC1180hQ = N0().q();
        h0 h0Var = null;
        byte b10 = 0;
        InterfaceC1177e interfaceC1177e = interfaceC1180hQ instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1180hQ : null;
        if (interfaceC1177e != null) {
            InterfaceC6099h interfaceC6099hH = interfaceC1177e.H(new g(h0Var, 1, b10 == true ? 1 : 0));
            AbstractC4862t.d(interfaceC6099hH, "classDescriptor.getMemberScope(RawSubstitution())");
            return interfaceC6099hH;
        }
        throw new IllegalStateException(("Incorrect classifier: " + N0().q()).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(M lowerBound, M upperBound) {
        this(lowerBound, upperBound, false);
        AbstractC4862t.e(lowerBound, "lowerBound");
        AbstractC4862t.e(upperBound, "upperBound");
    }
}
