package Ic;

import Cd.E;
import Cd.q0;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import Lc.K;
import fc.AbstractC4040w;
import gc.C4179C;
import gc.Q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f5834a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f5835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f5836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f5837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f5838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f5839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set f5840g;

    static {
        m[] mVarArrValues = m.values();
        ArrayList arrayList = new ArrayList(mVarArrValues.length);
        for (m mVar : mVarArrValues) {
            arrayList.add(mVar.p());
        }
        f5835b = C4179C.Z0(arrayList);
        l[] lVarArrValues = l.values();
        ArrayList arrayList2 = new ArrayList(lVarArrValues.length);
        for (l lVar : lVarArrValues) {
            arrayList2.add(lVar.b());
        }
        f5836c = C4179C.Z0(arrayList2);
        f5837d = new HashMap();
        f5838e = new HashMap();
        f5839f = Q.k(AbstractC4040w.a(l.UBYTEARRAY, kd.f.s("ubyteArrayOf")), AbstractC4040w.a(l.USHORTARRAY, kd.f.s("ushortArrayOf")), AbstractC4040w.a(l.UINTARRAY, kd.f.s("uintArrayOf")), AbstractC4040w.a(l.ULONGARRAY, kd.f.s("ulongArrayOf")));
        m[] mVarArrValues2 = m.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (m mVar2 : mVarArrValues2) {
            linkedHashSet.add(mVar2.b().j());
        }
        f5840g = linkedHashSet;
        for (m mVar3 : m.values()) {
            f5837d.put(mVar3.b(), mVar3.j());
            f5838e.put(mVar3.j(), mVar3.b());
        }
    }

    public static final boolean d(E type) {
        InterfaceC1180h interfaceC1180hQ;
        AbstractC4862t.e(type, "type");
        if (q0.w(type) || (interfaceC1180hQ = type.N0().q()) == null) {
            return false;
        }
        return f5834a.c(interfaceC1180hQ);
    }

    public final kd.b a(kd.b arrayClassId) {
        AbstractC4862t.e(arrayClassId, "arrayClassId");
        return (kd.b) f5837d.get(arrayClassId);
    }

    public final boolean b(kd.f name) {
        AbstractC4862t.e(name, "name");
        return f5840g.contains(name);
    }

    public final boolean c(InterfaceC1185m descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        InterfaceC1185m interfaceC1185mB = descriptor.b();
        return (interfaceC1185mB instanceof K) && AbstractC4862t.a(((K) interfaceC1185mB).e(), j.f5739u) && f5835b.contains(descriptor.getName());
    }
}
