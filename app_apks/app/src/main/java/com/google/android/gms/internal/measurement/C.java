package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class C {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static InterfaceC3277p a(String str, C3187f c3187f, T1 t12, List list) {
        double dS;
        Double dValueOf = Double.valueOf(-1.0d);
        String strB = ",";
        double dS2 = 0.0d;
        AbstractC3223j abstractC3223j = null;
        int i10 = 0;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    AbstractC3324u2.a("toString", 0, list);
                    return new C3312t(c3187f.H(","));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                if (str.equals("concat")) {
                    C3187f c3187f2 = (C3187f) c3187f.y();
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            InterfaceC3277p interfaceC3277pA = t12.a((InterfaceC3277p) it.next());
                            if (interfaceC3277pA instanceof C3205h) {
                                throw new IllegalStateException("Failed evaluation of arguments");
                            }
                            int iS = c3187f2.s();
                            if (interfaceC3277pA instanceof C3187f) {
                                C3187f c3187f3 = (C3187f) interfaceC3277pA;
                                Iterator itR = c3187f3.r();
                                while (itR.hasNext()) {
                                    Integer num = (Integer) itR.next();
                                    c3187f2.w(num.intValue() + iS, c3187f3.v(num.intValue()));
                                }
                            } else {
                                c3187f2.w(iS, interfaceC3277pA);
                            }
                        }
                    }
                    return c3187f2;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1274492040:
                if (str.equals("filter")) {
                    AbstractC3324u2.a("filter", 1, list);
                    InterfaceC3277p interfaceC3277pA2 = t12.a((InterfaceC3277p) list.get(0));
                    if (!(interfaceC3277pA2 instanceof C3268o)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (c3187f.t() == 0) {
                        return new C3187f();
                    }
                    C3187f c3187f4 = (C3187f) c3187f.y();
                    C3187f c3187fC = c(c3187f, t12, (C3268o) interfaceC3277pA2, null, Boolean.TRUE);
                    C3187f c3187f5 = new C3187f();
                    Iterator itR2 = c3187fC.r();
                    while (itR2.hasNext()) {
                        c3187f5.w(c3187f5.s(), c3187f4.v(((Integer) itR2.next()).intValue()));
                    }
                    return c3187f5;
                }
                throw new IllegalArgumentException("Command not supported");
            case -934873754:
                if (str.equals("reduce")) {
                    return b(c3187f, t12, list, true);
                }
                throw new IllegalArgumentException("Command not supported");
            case -895859076:
                if (str.equals("splice")) {
                    if (list.isEmpty()) {
                        return new C3187f();
                    }
                    int i11 = (int) AbstractC3324u2.i(t12.a((InterfaceC3277p) list.get(0)).c().doubleValue());
                    if (i11 < 0) {
                        i11 = Math.max(0, i11 + c3187f.s());
                    } else if (i11 > c3187f.s()) {
                        i11 = c3187f.s();
                    }
                    int iS2 = c3187f.s();
                    C3187f c3187f6 = new C3187f();
                    if (list.size() > 1) {
                        int iMax = Math.max(0, (int) AbstractC3324u2.i(t12.a((InterfaceC3277p) list.get(1)).c().doubleValue()));
                        if (iMax > 0) {
                            for (int i12 = i11; i12 < Math.min(iS2, i11 + iMax); i12++) {
                                c3187f6.w(c3187f6.s(), c3187f.v(i11));
                                c3187f.E(i11);
                            }
                        }
                        if (list.size() > 2) {
                            for (int i13 = 2; i13 < list.size(); i13++) {
                                InterfaceC3277p interfaceC3277pA3 = t12.a((InterfaceC3277p) list.get(i13));
                                if (interfaceC3277pA3 instanceof C3205h) {
                                    throw new IllegalArgumentException("Failed to parse elements to add");
                                }
                                c3187f.B((i11 + i13) - 2, interfaceC3277pA3);
                            }
                        }
                    } else {
                        while (i11 < iS2) {
                            c3187f6.w(c3187f6.s(), c3187f.v(i11));
                            c3187f.w(i11, null);
                            i11++;
                        }
                    }
                    return c3187f6;
                }
                throw new IllegalArgumentException("Command not supported");
            case -678635926:
                if (str.equals("forEach")) {
                    AbstractC3324u2.a("forEach", 1, list);
                    InterfaceC3277p interfaceC3277pA4 = t12.a((InterfaceC3277p) list.get(0));
                    if (!(interfaceC3277pA4 instanceof C3268o)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (c3187f.t() == 0) {
                        return InterfaceC3277p.f29567U;
                    }
                    c(c3187f, t12, (C3268o) interfaceC3277pA4, null, null);
                    return InterfaceC3277p.f29567U;
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    AbstractC3324u2.c("lastIndexOf", 2, list);
                    InterfaceC3277p interfaceC3277pA5 = InterfaceC3277p.f29567U;
                    if (!list.isEmpty()) {
                        interfaceC3277pA5 = t12.a((InterfaceC3277p) list.get(0));
                    }
                    int iS3 = c3187f.s() - 1;
                    if (list.size() > 1) {
                        InterfaceC3277p interfaceC3277pA6 = t12.a((InterfaceC3277p) list.get(1));
                        dS = Double.isNaN(interfaceC3277pA6.c().doubleValue()) ? c3187f.s() - 1 : AbstractC3324u2.i(interfaceC3277pA6.c().doubleValue());
                        if (dS < 0.0d) {
                            dS += (double) c3187f.s();
                        }
                    } else {
                        dS = iS3;
                    }
                    if (dS < 0.0d) {
                        return new C3214i(dValueOf);
                    }
                    for (int iMin = (int) Math.min(c3187f.s(), dS); iMin >= 0; iMin--) {
                        if (c3187f.x(iMin) && AbstractC3324u2.f(c3187f.v(iMin), interfaceC3277pA5)) {
                            return new C3214i(Double.valueOf(iMin));
                        }
                    }
                    return new C3214i(dValueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            case -277637751:
                if (str.equals("unshift")) {
                    if (!list.isEmpty()) {
                        C3187f c3187f7 = new C3187f();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            InterfaceC3277p interfaceC3277pA7 = t12.a((InterfaceC3277p) it2.next());
                            if (interfaceC3277pA7 instanceof C3205h) {
                                throw new IllegalStateException("Argument evaluation failed");
                            }
                            c3187f7.w(c3187f7.s(), interfaceC3277pA7);
                        }
                        int iS4 = c3187f7.s();
                        Iterator itR3 = c3187f.r();
                        while (itR3.hasNext()) {
                            Integer num2 = (Integer) itR3.next();
                            c3187f7.w(num2.intValue() + iS4, c3187f.v(num2.intValue()));
                        }
                        c3187f.A();
                        Iterator itR4 = c3187f7.r();
                        while (itR4.hasNext()) {
                            Integer num3 = (Integer) itR4.next();
                            c3187f.w(num3.intValue(), c3187f7.v(num3.intValue()));
                        }
                    }
                    return new C3214i(Double.valueOf(c3187f.s()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 107868:
                if (str.equals("map")) {
                    AbstractC3324u2.a("map", 1, list);
                    InterfaceC3277p interfaceC3277pA8 = t12.a((InterfaceC3277p) list.get(0));
                    if (interfaceC3277pA8 instanceof C3268o) {
                        return c3187f.s() == 0 ? new C3187f() : c(c3187f, t12, (C3268o) interfaceC3277pA8, null, null);
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                }
                throw new IllegalArgumentException("Command not supported");
            case 111185:
                if (str.equals("pop")) {
                    AbstractC3324u2.a("pop", 0, list);
                    int iS5 = c3187f.s();
                    if (iS5 == 0) {
                        return InterfaceC3277p.f29567U;
                    }
                    int i14 = iS5 - 1;
                    InterfaceC3277p interfaceC3277pV = c3187f.v(i14);
                    c3187f.E(i14);
                    return interfaceC3277pV;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3267882:
                if (str.equals("join")) {
                    AbstractC3324u2.c("join", 1, list);
                    if (c3187f.s() == 0) {
                        return InterfaceC3277p.f29574g0;
                    }
                    if (!list.isEmpty()) {
                        InterfaceC3277p interfaceC3277pA9 = t12.a((InterfaceC3277p) list.get(0));
                        strB = ((interfaceC3277pA9 instanceof C3259n) || (interfaceC3277pA9 instanceof C3321u)) ? "" : interfaceC3277pA9.b();
                    }
                    return new C3312t(c3187f.H(strB));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3452698:
                if (str.equals("push")) {
                    if (!list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            c3187f.w(c3187f.s(), t12.a((InterfaceC3277p) it3.next()));
                        }
                    }
                    return new C3214i(Double.valueOf(c3187f.s()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536116:
                if (str.equals("some")) {
                    AbstractC3324u2.a("some", 1, list);
                    InterfaceC3277p interfaceC3277pA10 = t12.a((InterfaceC3277p) list.get(0));
                    if (!(interfaceC3277pA10 instanceof AbstractC3223j)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (c3187f.s() == 0) {
                        return InterfaceC3277p.f29573f0;
                    }
                    AbstractC3223j abstractC3223j2 = (AbstractC3223j) interfaceC3277pA10;
                    Iterator itR5 = c3187f.r();
                    while (itR5.hasNext()) {
                        int iIntValue = ((Integer) itR5.next()).intValue();
                        if (c3187f.x(iIntValue) && abstractC3223j2.a(t12, Arrays.asList(c3187f.v(iIntValue), new C3214i(Double.valueOf(iIntValue)), c3187f)).d().booleanValue()) {
                            return InterfaceC3277p.f29572e0;
                        }
                    }
                    return InterfaceC3277p.f29573f0;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536286:
                if (str.equals("sort")) {
                    AbstractC3324u2.c("sort", 1, list);
                    if (c3187f.s() >= 2) {
                        List listP = c3187f.p();
                        if (!list.isEmpty()) {
                            InterfaceC3277p interfaceC3277pA11 = t12.a((InterfaceC3277p) list.get(0));
                            if (!(interfaceC3277pA11 instanceof AbstractC3223j)) {
                                throw new IllegalArgumentException("Comparator should be a method");
                            }
                            abstractC3223j = (AbstractC3223j) interfaceC3277pA11;
                        }
                        Collections.sort(listP, new A(abstractC3223j, t12));
                        c3187f.A();
                        Iterator it4 = listP.iterator();
                        while (it4.hasNext()) {
                            c3187f.w(i10, (InterfaceC3277p) it4.next());
                            i10++;
                        }
                    }
                    return c3187f;
                }
                throw new IllegalArgumentException("Command not supported");
            case 96891675:
                if (str.equals("every")) {
                    AbstractC3324u2.a("every", 1, list);
                    InterfaceC3277p interfaceC3277pA12 = t12.a((InterfaceC3277p) list.get(0));
                    if (interfaceC3277pA12 instanceof C3268o) {
                        return c3187f.s() == 0 ? InterfaceC3277p.f29572e0 : c(c3187f, t12, (C3268o) interfaceC3277pA12, Boolean.FALSE, Boolean.TRUE).s() != c3187f.s() ? InterfaceC3277p.f29573f0 : InterfaceC3277p.f29572e0;
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                }
                throw new IllegalArgumentException("Command not supported");
            case 109407362:
                if (str.equals("shift")) {
                    AbstractC3324u2.a("shift", 0, list);
                    if (c3187f.s() == 0) {
                        return InterfaceC3277p.f29567U;
                    }
                    InterfaceC3277p interfaceC3277pV2 = c3187f.v(0);
                    c3187f.E(0);
                    return interfaceC3277pV2;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    AbstractC3324u2.c("slice", 2, list);
                    if (list.isEmpty()) {
                        return c3187f.y();
                    }
                    double dS3 = c3187f.s();
                    double dI = AbstractC3324u2.i(t12.a((InterfaceC3277p) list.get(0)).c().doubleValue());
                    double dMax = dI < 0.0d ? Math.max(dI + dS3, 0.0d) : Math.min(dI, dS3);
                    if (list.size() == 2) {
                        double dI2 = AbstractC3324u2.i(t12.a((InterfaceC3277p) list.get(1)).c().doubleValue());
                        dS3 = dI2 < 0.0d ? Math.max(dS3 + dI2, 0.0d) : Math.min(dS3, dI2);
                    }
                    C3187f c3187f8 = new C3187f();
                    for (int i15 = (int) dMax; i15 < dS3; i15++) {
                        c3187f8.w(c3187f8.s(), c3187f.v(i15));
                    }
                    return c3187f8;
                }
                throw new IllegalArgumentException("Command not supported");
            case 965561430:
                if (str.equals("reduceRight")) {
                    return b(c3187f, t12, list, false);
                }
                throw new IllegalArgumentException("Command not supported");
            case 1099846370:
                if (str.equals("reverse")) {
                    AbstractC3324u2.a("reverse", 0, list);
                    int iS6 = c3187f.s();
                    if (iS6 != 0) {
                        while (i10 < iS6 / 2) {
                            if (c3187f.x(i10)) {
                                InterfaceC3277p interfaceC3277pV3 = c3187f.v(i10);
                                c3187f.w(i10, null);
                                int i16 = (iS6 - 1) - i10;
                                if (c3187f.x(i16)) {
                                    c3187f.w(i10, c3187f.v(i16));
                                }
                                c3187f.w(i16, interfaceC3277pV3);
                            }
                            i10++;
                        }
                    }
                    return c3187f;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    AbstractC3324u2.c("indexOf", 2, list);
                    InterfaceC3277p interfaceC3277pA13 = InterfaceC3277p.f29567U;
                    if (!list.isEmpty()) {
                        interfaceC3277pA13 = t12.a((InterfaceC3277p) list.get(0));
                    }
                    if (list.size() > 1) {
                        double dI3 = AbstractC3324u2.i(t12.a((InterfaceC3277p) list.get(1)).c().doubleValue());
                        if (dI3 >= c3187f.s()) {
                            return new C3214i(dValueOf);
                        }
                        dS2 = dI3 < 0.0d ? ((double) c3187f.s()) + dI3 : dI3;
                    }
                    Iterator itR6 = c3187f.r();
                    while (itR6.hasNext()) {
                        int iIntValue2 = ((Integer) itR6.next()).intValue();
                        double d10 = iIntValue2;
                        if (d10 >= dS2 && AbstractC3324u2.f(c3187f.v(iIntValue2), interfaceC3277pA13)) {
                            return new C3214i(Double.valueOf(d10));
                        }
                    }
                    return new C3214i(dValueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public static InterfaceC3277p b(C3187f c3187f, T1 t12, List list, boolean z10) {
        InterfaceC3277p interfaceC3277pA;
        AbstractC3324u2.b("reduce", 1, list);
        AbstractC3324u2.c("reduce", 2, list);
        InterfaceC3277p interfaceC3277pA2 = t12.a((InterfaceC3277p) list.get(0));
        if (!(interfaceC3277pA2 instanceof AbstractC3223j)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            interfaceC3277pA = t12.a((InterfaceC3277p) list.get(1));
            if (interfaceC3277pA instanceof C3205h) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c3187f.s() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC3277pA = null;
        }
        AbstractC3223j abstractC3223j = (AbstractC3223j) interfaceC3277pA2;
        int iS = c3187f.s();
        int i10 = z10 ? 0 : iS - 1;
        int i11 = z10 ? iS - 1 : 0;
        int i12 = true == z10 ? 1 : -1;
        if (interfaceC3277pA == null) {
            interfaceC3277pA = c3187f.v(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (c3187f.x(i10)) {
                interfaceC3277pA = abstractC3223j.a(t12, Arrays.asList(interfaceC3277pA, c3187f.v(i10), new C3214i(Double.valueOf(i10)), c3187f));
                if (interfaceC3277pA instanceof C3205h) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return interfaceC3277pA;
    }

    public static C3187f c(C3187f c3187f, T1 t12, AbstractC3223j abstractC3223j, Boolean bool, Boolean bool2) {
        C3187f c3187f2 = new C3187f();
        Iterator itR = c3187f.r();
        while (itR.hasNext()) {
            int iIntValue = ((Integer) itR.next()).intValue();
            if (c3187f.x(iIntValue)) {
                InterfaceC3277p interfaceC3277pA = abstractC3223j.a(t12, Arrays.asList(c3187f.v(iIntValue), new C3214i(Double.valueOf(iIntValue)), c3187f));
                if (interfaceC3277pA.d().equals(bool)) {
                    break;
                }
                if (bool2 == null || interfaceC3277pA.d().equals(bool2)) {
                    c3187f2.w(iIntValue, interfaceC3277pA);
                }
            }
        }
        return c3187f2;
    }
}
