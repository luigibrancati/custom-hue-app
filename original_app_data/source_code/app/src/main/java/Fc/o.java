package Fc;

import Fc.AbstractC0833h;
import Fc.F;
import Fc.InterfaceC0832g;
import Gc.a;
import Gc.f;
import Lc.InterfaceC1196y;
import fc.C4032o;
import gc.C4207u;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4849f;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.InterfaceC4858o;
import td.AbstractC5879b;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends AbstractC0835j implements InterfaceC4858o, Cc.h, InterfaceC0832g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f3966k = {kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(o.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(o.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(o.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f3967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final F.a f3970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final F.b f3971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final F.b f3972j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Gc.e invoke() {
            Object objB;
            Gc.e eVarH;
            AbstractC0833h abstractC0833hG = I.f3848a.g(o.this.y());
            if (abstractC0833hG instanceof AbstractC0833h.d) {
                if (o.this.z()) {
                    Class clsD = o.this.w().d();
                    List parameters = o.this.getParameters();
                    ArrayList arrayList = new ArrayList(C4207u.v(parameters, 10));
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        String name = ((Cc.k) it.next()).getName();
                        AbstractC4862t.b(name);
                        arrayList.add(name);
                    }
                    return new Gc.a(clsD, arrayList, a.EnumC0077a.POSITIONAL_CALL, a.b.KOTLIN, null, 16, null);
                }
                objB = o.this.w().r(((AbstractC0833h.d) abstractC0833hG).b());
            } else if (abstractC0833hG instanceof AbstractC0833h.e) {
                AbstractC0833h.e eVar = (AbstractC0833h.e) abstractC0833hG;
                objB = o.this.w().v(eVar.c(), eVar.b());
            } else if (abstractC0833hG instanceof AbstractC0833h.c) {
                objB = ((AbstractC0833h.c) abstractC0833hG).b();
            } else {
                if (!(abstractC0833hG instanceof AbstractC0833h.b)) {
                    if (!(abstractC0833hG instanceof AbstractC0833h.a)) {
                        throw new C4032o();
                    }
                    List listB = ((AbstractC0833h.a) abstractC0833hG).b();
                    Class clsD2 = o.this.w().d();
                    ArrayList arrayList2 = new ArrayList(C4207u.v(listB, 10));
                    Iterator it2 = listB.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Method) it2.next()).getName());
                    }
                    return new Gc.a(clsD2, arrayList2, a.EnumC0077a.POSITIONAL_CALL, a.b.JAVA, listB);
                }
                objB = ((AbstractC0833h.b) abstractC0833hG).b();
            }
            if (objB instanceof Constructor) {
                o oVar = o.this;
                eVarH = oVar.G((Constructor) objB, oVar.y(), false);
            } else {
                if (!(objB instanceof Method)) {
                    throw new D("Could not compute caller for function: " + o.this.y() + " (member = " + objB + ')');
                }
                Method method = (Method) objB;
                eVarH = !Modifier.isStatic(method.getModifiers()) ? o.this.H(method) : o.this.y().getAnnotations().j(L.j()) != null ? o.this.I(method) : o.this.J(method);
            }
            return Gc.i.c(eVarH, o.this.y(), false, 2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public b() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0128  */
        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final Gc.e invoke() {
            /*
                Method dump skipped, instruction units count: 320
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Fc.o.b.invoke():Gc.e");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f3976b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f3976b = str;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1196y invoke() {
            return o.this.w().u(this.f3976b, o.this.f3968f);
        }
    }

    public /* synthetic */ o(n nVar, String str, String str2, InterfaceC1196y interfaceC1196y, Object obj, int i10, AbstractC4854k abstractC4854k) {
        this(nVar, str, str2, interfaceC1196y, (i10 & 16) != 0 ? AbstractC4849f.NO_RECEIVER : obj);
    }

    private final Object K() {
        return Gc.i.a(this.f3969g, y());
    }

    @Override // Fc.AbstractC0835j
    public boolean A() {
        return !AbstractC4862t.a(this.f3969g, AbstractC4849f.NO_RECEIVER);
    }

    public final Gc.f G(Constructor constructor, InterfaceC1196y interfaceC1196y, boolean z10) {
        return (z10 || !AbstractC5879b.f(interfaceC1196y)) ? A() ? new f.c(constructor, K()) : new f.e(constructor) : A() ? new f.a(constructor, K()) : new f.b(constructor);
    }

    public final f.h H(Method method) {
        return A() ? new f.h.a(method, K()) : new f.h.d(method);
    }

    public final f.h I(Method method) {
        return A() ? new f.h.b(method) : new f.h.e(method);
    }

    public final f.h J(Method method) {
        return A() ? new f.h.c(method, K()) : new f.h.C0079f(method);
    }

    @Override // Fc.AbstractC0835j
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public InterfaceC1196y y() {
        Object objB = this.f3970h.b(this, f3966k[0]);
        AbstractC4862t.d(objB, "<get-descriptor>(...)");
        return (InterfaceC1196y) objB;
    }

    @Override // vc.t
    public Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return InterfaceC0832g.a.g(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    public boolean equals(Object obj) {
        o oVarC = L.c(obj);
        return oVarC != null && AbstractC4862t.a(w(), oVarC.w()) && AbstractC4862t.a(getName(), oVarC.getName()) && AbstractC4862t.a(this.f3968f, oVarC.f3968f) && AbstractC4862t.a(this.f3969g, oVarC.f3969g);
    }

    @Override // kotlin.jvm.internal.InterfaceC4858o
    public int getArity() {
        return Gc.g.a(v());
    }

    @Override // Cc.c
    public String getName() {
        String strB = y().getName().b();
        AbstractC4862t.d(strB, "descriptor.name.asString()");
        return strB;
    }

    public int hashCode() {
        return (((w().hashCode() * 31) + getName().hashCode()) * 31) + this.f3968f.hashCode();
    }

    @Override // vc.InterfaceC6082a
    public Object invoke() {
        return InterfaceC0832g.a.a(this);
    }

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

    public String toString() {
        return H.f3843a.d(y());
    }

    @Override // Fc.AbstractC0835j
    public Gc.e v() {
        Object objB = this.f3971i.b(this, f3966k[1]);
        AbstractC4862t.d(objB, "<get-caller>(...)");
        return (Gc.e) objB;
    }

    @Override // Fc.AbstractC0835j
    public n w() {
        return this.f3967e;
    }

    @Override // Fc.AbstractC0835j
    public Gc.e x() {
        return (Gc.e) this.f3972j.b(this, f3966k[2]);
    }

    @Override // vc.l
    public Object invoke(Object obj) {
        return InterfaceC0832g.a.b(this, obj);
    }

    public o(n nVar, String str, String str2, InterfaceC1196y interfaceC1196y, Object obj) {
        this.f3967e = nVar;
        this.f3968f = str2;
        this.f3969g = obj;
        this.f3970h = F.c(interfaceC1196y, new c(str));
        this.f3971i = F.b(new a());
        this.f3972j = F.b(new b());
    }

    @Override // vc.p
    public Object invoke(Object obj, Object obj2) {
        return InterfaceC0832g.a.c(this, obj, obj2);
    }

    @Override // vc.q
    public Object invoke(Object obj, Object obj2, Object obj3) {
        return InterfaceC0832g.a.d(this, obj, obj2, obj3);
    }

    @Override // vc.r
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return InterfaceC0832g.a.e(this, obj, obj2, obj3, obj4);
    }

    @Override // vc.s
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return InterfaceC0832g.a.f(this, obj, obj2, obj3, obj4, obj5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(n container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(n container, InterfaceC1196y descriptor) {
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(descriptor, "descriptor");
        String strB = descriptor.getName().b();
        AbstractC4862t.d(strB, "descriptor.name.asString()");
        this(container, strB, I.f3848a.g(descriptor).a(), descriptor, null, 16, null);
    }
}
