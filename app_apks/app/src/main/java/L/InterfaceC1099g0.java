package L;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: L.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1099g0 {

    /* JADX INFO: renamed from: L.g0$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {
        public static a a(String str, Class cls) {
            return b(str, cls, null);
        }

        public static a b(String str, Class cls, Object obj) {
            return new C1102i(str, cls, obj);
        }

        public abstract String c();

        public abstract Object d();

        public abstract Class e();
    }

    /* JADX INFO: renamed from: L.g0$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        boolean a(a aVar);
    }

    /* JADX INFO: renamed from: L.g0$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c {
        ALWAYS_OVERRIDE,
        HIGH_PRIORITY_REQUIRED,
        REQUIRED,
        OPTIONAL
    }

    static InterfaceC1099g0 F(InterfaceC1099g0 interfaceC1099g0, InterfaceC1099g0 interfaceC1099g02) {
        if (interfaceC1099g0 == null && interfaceC1099g02 == null) {
            return R0.e0();
        }
        M0 m0H0 = interfaceC1099g02 != null ? M0.h0(interfaceC1099g02) : M0.g0();
        if (interfaceC1099g0 != null) {
            Iterator it = interfaceC1099g0.b().iterator();
            while (it.hasNext()) {
                Q(m0H0, interfaceC1099g02, interfaceC1099g0, (a) it.next());
            }
        }
        return R0.f0(m0H0);
    }

    static boolean M(c cVar, c cVar2) {
        c cVar3 = c.REQUIRED;
        return cVar == cVar3 && cVar2 == cVar3;
    }

    static void Q(M0 m02, InterfaceC1099g0 interfaceC1099g0, InterfaceC1099g0 interfaceC1099g02, a aVar) {
        if (!Objects.equals(aVar, InterfaceC1132x0.f8224u)) {
            m02.Y(aVar, interfaceC1099g02.f(aVar), interfaceC1099g02.a(aVar));
            return;
        }
        X.c cVar = (X.c) interfaceC1099g02.c(aVar, null);
        m02.Y(aVar, interfaceC1099g02.f(aVar), M.u.a((X.c) interfaceC1099g0.c(aVar, null), cVar));
    }

    Object a(a aVar);

    Set b();

    Object c(a aVar, Object obj);

    boolean d(a aVar);

    void e(String str, b bVar);

    c f(a aVar);

    Object g(a aVar, c cVar);

    Set h(a aVar);
}
