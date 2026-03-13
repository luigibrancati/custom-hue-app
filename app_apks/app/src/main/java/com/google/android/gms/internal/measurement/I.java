package com.google.android.gms.internal.measurement;

import io.flutter.Build;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I extends AbstractC3337w {
    public I() {
        this.f29713a.add(M.FOR_IN);
        this.f29713a.add(M.FOR_IN_CONST);
        this.f29713a.add(M.FOR_IN_LET);
        this.f29713a.add(M.FOR_LET);
        this.f29713a.add(M.FOR_OF);
        this.f29713a.add(M.FOR_OF_CONST);
        this.f29713a.add(M.FOR_OF_LET);
        this.f29713a.add(M.WHILE);
    }

    public static InterfaceC3277p c(G g10, InterfaceC3277p interfaceC3277p, InterfaceC3277p interfaceC3277p2) {
        return e(g10, interfaceC3277p.e(), interfaceC3277p2);
    }

    public static InterfaceC3277p d(G g10, InterfaceC3277p interfaceC3277p, InterfaceC3277p interfaceC3277p2) {
        if (interfaceC3277p instanceof Iterable) {
            return e(g10, ((Iterable) interfaceC3277p).iterator(), interfaceC3277p2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static InterfaceC3277p e(G g10, Iterator it, InterfaceC3277p interfaceC3277p) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC3277p interfaceC3277pB = g10.a((InterfaceC3277p) it.next()).b((C3187f) interfaceC3277p);
                if (interfaceC3277pB instanceof C3205h) {
                    C3205h c3205h = (C3205h) interfaceC3277pB;
                    if ("break".equals(c3205h.f())) {
                        return InterfaceC3277p.f29567U;
                    }
                    if ("return".equals(c3205h.f())) {
                        return c3205h;
                    }
                }
            }
        }
        return InterfaceC3277p.f29567U;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3337w
    public final InterfaceC3277p a(String str, T1 t12, List list) {
        M m10 = M.ADD;
        int iOrdinal = AbstractC3324u2.e(str).ordinal();
        if (iOrdinal == 65) {
            AbstractC3324u2.a(M.WHILE.name(), 4, list);
            InterfaceC3277p interfaceC3277p = (InterfaceC3277p) list.get(0);
            InterfaceC3277p interfaceC3277p2 = (InterfaceC3277p) list.get(1);
            InterfaceC3277p interfaceC3277p3 = (InterfaceC3277p) list.get(2);
            InterfaceC3277p interfaceC3277pA = t12.a((InterfaceC3277p) list.get(3));
            if (t12.a(interfaceC3277p3).d().booleanValue()) {
                InterfaceC3277p interfaceC3277pB = t12.b((C3187f) interfaceC3277pA);
                if (interfaceC3277pB instanceof C3205h) {
                    C3205h c3205h = (C3205h) interfaceC3277pB;
                    if ("break".equals(c3205h.f())) {
                        return InterfaceC3277p.f29567U;
                    }
                    if ("return".equals(c3205h.f())) {
                        return c3205h;
                    }
                }
            }
            while (t12.a(interfaceC3277p).d().booleanValue()) {
                InterfaceC3277p interfaceC3277pB2 = t12.b((C3187f) interfaceC3277pA);
                if (interfaceC3277pB2 instanceof C3205h) {
                    C3205h c3205h2 = (C3205h) interfaceC3277pB2;
                    if ("break".equals(c3205h2.f())) {
                        return InterfaceC3277p.f29567U;
                    }
                    if ("return".equals(c3205h2.f())) {
                        return c3205h2;
                    }
                }
                t12.a(interfaceC3277p2);
            }
            return InterfaceC3277p.f29567U;
        }
        switch (iOrdinal) {
            case 26:
                AbstractC3324u2.a(M.FOR_IN.name(), 3, list);
                if (!(list.get(0) instanceof C3312t)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return c(new H(t12, ((InterfaceC3277p) list.get(0)).b()), t12.a((InterfaceC3277p) list.get(1)), t12.a((InterfaceC3277p) list.get(2)));
            case 27:
                AbstractC3324u2.a(M.FOR_IN_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C3312t)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return c(new E(t12, ((InterfaceC3277p) list.get(0)).b()), t12.a((InterfaceC3277p) list.get(1)), t12.a((InterfaceC3277p) list.get(2)));
            case 28:
                AbstractC3324u2.a(M.FOR_IN_LET.name(), 3, list);
                if (!(list.get(0) instanceof C3312t)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return c(new F(t12, ((InterfaceC3277p) list.get(0)).b()), t12.a((InterfaceC3277p) list.get(1)), t12.a((InterfaceC3277p) list.get(2)));
            case 29:
                AbstractC3324u2.a(M.FOR_LET.name(), 4, list);
                InterfaceC3277p interfaceC3277pA2 = t12.a((InterfaceC3277p) list.get(0));
                if (!(interfaceC3277pA2 instanceof C3187f)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                C3187f c3187f = (C3187f) interfaceC3277pA2;
                InterfaceC3277p interfaceC3277p4 = (InterfaceC3277p) list.get(1);
                InterfaceC3277p interfaceC3277p5 = (InterfaceC3277p) list.get(2);
                InterfaceC3277p interfaceC3277pA3 = t12.a((InterfaceC3277p) list.get(3));
                T1 t1C = t12.c();
                for (int i10 = 0; i10 < c3187f.s(); i10++) {
                    String strB = c3187f.v(i10).b();
                    t1C.e(strB, t12.h(strB));
                }
                while (t12.a(interfaceC3277p4).d().booleanValue()) {
                    InterfaceC3277p interfaceC3277pB3 = t12.b((C3187f) interfaceC3277pA3);
                    if (interfaceC3277pB3 instanceof C3205h) {
                        C3205h c3205h3 = (C3205h) interfaceC3277pB3;
                        if ("break".equals(c3205h3.f())) {
                            return InterfaceC3277p.f29567U;
                        }
                        if ("return".equals(c3205h3.f())) {
                            return c3205h3;
                        }
                    }
                    T1 t1C2 = t12.c();
                    for (int i11 = 0; i11 < c3187f.s(); i11++) {
                        String strB2 = c3187f.v(i11).b();
                        t1C2.e(strB2, t1C.h(strB2));
                    }
                    t1C2.a(interfaceC3277p5);
                    t1C = t1C2;
                }
                return InterfaceC3277p.f29567U;
            case Build.API_LEVELS.API_30 /* 30 */:
                AbstractC3324u2.a(M.FOR_OF.name(), 3, list);
                if (!(list.get(0) instanceof C3312t)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return d(new H(t12, ((InterfaceC3277p) list.get(0)).b()), t12.a((InterfaceC3277p) list.get(1)), t12.a((InterfaceC3277p) list.get(2)));
            case 31:
                AbstractC3324u2.a(M.FOR_OF_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C3312t)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return d(new E(t12, ((InterfaceC3277p) list.get(0)).b()), t12.a((InterfaceC3277p) list.get(1)), t12.a((InterfaceC3277p) list.get(2)));
            case 32:
                AbstractC3324u2.a(M.FOR_OF_LET.name(), 3, list);
                if (!(list.get(0) instanceof C3312t)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return d(new F(t12, ((InterfaceC3277p) list.get(0)).b()), t12.a((InterfaceC3277p) list.get(1)), t12.a((InterfaceC3277p) list.get(2)));
            default:
                return super.b(str);
        }
    }
}
