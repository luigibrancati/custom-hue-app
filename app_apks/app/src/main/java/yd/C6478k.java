package yd;

import Cd.C0731n;
import Lc.G;
import Lc.InterfaceC1177e;
import Lc.J;
import Lc.K;
import Lc.L;
import Nc.a;
import Nc.c;
import Nc.e;
import com.google.ar.core.ImageMetadata;
import gc.C4205s;
import gc.C4206t;
import hd.AbstractC4297a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import md.C5053g;
import ud.InterfaceC6019a;

/* JADX INFO: renamed from: yd.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6478k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bd.n f48568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f48569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC6479l f48570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC6475h f48571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC6470c f48572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L f48573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f48574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f48575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Tc.c f48576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f48577j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Iterable f48578k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final J f48579l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC6477j f48580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Nc.a f48581n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Nc.c f48582o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C5053g f48583p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Dd.l f48584q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC6019a f48585r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Nc.e f48586s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f48587t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C6476i f48588u;

    public C6478k(Bd.n storageManager, G moduleDescriptor, InterfaceC6479l configuration, InterfaceC6475h classDataFinder, InterfaceC6470c annotationAndConstantLoader, L packageFragmentProvider, v localClassifierTypeSettings, r errorReporter, Tc.c lookupTracker, s flexibleTypeDeserializer, Iterable fictitiousClassDescriptorFactories, J notFoundClasses, InterfaceC6477j contractDeserializer, Nc.a additionalClassPartsProvider, Nc.c platformDependentDeclarationFilter, C5053g extensionRegistryLite, Dd.l kotlinTypeChecker, InterfaceC6019a samConversionResolver, Nc.e platformDependentTypeTransformer, List typeAttributeTranslators) {
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(moduleDescriptor, "moduleDescriptor");
        AbstractC4862t.e(configuration, "configuration");
        AbstractC4862t.e(classDataFinder, "classDataFinder");
        AbstractC4862t.e(annotationAndConstantLoader, "annotationAndConstantLoader");
        AbstractC4862t.e(packageFragmentProvider, "packageFragmentProvider");
        AbstractC4862t.e(localClassifierTypeSettings, "localClassifierTypeSettings");
        AbstractC4862t.e(errorReporter, "errorReporter");
        AbstractC4862t.e(lookupTracker, "lookupTracker");
        AbstractC4862t.e(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        AbstractC4862t.e(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        AbstractC4862t.e(notFoundClasses, "notFoundClasses");
        AbstractC4862t.e(contractDeserializer, "contractDeserializer");
        AbstractC4862t.e(additionalClassPartsProvider, "additionalClassPartsProvider");
        AbstractC4862t.e(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC4862t.e(extensionRegistryLite, "extensionRegistryLite");
        AbstractC4862t.e(kotlinTypeChecker, "kotlinTypeChecker");
        AbstractC4862t.e(samConversionResolver, "samConversionResolver");
        AbstractC4862t.e(platformDependentTypeTransformer, "platformDependentTypeTransformer");
        AbstractC4862t.e(typeAttributeTranslators, "typeAttributeTranslators");
        this.f48568a = storageManager;
        this.f48569b = moduleDescriptor;
        this.f48570c = configuration;
        this.f48571d = classDataFinder;
        this.f48572e = annotationAndConstantLoader;
        this.f48573f = packageFragmentProvider;
        this.f48574g = localClassifierTypeSettings;
        this.f48575h = errorReporter;
        this.f48576i = lookupTracker;
        this.f48577j = flexibleTypeDeserializer;
        this.f48578k = fictitiousClassDescriptorFactories;
        this.f48579l = notFoundClasses;
        this.f48580m = contractDeserializer;
        this.f48581n = additionalClassPartsProvider;
        this.f48582o = platformDependentDeclarationFilter;
        this.f48583p = extensionRegistryLite;
        this.f48584q = kotlinTypeChecker;
        this.f48585r = samConversionResolver;
        this.f48586s = platformDependentTypeTransformer;
        this.f48587t = typeAttributeTranslators;
        this.f48588u = new C6476i(this);
    }

    public final m a(K descriptor, hd.c nameResolver, hd.g typeTable, hd.h versionRequirementTable, AbstractC4297a metadataVersion, Ad.f fVar) {
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(nameResolver, "nameResolver");
        AbstractC4862t.e(typeTable, "typeTable");
        AbstractC4862t.e(versionRequirementTable, "versionRequirementTable");
        AbstractC4862t.e(metadataVersion, "metadataVersion");
        return new m(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, fVar, null, C4206t.k());
    }

    public final InterfaceC1177e b(kd.b classId) {
        AbstractC4862t.e(classId, "classId");
        return C6476i.e(this.f48588u, classId, null, 2, null);
    }

    public final Nc.a c() {
        return this.f48581n;
    }

    public final InterfaceC6470c d() {
        return this.f48572e;
    }

    public final InterfaceC6475h e() {
        return this.f48571d;
    }

    public final C6476i f() {
        return this.f48588u;
    }

    public final InterfaceC6479l g() {
        return this.f48570c;
    }

    public final InterfaceC6477j h() {
        return this.f48580m;
    }

    public final r i() {
        return this.f48575h;
    }

    public final C5053g j() {
        return this.f48583p;
    }

    public final Iterable k() {
        return this.f48578k;
    }

    public final s l() {
        return this.f48577j;
    }

    public final Dd.l m() {
        return this.f48584q;
    }

    public final v n() {
        return this.f48574g;
    }

    public final Tc.c o() {
        return this.f48576i;
    }

    public final G p() {
        return this.f48569b;
    }

    public final J q() {
        return this.f48579l;
    }

    public final L r() {
        return this.f48573f;
    }

    public final Nc.c s() {
        return this.f48582o;
    }

    public final Nc.e t() {
        return this.f48586s;
    }

    public final Bd.n u() {
        return this.f48568a;
    }

    public final List v() {
        return this.f48587t;
    }

    public /* synthetic */ C6478k(Bd.n nVar, G g10, InterfaceC6479l interfaceC6479l, InterfaceC6475h interfaceC6475h, InterfaceC6470c interfaceC6470c, L l10, v vVar, r rVar, Tc.c cVar, s sVar, Iterable iterable, J j10, InterfaceC6477j interfaceC6477j, Nc.a aVar, Nc.c cVar2, C5053g c5053g, Dd.l lVar, InterfaceC6019a interfaceC6019a, Nc.e eVar, List list, int i10, AbstractC4854k abstractC4854k) {
        this(nVar, g10, interfaceC6479l, interfaceC6475h, interfaceC6470c, l10, vVar, rVar, cVar, sVar, iterable, j10, interfaceC6477j, (i10 & 8192) != 0 ? a.C0154a.f10626a : aVar, (i10 & 16384) != 0 ? c.a.f10627a : cVar2, c5053g, (65536 & i10) != 0 ? Dd.l.f2684b.a() : lVar, interfaceC6019a, (262144 & i10) != 0 ? e.a.f10630a : eVar, (i10 & ImageMetadata.LENS_APERTURE) != 0 ? C4205s.d(C0731n.f1384a) : list);
    }
}
