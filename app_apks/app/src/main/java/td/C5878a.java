package td;

import Lc.InterfaceC1177e;
import Xc.g;
import gc.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: td.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5878a implements InterfaceC5883f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f44917b;

    public C5878a(List inner) {
        AbstractC4862t.e(inner, "inner");
        this.f44917b = inner;
    }

    @Override // td.InterfaceC5883f
    public void a(g gVar, InterfaceC1177e thisDescriptor, List result) {
        AbstractC4862t.e(gVar, "<this>");
        AbstractC4862t.e(thisDescriptor, "thisDescriptor");
        AbstractC4862t.e(result, "result");
        Iterator it = this.f44917b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5883f) it.next()).a(gVar, thisDescriptor, result);
        }
    }

    @Override // td.InterfaceC5883f
    public List b(g gVar, InterfaceC1177e thisDescriptor) {
        AbstractC4862t.e(gVar, "<this>");
        AbstractC4862t.e(thisDescriptor, "thisDescriptor");
        List list = this.f44917b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y.C(arrayList, ((InterfaceC5883f) it.next()).b(gVar, thisDescriptor));
        }
        return arrayList;
    }

    @Override // td.InterfaceC5883f
    public List c(g gVar, InterfaceC1177e thisDescriptor) {
        AbstractC4862t.e(gVar, "<this>");
        AbstractC4862t.e(thisDescriptor, "thisDescriptor");
        List list = this.f44917b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y.C(arrayList, ((InterfaceC5883f) it.next()).c(gVar, thisDescriptor));
        }
        return arrayList;
    }

    @Override // td.InterfaceC5883f
    public void d(g gVar, InterfaceC1177e thisDescriptor, kd.f name, Collection result) {
        AbstractC4862t.e(gVar, "<this>");
        AbstractC4862t.e(thisDescriptor, "thisDescriptor");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(result, "result");
        Iterator it = this.f44917b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5883f) it.next()).d(gVar, thisDescriptor, name, result);
        }
    }

    @Override // td.InterfaceC5883f
    public void e(g gVar, InterfaceC1177e thisDescriptor, kd.f name, List result) {
        AbstractC4862t.e(gVar, "<this>");
        AbstractC4862t.e(thisDescriptor, "thisDescriptor");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(result, "result");
        Iterator it = this.f44917b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5883f) it.next()).e(gVar, thisDescriptor, name, result);
        }
    }

    @Override // td.InterfaceC5883f
    public List f(g gVar, InterfaceC1177e thisDescriptor) {
        AbstractC4862t.e(gVar, "<this>");
        AbstractC4862t.e(thisDescriptor, "thisDescriptor");
        List list = this.f44917b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y.C(arrayList, ((InterfaceC5883f) it.next()).f(gVar, thisDescriptor));
        }
        return arrayList;
    }

    @Override // td.InterfaceC5883f
    public void g(g gVar, InterfaceC1177e thisDescriptor, kd.f name, Collection result) {
        AbstractC4862t.e(gVar, "<this>");
        AbstractC4862t.e(thisDescriptor, "thisDescriptor");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(result, "result");
        Iterator it = this.f44917b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5883f) it.next()).g(gVar, thisDescriptor, name, result);
        }
    }
}
