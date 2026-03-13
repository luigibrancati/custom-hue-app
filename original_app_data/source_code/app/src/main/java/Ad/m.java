package Ad;

import Cd.E;
import Lc.InterfaceC1185m;
import Lc.a0;
import Lc.d0;
import Oc.AbstractC1808b;
import fd.q;
import fd.s;
import gc.C4179C;
import gc.C4205s;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import sd.AbstractC5823c;
import vc.InterfaceC6082a;
import yd.C6463A;
import yd.C6466D;
import yd.x;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends AbstractC1808b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final yd.m f459k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f460l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Ad.a f461m;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {
        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return C4179C.V0(m.this.f459k.c().d().h(m.this.O0(), m.this.f459k.g()));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(yd.m c10, s proto, int i10) {
        AbstractC4862t.e(c10, "c");
        AbstractC4862t.e(proto, "proto");
        Bd.n nVarH = c10.h();
        InterfaceC1185m interfaceC1185mE = c10.e();
        Mc.g gVarB = Mc.g.f9435K.b();
        kd.f fVarB = x.b(c10.g(), proto.I());
        C6463A c6463a = C6463A.f48513a;
        s.c cVarO = proto.O();
        AbstractC4862t.d(cVarO, "proto.variance");
        super(nVarH, interfaceC1185mE, gVarB, fVarB, c6463a.d(cVarO), proto.J(), i10, a0.f8746a, d0.a.f8751a);
        this.f459k = c10;
        this.f460l = proto;
        this.f461m = new Ad.a(c10.h(), new a());
    }

    @Override // Oc.AbstractC1811e
    public List L0() {
        List listS = hd.f.s(this.f460l, this.f459k.j());
        if (listS.isEmpty()) {
            return C4205s.d(AbstractC5823c.j(this).y());
        }
        C6466D c6466dI = this.f459k.i();
        ArrayList arrayList = new ArrayList(C4207u.v(listS, 10));
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(c6466dI.q((q) it.next()));
        }
        return arrayList;
    }

    @Override // Mc.b, Mc.a
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public Ad.a getAnnotations() {
        return this.f461m;
    }

    public final s O0() {
        return this.f460l;
    }

    @Override // Oc.AbstractC1811e
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public Void K0(E type) {
        AbstractC4862t.e(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
