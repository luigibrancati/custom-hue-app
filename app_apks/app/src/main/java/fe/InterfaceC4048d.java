package fe;

import ce.g;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: fe.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4048d {
    void B(ee.e eVar, int i10, float f10);

    void C(ee.e eVar, int i10, byte b10);

    void E(ee.e eVar, int i10, g gVar, Object obj);

    void F(ee.e eVar, int i10, int i11);

    void c(ee.e eVar);

    void e(ee.e eVar, int i10, String str);

    InterfaceC4050f h(ee.e eVar, int i10);

    default boolean i(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return true;
    }

    void j(ee.e eVar, int i10, short s10);

    void l(ee.e eVar, int i10, g gVar, Object obj);

    void m(ee.e eVar, int i10, char c10);

    void n(ee.e eVar, int i10, boolean z10);

    void t(ee.e eVar, int i10, long j10);

    void v(ee.e eVar, int i10, double d10);
}
