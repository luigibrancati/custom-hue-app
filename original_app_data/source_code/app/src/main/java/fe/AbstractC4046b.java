package fe;

import ce.g;
import ge.V;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;

/* JADX INFO: renamed from: fe.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4046b implements InterfaceC4050f, InterfaceC4048d {
    @Override // fe.InterfaceC4050f
    public void A(g gVar, Object obj) {
        super.A(gVar, obj);
    }

    @Override // fe.InterfaceC4048d
    public final void B(ee.e descriptor, int i10, float f10) {
        AbstractC4862t.e(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            w(f10);
        }
    }

    @Override // fe.InterfaceC4048d
    public final void C(ee.e descriptor, int i10, byte b10) {
        AbstractC4862t.e(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            g(b10);
        }
    }

    @Override // fe.InterfaceC4050f
    public void D(int i10) {
        I(Integer.valueOf(i10));
    }

    @Override // fe.InterfaceC4048d
    public void E(ee.e descriptor, int i10, g serializer, Object obj) {
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(serializer, "serializer");
        if (H(descriptor, i10)) {
            x(serializer, obj);
        }
    }

    @Override // fe.InterfaceC4048d
    public final void F(ee.e descriptor, int i10, int i11) {
        AbstractC4862t.e(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            D(i11);
        }
    }

    @Override // fe.InterfaceC4050f
    public void G(String value) {
        AbstractC4862t.e(value, "value");
        I(value);
    }

    public boolean H(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return true;
    }

    public void I(Object value) {
        AbstractC4862t.e(value, "value");
        throw new ce.f("Non-serializable " + M.b(value.getClass()) + " is not supported by " + M.b(getClass()) + " encoder");
    }

    @Override // fe.InterfaceC4050f
    public InterfaceC4048d a(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        return this;
    }

    @Override // fe.InterfaceC4048d
    public void c(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
    }

    @Override // fe.InterfaceC4048d
    public final void e(ee.e descriptor, int i10, String value) {
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(value, "value");
        if (H(descriptor, i10)) {
            G(value);
        }
    }

    @Override // fe.InterfaceC4050f
    public void f(double d10) {
        I(Double.valueOf(d10));
    }

    @Override // fe.InterfaceC4050f
    public void g(byte b10) {
        I(Byte.valueOf(b10));
    }

    @Override // fe.InterfaceC4048d
    public final InterfaceC4050f h(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return H(descriptor, i10) ? q(descriptor.h(i10)) : V.f35683a;
    }

    @Override // fe.InterfaceC4048d
    public boolean i(ee.e eVar, int i10) {
        return super.i(eVar, i10);
    }

    @Override // fe.InterfaceC4048d
    public final void j(ee.e descriptor, int i10, short s10) {
        AbstractC4862t.e(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            s(s10);
        }
    }

    @Override // fe.InterfaceC4050f
    public InterfaceC4048d k(ee.e eVar, int i10) {
        return super.k(eVar, i10);
    }

    @Override // fe.InterfaceC4048d
    public void l(ee.e descriptor, int i10, g serializer, Object obj) {
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(serializer, "serializer");
        if (H(descriptor, i10)) {
            A(serializer, obj);
        }
    }

    @Override // fe.InterfaceC4048d
    public final void m(ee.e descriptor, int i10, char c10) {
        AbstractC4862t.e(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            y(c10);
        }
    }

    @Override // fe.InterfaceC4048d
    public final void n(ee.e descriptor, int i10, boolean z10) {
        AbstractC4862t.e(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            u(z10);
        }
    }

    @Override // fe.InterfaceC4050f
    public void o(long j10) {
        I(Long.valueOf(j10));
    }

    @Override // fe.InterfaceC4050f
    public void p(ee.e enumDescriptor, int i10) {
        AbstractC4862t.e(enumDescriptor, "enumDescriptor");
        I(Integer.valueOf(i10));
    }

    @Override // fe.InterfaceC4050f
    public InterfaceC4050f q(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        return this;
    }

    @Override // fe.InterfaceC4050f
    public void r() {
        throw new ce.f("'null' is not supported by default");
    }

    @Override // fe.InterfaceC4050f
    public void s(short s10) {
        I(Short.valueOf(s10));
    }

    @Override // fe.InterfaceC4048d
    public final void t(ee.e descriptor, int i10, long j10) {
        AbstractC4862t.e(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            o(j10);
        }
    }

    @Override // fe.InterfaceC4050f
    public void u(boolean z10) {
        I(Boolean.valueOf(z10));
    }

    @Override // fe.InterfaceC4048d
    public final void v(ee.e descriptor, int i10, double d10) {
        AbstractC4862t.e(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            f(d10);
        }
    }

    @Override // fe.InterfaceC4050f
    public void w(float f10) {
        I(Float.valueOf(f10));
    }

    @Override // fe.InterfaceC4050f
    public void x(g gVar, Object obj) {
        super.x(gVar, obj);
    }

    @Override // fe.InterfaceC4050f
    public void y(char c10) {
        I(Character.valueOf(c10));
    }

    @Override // fe.InterfaceC4050f
    public void z() {
        super.z();
    }
}
