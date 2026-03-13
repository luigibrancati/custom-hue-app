package L;

import L.InterfaceC1099g0;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface Y0 extends InterfaceC1099g0 {
    @Override // L.InterfaceC1099g0
    default Object a(InterfaceC1099g0.a aVar) {
        return getConfig().a(aVar);
    }

    @Override // L.InterfaceC1099g0
    default Set b() {
        return getConfig().b();
    }

    @Override // L.InterfaceC1099g0
    default Object c(InterfaceC1099g0.a aVar, Object obj) {
        return getConfig().c(aVar, obj);
    }

    @Override // L.InterfaceC1099g0
    default boolean d(InterfaceC1099g0.a aVar) {
        return getConfig().d(aVar);
    }

    @Override // L.InterfaceC1099g0
    default void e(String str, InterfaceC1099g0.b bVar) {
        getConfig().e(str, bVar);
    }

    @Override // L.InterfaceC1099g0
    default InterfaceC1099g0.c f(InterfaceC1099g0.a aVar) {
        return getConfig().f(aVar);
    }

    @Override // L.InterfaceC1099g0
    default Object g(InterfaceC1099g0.a aVar, InterfaceC1099g0.c cVar) {
        return getConfig().g(aVar, cVar);
    }

    InterfaceC1099g0 getConfig();

    @Override // L.InterfaceC1099g0
    default Set h(InterfaceC1099g0.a aVar) {
        return getConfig().h(aVar);
    }
}
