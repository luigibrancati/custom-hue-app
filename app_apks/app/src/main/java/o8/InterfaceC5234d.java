package o8;

import java.util.Set;

/* JADX INFO: renamed from: o8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5234d {
    default Set a(E e10) {
        return (Set) f(e10).get();
    }

    O8.b b(E e10);

    default Set c(Class cls) {
        return a(E.b(cls));
    }

    O8.a d(E e10);

    default O8.b e(Class cls) {
        return b(E.b(cls));
    }

    O8.b f(E e10);

    default Object g(E e10) {
        O8.b bVarB = b(e10);
        if (bVarB == null) {
            return null;
        }
        return bVarB.get();
    }

    default Object get(Class cls) {
        return g(E.b(cls));
    }

    default O8.a h(Class cls) {
        return d(E.b(cls));
    }
}
