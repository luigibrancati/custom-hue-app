package Fc;

import Cc.i;
import Cc.l;
import Fc.AbstractC0834i;
import Fc.F;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1185m;
import Lc.T;
import Lc.U;
import Lc.V;
import Lc.W;
import Mc.g;
import fc.C4032o;
import id.AbstractC4376a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import jd.AbstractC4763d;
import jd.C4768i;
import kotlin.jvm.internal.AbstractC4849f;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import od.AbstractC5282d;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y extends AbstractC0835j implements Cc.l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f4027k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f4028l = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f4029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f4032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final F.b f4033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final F.a f4034j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a extends AbstractC0835j implements Cc.h, l.a {
        @Override // Fc.AbstractC0835j
        public boolean A() {
            return i().A();
        }

        /* JADX INFO: renamed from: B */
        public abstract T y();

        /* JADX INFO: renamed from: C */
        public abstract y i();

        @Override // Cc.h
        public boolean isExternal() {
            return y().isExternal();
        }

        @Override // Cc.h
        public boolean isInfix() {
            return y().isInfix();
        }

        @Override // Cc.h
        public boolean isInline() {
            return y().isInline();
        }

        @Override // Cc.h
        public boolean isOperator() {
            return y().isOperator();
        }

        @Override // Cc.h
        public boolean isSuspend() {
            return y().isSuspend();
        }

        @Override // Fc.AbstractC0835j
        public n w() {
            return i().w();
        }

        @Override // Fc.AbstractC0835j
        public Gc.e x() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c extends a implements l.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ Cc.l[] f4035g = {kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(c.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final F.a f4036e = F.d(new b());

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final F.b f4037f = F.b(new a());

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {
            public a() {
                super(0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Gc.e invoke() {
                return z.b(c.this, true);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {
            public b() {
                super(0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final V invoke() {
                V vG = c.this.i().y().g();
                return vG == null ? AbstractC5282d.d(c.this.i().y(), Mc.g.f9435K.b()) : vG;
            }
        }

        @Override // Fc.AbstractC0835j
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public V y() {
            Object objB = this.f4036e.b(this, f4035g[0]);
            AbstractC4862t.d(objB, "<get-descriptor>(...)");
            return (V) objB;
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && AbstractC4862t.a(i(), ((c) obj).i());
        }

        @Override // Cc.c
        public String getName() {
            return "<get-" + i().getName() + '>';
        }

        public int hashCode() {
            return i().hashCode();
        }

        public String toString() {
            return "getter of " + i();
        }

        @Override // Fc.AbstractC0835j
        public Gc.e v() {
            Object objB = this.f4037f.b(this, f4035g[1]);
            AbstractC4862t.d(objB, "<get-caller>(...)");
            return (Gc.e) objB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class d extends a implements i.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ Cc.l[] f4040g = {kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(d.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(d.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final F.a f4041e = F.d(new b());

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final F.b f4042f = F.b(new a());

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {
            public a() {
                super(0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Gc.e invoke() {
                return z.b(d.this, false);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {
            public b() {
                super(0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final W invoke() {
                W wH = d.this.i().y().h();
                if (wH != null) {
                    return wH;
                }
                U uY = d.this.i().y();
                g.a aVar = Mc.g.f9435K;
                return AbstractC5282d.e(uY, aVar.b(), aVar.b());
            }
        }

        @Override // Fc.AbstractC0835j
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public W y() {
            Object objB = this.f4041e.b(this, f4040g[0]);
            AbstractC4862t.d(objB, "<get-descriptor>(...)");
            return (W) objB;
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && AbstractC4862t.a(i(), ((d) obj).i());
        }

        @Override // Cc.c
        public String getName() {
            return "<set-" + i().getName() + '>';
        }

        public int hashCode() {
            return i().hashCode();
        }

        public String toString() {
            return "setter of " + i();
        }

        @Override // Fc.AbstractC0835j
        public Gc.e v() {
            Object objB = this.f4042f.b(this, f4040g[1]);
            AbstractC4862t.d(objB, "<get-caller>(...)");
            return (Gc.e) objB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public e() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U invoke() {
            return y.this.w().w(y.this.getName(), y.this.H());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public f() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        public final Field invoke() {
            Class<?> enclosingClass;
            AbstractC0834i abstractC0834iF = I.f3848a.f(y.this.y());
            if (!(abstractC0834iF instanceof AbstractC0834i.c)) {
                if (abstractC0834iF instanceof AbstractC0834i.a) {
                    return ((AbstractC0834i.a) abstractC0834iF).b();
                }
                if ((abstractC0834iF instanceof AbstractC0834i.b) || (abstractC0834iF instanceof AbstractC0834i.d)) {
                    return null;
                }
                throw new C4032o();
            }
            AbstractC0834i.c cVar = (AbstractC0834i.c) abstractC0834iF;
            U uB = cVar.b();
            AbstractC4763d.a aVarD = C4768i.d(C4768i.f39178a, cVar.e(), cVar.d(), cVar.g(), false, 8, null);
            if (aVarD == null) {
                return null;
            }
            y yVar = y.this;
            if (Uc.k.e(uB) || C4768i.f(cVar.e())) {
                enclosingClass = yVar.w().d().getEnclosingClass();
            } else {
                InterfaceC1185m interfaceC1185mB = uB.b();
                enclosingClass = interfaceC1185mB instanceof InterfaceC1177e ? L.p((InterfaceC1177e) interfaceC1185mB) : yVar.w().d();
            }
            if (enclosingClass == null) {
                return null;
            }
            try {
                return enclosingClass.getDeclaredField(aVarD.c());
            } catch (NoSuchFieldException unused) {
                return null;
            }
        }
    }

    public y(n nVar, String str, String str2, U u10, Object obj) {
        this.f4029e = nVar;
        this.f4030f = str;
        this.f4031g = str2;
        this.f4032h = obj;
        F.b bVarB = F.b(new f());
        AbstractC4862t.d(bVarB, "lazy {\n        when (val…y -> null\n        }\n    }");
        this.f4033i = bVarB;
        F.a aVarC = F.c(u10, new e());
        AbstractC4862t.d(aVarC, "lazySoft(descriptorIniti…or(name, signature)\n    }");
        this.f4034j = aVarC;
    }

    @Override // Fc.AbstractC0835j
    public boolean A() {
        return !AbstractC4862t.a(this.f4032h, AbstractC4849f.NO_RECEIVER);
    }

    public final Member B() {
        if (!y().A()) {
            return null;
        }
        AbstractC0834i abstractC0834iF = I.f3848a.f(y());
        if (abstractC0834iF instanceof AbstractC0834i.c) {
            AbstractC0834i.c cVar = (AbstractC0834i.c) abstractC0834iF;
            if (cVar.f().y()) {
                AbstractC4376a.c cVarT = cVar.f().t();
                if (!cVarT.t() || !cVarT.s()) {
                    return null;
                }
                return w().v(cVar.d().getString(cVarT.r()), cVar.d().getString(cVarT.q()));
            }
        }
        return G();
    }

    public final Object C() {
        return Gc.i.a(this.f4032h, y());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object D(Member member, Object obj, Object obj2) throws Dc.b {
        try {
            Object obj3 = f4028l;
            if ((obj == obj3 || obj2 == obj3) && y().M() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objC = A() ? C() : obj;
            if (objC == obj3) {
                objC = null;
            }
            if (!A()) {
                obj = obj2;
            }
            if (obj == obj3) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(Ec.a.a(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objC);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objC == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    AbstractC4862t.d(cls, "fieldOrMethod.parameterTypes[0]");
                    objC = L.g(cls);
                }
                return method.invoke(null, objC);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                AbstractC4862t.d(cls2, "fieldOrMethod.parameterTypes[1]");
                obj = L.g(cls2);
            }
            return method2.invoke(null, objC, obj);
        } catch (IllegalAccessException e10) {
            throw new Dc.b(e10);
        }
    }

    @Override // Fc.AbstractC0835j
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public U y() {
        Object objInvoke = this.f4034j.invoke();
        AbstractC4862t.d(objInvoke, "_descriptor()");
        return (U) objInvoke;
    }

    /* JADX INFO: renamed from: F */
    public abstract c g();

    public final Field G() {
        return (Field) this.f4033i.invoke();
    }

    public final String H() {
        return this.f4031g;
    }

    public boolean equals(Object obj) {
        y yVarD = L.d(obj);
        return yVarD != null && AbstractC4862t.a(w(), yVarD.w()) && AbstractC4862t.a(getName(), yVarD.getName()) && AbstractC4862t.a(this.f4031g, yVarD.f4031g) && AbstractC4862t.a(this.f4032h, yVarD.f4032h);
    }

    @Override // Cc.c
    public String getName() {
        return this.f4030f;
    }

    public int hashCode() {
        return (((w().hashCode() * 31) + getName().hashCode()) * 31) + this.f4031g.hashCode();
    }

    public String toString() {
        return H.f3843a.g(y());
    }

    @Override // Fc.AbstractC0835j
    public Gc.e v() {
        return g().v();
    }

    @Override // Fc.AbstractC0835j
    public n w() {
        return this.f4029e;
    }

    @Override // Fc.AbstractC0835j
    public Gc.e x() {
        return g().x();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(n container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y(n container, U descriptor) {
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(descriptor, "descriptor");
        String strB = descriptor.getName().b();
        AbstractC4862t.d(strB, "descriptor.name.asString()");
        this(container, strB, I.f3848a.f(descriptor).a(), descriptor, AbstractC4849f.NO_RECEIVER);
    }
}
