package Vc;

import Cd.E;
import Ed.k;
import Ic.j;
import Lc.G;
import Lc.j0;
import Mc.m;
import Mc.n;
import bd.InterfaceC2910b;
import bd.InterfaceC2921m;
import fc.AbstractC4040w;
import gc.C4207u;
import gc.Q;
import gc.U;
import gc.y;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import qd.C5516b;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f17486a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f17487b = Q.l(AbstractC4040w.a("PACKAGE", EnumSet.noneOf(n.class)), AbstractC4040w.a("TYPE", EnumSet.of(n.CLASS, n.FILE)), AbstractC4040w.a("ANNOTATION_TYPE", EnumSet.of(n.ANNOTATION_CLASS)), AbstractC4040w.a("TYPE_PARAMETER", EnumSet.of(n.TYPE_PARAMETER)), AbstractC4040w.a("FIELD", EnumSet.of(n.FIELD)), AbstractC4040w.a("LOCAL_VARIABLE", EnumSet.of(n.LOCAL_VARIABLE)), AbstractC4040w.a("PARAMETER", EnumSet.of(n.VALUE_PARAMETER)), AbstractC4040w.a("CONSTRUCTOR", EnumSet.of(n.CONSTRUCTOR)), AbstractC4040w.a("METHOD", EnumSet.of(n.FUNCTION, n.PROPERTY_GETTER, n.PROPERTY_SETTER)), AbstractC4040w.a("TYPE_USE", EnumSet.of(n.TYPE)));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f17488c = Q.l(AbstractC4040w.a("RUNTIME", m.RUNTIME), AbstractC4040w.a("CLASS", m.BINARY), AbstractC4040w.a("SOURCE", m.SOURCE));

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17489a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(G module) {
            AbstractC4862t.e(module, "module");
            j0 j0VarB = Vc.a.b(c.f17481a.d(), module.n().o(j.a.f5759H));
            E type = j0VarB != null ? j0VarB.getType() : null;
            return type == null ? k.d(Ed.j.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
        }
    }

    public final qd.g a(InterfaceC2910b interfaceC2910b) {
        InterfaceC2921m interfaceC2921m = interfaceC2910b instanceof InterfaceC2921m ? (InterfaceC2921m) interfaceC2910b : null;
        if (interfaceC2921m != null) {
            Map map = f17488c;
            kd.f fVarD = interfaceC2921m.d();
            m mVar = (m) map.get(fVarD != null ? fVarD.b() : null);
            if (mVar != null) {
                kd.b bVarM = kd.b.m(j.a.f5765K);
                AbstractC4862t.d(bVarM, "topLevel(StandardNames.F…ames.annotationRetention)");
                kd.f fVarS = kd.f.s(mVar.name());
                AbstractC4862t.d(fVarS, "identifier(retention.name)");
                return new qd.j(bVarM, fVarS);
            }
        }
        return null;
    }

    public final Set b(String str) {
        EnumSet enumSet = (EnumSet) f17487b.get(str);
        return enumSet != null ? enumSet : U.d();
    }

    public final qd.g c(List arguments) {
        AbstractC4862t.e(arguments, "arguments");
        ArrayList<InterfaceC2921m> arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof InterfaceC2921m) {
                arrayList.add(obj);
            }
        }
        ArrayList<n> arrayList2 = new ArrayList();
        for (InterfaceC2921m interfaceC2921m : arrayList) {
            d dVar = f17486a;
            kd.f fVarD = interfaceC2921m.d();
            y.C(arrayList2, dVar.b(fVarD != null ? fVarD.b() : null));
        }
        ArrayList arrayList3 = new ArrayList(C4207u.v(arrayList2, 10));
        for (n nVar : arrayList2) {
            kd.b bVarM = kd.b.m(j.a.f5763J);
            AbstractC4862t.d(bVarM, "topLevel(StandardNames.FqNames.annotationTarget)");
            kd.f fVarS = kd.f.s(nVar.name());
            AbstractC4862t.d(fVarS, "identifier(kotlinTarget.name)");
            arrayList3.add(new qd.j(bVarM, fVarS));
        }
        return new C5516b(arrayList3, a.f17489a);
    }
}
