package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Collector f30067a = Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.B
        @Override // java.util.function.Supplier
        public final Object get() {
            return new C3517d0(4);
        }
    }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.E
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((C3517d0) obj).e(obj2);
        }
    }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.F
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            C3517d0 c3517d0 = (C3517d0) obj;
            C3517d0 c3517d02 = (C3517d0) obj2;
            c3517d0.c(c3517d02.f30115a, c3517d02.f30116b);
            return c3517d0;
        }
    }, new Function() { // from class: com.google.android.gms.internal.play_billing.G
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((C3517d0) obj).f();
        }
    }, new Collector.Characteristics[0]);

    static {
        Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.H
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C3577n0();
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.I
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((C3577n0) obj).e(obj2);
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.J
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                C3577n0 c3577n0 = (C3577n0) obj;
                C3577n0 c3577n02 = (C3577n0) obj2;
                c3577n0.c(c3577n02.f30115a, c3577n02.f30116b);
                return c3577n0;
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.K
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C3577n0 c3577n0 = (C3577n0) obj;
                int i10 = c3577n0.f30116b;
                if (i10 == 0) {
                    return J0.f30045i;
                }
                if (i10 == 1) {
                    Object obj2 = c3577n0.f30115a[0];
                    Objects.requireNonNull(obj2);
                    return new M0(obj2);
                }
                AbstractC3583o0 abstractC3583o0S = AbstractC3583o0.s(i10, c3577n0.f30115a);
                c3577n0.f30116b = abstractC3583o0S.size();
                c3577n0.f30117c = true;
                return abstractC3583o0S;
            }
        }, new Collector.Characteristics[0]);
        Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.L
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C3565l0();
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.M
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((C3565l0) obj).a((A0) obj2);
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.C
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                C3565l0 c3565l0 = (C3565l0) obj;
                c3565l0.b((C3565l0) obj2);
                return c3565l0;
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.D
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((C3565l0) obj).c();
            }
        }, new Collector.Characteristics[0]);
    }

    public static Collector a() {
        return f30067a;
    }
}
