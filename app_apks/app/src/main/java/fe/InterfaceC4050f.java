package fe;

import ce.g;
import je.AbstractC4771b;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: fe.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4050f {
    default void A(g serializer, Object obj) {
        AbstractC4862t.e(serializer, "serializer");
        if (serializer.getDescriptor().b()) {
            x(serializer, obj);
        } else if (obj == null) {
            r();
        } else {
            z();
            x(serializer, obj);
        }
    }

    void D(int i10);

    void G(String str);

    InterfaceC4048d a(ee.e eVar);

    AbstractC4771b b();

    void f(double d10);

    void g(byte b10);

    default InterfaceC4048d k(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return a(descriptor);
    }

    void o(long j10);

    void p(ee.e eVar, int i10);

    InterfaceC4050f q(ee.e eVar);

    void r();

    void s(short s10);

    void u(boolean z10);

    void w(float f10);

    default void x(g serializer, Object obj) {
        AbstractC4862t.e(serializer, "serializer");
        serializer.serialize(this, obj);
    }

    void y(char c10);

    default void z() {
    }
}
