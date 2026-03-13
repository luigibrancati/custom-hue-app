package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3361z extends AbstractC3337w {
    public C3361z() {
        this.f29713a.add(M.APPLY);
        this.f29713a.add(M.BLOCK);
        this.f29713a.add(M.BREAK);
        this.f29713a.add(M.CASE);
        this.f29713a.add(M.DEFAULT);
        this.f29713a.add(M.CONTINUE);
        this.f29713a.add(M.DEFINE_FUNCTION);
        this.f29713a.add(M.FN);
        this.f29713a.add(M.IF);
        this.f29713a.add(M.QUOTE);
        this.f29713a.add(M.RETURN);
        this.f29713a.add(M.SWITCH);
        this.f29713a.add(M.TERNARY);
    }

    public static InterfaceC3277p c(T1 t12, List list) {
        AbstractC3324u2.b(M.FN.name(), 2, list);
        InterfaceC3277p interfaceC3277pA = t12.a((InterfaceC3277p) list.get(0));
        InterfaceC3277p interfaceC3277pA2 = t12.a((InterfaceC3277p) list.get(1));
        if (!(interfaceC3277pA2 instanceof C3187f)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", interfaceC3277pA2.getClass().getCanonicalName()));
        }
        List listP = ((C3187f) interfaceC3277pA2).p();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C3268o(interfaceC3277pA.b(), listP, arrayList, t12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3337w
    public final InterfaceC3277p a(String str, T1 t12, List list) {
        M m10 = M.ADD;
        int iOrdinal = AbstractC3324u2.e(str).ordinal();
        if (iOrdinal == 2) {
            AbstractC3324u2.a(M.APPLY.name(), 3, list);
            InterfaceC3277p interfaceC3277pA = t12.a((InterfaceC3277p) list.get(0));
            String strB = t12.a((InterfaceC3277p) list.get(1)).b();
            InterfaceC3277p interfaceC3277pA2 = t12.a((InterfaceC3277p) list.get(2));
            if (!(interfaceC3277pA2 instanceof C3187f)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", interfaceC3277pA2.getClass().getCanonicalName()));
            }
            if (strB.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return interfaceC3277pA.z(strB, t12, ((C3187f) interfaceC3277pA2).p());
        }
        if (iOrdinal == 15) {
            AbstractC3324u2.a(M.BREAK.name(), 0, list);
            return InterfaceC3277p.f29569b0;
        }
        if (iOrdinal == 25) {
            return c(t12, list);
        }
        if (iOrdinal == 41) {
            AbstractC3324u2.b(M.IF.name(), 2, list);
            InterfaceC3277p interfaceC3277pA3 = t12.a((InterfaceC3277p) list.get(0));
            InterfaceC3277p interfaceC3277pA4 = t12.a((InterfaceC3277p) list.get(1));
            InterfaceC3277p interfaceC3277pA5 = list.size() > 2 ? t12.a((InterfaceC3277p) list.get(2)) : null;
            InterfaceC3277p interfaceC3277p = InterfaceC3277p.f29567U;
            InterfaceC3277p interfaceC3277pB = interfaceC3277pA3.d().booleanValue() ? t12.b((C3187f) interfaceC3277pA4) : interfaceC3277pA5 != null ? t12.b((C3187f) interfaceC3277pA5) : interfaceC3277p;
            return true != (interfaceC3277pB instanceof C3205h) ? interfaceC3277p : interfaceC3277pB;
        }
        if (iOrdinal == 54) {
            return new C3187f(list);
        }
        if (iOrdinal == 57) {
            if (list.isEmpty()) {
                return InterfaceC3277p.f29571d0;
            }
            AbstractC3324u2.a(M.RETURN.name(), 1, list);
            return new C3205h("return", t12.a((InterfaceC3277p) list.get(0)));
        }
        if (iOrdinal != 19) {
            if (iOrdinal == 20) {
                AbstractC3324u2.b(M.DEFINE_FUNCTION.name(), 2, list);
                C3268o c3268o = (C3268o) c(t12, list);
                if (c3268o.g() == null) {
                    t12.e("", c3268o);
                    return c3268o;
                }
                t12.e(c3268o.g(), c3268o);
                return c3268o;
            }
            if (iOrdinal == 60) {
                AbstractC3324u2.a(M.SWITCH.name(), 3, list);
                InterfaceC3277p interfaceC3277pA6 = t12.a((InterfaceC3277p) list.get(0));
                InterfaceC3277p interfaceC3277pA7 = t12.a((InterfaceC3277p) list.get(1));
                InterfaceC3277p interfaceC3277pA8 = t12.a((InterfaceC3277p) list.get(2));
                if (!(interfaceC3277pA7 instanceof C3187f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(interfaceC3277pA8 instanceof C3187f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                C3187f c3187f = (C3187f) interfaceC3277pA7;
                C3187f c3187f2 = (C3187f) interfaceC3277pA8;
                boolean z10 = false;
                for (int i10 = 0; i10 < c3187f.s(); i10++) {
                    if (z10 || interfaceC3277pA6.equals(t12.a(c3187f.v(i10)))) {
                        InterfaceC3277p interfaceC3277pA9 = t12.a(c3187f2.v(i10));
                        if (interfaceC3277pA9 instanceof C3205h) {
                            return ((C3205h) interfaceC3277pA9).f().equals("break") ? InterfaceC3277p.f29567U : interfaceC3277pA9;
                        }
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (c3187f.s() + 1 == c3187f2.s()) {
                    InterfaceC3277p interfaceC3277pA10 = t12.a(c3187f2.v(c3187f.s()));
                    if (interfaceC3277pA10 instanceof C3205h) {
                        String strF = ((C3205h) interfaceC3277pA10).f();
                        if (strF.equals("return") || strF.equals("continue")) {
                            return interfaceC3277pA10;
                        }
                    }
                }
                return InterfaceC3277p.f29567U;
            }
            if (iOrdinal == 61) {
                AbstractC3324u2.a(M.TERNARY.name(), 3, list);
                return t12.a((InterfaceC3277p) list.get(0)).d().booleanValue() ? t12.a((InterfaceC3277p) list.get(1)) : t12.a((InterfaceC3277p) list.get(2));
            }
            switch (iOrdinal) {
                case 11:
                    return t12.c().b(new C3187f(list));
                case 12:
                    AbstractC3324u2.a(M.BREAK.name(), 0, list);
                    return InterfaceC3277p.f29570c0;
                case 13:
                    break;
                default:
                    return super.b(str);
            }
        }
        if (list.isEmpty()) {
            return InterfaceC3277p.f29567U;
        }
        InterfaceC3277p interfaceC3277pA11 = t12.a((InterfaceC3277p) list.get(0));
        return interfaceC3277pA11 instanceof C3187f ? t12.b((C3187f) interfaceC3277pA11) : InterfaceC3277p.f29567U;
    }
}
