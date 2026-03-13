package Kc;

import Bd.n;
import Lc.G;
import Lc.J;
import Tc.c;
import dd.InterfaceC3911p;
import gc.C4206t;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import ud.InterfaceC6019a;
import yd.AbstractC6468a;
import yd.C6471d;
import yd.C6478k;
import yd.InterfaceC6477j;
import yd.InterfaceC6479l;
import yd.o;
import yd.p;
import yd.r;
import yd.s;
import yd.v;
import zd.C6561a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends AbstractC6468a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f7857f = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n storageManager, InterfaceC3911p finder, G moduleDescriptor, J notFoundClasses, Nc.a additionalClassPartsProvider, Nc.c platformDependentDeclarationFilter, InterfaceC6479l deserializationConfiguration, Dd.l kotlinTypeChecker, InterfaceC6019a samConversionResolver) {
        super(storageManager, finder, moduleDescriptor);
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(finder, "finder");
        AbstractC4862t.e(moduleDescriptor, "moduleDescriptor");
        AbstractC4862t.e(notFoundClasses, "notFoundClasses");
        AbstractC4862t.e(additionalClassPartsProvider, "additionalClassPartsProvider");
        AbstractC4862t.e(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC4862t.e(deserializationConfiguration, "deserializationConfiguration");
        AbstractC4862t.e(kotlinTypeChecker, "kotlinTypeChecker");
        AbstractC4862t.e(samConversionResolver, "samConversionResolver");
        o oVar = new o(this);
        C6561a c6561a = C6561a.f48894n;
        C6471d c6471d = new C6471d(moduleDescriptor, notFoundClasses, c6561a);
        v.a aVar = v.a.f48617a;
        r DO_NOTHING = r.f48611a;
        AbstractC4862t.d(DO_NOTHING, "DO_NOTHING");
        i(new C6478k(storageManager, moduleDescriptor, deserializationConfiguration, oVar, c6471d, this, aVar, DO_NOTHING, c.a.f16354a, s.a.f48612a, C4206t.n(new Jc.a(storageManager, moduleDescriptor), new e(storageManager, moduleDescriptor, null, 4, null)), notFoundClasses, InterfaceC6477j.f48565a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, c6561a.e(), kotlinTypeChecker, samConversionResolver, null, null, 786432, null));
    }

    @Override // yd.AbstractC6468a
    public p d(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        InputStream inputStreamC = f().c(fqName);
        if (inputStreamC != null) {
            return zd.c.f48896o.a(fqName, h(), g(), inputStreamC, false);
        }
        return null;
    }
}
