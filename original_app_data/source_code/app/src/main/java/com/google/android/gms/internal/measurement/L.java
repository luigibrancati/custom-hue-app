package com.google.android.gms.internal.measurement;

import io.sentry.SentryEnvelopeItemHeader;
import io.sentry.protocol.SentryStackFrame;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L extends AbstractC3337w {
    public L() {
        this.f29713a.add(M.ASSIGN);
        this.f29713a.add(M.CONST);
        this.f29713a.add(M.CREATE_ARRAY);
        this.f29713a.add(M.CREATE_OBJECT);
        this.f29713a.add(M.EXPRESSION_LIST);
        this.f29713a.add(M.GET);
        this.f29713a.add(M.GET_INDEX);
        this.f29713a.add(M.GET_PROPERTY);
        this.f29713a.add(M.NULL);
        this.f29713a.add(M.SET_PROPERTY);
        this.f29713a.add(M.TYPEOF);
        this.f29713a.add(M.UNDEFINED);
        this.f29713a.add(M.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3337w
    public final InterfaceC3277p a(String str, T1 t12, List list) {
        String str2;
        M m10 = M.ADD;
        int iOrdinal = AbstractC3324u2.e(str).ordinal();
        int i10 = 0;
        if (iOrdinal == 3) {
            AbstractC3324u2.a(M.ASSIGN.name(), 2, list);
            InterfaceC3277p interfaceC3277pA = t12.a((InterfaceC3277p) list.get(0));
            if (!(interfaceC3277pA instanceof C3312t)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", interfaceC3277pA.getClass().getCanonicalName()));
            }
            if (!t12.d(interfaceC3277pA.b())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", interfaceC3277pA.b()));
            }
            InterfaceC3277p interfaceC3277pA2 = t12.a((InterfaceC3277p) list.get(1));
            t12.e(interfaceC3277pA.b(), interfaceC3277pA2);
            return interfaceC3277pA2;
        }
        if (iOrdinal == 14) {
            AbstractC3324u2.b(M.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            while (i10 < list.size() - 1) {
                InterfaceC3277p interfaceC3277pA3 = t12.a((InterfaceC3277p) list.get(i10));
                if (!(interfaceC3277pA3 instanceof C3312t)) {
                    throw new IllegalArgumentException(String.format("Expected string for const name. got %s", interfaceC3277pA3.getClass().getCanonicalName()));
                }
                t12.g(interfaceC3277pA3.b(), t12.a((InterfaceC3277p) list.get(i10 + 1)));
                i10 += 2;
            }
            return InterfaceC3277p.f29567U;
        }
        if (iOrdinal == 24) {
            AbstractC3324u2.b(M.EXPRESSION_LIST.name(), 1, list);
            InterfaceC3277p interfaceC3277pA4 = InterfaceC3277p.f29567U;
            while (i10 < list.size()) {
                interfaceC3277pA4 = t12.a((InterfaceC3277p) list.get(i10));
                if (interfaceC3277pA4 instanceof C3205h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i10++;
            }
            return interfaceC3277pA4;
        }
        if (iOrdinal == 33) {
            AbstractC3324u2.a(M.GET.name(), 1, list);
            InterfaceC3277p interfaceC3277pA5 = t12.a((InterfaceC3277p) list.get(0));
            if (interfaceC3277pA5 instanceof C3312t) {
                return t12.h(interfaceC3277pA5.b());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", interfaceC3277pA5.getClass().getCanonicalName()));
        }
        if (iOrdinal == 49) {
            AbstractC3324u2.a(M.NULL.name(), 0, list);
            return InterfaceC3277p.f29568a0;
        }
        if (iOrdinal == 58) {
            AbstractC3324u2.a(M.SET_PROPERTY.name(), 3, list);
            InterfaceC3277p interfaceC3277pA6 = t12.a((InterfaceC3277p) list.get(0));
            InterfaceC3277p interfaceC3277pA7 = t12.a((InterfaceC3277p) list.get(1));
            InterfaceC3277p interfaceC3277pA8 = t12.a((InterfaceC3277p) list.get(2));
            if (interfaceC3277pA6 == InterfaceC3277p.f29567U || interfaceC3277pA6 == InterfaceC3277p.f29568a0) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", interfaceC3277pA7.b(), interfaceC3277pA6.b()));
            }
            if ((interfaceC3277pA6 instanceof C3187f) && (interfaceC3277pA7 instanceof C3214i)) {
                ((C3187f) interfaceC3277pA6).w(interfaceC3277pA7.c().intValue(), interfaceC3277pA8);
                return interfaceC3277pA8;
            }
            if (!(interfaceC3277pA6 instanceof InterfaceC3241l)) {
                return interfaceC3277pA8;
            }
            ((InterfaceC3241l) interfaceC3277pA6).k(interfaceC3277pA7.b(), interfaceC3277pA8);
            return interfaceC3277pA8;
        }
        if (iOrdinal == 17) {
            if (list.isEmpty()) {
                return new C3187f();
            }
            C3187f c3187f = new C3187f();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC3277p interfaceC3277pA9 = t12.a((InterfaceC3277p) it.next());
                if (interfaceC3277pA9 instanceof C3205h) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                c3187f.w(i10, interfaceC3277pA9);
                i10++;
            }
            return c3187f;
        }
        if (iOrdinal == 18) {
            if (list.isEmpty()) {
                return new C3250m();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            C3250m c3250m = new C3250m();
            while (i10 < list.size() - 1) {
                InterfaceC3277p interfaceC3277pA10 = t12.a((InterfaceC3277p) list.get(i10));
                InterfaceC3277p interfaceC3277pA11 = t12.a((InterfaceC3277p) list.get(i10 + 1));
                if ((interfaceC3277pA10 instanceof C3205h) || (interfaceC3277pA11 instanceof C3205h)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                c3250m.k(interfaceC3277pA10.b(), interfaceC3277pA11);
                i10 += 2;
            }
            return c3250m;
        }
        if (iOrdinal == 35 || iOrdinal == 36) {
            AbstractC3324u2.a(M.GET_PROPERTY.name(), 2, list);
            InterfaceC3277p interfaceC3277pA12 = t12.a((InterfaceC3277p) list.get(0));
            InterfaceC3277p interfaceC3277pA13 = t12.a((InterfaceC3277p) list.get(1));
            if ((interfaceC3277pA12 instanceof C3187f) && AbstractC3324u2.d(interfaceC3277pA13)) {
                return ((C3187f) interfaceC3277pA12).v(interfaceC3277pA13.c().intValue());
            }
            if (interfaceC3277pA12 instanceof InterfaceC3241l) {
                return ((InterfaceC3241l) interfaceC3277pA12).h(interfaceC3277pA13.b());
            }
            if (interfaceC3277pA12 instanceof C3312t) {
                if (SentryEnvelopeItemHeader.JsonKeys.LENGTH.equals(interfaceC3277pA13.b())) {
                    return new C3214i(Double.valueOf(interfaceC3277pA12.b().length()));
                }
                if (AbstractC3324u2.d(interfaceC3277pA13) && interfaceC3277pA13.c().doubleValue() < interfaceC3277pA12.b().length()) {
                    return new C3312t(String.valueOf(interfaceC3277pA12.b().charAt(interfaceC3277pA13.c().intValue())));
                }
            }
            return InterfaceC3277p.f29567U;
        }
        switch (iOrdinal) {
            case 62:
                AbstractC3324u2.a(M.TYPEOF.name(), 1, list);
                InterfaceC3277p interfaceC3277pA14 = t12.a((InterfaceC3277p) list.get(0));
                if (interfaceC3277pA14 instanceof C3321u) {
                    str2 = "undefined";
                } else if (interfaceC3277pA14 instanceof C3196g) {
                    str2 = "boolean";
                } else if (interfaceC3277pA14 instanceof C3214i) {
                    str2 = "number";
                } else if (interfaceC3277pA14 instanceof C3312t) {
                    str2 = "string";
                } else if (interfaceC3277pA14 instanceof C3268o) {
                    str2 = SentryStackFrame.JsonKeys.FUNCTION;
                } else {
                    if ((interfaceC3277pA14 instanceof C3286q) || (interfaceC3277pA14 instanceof C3205h)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", interfaceC3277pA14));
                    }
                    str2 = "object";
                }
                return new C3312t(str2);
            case 63:
                AbstractC3324u2.a(M.UNDEFINED.name(), 0, list);
                return InterfaceC3277p.f29567U;
            case 64:
                AbstractC3324u2.b(M.VAR.name(), 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC3277p interfaceC3277pA15 = t12.a((InterfaceC3277p) it2.next());
                    if (!(interfaceC3277pA15 instanceof C3312t)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", interfaceC3277pA15.getClass().getCanonicalName()));
                    }
                    t12.f(interfaceC3277pA15.b(), InterfaceC3277p.f29567U);
                }
                return InterfaceC3277p.f29567U;
            default:
                return super.b(str);
        }
    }
}
