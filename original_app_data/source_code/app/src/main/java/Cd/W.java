package Cd;

import Lc.InterfaceC1180h;
import gc.C4179C;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class W {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1303e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f1304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lc.e0 f1305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f1307d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final W a(W w10, Lc.e0 typeAliasDescriptor, List arguments) {
            AbstractC4862t.e(typeAliasDescriptor, "typeAliasDescriptor");
            AbstractC4862t.e(arguments, "arguments");
            List parameters = typeAliasDescriptor.k().getParameters();
            AbstractC4862t.d(parameters, "typeAliasDescriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C4207u.v(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((Lc.f0) it.next()).a());
            }
            return new W(w10, typeAliasDescriptor, arguments, gc.Q.s(C4179C.d1(arrayList, arguments)), null);
        }

        public a() {
        }
    }

    public /* synthetic */ W(W w10, Lc.e0 e0Var, List list, Map map, AbstractC4854k abstractC4854k) {
        this(w10, e0Var, list, map);
    }

    public final List a() {
        return this.f1306c;
    }

    public final Lc.e0 b() {
        return this.f1305b;
    }

    public final i0 c(e0 constructor) {
        AbstractC4862t.e(constructor, "constructor");
        InterfaceC1180h interfaceC1180hQ = constructor.q();
        if (interfaceC1180hQ instanceof Lc.f0) {
            return (i0) this.f1307d.get(interfaceC1180hQ);
        }
        return null;
    }

    public final boolean d(Lc.e0 descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        if (AbstractC4862t.a(this.f1305b, descriptor)) {
            return true;
        }
        W w10 = this.f1304a;
        return w10 != null ? w10.d(descriptor) : false;
    }

    public W(W w10, Lc.e0 e0Var, List list, Map map) {
        this.f1304a = w10;
        this.f1305b = e0Var;
        this.f1306c = list;
        this.f1307d = map;
    }
}
