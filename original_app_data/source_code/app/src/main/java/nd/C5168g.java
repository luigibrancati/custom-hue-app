package nd;

import Cd.E;
import Lc.j0;
import Od.C;
import gc.U;
import java.lang.reflect.Field;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.y;
import nd.AbstractC5164c;
import nd.InterfaceC5163b;
import nd.InterfaceC5167f;
import yc.AbstractC6460b;
import yc.C6459a;
import yc.InterfaceC6462d;

/* JADX INFO: renamed from: nd.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5168g implements InterfaceC5167f {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f40813X = {M.e(new y(M.b(C5168g.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), M.e(new y(M.b(C5168g.class), "withDefinedIn", "getWithDefinedIn()Z")), M.e(new y(M.b(C5168g.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), M.e(new y(M.b(C5168g.class), "modifiers", "getModifiers()Ljava/util/Set;")), M.e(new y(M.b(C5168g.class), "startFromName", "getStartFromName()Z")), M.e(new y(M.b(C5168g.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), M.e(new y(M.b(C5168g.class), "debugMode", "getDebugMode()Z")), M.e(new y(M.b(C5168g.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), M.e(new y(M.b(C5168g.class), "verbose", "getVerbose()Z")), M.e(new y(M.b(C5168g.class), "unitReturnType", "getUnitReturnType()Z")), M.e(new y(M.b(C5168g.class), "withoutReturnType", "getWithoutReturnType()Z")), M.e(new y(M.b(C5168g.class), "enhancedTypes", "getEnhancedTypes()Z")), M.e(new y(M.b(C5168g.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), M.e(new y(M.b(C5168g.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), M.e(new y(M.b(C5168g.class), "renderDefaultModality", "getRenderDefaultModality()Z")), M.e(new y(M.b(C5168g.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), M.e(new y(M.b(C5168g.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), M.e(new y(M.b(C5168g.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), M.e(new y(M.b(C5168g.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), M.e(new y(M.b(C5168g.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), M.e(new y(M.b(C5168g.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), M.e(new y(M.b(C5168g.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), M.e(new y(M.b(C5168g.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), M.e(new y(M.b(C5168g.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), M.e(new y(M.b(C5168g.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), M.e(new y(M.b(C5168g.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), M.e(new y(M.b(C5168g.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), M.e(new y(M.b(C5168g.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), M.e(new y(M.b(C5168g.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), M.e(new y(M.b(C5168g.class), "receiverAfterName", "getReceiverAfterName()Z")), M.e(new y(M.b(C5168g.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), M.e(new y(M.b(C5168g.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), M.e(new y(M.b(C5168g.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), M.e(new y(M.b(C5168g.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), M.e(new y(M.b(C5168g.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), M.e(new y(M.b(C5168g.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), M.e(new y(M.b(C5168g.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), M.e(new y(M.b(C5168g.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), M.e(new y(M.b(C5168g.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), M.e(new y(M.b(C5168g.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), M.e(new y(M.b(C5168g.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), M.e(new y(M.b(C5168g.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), M.e(new y(M.b(C5168g.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), M.e(new y(M.b(C5168g.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), M.e(new y(M.b(C5168g.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), M.e(new y(M.b(C5168g.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), M.e(new y(M.b(C5168g.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), M.e(new y(M.b(C5168g.class), "informativeErrorType", "getInformativeErrorType()Z"))};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final InterfaceC6462d f40814A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final InterfaceC6462d f40815B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final InterfaceC6462d f40816C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final InterfaceC6462d f40817D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final InterfaceC6462d f40818E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final InterfaceC6462d f40819F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final InterfaceC6462d f40820G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final InterfaceC6462d f40821H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final InterfaceC6462d f40822I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final InterfaceC6462d f40823J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final InterfaceC6462d f40824K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final InterfaceC6462d f40825L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final InterfaceC6462d f40826M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final InterfaceC6462d f40827N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final InterfaceC6462d f40828O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final InterfaceC6462d f40829P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final InterfaceC6462d f40830Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final InterfaceC6462d f40831R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final InterfaceC6462d f40832S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final InterfaceC6462d f40833T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final InterfaceC6462d f40834U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final InterfaceC6462d f40835V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final InterfaceC6462d f40836W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f40837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC6462d f40838b = m0(InterfaceC5163b.c.f40776a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC6462d f40839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC6462d f40840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC6462d f40841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC6462d f40842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC6462d f40843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC6462d f40844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC6462d f40845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC6462d f40846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC6462d f40847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC6462d f40848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC6462d f40849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC6462d f40850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC6462d f40851o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InterfaceC6462d f40852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC6462d f40853q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC6462d f40854r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC6462d f40855s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InterfaceC6462d f40856t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC6462d f40857u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final InterfaceC6462d f40858v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC6462d f40859w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC6462d f40860x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final InterfaceC6462d f40861y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final InterfaceC6462d f40862z;

    /* JADX INFO: renamed from: nd.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40863a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(j0 it) {
            AbstractC4862t.e(it, "it");
            return "...";
        }
    }

    /* JADX INFO: renamed from: nd.g$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC6460b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C5168g f40864b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, C5168g c5168g) {
            super(obj);
            this.f40864b = c5168g;
        }

        @Override // yc.AbstractC6460b
        public boolean b(Cc.l property, Object obj, Object obj2) {
            AbstractC4862t.e(property, "property");
            if (this.f40864b.k0()) {
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: nd.g$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f40865a = new c();

        public c() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(E it) {
            AbstractC4862t.e(it, "it");
            return it;
        }
    }

    public C5168g() {
        Boolean bool = Boolean.TRUE;
        this.f40839c = m0(bool);
        this.f40840d = m0(bool);
        this.f40841e = m0(EnumC5166e.ALL_EXCEPT_ANNOTATIONS);
        Boolean bool2 = Boolean.FALSE;
        this.f40842f = m0(bool2);
        this.f40843g = m0(bool2);
        this.f40844h = m0(bool2);
        this.f40845i = m0(bool2);
        this.f40846j = m0(bool2);
        this.f40847k = m0(bool);
        this.f40848l = m0(bool2);
        this.f40849m = m0(bool2);
        this.f40850n = m0(bool2);
        this.f40851o = m0(bool);
        this.f40852p = m0(bool);
        this.f40853q = m0(bool2);
        this.f40854r = m0(bool2);
        this.f40855s = m0(bool2);
        this.f40856t = m0(bool2);
        this.f40857u = m0(bool2);
        this.f40858v = m0(bool2);
        this.f40859w = m0(bool2);
        this.f40860x = m0(c.f40865a);
        this.f40861y = m0(a.f40863a);
        this.f40862z = m0(bool);
        this.f40814A = m0(EnumC5171j.RENDER_OPEN);
        this.f40815B = m0(AbstractC5164c.l.a.f40799a);
        this.f40816C = m0(EnumC5174m.PLAIN);
        this.f40817D = m0(EnumC5172k.ALL);
        this.f40818E = m0(bool2);
        this.f40819F = m0(bool2);
        this.f40820G = m0(EnumC5173l.DEBUG);
        this.f40821H = m0(bool2);
        this.f40822I = m0(bool2);
        this.f40823J = m0(U.d());
        this.f40824K = m0(C5169h.f40866a.a());
        this.f40825L = m0(null);
        this.f40826M = m0(EnumC5162a.NO_ARGUMENTS);
        this.f40827N = m0(bool2);
        this.f40828O = m0(bool);
        this.f40829P = m0(bool);
        this.f40830Q = m0(bool2);
        this.f40831R = m0(bool);
        this.f40832S = m0(bool);
        this.f40833T = m0(bool2);
        this.f40834U = m0(bool2);
        this.f40835V = m0(bool2);
        this.f40836W = m0(bool);
    }

    public boolean A() {
        return ((Boolean) this.f40831R.getValue(this, f40813X[42])).booleanValue();
    }

    public boolean B() {
        return InterfaceC5167f.a.a(this);
    }

    public boolean C() {
        return InterfaceC5167f.a.b(this);
    }

    public boolean D() {
        return ((Boolean) this.f40857u.getValue(this, f40813X[19])).booleanValue();
    }

    public boolean E() {
        return ((Boolean) this.f40836W.getValue(this, f40813X[47])).booleanValue();
    }

    public Set F() {
        return (Set) this.f40841e.getValue(this, f40813X[3]);
    }

    public boolean G() {
        return ((Boolean) this.f40850n.getValue(this, f40813X[12])).booleanValue();
    }

    public EnumC5171j H() {
        return (EnumC5171j) this.f40814A.getValue(this, f40813X[25]);
    }

    public EnumC5172k I() {
        return (EnumC5172k) this.f40817D.getValue(this, f40813X[28]);
    }

    public boolean J() {
        return ((Boolean) this.f40832S.getValue(this, f40813X[43])).booleanValue();
    }

    public boolean K() {
        return ((Boolean) this.f40834U.getValue(this, f40813X[45])).booleanValue();
    }

    public EnumC5173l L() {
        return (EnumC5173l) this.f40820G.getValue(this, f40813X[31]);
    }

    public boolean M() {
        return ((Boolean) this.f40818E.getValue(this, f40813X[29])).booleanValue();
    }

    public boolean N() {
        return ((Boolean) this.f40819F.getValue(this, f40813X[30])).booleanValue();
    }

    public boolean O() {
        return ((Boolean) this.f40853q.getValue(this, f40813X[15])).booleanValue();
    }

    public boolean P() {
        return ((Boolean) this.f40828O.getValue(this, f40813X[39])).booleanValue();
    }

    public boolean Q() {
        return ((Boolean) this.f40821H.getValue(this, f40813X[32])).booleanValue();
    }

    public boolean R() {
        return ((Boolean) this.f40852p.getValue(this, f40813X[14])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.f40851o.getValue(this, f40813X[13])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.f40854r.getValue(this, f40813X[16])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.f40830Q.getValue(this, f40813X[41])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.f40829P.getValue(this, f40813X[40])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.f40862z.getValue(this, f40813X[24])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.f40843g.getValue(this, f40813X[5])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.f40842f.getValue(this, f40813X[4])).booleanValue();
    }

    public EnumC5174m Z() {
        return (EnumC5174m) this.f40816C.getValue(this, f40813X[27]);
    }

    @Override // nd.InterfaceC5167f
    public void a(EnumC5174m enumC5174m) {
        AbstractC4862t.e(enumC5174m, "<set-?>");
        this.f40816C.setValue(this, f40813X[27], enumC5174m);
    }

    public vc.l a0() {
        return (vc.l) this.f40860x.getValue(this, f40813X[22]);
    }

    @Override // nd.InterfaceC5167f
    public void b(boolean z10) {
        this.f40842f.setValue(this, f40813X[4], Boolean.valueOf(z10));
    }

    public boolean b0() {
        return ((Boolean) this.f40856t.getValue(this, f40813X[18])).booleanValue();
    }

    @Override // nd.InterfaceC5167f
    public void c(boolean z10) {
        this.f40839c.setValue(this, f40813X[1], Boolean.valueOf(z10));
    }

    public boolean c0() {
        return ((Boolean) this.f40847k.getValue(this, f40813X[9])).booleanValue();
    }

    @Override // nd.InterfaceC5167f
    public boolean d() {
        return ((Boolean) this.f40849m.getValue(this, f40813X[11])).booleanValue();
    }

    public AbstractC5164c.l d0() {
        return (AbstractC5164c.l) this.f40815B.getValue(this, f40813X[26]);
    }

    @Override // nd.InterfaceC5167f
    public void e(boolean z10) {
        this.f40859w.setValue(this, f40813X[21], Boolean.valueOf(z10));
    }

    public boolean e0() {
        return ((Boolean) this.f40846j.getValue(this, f40813X[8])).booleanValue();
    }

    @Override // nd.InterfaceC5167f
    public void f(boolean z10) {
        this.f40818E.setValue(this, f40813X[29], Boolean.valueOf(z10));
    }

    public boolean f0() {
        return ((Boolean) this.f40839c.getValue(this, f40813X[1])).booleanValue();
    }

    @Override // nd.InterfaceC5167f
    public Set g() {
        return (Set) this.f40824K.getValue(this, f40813X[35]);
    }

    public boolean g0() {
        return ((Boolean) this.f40840d.getValue(this, f40813X[2])).booleanValue();
    }

    @Override // nd.InterfaceC5167f
    public boolean h() {
        return ((Boolean) this.f40844h.getValue(this, f40813X[6])).booleanValue();
    }

    public boolean h0() {
        return ((Boolean) this.f40848l.getValue(this, f40813X[10])).booleanValue();
    }

    @Override // nd.InterfaceC5167f
    public EnumC5162a i() {
        return (EnumC5162a) this.f40826M.getValue(this, f40813X[37]);
    }

    public boolean i0() {
        return ((Boolean) this.f40859w.getValue(this, f40813X[21])).booleanValue();
    }

    @Override // nd.InterfaceC5167f
    public void j(Set set) {
        AbstractC4862t.e(set, "<set-?>");
        this.f40824K.setValue(this, f40813X[35], set);
    }

    public boolean j0() {
        return ((Boolean) this.f40858v.getValue(this, f40813X[20])).booleanValue();
    }

    @Override // nd.InterfaceC5167f
    public void k(Set set) {
        AbstractC4862t.e(set, "<set-?>");
        this.f40841e.setValue(this, f40813X[3], set);
    }

    public final boolean k0() {
        return this.f40837a;
    }

    @Override // nd.InterfaceC5167f
    public void l(InterfaceC5163b interfaceC5163b) {
        AbstractC4862t.e(interfaceC5163b, "<set-?>");
        this.f40838b.setValue(this, f40813X[0], interfaceC5163b);
    }

    public final void l0() {
        this.f40837a = true;
    }

    @Override // nd.InterfaceC5167f
    public void m(boolean z10) {
        this.f40844h.setValue(this, f40813X[6], Boolean.valueOf(z10));
    }

    public final InterfaceC6462d m0(Object obj) {
        C6459a c6459a = C6459a.f48511a;
        return new b(obj, this);
    }

    @Override // nd.InterfaceC5167f
    public void n(boolean z10) {
        this.f40819F.setValue(this, f40813X[30], Boolean.valueOf(z10));
    }

    @Override // nd.InterfaceC5167f
    public void o(EnumC5172k enumC5172k) {
        AbstractC4862t.e(enumC5172k, "<set-?>");
        this.f40817D.setValue(this, f40813X[28], enumC5172k);
    }

    @Override // nd.InterfaceC5167f
    public void p(boolean z10) {
        this.f40858v.setValue(this, f40813X[20], Boolean.valueOf(z10));
    }

    public final C5168g q() {
        C5168g c5168g = new C5168g();
        Field[] declaredFields = C5168g.class.getDeclaredFields();
        AbstractC4862t.d(declaredFields, "this::class.java.declaredFields");
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                AbstractC6460b abstractC6460b = obj instanceof AbstractC6460b ? (AbstractC6460b) obj : null;
                if (abstractC6460b != null) {
                    String name = field.getName();
                    AbstractC4862t.d(name, "field.name");
                    C.P(name, "is", false, 2, null);
                    Cc.d dVarB = M.b(C5168g.class);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("get");
                    String name3 = field.getName();
                    AbstractC4862t.d(name3, "field.name");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String strSubstring = name3.substring(1);
                        AbstractC4862t.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                        name3 = upperCase + strSubstring;
                    }
                    sb2.append(name3);
                    field.set(c5168g, c5168g.m0(abstractC6460b.getValue(this, new kotlin.jvm.internal.E(dVarB, name2, sb2.toString()))));
                }
            }
        }
        return c5168g;
    }

    public boolean r() {
        return ((Boolean) this.f40855s.getValue(this, f40813X[17])).booleanValue();
    }

    public boolean s() {
        return ((Boolean) this.f40827N.getValue(this, f40813X[38])).booleanValue();
    }

    public vc.l t() {
        return (vc.l) this.f40825L.getValue(this, f40813X[36]);
    }

    public boolean u() {
        return ((Boolean) this.f40835V.getValue(this, f40813X[46])).booleanValue();
    }

    public boolean v() {
        return ((Boolean) this.f40845i.getValue(this, f40813X[7])).booleanValue();
    }

    public InterfaceC5163b w() {
        return (InterfaceC5163b) this.f40838b.getValue(this, f40813X[0]);
    }

    public vc.l x() {
        return (vc.l) this.f40861y.getValue(this, f40813X[23]);
    }

    public boolean y() {
        return ((Boolean) this.f40822I.getValue(this, f40813X[33])).booleanValue();
    }

    public Set z() {
        return (Set) this.f40823J.getValue(this, f40813X[34]);
    }
}
