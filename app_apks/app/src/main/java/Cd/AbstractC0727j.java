package Cd;

import kotlin.jvm.internal.AbstractC4862t;
import yc.InterfaceC6461c;

/* JADX INFO: renamed from: Cd.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0727j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f1373a = {kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.d(AbstractC0727j.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC6461c f1374b;

    static {
        Jd.n nVarC = a0.f1311b.c(kotlin.jvm.internal.M.b(C0726i.class));
        AbstractC4862t.c(nVarC, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        f1374b = nVarC;
    }

    public static final Mc.g a(a0 a0Var) {
        Mc.g gVarE;
        AbstractC4862t.e(a0Var, "<this>");
        C0726i c0726iB = b(a0Var);
        return (c0726iB == null || (gVarE = c0726iB.e()) == null) ? Mc.g.f9435K.b() : gVarE;
    }

    public static final C0726i b(a0 a0Var) {
        AbstractC4862t.e(a0Var, "<this>");
        return (C0726i) f1374b.getValue(a0Var, f1373a[0]);
    }
}
