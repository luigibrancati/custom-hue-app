package Rc;

import Lc.m0;
import Lc.n0;
import bd.EnumC2908D;
import bd.InterfaceC2909a;
import bd.InterfaceC2915g;
import gc.C4204q;
import gc.C4206t;
import gc.C4207u;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4859p;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.Q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends p implements Rc.h, v, InterfaceC2915g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f15082a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a extends AbstractC4859p implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15083a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f, Cc.c
        public final String getName() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final Cc.g getOwner() {
            return M.b(Member.class);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final String getSignature() {
            return "isSynthetic()Z";
        }

        @Override // vc.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member p02) {
            AbstractC4862t.e(p02, "p0");
            return Boolean.valueOf(p02.isSynthetic());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class b extends AbstractC4859p implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f15084a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f, Cc.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final Cc.g getOwner() {
            return M.b(o.class);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }

        @Override // vc.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final o invoke(Constructor p02) {
            AbstractC4862t.e(p02, "p0");
            return new o(p02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class c extends AbstractC4859p implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f15085a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f, Cc.c
        public final String getName() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final Cc.g getOwner() {
            return M.b(Member.class);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final String getSignature() {
            return "isSynthetic()Z";
        }

        @Override // vc.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member p02) {
            AbstractC4862t.e(p02, "p0");
            return Boolean.valueOf(p02.isSynthetic());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class d extends AbstractC4859p implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f15086a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f, Cc.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final Cc.g getOwner() {
            return M.b(r.class);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }

        @Override // vc.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final r invoke(Field p02) {
            AbstractC4862t.e(p02, "p0");
            return new r(p02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f15087a = new e();

        public e() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Class cls) {
            String simpleName = cls.getSimpleName();
            AbstractC4862t.d(simpleName, "it.simpleName");
            return Boolean.valueOf(simpleName.length() == 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f15088a = new f();

        public f() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kd.f invoke(Class cls) {
            String simpleName = cls.getSimpleName();
            if (!kd.f.v(simpleName)) {
                simpleName = null;
            }
            if (simpleName != null) {
                return kd.f.s(simpleName);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends kotlin.jvm.internal.v implements vc.l {
        public g() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(java.lang.reflect.Method r4) {
            /*
                r3 = this;
                boolean r0 = r4.isSynthetic()
                r1 = 0
                if (r0 == 0) goto L8
                goto L1f
            L8:
                Rc.l r0 = Rc.l.this
                boolean r0 = r0.v()
                r2 = 1
                if (r0 == 0) goto L1e
                Rc.l r3 = Rc.l.this
                java.lang.String r0 = "method"
                kotlin.jvm.internal.AbstractC4862t.d(r4, r0)
                boolean r3 = Rc.l.Q(r3, r4)
                if (r3 != 0) goto L1f
            L1e:
                r1 = r2
            L1f:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: Rc.l.g.invoke(java.lang.reflect.Method):java.lang.Boolean");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class h extends AbstractC4859p implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f15090a = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f, Cc.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final Cc.g getOwner() {
            return M.b(u.class);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }

        @Override // vc.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final u invoke(Method p02) {
            AbstractC4862t.e(p02, "p0");
            return new u(p02);
        }
    }

    public l(Class klass) {
        AbstractC4862t.e(klass, "klass");
        this.f15082a = klass;
    }

    @Override // bd.InterfaceC2915g
    public Collection C() throws IllegalAccessException, InvocationTargetException {
        Class[] clsArrC = C2114b.f15057a.c(this.f15082a);
        if (clsArrC == null) {
            return C4206t.k();
        }
        ArrayList arrayList = new ArrayList(clsArrC.length);
        for (Class cls : clsArrC) {
            arrayList.add(new n(cls));
        }
        return arrayList;
    }

    @Override // bd.InterfaceC2912d
    public boolean D() {
        return false;
    }

    @Override // bd.InterfaceC2915g
    public boolean J() {
        return this.f15082a.isInterface();
    }

    @Override // bd.InterfaceC2915g
    public EnumC2908D K() {
        return null;
    }

    @Override // bd.s
    public boolean P() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // bd.InterfaceC2915g
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public List l() {
        Constructor<?>[] declaredConstructors = this.f15082a.getDeclaredConstructors();
        AbstractC4862t.d(declaredConstructors, "klass.declaredConstructors");
        return Nd.t.O(Nd.t.I(Nd.t.z(C4204q.J(declaredConstructors), a.f15083a), b.f15084a));
    }

    @Override // Rc.h
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public Class r() {
        return this.f15082a;
    }

    @Override // bd.InterfaceC2915g
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public List x() {
        Field[] declaredFields = this.f15082a.getDeclaredFields();
        AbstractC4862t.d(declaredFields, "klass.declaredFields");
        return Nd.t.O(Nd.t.I(Nd.t.z(C4204q.J(declaredFields), c.f15085a), d.f15086a));
    }

    @Override // bd.InterfaceC2915g
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public List A() {
        Class<?>[] declaredClasses = this.f15082a.getDeclaredClasses();
        AbstractC4862t.d(declaredClasses, "klass.declaredClasses");
        return Nd.t.O(Nd.t.J(Nd.t.z(C4204q.J(declaredClasses), e.f15087a), f.f15088a));
    }

    @Override // bd.InterfaceC2915g
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public List B() {
        Method[] declaredMethods = this.f15082a.getDeclaredMethods();
        AbstractC4862t.d(declaredMethods, "klass.declaredMethods");
        return Nd.t.O(Nd.t.I(Nd.t.y(C4204q.J(declaredMethods), new g()), h.f15090a));
    }

    @Override // bd.InterfaceC2915g
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public l f() {
        Class<?> declaringClass = this.f15082a.getDeclaringClass();
        if (declaringClass != null) {
            return new l(declaringClass);
        }
        return null;
    }

    public final boolean X(Method method) {
        String name = method.getName();
        if (AbstractC4862t.a(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            AbstractC4862t.d(parameterTypes, "method.parameterTypes");
            return parameterTypes.length == 0;
        }
        if (AbstractC4862t.a(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // bd.InterfaceC2915g
    public kd.c e() {
        kd.c cVarB = Rc.d.a(this.f15082a).b();
        AbstractC4862t.d(cVarB, "klass.classId.asSingleFqName()");
        return cVarB;
    }

    public boolean equals(Object obj) {
        return (obj instanceof l) && AbstractC4862t.a(this.f15082a, ((l) obj).f15082a);
    }

    @Override // bd.InterfaceC2915g
    public Collection g() {
        Object[] objArrD = C2114b.f15057a.d(this.f15082a);
        if (objArrD == null) {
            objArrD = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrD.length);
        for (Object obj : objArrD) {
            arrayList.add(new y(obj));
        }
        return arrayList;
    }

    @Override // bd.InterfaceC2912d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // Rc.v
    public int getModifiers() {
        return this.f15082a.getModifiers();
    }

    @Override // bd.t
    public kd.f getName() {
        kd.f fVarS = kd.f.s(this.f15082a.getSimpleName());
        AbstractC4862t.d(fVarS, "identifier(klass.simpleName)");
        return fVarS;
    }

    @Override // bd.z
    public List getTypeParameters() {
        TypeVariable[] typeParameters = this.f15082a.getTypeParameters();
        AbstractC4862t.d(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new A(typeVariable));
        }
        return arrayList;
    }

    @Override // bd.s
    public n0 getVisibility() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? m0.h.f8766c : Modifier.isPrivate(modifiers) ? m0.e.f8763c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? Pc.c.f13293c : Pc.b.f13292c : Pc.a.f13291c;
    }

    public int hashCode() {
        return this.f15082a.hashCode();
    }

    @Override // bd.s
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // bd.s
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // bd.InterfaceC2912d
    public /* bridge */ /* synthetic */ InterfaceC2909a j(kd.c cVar) {
        return j(cVar);
    }

    @Override // bd.InterfaceC2915g
    public boolean m() {
        return this.f15082a.isAnnotation();
    }

    @Override // bd.InterfaceC2915g
    public Collection o() {
        Class cls;
        cls = Object.class;
        if (AbstractC4862t.a(this.f15082a, cls)) {
            return C4206t.k();
        }
        Q q10 = new Q(2);
        Type genericSuperclass = this.f15082a.getGenericSuperclass();
        q10.a(genericSuperclass != null ? genericSuperclass : Object.class);
        Type[] genericInterfaces = this.f15082a.getGenericInterfaces();
        AbstractC4862t.d(genericInterfaces, "klass.genericInterfaces");
        q10.b(genericInterfaces);
        List listN = C4206t.n(q10.d(new Type[q10.c()]));
        ArrayList arrayList = new ArrayList(C4207u.v(listN, 10));
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            arrayList.add(new n((Type) it.next()));
        }
        return arrayList;
    }

    @Override // bd.InterfaceC2915g
    public boolean p() throws IllegalAccessException, InvocationTargetException {
        Boolean boolE = C2114b.f15057a.e(this.f15082a);
        if (boolE != null) {
            return boolE.booleanValue();
        }
        return false;
    }

    @Override // bd.InterfaceC2915g
    public boolean q() {
        return false;
    }

    public String toString() {
        return l.class.getName() + ": " + this.f15082a;
    }

    @Override // bd.InterfaceC2915g
    public boolean v() {
        return this.f15082a.isEnum();
    }

    @Override // bd.InterfaceC2915g
    public boolean y() throws IllegalAccessException, InvocationTargetException {
        Boolean boolF = C2114b.f15057a.f(this.f15082a);
        if (boolF != null) {
            return boolF.booleanValue();
        }
        return false;
    }

    @Override // Rc.h, bd.InterfaceC2912d
    public List getAnnotations() {
        Annotation[] declaredAnnotations;
        List listB;
        AnnotatedElement annotatedElementR = r();
        return (annotatedElementR == null || (declaredAnnotations = annotatedElementR.getDeclaredAnnotations()) == null || (listB = i.b(declaredAnnotations)) == null) ? C4206t.k() : listB;
    }

    @Override // Rc.h, bd.InterfaceC2912d
    public Rc.e j(kd.c fqName) {
        Annotation[] declaredAnnotations;
        AbstractC4862t.e(fqName, "fqName");
        AnnotatedElement annotatedElementR = r();
        if (annotatedElementR == null || (declaredAnnotations = annotatedElementR.getDeclaredAnnotations()) == null) {
            return null;
        }
        return i.a(declaredAnnotations, fqName);
    }
}
