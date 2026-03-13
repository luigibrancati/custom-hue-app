package jd;

import fc.C4034q;
import fd.l;
import fd.n;
import fd.q;
import fd.u;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import hd.b;
import id.AbstractC4376a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jd.AbstractC4763d;
import kotlin.jvm.internal.AbstractC4862t;
import md.C5053g;
import md.i;

/* JADX INFO: renamed from: jd.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4768i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4768i f39178a = new C4768i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C5053g f39179b;

    static {
        C5053g c5053gD = C5053g.d();
        AbstractC4376a.a(c5053gD);
        AbstractC4862t.d(c5053gD, "newInstance().apply(JvmP…f::registerAllExtensions)");
        f39179b = c5053gD;
    }

    public static /* synthetic */ AbstractC4763d.a d(C4768i c4768i, n nVar, hd.c cVar, hd.g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return c4768i.c(nVar, cVar, gVar, z10);
    }

    public static final boolean f(n proto) {
        AbstractC4862t.e(proto, "proto");
        b.C0476b c0476bA = C4762c.f39157a.a();
        Object objO = proto.o(AbstractC4376a.f37382e);
        AbstractC4862t.d(objO, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean boolD = c0476bA.d(((Number) objO).intValue());
        AbstractC4862t.d(boolD, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return boolD.booleanValue();
    }

    public static final C4034q h(byte[] bytes, String[] strings) {
        AbstractC4862t.e(bytes, "bytes");
        AbstractC4862t.e(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new C4034q(f39178a.k(byteArrayInputStream, strings), fd.c.s1(byteArrayInputStream, f39179b));
    }

    public static final C4034q i(String[] data, String[] strings) {
        AbstractC4862t.e(data, "data");
        AbstractC4862t.e(strings, "strings");
        byte[] bArrE = AbstractC4760a.e(data);
        AbstractC4862t.d(bArrE, "decodeBytes(data)");
        return h(bArrE, strings);
    }

    public static final C4034q j(String[] data, String[] strings) {
        AbstractC4862t.e(data, "data");
        AbstractC4862t.e(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC4760a.e(data));
        return new C4034q(f39178a.k(byteArrayInputStream, strings), fd.i.A0(byteArrayInputStream, f39179b));
    }

    public static final C4034q l(byte[] bytes, String[] strings) {
        AbstractC4862t.e(bytes, "bytes");
        AbstractC4862t.e(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new C4034q(f39178a.k(byteArrayInputStream, strings), l.Y(byteArrayInputStream, f39179b));
    }

    public static final C4034q m(String[] data, String[] strings) {
        AbstractC4862t.e(data, "data");
        AbstractC4862t.e(strings, "strings");
        byte[] bArrE = AbstractC4760a.e(data);
        AbstractC4862t.d(bArrE, "decodeBytes(data)");
        return l(bArrE, strings);
    }

    public final C5053g a() {
        return f39179b;
    }

    public final AbstractC4763d.b b(fd.d proto, hd.c nameResolver, hd.g typeTable) {
        String strQ0;
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(nameResolver, "nameResolver");
        AbstractC4862t.e(typeTable, "typeTable");
        i.f constructorSignature = AbstractC4376a.f37378a;
        AbstractC4862t.d(constructorSignature, "constructorSignature");
        AbstractC4376a.c cVar = (AbstractC4376a.c) hd.e.a(proto, constructorSignature);
        String string = (cVar == null || !cVar.t()) ? "<init>" : nameResolver.getString(cVar.r());
        if (cVar == null || !cVar.s()) {
            List<u> listG = proto.G();
            AbstractC4862t.d(listG, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(C4207u.v(listG, 10));
            for (u it : listG) {
                C4768i c4768i = f39178a;
                AbstractC4862t.d(it, "it");
                String strG = c4768i.g(hd.f.q(it, typeTable), nameResolver);
                if (strG == null) {
                    return null;
                }
                arrayList.add(strG);
            }
            strQ0 = C4179C.q0(arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            strQ0 = nameResolver.getString(cVar.q());
        }
        return new AbstractC4763d.b(string, strQ0);
    }

    public final AbstractC4763d.a c(n proto, hd.c nameResolver, hd.g typeTable, boolean z10) {
        String strG;
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(nameResolver, "nameResolver");
        AbstractC4862t.e(typeTable, "typeTable");
        i.f propertySignature = AbstractC4376a.f37381d;
        AbstractC4862t.d(propertySignature, "propertySignature");
        AbstractC4376a.d dVar = (AbstractC4376a.d) hd.e.a(proto, propertySignature);
        if (dVar == null) {
            return null;
        }
        AbstractC4376a.b bVarU = dVar.z() ? dVar.u() : null;
        if (bVarU == null && z10) {
            return null;
        }
        int iX = (bVarU == null || !bVarU.t()) ? proto.X() : bVarU.r();
        if (bVarU == null || !bVarU.s()) {
            strG = g(hd.f.n(proto, typeTable), nameResolver);
            if (strG == null) {
                return null;
            }
        } else {
            strG = nameResolver.getString(bVarU.q());
        }
        return new AbstractC4763d.a(nameResolver.getString(iX), strG);
    }

    public final AbstractC4763d.b e(fd.i proto, hd.c nameResolver, hd.g typeTable) {
        String string;
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(nameResolver, "nameResolver");
        AbstractC4862t.e(typeTable, "typeTable");
        i.f methodSignature = AbstractC4376a.f37379b;
        AbstractC4862t.d(methodSignature, "methodSignature");
        AbstractC4376a.c cVar = (AbstractC4376a.c) hd.e.a(proto, methodSignature);
        int iY = (cVar == null || !cVar.t()) ? proto.Y() : cVar.r();
        if (cVar == null || !cVar.s()) {
            List listO = C4206t.o(hd.f.k(proto, typeTable));
            List<u> listK0 = proto.k0();
            AbstractC4862t.d(listK0, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(C4207u.v(listK0, 10));
            for (u it : listK0) {
                AbstractC4862t.d(it, "it");
                arrayList.add(hd.f.q(it, typeTable));
            }
            List listC0 = C4179C.C0(listO, arrayList);
            ArrayList arrayList2 = new ArrayList(C4207u.v(listC0, 10));
            Iterator it2 = listC0.iterator();
            while (it2.hasNext()) {
                String strG = f39178a.g((q) it2.next(), nameResolver);
                if (strG == null) {
                    return null;
                }
                arrayList2.add(strG);
            }
            String strG2 = g(hd.f.m(proto, typeTable), nameResolver);
            if (strG2 == null) {
                return null;
            }
            string = C4179C.q0(arrayList2, "", "(", ")", 0, null, null, 56, null) + strG2;
        } else {
            string = nameResolver.getString(cVar.q());
        }
        return new AbstractC4763d.b(nameResolver.getString(iY), string);
    }

    public final String g(q qVar, hd.c cVar) {
        if (qVar.g0()) {
            return C4761b.b(cVar.b(qVar.R()));
        }
        return null;
    }

    public final C4765f k(InputStream inputStream, String[] strArr) {
        AbstractC4376a.e eVarX = AbstractC4376a.e.x(inputStream, f39179b);
        AbstractC4862t.d(eVarX, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new C4765f(eVarX, strArr);
    }
}
