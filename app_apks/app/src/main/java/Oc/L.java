package Oc;

import Cd.n0;
import Lc.AbstractC1191t;
import Lc.AbstractC1192u;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1187o;
import Lc.a0;
import Lc.j0;
import fc.C4029l;
import fc.InterfaceC4028k;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class L extends M implements j0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f12216l = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f12218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f12220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Cd.E f12221j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j0 f12222k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final L a(InterfaceC1173a containingDeclaration, j0 j0Var, int i10, Mc.g annotations, kd.f name, Cd.E outType, boolean z10, boolean z11, boolean z12, Cd.E e10, a0 source, InterfaceC6082a interfaceC6082a) {
            AbstractC4862t.e(containingDeclaration, "containingDeclaration");
            AbstractC4862t.e(annotations, "annotations");
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(outType, "outType");
            AbstractC4862t.e(source, "source");
            return interfaceC6082a == null ? new L(containingDeclaration, j0Var, i10, annotations, name, outType, z10, z11, z12, e10, source) : new b(containingDeclaration, j0Var, i10, annotations, name, outType, z10, z11, z12, e10, source, interfaceC6082a);
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends L {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final InterfaceC4028k f12223m;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {
            public a() {
                super(0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return b.this.N0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1173a containingDeclaration, j0 j0Var, int i10, Mc.g annotations, kd.f name, Cd.E outType, boolean z10, boolean z11, boolean z12, Cd.E e10, a0 source, InterfaceC6082a destructuringVariables) {
            super(containingDeclaration, j0Var, i10, annotations, name, outType, z10, z11, z12, e10, source);
            AbstractC4862t.e(containingDeclaration, "containingDeclaration");
            AbstractC4862t.e(annotations, "annotations");
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(outType, "outType");
            AbstractC4862t.e(source, "source");
            AbstractC4862t.e(destructuringVariables, "destructuringVariables");
            this.f12223m = C4029l.b(destructuringVariables);
        }

        public final List N0() {
            return (List) this.f12223m.getValue();
        }

        @Override // Oc.L, Lc.j0
        public j0 Q(InterfaceC1173a newOwner, kd.f newName, int i10) {
            AbstractC4862t.e(newOwner, "newOwner");
            AbstractC4862t.e(newName, "newName");
            Mc.g annotations = getAnnotations();
            AbstractC4862t.d(annotations, "annotations");
            Cd.E type = getType();
            AbstractC4862t.d(type, "type");
            boolean zX0 = x0();
            boolean zP0 = p0();
            boolean zO0 = o0();
            Cd.E eS0 = s0();
            a0 NO_SOURCE = a0.f8746a;
            AbstractC4862t.d(NO_SOURCE, "NO_SOURCE");
            return new b(newOwner, null, i10, annotations, newName, type, zX0, zP0, zO0, eS0, NO_SOURCE, new a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(InterfaceC1173a containingDeclaration, j0 j0Var, int i10, Mc.g annotations, kd.f name, Cd.E outType, boolean z10, boolean z11, boolean z12, Cd.E e10, a0 source) {
        super(containingDeclaration, annotations, name, outType, source);
        AbstractC4862t.e(containingDeclaration, "containingDeclaration");
        AbstractC4862t.e(annotations, "annotations");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(outType, "outType");
        AbstractC4862t.e(source, "source");
        this.f12217f = i10;
        this.f12218g = z10;
        this.f12219h = z11;
        this.f12220i = z12;
        this.f12221j = e10;
        this.f12222k = j0Var == null ? this : j0Var;
    }

    public static final L K0(InterfaceC1173a interfaceC1173a, j0 j0Var, int i10, Mc.g gVar, kd.f fVar, Cd.E e10, boolean z10, boolean z11, boolean z12, Cd.E e11, a0 a0Var, InterfaceC6082a interfaceC6082a) {
        return f12216l.a(interfaceC1173a, j0Var, i10, gVar, fVar, e10, z10, z11, z12, e11, a0Var, interfaceC6082a);
    }

    @Override // Lc.k0
    public boolean L() {
        return false;
    }

    public Void L0() {
        return null;
    }

    @Override // Lc.c0
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public j0 c(n0 substitutor) {
        AbstractC4862t.e(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // Lc.j0
    public j0 Q(InterfaceC1173a newOwner, kd.f newName, int i10) {
        AbstractC4862t.e(newOwner, "newOwner");
        AbstractC4862t.e(newName, "newName");
        Mc.g annotations = getAnnotations();
        AbstractC4862t.d(annotations, "annotations");
        Cd.E type = getType();
        AbstractC4862t.d(type, "type");
        boolean zX0 = x0();
        boolean zP0 = p0();
        boolean zO0 = o0();
        Cd.E eS0 = s0();
        a0 NO_SOURCE = a0.f8746a;
        AbstractC4862t.d(NO_SOURCE, "NO_SOURCE");
        return new L(newOwner, null, i10, annotations, newName, type, zX0, zP0, zO0, eS0, NO_SOURCE);
    }

    @Override // Lc.InterfaceC1173a
    public Collection d() {
        Collection collectionD = b().d();
        AbstractC4862t.d(collectionD, "containingDeclaration.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C4207u.v(collectionD, 10));
        Iterator it = collectionD.iterator();
        while (it.hasNext()) {
            arrayList.add((j0) ((InterfaceC1173a) it.next()).i().get(getIndex()));
        }
        return arrayList;
    }

    @Override // Lc.j0
    public int getIndex() {
        return this.f12217f;
    }

    @Override // Lc.InterfaceC1189q, Lc.C
    public AbstractC1192u getVisibility() {
        AbstractC1192u LOCAL = AbstractC1191t.f8776f;
        AbstractC4862t.d(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // Lc.InterfaceC1185m
    public Object j0(InterfaceC1187o visitor, Object obj) {
        AbstractC4862t.e(visitor, "visitor");
        return visitor.l(this, obj);
    }

    @Override // Lc.k0
    public /* bridge */ /* synthetic */ qd.g n0() {
        return (qd.g) L0();
    }

    @Override // Lc.j0
    public boolean o0() {
        return this.f12220i;
    }

    @Override // Lc.j0
    public boolean p0() {
        return this.f12219h;
    }

    @Override // Lc.j0
    public Cd.E s0() {
        return this.f12221j;
    }

    @Override // Lc.j0
    public boolean x0() {
        if (!this.f12218g) {
            return false;
        }
        InterfaceC1173a interfaceC1173aB = b();
        AbstractC4862t.c(interfaceC1173aB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
        return ((InterfaceC1174b) interfaceC1173aB).f().a();
    }

    @Override // Oc.AbstractC1817k, Lc.InterfaceC1185m
    public InterfaceC1173a b() {
        InterfaceC1185m interfaceC1185mB = super.b();
        AbstractC4862t.c(interfaceC1185mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC1173a) interfaceC1185mB;
    }

    @Override // Oc.AbstractC1817k, Oc.AbstractC1816j, Lc.InterfaceC1185m
    public j0 a() {
        j0 j0Var = this.f12222k;
        return j0Var == this ? this : j0Var.a();
    }
}
