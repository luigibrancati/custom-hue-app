package yd;

import Ic.j;
import Lc.InterfaceC1177e;
import Lc.K;
import Lc.L;
import Lc.N;
import Lc.a0;
import gc.T;
import hd.AbstractC4297a;
import hd.h;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: yd.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6476i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f48558c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f48559d = T.c(kd.b.m(j.a.f5787d.l()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6478k f48560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc.l f48561b;

    /* JADX INFO: renamed from: yd.i$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kd.b f48562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C6474g f48563b;

        public a(kd.b classId, C6474g c6474g) {
            AbstractC4862t.e(classId, "classId");
            this.f48562a = classId;
            this.f48563b = c6474g;
        }

        public final C6474g a() {
            return this.f48563b;
        }

        public final kd.b b() {
            return this.f48562a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC4862t.a(this.f48562a, ((a) obj).f48562a);
        }

        public int hashCode() {
            return this.f48562a.hashCode();
        }
    }

    /* JADX INFO: renamed from: yd.i$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Set a() {
            return C6476i.f48559d;
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: yd.i$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements vc.l {
        public c() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1177e invoke(a key) {
            AbstractC4862t.e(key, "key");
            return C6476i.this.c(key);
        }
    }

    public C6476i(C6478k components) {
        AbstractC4862t.e(components, "components");
        this.f48560a = components;
        this.f48561b = components.u().b(new c());
    }

    public static /* synthetic */ InterfaceC1177e e(C6476i c6476i, kd.b bVar, C6474g c6474g, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c6474g = null;
        }
        return c6476i.d(bVar, c6474g);
    }

    public final InterfaceC1177e c(a aVar) {
        Object next;
        m mVarA;
        kd.b bVarB = aVar.b();
        Iterator it = this.f48560a.k().iterator();
        while (it.hasNext()) {
            InterfaceC1177e interfaceC1177eC = ((Nc.b) it.next()).c(bVarB);
            if (interfaceC1177eC != null) {
                return interfaceC1177eC;
            }
        }
        if (f48559d.contains(bVarB)) {
            return null;
        }
        C6474g c6474gA = aVar.a();
        if (c6474gA == null && (c6474gA = this.f48560a.e().a(bVarB)) == null) {
            return null;
        }
        hd.c cVarA = c6474gA.a();
        fd.c cVarB = c6474gA.b();
        AbstractC4297a abstractC4297aC = c6474gA.c();
        a0 a0VarD = c6474gA.d();
        kd.b bVarG = bVarB.g();
        if (bVarG != null) {
            InterfaceC1177e interfaceC1177eE = e(this, bVarG, null, 2, null);
            Ad.d dVar = interfaceC1177eE instanceof Ad.d ? (Ad.d) interfaceC1177eE : null;
            if (dVar == null) {
                return null;
            }
            kd.f fVarJ = bVarB.j();
            AbstractC4862t.d(fVarJ, "classId.shortClassName");
            if (!dVar.g1(fVarJ)) {
                return null;
            }
            mVarA = dVar.a1();
        } else {
            L lR = this.f48560a.r();
            kd.c cVarH = bVarB.h();
            AbstractC4862t.d(cVarH, "classId.packageFqName");
            Iterator it2 = N.c(lR, cVarH).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                K k10 = (K) next;
                if (!(k10 instanceof p)) {
                    break;
                }
                kd.f fVarJ2 = bVarB.j();
                AbstractC4862t.d(fVarJ2, "classId.shortClassName");
                if (((p) k10).K0(fVarJ2)) {
                    break;
                }
            }
            K k11 = (K) next;
            if (k11 == null) {
                return null;
            }
            C6478k c6478k = this.f48560a;
            fd.t tVarD1 = cVarB.d1();
            AbstractC4862t.d(tVarD1, "classProto.typeTable");
            hd.g gVar = new hd.g(tVarD1);
            h.a aVar2 = hd.h.f36571b;
            fd.w wVarF1 = cVarB.f1();
            AbstractC4862t.d(wVarF1, "classProto.versionRequirementTable");
            mVarA = c6478k.a(k11, cVarA, gVar, aVar2.a(wVarF1), abstractC4297aC, null);
            abstractC4297aC = abstractC4297aC;
        }
        return new Ad.d(mVarA, cVarB, cVarA, abstractC4297aC, a0VarD);
    }

    public final InterfaceC1177e d(kd.b classId, C6474g c6474g) {
        AbstractC4862t.e(classId, "classId");
        return (InterfaceC1177e) this.f48561b.invoke(new a(classId, c6474g));
    }
}
