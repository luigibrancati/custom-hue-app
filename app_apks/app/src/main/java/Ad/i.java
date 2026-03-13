package Ad;

import Lc.InterfaceC1180h;
import Lc.K;
import fd.t;
import fd.w;
import gc.C4179C;
import gc.U;
import gc.y;
import hd.AbstractC4297a;
import hd.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import vd.C6095d;
import yd.C6478k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class i extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final K f435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kd.c f437i;

    public i(K packageDescriptor, fd.l proto, hd.c nameResolver, AbstractC4297a metadataVersion, f fVar, C6478k components, String debugName, InterfaceC6082a classNames) {
        AbstractC4862t.e(packageDescriptor, "packageDescriptor");
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(nameResolver, "nameResolver");
        AbstractC4862t.e(metadataVersion, "metadataVersion");
        AbstractC4862t.e(components, "components");
        AbstractC4862t.e(debugName, "debugName");
        AbstractC4862t.e(classNames, "classNames");
        t tVarQ = proto.Q();
        AbstractC4862t.d(tVarQ, "proto.typeTable");
        hd.g gVar = new hd.g(tVarQ);
        h.a aVar = hd.h.f36571b;
        w wVarR = proto.R();
        AbstractC4862t.d(wVarR, "proto.versionRequirementTable");
        yd.m mVarA = components.a(packageDescriptor, nameResolver, gVar, aVar.a(wVarR), metadataVersion, fVar);
        List listJ = proto.J();
        AbstractC4862t.d(listJ, "proto.functionList");
        List listM = proto.M();
        AbstractC4862t.d(listM, "proto.propertyList");
        List listP = proto.P();
        AbstractC4862t.d(listP, "proto.typeAliasList");
        super(mVarA, listJ, listM, listP, classNames);
        this.f435g = packageDescriptor;
        this.f436h = debugName;
        this.f437i = packageDescriptor.e();
    }

    @Override // Ad.h, vd.AbstractC6100i, vd.InterfaceC6102k
    public InterfaceC1180h e(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        z(name, location);
        return super.e(name, location);
    }

    @Override // Ad.h
    public void i(Collection result, vc.l nameFilter) {
        AbstractC4862t.e(result, "result");
        AbstractC4862t.e(nameFilter, "nameFilter");
    }

    @Override // Ad.h
    public kd.b m(kd.f name) {
        AbstractC4862t.e(name, "name");
        return new kd.b(this.f437i, name);
    }

    @Override // Ad.h
    public Set s() {
        return U.d();
    }

    @Override // Ad.h
    public Set t() {
        return U.d();
    }

    public String toString() {
        return this.f436h;
    }

    @Override // Ad.h
    public Set u() {
        return U.d();
    }

    @Override // Ad.h
    public boolean w(kd.f name) {
        AbstractC4862t.e(name, "name");
        if (super.w(name)) {
            return true;
        }
        Iterable iterableK = p().c().k();
        if ((iterableK instanceof Collection) && ((Collection) iterableK).isEmpty()) {
            return false;
        }
        Iterator it = iterableK.iterator();
        while (it.hasNext()) {
            if (((Nc.b) it.next()).a(this.f437i, name)) {
                return true;
            }
        }
        return false;
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6102k
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public List f(C6095d kindFilter, vc.l nameFilter) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        AbstractC4862t.e(nameFilter, "nameFilter");
        Collection collectionJ = j(kindFilter, nameFilter, Tc.d.WHEN_GET_ALL_DESCRIPTORS);
        Iterable iterableK = p().c().k();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterableK.iterator();
        while (it.hasNext()) {
            y.C(arrayList, ((Nc.b) it.next()).b(this.f437i));
        }
        return C4179C.C0(collectionJ, arrayList);
    }

    public void z(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        Sc.a.b(p().c().o(), location, this.f435g, name);
    }
}
