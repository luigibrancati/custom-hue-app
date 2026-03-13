package Xc;

import Bd.n;
import Dd.l;
import Lc.G;
import Lc.d0;
import Uc.C2302d;
import Uc.p;
import Uc.q;
import Uc.u;
import ad.InterfaceC2686b;
import cd.C3110l;
import dd.C3903h;
import dd.InterfaceC3911p;
import dd.x;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import td.InterfaceC5883f;
import ud.InterfaceC6019a;
import yd.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f19459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f19460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3911p f19461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3903h f19462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Vc.j f19463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f19464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Vc.g f19465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Vc.f f19466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC6019a f19467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC2686b f19468j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f19469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f19470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f19471m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Tc.c f19472n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final G f19473o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Ic.i f19474p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C2302d f19475q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C3110l f19476r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q f19477s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f19478t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final l f19479u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Uc.x f19480v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final u f19481w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC5883f f19482x;

    public b(n storageManager, p finder, InterfaceC3911p kotlinClassFinder, C3903h deserializedDescriptorResolver, Vc.j signaturePropagator, r errorReporter, Vc.g javaResolverCache, Vc.f javaPropertyInitializerEvaluator, InterfaceC6019a samConversionResolver, InterfaceC2686b sourceElementFactory, i moduleClassResolver, x packagePartProvider, d0 supertypeLoopChecker, Tc.c lookupTracker, G module, Ic.i reflectionTypes, C2302d annotationTypeQualifierResolver, C3110l signatureEnhancement, q javaClassesTracker, c settings, l kotlinTypeChecker, Uc.x javaTypeEnhancementState, u javaModuleResolver, InterfaceC5883f syntheticPartsProvider) {
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(finder, "finder");
        AbstractC4862t.e(kotlinClassFinder, "kotlinClassFinder");
        AbstractC4862t.e(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        AbstractC4862t.e(signaturePropagator, "signaturePropagator");
        AbstractC4862t.e(errorReporter, "errorReporter");
        AbstractC4862t.e(javaResolverCache, "javaResolverCache");
        AbstractC4862t.e(javaPropertyInitializerEvaluator, "javaPropertyInitializerEvaluator");
        AbstractC4862t.e(samConversionResolver, "samConversionResolver");
        AbstractC4862t.e(sourceElementFactory, "sourceElementFactory");
        AbstractC4862t.e(moduleClassResolver, "moduleClassResolver");
        AbstractC4862t.e(packagePartProvider, "packagePartProvider");
        AbstractC4862t.e(supertypeLoopChecker, "supertypeLoopChecker");
        AbstractC4862t.e(lookupTracker, "lookupTracker");
        AbstractC4862t.e(module, "module");
        AbstractC4862t.e(reflectionTypes, "reflectionTypes");
        AbstractC4862t.e(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        AbstractC4862t.e(signatureEnhancement, "signatureEnhancement");
        AbstractC4862t.e(javaClassesTracker, "javaClassesTracker");
        AbstractC4862t.e(settings, "settings");
        AbstractC4862t.e(kotlinTypeChecker, "kotlinTypeChecker");
        AbstractC4862t.e(javaTypeEnhancementState, "javaTypeEnhancementState");
        AbstractC4862t.e(javaModuleResolver, "javaModuleResolver");
        AbstractC4862t.e(syntheticPartsProvider, "syntheticPartsProvider");
        this.f19459a = storageManager;
        this.f19460b = finder;
        this.f19461c = kotlinClassFinder;
        this.f19462d = deserializedDescriptorResolver;
        this.f19463e = signaturePropagator;
        this.f19464f = errorReporter;
        this.f19465g = javaResolverCache;
        this.f19466h = javaPropertyInitializerEvaluator;
        this.f19467i = samConversionResolver;
        this.f19468j = sourceElementFactory;
        this.f19469k = moduleClassResolver;
        this.f19470l = packagePartProvider;
        this.f19471m = supertypeLoopChecker;
        this.f19472n = lookupTracker;
        this.f19473o = module;
        this.f19474p = reflectionTypes;
        this.f19475q = annotationTypeQualifierResolver;
        this.f19476r = signatureEnhancement;
        this.f19477s = javaClassesTracker;
        this.f19478t = settings;
        this.f19479u = kotlinTypeChecker;
        this.f19480v = javaTypeEnhancementState;
        this.f19481w = javaModuleResolver;
        this.f19482x = syntheticPartsProvider;
    }

    public final C2302d a() {
        return this.f19475q;
    }

    public final C3903h b() {
        return this.f19462d;
    }

    public final r c() {
        return this.f19464f;
    }

    public final p d() {
        return this.f19460b;
    }

    public final q e() {
        return this.f19477s;
    }

    public final u f() {
        return this.f19481w;
    }

    public final Vc.f g() {
        return this.f19466h;
    }

    public final Vc.g h() {
        return this.f19465g;
    }

    public final Uc.x i() {
        return this.f19480v;
    }

    public final InterfaceC3911p j() {
        return this.f19461c;
    }

    public final l k() {
        return this.f19479u;
    }

    public final Tc.c l() {
        return this.f19472n;
    }

    public final G m() {
        return this.f19473o;
    }

    public final i n() {
        return this.f19469k;
    }

    public final x o() {
        return this.f19470l;
    }

    public final Ic.i p() {
        return this.f19474p;
    }

    public final c q() {
        return this.f19478t;
    }

    public final C3110l r() {
        return this.f19476r;
    }

    public final Vc.j s() {
        return this.f19463e;
    }

    public final InterfaceC2686b t() {
        return this.f19468j;
    }

    public final n u() {
        return this.f19459a;
    }

    public final d0 v() {
        return this.f19471m;
    }

    public final InterfaceC5883f w() {
        return this.f19482x;
    }

    public final b x(Vc.g javaResolverCache) {
        AbstractC4862t.e(javaResolverCache, "javaResolverCache");
        return new b(this.f19459a, this.f19460b, this.f19461c, this.f19462d, this.f19463e, this.f19464f, javaResolverCache, this.f19466h, this.f19467i, this.f19468j, this.f19469k, this.f19470l, this.f19471m, this.f19472n, this.f19473o, this.f19474p, this.f19475q, this.f19476r, this.f19477s, this.f19478t, this.f19479u, this.f19480v, this.f19481w, null, 8388608, null);
    }

    public /* synthetic */ b(n nVar, p pVar, InterfaceC3911p interfaceC3911p, C3903h c3903h, Vc.j jVar, r rVar, Vc.g gVar, Vc.f fVar, InterfaceC6019a interfaceC6019a, InterfaceC2686b interfaceC2686b, i iVar, x xVar, d0 d0Var, Tc.c cVar, G g10, Ic.i iVar2, C2302d c2302d, C3110l c3110l, q qVar, c cVar2, l lVar, Uc.x xVar2, u uVar, InterfaceC5883f interfaceC5883f, int i10, AbstractC4854k abstractC4854k) {
        this(nVar, pVar, interfaceC3911p, c3903h, jVar, rVar, gVar, fVar, interfaceC6019a, interfaceC2686b, iVar, xVar, d0Var, cVar, g10, iVar2, c2302d, c3110l, qVar, cVar2, lVar, xVar2, uVar, (i10 & 8388608) != 0 ? InterfaceC5883f.f44922a.a() : interfaceC5883f);
    }
}
