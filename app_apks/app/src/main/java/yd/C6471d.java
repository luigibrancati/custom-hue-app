package yd;

import Lc.G;
import Lc.J;
import fd.b;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import xd.AbstractC6362a;
import yd.z;

/* JADX INFO: renamed from: yd.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6471d implements InterfaceC6470c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC6362a f48548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6472e f48549b;

    /* JADX INFO: renamed from: yd.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48550a;

        static {
            int[] iArr = new int[EnumC6469b.values().length];
            try {
                iArr[EnumC6469b.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6469b.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6469b.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f48550a = iArr;
        }
    }

    public C6471d(G module, J notFoundClasses, AbstractC6362a protocol) {
        AbstractC4862t.e(module, "module");
        AbstractC4862t.e(notFoundClasses, "notFoundClasses");
        AbstractC4862t.e(protocol, "protocol");
        this.f48548a = protocol;
        this.f48549b = new C6472e(module, notFoundClasses);
    }

    @Override // yd.InterfaceC6473f
    public List a(fd.q proto, hd.c nameResolver) {
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(nameResolver, "nameResolver");
        List listK = (List) proto.o(this.f48548a.k());
        if (listK == null) {
            listK = C4206t.k();
        }
        ArrayList arrayList = new ArrayList(C4207u.v(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f48549b.a((fd.b) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // yd.InterfaceC6473f
    public List b(z container, fd.g proto) {
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(proto, "proto");
        List listK = (List) proto.o(this.f48548a.d());
        if (listK == null) {
            listK = C4206t.k();
        }
        ArrayList arrayList = new ArrayList(C4207u.v(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f48549b.a((fd.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // yd.InterfaceC6473f
    public List c(z container, md.p proto, EnumC6469b kind) {
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(kind, "kind");
        return C4206t.k();
    }

    @Override // yd.InterfaceC6473f
    public List e(z container, fd.n proto) {
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(proto, "proto");
        return C4206t.k();
    }

    @Override // yd.InterfaceC6473f
    public List f(z container, fd.n proto) {
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(proto, "proto");
        return C4206t.k();
    }

    @Override // yd.InterfaceC6473f
    public List g(z container, md.p callableProto, EnumC6469b kind, int i10, fd.u proto) {
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(callableProto, "callableProto");
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(proto, "proto");
        List listK = (List) proto.o(this.f48548a.g());
        if (listK == null) {
            listK = C4206t.k();
        }
        ArrayList arrayList = new ArrayList(C4207u.v(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f48549b.a((fd.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // yd.InterfaceC6473f
    public List h(fd.s proto, hd.c nameResolver) {
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(nameResolver, "nameResolver");
        List listK = (List) proto.o(this.f48548a.l());
        if (listK == null) {
            listK = C4206t.k();
        }
        ArrayList arrayList = new ArrayList(C4207u.v(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f48549b.a((fd.b) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // yd.InterfaceC6473f
    public List i(z.a container) {
        AbstractC4862t.e(container, "container");
        List listK = (List) container.f().o(this.f48548a.a());
        if (listK == null) {
            listK = C4206t.k();
        }
        ArrayList arrayList = new ArrayList(C4207u.v(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f48549b.a((fd.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // yd.InterfaceC6473f
    public List k(z container, md.p proto, EnumC6469b kind) {
        List listK;
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(kind, "kind");
        if (proto instanceof fd.d) {
            listK = (List) ((fd.d) proto).o(this.f48548a.c());
        } else if (proto instanceof fd.i) {
            listK = (List) ((fd.i) proto).o(this.f48548a.f());
        } else {
            if (!(proto instanceof fd.n)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i10 = a.f48550a[kind.ordinal()];
            if (i10 == 1) {
                listK = (List) ((fd.n) proto).o(this.f48548a.h());
            } else if (i10 == 2) {
                listK = (List) ((fd.n) proto).o(this.f48548a.i());
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                listK = (List) ((fd.n) proto).o(this.f48548a.j());
            }
        }
        if (listK == null) {
            listK = C4206t.k();
        }
        ArrayList arrayList = new ArrayList(C4207u.v(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f48549b.a((fd.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // yd.InterfaceC6470c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public qd.g j(z container, fd.n proto, Cd.E expectedType) {
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(expectedType, "expectedType");
        return null;
    }

    @Override // yd.InterfaceC6470c
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public qd.g d(z container, fd.n proto, Cd.E expectedType) {
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(expectedType, "expectedType");
        b.C0442b.c cVar = (b.C0442b.c) hd.e.a(proto, this.f48548a.b());
        if (cVar == null) {
            return null;
        }
        return this.f48549b.f(expectedType, cVar, container.b());
    }
}
