package Oc;

import Lc.G;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1187o;
import Lc.P;
import Oc.A;
import fc.C4029l;
import fc.InterfaceC4028k;
import gc.C4179C;
import gc.C4204q;
import gc.C4206t;
import gc.C4207u;
import gc.Q;
import gc.U;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import ld.AbstractC4995a;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends AbstractC1816j implements Lc.G {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bd.n f12366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ic.g f12367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kd.f f12368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f12369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final A f12370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v f12371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Lc.L f12372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12373j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bd.g f12374k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC4028k f12375l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1815i invoke() {
            v vVar = x.this.f12371h;
            x xVar = x.this;
            if (vVar == null) {
                throw new AssertionError("Dependencies of module " + xVar.P0() + " were not set before querying module content");
            }
            List listA = vVar.a();
            x.this.O0();
            listA.contains(x.this);
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                ((x) it.next()).T0();
            }
            ArrayList arrayList = new ArrayList(C4207u.v(listA, 10));
            Iterator it2 = listA.iterator();
            while (it2.hasNext()) {
                Lc.L l10 = ((x) it2.next()).f12372i;
                AbstractC4862t.b(l10);
                arrayList.add(l10);
            }
            return new C1815i(arrayList, "CompositeProvider@ModuleDescriptor for " + x.this.getName());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements vc.l {
        public b() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P invoke(kd.c fqName) {
            AbstractC4862t.e(fqName, "fqName");
            A a10 = x.this.f12370g;
            x xVar = x.this;
            return a10.a(xVar, fqName, xVar.f12366c);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(kd.f moduleName, Bd.n storageManager, Ic.g builtIns, AbstractC4995a abstractC4995a) {
        this(moduleName, storageManager, builtIns, abstractC4995a, null, null, 48, null);
        AbstractC4862t.e(moduleName, "moduleName");
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(builtIns, "builtIns");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean T0() {
        return this.f12372i != null;
    }

    public void O0() {
        if (U0()) {
            return;
        }
        Lc.B.a(this);
    }

    public final String P0() {
        String string = getName().toString();
        AbstractC4862t.d(string, "name.toString()");
        return string;
    }

    public final Lc.L Q0() {
        O0();
        return R0();
    }

    public final C1815i R0() {
        return (C1815i) this.f12375l.getValue();
    }

    public final void S0(Lc.L providerForModuleContent) {
        AbstractC4862t.e(providerForModuleContent, "providerForModuleContent");
        T0();
        this.f12372i = providerForModuleContent;
    }

    public boolean U0() {
        return this.f12373j;
    }

    public final void V0(v dependencies) {
        AbstractC4862t.e(dependencies, "dependencies");
        this.f12371h = dependencies;
    }

    public final void W0(List descriptors) {
        AbstractC4862t.e(descriptors, "descriptors");
        X0(descriptors, U.d());
    }

    public final void X0(List descriptors, Set friends) {
        AbstractC4862t.e(descriptors, "descriptors");
        AbstractC4862t.e(friends, "friends");
        V0(new w(descriptors, friends, C4206t.k(), U.d()));
    }

    @Override // Lc.G
    public Object Y(Lc.F capability) {
        AbstractC4862t.e(capability, "capability");
        Object obj = this.f12369f.get(capability);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final void Y0(x... descriptors) {
        AbstractC4862t.e(descriptors, "descriptors");
        W0(C4204q.O0(descriptors));
    }

    @Override // Lc.InterfaceC1185m
    public InterfaceC1185m b() {
        return G.a.b(this);
    }

    @Override // Lc.InterfaceC1185m
    public Object j0(InterfaceC1187o interfaceC1187o, Object obj) {
        return G.a.a(this, interfaceC1187o, obj);
    }

    @Override // Lc.G
    public Ic.g n() {
        return this.f12367d;
    }

    @Override // Lc.G
    public Collection t(kd.c fqName, vc.l nameFilter) {
        AbstractC4862t.e(fqName, "fqName");
        AbstractC4862t.e(nameFilter, "nameFilter");
        O0();
        return Q0().t(fqName, nameFilter);
    }

    @Override // Lc.G
    public List w0() {
        v vVar = this.f12371h;
        if (vVar != null) {
            return vVar.b();
        }
        throw new AssertionError("Dependencies of module " + P0() + " were not set");
    }

    @Override // Lc.G
    public boolean y(Lc.G targetModule) {
        AbstractC4862t.e(targetModule, "targetModule");
        if (AbstractC4862t.a(this, targetModule)) {
            return true;
        }
        v vVar = this.f12371h;
        AbstractC4862t.b(vVar);
        return C4179C.Y(vVar.c(), targetModule) || w0().contains(targetModule) || targetModule.w0().contains(this);
    }

    @Override // Lc.G
    public P z0(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        O0();
        return (P) this.f12374k.invoke(fqName);
    }

    public /* synthetic */ x(kd.f fVar, Bd.n nVar, Ic.g gVar, AbstractC4995a abstractC4995a, Map map, kd.f fVar2, int i10, AbstractC4854k abstractC4854k) {
        this(fVar, nVar, gVar, (i10 & 8) != 0 ? null : abstractC4995a, (i10 & 16) != 0 ? Q.i() : map, (i10 & 32) != 0 ? null : fVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kd.f moduleName, Bd.n storageManager, Ic.g builtIns, AbstractC4995a abstractC4995a, Map capabilities, kd.f fVar) {
        super(Mc.g.f9435K.b(), moduleName);
        AbstractC4862t.e(moduleName, "moduleName");
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(builtIns, "builtIns");
        AbstractC4862t.e(capabilities, "capabilities");
        this.f12366c = storageManager;
        this.f12367d = builtIns;
        this.f12368e = fVar;
        if (moduleName.u()) {
            this.f12369f = capabilities;
            A a10 = (A) Y(A.f12152a.a());
            this.f12370g = a10 == null ? A.b.f12155b : a10;
            this.f12373j = true;
            this.f12374k = storageManager.g(new b());
            this.f12375l = C4029l.b(new a());
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + moduleName);
    }
}
