package Fc;

import Cc.k;
import Fc.F;
import Lc.AbstractC1192u;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1196y;
import Lc.Q;
import Lc.X;
import Lc.f0;
import gc.C4179C;
import gc.C4204q;
import gc.C4207u;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jc.C4757a;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import uc.AbstractC6017a;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: Fc.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0835j implements Cc.c, C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F.a f3891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F.a f3892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F.a f3893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F.a f3894d;

    /* JADX INFO: renamed from: Fc.j$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return L.e(AbstractC0835j.this.y());
        }
    }

    /* JADX INFO: renamed from: Fc.j$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: Fc.j$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ X f3897a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(X x10) {
                super(0);
                this.f3897a = x10;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Q invoke() {
                return this.f3897a;
            }
        }

        /* JADX INFO: renamed from: Fc.j$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0059b extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ X f3898a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0059b(X x10) {
                super(0);
                this.f3898a = x10;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Q invoke() {
                return this.f3898a;
            }
        }

        /* JADX INFO: renamed from: Fc.j$b$c */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1174b f3899a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f3900b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(InterfaceC1174b interfaceC1174b, int i10) {
                super(0);
                this.f3899a = interfaceC1174b;
                this.f3900b = i10;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Q invoke() {
                Object obj = this.f3899a.i().get(this.f3900b);
                AbstractC4862t.d(obj, "descriptor.valueParameters[i]");
                return (Q) obj;
            }
        }

        /* JADX INFO: renamed from: Fc.j$b$d */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class d implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C4757a.a(((Cc.k) obj).getName(), ((Cc.k) obj2).getName());
            }
        }

        public b() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList invoke() {
            int i10;
            InterfaceC1174b interfaceC1174bY = AbstractC0835j.this.y();
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            if (AbstractC0835j.this.A()) {
                i10 = 0;
            } else {
                X xI = L.i(interfaceC1174bY);
                if (xI != null) {
                    arrayList.add(new u(AbstractC0835j.this, 0, k.a.INSTANCE, new a(xI)));
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                X xM = interfaceC1174bY.M();
                if (xM != null) {
                    arrayList.add(new u(AbstractC0835j.this, i10, k.a.EXTENSION_RECEIVER, new C0059b(xM)));
                    i10++;
                }
            }
            int size = interfaceC1174bY.i().size();
            while (i11 < size) {
                arrayList.add(new u(AbstractC0835j.this, i10, k.a.VALUE, new c(interfaceC1174bY, i11)));
                i11++;
                i10++;
            }
            if (AbstractC0835j.this.z() && (interfaceC1174bY instanceof Wc.a) && arrayList.size() > 1) {
                gc.x.A(arrayList, new d());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: Fc.j$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: Fc.j$c$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AbstractC0835j f3902a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC0835j abstractC0835j) {
                super(0);
                this.f3902a = abstractC0835j;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Type invoke() {
                Type typeU = this.f3902a.u();
                return typeU == null ? this.f3902a.v().getReturnType() : typeU;
            }
        }

        public c() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A invoke() {
            Cd.E returnType = AbstractC0835j.this.y().getReturnType();
            AbstractC4862t.b(returnType);
            return new A(returnType, new a(AbstractC0835j.this));
        }
    }

    /* JADX INFO: renamed from: Fc.j$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public d() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List<f0> typeParameters = AbstractC0835j.this.y().getTypeParameters();
            AbstractC4862t.d(typeParameters, "descriptor.typeParameters");
            AbstractC0835j abstractC0835j = AbstractC0835j.this;
            ArrayList arrayList = new ArrayList(C4207u.v(typeParameters, 10));
            for (f0 descriptor : typeParameters) {
                AbstractC4862t.d(descriptor, "descriptor");
                arrayList.add(new B(abstractC0835j, descriptor));
            }
            return arrayList;
        }
    }

    public AbstractC0835j() {
        F.a aVarD = F.d(new a());
        AbstractC4862t.d(aVarD, "lazySoft { descriptor.computeAnnotations() }");
        this.f3891a = aVarD;
        F.a aVarD2 = F.d(new b());
        AbstractC4862t.d(aVarD2, "lazySoft {\n        val d…ze()\n        result\n    }");
        this.f3892b = aVarD2;
        F.a aVarD3 = F.d(new c());
        AbstractC4862t.d(aVarD3, "lazySoft {\n        KType…eturnType\n        }\n    }");
        this.f3893c = aVarD3;
        F.a aVarD4 = F.d(new d());
        AbstractC4862t.d(aVarD4, "lazySoft {\n        descr…this, descriptor) }\n    }");
        this.f3894d = aVarD4;
    }

    public abstract boolean A();

    @Override // Cc.c
    public Object call(Object... args) throws Dc.a {
        AbstractC4862t.e(args, "args");
        try {
            return v().call(args);
        } catch (IllegalAccessException e10) {
            throw new Dc.a(e10);
        }
    }

    @Override // Cc.c
    public Object callBy(Map args) {
        AbstractC4862t.e(args, "args");
        return z() ? r(args) : s(args, null);
    }

    @Override // Cc.b
    public List getAnnotations() {
        Object objInvoke = this.f3891a.invoke();
        AbstractC4862t.d(objInvoke, "_annotations()");
        return (List) objInvoke;
    }

    @Override // Cc.c
    public List getParameters() {
        Object objInvoke = this.f3892b.invoke();
        AbstractC4862t.d(objInvoke, "_parameters()");
        return (List) objInvoke;
    }

    @Override // Cc.c
    public Cc.p getReturnType() {
        Object objInvoke = this.f3893c.invoke();
        AbstractC4862t.d(objInvoke, "_returnType()");
        return (Cc.p) objInvoke;
    }

    @Override // Cc.c
    public List getTypeParameters() {
        Object objInvoke = this.f3894d.invoke();
        AbstractC4862t.d(objInvoke, "_typeParameters()");
        return (List) objInvoke;
    }

    @Override // Cc.c
    public Cc.t getVisibility() {
        AbstractC1192u visibility = y().getVisibility();
        AbstractC4862t.d(visibility, "descriptor.visibility");
        return L.q(visibility);
    }

    @Override // Cc.c
    public boolean isAbstract() {
        return y().r() == Lc.D.ABSTRACT;
    }

    @Override // Cc.c
    public boolean isFinal() {
        return y().r() == Lc.D.FINAL;
    }

    @Override // Cc.c
    public boolean isOpen() {
        return y().r() == Lc.D.OPEN;
    }

    public final Object r(Map map) throws Dc.a {
        Object objT;
        List<Cc.k> parameters = getParameters();
        ArrayList arrayList = new ArrayList(C4207u.v(parameters, 10));
        for (Cc.k kVar : parameters) {
            if (map.containsKey(kVar)) {
                objT = map.get(kVar);
                if (objT == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + kVar + ')');
                }
            } else if (kVar.n()) {
                objT = null;
            } else {
                if (!kVar.k()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + kVar);
                }
                objT = t(kVar.getType());
            }
            arrayList.add(objT);
        }
        Gc.e eVarX = x();
        if (eVarX != null) {
            try {
                return eVarX.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e10) {
                throw new Dc.a(e10);
            }
        }
        throw new D("This callable does not support a default call: " + y());
    }

    public final Object s(Map args, InterfaceC4988e interfaceC4988e) throws Dc.a {
        AbstractC4862t.e(args, "args");
        List parameters = getParameters();
        ArrayList arrayList = new ArrayList(parameters.size());
        ArrayList arrayList2 = new ArrayList(1);
        Iterator it = parameters.iterator();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (interfaceC4988e != null) {
                    arrayList.add(interfaceC4988e);
                }
                if (!z10) {
                    Object[] array = arrayList.toArray(new Object[0]);
                    return call(Arrays.copyOf(array, array.length));
                }
                arrayList2.add(Integer.valueOf(i11));
                Gc.e eVarX = x();
                if (eVarX == null) {
                    throw new D("This callable does not support a default call: " + y());
                }
                arrayList.addAll(arrayList2);
                arrayList.add(null);
                try {
                    return eVarX.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e10) {
                    throw new Dc.a(e10);
                }
            }
            Cc.k kVar = (Cc.k) it.next();
            if (i10 != 0 && i10 % 32 == 0) {
                arrayList2.add(Integer.valueOf(i11));
                i11 = 0;
            }
            if (args.containsKey(kVar)) {
                arrayList.add(args.get(kVar));
            } else if (kVar.n()) {
                arrayList.add(L.k(kVar.getType()) ? null : L.g(Ec.c.f(kVar.getType())));
                i11 = (1 << (i10 % 32)) | i11;
                z10 = true;
            } else {
                if (!kVar.k()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + kVar);
                }
                arrayList.add(t(kVar.getType()));
            }
            if (kVar.f() == k.a.VALUE) {
                i10++;
            }
        }
    }

    public final Object t(Cc.p pVar) {
        Class clsB = AbstractC6017a.b(Ec.b.b(pVar));
        if (clsB.isArray()) {
            Object objNewInstance = Array.newInstance(clsB.getComponentType(), 0);
            AbstractC4862t.d(objNewInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return objNewInstance;
        }
        throw new D("Cannot instantiate the default empty array of type " + clsB.getSimpleName() + ", because it is not an array type");
    }

    public final Type u() {
        Type[] lowerBounds;
        InterfaceC1174b interfaceC1174bY = y();
        InterfaceC1196y interfaceC1196y = interfaceC1174bY instanceof InterfaceC1196y ? (InterfaceC1196y) interfaceC1174bY : null;
        if (interfaceC1196y != null && interfaceC1196y.isSuspend()) {
            Object objU0 = C4179C.u0(v().a());
            ParameterizedType parameterizedType = objU0 instanceof ParameterizedType ? (ParameterizedType) objU0 : null;
            if (AbstractC4862t.a(parameterizedType != null ? parameterizedType.getRawType() : null, InterfaceC4988e.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                AbstractC4862t.d(actualTypeArguments, "continuationType.actualTypeArguments");
                Object objY0 = C4204q.y0(actualTypeArguments);
                WildcardType wildcardType = objY0 instanceof WildcardType ? (WildcardType) objY0 : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) C4204q.U(lowerBounds);
                }
            }
        }
        return null;
    }

    public abstract Gc.e v();

    public abstract n w();

    public abstract Gc.e x();

    public abstract InterfaceC1174b y();

    public final boolean z() {
        return AbstractC4862t.a(getName(), "<init>") && w().d().isAnnotation();
    }
}
