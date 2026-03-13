package Vc;

import Bd.m;
import Cc.l;
import Lc.a0;
import bd.InterfaceC2909a;
import bd.InterfaceC2910b;
import gc.C4179C;
import gc.Q;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Mc.c, Wc.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ l[] f17473f = {M.g(new E(M.b(b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kd.c f17474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f17475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bd.i f17476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2910b f17477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17478e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Xc.g f17479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f17480b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Xc.g gVar, b bVar) {
            super(0);
            this.f17479a = gVar;
            this.f17480b = bVar;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Cd.M invoke() {
            Cd.M mP = this.f17479a.d().n().o(this.f17480b.e()).p();
            AbstractC4862t.d(mP, "c.module.builtIns.getBui…qName(fqName).defaultType");
            return mP;
        }
    }

    public b(Xc.g c10, InterfaceC2909a interfaceC2909a, kd.c fqName) {
        a0 NO_SOURCE;
        Collection collectionB;
        AbstractC4862t.e(c10, "c");
        AbstractC4862t.e(fqName, "fqName");
        this.f17474a = fqName;
        if (interfaceC2909a == null || (NO_SOURCE = c10.a().t().a(interfaceC2909a)) == null) {
            NO_SOURCE = a0.f8746a;
            AbstractC4862t.d(NO_SOURCE, "NO_SOURCE");
        }
        this.f17475b = NO_SOURCE;
        this.f17476c = c10.e().f(new a(c10, this));
        this.f17477d = (interfaceC2909a == null || (collectionB = interfaceC2909a.b()) == null) ? null : (InterfaceC2910b) C4179C.i0(collectionB);
        boolean z10 = false;
        if (interfaceC2909a != null && interfaceC2909a.d()) {
            z10 = true;
        }
        this.f17478e = z10;
    }

    @Override // Mc.c
    public Map a() {
        return Q.i();
    }

    public final InterfaceC2910b b() {
        return this.f17477d;
    }

    @Override // Mc.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Cd.M getType() {
        return (Cd.M) m.a(this.f17476c, this, f17473f[0]);
    }

    @Override // Wc.g
    public boolean d() {
        return this.f17478e;
    }

    @Override // Mc.c
    public kd.c e() {
        return this.f17474a;
    }

    @Override // Mc.c
    public a0 j() {
        return this.f17475b;
    }
}
