package fe;

import ce.InterfaceC3118a;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;

/* JADX INFO: renamed from: fe.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4045a implements InterfaceC4049e, InterfaceC4047c {
    @Override // fe.InterfaceC4047c
    public final Object A(ee.e descriptor, int i10, InterfaceC3118a deserializer, Object obj) {
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(deserializer, "deserializer");
        return (deserializer.getDescriptor().b() || F()) ? J(deserializer, obj) : i();
    }

    @Override // fe.InterfaceC4047c
    public final double B(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return w();
    }

    @Override // fe.InterfaceC4049e
    public String D() {
        Object objK = K();
        AbstractC4862t.c(objK, "null cannot be cast to non-null type kotlin.String");
        return (String) objK;
    }

    @Override // fe.InterfaceC4047c
    public final byte E(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return G();
    }

    @Override // fe.InterfaceC4049e
    public boolean F() {
        return true;
    }

    @Override // fe.InterfaceC4049e
    public byte G() {
        Object objK = K();
        AbstractC4862t.c(objK, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) objK).byteValue();
    }

    @Override // fe.InterfaceC4047c
    public Object H(ee.e descriptor, int i10, InterfaceC3118a deserializer, Object obj) {
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(deserializer, "deserializer");
        return J(deserializer, obj);
    }

    @Override // fe.InterfaceC4047c
    public final int I(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return h();
    }

    public Object J(InterfaceC3118a deserializer, Object obj) {
        AbstractC4862t.e(deserializer, "deserializer");
        return n(deserializer);
    }

    public Object K() {
        throw new ce.f(M.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // fe.InterfaceC4049e
    public InterfaceC4047c a(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        return this;
    }

    @Override // fe.InterfaceC4047c
    public void c(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
    }

    @Override // fe.InterfaceC4047c
    public final long e(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return m();
    }

    @Override // fe.InterfaceC4049e
    public int f(ee.e enumDescriptor) {
        AbstractC4862t.e(enumDescriptor, "enumDescriptor");
        Object objK = K();
        AbstractC4862t.c(objK, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objK).intValue();
    }

    @Override // fe.InterfaceC4049e
    public int h() {
        Object objK = K();
        AbstractC4862t.c(objK, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objK).intValue();
    }

    @Override // fe.InterfaceC4049e
    public Void i() {
        return null;
    }

    @Override // fe.InterfaceC4047c
    public final short k(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return t();
    }

    @Override // fe.InterfaceC4047c
    public final boolean l(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return y();
    }

    @Override // fe.InterfaceC4049e
    public long m() {
        Object objK = K();
        AbstractC4862t.c(objK, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objK).longValue();
    }

    @Override // fe.InterfaceC4049e
    public Object n(InterfaceC3118a interfaceC3118a) {
        return super.n(interfaceC3118a);
    }

    @Override // fe.InterfaceC4047c
    public final char o(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return z();
    }

    @Override // fe.InterfaceC4047c
    public final float p(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return u();
    }

    @Override // fe.InterfaceC4047c
    public boolean q() {
        return super.q();
    }

    @Override // fe.InterfaceC4047c
    public InterfaceC4049e r(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return x(descriptor.h(i10));
    }

    @Override // fe.InterfaceC4047c
    public int s(ee.e eVar) {
        return super.s(eVar);
    }

    @Override // fe.InterfaceC4049e
    public short t() {
        Object objK = K();
        AbstractC4862t.c(objK, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) objK).shortValue();
    }

    @Override // fe.InterfaceC4049e
    public float u() {
        Object objK = K();
        AbstractC4862t.c(objK, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objK).floatValue();
    }

    @Override // fe.InterfaceC4047c
    public final String v(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return D();
    }

    @Override // fe.InterfaceC4049e
    public double w() {
        Object objK = K();
        AbstractC4862t.c(objK, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objK).doubleValue();
    }

    @Override // fe.InterfaceC4049e
    public InterfaceC4049e x(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        return this;
    }

    @Override // fe.InterfaceC4049e
    public boolean y() {
        Object objK = K();
        AbstractC4862t.c(objK, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objK).booleanValue();
    }

    @Override // fe.InterfaceC4049e
    public char z() {
        Object objK = K();
        AbstractC4862t.c(objK, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objK).charValue();
    }
}
