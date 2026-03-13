package ge;

import ce.InterfaceC3118a;
import fe.InterfaceC4047c;
import fe.InterfaceC4049e;
import gc.C4179C;
import gc.C4206t;
import java.util.ArrayList;
import je.AbstractC4771b;
import je.AbstractC4772c;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z0 implements InterfaceC4049e, InterfaceC4047c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f35777b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35778c;

    public static final Object L(z0 z0Var, InterfaceC3118a interfaceC3118a, Object obj) {
        return (interfaceC3118a.getDescriptor().b() || z0Var.F()) ? z0Var.N(interfaceC3118a, obj) : z0Var.i();
    }

    public static final Object M(z0 z0Var, InterfaceC3118a interfaceC3118a, Object obj) {
        return z0Var.N(interfaceC3118a, obj);
    }

    @Override // fe.InterfaceC4047c
    public final Object A(ee.e descriptor, int i10, final InterfaceC3118a deserializer, final Object obj) {
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(deserializer, "deserializer");
        return g0(c0(descriptor, i10), new InterfaceC6082a() { // from class: ge.y0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return z0.L(this.f35771a, deserializer, obj);
            }
        });
    }

    @Override // fe.InterfaceC4047c
    public final double B(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return R(c0(descriptor, i10));
    }

    @Override // fe.InterfaceC4049e
    public final String D() {
        return Z(e0());
    }

    @Override // fe.InterfaceC4047c
    public final byte E(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return P(c0(descriptor, i10));
    }

    @Override // fe.InterfaceC4049e
    public boolean F() {
        Object objB0 = b0();
        if (objB0 == null) {
            return false;
        }
        return X(objB0);
    }

    @Override // fe.InterfaceC4049e
    public final byte G() {
        return P(e0());
    }

    @Override // fe.InterfaceC4047c
    public final Object H(ee.e descriptor, int i10, final InterfaceC3118a deserializer, final Object obj) {
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(deserializer, "deserializer");
        return g0(c0(descriptor, i10), new InterfaceC6082a() { // from class: ge.x0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return z0.M(this.f35766a, deserializer, obj);
            }
        });
    }

    @Override // fe.InterfaceC4047c
    public final int I(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return V(c0(descriptor, i10));
    }

    public Object N(InterfaceC3118a deserializer, Object obj) {
        AbstractC4862t.e(deserializer, "deserializer");
        return n(deserializer);
    }

    public boolean O(Object obj) {
        Object objA0 = a0(obj);
        AbstractC4862t.c(objA0, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objA0).booleanValue();
    }

    public byte P(Object obj) {
        Object objA0 = a0(obj);
        AbstractC4862t.c(objA0, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) objA0).byteValue();
    }

    public char Q(Object obj) {
        Object objA0 = a0(obj);
        AbstractC4862t.c(objA0, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objA0).charValue();
    }

    public double R(Object obj) {
        Object objA0 = a0(obj);
        AbstractC4862t.c(objA0, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objA0).doubleValue();
    }

    public int S(Object obj, ee.e enumDescriptor) {
        AbstractC4862t.e(enumDescriptor, "enumDescriptor");
        Object objA0 = a0(obj);
        AbstractC4862t.c(objA0, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objA0).intValue();
    }

    public float T(Object obj) {
        Object objA0 = a0(obj);
        AbstractC4862t.c(objA0, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objA0).floatValue();
    }

    public InterfaceC4049e U(Object obj, ee.e inlineDescriptor) {
        AbstractC4862t.e(inlineDescriptor, "inlineDescriptor");
        f0(obj);
        return this;
    }

    public int V(Object obj) {
        Object objA0 = a0(obj);
        AbstractC4862t.c(objA0, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objA0).intValue();
    }

    public long W(Object obj) {
        Object objA0 = a0(obj);
        AbstractC4862t.c(objA0, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objA0).longValue();
    }

    public boolean X(Object obj) {
        return true;
    }

    public short Y(Object obj) {
        Object objA0 = a0(obj);
        AbstractC4862t.c(objA0, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) objA0).shortValue();
    }

    public String Z(Object obj) {
        Object objA0 = a0(obj);
        AbstractC4862t.c(objA0, "null cannot be cast to non-null type kotlin.String");
        return (String) objA0;
    }

    @Override // fe.InterfaceC4049e
    public InterfaceC4047c a(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        return this;
    }

    public Object a0(Object obj) {
        throw new ce.f(kotlin.jvm.internal.M.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // fe.InterfaceC4047c
    public AbstractC4771b b() {
        return AbstractC4772c.a();
    }

    public final Object b0() {
        return C4179C.u0(this.f35777b);
    }

    @Override // fe.InterfaceC4047c
    public void c(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
    }

    public abstract Object c0(ee.e eVar, int i10);

    public final ArrayList d0() {
        return this.f35777b;
    }

    @Override // fe.InterfaceC4047c
    public final long e(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return W(c0(descriptor, i10));
    }

    public final Object e0() {
        ArrayList arrayList = this.f35777b;
        Object objRemove = arrayList.remove(C4206t.m(arrayList));
        this.f35778c = true;
        return objRemove;
    }

    @Override // fe.InterfaceC4049e
    public final int f(ee.e enumDescriptor) {
        AbstractC4862t.e(enumDescriptor, "enumDescriptor");
        return S(e0(), enumDescriptor);
    }

    public final void f0(Object obj) {
        this.f35777b.add(obj);
    }

    public final Object g0(Object obj, InterfaceC6082a interfaceC6082a) {
        f0(obj);
        Object objInvoke = interfaceC6082a.invoke();
        if (!this.f35778c) {
            e0();
        }
        this.f35778c = false;
        return objInvoke;
    }

    @Override // fe.InterfaceC4049e
    public final int h() {
        return V(e0());
    }

    @Override // fe.InterfaceC4049e
    public final Void i() {
        return null;
    }

    @Override // fe.InterfaceC4047c
    public final short k(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return Y(c0(descriptor, i10));
    }

    @Override // fe.InterfaceC4047c
    public final boolean l(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return O(c0(descriptor, i10));
    }

    @Override // fe.InterfaceC4049e
    public final long m() {
        return W(e0());
    }

    @Override // fe.InterfaceC4049e
    public Object n(InterfaceC3118a interfaceC3118a) {
        return super.n(interfaceC3118a);
    }

    @Override // fe.InterfaceC4047c
    public final char o(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return Q(c0(descriptor, i10));
    }

    @Override // fe.InterfaceC4047c
    public final float p(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return T(c0(descriptor, i10));
    }

    @Override // fe.InterfaceC4047c
    public boolean q() {
        return super.q();
    }

    @Override // fe.InterfaceC4047c
    public final InterfaceC4049e r(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return U(c0(descriptor, i10), descriptor.h(i10));
    }

    @Override // fe.InterfaceC4047c
    public int s(ee.e eVar) {
        return super.s(eVar);
    }

    @Override // fe.InterfaceC4049e
    public final short t() {
        return Y(e0());
    }

    @Override // fe.InterfaceC4049e
    public final float u() {
        return T(e0());
    }

    @Override // fe.InterfaceC4047c
    public final String v(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return Z(c0(descriptor, i10));
    }

    @Override // fe.InterfaceC4049e
    public final double w() {
        return R(e0());
    }

    @Override // fe.InterfaceC4049e
    public InterfaceC4049e x(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        return U(e0(), descriptor);
    }

    @Override // fe.InterfaceC4049e
    public final boolean y() {
        return O(e0());
    }

    @Override // fe.InterfaceC4049e
    public final char z() {
        return Q(e0());
    }
}
