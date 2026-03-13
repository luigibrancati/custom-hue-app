package zd;

import Od.C;
import com.fasterxml.jackson.core.JsonPointer;
import gd.AbstractC4210b;
import kotlin.jvm.internal.AbstractC4862t;
import md.C5053g;
import md.i;
import xd.AbstractC6362a;

/* JADX INFO: renamed from: zd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6561a extends AbstractC6362a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C6561a f48894n = new C6561a();

    /* JADX WARN: Illegal instructions before constructor call */
    public C6561a() {
        C5053g c5053gD = C5053g.d();
        AbstractC4210b.a(c5053gD);
        AbstractC4862t.d(c5053gD, "newInstance().apply(Buil…f::registerAllExtensions)");
        i.f packageFqName = AbstractC4210b.f35619a;
        AbstractC4862t.d(packageFqName, "packageFqName");
        i.f constructorAnnotation = AbstractC4210b.f35621c;
        AbstractC4862t.d(constructorAnnotation, "constructorAnnotation");
        i.f classAnnotation = AbstractC4210b.f35620b;
        AbstractC4862t.d(classAnnotation, "classAnnotation");
        i.f functionAnnotation = AbstractC4210b.f35622d;
        AbstractC4862t.d(functionAnnotation, "functionAnnotation");
        i.f propertyAnnotation = AbstractC4210b.f35623e;
        AbstractC4862t.d(propertyAnnotation, "propertyAnnotation");
        i.f propertyGetterAnnotation = AbstractC4210b.f35624f;
        AbstractC4862t.d(propertyGetterAnnotation, "propertyGetterAnnotation");
        i.f propertySetterAnnotation = AbstractC4210b.f35625g;
        AbstractC4862t.d(propertySetterAnnotation, "propertySetterAnnotation");
        i.f enumEntryAnnotation = AbstractC4210b.f35627i;
        AbstractC4862t.d(enumEntryAnnotation, "enumEntryAnnotation");
        i.f compileTimeValue = AbstractC4210b.f35626h;
        AbstractC4862t.d(compileTimeValue, "compileTimeValue");
        i.f parameterAnnotation = AbstractC4210b.f35628j;
        AbstractC4862t.d(parameterAnnotation, "parameterAnnotation");
        i.f typeAnnotation = AbstractC4210b.f35629k;
        AbstractC4862t.d(typeAnnotation, "typeAnnotation");
        i.f typeParameterAnnotation = AbstractC4210b.f35630l;
        AbstractC4862t.d(typeParameterAnnotation, "typeParameterAnnotation");
        super(c5053gD, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    public final String m(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        return o(fqName) + ".kotlin_builtins";
    }

    public final String n(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        StringBuilder sb2 = new StringBuilder();
        String strB = fqName.b();
        AbstractC4862t.d(strB, "fqName.asString()");
        sb2.append(C.K(strB, '.', JsonPointer.SEPARATOR, false, 4, null));
        sb2.append(JsonPointer.SEPARATOR);
        sb2.append(m(fqName));
        return sb2.toString();
    }

    public final String o(kd.c cVar) {
        if (cVar.d()) {
            return "default-package";
        }
        String strB = cVar.g().b();
        AbstractC4862t.d(strB, "fqName.shortName().asString()");
        return strB;
    }
}
