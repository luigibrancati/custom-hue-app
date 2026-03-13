package Kc;

import Ic.j;
import Od.B;
import Od.F;
import gc.C4206t;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import td.EnumC5882e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f7792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f7793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f7794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f7795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f7796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final kd.b f7797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final kd.c f7798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final kd.b f7799h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final kd.b f7800i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final kd.b f7801j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final HashMap f7802k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap f7803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final HashMap f7804m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f7805n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f7806o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final HashMap f7807p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final List f7808q;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kd.b f7809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final kd.b f7810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final kd.b f7811c;

        public a(kd.b javaClass, kd.b kotlinReadOnly, kd.b kotlinMutable) {
            AbstractC4862t.e(javaClass, "javaClass");
            AbstractC4862t.e(kotlinReadOnly, "kotlinReadOnly");
            AbstractC4862t.e(kotlinMutable, "kotlinMutable");
            this.f7809a = javaClass;
            this.f7810b = kotlinReadOnly;
            this.f7811c = kotlinMutable;
        }

        public final kd.b a() {
            return this.f7809a;
        }

        public final kd.b b() {
            return this.f7810b;
        }

        public final kd.b c() {
            return this.f7811c;
        }

        public final kd.b d() {
            return this.f7809a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC4862t.a(this.f7809a, aVar.f7809a) && AbstractC4862t.a(this.f7810b, aVar.f7810b) && AbstractC4862t.a(this.f7811c, aVar.f7811c);
        }

        public int hashCode() {
            return (((this.f7809a.hashCode() * 31) + this.f7810b.hashCode()) * 31) + this.f7811c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f7809a + ", kotlinReadOnly=" + this.f7810b + ", kotlinMutable=" + this.f7811c + ')';
        }
    }

    static {
        c cVar = new c();
        f7792a = cVar;
        StringBuilder sb2 = new StringBuilder();
        Jc.c cVar2 = Jc.c.Function;
        sb2.append(cVar2.j().toString());
        sb2.append('.');
        sb2.append(cVar2.b());
        f7793b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        Jc.c cVar3 = Jc.c.KFunction;
        sb3.append(cVar3.j().toString());
        sb3.append('.');
        sb3.append(cVar3.b());
        f7794c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        Jc.c cVar4 = Jc.c.SuspendFunction;
        sb4.append(cVar4.j().toString());
        sb4.append('.');
        sb4.append(cVar4.b());
        f7795d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        Jc.c cVar5 = Jc.c.KSuspendFunction;
        sb5.append(cVar5.j().toString());
        sb5.append('.');
        sb5.append(cVar5.b());
        f7796e = sb5.toString();
        kd.b bVarM = kd.b.m(new kd.c("kotlin.jvm.functions.FunctionN"));
        AbstractC4862t.d(bVarM, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))");
        f7797f = bVarM;
        kd.c cVarB = bVarM.b();
        AbstractC4862t.d(cVarB, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f7798g = cVarB;
        kd.i iVar = kd.i.f39611a;
        f7799h = iVar.k();
        f7800i = iVar.j();
        f7801j = cVar.g(Class.class);
        f7802k = new HashMap();
        f7803l = new HashMap();
        f7804m = new HashMap();
        f7805n = new HashMap();
        f7806o = new HashMap();
        f7807p = new HashMap();
        kd.b bVarM2 = kd.b.m(j.a.f5774T);
        AbstractC4862t.d(bVarM2, "topLevel(FqNames.iterable)");
        kd.c cVar6 = j.a.f5784b0;
        kd.c cVarH = bVarM2.h();
        kd.c cVarH2 = bVarM2.h();
        AbstractC4862t.d(cVarH2, "kotlinReadOnly.packageFqName");
        kd.c cVarG = kd.e.g(cVar6, cVarH2);
        a aVar = new a(cVar.g(Iterable.class), bVarM2, new kd.b(cVarH, cVarG, false));
        kd.b bVarM3 = kd.b.m(j.a.f5773S);
        AbstractC4862t.d(bVarM3, "topLevel(FqNames.iterator)");
        kd.c cVar7 = j.a.f5782a0;
        kd.c cVarH3 = bVarM3.h();
        kd.c cVarH4 = bVarM3.h();
        AbstractC4862t.d(cVarH4, "kotlinReadOnly.packageFqName");
        a aVar2 = new a(cVar.g(Iterator.class), bVarM3, new kd.b(cVarH3, kd.e.g(cVar7, cVarH4), false));
        kd.b bVarM4 = kd.b.m(j.a.f5775U);
        AbstractC4862t.d(bVarM4, "topLevel(FqNames.collection)");
        kd.c cVar8 = j.a.f5786c0;
        kd.c cVarH5 = bVarM4.h();
        kd.c cVarH6 = bVarM4.h();
        AbstractC4862t.d(cVarH6, "kotlinReadOnly.packageFqName");
        a aVar3 = new a(cVar.g(Collection.class), bVarM4, new kd.b(cVarH5, kd.e.g(cVar8, cVarH6), false));
        kd.b bVarM5 = kd.b.m(j.a.f5776V);
        AbstractC4862t.d(bVarM5, "topLevel(FqNames.list)");
        kd.c cVar9 = j.a.f5788d0;
        kd.c cVarH7 = bVarM5.h();
        kd.c cVarH8 = bVarM5.h();
        AbstractC4862t.d(cVarH8, "kotlinReadOnly.packageFqName");
        a aVar4 = new a(cVar.g(List.class), bVarM5, new kd.b(cVarH7, kd.e.g(cVar9, cVarH8), false));
        kd.b bVarM6 = kd.b.m(j.a.f5778X);
        AbstractC4862t.d(bVarM6, "topLevel(FqNames.set)");
        kd.c cVar10 = j.a.f5792f0;
        kd.c cVarH9 = bVarM6.h();
        kd.c cVarH10 = bVarM6.h();
        AbstractC4862t.d(cVarH10, "kotlinReadOnly.packageFqName");
        a aVar5 = new a(cVar.g(Set.class), bVarM6, new kd.b(cVarH9, kd.e.g(cVar10, cVarH10), false));
        kd.b bVarM7 = kd.b.m(j.a.f5777W);
        AbstractC4862t.d(bVarM7, "topLevel(FqNames.listIterator)");
        kd.c cVar11 = j.a.f5790e0;
        kd.c cVarH11 = bVarM7.h();
        kd.c cVarH12 = bVarM7.h();
        AbstractC4862t.d(cVarH12, "kotlinReadOnly.packageFqName");
        a aVar6 = new a(cVar.g(ListIterator.class), bVarM7, new kd.b(cVarH11, kd.e.g(cVar11, cVarH12), false));
        kd.c cVar12 = j.a.f5779Y;
        kd.b bVarM8 = kd.b.m(cVar12);
        AbstractC4862t.d(bVarM8, "topLevel(FqNames.map)");
        kd.c cVar13 = j.a.f5794g0;
        kd.c cVarH13 = bVarM8.h();
        kd.c cVarH14 = bVarM8.h();
        AbstractC4862t.d(cVarH14, "kotlinReadOnly.packageFqName");
        a aVar7 = new a(cVar.g(Map.class), bVarM8, new kd.b(cVarH13, kd.e.g(cVar13, cVarH14), false));
        kd.b bVarD = kd.b.m(cVar12).d(j.a.f5780Z.g());
        AbstractC4862t.d(bVarD, "topLevel(FqNames.map).cr…mes.mapEntry.shortName())");
        kd.c cVar14 = j.a.f5796h0;
        kd.c cVarH15 = bVarD.h();
        kd.c cVarH16 = bVarD.h();
        AbstractC4862t.d(cVarH16, "kotlinReadOnly.packageFqName");
        List listN = C4206t.n(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, new a(cVar.g(Map.Entry.class), bVarD, new kd.b(cVarH15, kd.e.g(cVar14, cVarH16), false)));
        f7808q = listN;
        cVar.f(Object.class, j.a.f5783b);
        cVar.f(String.class, j.a.f5795h);
        cVar.f(CharSequence.class, j.a.f5793g);
        cVar.e(Throwable.class, j.a.f5821u);
        cVar.f(Cloneable.class, j.a.f5787d);
        cVar.f(Number.class, j.a.f5815r);
        cVar.e(Comparable.class, j.a.f5823v);
        cVar.f(Enum.class, j.a.f5817s);
        cVar.e(Annotation.class, j.a.f5757G);
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            f7792a.d((a) it.next());
        }
        for (EnumC5882e enumC5882e : EnumC5882e.values()) {
            c cVar15 = f7792a;
            kd.b bVarM9 = kd.b.m(enumC5882e.u());
            AbstractC4862t.d(bVarM9, "topLevel(jvmType.wrapperFqName)");
            Ic.h hVarS = enumC5882e.s();
            AbstractC4862t.d(hVarS, "jvmType.primitiveType");
            kd.b bVarM10 = kd.b.m(Ic.j.c(hVarS));
            AbstractC4862t.d(bVarM10, "topLevel(StandardNames.g…e(jvmType.primitiveType))");
            cVar15.a(bVarM9, bVarM10);
        }
        for (kd.b bVar : Ic.c.f5683a.a()) {
            c cVar16 = f7792a;
            kd.b bVarM11 = kd.b.m(new kd.c("kotlin.jvm.internal." + bVar.j().b() + "CompanionObject"));
            AbstractC4862t.d(bVarM11, "topLevel(FqName(\"kotlin.…g() + \"CompanionObject\"))");
            kd.b bVarD2 = bVar.d(kd.h.f39569d);
            AbstractC4862t.d(bVarD2, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            cVar16.a(bVarM11, bVarD2);
        }
        for (int i10 = 0; i10 < 23; i10++) {
            c cVar17 = f7792a;
            kd.b bVarM12 = kd.b.m(new kd.c("kotlin.jvm.functions.Function" + i10));
            AbstractC4862t.d(bVarM12, "topLevel(FqName(\"kotlin.…m.functions.Function$i\"))");
            cVar17.a(bVarM12, Ic.j.a(i10));
            cVar17.c(new kd.c(f7794c + i10), f7799h);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            Jc.c cVar18 = Jc.c.KSuspendFunction;
            f7792a.c(new kd.c((cVar18.j().toString() + '.' + cVar18.b()) + i11), f7799h);
        }
        c cVar19 = f7792a;
        kd.c cVarL = j.a.f5785c.l();
        AbstractC4862t.d(cVarL, "nothing.toSafe()");
        cVar19.c(cVarL, cVar19.g(Void.class));
    }

    public final void a(kd.b bVar, kd.b bVar2) {
        b(bVar, bVar2);
        kd.c cVarB = bVar2.b();
        AbstractC4862t.d(cVarB, "kotlinClassId.asSingleFqName()");
        c(cVarB, bVar);
    }

    public final void b(kd.b bVar, kd.b bVar2) {
        HashMap map = f7802k;
        kd.d dVarJ = bVar.b().j();
        AbstractC4862t.d(dVarJ, "javaClassId.asSingleFqName().toUnsafe()");
        map.put(dVarJ, bVar2);
    }

    public final void c(kd.c cVar, kd.b bVar) {
        HashMap map = f7803l;
        kd.d dVarJ = cVar.j();
        AbstractC4862t.d(dVarJ, "kotlinFqNameUnsafe.toUnsafe()");
        map.put(dVarJ, bVar);
    }

    public final void d(a aVar) {
        kd.b bVarA = aVar.a();
        kd.b bVarB = aVar.b();
        kd.b bVarC = aVar.c();
        a(bVarA, bVarB);
        kd.c cVarB = bVarC.b();
        AbstractC4862t.d(cVarB, "mutableClassId.asSingleFqName()");
        c(cVarB, bVarA);
        f7806o.put(bVarC, bVarB);
        f7807p.put(bVarB, bVarC);
        kd.c cVarB2 = bVarB.b();
        AbstractC4862t.d(cVarB2, "readOnlyClassId.asSingleFqName()");
        kd.c cVarB3 = bVarC.b();
        AbstractC4862t.d(cVarB3, "mutableClassId.asSingleFqName()");
        HashMap map = f7804m;
        kd.d dVarJ = bVarC.b().j();
        AbstractC4862t.d(dVarJ, "mutableClassId.asSingleFqName().toUnsafe()");
        map.put(dVarJ, cVarB2);
        HashMap map2 = f7805n;
        kd.d dVarJ2 = cVarB2.j();
        AbstractC4862t.d(dVarJ2, "readOnlyFqName.toUnsafe()");
        map2.put(dVarJ2, cVarB3);
    }

    public final void e(Class cls, kd.c cVar) {
        kd.b bVarG = g(cls);
        kd.b bVarM = kd.b.m(cVar);
        AbstractC4862t.d(bVarM, "topLevel(kotlinFqName)");
        a(bVarG, bVarM);
    }

    public final void f(Class cls, kd.d dVar) {
        kd.c cVarL = dVar.l();
        AbstractC4862t.d(cVarL, "kotlinFqName.toSafe()");
        e(cls, cVarL);
    }

    public final kd.b g(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            kd.b bVarM = kd.b.m(new kd.c(cls.getCanonicalName()));
            AbstractC4862t.d(bVarM, "topLevel(FqName(clazz.canonicalName))");
            return bVarM;
        }
        kd.b bVarD = g(declaringClass).d(kd.f.s(cls.getSimpleName()));
        AbstractC4862t.d(bVarD, "classId(outer).createNes…tifier(clazz.simpleName))");
        return bVarD;
    }

    public final kd.c h() {
        return f7798g;
    }

    public final List i() {
        return f7808q;
    }

    public final boolean j(kd.d dVar, String str) {
        Integer numU;
        String strB = dVar.b();
        AbstractC4862t.d(strB, "kotlinFqName.asString()");
        String strP0 = F.P0(strB, str, "");
        return strP0.length() > 0 && !F.L0(strP0, '0', false, 2, null) && (numU = B.u(strP0)) != null && numU.intValue() >= 23;
    }

    public final boolean k(kd.d dVar) {
        return f7804m.containsKey(dVar);
    }

    public final boolean l(kd.d dVar) {
        return f7805n.containsKey(dVar);
    }

    public final kd.b m(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        return (kd.b) f7802k.get(fqName.j());
    }

    public final kd.b n(kd.d kotlinFqName) {
        AbstractC4862t.e(kotlinFqName, "kotlinFqName");
        return j(kotlinFqName, f7793b) ? f7797f : j(kotlinFqName, f7795d) ? f7797f : j(kotlinFqName, f7794c) ? f7799h : j(kotlinFqName, f7796e) ? f7799h : (kd.b) f7803l.get(kotlinFqName);
    }

    public final kd.c o(kd.d dVar) {
        return (kd.c) f7804m.get(dVar);
    }

    public final kd.c p(kd.d dVar) {
        return (kd.c) f7805n.get(dVar);
    }
}
