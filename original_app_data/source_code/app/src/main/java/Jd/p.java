package Jd;

import Cd.E;
import Jd.k;
import Jd.r;
import Jd.t;
import Lc.AbstractC1195x;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1196y;
import Lc.X;
import Lc.e0;
import Lc.j0;
import gc.C4179C;
import gc.C4206t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import sd.AbstractC5823c;
import wd.C6193e;
import wd.InterfaceC6195g;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends Jd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f6427a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f6428b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6429a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(InterfaceC1196y $receiver) {
            AbstractC4862t.e($receiver, "$this$$receiver");
            List valueParameters = $receiver.i();
            AbstractC4862t.d(valueParameters, "valueParameters");
            j0 j0Var = (j0) C4179C.u0(valueParameters);
            boolean z10 = false;
            if (j0Var != null && !AbstractC5823c.c(j0Var) && j0Var.s0() == null) {
                z10 = true;
            }
            p pVar = p.f6427a;
            if (z10) {
                return null;
            }
            return "last parameter should not have a default value or be a vararg";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f6430a = new b();

        public b() {
            super(1);
        }

        public static final boolean b(InterfaceC1185m interfaceC1185m) {
            return (interfaceC1185m instanceof InterfaceC1177e) && Ic.g.a0((InterfaceC1177e) interfaceC1185m);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(InterfaceC1196y $receiver) {
            boolean z10;
            AbstractC4862t.e($receiver, "$this$$receiver");
            p pVar = p.f6427a;
            InterfaceC1185m containingDeclaration = $receiver.b();
            AbstractC4862t.d(containingDeclaration, "containingDeclaration");
            if (b(containingDeclaration)) {
                z10 = true;
                break;
            }
            Collection overriddenDescriptors = $receiver.d();
            AbstractC4862t.d(overriddenDescriptors, "overriddenDescriptors");
            if (!overriddenDescriptors.isEmpty()) {
                Iterator it = overriddenDescriptors.iterator();
                while (it.hasNext()) {
                    InterfaceC1185m interfaceC1185mB = ((InterfaceC1196y) it.next()).b();
                    AbstractC4862t.d(interfaceC1185mB, "it.containingDeclaration");
                    if (b(interfaceC1185mB)) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            if (z10) {
                return null;
            }
            return "must override ''equals()'' in Any";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f6431a = new c();

        public c() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(InterfaceC1196y $receiver) {
            boolean zP;
            AbstractC4862t.e($receiver, "$this$$receiver");
            X xJ = $receiver.J();
            if (xJ == null) {
                xJ = $receiver.M();
            }
            p pVar = p.f6427a;
            boolean z10 = false;
            if (xJ != null) {
                E returnType = $receiver.getReturnType();
                if (returnType != null) {
                    E type = xJ.getType();
                    AbstractC4862t.d(type, "receiver.type");
                    zP = Hd.a.p(returnType, type);
                } else {
                    zP = false;
                }
                if (zP || pVar.d($receiver, xJ)) {
                    z10 = true;
                }
            }
            if (z10) {
                return null;
            }
            return "receiver must be a supertype of the return type";
        }
    }

    static {
        kd.f fVar = q.f6463k;
        k.b bVar = k.b.f6419b;
        h hVar = new h(fVar, new f[]{bVar, new t.a(1)}, (vc.l) null, 4, (AbstractC4854k) null);
        h hVar2 = new h(q.f6464l, new f[]{bVar, new t.a(2)}, a.f6429a);
        kd.f fVar2 = q.f6454b;
        m mVar = m.f6421a;
        t.a aVar = new t.a(2);
        j jVar = j.f6415a;
        h hVar3 = new h(fVar2, new f[]{bVar, mVar, aVar, jVar}, (vc.l) null, 4, (AbstractC4854k) null);
        h hVar4 = new h(q.f6455c, new f[]{bVar, mVar, new t.a(3), jVar}, (vc.l) null, 4, (AbstractC4854k) null);
        h hVar5 = new h(q.f6456d, new f[]{bVar, mVar, new t.b(2), jVar}, (vc.l) null, 4, (AbstractC4854k) null);
        h hVar6 = new h(q.f6461i, new f[]{bVar}, (vc.l) null, 4, (AbstractC4854k) null);
        kd.f fVar3 = q.f6460h;
        t.d dVar = t.d.f6495b;
        r.a aVar2 = r.a.f6482d;
        h hVar7 = new h(fVar3, new f[]{bVar, dVar, mVar, aVar2}, (vc.l) null, 4, (AbstractC4854k) null);
        kd.f fVar4 = q.f6462j;
        t.c cVar = t.c.f6494b;
        f6428b = C4206t.n(hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, new h(fVar4, new f[]{bVar, cVar}, (vc.l) null, 4, (AbstractC4854k) null), new h(q.f6465m, new f[]{bVar, cVar}, (vc.l) null, 4, (AbstractC4854k) null), new h(q.f6466n, new f[]{bVar, cVar, aVar2}, (vc.l) null, 4, (AbstractC4854k) null), new h(q.f6440I, new f[]{bVar, dVar, mVar}, (vc.l) null, 4, (AbstractC4854k) null), new h(q.f6441J, new f[]{bVar, dVar, mVar}, (vc.l) null, 4, (AbstractC4854k) null), new h(q.f6457e, new f[]{k.a.f6418b}, b.f6430a), new h(q.f6459g, new f[]{bVar, r.b.f6484d, dVar, mVar}, (vc.l) null, 4, (AbstractC4854k) null), new h(q.f6450S, new f[]{bVar, dVar, mVar}, (vc.l) null, 4, (AbstractC4854k) null), new h(q.f6449R, new f[]{bVar, cVar}, (vc.l) null, 4, (AbstractC4854k) null), new h(C4206t.n(q.f6476x, q.f6477y), new f[]{bVar}, c.f6431a), new h(q.f6451T, new f[]{bVar, r.c.f6486d, dVar, mVar}, (vc.l) null, 4, (AbstractC4854k) null), new h(q.f6468p, new f[]{bVar, cVar}, (vc.l) null, 4, (AbstractC4854k) null));
    }

    @Override // Jd.b
    public List b() {
        return f6428b;
    }

    public final boolean d(InterfaceC1196y interfaceC1196y, X x10) {
        kd.b bVarK;
        E returnType;
        InterfaceC6195g value = x10.getValue();
        AbstractC4862t.d(value, "receiver.value");
        if (!(value instanceof C6193e)) {
            return false;
        }
        InterfaceC1177e interfaceC1177eS = ((C6193e) value).s();
        if (!interfaceC1177eS.k0() || (bVarK = AbstractC5823c.k(interfaceC1177eS)) == null) {
            return false;
        }
        InterfaceC1180h interfaceC1180hB = AbstractC1195x.b(AbstractC5823c.p(interfaceC1177eS), bVarK);
        if (!(interfaceC1180hB instanceof e0)) {
            interfaceC1180hB = null;
        }
        e0 e0Var = (e0) interfaceC1180hB;
        if (e0Var == null || (returnType = interfaceC1196y.getReturnType()) == null) {
            return false;
        }
        return Hd.a.p(returnType, e0Var.F());
    }
}
