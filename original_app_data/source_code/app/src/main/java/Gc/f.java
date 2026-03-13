package Gc;

import Gc.e;
import fc.C4015H;
import gc.C4202o;
import gc.C4204q;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.Q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f implements Gc.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f4704e = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Member f4705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f4706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f4707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f4708d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends f implements Gc.d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Object f4709f;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Constructor constructor, Object obj) {
            AbstractC4862t.e(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            AbstractC4862t.d(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            AbstractC4862t.d(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : C4202o.u(genericParameterTypes, 1, genericParameterTypes.length - 1)), null);
            this.f4709f = obj;
        }

        @Override // Gc.e
        public Object call(Object[] args) {
            AbstractC4862t.e(args, "args");
            b(args);
            Constructor constructor = (Constructor) getMember();
            Q q10 = new Q(3);
            q10.a(this.f4709f);
            q10.b(args);
            q10.a(null);
            return constructor.newInstance(q10.d(new Object[q10.c()]));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends f {
        /* JADX WARN: Illegal instructions before constructor call */
        public b(Constructor constructor) {
            AbstractC4862t.e(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            AbstractC4862t.d(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            AbstractC4862t.d(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : C4202o.u(genericParameterTypes, 0, genericParameterTypes.length - 1)), null);
        }

        @Override // Gc.e
        public Object call(Object[] args) {
            AbstractC4862t.e(args, "args");
            b(args);
            Constructor constructor = (Constructor) getMember();
            Q q10 = new Q(2);
            q10.b(args);
            q10.a(null);
            return constructor.newInstance(q10.d(new Object[q10.c()]));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends f implements Gc.d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Object f4710f;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(Constructor constructor, Object obj) {
            AbstractC4862t.e(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            AbstractC4862t.d(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            AbstractC4862t.d(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.f4710f = obj;
        }

        @Override // Gc.e
        public Object call(Object[] args) {
            AbstractC4862t.e(args, "args");
            b(args);
            Constructor constructor = (Constructor) getMember();
            Q q10 = new Q(2);
            q10.a(this.f4710f);
            q10.b(args);
            return constructor.newInstance(q10.d(new Object[q10.c()]));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {
        public /* synthetic */ d(AbstractC4854k abstractC4854k) {
            this();
        }

        public d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends f {
        /* JADX WARN: Illegal instructions before constructor call */
        public e(Constructor constructor) {
            AbstractC4862t.e(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            AbstractC4862t.d(declaringClass, "constructor.declaringClass");
            Class declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            Class<?> cls = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            AbstractC4862t.d(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, cls, genericParameterTypes, null);
        }

        @Override // Gc.e
        public Object call(Object[] args) {
            AbstractC4862t.e(args, "args");
            b(args);
            return ((Constructor) getMember()).newInstance(Arrays.copyOf(args, args.length));
        }
    }

    /* JADX INFO: renamed from: Gc.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class AbstractC0078f extends f {

        /* JADX INFO: renamed from: Gc.f$f$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends AbstractC0078f implements Gc.d {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final Object f4711f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false, null);
                AbstractC4862t.e(field, "field");
                this.f4711f = obj;
            }

            @Override // Gc.f.AbstractC0078f, Gc.e
            public Object call(Object[] args) {
                AbstractC4862t.e(args, "args");
                b(args);
                return ((Field) getMember()).get(this.f4711f);
            }
        }

        /* JADX INFO: renamed from: Gc.f$f$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends AbstractC0078f implements Gc.d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false, null);
                AbstractC4862t.e(field, "field");
            }
        }

        /* JADX INFO: renamed from: Gc.f$f$c */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c extends AbstractC0078f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true, null);
                AbstractC4862t.e(field, "field");
            }
        }

        /* JADX INFO: renamed from: Gc.f$f$d */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class d extends AbstractC0078f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true, null);
                AbstractC4862t.e(field, "field");
            }

            @Override // Gc.f
            public void b(Object[] args) {
                AbstractC4862t.e(args, "args");
                super.b(args);
                c(C4204q.V(args));
            }
        }

        /* JADX INFO: renamed from: Gc.f$f$e */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class e extends AbstractC0078f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field) {
                super(field, false, null);
                AbstractC4862t.e(field, "field");
            }
        }

        public /* synthetic */ AbstractC0078f(Field field, boolean z10, AbstractC4854k abstractC4854k) {
            this(field, z10);
        }

        @Override // Gc.e
        public Object call(Object[] args) {
            AbstractC4862t.e(args, "args");
            b(args);
            return ((Field) getMember()).get(d() != null ? C4204q.U(args) : null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public AbstractC0078f(Field field, boolean z10) {
            Type genericType = field.getGenericType();
            AbstractC4862t.d(genericType, "field.genericType");
            super(field, genericType, z10 ? field.getDeclaringClass() : null, new Type[0], null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class g extends f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f4712f;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends g implements Gc.d {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Object f4713g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z10, Object obj) {
                super(field, z10, false, null);
                AbstractC4862t.e(field, "field");
                this.f4713g = obj;
            }

            @Override // Gc.f.g, Gc.e
            public Object call(Object[] args) throws IllegalAccessException {
                AbstractC4862t.e(args, "args");
                b(args);
                ((Field) getMember()).set(this.f4713g, C4204q.U(args));
                return C4015H.f34254a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends g implements Gc.d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z10) {
                super(field, z10, false, null);
                AbstractC4862t.e(field, "field");
            }

            @Override // Gc.f.g, Gc.e
            public Object call(Object[] args) throws IllegalAccessException {
                AbstractC4862t.e(args, "args");
                b(args);
                ((Field) getMember()).set(null, C4204q.t0(args));
                return C4015H.f34254a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z10) {
                super(field, z10, true, null);
                AbstractC4862t.e(field, "field");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z10) {
                super(field, z10, true, null);
                AbstractC4862t.e(field, "field");
            }

            @Override // Gc.f.g, Gc.f
            public void b(Object[] args) {
                AbstractC4862t.e(args, "args");
                super.b(args);
                c(C4204q.V(args));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z10) {
                super(field, z10, false, null);
                AbstractC4862t.e(field, "field");
            }
        }

        public /* synthetic */ g(Field field, boolean z10, boolean z11, AbstractC4854k abstractC4854k) {
            this(field, z10, z11);
        }

        @Override // Gc.f
        public void b(Object[] args) {
            AbstractC4862t.e(args, "args");
            super.b(args);
            if (this.f4712f && C4204q.t0(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // Gc.e
        public Object call(Object[] args) throws IllegalAccessException {
            AbstractC4862t.e(args, "args");
            b(args);
            ((Field) getMember()).set(d() != null ? C4204q.U(args) : null, C4204q.t0(args));
            return C4015H.f34254a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public g(Field field, boolean z10, boolean z11) {
            Class TYPE = Void.TYPE;
            AbstractC4862t.d(TYPE, "TYPE");
            Class<?> declaringClass = z11 ? field.getDeclaringClass() : null;
            Type genericType = field.getGenericType();
            AbstractC4862t.d(genericType, "field.genericType");
            super(field, TYPE, declaringClass, new Type[]{genericType}, null);
            this.f4712f = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class h extends f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f4714f;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends h implements Gc.d {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Object f4715g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, null, 4, null);
                AbstractC4862t.e(method, "method");
                this.f4715g = obj;
            }

            @Override // Gc.e
            public Object call(Object[] args) {
                AbstractC4862t.e(args, "args");
                b(args);
                return e(this.f4715g, args);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends h implements Gc.d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, null, 4, null);
                AbstractC4862t.e(method, "method");
            }

            @Override // Gc.e
            public Object call(Object[] args) {
                AbstractC4862t.e(args, "args");
                b(args);
                return e(null, args);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c extends h implements Gc.d {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Object f4716g;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(Method method, Object obj) {
                AbstractC4862t.e(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                AbstractC4862t.d(genericParameterTypes, "method.genericParameterTypes");
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : C4202o.u(genericParameterTypes, 1, genericParameterTypes.length)), null);
                this.f4716g = obj;
            }

            @Override // Gc.e
            public Object call(Object[] args) {
                AbstractC4862t.e(args, "args");
                b(args);
                Q q10 = new Q(2);
                q10.a(this.f4716g);
                q10.b(args);
                return e(null, q10.d(new Object[q10.c()]));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class d extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Method method) {
                super(method, false, null, 6, null);
                AbstractC4862t.e(method, "method");
            }

            @Override // Gc.e
            public Object call(Object[] args) {
                AbstractC4862t.e(args, "args");
                b(args);
                return e(args[0], args.length <= 1 ? new Object[0] : C4202o.u(args, 1, args.length));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class e extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, true, null, 4, null);
                AbstractC4862t.e(method, "method");
            }

            @Override // Gc.e
            public Object call(Object[] args) {
                AbstractC4862t.e(args, "args");
                b(args);
                c(C4204q.V(args));
                return e(null, args.length <= 1 ? new Object[0] : C4202o.u(args, 1, args.length));
            }
        }

        /* JADX INFO: renamed from: Gc.f$h$f, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0079f extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0079f(Method method) {
                super(method, false, null, 6, null);
                AbstractC4862t.e(method, "method");
            }

            @Override // Gc.e
            public Object call(Object[] args) {
                AbstractC4862t.e(args, "args");
                b(args);
                return e(null, args);
            }
        }

        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, AbstractC4854k abstractC4854k) {
            this(method, z10, typeArr);
        }

        public final Object e(Object obj, Object[] args) {
            AbstractC4862t.e(args, "args");
            return this.f4714f ? C4015H.f34254a : ((Method) getMember()).invoke(obj, Arrays.copyOf(args, args.length));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, int i10, AbstractC4854k abstractC4854k) {
            z10 = (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10;
            if ((i10 & 4) != 0) {
                typeArr = method.getGenericParameterTypes();
                AbstractC4862t.d(typeArr, "method.genericParameterTypes");
            }
            this(method, z10, typeArr, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public h(Method method, boolean z10, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            AbstractC4862t.d(genericReturnType, "method.genericReturnType");
            super(method, genericReturnType, z10 ? method.getDeclaringClass() : null, typeArr, null);
            this.f4714f = AbstractC4862t.a(getReturnType(), Void.TYPE);
        }
    }

    public /* synthetic */ f(Member member, Type type, Class cls, Type[] typeArr, AbstractC4854k abstractC4854k) {
        this(member, type, cls, typeArr);
    }

    @Override // Gc.e
    public List a() {
        return this.f4708d;
    }

    public void b(Object[] objArr) {
        e.a.a(this, objArr);
    }

    public final void c(Object obj) {
        if (obj == null || !this.f4705a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public final Class d() {
        return this.f4707c;
    }

    @Override // Gc.e
    public final Member getMember() {
        return this.f4705a;
    }

    @Override // Gc.e
    public final Type getReturnType() {
        return this.f4706b;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(java.lang.reflect.Member r1, java.lang.reflect.Type r2, java.lang.Class r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f4705a = r1
            r0.f4706b = r2
            r0.f4707c = r3
            if (r3 == 0) goto L27
            kotlin.jvm.internal.Q r1 = new kotlin.jvm.internal.Q
            r2 = 2
            r1.<init>(r2)
            r1.a(r3)
            r1.b(r4)
            int r2 = r1.c()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.d(r2)
            java.util.List r1 = gc.C4206t.n(r1)
            if (r1 != 0) goto L2b
        L27:
            java.util.List r1 = gc.C4204q.O0(r4)
        L2b:
            r0.f4708d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Gc.f.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }
}
