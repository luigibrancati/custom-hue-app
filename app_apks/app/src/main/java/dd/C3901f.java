package dd;

import Kc.f;
import Lc.G;
import Lc.J;
import Nc.a;
import Nc.c;
import Oc.C1815i;
import ad.InterfaceC2686b;
import dd.x;
import gc.C4206t;
import jd.C4768i;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import td.C5880c;
import ud.C6020b;
import yd.C6478k;
import yd.InterfaceC6477j;
import yd.InterfaceC6479l;
import yd.v;

/* JADX INFO: renamed from: dd.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3901f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f33418b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6478k f33419a;

    /* JADX INFO: renamed from: dd.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: dd.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0412a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C3901f f33420a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C3903h f33421b;

            public C0412a(C3901f deserializationComponentsForJava, C3903h deserializedDescriptorResolver) {
                AbstractC4862t.e(deserializationComponentsForJava, "deserializationComponentsForJava");
                AbstractC4862t.e(deserializedDescriptorResolver, "deserializedDescriptorResolver");
                this.f33420a = deserializationComponentsForJava;
                this.f33421b = deserializedDescriptorResolver;
            }

            public final C3901f a() {
                return this.f33420a;
            }

            public final C3903h b() {
                return this.f33421b;
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final C0412a a(InterfaceC3911p kotlinClassFinder, InterfaceC3911p jvmBuiltInsKotlinClassFinder, Uc.p javaClassFinder, String moduleName, yd.r errorReporter, InterfaceC2686b javaSourceElementFactory) {
            AbstractC4862t.e(kotlinClassFinder, "kotlinClassFinder");
            AbstractC4862t.e(jvmBuiltInsKotlinClassFinder, "jvmBuiltInsKotlinClassFinder");
            AbstractC4862t.e(javaClassFinder, "javaClassFinder");
            AbstractC4862t.e(moduleName, "moduleName");
            AbstractC4862t.e(errorReporter, "errorReporter");
            AbstractC4862t.e(javaSourceElementFactory, "javaSourceElementFactory");
            Bd.f fVar = new Bd.f("DeserializationComponentsForJava.ModuleData");
            Kc.f fVar2 = new Kc.f(fVar, f.a.FROM_DEPENDENCIES);
            kd.f fVarW = kd.f.w('<' + moduleName + '>');
            AbstractC4862t.d(fVarW, "special(\"<$moduleName>\")");
            Oc.x xVar = new Oc.x(fVarW, fVar, fVar2, null, null, null, 56, null);
            fVar2.D0(xVar);
            fVar2.I0(xVar, true);
            C3903h c3903h = new C3903h();
            Xc.j jVar = new Xc.j();
            J j10 = new J(fVar, xVar);
            Xc.f fVarB = AbstractC3902g.b(javaClassFinder, xVar, fVar, j10, kotlinClassFinder, c3903h, errorReporter, javaSourceElementFactory, jVar, (512 & 512) != 0 ? x.a.f33463a : null);
            C3901f c3901fA = AbstractC3902g.a(xVar, fVar, j10, fVarB, kotlinClassFinder, c3903h, errorReporter);
            c3903h.l(c3901fA);
            Vc.g EMPTY = Vc.g.f17494a;
            AbstractC4862t.d(EMPTY, "EMPTY");
            C5880c c5880c = new C5880c(fVarB, EMPTY);
            jVar.c(c5880c);
            Kc.j jVar2 = new Kc.j(fVar, jvmBuiltInsKotlinClassFinder, xVar, j10, fVar2.H0(), fVar2.H0(), InterfaceC6479l.a.f48589a, Dd.l.f2684b.a(), new C6020b(fVar, C4206t.k()));
            xVar.Y0(xVar);
            xVar.S0(new C1815i(C4206t.n(c5880c.a(), jVar2), "CompositeProvider@RuntimeModuleData for " + xVar));
            return new C0412a(c3901fA, c3903h);
        }

        public a() {
        }
    }

    public C3901f(Bd.n storageManager, G moduleDescriptor, InterfaceC6479l configuration, C3904i classDataFinder, C3899d annotationAndConstantLoader, Xc.f packageFragmentProvider, J notFoundClasses, yd.r errorReporter, Tc.c lookupTracker, InterfaceC6477j contractDeserializer, Dd.l kotlinTypeChecker, Fd.a typeAttributeTranslators) {
        Nc.c cVarH0;
        Nc.a aVarH0;
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(moduleDescriptor, "moduleDescriptor");
        AbstractC4862t.e(configuration, "configuration");
        AbstractC4862t.e(classDataFinder, "classDataFinder");
        AbstractC4862t.e(annotationAndConstantLoader, "annotationAndConstantLoader");
        AbstractC4862t.e(packageFragmentProvider, "packageFragmentProvider");
        AbstractC4862t.e(notFoundClasses, "notFoundClasses");
        AbstractC4862t.e(errorReporter, "errorReporter");
        AbstractC4862t.e(lookupTracker, "lookupTracker");
        AbstractC4862t.e(contractDeserializer, "contractDeserializer");
        AbstractC4862t.e(kotlinTypeChecker, "kotlinTypeChecker");
        AbstractC4862t.e(typeAttributeTranslators, "typeAttributeTranslators");
        Ic.g gVarN = moduleDescriptor.n();
        Kc.f fVar = gVarN instanceof Kc.f ? (Kc.f) gVarN : null;
        this.f33419a = new C6478k(storageManager, moduleDescriptor, configuration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, v.a.f48617a, errorReporter, lookupTracker, C3905j.f33432a, C4206t.k(), notFoundClasses, contractDeserializer, (fVar == null || (aVarH0 = fVar.H0()) == null) ? a.C0154a.f10626a : aVarH0, (fVar == null || (cVarH0 = fVar.H0()) == null) ? c.b.f10628a : cVarH0, C4768i.f39178a.a(), kotlinTypeChecker, new C6020b(storageManager, C4206t.k()), null, typeAttributeTranslators.a(), 262144, null);
    }

    public final C6478k a() {
        return this.f33419a;
    }
}
