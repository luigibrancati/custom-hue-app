package yd;

import Lc.G;
import Lc.a0;
import gc.C4207u;
import hd.AbstractC4297a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q extends p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC4297a f48603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Ad.f f48604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final hd.d f48605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y f48606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public fd.m f48607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InterfaceC6099h f48608m;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements vc.l {
        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a0 invoke(kd.b it) {
            AbstractC4862t.e(it, "it");
            Ad.f fVar = q.this.f48604i;
            if (fVar != null) {
                return fVar;
            }
            a0 NO_SOURCE = a0.f8746a;
            AbstractC4862t.d(NO_SOURCE, "NO_SOURCE");
            return NO_SOURCE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public b() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke() {
            Collection collectionB = q.this.G0().b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionB) {
                kd.b bVar = (kd.b) obj;
                if (!bVar.l() && !C6476i.f48558c.a().contains(bVar)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C4207u.v(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((kd.b) it.next()).j());
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kd.c fqName, Bd.n storageManager, G module, fd.m proto, AbstractC4297a metadataVersion, Ad.f fVar) {
        super(fqName, storageManager, module);
        AbstractC4862t.e(fqName, "fqName");
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(module, "module");
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(metadataVersion, "metadataVersion");
        this.f48603h = metadataVersion;
        this.f48604i = fVar;
        fd.p pVarJ = proto.J();
        AbstractC4862t.d(pVarJ, "proto.strings");
        fd.o oVarI = proto.I();
        AbstractC4862t.d(oVarI, "proto.qualifiedNames");
        hd.d dVar = new hd.d(pVarJ, oVarI);
        this.f48605j = dVar;
        this.f48606k = new y(proto, dVar, metadataVersion, new a());
        this.f48607l = proto;
    }

    @Override // yd.p
    public void L0(C6478k components) {
        AbstractC4862t.e(components, "components");
        fd.m mVar = this.f48607l;
        if (mVar == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f48607l = null;
        fd.l lVarG = mVar.G();
        AbstractC4862t.d(lVarG, "proto.`package`");
        this.f48608m = new Ad.i(this, lVarG, this.f48605j, this.f48603h, this.f48604i, components, "scope of " + this, new b());
    }

    @Override // yd.p
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public y G0() {
        return this.f48606k;
    }

    @Override // Lc.K
    public InterfaceC6099h o() {
        InterfaceC6099h interfaceC6099h = this.f48608m;
        if (interfaceC6099h != null) {
            return interfaceC6099h;
        }
        AbstractC4862t.p("_memberScope");
        return null;
    }
}
