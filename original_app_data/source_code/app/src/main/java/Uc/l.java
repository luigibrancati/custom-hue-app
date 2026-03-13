package Uc;

import Lc.InterfaceC1173a;
import Lc.InterfaceC1177e;
import Lc.X;
import Lc.Z;
import Lc.j0;
import gc.C4179C;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import od.C5289k;
import od.InterfaceC5284f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements InterfaceC5284f {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16927a;

        static {
            int[] iArr = new int[C5289k.i.a.values().length];
            try {
                iArr[C5289k.i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f16927a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16928a = new b();

        public b() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Cd.E invoke(j0 j0Var) {
            return j0Var.getType();
        }
    }

    @Override // od.InterfaceC5284f
    public InterfaceC5284f.b a(InterfaceC1173a superDescriptor, InterfaceC1173a subDescriptor, InterfaceC1177e interfaceC1177e) {
        AbstractC4862t.e(superDescriptor, "superDescriptor");
        AbstractC4862t.e(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof Wc.e) {
            Wc.e eVar = (Wc.e) subDescriptor;
            List typeParameters = eVar.getTypeParameters();
            AbstractC4862t.d(typeParameters, "subDescriptor.typeParameters");
            if (typeParameters.isEmpty()) {
                C5289k.i iVarW = C5289k.w(superDescriptor, subDescriptor);
                if ((iVarW != null ? iVarW.c() : null) != null) {
                    return InterfaceC5284f.b.UNKNOWN;
                }
                List listI = eVar.i();
                AbstractC4862t.d(listI, "subDescriptor.valueParameters");
                Nd.h hVarI = Nd.t.I(C4179C.X(listI), b.f16928a);
                Cd.E returnType = eVar.getReturnType();
                AbstractC4862t.b(returnType);
                Nd.h hVarL = Nd.t.L(hVarI, returnType);
                X xM = eVar.M();
                for (Cd.E e10 : Nd.t.K(hVarL, C4206t.o(xM != null ? xM.getType() : null))) {
                    if (!e10.L0().isEmpty() && !(e10.Q0() instanceof Zc.h)) {
                        return InterfaceC5284f.b.UNKNOWN;
                    }
                }
                InterfaceC1173a interfaceC1173aBuild = (InterfaceC1173a) superDescriptor.c(new Zc.g(null, 1, null).c());
                if (interfaceC1173aBuild == null) {
                    return InterfaceC5284f.b.UNKNOWN;
                }
                if (interfaceC1173aBuild instanceof Z) {
                    Z z10 = (Z) interfaceC1173aBuild;
                    List typeParameters2 = z10.getTypeParameters();
                    AbstractC4862t.d(typeParameters2, "erasedSuper.typeParameters");
                    if (!typeParameters2.isEmpty()) {
                        interfaceC1173aBuild = z10.u().r(C4206t.k()).build();
                        AbstractC4862t.b(interfaceC1173aBuild);
                    }
                }
                C5289k.i.a aVarC = C5289k.f41544f.F(interfaceC1173aBuild, subDescriptor, false).c();
                AbstractC4862t.d(aVarC, "DEFAULT.isOverridableByW…Descriptor, false).result");
                return a.f16927a[aVarC.ordinal()] == 1 ? InterfaceC5284f.b.OVERRIDABLE : InterfaceC5284f.b.UNKNOWN;
            }
        }
        return InterfaceC5284f.b.UNKNOWN;
    }

    @Override // od.InterfaceC5284f
    public InterfaceC5284f.a b() {
        return InterfaceC5284f.a.SUCCESS_ONLY;
    }
}
