package od;

import Cd.e0;
import Dd.g;
import Lc.C;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import Lc.K;
import Lc.a0;
import Lc.f0;
import gc.C4179C;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import od.C5289k;

/* JADX INFO: renamed from: od.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5281c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5281c f41534a = new C5281c();

    /* JADX INFO: renamed from: od.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements vc.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41535a = new a();

        public a() {
            super(2);
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC1185m interfaceC1185m, InterfaceC1185m interfaceC1185m2) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: od.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements vc.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1173a f41536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1173a f41537b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1173a interfaceC1173a, InterfaceC1173a interfaceC1173a2) {
            super(2);
            this.f41536a = interfaceC1173a;
            this.f41537b = interfaceC1173a2;
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC1185m interfaceC1185m, InterfaceC1185m interfaceC1185m2) {
            return Boolean.valueOf(AbstractC4862t.a(interfaceC1185m, this.f41536a) && AbstractC4862t.a(interfaceC1185m2, this.f41537b));
        }
    }

    /* JADX INFO: renamed from: od.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0554c extends v implements vc.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0554c f41538a = new C0554c();

        public C0554c() {
            super(2);
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC1185m interfaceC1185m, InterfaceC1185m interfaceC1185m2) {
            return Boolean.FALSE;
        }
    }

    public static /* synthetic */ boolean c(C5281c c5281c, InterfaceC1173a interfaceC1173a, InterfaceC1173a interfaceC1173a2, boolean z10, boolean z11, boolean z12, Dd.g gVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            z12 = false;
        }
        return c5281c.b(interfaceC1173a, interfaceC1173a2, z10, z13, z12, gVar);
    }

    public static final boolean d(boolean z10, InterfaceC1173a a10, InterfaceC1173a b10, e0 c12, e0 c22) {
        AbstractC4862t.e(a10, "$a");
        AbstractC4862t.e(b10, "$b");
        AbstractC4862t.e(c12, "c1");
        AbstractC4862t.e(c22, "c2");
        if (AbstractC4862t.a(c12, c22)) {
            return true;
        }
        InterfaceC1180h interfaceC1180hQ = c12.q();
        InterfaceC1180h interfaceC1180hQ2 = c22.q();
        if ((interfaceC1180hQ instanceof f0) && (interfaceC1180hQ2 instanceof f0)) {
            return f41534a.i((f0) interfaceC1180hQ, (f0) interfaceC1180hQ2, z10, new b(a10, b10));
        }
        return false;
    }

    public static /* synthetic */ boolean g(C5281c c5281c, InterfaceC1185m interfaceC1185m, InterfaceC1185m interfaceC1185m2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return c5281c.f(interfaceC1185m, interfaceC1185m2, z10, z11);
    }

    public static /* synthetic */ boolean j(C5281c c5281c, f0 f0Var, f0 f0Var2, boolean z10, vc.p pVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            pVar = C0554c.f41538a;
        }
        return c5281c.i(f0Var, f0Var2, z10, pVar);
    }

    public final boolean b(InterfaceC1173a a10, InterfaceC1173a b10, boolean z10, boolean z11, boolean z12, Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (AbstractC4862t.a(a10, b10)) {
            return true;
        }
        if (!AbstractC4862t.a(a10.getName(), b10.getName())) {
            return false;
        }
        if (z11 && (a10 instanceof C) && (b10 instanceof C) && ((C) a10).k0() != ((C) b10).k0()) {
            return false;
        }
        if ((AbstractC4862t.a(a10.b(), b10.b()) && (!z10 || !AbstractC4862t.a(l(a10), l(b10)))) || AbstractC5283e.E(a10) || AbstractC5283e.E(b10) || !k(a10, b10, a.f41535a, z10)) {
            return false;
        }
        C5289k c5289kI = C5289k.i(kotlinTypeRefiner, new C5280b(z10, a10, b10));
        AbstractC4862t.d(c5289kI, "create(kotlinTypeRefiner…= a && y == b }\n        }");
        C5289k.i.a aVarC = c5289kI.E(a10, b10, null, !z12).c();
        C5289k.i.a aVar = C5289k.i.a.OVERRIDABLE;
        return aVarC == aVar && c5289kI.E(b10, a10, null, z12 ^ true).c() == aVar;
    }

    public final boolean e(InterfaceC1177e interfaceC1177e, InterfaceC1177e interfaceC1177e2) {
        return AbstractC4862t.a(interfaceC1177e.k(), interfaceC1177e2.k());
    }

    public final boolean f(InterfaceC1185m interfaceC1185m, InterfaceC1185m interfaceC1185m2, boolean z10, boolean z11) {
        return ((interfaceC1185m instanceof InterfaceC1177e) && (interfaceC1185m2 instanceof InterfaceC1177e)) ? e((InterfaceC1177e) interfaceC1185m, (InterfaceC1177e) interfaceC1185m2) : ((interfaceC1185m instanceof f0) && (interfaceC1185m2 instanceof f0)) ? j(this, (f0) interfaceC1185m, (f0) interfaceC1185m2, z10, null, 8, null) : ((interfaceC1185m instanceof InterfaceC1173a) && (interfaceC1185m2 instanceof InterfaceC1173a)) ? c(this, (InterfaceC1173a) interfaceC1185m, (InterfaceC1173a) interfaceC1185m2, z10, z11, false, g.a.f2666a, 16, null) : ((interfaceC1185m instanceof K) && (interfaceC1185m2 instanceof K)) ? AbstractC4862t.a(((K) interfaceC1185m).e(), ((K) interfaceC1185m2).e()) : AbstractC4862t.a(interfaceC1185m, interfaceC1185m2);
    }

    public final boolean h(f0 a10, f0 b10, boolean z10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        return j(this, a10, b10, z10, null, 8, null);
    }

    public final boolean i(f0 a10, f0 b10, boolean z10, vc.p equivalentCallables) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        AbstractC4862t.e(equivalentCallables, "equivalentCallables");
        if (AbstractC4862t.a(a10, b10)) {
            return true;
        }
        return !AbstractC4862t.a(a10.b(), b10.b()) && k(a10, b10, equivalentCallables, z10) && a10.getIndex() == b10.getIndex();
    }

    public final boolean k(InterfaceC1185m interfaceC1185m, InterfaceC1185m interfaceC1185m2, vc.p pVar, boolean z10) {
        InterfaceC1185m interfaceC1185mB = interfaceC1185m.b();
        InterfaceC1185m interfaceC1185mB2 = interfaceC1185m2.b();
        return ((interfaceC1185mB instanceof InterfaceC1174b) || (interfaceC1185mB2 instanceof InterfaceC1174b)) ? ((Boolean) pVar.invoke(interfaceC1185mB, interfaceC1185mB2)).booleanValue() : g(this, interfaceC1185mB, interfaceC1185mB2, z10, false, 8, null);
    }

    public final a0 l(InterfaceC1173a interfaceC1173a) {
        while (interfaceC1173a instanceof InterfaceC1174b) {
            InterfaceC1174b interfaceC1174b = (InterfaceC1174b) interfaceC1173a;
            if (interfaceC1174b.f() != InterfaceC1174b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection overriddenDescriptors = interfaceC1174b.d();
            AbstractC4862t.d(overriddenDescriptors, "overriddenDescriptors");
            interfaceC1173a = (InterfaceC1174b) C4179C.G0(overriddenDescriptors);
            if (interfaceC1173a == null) {
                return null;
            }
        }
        return interfaceC1173a.j();
    }
}
