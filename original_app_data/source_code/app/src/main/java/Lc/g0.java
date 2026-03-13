package Lc;

import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import od.AbstractC5283e;
import sd.AbstractC5823c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g0 {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f8752a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC1185m it) {
            AbstractC4862t.e(it, "it");
            return Boolean.valueOf(it instanceof InterfaceC1173a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f8753a = new b();

        public b() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC1185m it) {
            AbstractC4862t.e(it, "it");
            return Boolean.valueOf(!(it instanceof InterfaceC1184l));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f8754a = new c();

        public c() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Nd.h invoke(InterfaceC1185m it) {
            AbstractC4862t.e(it, "it");
            List typeParameters = ((InterfaceC1173a) it).getTypeParameters();
            AbstractC4862t.d(typeParameters, "it as CallableDescriptor).typeParameters");
            return C4179C.X(typeParameters);
        }
    }

    public static final S a(Cd.E e10) {
        AbstractC4862t.e(e10, "<this>");
        InterfaceC1180h interfaceC1180hQ = e10.N0().q();
        return b(e10, interfaceC1180hQ instanceof InterfaceC1181i ? (InterfaceC1181i) interfaceC1180hQ : null, 0);
    }

    public static final S b(Cd.E e10, InterfaceC1181i interfaceC1181i, int i10) {
        if (interfaceC1181i == null || Ed.k.m(interfaceC1181i)) {
            return null;
        }
        int size = interfaceC1181i.q().size() + i10;
        if (interfaceC1181i.z()) {
            List listSubList = e10.L0().subList(i10, size);
            InterfaceC1185m interfaceC1185mB = interfaceC1181i.b();
            return new S(interfaceC1181i, listSubList, b(e10, interfaceC1185mB instanceof InterfaceC1181i ? (InterfaceC1181i) interfaceC1185mB : null, size));
        }
        if (size != e10.L0().size()) {
            AbstractC5283e.E(interfaceC1181i);
        }
        return new S(interfaceC1181i, e10.L0().subList(i10, e10.L0().size()), null);
    }

    public static final C1175c c(f0 f0Var, InterfaceC1185m interfaceC1185m, int i10) {
        return new C1175c(f0Var, interfaceC1185m, i10);
    }

    public static final List d(InterfaceC1181i interfaceC1181i) {
        List listK;
        Object next;
        Cd.e0 e0VarK;
        AbstractC4862t.e(interfaceC1181i, "<this>");
        List declaredTypeParameters = interfaceC1181i.q();
        AbstractC4862t.d(declaredTypeParameters, "declaredTypeParameters");
        if (!interfaceC1181i.z() && !(interfaceC1181i.b() instanceof InterfaceC1173a)) {
            return declaredTypeParameters;
        }
        List listO = Nd.t.O(Nd.t.D(Nd.t.y(Nd.t.M(AbstractC5823c.q(interfaceC1181i), a.f8752a), b.f8753a), c.f8754a));
        Iterator it = AbstractC5823c.q(interfaceC1181i).iterator();
        while (true) {
            listK = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof InterfaceC1177e) {
                break;
            }
        }
        InterfaceC1177e interfaceC1177e = (InterfaceC1177e) next;
        if (interfaceC1177e != null && (e0VarK = interfaceC1177e.k()) != null) {
            listK = e0VarK.getParameters();
        }
        if (listK == null) {
            listK = C4206t.k();
        }
        if (listO.isEmpty() && listK.isEmpty()) {
            List declaredTypeParameters2 = interfaceC1181i.q();
            AbstractC4862t.d(declaredTypeParameters2, "declaredTypeParameters");
            return declaredTypeParameters2;
        }
        List<f0> listC0 = C4179C.C0(listO, listK);
        ArrayList arrayList = new ArrayList(C4207u.v(listC0, 10));
        for (f0 it2 : listC0) {
            AbstractC4862t.d(it2, "it");
            arrayList.add(c(it2, interfaceC1181i, declaredTypeParameters.size()));
        }
        return C4179C.C0(declaredTypeParameters, arrayList);
    }
}
