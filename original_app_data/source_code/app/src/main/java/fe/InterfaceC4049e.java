package fe;

import ce.InterfaceC3118a;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: fe.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4049e {
    String D();

    boolean F();

    byte G();

    InterfaceC4047c a(ee.e eVar);

    int f(ee.e eVar);

    int h();

    Void i();

    long m();

    default Object n(InterfaceC3118a deserializer) {
        AbstractC4862t.e(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }

    short t();

    float u();

    double w();

    InterfaceC4049e x(ee.e eVar);

    boolean y();

    char z();
}
