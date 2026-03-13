package zd;

import Bd.n;
import Cc.g;
import Ic.j;
import Lc.G;
import Lc.J;
import Lc.L;
import Tc.c;
import com.google.ar.core.ImageMetadata;
import gc.C4206t;
import gc.C4207u;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4859p;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import ud.C6020b;
import vc.l;
import yd.C6471d;
import yd.C6478k;
import yd.InterfaceC6477j;
import yd.InterfaceC6479l;
import yd.o;
import yd.r;
import yd.s;
import yd.v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f48895b = new d();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a extends AbstractC4859p implements l {
        public a(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f, Cc.c
        public final String getName() {
            return "loadResource";
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final g getOwner() {
            return M.b(d.class);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }

        @Override // vc.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final InputStream invoke(String p02) {
            AbstractC4862t.e(p02, "p0");
            return ((d) this.receiver).a(p02);
        }
    }

    @Override // Ic.a
    public L a(n storageManager, G builtInsModule, Iterable classDescriptorFactories, Nc.c platformDependentDeclarationFilter, Nc.a additionalClassPartsProvider, boolean z10) {
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(builtInsModule, "builtInsModule");
        AbstractC4862t.e(classDescriptorFactories, "classDescriptorFactories");
        AbstractC4862t.e(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC4862t.e(additionalClassPartsProvider, "additionalClassPartsProvider");
        return b(storageManager, builtInsModule, j.f5718A, classDescriptorFactories, platformDependentDeclarationFilter, additionalClassPartsProvider, z10, new a(this.f48895b));
    }

    public final L b(n nVar, G g10, Set packageFqNames, Iterable classDescriptorFactories, Nc.c platformDependentDeclarationFilter, Nc.a additionalClassPartsProvider, boolean z10, l loadResource) {
        n storageManager = nVar;
        G module = g10;
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(module, "module");
        AbstractC4862t.e(packageFqNames, "packageFqNames");
        AbstractC4862t.e(classDescriptorFactories, "classDescriptorFactories");
        AbstractC4862t.e(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC4862t.e(additionalClassPartsProvider, "additionalClassPartsProvider");
        AbstractC4862t.e(loadResource, "loadResource");
        ArrayList arrayList = new ArrayList(C4207u.v(packageFqNames, 10));
        Iterator it = packageFqNames.iterator();
        while (it.hasNext()) {
            kd.c cVar = (kd.c) it.next();
            String strN = C6561a.f48894n.n(cVar);
            InputStream inputStream = (InputStream) loadResource.invoke(strN);
            if (inputStream == null) {
                throw new IllegalStateException("Resource not found in classpath: " + strN);
            }
            G g11 = module;
            storageManager = nVar;
            module = g11;
            arrayList.add(c.f48896o.a(cVar, nVar, g11, inputStream, z10));
        }
        Lc.M m10 = new Lc.M(arrayList);
        J j10 = new J(storageManager, module);
        InterfaceC6479l.a aVar = InterfaceC6479l.a.f48589a;
        o oVar = new o(m10);
        C6561a c6561a = C6561a.f48894n;
        C6471d c6471d = new C6471d(module, j10, c6561a);
        v.a aVar2 = v.a.f48617a;
        r DO_NOTHING = r.f48611a;
        AbstractC4862t.d(DO_NOTHING, "DO_NOTHING");
        C6478k c6478k = new C6478k(storageManager, g10, aVar, oVar, c6471d, m10, aVar2, DO_NOTHING, c.a.f16354a, s.a.f48612a, classDescriptorFactories, j10, InterfaceC6477j.f48565a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, c6561a.e(), null, new C6020b(storageManager, C4206t.k()), null, null, ImageMetadata.SCALER_CROP_REGION, null);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).L0(c6478k);
        }
        return m10;
    }
}
