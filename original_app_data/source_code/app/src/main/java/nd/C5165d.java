package nd;

import Cd.AbstractC0741y;
import Cd.C0718a;
import Cd.C0732o;
import Cd.D;
import Cd.E;
import Cd.M;
import Cd.Q;
import Cd.i0;
import Cd.q0;
import Cd.t0;
import Cd.u0;
import Cd.v0;
import Ic.j;
import Lc.AbstractC1191t;
import Lc.AbstractC1192u;
import Lc.C;
import Lc.EnumC1178f;
import Lc.G;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1176d;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1181i;
import Lc.InterfaceC1184l;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1187o;
import Lc.InterfaceC1188p;
import Lc.InterfaceC1194w;
import Lc.InterfaceC1196y;
import Lc.J;
import Lc.K;
import Lc.P;
import Lc.S;
import Lc.T;
import Lc.U;
import Lc.V;
import Lc.W;
import Lc.X;
import Lc.e0;
import Lc.f0;
import Lc.g0;
import Lc.j0;
import Lc.k0;
import Od.C1821a;
import Od.F;
import Od.H;
import fc.C4015H;
import fc.C4029l;
import fc.C4032o;
import fc.InterfaceC4028k;
import gc.C4179C;
import gc.C4205s;
import gc.C4206t;
import gc.C4207u;
import io.sentry.protocol.SentryStackFrame;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import nd.AbstractC5164c;
import od.AbstractC5283e;
import org.apache.tika.utils.StringUtils;
import qd.C5515a;
import qd.C5516b;
import qd.p;
import sd.AbstractC5823c;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: nd.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5165d extends AbstractC5164c implements InterfaceC5167f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C5168g f40800l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC4028k f40801m;

    /* JADX INFO: renamed from: nd.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements InterfaceC1187o {

        /* JADX INFO: renamed from: nd.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public /* synthetic */ class C0541a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f40803a;

            static {
                int[] iArr = new int[EnumC5173l.values().length];
                try {
                    iArr[EnumC5173l.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5173l.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC5173l.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f40803a = iArr;
            }
        }

        public a() {
        }

        public void A(j0 descriptor, StringBuilder builder) {
            AbstractC4862t.e(descriptor, "descriptor");
            AbstractC4862t.e(builder, "builder");
            C5165d.this.S1(descriptor, true, builder, true);
        }

        @Override // Lc.InterfaceC1187o
        public /* bridge */ /* synthetic */ Object a(f0 f0Var, Object obj) {
            z(f0Var, (StringBuilder) obj);
            return C4015H.f34254a;
        }

        @Override // Lc.InterfaceC1187o
        public /* bridge */ /* synthetic */ Object b(InterfaceC1184l interfaceC1184l, Object obj) throws IOException {
            o(interfaceC1184l, (StringBuilder) obj);
            return C4015H.f34254a;
        }

        @Override // Lc.InterfaceC1187o
        public /* bridge */ /* synthetic */ Object c(U u10, Object obj) throws IOException {
            u(u10, (StringBuilder) obj);
            return C4015H.f34254a;
        }

        @Override // Lc.InterfaceC1187o
        public /* bridge */ /* synthetic */ Object d(e0 e0Var, Object obj) {
            y(e0Var, (StringBuilder) obj);
            return C4015H.f34254a;
        }

        @Override // Lc.InterfaceC1187o
        public /* bridge */ /* synthetic */ Object e(InterfaceC1177e interfaceC1177e, Object obj) throws IOException {
            n(interfaceC1177e, (StringBuilder) obj);
            return C4015H.f34254a;
        }

        @Override // Lc.InterfaceC1187o
        public /* bridge */ /* synthetic */ Object f(P p10, Object obj) {
            s(p10, (StringBuilder) obj);
            return C4015H.f34254a;
        }

        @Override // Lc.InterfaceC1187o
        public /* bridge */ /* synthetic */ Object g(V v10, Object obj) throws IOException {
            v(v10, (StringBuilder) obj);
            return C4015H.f34254a;
        }

        @Override // Lc.InterfaceC1187o
        public /* bridge */ /* synthetic */ Object h(X x10, Object obj) {
            x(x10, (StringBuilder) obj);
            return C4015H.f34254a;
        }

        @Override // Lc.InterfaceC1187o
        public /* bridge */ /* synthetic */ Object i(W w10, Object obj) throws IOException {
            w(w10, (StringBuilder) obj);
            return C4015H.f34254a;
        }

        @Override // Lc.InterfaceC1187o
        public /* bridge */ /* synthetic */ Object j(InterfaceC1196y interfaceC1196y, Object obj) throws IOException {
            p(interfaceC1196y, (StringBuilder) obj);
            return C4015H.f34254a;
        }

        @Override // Lc.InterfaceC1187o
        public /* bridge */ /* synthetic */ Object k(G g10, Object obj) {
            q(g10, (StringBuilder) obj);
            return C4015H.f34254a;
        }

        @Override // Lc.InterfaceC1187o
        public /* bridge */ /* synthetic */ Object l(j0 j0Var, Object obj) {
            A(j0Var, (StringBuilder) obj);
            return C4015H.f34254a;
        }

        @Override // Lc.InterfaceC1187o
        public /* bridge */ /* synthetic */ Object m(K k10, Object obj) {
            r(k10, (StringBuilder) obj);
            return C4015H.f34254a;
        }

        public void n(InterfaceC1177e descriptor, StringBuilder builder) throws IOException {
            AbstractC4862t.e(descriptor, "descriptor");
            AbstractC4862t.e(builder, "builder");
            C5165d.this.X0(descriptor, builder);
        }

        public void o(InterfaceC1184l constructorDescriptor, StringBuilder builder) throws IOException {
            AbstractC4862t.e(constructorDescriptor, "constructorDescriptor");
            AbstractC4862t.e(builder, "builder");
            C5165d.this.c1(constructorDescriptor, builder);
        }

        public void p(InterfaceC1196y descriptor, StringBuilder builder) throws IOException {
            AbstractC4862t.e(descriptor, "descriptor");
            AbstractC4862t.e(builder, "builder");
            C5165d.this.i1(descriptor, builder);
        }

        public void q(G descriptor, StringBuilder builder) {
            AbstractC4862t.e(descriptor, "descriptor");
            AbstractC4862t.e(builder, "builder");
            C5165d.this.s1(descriptor, builder, true);
        }

        public void r(K descriptor, StringBuilder builder) {
            AbstractC4862t.e(descriptor, "descriptor");
            AbstractC4862t.e(builder, "builder");
            C5165d.this.w1(descriptor, builder);
        }

        public void s(P descriptor, StringBuilder builder) {
            AbstractC4862t.e(descriptor, "descriptor");
            AbstractC4862t.e(builder, "builder");
            C5165d.this.y1(descriptor, builder);
        }

        public final void t(T t10, StringBuilder sb2, String str) throws IOException {
            int i10 = C0541a.f40803a[C5165d.this.l0().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                p(t10, sb2);
                return;
            }
            C5165d.this.R0(t10, sb2);
            sb2.append(str + " for ");
            C5165d c5165d = C5165d.this;
            U uT = t10.T();
            AbstractC4862t.d(uT, "descriptor.correspondingProperty");
            c5165d.A1(uT, sb2);
        }

        public void u(U descriptor, StringBuilder builder) throws IOException {
            AbstractC4862t.e(descriptor, "descriptor");
            AbstractC4862t.e(builder, "builder");
            C5165d.this.A1(descriptor, builder);
        }

        public void v(V descriptor, StringBuilder builder) throws IOException {
            AbstractC4862t.e(descriptor, "descriptor");
            AbstractC4862t.e(builder, "builder");
            t(descriptor, builder, "getter");
        }

        public void w(W descriptor, StringBuilder builder) throws IOException {
            AbstractC4862t.e(descriptor, "descriptor");
            AbstractC4862t.e(builder, "builder");
            t(descriptor, builder, "setter");
        }

        public void x(X descriptor, StringBuilder builder) {
            AbstractC4862t.e(descriptor, "descriptor");
            AbstractC4862t.e(builder, "builder");
            builder.append(descriptor.getName());
        }

        public void y(e0 descriptor, StringBuilder builder) {
            AbstractC4862t.e(descriptor, "descriptor");
            AbstractC4862t.e(builder, "builder");
            C5165d.this.I1(descriptor, builder);
        }

        public void z(f0 descriptor, StringBuilder builder) {
            AbstractC4862t.e(descriptor, "descriptor");
            AbstractC4862t.e(builder, "builder");
            C5165d.this.N1(descriptor, builder, true);
        }
    }

    /* JADX INFO: renamed from: nd.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f40805b;

        static {
            int[] iArr = new int[EnumC5174m.values().length];
            try {
                iArr[EnumC5174m.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5174m.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f40804a = iArr;
            int[] iArr2 = new int[EnumC5172k.values().length];
            try {
                iArr2[EnumC5172k.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC5172k.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC5172k.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f40805b = iArr2;
        }
    }

    /* JADX INFO: renamed from: nd.d$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements vc.l {
        public c() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(i0 it) {
            AbstractC4862t.e(it, "it");
            if (it.a()) {
                return "*";
            }
            C5165d c5165d = C5165d.this;
            E type = it.getType();
            AbstractC4862t.d(type, "it.type");
            String strW = c5165d.w(type);
            if (it.b() == u0.INVARIANT) {
                return strW;
            }
            return it.b() + ' ' + strW;
        }
    }

    /* JADX INFO: renamed from: nd.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0542d extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: nd.d$d$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends v implements vc.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f40808a = new a();

            public a() {
                super(1);
            }

            public final void a(InterfaceC5167f withOptions) {
                AbstractC4862t.e(withOptions, "$this$withOptions");
                withOptions.j(gc.V.k(withOptions.g(), C4206t.n(j.a.f5749C, j.a.f5751D)));
            }

            @Override // vc.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC5167f) obj);
                return C4015H.f34254a;
            }
        }

        public C0542d() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5165d invoke() {
            AbstractC5164c abstractC5164cY = C5165d.this.y(a.f40808a);
            AbstractC4862t.c(abstractC5164cY, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
            return (C5165d) abstractC5164cY;
        }
    }

    /* JADX INFO: renamed from: nd.d$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends v implements vc.l {
        public e() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(qd.g it) {
            AbstractC4862t.e(it, "it");
            return C5165d.this.b1(it);
        }
    }

    /* JADX INFO: renamed from: nd.d$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f40810a = new f();

        public f() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(j0 j0Var) {
            return "";
        }
    }

    /* JADX INFO: renamed from: nd.d$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends v implements vc.l {
        public g() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(E it) {
            C5165d c5165d = C5165d.this;
            AbstractC4862t.d(it, "it");
            return c5165d.w(it);
        }
    }

    /* JADX INFO: renamed from: nd.d$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f40812a = new h();

        public h() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(E it) {
            AbstractC4862t.e(it, "it");
            return it;
        }
    }

    public C5165d(C5168g options) {
        AbstractC4862t.e(options, "options");
        this.f40800l = options;
        options.k0();
        this.f40801m = C4029l.b(new C0542d());
    }

    public static /* synthetic */ void M1(C5165d c5165d, StringBuilder sb2, E e10, Cd.e0 e0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            e0Var = e10.N0();
        }
        c5165d.L1(sb2, e10, e0Var);
    }

    public static /* synthetic */ void R1(C5165d c5165d, k0 k0Var, StringBuilder sb2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        c5165d.Q1(k0Var, sb2, z10);
    }

    public static /* synthetic */ void V0(C5165d c5165d, StringBuilder sb2, Mc.a aVar, Mc.e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eVar = null;
        }
        c5165d.U0(sb2, aVar, eVar);
    }

    public vc.l A0() {
        return this.f40800l.a0();
    }

    public final void A1(U u10, StringBuilder sb2) throws IOException {
        C5165d c5165d;
        U u11;
        StringBuilder sb3;
        if (y0()) {
            c5165d = this;
            u11 = u10;
            sb3 = sb2;
        } else {
            if (!x0()) {
                B1(u10, sb2);
                List listU0 = u10.u0();
                AbstractC4862t.d(listU0, "property.contextReceiverParameters");
                d1(listU0, sb2);
                AbstractC1192u visibility = u10.getVisibility();
                AbstractC4862t.d(visibility, "property.visibility");
                V1(visibility, sb2);
                boolean z10 = false;
                r1(sb2, e0().contains(EnumC5166e.CONST) && u10.a0(), "const");
                n1(u10, sb2);
                q1(u10, sb2);
                v1(u10, sb2);
                if (e0().contains(EnumC5166e.LATEINIT) && u10.v0()) {
                    z10 = true;
                }
                r1(sb2, z10, "lateinit");
                m1(u10, sb2);
            }
            c5165d = this;
            u11 = u10;
            sb3 = sb2;
            R1(c5165d, u11, sb3, false, 4, null);
            List typeParameters = u11.getTypeParameters();
            AbstractC4862t.d(typeParameters, "property.typeParameters");
            c5165d.P1(typeParameters, sb3, true);
            c5165d.C1(u11, sb3);
        }
        c5165d.s1(u11, sb3, true);
        sb3.append(": ");
        E type = u11.getType();
        AbstractC4862t.d(type, "property.type");
        sb3.append(c5165d.w(type));
        c5165d.D1(u11, sb3);
        c5165d.k1(u11, sb3);
        List typeParameters2 = u11.getTypeParameters();
        AbstractC4862t.d(typeParameters2, "property.typeParameters");
        c5165d.W1(typeParameters2, sb3);
    }

    public boolean B0() {
        return this.f40800l.b0();
    }

    public final void B1(U u10, StringBuilder sb2) {
        if (e0().contains(EnumC5166e.ANNOTATIONS)) {
            V0(this, sb2, u10, null, 2, null);
            InterfaceC1194w interfaceC1194wT0 = u10.t0();
            if (interfaceC1194wT0 != null) {
                U0(sb2, interfaceC1194wT0, Mc.e.FIELD);
            }
            InterfaceC1194w interfaceC1194wN = u10.N();
            if (interfaceC1194wN != null) {
                U0(sb2, interfaceC1194wN, Mc.e.PROPERTY_DELEGATE_FIELD);
            }
            if (l0() == EnumC5173l.NONE) {
                V vG = u10.g();
                if (vG != null) {
                    U0(sb2, vG, Mc.e.PROPERTY_GETTER);
                }
                W wH = u10.h();
                if (wH != null) {
                    U0(sb2, wH, Mc.e.PROPERTY_SETTER);
                    List listI = wH.i();
                    AbstractC4862t.d(listI, "setter.valueParameters");
                    j0 it = (j0) C4179C.F0(listI);
                    AbstractC4862t.d(it, "it");
                    U0(sb2, it, Mc.e.SETTER_PARAMETER);
                }
            }
        }
    }

    public boolean C0() {
        return this.f40800l.c0();
    }

    public final void C1(InterfaceC1173a interfaceC1173a, StringBuilder sb2) {
        X xM = interfaceC1173a.M();
        if (xM != null) {
            U0(sb2, xM, Mc.e.RECEIVER);
            E type = xM.getType();
            AbstractC4862t.d(type, "receiver.type");
            sb2.append(g1(type));
            sb2.append(".");
        }
    }

    public AbstractC5164c.l D0() {
        return this.f40800l.d0();
    }

    public final void D1(InterfaceC1173a interfaceC1173a, StringBuilder sb2) {
        X xM;
        if (m0() && (xM = interfaceC1173a.M()) != null) {
            sb2.append(" on ");
            E type = xM.getType();
            AbstractC4862t.d(type, "receiver.type");
            sb2.append(w(type));
        }
    }

    public boolean E0() {
        return this.f40800l.e0();
    }

    public final void E1(StringBuilder sb2, M m10) {
        if (AbstractC4862t.a(m10, q0.f1393b) || q0.k(m10)) {
            sb2.append("???");
            return;
        }
        if (Ed.k.o(m10)) {
            if (!B0()) {
                sb2.append("???");
                return;
            }
            Cd.e0 e0VarN0 = m10.N0();
            AbstractC4862t.c(e0VarN0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb2.append(f1(((Ed.i) e0VarN0).b(0)));
            return;
        }
        if (Cd.G.a(m10)) {
            e1(sb2, m10);
        } else if (X1(m10)) {
            j1(sb2, m10);
        } else {
            e1(sb2, m10);
        }
    }

    public boolean F0() {
        return this.f40800l.f0();
    }

    public final void F1(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    public boolean G0() {
        return this.f40800l.g0();
    }

    public final void G1(InterfaceC1177e interfaceC1177e, StringBuilder sb2) throws IOException {
        if (I0() || Ic.g.m0(interfaceC1177e.p())) {
            return;
        }
        Collection collectionO = interfaceC1177e.k().o();
        AbstractC4862t.d(collectionO, "klass.typeConstructor.supertypes");
        if (collectionO.isEmpty()) {
            return;
        }
        if (collectionO.size() == 1 && Ic.g.b0((E) collectionO.iterator().next())) {
            return;
        }
        F1(sb2);
        sb2.append(": ");
        C4179C.n0(collectionO, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new g());
    }

    public boolean H0() {
        return this.f40800l.h0();
    }

    public final void H1(InterfaceC1196y interfaceC1196y, StringBuilder sb2) {
        r1(sb2, interfaceC1196y.isSuspend(), "suspend");
    }

    public boolean I0() {
        return this.f40800l.i0();
    }

    public final void I1(e0 e0Var, StringBuilder sb2) {
        V0(this, sb2, e0Var, null, 2, null);
        AbstractC1192u visibility = e0Var.getVisibility();
        AbstractC4862t.d(visibility, "typeAlias.visibility");
        V1(visibility, sb2);
        n1(e0Var, sb2);
        sb2.append(l1("typealias"));
        sb2.append(StringUtils.SPACE);
        s1(e0Var, sb2, true);
        List listQ = e0Var.q();
        AbstractC4862t.d(listQ, "typeAlias.declaredTypeParameters");
        P1(listQ, sb2, false);
        W0(e0Var, sb2);
        sb2.append(" = ");
        sb2.append(w(e0Var.r0()));
    }

    public boolean J0() {
        return this.f40800l.j0();
    }

    public String J1(List typeArguments) throws IOException {
        AbstractC4862t.e(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(O0());
        M(sb2, typeArguments);
        sb2.append(K0());
        String string = sb2.toString();
        AbstractC4862t.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String K0() {
        return O(">");
    }

    public String K1(Cd.e0 typeConstructor) {
        AbstractC4862t.e(typeConstructor, "typeConstructor");
        InterfaceC1180h interfaceC1180hQ = typeConstructor.q();
        if (interfaceC1180hQ instanceof f0 ? true : interfaceC1180hQ instanceof InterfaceC1177e ? true : interfaceC1180hQ instanceof e0) {
            return Z0(interfaceC1180hQ);
        }
        if (interfaceC1180hQ == null) {
            return typeConstructor instanceof D ? ((D) typeConstructor).d(h.f40812a) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + interfaceC1180hQ.getClass()).toString());
    }

    public final void L(StringBuilder sb2, InterfaceC1185m interfaceC1185m) {
        InterfaceC1185m interfaceC1185mB;
        String name;
        if ((interfaceC1185m instanceof K) || (interfaceC1185m instanceof P) || (interfaceC1185mB = interfaceC1185m.b()) == null || (interfaceC1185mB instanceof G)) {
            return;
        }
        sb2.append(StringUtils.SPACE);
        sb2.append(o1("defined in"));
        sb2.append(StringUtils.SPACE);
        kd.d dVarM = AbstractC5283e.m(interfaceC1185mB);
        AbstractC4862t.d(dVarM, "getFqName(containingDeclaration)");
        sb2.append(dVarM.e() ? "root package" : u(dVarM));
        if (G0() && (interfaceC1185mB instanceof K) && (interfaceC1185m instanceof InterfaceC1188p) && (name = ((InterfaceC1188p) interfaceC1185m).j().b().getName()) != null) {
            sb2.append(StringUtils.SPACE);
            sb2.append(o1("in file"));
            sb2.append(StringUtils.SPACE);
            sb2.append(name);
        }
    }

    public final boolean L0(E e10) {
        return Ic.f.q(e10) || !e10.getAnnotations().isEmpty();
    }

    public final void L1(StringBuilder sb2, E e10, Cd.e0 e0Var) {
        S sA = g0.a(e10);
        if (sA != null) {
            z1(sb2, sA);
        } else {
            sb2.append(K1(e0Var));
            sb2.append(J1(e10.L0()));
        }
    }

    public final void M(StringBuilder sb2, List list) throws IOException {
        C4179C.n0(list, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new c());
    }

    public final Lc.D M0(C c10) {
        if (c10 instanceof InterfaceC1177e) {
            return ((InterfaceC1177e) c10).f() == EnumC1178f.INTERFACE ? Lc.D.ABSTRACT : Lc.D.FINAL;
        }
        InterfaceC1185m interfaceC1185mB = c10.b();
        InterfaceC1177e interfaceC1177e = interfaceC1185mB instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1185mB : null;
        if (interfaceC1177e == null) {
            return Lc.D.FINAL;
        }
        if (!(c10 instanceof InterfaceC1174b)) {
            return Lc.D.FINAL;
        }
        InterfaceC1174b interfaceC1174b = (InterfaceC1174b) c10;
        Collection collectionD = interfaceC1174b.d();
        AbstractC4862t.d(collectionD, "this.overriddenDescriptors");
        if (!collectionD.isEmpty() && interfaceC1177e.r() != Lc.D.FINAL) {
            return Lc.D.OPEN;
        }
        if (interfaceC1177e.f() != EnumC1178f.INTERFACE || AbstractC4862t.a(interfaceC1174b.getVisibility(), AbstractC1191t.f8771a)) {
            return Lc.D.FINAL;
        }
        Lc.D dR = interfaceC1174b.r();
        Lc.D d10 = Lc.D.ABSTRACT;
        return dR == d10 ? d10 : Lc.D.OPEN;
    }

    public final String N() {
        int i10 = b.f40804a[z0().ordinal()];
        if (i10 == 1) {
            return O("->");
        }
        if (i10 == 2) {
            return "&rarr;";
        }
        throw new C4032o();
    }

    public final boolean N0(Mc.c cVar) {
        return AbstractC4862t.a(cVar.e(), j.a.f5753E);
    }

    public final void N1(f0 f0Var, StringBuilder sb2, boolean z10) {
        if (z10) {
            sb2.append(O0());
        }
        if (E0()) {
            sb2.append("/*");
            sb2.append(f0Var.getIndex());
            sb2.append("*/ ");
        }
        r1(sb2, f0Var.w(), "reified");
        String strJ = f0Var.m().j();
        boolean z11 = true;
        r1(sb2, strJ.length() > 0, strJ);
        V0(this, sb2, f0Var, null, 2, null);
        s1(f0Var, sb2, z10);
        int size = f0Var.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            E upperBound = (E) f0Var.getUpperBounds().iterator().next();
            if (!Ic.g.i0(upperBound)) {
                sb2.append(" : ");
                AbstractC4862t.d(upperBound, "upperBound");
                sb2.append(w(upperBound));
            }
        } else if (z10) {
            for (E upperBound2 : f0Var.getUpperBounds()) {
                if (!Ic.g.i0(upperBound2)) {
                    if (z11) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    AbstractC4862t.d(upperBound2, "upperBound");
                    sb2.append(w(upperBound2));
                    z11 = false;
                }
            }
        }
        if (z10) {
            sb2.append(K0());
        }
    }

    public final String O(String str) {
        return z0().b(str);
    }

    public final String O0() {
        return O("<");
    }

    public final void O1(StringBuilder sb2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            N1((f0) it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    public boolean P() {
        return this.f40800l.r();
    }

    public final boolean P0(InterfaceC1174b interfaceC1174b) {
        return !interfaceC1174b.d().isEmpty();
    }

    public final void P1(List list, StringBuilder sb2, boolean z10) {
        if (J0() || list.isEmpty()) {
            return;
        }
        sb2.append(O0());
        O1(sb2, list);
        sb2.append(K0());
        if (z10) {
            sb2.append(StringUtils.SPACE);
        }
    }

    public boolean Q() {
        return this.f40800l.s();
    }

    public final void Q0(StringBuilder sb2, C0718a c0718a) {
        EnumC5174m enumC5174mZ0 = z0();
        EnumC5174m enumC5174m = EnumC5174m.HTML;
        if (enumC5174mZ0 == enumC5174m) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* = ");
        u1(sb2, c0718a.F());
        sb2.append(" */");
        if (z0() == enumC5174m) {
            sb2.append("</i></font>");
        }
    }

    public final void Q1(k0 k0Var, StringBuilder sb2, boolean z10) {
        if (z10 || !(k0Var instanceof j0)) {
            sb2.append(l1(k0Var.L() ? "var" : "val"));
            sb2.append(StringUtils.SPACE);
        }
    }

    public vc.l R() {
        return this.f40800l.t();
    }

    public final void R0(T t10, StringBuilder sb2) {
        n1(t10, sb2);
    }

    public boolean S() {
        return this.f40800l.u();
    }

    public final void S0(InterfaceC1196y interfaceC1196y, StringBuilder sb2) {
        boolean z10;
        boolean z11 = false;
        if (interfaceC1196y.isOperator()) {
            Collection collectionD = interfaceC1196y.d();
            AbstractC4862t.d(collectionD, "functionDescriptor.overriddenDescriptors");
            if (!collectionD.isEmpty()) {
                Iterator it = collectionD.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((InterfaceC1196y) it.next()).isOperator()) {
                        if (Q()) {
                            break;
                        }
                    }
                }
                z10 = false;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (interfaceC1196y.isInfix()) {
            Collection collectionD2 = interfaceC1196y.d();
            AbstractC4862t.d(collectionD2, "functionDescriptor.overriddenDescriptors");
            if (collectionD2.isEmpty()) {
                z11 = true;
            } else {
                Iterator it2 = collectionD2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((InterfaceC1196y) it2.next()).isInfix()) {
                        if (Q()) {
                            break;
                        }
                    }
                }
            }
        }
        r1(sb2, interfaceC1196y.B(), "tailrec");
        H1(interfaceC1196y, sb2);
        r1(sb2, interfaceC1196y.isInline(), "inline");
        r1(sb2, z11, "infix");
        r1(sb2, z10, "operator");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S1(Lc.j0 r9, boolean r10, java.lang.StringBuilder r11, boolean r12) {
        /*
            r8 = this;
            if (r12 == 0) goto L10
            java.lang.String r2 = "value-parameter"
            java.lang.String r2 = r8.l1(r2)
            r11.append(r2)
            java.lang.String r2 = " "
            r11.append(r2)
        L10:
            boolean r2 = r8.E0()
            if (r2 == 0) goto L27
            java.lang.String r2 = "/*"
            r11.append(r2)
            int r2 = r9.getIndex()
            r11.append(r2)
        */
        //  java.lang.String r2 = "*/ "
        /*
            r11.append(r2)
        L27:
            r4 = 2
            r5 = 0
            r3 = 0
            r0 = r8
            r2 = r9
            r1 = r11
            V0(r0, r1, r2, r3, r4, r5)
            boolean r2 = r9.p0()
            java.lang.String r3 = "crossinline"
            r8.r1(r11, r2, r3)
            boolean r2 = r9.o0()
            java.lang.String r3 = "noinline"
            r8.r1(r11, r2, r3)
            boolean r2 = r8.t0()
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L60
            Lc.a r2 = r9.b()
            boolean r3 = r2 instanceof Lc.InterfaceC1176d
            if (r3 == 0) goto L55
            Lc.d r2 = (Lc.InterfaceC1176d) r2
            goto L56
        L55:
            r2 = 0
        L56:
            if (r2 == 0) goto L60
            boolean r2 = r2.b0()
            if (r2 != r7) goto L60
            r5 = r7
            goto L61
        L60:
            r5 = r6
        L61:
            if (r5 == 0) goto L6c
            boolean r2 = r8.P()
            java.lang.String r3 = "actual"
            r8.r1(r11, r2, r3)
        L6c:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.U1(r1, r2, r3, r4, r5)
            vc.l r0 = r8.V()
            if (r0 == 0) goto L8c
            boolean r0 = r8.h()
            if (r0 == 0) goto L85
            boolean r0 = r9.x0()
            goto L89
        L85:
            boolean r0 = sd.AbstractC5823c.c(r9)
        L89:
            if (r0 == 0) goto L8c
            r6 = r7
        L8c:
            if (r6 == 0) goto Laf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = " = "
            r0.append(r2)
            vc.l r2 = r8.V()
            kotlin.jvm.internal.AbstractC4862t.b(r2)
            java.lang.Object r2 = r2.invoke(r9)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.append(r0)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.C5165d.S1(Lc.j0, boolean, java.lang.StringBuilder, boolean):void");
    }

    public boolean T() {
        return this.f40800l.v();
    }

    public final List T0(Mc.c cVar) {
        InterfaceC1176d interfaceC1176dC;
        List listI;
        Map mapA = cVar.a();
        List listK = null;
        InterfaceC1177e interfaceC1177eI = q0() ? AbstractC5823c.i(cVar) : null;
        if (interfaceC1177eI != null && (interfaceC1176dC = interfaceC1177eI.C()) != null && (listI = interfaceC1176dC.i()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI) {
                if (((j0) obj).x0()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C4207u.v(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((j0) it.next()).getName());
            }
            listK = arrayList2;
        }
        if (listK == null) {
            listK = C4206t.k();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listK) {
            kd.f it2 = (kd.f) obj2;
            AbstractC4862t.d(it2, "it");
            if (!mapA.containsKey(it2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C4207u.v(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((kd.f) it3.next()).b() + " = ...");
        }
        Set<Map.Entry> setEntrySet = mapA.entrySet();
        ArrayList arrayList5 = new ArrayList(C4207u.v(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            kd.f fVar = (kd.f) entry.getKey();
            qd.g gVar = (qd.g) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fVar.b());
            sb2.append(" = ");
            sb2.append(!listK.contains(fVar) ? b1(gVar) : "...");
            arrayList5.add(sb2.toString());
        }
        return C4179C.I0(C4179C.C0(arrayList4, arrayList5));
    }

    public final void T1(Collection collection, boolean z10, StringBuilder sb2) {
        boolean zY1 = Y1(z10);
        int size = collection.size();
        D0().a(size, sb2);
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            D0().b(j0Var, i10, size, sb2);
            S1(j0Var, zY1, sb2, false);
            D0().c(j0Var, i10, size, sb2);
            i10++;
        }
        D0().d(size, sb2);
    }

    public InterfaceC5163b U() {
        return this.f40800l.w();
    }

    public final void U0(StringBuilder sb2, Mc.a aVar, Mc.e eVar) {
        if (e0().contains(EnumC5166e.ANNOTATIONS)) {
            Set setG = aVar instanceof E ? g() : X();
            vc.l lVarR = R();
            for (Mc.c cVar : aVar.getAnnotations()) {
                if (!C4179C.Y(setG, cVar.e()) && !N0(cVar) && (lVarR == null || ((Boolean) lVarR.invoke(cVar)).booleanValue())) {
                    sb2.append(r(cVar, eVar));
                    if (W()) {
                        sb2.append('\n');
                        AbstractC4862t.d(sb2, "append('\\n')");
                    } else {
                        sb2.append(StringUtils.SPACE);
                    }
                }
            }
        }
    }

    public final void U1(k0 k0Var, boolean z10, StringBuilder sb2, boolean z11, boolean z12) {
        E type = k0Var.getType();
        AbstractC4862t.d(type, "variable.type");
        j0 j0Var = k0Var instanceof j0 ? (j0) k0Var : null;
        E eS0 = j0Var != null ? j0Var.s0() : null;
        E e10 = eS0 == null ? type : eS0;
        r1(sb2, eS0 != null, "vararg");
        if (z12 || (z11 && !y0())) {
            Q1(k0Var, sb2, z12);
        }
        if (z10) {
            s1(k0Var, sb2, z11);
            sb2.append(": ");
        }
        sb2.append(w(e10));
        k1(k0Var, sb2);
        if (!E0() || eS0 == null) {
            return;
        }
        sb2.append(" /*");
        sb2.append(w(type));
        sb2.append("*/");
    }

    public vc.l V() {
        return this.f40800l.x();
    }

    public final boolean V1(AbstractC1192u abstractC1192u, StringBuilder sb2) {
        if (!e0().contains(EnumC5166e.VISIBILITY)) {
            return false;
        }
        if (f0()) {
            abstractC1192u = abstractC1192u.f();
        }
        if (!s0() && AbstractC4862t.a(abstractC1192u, AbstractC1191t.f8782l)) {
            return false;
        }
        sb2.append(l1(abstractC1192u.c()));
        sb2.append(StringUtils.SPACE);
        return true;
    }

    public boolean W() {
        return this.f40800l.y();
    }

    public final void W0(InterfaceC1181i interfaceC1181i, StringBuilder sb2) {
        List listQ = interfaceC1181i.q();
        AbstractC4862t.d(listQ, "classifier.declaredTypeParameters");
        List parameters = interfaceC1181i.k().getParameters();
        AbstractC4862t.d(parameters, "classifier.typeConstructor.parameters");
        if (E0() && interfaceC1181i.z() && parameters.size() > listQ.size()) {
            sb2.append(" /*captured type parameters: ");
            O1(sb2, parameters.subList(listQ.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    public final void W1(List list, StringBuilder sb2) throws IOException {
        if (J0()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            List upperBounds = f0Var.getUpperBounds();
            AbstractC4862t.d(upperBounds, "typeParameter.upperBounds");
            for (E it2 : C4179C.b0(upperBounds, 1)) {
                StringBuilder sb3 = new StringBuilder();
                kd.f name = f0Var.getName();
                AbstractC4862t.d(name, "typeParameter.name");
                sb3.append(v(name, false));
                sb3.append(" : ");
                AbstractC4862t.d(it2, "it");
                sb3.append(w(it2));
                arrayList.add(sb3.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb2.append(StringUtils.SPACE);
        sb2.append(l1("where"));
        sb2.append(StringUtils.SPACE);
        C4179C.n0(arrayList, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
    }

    public Set X() {
        return this.f40800l.z();
    }

    public final void X0(InterfaceC1177e interfaceC1177e, StringBuilder sb2) throws IOException {
        InterfaceC1176d interfaceC1176dC;
        boolean z10 = interfaceC1177e.f() == EnumC1178f.ENUM_ENTRY;
        if (!y0()) {
            V0(this, sb2, interfaceC1177e, null, 2, null);
            List listX = interfaceC1177e.X();
            AbstractC4862t.d(listX, "klass.contextReceivers");
            d1(listX, sb2);
            if (!z10) {
                AbstractC1192u visibility = interfaceC1177e.getVisibility();
                AbstractC4862t.d(visibility, "klass.visibility");
                V1(visibility, sb2);
            }
            if ((interfaceC1177e.f() != EnumC1178f.INTERFACE || interfaceC1177e.r() != Lc.D.ABSTRACT) && (!interfaceC1177e.f().b() || interfaceC1177e.r() != Lc.D.FINAL)) {
                Lc.D dR = interfaceC1177e.r();
                AbstractC4862t.d(dR, "klass.modality");
                p1(dR, sb2, M0(interfaceC1177e));
            }
            n1(interfaceC1177e, sb2);
            r1(sb2, e0().contains(EnumC5166e.INNER) && interfaceC1177e.z(), "inner");
            r1(sb2, e0().contains(EnumC5166e.DATA) && interfaceC1177e.I0(), "data");
            r1(sb2, e0().contains(EnumC5166e.INLINE) && interfaceC1177e.isInline(), "inline");
            r1(sb2, e0().contains(EnumC5166e.VALUE) && interfaceC1177e.i0(), "value");
            r1(sb2, e0().contains(EnumC5166e.FUN) && interfaceC1177e.d0(), "fun");
            Y0(interfaceC1177e, sb2);
        }
        if (AbstractC5283e.x(interfaceC1177e)) {
            a1(interfaceC1177e, sb2);
        } else {
            if (!y0()) {
                F1(sb2);
            }
            s1(interfaceC1177e, sb2, true);
        }
        if (z10) {
            return;
        }
        List listQ = interfaceC1177e.q();
        AbstractC4862t.d(listQ, "klass.declaredTypeParameters");
        P1(listQ, sb2, false);
        W0(interfaceC1177e, sb2);
        if (!interfaceC1177e.f().b() && T() && (interfaceC1176dC = interfaceC1177e.C()) != null) {
            sb2.append(StringUtils.SPACE);
            V0(this, sb2, interfaceC1176dC, null, 2, null);
            AbstractC1192u visibility2 = interfaceC1176dC.getVisibility();
            AbstractC4862t.d(visibility2, "primaryConstructor.visibility");
            V1(visibility2, sb2);
            sb2.append(l1("constructor"));
            List listI = interfaceC1176dC.i();
            AbstractC4862t.d(listI, "primaryConstructor.valueParameters");
            T1(listI, interfaceC1176dC.f0(), sb2);
        }
        G1(interfaceC1177e, sb2);
        W1(listQ, sb2);
    }

    public final boolean X1(E e10) {
        if (!Ic.f.o(e10)) {
            return false;
        }
        List listL0 = e10.L0();
        if (listL0 != null && listL0.isEmpty()) {
            return true;
        }
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            if (((i0) it.next()).a()) {
                return false;
            }
        }
        return true;
    }

    public final C5165d Y() {
        return (C5165d) this.f40801m.getValue();
    }

    public final void Y0(InterfaceC1177e interfaceC1177e, StringBuilder sb2) {
        sb2.append(l1(AbstractC5164c.f40777a.a(interfaceC1177e)));
    }

    public final boolean Y1(boolean z10) {
        int i10 = b.f40805b[i0().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return !z10;
        }
        if (i10 == 3) {
            return false;
        }
        throw new C4032o();
    }

    public boolean Z() {
        return this.f40800l.A();
    }

    public String Z0(InterfaceC1180h klass) {
        AbstractC4862t.e(klass, "klass");
        return Ed.k.m(klass) ? klass.k().toString() : U().a(klass, this);
    }

    @Override // nd.InterfaceC5167f
    public void a(EnumC5174m enumC5174m) {
        AbstractC4862t.e(enumC5174m, "<set-?>");
        this.f40800l.a(enumC5174m);
    }

    public boolean a0() {
        return this.f40800l.B();
    }

    public final void a1(InterfaceC1185m interfaceC1185m, StringBuilder sb2) {
        if (n0()) {
            if (y0()) {
                sb2.append("companion object");
            }
            F1(sb2);
            InterfaceC1185m interfaceC1185mB = interfaceC1185m.b();
            if (interfaceC1185mB != null) {
                sb2.append("of ");
                kd.f name = interfaceC1185mB.getName();
                AbstractC4862t.d(name, "containingDeclaration.name");
                sb2.append(v(name, false));
            }
        }
        if (E0() || !AbstractC4862t.a(interfaceC1185m.getName(), kd.h.f39569d)) {
            if (!y0()) {
                F1(sb2);
            }
            kd.f name2 = interfaceC1185m.getName();
            AbstractC4862t.d(name2, "descriptor.name");
            sb2.append(v(name2, true));
        }
    }

    @Override // nd.InterfaceC5167f
    public void b(boolean z10) {
        this.f40800l.b(z10);
    }

    public boolean b0() {
        return this.f40800l.C();
    }

    public final String b1(qd.g gVar) {
        if (gVar instanceof C5516b) {
            return C4179C.q0((Iterable) ((C5516b) gVar).b(), ", ", "{", "}", 0, null, new e(), 24, null);
        }
        if (gVar instanceof C5515a) {
            return F.B0(AbstractC5164c.s(this, (Mc.c) ((C5515a) gVar).b(), null, 2, null), "@");
        }
        if (!(gVar instanceof p)) {
            return gVar.toString();
        }
        p.b bVar = (p.b) ((p) gVar).b();
        if (bVar instanceof p.b.a) {
            return ((p.b.a) bVar).a() + "::class";
        }
        if (!(bVar instanceof p.b.C0583b)) {
            throw new C4032o();
        }
        p.b.C0583b c0583b = (p.b.C0583b) bVar;
        String strB = c0583b.b().b().b();
        AbstractC4862t.d(strB, "classValue.classId.asSingleFqName().asString()");
        for (int i10 = 0; i10 < c0583b.a(); i10++) {
            strB = "kotlin.Array<" + strB + '>';
        }
        return strB + "::class";
    }

    @Override // nd.InterfaceC5167f
    public void c(boolean z10) {
        this.f40800l.c(z10);
    }

    public boolean c0() {
        return this.f40800l.D();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c1(Lc.InterfaceC1184l r18, java.lang.StringBuilder r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.C5165d.c1(Lc.l, java.lang.StringBuilder):void");
    }

    @Override // nd.InterfaceC5167f
    public boolean d() {
        return this.f40800l.d();
    }

    public boolean d0() {
        return this.f40800l.E();
    }

    public final void d1(List list, StringBuilder sb2) {
        if (list.isEmpty()) {
            return;
        }
        sb2.append("context(");
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            X x10 = (X) it.next();
            U0(sb2, x10, Mc.e.RECEIVER);
            E type = x10.getType();
            AbstractC4862t.d(type, "contextReceiver.type");
            sb2.append(g1(type));
            if (i10 == C4206t.m(list)) {
                sb2.append(") ");
            } else {
                sb2.append(", ");
            }
            i10 = i11;
        }
    }

    @Override // nd.InterfaceC5167f
    public void e(boolean z10) {
        this.f40800l.e(z10);
    }

    public Set e0() {
        return this.f40800l.F();
    }

    public final void e1(StringBuilder sb2, E e10) {
        V0(this, sb2, e10, null, 2, null);
        C0732o c0732o = e10 instanceof C0732o ? (C0732o) e10 : null;
        if (c0732o != null) {
            c0732o.Z0();
        }
        if (!Cd.G.a(e10)) {
            M1(this, sb2, e10, null, 2, null);
        } else if (Hd.a.s(e10) && k0()) {
            sb2.append(f1(Ed.k.f3414a.p(e10)));
        } else {
            if (!(e10 instanceof Ed.h) || d0()) {
                sb2.append(e10.N0().toString());
            } else {
                sb2.append(((Ed.h) e10).W0());
            }
            sb2.append(J1(e10.L0()));
        }
        if (e10.O0()) {
            sb2.append("?");
        }
        if (Q.c(e10)) {
            sb2.append(" & Any");
        }
    }

    @Override // nd.InterfaceC5167f
    public void f(boolean z10) {
        this.f40800l.f(z10);
    }

    public boolean f0() {
        return this.f40800l.G();
    }

    public final String f1(String str) {
        int i10 = b.f40804a[z0().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 != 2) {
            throw new C4032o();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    @Override // nd.InterfaceC5167f
    public Set g() {
        return this.f40800l.g();
    }

    public final C5168g g0() {
        return this.f40800l;
    }

    public final String g1(E e10) {
        String strW = w(e10);
        if (!X1(e10) || q0.l(e10)) {
            return strW;
        }
        return '(' + strW + ')';
    }

    @Override // nd.InterfaceC5167f
    public boolean h() {
        return this.f40800l.h();
    }

    public EnumC5171j h0() {
        return this.f40800l.H();
    }

    public final String h1(List list) {
        return O(AbstractC5175n.c(list));
    }

    @Override // nd.InterfaceC5167f
    public EnumC5162a i() {
        return this.f40800l.i();
    }

    public EnumC5172k i0() {
        return this.f40800l.I();
    }

    public final void i1(InterfaceC1196y interfaceC1196y, StringBuilder sb2) throws IOException {
        C5165d c5165d;
        InterfaceC1196y interfaceC1196y2;
        StringBuilder sb3;
        if (y0()) {
            c5165d = this;
            interfaceC1196y2 = interfaceC1196y;
            sb3 = sb2;
        } else {
            if (x0()) {
                c5165d = this;
                interfaceC1196y2 = interfaceC1196y;
                sb3 = sb2;
            } else {
                c5165d = this;
                interfaceC1196y2 = interfaceC1196y;
                sb3 = sb2;
                V0(c5165d, sb3, interfaceC1196y2, null, 2, null);
                List listU0 = interfaceC1196y2.u0();
                AbstractC4862t.d(listU0, "function.contextReceiverParameters");
                c5165d.d1(listU0, sb3);
                AbstractC1192u visibility = interfaceC1196y2.getVisibility();
                AbstractC4862t.d(visibility, "function.visibility");
                c5165d.V1(visibility, sb3);
                c5165d.q1(interfaceC1196y2, sb3);
                if (c5165d.Z()) {
                    c5165d.n1(interfaceC1196y2, sb3);
                }
                c5165d.v1(interfaceC1196y2, sb3);
                if (c5165d.Z()) {
                    c5165d.S0(interfaceC1196y2, sb3);
                } else {
                    c5165d.H1(interfaceC1196y2, sb3);
                }
                c5165d.m1(interfaceC1196y2, sb3);
                if (c5165d.E0()) {
                    if (interfaceC1196y2.B0()) {
                        sb3.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (interfaceC1196y2.F0()) {
                        sb3.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb3.append(c5165d.l1("fun"));
            sb3.append(StringUtils.SPACE);
            List typeParameters = interfaceC1196y2.getTypeParameters();
            AbstractC4862t.d(typeParameters, "function.typeParameters");
            c5165d.P1(typeParameters, sb3, true);
            c5165d.C1(interfaceC1196y2, sb3);
        }
        c5165d.s1(interfaceC1196y2, sb3, true);
        List listI = interfaceC1196y2.i();
        AbstractC4862t.d(listI, "function.valueParameters");
        c5165d.T1(listI, interfaceC1196y2.f0(), sb3);
        c5165d.D1(interfaceC1196y2, sb3);
        E returnType = interfaceC1196y2.getReturnType();
        if (!c5165d.H0() && (c5165d.C0() || returnType == null || !Ic.g.B0(returnType))) {
            sb3.append(": ");
            sb3.append(returnType == null ? "[NULL]" : c5165d.w(returnType));
        }
        List typeParameters2 = interfaceC1196y2.getTypeParameters();
        AbstractC4862t.d(typeParameters2, "function.typeParameters");
        c5165d.W1(typeParameters2, sb3);
    }

    @Override // nd.InterfaceC5167f
    public void j(Set set) {
        AbstractC4862t.e(set, "<set-?>");
        this.f40800l.j(set);
    }

    public boolean j0() {
        return this.f40800l.J();
    }

    public final void j1(StringBuilder sb2, E e10) {
        kd.f fVarD;
        int length = sb2.length();
        V0(Y(), sb2, e10, null, 2, null);
        boolean z10 = sb2.length() != length;
        E eJ = Ic.f.j(e10);
        List listE = Ic.f.e(e10);
        if (!listE.isEmpty()) {
            sb2.append("context(");
            Iterator it = listE.subList(0, C4206t.m(listE)).iterator();
            while (it.hasNext()) {
                t1(sb2, (E) it.next());
                sb2.append(", ");
            }
            t1(sb2, (E) C4179C.s0(listE));
            sb2.append(") ");
        }
        boolean zQ = Ic.f.q(e10);
        boolean zO0 = e10.O0();
        boolean z11 = zO0 || (z10 && eJ != null);
        if (z11) {
            if (zQ) {
                sb2.insert(length, '(');
            } else {
                if (z10) {
                    C1821a.c(H.k1(sb2));
                    if (sb2.charAt(F.c0(sb2) - 1) != ')') {
                        sb2.insert(F.c0(sb2), "()");
                    }
                }
                sb2.append("(");
            }
        }
        r1(sb2, zQ, "suspend");
        if (eJ != null) {
            boolean z12 = (X1(eJ) && !eJ.O0()) || L0(eJ);
            if (z12) {
                sb2.append("(");
            }
            t1(sb2, eJ);
            if (z12) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        if (!Ic.f.m(e10) || e10.L0().size() > 1) {
            int i10 = 0;
            for (i0 i0Var : Ic.f.l(e10)) {
                int i11 = i10 + 1;
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (j0()) {
                    E type = i0Var.getType();
                    AbstractC4862t.d(type, "typeProjection.type");
                    fVarD = Ic.f.d(type);
                } else {
                    fVarD = null;
                }
                if (fVarD != null) {
                    sb2.append(v(fVarD, false));
                    sb2.append(": ");
                }
                sb2.append(x(i0Var));
                i10 = i11;
            }
        } else {
            sb2.append("???");
        }
        sb2.append(") ");
        sb2.append(N());
        sb2.append(StringUtils.SPACE);
        t1(sb2, Ic.f.k(e10));
        if (z11) {
            sb2.append(")");
        }
        if (zO0) {
            sb2.append("?");
        }
    }

    @Override // nd.InterfaceC5167f
    public void k(Set set) {
        AbstractC4862t.e(set, "<set-?>");
        this.f40800l.k(set);
    }

    public boolean k0() {
        return this.f40800l.K();
    }

    public final void k1(k0 k0Var, StringBuilder sb2) {
        qd.g gVarN0;
        if (!c0() || (gVarN0 = k0Var.n0()) == null) {
            return;
        }
        sb2.append(" = ");
        sb2.append(O(b1(gVarN0)));
    }

    @Override // nd.InterfaceC5167f
    public void l(InterfaceC5163b interfaceC5163b) {
        AbstractC4862t.e(interfaceC5163b, "<set-?>");
        this.f40800l.l(interfaceC5163b);
    }

    public EnumC5173l l0() {
        return this.f40800l.L();
    }

    public final String l1(String str) {
        int i10 = b.f40804a[z0().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new C4032o();
            }
            if (!S()) {
                return "<b>" + str + "</b>";
            }
        }
        return str;
    }

    @Override // nd.InterfaceC5167f
    public void m(boolean z10) {
        this.f40800l.m(z10);
    }

    public boolean m0() {
        return this.f40800l.M();
    }

    public final void m1(InterfaceC1174b interfaceC1174b, StringBuilder sb2) {
        if (e0().contains(EnumC5166e.MEMBER_KIND) && E0() && interfaceC1174b.f() != InterfaceC1174b.a.DECLARATION) {
            sb2.append("/*");
            sb2.append(Kd.a.f(interfaceC1174b.f().name()));
            sb2.append("*/ ");
        }
    }

    @Override // nd.InterfaceC5167f
    public void n(boolean z10) {
        this.f40800l.n(z10);
    }

    public boolean n0() {
        return this.f40800l.N();
    }

    public final void n1(C c10, StringBuilder sb2) {
        r1(sb2, c10.isExternal(), "external");
        boolean z10 = false;
        r1(sb2, e0().contains(EnumC5166e.EXPECT) && c10.k0(), "expect");
        if (e0().contains(EnumC5166e.ACTUAL) && c10.V()) {
            z10 = true;
        }
        r1(sb2, z10, "actual");
    }

    @Override // nd.InterfaceC5167f
    public void o(EnumC5172k enumC5172k) {
        AbstractC4862t.e(enumC5172k, "<set-?>");
        this.f40800l.o(enumC5172k);
    }

    public boolean o0() {
        return this.f40800l.O();
    }

    public String o1(String message) {
        AbstractC4862t.e(message, "message");
        int i10 = b.f40804a[z0().ordinal()];
        if (i10 == 1) {
            return message;
        }
        if (i10 != 2) {
            throw new C4032o();
        }
        return "<i>" + message + "</i>";
    }

    @Override // nd.InterfaceC5167f
    public void p(boolean z10) {
        this.f40800l.p(z10);
    }

    public boolean p0() {
        return this.f40800l.P();
    }

    public final void p1(Lc.D d10, StringBuilder sb2, Lc.D d11) {
        if (r0() || d10 != d11) {
            r1(sb2, e0().contains(EnumC5166e.MODALITY), Kd.a.f(d10.name()));
        }
    }

    @Override // nd.AbstractC5164c
    public String q(InterfaceC1185m declarationDescriptor) {
        AbstractC4862t.e(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.j0(new a(), sb2);
        if (F0()) {
            L(sb2, declarationDescriptor);
        }
        String string = sb2.toString();
        AbstractC4862t.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public boolean q0() {
        return this.f40800l.Q();
    }

    public final void q1(InterfaceC1174b interfaceC1174b, StringBuilder sb2) {
        if (AbstractC5283e.J(interfaceC1174b) && interfaceC1174b.r() == Lc.D.FINAL) {
            return;
        }
        if (h0() == EnumC5171j.RENDER_OVERRIDE && interfaceC1174b.r() == Lc.D.OPEN && P0(interfaceC1174b)) {
            return;
        }
        Lc.D dR = interfaceC1174b.r();
        AbstractC4862t.d(dR, "callable.modality");
        p1(dR, sb2, M0(interfaceC1174b));
    }

    @Override // nd.AbstractC5164c
    public String r(Mc.c annotation, Mc.e eVar) throws IOException {
        AbstractC4862t.e(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (eVar != null) {
            sb2.append(eVar.b() + ':');
        }
        E type = annotation.getType();
        sb2.append(w(type));
        if (a0()) {
            List listT0 = T0(annotation);
            if (b0() || !listT0.isEmpty()) {
                C4179C.n0(listT0, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
            }
        }
        if (E0() && (Cd.G.a(type) || (type.N0().q() instanceof J.b))) {
            sb2.append(" /* annotation class not found */");
        }
        String string = sb2.toString();
        AbstractC4862t.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public boolean r0() {
        return this.f40800l.R();
    }

    public final void r1(StringBuilder sb2, boolean z10, String str) {
        if (z10) {
            sb2.append(l1(str));
            sb2.append(StringUtils.SPACE);
        }
    }

    public boolean s0() {
        return this.f40800l.S();
    }

    public final void s1(InterfaceC1185m interfaceC1185m, StringBuilder sb2, boolean z10) {
        kd.f name = interfaceC1185m.getName();
        AbstractC4862t.d(name, "descriptor.name");
        sb2.append(v(name, z10));
    }

    @Override // nd.AbstractC5164c
    public String t(String lowerRendered, String upperRendered, Ic.g builtIns) {
        AbstractC4862t.e(lowerRendered, "lowerRendered");
        AbstractC4862t.e(upperRendered, "upperRendered");
        AbstractC4862t.e(builtIns, "builtIns");
        if (AbstractC5175n.f(lowerRendered, upperRendered)) {
            if (!Od.C.P(upperRendered, "(", false, 2, null)) {
                return lowerRendered + '!';
            }
            return '(' + lowerRendered + ")!";
        }
        InterfaceC5163b interfaceC5163bU = U();
        InterfaceC1177e interfaceC1177eW = builtIns.w();
        AbstractC4862t.d(interfaceC1177eW, "builtIns.collection");
        String strY0 = F.Y0(interfaceC5163bU.a(interfaceC1177eW, this), "Collection", null, 2, null);
        String strD = AbstractC5175n.d(lowerRendered, strY0 + "Mutable", upperRendered, strY0, strY0 + "(Mutable)");
        if (strD != null) {
            return strD;
        }
        String strD2 = AbstractC5175n.d(lowerRendered, strY0 + "MutableMap.MutableEntry", upperRendered, strY0 + "Map.Entry", strY0 + "(Mutable)Map.(Mutable)Entry");
        if (strD2 != null) {
            return strD2;
        }
        InterfaceC5163b interfaceC5163bU2 = U();
        InterfaceC1177e interfaceC1177eJ = builtIns.j();
        AbstractC4862t.d(interfaceC1177eJ, "builtIns.array");
        String strY02 = F.Y0(interfaceC5163bU2.a(interfaceC1177eJ, this), "Array", null, 2, null);
        String strD3 = AbstractC5175n.d(lowerRendered, strY02 + O("Array<"), upperRendered, strY02 + O("Array<out "), strY02 + O("Array<(out) "));
        if (strD3 != null) {
            return strD3;
        }
        return '(' + lowerRendered + ".." + upperRendered + ')';
    }

    public boolean t0() {
        return this.f40800l.T();
    }

    public final void t1(StringBuilder sb2, E e10) {
        t0 t0VarQ0 = e10.Q0();
        C0718a c0718a = t0VarQ0 instanceof C0718a ? (C0718a) t0VarQ0 : null;
        if (c0718a == null) {
            u1(sb2, e10);
            return;
        }
        if (u0()) {
            u1(sb2, c0718a.F());
            return;
        }
        u1(sb2, c0718a.Z0());
        if (v0()) {
            Q0(sb2, c0718a);
        }
    }

    @Override // nd.AbstractC5164c
    public String u(kd.d fqName) {
        AbstractC4862t.e(fqName, "fqName");
        List listH = fqName.h();
        AbstractC4862t.d(listH, "fqName.pathSegments()");
        return h1(listH);
    }

    public boolean u0() {
        return this.f40800l.U();
    }

    public final void u1(StringBuilder sb2, E e10) {
        if ((e10 instanceof v0) && h() && !((v0) e10).S0()) {
            sb2.append("<Not computed yet>");
            return;
        }
        t0 t0VarQ0 = e10.Q0();
        if (t0VarQ0 instanceof AbstractC0741y) {
            sb2.append(((AbstractC0741y) t0VarQ0).X0(this, this));
        } else if (t0VarQ0 instanceof M) {
            E1(sb2, (M) t0VarQ0);
        }
    }

    @Override // nd.AbstractC5164c
    public String v(kd.f name, boolean z10) {
        AbstractC4862t.e(name, "name");
        String strO = O(AbstractC5175n.b(name));
        if (!S() || z0() != EnumC5174m.HTML || !z10) {
            return strO;
        }
        return "<b>" + strO + "</b>";
    }

    public boolean v0() {
        return this.f40800l.V();
    }

    public final void v1(InterfaceC1174b interfaceC1174b, StringBuilder sb2) {
        if (e0().contains(EnumC5166e.OVERRIDE) && P0(interfaceC1174b) && h0() != EnumC5171j.RENDER_OPEN) {
            r1(sb2, true, "override");
            if (E0()) {
                sb2.append("/*");
                sb2.append(interfaceC1174b.d().size());
                sb2.append("*/ ");
            }
        }
    }

    @Override // nd.AbstractC5164c
    public String w(E type) {
        AbstractC4862t.e(type, "type");
        StringBuilder sb2 = new StringBuilder();
        t1(sb2, (E) A0().invoke(type));
        String string = sb2.toString();
        AbstractC4862t.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public boolean w0() {
        return this.f40800l.W();
    }

    public final void w1(K k10, StringBuilder sb2) {
        x1(k10.e(), "package-fragment", sb2);
        if (h()) {
            sb2.append(" in ");
            s1(k10.b(), sb2, false);
        }
    }

    @Override // nd.AbstractC5164c
    public String x(i0 typeProjection) throws IOException {
        AbstractC4862t.e(typeProjection, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        M(sb2, C4205s.d(typeProjection));
        String string = sb2.toString();
        AbstractC4862t.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public boolean x0() {
        return this.f40800l.X();
    }

    public final void x1(kd.c cVar, String str, StringBuilder sb2) {
        sb2.append(l1(str));
        kd.d dVarJ = cVar.j();
        AbstractC4862t.d(dVarJ, "fqName.toUnsafe()");
        String strU = u(dVarJ);
        if (strU.length() > 0) {
            sb2.append(StringUtils.SPACE);
            sb2.append(strU);
        }
    }

    public boolean y0() {
        return this.f40800l.Y();
    }

    public final void y1(P p10, StringBuilder sb2) {
        x1(p10.e(), SentryStackFrame.JsonKeys.PACKAGE, sb2);
        if (h()) {
            sb2.append(" in context of ");
            s1(p10.A0(), sb2, false);
        }
    }

    public EnumC5174m z0() {
        return this.f40800l.Z();
    }

    public final void z1(StringBuilder sb2, S s10) {
        S sC = s10.c();
        if (sC != null) {
            z1(sb2, sC);
            sb2.append('.');
            kd.f name = s10.b().getName();
            AbstractC4862t.d(name, "possiblyInnerType.classifierDescriptor.name");
            sb2.append(v(name, false));
        } else {
            Cd.e0 e0VarK = s10.b().k();
            AbstractC4862t.d(e0VarK, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb2.append(K1(e0VarK));
        }
        sb2.append(J1(s10.a()));
    }
}
