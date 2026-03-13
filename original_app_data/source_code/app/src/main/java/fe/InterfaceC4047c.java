package fe;

import ce.InterfaceC3118a;
import je.AbstractC4771b;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: fe.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4047c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34756a = a.f34757a;

    /* JADX INFO: renamed from: fe.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f34757a = new a();
    }

    static /* synthetic */ Object C(InterfaceC4047c interfaceC4047c, ee.e eVar, int i10, InterfaceC3118a interfaceC3118a, Object obj, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
        if ((i11 & 8) != 0) {
            obj = null;
        }
        return interfaceC4047c.H(eVar, i10, interfaceC3118a, obj);
    }

    Object A(ee.e eVar, int i10, InterfaceC3118a interfaceC3118a, Object obj);

    double B(ee.e eVar, int i10);

    byte E(ee.e eVar, int i10);

    Object H(ee.e eVar, int i10, InterfaceC3118a interfaceC3118a, Object obj);

    int I(ee.e eVar, int i10);

    AbstractC4771b b();

    void c(ee.e eVar);

    long e(ee.e eVar, int i10);

    int j(ee.e eVar);

    short k(ee.e eVar, int i10);

    boolean l(ee.e eVar, int i10);

    char o(ee.e eVar, int i10);

    float p(ee.e eVar, int i10);

    default boolean q() {
        return false;
    }

    InterfaceC4049e r(ee.e eVar, int i10);

    default int s(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        return -1;
    }

    String v(ee.e eVar, int i10);
}
