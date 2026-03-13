package dd;

import Cd.C0731n;
import Lc.G;
import Lc.J;
import Lc.d0;
import Tc.c;
import Uc.C2302d;
import Uc.q;
import Uc.x;
import Vc.f;
import Xc.c;
import ad.InterfaceC2686b;
import cd.C3100d;
import cd.C3110l;
import gc.C4205s;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import ud.C6020b;
import yd.InterfaceC6477j;
import yd.InterfaceC6479l;

/* JADX INFO: renamed from: dd.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3902g {

    /* JADX INFO: renamed from: dd.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Uc.u {
        @Override // Uc.u
        public List a(kd.b classId) {
            AbstractC4862t.e(classId, "classId");
            return null;
        }
    }

    public static final C3901f a(G module, Bd.n storageManager, J notFoundClasses, Xc.f lazyJavaPackageFragmentProvider, InterfaceC3911p reflectKotlinClassFinder, C3903h deserializedDescriptorResolver, yd.r errorReporter) {
        AbstractC4862t.e(module, "module");
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(notFoundClasses, "notFoundClasses");
        AbstractC4862t.e(lazyJavaPackageFragmentProvider, "lazyJavaPackageFragmentProvider");
        AbstractC4862t.e(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        AbstractC4862t.e(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        AbstractC4862t.e(errorReporter, "errorReporter");
        return new C3901f(storageManager, module, InterfaceC6479l.a.f48589a, new C3904i(reflectKotlinClassFinder, deserializedDescriptorResolver), new C3899d(module, notFoundClasses, storageManager, reflectKotlinClassFinder), lazyJavaPackageFragmentProvider, notFoundClasses, errorReporter, c.a.f16354a, InterfaceC6477j.f48565a.a(), Dd.l.f2684b.a(), new Fd.a(C4205s.d(C0731n.f1384a)));
    }

    public static final Xc.f b(Uc.p javaClassFinder, G module, Bd.n storageManager, J notFoundClasses, InterfaceC3911p reflectKotlinClassFinder, C3903h deserializedDescriptorResolver, yd.r errorReporter, InterfaceC2686b javaSourceElementFactory, Xc.i singleModuleClassResolver, x packagePartProvider) {
        AbstractC4862t.e(javaClassFinder, "javaClassFinder");
        AbstractC4862t.e(module, "module");
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(notFoundClasses, "notFoundClasses");
        AbstractC4862t.e(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        AbstractC4862t.e(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        AbstractC4862t.e(errorReporter, "errorReporter");
        AbstractC4862t.e(javaSourceElementFactory, "javaSourceElementFactory");
        AbstractC4862t.e(singleModuleClassResolver, "singleModuleClassResolver");
        AbstractC4862t.e(packagePartProvider, "packagePartProvider");
        Vc.j DO_NOTHING = Vc.j.f17501a;
        AbstractC4862t.d(DO_NOTHING, "DO_NOTHING");
        Vc.g EMPTY = Vc.g.f17494a;
        AbstractC4862t.d(EMPTY, "EMPTY");
        f.a aVar = f.a.f17493a;
        C6020b c6020b = new C6020b(storageManager, C4206t.k());
        d0.a aVar2 = d0.a.f8751a;
        c.a aVar3 = c.a.f16354a;
        Ic.i iVar = new Ic.i(module, notFoundClasses);
        x.b bVar = Uc.x.f16956d;
        C2302d c2302d = new C2302d(bVar.a());
        c.a aVar4 = c.a.f19483a;
        return new Xc.f(new Xc.b(storageManager, javaClassFinder, reflectKotlinClassFinder, deserializedDescriptorResolver, DO_NOTHING, errorReporter, EMPTY, aVar, c6020b, javaSourceElementFactory, singleModuleClassResolver, packagePartProvider, aVar2, aVar3, module, iVar, c2302d, new C3110l(new C3100d(aVar4)), q.a.f16935a, aVar4, Dd.l.f2684b.a(), bVar.a(), new a(), null, 8388608, null));
    }
}
