package cd;

import Cd.E;
import Cd.L;
import Cd.q0;
import Cd.t0;
import Lc.AbstractC1190s;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1180h;
import Lc.X;
import Lc.f0;
import Lc.j0;
import Uc.EnumC2300b;
import bd.InterfaceC2909a;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import sd.AbstractC5823c;

/* JADX INFO: renamed from: cd.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3110l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3100d f26557a;

    /* JADX INFO: renamed from: cd.l$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26558a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(t0 t0Var) {
            InterfaceC1180h interfaceC1180hQ = t0Var.N0().q();
            if (interfaceC1180hQ == null) {
                return Boolean.FALSE;
            }
            kd.f name = interfaceC1180hQ.getName();
            Kc.c cVar = Kc.c.f7792a;
            return Boolean.valueOf(AbstractC4862t.a(name, cVar.h().g()) && AbstractC4862t.a(AbstractC5823c.h(interfaceC1180hQ), cVar.h()));
        }
    }

    /* JADX INFO: renamed from: cd.l$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26559a = new b();

        public b() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(InterfaceC1174b it) {
            AbstractC4862t.e(it, "it");
            X xM = it.M();
            AbstractC4862t.b(xM);
            E type = xM.getType();
            AbstractC4862t.d(type, "it.extensionReceiverParameter!!.type");
            return type;
        }
    }

    /* JADX INFO: renamed from: cd.l$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f26560a = new c();

        public c() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(InterfaceC1174b it) {
            AbstractC4862t.e(it, "it");
            E returnType = it.getReturnType();
            AbstractC4862t.b(returnType);
            return returnType;
        }
    }

    /* JADX INFO: renamed from: cd.l$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j0 f26561a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(j0 j0Var) {
            super(1);
            this.f26561a = j0Var;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(InterfaceC1174b it) {
            AbstractC4862t.e(it, "it");
            E type = ((j0) it.i().get(this.f26561a.getIndex())).getType();
            AbstractC4862t.d(type, "it.valueParameters[p.index].type");
            return type;
        }
    }

    /* JADX INFO: renamed from: cd.l$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f26562a = new e();

        public e() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(t0 it) {
            AbstractC4862t.e(it, "it");
            return Boolean.valueOf(it instanceof L);
        }
    }

    public C3110l(C3100d typeEnhancement) {
        AbstractC4862t.e(typeEnhancement, "typeEnhancement");
        this.f26557a = typeEnhancement;
    }

    public static /* synthetic */ E d(C3110l c3110l, InterfaceC1174b interfaceC1174b, Mc.a aVar, boolean z10, Xc.g gVar, EnumC2300b enumC2300b, C3115q c3115q, boolean z11, vc.l lVar, int i10, Object obj) {
        return c3110l.b(interfaceC1174b, aVar, z10, gVar, enumC2300b, c3115q, (i10 & 32) != 0 ? false : z11, lVar);
    }

    public static /* synthetic */ E e(C3110l c3110l, C3112n c3112n, E e10, List list, C3115q c3115q, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            c3115q = null;
        }
        C3115q c3115q2 = c3115q;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return c3110l.c(c3112n, e10, list, c3115q2, z10);
    }

    public final boolean a(E e10) {
        return q0.c(e10, a.f26558a);
    }

    public final E b(InterfaceC1174b interfaceC1174b, Mc.a aVar, boolean z10, Xc.g gVar, EnumC2300b enumC2300b, C3115q c3115q, boolean z11, vc.l lVar) {
        C3112n c3112n = new C3112n(aVar, z10, gVar, enumC2300b, false, 16, null);
        E e10 = (E) lVar.invoke(interfaceC1174b);
        Collection<InterfaceC1174b> overriddenDescriptors = interfaceC1174b.d();
        AbstractC4862t.d(overriddenDescriptors, "overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C4207u.v(overriddenDescriptors, 10));
        for (InterfaceC1174b it : overriddenDescriptors) {
            AbstractC4862t.d(it, "it");
            arrayList.add((E) lVar.invoke(it));
        }
        return c(c3112n, e10, arrayList, c3115q, z11);
    }

    public final E c(C3112n c3112n, E e10, List list, C3115q c3115q, boolean z10) {
        return this.f26557a.a(e10, c3112n.b(e10, list, c3115q, z10), c3112n.u());
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01ed, code lost:
    
        if (r0 == null) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Lc.InterfaceC1174b f(Lc.InterfaceC1174b r18, Xc.g r19) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.C3110l.f(Lc.b, Xc.g):Lc.b");
    }

    public final Collection g(Xc.g c10, Collection platformSignatures) {
        AbstractC4862t.e(c10, "c");
        AbstractC4862t.e(platformSignatures, "platformSignatures");
        ArrayList arrayList = new ArrayList(C4207u.v(platformSignatures, 10));
        Iterator it = platformSignatures.iterator();
        while (it.hasNext()) {
            arrayList.add(f((InterfaceC1174b) it.next(), c10));
        }
        return arrayList;
    }

    public final E h(E type, Xc.g context) {
        AbstractC4862t.e(type, "type");
        AbstractC4862t.e(context, "context");
        E e10 = e(this, new C3112n(null, false, context, EnumC2300b.TYPE_USE, true), type, C4206t.k(), null, false, 12, null);
        return e10 == null ? type : e10;
    }

    public final List i(f0 typeParameter, List bounds, Xc.g context) {
        AbstractC4862t.e(typeParameter, "typeParameter");
        AbstractC4862t.e(bounds, "bounds");
        AbstractC4862t.e(context, "context");
        ArrayList arrayList = new ArrayList(C4207u.v(bounds, 10));
        Iterator it = bounds.iterator();
        while (it.hasNext()) {
            E e10 = (E) it.next();
            if (!Hd.a.b(e10, e.f26562a)) {
                e10 = e(this, new C3112n(typeParameter, false, context, EnumC2300b.TYPE_PARAMETER_BOUNDS, false, 16, null), e10, C4206t.k(), null, false, 12, null);
                if (e10 == null) {
                    e10 = e10;
                }
            }
            arrayList.add(e10);
        }
        return arrayList;
    }

    public final E j(InterfaceC1174b interfaceC1174b, j0 j0Var, Xc.g gVar, C3115q c3115q, boolean z10, vc.l lVar) {
        Xc.g gVarH;
        return b(interfaceC1174b, j0Var, false, (j0Var == null || (gVarH = Xc.a.h(gVar, j0Var.getAnnotations())) == null) ? gVar : gVarH, EnumC2300b.VALUE_PARAMETER, c3115q, z10, lVar);
    }

    public final Mc.g k(InterfaceC1174b interfaceC1174b, Xc.g gVar) {
        InterfaceC1180h interfaceC1180hA = AbstractC1190s.a(interfaceC1174b);
        if (interfaceC1180hA == null) {
            return interfaceC1174b.getAnnotations();
        }
        Yc.f fVar = interfaceC1180hA instanceof Yc.f ? (Yc.f) interfaceC1180hA : null;
        List listQ0 = fVar != null ? fVar.Q0() : null;
        if (listQ0 == null || listQ0.isEmpty()) {
            return interfaceC1174b.getAnnotations();
        }
        ArrayList arrayList = new ArrayList(C4207u.v(listQ0, 10));
        Iterator it = listQ0.iterator();
        while (it.hasNext()) {
            arrayList.add(new Yc.e(gVar, (InterfaceC2909a) it.next(), true));
        }
        return Mc.g.f9435K.a(C4179C.A0(interfaceC1174b.getAnnotations(), arrayList));
    }
}
