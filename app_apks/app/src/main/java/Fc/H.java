package Fc;

import Cc.k;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1196y;
import Lc.U;
import Lc.X;
import Lc.j0;
import gc.C4179C;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import nd.AbstractC5164c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f3843a = new H();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC5164c f3844b = AbstractC5164c.f40783g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3845a;

        static {
            int[] iArr = new int[k.a.values().length];
            try {
                iArr[k.a.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.a.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.a.VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3845a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f3846a = new b();

        public b() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(j0 j0Var) {
            H h10 = H.f3843a;
            Cd.E type = j0Var.getType();
            AbstractC4862t.d(type, "it.type");
            return h10.h(type);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f3847a = new c();

        public c() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(j0 j0Var) {
            H h10 = H.f3843a;
            Cd.E type = j0Var.getType();
            AbstractC4862t.d(type, "it.type");
            return h10.h(type);
        }
    }

    public final void a(StringBuilder sb2, X x10) {
        if (x10 != null) {
            Cd.E type = x10.getType();
            AbstractC4862t.d(type, "receiver.type");
            sb2.append(h(type));
            sb2.append(".");
        }
    }

    public final void b(StringBuilder sb2, InterfaceC1173a interfaceC1173a) {
        X xI = L.i(interfaceC1173a);
        X xM = interfaceC1173a.M();
        a(sb2, xI);
        boolean z10 = (xI == null || xM == null) ? false : true;
        if (z10) {
            sb2.append("(");
        }
        a(sb2, xM);
        if (z10) {
            sb2.append(")");
        }
    }

    public final String c(InterfaceC1173a interfaceC1173a) {
        if (interfaceC1173a instanceof U) {
            return g((U) interfaceC1173a);
        }
        if (interfaceC1173a instanceof InterfaceC1196y) {
            return d((InterfaceC1196y) interfaceC1173a);
        }
        throw new IllegalStateException(("Illegal callable: " + interfaceC1173a).toString());
    }

    public final String d(InterfaceC1196y descriptor) throws IOException {
        AbstractC4862t.e(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        H h10 = f3843a;
        h10.b(sb2, descriptor);
        AbstractC5164c abstractC5164c = f3844b;
        kd.f name = descriptor.getName();
        AbstractC4862t.d(name, "descriptor.name");
        sb2.append(abstractC5164c.v(name, true));
        List listI = descriptor.i();
        AbstractC4862t.d(listI, "descriptor.valueParameters");
        C4179C.n0(listI, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : b.f3846a);
        sb2.append(": ");
        Cd.E returnType = descriptor.getReturnType();
        AbstractC4862t.b(returnType);
        sb2.append(h10.h(returnType));
        String string = sb2.toString();
        AbstractC4862t.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String e(InterfaceC1196y invoke) throws IOException {
        AbstractC4862t.e(invoke, "invoke");
        StringBuilder sb2 = new StringBuilder();
        H h10 = f3843a;
        h10.b(sb2, invoke);
        List listI = invoke.i();
        AbstractC4862t.d(listI, "invoke.valueParameters");
        C4179C.n0(listI, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : c.f3847a);
        sb2.append(" -> ");
        Cd.E returnType = invoke.getReturnType();
        AbstractC4862t.b(returnType);
        sb2.append(h10.h(returnType));
        String string = sb2.toString();
        AbstractC4862t.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String f(u parameter) {
        AbstractC4862t.e(parameter, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i10 = a.f3845a[parameter.f().ordinal()];
        if (i10 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i10 == 2) {
            sb2.append("instance parameter");
        } else if (i10 == 3) {
            sb2.append("parameter #" + parameter.o() + ' ' + parameter.getName());
        }
        sb2.append(" of ");
        sb2.append(f3843a.c(parameter.i().y()));
        String string = sb2.toString();
        AbstractC4862t.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String g(U descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(descriptor.L() ? "var " : "val ");
        H h10 = f3843a;
        h10.b(sb2, descriptor);
        AbstractC5164c abstractC5164c = f3844b;
        kd.f name = descriptor.getName();
        AbstractC4862t.d(name, "descriptor.name");
        sb2.append(abstractC5164c.v(name, true));
        sb2.append(": ");
        Cd.E type = descriptor.getType();
        AbstractC4862t.d(type, "descriptor.type");
        sb2.append(h10.h(type));
        String string = sb2.toString();
        AbstractC4862t.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String h(Cd.E type) {
        AbstractC4862t.e(type, "type");
        return f3844b.w(type);
    }
}
